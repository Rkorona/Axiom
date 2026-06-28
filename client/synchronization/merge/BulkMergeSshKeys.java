package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshCertificateApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.key.SshKeyContent;
import com.server.auditor.ssh.client.synchronization.merge.workarounds.SshKeyContentNullsNormalizationWorkaround;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.f;
import io.sentry.h7;
import java.util.Iterator;
import ju.k;
import ju.n0;
import ju.t;
import mv.b;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;
import ut.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSshKeys extends BulkDataMergeService<SshKeyFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final SshKeyContentNullsNormalizationWorkaround nullsWorkaround;
    private final SshCertificateApiAdapter sshCertificateApiAdapter;
    private final SshCertificateDBAdapter sshCertificateDBAdapter;
    private final SshKeyDBAdapter sshKeyDBAdapter;

    public /* synthetic */ BulkMergeSshKeys(h hVar, v vVar, SshKeyDBAdapter sshKeyDBAdapter, SshCertificateApiAdapter sshCertificateApiAdapter, SshCertificateDBAdapter sshCertificateDBAdapter, b bVar, SshKeyContentNullsNormalizationWorkaround sshKeyContentNullsNormalizationWorkaround, int i10, k kVar) {
        this(hVar, vVar, sshKeyDBAdapter, sshCertificateApiAdapter, sshCertificateDBAdapter, bVar, (i10 & 64) != 0 ? new SshKeyContentNullsNormalizationWorkaround() : sshKeyContentNullsNormalizationWorkaround);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 mergeEntity$lambda$1(JsonDecodeFromStringFailed jsonDecodeFromStringFailed, SshKeyFullData sshKeyFullData, String str, String str2) {
        t.f(str2, "debugInfo");
        f fVarB = y9.b.b("SshKeyFullData.content deserialization used fallback", b.d.f70432c, c.a.f70435b);
        fVarB.F(h7.WARNING);
        fVarB.E("entity_name", n0.b(SshKeyContent.class).d());
        fVarB.E("entity_id", Integer.valueOf(sshKeyFullData.getId()));
        fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
        fVarB.E("debug_nulls", str2);
        y9.a.f86838a.i(new po.a(vt.v.s(fVarB), vt.v.e(jsonDecodeFromStringFailed.asAttachment()), null, jsonDecodeFromStringFailed, 4, null));
        return m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSshKeys().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            SshKeyDBModel itemByRemoteId = this.sshKeyDBAdapter.getItemByRemoteId(jLongValue);
            if (itemByRemoteId != null) {
                Iterator<SshCertificateDBModel> it2 = this.sshCertificateDBAdapter.getCertificatesBySshKeyId(itemByRemoteId.getIdInDatabase()).iterator();
                while (it2.hasNext()) {
                    this.sshCertificateApiAdapter.deleteItem(it2.next());
                }
            }
            this.sshKeyDBAdapter.removeItemByRemoteId(jLongValue);
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(final SshKeyFullData sshKeyFullData) throws po.a {
        SshKeyContent sshKeyContentInvoke;
        SshKeyDBModel sshKeyDBModel;
        t.f(sshKeyFullData, "item");
        final String str = sshKeyFullData.content;
        boolean z10 = str != null;
        Long localId = sshKeyFullData.getLocalId();
        SshKeyDBModel itemByLocalId = localId != null ? this.sshKeyDBAdapter.getItemByLocalId(localId.longValue()) : this.sshKeyDBAdapter.getItemByRemoteId(sshKeyFullData.getId());
        if (z10) {
            try {
                mv.b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    sshKeyContentInvoke = (SshKeyContent) bVar.b(SshKeyContent.Companion.serializer(), str2);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(np.k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                sshKeyContentInvoke = this.nullsWorkaround.invoke(str != null ? str : "", new iu.l() { // from class: com.server.auditor.ssh.client.synchronization.merge.a
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return BulkMergeSshKeys.mergeEntity$lambda$1(e11, sshKeyFullData, str, (String) obj);
                    }
                });
                if (sshKeyContentInvoke == null) {
                    f fVarB = y9.b.b("SshKeyFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                    fVarB.F(h7.ERROR);
                    fVarB.E("entity_name", n0.b(SshKeyContent.class).d());
                    fVarB.E("entity_id", Integer.valueOf(sshKeyFullData.getId()));
                    fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                    throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
                }
            }
            sshKeyDBModel = new SshKeyDBModel(sshKeyContentInvoke.getLabel(), sshKeyContentInvoke.getPassphrase(), sshKeyContentInvoke.getPrivateKey(), sshKeyContentInvoke.getPublicKey(), sshKeyFullData.getCreatedAt(), sshKeyFullData.getId(), 0);
            sshKeyDBModel.setContent(str);
            sshKeyDBModel.setNeedUpdateContent(true);
        } else {
            sshKeyDBModel = new SshKeyDBModel(sshKeyFullData.label, sshKeyFullData.passphrase, sshKeyFullData.privateKey, sshKeyFullData.publicKey, sshKeyFullData.getCreatedAt(), sshKeyFullData.getId(), 0);
        }
        if (itemByLocalId != null) {
            sshKeyDBModel.setKeyType(itemByLocalId.getKeyType());
        }
        sshKeyDBModel.setContent(str);
        sshKeyDBModel.setUpdatedAtTime(sshKeyFullData.getUpdatedAt());
        sshKeyDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(sshKeyFullData.getEncryptedWith()));
        sshKeyDBModel.setShared(t.b(sshKeyFullData.isShared(), Boolean.TRUE));
        SshKeyDBAdapter sshKeyDBAdapter = this.sshKeyDBAdapter;
        if (localId == null) {
            sshKeyDBAdapter.editByRemoteId(sshKeyFullData.getId(), sshKeyDBModel);
        } else {
            sshKeyDBModel.setIdInDatabase(localId.longValue());
            sshKeyDBAdapter.editByLocalId(localId.longValue(), sshKeyDBModel);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSshKeys(h hVar, v vVar, SshKeyDBAdapter sshKeyDBAdapter, SshCertificateApiAdapter sshCertificateApiAdapter, SshCertificateDBAdapter sshCertificateDBAdapter, mv.b bVar, SshKeyContentNullsNormalizationWorkaround sshKeyContentNullsNormalizationWorkaround) {
        super(hVar, vVar, SshKeyFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        t.f(sshCertificateApiAdapter, "sshCertificateApiAdapter");
        t.f(sshCertificateDBAdapter, "sshCertificateDBAdapter");
        t.f(bVar, "jsonConverter");
        t.f(sshKeyContentNullsNormalizationWorkaround, "nullsWorkaround");
        this.sshKeyDBAdapter = sshKeyDBAdapter;
        this.sshCertificateApiAdapter = sshCertificateApiAdapter;
        this.sshCertificateDBAdapter = sshCertificateDBAdapter;
        this.jsonConverter = bVar;
        this.nullsWorkaround = sshKeyContentNullsNormalizationWorkaround;
    }
}

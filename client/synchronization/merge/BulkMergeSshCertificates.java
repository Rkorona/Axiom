package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.certificates.SshCertificateFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.ssh.certificates.CertificateContent;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import com.server.auditor.ssh.client.ui.util.JsonDecodeFromStringFailed;
import io.sentry.f;
import io.sentry.h7;
import java.util.Iterator;
import ju.n0;
import ju.t;
import mv.b;
import np.k;
import np.l;
import po.b;
import po.c;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSshCertificates extends BulkDataMergeService<SshCertificateFullData> {
    public static final int $stable = 8;
    private final b jsonConverter;
    private final SshCertificateDBAdapter sshCertificateDBAdapter;
    private final SshKeyDBAdapter sshKeyDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSshCertificates(h hVar, v vVar, SshCertificateDBAdapter sshCertificateDBAdapter, SshKeyDBAdapter sshKeyDBAdapter, b bVar) {
        super(hVar, vVar, SshCertificateFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sshCertificateDBAdapter, "sshCertificateDBAdapter");
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        t.f(bVar, "jsonConverter");
        this.sshCertificateDBAdapter = sshCertificateDBAdapter;
        this.sshKeyDBAdapter = sshKeyDBAdapter;
        this.jsonConverter = bVar;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getCertificates().iterator();
        while (it.hasNext()) {
            this.sshCertificateDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SshCertificateFullData sshCertificateFullData) throws po.a {
        SshCertificateDBModel sshCertificateDBModel;
        t.f(sshCertificateFullData, "item");
        String str = sshCertificateFullData.content;
        WithRecourseId sshKeyId = sshCertificateFullData.getSshKeyId();
        boolean z10 = str != null;
        SshKeyDBModel itemByRemoteId = this.sshKeyDBAdapter.getItemByRemoteId(sshKeyId.getId());
        long idInDatabase = itemByRemoteId != null ? itemByRemoteId.getIdInDatabase() : sshKeyId.getId();
        if (z10) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    sshCertificateDBModel = new SshCertificateDBModel(((CertificateContent) bVar.b(CertificateContent.Companion.serializer(), str2)).getCertificate(), idInDatabase, sshCertificateFullData.isShared());
                    sshCertificateDBModel.setContent(str);
                    sshCertificateDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("SshCertificateFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(CertificateContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(sshCertificateFullData.getRemoteId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            String str3 = sshCertificateFullData.certificate;
            sshCertificateDBModel = new SshCertificateDBModel(str3 != null ? str3 : "", idInDatabase, sshCertificateFullData.isShared());
        }
        sshCertificateDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(sshCertificateFullData.getEncryptedWith()));
        sshCertificateDBModel.setIdOnServer(sshCertificateFullData.getId());
        sshCertificateDBModel.setUpdatedAtTime(sshCertificateFullData.getUpdatedAt());
        sshCertificateDBModel.setStatus(0);
        sshCertificateDBModel.setShared(sshCertificateFullData.isShared());
        Long localId = sshCertificateFullData.getLocalId();
        if (localId == null) {
            this.sshCertificateDBAdapter.editByRemoteId(sshCertificateFullData.getId(), sshCertificateDBModel);
        } else {
            sshCertificateDBModel.setIdInDatabase(localId.longValue());
            this.sshCertificateDBAdapter.editByLocalId(localId.longValue(), sshCertificateDBModel);
        }
    }
}

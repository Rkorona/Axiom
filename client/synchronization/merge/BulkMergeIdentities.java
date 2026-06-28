package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityFullData;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.identity.IdentityContent;
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
public final class BulkMergeIdentities extends BulkDataMergeService<IdentityFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final b jsonConverter;
    private final SshKeyDBAdapter sshKeyDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeIdentities(h hVar, v vVar, SshKeyDBAdapter sshKeyDBAdapter, IdentityDBAdapter identityDBAdapter, b bVar) {
        super(hVar, vVar, IdentityFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sshKeyDBAdapter, "sshKeyDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        t.f(bVar, "jsonConverter");
        this.sshKeyDBAdapter = sshKeyDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
        this.jsonConverter = bVar;
    }

    private final IdentityDBModel initDBModel(IdentityFullData identityFullData) throws po.a {
        IdentityDBModel identityDBModel;
        WithRecourseId sshKeyId = identityFullData.getSshKeyId();
        String str = identityFullData.content;
        if (str != null) {
            try {
                b bVar = this.jsonConverter;
                String str2 = str == null ? "" : str;
                try {
                    bVar.a();
                    IdentityContent identityContent = (IdentityContent) bVar.b(IdentityContent.Companion.serializer(), str2);
                    identityDBModel = new IdentityDBModel(identityContent.getUsername(), identityContent.getPassword(), identityContent.getLabel(), identityFullData.getId(), 0, identityFullData.getUpdatedAt(), identityContent.isVisible(), com.server.auditor.ssh.client.ui.vaults.data.a.d(identityFullData.getEncryptedWith()), identityFullData.getSshIdMode());
                    identityDBModel.setContent(str);
                    identityDBModel.setNeedUpdateContent(true);
                } catch (IllegalArgumentException e10) {
                    throw new JsonDecodeFromStringFailed(k.b(new l().f(str2).toString()), null, e10, 2, null);
                }
            } catch (JsonDecodeFromStringFailed e11) {
                f fVarB = y9.b.b("IdentityFullData.content deserialization failed", b.d.f70432c, c.C1098c.f70437b);
                fVarB.F(h7.ERROR);
                fVarB.E("entity_name", n0.b(IdentityContent.class).d());
                fVarB.E("entity_id", Integer.valueOf(identityFullData.getId()));
                fVarB.E("content_length", str != null ? Integer.valueOf(str.length()) : null);
                throw new po.a(vt.v.s(fVarB), vt.v.e(e11.asAttachment()), null, e11, 4, null);
            }
        } else {
            identityDBModel = new IdentityDBModel(identityFullData.username, identityFullData.password, identityFullData.label, identityFullData.getId(), 0, identityFullData.getUpdatedAt(), t.b(identityFullData.isVisible(), Boolean.TRUE), com.server.auditor.ssh.client.ui.vaults.data.a.d(identityFullData.getEncryptedWith()), identityFullData.getSshIdMode());
        }
        identityDBModel.setShared(t.b(identityFullData.getShared(), Boolean.TRUE));
        if (sshKeyId != null) {
            SshKeyDBModel itemByRemoteId = this.sshKeyDBAdapter.getItemByRemoteId(sshKeyId.getId());
            if (itemByRemoteId != null) {
                identityDBModel.setSshKeyId(Long.valueOf(itemByRemoteId.getIdInDatabase()));
                identityDBModel.setBiometricKeyId(null);
                return identityDBModel;
            }
            identityDBModel.setSshKeyId(null);
        }
        return identityDBModel;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getIdentities().iterator();
        while (it.hasNext()) {
            this.identityDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(IdentityFullData identityFullData) throws po.a {
        t.f(identityFullData, "item");
        IdentityDBModel identityDBModelInitDBModel = initDBModel(identityFullData);
        Long localId = identityFullData.getLocalId();
        if (localId == null) {
            IdentityDBModel itemByRemoteId = this.identityDBAdapter.getItemByRemoteId(identityFullData.getId());
            if (itemByRemoteId != null && itemByRemoteId.getBiometricKeyId() != null && identityDBModelInitDBModel.getSshKeyId() == null) {
                identityDBModelInitDBModel.setBiometricKeyId(itemByRemoteId.getBiometricKeyId());
            }
            this.identityDBAdapter.editByRemoteId(identityFullData.getId(), identityDBModelInitDBModel);
            return;
        }
        IdentityDBModel itemByLocalId = this.identityDBAdapter.getItemByLocalId(localId.longValue());
        if (itemByLocalId != null && identityDBModelInitDBModel.getSshKeyId() == null) {
            identityDBModelInitDBModel.setBiometricKeyId(itemByLocalId.getBiometricKeyId());
        }
        identityDBModelInitDBModel.setIdInDatabase(localId.longValue());
        this.identityDBAdapter.editByLocalId(localId.longValue(), identityDBModelInitDBModel);
    }
}

package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedSshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityFullData;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSharedSshConfigIdentities extends BulkDataMergeService<SharedSshConfigIdentityFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSharedSshConfigIdentities(h hVar, v vVar, SharedSshConfigIdentityDBAdapter sharedSshConfigIdentityDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, IdentityDBAdapter identityDBAdapter) {
        super(hVar, vVar, SharedSshConfigIdentityFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sharedSshConfigIdentityDBAdapter, "sharedSshConfigIdentityDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        this.sharedSshConfigIdentityDBAdapter = sharedSshConfigIdentityDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSharedSshConfigIdentities().iterator();
        while (it.hasNext()) {
            this.sharedSshConfigIdentityDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SharedSshConfigIdentityFullData sharedSshConfigIdentityFullData) {
        t.f(sharedSshConfigIdentityFullData, "item");
        long id2 = sharedSshConfigIdentityFullData.getSshConfigId().getId();
        long id3 = sharedSshConfigIdentityFullData.getIdentityId().getId();
        SshRemoteConfigDBModel itemByRemoteId = this.sshConfigDBAdapter.getItemByRemoteId(id2);
        IdentityDBModel itemByRemoteId2 = this.identityDBAdapter.getItemByRemoteId(id3);
        if (itemByRemoteId == null || itemByRemoteId2 == null) {
            if (itemByRemoteId != null) {
                this.sharedSshConfigIdentityDBAdapter.removeBySshConfigId(itemByRemoteId.getIdInDatabase());
                return;
            } else {
                this.sharedSshConfigIdentityDBAdapter.removeItemByRemoteId(sharedSshConfigIdentityFullData.getId());
                return;
            }
        }
        SharedSshConfigIdentityDBModel sharedSshConfigIdentityDBModel = new SharedSshConfigIdentityDBModel(itemByRemoteId.getIdInDatabase(), itemByRemoteId2.getIdInDatabase(), sharedSshConfigIdentityFullData.getId(), sharedSshConfigIdentityFullData.getUpdatedAt(), 0);
        sharedSshConfigIdentityDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(sharedSshConfigIdentityFullData.getEncryptedWith()));
        sharedSshConfigIdentityDBModel.setShared(true);
        this.sharedSshConfigIdentityDBAdapter.updateOrInsert(sharedSshConfigIdentityDBModel);
    }
}

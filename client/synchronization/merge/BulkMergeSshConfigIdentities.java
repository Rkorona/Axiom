package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityFullData;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSshConfigIdentities extends BulkDataMergeService<SshConfigIdentityFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
    private final SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSshConfigIdentities(h hVar, v vVar, SshConfigIdentityDBAdapter sshConfigIdentityDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, IdentityDBAdapter identityDBAdapter) {
        super(hVar, vVar, SshConfigIdentityFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sshConfigIdentityDBAdapter, "sshConfigIdentityDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        this.sshConfigIdentityDBAdapter = sshConfigIdentityDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSshConfigIdentities().iterator();
        while (it.hasNext()) {
            this.sshConfigIdentityDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SshConfigIdentityFullData sshConfigIdentityFullData) {
        t.f(sshConfigIdentityFullData, "item");
        long id2 = sshConfigIdentityFullData.getSshConfigId().getId();
        long id3 = sshConfigIdentityFullData.getIdentityId().getId();
        SshRemoteConfigDBModel itemByRemoteId = this.sshConfigDBAdapter.getItemByRemoteId(id2);
        IdentityDBModel itemByRemoteId2 = this.identityDBAdapter.getItemByRemoteId(id3);
        if (itemByRemoteId != null && itemByRemoteId2 != null) {
            this.sshConfigIdentityDBAdapter.updateOrInsert(new SshConfigIdentityDBModel(itemByRemoteId.getIdInDatabase(), itemByRemoteId2.getIdInDatabase(), sshConfigIdentityFullData.getId(), sshConfigIdentityFullData.getUpdatedAt(), 0));
        } else if (itemByRemoteId != null) {
            this.sshConfigIdentityDBAdapter.removeBySshConfigId(itemByRemoteId.getIdInDatabase());
        } else {
            this.sshConfigIdentityDBAdapter.removeItemByRemoteId(sshConfigIdentityFullData.getId());
        }
    }
}

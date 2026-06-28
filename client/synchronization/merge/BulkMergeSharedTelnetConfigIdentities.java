package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.credentialssharing.SharedTelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityFullData;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSharedTelnetConfigIdentities extends BulkDataMergeService<SharedTelnetConfigIdentityFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSharedTelnetConfigIdentities(h hVar, v vVar, SharedTelnetConfigIdentityDBAdapter sharedTelnetConfigIdentityDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, IdentityDBAdapter identityDBAdapter) {
        super(hVar, vVar, SharedTelnetConfigIdentityFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(sharedTelnetConfigIdentityDBAdapter, "sharedTelnetConfigIdentityDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        this.sharedTelnetConfigIdentityDBAdapter = sharedTelnetConfigIdentityDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSharedTelnetConfigIdentities().iterator();
        while (it.hasNext()) {
            this.sharedTelnetConfigIdentityDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SharedTelnetConfigIdentityFullData sharedTelnetConfigIdentityFullData) {
        t.f(sharedTelnetConfigIdentityFullData, "item");
        long id2 = sharedTelnetConfigIdentityFullData.getTelnetConfigId().getId();
        long id3 = sharedTelnetConfigIdentityFullData.getIdentityId().getId();
        TelnetRemoteConfigDBModel itemByRemoteId = this.telnetConfigDBAdapter.getItemByRemoteId(id2);
        IdentityDBModel itemByRemoteId2 = this.identityDBAdapter.getItemByRemoteId(id3);
        if (itemByRemoteId == null || itemByRemoteId2 == null) {
            if (itemByRemoteId != null) {
                this.sharedTelnetConfigIdentityDBAdapter.removeByTelnetConfigId(itemByRemoteId.getIdInDatabase());
                return;
            } else {
                this.sharedTelnetConfigIdentityDBAdapter.removeItemByRemoteId(sharedTelnetConfigIdentityFullData.getId());
                return;
            }
        }
        SharedTelnetConfigIdentityDBModel sharedTelnetConfigIdentityDBModel = new SharedTelnetConfigIdentityDBModel(itemByRemoteId.getIdInDatabase(), itemByRemoteId2.getIdInDatabase(), sharedTelnetConfigIdentityFullData.getId(), sharedTelnetConfigIdentityFullData.getUpdatedAt(), 0);
        sharedTelnetConfigIdentityDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(sharedTelnetConfigIdentityFullData.getEncryptedWith()));
        sharedTelnetConfigIdentityDBModel.setShared(true);
        this.sharedTelnetConfigIdentityDBAdapter.updateOrInsert(sharedTelnetConfigIdentityDBModel);
    }
}

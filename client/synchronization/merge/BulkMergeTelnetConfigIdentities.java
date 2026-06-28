package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigIdentityDBAdapter;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityFullData;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeTelnetConfigIdentities extends BulkDataMergeService<TelnetConfigIdentityFullData> {
    public static final int $stable = 8;
    private final IdentityDBAdapter identityDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;
    private final TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeTelnetConfigIdentities(h hVar, v vVar, TelnetConfigIdentityDBAdapter telnetConfigIdentityDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, IdentityDBAdapter identityDBAdapter) {
        super(hVar, vVar, TelnetConfigIdentityFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(telnetConfigIdentityDBAdapter, "telnetConfigIdentityDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(identityDBAdapter, "identityDBAdapter");
        this.telnetConfigIdentityDBAdapter = telnetConfigIdentityDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.identityDBAdapter = identityDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getTelnetConfigIdentities().iterator();
        while (it.hasNext()) {
            this.telnetConfigIdentityDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(TelnetConfigIdentityFullData telnetConfigIdentityFullData) {
        t.f(telnetConfigIdentityFullData, "item");
        long id2 = telnetConfigIdentityFullData.getTelnetConfigId().getId();
        long id3 = telnetConfigIdentityFullData.getIdentityId().getId();
        TelnetRemoteConfigDBModel itemByRemoteId = this.telnetConfigDBAdapter.getItemByRemoteId(id2);
        IdentityDBModel itemByRemoteId2 = this.identityDBAdapter.getItemByRemoteId(id3);
        if (itemByRemoteId != null && itemByRemoteId2 != null) {
            this.telnetConfigIdentityDBAdapter.updateOrInsert(new TelnetConfigIdentityDBModel(itemByRemoteId.getIdInDatabase(), itemByRemoteId2.getIdInDatabase(), telnetConfigIdentityFullData.getId(), telnetConfigIdentityFullData.getUpdatedAt(), 0));
        } else if (itemByRemoteId != null) {
            this.telnetConfigIdentityDBAdapter.removeByTelnetConfigId(itemByRemoteId.getIdInDatabase());
        } else {
            this.telnetConfigIdentityDBAdapter.removeItemByRemoteId(telnetConfigIdentityFullData.getId());
        }
    }
}

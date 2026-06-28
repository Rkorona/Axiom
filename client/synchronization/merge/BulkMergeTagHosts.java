package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TagHostDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostFullData;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeTagHosts extends BulkDataMergeService<TagHostFullData> {
    public static final int $stable = 8;
    private final HostsDBAdapter hostDBAdapter;
    private final TagDBAdapter tagDBAdapter;
    private final TagHostDBAdapter tagHostDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeTagHosts(h hVar, v vVar, TagHostDBAdapter tagHostDBAdapter, HostsDBAdapter hostsDBAdapter, TagDBAdapter tagDBAdapter) {
        super(hVar, vVar, TagHostFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(tagHostDBAdapter, "tagHostDBAdapter");
        t.f(hostsDBAdapter, "hostDBAdapter");
        t.f(tagDBAdapter, "tagDBAdapter");
        this.tagHostDBAdapter = tagHostDBAdapter;
        this.hostDBAdapter = hostsDBAdapter;
        this.tagDBAdapter = tagDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getTagHosts().iterator();
        while (it.hasNext()) {
            this.tagHostDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(TagHostFullData tagHostFullData) {
        t.f(tagHostFullData, "item");
        int hostId = tagHostFullData.getHostId();
        int tagId = tagHostFullData.getTagId();
        HostDBModel itemByRemoteId = this.hostDBAdapter.getItemByRemoteId(hostId);
        TagDBModel itemByRemoteId2 = this.tagDBAdapter.getItemByRemoteId(tagId);
        if (itemByRemoteId == null || itemByRemoteId2 == null) {
            return;
        }
        TagHostDBModel tagHostDBModel = new TagHostDBModel(itemByRemoteId2.getIdInDatabase(), itemByRemoteId.getIdInDatabase(), tagHostFullData.getId(), tagHostFullData.getUpdatedAt(), 0);
        tagHostDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(tagHostFullData.getEncryptedWith()));
        tagHostDBModel.setShared(t.b(tagHostFullData.isShared(), Boolean.TRUE));
        TagHostDBAdapter tagHostDBAdapter = this.tagHostDBAdapter;
        Long localId = tagHostFullData.getLocalId();
        if (localId == null) {
            tagHostDBAdapter.editByRemoteId(tagHostFullData.getId(), tagHostDBModel);
        } else {
            tagHostDBModel.setIdInDatabase(localId.longValue());
            tagHostDBAdapter.editByLocalId(localId.longValue(), tagHostDBModel);
        }
    }
}

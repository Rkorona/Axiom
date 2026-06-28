package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SnippetHostDBAdapter;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostFullData;
import com.server.auditor.ssh.client.synchronization.api.submodels.WithRecourseId;
import java.util.Iterator;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeSnippetHosts extends BulkDataMergeService<SnippetHostFullData> {
    public static final int $stable = 8;
    private final HostsDBAdapter hostDBAdapter;
    private final SnippetDBAdapter snippetDBAdapter;
    private final SnippetHostDBAdapter snippetHostDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeSnippetHosts(h hVar, v vVar, SnippetHostDBAdapter snippetHostDBAdapter, HostsDBAdapter hostsDBAdapter, SnippetDBAdapter snippetDBAdapter) {
        super(hVar, vVar, SnippetHostFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(snippetHostDBAdapter, "snippetHostDBAdapter");
        t.f(hostsDBAdapter, "hostDBAdapter");
        t.f(snippetDBAdapter, "snippetDBAdapter");
        this.snippetHostDBAdapter = snippetHostDBAdapter;
        this.hostDBAdapter = hostsDBAdapter;
        this.snippetDBAdapter = snippetDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getSnippetHosts().iterator();
        while (it.hasNext()) {
            this.snippetHostDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(SnippetHostFullData snippetHostFullData) {
        t.f(snippetHostFullData, "item");
        WithRecourseId host = snippetHostFullData.getHost();
        WithRecourseId snippet = snippetHostFullData.getSnippet();
        if (host == null || snippet == null) {
            return;
        }
        int id2 = host.getId();
        int id3 = snippet.getId();
        HostDBModel itemByRemoteId = this.hostDBAdapter.getItemByRemoteId(id2);
        SnippetDBModel itemByRemoteId2 = this.snippetDBAdapter.getItemByRemoteId(id3);
        if (itemByRemoteId == null || itemByRemoteId2 == null) {
            return;
        }
        SnippetHostDBModel snippetHostDBModel = new SnippetHostDBModel(itemByRemoteId2.getIdInDatabase(), itemByRemoteId.getIdInDatabase(), snippetHostFullData.getId(), snippetHostFullData.getUpdatedAt(), 0);
        snippetHostDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(snippetHostFullData.getEncryptedWith()));
        snippetHostDBModel.setShared(t.b(snippetHostFullData.isShared(), Boolean.TRUE));
        SnippetHostDBAdapter snippetHostDBAdapter = this.snippetHostDBAdapter;
        Long localId = snippetHostFullData.getLocalId();
        if (localId == null) {
            snippetHostDBAdapter.editByRemoteId(snippetHostFullData.getId(), snippetHostDBModel);
        } else {
            snippetHostDBModel.setIdInDatabase(localId.longValue());
            snippetHostDBAdapter.editByLocalId(localId.longValue(), snippetHostDBModel);
        }
    }
}

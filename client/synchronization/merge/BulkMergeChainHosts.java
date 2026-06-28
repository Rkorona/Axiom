package com.server.auditor.ssh.client.synchronization.merge;

import com.server.auditor.ssh.client.database.adapters.ChainHostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostFullData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;
import rg.h;
import rg.v;

/* JADX INFO: loaded from: classes4.dex */
public final class BulkMergeChainHosts extends BulkDataMergeService<ChainHostFullData> {
    public static final int $stable = 8;
    private final ChainHostsDBAdapter chainHostsDBAdapter;
    private final HostsDBAdapter hostsDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkMergeChainHosts(h hVar, v vVar, ChainHostsDBAdapter chainHostsDBAdapter, SshConfigDBAdapter sshConfigDBAdapter, HostsDBAdapter hostsDBAdapter) {
        super(hVar, vVar, ChainHostFullData.class);
        t.f(hVar, "remoteAnnotationCryptor");
        t.f(vVar, "teamAnnotationCryptors");
        t.f(chainHostsDBAdapter, "chainHostsDBAdapter");
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(hostsDBAdapter, "hostsDBAdapter");
        this.chainHostsDBAdapter = chainHostsDBAdapter;
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.hostsDBAdapter = hostsDBAdapter;
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void deleteItems(DeleteSet deleteSet) {
        t.f(deleteSet, "deleteSet");
        Iterator<Long> it = deleteSet.getHostChains().iterator();
        while (it.hasNext()) {
            this.chainHostsDBAdapter.removeItemByRemoteId(it.next().longValue());
        }
    }

    @Override // com.server.auditor.ssh.client.synchronization.merge.BulkDataMergeService
    public void mergeEntity(ChainHostFullData chainHostFullData) {
        t.f(chainHostFullData, "item");
        Long sshConfigId = chainHostFullData.getSshConfigId();
        List<Long> hostIds = chainHostFullData.getHostIds();
        ArrayList arrayList = new ArrayList();
        SshRemoteConfigDBModel itemByRemoteId = sshConfigId != null ? this.sshConfigDBAdapter.getItemByRemoteId(sshConfigId.longValue()) : null;
        if (sshConfigId == null || itemByRemoteId == null || hostIds == null) {
            return;
        }
        Iterator<Long> it = hostIds.iterator();
        while (it.hasNext()) {
            HostDBModel itemByRemoteId2 = this.hostsDBAdapter.getItemByRemoteId(it.next().longValue());
            if (itemByRemoteId2 == null) {
                return;
            } else {
                arrayList.add(Long.valueOf(itemByRemoteId2.getIdInDatabase()));
            }
        }
        ChainHostsDBModel chainHostsDBModel = new ChainHostsDBModel(itemByRemoteId.getIdInDatabase(), tp.h.b(arrayList), sshConfigId.longValue(), chainHostFullData.getUpdatedAt(), 0);
        chainHostsDBModel.setVaultKeyId(com.server.auditor.ssh.client.ui.vaults.data.a.d(chainHostFullData.getEncryptedWith()));
        if (chainHostFullData.getShared() != null) {
            chainHostsDBModel.setShared(t.b(chainHostFullData.isShared(), Boolean.TRUE));
        }
        this.chainHostsDBAdapter.editByConfigId(itemByRemoteId.getIdInDatabase(), chainHostsDBModel);
    }
}

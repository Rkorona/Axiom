package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.AdapterInterface;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SshKeyBulkApiAdapter extends BulkApiAdapter<SshKeyBulk, SshKeyDBModel> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SshKeyBulkApiAdapter(AdapterInterface<SshKeyDBModel> adapterInterface, BulkApiAdapter.BulkItemCreator<SshKeyBulk, SshKeyDBModel> bulkItemCreator) {
        super(adapterInterface, bulkItemCreator);
        t.f(adapterInterface, "adapter");
        t.f(bulkItemCreator, "bulkCreator");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter
    public List<SshKeyBulk> getUpdateModels() {
        List itemListWithExternalReferences = this.mAdapter.getItemListWithExternalReferences("status = 1 AND biometric_alias is NULL");
        ArrayList arrayList = new ArrayList(itemListWithExternalReferences.size());
        Iterator it = itemListWithExternalReferences.iterator();
        while (it.hasNext()) {
            arrayList.add(this.bulkCreator.createItem((SshKeyDBModel) it.next()));
        }
        return arrayList;
    }
}

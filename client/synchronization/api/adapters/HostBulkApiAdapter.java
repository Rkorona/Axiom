package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.AdapterInterface;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HostBulkApiAdapter extends BulkApiAdapter<HostBulk, HostDBModel> {
    public HostBulkApiAdapter(AdapterInterface<HostDBModel> adapterInterface, BulkApiAdapter.BulkItemCreator<HostBulk, HostDBModel> bulkItemCreator) {
        super(adapterInterface, bulkItemCreator);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter
    public List<HostBulk> getUpdateModels() {
        List itemListWithExternalReferences = this.mAdapter.getItemListWithExternalReferences(String.format("%s = %s AND %s is NULL", Column.STATUS, 1, Column.LOCAL_CONFIG_ID));
        ArrayList arrayList = new ArrayList(itemListWithExternalReferences.size());
        Iterator it = itemListWithExternalReferences.iterator();
        while (it.hasNext()) {
            arrayList.add((HostBulk) this.bulkCreator.createItem((HostDBModel) it.next()));
        }
        return arrayList;
    }
}

package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.AdapterInterface;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SnippetHostBulkApiAdapter extends BulkApiAdapter<SnippetHostBulk, SnippetHostDBModel> {
    public static final int $stable = 8;
    private final AdapterInterface<HostDBModel> hostAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnippetHostBulkApiAdapter(AdapterInterface<SnippetHostDBModel> adapterInterface, AdapterInterface<HostDBModel> adapterInterface2, BulkApiAdapter.BulkItemCreator<SnippetHostBulk, SnippetHostDBModel> bulkItemCreator) {
        super(adapterInterface, bulkItemCreator);
        t.f(adapterInterface, "adapter");
        t.f(adapterInterface2, "hostAdapter");
        t.f(bulkItemCreator, "bulkCreator");
        this.hostAdapter = adapterInterface2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter
    public List<SnippetHostBulk> getUpdateModels() {
        ArrayList arrayList = new ArrayList();
        List itemList = this.mAdapter.getItemList("status = 1");
        List<HostDBModel> itemList2 = this.hostAdapter.getItemList("local_config_id is not NULL");
        t.e(itemList2, "getItemList(...)");
        Iterator<HostDBModel> it = itemList2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getIdInDatabase()));
        }
        int size = itemList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (arrayList.contains(Long.valueOf(((SnippetHostDBModel) itemList.get(size)).getHostId()))) {
                    itemList.remove(itemList.remove(size));
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = itemList.iterator();
        while (it2.hasNext()) {
            Object objCreateItem = this.bulkCreator.createItem((SnippetHostDBModel) it2.next());
            t.e(objCreateItem, "createItem(...)");
            arrayList2.add(objCreateItem);
        }
        return arrayList2;
    }
}

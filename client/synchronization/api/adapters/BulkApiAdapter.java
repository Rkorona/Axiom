package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.adapters.AdapterInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.f;

/* JADX INFO: loaded from: classes4.dex */
public class BulkApiAdapter<P, DB extends f> {
    protected BulkItemCreator<P, DB> bulkCreator;
    protected AdapterInterface<DB> mAdapter;

    public interface BulkItemCreator<P, DB> {
        P createItem(DB db2);
    }

    public BulkApiAdapter(AdapterInterface<DB> adapterInterface, BulkItemCreator<P, DB> bulkItemCreator) {
        this.mAdapter = adapterInterface;
        this.bulkCreator = bulkItemCreator;
    }

    public List<P> getUpdateModels() {
        List<DB> itemListWithExternalReferences = this.mAdapter.getItemListWithExternalReferences("status=1");
        ArrayList arrayList = new ArrayList();
        Iterator<DB> it = itemListWithExternalReferences.iterator();
        while (it.hasNext()) {
            arrayList.add(this.bulkCreator.createItem(it.next()));
        }
        return arrayList;
    }
}

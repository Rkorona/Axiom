package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.models.KnownHost;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class KnownHostsDBAdapter extends DbAdapterAbstract<KnownHostsDBModel> {
    private static final String TABLE = "known_hosts";

    public KnownHostsDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public List<KnownHostsDBModel> getAllItems() {
        return getItemList(null);
    }

    public List<KnownHost> getKnownHostsItems() {
        List<KnownHostsDBModel> itemListWhichNotDeleted = getItemListWhichNotDeleted();
        ArrayList arrayList = new ArrayList();
        Iterator<KnownHostsDBModel> it = itemListWhichNotDeleted.iterator();
        while (it.hasNext()) {
            arrayList.add(new KnownHost(it.next()));
        }
        return arrayList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "known_hosts";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public KnownHostsDBModel createItemFromCursor(Cursor cursor) {
        return new KnownHostsDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public KnownHostsDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        KnownHostsDBModel knownHostsDBModel = new KnownHostsDBModel(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.KNOWN_HOST, knownHostsDBModel.getIdOnServer());
        }
        return knownHostsDBModel;
    }
}

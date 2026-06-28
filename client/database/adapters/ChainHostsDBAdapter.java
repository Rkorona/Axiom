package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import rg.s;
import tp.h;

/* JADX INFO: loaded from: classes3.dex */
public class ChainHostsDBAdapter extends DbAdapterAbstract<ChainHostsDBModel> {
    private static final String TABLE = "chain_hosts";

    public ChainHostsDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public int editByConfigId(long j10, ChainHostsDBModel chainHostsDBModel) {
        ContentValues contentValues = chainHostsDBModel.toContentValues(this.localCryptor);
        int iUpdate = this.mContentResolver.update(getContentUri(), contentValues, "ssh_config_id=" + j10, null);
        if (iUpdate == 0) {
            this.mContentResolver.insert(getContentUri(), contentValues);
        }
        return iUpdate;
    }

    public ChainingHost getChainHostAppModelByConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        List<ChainHostsDBModel> itemList = getItemList(String.format("%s==%s", Column.SSH_CONFIG_ID, l10));
        ArrayList arrayList = new ArrayList();
        Iterator<ChainHostsDBModel> it = itemList.iterator();
        while (it.hasNext()) {
            arrayList.add(new ChainingHost(it.next()));
        }
        if (itemList.isEmpty()) {
            return null;
        }
        return (ChainingHost) arrayList.get(0);
    }

    public ChainHostsDBModel getChainHostByConfigId(Long l10) {
        List<ChainHostsDBModel> itemList = getItemList(String.format("%s==%s", Column.SSH_CONFIG_ID, l10));
        if (itemList.isEmpty()) {
            return null;
        }
        return itemList.get(0);
    }

    public List<ChainHostsDBModel> getChainsWhichUsedHost(Long l10) {
        List<ChainHostsDBModel> itemListWhichNotDeleted = getItemListWhichNotDeleted();
        ArrayList arrayList = new ArrayList();
        for (ChainHostsDBModel chainHostsDBModel : itemListWhichNotDeleted) {
            Iterator it = h.d(chainHostsDBModel.getChainigHosts()).iterator();
            while (it.hasNext()) {
                if (Objects.equals((Long) it.next(), l10)) {
                    arrayList.add(chainHostsDBModel);
                }
            }
        }
        return arrayList;
    }

    public ChainHostsDBModel getItem(String str) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, null);
        ChainHostsDBModel chainHostsDBModelCreateItemFromCursor = cursorQuery.moveToFirst() ? createItemFromCursor(cursorQuery) : null;
        cursorQuery.close();
        return chainHostsDBModelCreateItemFromCursor;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "chain_hosts";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ChainHostsDBModel createItemFromCursor(Cursor cursor) {
        return new ChainHostsDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ChainHostsDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        ChainHostsDBModel chainHostDBModelWithExternalReferences = ChainHostsDBModel.getChainHostDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.HOST_CHAIN, chainHostDBModelWithExternalReferences.getIdOnServer());
        }
        return chainHostDBModelWithExternalReferences;
    }
}

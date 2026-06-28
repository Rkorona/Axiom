package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyDBAdapter extends DbAdapterAbstract<ProxyDBModel> {
    private static final String TABLE = "proxy";
    private static final String VIEW_API = "proxy_app";

    public ProxyDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public List<Proxy> getAllProxyItems() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProxyDBModel> it = getItemListWhichNotDeleted().iterator();
        while (it.hasNext()) {
            arrayList.add(new Proxy(it.next()));
        }
        return arrayList;
    }

    public List<ProxyDBModel> getProxiesByIdentityId(Long l10) {
        return getItemList(String.format("%s==%s", Column.IDENTITY_ID, l10));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "proxy";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ProxyDBModel createItemFromCursor(Cursor cursor) {
        return new ProxyDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ProxyDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        ProxyDBModel proxyDBModelWithExternalReferences = ProxyDBModel.getProxyDBModelWithExternalReferences(cursor, this.localCryptor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.PROXY, proxyDBModelWithExternalReferences.getIdOnServer());
        }
        return proxyDBModelWithExternalReferences;
    }
}

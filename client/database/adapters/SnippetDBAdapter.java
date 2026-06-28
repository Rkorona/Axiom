package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetDBAdapter extends DbAdapterAbstract<SnippetDBModel> {
    private static final String TABLE = "snippet";

    public SnippetDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public List<SnippetItem> getAllSnippetItems() {
        ArrayList arrayList = new ArrayList();
        Iterator<SnippetDBModel> it = getItemListWhichNotDeleted().iterator();
        while (it.hasNext()) {
            arrayList.add(new SnippetItem(it.next()));
        }
        return arrayList;
    }

    public List<SnippetDBModel> getSnippetModelsByPackageId(long j10) {
        ArrayList arrayList = new ArrayList();
        for (SnippetDBModel snippetDBModel : getItemListWhichNotDeleted()) {
            Long packageId = snippetDBModel.getPackageId();
            if (packageId != null && packageId.longValue() == j10) {
                arrayList.add(snippetDBModel);
            }
        }
        return arrayList;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "snippet";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetDBModel createItemFromCursor(Cursor cursor) {
        return new SnippetDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        this.localCryptor.h();
        SnippetDBModel snippetDBModelCreateItemFromCursor = createItemFromCursor(cursor);
        if (this.localCryptor.i()) {
            this.localCryptor.l().logLocalDecryptError(Avo.Entity.SNIPPET, snippetDBModelCreateItemFromCursor.getIdOnServer());
        }
        return snippetDBModelCreateItemFromCursor;
    }
}

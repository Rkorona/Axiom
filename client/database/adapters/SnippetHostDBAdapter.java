package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetHostDBAdapter extends DbAdapterAbstract<SnippetHostDBModel> {
    private static final String TABLE = "snippet_host";

    public SnippetHostDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    public SnippetHostDBModel getItem(String str) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, null);
        SnippetHostDBModel snippetHostDBModelCreateItemFromCursor = cursorQuery.moveToFirst() ? createItemFromCursor(cursorQuery) : null;
        cursorQuery.close();
        return snippetHostDBModelCreateItemFromCursor;
    }

    public List<SnippetHostDBModel> getSnippetHostsByHostId(long j10) {
        return getItemList(String.format("%s=%s", Column.HOST_ID, Long.valueOf(j10)));
    }

    public List<SnippetHostDBModel> getSnippetHostsBySnippetId(long j10) {
        return getItemList(String.format("%s=%s", Column.SNIPPET_ID, Long.valueOf(j10)));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return "snippet_host";
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetHostDBModel createItemFromCursor(Cursor cursor) {
        return new SnippetHostDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public SnippetHostDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        return SnippetHostDBModel.getSnippetHostDBModelWithExternalReferences(cursor, this.localCryptor);
    }
}

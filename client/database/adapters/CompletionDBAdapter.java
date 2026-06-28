package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.CompletionDBModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class CompletionDBAdapter extends DbAdapterAbstract<CompletionDBModel> {
    public static String TABLE = "completion_dictionary";

    public CompletionDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    private void clearTableIfHasOversizedEntries() {
        try {
            this.mContentResolver.delete(getContentUri(), null, null);
        } catch (Exception unused) {
        }
    }

    public int bulkInsert(ContentValues[] contentValuesArr) {
        return this.mContentResolver.bulkInsert(getContentUri(), contentValuesArr);
    }

    public int editItemById(long j10, CompletionDBModel completionDBModel) {
        return this.mContentResolver.update(getContentUri(), completionDBModel.toContentValues(this.localCryptor), String.format("%s=?", Column.COMPLETION_DICT_ID), new String[]{String.valueOf(j10)});
    }

    public CompletionDBModel getItemById(long j10) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, String.format("%s=?", Column.COMPLETION_DICT_ID), new String[]{String.valueOf(j10)}, null);
        if (cursorQuery != null) {
            completionDBModel = cursorQuery.moveToFirst() ? new CompletionDBModel(cursorQuery, this.localCryptor) : null;
            cursorQuery.close();
        }
        return completionDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract, com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<CompletionDBModel> getItemList(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, "updated_at DESC");
        ArrayList arrayList2 = new ArrayList();
        try {
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            try {
                                try {
                                    CompletionDBModel completionDBModelCreateItemFromCursor = createItemFromCursor(cursorQuery);
                                    if (TextUtils.isEmpty(completionDBModelCreateItemFromCursor.getCommand())) {
                                        arrayList2.add(Long.valueOf(completionDBModelCreateItemFromCursor.getId()));
                                    } else {
                                        arrayList.add(completionDBModelCreateItemFromCursor);
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                int columnIndex = cursorQuery.getColumnIndex(Column.COMPLETION_DICT_ID);
                                if (columnIndex >= 0) {
                                    arrayList2.add(Long.valueOf(cursorQuery.getLong(columnIndex)));
                                }
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                } catch (SQLiteBlobTooBigException unused3) {
                    cursorQuery.close();
                    clearTableIfHasOversizedEntries();
                    cursorQuery.close();
                    return arrayList;
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                removeItemByLocalId(((Long) it.next()).longValue());
            }
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return TABLE;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract, com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int removeItemByLocalId(long j10) {
        return remove("dict_id=" + j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public CompletionDBModel createItemFromCursor(Cursor cursor) {
        return new CompletionDBModel(cursor, this.localCryptor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public CompletionDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        return new CompletionDBModel(cursor, this.localCryptor);
    }
}

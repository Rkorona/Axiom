package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.SAContentProvider;
import fw.l;
import hg.f;
import java.util.ArrayList;
import java.util.List;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DbAdapterAbstract<T extends kj.a> implements AdapterInterface<T> {
    protected final s localCryptor;
    protected ContentResolver mContentResolver;

    protected DbAdapterAbstract(Context context) {
        l.f(context);
        this.mContentResolver = context.getContentResolver();
        this.localCryptor = f.p().v();
    }

    private String prepareNotDeletedClause() {
        return String.format("%s!=%s", Column.STATUS, 2);
    }

    private String prepareNotSharedAndNotDeletedClause() {
        return String.format("%s=%s and %s!=%s ", Column.IS_SHARED, 0, Column.STATUS, 2);
    }

    protected Uri getContentUri() {
        return getViewContentUri(getTable());
    }

    public T getDBItemByLabel(String str) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, String.format("%s=?", "title"), new String[]{str}, null);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            T tCreateItemFromCursor = createItemFromCursor(cursorQuery);
            cursorQuery.close();
            return tCreateItemFromCursor;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<Long> getDeletedRemoteId() {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            int columnIndex = cursorQuery.getColumnIndex(Column.ID_ON_SERVER);
            int columnIndex2 = cursorQuery.getColumnIndex(Column.STATUS);
            if (cursorQuery.moveToFirst()) {
                do {
                    if (cursorQuery.getInt(columnIndex2) == 2) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        if (j10 != -1) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    public int getItemCount(String str) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, null);
        if (cursorQuery == null) {
            return 0;
        }
        int count = cursorQuery.getCount();
        cursorQuery.close();
        return count;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<T> getItemList(String str) {
        return getItemList(str, null);
    }

    public List<T> getItemListDeleteFailed() {
        return getItemList(String.format("%s=%s", Column.STATUS, 2));
    }

    public List<T> getItemListWhichNotDeleted() {
        return getItemList(String.format("%s!=%s", Column.STATUS, 2));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<T> getItemListWithExternalReferences(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    T tCreateItemFromCursorWithExternalReferences = createItemFromCursorWithExternalReferences(cursorQuery);
                    if (tCreateItemFromCursorWithExternalReferences == null) {
                        throw new NullPointerException("Item after create item from cursor with external storage is null");
                    }
                    arrayList.add(tCreateItemFromCursorWithExternalReferences);
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    public int getItemsCountWhichNotDeleted() {
        return getItemCount(String.format("%s!=%s", Column.STATUS, 2));
    }

    public s getLocalCryptor() {
        return this.localCryptor;
    }

    protected abstract String getTable();

    protected Uri getViewContentUri(String str) {
        return new Uri.Builder().scheme("content").authority(SAContentProvider.SA_CONTENT_HOST).appendPath(str).build();
    }

    public int markTableAsUpdateFailed(boolean z10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.STATUS, (Integer) 1);
        return z10 ? this.mContentResolver.update(getContentUri(), contentValues, prepareNotDeletedClause(), null) : this.mContentResolver.update(getContentUri(), contentValues, prepareNotSharedAndNotDeletedClause(), null);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int remove(String str) {
        return this.mContentResolver.delete(getContentUri(), str, null);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int removeItemByLocalId(long j10) {
        return remove("_id=" + j10);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int removeItemByRemoteId(long j10) {
        return remove("id_on_server=" + j10);
    }

    public int setStatus(String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.STATUS, Integer.valueOf(i10));
        return this.mContentResolver.update(getContentUri(), contentValues, str, null);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public long add(T t10) {
        Uri uriInsert = this.mContentResolver.insert(getContentUri(), t10.toContentValues(this.localCryptor));
        if (uriInsert == null) {
            return -1L;
        }
        return Long.parseLong(uriInsert.getLastPathSegment());
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int editByLocalId(long j10, T t10) {
        return editByLocalId(j10, t10.toContentValues(this.localCryptor));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public int editByRemoteId(int i10, T t10) {
        return editByRemoteId(i10, t10.toContentValues(this.localCryptor));
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public T getItemByLocalId(long j10) {
        Cursor cursorQuery = this.mContentResolver.query(ContentUris.withAppendedId(getContentUri(), j10), null, null, null, null);
        T tCreateItemFromCursor = (cursorQuery == null || !cursorQuery.moveToFirst()) ? null : createItemFromCursor(cursorQuery);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return tCreateItemFromCursor;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public T getItemByRemoteId(long j10) {
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, "id_on_server=" + j10, null, null);
        if (cursorQuery != null) {
            tCreateItemFromCursor = cursorQuery.moveToFirst() ? createItemFromCursor(cursorQuery) : null;
            cursorQuery.close();
        }
        return tCreateItemFromCursor;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<T> getItemList(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.mContentResolver.query(getContentUri(), null, str, strArr, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(createItemFromCursor(cursorQuery));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    public int remove(String str, String[] strArr) {
        return this.mContentResolver.delete(getContentUri(), str, strArr);
    }

    private int editByLocalId(long j10, ContentValues contentValues) {
        return this.mContentResolver.update(ContentUris.withAppendedId(getContentUri(), j10), contentValues, null, null);
    }

    private int editByRemoteId(long j10, ContentValues contentValues) {
        int iUpdate = this.mContentResolver.update(getContentUri(), contentValues, "id_on_server=" + j10, null);
        if (iUpdate == 0) {
            this.mContentResolver.insert(getContentUri(), contentValues);
        }
        return iUpdate;
    }

    protected DbAdapterAbstract(ContentResolver contentResolver, s sVar) {
        l.f(contentResolver);
        this.mContentResolver = contentResolver;
        this.localCryptor = sVar;
    }
}

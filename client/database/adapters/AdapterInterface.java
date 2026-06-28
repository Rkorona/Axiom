package com.server.auditor.ssh.client.database.adapters;

import android.database.Cursor;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AdapterInterface<T> {
    long add(T t10);

    T createItemFromCursor(Cursor cursor);

    T createItemFromCursorWithExternalReferences(Cursor cursor);

    int editByLocalId(long j10, T t10);

    int editByRemoteId(int i10, T t10);

    List<Long> getDeletedRemoteId();

    T getItemByLocalId(long j10);

    T getItemByRemoteId(long j10);

    List<T> getItemList(String str);

    List<T> getItemList(String str, String[] strArr);

    List<T> getItemListWithExternalReferences(String str);

    int remove(String str);

    int removeItemByLocalId(long j10);

    int removeItemByRemoteId(long j10);
}

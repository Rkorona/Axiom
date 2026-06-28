package com.server.auditor.ssh.client.database.adapters;

import android.content.ContentResolver;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.ShortcutsTrainDBModel;
import java.util.ArrayList;
import java.util.List;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class ShortcutsTrainDBAdapter extends DbAdapterAbstract<ShortcutsTrainDBModel> {
    public static String TABLE = "shortcut_trains";

    public ShortcutsTrainDBAdapter(ContentResolver contentResolver, s sVar) {
        super(contentResolver, sVar);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract, com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public List<ShortcutsTrainDBModel> getItemList(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.mContentResolver.query(getContentUri(), null, str, null, String.format("%s asc", Column.SHORTCUT_ORDER));
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(createItemFromCursor(cursorQuery));
                } while (cursorQuery.moveToNext());
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    public double getMinOrder() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.mContentResolver.query(getContentUri(), new String[]{String.format("MIN(%s) as %s", Column.SHORTCUT_ORDER, Column.SHORTCUT_ORDER)}, null, null, null);
            return (cursorQuery == null || !cursorQuery.moveToFirst()) ? 0.0d : cursorQuery.getDouble(cursorQuery.getColumnIndex(Column.SHORTCUT_ORDER));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @Override // com.server.auditor.ssh.client.database.adapters.DbAdapterAbstract
    protected String getTable() {
        return TABLE;
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ShortcutsTrainDBModel createItemFromCursor(Cursor cursor) {
        return new ShortcutsTrainDBModel(cursor);
    }

    @Override // com.server.auditor.ssh.client.database.adapters.AdapterInterface
    public ShortcutsTrainDBModel createItemFromCursorWithExternalReferences(Cursor cursor) {
        return new ShortcutsTrainDBModel(cursor);
    }
}

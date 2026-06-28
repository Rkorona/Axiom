package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class MigrateSharingModeToCredentialsModePatch extends AbsPatch {
    public static final int $stable = 8;

    private final void updateGroupAndChildren(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("credentials_mode", str);
        contentValues.put(Column.STATUS, (Integer) 1);
        sQLiteDatabase.update(Table.GROUP, contentValues, "_id = ?", new String[]{String.valueOf(i10)});
        updateHosts(sQLiteDatabase, i10, str);
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM group_t WHERE parent_group_id = ?", new String[]{String.valueOf(i10)});
        t.e(cursorRawQuery, "rawQuery(...)");
        while (cursorRawQuery.moveToNext()) {
            updateGroupAndChildren(sQLiteDatabase, cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow(Column.ID)), str);
        }
        cursorRawQuery.close();
    }

    private final void updateHosts(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("credentials_mode", str);
        contentValues.put(Column.STATUS, (Integer) 1);
        sQLiteDatabase.update(Table.HOSTS, contentValues, "group_id = ?", new String[]{String.valueOf(i10)});
    }

    private final void updateRootSharedHosts(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("credentials_mode", "no_credentials_sharing");
        contentValues.put(Column.STATUS, (Integer) 1);
        sQLiteDatabase.update(Table.HOSTS, contentValues, "group_id IS NULL and is_shared = 1", null);
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        migrate(sQLiteDatabase);
    }

    public final void migrate(SQLiteDatabase sQLiteDatabase) {
        t.f(sQLiteDatabase, "db");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT _id, sharing_mode FROM group_t WHERE parent_group_id IS NULL AND is_shared = 1", null);
        t.e(cursorRawQuery, "rawQuery(...)");
        while (cursorRawQuery.moveToNext()) {
            int i10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow(Column.ID));
            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("sharing_mode"));
            if (string == null) {
                string = "no_credentials_sharing";
            }
            updateGroupAndChildren(sQLiteDatabase, i10, string);
        }
        cursorRawQuery.close();
        updateRootSharedHosts(sQLiteDatabase);
    }
}

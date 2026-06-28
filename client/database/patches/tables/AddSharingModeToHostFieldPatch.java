package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddSharingModeToHostFieldPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE hosts ADD COLUMN sharing_mode TEXT DEFAULT NULL");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLiteException e10) {
            y9.a.f86838a.i(e10);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}

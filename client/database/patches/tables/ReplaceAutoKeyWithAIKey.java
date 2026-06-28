package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplaceAutoKeyWithAIKey extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("UPDATE shortcut_trains SET shortcut_1 = 'AI' WHERE shortcut_1 = 'AC'");
        sQLiteDatabase.execSQL("UPDATE shortcut_trains SET shortcut_2 = 'AI' WHERE shortcut_2 = 'AC'");
        sQLiteDatabase.execSQL("UPDATE shortcut_trains SET shortcut_3 = 'AI' WHERE shortcut_3 = 'AC'");
        sQLiteDatabase.execSQL("UPDATE shortcut_trains SET shortcut_4 = 'AI' WHERE shortcut_4 = 'AC'");
    }
}

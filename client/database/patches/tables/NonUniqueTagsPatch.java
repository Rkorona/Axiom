package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class NonUniqueTagsPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("ALTER TABLE tags RENAME TO old_tags;");
        sQLiteDatabase.execSQL("ALTER TABLE tag_host RENAME TO old_tag_host;");
        sQLiteDatabase.execSQL("CREATE TABLE tags\n(\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    title TEXT NOT NULL,\n    id_on_server INTEGER NOT NULL DEFAULT -1,\n    status INTEGER NOT NULL DEFAULT 1,\n    updated_at DATETIME,\n    is_shared BOOLEAN DEFAULT 0\n);");
        sQLiteDatabase.execSQL("CREATE TABLE tag_host\n(\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    tag_id INTEGER NOT NULL,\n    host_id INTEGER NOT NULL,\n    id_on_server INTEGER NOT NULL DEFAULT -1,\n    status INTEGER NOT NULL DEFAULT 1,\n    updated_at DATETIME,\n    is_shared BOOLEAN DEFAULT 0\n);");
        sQLiteDatabase.execSQL("INSERT INTO tags SELECT * FROM old_tags;");
        sQLiteDatabase.execSQL("INSERT INTO tag_host SELECT * FROM old_tag_host;");
        sQLiteDatabase.execSQL("DROP TABLE old_tags;");
        sQLiteDatabase.execSQL("DROP TABLE old_tag_host;");
    }
}

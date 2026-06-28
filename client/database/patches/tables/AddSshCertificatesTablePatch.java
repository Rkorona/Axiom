package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddSshCertificatesTablePatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("CREATE TABLE certificate(\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    material TEXT,\n    ssh_key_id INTEGER NOT NULL DEFAULT -1,\n    id_on_server INTEGER NOT NULL DEFAULT -1,\n    status INTEGER NOT NULL DEFAULT 1,\n    updated_at DATETIME,\n    is_shared BOOLEAN,\n    raw_api_content TEXT DEFAULT NULL\n)");
    }
}

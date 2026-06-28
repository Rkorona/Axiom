package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedFieldPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("ALTER TABLE group_t ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE hosts ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_config ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE telnet_config ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_key ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE proxy ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE snippet ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE port_forwarding ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE chain_hosts ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE known_hosts ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE snippet_host ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE tag_host ADD COLUMN is_shared BOOLEAN DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE tags ADD COLUMN is_shared BOOLEAN DEFAULT 0");
    }
}

package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddContentFieldPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("ALTER TABLE tags ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE group_t ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_config ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE telnet_config ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE hosts ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE port_forwarding ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE proxy ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE snippet ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE known_hosts ADD COLUMN raw_api_content TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_key ADD COLUMN raw_api_content TEXT DEFAULT NULL");
    }
}

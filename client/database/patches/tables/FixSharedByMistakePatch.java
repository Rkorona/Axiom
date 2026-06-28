package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class FixSharedByMistakePatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("UPDATE group_t SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE hosts SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE ssh_config SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE telnet_config SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE ssh_key SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE identity SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE proxy SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE snippet SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE port_forwarding SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE chain_hosts SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE known_hosts SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE snippet_host SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE tag_host SET is_shared = 0");
        sQLiteDatabase.execSQL("UPDATE tags SET is_shared = 0");
    }
}

package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class MoshSupportPatch extends AbsPatch {
    private static final String IS_USE_MOSH = "is_use_mosh";
    private static final String MOSH_SERVER_COMMAND = "mosh_server_command";
    private static final String SSH_CONFIG = "ssh_config";

    private void alterMoshColumns(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("alter table %s add column %s boolean default 0", "ssh_config", "is_use_mosh"));
        sQLiteDatabase.execSQL(String.format("alter table %s add column %s text default null", "ssh_config", "mosh_server_command"));
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        alterMoshColumns(sQLiteDatabase);
    }
}

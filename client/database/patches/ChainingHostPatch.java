package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class ChainingHostPatch extends AbsPatch {
    private static final String CHAINING_HOSTS = "chaining_hosts";
    private static final String CHAIN_HOSTS = "chain_hosts";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String SSH_CONFIG = "ssh_config";
    private static final String SSH_CONFIG_ID = "ssh_config_id";
    private static final String STATUS = "status";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE);", "chain_hosts", "_id", "ssh_config_id", "chaining_hosts", "id_on_server", -1, "status", 1, "updated_at", "ssh_config_id", "ssh_config", "_id"));
    }
}

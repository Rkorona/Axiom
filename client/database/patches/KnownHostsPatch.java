package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class KnownHostsPatch extends AbsPatch {
    private static final String COMMENT = "comment";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String HOSTNAMES = "hostnames";
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String KEY_PUBLIC = "publicKey";
    private static final String KNOWN_HOSTS = "known_hosts";
    private static final String MARKER = "marker";
    private static final String STATUS = "status";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s TEXT, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME);", "known_hosts", "_id", "hostnames", "publicKey", "marker", "comment", "id_on_server", -1, "status", 1, "updated_at"));
    }
}

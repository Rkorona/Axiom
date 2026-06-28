package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetDefaultOptionFields extends AbsPatch {
    private static final String CLOSE_AFTER_RUN = "close_after_run";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String HOSTS = "hosts";
    private static final String HOST_ID = "host_id";
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String SNIPPET = "snippet";
    private static final String SNIPPET_HOST = "snippet_host";
    private static final String SNIPPET_ID = "snippet_id";
    private static final String STATUS = "status";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s BOOLEAN DEFAULT NULL", "snippet", "close_after_run"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME, UNIQUE (%s, %s) FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE,  FOREIGN KEY (%s) REFERENCES %s(%s) ON DELETE CASCADE ON UPDATE CASCADE);", "snippet_host", "_id", "snippet_id", "host_id", "id_on_server", -1, "status", 1, "updated_at", "snippet_id", "host_id", "snippet_id", "snippet", "_id", "host_id", "hosts", "_id"));
    }
}

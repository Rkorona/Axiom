package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class LastConnectionSyncPatch extends AbsPatch {
    private static final String CHARSET = "charset";
    private static final String COLOR_SCHEME = "color_schema";
    private static final String CONNECTION_STATUS = "connection_status";
    private static final String CREATED_AT = "created_at";
    private static final int DEFAULT_SSH_PORT = 22;
    private static final String DEVICE_ID = "device_id";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String ERROR_MESSAGE = "error_message";
    private static final String FONT_SIZE = "font_size";
    private static final String HISTORY_TYPE = "history_type";
    private static final String HOST = "host";
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String IS_USE_MOSH = "is_use_mosh";
    private static final String KEY_PRIVATE = "privateKey";
    private static final String LAST_CONNECTION = "last_connection";
    private static final String LAST_CONNECTION_CACHE = "last_connection_cache";
    private static final String LOCAL_SHELL_ARGC = "local_shell_argc";
    private static final String LOCAL_SHELL_PATH = "local_shell_path";
    private static final String MOSH_SERVER_COMMAND = "mosh_server_command";
    private static final String OS_NAME = "host_os";
    private static final String PASSWORD = "password";
    private static final String PASS_PHRASE = "passPhrase";
    private static final String PORT = "port";
    private static final String PROXY_HOST = "proxy_host";
    private static final String PROXY_PASSWORD = "proxy_password";
    private static final String PROXY_PORT = "proxy_port";
    private static final String PROXY_TYPE = "proxy_type";
    private static final String PROXY_USERNAME = "proxy_username";
    private static final String START_UP_SNIPPET_EXPRESSION = "start_up_snippet_expression";
    private static final String STATUS = "status";
    private static final String TITLE = "title";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;
    private static final String USERNAME = "username";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        Locale locale = Locale.ENGLISH;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", LAST_CONNECTION, "device_id", -1));
        sQLiteDatabase.execSQL(String.format("alter table %s add column %s boolean default 0", LAST_CONNECTION, "is_use_mosh"));
        sQLiteDatabase.execSQL(String.format(locale, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT %s, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT 0, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT 0, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME DEFAULT NULL, %s INTEGER DEFAULT %d, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s DATETIME DEFAULT (datetime('now', 'localtime')))", LAST_CONNECTION_CACHE, "_id", "title", "username", "host", "port", 22, "password", "history_type", "passPhrase", "privateKey", "start_up_snippet_expression", "font_size", "color_schema", "charset", "local_shell_path", "local_shell_argc", "host_os", "connection_status", "error_message", "mosh_server_command", "is_use_mosh", "id_on_server", -1, "status", 1, "updated_at", "device_id", -1, "proxy_type", "proxy_host", "proxy_port", "proxy_username", "proxy_password", "created_at"));
    }
}

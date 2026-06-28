package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class SyncableHistoryPatch extends AbsPatch {
    private static final String CHARSET = "charset";
    private static final String COLOR_SCHEME = "color_schema";
    private static final String CONNECTION_STATUS = "connection_status";
    private static final String CREATED_AT = "created_at";
    private static final int DEFAULT_SSH_PORT = 22;
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String ERROR_MESSAGE = "error_message";
    private static final String EXPRESSION = "expression";
    private static final String FONT_SIZE = "font_size";
    private static final String HISTORY = "history";
    private static final String HISTORY_DATES = "history_dates";
    private static final String HISTORY_ID = "history_id";
    private static final String HISTORY_TYPE = "history_type";
    private static final String HOST = "host";
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String KEY_PRIVATE = "privateKey";
    private static final String LAST_CONNECTION = "last_connection";
    private static final String LOCAL_SHELL_ARGC = "local_shell_argc";
    private static final String LOCAL_SHELL_PATH = "local_shell_path";
    private static final String MOSH_SERVER_COMMAND = "mosh_server_command";
    private static final String OS_NAME = "host_os";
    private static final String PASSWORD = "password";
    private static final String PASS_PHRASE = "passPhrase";
    private static final String PORT = "port";
    private static final String SNIPPET = "snippet";
    private static final String SSH_KEY = "ssh_key";
    private static final String SSH_KEY_ID = "ssh_key_id";
    private static final String START_UP_SNIPPET_EXPRESSION = "start_up_snippet_expression";
    private static final String START_UP_SNIPPET_ID = "start_up_snippet_id";
    private static final String STATUS = "status";
    private static final String TITLE = "title";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;
    private static final String USERNAME = "username";
    private static final String USE_MOSH = "use_mosh";
    private static final String VIEW_NAME = "tmp_migration_history_view";

    private void dataMigration(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s as select %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s from %s join %s ON %s.%s = %s.%s left outer join %s ON %s.%s=%s.%s left outer join %s ON %s.%s=%s.%s GROUP BY %s.%s;", VIEW_NAME, HISTORY, "_id", HISTORY, "title", HISTORY, "username", HISTORY, "host", HISTORY, "port", HISTORY, "password", HISTORY, "history_type", "ssh_key", "passPhrase", "ssh_key", "privateKey", "snippet", "expression", HISTORY, "font_size", HISTORY, "color_schema", HISTORY, "charset", HISTORY, "local_shell_path", HISTORY, "local_shell_argc", HISTORY_DATES, "host_os", HISTORY_DATES, "connection_status", HISTORY_DATES, "error_message", HISTORY_DATES, "created_at", HISTORY, HISTORY_DATES, HISTORY, "_id", HISTORY_DATES, "history_id", "ssh_key", HISTORY, "ssh_key_id", "ssh_key", "_id", "snippet", HISTORY, "start_up_snippet_id", "snippet", "_id", HISTORY, "_id"));
        sQLiteDatabase.execSQL(String.format("INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s) SELECT %s, %s, %s, %s, %s, %s, %s, %s, %s %s, %s, %s, %s, %s, %s, %s, %s, %s, %s from %s", LAST_CONNECTION, "title", "username", "host", "port", "password", "history_type", "passPhrase", "privateKey", "start_up_snippet_expression", "font_size", "color_schema", "charset", "local_shell_path", "local_shell_argc", "host_os", "connection_status", "error_message", "created_at", "title", "username", "host", "port", "password", "history_type", "passPhrase", "privateKey", "expression", "start_up_snippet_expression", "font_size", "color_schema", "charset", "local_shell_path", "local_shell_argc", "host_os", "connection_status", "error_message", "created_at", VIEW_NAME));
        sQLiteDatabase.execSQL(String.format("DROP VIEW %s;", VIEW_NAME));
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT %s, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT 0, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s INTEGER DEFAULT 0, %s INTEGER NOT NULL DEFAULT %s, %s INTEGER NOT NULL DEFAULT %s, %s DATETIME DEFAULT NULL, %s DATETIME DEFAULT (datetime('now', 'localtime')))", LAST_CONNECTION, "_id", "title", "username", "host", "port", 22, "password", "history_type", "passPhrase", "privateKey", "start_up_snippet_expression", "font_size", "color_schema", "charset", "local_shell_path", "local_shell_argc", "host_os", "connection_status", "error_message", "mosh_server_command", "use_mosh", "id_on_server", -1, "status", 1, "updated_at", "created_at"));
        dataMigration(sQLiteDatabase, context);
    }
}

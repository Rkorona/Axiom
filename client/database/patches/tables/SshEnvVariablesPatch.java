package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class SshEnvVariablesPatch extends AbsPatch {
    private static final String ENVIRONMENT_VARIABLES = "env_variables";
    private static final String LAST_CONNECTION = "last_connection";
    private static final String LAST_CONNECTION_CACHE = "last_connection_cache";
    private static final String SSH_CONFIG = "ssh_config";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        Locale locale = Locale.ENGLISH;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", "ssh_config", "env_variables"));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", LAST_CONNECTION, "env_variables"));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", LAST_CONNECTION_CACHE, "env_variables"));
    }
}

package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import com.server.auditor.ssh.client.database.patches.AgentForwardingPatch;
import com.server.auditor.ssh.client.database.patches.BackspaceHostPatch;
import com.server.auditor.ssh.client.database.patches.ChainingHostPatch;
import com.server.auditor.ssh.client.database.patches.MoshSupportPatch;
import java.util.Locale;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public class ValidateDbPatch extends AbsPatch {
    private static final String BACKSPACE_TYPE = "backspace_type";
    private static final String CHAIN_HOSTS = "chain_hosts";
    private static final String ENVIRONMENT_VARIABLES = "env_variables";
    private static final String HOSTS = "hosts";
    private static final String IS_USE_AGENT_FORWARDING = "is_use_agent_forwarding";
    private static final String IS_USE_MOSH = "is_use_mosh";
    private static final String LAST_CONNECTION = "last_connection";
    private static final String LAST_CONNECTION_CACHE = "last_connection_cache";
    private static final String SSH_CONFIG = "ssh_config";

    private boolean isColumnExist(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z10;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    int columnIndex = cursorRawQuery.getColumnIndex(Column.MULTI_KEY_NAME);
                    if (columnIndex >= 0 && str2.equalsIgnoreCase(cursorRawQuery.getString(columnIndex))) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
            return z10;
        } finally {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    private boolean isTableExist(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "select DISTINCT tbl_name from sqlite_master where tbl_name ='%s'", str), null);
        if (cursorRawQuery == null) {
            return false;
        }
        if (cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        cursorRawQuery.close();
        return false;
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        if (!isTableExist(sQLiteDatabase, "chain_hosts")) {
            new ChainingHostPatch().apply(sQLiteDatabase, context);
        }
        if (!isColumnExist(sQLiteDatabase, "ssh_config", "is_use_agent_forwarding")) {
            try {
                new AgentForwardingPatch().apply(sQLiteDatabase, context);
            } catch (SQLiteException e10) {
                Timber.g(e10);
                y9.a.f86838a.i(e10);
            }
        }
        if (!isColumnExist(sQLiteDatabase, "ssh_config", "is_use_mosh")) {
            try {
                new MoshSupportPatch().apply(sQLiteDatabase, context);
            } catch (SQLiteException e11) {
                Timber.g(e11);
                y9.a.f86838a.i(e11);
            }
        }
        if (!isColumnExist(sQLiteDatabase, "ssh_config", "env_variables")) {
            try {
                sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", "ssh_config", "env_variables"));
            } catch (SQLiteException e12) {
                Timber.g(e12);
                y9.a.f86838a.i(e12);
            }
        }
        if (!isColumnExist(sQLiteDatabase, LAST_CONNECTION, "env_variables")) {
            try {
                sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", LAST_CONNECTION, "env_variables"));
            } catch (SQLiteException e13) {
                Timber.g(e13);
                y9.a.f86838a.i(e13);
            }
        }
        if (!isColumnExist(sQLiteDatabase, LAST_CONNECTION_CACHE, "env_variables")) {
            try {
                sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", LAST_CONNECTION_CACHE, "env_variables"));
            } catch (SQLiteException e14) {
                Timber.g(e14);
                y9.a.f86838a.i(e14);
            }
        }
        if (isColumnExist(sQLiteDatabase, "hosts", "backspace_type")) {
            return;
        }
        try {
            new BackspaceHostPatch().apply(sQLiteDatabase, context);
        } catch (SQLiteException e15) {
            Timber.g(e15);
            y9.a.f86838a.i(e15);
        }
    }
}

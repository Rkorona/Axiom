package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("DROP VIEW IF EXISTS %s;", View.CONFIG_API));
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s,%s,%s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s;", View.CONFIG_API, "ssh_config", Column.ID, Column.ID, Column.FONT_SIZE, Column.STRICT_CHECK_HOST_KEY, Column.USE_SSH_KEY, Column.IS_FORWARD_PORT, Column.IS_USE_MOSH, Column.MOSH_SERVER_COMMAND, Column.IS_CUSROS_BLINK, Column.TIMEOUT, Column.KEEP_ALIVE_PACKAGES, Column.COLOR_SCHEME, Column.CHARSET, Column.ENVIRONMENT_VARIABLES, Column.IS_USE_AGENT_FORWARDING, "ssh_config", Column.IS_SHARED, Column.IS_SHARED, "ssh_config", Column.PORT, Column.PORT, "ssh_config", Column.ID_ON_SERVER, Column.ID_ON_SERVER, "identity", Column.ID_ON_SERVER, Column.IDENTITY_ID, Table.SNIPPET, Column.ID_ON_SERVER, Column.START_UP_SNIPPET_ID, Table.PROXY, Column.ID_ON_SERVER, Column.PROXY_ID, "ssh_config", "identity", "ssh_config", Column.IDENTITY_ID, "identity", Column.ID, Table.SNIPPET, "ssh_config", Column.START_UP_SNIPPET_ID, Table.SNIPPET, Column.ID, Table.PROXY, "ssh_config", Column.PROXY_ID, Table.PROXY, Column.ID));
    }
}

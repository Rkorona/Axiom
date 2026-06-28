package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class PFAppModelViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("DROP VIEW IF EXISTS %s;", "pf_app"));
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s, %s, %s, %s, %s, %s, %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s;", "pf_app", "port_forwarding", Column.ID, Column.ID, Column.TYPE, Column.LOCAL_PORT, Column.REMOTE_PORT, Column.BOUND_ADDRESS, Column.FORWARDING_HOST, "label", Column.ADDRESS, "port_forwarding", Column.IS_SHARED, Column.IS_SHARED, "port_forwarding", "encrypted_with", "encrypted_with", Table.HOSTS, Column.ID, Column.HOST_ID, Table.HOSTS, "title", Column.HOST_TITLE, Column.OS_NAME, Column.ICON, Column.FONT_SIZE, Column.PORT, Column.STRICT_CHECK_HOST_KEY, Column.USE_SSH_KEY, Column.IS_FORWARD_PORT, Column.IS_CUSROS_BLINK, Column.TIMEOUT, Column.KEEP_ALIVE_PACKAGES, Column.COLOR_SCHEME, Column.CHARSET, "username", "password", Column.KEY_PRIVATE, Column.PASS_PHRASE, "ssh_config", Column.ID, Column.SSH_CONFIG_ID, "identity", Column.ID, "ssh_identity_id", "ssh_key", Column.ID, Column.SSH_KEY_ID, "port_forwarding", Column.STATUS, Column.STATUS, "port_forwarding", Table.HOSTS, "port_forwarding", Column.HOST_ID, Table.HOSTS, Column.ID, "ssh_config", Table.HOSTS, Column.SSH_CONFIG_ID, "ssh_config", Column.ID, "identity", "ssh_config", Column.IDENTITY_ID, "identity", Column.ID, "ssh_key", "identity", Column.SSH_KEY_ID, "ssh_key", Column.ID));
    }
}

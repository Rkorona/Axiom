package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class GroupApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS group_api;");
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s.%s as %s,%s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s as %s ON %s.%s = %s.%s;", View.GROUP_API, Table.GROUP, Column.ID, Column.ID, Table.GROUP, "title", Column.GROUP_TITLE, "ssh_config", Column.ID_ON_SERVER, Column.SSH_CONFIG_ID, "parent_group", Column.ID_ON_SERVER, Column.PARENT_GROUP_ID, Table.GROUP, "ssh_config", Table.GROUP, Column.SSH_CONFIG_ID, "ssh_config", Column.ID, Table.GROUP, "parent_group", Table.GROUP, Column.PARENT_GROUP_ID, Table.GROUP, Column.ID));
    }
}

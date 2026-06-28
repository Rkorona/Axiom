package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetHostApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS snippet_host_api;");
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s;", View.SNIPPET_HOST_API, Table.SNIPPET_HOST, Column.ID, Column.ID, Table.HOSTS, Column.ID_ON_SERVER, Column.HOST_ID, Table.SNIPPET, Column.ID_ON_SERVER, Column.SNIPPET_ID, Table.SNIPPET_HOST, Column.ID_ON_SERVER, Column.ID_ON_SERVER, Table.SNIPPET_HOST, Table.HOSTS, Table.SNIPPET_HOST, Column.HOST_ID, Table.HOSTS, Column.ID, Table.SNIPPET, Table.SNIPPET_HOST, Column.SNIPPET_ID, Table.SNIPPET, Column.ID));
    }
}

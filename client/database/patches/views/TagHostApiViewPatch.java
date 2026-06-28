package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class TagHostApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS tag_host_api;");
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s LEFT JOIN %s ON %s.%s = %s.%s;", View.TAG_HOST_API, Table.TAG_HOST, Column.ID, Column.ID, Table.HOSTS, Column.ID_ON_SERVER, Column.HOST_ID, Table.TAG, Column.ID_ON_SERVER, Column.TAG_ID, Table.TAG_HOST, Column.ID_ON_SERVER, Column.ID_ON_SERVER, Table.TAG_HOST, Table.HOSTS, Table.TAG_HOST, Column.HOST_ID, Table.HOSTS, Column.ID, Table.TAG, Table.TAG_HOST, Column.TAG_ID, Table.TAG, Column.ID));
    }
}

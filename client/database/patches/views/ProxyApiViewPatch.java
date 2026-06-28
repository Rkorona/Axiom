package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyApiViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s, %s, %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s ;", View.PROXY_APP_MODEL, Table.PROXY, Column.ID, Column.ID, Column.TYPE, "host", Column.PORT, Table.PROXY, Column.ID_ON_SERVER, Column.ID_ON_SERVER, "identity", Column.ID_ON_SERVER, Column.IDENTITY_ID, Table.PROXY, "identity", Table.PROXY, Column.IDENTITY_ID, "identity", Column.ID));
    }
}

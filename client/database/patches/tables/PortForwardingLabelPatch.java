package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class PortForwardingLabelPatch extends AbsPatch {
    private static final String PORT_FORWARDING = "port_forwarding";
    private static final String RULE_LABEL = "label";

    private boolean isColumnExist(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "SELECT * FROM %s", "port_forwarding"), null);
        if (cursorRawQuery == null) {
            return false;
        }
        if (cursorRawQuery.getColumnIndex("label") != -1) {
            cursorRawQuery.close();
            return true;
        }
        cursorRawQuery.close();
        return false;
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        if (isColumnExist(sQLiteDatabase)) {
            return;
        }
        sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", "port_forwarding", "label"));
    }
}

package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class BackspaceHostPatch extends AbsPatch {
    private static final String BACKSPACE_TYPE = "backspace_type";
    private static final Integer DEFAULT_BACKSPACE_TYPE = 0;
    private static final String HOSTS = "hosts";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "hosts", "backspace_type", DEFAULT_BACKSPACE_TYPE));
    }
}

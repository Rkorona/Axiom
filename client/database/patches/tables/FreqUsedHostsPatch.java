package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class FreqUsedHostsPatch extends AbsPatch {
    private static final int DEFAULT_USE_COUNTER = 0;
    private static final String HOSTS = "hosts";
    private static final String USE_COUNTER = "use_counter";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "hosts", "use_counter", 0));
    }
}

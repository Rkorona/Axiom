package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class CompletionDictTable extends AbsPatch {
    private static final String COMMAND = "command";
    private static final String COMPLETION_DICTIONARY = "completion_dictionary";
    private static final String COMPLETION_DICT_ID = "dict_id";
    private static final String UPDATED_AT = "updated_at";
    private static final String USE_COUNTER = "use_counter";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        Locale locale = Locale.ENGLISH;
        sQLiteDatabase.execSQL(String.format(locale, "DROP TABLE IF EXISTS %s", "completion_dictionary"));
        sQLiteDatabase.execSQL(String.format(locale, "CREATE TABLE %s(%s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT UNIQUE NOT NULL,%s INTEGER NOT NULL DEFAULT 1,%s INTEGER NOT NULL)", "completion_dictionary", "dict_id", "command", "use_counter", "updated_at"));
    }
}

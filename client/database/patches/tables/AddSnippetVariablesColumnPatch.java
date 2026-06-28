package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddSnippetVariablesColumnPatch extends AbsPatch {
    private static final String SCRIPT_STRUCTURE_COLUMN = "script_structure";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("ALTER TABLE snippet ADD COLUMN script_structure TEXT DEFAULT ''");
    }
}

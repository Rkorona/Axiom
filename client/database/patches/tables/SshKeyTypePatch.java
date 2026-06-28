package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.Arrays;
import java.util.Locale;
import ju.r0;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class SshKeyTypePatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        r0 r0Var = r0.f62955a;
        String str = String.format(Locale.ENGLISH, "ALTER TABLE %s ADD COLUMN %s TEXT DEFAULT null", Arrays.copyOf(new Object[]{"ssh_key", Column.KEY_TYPE}, 2));
        t.e(str, "format(...)");
        sQLiteDatabase.execSQL(str);
    }
}

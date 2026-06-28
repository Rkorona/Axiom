package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;
import su.s;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangeBashToShPatch extends AbsPatch {
    public static final int $stable = 8;
    private final String bashPath = "%/files/bin/bash_bin%";
    private final String shPath = "/system/bin/sh";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL(s.p("UPDATE local_config SET local_shell_path = '" + this.shPath + "' WHERE local_shell_path LIKE '" + this.bashPath + "'", null, 1, null));
    }
}

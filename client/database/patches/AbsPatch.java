package com.server.auditor.ssh.client.database.patches;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbsPatch {
    public abstract void apply(SQLiteDatabase sQLiteDatabase, Context context);
}

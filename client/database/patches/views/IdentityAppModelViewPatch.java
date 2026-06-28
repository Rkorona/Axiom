package com.server.auditor.ssh.client.database.patches.views;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.View;
import com.server.auditor.ssh.client.database.patches.AbsPatch;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityAppModelViewPatch extends AbsPatch {
    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("DROP VIEW IF EXISTS %s;", View.SSH_IDENTITY_APP_MODEL));
        sQLiteDatabase.execSQL(String.format("DROP VIEW IF EXISTS %s;", View.IDENTITY_APP_MODEL));
        sQLiteDatabase.execSQL(String.format("CREATE VIEW IF NOT EXISTS %s AS SELECT %s.%s as %s, %s.%s as %s, %s.%s as %s, %s, %s, %s, %s, %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s, %s.%s as %s from %s LEFT JOIN %s ON %s.%s = %s.%s;", View.IDENTITY_APP_MODEL, "identity", Column.ID, Column.ID, "identity", "title", "title", "ssh_key", "title", Column.SSH_KEY_TITLE, "username", "password", Column.KEY_PRIVATE, Column.PASS_PHRASE, Column.IS_VISIBLE, "ssh_key", Column.ID, Column.SSH_KEY_ID, "identity", Column.STATUS, Column.STATUS, "identity", Column.IS_SHARED, Column.IS_SHARED, "identity", "encrypted_with", "encrypted_with", "identity", Column.SSH_ID_MODE, Column.SSH_ID_MODE, "identity", "ssh_key", "identity", Column.SSH_KEY_ID, "ssh_key", Column.ID));
    }
}

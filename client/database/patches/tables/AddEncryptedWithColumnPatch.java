package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddEncryptedWithColumnPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("ALTER TABLE tags ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE tag_host ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE group_t ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_config ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_config_identity ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE shared_ssh_config_identity ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE telnet_config ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE telnet_config_identity ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE shared_telnet_config_identity ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE hosts ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE port_forwarding ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE proxy ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE snippet ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE snippet_host ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE known_hosts ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE ssh_key ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE package ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE chain_hosts ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE history ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE history_dates ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE last_connection ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE last_connection_cache ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE multi_key ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE certificate ADD COLUMN encrypted_with INTEGER DEFAULT NULL");
    }
}

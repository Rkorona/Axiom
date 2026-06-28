package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class MergeLastConnectionTablesPatch extends AbsPatch {
    public static final int $stable = 8;

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        sQLiteDatabase.execSQL("INSERT INTO last_connection_cache(\n    title,\n    username,\n    host,\n    port,\n    password,\n    history_type,\n    passPhrase,\n    privateKey,\n    start_up_snippet_expression,\n    font_size,\n    color_schema,\n    charset,\n    local_shell_path,\n    local_shell_argc,\n    host_os,\n    connection_status,\n    error_message,\n    mosh_server_command,\n    is_use_mosh,\n    id_on_server,\n    status,\n    updated_at,\n    device_id,\n    proxy_type,\n    proxy_host,\n    proxy_port,\n    proxy_username,\n    proxy_password,\n    created_at,\n    env_variables,\n    encrypted_with,\n    is_shared,\n    host_local_id,\n    timestamp\n) SELECT\n    title,\n    username,\n    host,\n    port,\n    password,\n    history_type,\n    passPhrase,\n    privateKey,\n    start_up_snippet_expression,\n    font_size,\n    color_schema,\n    charset,\n    local_shell_path,\n    local_shell_argc,\n    host_os,\n    connection_status,\n    error_message,\n    mosh_server_command,\n    is_use_mosh,\n    id_on_server,\n    status,\n    updated_at,\n    device_id,\n    proxy_type,\n    proxy_host,\n    proxy_port,\n    proxy_username,\n    proxy_password,\n    created_at,\n    env_variables,\n    encrypted_with,\n    is_shared,\n    host_local_id,\n    timestamp FROM last_connection");
        sQLiteDatabase.execSQL("DROP TABLE last_connection");
        sQLiteDatabase.execSQL("ALTER TABLE last_connection_cache RENAME TO last_connection_deprecated");
    }
}

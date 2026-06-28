package com.server.auditor.ssh.client.room;

import androidx.room.i0;
import ap.b0;
import ap.c0;
import ap.p0;
import ap.q0;
import ap.u;
import ap.z0;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.room.AppDatabase_Impl;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.n0;
import ju.t;
import l6.q;
import tl.l1;
import tl.m2;
import tl.t1;
import tl.v0;
import tl.w;
import tl.x1;
import ut.n;
import ut.o;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f38765d = o.a(new iu.a() { // from class: tl.a
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.g0(this.f79677a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f38766e = o.a(new iu.a() { // from class: tl.j
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.a0(this.f79742a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f38767f = o.a(new iu.a() { // from class: tl.k
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.W(this.f79750a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f38768g = o.a(new iu.a() { // from class: tl.l
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.X(this.f79758a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f38769h = o.a(new iu.a() { // from class: tl.m
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.b0(this.f79768a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f38770i = o.a(new iu.a() { // from class: tl.n
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.c0(this.f79774a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f38771j = o.a(new iu.a() { // from class: tl.b
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.f0(this.f79684a);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n f38772k = o.a(new iu.a() { // from class: tl.c
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.h0(this.f79692a);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n f38773l = o.a(new iu.a() { // from class: tl.d
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.d0(this.f79700a);
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n f38774m = o.a(new iu.a() { // from class: tl.e
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.Y(this.f79707a);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f38775n = o.a(new iu.a() { // from class: tl.f
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.Z(this.f79713a);
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n f38776o = o.a(new iu.a() { // from class: tl.g
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.e0(this.f79720a);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n f38777p = o.a(new iu.a() { // from class: tl.h
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.V(this.f79727a);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n f38778q = o.a(new iu.a() { // from class: tl.i
        @Override // iu.a
        public final Object a() {
            return AppDatabase_Impl.U(this.f79733a);
        }
    });

    public static final class a extends i0 {
        a() {
            super(19, "e0c7863b4763ec52a6e69500f258cafa", "804bfedb4204326a4e3a0f49c0ff9597");
        }

        @Override // androidx.room.i0
        public void a(p6.b bVar) throws Exception {
            t.f(bVar, "connection");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `vaults` (`local_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `remote_id` INTEGER NOT NULL, `original_key` INTEGER, `role` TEXT NOT NULL, `is_default` INTEGER NOT NULL, `is_checked` INTEGER NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `session_log_analytics` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `connection_uuid` TEXT NOT NULL, `size` INTEGER NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `host_interaction` (`remote_host_id` INTEGER NOT NULL, `last_interacted_at` TEXT NOT NULL, PRIMARY KEY(`remote_host_id`))");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `last_connections` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id_on_server` INTEGER NOT NULL, `title` TEXT, `username` TEXT, `host` TEXT, `port` INTEGER, `connection_type` TEXT, `connection_status` INTEGER NOT NULL, `error_message` TEXT, `startup_snippet_expression` TEXT, `color_scheme` TEXT, `charset` TEXT, `local_shell_path` TEXT, `local_shell_argc` TEXT, `host_os` TEXT, `is_use_mosh` INTEGER NOT NULL, `mosh_server_command` TEXT, `status` INTEGER NOT NULL, `device_id` INTEGER, `proxy_type` TEXT, `proxy_host` TEXT, `proxy_port` INTEGER, `proxy_username` TEXT, `proxy_password` TEXT, `env_variables` TEXT, `is_shared` INTEGER NOT NULL, `encrypted_with` INTEGER, `host_local_id` INTEGER, `created_at` TEXT NOT NULL, `updated_at` TEXT, `timestamp` TEXT, `actor_id` INTEGER, `custom_tags` TEXT NOT NULL, `protocol` TEXT, `session_log_filename` TEXT, `session_log_file_secret_key` TEXT, `session_log_file_status` TEXT NOT NULL)");
            p6.a.a(bVar, "CREATE INDEX IF NOT EXISTS `index_last_connections_status` ON `last_connections` (`status`)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `session_logs` (`last_connection_id` INTEGER NOT NULL, `remote_id` INTEGER NOT NULL, `size` INTEGER NOT NULL, `checksum` TEXT NOT NULL, `disconnected_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `upload_status` TEXT NOT NULL, `ip_address` TEXT, `location` TEXT, `bookmark_comment` TEXT, `bookmark_status` INTEGER, PRIMARY KEY(`last_connection_id`), FOREIGN KEY(`last_connection_id`) REFERENCES `last_connections`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            p6.a.a(bVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_session_logs_last_connection_id` ON `session_logs` (`last_connection_id`)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `team_devices` (`id` INTEGER NOT NULL, `mobile_type` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `vault_logs_settings` (`vault_remote_id` INTEGER NOT NULL, `is_enabled` INTEGER NOT NULL, PRIMARY KEY(`vault_remote_id`))");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `ssh_id` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT NOT NULL, `default_passkey_type` TEXT NOT NULL, `is_setup_completed` INTEGER NOT NULL, `all_devices_biometric` INTEGER NOT NULL, `sk_passkeys_enabled` INTEGER NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `local_device_bound_keys` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `device` INTEGER NOT NULL, `public_key` TEXT NOT NULL, `private_key` TEXT NOT NULL, `biometric_type` TEXT, `biometric_alias` TEXT, `type` TEXT NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `remote_device_bound_keys` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `device` INTEGER NOT NULL, `public_key` TEXT NOT NULL, `biometric_type` TEXT, `type` TEXT NOT NULL, `created_at` TEXT NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `ssh_id_devices` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `device_id` INTEGER NOT NULL, `device_type` TEXT NOT NULL, `name` TEXT NOT NULL, `is_current_device` INTEGER NOT NULL, `has_passkeys` INTEGER NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS `hardware_device_bound_keys` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remote_id` INTEGER NOT NULL, `public_key` TEXT NOT NULL, `encrypted_metadata` TEXT NOT NULL, `label` TEXT NOT NULL, `created_at` TEXT NOT NULL)");
            p6.a.a(bVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            p6.a.a(bVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e0c7863b4763ec52a6e69500f258cafa')");
        }

        @Override // androidx.room.i0
        public void b(p6.b bVar) throws Exception {
            t.f(bVar, "connection");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `vaults`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `session_log_analytics`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `host_interaction`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `last_connections`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `session_logs`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `team_devices`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `vault_logs_settings`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `ssh_id`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `local_device_bound_keys`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `remote_device_bound_keys`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `ssh_id_devices`");
            p6.a.a(bVar, "DROP TABLE IF EXISTS `hardware_device_bound_keys`");
        }

        @Override // androidx.room.i0
        public void f(p6.b bVar) {
            t.f(bVar, "connection");
        }

        @Override // androidx.room.i0
        public void g(p6.b bVar) throws Exception {
            t.f(bVar, "connection");
            p6.a.a(bVar, "PRAGMA foreign_keys = ON");
            AppDatabase_Impl.this.internalInitInvalidationTracker(bVar);
        }

        @Override // androidx.room.i0
        public void h(p6.b bVar) {
            t.f(bVar, "connection");
        }

        @Override // androidx.room.i0
        public void i(p6.b bVar) {
            t.f(bVar, "connection");
            l6.b.a(bVar);
        }

        @Override // androidx.room.i0
        public i0.a j(p6.b bVar) {
            t.f(bVar, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, new q.a(CommonBulkShareable.LOCAL_ID_SERIAL_NAME, "INTEGER", true, 1, null, 1));
            linkedHashMap.put(Column.MULTI_KEY_NAME, new q.a(Column.MULTI_KEY_NAME, "TEXT", true, 0, null, 1));
            linkedHashMap.put("remote_id", new q.a("remote_id", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("original_key", new q.a("original_key", "INTEGER", false, 0, null, 1));
            linkedHashMap.put("role", new q.a("role", "TEXT", true, 0, null, 1));
            linkedHashMap.put("is_default", new q.a("is_default", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("is_checked", new q.a("is_checked", "INTEGER", true, 0, null, 1));
            q qVar = new q("vaults", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            q.b bVar2 = q.f63709e;
            q qVarA = bVar2.a(bVar, "vaults");
            if (!qVar.equals(qVarA)) {
                return new i0.a(false, "vaults(com.server.auditor.ssh.client.room.VaultDbModel).\n Expected:\n" + qVar + "\n Found:\n" + qVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("connection_uuid", new q.a("connection_uuid", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("size", new q.a("size", "INTEGER", true, 0, null, 1));
            q qVar2 = new q("session_log_analytics", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
            q qVarA2 = bVar2.a(bVar, "session_log_analytics");
            if (!qVar2.equals(qVarA2)) {
                return new i0.a(false, "session_log_analytics(com.server.auditor.ssh.client.room.SessionLogAnalyticsDbModel).\n Expected:\n" + qVar2 + "\n Found:\n" + qVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("remote_host_id", new q.a("remote_host_id", "INTEGER", true, 1, null, 1));
            linkedHashMap3.put("last_interacted_at", new q.a("last_interacted_at", "TEXT", true, 0, null, 1));
            q qVar3 = new q("host_interaction", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
            q qVarA3 = bVar2.a(bVar, "host_interaction");
            if (!qVar3.equals(qVarA3)) {
                return new i0.a(false, "host_interaction(com.server.auditor.ssh.client.room.HostInteractionDbModel).\n Expected:\n" + qVar3 + "\n Found:\n" + qVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap4.put(Column.ID_ON_SERVER, new q.a(Column.ID_ON_SERVER, "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("title", new q.a("title", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("username", new q.a("username", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("host", new q.a("host", "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.PORT, new q.a(Column.PORT, "INTEGER", false, 0, null, 1));
            linkedHashMap4.put(SshOptions.EXTRA_CONNECTION_TYPE, new q.a(SshOptions.EXTRA_CONNECTION_TYPE, "TEXT", false, 0, null, 1));
            linkedHashMap4.put("connection_status", new q.a("connection_status", "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("error_message", new q.a("error_message", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("startup_snippet_expression", new q.a("startup_snippet_expression", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("color_scheme", new q.a("color_scheme", "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.CHARSET, new q.a(Column.CHARSET, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.LOCAL_SHELL_PATH, new q.a(Column.LOCAL_SHELL_PATH, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.LOCAL_SHELL_ARGC, new q.a(Column.LOCAL_SHELL_ARGC, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.OS_NAME, new q.a(Column.OS_NAME, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.IS_USE_MOSH, new q.a(Column.IS_USE_MOSH, "INTEGER", true, 0, null, 1));
            linkedHashMap4.put(Column.MOSH_SERVER_COMMAND, new q.a(Column.MOSH_SERVER_COMMAND, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.STATUS, new q.a(Column.STATUS, "INTEGER", true, 0, null, 1));
            linkedHashMap4.put(Column.DEVICE_ID, new q.a(Column.DEVICE_ID, "INTEGER", false, 0, null, 1));
            linkedHashMap4.put(Column.PROXY_TYPE, new q.a(Column.PROXY_TYPE, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.PROXY_HOST, new q.a(Column.PROXY_HOST, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.PROXY_PORT, new q.a(Column.PROXY_PORT, "INTEGER", false, 0, null, 1));
            linkedHashMap4.put(Column.PROXY_USERNAME, new q.a(Column.PROXY_USERNAME, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.PROXY_PASSWORD, new q.a(Column.PROXY_PASSWORD, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.ENVIRONMENT_VARIABLES, new q.a(Column.ENVIRONMENT_VARIABLES, "TEXT", false, 0, null, 1));
            linkedHashMap4.put(Column.IS_SHARED, new q.a(Column.IS_SHARED, "INTEGER", true, 0, null, 1));
            linkedHashMap4.put("encrypted_with", new q.a("encrypted_with", "INTEGER", false, 0, null, 1));
            linkedHashMap4.put(Column.HOST_LOCAL_ID, new q.a(Column.HOST_LOCAL_ID, "INTEGER", false, 0, null, 1));
            linkedHashMap4.put(Column.CREATED_AT, new q.a(Column.CREATED_AT, "TEXT", true, 0, null, 1));
            linkedHashMap4.put("updated_at", new q.a("updated_at", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("timestamp", new q.a("timestamp", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("actor_id", new q.a("actor_id", "INTEGER", false, 0, null, 1));
            linkedHashMap4.put("custom_tags", new q.a("custom_tags", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("protocol", new q.a("protocol", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("session_log_filename", new q.a("session_log_filename", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("session_log_file_secret_key", new q.a("session_log_file_secret_key", "TEXT", false, 0, null, 1));
            linkedHashMap4.put("session_log_file_status", new q.a("session_log_file_status", "TEXT", true, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new q.d("index_last_connections_status", false, v.e(Column.STATUS), v.e("ASC")));
            q qVar4 = new q("last_connections", linkedHashMap4, linkedHashSet, linkedHashSet2);
            q qVarA4 = bVar2.a(bVar, "last_connections");
            if (!qVar4.equals(qVarA4)) {
                return new i0.a(false, "last_connections(com.server.auditor.ssh.client.room.LastConnectionDbModel).\n Expected:\n" + qVar4 + "\n Found:\n" + qVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("last_connection_id", new q.a("last_connection_id", "INTEGER", true, 1, null, 1));
            linkedHashMap5.put("remote_id", new q.a("remote_id", "INTEGER", true, 0, null, 1));
            linkedHashMap5.put("size", new q.a("size", "INTEGER", true, 0, null, 1));
            linkedHashMap5.put("checksum", new q.a("checksum", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("disconnected_at", new q.a("disconnected_at", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("updated_at", new q.a("updated_at", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("upload_status", new q.a("upload_status", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("ip_address", new q.a("ip_address", "TEXT", false, 0, null, 1));
            linkedHashMap5.put("location", new q.a("location", "TEXT", false, 0, null, 1));
            linkedHashMap5.put("bookmark_comment", new q.a("bookmark_comment", "TEXT", false, 0, null, 1));
            linkedHashMap5.put("bookmark_status", new q.a("bookmark_status", "INTEGER", false, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            linkedHashSet3.add(new q.c("last_connections", "CASCADE", "NO ACTION", v.e("last_connection_id"), v.e("id")));
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new q.d("index_session_logs_last_connection_id", true, v.e("last_connection_id"), v.e("ASC")));
            q qVar5 = new q("session_logs", linkedHashMap5, linkedHashSet3, linkedHashSet4);
            q qVarA5 = bVar2.a(bVar, "session_logs");
            if (!qVar5.equals(qVarA5)) {
                return new i0.a(false, "session_logs(com.server.auditor.ssh.client.room.SessionLogDBModel).\n Expected:\n" + qVar5 + "\n Found:\n" + qVarA5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap6.put("mobile_type", new q.a("mobile_type", "TEXT", true, 0, null, 1));
            linkedHashMap6.put(Column.MULTI_KEY_NAME, new q.a(Column.MULTI_KEY_NAME, "TEXT", true, 0, null, 1));
            q qVar6 = new q("team_devices", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
            q qVarA6 = bVar2.a(bVar, "team_devices");
            if (!qVar6.equals(qVarA6)) {
                return new i0.a(false, "team_devices(com.server.auditor.ssh.client.room.TeamDeviceDbModel).\n Expected:\n" + qVar6 + "\n Found:\n" + qVarA6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("vault_remote_id", new q.a("vault_remote_id", "INTEGER", true, 1, null, 1));
            linkedHashMap7.put("is_enabled", new q.a("is_enabled", "INTEGER", true, 0, null, 1));
            q qVar7 = new q("vault_logs_settings", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            q qVarA7 = bVar2.a(bVar, "vault_logs_settings");
            if (!qVar7.equals(qVarA7)) {
                return new i0.a(false, "vault_logs_settings(com.server.auditor.ssh.client.ui.sessionlogs.data.VaultLogsSettingDbModel).\n Expected:\n" + qVar7 + "\n Found:\n" + qVarA7);
            }
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            linkedHashMap8.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap8.put("username", new q.a("username", "TEXT", true, 0, null, 1));
            linkedHashMap8.put("default_passkey_type", new q.a("default_passkey_type", "TEXT", true, 0, null, 1));
            linkedHashMap8.put("is_setup_completed", new q.a("is_setup_completed", "INTEGER", true, 0, null, 1));
            linkedHashMap8.put("all_devices_biometric", new q.a("all_devices_biometric", "INTEGER", true, 0, null, 1));
            linkedHashMap8.put("sk_passkeys_enabled", new q.a("sk_passkeys_enabled", "INTEGER", true, 0, null, 1));
            q qVar8 = new q("ssh_id", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
            q qVarA8 = bVar2.a(bVar, "ssh_id");
            if (!qVar8.equals(qVarA8)) {
                return new i0.a(false, "ssh_id(com.server.auditor.ssh.client.ui.sshid.data.local.model.SshIdDbModel).\n Expected:\n" + qVar8 + "\n Found:\n" + qVarA8);
            }
            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
            linkedHashMap9.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap9.put("device", new q.a("device", "INTEGER", true, 0, null, 1));
            linkedHashMap9.put(SyncConstants.Bundle.PUBLIC_KEY, new q.a(SyncConstants.Bundle.PUBLIC_KEY, "TEXT", true, 0, null, 1));
            linkedHashMap9.put("private_key", new q.a("private_key", "TEXT", true, 0, null, 1));
            linkedHashMap9.put("biometric_type", new q.a("biometric_type", "TEXT", false, 0, null, 1));
            linkedHashMap9.put(Column.BIOMETRIC_ALIAS, new q.a(Column.BIOMETRIC_ALIAS, "TEXT", false, 0, null, 1));
            linkedHashMap9.put(Column.TYPE, new q.a(Column.TYPE, "TEXT", true, 0, null, 1));
            q qVar9 = new q("local_device_bound_keys", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
            q qVarA9 = bVar2.a(bVar, "local_device_bound_keys");
            if (!qVar9.equals(qVarA9)) {
                return new i0.a(false, "local_device_bound_keys(com.server.auditor.ssh.client.ui.sshid.data.local.model.LocalDeviceBoundKeyDbModel).\n Expected:\n" + qVar9 + "\n Found:\n" + qVarA9);
            }
            LinkedHashMap linkedHashMap10 = new LinkedHashMap();
            linkedHashMap10.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap10.put("device", new q.a("device", "INTEGER", true, 0, null, 1));
            linkedHashMap10.put(SyncConstants.Bundle.PUBLIC_KEY, new q.a(SyncConstants.Bundle.PUBLIC_KEY, "TEXT", true, 0, null, 1));
            linkedHashMap10.put("biometric_type", new q.a("biometric_type", "TEXT", false, 0, null, 1));
            linkedHashMap10.put(Column.TYPE, new q.a(Column.TYPE, "TEXT", true, 0, null, 1));
            linkedHashMap10.put(Column.CREATED_AT, new q.a(Column.CREATED_AT, "TEXT", true, 0, null, 1));
            q qVar10 = new q("remote_device_bound_keys", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
            q qVarA10 = bVar2.a(bVar, "remote_device_bound_keys");
            if (!qVar10.equals(qVarA10)) {
                return new i0.a(false, "remote_device_bound_keys(com.server.auditor.ssh.client.ui.sshid.data.local.model.RemoteDeviceBoundKeyDbModel).\n Expected:\n" + qVar10 + "\n Found:\n" + qVarA10);
            }
            LinkedHashMap linkedHashMap11 = new LinkedHashMap();
            linkedHashMap11.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap11.put(Column.DEVICE_ID, new q.a(Column.DEVICE_ID, "INTEGER", true, 0, null, 1));
            linkedHashMap11.put("device_type", new q.a("device_type", "TEXT", true, 0, null, 1));
            linkedHashMap11.put(Column.MULTI_KEY_NAME, new q.a(Column.MULTI_KEY_NAME, "TEXT", true, 0, null, 1));
            linkedHashMap11.put("is_current_device", new q.a("is_current_device", "INTEGER", true, 0, null, 1));
            linkedHashMap11.put("has_passkeys", new q.a("has_passkeys", "INTEGER", true, 0, null, 1));
            q qVar11 = new q("ssh_id_devices", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
            q qVarA11 = bVar2.a(bVar, "ssh_id_devices");
            if (!qVar11.equals(qVarA11)) {
                return new i0.a(false, "ssh_id_devices(com.server.auditor.ssh.client.ui.sshid.data.local.model.SshIdDeviceDetailsDbModel).\n Expected:\n" + qVar11 + "\n Found:\n" + qVarA11);
            }
            LinkedHashMap linkedHashMap12 = new LinkedHashMap();
            linkedHashMap12.put("id", new q.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap12.put("remote_id", new q.a("remote_id", "INTEGER", true, 0, null, 1));
            linkedHashMap12.put(SyncConstants.Bundle.PUBLIC_KEY, new q.a(SyncConstants.Bundle.PUBLIC_KEY, "TEXT", true, 0, null, 1));
            linkedHashMap12.put("encrypted_metadata", new q.a("encrypted_metadata", "TEXT", true, 0, null, 1));
            linkedHashMap12.put("label", new q.a("label", "TEXT", true, 0, null, 1));
            linkedHashMap12.put(Column.CREATED_AT, new q.a(Column.CREATED_AT, "TEXT", true, 0, null, 1));
            q qVar12 = new q("hardware_device_bound_keys", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
            q qVarA12 = bVar2.a(bVar, "hardware_device_bound_keys");
            if (qVar12.equals(qVarA12)) {
                return new i0.a(true, null);
            }
            return new i0.a(false, "hardware_device_bound_keys(com.server.auditor.ssh.client.ui.sshid.data.local.model.HardwareDeviceBoundKeyDbModel).\n Expected:\n" + qVar12 + "\n Found:\n" + qVarA12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ap.g U(AppDatabase_Impl appDatabase_Impl) {
        return new ap.g(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ap.n V(AppDatabase_Impl appDatabase_Impl) {
        return new ap.n(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.room.a W(AppDatabase_Impl appDatabase_Impl) {
        return new com.server.auditor.ssh.client.room.a(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b X(AppDatabase_Impl appDatabase_Impl) {
        return new b(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ap.t Y(AppDatabase_Impl appDatabase_Impl) {
        return new ap.t(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 Z(AppDatabase_Impl appDatabase_Impl) {
        return new b0(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e a0(AppDatabase_Impl appDatabase_Impl) {
        return new e(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b0(AppDatabase_Impl appDatabase_Impl) {
        return new f(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c0(AppDatabase_Impl appDatabase_Impl) {
        return new g(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 d0(AppDatabase_Impl appDatabase_Impl) {
        return new p0(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 e0(AppDatabase_Impl appDatabase_Impl) {
        return new z0(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h f0(AppDatabase_Impl appDatabase_Impl) {
        return new h(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i g0(AppDatabase_Impl appDatabase_Impl) {
        return new i(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j h0(AppDatabase_Impl appDatabase_Impl) {
        return new j(appDatabase_Impl);
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public l1 A() {
        return (l1) this.f38770i.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public c0 B() {
        return (c0) this.f38773l.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public q0 C() {
        return (q0) this.f38776o.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public t1 D() {
        return (t1) this.f38771j.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public x1 E() {
        return (x1) this.f38765d.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public m2 F() {
        return (m2) this.f38772k.getValue();
    }

    @Override // androidx.room.d0
    public void clearAllTables() {
        super.performClear(true, "vaults", "session_log_analytics", "host_interaction", "last_connections", "session_logs", "team_devices", "vault_logs_settings", "ssh_id", "local_device_bound_keys", "remote_device_bound_keys", "ssh_id_devices", "hardware_device_bound_keys");
    }

    @Override // androidx.room.d0
    public List createAutoMigrations(Map map) {
        t.f(map, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.d0
    protected androidx.room.n createInvalidationTracker() {
        return new androidx.room.n(this, new LinkedHashMap(), new LinkedHashMap(), "vaults", "session_log_analytics", "host_interaction", "last_connections", "session_logs", "team_devices", "vault_logs_settings", "ssh_id", "local_device_bound_keys", "remote_device_bound_keys", "ssh_id_devices", "hardware_device_bound_keys");
    }

    @Override // androidx.room.d0
    public Set getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.d0
    protected Map getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n0.b(x1.class), i.f38846e.a());
        linkedHashMap.put(n0.b(d.class), e.f38820e.a());
        linkedHashMap.put(n0.b(tl.o.class), com.server.auditor.ssh.client.room.a.f38780f.a());
        linkedHashMap.put(n0.b(w.class), b.f38787f.a());
        linkedHashMap.put(n0.b(v0.class), f.f38826d.a());
        linkedHashMap.put(n0.b(l1.class), g.f38834c.a());
        linkedHashMap.put(n0.b(t1.class), h.f38838d.a());
        linkedHashMap.put(n0.b(m2.class), j.f38852c.a());
        linkedHashMap.put(n0.b(c0.class), p0.f12066c.a());
        linkedHashMap.put(n0.b(ap.o.class), ap.t.f12079c.a());
        linkedHashMap.put(n0.b(u.class), b0.f12021c.a());
        linkedHashMap.put(n0.b(q0.class), z0.f12100c.a());
        linkedHashMap.put(n0.b(ap.h.class), ap.n.f12057c.a());
        linkedHashMap.put(n0.b(ap.a.class), ap.g.f12035b.a());
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.d0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public i0 createOpenDelegate() {
        return new a();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public ap.a s() {
        return (ap.a) this.f38778q.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public ap.h t() {
        return (ap.h) this.f38777p.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public tl.o u() {
        return (tl.o) this.f38767f.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public w v() {
        return (w) this.f38768g.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public ap.o w() {
        return (ap.o) this.f38774m.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public u x() {
        return (u) this.f38775n.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public d y() {
        return (d) this.f38766e.getValue();
    }

    @Override // com.server.auditor.ssh.client.room.AppDatabase
    public v0 z() {
        return (v0) this.f38769h.getValue();
    }
}

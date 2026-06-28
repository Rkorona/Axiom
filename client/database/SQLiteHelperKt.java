package com.server.auditor.ssh.client.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import au.b;
import com.server.auditor.ssh.client.interactors.e;
import com.server.auditor.ssh.client.interactors.q0;
import fu.c;
import io.sentry.f5;
import iu.p;
import java.io.IOException;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.m;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import wu.j;
import wu.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteHelperKt {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String EXPECTED_DATABASE_SCHEMA = "CREATE TABLE ssh_key(_id integer primary key autoincrement, title text, privateKey text, publicKey text, passPhrase text, datetime datetime default(datetime('now', 'localtime')), id_on_server integer default -1, status integer not null default 1, updated_at DATETIME, key_type TEXT DEFAULT null, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, biometric_alias TEXT DEFAULT null, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE uris(_id integer primary key autoincrement, host text not null, port integer not null, username text not null, unique(host, port, username))\nCREATE TABLE ssh_connections(_id integer primary key autoincrement, uri_id integer not null, datetime text not null default(datetime('now', 'localtime')), foreign key(uri_id) references uris(_id) on delete cascade)\nCREATE INDEX ssh_connections_index ON ssh_connections(uri_id)\nCREATE TABLE snippet(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, expression TEXT NOT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, close_after_run BOOLEAN DEFAULT NULL, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, package INTEGER, script_structure TEXT DEFAULT '', encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE identity(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, username TEXT NOT NULL, password TEXT NOT NULL, is_visible BOOLEAN NOT NULL DEFAULT 0, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, ssh_key_id INTEGER DEFAULT NULL, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, biometric_key_id INTEGER DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(ssh_key_id) REFERENCES ssh_key(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE group_t(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, id_on_server INTEGER NOT NULL DEFAULT \"-1\", status INTEGER NOT NULL DEFAULT \"1\", updated_at DATETIME, parent_group_id INTEGER DEFAULT NULL, ssh_config_id INTEGER DEFAULT NULL, telnet_config_id, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, sharing_mode TEXT DEFAULT NULL, credentials_mode TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(ssh_config_id) REFERENCES ssh_config(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY(parent_group_id) REFERENCES group_t(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE local_config(_id INTEGER PRIMARY KEY AUTOINCREMENT, font_size INTEGER DEFAULT NULL, color_schema TEXT DEFAULT NULL, local_shell_path TEXT DEFAULT \"/system/bin/sh\", local_shell_argc TEXT DEFAULT NULL, charset TEXT DEFAULT \"UTF-8\", start_up_snippet_id INTEGER DEFAULT NULL, FOREIGN KEY(start_up_snippet_id) REFERENCES snippet(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE port_forwarding(_id INTEGER PRIMARY KEY AUTOINCREMENT, type TEXT NOT NULL, bound_address TEXT NOT NULL, local_port INTEGER NOT NULL, forwarding_host TEXT NOT NULL, remote_port INTEGER NOT NULL, auto_forwarding INTEGER NOT NULL DEFAULT 1, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, host_id INTEGER NOT NULL, label TEXT DEFAULT null, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(host_id) REFERENCES hosts(_id) ON DELETE CASCADE)\nCREATE INDEX port_forwarding_index ON port_forwarding(host_id)\nCREATE TABLE shortcut_trains(_id INTEGER PRIMARY KEY AUTOINCREMENT, shortcut_1 TEXT DEFAULT NULL, shortcut_2 TEXT DEFAULT NULL, shortcut_3 TEXT DEFAULT NULL, shortcut_4 TEXT DEFAULT NULL, shortcut_order DOUBLE NOT NULL DEFAULT 0.0)\nCREATE TABLE telnet_config(_id INTEGER PRIMARY KEY AUTOINCREMENT, font_size INTEGER DEFAULT NULL, port INTEGER DEFAULT NULL, is_cursor_blink BOOLEAN NOT NULL DEFAULT 0, color_schema TEXT DEFAULT NULL, charset TEXT DEFAULT \"UTF-8\", identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(identity_id) REFERENCES identity(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE hosts(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, address TEXT NOT NULL, host_os TEXT DEFAULT NULL, icon TEXT DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, ssh_config_id INTEGER DEFAULT NULL, telnet_config_id INTEGER DEFAULT NULL, local_config_id INTEGER DEFAULT NULL, group_id INTEGER DEFAULT NULL, recent_connection_date DATETIME, interaction_date DATETIME, use_counter INTEGER DEFAULT 0, backspace_type INTEGER DEFAULT 0, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, credentials_mode TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(ssh_config_id) REFERENCES ssh_config(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY(telnet_config_id) REFERENCES telnet_config(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY(local_config_id) REFERENCES local_config(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY(group_id) REFERENCES group_t(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE completion_dictionary(dict_id INTEGER PRIMARY KEY AUTOINCREMENT, command TEXT UNIQUE NOT NULL, use_counter INTEGER NOT NULL DEFAULT 1, updated_at INTEGER NOT NULL)\nCREATE TABLE known_hosts(_id INTEGER PRIMARY KEY AUTOINCREMENT, hostnames TEXT NOT NULL, publicKey TEXT NOT NULL, marker TEXT, comment TEXT, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE proxy(_id INTEGER PRIMARY KEY AUTOINCREMENT, type TEXT NOT NULL, host TEXT NOT NULL, port INTEGER DEFAULT NULL, identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(identity_id) REFERENCES identity(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE ssh_config(_id INTEGER PRIMARY KEY AUTOINCREMENT, font_size INTEGER DEFAULT NULL, port INTEGER DEFAULT NULL, strict_check_host_key BOOLEAN DEFAULT NULL, use_ssh_key BOOLEAN DEFAULT NULL, is_forward_port BOOLEAN DEFAULT NULL, is_cursor_blink BOOLEAN DEFAULT NULL, timeout INTEGER DEFAULT NULL, keep_alive_packages INTEGER DEFAULT NULL, color_schema TEXT DEFAULT NULL, charset TEXT DEFAULT \"UTF-8\", id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, identity_id INTEGER DEFAULT NULL, start_up_snippet_id INTEGER DEFAULT NULL, proxy_id INTEGER DEFAULT NULL, is_use_mosh boolean default 0, mosh_server_command text default null, env_variables TEXT DEFAULT null, is_use_agent_forwarding boolean default 1, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(identity_id) REFERENCES identity(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE, FOREIGN KEY(start_up_snippet_id) REFERENCES snippet(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE FOREIGN KEY(proxy_id) REFERENCES proxy(_id) ON DELETE SET DEFAULT ON UPDATE CASCADE)\nCREATE TABLE last_connection_deprecated(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT DEFAULT NULL, username TEXT DEFAULT NULL, host TEXT DEFAULT NULL, port INTEGER DEFAULT 22, password TEXT DEFAULT NULL, history_type TEXT DEFAULT NULL, passPhrase TEXT DEFAULT NULL, privateKey TEXT DEFAULT NULL, start_up_snippet_expression TEXT DEFAULT NULL, font_size INTEGER DEFAULT NULL, color_schema TEXT DEFAULT NULL, charset TEXT DEFAULT NULL, local_shell_path TEXT DEFAULT NULL, local_shell_argc TEXT DEFAULT NULL, host_os TEXT DEFAULT NULL, connection_status INTEGER DEFAULT 0, error_message TEXT DEFAULT NULL, mosh_server_command TEXT DEFAULT NULL, is_use_mosh INTEGER DEFAULT 0, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME DEFAULT NULL, device_id INTEGER DEFAULT -1, proxy_type TEXT DEFAULT NULL, proxy_host TEXT DEFAULT NULL, proxy_port INTEGER DEFAULT NULL, proxy_username TEXT DEFAULT NULL, proxy_password TEXT DEFAULT NULL, created_at DATETIME DEFAULT(datetime('now', 'localtime')), env_variables TEXT DEFAULT null, encrypted_with INTEGER DEFAULT NULL, is_shared BOOLEAN DEFAULT 0, host_local_id INTEGER DEFAULT NULL, timestamp TEXT DEFAULT NULL)\nCREATE TABLE chain_hosts(_id INTEGER PRIMARY KEY AUTOINCREMENT, ssh_config_id INTEGER NOT NULL, chaining_hosts TEXT NOT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL, FOREIGN KEY(ssh_config_id) REFERENCES ssh_config(_id) ON DELETE CASCADE ON UPDATE CASCADE)\nCREATE TABLE snippet_host(_id INTEGER PRIMARY KEY AUTOINCREMENT, snippet_id INTEGER NOT NULL, host_id INTEGER NOT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL, UNIQUE(snippet_id, host_id) FOREIGN KEY(snippet_id) REFERENCES snippet(_id) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY(host_id) REFERENCES hosts(_id) ON DELETE CASCADE ON UPDATE CASCADE)\nCREATE TABLE tags(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE tag_host(_id INTEGER PRIMARY KEY AUTOINCREMENT, tag_id INTEGER NOT NULL, host_id INTEGER NOT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE ssh_config_identity(_id INTEGER PRIMARY KEY AUTOINCREMENT, ssh_config_id INTEGER DEFAULT NULL, identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE telnet_config_identity(_id INTEGER PRIMARY KEY AUTOINCREMENT, telnet_config_id INTEGER DEFAULT NULL, identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE multi_key(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, username TEXT, raw_api_content TEXT DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN DEFAULT 0, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE shared_ssh_config_identity(_id INTEGER PRIMARY KEY AUTOINCREMENT, ssh_config_id INTEGER DEFAULT NULL, identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE shared_telnet_config_identity(_id INTEGER PRIMARY KEY AUTOINCREMENT, telnet_config_id INTEGER DEFAULT NULL, identity_id INTEGER DEFAULT NULL, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE package(_id INTEGER PRIMARY KEY AUTOINCREMENT, label TEXT, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, created_at DATETIME, updated_at DATETIME, is_shared BOOLEAN, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL)\nCREATE TABLE certificate(_id INTEGER PRIMARY KEY AUTOINCREMENT, material TEXT, ssh_key_id INTEGER NOT NULL DEFAULT -1, id_on_server INTEGER NOT NULL DEFAULT -1, status INTEGER NOT NULL DEFAULT 1, updated_at DATETIME, is_shared BOOLEAN, raw_api_content TEXT DEFAULT NULL, encrypted_with INTEGER DEFAULT NULL)\nCREATE VIEW host_app AS SELECT hosts._id as _id, address, hosts.title as title, host_os, icon, recent_connection_date, interaction_date, use_counter, backspace_type, hosts.is_shared as is_shared, ssh_config.font_size as ssh_config_font_size, telnet_config.font_size as telnet_config_font_size, local_config.font_size as local_config_font_size, ssh_config.port as ssh_port, telnet_config.port as telnet_port, local_shell_path, local_shell_argc, proxy_id, strict_check_host_key, use_ssh_key, is_forward_port, is_use_agent_forwarding, is_use_mosh, mosh_server_command, ssh_config.is_cursor_blink as ssh_is_cursor_blink, ssh_config.env_variables as ssh_env_variables, telnet_config.is_cursor_blink as telnet_is_cursor_blink, timeout, keep_alive_packages, ssh_config.color_schema as ssh_color_scheme, ssh_config.charset as ssh_charset, telnet_config.color_schema as telnet_color_scheme, telnet_config.charset as telnet_charset, local_config.color_schema as local_color_scheme, local_config.charset as local_charset, ssh_key.title as ssh_key_title, privateKey, passPhrase, group_id, ssh_config._id as ssh_config_id, telnet_config._id as telnet_config_id, local_config._id as local_config_id, ssh_config.start_up_snippet_id as ssh_snippet_id, local_config.start_up_snippet_id as local_snippet_id, snippet.title as start_up_snippet_title, snippet.expression as start_up_snippet_expression, ssh_config.identity_id as ssh_identity_id, telnet_config.identity_id as telnet_identity_id, identity._id as identity_id, identity.title as identity_title, identity.username as username, identity.password as password, identity.is_visible as identity_is_visible, ssh_key._id as ssh_key_id, hosts.status as status from hosts LEFT JOIN ssh_config ON hosts.ssh_config_id = ssh_config._id LEFT JOIN telnet_config ON hosts.telnet_config_id = telnet_config._id LEFT JOIN local_config ON hosts.local_config_id = local_config._id LEFT JOIN identity ON ssh_config.identity_id = identity._id OR telnet_config.identity_id = identity._id LEFT JOIN ssh_key ON identity.ssh_key_id = ssh_key._id LEFT JOIN snippet ON ssh_config.start_up_snippet_id = snippet._id OR local_config.start_up_snippet_id = snippet._id LEFT JOIN proxy ON ssh_config.proxy_id = proxy._id\nCREATE VIEW identity_app AS SELECT identity._id as _id, identity.title as title, ssh_key.title as ssh_key_title, username, password, privateKey, passPhrase, is_visible, ssh_key._id as ssh_key_id, identity.status as status, identity.is_shared as is_shared, identity.encrypted_with as encrypted_with from identity, identity.ssh_id_mode as ssh_id_mode from identity LEFT JOIN ssh_key ON identity.ssh_key_id = ssh_key._id\nCREATE VIEW config_api AS SELECT ssh_config._id as _id, font_size, strict_check_host_key, use_ssh_key, is_forward_port, is_use_mosh, mosh_server_command, is_cursor_blink, timeout, keep_alive_packages, color_schema, charset, env_variables, is_use_agent_forwarding, ssh_config.is_shared as is_shared, ssh_config.port as port, ssh_config.id_on_server as id_on_server, identity.id_on_server as identity_id, snippet.id_on_server as start_up_snippet_id, proxy.id_on_server as proxy_id from ssh_config LEFT JOIN identity ON ssh_config.identity_id = identity._id LEFT JOIN snippet ON ssh_config.start_up_snippet_id = snippet._id LEFT JOIN proxy ON ssh_config.proxy_id = proxy._id\nCREATE VIEW pf_app AS SELECT port_forwarding._id as _id, type, local_port, remote_port, bound_address, forwarding_host, label, address, port_forwarding.is_shared as is_shared, port_forwarding.encrypted_with as encrypted_with, hosts._id as host_id, hosts.title as host_title, host_os, icon, font_size, port, strict_check_host_key, use_ssh_key, is_forward_port, is_cursor_blink, timeout, keep_alive_packages, color_schema, charset, username, password, privateKey, passPhrase, ssh_config._id as ssh_config_id, identity._id as ssh_identity_id, ssh_key._id as ssh_key_id, port_forwarding.status as status from port_forwarding LEFT JOIN hosts ON port_forwarding.host_id = hosts._id LEFT JOIN ssh_config ON hosts.ssh_config_id = ssh_config._id LEFT JOIN identity ON ssh_config.identity_id = identity._id LEFT JOIN ssh_key ON identity.ssh_key_id = ssh_key._id\nCREATE VIEW host_api AS SELECT hosts._id AS _id, address, hosts.title AS title, host_os, icon, interaction_date, backspace_type, ssh_config.id_on_server AS ssh_config_id, group_t.id_on_server AS group_id, hosts.id_on_server AS id_on_server FROM hosts LEFT JOIN ssh_config ON hosts.ssh_config_id = ssh_config._id LEFT JOIN group_t ON hosts.group_id = group_t._id\nCREATE VIEW tag_host_api AS SELECT tag_host._id as _id, hosts.id_on_server as host_id, tags.id_on_server as tag_id, tag_host.id_on_server as id_on_server from tag_host LEFT JOIN hosts ON tag_host.host_id = hosts._id LEFT JOIN tags ON tag_host.tag_id = tags._id\nCREATE VIEW group_api AS SELECT group_t._id as _id, group_t.title as group_title, ssh_config.id_on_server as ssh_config_id, parent_group.id_on_server as parent_group_id from group_t LEFT JOIN ssh_config ON group_t.ssh_config_id = ssh_config._id LEFT JOIN group_t as parent_group ON group_t.parent_group_id = group_t._id\nCREATE VIEW proxy_app AS SELECT proxy._id as _id, type, host, port, proxy.id_on_server as id_on_server, identity.id_on_server as identity_id from proxy LEFT JOIN identity ON proxy.identity_id = identity._id\nCREATE VIEW snippet_host_api AS SELECT snippet_host._id as _id, hosts.id_on_server as host_id, snippet.id_on_server as snippet_id, snippet_host.id_on_server as id_on_server from snippet_host LEFT JOIN hosts ON snippet_host.host_id = hosts._id LEFT JOIN snippet ON snippet_host.snippet_id = snippet._id";
    private static final long SENTRY_FLUSH_TIMEOUT = 2000;
    private static final int SQL_MASTER_SCHEMA_COLUMN_INDEX = 0;
    private final e collectDatabaseSchemaInconsistenciesUseCase;
    private final zk.a databaseSchemaReportCacheRepository;
    private final q0 sentDatabaseSchemaReportUseCase;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.database.SQLiteHelperKt$checkDatabaseIntegrity$1, reason: invalid class name */
    @f(c = "com.server.auditor.ssh.client.database.SQLiteHelperKt$checkDatabaseIntegrity$1", f = "SQLiteHelperKt.kt", l = {64, 65}, m = "invokeSuspend")
    static final class AnonymousClass1 extends m implements p {
        final /* synthetic */ Context $context;
        final /* synthetic */ SQLiteDatabase $db;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SQLiteDatabase sQLiteDatabase, Context context, zt.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$db = sQLiteDatabase;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return SQLiteHelperKt.this.new AnonymousClass1(this.$db, this.$context, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            String strD;
            String str;
            Object objF = b.f();
            int i10 = this.label;
            if (i10 == 0) {
                x.b(obj);
                String strExtractDatabaseSchema = SQLiteHelperKt.this.extractDatabaseSchema(this.$db);
                if (strExtractDatabaseSchema == null) {
                    return m0.f82633a;
                }
                strD = SQLiteHelperKt.this.collectDatabaseSchemaInconsistenciesUseCase.d(SQLiteHelperKt.EXPECTED_DATABASE_SCHEMA, strExtractDatabaseSchema);
                if (s.m0(strD)) {
                    strD = null;
                }
                if (strD != null && !SQLiteHelperKt.this.databaseSchemaReportCacheRepository.h(this.$context, SQLiteHelperKt.this.databaseSchemaReportCacheRepository.b())) {
                    zk.a aVar = SQLiteHelperKt.this.databaseSchemaReportCacheRepository;
                    Context context = this.$context;
                    this.L$0 = strD;
                    this.label = 1;
                    if (aVar.d(context, this) != objF) {
                    }
                    return objF;
                }
                return m0.f82633a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                x.b(obj);
                SQLiteHelperKt.this.sentDatabaseSchemaReportUseCase.a(str);
                return m0.f82633a;
            }
            String str2 = (String) this.L$0;
            x.b(obj);
            strD = str2;
            zk.a aVar2 = SQLiteHelperKt.this.databaseSchemaReportCacheRepository;
            Context context2 = this.$context;
            this.L$0 = strD;
            this.label = 2;
            if (aVar2.c(context2, strD, this) != objF) {
                str = strD;
                SQLiteHelperKt.this.sentDatabaseSchemaReportUseCase.a(str);
                return m0.f82633a;
            }
            return objF;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super m0> eVar) {
            return ((AnonymousClass1) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.database.SQLiteHelperKt$waitSentryEventsToSent$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.server.auditor.ssh.client.database.SQLiteHelperKt$waitSentryEventsToSent$1", f = "SQLiteHelperKt.kt", l = {40}, m = "invokeSuspend")
    static final class C14691 extends m implements p {
        int label;

        C14691(zt.e<? super C14691> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return new C14691(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = b.f();
            int i10 = this.label;
            if (i10 == 0) {
                x.b(obj);
                this.label = 1;
                if (s0.b(SQLiteHelperKt.SENTRY_FLUSH_TIMEOUT, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            f5.z(SQLiteHelperKt.SENTRY_FLUSH_TIMEOUT);
            f5.v();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super m0> eVar) {
            return ((C14691) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SQLiteHelperKt(zk.a aVar, e eVar, q0 q0Var) {
        t.f(aVar, "databaseSchemaReportCacheRepository");
        t.f(eVar, "collectDatabaseSchemaInconsistenciesUseCase");
        t.f(q0Var, "sentDatabaseSchemaReportUseCase");
        this.databaseSchemaReportCacheRepository = aVar;
        this.collectDatabaseSchemaInconsistenciesUseCase = eVar;
        this.sentDatabaseSchemaReportUseCase = q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractDatabaseSchema(SQLiteDatabase sQLiteDatabase) throws IOException {
        String strB;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT sql FROM sqlite_master WHERE type IN ('table','index','view') AND tbl_name NOT IN ('android_metadata','sqlite_sequence')", null);
            try {
                StringBuilder sb2 = new StringBuilder();
                while (cursorRawQuery.moveToNext()) {
                    t.c(cursorRawQuery);
                    String string = cursorRawQuery.isNull(0) ? null : cursorRawQuery.getString(0);
                    if (string != null && (strB = e.f27355a.b(string)) != null) {
                        sb2.append(strB);
                        sb2.append('\n');
                    }
                }
                String string2 = sb2.toString();
                t.e(string2, "toString(...)");
                String string3 = s.p1(string2).toString();
                c.a(cursorRawQuery, null);
                return string3;
            } finally {
            }
        } catch (SQLiteException e10) {
            y9.a.f86838a.g("Cannot extract database schema because of: " + e10);
            return null;
        }
    }

    public final void checkDatabaseIntegrity(Context context, SQLiteDatabase sQLiteDatabase) {
        t.f(context, "context");
        t.f(sQLiteDatabase, "db");
        j.b(null, new AnonymousClass1(sQLiteDatabase, context, null), 1, null);
    }

    public final void waitSentryEventsToSent() {
        j.b(null, new C14691(null), 1, null);
    }
}

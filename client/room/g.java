package com.server.auditor.ssh.client.room;

import androidx.collection.b0;
import androidx.room.d0;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogFileStatus;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogUploadStatus;
import iu.l;
import java.util.List;
import ju.k;
import ju.t;
import l6.p;
import tl.l1;
import tl.u;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38834c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38835d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Converters f38837b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private a() {
        }
    }

    public g(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38837b = new Converters();
        this.f38836a = d0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogFileStatus j(String str) {
        switch (str.hashCode()) {
            case -1973975876:
                if (str.equals("WRITING")) {
                    return SessionLogFileStatus.WRITING;
                }
                break;
            case -1948348832:
                if (str.equals("UPLOADED")) {
                    return SessionLogFileStatus.UPLOADED;
                }
                break;
            case -1707124599:
                if (str.equals("READY_TO_UPLOAD")) {
                    return SessionLogFileStatus.READY_TO_UPLOAD;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    return SessionLogFileStatus.NONE;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogProtocol k(String str) {
        switch (str.hashCode()) {
            case -1852509708:
                if (str.equals("SERIAL")) {
                    return SessionLogProtocol.SERIAL;
                }
                break;
            case -1824054366:
                if (str.equals("TELNET")) {
                    return SessionLogProtocol.TELNET;
                }
                break;
            case -314126096:
                if (str.equals("LOCAL_TERMINAL")) {
                    return SessionLogProtocol.LOCAL_TERMINAL;
                }
                break;
            case 82408:
                if (str.equals("SSH")) {
                    return SessionLogProtocol.SSH;
                }
                break;
            case 2372471:
                if (str.equals("MOSH")) {
                    return SessionLogProtocol.MOSH;
                }
                break;
            case 2049106064:
                if (str.equals("QUICK_CONNECTION")) {
                    return SessionLogProtocol.QUICK_CONNECTION;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogUploadStatus l(String str) {
        switch (str.hashCode()) {
            case -476794961:
                if (str.equals("ABORTED")) {
                    return SessionLogUploadStatus.ABORTED;
                }
                break;
            case 174130302:
                if (str.equals("REJECTED")) {
                    return SessionLogUploadStatus.REJECTED;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return SessionLogUploadStatus.UNKNOWN;
                }
                break;
            case 1383663147:
                if (str.equals("COMPLETED")) {
                    return SessionLogUploadStatus.COMPLETED;
                }
                break;
            case 1746537160:
                if (str.equals("CREATED")) {
                    return SessionLogUploadStatus.CREATED;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    private final void m(final p6.b bVar, b0 b0Var) {
        if (b0Var.i()) {
            return;
        }
        int i10 = 0;
        if (b0Var.o() > 999) {
            l6.i.a(b0Var, false, new l() { // from class: tl.q1
                @Override // iu.l
                public final Object invoke(Object obj) {
                    return com.server.auditor.ssh.client.room.g.n(this.f79799a, bVar, (androidx.collection.b0) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `id`,`id_on_server`,`title`,`username`,`host`,`port`,`connection_type`,`connection_status`,`error_message`,`startup_snippet_expression`,`color_scheme`,`charset`,`local_shell_path`,`local_shell_argc`,`host_os`,`is_use_mosh`,`mosh_server_command`,`status`,`device_id`,`proxy_type`,`proxy_host`,`proxy_port`,`proxy_username`,`proxy_password`,`env_variables`,`is_shared`,`encrypted_with`,`host_local_id`,`created_at`,`updated_at`,`timestamp`,`actor_id`,`custom_tags`,`protocol`,`session_log_filename`,`session_log_file_secret_key`,`session_log_file_status` FROM `last_connections` WHERE `id` IN (");
        p.a(sb2, b0Var.o());
        sb2.append(")");
        String string = sb2.toString();
        t.e(string, "toString(...)");
        p6.d dVarH2 = bVar.H2(string);
        int iO = b0Var.o();
        int i11 = 1;
        int i12 = 1;
        for (int i13 = 0; i13 < iO; i13++) {
            dVarH2.B(i12, b0Var.j(i13));
            i12++;
        }
        try {
            int iC = l6.l.c(dVarH2, "id");
            if (iC == -1) {
                return;
            }
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iC);
                if (b0Var.e(j10)) {
                    b0Var.k(j10, new u(dVarH2.getLong(i10), dVarH2.getLong(i11), dVarH2.isNull(2) ? null : dVarH2.c2(2), dVarH2.isNull(3) ? null : dVarH2.c2(3), dVarH2.isNull(4) ? null : dVarH2.c2(4), dVarH2.isNull(5) ? null : Integer.valueOf((int) dVarH2.getLong(5)), dVarH2.isNull(6) ? null : dVarH2.c2(6), (int) dVarH2.getLong(7), dVarH2.isNull(8) ? null : dVarH2.c2(8), dVarH2.isNull(9) ? null : dVarH2.c2(9), dVarH2.isNull(10) ? null : dVarH2.c2(10), dVarH2.isNull(11) ? null : dVarH2.c2(11), dVarH2.isNull(12) ? null : dVarH2.c2(12), dVarH2.isNull(13) ? null : dVarH2.c2(13), dVarH2.isNull(14) ? null : dVarH2.c2(14), ((int) dVarH2.getLong(15)) != 0, dVarH2.isNull(16) ? null : dVarH2.c2(16), (int) dVarH2.getLong(17), dVarH2.isNull(18) ? null : Long.valueOf(dVarH2.getLong(18)), dVarH2.isNull(19) ? null : dVarH2.c2(19), dVarH2.isNull(20) ? null : dVarH2.c2(20), dVarH2.isNull(21) ? null : Integer.valueOf((int) dVarH2.getLong(21)), dVarH2.isNull(22) ? null : dVarH2.c2(22), dVarH2.isNull(23) ? null : dVarH2.c2(23), dVarH2.isNull(24) ? null : dVarH2.c2(24), ((int) dVarH2.getLong(25)) != 0, dVarH2.isNull(26) ? null : Long.valueOf(dVarH2.getLong(26)), dVarH2.isNull(27) ? null : Long.valueOf(dVarH2.getLong(27)), dVarH2.c2(28), dVarH2.isNull(29) ? null : dVarH2.c2(29), dVarH2.isNull(30) ? null : dVarH2.c2(30), dVarH2.isNull(31) ? null : Long.valueOf(dVarH2.getLong(31)), this.f38837b.fromString(dVarH2.c2(32)), dVarH2.isNull(33) ? null : k(dVarH2.c2(33)), dVarH2.isNull(34) ? null : dVarH2.c2(34), dVarH2.isNull(35) ? null : dVarH2.c2(35), j(dVarH2.c2(36))));
                    i11 = 1;
                    i10 = 0;
                }
            }
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 n(g gVar, p6.b bVar, b0 b0Var) {
        t.f(b0Var, "_tmpMap");
        gVar.m(bVar, b0Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[Catch: all -> 0x006f, LOOP:1: B:10:0x007f->B:31:0x0106, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:3:0x000f, B:4:0x005d, B:6:0x0063, B:9:0x0072, B:10:0x007f, B:12:0x0085, B:16:0x00b4, B:21:0x00c6, B:23:0x00cc, B:28:0x00de, B:29:0x00f2, B:31:0x0106, B:32:0x011a, B:33:0x0121, B:20:0x00bf, B:15:0x00ae), top: B:38:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List o(java.lang.String r32, com.server.auditor.ssh.client.room.g r33, p6.b r34) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.room.g.o(java.lang.String, com.server.auditor.ssh.client.room.g, p6.b):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[Catch: all -> 0x006f, LOOP:1: B:10:0x007f->B:31:0x0106, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:3:0x000f, B:4:0x005d, B:6:0x0063, B:9:0x0072, B:10:0x007f, B:12:0x0085, B:16:0x00b4, B:21:0x00c6, B:23:0x00cc, B:28:0x00de, B:29:0x00f2, B:31:0x0106, B:32:0x011a, B:33:0x0121, B:20:0x00bf, B:15:0x00ae), top: B:38:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List p(java.lang.String r32, com.server.auditor.ssh.client.room.g r33, p6.b r34) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.room.g.p(java.lang.String, com.server.auditor.ssh.client.room.g, p6.b):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: all -> 0x0076, LOOP:1: B:10:0x0087->B:31:0x0110, LOOP_END, TryCatch #0 {all -> 0x0076, blocks: (B:3:0x0012, B:4:0x0062, B:6:0x0068, B:9:0x0079, B:10:0x0087, B:12:0x008d, B:16:0x00be, B:21:0x00d0, B:23:0x00d6, B:28:0x00e8, B:29:0x00fc, B:31:0x0110, B:32:0x0126, B:33:0x012d, B:20:0x00c9, B:15:0x00b8), top: B:38:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List q(java.lang.String r30, long r31, com.server.auditor.ssh.client.room.g r33, p6.b r34) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.room.g.q(java.lang.String, long, com.server.auditor.ssh.client.room.g, p6.b):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121 A[Catch: all -> 0x002b, LOOP:2: B:14:0x009a->B:35:0x0121, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x000f, B:4:0x0015, B:6:0x001b, B:9:0x002e, B:10:0x007b, B:12:0x0081, B:13:0x008d, B:14:0x009a, B:16:0x00a0, B:20:0x00cf, B:25:0x00e1, B:27:0x00e7, B:32:0x00f9, B:33:0x010d, B:35:0x0121, B:36:0x0135, B:37:0x013c, B:24:0x00da, B:19:0x00c9), top: B:42:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List r(java.lang.String r30, java.util.List r31, com.server.auditor.ssh.client.room.g r32, p6.b r33) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.room.g.r(java.lang.String, java.util.List, com.server.auditor.ssh.client.room.g, p6.b):java.util.List");
    }

    @Override // tl.l1
    public zu.f a() {
        final String str = "\n            SELECT * FROM session_logs\n            JOIN last_connections ON session_logs.last_connection_id = last_connections.id\n            WHERE last_connections.status = 1\n            OR last_connections.status = 0\n        ";
        return h6.j.a(this.f38836a, true, new String[]{"last_connections", "session_logs"}, new l() { // from class: tl.p1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.g.p(str, this, (p6.b) obj);
            }
        });
    }

    @Override // tl.l1
    public Object b(final long j10, zt.e eVar) {
        final String str = "\n            SELECT * FROM session_logs\n            JOIN last_connections ON session_logs.last_connection_id = last_connections.id\n            WHERE last_connections.id = ? LIMIT 1\n        ";
        return l6.b.f(this.f38836a, true, true, new l() { // from class: tl.m1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.g.q(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.l1
    public Object c(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM session_logs WHERE session_logs.remote_id IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        return l6.b.f(this.f38836a, true, true, new l() { // from class: tl.n1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.g.r(string, list, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.l1
    public Object d(zt.e eVar) {
        final String str = "\n            SELECT * FROM session_logs\n            JOIN last_connections ON session_logs.last_connection_id = last_connections.id\n            WHERE last_connections.status = 1\n            OR last_connections.status = 0\n        ";
        return l6.b.f(this.f38836a, true, true, new l() { // from class: tl.o1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.g.o(str, this, (p6.b) obj);
            }
        }, eVar);
    }
}

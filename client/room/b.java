package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogFileStatus;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import l6.p;
import tl.u;
import tl.w;
import ut.m0;
import ut.s;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f38787f = new d(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f38788g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Converters f38791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.e f38792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.room.e f38793e;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR ABORT INTO `last_connections` (`id`,`id_on_server`,`title`,`username`,`host`,`port`,`connection_type`,`connection_status`,`error_message`,`startup_snippet_expression`,`color_scheme`,`charset`,`local_shell_path`,`local_shell_argc`,`host_os`,`is_use_mosh`,`mosh_server_command`,`status`,`device_id`,`proxy_type`,`proxy_host`,`proxy_port`,`proxy_username`,`proxy_password`,`env_variables`,`is_shared`,`encrypted_with`,`host_local_id`,`created_at`,`updated_at`,`timestamp`,`actor_id`,`custom_tags`,`protocol`,`session_log_filename`,`session_log_file_secret_key`,`session_log_file_status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, u uVar) {
            t.f(dVar, "statement");
            t.f(uVar, "entity");
            dVar.B(1, uVar.p());
            dVar.B(2, uVar.q());
            String strH = uVar.H();
            if (strH == null) {
                dVar.E(3);
            } else {
                dVar.i0(3, strH);
            }
            String strJ = uVar.J();
            if (strJ == null) {
                dVar.E(4);
            } else {
                dVar.i0(4, strJ);
            }
            String strM = uVar.m();
            if (strM == null) {
                dVar.E(5);
            } else {
                dVar.i0(5, strM);
            }
            if (uVar.u() == null) {
                dVar.E(6);
            } else {
                dVar.B(6, r0.intValue());
            }
            String strG = uVar.g();
            if (strG == null) {
                dVar.E(7);
            } else {
                dVar.i0(7, strG);
            }
            dVar.B(8, uVar.f());
            String strL = uVar.l();
            if (strL == null) {
                dVar.E(9);
            } else {
                dVar.i0(9, strL);
            }
            String strE = uVar.E();
            if (strE == null) {
                dVar.E(10);
            } else {
                dVar.i0(10, strE);
            }
            String strE2 = uVar.e();
            if (strE2 == null) {
                dVar.E(11);
            } else {
                dVar.i0(11, strE2);
            }
            String strD = uVar.d();
            if (strD == null) {
                dVar.E(12);
            } else {
                dVar.i0(12, strD);
            }
            String strS = uVar.s();
            if (strS == null) {
                dVar.E(13);
            } else {
                dVar.i0(13, strS);
            }
            String strR = uVar.r();
            if (strR == null) {
                dVar.E(14);
            } else {
                dVar.i0(14, strR);
            }
            String strO = uVar.o();
            if (strO == null) {
                dVar.E(15);
            } else {
                dVar.i0(15, strO);
            }
            dVar.B(16, uVar.Q() ? 1L : 0L);
            String strT = uVar.t();
            if (strT == null) {
                dVar.E(17);
            } else {
                dVar.i0(17, strT);
            }
            dVar.B(18, uVar.F());
            Long lJ = uVar.j();
            if (lJ == null) {
                dVar.E(19);
            } else {
                dVar.B(19, lJ.longValue());
            }
            String strZ = uVar.z();
            if (strZ == null) {
                dVar.E(20);
            } else {
                dVar.i0(20, strZ);
            }
            String strW = uVar.w();
            if (strW == null) {
                dVar.E(21);
            } else {
                dVar.i0(21, strW);
            }
            if (uVar.y() == null) {
                dVar.E(22);
            } else {
                dVar.B(22, r0.intValue());
            }
            String strA = uVar.A();
            if (strA == null) {
                dVar.E(23);
            } else {
                dVar.i0(23, strA);
            }
            String strX = uVar.x();
            if (strX == null) {
                dVar.E(24);
            } else {
                dVar.i0(24, strX);
            }
            String strK = uVar.k();
            if (strK == null) {
                dVar.E(25);
            } else {
                dVar.i0(25, strK);
            }
            dVar.B(26, uVar.P() ? 1L : 0L);
            Long L = uVar.L();
            if (L == null) {
                dVar.E(27);
            } else {
                dVar.B(27, L.longValue());
            }
            Long lN = uVar.n();
            if (lN == null) {
                dVar.E(28);
            } else {
                dVar.B(28, lN.longValue());
            }
            dVar.i0(29, uVar.h());
            String strI = uVar.I();
            if (strI == null) {
                dVar.E(30);
            } else {
                dVar.i0(30, strI);
            }
            String strG2 = uVar.G();
            if (strG2 == null) {
                dVar.E(31);
            } else {
                dVar.i0(31, strG2);
            }
            Long lC = uVar.c();
            if (lC == null) {
                dVar.E(32);
            } else {
                dVar.B(32, lC.longValue());
            }
            dVar.i0(33, b.this.f38791c.fromArrayList(uVar.i()));
            SessionLogProtocol sessionLogProtocolV = uVar.v();
            if (sessionLogProtocolV == null) {
                dVar.E(34);
            } else {
                dVar.i0(34, b.this.I(sessionLogProtocolV));
            }
            String strD2 = uVar.D();
            if (strD2 == null) {
                dVar.E(35);
            } else {
                dVar.i0(35, strD2);
            }
            String strB = uVar.B();
            if (strB == null) {
                dVar.E(36);
            } else {
                dVar.i0(36, strB);
            }
            dVar.i0(37, b.this.G(uVar.C()));
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.room.b$b, reason: collision with other inner class name */
    public static final class C0598b extends androidx.room.e {
        C0598b() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "DELETE FROM `last_connections` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, u uVar) {
            t.f(dVar, "statement");
            t.f(uVar, "entity");
            dVar.B(1, uVar.p());
        }
    }

    public static final class c extends androidx.room.e {
        c() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `last_connections` SET `id` = ?,`id_on_server` = ?,`title` = ?,`username` = ?,`host` = ?,`port` = ?,`connection_type` = ?,`connection_status` = ?,`error_message` = ?,`startup_snippet_expression` = ?,`color_scheme` = ?,`charset` = ?,`local_shell_path` = ?,`local_shell_argc` = ?,`host_os` = ?,`is_use_mosh` = ?,`mosh_server_command` = ?,`status` = ?,`device_id` = ?,`proxy_type` = ?,`proxy_host` = ?,`proxy_port` = ?,`proxy_username` = ?,`proxy_password` = ?,`env_variables` = ?,`is_shared` = ?,`encrypted_with` = ?,`host_local_id` = ?,`created_at` = ?,`updated_at` = ?,`timestamp` = ?,`actor_id` = ?,`custom_tags` = ?,`protocol` = ?,`session_log_filename` = ?,`session_log_file_secret_key` = ?,`session_log_file_status` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, u uVar) {
            t.f(dVar, "statement");
            t.f(uVar, "entity");
            dVar.B(1, uVar.p());
            dVar.B(2, uVar.q());
            String strH = uVar.H();
            if (strH == null) {
                dVar.E(3);
            } else {
                dVar.i0(3, strH);
            }
            String strJ = uVar.J();
            if (strJ == null) {
                dVar.E(4);
            } else {
                dVar.i0(4, strJ);
            }
            String strM = uVar.m();
            if (strM == null) {
                dVar.E(5);
            } else {
                dVar.i0(5, strM);
            }
            if (uVar.u() == null) {
                dVar.E(6);
            } else {
                dVar.B(6, r0.intValue());
            }
            String strG = uVar.g();
            if (strG == null) {
                dVar.E(7);
            } else {
                dVar.i0(7, strG);
            }
            dVar.B(8, uVar.f());
            String strL = uVar.l();
            if (strL == null) {
                dVar.E(9);
            } else {
                dVar.i0(9, strL);
            }
            String strE = uVar.E();
            if (strE == null) {
                dVar.E(10);
            } else {
                dVar.i0(10, strE);
            }
            String strE2 = uVar.e();
            if (strE2 == null) {
                dVar.E(11);
            } else {
                dVar.i0(11, strE2);
            }
            String strD = uVar.d();
            if (strD == null) {
                dVar.E(12);
            } else {
                dVar.i0(12, strD);
            }
            String strS = uVar.s();
            if (strS == null) {
                dVar.E(13);
            } else {
                dVar.i0(13, strS);
            }
            String strR = uVar.r();
            if (strR == null) {
                dVar.E(14);
            } else {
                dVar.i0(14, strR);
            }
            String strO = uVar.o();
            if (strO == null) {
                dVar.E(15);
            } else {
                dVar.i0(15, strO);
            }
            dVar.B(16, uVar.Q() ? 1L : 0L);
            String strT = uVar.t();
            if (strT == null) {
                dVar.E(17);
            } else {
                dVar.i0(17, strT);
            }
            dVar.B(18, uVar.F());
            Long lJ = uVar.j();
            if (lJ == null) {
                dVar.E(19);
            } else {
                dVar.B(19, lJ.longValue());
            }
            String strZ = uVar.z();
            if (strZ == null) {
                dVar.E(20);
            } else {
                dVar.i0(20, strZ);
            }
            String strW = uVar.w();
            if (strW == null) {
                dVar.E(21);
            } else {
                dVar.i0(21, strW);
            }
            if (uVar.y() == null) {
                dVar.E(22);
            } else {
                dVar.B(22, r0.intValue());
            }
            String strA = uVar.A();
            if (strA == null) {
                dVar.E(23);
            } else {
                dVar.i0(23, strA);
            }
            String strX = uVar.x();
            if (strX == null) {
                dVar.E(24);
            } else {
                dVar.i0(24, strX);
            }
            String strK = uVar.k();
            if (strK == null) {
                dVar.E(25);
            } else {
                dVar.i0(25, strK);
            }
            dVar.B(26, uVar.P() ? 1L : 0L);
            Long L = uVar.L();
            if (L == null) {
                dVar.E(27);
            } else {
                dVar.B(27, L.longValue());
            }
            Long lN = uVar.n();
            if (lN == null) {
                dVar.E(28);
            } else {
                dVar.B(28, lN.longValue());
            }
            dVar.i0(29, uVar.h());
            String strI = uVar.I();
            if (strI == null) {
                dVar.E(30);
            } else {
                dVar.i0(30, strI);
            }
            String strG2 = uVar.G();
            if (strG2 == null) {
                dVar.E(31);
            } else {
                dVar.i0(31, strG2);
            }
            Long lC = uVar.c();
            if (lC == null) {
                dVar.E(32);
            } else {
                dVar.B(32, lC.longValue());
            }
            dVar.i0(33, b.this.f38791c.fromArrayList(uVar.i()));
            SessionLogProtocol sessionLogProtocolV = uVar.v();
            if (sessionLogProtocolV == null) {
                dVar.E(34);
            } else {
                dVar.i0(34, b.this.I(sessionLogProtocolV));
            }
            String strD2 = uVar.D();
            if (strD2 == null) {
                dVar.E(35);
            } else {
                dVar.i0(35, strD2);
            }
            String strB = uVar.B();
            if (strB == null) {
                dVar.E(36);
            } else {
                dVar.i0(36, strB);
            }
            dVar.i0(37, b.this.G(uVar.C()));
            dVar.B(38, uVar.p());
        }
    }

    public static final class d {
        public /* synthetic */ d(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private d() {
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38797b;

        static {
            int[] iArr = new int[SessionLogProtocol.values().length];
            try {
                iArr[SessionLogProtocol.SSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionLogProtocol.TELNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionLogProtocol.MOSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionLogProtocol.QUICK_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SessionLogProtocol.LOCAL_TERMINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SessionLogProtocol.SERIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f38796a = iArr;
            int[] iArr2 = new int[SessionLogFileStatus.values().length];
            try {
                iArr2[SessionLogFileStatus.WRITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SessionLogFileStatus.READY_TO_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SessionLogFileStatus.UPLOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SessionLogFileStatus.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f38797b = iArr2;
        }
    }

    public b(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38791c = new Converters();
        this.f38789a = d0Var;
        this.f38790b = new a();
        this.f38792d = new C0598b();
        this.f38793e = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G(SessionLogFileStatus sessionLogFileStatus) {
        int i10 = e.f38797b[sessionLogFileStatus.ordinal()];
        if (i10 == 1) {
            return "WRITING";
        }
        if (i10 == 2) {
            return "READY_TO_UPLOAD";
        }
        if (i10 == 3) {
            return "UPLOADED";
        }
        if (i10 == 4) {
            return "NONE";
        }
        throw new s();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogFileStatus H(String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final String I(SessionLogProtocol sessionLogProtocol) {
        switch (e.f38796a[sessionLogProtocol.ordinal()]) {
            case 1:
                return "SSH";
            case 2:
                return "TELNET";
            case 3:
                return "MOSH";
            case 4:
                return "QUICK_CONNECTION";
            case 5:
                return "LOCAL_TERMINAL";
            case 6:
                return "SERIAL";
            default:
                throw new s();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogProtocol J(String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 N(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 O(b bVar, List list, p6.b bVar2) throws Exception {
        t.f(bVar2, "_connection");
        bVar.f38792d.d(bVar2, list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List P(String str, b bVar, p6.b bVar2) {
        int i10;
        int i11;
        Integer numValueOf;
        String strC2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        Integer numValueOf2;
        String strC22;
        int i17;
        int i18;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i19 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i20 = iD15;
                if (dVarH2.isNull(i20)) {
                    strC2 = null;
                    i13 = i19;
                    i12 = iD3;
                } else {
                    strC2 = dVarH2.c2(i20);
                    i12 = iD3;
                    i13 = i19;
                }
                int i21 = iD16;
                boolean z11 = true;
                if (((int) dVarH2.getLong(i21)) != 0) {
                    i14 = iD17;
                    z10 = true;
                } else {
                    i14 = iD17;
                    z10 = true;
                    z11 = false;
                }
                String strC213 = dVarH2.isNull(i14) ? null : dVarH2.c2(i14);
                int i22 = i14;
                int i23 = iD18;
                int i24 = (int) dVarH2.getLong(i23);
                int i25 = iD19;
                Long lValueOf = dVarH2.isNull(i25) ? null : Long.valueOf(dVarH2.getLong(i25));
                int i26 = iD20;
                String strC214 = dVarH2.isNull(i26) ? null : dVarH2.c2(i26);
                iD20 = i26;
                int i27 = iD21;
                String strC215 = dVarH2.isNull(i27) ? null : dVarH2.c2(i27);
                iD21 = i27;
                int i28 = iD22;
                if (dVarH2.isNull(i28)) {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = null;
                } else {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i28));
                }
                int i29 = iD23;
                String strC216 = dVarH2.isNull(i29) ? null : dVarH2.c2(i29);
                int i30 = iD24;
                String strC217 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                int i31 = iD25;
                if (dVarH2.isNull(i31)) {
                    strC22 = null;
                    iD25 = i31;
                    i18 = i29;
                    i17 = iD26;
                } else {
                    strC22 = dVarH2.c2(i31);
                    iD25 = i31;
                    i17 = iD26;
                    i18 = i29;
                }
                boolean z12 = ((int) dVarH2.getLong(i17)) != 0 ? z10 : false;
                int i32 = iD27;
                Long lValueOf2 = dVarH2.isNull(i32) ? null : Long.valueOf(dVarH2.getLong(i32));
                int i33 = iD28;
                Long lValueOf3 = dVarH2.isNull(i33) ? null : Long.valueOf(dVarH2.getLong(i33));
                int i34 = i17;
                int i35 = iD29;
                String strC218 = dVarH2.c2(i35);
                iD29 = i35;
                int i36 = iD30;
                String strC219 = dVarH2.isNull(i36) ? null : dVarH2.c2(i36);
                iD30 = i36;
                int i37 = iD31;
                String strC220 = dVarH2.isNull(i37) ? null : dVarH2.c2(i37);
                iD31 = i37;
                int i38 = iD32;
                Long lValueOf4 = dVarH2.isNull(i38) ? null : Long.valueOf(dVarH2.getLong(i38));
                iD32 = i38;
                iD27 = i32;
                int i39 = iD33;
                iD33 = i39;
                iD28 = i33;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i39));
                int i40 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i40) ? null : bVar.J(dVarH2.c2(i40));
                int i41 = iD35;
                String strC221 = dVarH2.isNull(i41) ? null : dVarH2.c2(i41);
                iD34 = i40;
                int i42 = iD36;
                String strC222 = dVarH2.isNull(i42) ? null : dVarH2.c2(i42);
                iD36 = i42;
                iD35 = i41;
                int i43 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i13, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z11, strC213, i24, lValueOf, strC214, strC215, numValueOf2, strC216, strC217, strC22, z12, lValueOf2, lValueOf3, strC218, strC219, strC220, lValueOf4, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i43))));
                iD3 = i12;
                iD15 = i20;
                iD37 = i43;
                iD18 = i16;
                iD19 = i15;
                iD22 = i28;
                iD23 = i18;
                iD24 = i30;
                iD = i10;
                iD2 = i11;
                iD16 = i21;
                iD26 = i34;
                iD17 = i22;
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q(String str, List list, int i10, List list2, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                dVarH2.B(i11, ((Number) it.next()).longValue());
                i11++;
            }
            int i12 = i10 + 1;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                dVarH2.B(i12, ((Number) it2.next()).longValue());
                i12++;
            }
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                arrayList.add(new tl.v(dVarH2.getLong(0), dVarH2.getLong(1)));
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u R(String str, long j10, b bVar, p6.b bVar2) {
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            u uVar = null;
            if (dVarH2.C2()) {
                uVar = new u(dVarH2.getLong(iD), dVarH2.getLong(iD2), dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3), dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4), dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5), dVarH2.isNull(iD6) ? null : Integer.valueOf((int) dVarH2.getLong(iD6)), dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7), (int) dVarH2.getLong(iD8), dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9), dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10), dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11), dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12), dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13), dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14), dVarH2.isNull(iD15) ? null : dVarH2.c2(iD15), ((int) dVarH2.getLong(iD16)) != 0, dVarH2.isNull(iD17) ? null : dVarH2.c2(iD17), (int) dVarH2.getLong(iD18), dVarH2.isNull(iD19) ? null : Long.valueOf(dVarH2.getLong(iD19)), dVarH2.isNull(iD20) ? null : dVarH2.c2(iD20), dVarH2.isNull(iD21) ? null : dVarH2.c2(iD21), dVarH2.isNull(iD22) ? null : Integer.valueOf((int) dVarH2.getLong(iD22)), dVarH2.isNull(iD23) ? null : dVarH2.c2(iD23), dVarH2.isNull(iD24) ? null : dVarH2.c2(iD24), dVarH2.isNull(iD25) ? null : dVarH2.c2(iD25), ((int) dVarH2.getLong(iD26)) != 0, dVarH2.isNull(iD27) ? null : Long.valueOf(dVarH2.getLong(iD27)), dVarH2.isNull(iD28) ? null : Long.valueOf(dVarH2.getLong(iD28)), dVarH2.c2(iD29), dVarH2.isNull(iD30) ? null : dVarH2.c2(iD30), dVarH2.isNull(iD31) ? null : dVarH2.c2(iD31), dVarH2.isNull(iD32) ? null : Long.valueOf(dVarH2.getLong(iD32)), bVar.f38791c.fromString(dVarH2.c2(iD33)), dVarH2.isNull(iD34) ? null : bVar.J(dVarH2.c2(iD34)), dVarH2.isNull(iD35) ? null : dVarH2.c2(iD35), dVarH2.isNull(iD36) ? null : dVarH2.c2(iD36), bVar.H(dVarH2.c2(iD37)));
            }
            return uVar;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u S(String str, long j10, b bVar, p6.b bVar2) {
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            u uVar = null;
            if (dVarH2.C2()) {
                uVar = new u(dVarH2.getLong(iD), dVarH2.getLong(iD2), dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3), dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4), dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5), dVarH2.isNull(iD6) ? null : Integer.valueOf((int) dVarH2.getLong(iD6)), dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7), (int) dVarH2.getLong(iD8), dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9), dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10), dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11), dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12), dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13), dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14), dVarH2.isNull(iD15) ? null : dVarH2.c2(iD15), ((int) dVarH2.getLong(iD16)) != 0, dVarH2.isNull(iD17) ? null : dVarH2.c2(iD17), (int) dVarH2.getLong(iD18), dVarH2.isNull(iD19) ? null : Long.valueOf(dVarH2.getLong(iD19)), dVarH2.isNull(iD20) ? null : dVarH2.c2(iD20), dVarH2.isNull(iD21) ? null : dVarH2.c2(iD21), dVarH2.isNull(iD22) ? null : Integer.valueOf((int) dVarH2.getLong(iD22)), dVarH2.isNull(iD23) ? null : dVarH2.c2(iD23), dVarH2.isNull(iD24) ? null : dVarH2.c2(iD24), dVarH2.isNull(iD25) ? null : dVarH2.c2(iD25), ((int) dVarH2.getLong(iD26)) != 0, dVarH2.isNull(iD27) ? null : Long.valueOf(dVarH2.getLong(iD27)), dVarH2.isNull(iD28) ? null : Long.valueOf(dVarH2.getLong(iD28)), dVarH2.c2(iD29), dVarH2.isNull(iD30) ? null : dVarH2.c2(iD30), dVarH2.isNull(iD31) ? null : dVarH2.c2(iD31), dVarH2.isNull(iD32) ? null : Long.valueOf(dVarH2.getLong(iD32)), bVar.f38791c.fromString(dVarH2.c2(iD33)), dVarH2.isNull(iD34) ? null : bVar.J(dVarH2.c2(iD34)), dVarH2.isNull(iD35) ? null : dVarH2.c2(iD35), dVarH2.isNull(iD36) ? null : dVarH2.c2(iD36), bVar.H(dVarH2.c2(iD37)));
            }
            return uVar;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long T(String str, long j10, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            Long lValueOf = null;
            if (dVarH2.C2() && !dVarH2.isNull(0)) {
                lValueOf = Long.valueOf(dVarH2.getLong(0));
            }
            return lValueOf;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U(String str, List list, b bVar, p6.b bVar2) {
        int i10;
        int i11;
        Integer numValueOf;
        String strC2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer numValueOf2;
        String strC22;
        int i18;
        int i19;
        Long lValueOf;
        int i20;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            Iterator it = list.iterator();
            int i21 = 1;
            while (it.hasNext()) {
                dVarH2.B(i21, ((Number) it.next()).longValue());
                i21++;
            }
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i10 = iD2;
                    i11 = iD3;
                    numValueOf = null;
                } else {
                    i10 = iD2;
                    i11 = iD3;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i22 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i23 = iD15;
                if (dVarH2.isNull(i23)) {
                    strC2 = null;
                    i12 = iD;
                    i15 = i22;
                    i13 = iD16;
                    i14 = iD14;
                } else {
                    strC2 = dVarH2.c2(i23);
                    i12 = iD;
                    i13 = iD16;
                    i14 = iD14;
                    i15 = i22;
                }
                boolean z10 = ((int) dVarH2.getLong(i13)) != 0;
                int i24 = iD17;
                String strC213 = dVarH2.isNull(i24) ? null : dVarH2.c2(i24);
                int i25 = iD18;
                int i26 = i13;
                int i27 = (int) dVarH2.getLong(i25);
                int i28 = iD19;
                Long lValueOf2 = dVarH2.isNull(i28) ? null : Long.valueOf(dVarH2.getLong(i28));
                int i29 = iD20;
                String strC214 = dVarH2.isNull(i29) ? null : dVarH2.c2(i29);
                iD20 = i29;
                int i30 = iD21;
                String strC215 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                iD21 = i30;
                int i31 = iD22;
                if (dVarH2.isNull(i31)) {
                    i16 = i28;
                    i17 = i25;
                    numValueOf2 = null;
                } else {
                    i16 = i28;
                    i17 = i25;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i31));
                }
                int i32 = iD23;
                String strC216 = dVarH2.isNull(i32) ? null : dVarH2.c2(i32);
                int i33 = iD24;
                String strC217 = dVarH2.isNull(i33) ? null : dVarH2.c2(i33);
                int i34 = iD25;
                if (dVarH2.isNull(i34)) {
                    strC22 = null;
                    iD25 = i34;
                    i19 = i32;
                    i18 = iD26;
                } else {
                    strC22 = dVarH2.c2(i34);
                    iD25 = i34;
                    i18 = iD26;
                    i19 = i32;
                }
                boolean z11 = ((int) dVarH2.getLong(i18)) != 0;
                int i35 = iD27;
                Long lValueOf3 = dVarH2.isNull(i35) ? null : Long.valueOf(dVarH2.getLong(i35));
                int i36 = iD28;
                Long lValueOf4 = dVarH2.isNull(i36) ? null : Long.valueOf(dVarH2.getLong(i36));
                int i37 = i18;
                int i38 = iD29;
                String strC218 = dVarH2.c2(i38);
                iD29 = i38;
                int i39 = iD30;
                String strC219 = dVarH2.isNull(i39) ? null : dVarH2.c2(i39);
                iD30 = i39;
                int i40 = iD31;
                String strC220 = dVarH2.isNull(i40) ? null : dVarH2.c2(i40);
                iD31 = i40;
                int i41 = iD32;
                if (dVarH2.isNull(i41)) {
                    lValueOf = null;
                    iD32 = i41;
                    iD27 = i35;
                    i20 = iD33;
                } else {
                    lValueOf = Long.valueOf(dVarH2.getLong(i41));
                    iD32 = i41;
                    i20 = iD33;
                    iD27 = i35;
                }
                iD33 = i20;
                iD28 = i36;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i20));
                int i42 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i42) ? null : bVar.J(dVarH2.c2(i42));
                int i43 = iD35;
                String strC221 = dVarH2.isNull(i43) ? null : dVarH2.c2(i43);
                iD34 = i42;
                int i44 = iD36;
                String strC222 = dVarH2.isNull(i44) ? null : dVarH2.c2(i44);
                iD36 = i44;
                iD35 = i43;
                int i45 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i15, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z10, strC213, i27, lValueOf2, strC214, strC215, numValueOf2, strC216, strC217, strC22, z11, lValueOf3, lValueOf4, strC218, strC219, strC220, lValueOf, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i45))));
                iD = i12;
                iD37 = i45;
                iD15 = i23;
                iD2 = i10;
                iD3 = i11;
                iD14 = i14;
                iD16 = i26;
                iD18 = i17;
                iD19 = i16;
                iD22 = i31;
                iD23 = i19;
                iD24 = i33;
                iD26 = i37;
                iD17 = i24;
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List V(String str, Long l10, b bVar, p6.b bVar2) {
        int i10;
        int i11;
        Integer numValueOf;
        String strC2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer numValueOf2;
        String strC22;
        int i17;
        int i18;
        Long lValueOf;
        int i19;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            if (l10 == null) {
                dVarH2.E(1);
            } else {
                dVarH2.B(1, l10.longValue());
            }
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i20 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i21 = iD15;
                if (dVarH2.isNull(i21)) {
                    strC2 = null;
                    i12 = iD14;
                    i14 = i20;
                    i13 = iD16;
                } else {
                    strC2 = dVarH2.c2(i21);
                    i12 = iD14;
                    i13 = iD16;
                    i14 = i20;
                }
                boolean z10 = ((int) dVarH2.getLong(i13)) != 0;
                int i22 = iD17;
                String strC213 = dVarH2.isNull(i22) ? null : dVarH2.c2(i22);
                int i23 = iD18;
                int i24 = i13;
                int i25 = (int) dVarH2.getLong(i23);
                int i26 = iD19;
                Long lValueOf2 = dVarH2.isNull(i26) ? null : Long.valueOf(dVarH2.getLong(i26));
                int i27 = iD20;
                String strC214 = dVarH2.isNull(i27) ? null : dVarH2.c2(i27);
                iD20 = i27;
                int i28 = iD21;
                String strC215 = dVarH2.isNull(i28) ? null : dVarH2.c2(i28);
                iD21 = i28;
                int i29 = iD22;
                if (dVarH2.isNull(i29)) {
                    i15 = i26;
                    i16 = i23;
                    numValueOf2 = null;
                } else {
                    i15 = i26;
                    i16 = i23;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i29));
                }
                int i30 = iD23;
                String strC216 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                int i31 = iD24;
                String strC217 = dVarH2.isNull(i31) ? null : dVarH2.c2(i31);
                int i32 = iD25;
                if (dVarH2.isNull(i32)) {
                    strC22 = null;
                    iD25 = i32;
                    i18 = i30;
                    i17 = iD26;
                } else {
                    strC22 = dVarH2.c2(i32);
                    iD25 = i32;
                    i17 = iD26;
                    i18 = i30;
                }
                boolean z11 = ((int) dVarH2.getLong(i17)) != 0;
                int i33 = iD27;
                Long lValueOf3 = dVarH2.isNull(i33) ? null : Long.valueOf(dVarH2.getLong(i33));
                int i34 = iD28;
                Long lValueOf4 = dVarH2.isNull(i34) ? null : Long.valueOf(dVarH2.getLong(i34));
                int i35 = i17;
                int i36 = iD29;
                String strC218 = dVarH2.c2(i36);
                iD29 = i36;
                int i37 = iD30;
                String strC219 = dVarH2.isNull(i37) ? null : dVarH2.c2(i37);
                iD30 = i37;
                int i38 = iD31;
                String strC220 = dVarH2.isNull(i38) ? null : dVarH2.c2(i38);
                iD31 = i38;
                int i39 = iD32;
                if (dVarH2.isNull(i39)) {
                    lValueOf = null;
                    iD32 = i39;
                    iD27 = i33;
                    i19 = iD33;
                } else {
                    lValueOf = Long.valueOf(dVarH2.getLong(i39));
                    iD32 = i39;
                    i19 = iD33;
                    iD27 = i33;
                }
                iD33 = i19;
                iD28 = i34;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i19));
                int i40 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i40) ? null : bVar.J(dVarH2.c2(i40));
                int i41 = iD35;
                String strC221 = dVarH2.isNull(i41) ? null : dVarH2.c2(i41);
                iD34 = i40;
                int i42 = iD36;
                String strC222 = dVarH2.isNull(i42) ? null : dVarH2.c2(i42);
                iD36 = i42;
                iD35 = i41;
                int i43 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i14, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z10, strC213, i25, lValueOf2, strC214, strC215, numValueOf2, strC216, strC217, strC22, z11, lValueOf3, lValueOf4, strC218, strC219, strC220, lValueOf, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i43))));
                iD14 = i12;
                iD15 = i21;
                iD37 = i43;
                iD16 = i24;
                iD18 = i16;
                iD19 = i15;
                iD22 = i29;
                iD23 = i18;
                iD24 = i31;
                iD = i10;
                iD2 = i11;
                iD26 = i35;
                iD17 = i22;
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(String str, b bVar, p6.b bVar2) {
        int i10;
        int i11;
        Integer numValueOf;
        String strC2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        Integer numValueOf2;
        String strC22;
        int i17;
        int i18;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i19 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i20 = iD15;
                if (dVarH2.isNull(i20)) {
                    strC2 = null;
                    i13 = i19;
                    i12 = iD3;
                } else {
                    strC2 = dVarH2.c2(i20);
                    i12 = iD3;
                    i13 = i19;
                }
                int i21 = iD16;
                boolean z11 = true;
                if (((int) dVarH2.getLong(i21)) != 0) {
                    i14 = iD17;
                    z10 = true;
                } else {
                    i14 = iD17;
                    z10 = true;
                    z11 = false;
                }
                String strC213 = dVarH2.isNull(i14) ? null : dVarH2.c2(i14);
                int i22 = i14;
                int i23 = iD18;
                int i24 = (int) dVarH2.getLong(i23);
                int i25 = iD19;
                Long lValueOf = dVarH2.isNull(i25) ? null : Long.valueOf(dVarH2.getLong(i25));
                int i26 = iD20;
                String strC214 = dVarH2.isNull(i26) ? null : dVarH2.c2(i26);
                iD20 = i26;
                int i27 = iD21;
                String strC215 = dVarH2.isNull(i27) ? null : dVarH2.c2(i27);
                iD21 = i27;
                int i28 = iD22;
                if (dVarH2.isNull(i28)) {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = null;
                } else {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i28));
                }
                int i29 = iD23;
                String strC216 = dVarH2.isNull(i29) ? null : dVarH2.c2(i29);
                int i30 = iD24;
                String strC217 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                int i31 = iD25;
                if (dVarH2.isNull(i31)) {
                    strC22 = null;
                    iD25 = i31;
                    i18 = i29;
                    i17 = iD26;
                } else {
                    strC22 = dVarH2.c2(i31);
                    iD25 = i31;
                    i17 = iD26;
                    i18 = i29;
                }
                boolean z12 = ((int) dVarH2.getLong(i17)) != 0 ? z10 : false;
                int i32 = iD27;
                Long lValueOf2 = dVarH2.isNull(i32) ? null : Long.valueOf(dVarH2.getLong(i32));
                int i33 = iD28;
                Long lValueOf3 = dVarH2.isNull(i33) ? null : Long.valueOf(dVarH2.getLong(i33));
                int i34 = i17;
                int i35 = iD29;
                String strC218 = dVarH2.c2(i35);
                iD29 = i35;
                int i36 = iD30;
                String strC219 = dVarH2.isNull(i36) ? null : dVarH2.c2(i36);
                iD30 = i36;
                int i37 = iD31;
                String strC220 = dVarH2.isNull(i37) ? null : dVarH2.c2(i37);
                iD31 = i37;
                int i38 = iD32;
                Long lValueOf4 = dVarH2.isNull(i38) ? null : Long.valueOf(dVarH2.getLong(i38));
                iD32 = i38;
                iD27 = i32;
                int i39 = iD33;
                iD33 = i39;
                iD28 = i33;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i39));
                int i40 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i40) ? null : bVar.J(dVarH2.c2(i40));
                int i41 = iD35;
                String strC221 = dVarH2.isNull(i41) ? null : dVarH2.c2(i41);
                iD34 = i40;
                int i42 = iD36;
                String strC222 = dVarH2.isNull(i42) ? null : dVarH2.c2(i42);
                iD36 = i42;
                iD35 = i41;
                int i43 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i13, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z11, strC213, i24, lValueOf, strC214, strC215, numValueOf2, strC216, strC217, strC22, z12, lValueOf2, lValueOf3, strC218, strC219, strC220, lValueOf4, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i43))));
                iD3 = i12;
                iD15 = i20;
                iD37 = i43;
                iD18 = i16;
                iD19 = i15;
                iD22 = i28;
                iD23 = i18;
                iD24 = i30;
                iD = i10;
                iD2 = i11;
                iD16 = i21;
                iD26 = i34;
                iD17 = i22;
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List X(String str, b bVar, p6.b bVar2) {
        int i10;
        int i11;
        Integer numValueOf;
        String strC2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        Integer numValueOf2;
        String strC22;
        int i17;
        int i18;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i19 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i20 = iD15;
                if (dVarH2.isNull(i20)) {
                    strC2 = null;
                    i13 = i19;
                    i12 = iD3;
                } else {
                    strC2 = dVarH2.c2(i20);
                    i12 = iD3;
                    i13 = i19;
                }
                int i21 = iD16;
                boolean z11 = true;
                if (((int) dVarH2.getLong(i21)) != 0) {
                    i14 = iD17;
                    z10 = true;
                } else {
                    i14 = iD17;
                    z10 = true;
                    z11 = false;
                }
                String strC213 = dVarH2.isNull(i14) ? null : dVarH2.c2(i14);
                int i22 = i14;
                int i23 = iD18;
                int i24 = (int) dVarH2.getLong(i23);
                int i25 = iD19;
                Long lValueOf = dVarH2.isNull(i25) ? null : Long.valueOf(dVarH2.getLong(i25));
                int i26 = iD20;
                String strC214 = dVarH2.isNull(i26) ? null : dVarH2.c2(i26);
                iD20 = i26;
                int i27 = iD21;
                String strC215 = dVarH2.isNull(i27) ? null : dVarH2.c2(i27);
                iD21 = i27;
                int i28 = iD22;
                if (dVarH2.isNull(i28)) {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = null;
                } else {
                    i15 = i25;
                    i16 = i23;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i28));
                }
                int i29 = iD23;
                String strC216 = dVarH2.isNull(i29) ? null : dVarH2.c2(i29);
                int i30 = iD24;
                String strC217 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                int i31 = iD25;
                if (dVarH2.isNull(i31)) {
                    strC22 = null;
                    iD25 = i31;
                    i18 = i29;
                    i17 = iD26;
                } else {
                    strC22 = dVarH2.c2(i31);
                    iD25 = i31;
                    i17 = iD26;
                    i18 = i29;
                }
                boolean z12 = ((int) dVarH2.getLong(i17)) != 0 ? z10 : false;
                int i32 = iD27;
                Long lValueOf2 = dVarH2.isNull(i32) ? null : Long.valueOf(dVarH2.getLong(i32));
                int i33 = iD28;
                Long lValueOf3 = dVarH2.isNull(i33) ? null : Long.valueOf(dVarH2.getLong(i33));
                int i34 = i17;
                int i35 = iD29;
                String strC218 = dVarH2.c2(i35);
                iD29 = i35;
                int i36 = iD30;
                String strC219 = dVarH2.isNull(i36) ? null : dVarH2.c2(i36);
                iD30 = i36;
                int i37 = iD31;
                String strC220 = dVarH2.isNull(i37) ? null : dVarH2.c2(i37);
                iD31 = i37;
                int i38 = iD32;
                Long lValueOf4 = dVarH2.isNull(i38) ? null : Long.valueOf(dVarH2.getLong(i38));
                iD32 = i38;
                iD27 = i32;
                int i39 = iD33;
                iD33 = i39;
                iD28 = i33;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i39));
                int i40 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i40) ? null : bVar.J(dVarH2.c2(i40));
                int i41 = iD35;
                String strC221 = dVarH2.isNull(i41) ? null : dVarH2.c2(i41);
                iD34 = i40;
                int i42 = iD36;
                String strC222 = dVarH2.isNull(i42) ? null : dVarH2.c2(i42);
                iD36 = i42;
                iD35 = i41;
                int i43 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i13, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z11, strC213, i24, lValueOf, strC214, strC215, numValueOf2, strC216, strC217, strC22, z12, lValueOf2, lValueOf3, strC218, strC219, strC220, lValueOf4, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i43))));
                iD3 = i12;
                iD15 = i20;
                iD37 = i43;
                iD18 = i16;
                iD19 = i15;
                iD22 = i28;
                iD23 = i18;
                iD24 = i30;
                iD = i10;
                iD2 = i11;
                iD16 = i21;
                iD26 = i34;
                iD17 = i22;
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Y(String str, int i10, b bVar, p6.b bVar2) {
        int i11;
        int i12;
        Integer numValueOf;
        String strC2;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer numValueOf2;
        String strC22;
        int i17;
        int i18;
        Long lValueOf;
        int i19;
        t.f(bVar2, "_connection");
        p6.d dVarH2 = bVar2.H2(str);
        try {
            dVarH2.B(1, i10);
            int iD = l.d(dVarH2, "id");
            int iD2 = l.d(dVarH2, Column.ID_ON_SERVER);
            int iD3 = l.d(dVarH2, "title");
            int iD4 = l.d(dVarH2, "username");
            int iD5 = l.d(dVarH2, "host");
            int iD6 = l.d(dVarH2, Column.PORT);
            int iD7 = l.d(dVarH2, SshOptions.EXTRA_CONNECTION_TYPE);
            int iD8 = l.d(dVarH2, "connection_status");
            int iD9 = l.d(dVarH2, "error_message");
            int iD10 = l.d(dVarH2, "startup_snippet_expression");
            int iD11 = l.d(dVarH2, "color_scheme");
            int iD12 = l.d(dVarH2, Column.CHARSET);
            int iD13 = l.d(dVarH2, Column.LOCAL_SHELL_PATH);
            int iD14 = l.d(dVarH2, Column.LOCAL_SHELL_ARGC);
            int iD15 = l.d(dVarH2, Column.OS_NAME);
            int iD16 = l.d(dVarH2, Column.IS_USE_MOSH);
            int iD17 = l.d(dVarH2, Column.MOSH_SERVER_COMMAND);
            int iD18 = l.d(dVarH2, Column.STATUS);
            int iD19 = l.d(dVarH2, Column.DEVICE_ID);
            int iD20 = l.d(dVarH2, Column.PROXY_TYPE);
            int iD21 = l.d(dVarH2, Column.PROXY_HOST);
            int iD22 = l.d(dVarH2, Column.PROXY_PORT);
            int iD23 = l.d(dVarH2, Column.PROXY_USERNAME);
            int iD24 = l.d(dVarH2, Column.PROXY_PASSWORD);
            int iD25 = l.d(dVarH2, Column.ENVIRONMENT_VARIABLES);
            int iD26 = l.d(dVarH2, Column.IS_SHARED);
            int iD27 = l.d(dVarH2, "encrypted_with");
            int iD28 = l.d(dVarH2, Column.HOST_LOCAL_ID);
            int iD29 = l.d(dVarH2, Column.CREATED_AT);
            int iD30 = l.d(dVarH2, "updated_at");
            int iD31 = l.d(dVarH2, "timestamp");
            int iD32 = l.d(dVarH2, "actor_id");
            int iD33 = l.d(dVarH2, "custom_tags");
            int iD34 = l.d(dVarH2, "protocol");
            int iD35 = l.d(dVarH2, "session_log_filename");
            int iD36 = l.d(dVarH2, "session_log_file_secret_key");
            int iD37 = l.d(dVarH2, "session_log_file_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                String strC23 = dVarH2.isNull(iD3) ? null : dVarH2.c2(iD3);
                String strC24 = dVarH2.isNull(iD4) ? null : dVarH2.c2(iD4);
                String strC25 = dVarH2.isNull(iD5) ? null : dVarH2.c2(iD5);
                if (dVarH2.isNull(iD6)) {
                    i11 = iD;
                    i12 = iD2;
                    numValueOf = null;
                } else {
                    i11 = iD;
                    i12 = iD2;
                    numValueOf = Integer.valueOf((int) dVarH2.getLong(iD6));
                }
                String strC26 = dVarH2.isNull(iD7) ? null : dVarH2.c2(iD7);
                int i20 = (int) dVarH2.getLong(iD8);
                String strC27 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                String strC28 = dVarH2.isNull(iD10) ? null : dVarH2.c2(iD10);
                String strC29 = dVarH2.isNull(iD11) ? null : dVarH2.c2(iD11);
                String strC210 = dVarH2.isNull(iD12) ? null : dVarH2.c2(iD12);
                String strC211 = dVarH2.isNull(iD13) ? null : dVarH2.c2(iD13);
                String strC212 = dVarH2.isNull(iD14) ? null : dVarH2.c2(iD14);
                int i21 = iD15;
                if (dVarH2.isNull(i21)) {
                    strC2 = null;
                    i14 = i20;
                    i13 = iD14;
                } else {
                    strC2 = dVarH2.c2(i21);
                    i13 = iD14;
                    i14 = i20;
                }
                int i22 = iD16;
                boolean z10 = ((int) dVarH2.getLong(i22)) != 0;
                int i23 = iD17;
                String strC213 = dVarH2.isNull(i23) ? null : dVarH2.c2(i23);
                int i24 = iD18;
                int i25 = (int) dVarH2.getLong(i24);
                int i26 = iD19;
                Long lValueOf2 = dVarH2.isNull(i26) ? null : Long.valueOf(dVarH2.getLong(i26));
                int i27 = iD20;
                String strC214 = dVarH2.isNull(i27) ? null : dVarH2.c2(i27);
                iD20 = i27;
                int i28 = iD21;
                String strC215 = dVarH2.isNull(i28) ? null : dVarH2.c2(i28);
                iD21 = i28;
                int i29 = iD22;
                if (dVarH2.isNull(i29)) {
                    i15 = i26;
                    i16 = i24;
                    numValueOf2 = null;
                } else {
                    i15 = i26;
                    i16 = i24;
                    numValueOf2 = Integer.valueOf((int) dVarH2.getLong(i29));
                }
                int i30 = iD23;
                String strC216 = dVarH2.isNull(i30) ? null : dVarH2.c2(i30);
                int i31 = iD24;
                String strC217 = dVarH2.isNull(i31) ? null : dVarH2.c2(i31);
                int i32 = iD25;
                if (dVarH2.isNull(i32)) {
                    strC22 = null;
                    iD25 = i32;
                    i18 = i30;
                    i17 = iD26;
                } else {
                    strC22 = dVarH2.c2(i32);
                    iD25 = i32;
                    i17 = iD26;
                    i18 = i30;
                }
                boolean z11 = ((int) dVarH2.getLong(i17)) != 0;
                int i33 = iD27;
                Long lValueOf3 = dVarH2.isNull(i33) ? null : Long.valueOf(dVarH2.getLong(i33));
                int i34 = iD28;
                Long lValueOf4 = dVarH2.isNull(i34) ? null : Long.valueOf(dVarH2.getLong(i34));
                int i35 = i17;
                int i36 = iD29;
                String strC218 = dVarH2.c2(i36);
                iD29 = i36;
                int i37 = iD30;
                String strC219 = dVarH2.isNull(i37) ? null : dVarH2.c2(i37);
                iD30 = i37;
                int i38 = iD31;
                String strC220 = dVarH2.isNull(i38) ? null : dVarH2.c2(i38);
                iD31 = i38;
                int i39 = iD32;
                if (dVarH2.isNull(i39)) {
                    lValueOf = null;
                    iD32 = i39;
                    iD27 = i33;
                    i19 = iD33;
                } else {
                    lValueOf = Long.valueOf(dVarH2.getLong(i39));
                    iD32 = i39;
                    i19 = iD33;
                    iD27 = i33;
                }
                iD33 = i19;
                iD28 = i34;
                List<String> listFromString = bVar.f38791c.fromString(dVarH2.c2(i19));
                int i40 = iD34;
                SessionLogProtocol sessionLogProtocolJ = dVarH2.isNull(i40) ? null : bVar.J(dVarH2.c2(i40));
                int i41 = iD35;
                String strC221 = dVarH2.isNull(i41) ? null : dVarH2.c2(i41);
                iD34 = i40;
                int i42 = iD36;
                String strC222 = dVarH2.isNull(i42) ? null : dVarH2.c2(i42);
                iD36 = i42;
                iD35 = i41;
                int i43 = iD37;
                arrayList.add(new u(j10, j11, strC23, strC24, strC25, numValueOf, strC26, i14, strC27, strC28, strC29, strC210, strC211, strC212, strC2, z10, strC213, i25, lValueOf2, strC214, strC215, numValueOf2, strC216, strC217, strC22, z11, lValueOf3, lValueOf4, strC218, strC219, strC220, lValueOf, listFromString, sessionLogProtocolJ, strC221, strC222, bVar.H(dVarH2.c2(i43))));
                iD14 = i13;
                iD15 = i21;
                iD37 = i43;
                iD16 = i22;
                iD18 = i16;
                iD19 = i15;
                iD22 = i29;
                iD23 = i18;
                iD24 = i31;
                iD = i11;
                iD2 = i12;
                iD26 = i35;
                iD17 = i23;
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Z(b bVar, u uVar, p6.b bVar2) {
        t.f(bVar2, "_connection");
        return bVar.f38790b.e(bVar2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a0(b bVar, List list, p6.b bVar2) {
        t.f(bVar2, "_connection");
        return bVar.f38790b.f(bVar2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0(b bVar, u uVar, p6.b bVar2) {
        t.f(bVar2, "_connection");
        return bVar.f38793e.c(bVar2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c0(b bVar, List list, p6.b bVar2) {
        t.f(bVar2, "_connection");
        return bVar.f38793e.d(bVar2, list);
    }

    @Override // tl.w
    public Object a(final Long l10, zt.e eVar) {
        final String str = "SELECT * FROM last_connections WHERE encrypted_with IS ?";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.j0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.V(str, l10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object b(zt.e eVar) {
        final String str = "SELECT * FROM last_connections WHERE status IN (1, 0)";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.g0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.W(str, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object c(final long j10, zt.e eVar) {
        final String str = "SELECT id_on_server FROM last_connections WHERE id = ? LIMIT 1";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.m0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.T(str, j10, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object d(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM last_connections WHERE id_on_server = ?";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.d0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.S(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object e(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM last_connections WHERE id_on_server IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.a0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.U(string, list, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object f(final List list, zt.e eVar) {
        return l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.b0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.b.c0(this.f79685a, list, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.w
    public Object g(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.i0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.O(this.f79734a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.w
    public Object h(zt.e eVar) {
        final String str = "DELETE FROM last_connections";
        Object objF = l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.y
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.N(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.w
    public Object i(final int i10, zt.e eVar) {
        final String str = "SELECT * FROM last_connections WHERE status = 1 ORDER BY created_at DESC LIMIT ?";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.k0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.Y(str, i10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object j(final List list, zt.e eVar) {
        return l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.z
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.a0(this.f79892a, list, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object k(final u uVar, zt.e eVar) {
        return l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.x
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Long.valueOf(com.server.auditor.ssh.client.room.b.Z(this.f79883a, uVar, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.w
    public zu.f l() {
        final String str = "SELECT * FROM last_connections WHERE status IN (1, 0)";
        return h6.j.a(this.f38789a, false, new String[]{"last_connections"}, new iu.l() { // from class: tl.f0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.X(str, this, (p6.b) obj);
            }
        });
    }

    @Override // tl.w
    public Object m(final u uVar, zt.e eVar) {
        return l6.b.f(this.f38789a, false, true, new iu.l() { // from class: tl.l0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.b.b0(this.f79759a, uVar, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.w
    public Object n(zt.e eVar) {
        final String str = "SELECT * FROM last_connections";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.h0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.P(str, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object o(final List list, final List list2, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT id, id_on_server FROM last_connections WHERE id IN (");
        final int size = list.size();
        p.a(sb2, size);
        sb2.append(") OR id_on_server IN (");
        p.a(sb2, list2.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.c0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.Q(string, list, size, list2, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.w
    public Object p(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM last_connections WHERE id = ?";
        return l6.b.f(this.f38789a, true, false, new iu.l() { // from class: tl.e0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.b.R(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }
}

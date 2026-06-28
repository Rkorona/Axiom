package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import com.server.auditor.ssh.client.ui.sessionlogs.data.SessionLogUploadStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import l6.p;
import tl.t0;
import tl.u0;
import tl.v0;
import ut.m0;
import ut.s;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f38826d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38827e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.e f38830c;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR REPLACE INTO `session_logs` (`last_connection_id`,`remote_id`,`size`,`checksum`,`disconnected_at`,`updated_at`,`upload_status`,`ip_address`,`location`,`bookmark_comment`,`bookmark_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, u0 u0Var) {
            t.f(dVar, "statement");
            t.f(u0Var, "entity");
            dVar.B(1, u0Var.g());
            dVar.B(2, u0Var.i());
            dVar.B(3, u0Var.j());
            dVar.i0(4, u0Var.d());
            dVar.i0(5, u0Var.e());
            dVar.i0(6, u0Var.k());
            dVar.i0(7, f.this.E(u0Var.l()));
            String strF = u0Var.f();
            if (strF == null) {
                dVar.E(8);
            } else {
                dVar.i0(8, strF);
            }
            String strH = u0Var.h();
            if (strH == null) {
                dVar.E(9);
            } else {
                dVar.i0(9, strH);
            }
            t0 t0VarC = u0Var.c();
            if (t0VarC != null) {
                dVar.i0(10, t0VarC.c());
                dVar.B(11, t0VarC.d());
            } else {
                dVar.E(10);
                dVar.E(11);
            }
        }
    }

    public static final class b extends androidx.room.e {
        b() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `session_logs` SET `last_connection_id` = ?,`remote_id` = ?,`size` = ?,`checksum` = ?,`disconnected_at` = ?,`updated_at` = ?,`upload_status` = ?,`ip_address` = ?,`location` = ?,`bookmark_comment` = ?,`bookmark_status` = ? WHERE `last_connection_id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, u0 u0Var) {
            t.f(dVar, "statement");
            t.f(u0Var, "entity");
            dVar.B(1, u0Var.g());
            dVar.B(2, u0Var.i());
            dVar.B(3, u0Var.j());
            dVar.i0(4, u0Var.d());
            dVar.i0(5, u0Var.e());
            dVar.i0(6, u0Var.k());
            dVar.i0(7, f.this.E(u0Var.l()));
            String strF = u0Var.f();
            if (strF == null) {
                dVar.E(8);
            } else {
                dVar.i0(8, strF);
            }
            String strH = u0Var.h();
            if (strH == null) {
                dVar.E(9);
            } else {
                dVar.i0(9, strH);
            }
            t0 t0VarC = u0Var.c();
            if (t0VarC != null) {
                dVar.i0(10, t0VarC.c());
                dVar.B(11, t0VarC.d());
            } else {
                dVar.E(10);
                dVar.E(11);
            }
            dVar.B(12, u0Var.g());
        }
    }

    public static final class c {
        public /* synthetic */ c(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private c() {
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38833a;

        static {
            int[] iArr = new int[SessionLogUploadStatus.values().length];
            try {
                iArr[SessionLogUploadStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionLogUploadStatus.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionLogUploadStatus.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionLogUploadStatus.ABORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SessionLogUploadStatus.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38833a = iArr;
        }
    }

    public f(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38828a = d0Var;
        this.f38829b = new a();
        this.f38830c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(SessionLogUploadStatus sessionLogUploadStatus) {
        int i10 = d.f38833a[sessionLogUploadStatus.ordinal()];
        if (i10 == 1) {
            return "COMPLETED";
        }
        if (i10 == 2) {
            return "CREATED";
        }
        if (i10 == 3) {
            return "REJECTED";
        }
        if (i10 == 4) {
            return "ABORTED";
        }
        if (i10 == 5) {
            return "UNKNOWN";
        }
        throw new s();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SessionLogUploadStatus F(String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 H(String str, p6.b bVar) {
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
    public static final int I(String str, long j10, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            dVarH2.C2();
            return l6.k.b(bVar);
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 J(String str, List list, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                dVarH2.B(i10, ((Number) it.next()).longValue());
                i10++;
            }
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(String str, List list, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                dVarH2.B(i10, ((Number) it.next()).longValue());
                i10++;
            }
            dVarH2.C2();
            int iB = l6.k.b(bVar);
            dVarH2.close();
            return iB;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(String str, List list, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                dVarH2.B(i10, ((Number) it.next()).longValue());
                i10++;
            }
            dVarH2.C2();
            int iB = l6.k.b(bVar);
            dVarH2.close();
            return iB;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M(String str, f fVar, p6.b bVar) {
        int i10;
        int i11;
        int i12;
        t0 t0Var;
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, "last_connection_id");
            int iD2 = l.d(dVarH2, "remote_id");
            int iD3 = l.d(dVarH2, "size");
            int iD4 = l.d(dVarH2, "checksum");
            int iD5 = l.d(dVarH2, "disconnected_at");
            int iD6 = l.d(dVarH2, "updated_at");
            int iD7 = l.d(dVarH2, "upload_status");
            int iD8 = l.d(dVarH2, "ip_address");
            int iD9 = l.d(dVarH2, "location");
            int iD10 = l.d(dVarH2, "bookmark_comment");
            int iD11 = l.d(dVarH2, "bookmark_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                long j12 = dVarH2.getLong(iD3);
                String strC2 = dVarH2.c2(iD4);
                String strC22 = dVarH2.c2(iD5);
                String strC23 = dVarH2.c2(iD6);
                SessionLogUploadStatus sessionLogUploadStatusF = fVar.F(dVarH2.c2(iD7));
                String strC24 = dVarH2.isNull(iD8) ? null : dVarH2.c2(iD8);
                String strC25 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                if (dVarH2.isNull(iD10) && dVarH2.isNull(iD11)) {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = new t0(dVarH2.c2(iD10), (int) dVarH2.getLong(iD11));
                }
                arrayList.add(new u0(j10, j11, j12, strC2, strC22, strC23, sessionLogUploadStatusF, strC24, strC25, t0Var));
                iD = i10;
                iD2 = i11;
                iD3 = i12;
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N(String str, f fVar, p6.b bVar) {
        int i10;
        int i11;
        int i12;
        t0 t0Var;
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, "last_connection_id");
            int iD2 = l.d(dVarH2, "remote_id");
            int iD3 = l.d(dVarH2, "size");
            int iD4 = l.d(dVarH2, "checksum");
            int iD5 = l.d(dVarH2, "disconnected_at");
            int iD6 = l.d(dVarH2, "updated_at");
            int iD7 = l.d(dVarH2, "upload_status");
            int iD8 = l.d(dVarH2, "ip_address");
            int iD9 = l.d(dVarH2, "location");
            int iD10 = l.d(dVarH2, "bookmark_comment");
            int iD11 = l.d(dVarH2, "bookmark_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                long j12 = dVarH2.getLong(iD3);
                String strC2 = dVarH2.c2(iD4);
                String strC22 = dVarH2.c2(iD5);
                String strC23 = dVarH2.c2(iD6);
                SessionLogUploadStatus sessionLogUploadStatusF = fVar.F(dVarH2.c2(iD7));
                String strC24 = dVarH2.isNull(iD8) ? null : dVarH2.c2(iD8);
                String strC25 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                if (dVarH2.isNull(iD10) && dVarH2.isNull(iD11)) {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = new t0(dVarH2.c2(iD10), (int) dVarH2.getLong(iD11));
                }
                arrayList.add(new u0(j10, j11, j12, strC2, strC22, strC23, sessionLogUploadStatusF, strC24, strC25, t0Var));
                iD = i10;
                iD2 = i11;
                iD3 = i12;
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List O(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                arrayList.add(Long.valueOf(dVarH2.getLong(0)));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0 P(String str, long j10, f fVar, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, "last_connection_id");
            int iD2 = l.d(dVarH2, "remote_id");
            int iD3 = l.d(dVarH2, "size");
            int iD4 = l.d(dVarH2, "checksum");
            int iD5 = l.d(dVarH2, "disconnected_at");
            int iD6 = l.d(dVarH2, "updated_at");
            int iD7 = l.d(dVarH2, "upload_status");
            int iD8 = l.d(dVarH2, "ip_address");
            int iD9 = l.d(dVarH2, "location");
            int iD10 = l.d(dVarH2, "bookmark_comment");
            int iD11 = l.d(dVarH2, "bookmark_status");
            u0 u0Var = null;
            if (dVarH2.C2()) {
                u0Var = new u0(dVarH2.getLong(iD), dVarH2.getLong(iD2), dVarH2.getLong(iD3), dVarH2.c2(iD4), dVarH2.c2(iD5), dVarH2.c2(iD6), fVar.F(dVarH2.c2(iD7)), dVarH2.isNull(iD8) ? null : dVarH2.c2(iD8), dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9), (dVarH2.isNull(iD10) && dVarH2.isNull(iD11)) ? null : new t0(dVarH2.c2(iD10), (int) dVarH2.getLong(iD11)));
            }
            dVarH2.close();
            return u0Var;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0 Q(String str, long j10, f fVar, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, "last_connection_id");
            int iD2 = l.d(dVarH2, "remote_id");
            int iD3 = l.d(dVarH2, "size");
            int iD4 = l.d(dVarH2, "checksum");
            int iD5 = l.d(dVarH2, "disconnected_at");
            int iD6 = l.d(dVarH2, "updated_at");
            int iD7 = l.d(dVarH2, "upload_status");
            int iD8 = l.d(dVarH2, "ip_address");
            int iD9 = l.d(dVarH2, "location");
            int iD10 = l.d(dVarH2, "bookmark_comment");
            int iD11 = l.d(dVarH2, "bookmark_status");
            u0 u0Var = null;
            if (dVarH2.C2()) {
                u0Var = new u0(dVarH2.getLong(iD), dVarH2.getLong(iD2), dVarH2.getLong(iD3), dVarH2.c2(iD4), dVarH2.c2(iD5), dVarH2.c2(iD6), fVar.F(dVarH2.c2(iD7)), dVarH2.isNull(iD8) ? null : dVarH2.c2(iD8), dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9), (dVarH2.isNull(iD10) && dVarH2.isNull(iD11)) ? null : new t0(dVarH2.c2(iD10), (int) dVarH2.getLong(iD11)));
            }
            dVarH2.close();
            return u0Var;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List R(String str, f fVar, p6.b bVar) {
        int i10;
        int i11;
        int i12;
        t0 t0Var;
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, "last_connection_id");
            int iD2 = l.d(dVarH2, "remote_id");
            int iD3 = l.d(dVarH2, "size");
            int iD4 = l.d(dVarH2, "checksum");
            int iD5 = l.d(dVarH2, "disconnected_at");
            int iD6 = l.d(dVarH2, "updated_at");
            int iD7 = l.d(dVarH2, "upload_status");
            int iD8 = l.d(dVarH2, "ip_address");
            int iD9 = l.d(dVarH2, "location");
            int iD10 = l.d(dVarH2, "bookmark_comment");
            int iD11 = l.d(dVarH2, "bookmark_status");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                long j11 = dVarH2.getLong(iD2);
                long j12 = dVarH2.getLong(iD3);
                String strC2 = dVarH2.c2(iD4);
                String strC22 = dVarH2.c2(iD5);
                String strC23 = dVarH2.c2(iD6);
                SessionLogUploadStatus sessionLogUploadStatusF = fVar.F(dVarH2.c2(iD7));
                String strC24 = dVarH2.isNull(iD8) ? null : dVarH2.c2(iD8);
                String strC25 = dVarH2.isNull(iD9) ? null : dVarH2.c2(iD9);
                if (dVarH2.isNull(iD10) && dVarH2.isNull(iD11)) {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = null;
                } else {
                    i10 = iD;
                    i11 = iD2;
                    i12 = iD3;
                    t0Var = new t0(dVarH2.c2(iD10), (int) dVarH2.getLong(iD11));
                }
                arrayList.add(new u0(j10, j11, j12, strC2, strC22, strC23, sessionLogUploadStatusF, strC24, strC25, t0Var));
                iD = i10;
                iD2 = i11;
                iD3 = i12;
            }
            dVarH2.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long S(f fVar, u0 u0Var, p6.b bVar) {
        t.f(bVar, "_connection");
        return fVar.f38829b.e(bVar, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 T(f fVar, List list, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        fVar.f38829b.c(bVar, list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(f fVar, u0 u0Var, p6.b bVar) {
        t.f(bVar, "_connection");
        return fVar.f38830c.c(bVar, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 V(String str, String str2, int i10, long j10, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.i0(1, str2);
            dVarH2.B(2, i10);
            dVarH2.B(3, j10);
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    @Override // tl.v0
    public Object a(final u0 u0Var, zt.e eVar) {
        return l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.h1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.f.U(this.f79730a, u0Var, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object b(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM session_logs WHERE last_connection_id = ?";
        return l6.b.f(this.f38828a, true, false, new iu.l() { // from class: tl.f1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.P(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object c(zt.e eVar) {
        final String str = "SELECT remote_id FROM session_logs WHERE bookmark_status == 2";
        return l6.b.f(this.f38828a, true, false, new iu.l() { // from class: tl.a1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.O(str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object d(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        sb2.append("        UPDATE session_logs");
        sb2.append("\n");
        sb2.append("        SET bookmark_comment = NULL, bookmark_status = NULL");
        sb2.append("\n");
        sb2.append("        WHERE remote_id IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        sb2.append("\n");
        sb2.append("        ");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        Object objF = l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.y0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.J(string, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.v0
    public Object e(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM session_logs WHERE remote_id IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        return l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.j1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.f.L(string, list, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object f(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM session_logs WHERE last_connection_id IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        return l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.c1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.f.K(string, list, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object g(zt.e eVar) {
        final String str = "DELETE FROM session_logs";
        Object objF = l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.e1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.H(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.v0
    public Object h(zt.e eVar) {
        final String str = "SELECT * FROM session_logs WHERE bookmark_status == 1";
        return l6.b.f(this.f38828a, true, false, new iu.l() { // from class: tl.x0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.R(str, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.v0
    public zu.f i() {
        final String str = "SELECT * FROM session_logs";
        return h6.j.a(this.f38828a, false, new String[]{"session_logs"}, new iu.l() { // from class: tl.k1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.N(str, this, (p6.b) obj);
            }
        });
    }

    @Override // tl.v0
    public Object j(final long j10, final String str, final int i10, zt.e eVar) {
        final String str2 = "\n        UPDATE session_logs\n        SET\n            bookmark_comment = ?,\n            bookmark_status = ?\n        WHERE last_connection_id = ?\n        ";
        Object objF = l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.i1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.V(str2, str, i10, j10, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.v0
    public Object k(zt.e eVar) {
        final String str = "SELECT * FROM session_logs";
        return l6.b.f(this.f38828a, true, false, new iu.l() { // from class: tl.w0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.M(str, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object l(final u0 u0Var, zt.e eVar) {
        return l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.g1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Long.valueOf(com.server.auditor.ssh.client.room.f.S(this.f79723a, u0Var, (p6.b) obj));
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object m(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.z0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.T(this.f79894a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.v0
    public Object n(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM session_logs WHERE remote_id = ?";
        return l6.b.f(this.f38828a, true, false, new iu.l() { // from class: tl.b1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.f.Q(str, j10, this, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.v0
    public Object o(final long j10, zt.e eVar) {
        final String str = "DELETE FROM session_logs WHERE last_connection_id = ?";
        return l6.b.f(this.f38828a, false, true, new iu.l() { // from class: tl.d1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(com.server.auditor.ssh.client.room.f.I(str, j10, (p6.b) obj));
            }
        }, eVar);
    }
}

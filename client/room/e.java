package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import com.server.auditor.ssh.client.room.d;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import tl.r0;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.server.auditor.ssh.client.room.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f38820e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38821f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.e f38824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.e f38825d;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR ABORT INTO `session_log_analytics` (`id`,`connection_uuid`,`size`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, r0 r0Var) {
            t.f(dVar, "statement");
            t.f(r0Var, "entity");
            dVar.B(1, r0Var.b());
            dVar.i0(2, r0Var.a());
            dVar.B(3, r0Var.c());
        }
    }

    public static final class b extends androidx.room.e {
        b() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "DELETE FROM `session_log_analytics` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, r0 r0Var) {
            t.f(dVar, "statement");
            t.f(r0Var, "entity");
            dVar.B(1, r0Var.b());
        }
    }

    public static final class c extends androidx.room.e {
        c() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `session_log_analytics` SET `id` = ?,`connection_uuid` = ?,`size` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, r0 r0Var) {
            t.f(dVar, "statement");
            t.f(r0Var, "entity");
            dVar.B(1, r0Var.b());
            dVar.i0(2, r0Var.a());
            dVar.B(3, r0Var.c());
            dVar.B(4, r0Var.b());
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

    public e(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38822a = d0Var;
        this.f38823b = new a();
        this.f38824c = new b();
        this.f38825d = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 j(String str, String str2, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.i0(1, str2);
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k(String str, String str2, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.i0(1, str2);
            return dVarH2.C2() ? new r0(dVarH2.getLong(l.d(dVarH2, "id")), dVarH2.c2(l.d(dVarH2, "connection_uuid")), dVarH2.getLong(l.d(dVarH2, "size"))) : null;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 l(e eVar, r0 r0Var, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        eVar.f38823b.d(bVar, r0Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 m(String str, long j10, String str2, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            dVarH2.i0(2, str2);
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    @Override // com.server.auditor.ssh.client.room.d
    public Object a(final String str, zt.e eVar) {
        final String str2 = "DELETE FROM session_log_analytics WHERE connection_uuid = ?";
        Object objF = l6.b.f(this.f38822a, false, true, new iu.l() { // from class: tl.q0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.e.j(str2, str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.room.d
    public Object b(final String str, final long j10, zt.e eVar) {
        final String str2 = "UPDATE session_log_analytics SET size = ? WHERE connection_uuid = ?";
        Object objF = l6.b.f(this.f38822a, false, true, new iu.l() { // from class: tl.o0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.e.m(str2, j10, str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.room.d
    public Object c(final String str, zt.e eVar) {
        final String str2 = "SELECT * FROM session_log_analytics WHERE connection_uuid = ?";
        return l6.b.f(this.f38822a, true, false, new iu.l() { // from class: tl.p0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.e.k(str2, str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // com.server.auditor.ssh.client.room.d
    public Object d(final r0 r0Var, zt.e eVar) {
        Object objF = l6.b.f(this.f38822a, false, true, new iu.l() { // from class: tl.n0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.e.l(this.f79775a, r0Var, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.room.d
    public Object e(r0 r0Var, zt.e eVar) {
        return d.a.a(this, r0Var, eVar);
    }
}

package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import java.util.List;
import ju.k;
import l6.l;
import tl.o;
import tl.t;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f38780f = new e(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f38781g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.f f38784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.e f38785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.room.e f38786e;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.room.a$a, reason: collision with other inner class name */
    public static final class C0597a extends androidx.room.f {
        C0597a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR ABORT INTO `host_interaction` (`remote_host_id`,`last_interacted_at`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, t tVar) {
            ju.t.f(dVar, "statement");
            ju.t.f(tVar, "entity");
            dVar.B(1, tVar.b());
            dVar.i0(2, tVar.a());
        }
    }

    public static final class b extends androidx.room.f {
        b() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR REPLACE INTO `host_interaction` (`remote_host_id`,`last_interacted_at`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, t tVar) {
            ju.t.f(dVar, "statement");
            ju.t.f(tVar, "entity");
            dVar.B(1, tVar.b());
            dVar.i0(2, tVar.a());
        }
    }

    public static final class c extends androidx.room.e {
        c() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "DELETE FROM `host_interaction` WHERE `remote_host_id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, t tVar) {
            ju.t.f(dVar, "statement");
            ju.t.f(tVar, "entity");
            dVar.B(1, tVar.b());
        }
    }

    public static final class d extends androidx.room.e {
        d() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `host_interaction` SET `remote_host_id` = ?,`last_interacted_at` = ? WHERE `remote_host_id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, t tVar) {
            ju.t.f(dVar, "statement");
            ju.t.f(tVar, "entity");
            dVar.B(1, tVar.b());
            dVar.i0(2, tVar.a());
            dVar.B(3, tVar.b());
        }
    }

    public static final class e {
        public /* synthetic */ e(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private e() {
        }
    }

    public a(d0 d0Var) {
        ju.t.f(d0Var, "__db");
        this.f38782a = d0Var;
        this.f38783b = new C0597a();
        this.f38784c = new b();
        this.f38785d = new c();
        this.f38786e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 i(String str, long j10, p6.b bVar) {
        ju.t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            dVarH2.C2();
            dVarH2.close();
            return m0.f82633a;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t j(String str, long j10, p6.b bVar) {
        ju.t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            return dVarH2.C2() ? new t(dVarH2.getLong(l.d(dVarH2, "remote_host_id")), dVarH2.c2(l.d(dVarH2, "last_interacted_at"))) : null;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 k(a aVar, List list, p6.b bVar) throws Exception {
        ju.t.f(bVar, "_connection");
        aVar.f38784c.c(bVar, list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 l(String str, p6.b bVar) {
        ju.t.f(bVar, "_connection");
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

    @Override // tl.o
    public Object a(zt.e eVar) {
        final String str = "DELETE FROM host_interaction";
        Object objF = l6.b.f(this.f38782a, false, true, new iu.l() { // from class: tl.p
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.a.l(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.o
    public Object b(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM host_interaction WHERE remote_host_id = ?";
        return l6.b.f(this.f38782a, true, false, new iu.l() { // from class: tl.q
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.a.j(str, j10, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.o
    public Object c(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38782a, false, true, new iu.l() { // from class: tl.s
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.a.k(this.f79811a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.o
    public Object d(final long j10, zt.e eVar) {
        final String str = "DELETE FROM host_interaction WHERE remote_host_id = ?";
        Object objF = l6.b.f(this.f38782a, false, true, new iu.l() { // from class: tl.r
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.a.i(str, j10, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }
}

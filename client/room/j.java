package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import l6.p;
import so.l0;
import tl.m2;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements m2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f38852c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38853d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38855b;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR REPLACE INTO `vault_logs_settings` (`vault_remote_id`,`is_enabled`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, l0 l0Var) {
            t.f(dVar, "statement");
            t.f(l0Var, "entity");
            dVar.B(1, l0Var.a());
            dVar.B(2, l0Var.b() ? 1L : 0L);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final List a() {
            return v.o();
        }

        private b() {
        }
    }

    public j(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38854a = d0Var;
        this.f38855b = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 q(String str, long j10, p6.b bVar) {
        t.f(bVar, "_connection");
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
    public static final m0 r(String str, p6.b bVar) {
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
    public static final m0 s(String str, List list, p6.b bVar) {
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
    public static final l0 t(String str, long j10, p6.b bVar) {
        l0 l0Var;
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        boolean z10 = true;
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, "vault_remote_id");
            int iD2 = l.d(dVarH2, "is_enabled");
            if (dVarH2.C2()) {
                long j11 = dVarH2.getLong(iD);
                if (((int) dVarH2.getLong(iD2)) == 0) {
                    z10 = false;
                }
                l0Var = new l0(j11, z10);
            } else {
                l0Var = null;
            }
            return l0Var;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, "vault_remote_id");
            int iD2 = l.d(dVarH2, "is_enabled");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                arrayList.add(new l0(dVarH2.getLong(iD), ((int) dVarH2.getLong(iD2)) != 0));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List v(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, "vault_remote_id");
            int iD2 = l.d(dVarH2, "is_enabled");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                arrayList.add(new l0(dVarH2.getLong(iD), ((int) dVarH2.getLong(iD2)) != 0));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 w(j jVar, l0 l0Var, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        jVar.f38855b.d(bVar, l0Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 x(j jVar, List list, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        jVar.f38855b.c(bVar, list);
        return m0.f82633a;
    }

    @Override // tl.m2
    public Object a(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM vault_logs_settings WHERE vault_remote_id = ? LIMIT 1";
        return l6.b.f(this.f38854a, true, false, new iu.l() { // from class: tl.n2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.t(str, j10, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.m2
    public Object b(zt.e eVar) {
        final String str = "SELECT * FROM vault_logs_settings";
        return l6.b.f(this.f38854a, true, false, new iu.l() { // from class: tl.q2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.u(str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.m2
    public Object c(zt.e eVar) {
        final String str = "DELETE FROM vault_logs_settings";
        Object objF = l6.b.f(this.f38854a, false, true, new iu.l() { // from class: tl.o2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.r(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.m2
    public zu.f d() {
        final String str = "SELECT * FROM vault_logs_settings";
        return h6.j.a(this.f38854a, false, new String[]{"vault_logs_settings"}, new iu.l() { // from class: tl.r2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.v(str, (p6.b) obj);
            }
        });
    }

    @Override // tl.m2
    public Object e(final long j10, zt.e eVar) {
        final String str = "DELETE FROM vault_logs_settings WHERE vault_remote_id = ?";
        Object objF = l6.b.f(this.f38854a, false, true, new iu.l() { // from class: tl.u2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.q(str, j10, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.m2
    public Object f(final l0 l0Var, zt.e eVar) {
        Object objF = l6.b.f(this.f38854a, false, true, new iu.l() { // from class: tl.s2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.w(this.f79815a, l0Var, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.m2
    public Object g(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38854a, false, true, new iu.l() { // from class: tl.p2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.x(this.f79793a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.m2
    public Object h(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM vault_logs_settings WHERE vault_remote_id IN(");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        Object objF = l6.b.f(this.f38854a, false, true, new iu.l() { // from class: tl.t2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.j.s(string, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }
}

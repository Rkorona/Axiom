package com.server.auditor.ssh.client.room;

import androidx.room.d0;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBulkShareable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import l6.l;
import l6.p;
import tl.l2;
import tl.x1;
import ut.m0;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f38846e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38847f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f38848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.f f38849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.e f38850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.e f38851d;

    public static final class a extends androidx.room.f {
        a() {
        }

        @Override // androidx.room.f
        protected String b() {
            return "INSERT OR ABORT INTO `vaults` (`local_id`,`name`,`remote_id`,`original_key`,`role`,`is_default`,`is_checked`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, l2 l2Var) {
            t.f(dVar, "statement");
            t.f(l2Var, "entity");
            dVar.B(1, l2Var.c());
            dVar.i0(2, l2Var.d());
            dVar.B(3, l2Var.e());
            Long lH = l2Var.h();
            if (lH == null) {
                dVar.E(4);
            } else {
                dVar.B(4, lH.longValue());
            }
            dVar.i0(5, l2Var.f());
            dVar.B(6, l2Var.j() ? 1L : 0L);
            dVar.B(7, l2Var.i() ? 1L : 0L);
        }
    }

    public static final class b extends androidx.room.e {
        b() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "DELETE FROM `vaults` WHERE `local_id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, l2 l2Var) {
            t.f(dVar, "statement");
            t.f(l2Var, "entity");
            dVar.B(1, l2Var.c());
        }
    }

    public static final class c extends androidx.room.e {
        c() {
        }

        @Override // androidx.room.e
        protected String b() {
            return "UPDATE OR ABORT `vaults` SET `local_id` = ?,`name` = ?,`remote_id` = ?,`original_key` = ?,`role` = ?,`is_default` = ?,`is_checked` = ? WHERE `local_id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(p6.d dVar, l2 l2Var) {
            t.f(dVar, "statement");
            t.f(l2Var, "entity");
            dVar.B(1, l2Var.c());
            dVar.i0(2, l2Var.d());
            dVar.B(3, l2Var.e());
            Long lH = l2Var.h();
            if (lH == null) {
                dVar.E(4);
            } else {
                dVar.B(4, lH.longValue());
            }
            dVar.i0(5, l2Var.f());
            dVar.B(6, l2Var.j() ? 1L : 0L);
            dVar.B(7, l2Var.i() ? 1L : 0L);
            dVar.B(8, l2Var.c());
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

    public i(d0 d0Var) {
        t.f(d0Var, "__db");
        this.f38848a = d0Var;
        this.f38849b = new a();
        this.f38850c = new b();
        this.f38851d = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 A(i iVar, l2 l2Var, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        iVar.f38850c.c(bVar, l2Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 B(String str, List list, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Long l10 = (Long) it.next();
                if (l10 == null) {
                    dVarH2.E(i10);
                } else {
                    dVarH2.B(i10, l10.longValue());
                }
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
    public static final List C(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                String strC2 = dVarH2.c2(iD2);
                long j11 = dVarH2.getLong(iD3);
                Long lValueOf = dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4));
                String strC22 = dVarH2.c2(iD5);
                boolean z10 = true;
                if (((int) dVarH2.getLong(iD6)) == 0) {
                    z10 = false;
                }
                arrayList.add(new l2(j10, strC2, j11, lValueOf, strC22, z10, ((int) dVarH2.getLong(iD7)) != 0));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                String strC2 = dVarH2.c2(iD2);
                long j11 = dVarH2.getLong(iD3);
                Long lValueOf = dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4));
                String strC22 = dVarH2.c2(iD5);
                boolean z10 = true;
                if (((int) dVarH2.getLong(iD6)) == 0) {
                    z10 = false;
                }
                arrayList.add(new l2(j10, strC2, j11, lValueOf, strC22, z10, ((int) dVarH2.getLong(iD7)) != 0));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            ArrayList arrayList = new ArrayList();
            while (dVarH2.C2()) {
                long j10 = dVarH2.getLong(iD);
                String strC2 = dVarH2.c2(iD2);
                long j11 = dVarH2.getLong(iD3);
                Long lValueOf = dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4));
                String strC22 = dVarH2.c2(iD5);
                boolean z10 = true;
                if (((int) dVarH2.getLong(iD6)) == 0) {
                    z10 = false;
                }
                arrayList.add(new l2(j10, strC2, j11, lValueOf, strC22, z10, ((int) dVarH2.getLong(iD7)) != 0));
            }
            return arrayList;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 F(String str, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            l2 l2Var = null;
            if (dVarH2.C2()) {
                l2Var = new l2(dVarH2.getLong(iD), dVarH2.c2(iD2), dVarH2.getLong(iD3), dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4)), dVarH2.c2(iD5), ((int) dVarH2.getLong(iD6)) != 0, ((int) dVarH2.getLong(iD7)) != 0);
            }
            return l2Var;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 G(String str, Long l10, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            if (l10 == null) {
                dVarH2.E(1);
            } else {
                dVarH2.B(1, l10.longValue());
            }
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            l2 l2Var = null;
            if (dVarH2.C2()) {
                l2Var = new l2(dVarH2.getLong(iD), dVarH2.c2(iD2), dVarH2.getLong(iD3), dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4)), dVarH2.c2(iD5), ((int) dVarH2.getLong(iD6)) != 0, ((int) dVarH2.getLong(iD7)) != 0);
            }
            dVarH2.close();
            return l2Var;
        } catch (Throwable th2) {
            dVarH2.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 H(String str, long j10, p6.b bVar) {
        t.f(bVar, "_connection");
        p6.d dVarH2 = bVar.H2(str);
        try {
            dVarH2.B(1, j10);
            int iD = l.d(dVarH2, CommonBulkShareable.LOCAL_ID_SERIAL_NAME);
            int iD2 = l.d(dVarH2, Column.MULTI_KEY_NAME);
            int iD3 = l.d(dVarH2, "remote_id");
            int iD4 = l.d(dVarH2, "original_key");
            int iD5 = l.d(dVarH2, "role");
            int iD6 = l.d(dVarH2, "is_default");
            int iD7 = l.d(dVarH2, "is_checked");
            l2 l2Var = null;
            if (dVarH2.C2()) {
                l2Var = new l2(dVarH2.getLong(iD), dVarH2.c2(iD2), dVarH2.getLong(iD3), dVarH2.isNull(iD4) ? null : Long.valueOf(dVarH2.getLong(iD4)), dVarH2.c2(iD5), ((int) dVarH2.getLong(iD6)) != 0, ((int) dVarH2.getLong(iD7)) != 0);
            }
            return l2Var;
        } finally {
            dVarH2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 I(i iVar, l2 l2Var, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        iVar.f38849b.d(bVar, l2Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 J(i iVar, List list, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        iVar.f38849b.c(bVar, list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 K(String str, p6.b bVar) {
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
    public static final m0 L(i iVar, l2 l2Var, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        iVar.f38851d.c(bVar, l2Var);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 M(i iVar, List list, p6.b bVar) throws Exception {
        t.f(bVar, "_connection");
        iVar.f38851d.d(bVar, list);
        return m0.f82633a;
    }

    @Override // tl.x1
    public zu.f a() {
        final String str = "SELECT * FROM vaults";
        return h6.j.a(this.f38848a, false, new String[]{"vaults"}, new iu.l() { // from class: tl.f2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.D(str, (p6.b) obj);
            }
        });
    }

    @Override // tl.x1
    public Object b(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.g2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.M(this.f79725a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object c(final List list, zt.e eVar) {
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.i2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.J(this.f79740a, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object d(final l2 l2Var, zt.e eVar) {
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.y1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.I(this.f79890a, l2Var, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object e(final List list, zt.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM vaults WHERE original_key IN (");
        p.a(sb2, list.size());
        sb2.append(")");
        final String string = sb2.toString();
        t.e(string, "toString(...)");
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.z1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.B(string, list, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object f(final l2 l2Var, zt.e eVar) {
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.j2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.L(this.f79748a, l2Var, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object g(final long j10, zt.e eVar) {
        final String str = "SELECT * FROM vaults WHERE remote_id = ?";
        return l6.b.f(this.f38848a, true, false, new iu.l() { // from class: tl.a2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.H(str, j10, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.x1
    public Object h(zt.e eVar) {
        final String str = "SELECT * FROM vaults WHERE is_default = 1";
        return l6.b.f(this.f38848a, true, false, new iu.l() { // from class: tl.e2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.F(str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.x1
    public Object i(zt.e eVar) {
        final String str = "SELECT * FROM vaults";
        return l6.b.f(this.f38848a, true, false, new iu.l() { // from class: tl.c2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.C(str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.x1
    public Object j(zt.e eVar) {
        final String str = "DELETE FROM vaults";
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.d2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.K(str, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object k(zt.e eVar) {
        final String str = "SELECT * FROM vaults WHERE is_checked = 1";
        return l6.b.f(this.f38848a, true, false, new iu.l() { // from class: tl.h2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.E(str, (p6.b) obj);
            }
        }, eVar);
    }

    @Override // tl.x1
    public Object l(final l2 l2Var, zt.e eVar) {
        Object objF = l6.b.f(this.f38848a, false, true, new iu.l() { // from class: tl.k2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.A(this.f79756a, l2Var, (p6.b) obj);
            }
        }, eVar);
        return objF == au.b.f() ? objF : m0.f82633a;
    }

    @Override // tl.x1
    public Object m(final Long l10, zt.e eVar) {
        final String str = "SELECT * FROM vaults WHERE original_key IS ?";
        return l6.b.f(this.f38848a, true, false, new iu.l() { // from class: tl.b2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return com.server.auditor.ssh.client.room.i.G(str, l10, (p6.b) obj);
            }
        }, eVar);
    }
}

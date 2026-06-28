package com.server.auditor.ssh.client.ui.sessionlogs.presentation;

import a1.f3;
import a1.gc;
import a1.lf;
import a1.vd;
import a1.w1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.c0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.i0;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q5;
import androidx.compose.runtime.w;
import androidx.compose.runtime.z3;
import androidx.compose.ui.node.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.i3;
import androidx.compose.ui.platform.s1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import b0.k0;
import c2.c3;
import co.g0;
import co.z;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginActivity;
import com.server.auditor.ssh.client.fragments.loginregistration.SignUpChooserScreenArgs;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.LogsStorageViewModel;
import com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen;
import e3.b3;
import e3.e;
import e3.n;
import e3.n2;
import e3.o;
import i3.x;
import i3.y;
import iu.p;
import iu.q;
import iu.r;
import java.util.List;
import ju.n0;
import ju.t;
import ju.u;
import s2.e0;
import so.j0;
import so.k;
import tp.x0;
import uo.m2;
import uo.t2;
import uo.v5;
import uo.y2;
import uo.z2;
import ut.m0;
import ut.n;
import ut.s;
import v1.m;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class LogsStorageScreen extends ComponentActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40649b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40650c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f40651a = new k1(n0.b(LogsStorageViewModel.class), new k(this), new j(this), new l(null, this));

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f40652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vd f40653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LogsStorageScreen f40654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z2 f40655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f40656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f40657f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ iu.a f40658u;

        static final class a implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.a f40659a;

            a(iu.a aVar) {
                this.f40659a = aVar;
            }

            public final void b(m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(2139441139, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.LogsStorageScreenContent.<anonymous>.<anonymous> (LogsStorageScreen.kt:130)");
                }
                y2.b(this.f40659a, null, mVar, 0, 2);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((m) obj, ((Number) obj2).intValue());
                return m0.f82633a;
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen$b$b, reason: collision with other inner class name */
        static final class C0642b implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ vd f40660a;

            C0642b(vd vdVar) {
                this.f40660a = vdVar;
            }

            public final void b(m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(1732417653, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.LogsStorageScreenContent.<anonymous>.<anonymous> (LogsStorageScreen.kt:135)");
                }
                co.w.e(this.f40660a, null, null, mVar, 0, 6);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((m) obj, ((Number) obj2).intValue());
                return m0.f82633a;
            }
        }

        static final class c implements q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ LogsStorageScreen f40661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z2 f40662b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.a f40663c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p f40664d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ iu.a f40665e;

            static final class a implements iu.l {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ p f40666a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ so.m0 f40667b;

                a(p pVar, so.m0 m0Var) {
                    this.f40666a = pVar;
                    this.f40667b = m0Var;
                }

                public final void b(boolean z10) {
                    this.f40666a.invoke(Long.valueOf(this.f40667b.e()), Boolean.valueOf(z10));
                }

                @Override // iu.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((Boolean) obj).booleanValue());
                    return m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen$b$c$b, reason: collision with other inner class name */
            public static final class C0643b implements iu.l {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ p f40668a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f40669b;

                public C0643b(p pVar, List list) {
                    this.f40668a = pVar;
                    this.f40669b = list;
                }

                public final Object b(int i10) {
                    return this.f40668a.invoke(Integer.valueOf(i10), this.f40669b.get(i10));
                }

                @Override // iu.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen$b$c$c, reason: collision with other inner class name */
            public static final class C0644c implements iu.l {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f40670a;

                public C0644c(List list) {
                    this.f40670a = list;
                }

                public final Object b(int i10) {
                    this.f40670a.get(i10);
                    return null;
                }

                @Override // iu.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            }

            public static final class d implements r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f40671a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ z2 f40672b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p f40673c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f40674d;

                public d(List list, z2 z2Var, p pVar, int i10) {
                    this.f40671a = list;
                    this.f40672b = z2Var;
                    this.f40673c = pVar;
                    this.f40674d = i10;
                }

                public final void b(b0.e eVar, int i10, m mVar, int i11) {
                    int i12;
                    if ((i11 & 6) == 0) {
                        i12 = i11 | (mVar.V(eVar) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        i12 |= mVar.c(i10) ? 32 : 16;
                    }
                    if (!mVar.p((i12 & 147) != 146, i12 & 1)) {
                        mVar.M();
                        return;
                    }
                    if (w.R()) {
                        w.b0(2039820996, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    so.m0 m0Var = (so.m0) this.f40671a.get(i10);
                    mVar.W(238514383);
                    m.a aVar = v1.m.f83247a;
                    e0 e0VarA = z.m.a(z.e.f87467a.h(), v1.e.f83199a.k(), mVar, 0);
                    int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                    i0 i0VarR = mVar.r();
                    v1.m mVarE = v1.k.e(mVar, aVar);
                    c.a aVar2 = androidx.compose.ui.node.c.f6166i;
                    iu.a aVarA = aVar2.a();
                    if (mVar.i() == null) {
                        androidx.compose.runtime.h.d();
                    }
                    mVar.I();
                    if (mVar.e()) {
                        mVar.u(aVarA);
                    } else {
                        mVar.s();
                    }
                    androidx.compose.runtime.m mVarB = q5.b(mVar);
                    q5.e(mVarB, e0VarA, aVar2.c());
                    q5.e(mVarB, i0VarR, aVar2.e());
                    p pVarB = aVar2.b();
                    if (mVarB.e() || !t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                        mVarB.t(Integer.valueOf(iHashCode));
                        mVarB.m(Integer.valueOf(iHashCode), pVarB);
                    }
                    q5.e(mVarB, mVarE, aVar2.d());
                    z.q qVar = z.q.f87592a;
                    boolean z10 = m0Var.c() && !m0Var.f();
                    boolean zF = m0Var.f();
                    String strD = m0Var.d();
                    boolean zG = this.f40672b.g();
                    boolean zG2 = m0Var.g();
                    mVar.W(-1633490746);
                    boolean zV = mVar.V(this.f40673c) | mVar.V(m0Var);
                    Object objD = mVar.D();
                    if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new a(this.f40673c, m0Var);
                        mVar.t(objD);
                    }
                    mVar.Q();
                    v5.b(z10, zF, strD, zG, zG2, (iu.l) objD, null, mVar, 0, 64);
                    boolean z11 = i10 != this.f40674d;
                    mVar.W(-1739948455);
                    if (z11) {
                        f3.c(null, 0.0f, lp.a.a(rk.b.F(), rk.b.l(), mVar, 0), mVar, 0, 3);
                    }
                    mVar.Q();
                    mVar.w();
                    mVar.Q();
                    if (w.R()) {
                        w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    b((b0.e) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return m0.f82633a;
                }
            }

            c(LogsStorageScreen logsStorageScreen, z2 z2Var, iu.a aVar, p pVar, iu.a aVar2) {
                this.f40661a = logsStorageScreen;
                this.f40662b = z2Var;
                this.f40663c = aVar;
                this.f40664d = pVar;
                this.f40665e = aVar2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 g(LogsStorageScreen logsStorageScreen, z2 z2Var, iu.a aVar, iu.a aVar2, p pVar, k0 k0Var) {
                t.f(k0Var, "$this$LazyColumn");
                logsStorageScreen.o0(k0Var, z2Var.e(), aVar);
                uo.i iVar = uo.i.f82208a;
                k0.b(k0Var, null, null, iVar.c(), 3, null);
                int iQ = v.q(z2Var.f());
                List listF = z2Var.f();
                k0Var.g(listF.size(), new C0643b(new p() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.f
                    @Override // iu.p
                    public final Object invoke(Object obj, Object obj2) {
                        return LogsStorageScreen.b.c.h(((Integer) obj).intValue(), (so.m0) obj2);
                    }
                }, listF), new C0644c(listF), q1.h.b(2039820996, true, new d(listF, z2Var, pVar, iQ)));
                k0.b(k0Var, null, null, iVar.a(), 3, null);
                if (z2Var.c()) {
                    logsStorageScreen.k0(k0Var, aVar2);
                }
                return m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object h(int i10, so.m0 m0Var) {
                t.f(m0Var, "item");
                return Long.valueOf(m0Var.e());
            }

            public final void e(z.n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
                int i11;
                t.f(n0Var, "innerPaddings");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar.V(n0Var) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(-512936066, i11, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.LogsStorageScreenContent.<anonymous>.<anonymous> (LogsStorageScreen.kt:143)");
                }
                m.a aVar = v1.m.f83247a;
                v1.m mVarL = c0.l(aVar, n0Var);
                final LogsStorageScreen logsStorageScreen = this.f40661a;
                final z2 z2Var = this.f40662b;
                final iu.a aVar2 = this.f40663c;
                final p pVar = this.f40664d;
                final iu.a aVar3 = this.f40665e;
                e0 e0VarA = z.m.a(z.e.f87467a.h(), v1.e.f83199a.k(), mVar, 0);
                int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                i0 i0VarR = mVar.r();
                v1.m mVarE = v1.k.e(mVar, mVarL);
                c.a aVar4 = androidx.compose.ui.node.c.f6166i;
                iu.a aVarA = aVar4.a();
                if (mVar.i() == null) {
                    androidx.compose.runtime.h.d();
                }
                mVar.I();
                if (mVar.e()) {
                    mVar.u(aVarA);
                } else {
                    mVar.s();
                }
                androidx.compose.runtime.m mVarB = q5.b(mVar);
                q5.e(mVarB, e0VarA, aVar4.c());
                q5.e(mVarB, i0VarR, aVar4.e());
                p pVarB = aVar4.b();
                if (mVarB.e() || !t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                    mVarB.t(Integer.valueOf(iHashCode));
                    mVarB.m(Integer.valueOf(iHashCode), pVarB);
                }
                q5.e(mVarB, mVarE, aVar4.d());
                z.q qVar = z.q.f87592a;
                z.n0 n0VarG = c0.g(q3.h.m(15), 0.0f, 2, null);
                mVar.W(-1224400529);
                boolean zF = mVar.F(logsStorageScreen) | mVar.F(z2Var) | mVar.V(aVar2) | mVar.V(pVar) | mVar.V(aVar3);
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.e
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return LogsStorageScreen.b.c.g(logsStorageScreen, z2Var, aVar2, aVar3, pVar, (k0) obj);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                b0.d.c(aVar, null, n0VarG, false, null, null, null, false, null, (iu.l) objD, mVar, 390, 506);
                mVar.w();
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e((z.n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return m0.f82633a;
            }
        }

        b(iu.a aVar, vd vdVar, LogsStorageScreen logsStorageScreen, z2 z2Var, iu.a aVar2, p pVar, iu.a aVar3) {
            this.f40652a = aVar;
            this.f40653b = vdVar;
            this.f40654c = logsStorageScreen;
            this.f40655d = z2Var;
            this.f40656e = aVar2;
            this.f40657f = pVar;
            this.f40658u = aVar3;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(1621154351, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.LogsStorageScreenContent.<anonymous> (LogsStorageScreen.kt:128)");
            }
            gc.f(v1.m.f83247a, q1.h.d(2139441139, true, new a(this.f40652a), mVar, 54), null, q1.h.d(1732417653, true, new C0642b(this.f40653b), mVar, 54), null, 0, qk.a.f74718a.a(mVar, 6).k(), w1.g(a1.q5.f1818a.a(mVar, a1.q5.f1819b).a(), mVar, 0), null, q1.h.d(-512936066, true, new c(this.f40654c, this.f40655d, this.f40656e, this.f40657f, this.f40658u), mVar, 54), mVar, 805309494, 308);
            if (w.R()) {
                w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    static final class c implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f40675a;

        c(iu.a aVar) {
            this.f40675a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(iu.a aVar, e3.n nVar) {
            t.f(nVar, "it");
            aVar.a();
        }

        public final void d(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
            t.f(eVar, "$this$item");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(-1946581809, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.needCustomRetentionPoliciesItem.<anonymous> (LogsStorageScreen.kt:226)");
            }
            mVar.W(1940624848);
            final iu.a aVar = this.f40675a;
            e.b bVar = new e.b(0, 1, null);
            bVar.i(z2.h.b(R.string.need_custom_retention_policies, mVar, 6));
            x0.a(bVar);
            mVar.W(1940630007);
            qk.a aVar2 = qk.a.f74718a;
            b3 b3Var = new b3(new n2(aVar2.a(mVar, 6).n(), 0L, (i3.c0) null, (x) null, (y) null, (i3.k) null, (String) null, 0L, (p3.a) null, (p3.q) null, (l3.e) null, 0L, p3.k.f69809b.d(), (c3) null, (e3.k0) null, (e2.g) null, 61438, (ju.k) null), null, null, null, 14, null);
            mVar.W(5004770);
            boolean zV = mVar.V(aVar);
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new o() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.g
                    @Override // e3.o
                    public final void a(e3.n nVar) {
                        LogsStorageScreen.c.e(aVar, nVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            int iO = bVar.o(new n.a("contact_us", b3Var, (o) objD));
            try {
                bVar.i(z2.h.b(R.string.contact_us_basta, mVar, 6));
                m0 m0Var = m0.f82633a;
                bVar.n(iO);
                mVar.Q();
                e3.e eVarR = bVar.r();
                mVar.Q();
                lf.k(eVarR, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2.b(mVar, 6).a(), mVar, 0, 0, 262142);
                if (w.R()) {
                    w.a0();
                }
            } catch (Throwable th2) {
                bVar.n(iO);
                throw th2;
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            d((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return m0.f82633a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vd f40677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LogsStorageScreen f40678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ so.k f40679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(vd vdVar, LogsStorageScreen logsStorageScreen, so.k kVar, zt.e eVar) {
            super(2, eVar);
            this.f40677b = vdVar;
            this.f40678c = logsStorageScreen;
            this.f40679d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f40677b, this.f40678c, this.f40679d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40676a;
            if (i10 == 0) {
                ut.x.b(obj);
                vd vdVar = this.f40677b;
                String string = this.f40678c.getString(R.string.couldnt_disable_logs_in_specifc_vault, ((k.a) this.f40679d).a());
                t.e(string, "getString(...)");
                this.f40676a = 1;
                if (vd.f(vdVar, string, null, true, null, this, 10, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vd f40681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LogsStorageScreen f40682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ so.k f40683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(vd vdVar, LogsStorageScreen logsStorageScreen, so.k kVar, zt.e eVar) {
            super(2, eVar);
            this.f40681b = vdVar;
            this.f40682c = logsStorageScreen;
            this.f40683d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f40681b, this.f40682c, this.f40683d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40680a;
            if (i10 == 0) {
                ut.x.b(obj);
                vd vdVar = this.f40681b;
                String string = this.f40682c.getString(R.string.couldnt_enable_logs_in_specific_vault, ((k.b) this.f40683d).a());
                t.e(string, "getString(...)");
                this.f40680a = 1;
                if (vd.f(vdVar, string, null, true, null, this, 10, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* synthetic */ class f extends ju.q implements iu.a {
        f(Object obj) {
            super(0, obj, LogsStorageViewModel.class, "onAuthenticationSuccess", "onAuthenticationSuccess()V", 0);
        }

        @Override // iu.a
        public /* bridge */ /* synthetic */ Object a() {
            l();
            return m0.f82633a;
        }

        public final void l() {
            ((LogsStorageViewModel) this.f62930b).onAuthenticationSuccess();
        }
    }

    /* synthetic */ class g extends ju.q implements iu.a {
        g(Object obj) {
            super(0, obj, LogsStorageViewModel.class, "onAuthenticationFailed", "onAuthenticationFailed()V", 0);
        }

        @Override // iu.a
        public /* bridge */ /* synthetic */ Object a() {
            l();
            return m0.f82633a;
        }

        public final void l() {
            ((LogsStorageViewModel) this.f62930b).onAuthenticationFailed();
        }
    }

    static final class h implements p {

        static final class a implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ LogsStorageScreen f40685a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen$h$a$a, reason: collision with other inner class name */
            static final class C0645a extends kotlin.coroutines.jvm.internal.m implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f40686a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ LogsStorageScreen f40687b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0645a(LogsStorageScreen logsStorageScreen, zt.e eVar) {
                    super(2, eVar);
                    this.f40687b = logsStorageScreen;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new C0645a(this.f40687b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    au.b.f();
                    if (this.f40686a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    this.f40687b.j0().onScreenOpened();
                    return m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((C0645a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
                }
            }

            /* synthetic */ class b extends ju.q implements iu.a {
                b(Object obj) {
                    super(0, obj, LogsStorageViewModel.class, "onBackPressed", "onBackPressed()V", 0);
                }

                @Override // iu.a
                public /* bridge */ /* synthetic */ Object a() {
                    l();
                    return m0.f82633a;
                }

                public final void l() {
                    ((LogsStorageViewModel) this.f62930b).onBackPressed();
                }
            }

            /* synthetic */ class c extends ju.q implements iu.a {
                c(Object obj) {
                    super(0, obj, LogsStorageViewModel.class, "onContactUsClick", "onContactUsClick()V", 0);
                }

                @Override // iu.a
                public /* bridge */ /* synthetic */ Object a() {
                    l();
                    return m0.f82633a;
                }

                public final void l() {
                    ((LogsStorageViewModel) this.f62930b).onContactUsClick();
                }
            }

            /* synthetic */ class d extends ju.q implements iu.a {
                d(Object obj) {
                    super(0, obj, LogsStorageViewModel.class, "onCreateAccountClick", "onCreateAccountClick()V", 0);
                }

                @Override // iu.a
                public /* bridge */ /* synthetic */ Object a() {
                    l();
                    return m0.f82633a;
                }

                public final void l() {
                    ((LogsStorageViewModel) this.f62930b).onCreateAccountClick();
                }
            }

            /* synthetic */ class e extends ju.q implements p {
                e(Object obj) {
                    super(2, obj, LogsStorageViewModel.class, "onVaultLogsSettingChange", "onVaultLogsSettingChange(JZ)V", 0);
                }

                @Override // iu.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    l(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                    return m0.f82633a;
                }

                public final void l(long j10, boolean z10) {
                    ((LogsStorageViewModel) this.f62930b).onVaultLogsSettingChange(j10, z10);
                }
            }

            /* synthetic */ class f extends ju.q implements iu.l {
                f(Object obj) {
                    super(1, obj, LogsStorageViewModel.class, "onConfirmDisablingLogs", "onConfirmDisablingLogs(J)V", 0);
                }

                @Override // iu.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    l(((Number) obj).longValue());
                    return m0.f82633a;
                }

                public final void l(long j10) {
                    ((LogsStorageViewModel) this.f62930b).onConfirmDisablingLogs(j10);
                }
            }

            /* synthetic */ class g extends ju.q implements iu.a {
                g(Object obj) {
                    super(0, obj, LogsStorageViewModel.class, "onCancelDisablingLogs", "onCancelDisablingLogs()V", 0);
                }

                @Override // iu.a
                public /* bridge */ /* synthetic */ Object a() {
                    l();
                    return m0.f82633a;
                }

                public final void l() {
                    ((LogsStorageViewModel) this.f62930b).onCancelDisablingLogs();
                }
            }

            a(LogsStorageScreen logsStorageScreen) {
                this.f40685a = logsStorageScreen;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 e(LogsStorageScreen logsStorageScreen) {
                logsStorageScreen.j0().onBackPressed();
                return m0.f82633a;
            }

            private static final z2 g(l5 l5Var) {
                return (z2) l5Var.getValue();
            }

            public final void d(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(1598352478, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.onCreate.<anonymous>.<anonymous> (LogsStorageScreen.kt:80)");
                }
                m0 m0Var = m0.f82633a;
                mVar.W(5004770);
                boolean zF = mVar.F(this.f40685a);
                LogsStorageScreen logsStorageScreen = this.f40685a;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new C0645a(logsStorageScreen, null);
                    mVar.t(objD);
                }
                mVar.Q();
                a1.e(m0Var, (p) objD, mVar, 6);
                mVar.W(1849434622);
                Object objD2 = mVar.D();
                m.a aVar = androidx.compose.runtime.m.f5359a;
                if (objD2 == aVar.a()) {
                    objD2 = new vd();
                    mVar.t(objD2);
                }
                vd vdVar = (vd) objD2;
                mVar.Q();
                this.f40685a.l0(vdVar, mVar, 6);
                mVar.W(5004770);
                boolean zF2 = mVar.F(this.f40685a);
                final LogsStorageScreen logsStorageScreen2 = this.f40685a;
                Object objD3 = mVar.D();
                if (zF2 || objD3 == aVar.a()) {
                    objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.h
                        @Override // iu.a
                        public final Object a() {
                            return LogsStorageScreen.h.a.e(logsStorageScreen2);
                        }
                    };
                    mVar.t(objD3);
                }
                mVar.Q();
                e.d.a(false, (iu.a) objD3, mVar, 0, 1);
                mVar.W(-1581548146);
                if (!g0.f(mVar, 0)) {
                    g0.c(this.f40685a, 0, mVar, 0, 1);
                }
                mVar.Q();
                l5 l5VarB = f5.a.b(this.f40685a.j0().getUiState(), null, null, null, mVar, 0, 7);
                LogsStorageScreen logsStorageScreen3 = this.f40685a;
                z2 z2VarG = g(l5VarB);
                LogsStorageViewModel logsStorageViewModelJ0 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF3 = mVar.F(logsStorageViewModelJ0);
                Object objD4 = mVar.D();
                if (zF3 || objD4 == aVar.a()) {
                    objD4 = new b(logsStorageViewModelJ0);
                    mVar.t(objD4);
                }
                mVar.Q();
                iu.a aVar2 = (iu.a) ((qu.f) objD4);
                LogsStorageViewModel logsStorageViewModelJ02 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF4 = mVar.F(logsStorageViewModelJ02);
                Object objD5 = mVar.D();
                if (zF4 || objD5 == aVar.a()) {
                    objD5 = new c(logsStorageViewModelJ02);
                    mVar.t(objD5);
                }
                mVar.Q();
                iu.a aVar3 = (iu.a) ((qu.f) objD5);
                LogsStorageViewModel logsStorageViewModelJ03 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF5 = mVar.F(logsStorageViewModelJ03);
                Object objD6 = mVar.D();
                if (zF5 || objD6 == aVar.a()) {
                    objD6 = new d(logsStorageViewModelJ03);
                    mVar.t(objD6);
                }
                mVar.Q();
                iu.a aVar4 = (iu.a) ((qu.f) objD6);
                LogsStorageViewModel logsStorageViewModelJ04 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF6 = mVar.F(logsStorageViewModelJ04);
                Object objD7 = mVar.D();
                if (zF6 || objD7 == aVar.a()) {
                    objD7 = new e(logsStorageViewModelJ04);
                    mVar.t(objD7);
                }
                mVar.Q();
                logsStorageScreen3.a0(z2VarG, vdVar, aVar2, aVar3, aVar4, (p) ((qu.f) objD7), mVar, z2.f82520f | 48);
                uo.n2 n2VarD = g(l5VarB).d();
                LogsStorageViewModel logsStorageViewModelJ05 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF7 = mVar.F(logsStorageViewModelJ05);
                Object objD8 = mVar.D();
                if (zF7 || objD8 == aVar.a()) {
                    objD8 = new f(logsStorageViewModelJ05);
                    mVar.t(objD8);
                }
                mVar.Q();
                iu.l lVar = (iu.l) ((qu.f) objD8);
                LogsStorageViewModel logsStorageViewModelJ06 = this.f40685a.j0();
                mVar.W(5004770);
                boolean zF8 = mVar.F(logsStorageViewModelJ06);
                Object objD9 = mVar.D();
                if (zF8 || objD9 == aVar.a()) {
                    objD9 = new g(logsStorageViewModelJ06);
                    mVar.t(objD9);
                }
                mVar.Q();
                m2.c(n2VarD, lVar, (iu.a) ((qu.f) objD9), mVar, 0);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return m0.f82633a;
            }
        }

        h() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(1430331354, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.onCreate.<anonymous> (LogsStorageScreen.kt:79)");
            }
            qk.d.d(false, q1.h.d(1598352478, true, new a(LogsStorageScreen.this), mVar, 54), mVar, 48, 1);
            if (w.R()) {
                w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    static final class i implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f40688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f40689b;

        i(j0 j0Var, iu.a aVar) {
            this.f40688a = j0Var;
            this.f40689b = aVar;
        }

        public final void b(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
            t.f(eVar, "$this$item");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(104634270, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.promotionItem.<anonymous> (LogsStorageScreen.kt:209)");
            }
            j0 j0Var = this.f40688a;
            if (!(j0Var instanceof j0.a)) {
                throw new s();
            }
            t2.b(((j0.a) j0Var).a(), this.f40689b, null, mVar, 0, 4);
            if (w.R()) {
                w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return m0.f82633a;
        }
    }

    public static final class j extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f40690a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f40690a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class k extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f40691a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f40691a.getViewModelStore();
        }
    }

    public static final class l extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f40692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f40692a = aVar;
            this.f40693b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f40692a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f40693b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(final z2 z2Var, final vd vdVar, final iu.a aVar, final iu.a aVar2, final iu.a aVar3, final p pVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        vd vdVar2;
        LogsStorageScreen logsStorageScreen;
        androidx.compose.runtime.m mVar2;
        androidx.compose.runtime.m mVarG = mVar.g(676147532);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? mVarG.V(z2Var) : mVarG.F(z2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            vdVar2 = vdVar;
            i11 |= mVarG.V(vdVar2) ? 32 : 16;
        } else {
            vdVar2 = vdVar;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= mVarG.F(aVar2) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i10 & 24576) == 0) {
            i11 |= mVarG.F(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= mVarG.F(pVar) ? 131072 : LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
        }
        if ((1572864 & i10) == 0) {
            logsStorageScreen = this;
            i11 |= mVarG.F(logsStorageScreen) ? 1048576 : 524288;
        } else {
            logsStorageScreen = this;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && mVarG.h()) {
            mVarG.M();
            mVar2 = mVarG;
        } else {
            if (w.R()) {
                w.b0(676147532, i12, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.LogsStorageScreenContent (LogsStorageScreen.kt:124)");
            }
            mVar2 = mVarG;
            z.d(0L, 0L, aVar, null, q1.h.d(1621154351, true, new b(aVar, vdVar2, logsStorageScreen, z2Var, aVar3, pVar, aVar2), mVarG, 54), mVar2, (i12 & 896) | 24576, 11);
            if (w.R()) {
                w.a0();
            }
        }
        z3 z3VarJ = mVar2.j();
        if (z3VarJ != null) {
            z3VarJ.a(new p() { // from class: uo.w2
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return LogsStorageScreen.b0(this.f82450a, z2Var, vdVar, aVar, aVar2, aVar3, pVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 b0(LogsStorageScreen logsStorageScreen, z2 z2Var, vd vdVar, iu.a aVar, iu.a aVar2, iu.a aVar3, p pVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        logsStorageScreen.a0(z2Var, vdVar, aVar, aVar2, aVar3, pVar, mVar, e3.a(i10 | 1));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogsStorageViewModel j0() {
        return (LogsStorageViewModel) this.f40651a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(k0 k0Var, iu.a aVar) {
        k0.b(k0Var, null, null, q1.h.b(-1946581809, true, new c(aVar)), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(final vd vdVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        Object obj;
        androidx.compose.runtime.m mVarG = mVar.g(1034020481);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.V(vdVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && mVarG.h()) {
            mVarG.M();
        } else {
            if (w.R()) {
                w.b0(1034020481, i11, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.LogsStorageScreen.observeScreenActions (LogsStorageScreen.kt:254)");
            }
            LogsStorageViewModel logsStorageViewModelJ0 = j0();
            mVarG.W(5004770);
            boolean zF = mVarG.F(logsStorageViewModelJ0);
            Object objD = mVarG.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new f(logsStorageViewModelJ0);
                mVarG.t(objD);
            }
            mVarG.Q();
            iu.a aVar = (iu.a) ((qu.f) objD);
            LogsStorageViewModel logsStorageViewModelJ02 = j0();
            mVarG.W(5004770);
            boolean zF2 = mVarG.F(logsStorageViewModelJ02);
            Object objD2 = mVarG.D();
            if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new g(logsStorageViewModelJ02);
                mVarG.t(objD2);
            }
            mVarG.Q();
            final e.i iVarB = th.q.b(aVar, (iu.a) ((qu.f) objD2), mVarG, 0);
            Object objD3 = mVarG.D();
            m.a aVar2 = androidx.compose.runtime.m.f5359a;
            if (objD3 == aVar2.a()) {
                objD3 = a1.k(zt.j.f88331a, mVarG);
                mVarG.t(objD3);
            }
            final wu.i0 i0Var = (wu.i0) objD3;
            final i3 i3Var = (i3) mVarG.n(s1.s());
            final Context context = (Context) mVarG.n(AndroidCompositionLocals_androidKt.g());
            zu.f screenActionFlow = j0().getScreenActionFlow();
            mVarG.W(-1224400529);
            boolean zF3 = ((i11 & 14) == 4) | mVarG.F(this) | mVarG.F(i3Var) | mVarG.F(i0Var) | mVarG.F(context) | mVarG.F(iVarB);
            Object objD4 = mVarG.D();
            if (zF3 || objD4 == aVar2.a()) {
                obj = new iu.l() { // from class: uo.u2
                    @Override // iu.l
                    public final Object invoke(Object obj2) {
                        return LogsStorageScreen.m0(this.f82423a, i3Var, i0Var, context, iVarB, vdVar, (so.k) obj2);
                    }
                };
                mVarG.t(obj);
            } else {
                obj = objD4;
            }
            mVarG.Q();
            np.n.b(screenActionFlow, null, null, (iu.l) obj, mVarG, 0, 6);
            if (w.R()) {
                w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new p() { // from class: uo.v2
                @Override // iu.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LogsStorageScreen.n0(this.f82445a, vdVar, i10, (androidx.compose.runtime.m) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 m0(LogsStorageScreen logsStorageScreen, i3 i3Var, wu.i0 i0Var, Context context, e.i iVar, vd vdVar, so.k kVar) {
        t.f(kVar, "it");
        if (t.b(kVar, k.c.f78145a)) {
            logsStorageScreen.finish();
        } else if (kVar instanceof k.d) {
            np.t.d(i3Var, ((k.d) kVar).a(), null, 2, null);
        } else if (kVar instanceof k.a) {
            wu.k.d(i0Var, null, null, new d(vdVar, logsStorageScreen, kVar, null), 3, null);
        } else if (kVar instanceof k.b) {
            wu.k.d(i0Var, null, null, new e(vdVar, logsStorageScreen, kVar, null), 3, null);
        } else {
            if (!t.b(kVar, k.e.f78147a)) {
                throw new s();
            }
            Bundle bundle = new SignUpChooserScreenArgs.a(128, true, true).a().toBundle();
            t.e(bundle, "toBundle(...)");
            Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
            intent.setAction("registrationFlowAction");
            intent.putExtras(bundle);
            iVar.a(intent);
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 n0(LogsStorageScreen logsStorageScreen, vd vdVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        logsStorageScreen.l0(vdVar, mVar, e3.a(i10 | 1));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(k0 k0Var, j0 j0Var, iu.a aVar) {
        if (j0Var == null) {
            return;
        }
        k0.b(k0Var, null, null, q1.h.b(104634270, true, new i(j0Var, aVar)), 3, null);
        k0.b(k0Var, null, null, uo.i.f82208a.b(), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        androidx.activity.r.b(this, null, null, 3, null);
        super.onCreate(bundle);
        e.e.b(this, null, q1.h.b(1430331354, true, new h()), 1, null);
    }
}

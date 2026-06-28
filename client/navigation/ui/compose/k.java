package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import android.os.Bundle;
import androidx.compose.ui.node.c;
import androidx.fragment.app.Fragment;
import com.server.auditor.ssh.client.R;
import v1.m;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f32529a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static iu.p f32530b = q1.h.b(1600549828, false, b.f32535a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static iu.p f32531c = q1.h.b(1766569764, false, c.f32536a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static iu.q f32532d = q1.h.b(1479176990, false, a.f32533a);

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32533a = new a();

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.k$a$a, reason: collision with other inner class name */
        public static final class C0497a extends ju.u implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0497a f32534a = new C0497a();

            public C0497a() {
                super(1);
            }

            public final void b(Fragment fragment) {
            }

            @Override // iu.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Fragment) obj);
                return ut.m0.f82633a;
            }
        }

        a() {
        }

        public final void b(z.n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
            int i11;
            ju.t.f(n0Var, "innerPaddings");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(n0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1479176990, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$NotificationsScreenKt.lambda$1479176990.<anonymous> (NotificationsScreen.kt:120)");
            }
            m.a aVar = v1.m.f83247a;
            v1.m mVarL = androidx.compose.foundation.layout.c0.l(aVar, n0Var);
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(v1.e.f83199a.o(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarL);
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
            androidx.compose.runtime.m mVarB = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB, e0VarI, aVar2.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar2.e());
            iu.p pVarB = aVar2.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar2.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            float f10 = 15;
            v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), q3.h.m(f10), 2, null);
            mVar.C(1765406104);
            c5.a.a(com.server.auditor.ssh.client.navigation.x1.class, mVarR, c5.e.b(mVar, 0), Bundle.EMPTY, C0497a.f32534a, mVar, 48, 0);
            mVar.U();
            mVar.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((z.n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32535a = new b();

        b() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1600549828, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$NotificationsScreenKt.lambda$1600549828.<anonymous> (NotificationsScreen.kt:102)");
            }
            lf.j(z2.h.b(R.string.notifications_label, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).j(), mVar, 0, 0, 131070);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32536a = new c();

        c() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1766569764, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ComposableSingletons$NotificationsScreenKt.lambda$1766569764.<anonymous> (NotificationsScreen.kt:111)");
            }
            a1.z4.e(w0.e.a(u0.a.f81262a.a()), "Dismiss quick connect", null, 0L, mVar, 48, 12);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    public final iu.q a() {
        return f32532d;
    }

    public final iu.p b() {
        return f32530b;
    }

    public final iu.p c() {
        return f32531c;
    }
}

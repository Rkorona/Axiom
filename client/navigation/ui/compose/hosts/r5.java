package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.server.auditor.ssh.client.navigation.ui.compose.hosts.r5;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.ui.bonjour.domain.DiscoverLocalDevicesViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r5 {

    static final class a implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f32154b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.r5$a$a, reason: collision with other inner class name */
        static final class C0492a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32155a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f32156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.e2 f32157c;

            C0492a(String str, androidx.navigation.r1 r1Var, androidx.compose.runtime.e2 e2Var) {
                this.f32155a = str;
                this.f32156b = r1Var;
                this.f32157c = e2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 g(androidx.navigation.r1 r1Var) {
                if (r1Var.A() != null) {
                    r1Var.S();
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 h(androidx.navigation.r1 r1Var, NsdSearchResult nsdSearchResult) {
                androidx.lifecycle.u0 u0VarJ;
                ju.t.f(nsdSearchResult, "nsdSearchResult");
                androidx.navigation.d0 d0VarA = r1Var.A();
                if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                    u0VarJ.h("selected_nsd_result", nsdSearchResult);
                }
                if (r1Var.A() != null) {
                    r1Var.S();
                }
                return ut.m0.f82633a;
            }

            public final void e(String str, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(str, "it");
                if ((i10 & 17) == 16 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-393438469, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.registerNsdSearchScreenRoute.<anonymous>.<anonymous> (ComposeNsdSearchScreen.kt:89)");
                }
                boolean zL = f1.c0.l(this.f32155a, f1.c0.f49444b.c());
                v1.m mVarF = androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null);
                boolean zE = a.e(this.f32157c);
                mVar.W(5004770);
                boolean zF = mVar.F(this.f32156b);
                final androidx.navigation.r1 r1Var = this.f32156b;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.p5
                        @Override // iu.a
                        public final Object a() {
                            return r5.a.C0492a.g(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                iu.a aVar = (iu.a) objD;
                mVar.Q();
                mVar.W(5004770);
                boolean zF2 = mVar.F(this.f32156b);
                final androidx.navigation.r1 r1Var2 = this.f32156b;
                Object objD2 = mVar.D();
                if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                    objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.q5
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return r5.a.C0492a.h(r1Var2, (NsdSearchResult) obj);
                        }
                    };
                    mVar.t(objD2);
                }
                mVar.Q();
                r5.g(mVarF, zL, zE, aVar, (iu.l) objD2, null, mVar, 6, 32);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e(((f1.c0) obj).o(), (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        a(String str, androidx.navigation.r1 r1Var) {
            this.f32153a = str;
            this.f32154b = r1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(androidx.compose.runtime.e2 e2Var) {
            return ((Boolean) e2Var.getValue()).booleanValue();
        }

        public final void d(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-117208970, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.registerNsdSearchScreenRoute.<anonymous> (ComposeNsdSearchScreen.kt:87)");
            }
            mVar.W(1849434622);
            androidx.navigation.r1 r1Var = this.f32154b;
            Object objD = mVar.D();
            if (objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = androidx.compose.runtime.f5.e(Boolean.valueOf(r1Var.A() != null), null, 2, null);
                mVar.t(objD);
            }
            mVar.Q();
            String str = this.f32153a;
            bk.f5.b(str, q1.h.d(-393438469, true, new C0492a(str, this.f32154b, (androidx.compose.runtime.e2) objD), mVar, 54), mVar, 48);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            d((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(v1.m r17, final boolean r18, final boolean r19, iu.a r20, final iu.l r21, com.server.auditor.ssh.client.ui.bonjour.domain.DiscoverLocalDevicesViewModel r22, androidx.compose.runtime.m r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.r5.g(v1.m, boolean, boolean, iu.a, iu.l, com.server.auditor.ssh.client.ui.bonjour.domain.DiscoverLocalDevicesViewModel, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h() {
        return ut.m0.f82633a;
    }

    private static final boolean i(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    private static final List j(androidx.compose.runtime.l5 l5Var) {
        return (List) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 k(v1.m mVar, boolean z10, boolean z11, iu.a aVar, iu.l lVar, DiscoverLocalDevicesViewModel discoverLocalDevicesViewModel, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        g(mVar, z10, z11, aVar, lVar, discoverLocalDevicesViewModel, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void l(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, String str) {
        ju.t.f(o1Var, "$this$registerNsdSearchScreenRoute");
        ju.t.f(r1Var, "navController");
        ju.t.f(str, "navigationSuiteType");
        iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.j5
            @Override // iu.l
            public final Object invoke(Object obj) {
                return r5.m((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.k5
            @Override // iu.l
            public final Object invoke(Object obj) {
                return r5.n((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.l5
            @Override // iu.l
            public final Object invoke(Object obj) {
                return r5.o((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.m5
            @Override // iu.l
            public final Object invoke(Object obj) {
                return r5.p((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(-117208970, true, new a(str, r1Var));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HostsNavGraphRoute.NsdSearchRoute.class), vt.s0.h(), vt.v.o(), lVar, lVar2, lVar3, lVar4, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h m(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j n(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.h1.f30620a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h o(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j p(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.ca.f30377a.f();
    }
}

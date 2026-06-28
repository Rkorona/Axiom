package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.eg;
import a1.gc;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.h8;
import v1.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h8 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f30635b;

        a(String str, iu.a aVar) {
            this.f30634a = str;
            this.f30635b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.a aVar) {
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1085063585, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NotificationsScreen.<anonymous> (NotificationsScreen.kt:59)");
            }
            m.a aVar = v1.m.f83247a;
            float f10 = 25;
            v1.m mVarA = z.k1.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.i0.w(z1.n.b(aVar, q3.h.m(8), g0.g.c(q3.h.m(f10)), false, 0L, 0L, 28, null), 0.0f, z2.e.b(R.dimen.max_width_tablet_land_alt, mVar, 6), 1, null).h(f1.c0.l(this.f30634a, f1.c0.f49444b.c()) ? androidx.compose.foundation.layout.i0.c(aVar, 0.8f) : androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null)), qk.a.f74718a.a(mVar, 6).j(), g0.g.c(q3.h.m(f10))));
            mVar.W(5004770);
            boolean zV = mVar.V(this.f30635b);
            final iu.a aVar2 = this.f30635b;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.g8
                    @Override // iu.a
                    public final Object a() {
                        return h8.a.e(aVar2);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            h8.e(mVarA, (iu.a) objD, mVar, 0, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f30636a;

        static final class a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.a f30637a;

            a(iu.a aVar) {
                this.f30637a = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(iu.a aVar) {
                aVar.a();
                return ut.m0.f82633a;
            }

            public final void d(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-473470974, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NotificationsScreenContent.<anonymous>.<anonymous> (NotificationsScreen.kt:108)");
                }
                mVar.W(5004770);
                boolean zV = mVar.V(this.f30637a);
                final iu.a aVar = this.f30637a;
                Object objD = mVar.D();
                if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.i8
                        @Override // iu.a
                        public final Object a() {
                            return h8.b.a.e(aVar);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                a1.v4.c((iu.a) objD, null, false, null, null, null, k.f32529a.c(), mVar, 1572864, 62);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return ut.m0.f82633a;
            }
        }

        b(iu.a aVar) {
            this.f30636a = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(2065620361, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NotificationsScreenContent.<anonymous> (NotificationsScreen.kt:97)");
            }
            a1.d0.o(k.f32529a.b(), null, q1.h.d(-473470974, true, new a(this.f30636a), mVar, 54), null, 0.0f, null, eg.f658a.i(qk.a.f74718a.a(mVar, 6).j(), 0L, 0L, 0L, 0L, 0L, mVar, eg.f668k << 18, 62), null, mVar, 390, 186);
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

    public static final void c(final boolean z10, final iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        ju.t.f(aVar, "onDismissRequest");
        androidx.compose.runtime.m mVarG = mVar.g(991374739);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(991374739, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NotificationsScreen (NotificationsScreen.kt:44)");
            }
            String strA = f1.i.f49478a.a(b1.b.b(mVarG, 0));
            if (z10) {
                androidx.compose.ui.window.b.a(aVar, new androidx.compose.ui.window.l(true, true, null, false, false, null, 36, null), q1.h.d(1085063585, true, new a(strA, aVar), mVarG, 54), mVarG, ((i11 >> 3) & 14) | 432, 0);
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.e8
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return h8.d(z10, aVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 d(boolean z10, iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        c(z10, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    public static final void e(v1.m mVar, final iu.a aVar, androidx.compose.runtime.m mVar2, final int i10, final int i11) {
        v1.m mVar3;
        int i12;
        androidx.compose.runtime.m mVar4;
        final v1.m mVar5;
        ju.t.f(aVar, "onDismissRequest");
        androidx.compose.runtime.m mVarG = mVar2.g(-374336051);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            mVar3 = mVar;
        } else if ((i10 & 6) == 0) {
            mVar3 = mVar;
            i12 = (mVarG.V(mVar3) ? 4 : 2) | i10;
        } else {
            mVar3 = mVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && mVarG.h()) {
            mVarG.M();
            mVar4 = mVarG;
            mVar5 = mVar3;
        } else {
            v1.m mVar6 = i13 != 0 ? v1.m.f83247a : mVar3;
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-374336051, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NotificationsScreenContent (NotificationsScreen.kt:93)");
            }
            mVar4 = mVarG;
            mVar5 = mVar6;
            gc.f(mVar5, q1.h.d(2065620361, true, new b(aVar), mVarG, 54), null, null, null, 0, 0L, 0L, null, k.f32529a.a(), mVar4, (i12 & 14) | 805306416, 508);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVar4.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.f8
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return h8.f(mVar5, aVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f(v1.m mVar, iu.a aVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        e(mVar, aVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

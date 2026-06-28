package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.eg;
import android.os.Bundle;
import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.serial.SerialConnectParameters;
import com.server.auditor.ssh.client.navigation.ui.compose.c9;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import u0.a;
import v1.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c9 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f30371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30372b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.c9$a$a, reason: collision with other inner class name */
        static final class C0466a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.a f30373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f30374b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.c9$a$a$a, reason: collision with other inner class name */
            static final class C0467a implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f30375a;

                C0467a(boolean z10) {
                    this.f30375a = z10;
                }

                public final void b(androidx.compose.runtime.m mVar, int i10) {
                    if ((i10 & 3) == 2 && mVar.h()) {
                        mVar.M();
                        return;
                    }
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(991028928, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectScreenContent.<anonymous>.<anonymous>.<anonymous> (SerialConnectScreen.kt:52)");
                    }
                    a1.z4.e(this.f30375a ? v0.a.a(a.C1284a.f81264a.a()) : w0.e.a(u0.a.f81262a.a()), z2.h.b(R.string.content_description_back, mVar, 6), null, 0L, mVar, 0, 12);
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

            C0466a(iu.a aVar, boolean z10) {
                this.f30373a = aVar;
                this.f30374b = z10;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-599058142, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectScreenContent.<anonymous>.<anonymous> (SerialConnectScreen.kt:51)");
                }
                a1.v4.c(this.f30373a, null, false, null, null, null, q1.h.d(991028928, true, new C0467a(this.f30374b), mVar, 54), mVar, 1572864, 62);
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

        a(iu.a aVar, boolean z10) {
            this.f30371a = aVar;
            this.f30372b = z10;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1068383803, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectScreenContent.<anonymous> (SerialConnectScreen.kt:40)");
            }
            a1.d0.o(p.f32990a.a(), null, q1.h.d(-599058142, true, new C0466a(this.f30371a, this.f30372b), mVar, 54), null, 0.0f, null, eg.f658a.i(qk.a.f74718a.a(mVar, 6).j(), 0L, 0L, 0L, 0L, 0L, mVar, eg.f668k << 18, 62), null, mVar, 390, 186);
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

    static final class b implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f30376a;

        b(iu.a aVar) {
            this.f30376a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.a aVar, SerialConnectParameters serialConnectParameters) {
            ju.t.f(serialConnectParameters, "it");
            serialConnectParameters.Yf(aVar);
            return ut.m0.f82633a;
        }

        public final void d(z.n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(n0Var, "innerPaddings");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(n0Var) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(593385606, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SerialConnectScreenContent.<anonymous> (SerialConnectScreen.kt:65)");
            }
            m.a aVar = v1.m.f83247a;
            v1.m mVarL = androidx.compose.foundation.layout.c0.l(aVar, n0Var);
            final iu.a aVar2 = this.f30376a;
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(v1.e.f83199a.o(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarL);
            c.a aVar3 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar3.a();
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
            androidx.compose.runtime.q5.e(mVarB, e0VarI, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar3.e());
            iu.p pVarB = aVar3.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar3.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            v1.m mVarF = androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null);
            mVar.W(5004770);
            boolean zV = mVar.V(aVar2);
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.d9
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return c9.b.e(aVar2, (SerialConnectParameters) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            mVar.C(1765406104);
            c5.a.a(SerialConnectParameters.class, mVarF, c5.e.b(mVar, 0), Bundle.EMPTY, (iu.l) objD, mVar, 48, 0);
            mVar.U();
            mVar.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            d((z.n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r22, final com.server.auditor.ssh.client.utils.analytics.Avo.ConnectionOrigin r23, final iu.a r24, final iu.a r25, v1.m r26, androidx.compose.runtime.m r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.c9.b(boolean, com.server.auditor.ssh.client.utils.analytics.Avo$ConnectionOrigin, iu.a, iu.a, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 c(boolean z10, Avo.ConnectionOrigin connectionOrigin, iu.a aVar, iu.a aVar2, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        b(z10, connectionOrigin, aVar, aVar2, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

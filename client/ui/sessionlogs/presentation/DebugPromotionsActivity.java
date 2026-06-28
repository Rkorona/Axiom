package com.server.auditor.ssh.client.ui.sessionlogs.presentation;

import a1.gc;
import a1.n5;
import a1.q5;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.r;
import androidx.compose.foundation.layout.c0;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m;
import androidx.compose.runtime.w;
import androidx.compose.runtime.z3;
import b0.k0;
import co.z;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.DebugPromotionsViewModel;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository;
import com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity;
import com.server.auditor.ssh.client.ui.sessionlogs.presentation.i;
import iu.l;
import iu.p;
import iu.q;
import ju.t;
import uo.s5;
import ut.m0;
import ut.s;
import v1.m;
import z.e;
import z.k1;
import z.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugPromotionsActivity extends ComponentActivity {

    static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f40643a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity$a$a, reason: collision with other inner class name */
        static final class C0640a implements q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f40644a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity$a$a$a, reason: collision with other inner class name */
            static final class C0641a implements q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l f40645a;

                C0641a(l lVar) {
                    this.f40645a = lVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final m0 e(l lVar) {
                    lVar.invoke(i.c.f40729a);
                    return m0.f82633a;
                }

                public final void d(b0.e eVar, m mVar, int i10) {
                    t.f(eVar, "$this$item");
                    if ((i10 & 17) == 16 && mVar.h()) {
                        mVar.M();
                        return;
                    }
                    if (w.R()) {
                        w.b0(64091221, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugPromotionsActivity.kt:98)");
                    }
                    m.a aVar = v1.m.f83247a;
                    mVar.W(5004770);
                    boolean zV = mVar.V(this.f40645a);
                    final l lVar = this.f40645a;
                    Object objD = mVar.D();
                    if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.b
                            @Override // iu.a
                            public final Object a() {
                                return DebugPromotionsActivity.a.C0640a.C0641a.e(lVar);
                            }
                        };
                        mVar.t(objD);
                    }
                    mVar.Q();
                    v1.m mVarJ = androidx.compose.foundation.e.j(aVar, false, null, null, null, (iu.a) objD, 15, null);
                    uo.f fVar = uo.f.f82146a;
                    n5.f(fVar.a(), mVarJ, null, fVar.f(), null, null, null, 0.0f, 0.0f, mVar, 3078, 500);
                    if (w.R()) {
                        w.a0();
                    }
                }

                @Override // iu.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    d((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                    return m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity$a$a$b */
            static final class b implements q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l f40646a;

                b(l lVar) {
                    this.f40646a = lVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final m0 e(l lVar) {
                    lVar.invoke(i.a.f40727a);
                    return m0.f82633a;
                }

                public final void d(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
                    t.f(eVar, "$this$item");
                    if ((i10 & 17) == 16 && mVar.h()) {
                        mVar.M();
                        return;
                    }
                    if (w.R()) {
                        w.b0(881986582, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugPromotionsActivity.kt:117)");
                    }
                    m.a aVar = v1.m.f83247a;
                    mVar.W(5004770);
                    boolean zV = mVar.V(this.f40646a);
                    final l lVar = this.f40646a;
                    Object objD = mVar.D();
                    if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.c
                            @Override // iu.a
                            public final Object a() {
                                return DebugPromotionsActivity.a.C0640a.b.e(lVar);
                            }
                        };
                        mVar.t(objD);
                    }
                    mVar.Q();
                    v1.m mVarJ = androidx.compose.foundation.e.j(aVar, false, null, null, null, (iu.a) objD, 15, null);
                    uo.f fVar = uo.f.f82146a;
                    n5.f(fVar.d(), mVarJ, null, fVar.c(), null, null, null, 0.0f, 0.0f, mVar, 3078, 500);
                    if (w.R()) {
                        w.a0();
                    }
                }

                @Override // iu.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    d((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                    return m0.f82633a;
                }
            }

            C0640a(l lVar) {
                this.f40644a = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 e(l lVar, k0 k0Var) {
                t.f(k0Var, "$this$LazyColumn");
                uo.f fVar = uo.f.f82146a;
                k0.b(k0Var, null, null, fVar.e(), 3, null);
                k0.f(k0Var, null, null, fVar.b(), 3, null);
                k0.b(k0Var, null, null, q1.h.b(64091221, true, new C0641a(lVar)), 3, null);
                k0.b(k0Var, null, null, q1.h.b(881986582, true, new b(lVar)), 3, null);
                return m0.f82633a;
            }

            public final void d(n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
                int i11;
                t.f(n0Var, "contentPaddings");
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
                    w.b0(1888485449, i11, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.ScreenContent.<anonymous>.<anonymous> (DebugPromotionsActivity.kt:67)");
                }
                e.f fVarO = z.e.f87467a.o(q3.h.m(5));
                v1.m mVarR = c0.r(c0.l(v1.m.f83247a, n0Var), 0.0f, q3.h.m(60), 0.0f, 0.0f, 13, null);
                mVar.W(5004770);
                boolean zV = mVar.V(this.f40644a);
                final l lVar = this.f40644a;
                Object objD = mVar.D();
                if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new l() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.a
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return DebugPromotionsActivity.a.C0640a.e(lVar, (k0) obj);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                b0.d.c(mVarR, null, null, false, fVarO, null, null, false, null, (l) objD, mVar, 24576, 494);
                if (w.R()) {
                    w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                d((n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return m0.f82633a;
            }
        }

        a(l lVar) {
            this.f40643a = lVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(-205377608, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.ScreenContent.<anonymous> (DebugPromotionsActivity.kt:63)");
            }
            gc.f(k1.d(v1.m.f83247a), null, null, null, null, 0, 0L, 0L, null, q1.h.d(1888485449, true, new C0640a(this.f40643a), mVar, 54), mVar, 805306368, 510);
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

    static final class b implements p {

        static final class a implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugPromotionsActivity f40648a;

            a(DebugPromotionsActivity debugPromotionsActivity) {
                this.f40648a = debugPromotionsActivity;
            }

            private static final com.server.auditor.ssh.client.ui.sessionlogs.domain.b e(l5 l5Var) {
                return (com.server.auditor.ssh.client.ui.sessionlogs.domain.b) l5Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 g(DebugPromotionsActivity debugPromotionsActivity, DebugPromotionsViewModel debugPromotionsViewModel, i iVar) {
                t.f(iVar, "it");
                debugPromotionsActivity.k0(iVar, debugPromotionsViewModel);
                return m0.f82633a;
            }

            public final void d(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (w.R()) {
                    w.b0(869184542, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.onCreate.<anonymous>.<anonymous> (DebugPromotionsActivity.kt:43)");
                }
                final DebugPromotionsViewModel debugPromotionsViewModel = (DebugPromotionsViewModel) j5.d.b(DebugPromotionsViewModel.class, null, null, null, null, mVar, 0, 30);
                l5 l5VarB = f5.a.b(debugPromotionsViewModel.getUiState(), null, null, null, mVar, 0, 7);
                DebugPromotionsActivity debugPromotionsActivity = this.f40648a;
                mVar.W(-1633490746);
                boolean zF = mVar.F(this.f40648a) | mVar.F(debugPromotionsViewModel);
                final DebugPromotionsActivity debugPromotionsActivity2 = this.f40648a;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new l() { // from class: com.server.auditor.ssh.client.ui.sessionlogs.presentation.d
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return DebugPromotionsActivity.b.a.g(debugPromotionsActivity2, debugPromotionsViewModel, (i) obj);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                debugPromotionsActivity.b0((l) objD, e(l5VarB).b(), mVar, 0);
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

        b() {
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (w.R()) {
                w.b0(-1316123238, i10, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.onCreate.<anonymous> (DebugPromotionsActivity.kt:42)");
            }
            qk.d.d(false, q1.h.d(869184542, true, new a(DebugPromotionsActivity.this), mVar, 54), mVar, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(final l lVar, final com.server.auditor.ssh.client.ui.sessionlogs.domain.c cVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        androidx.compose.runtime.m mVarG = mVar.g(932939835);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.F(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? mVarG.V(cVar) : mVarG.F(cVar) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && mVarG.h()) {
            mVarG.M();
        } else {
            if (w.R()) {
                w.b0(932939835, i11, -1, "com.server.auditor.ssh.client.ui.sessionlogs.presentation.DebugPromotionsActivity.ScreenContent (DebugPromotionsActivity.kt:58)");
            }
            long jZ = q5.f1818a.a(mVarG, q5.f1819b).Z();
            mVarG.W(5004770);
            boolean zF = mVarG.F(this);
            Object objD = mVarG.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: uo.o2
                    @Override // iu.a
                    public final Object a() {
                        return DebugPromotionsActivity.c0(this.f82313a);
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            int i12 = i11;
            z.d(jZ, 0L, (iu.a) objD, null, q1.h.d(-205377608, true, new a(lVar), mVarG, 54), mVarG, 24576, 10);
            mVarG.W(5004770);
            int i13 = i12 & 14;
            boolean z10 = i13 == 4;
            Object objD2 = mVarG.D();
            if (z10 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new l() { // from class: uo.p2
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return DebugPromotionsActivity.e0(lVar, (SessionLogsPromoBannerRepository.SessionLogsPromoBannerType) obj);
                    }
                };
                mVarG.t(objD2);
            }
            l lVar2 = (l) objD2;
            mVarG.Q();
            mVarG.W(5004770);
            boolean z11 = i13 == 4;
            Object objD3 = mVarG.D();
            if (z11 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                objD3 = new iu.a() { // from class: uo.q2
                    @Override // iu.a
                    public final Object a() {
                        return DebugPromotionsActivity.g0(lVar);
                    }
                };
                mVarG.t(objD3);
            }
            mVarG.Q();
            s5.c(cVar, lVar2, (iu.a) objD3, mVarG, (i12 >> 3) & 14);
            if (w.R()) {
                w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new p() { // from class: uo.r2
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return DebugPromotionsActivity.h0(this.f82361a, lVar, cVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 c0(DebugPromotionsActivity debugPromotionsActivity) {
        debugPromotionsActivity.finish();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 e0(l lVar, SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType) {
        lVar.invoke(new i.b(sessionLogsPromoBannerType));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 g0(l lVar) {
        lVar.invoke(i.d.f40730a);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 h0(DebugPromotionsActivity debugPromotionsActivity, l lVar, com.server.auditor.ssh.client.ui.sessionlogs.domain.c cVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        debugPromotionsActivity.b0(lVar, cVar, mVar, e3.a(i10 | 1));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(i iVar, DebugPromotionsViewModel debugPromotionsViewModel) {
        if (t.b(iVar, i.c.f40729a)) {
            debugPromotionsViewModel.onSetSessionLogsPromotionClick();
            return;
        }
        if (t.b(iVar, i.a.f40727a)) {
            debugPromotionsViewModel.onClearDismissedSessionLogsPromotions();
        } else if (iVar instanceof i.b) {
            debugPromotionsViewModel.onSetSessionLogsPromotions(((i.b) iVar).a());
        } else {
            if (!t.b(iVar, i.d.f40730a)) {
                throw new s();
            }
            debugPromotionsViewModel.onSetSessionLogsPromotionDialogDismissRequest();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        r.b(this, null, null, 3, null);
        super.onCreate(bundle);
        e.e.b(this, null, q1.h.b(-1316123238, true, new b()), 1, null);
    }
}

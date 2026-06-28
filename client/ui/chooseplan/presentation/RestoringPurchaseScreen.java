package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import a1.gc;
import a1.je;
import a1.q5;
import a1.w1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.z3;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel;
import com.server.auditor.ssh.client.ui.chooseplan.presentation.RestoringPurchaseScreen;
import i5.a;
import ju.n0;
import ut.m0;
import z.k1;
import zn.g;

/* JADX INFO: loaded from: classes4.dex */
public final class RestoringPurchaseScreen extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f39849a;

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f39850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39851b;

        a(long j10, long j11) {
            this.f39850a = j10;
            this.f39851b = j11;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1434714145, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.RestoringPurchaseScreen.RestoringPurchaseScreenContent.<anonymous> (RestoringPurchaseScreen.kt:93)");
            }
            gc.f(k1.d(androidx.compose.foundation.layout.c0.p(v1.m.f83247a, q3.h.m(20), 0.0f, 2, null)), null, null, null, null, 0, this.f39850a, this.f39851b, null, bo.g.f14030a.a(), mVar, 805306368, 318);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    static final class b implements iu.p {

        static final class a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RestoringPurchaseScreen f39853a;

            a(RestoringPurchaseScreen restoringPurchaseScreen) {
                this.f39853a = restoringPurchaseScreen;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 g(RestoringPurchaseScreen restoringPurchaseScreen, zn.g gVar) {
                ju.t.f(gVar, "it");
                if (gVar instanceof g.b) {
                    restoringPurchaseScreen.r7();
                } else {
                    if (!ju.t.b(gVar, g.a.f88052a)) {
                        throw new ut.s();
                    }
                    restoringPurchaseScreen.Df();
                }
                return m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 h(RestoringPurchaseScreen restoringPurchaseScreen) {
                restoringPurchaseScreen.zf().onBackPressed();
                return m0.f82633a;
            }

            public final void e(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-124442045, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.RestoringPurchaseScreen.onCreateView.<anonymous>.<anonymous>.<anonymous> (RestoringPurchaseScreen.kt:60)");
                }
                zu.f screenActionFlow = this.f39853a.zf().getScreenActionFlow();
                mVar.W(5004770);
                boolean zF = mVar.F(this.f39853a);
                final RestoringPurchaseScreen restoringPurchaseScreen = this.f39853a;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.chooseplan.presentation.r
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return RestoringPurchaseScreen.b.a.g(restoringPurchaseScreen, (zn.g) obj);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                np.n.b(screenActionFlow, null, null, (iu.l) objD, mVar, 0, 6);
                mVar.W(5004770);
                boolean zF2 = mVar.F(this.f39853a);
                final RestoringPurchaseScreen restoringPurchaseScreen2 = this.f39853a;
                Object objD2 = mVar.D();
                if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                    objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.chooseplan.presentation.s
                        @Override // iu.a
                        public final Object a() {
                            return RestoringPurchaseScreen.b.a.h(restoringPurchaseScreen2);
                        }
                    };
                    mVar.t(objD2);
                }
                mVar.Q();
                e.d.a(false, (iu.a) objD2, mVar, 0, 1);
                this.f39853a.tf(mVar, 0);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                e((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
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
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1247185223, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.RestoringPurchaseScreen.onCreateView.<anonymous>.<anonymous> (RestoringPurchaseScreen.kt:59)");
            }
            qk.d.d(false, q1.h.d(-124442045, true, new a(RestoringPurchaseScreen.this), mVar, 54), mVar, 48, 1);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return m0.f82633a;
        }
    }

    public static final class c extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f39854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f39854a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment a() {
            return this.f39854a;
        }
    }

    public static final class d extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f39855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(iu.a aVar) {
            super(0);
            this.f39855a = aVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n1 a() {
            return (n1) this.f39855a.a();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ut.n f39856a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ut.n nVar) {
            super(0);
            this.f39856a = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return t0.c(this.f39856a).getViewModelStore();
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f39857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ut.n f39858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar, ut.n nVar) {
            super(0);
            this.f39857a = aVar;
            this.f39858b = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f39857a;
            if (aVar2 != null && (aVar = (i5.a) aVar2.a()) != null) {
                return aVar;
            }
            n1 n1VarC = t0.c(this.f39858b);
            androidx.lifecycle.o oVar = n1VarC instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) n1VarC : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.b.f55949c;
        }
    }

    public static final class g extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f39859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ut.n f39860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, ut.n nVar) {
            super(0);
            this.f39859a = fragment;
            this.f39860b = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            l1.c defaultViewModelProviderFactory;
            n1 n1VarC = t0.c(this.f39860b);
            androidx.lifecycle.o oVar = n1VarC instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) n1VarC : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f39859a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public RestoringPurchaseScreen() {
        ut.n nVarB = ut.o.b(ut.r.f82639c, new d(new c(this)));
        this.f39849a = t0.b(this, n0.b(RestoringPurchaseViewModel.class), new e(nVarB), new f(null, nVarB), new g(this, nVarB));
    }

    private final void Af() {
        final androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS != null) {
            d0VarS.j().d("retryLastRequestResultKey").j(getViewLifecycleOwner(), new l0() { // from class: bo.e0
                @Override // androidx.lifecycle.l0
                public final void a(Object obj) {
                    RestoringPurchaseScreen.Bf(this.f14023a, d0VarS, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(RestoringPurchaseScreen restoringPurchaseScreen, androidx.navigation.d0 d0Var, Object obj) {
        restoringPurchaseScreen.zf().onRetryLastRequest();
        d0Var.j().f("retryLastRequestResultKey");
    }

    private final void Cf() {
        Af();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        androidx.navigation.k1 k1VarA = bo.g0.a();
        ju.t.e(k1VarA, "actionRestoringPurchaseS…EndOfTrialOopsScreen(...)");
        androidx.navigation.fragment.c.a(this).O(k1VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r7() {
        androidx.navigation.k1 k1VarB = bo.g0.b();
        ju.t.e(k1VarB, "actionRestoringPurchaseS…seSubscriptionScreen(...)");
        androidx.navigation.fragment.c.a(this).O(k1VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tf(androidx.compose.runtime.m mVar, final int i10) {
        androidx.compose.runtime.m mVarG = mVar.g(1346172102);
        if ((i10 & 1) == 0 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1346172102, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.RestoringPurchaseScreen.RestoringPurchaseScreenContent (RestoringPurchaseScreen.kt:83)");
            }
            long jK = qk.a.f74718a.a(mVarG, 6).k();
            long jG = w1.g(q5.f1818a.a(mVarG, q5.f1819b).a(), mVarG, 0);
            je.c(androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null), null, jK, jG, 0.0f, 0.0f, null, q1.h.d(1434714145, true, new a(jK, jG), mVarG, 54), mVarG, 12582918, 114);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: bo.f0
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return RestoringPurchaseScreen.uf(this.f14028a, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 uf(RestoringPurchaseScreen restoringPurchaseScreen, int i10, androidx.compose.runtime.m mVar, int i11) {
        restoringPurchaseScreen.tf(mVar, e3.a(i10 | 1));
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RestoringPurchaseViewModel zf() {
        return (RestoringPurchaseViewModel) this.f39849a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(j3.c.f6604b);
        composeView.setContent(q1.h.b(1247185223, true, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        Cf();
    }
}

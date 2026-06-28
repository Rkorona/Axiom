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
import com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel;
import com.server.auditor.ssh.client.ui.chooseplan.presentation.TeamTrialRequestExtensionScreen;
import com.server.auditor.ssh.client.ui.chooseplan.presentation.b0;
import i5.a;
import java.util.Calendar;
import ju.n0;
import ut.m0;
import z.k1;
import zn.j;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamTrialRequestExtensionScreen extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ut.n f39893a;

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f39894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39895b;

        a(long j10, long j11) {
            this.f39894a = j10;
            this.f39895b = j11;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(299332740, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.TeamTrialRequestExtensionScreen.TeamTrialRequestExtensionScreenContent.<anonymous> (TeamTrialRequestExtensionScreen.kt:101)");
            }
            gc.f(k1.d(androidx.compose.foundation.layout.c0.p(v1.m.f83247a, q3.h.m(20), 0.0f, 2, null)), null, null, null, null, 0, this.f39894a, this.f39895b, null, bo.j.f14042a.a(), mVar, 805306368, 318);
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
            final /* synthetic */ TeamTrialRequestExtensionScreen f39897a;

            a(TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen) {
                this.f39897a = teamTrialRequestExtensionScreen;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 g(TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen, zn.j jVar) {
                ju.t.f(jVar, "it");
                if (jVar instanceof j.c) {
                    j.c cVar = (j.c) jVar;
                    teamTrialRequestExtensionScreen.Gf(cVar.a(), cVar.b());
                } else if (jVar instanceof j.b) {
                    teamTrialRequestExtensionScreen.Ff();
                } else {
                    if (!ju.t.b(jVar, j.a.f88057a)) {
                        throw new ut.s();
                    }
                    teamTrialRequestExtensionScreen.Ef();
                }
                return m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m0 h(TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen) {
                teamTrialRequestExtensionScreen.Af().onBackPressed();
                return m0.f82633a;
            }

            public final void e(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1696407799, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.TeamTrialRequestExtensionScreen.onCreateView.<anonymous>.<anonymous>.<anonymous> (TeamTrialRequestExtensionScreen.kt:61)");
                }
                zu.f screenActionFlow = this.f39897a.Af().getScreenActionFlow();
                mVar.W(5004770);
                boolean zF = mVar.F(this.f39897a);
                final TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen = this.f39897a;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.chooseplan.presentation.z
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return TeamTrialRequestExtensionScreen.b.a.g(teamTrialRequestExtensionScreen, (zn.j) obj);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                np.n.b(screenActionFlow, null, null, (iu.l) objD, mVar, 0, 6);
                mVar.W(5004770);
                boolean zF2 = mVar.F(this.f39897a);
                final TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen2 = this.f39897a;
                Object objD2 = mVar.D();
                if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                    objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.chooseplan.presentation.a0
                        @Override // iu.a
                        public final Object a() {
                            return TeamTrialRequestExtensionScreen.b.a.h(teamTrialRequestExtensionScreen2);
                        }
                    };
                    mVar.t(objD2);
                }
                mVar.Q();
                e.d.a(false, (iu.a) objD2, mVar, 0, 1);
                this.f39897a.tf(mVar, 0);
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
                androidx.compose.runtime.w.b0(-1767000563, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.TeamTrialRequestExtensionScreen.onCreateView.<anonymous>.<anonymous> (TeamTrialRequestExtensionScreen.kt:60)");
            }
            qk.d.d(false, q1.h.d(-1696407799, true, new a(TeamTrialRequestExtensionScreen.this), mVar, 54), mVar, 48, 1);
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
        final /* synthetic */ Fragment f39898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f39898a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment a() {
            return this.f39898a;
        }
    }

    public static final class d extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f39899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(iu.a aVar) {
            super(0);
            this.f39899a = aVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n1 a() {
            return (n1) this.f39899a.a();
        }
    }

    public static final class e extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ut.n f39900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ut.n nVar) {
            super(0);
            this.f39900a = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return t0.c(this.f39900a).getViewModelStore();
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f39901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ut.n f39902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar, ut.n nVar) {
            super(0);
            this.f39901a = aVar;
            this.f39902b = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f39901a;
            if (aVar2 != null && (aVar = (i5.a) aVar2.a()) != null) {
                return aVar;
            }
            n1 n1VarC = t0.c(this.f39902b);
            androidx.lifecycle.o oVar = n1VarC instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) n1VarC : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.b.f55949c;
        }
    }

    public static final class g extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f39903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ut.n f39904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, ut.n nVar) {
            super(0);
            this.f39903a = fragment;
            this.f39904b = nVar;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            l1.c defaultViewModelProviderFactory;
            n1 n1VarC = t0.c(this.f39904b);
            androidx.lifecycle.o oVar = n1VarC instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) n1VarC : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f39903a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TeamTrialRequestExtensionScreen() {
        ut.n nVarB = ut.o.b(ut.r.f82639c, new d(new c(this)));
        this.f39893a = t0.b(this, n0.b(TeamTrialRequestExtensionViewModel.class), new e(nVarB), new f(null, nVarB), new g(this, nVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeamTrialRequestExtensionViewModel Af() {
        return (TeamTrialRequestExtensionViewModel) this.f39893a.getValue();
    }

    private final void Bf() {
        final androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS != null) {
            d0VarS.j().d("retryLastRequestResultKey").j(getViewLifecycleOwner(), new l0() { // from class: bo.o0
                @Override // androidx.lifecycle.l0
                public final void a(Object obj) {
                    TeamTrialRequestExtensionScreen.Cf(this.f14064a, d0VarS, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen, androidx.navigation.d0 d0Var, Object obj) {
        teamTrialRequestExtensionScreen.Af().onRetryLastRequest();
        d0Var.j().f("retryLastRequestResultKey");
    }

    private final void Df() {
        Bf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        androidx.navigation.k1 k1VarA = b0.a();
        ju.t.e(k1VarA, "actionTeamTrialRequestEx…EndOfTrialOopsScreen(...)");
        androidx.navigation.fragment.c.a(this).O(k1VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff() {
        androidx.navigation.k1 k1VarB = b0.b();
        ju.t.e(k1VarB, "actionTeamTrialRequestEx…ensionRejectedScreen(...)");
        androidx.navigation.fragment.c.a(this).O(k1VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Gf(int i10, Calendar calendar) {
        b0.a aVarC = b0.c(i10, calendar);
        ju.t.e(aVarC, "actionTeamTrialRequestEx…sfullyExtendedScreen(...)");
        androidx.navigation.fragment.c.a(this).O(aVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tf(androidx.compose.runtime.m mVar, final int i10) {
        androidx.compose.runtime.m mVarG = mVar.g(-1592391127);
        if ((i10 & 1) == 0 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1592391127, i10, -1, "com.server.auditor.ssh.client.ui.chooseplan.presentation.TeamTrialRequestExtensionScreen.TeamTrialRequestExtensionScreenContent (TeamTrialRequestExtensionScreen.kt:91)");
            }
            long jK = qk.a.f74718a.a(mVarG, 6).k();
            long jG = w1.g(q5.f1818a.a(mVarG, q5.f1819b).a(), mVarG, 0);
            je.c(androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null), null, jK, jG, 0.0f, 0.0f, null, q1.h.d(299332740, true, new a(jK, jG), mVarG, 54), mVarG, 12582918, 114);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: bo.p0
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return TeamTrialRequestExtensionScreen.uf(this.f14066a, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 uf(TeamTrialRequestExtensionScreen teamTrialRequestExtensionScreen, int i10, androidx.compose.runtime.m mVar, int i11) {
        teamTrialRequestExtensionScreen.tf(mVar, e3.a(i10 | 1));
        return m0.f82633a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(j3.c.f6604b);
        composeView.setContent(q1.h.b(-1767000563, true, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        Df();
    }
}

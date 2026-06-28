package com.server.auditor.ssh.client.fragments.team.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.t0;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import androidx.navigation.x;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.team.dialogs.TeamTrialPromoExtensionScreen;
import com.server.auditor.ssh.client.fragments.team.dialogs.a;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.teamtrial.TeamTrialPromoExtensionScreenPresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import ju.u;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.d8;
import ut.m0;
import ut.n;
import ut.s;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamTrialPromoExtensionScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.teamtrial.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f26705f = {n0.g(new g0(TeamTrialPromoExtensionScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/teamtrial/TeamTrialPromoExtensionScreenPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26706u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d8 f26707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f26708b = new x(n0.b(TeamTrialPromoExtensionScreenArgs.class), new m(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f26710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e0 f26711e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26712a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26712a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = TeamTrialPromoExtensionScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26714a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, zt.e eVar) {
            super(2, eVar);
            this.f26716c = endOfTeamTrialTargetAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new b(this.f26716c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26714a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamTrialPromoExtensionScreen.this.Nf();
            TeamTrialPromoExtensionScreen.this.Pf();
            TeamTrialPromoExtensionScreen.this.Tf(this.f26716c);
            TeamTrialPromoExtensionScreen.this.Kf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26717a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26717a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(TeamTrialPromoExtensionScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26719a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26721c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, zt.e eVar) {
            super(2, eVar);
            this.f26721c = endOfTeamTrialTargetAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new d(this.f26721c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26719a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(TeamTrialPromoExtensionScreen.this);
            m0VarA.U(R.id.endOfTrialScreen, false);
            d0 d0VarS = m0VarA.s();
            if (d0VarS != null && (u0VarJ = d0VarS.j()) != null) {
                u0VarJ.h("TEAM_DEACTIVATION_RESULT_KEY", this.f26721c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26722a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26722a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarA = com.server.auditor.ssh.client.fragments.team.dialogs.a.a();
            t.e(k1VarA, "actionTeamTrialPromoExte…EndOfTrialOopsScreen(...)");
            androidx.navigation.fragment.c.a(TeamTrialPromoExtensionScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamTrialPromoExtensionScreen f26726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, zt.e eVar) {
            super(2, eVar);
            this.f26725b = endOfTeamTrialTargetAction;
            this.f26726c = teamTrialPromoExtensionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f26725b, this.f26726c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26724a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.C0418a c0418aB = com.server.auditor.ssh.client.fragments.team.dialogs.a.b(this.f26725b);
            t.e(c0418aB, "actionTeamTrialPromoExte…rsConfirmationScreen(...)");
            androidx.navigation.fragment.c.a(this.f26726c).O(c0418aB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeamTrialPromoExtensionScreen f26729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, zt.e eVar) {
            super(2, eVar);
            this.f26728b = endOfTeamTrialTargetAction;
            this.f26729c = teamTrialPromoExtensionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f26728b, this.f26729c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26727a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.b bVarC = com.server.auditor.ssh.client.fragments.team.dialogs.a.c(this.f26728b);
            t.e(bVarC, "actionTeamTrialPromoExte…vationProgressScreen(...)");
            androidx.navigation.fragment.c.a(this.f26729c).O(bVarC);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26730a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26730a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarD = com.server.auditor.ssh.client.fragments.team.dialogs.a.d();
            t.e(k1VarD, "actionTeamTrialPromoExte…questExtensionScreen(...)");
            androidx.navigation.fragment.c.a(TeamTrialPromoExtensionScreen.this).O(k1VarD);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ iu.l f26732a;

        i(iu.l lVar) {
            t.f(lVar, "function");
            this.f26732a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26732a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26732a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class j extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f26733a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26733a.requireActivity().getViewModelStore();
        }
    }

    public static final class k extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26734a = aVar;
            this.f26735b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26734a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26735b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class l extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f26736a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26736a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class m implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26737a;

        public m(Fragment fragment) {
            this.f26737a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26737a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26737a + " has null arguments");
        }
    }

    public TeamTrialPromoExtensionScreen() {
        iu.a aVar = new iu.a() { // from class: gi.k
            @Override // iu.a
            public final Object a() {
                return TeamTrialPromoExtensionScreen.Sf(this.f51367a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26709c = new MoxyKtxDelegate(mvpDelegate, TeamTrialPromoExtensionScreenPresenter.class.getName() + ".presenter", aVar);
        this.f26710d = t0.b(this, n0.b(EndOfTrialViewModel.class), new j(this), new k(null, this), new l(this));
    }

    private final void Df() {
        z0.F0(If().b(), new o4.i0() { // from class: gi.i
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialPromoExtensionScreen.Ef(view, a2Var);
            }
        });
        z0.F0(If().f72269f, new o4.i0() { // from class: gi.j
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialPromoExtensionScreen.Ff(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ff(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final EndOfTrialViewModel Gf() {
        return (EndOfTrialViewModel) this.f26710d.getValue();
    }

    private final TeamTrialPromoExtensionScreenArgs Hf() {
        return (TeamTrialPromoExtensionScreenArgs) this.f26708b.getValue();
    }

    private final d8 If() {
        d8 d8Var = this.f26707a;
        if (d8Var != null) {
            return d8Var;
        }
        throw new IllegalStateException();
    }

    private final TeamTrialPromoExtensionScreenPresenter Jf() {
        return (TeamTrialPromoExtensionScreenPresenter) this.f26709c.getValue(this, f26705f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        If().f72280q.setOnClickListener(new View.OnClickListener() { // from class: gi.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialPromoExtensionScreen.Lf(this.f51368a, view);
            }
        });
        If().f72275l.setOnClickListener(new View.OnClickListener() { // from class: gi.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialPromoExtensionScreen.Mf(this.f51369a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, View view) {
        teamTrialPromoExtensionScreen.Jf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, View view) {
        teamTrialPromoExtensionScreen.Jf().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        Gf().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new i(new iu.l() { // from class: gi.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialPromoExtensionScreen.Of(this.f51365a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Of(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            teamTrialPromoExtensionScreen.Jf().y2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            teamTrialPromoExtensionScreen.Jf().z2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf() {
        If().f72265b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: gi.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialPromoExtensionScreen.Qf(this.f51366a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qf(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, View view) {
        teamTrialPromoExtensionScreen.Jf().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Rf(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamTrialPromoExtensionScreen.Jf().v2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamTrialPromoExtensionScreenPresenter Sf(TeamTrialPromoExtensionScreen teamTrialPromoExtensionScreen) {
        boolean isPromoMode = teamTrialPromoExtensionScreen.Hf().getIsPromoMode();
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = teamTrialPromoExtensionScreen.Hf().getEndOfTeamTrialTargetAction();
        t.e(endOfTeamTrialTargetAction, "getEndOfTeamTrialTargetAction(...)");
        return new TeamTrialPromoExtensionScreenPresenter(isPromoMode, endOfTeamTrialTargetAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Tf(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.DowngradeToStarterPlan) {
            If().f72275l.setText(getString(R.string.downgrade_to_hobby_plan_button_title));
            return;
        }
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.DowngradeToProPlan) {
            If().f72275l.setText(getString(R.string.switch_to_pro_plan));
        } else if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) {
            If().f72275l.setText(getString(R.string.switch_to_pro_plan_with_price, ((EndOfTeamTrialTargetAction.BuyProMonthlyPlan) endOfTeamTrialTargetAction).getPrice()));
        } else {
            if (!(endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
                throw new s();
            }
            If().f72275l.setText(getString(R.string.switch_to_pro_plan_with_price, ((EndOfTeamTrialTargetAction.BuyProYearlyPlan) endOfTeamTrialTargetAction).getPrice()));
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void A0(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "targetAction");
        bh.a.b(this, new f(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void B6() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void D1(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        bh.a.b(this, new b(endOfTeamTrialTargetAction, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "targetAction");
        bh.a.b(this, new g(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void n2(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        bh.a.b(this, new d(endOfTeamTrialTargetAction, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: gi.n
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialPromoExtensionScreen.Rf(this.f51370a, (e0) obj);
            }
        }, 2, null);
        this.f26711e = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f26707a = d8.c(getLayoutInflater(), viewGroup, false);
        Df();
        ConstraintLayout constraintLayoutB = If().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26707a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26711e;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void q0() {
        bh.a.b(this, new e(null));
    }
}

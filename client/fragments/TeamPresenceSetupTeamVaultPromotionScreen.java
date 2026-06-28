package com.server.auditor.ssh.client.fragments;

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
import androidx.navigation.k1;
import ch.r3;
import com.server.auditor.ssh.client.fragments.TeamPresenceSetupTeamVaultPromotionScreen;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.presenters.TeamPresenceSetupTeamVaultPromotionPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.x7;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceSetupTeamVaultPromotionScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.team.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24260e = {n0.g(new g0(TeamPresenceSetupTeamVaultPromotionScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/TeamPresenceSetupTeamVaultPromotionPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24261f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x7 f24262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f24263b = new androidx.navigation.x(n0.b(TeamPresenceSetupTeamVaultPromotionScreenArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f24265d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24266a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceSetupTeamVaultPromotionScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24266a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamPresenceSetupTeamVaultPromotionScreen.this.Af();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24268a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f24271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, zt.e eVar) {
            super(2, eVar);
            this.f24270c = i10;
            this.f24271d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceSetupTeamVaultPromotionScreen.this.new b(this.f24270c, this.f24271d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
            FragmentActivity fragmentActivityRequireActivity = TeamPresenceSetupTeamVaultPromotionScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.b(fragmentActivityRequireActivity, new NavigationPopUpWhenLargeActivity.NavigationDestination.SetupTeamVaultFlow(new NavigationPopUpWhenLargeActivity.SetupTeamVaultFlowStartDestination.CredentialsMode(this.f24270c, vt.v.o(), "TEAM_PRESENCE_SETUP_TEAM_VAULT_PROMOTION_CALLER_FEATURE", this.f24271d)));
            TeamPresenceSetupTeamVaultPromotionScreen.this.D0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24272a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamPresenceSetupTeamVaultPromotionScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24272a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarA = r3.a();
            ju.t.e(k1VarA, "actionTeamPresenceSetupT…ToTeamPresenceScreen(...)");
            androidx.navigation.fragment.c.a(TeamPresenceSetupTeamVaultPromotionScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24274a;

        public d(Fragment fragment) {
            this.f24274a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f24274a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f24274a + " has null arguments");
        }
    }

    public TeamPresenceSetupTeamVaultPromotionScreen() {
        iu.a aVar = new iu.a() { // from class: ch.n3
            @Override // iu.a
            public final Object a() {
                return TeamPresenceSetupTeamVaultPromotionScreen.Ef(this.f15577a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24264c = new MoxyKtxDelegate(mvpDelegate, TeamPresenceSetupTeamVaultPromotionPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Af() {
        yf().f74399g.setOnClickListener(new View.OnClickListener() { // from class: ch.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceSetupTeamVaultPromotionScreen.Bf(this.f15605a, view);
            }
        });
        yf().f74396d.setOnClickListener(new View.OnClickListener() { // from class: ch.q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamPresenceSetupTeamVaultPromotionScreen.Cf(this.f15614a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(TeamPresenceSetupTeamVaultPromotionScreen teamPresenceSetupTeamVaultPromotionScreen, View view) {
        teamPresenceSetupTeamVaultPromotionScreen.zf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Cf(TeamPresenceSetupTeamVaultPromotionScreen teamPresenceSetupTeamVaultPromotionScreen, View view) {
        teamPresenceSetupTeamVaultPromotionScreen.zf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Df(TeamPresenceSetupTeamVaultPromotionScreen teamPresenceSetupTeamVaultPromotionScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        teamPresenceSetupTeamVaultPromotionScreen.zf().s2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamPresenceSetupTeamVaultPromotionPresenter Ef(TeamPresenceSetupTeamVaultPromotionScreen teamPresenceSetupTeamVaultPromotionScreen) {
        return new TeamPresenceSetupTeamVaultPromotionPresenter(teamPresenceSetupTeamVaultPromotionScreen.xf().getInvitedColleaguesCount());
    }

    private final void wf() {
        z0.F0(yf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final TeamPresenceSetupTeamVaultPromotionScreenArgs xf() {
        return (TeamPresenceSetupTeamVaultPromotionScreenArgs) this.f24263b.getValue();
    }

    private final x7 yf() {
        x7 x7Var = this.f24262a;
        if (x7Var != null) {
            return x7Var;
        }
        throw new IllegalStateException();
    }

    private final TeamPresenceSetupTeamVaultPromotionPresenter zf() {
        return (TeamPresenceSetupTeamVaultPromotionPresenter) this.f24264c.getValue(this, f24260e[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.team.d
    public void D0() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.team.d
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.o3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamPresenceSetupTeamVaultPromotionScreen.Df(this.f15591a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24265d = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24262a = x7.c(layoutInflater, viewGroup, false);
        wf();
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24262a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24265d;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.team.d
    public void t6(int i10, String str) {
        ju.t.f(str, "analyticsFunnelId");
        bh.a.b(this, new b(i10, str, null));
    }
}

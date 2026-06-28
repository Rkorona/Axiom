package com.server.auditor.ssh.client.fragments.team;

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
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import androidx.navigation.x;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.server.auditor.ssh.client.contracts.c1;
import com.server.auditor.ssh.client.fragments.team.TeamTrialOwnerAwaitingDowngradeScreen;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter;
import fi.d1;
import iu.l;
import iu.p;
import ju.g0;
import ju.n;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.c8;
import qu.k;
import ut.i;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamTrialOwnerAwaitingDowngradeScreen extends MvpAppCompatFragment implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c8 f26676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f26678c = new x(n0.b(TeamTrialOwnerAwaitingDowngradeScreenArgs.class), new g(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26679d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f26674f = {n0.g(new g0(TeamTrialOwnerAwaitingDowngradeScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/TeamTrialOwnerAwaitingDowngradePresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26673e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26675u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26680a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26680a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = TeamTrialOwnerAwaitingDowngradeScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26682a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26682a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamTrialOwnerAwaitingDowngradeScreen.this.Af().f72164g.setProgress(1.0f);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26684a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26684a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TeamTrialOwnerAwaitingDowngradeScreen.this.Ef();
            TeamTrialOwnerAwaitingDowngradeScreen.this.Cf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26686a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26686a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarA = d1.a();
            t.e(k1VarA, "actionTeamTrialOwnerAwai…gDowngradeOopsScreen(...)");
            androidx.navigation.fragment.c.a(TeamTrialOwnerAwaitingDowngradeScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f implements l0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26688a;

        f(l lVar) {
            t.f(lVar, "function");
            this.f26688a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26688a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f26688a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof n)) {
                return t.b(c(), ((n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class g implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26689a;

        public g(Fragment fragment) {
            this.f26689a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26689a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26689a + " has null arguments");
        }
    }

    public TeamTrialOwnerAwaitingDowngradeScreen() {
        iu.a aVar = new iu.a() { // from class: fi.y0
            @Override // iu.a
            public final Object a() {
                return TeamTrialOwnerAwaitingDowngradeScreen.Hf(this.f50054a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26679d = new MoxyKtxDelegate(mvpDelegate, TeamTrialOwnerAwaitingDowngradePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c8 Af() {
        c8 c8Var = this.f26676a;
        if (c8Var != null) {
            return c8Var;
        }
        throw new IllegalStateException();
    }

    private final TeamTrialOwnerAwaitingDowngradePresenter Bf() {
        return (TeamTrialOwnerAwaitingDowngradePresenter) this.f26679d.getValue(this, f26674f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("teamTrialOwnerAwaitingDowngradeOopsScreenResultKey").j(getViewLifecycleOwner(), new f(new l() { // from class: fi.a1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialOwnerAwaitingDowngradeScreen.Df(this.f50020a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Df(TeamTrialOwnerAwaitingDowngradeScreen teamTrialOwnerAwaitingDowngradeScreen, u0 u0Var, Boolean bool) {
        teamTrialOwnerAwaitingDowngradeScreen.Bf().t2();
        u0Var.f("teamTrialOwnerAwaitingDowngradeOopsScreenResultKey");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        Af().f72164g.setCallback(new ProgressWheel.b() { // from class: fi.z0
            @Override // com.pnikosis.materialishprogress.ProgressWheel.b
            public final void c(float f10) {
                TeamTrialOwnerAwaitingDowngradeScreen.Ff(this.f50055a, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(TeamTrialOwnerAwaitingDowngradeScreen teamTrialOwnerAwaitingDowngradeScreen, float f10) {
        if (f10 == 1.0f) {
            teamTrialOwnerAwaitingDowngradeScreen.Af().f72164g.setCallback(null);
            teamTrialOwnerAwaitingDowngradeScreen.Bf().s2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gf(TeamTrialOwnerAwaitingDowngradeScreen teamTrialOwnerAwaitingDowngradeScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamTrialOwnerAwaitingDowngradeScreen.Bf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamTrialOwnerAwaitingDowngradePresenter Hf(TeamTrialOwnerAwaitingDowngradeScreen teamTrialOwnerAwaitingDowngradeScreen) {
        DowngradeToPlanType downgradeToPlanType = teamTrialOwnerAwaitingDowngradeScreen.zf().getDowngradeToPlanType();
        t.e(downgradeToPlanType, "getDowngradeToPlanType(...)");
        return new TeamTrialOwnerAwaitingDowngradePresenter(downgradeToPlanType);
    }

    private final void yf() {
        z0.F0(Af().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final TeamTrialOwnerAwaitingDowngradeScreenArgs zf() {
        return (TeamTrialOwnerAwaitingDowngradeScreenArgs) this.f26678c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.c1
    public void Nb() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.c1
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.c1
    public void f() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.b1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialOwnerAwaitingDowngradeScreen.Gf(this.f50023a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26677b = e0VarB;
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
        this.f26676a = c8.c(layoutInflater, viewGroup, false);
        yf();
        ConstraintLayout constraintLayoutB = Af().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26676a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26677b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.c1
    public void q0() {
        bh.a.b(this, new e(null));
    }
}

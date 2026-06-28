package com.server.auditor.ssh.client.fragments.team;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.x;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.team.RemoveTeamMembersConfirmationScreen;
import com.server.auditor.ssh.client.fragments.team.a;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.presenters.team.RemoveTeamMembersConfirmationScreenPresenter;
import iu.l;
import iu.p;
import java.util.Locale;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.q5;
import qu.k;
import ut.m0;
import ut.s;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveTeamMembersConfirmationScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.teamtrial.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26557e = {n0.g(new g0(RemoveTeamMembersConfirmationScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/RemoveTeamMembersConfirmationScreenPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26558f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q5 f26559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f26560b = new x(n0.b(RemoveTeamMembersConfirmationScreenArgs.class), new g(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f26562d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RemoveTeamMembersConfirmationScreen f26565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, zt.e eVar) {
            super(2, eVar);
            this.f26564b = endOfTeamTrialTargetAction;
            this.f26565c = removeTeamMembersConfirmationScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f26564b, this.f26565c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            au.b.f();
            if (this.f26563a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.f26564b;
            if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                string = this.f26565c.getString(R.string.remove_team_members_and_switch_to_starter_plan_description);
            } else {
                if (!(endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) && !(endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan) && !t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE)) {
                    throw new s();
                }
                string = this.f26565c.getString(R.string.remove_team_members_with_active_pro_plan_description);
            }
            t.c(string);
            this.f26565c.Jf().f73643h.setText(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26566a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, zt.e eVar) {
            super(2, eVar);
            this.f26568c = endOfTeamTrialTargetAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RemoveTeamMembersConfirmationScreen.this.new b(this.f26568c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RemoveTeamMembersConfirmationScreen.this.Pf();
            RemoveTeamMembersConfirmationScreen.this.Lf(this.f26568c);
            RemoveTeamMembersConfirmationScreen.this.Vf(this.f26568c);
            RemoveTeamMembersConfirmationScreen.this.Mf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26569a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RemoveTeamMembersConfirmationScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26569a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(RemoveTeamMembersConfirmationScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, zt.e eVar) {
            super(2, eVar);
            this.f26573c = endOfTeamTrialTargetAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RemoveTeamMembersConfirmationScreen.this.new d(this.f26573c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(RemoveTeamMembersConfirmationScreen.this);
            m0VarA.U(R.id.endOfTrialScreen, false);
            d0 d0VarS = m0VarA.s();
            if (d0VarS != null && (u0VarJ = d0VarS.j()) != null) {
                u0VarJ.h("TEAM_DEACTIVATION_RESULT_KEY", this.f26573c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RemoveTeamMembersConfirmationScreen f26576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, zt.e eVar) {
            super(2, eVar);
            this.f26575b = endOfTeamTrialTargetAction;
            this.f26576c = removeTeamMembersConfirmationScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f26575b, this.f26576c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26574a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.C0417a c0417aA = com.server.auditor.ssh.client.fragments.team.a.a(this.f26575b);
            t.e(c0417aA, "actionRemoveTeamMembersC…vationProgressScreen(...)");
            androidx.navigation.fragment.c.a(this.f26576c).O(c0417aA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26577a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f26579c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RemoveTeamMembersConfirmationScreen.this.new f(this.f26579c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26577a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = RemoveTeamMembersConfirmationScreen.this.getString(R.string.team_plan_name);
            t.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            t.e(lowerCase, "toLowerCase(...)");
            RemoveTeamMembersConfirmationScreen.this.Uf(RemoveTeamMembersConfirmationScreen.this.Sf(this.f26579c, lowerCase));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26580a;

        public g(Fragment fragment) {
            this.f26580a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f26580a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f26580a + " has null arguments");
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EndOfTeamTrialTargetAction f26582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RemoveTeamMembersConfirmationScreen f26583c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction, RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, zt.e eVar) {
            super(2, eVar);
            this.f26582b = endOfTeamTrialTargetAction;
            this.f26583c = removeTeamMembersConfirmationScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f26582b, this.f26583c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            au.b.f();
            if (this.f26581a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.f26582b;
            if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                string = this.f26583c.getString(R.string.switch_to_starter_plan);
            } else if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) {
                string = this.f26583c.getString(R.string.switch_to_pro_plan_with_price, ((EndOfTeamTrialTargetAction.BuyProMonthlyPlan) this.f26582b).getPrice());
            } else if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan) {
                string = this.f26583c.getString(R.string.switch_to_pro_plan_with_price, ((EndOfTeamTrialTargetAction.BuyProYearlyPlan) this.f26582b).getPrice());
            } else {
                if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE)) {
                    throw new s();
                }
                string = this.f26583c.getString(R.string.switch_to_pro_plan);
            }
            t.c(string);
            this.f26583c.Jf().f73648m.setText(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public RemoveTeamMembersConfirmationScreen() {
        iu.a aVar = new iu.a() { // from class: fi.s
            @Override // iu.a
            public final Object a() {
                return RemoveTeamMembersConfirmationScreen.Tf(this.f50044a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26561c = new MoxyKtxDelegate(mvpDelegate, RemoveTeamMembersConfirmationScreenPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Ff() {
        z0.F0(Jf().b(), new o4.i0() { // from class: fi.w
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return RemoveTeamMembersConfirmationScreen.Gf(view, a2Var);
            }
        });
        z0.F0(Jf().f73639d, new o4.i0() { // from class: fi.x
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return RemoveTeamMembersConfirmationScreen.Hf(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Gf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Hf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final RemoveTeamMembersConfirmationScreenArgs If() {
        return (RemoveTeamMembersConfirmationScreenArgs) this.f26560b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q5 Jf() {
        q5 q5Var = this.f26559a;
        if (q5Var != null) {
            return q5Var;
        }
        throw new IllegalStateException();
    }

    private final RemoveTeamMembersConfirmationScreenPresenter Kf() {
        return (RemoveTeamMembersConfirmationScreenPresenter) this.f26561c.getValue(this, f26557e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        bh.a.b(this, new a(endOfTeamTrialTargetAction, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Jf().f73640e.setOnClickListener(new View.OnClickListener() { // from class: fi.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemoveTeamMembersConfirmationScreen.Nf(this.f50049a, view);
            }
        });
        Jf().f73648m.setOnClickListener(new View.OnClickListener() { // from class: fi.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemoveTeamMembersConfirmationScreen.Of(this.f50050a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, View view) {
        removeTeamMembersConfirmationScreen.Kf().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, View view) {
        removeTeamMembersConfirmationScreen.Kf().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf() {
        Jf().f73637b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: fi.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemoveTeamMembersConfirmationScreen.Qf(this.f50053a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qf(RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, View view) {
        removeTeamMembersConfirmationScreen.Kf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Rf(RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        removeTeamMembersConfirmationScreen.Kf().u2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Sf(String str, String str2) {
        if (str == null || su.s.m0(str)) {
            String string = getString(R.string.billing_purchase_url, "https://account.termius.com/");
            t.c(string);
            return string;
        }
        String string2 = getString(R.string.billing_purchase_plan_url, "https://account.termius.com/", Uri.encode(str), str2);
        t.c(string2);
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoveTeamMembersConfirmationScreenPresenter Tf(RemoveTeamMembersConfirmationScreen removeTeamMembersConfirmationScreen) {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = removeTeamMembersConfirmationScreen.If().getEndOfTeamTrialTargetAction();
        t.e(endOfTeamTrialTargetAction, "getEndOfTeamTrialTargetAction(...)");
        return new RemoveTeamMembersConfirmationScreenPresenter(endOfTeamTrialTargetAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Vf(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        bh.a.b(this, new h(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void D1(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        bh.a.b(this, new b(endOfTeamTrialTargetAction, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        bh.a.b(this, new e(endOfTeamTrialTargetAction, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void a0(String str) {
        bh.a.b(this, new f(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void n2(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        bh.a.b(this, new d(endOfTeamTrialTargetAction, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.t
            @Override // iu.l
            public final Object invoke(Object obj) {
                return RemoveTeamMembersConfirmationScreen.Rf(this.f50047a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26562d = e0VarB;
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
        this.f26559a = q5.c(layoutInflater, viewGroup, false);
        Ff();
        ConstraintLayout constraintLayoutB = Jf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26559a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26562d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

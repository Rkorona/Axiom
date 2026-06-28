package com.server.auditor.ssh.client.fragments.team;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.a1;
import com.server.auditor.ssh.client.fragments.team.TeamTrialOwnerAwaitingDowngradeOopsScreen;
import com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradeOopsPresenter;
import fi.x0;
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
import qg.b8;
import qu.k;
import tp.c0;
import tp.w0;
import ut.i;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class TeamTrialOwnerAwaitingDowngradeOopsScreen extends MvpAppCompatFragment implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b8 f26658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f26660c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26656e = {n0.g(new g0(TeamTrialOwnerAwaitingDowngradeOopsScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/TeamTrialOwnerAwaitingDowngradeOopsPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26655d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26657f = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26661a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeOopsScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26661a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = TeamTrialOwnerAwaitingDowngradeOopsScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c extends ClickableSpan {
        c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            t.f(view, "widget");
            TeamTrialOwnerAwaitingDowngradeOopsScreen.this.Hf().s2();
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26664a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeOopsScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26664a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamTrialOwnerAwaitingDowngradeOopsScreen.this.Of();
            TeamTrialOwnerAwaitingDowngradeOopsScreen.this.If();
            TeamTrialOwnerAwaitingDowngradeOopsScreen.this.Lf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26666a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeOopsScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26666a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = x0.a();
            t.e(k1VarA, "actionTeamTrialOwnerAwai…nToAccountLogoutFlow(...)");
            androidx.navigation.fragment.c.a(TeamTrialOwnerAwaitingDowngradeOopsScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26668a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeOopsScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26668a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamTrialOwnerAwaitingDowngradeOopsScreen teamTrialOwnerAwaitingDowngradeOopsScreen = TeamTrialOwnerAwaitingDowngradeOopsScreen.this;
            String string = teamTrialOwnerAwaitingDowngradeOopsScreen.getString(R.string.termius_contact_support_page_url);
            t.e(string, "getString(...)");
            teamTrialOwnerAwaitingDowngradeOopsScreen.Rf(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26670a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradeOopsScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26670a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(TeamTrialOwnerAwaitingDowngradeOopsScreen.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("teamTrialOwnerAwaitingDowngradeOopsScreenResultKey", kotlin.coroutines.jvm.internal.b.a(true));
            }
            m0VarA.S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h implements l0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26672a;

        h(l lVar) {
            t.f(lVar, "function");
            this.f26672a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26672a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f26672a;
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

    public TeamTrialOwnerAwaitingDowngradeOopsScreen() {
        iu.a aVar = new iu.a() { // from class: fi.u0
            @Override // iu.a
            public final Object a() {
                return TeamTrialOwnerAwaitingDowngradeOopsScreen.Qf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26660c = new MoxyKtxDelegate(mvpDelegate, TeamTrialOwnerAwaitingDowngradeOopsPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Df() {
        z0.F0(Gf().b(), new o4.i0() { // from class: fi.q0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialOwnerAwaitingDowngradeOopsScreen.Ef(view, a2Var);
            }
        });
        z0.F0(Gf().f72040c, new o4.i0() { // from class: fi.r0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return TeamTrialOwnerAwaitingDowngradeOopsScreen.Ff(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        t.f(view, "view");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ff(View view, a2 a2Var) {
        t.f(view, "view");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final b8 Gf() {
        b8 b8Var = this.f26658a;
        if (b8Var != null) {
            return b8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeamTrialOwnerAwaitingDowngradeOopsPresenter Hf() {
        return (TeamTrialOwnerAwaitingDowngradeOopsPresenter) this.f26660c.getValue(this, f26656e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Context contextRequireContext = requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        int i10 = c0.i(contextRequireContext, R.attr.colorPrimary);
        Gf().f72042e.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = Gf().f72042e;
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.we_couldnt_process_your_request_retry_or_contact_support));
        String string = getString(R.string.we_couldnt_process_your_request_retry_or_contact_support_highlight_helper);
        t.e(string, "getString(...)");
        textView.setText(aVar.a(spannableStringBuilder, string, new UnderlineSpan(), new StyleSpan(1), new ForegroundColorSpan(i10), new c()));
    }

    private final void Jf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("CONFIRM_LOGOUT_SCREEN_RESULT_KEY").j(getViewLifecycleOwner(), new h(new l() { // from class: fi.s0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialOwnerAwaitingDowngradeOopsScreen.Kf(this.f50045a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Kf(TeamTrialOwnerAwaitingDowngradeOopsScreen teamTrialOwnerAwaitingDowngradeOopsScreen, u0 u0Var, Boolean bool) {
        TeamTrialOwnerAwaitingDowngradeOopsPresenter teamTrialOwnerAwaitingDowngradeOopsPresenterHf = teamTrialOwnerAwaitingDowngradeOopsScreen.Hf();
        t.c(bool);
        teamTrialOwnerAwaitingDowngradeOopsPresenterHf.r2(bool.booleanValue());
        u0Var.f("CONFIRM_LOGOUT_SCREEN_RESULT_KEY");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Gf().f72046i.setOnClickListener(new View.OnClickListener() { // from class: fi.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialOwnerAwaitingDowngradeOopsScreen.Mf(this.f50051a, view);
            }
        });
        Gf().f72045h.setOnClickListener(new View.OnClickListener() { // from class: fi.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeamTrialOwnerAwaitingDowngradeOopsScreen.Nf(this.f50052a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(TeamTrialOwnerAwaitingDowngradeOopsScreen teamTrialOwnerAwaitingDowngradeOopsScreen, View view) {
        teamTrialOwnerAwaitingDowngradeOopsScreen.Hf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(TeamTrialOwnerAwaitingDowngradeOopsScreen teamTrialOwnerAwaitingDowngradeOopsScreen, View view) {
        teamTrialOwnerAwaitingDowngradeOopsScreen.Hf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of() {
        Jf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(TeamTrialOwnerAwaitingDowngradeOopsScreen teamTrialOwnerAwaitingDowngradeOopsScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        teamTrialOwnerAwaitingDowngradeOopsScreen.Hf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeamTrialOwnerAwaitingDowngradeOopsPresenter Qf() {
        return new TeamTrialOwnerAwaitingDowngradeOopsPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.a1
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a1
    public void d1() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a1
    public void f() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.t0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return TeamTrialOwnerAwaitingDowngradeOopsScreen.Pf(this.f50048a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26659b = e0VarB;
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
        this.f26658a = b8.c(layoutInflater, viewGroup, false);
        Df();
        ConstraintLayout constraintLayoutB = Gf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26658a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26659b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.a1
    public void q() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.a1
    public void x8() {
        bh.a.b(this, new g(null));
    }
}

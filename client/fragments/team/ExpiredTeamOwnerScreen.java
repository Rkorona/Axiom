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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.t0;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.y0;
import com.server.auditor.ssh.client.fragments.team.ExpiredTeamOwnerScreen;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.team.ExpiredTeamOwnerPresenter;
import fi.r;
import iu.l;
import iu.p;
import java.util.Locale;
import ju.g0;
import ju.n0;
import ju.t;
import ju.u;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.d2;
import qu.k;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpiredTeamOwnerScreen extends MvpAppCompatFragment implements y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26534e = {n0.g(new g0(ExpiredTeamOwnerScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/ExpiredTeamOwnerPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26535f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d2 f26536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f26537b = t0.b(this, n0.b(EndOfTrialViewModel.class), new g(this), new h(null, this), new i(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f26538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26539d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26540a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26540a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ExpiredTeamOwnerScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26542a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamOwnerScreen.this.Lf();
            ExpiredTeamOwnerScreen.this.Of();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26544a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26544a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = r.a();
            t.e(k1VarA, "actionExpiredTeamOwnerSc…nToAccountLogoutFlow(...)");
            androidx.navigation.fragment.c.a(ExpiredTeamOwnerScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26546a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f26548c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerScreen.this.new d(this.f26548c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26546a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = ExpiredTeamOwnerScreen.this.getString(R.string.team_plan_name);
            t.e(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            t.e(lowerCase, "toLowerCase(...)");
            ExpiredTeamOwnerScreen.this.Uf(ExpiredTeamOwnerScreen.this.Sf(this.f26548c, lowerCase));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26549a;

        e(l lVar) {
            t.f(lVar, "function");
            this.f26549a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26549a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26549a;
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

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26550a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f26552c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerScreen.this.new f(this.f26552c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            new be.b(ExpiredTeamOwnerScreen.this.requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(this.f26552c).setPositiveButton(android.R.string.ok, null).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26553a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f26553a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26553a.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26555b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26554a = aVar;
            this.f26555b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26554a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26555b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class i extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f26556a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26556a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ExpiredTeamOwnerScreen() {
        iu.a aVar = new iu.a() { // from class: fi.n
            @Override // iu.a
            public final Object a() {
                return ExpiredTeamOwnerScreen.Tf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26539d = new MoxyKtxDelegate(mvpDelegate, ExpiredTeamOwnerPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Df() {
        z0.F0(Hf().b(), new o4.i0() { // from class: fi.o
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ExpiredTeamOwnerScreen.Ef(view, a2Var);
            }
        });
        z0.F0(Hf().f72212c, new o4.i0() { // from class: fi.p
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ExpiredTeamOwnerScreen.Ff(view, a2Var);
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
        return (EndOfTrialViewModel) this.f26537b.getValue();
    }

    private final d2 Hf() {
        d2 d2Var = this.f26536a;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException();
    }

    private final ExpiredTeamOwnerPresenter If() {
        return (ExpiredTeamOwnerPresenter) this.f26539d.getValue(this, f26534e[0]);
    }

    private final void Jf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("CONFIRM_LOGOUT_SCREEN_RESULT_KEY").j(getViewLifecycleOwner(), new e(new l() { // from class: fi.q
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamOwnerScreen.Kf(this.f50042a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Kf(ExpiredTeamOwnerScreen expiredTeamOwnerScreen, u0 u0Var, Boolean bool) {
        ExpiredTeamOwnerPresenter expiredTeamOwnerPresenterIf = expiredTeamOwnerScreen.If();
        t.c(bool);
        expiredTeamOwnerPresenterIf.t2(bool.booleanValue());
        u0Var.f("CONFIRM_LOGOUT_SCREEN_RESULT_KEY");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Hf().f72220k.setOnClickListener(new View.OnClickListener() { // from class: fi.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpiredTeamOwnerScreen.Mf(this.f50035a, view);
            }
        });
        Hf().f72219j.setOnClickListener(new View.OnClickListener() { // from class: fi.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpiredTeamOwnerScreen.Nf(this.f50037a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(ExpiredTeamOwnerScreen expiredTeamOwnerScreen, View view) {
        expiredTeamOwnerScreen.If().w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(ExpiredTeamOwnerScreen expiredTeamOwnerScreen, View view) {
        expiredTeamOwnerScreen.If().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of() {
        Pf();
        Jf();
    }

    private final void Pf() {
        Gf().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new e(new l() { // from class: fi.m
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamOwnerScreen.Qf(this.f50039a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Qf(ExpiredTeamOwnerScreen expiredTeamOwnerScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            expiredTeamOwnerScreen.If().x2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            expiredTeamOwnerScreen.If().y2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Rf(ExpiredTeamOwnerScreen expiredTeamOwnerScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        expiredTeamOwnerScreen.If().s2();
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
    public static final ExpiredTeamOwnerPresenter Tf() {
        return new ExpiredTeamOwnerPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            If().u2(str);
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.y0
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y0
    public void a0(String str) {
        bh.a.b(this, new d(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y0
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y0
    public void i1(String str) {
        t.f(str, "url");
        bh.a.b(this, new f(str, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.j
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamOwnerScreen.Rf(this.f50033a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26538c = e0VarB;
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
        this.f26536a = d2.c(layoutInflater, viewGroup, false);
        Df();
        ConstraintLayout constraintLayoutB = Hf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26536a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26538c;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.y0
    public void q() {
        bh.a.b(this, new c(null));
    }
}

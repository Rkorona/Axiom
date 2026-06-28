package com.server.auditor.ssh.client.fragments.team;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
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
import com.server.auditor.ssh.client.contracts.w0;
import com.server.auditor.ssh.client.fragments.team.ExpiredTeamMemberScreen;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.team.ExpiredTeamMemberPresenter;
import iu.l;
import iu.p;
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
import qg.c2;
import qu.k;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpiredTeamMemberScreen extends MvpAppCompatFragment implements w0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26511e = {n0.g(new g0(ExpiredTeamMemberScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/team/ExpiredTeamMemberPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26512f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c2 f26513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f26514b = t0.b(this, n0.b(EndOfTrialViewModel.class), new g(this), new h(null, this), new i(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f26515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26516d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26517a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamMemberScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ExpiredTeamMemberScreen.this.requireActivity();
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
        int f26519a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f26521c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamMemberScreen.this.new b(this.f26521c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26519a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(ExpiredTeamMemberScreen.this.getString(R.string.mailto_prefix)));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f26521c});
            intent.putExtra("android.intent.extra.SUBJECT", ExpiredTeamMemberScreen.this.getString(R.string.team_subscription_expired_email_subject));
            try {
                ExpiredTeamMemberScreen.this.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                ExpiredTeamMemberScreen.this.If().t2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f26524c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamMemberScreen.this.new c(this.f26524c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26522a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamMemberScreen.this.Lf(this.f26524c);
            ExpiredTeamMemberScreen.this.Mf();
            ExpiredTeamMemberScreen.this.Pf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26525a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamMemberScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26525a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = fi.i.a();
            t.e(k1VarA, "actionExpiredTeamMemberS…nToAccountLogoutFlow(...)");
            androidx.navigation.fragment.c.a(ExpiredTeamMemberScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26527a;

        e(l lVar) {
            t.f(lVar, "function");
            this.f26527a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26527a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26527a;
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
        int f26528a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamMemberScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26528a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Toast.makeText(ExpiredTeamMemberScreen.this.requireContext(), R.string.no_email_client_found_on_this_device, 0).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f26530a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26530a.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26531a = aVar;
            this.f26532b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26531a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26532b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class i extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f26533a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26533a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ExpiredTeamMemberScreen() {
        iu.a aVar = new iu.a() { // from class: fi.b
            @Override // iu.a
            public final Object a() {
                return ExpiredTeamMemberScreen.Tf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26516d = new MoxyKtxDelegate(mvpDelegate, ExpiredTeamMemberPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Df() {
        z0.F0(Hf().b(), new o4.i0() { // from class: fi.c
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ExpiredTeamMemberScreen.Ef(view, a2Var);
            }
        });
        z0.F0(Hf().f72088c, new o4.i0() { // from class: fi.d
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ExpiredTeamMemberScreen.Ff(view, a2Var);
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
        return (EndOfTrialViewModel) this.f26514b.getValue();
    }

    private final c2 Hf() {
        c2 c2Var = this.f26513a;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpiredTeamMemberPresenter If() {
        return (ExpiredTeamMemberPresenter) this.f26516d.getValue(this, f26511e[0]);
    }

    private final void Jf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("CONFIRM_LOGOUT_SCREEN_RESULT_KEY").j(getViewLifecycleOwner(), new e(new l() { // from class: fi.a
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamMemberScreen.Kf(this.f50016a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Kf(ExpiredTeamMemberScreen expiredTeamMemberScreen, u0 u0Var, Boolean bool) {
        ExpiredTeamMemberPresenter expiredTeamMemberPresenterIf = expiredTeamMemberScreen.If();
        t.c(bool);
        expiredTeamMemberPresenterIf.s2(bool.booleanValue());
        u0Var.f("CONFIRM_LOGOUT_SCREEN_RESULT_KEY");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf(String str) {
        Hf().f72092g.setText(getString(R.string.expired_team_member_description, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Hf().f72096k.setOnClickListener(new View.OnClickListener() { // from class: fi.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpiredTeamMemberScreen.Nf(this.f50026a, view);
            }
        });
        Hf().f72095j.setOnClickListener(new View.OnClickListener() { // from class: fi.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpiredTeamMemberScreen.Of(this.f50028a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(ExpiredTeamMemberScreen expiredTeamMemberScreen, View view) {
        expiredTeamMemberScreen.If().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(ExpiredTeamMemberScreen expiredTeamMemberScreen, View view) {
        expiredTeamMemberScreen.If().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf() {
        Qf();
        Jf();
    }

    private final void Qf() {
        Gf().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new e(new l() { // from class: fi.h
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamMemberScreen.Rf(this.f50032a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Rf(ExpiredTeamMemberScreen expiredTeamMemberScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            expiredTeamMemberScreen.If().w2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            expiredTeamMemberScreen.If().x2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Sf(ExpiredTeamMemberScreen expiredTeamMemberScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        expiredTeamMemberScreen.If().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExpiredTeamMemberPresenter Tf() {
        return new ExpiredTeamMemberPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.w0
    public void K4() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w0
    public void e0(String str) {
        t.f(str, "teamName");
        bh.a.b(this, new c(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w0
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: fi.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredTeamMemberScreen.Sf(this.f50030a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f26515c = e0VarB;
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
        this.f26513a = c2.c(layoutInflater, viewGroup, false);
        Df();
        ConstraintLayout constraintLayoutB = Hf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26513a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26515c;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.w0
    public void pb(String str) {
        t.f(str, "teamOwnerEmail");
        bh.a.b(this, new b(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w0
    public void q() {
        bh.a.b(this, new d(null));
    }
}

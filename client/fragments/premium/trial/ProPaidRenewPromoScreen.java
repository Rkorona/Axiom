package com.server.auditor.ssh.client.fragments.premium.trial;

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
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.u1;
import com.server.auditor.ssh.client.fragments.premium.trial.ProPaidRenewPromoScreen;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.premium.trial.ProPaidRenewPromoScreenPresenter;
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
import qg.x4;
import qu.k;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ProPaidRenewPromoScreen extends MvpAppCompatFragment implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x4 f26006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f26007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f26008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f26009d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f26004f = {n0.g(new g0(ProPaidRenewPromoScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/premium/trial/ProPaidRenewPromoScreenPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26003e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26005u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26010a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProPaidRenewPromoScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26010a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ProPaidRenewPromoScreen.this.requireActivity();
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
        int f26012a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProPaidRenewPromoScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26012a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProPaidRenewPromoScreen.this.Lf();
            ProPaidRenewPromoScreen.this.Nf();
            ProPaidRenewPromoScreen.this.If();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26014a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProPaidRenewPromoScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26014a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(ProPaidRenewPromoScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26016a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProPaidRenewPromoScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26016a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(ProPaidRenewPromoScreen.this);
            m0VarA.U(R.id.endOfTrialScreen, false);
            d0 d0VarS = m0VarA.s();
            if (d0VarS != null && (u0VarJ = d0VarS.j()) != null) {
                u0VarJ.h("PRO_PAID_RENEW_RESULT_KEY", null);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26018a;

        f(l lVar) {
            t.f(lVar, "function");
            this.f26018a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26018a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26018a;
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

    public static final class g extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f26019a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26019a.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26020a = aVar;
            this.f26021b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26020a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26021b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class i extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f26022a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26022a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ProPaidRenewPromoScreen() {
        iu.a aVar = new iu.a() { // from class: wh.j
            @Override // iu.a
            public final Object a() {
                return ProPaidRenewPromoScreen.Qf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26007b = new MoxyKtxDelegate(mvpDelegate, ProPaidRenewPromoScreenPresenter.class.getName() + ".presenter", aVar);
        this.f26008c = t0.b(this, n0.b(EndOfTrialViewModel.class), new g(this), new h(null, this), new i(this));
    }

    private final void Cf() {
        z0.F0(Gf().b(), new o4.i0() { // from class: wh.h
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProPaidRenewPromoScreen.Df(view, a2Var);
            }
        });
        z0.F0(Gf().f74351f, new o4.i0() { // from class: wh.i
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProPaidRenewPromoScreen.Ef(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Df(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final EndOfTrialViewModel Ff() {
        return (EndOfTrialViewModel) this.f26008c.getValue();
    }

    private final x4 Gf() {
        x4 x4Var = this.f26006a;
        if (x4Var != null) {
            return x4Var;
        }
        throw new IllegalStateException();
    }

    private final ProPaidRenewPromoScreenPresenter Hf() {
        return (ProPaidRenewPromoScreenPresenter) this.f26007b.getValue(this, f26004f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Gf().f74361p.setOnClickListener(new View.OnClickListener() { // from class: wh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProPaidRenewPromoScreen.Jf(this.f84943a, view);
            }
        });
        Gf().f74357l.setOnClickListener(new View.OnClickListener() { // from class: wh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProPaidRenewPromoScreen.Kf(this.f84944a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(ProPaidRenewPromoScreen proPaidRenewPromoScreen, View view) {
        proPaidRenewPromoScreen.Hf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(ProPaidRenewPromoScreen proPaidRenewPromoScreen, View view) {
        proPaidRenewPromoScreen.Hf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Ff().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new f(new l() { // from class: wh.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProPaidRenewPromoScreen.Mf(this.f84942a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Mf(ProPaidRenewPromoScreen proPaidRenewPromoScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            proPaidRenewPromoScreen.Hf().v2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            proPaidRenewPromoScreen.Hf().w2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        Gf().f74347b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: wh.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProPaidRenewPromoScreen.Of(this.f84945a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(ProPaidRenewPromoScreen proPaidRenewPromoScreen, View view) {
        proPaidRenewPromoScreen.Hf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(ProPaidRenewPromoScreen proPaidRenewPromoScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        proPaidRenewPromoScreen.Hf().s2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProPaidRenewPromoScreenPresenter Qf() {
        return new ProPaidRenewPromoScreenPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.u1
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u1
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u1
    public void f() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u1
    public void o() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: wh.n
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProPaidRenewPromoScreen.Pf(this.f84946a, (e0) obj);
            }
        }, 2, null);
        this.f26009d = e0VarB;
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
        this.f26006a = x4.c(getLayoutInflater(), viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Gf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26006a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26009d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

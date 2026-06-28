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
import androidx.navigation.k1;
import com.server.auditor.ssh.client.contracts.w1;
import com.server.auditor.ssh.client.fragments.premium.trial.ProTrialExtensionPromotion;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.premium.trial.ProTrialExtensionPromotionPresenter;
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
import qg.y4;
import qu.k;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wh.w;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ProTrialExtensionPromotion extends MvpAppCompatFragment implements w1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26023e = {n0.g(new g0(ProTrialExtensionPromotion.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/premium/trial/ProTrialExtensionPromotionPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26024f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y4 f26025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f26026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f26027c = t0.b(this, n0.b(EndOfTrialViewModel.class), new g(this), new h(null, this), new i(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f26028d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26029a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionPromotion.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ProTrialExtensionPromotion.this.requireActivity();
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
        int f26031a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionPromotion.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26031a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProTrialExtensionPromotion.this.Lf();
            ProTrialExtensionPromotion.this.Nf();
            ProTrialExtensionPromotion.this.If();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26033a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionPromotion.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26033a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(ProTrialExtensionPromotion.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26035a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionPromotion.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = w.a();
            t.e(k1VarA, "actionProTrialExtensionP…llyDeactivatedScreen(...)");
            androidx.navigation.fragment.c.a(ProTrialExtensionPromotion.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26037a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionPromotion.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26037a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarB = w.b();
            t.e(k1VarB, "actionProTrialExtensionP…rialExtensionRequest(...)");
            androidx.navigation.fragment.c.a(ProTrialExtensionPromotion.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26039a;

        f(l lVar) {
            t.f(lVar, "function");
            this.f26039a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26039a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f26039a;
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
        final /* synthetic */ Fragment f26040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f26040a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26040a.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26041a = aVar;
            this.f26042b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26041a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26042b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class i extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f26043a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26043a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ProTrialExtensionPromotion() {
        iu.a aVar = new iu.a() { // from class: wh.q
            @Override // iu.a
            public final Object a() {
                return ProTrialExtensionPromotion.Qf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26028d = new MoxyKtxDelegate(mvpDelegate, ProTrialExtensionPromotionPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Cf() {
        z0.F0(Gf().b(), new o4.i0() { // from class: wh.s
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProTrialExtensionPromotion.Df(view, a2Var);
            }
        });
        z0.F0(Gf().f74451f, new o4.i0() { // from class: wh.t
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProTrialExtensionPromotion.Ef(view, a2Var);
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
        return (EndOfTrialViewModel) this.f26027c.getValue();
    }

    private final y4 Gf() {
        y4 y4Var = this.f26025a;
        if (y4Var != null) {
            return y4Var;
        }
        throw new IllegalStateException();
    }

    private final ProTrialExtensionPromotionPresenter Hf() {
        return (ProTrialExtensionPromotionPresenter) this.f26028d.getValue(this, f26023e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Gf().f74456k.setOnClickListener(new View.OnClickListener() { // from class: wh.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProTrialExtensionPromotion.Jf(this.f84947a, view);
            }
        });
        Gf().f74460o.setOnClickListener(new View.OnClickListener() { // from class: wh.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProTrialExtensionPromotion.Kf(this.f84948a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(ProTrialExtensionPromotion proTrialExtensionPromotion, View view) {
        proTrialExtensionPromotion.Hf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(ProTrialExtensionPromotion proTrialExtensionPromotion, View view) {
        proTrialExtensionPromotion.Hf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Ff().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new f(new l() { // from class: wh.u
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProTrialExtensionPromotion.Mf(this.f84950a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Mf(ProTrialExtensionPromotion proTrialExtensionPromotion, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            proTrialExtensionPromotion.Hf().u2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            proTrialExtensionPromotion.Hf().v2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        Gf().f74447b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: wh.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProTrialExtensionPromotion.Of(this.f84949a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Of(ProTrialExtensionPromotion proTrialExtensionPromotion, View view) {
        proTrialExtensionPromotion.Hf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(ProTrialExtensionPromotion proTrialExtensionPromotion, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        proTrialExtensionPromotion.Hf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProTrialExtensionPromotionPresenter Qf() {
        return new ProTrialExtensionPromotionPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.w1
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w1
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w1
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.w1
    public void i4() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: wh.v
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProTrialExtensionPromotion.Pf(this.f84951a, (e0) obj);
            }
        }, 2, null);
        this.f26026b = e0VarB;
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
        this.f26025a = y4.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Gf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26025a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26026b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.w1
    public void r2() {
        bh.a.b(this, new d(null));
    }
}

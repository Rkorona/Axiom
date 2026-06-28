package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.k1;
import c2.o1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.e1;
import com.server.auditor.ssh.client.fragments.FreeOpenAiPromotionScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginActivity;
import com.server.auditor.ssh.client.fragments.loginregistration.SignUpChooserScreenArgs;
import com.server.auditor.ssh.client.fragments.m;
import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import com.server.auditor.ssh.client.presenters.FreeOpenAiPromotionPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.i2;
import tp.c0;
import tp.w0;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class FreeOpenAiPromotionScreen extends MvpAppCompatFragment implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i2 f23937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f23938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f23939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g.b f23940d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f23935f = {n0.g(new g0(FreeOpenAiPromotionScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/FreeOpenAiPromotionPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23934e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f23936u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b implements g.a, ju.n {
        b() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(ActivityResult activityResult) {
            ju.t.f(activityResult, "p0");
            FreeOpenAiPromotionScreen.this.Hf(activityResult);
        }

        @Override // ju.n
        public final ut.i c() {
            return new ju.q(1, FreeOpenAiPromotionScreen.this, FreeOpenAiPromotionScreen.class, "onAuthenticationFlowResultReceived", "onAuthenticationFlowResultReceived(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof ju.n)) {
                return ju.t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, zt.e eVar) {
            super(2, eVar);
            this.f23944c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return FreeOpenAiPromotionScreen.this.new c(this.f23944c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23942a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = FreeOpenAiPromotionScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(this.f23944c);
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23945a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return FreeOpenAiPromotionScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23945a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FreeOpenAiPromotionScreen.this.zf();
            FreeOpenAiPromotionScreen.this.Df();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23947a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return FreeOpenAiPromotionScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23947a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent(FreeOpenAiPromotionScreen.this.requireActivity(), (Class<?>) LoginActivity.class);
            intent.setAction("registrationFlowAction");
            Bundle bundle = new SignUpChooserScreenArgs.a(127, true, true).a().toBundle();
            ju.t.e(bundle, "toBundle(...)");
            intent.putExtras(bundle);
            FreeOpenAiPromotionScreen.this.f23940d.a(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionPeriodInfo f23950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FreeOpenAiPromotionScreen f23951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SubscriptionPeriodInfo subscriptionPeriodInfo, FreeOpenAiPromotionScreen freeOpenAiPromotionScreen, zt.e eVar) {
            super(2, eVar);
            this.f23950b = subscriptionPeriodInfo;
            this.f23951c = freeOpenAiPromotionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f23950b, this.f23951c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23949a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            m.a aVarA = m.a(this.f23950b);
            ju.t.e(aVarA, "actionFreeOpenAiPromotio…nAiAndGotTrialScreen(...)");
            androidx.navigation.fragment.c.a(this.f23951c).O(aVarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23952a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return FreeOpenAiPromotionScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23952a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            k1 k1VarB = m.b();
            ju.t.e(k1VarB, "actionFreeOpenAiPromotio…oEnabledOpenAiScreen(...)");
            androidx.navigation.fragment.c.a(FreeOpenAiPromotionScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public FreeOpenAiPromotionScreen() {
        iu.a aVar = new iu.a() { // from class: ch.z
            @Override // iu.a
            public final Object a() {
                return FreeOpenAiPromotionScreen.If();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f23939c = new MoxyKtxDelegate(mvpDelegate, FreeOpenAiPromotionPresenter.class.getName() + ".presenter", aVar);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new b());
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f23940d = bVarRegisterForActivityResult;
    }

    private final void Af() {
        z0.F0(Bf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final i2 Bf() {
        i2 i2Var = this.f23937a;
        if (i2Var != null) {
            return i2Var;
        }
        throw new IllegalStateException();
    }

    private final FreeOpenAiPromotionPresenter Cf() {
        return (FreeOpenAiPromotionPresenter) this.f23939c.getValue(this, f23935f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        Bf().f72713d.setOnClickListener(new View.OnClickListener() { // from class: ch.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreeOpenAiPromotionScreen.Ef(this.f15469a, view);
            }
        });
        Bf().f72714e.setOnClickListener(new View.OnClickListener() { // from class: ch.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FreeOpenAiPromotionScreen.Ff(this.f15475a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(FreeOpenAiPromotionScreen freeOpenAiPromotionScreen, View view) {
        freeOpenAiPromotionScreen.Cf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(FreeOpenAiPromotionScreen freeOpenAiPromotionScreen, View view) {
        freeOpenAiPromotionScreen.Cf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gf(FreeOpenAiPromotionScreen freeOpenAiPromotionScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        freeOpenAiPromotionScreen.Cf().t2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf(ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode == 1 || resultCode == 2) {
            Cf().s2(false);
        } else if (resultCode != 3) {
            Cf().r2();
        } else {
            Cf().s2(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreeOpenAiPromotionPresenter If() {
        return new FreeOpenAiPromotionPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf() {
        int iJ = o1.j(rk.b.y());
        int iJ2 = o1.j(rk.b.x());
        String string = getString(R.string.use_ai_in_terminal);
        ju.t.e(string, "getString(...)");
        Rect rect = new Rect();
        Bf().f72720k.getPaint().getTextBounds(string, 0, string.length(), rect);
        TextView textView = Bf().f72720k;
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        String string2 = getString(R.string.use_ai_in_terminal_highlight_helper);
        ju.t.e(string2, "getString(...)");
        textView.setText(aVar.a(spannableStringBuilder, string2, new pq.b(iJ, iJ2, rect)));
        TextView textView2 = Bf().f72717h;
        ju.t.e(textView2, "promptInfo");
        c0.c(textView2, iJ, iJ2);
    }

    @Override // com.server.auditor.ssh.client.contracts.e1
    public void Nc() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e1
    public void W2() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e1
    public void c() {
        bh.a.b(this, new d(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        this.f23938b = h0.a(requireActivity().getOnBackPressedDispatcher(), this, true, new iu.l() { // from class: ch.a0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return FreeOpenAiPromotionScreen.Gf(this.f15463a, (androidx.activity.e0) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f23937a = i2.c(layoutInflater, viewGroup, false);
        Af();
        ConstraintLayout constraintLayoutB = Bf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23937a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e0 e0Var = this.f23938b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }

    @Override // com.server.auditor.ssh.client.contracts.e1
    public void x(int i10) {
        bh.a.b(this, new c(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e1
    public void y6(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        ju.t.f(subscriptionPeriodInfo, "subscriptionPeriodInfo");
        bh.a.b(this, new f(subscriptionPeriodInfo, this, null));
    }
}

package com.server.auditor.ssh.client.fragments.premium.trial;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.premium.trial.EndOfTrialOopsScreen;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialOopsScreenPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.p1;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class EndOfTrialOopsScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.trials.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p1 f25994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f25995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25996c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f25992e = {n0.g(new g0(EndOfTrialOopsScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/premium/trial/EndOfTrialOopsScreenPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25991d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25993f = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25997a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EndOfTrialOopsScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25997a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialOopsScreen.this.Df();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25999a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EndOfTrialOopsScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25999a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(EndOfTrialOopsScreen.this).U(R.id.endOfTrialScreen, false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26001a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EndOfTrialOopsScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f26001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(EndOfTrialOopsScreen.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("retryLastRequestResultKey", null);
            }
            m0VarA.S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EndOfTrialOopsScreen() {
        iu.a aVar = new iu.a() { // from class: wh.a
            @Override // iu.a
            public final Object a() {
                return EndOfTrialOopsScreen.Hf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f25996c = new MoxyKtxDelegate(mvpDelegate, EndOfTrialOopsScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Af(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final p1 Bf() {
        p1 p1Var = this.f25994a;
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalStateException();
    }

    private final EndOfTrialOopsScreenPresenter Cf() {
        return (EndOfTrialOopsScreenPresenter) this.f25996c.getValue(this, f25992e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        Bf().f73491i.setOnClickListener(new View.OnClickListener() { // from class: wh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialOopsScreen.Ef(this.f84940a, view);
            }
        });
        Bf().f73484b.setOnClickListener(new View.OnClickListener() { // from class: wh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndOfTrialOopsScreen.Ff(this.f84941a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(EndOfTrialOopsScreen endOfTrialOopsScreen, View view) {
        endOfTrialOopsScreen.Cf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(EndOfTrialOopsScreen endOfTrialOopsScreen, View view) {
        endOfTrialOopsScreen.Cf().q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gf(EndOfTrialOopsScreen endOfTrialOopsScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        endOfTrialOopsScreen.Cf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EndOfTrialOopsScreenPresenter Hf() {
        return new EndOfTrialOopsScreenPresenter();
    }

    private final void yf() {
        z0.F0(Bf().b(), new o4.i0() { // from class: wh.b
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return EndOfTrialOopsScreen.zf(view, a2Var);
            }
        });
        z0.F0(Bf().f73486d, new o4.i0() { // from class: wh.c
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return EndOfTrialOopsScreen.Af(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 zf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.d
    public void H() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.d
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.trials.d
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: wh.d
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EndOfTrialOopsScreen.Gf(this.f84938a, (e0) obj);
            }
        }, 2, null);
        this.f25995b = e0VarB;
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
        this.f25994a = p1.c(layoutInflater, viewGroup, false);
        yf();
        ConstraintLayout constraintLayoutB = Bf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25994a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f25995b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

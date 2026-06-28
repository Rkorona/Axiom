package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.LogoutConfirmationScreen;
import com.server.auditor.ssh.client.presenters.account.LogoutConfirmationPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.a3;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutConfirmationScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24034d = {n0.g(new g0(LogoutConfirmationScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/LogoutConfirmationPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24035e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a3 f24036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f24038c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24039a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return LogoutConfirmationScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24039a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            LogoutConfirmationScreen.this.Cf();
            LogoutConfirmationScreen.this.Ef();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24041a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return LogoutConfirmationScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24041a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ig.f.q(LogoutConfirmationScreen.this.requireContext(), false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24043a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return LogoutConfirmationScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24043a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(LogoutConfirmationScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24045a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return LogoutConfirmationScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24045a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(LogoutConfirmationScreen.this).U(R.id.signInChooserScreen, true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public LogoutConfirmationScreen() {
        iu.a aVar = new iu.a() { // from class: ch.v0
            @Override // iu.a
            public final Object a() {
                return LogoutConfirmationScreen.Hf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24038c = new MoxyKtxDelegate(mvpDelegate, LogoutConfirmationPresenter.class.getName() + ".presenter", aVar);
    }

    private final a3 Af() {
        a3 a3Var = this.f24036a;
        if (a3Var != null) {
            return a3Var;
        }
        throw new IllegalStateException();
    }

    private final LogoutConfirmationPresenter Bf() {
        return (LogoutConfirmationPresenter) this.f24038c.getValue(this, f24034d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        Af().f71868b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: ch.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogoutConfirmationScreen.Df(this.f15640a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(LogoutConfirmationScreen logoutConfirmationScreen, View view) {
        logoutConfirmationScreen.Bf().q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        Af().f71874h.setOnClickListener(new View.OnClickListener() { // from class: ch.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogoutConfirmationScreen.Ff(this.f15629a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ff(LogoutConfirmationScreen logoutConfirmationScreen, View view) {
        logoutConfirmationScreen.Bf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Gf(LogoutConfirmationScreen logoutConfirmationScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        logoutConfirmationScreen.Bf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogoutConfirmationPresenter Hf() {
        return new LogoutConfirmationPresenter();
    }

    private final void yf() {
        z0.F0(Af().b(), new o4.i0() { // from class: ch.t0
            @Override // o4.i0
            public final o4.a2 onApplyWindowInsets(View view, o4.a2 a2Var) {
                return LogoutConfirmationScreen.zf(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 zf(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    @Override // com.server.auditor.ssh.client.contracts.account.n
    public void Zb() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.n
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.n
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.w0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return LogoutConfirmationScreen.Gf(this.f15646a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24037b = e0VarB;
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
        this.f24036a = a3.c(layoutInflater, viewGroup, false);
        yf();
        ConstraintLayout constraintLayoutB = Af().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24036a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24037b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.n
    public void ye() {
        bh.a.b(this, new d(null));
    }
}

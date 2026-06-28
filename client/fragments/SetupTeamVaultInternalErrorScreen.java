package com.server.auditor.ssh.client.fragments;

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
import com.server.auditor.ssh.client.contracts.c2;
import com.server.auditor.ssh.client.fragments.SetupTeamVaultInternalErrorScreen;
import com.server.auditor.ssh.client.presenters.SetupTeamVaultInternalErrorPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.m6;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class SetupTeamVaultInternalErrorScreen extends MvpAppCompatFragment implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m6 f24142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f24143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f24144c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24140e = {n0.g(new g0(SetupTeamVaultInternalErrorScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/SetupTeamVaultInternalErrorPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24139d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24141f = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24145a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInternalErrorScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24145a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SetupTeamVaultInternalErrorScreen.this.zf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24147a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInternalErrorScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24147a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(SetupTeamVaultInternalErrorScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24149a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SetupTeamVaultInternalErrorScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f24149a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(SetupTeamVaultInternalErrorScreen.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("SETUP_TEAM_VAULT_INTERNAL_ERROR_SCREEN_RETRY_RESULT_KEY", null);
            }
            m0VarA.S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SetupTeamVaultInternalErrorScreen() {
        iu.a aVar = new iu.a() { // from class: ch.d2
            @Override // iu.a
            public final Object a() {
                return SetupTeamVaultInternalErrorScreen.Df();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f24143b = new MoxyKtxDelegate(mvpDelegate, SetupTeamVaultInternalErrorPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Af(SetupTeamVaultInternalErrorScreen setupTeamVaultInternalErrorScreen, View view) {
        setupTeamVaultInternalErrorScreen.yf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(SetupTeamVaultInternalErrorScreen setupTeamVaultInternalErrorScreen, View view) {
        setupTeamVaultInternalErrorScreen.yf().q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Cf(SetupTeamVaultInternalErrorScreen setupTeamVaultInternalErrorScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        setupTeamVaultInternalErrorScreen.yf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetupTeamVaultInternalErrorPresenter Df() {
        return new SetupTeamVaultInternalErrorPresenter();
    }

    private final void wf() {
        z0.F0(xf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final m6 xf() {
        m6 m6Var = this.f24142a;
        if (m6Var != null) {
            return m6Var;
        }
        throw new IllegalStateException();
    }

    private final SetupTeamVaultInternalErrorPresenter yf() {
        return (SetupTeamVaultInternalErrorPresenter) this.f24143b.getValue(this, f24140e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf() {
        xf().f73217g.setOnClickListener(new View.OnClickListener() { // from class: ch.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultInternalErrorScreen.Af(this.f15471a, view);
            }
        });
        xf().f73212b.setOnClickListener(new View.OnClickListener() { // from class: ch.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupTeamVaultInternalErrorScreen.Bf(this.f15477a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.c2
    public void H() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.c2
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.c2
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: ch.e2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SetupTeamVaultInternalErrorScreen.Cf(this.f15485a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24144c = e0VarB;
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
        this.f24142a = m6.c(layoutInflater, viewGroup, false);
        wf();
        ConstraintLayout constraintLayoutB = xf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24142a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24144c;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

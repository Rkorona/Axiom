package com.server.auditor.ssh.client.navigation.account;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.account.ConfirmLogoutScreen;
import com.server.auditor.ssh.client.presenters.account.ConfirmLogoutPresenter;
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
import qg.r0;
import qu.k;
import tp.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmLogoutScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f28878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f28879b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f28880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f28881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f28882e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ k[] f28876u = {n0.g(new g0(ConfirmLogoutScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/ConfirmLogoutPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28875f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28877v = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28883a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f28883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(ConfirmLogoutScreen.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("CONFIRM_LOGOUT_SCREEN_RESULT_KEY", kotlin.coroutines.jvm.internal.b.a(true));
            }
            if (!m0VarA.T()) {
                ConfirmLogoutScreen.this.Ef(1001);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28885a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28885a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (ConfirmLogoutScreen.this.Hf().isShowing()) {
                ConfirmLogoutScreen.this.Hf().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28887a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ConfirmLogoutScreen.this.If();
            ConfirmLogoutScreen.this.Kf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28889a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u0 u0VarJ;
            au.b.f();
            if (this.f28889a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(ConfirmLogoutScreen.this);
            d0 d0VarA = m0VarA.A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("CONFIRM_LOGOUT_SCREEN_RESULT_KEY", kotlin.coroutines.jvm.internal.b.a(false));
            }
            if (!m0VarA.T()) {
                ConfirmLogoutScreen.this.Ef(1000);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28891a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28891a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = rj.i0.a();
            t.e(k1VarA, "actionConfirmLogoutScree…tricKeysOnLogoutFlow(...)");
            androidx.navigation.fragment.c.a(ConfirmLogoutScreen.this).O(k1VarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28893a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28893a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!ConfirmLogoutScreen.this.Hf().isShowing()) {
                ConfirmLogoutScreen.this.Hf().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ConfirmLogoutScreen() {
        iu.a aVar = new iu.a() { // from class: rj.g0
            @Override // iu.a
            public final Object a() {
                return ConfirmLogoutScreen.Of();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f28880c = new MoxyKtxDelegate(mvpDelegate, ConfirmLogoutPresenter.class.getName() + ".presenter", aVar);
        this.f28882e = o.a(new iu.a() { // from class: rj.h0
            @Override // iu.a
            public final Object a() {
                return ConfirmLogoutScreen.Pf(this.f77014a);
            }
        });
    }

    private final void Cf() {
        z0.F0(Ff().b(), new o4.i0() { // from class: rj.c0
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ConfirmLogoutScreen.Df(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Df(View view, a2 a2Var) {
        t.f(view, "view");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    private final r0 Ff() {
        r0 r0Var = this.f28878a;
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException();
    }

    private final ConfirmLogoutPresenter Gf() {
        return (ConfirmLogoutPresenter) this.f28880c.getValue(this, f28876u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Hf() {
        return (AlertDialog) this.f28882e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f73672b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: rj.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmLogoutScreen.Jf(this.f77011a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(ConfirmLogoutScreen confirmLogoutScreen, View view) {
        confirmLogoutScreen.Gf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Ff().f73681k.setOnClickListener(new View.OnClickListener() { // from class: rj.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmLogoutScreen.Lf(this.f77008a, view);
            }
        });
        Ff().f73683m.setOnClickListener(new View.OnClickListener() { // from class: rj.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmLogoutScreen.Mf(this.f77010a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(ConfirmLogoutScreen confirmLogoutScreen, View view) {
        confirmLogoutScreen.Gf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(ConfirmLogoutScreen confirmLogoutScreen, View view) {
        confirmLogoutScreen.Gf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Nf(ConfirmLogoutScreen confirmLogoutScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        confirmLogoutScreen.Gf().s2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmLogoutPresenter Of() {
        return new ConfirmLogoutPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Pf(ConfirmLogoutScreen confirmLogoutScreen) {
        Context contextRequireContext = confirmLogoutScreen.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void b() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void d() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void e() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void e7() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.h
    public void h0() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: rj.b0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ConfirmLogoutScreen.Nf(this.f77005a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f28881d = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.f28879b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28878a = r0.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Ff().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28878a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        m0 m0Var = this.f28879b;
        NestedScrollView nestedScrollView = Ff().f73677g;
        t.e(nestedScrollView, "contentScrollContainer");
        ConstraintLayout constraintLayout = Ff().f73676f;
        t.e(constraintLayout, "contentLayout");
        m0Var.b(nestedScrollView, constraintLayout, Ff().f73680j);
    }
}

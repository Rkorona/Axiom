package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.server.auditor.ssh.client.navigation.NavigationPopUpWhenLargeActivity;
import com.server.auditor.ssh.client.navigation.z;
import com.server.auditor.ssh.client.presenters.ConfigureTwoFactorAuthPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigureTwoFactorAuthFragment extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.r2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28119f = {ju.n0.g(new ju.g0(ConfigureTwoFactorAuthFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ConfigureTwoFactorAuthPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28120u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.p0 f28121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.activity.e0 f28122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f28123c = new androidx.navigation.x(ju.n0.b(ConfigureTwoFactorAuthFragmentArgs.class), new f(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f28124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g.b f28125e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28126a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfigureTwoFactorAuthFragment.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28126a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ConfigureTwoFactorAuthFragment.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(1001);
            fragmentActivityRequireActivity.finish();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28128a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfigureTwoFactorAuthFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28128a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConfigureTwoFactorAuthFragment.this.Cf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConfigureTwoFactorAuthFragment f28132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment, zt.e eVar) {
            super(2, eVar);
            this.f28131b = str;
            this.f28132c = configureTwoFactorAuthFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f28131b, this.f28132c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28130a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            z.a aVarA = z.a(this.f28131b);
            ju.t.e(aVarA, "actionConfigureTwoFactor…oseTwoFactorProvider(...)");
            androidx.navigation.fragment.c.a(this.f28132c).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28133a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfigureTwoFactorAuthFragment.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28133a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NavigationPopUpWhenLargeActivity.a aVar = NavigationPopUpWhenLargeActivity.f28304b;
            g.b bVar = ConfigureTwoFactorAuthFragment.this.f28125e;
            FragmentActivity fragmentActivityRequireActivity = ConfigureTwoFactorAuthFragment.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            aVar.c(bVar, fragmentActivityRequireActivity, NavigationPopUpWhenLargeActivity.NavigationDestination.AccountLogoutFlow.INSTANCE);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28135a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfigureTwoFactorAuthFragment.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConfigureTwoFactorAuthFragment.this.q1();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28137a;

        public f(Fragment fragment) {
            this.f28137a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f28137a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f28137a + " has null arguments");
        }
    }

    public ConfigureTwoFactorAuthFragment() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.u
            @Override // iu.a
            public final Object a() {
                return ConfigureTwoFactorAuthFragment.Gf(this.f30176a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28124d = new MoxyKtxDelegate(mvpDelegate, ConfigureTwoFactorAuthPresenter.class.getName() + ".presenter", aVar);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: com.server.auditor.ssh.client.navigation.v
            @Override // g.a
            public final void a(Object obj) {
                ConfigureTwoFactorAuthFragment.yf(this.f35085a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f28125e = bVarRegisterForActivityResult;
    }

    private final qg.p0 Af() {
        qg.p0 p0Var = this.f28121a;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException();
    }

    private final ConfigureTwoFactorAuthPresenter Bf() {
        return (ConfigureTwoFactorAuthPresenter) this.f28124d.getValue(this, f28119f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        Af().f73474d.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigureTwoFactorAuthFragment.Df(this.f35088a, view);
            }
        });
        Af().f73477g.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigureTwoFactorAuthFragment.Ef(this.f35092a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment, View view) {
        configureTwoFactorAuthFragment.Bf().u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment, View view) {
        configureTwoFactorAuthFragment.Bf().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Ff(ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        configureTwoFactorAuthFragment.Bf().t2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfigureTwoFactorAuthPresenter Gf(ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment) {
        String action = configureTwoFactorAuthFragment.zf().getAction();
        ju.t.e(action, "getAction(...)");
        return new ConfigureTwoFactorAuthPresenter(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yf(ConfigureTwoFactorAuthFragment configureTwoFactorAuthFragment, ActivityResult activityResult) {
        ju.t.f(activityResult, "it");
        configureTwoFactorAuthFragment.Bf().s2(activityResult.getResultCode());
    }

    private final ConfigureTwoFactorAuthFragmentArgs zf() {
        return (ConfigureTwoFactorAuthFragmentArgs) this.f28123c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.r2
    public void h0() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.t
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ConfigureTwoFactorAuthFragment.Ff(this.f29863a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f28122b = e0VarB;
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
        this.f28121a = qg.p0.c(layoutInflater, viewGroup, false);
        View viewB = Af().b();
        ju.t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28121a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        androidx.activity.e0 e0Var = this.f28122b;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }

    @Override // com.server.auditor.ssh.client.contracts.r2
    public void q1() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.r2
    public void u6(String str) {
        ju.t.f(str, "action");
        bh.a.b(this, new c(str, this, null));
    }
}

package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.fragments.loginregistration.DontHaveAnAccountScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.h;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.presenters.account.DontHaveAnAccountPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.e1;

/* JADX INFO: loaded from: classes3.dex */
public final class DontHaveAnAccountScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25235d = {ju.n0.g(new ju.g0(DontHaveAnAccountScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/DontHaveAnAccountPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25236e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1 f25237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25238b = new androidx.navigation.x(ju.n0.b(DontHaveAnAccountScreenArgs.class), new c(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25239c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25240a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f25242c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(DontHaveAnAccountScreen dontHaveAnAccountScreen, View view) {
            dontHaveAnAccountScreen.wf().v2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(DontHaveAnAccountScreen dontHaveAnAccountScreen, View view) {
            dontHaveAnAccountScreen.wf().w2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(DontHaveAnAccountScreen dontHaveAnAccountScreen, View view) {
            dontHaveAnAccountScreen.wf().x2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DontHaveAnAccountScreen.this.new a(this.f25242c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25240a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DontHaveAnAccountScreen.this.vf().f72320n.setText(this.f25242c);
            TextView textView = DontHaveAnAccountScreen.this.vf().f72320n;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = DontHaveAnAccountScreen.this.vf().f72308b.f72288b;
            final DontHaveAnAccountScreen dontHaveAnAccountScreen = DontHaveAnAccountScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DontHaveAnAccountScreen.a.m(dontHaveAnAccountScreen, view);
                }
            });
            MaterialButton materialButton = DontHaveAnAccountScreen.this.vf().f72311e;
            final DontHaveAnAccountScreen dontHaveAnAccountScreen2 = DontHaveAnAccountScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DontHaveAnAccountScreen.a.n(dontHaveAnAccountScreen2, view);
                }
            });
            MaterialButton materialButton2 = DontHaveAnAccountScreen.this.vf().f72317k;
            final DontHaveAnAccountScreen dontHaveAnAccountScreen3 = DontHaveAnAccountScreen.this;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DontHaveAnAccountScreen.a.o(dontHaveAnAccountScreen3, view);
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25243a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DontHaveAnAccountScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25243a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(DontHaveAnAccountScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class c implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25245a;

        public c(Fragment fragment) {
            this.f25245a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25245a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25245a + " has null arguments");
        }
    }

    public DontHaveAnAccountScreen() {
        iu.a aVar = new iu.a() { // from class: th.c
            @Override // iu.a
            public final Object a() {
                return DontHaveAnAccountScreen.xf(this.f79478a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25239c = new MoxyKtxDelegate(mvpDelegate, DontHaveAnAccountPresenter.class.getName() + ".presenter", aVar);
    }

    private final DontHaveAnAccountScreenArgs uf() {
        return (DontHaveAnAccountScreenArgs) this.f25238b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 vf() {
        e1 e1Var = this.f25237a;
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DontHaveAnAccountPresenter wf() {
        return (DontHaveAnAccountPresenter) this.f25239c.getValue(this, f25235d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DontHaveAnAccountPresenter xf(DontHaveAnAccountScreen dontHaveAnAccountScreen) {
        int featureType = dontHaveAnAccountScreen.uf().getFeatureType();
        AuthenticationModel authenticationModel = dontHaveAnAccountScreen.uf().getAuthenticationModel();
        ju.t.e(authenticationModel, "getAuthenticationModel(...)");
        return new DontHaveAnAccountPresenter(featureType, authenticationModel, dontHaveAnAccountScreen.uf().getNeedSyncKeysAndPasswords(), dontHaveAnAccountScreen.uf().getNeedCreateTrialAccount());
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void b() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25237a = e1.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = vf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25237a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void sc(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        ju.t.f(authenticationModel, "authenticationModel");
        h.a aVarA = h.a(i10, authenticationModel, z11, z10);
        ju.t.e(aVarA, "actionDontHaveAnAccountS…pEnterPasswordScreen(...)");
        androidx.navigation.fragment.c.a(this).O(aVarA);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void u(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new a(str, null));
    }
}

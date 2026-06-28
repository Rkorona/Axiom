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
import com.server.auditor.ssh.client.fragments.loginregistration.AlreadyHaveAnAccountScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.d;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.presenters.account.AlreadyHaveAnAccountPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class AlreadyHaveAnAccountScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25218d = {ju.n0.g(new ju.g0(AlreadyHaveAnAccountScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/AlreadyHaveAnAccountPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25219e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.q f25220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25221b = new androidx.navigation.x(ju.n0.b(AlreadyHaveAnAccountScreenArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25222c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f25225c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen, View view) {
            alreadyHaveAnAccountScreen.wf().v2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen, View view) {
            alreadyHaveAnAccountScreen.wf().x2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen, View view) {
            alreadyHaveAnAccountScreen.wf().w2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AlreadyHaveAnAccountScreen.this.new a(this.f25225c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25223a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AlreadyHaveAnAccountScreen.this.vf().f73590n.setText(this.f25225c);
            TextView textView = AlreadyHaveAnAccountScreen.this.vf().f73590n;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = AlreadyHaveAnAccountScreen.this.vf().f73578b.f72288b;
            final AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen = AlreadyHaveAnAccountScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlreadyHaveAnAccountScreen.a.m(alreadyHaveAnAccountScreen, view);
                }
            });
            MaterialButton materialButton = AlreadyHaveAnAccountScreen.this.vf().f73587k;
            final AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen2 = AlreadyHaveAnAccountScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlreadyHaveAnAccountScreen.a.n(alreadyHaveAnAccountScreen2, view);
                }
            });
            MaterialButton materialButton2 = AlreadyHaveAnAccountScreen.this.vf().f73583g;
            final AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen3 = AlreadyHaveAnAccountScreen.this;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlreadyHaveAnAccountScreen.a.o(alreadyHaveAnAccountScreen3, view);
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
        int f25226a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return AlreadyHaveAnAccountScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25226a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(AlreadyHaveAnAccountScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuthenticationModel f25230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AlreadyHaveAnAccountScreen f25233f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11, AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen, zt.e eVar) {
            super(2, eVar);
            this.f25229b = i10;
            this.f25230c = authenticationModel;
            this.f25231d = z10;
            this.f25232e = z11;
            this.f25233f = alreadyHaveAnAccountScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f25229b, this.f25230c, this.f25231d, this.f25232e, this.f25233f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            d.a aVarA = com.server.auditor.ssh.client.fragments.loginregistration.d.a(this.f25229b, this.f25230c, this.f25231d, this.f25232e);
            ju.t.e(aVarA, "actionAlreadyHaveAnAccou…nEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25233f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25234a;

        public d(Fragment fragment) {
            this.f25234a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25234a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25234a + " has null arguments");
        }
    }

    public AlreadyHaveAnAccountScreen() {
        iu.a aVar = new iu.a() { // from class: th.a
            @Override // iu.a
            public final Object a() {
                return AlreadyHaveAnAccountScreen.xf(this.f79471a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25222c = new MoxyKtxDelegate(mvpDelegate, AlreadyHaveAnAccountPresenter.class.getName() + ".presenter", aVar);
    }

    private final AlreadyHaveAnAccountScreenArgs uf() {
        return (AlreadyHaveAnAccountScreenArgs) this.f25221b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.q vf() {
        qg.q qVar = this.f25220a;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlreadyHaveAnAccountPresenter wf() {
        return (AlreadyHaveAnAccountPresenter) this.f25222c.getValue(this, f25218d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlreadyHaveAnAccountPresenter xf(AlreadyHaveAnAccountScreen alreadyHaveAnAccountScreen) {
        int featureType = alreadyHaveAnAccountScreen.uf().getFeatureType();
        AuthenticationModel authenticationModel = alreadyHaveAnAccountScreen.uf().getAuthenticationModel();
        ju.t.e(authenticationModel, "getAuthenticationModel(...)");
        return new AlreadyHaveAnAccountPresenter(featureType, authenticationModel, alreadyHaveAnAccountScreen.uf().getNeedSyncKeysAndPasswords(), alreadyHaveAnAccountScreen.uf().getNeedCreateTrialAccount());
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void b() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25220a = qg.q.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = vf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25220a = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void u(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new a(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void va(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        ju.t.f(authenticationModel, "authenticationModel");
        bh.a.b(this, new c(i10, authenticationModel, z11, z10, this, null));
    }
}

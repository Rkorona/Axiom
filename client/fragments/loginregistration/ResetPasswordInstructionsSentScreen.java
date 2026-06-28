package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.fragments.loginregistration.ResetPasswordInstructionsSentScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.u;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.presenters.account.ResetPasswordInstructionsSentPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.u5;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetPasswordInstructionsSentScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25380e = {ju.n0.g(new ju.g0(ResetPasswordInstructionsSentScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/ResetPasswordInstructionsSentPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25381f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u5 f25382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25383b = new androidx.navigation.x(ju.n0.b(ResetPasswordInstructionsSentScreenArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.activity.e0 f25385d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25386a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25388c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f25388c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen, View view) {
            resetPasswordInstructionsSentScreen.xf().w2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen, View view) {
            resetPasswordInstructionsSentScreen.xf().v2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordInstructionsSentScreen.this.new a(this.f25388c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25386a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ResetPasswordInstructionsSentScreen.this.wf().f74072l.setText(this.f25388c);
            TextView textView = ResetPasswordInstructionsSentScreen.this.wf().f74072l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            MaterialButton materialButton = ResetPasswordInstructionsSentScreen.this.wf().f74065e;
            final ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen = ResetPasswordInstructionsSentScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetPasswordInstructionsSentScreen.a.l(resetPasswordInstructionsSentScreen, view);
                }
            });
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = ResetPasswordInstructionsSentScreen.this.wf().f74062b.f72288b;
            final ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen2 = ResetPasswordInstructionsSentScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetPasswordInstructionsSentScreen.a.m(resetPasswordInstructionsSentScreen2, view);
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
        int f25389a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordInstructionsSentScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25389a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ResetPasswordInstructionsSentScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuthenticationModel f25393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResetPasswordInstructionsSentScreen f25396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11, ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen, zt.e eVar) {
            super(2, eVar);
            this.f25392b = i10;
            this.f25393c = authenticationModel;
            this.f25394d = z10;
            this.f25395e = z11;
            this.f25396f = resetPasswordInstructionsSentScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f25392b, this.f25393c, this.f25394d, this.f25395e, this.f25396f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25391a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            u.a aVarA = u.a(this.f25392b, this.f25393c, this.f25394d, this.f25395e);
            ju.t.e(aVarA, "actionResetPasswordInstr…nEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25396f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25397a;

        public d(Fragment fragment) {
            this.f25397a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25397a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25397a + " has null arguments");
        }
    }

    public ResetPasswordInstructionsSentScreen() {
        iu.a aVar = new iu.a() { // from class: th.d0
            @Override // iu.a
            public final Object a() {
                return ResetPasswordInstructionsSentScreen.zf(this.f79482a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25384c = new MoxyKtxDelegate(mvpDelegate, ResetPasswordInstructionsSentPresenter.class.getName() + ".presenter", aVar);
    }

    private final ResetPasswordInstructionsSentScreenArgs vf() {
        return (ResetPasswordInstructionsSentScreenArgs) this.f25383b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u5 wf() {
        u5 u5Var = this.f25382a;
        if (u5Var != null) {
            return u5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResetPasswordInstructionsSentPresenter xf() {
        return (ResetPasswordInstructionsSentPresenter) this.f25384c.getValue(this, f25380e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 yf(ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        resetPasswordInstructionsSentScreen.xf().v2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResetPasswordInstructionsSentPresenter zf(ResetPasswordInstructionsSentScreen resetPasswordInstructionsSentScreen) {
        int featureType = resetPasswordInstructionsSentScreen.vf().getFeatureType();
        AuthenticationModel authenticationModel = resetPasswordInstructionsSentScreen.vf().getAuthenticationModel();
        ju.t.e(authenticationModel, "getAuthenticationModel(...)");
        return new ResetPasswordInstructionsSentPresenter(featureType, authenticationModel, resetPasswordInstructionsSentScreen.vf().getNeedCreateTrialAccount(), resetPasswordInstructionsSentScreen.vf().getNeedSyncKeysAndPasswords());
    }

    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void b() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.c0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ResetPasswordInstructionsSentScreen.yf(this.f79479a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25385d = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25382a = u5.c(layoutInflater, viewGroup, false);
        return wf().b();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25382a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25385d;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void r4(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        ju.t.f(authenticationModel, "authenticationModel");
        bh.a.b(this, new c(i10, authenticationModel, z11, z10, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void u(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new a(str, null));
    }
}

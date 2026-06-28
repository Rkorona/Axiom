package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.ResetPasswordScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.x;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.presenters.account.ResetPasswordPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.v5;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetPasswordScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25398f = {ju.n0.g(new ju.g0(ResetPasswordScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/ResetPasswordPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f25399u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v5 f25400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25401b = new androidx.navigation.x(ju.n0.b(ResetPasswordScreenArgs.class), new f(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.activity.e0 f25403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f25404e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25405a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ResetPasswordScreen.this.Af().isShowing()) {
                ResetPasswordScreen.this.Af().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25407a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(ResetPasswordScreen resetPasswordScreen, View view) {
            resetPasswordScreen.zf().w2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(ResetPasswordScreen resetPasswordScreen, View view) {
            resetPasswordScreen.zf().x2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25407a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ResetPasswordScreen.this.getResources().getString(R.string.reset_encryption_password_description));
            String string = ResetPasswordScreen.this.getResources().getString(R.string.reset_encryption_password_description_highlight);
            ju.t.e(string, "getString(...)");
            Context contextRequireContext = ResetPasswordScreen.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            tp.w0.f81061a.a(spannableStringBuilder, string, new ForegroundColorSpan(tp.c0.i(contextRequireContext, R.attr.colorError)));
            TextView textView = ResetPasswordScreen.this.yf().f74152l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            ResetPasswordScreen.this.yf().f74146f.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = ResetPasswordScreen.this.yf().f74142b.f72288b;
            final ResetPasswordScreen resetPasswordScreen = ResetPasswordScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetPasswordScreen.b.l(resetPasswordScreen, view);
                }
            });
            MaterialButton materialButton = ResetPasswordScreen.this.yf().f74145e;
            final ResetPasswordScreen resetPasswordScreen2 = ResetPasswordScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetPasswordScreen.b.m(resetPasswordScreen2, view);
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25409a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ResetPasswordScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25411a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25411a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ResetPasswordScreen.this.Af().isShowing()) {
                ResetPasswordScreen.this.Af().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuthenticationModel f25415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResetPasswordScreen f25418f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11, ResetPasswordScreen resetPasswordScreen, zt.e eVar) {
            super(2, eVar);
            this.f25414b = i10;
            this.f25415c = authenticationModel;
            this.f25416d = z10;
            this.f25417e = z11;
            this.f25418f = resetPasswordScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f25414b, this.f25415c, this.f25416d, this.f25417e, this.f25418f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25413a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            x.a aVarA = x.a(this.f25414b, this.f25415c, this.f25416d, this.f25417e);
            ju.t.e(aVarA, "actionResetPasswordScree…structionsSentScreen(...)");
            androidx.navigation.fragment.c.a(this.f25418f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25419a;

        public f(Fragment fragment) {
            this.f25419a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25419a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25419a + " has null arguments");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25420a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f25422c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordScreen.this.new g(this.f25422c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ResetPasswordScreen.this.yf().f74152l.setText(this.f25422c);
            TextView textView = ResetPasswordScreen.this.yf().f74152l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ResetPasswordScreen() {
        iu.a aVar = new iu.a() { // from class: th.g0
            @Override // iu.a
            public final Object a() {
                return ResetPasswordScreen.Cf(this.f79489a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25402c = new MoxyKtxDelegate(mvpDelegate, ResetPasswordPresenter.class.getName() + ".presenter", aVar);
        this.f25404e = ut.o.a(new iu.a() { // from class: th.h0
            @Override // iu.a
            public final Object a() {
                return ResetPasswordScreen.Df(this.f79492a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Af() {
        return (AlertDialog) this.f25404e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Bf(ResetPasswordScreen resetPasswordScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        resetPasswordScreen.zf().w2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResetPasswordPresenter Cf(ResetPasswordScreen resetPasswordScreen) {
        int featureType = resetPasswordScreen.xf().getFeatureType();
        AuthenticationModel authenticationModel = resetPasswordScreen.xf().getAuthenticationModel();
        ju.t.e(authenticationModel, "getAuthenticationModel(...)");
        return new ResetPasswordPresenter(featureType, authenticationModel, resetPasswordScreen.xf().getNeedSyncKeysAndPasswords(), resetPasswordScreen.xf().getNeedCreateTrialAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Df(ResetPasswordScreen resetPasswordScreen) {
        Context contextRequireContext = resetPasswordScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    private final ResetPasswordScreenArgs xf() {
        return (ResetPasswordScreenArgs) this.f25401b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v5 yf() {
        v5 v5Var = this.f25400a;
        if (v5Var != null) {
            return v5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResetPasswordPresenter zf() {
        return (ResetPasswordPresenter) this.f25402c.getValue(this, f25398f[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void D5(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        ju.t.f(authenticationModel, "authenticationModel");
        bh.a.b(this, new e(i10, authenticationModel, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void H0(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void Z(com.server.auditor.ssh.client.help.a0 a0Var) {
        View view;
        if (a0Var == null || (view = getView()) == null) {
            return;
        }
        u0.a aVar = tp.u0.f81015a;
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        Context context = view.getContext();
        ju.t.e(context, "getContext(...)");
        aVar.b(contextRequireContext, view, a0Var.a(context), 0).Y();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void c() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void d() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void e() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.f0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ResetPasswordScreen.Bf(this.f79486a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25403d = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25400a = v5.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f25400a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25403d;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

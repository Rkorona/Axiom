package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.SignUpEnterEmailScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.i0;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.presenters.account.SignUpEnterEmailPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.z6;
import rd.c;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class SignUpEnterEmailScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.f0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25712u = {ju.n0.g(new ju.g0(SignUpEnterEmailScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/SignUpEnterEmailPresenter;", 0))};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f25713v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z6 f25714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tp.m0 f25715b = new tp.m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f25716c = new androidx.navigation.x(ju.n0.b(SignUpEnterEmailScreenArgs.class), new r(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f25717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f25718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.activity.e0 f25719f;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25720a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25720a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = SignUpEnterEmailScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
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
        int f25722a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25722a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = SignUpEnterEmailScreen.this.Hf().f74574h;
            ju.t.e(textInputEditText, "emailEditText");
            tp.z.c(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25724a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25724a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (SignUpEnterEmailScreen.this.Jf().isShowing()) {
                SignUpEnterEmailScreen.this.Jf().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SignUpEnterEmailScreen.this.If().A2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25727a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25727a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignUpEnterEmailScreen.this.Kf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25729a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(SignUpEnterEmailScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25736f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25732b = i10;
            this.f25733c = emailAuthentication;
            this.f25734d = z10;
            this.f25735e = z11;
            this.f25736f = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f25732b, this.f25733c, this.f25734d, this.f25735e, this.f25736f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25731a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0.a aVarA = i0.a(this.f25732b, this.f25733c, this.f25734d, this.f25735e);
            ju.t.e(aVarA, "actionSignUpEnterEmailSc…yHaveAnAccountScreen(...)");
            androidx.navigation.fragment.c.a(this.f25736f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25738b = i10;
            this.f25739c = emailAuthentication;
            this.f25740d = z10;
            this.f25741e = z11;
            this.f25742f = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f25738b, this.f25739c, this.f25740d, this.f25741e, this.f25742f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25737a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0.b bVarB = i0.b(this.f25738b, this.f25739c, this.f25740d, this.f25741e);
            ju.t.e(bVarB, "actionSignUpEnterEmailSc…gnOnEnterEmailScreen(...)");
            androidx.navigation.fragment.c.a(this.f25742f).O(bVarB);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25748f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25744b = i10;
            this.f25745c = emailAuthentication;
            this.f25746d = z10;
            this.f25747e = z11;
            this.f25748f = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f25744b, this.f25745c, this.f25746d, this.f25747e, this.f25748f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25743a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0.d dVarD = i0.d(this.f25744b, this.f25745c, this.f25746d, this.f25747e);
            ju.t.e(dVarD, "actionSignUpEnterEmailSc…pEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25748f).O(dVarD);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25753e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, boolean z10, boolean z11, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25750b = i10;
            this.f25751c = z10;
            this.f25752d = z11;
            this.f25753e = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f25750b, this.f25751c, this.f25752d, this.f25753e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25749a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0.c cVarC = i0.c(this.f25750b, this.f25751c, this.f25752d);
            ju.t.e(cVarC, "actionSignUpEnterEmailSc…oSignInChooserScreen(...)");
            androidx.navigation.fragment.c.a(this.f25753e).O(cVarC);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25754a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25754a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignUpEnterEmailScreen signUpEnterEmailScreen = SignUpEnterEmailScreen.this;
            String string = signUpEnterEmailScreen.getString(R.string.privacy_policy_site_url);
            ju.t.e(string, "getString(...)");
            signUpEnterEmailScreen.Rf(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25756a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignUpEnterEmailScreen signUpEnterEmailScreen = SignUpEnterEmailScreen.this;
            String string = signUpEnterEmailScreen.getString(R.string.terms_of_service_site_url);
            ju.t.e(string, "getString(...)");
            signUpEnterEmailScreen.Rf(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25758a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f25760c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new m(this.f25760c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25758a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = SignUpEnterEmailScreen.this.getView();
            if (view != null) {
                String str = this.f25760c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25761a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25761a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = SignUpEnterEmailScreen.this.Hf().f74574h;
            ju.t.e(textInputEditText, "emailEditText");
            tp.z.e(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25763a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25763a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!SignUpEnterEmailScreen.this.Jf().isShowing()) {
                SignUpEnterEmailScreen.this.Jf().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25765a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m(SignUpEnterEmailScreen signUpEnterEmailScreen, c.a aVar) {
            String strC = aVar.c();
            if (strC == null || su.s.m0(strC)) {
                y9.a aVar2 = y9.a.f86838a;
                String string = signUpEnterEmailScreen.getString(R.string.recaptcha_empty_token_error);
                ju.t.e(string, "getString(...)");
                aVar2.g(string);
                signUpEnterEmailScreen.If().B2();
            } else {
                signUpEnterEmailScreen.If().C2(strC);
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(iu.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(SignUpEnterEmailScreen signUpEnterEmailScreen, Exception exc) {
            String message = exc.getMessage();
            if (message == null) {
                message = signUpEnterEmailScreen.getString(R.string.recaptcha_error);
                ju.t.e(message, "getString(...)");
            }
            y9.a.f86838a.g(message);
            signUpEnterEmailScreen.If().B2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25765a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            rd.d dVarA = rd.b.a(SignUpEnterEmailScreen.this.requireActivity());
            ju.t.e(dVarA, "getClient(...)");
            String string = SignUpEnterEmailScreen.this.getString(R.string.recaptcha_key);
            ju.t.e(string, "getString(...)");
            Task taskE = dVarA.e(string);
            final SignUpEnterEmailScreen signUpEnterEmailScreen = SignUpEnterEmailScreen.this;
            final iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.f0
                @Override // iu.l
                public final Object invoke(Object obj2) {
                    return SignUpEnterEmailScreen.p.m(signUpEnterEmailScreen, (c.a) obj2);
                }
            };
            Task taskAddOnSuccessListener = taskE.addOnSuccessListener(new OnSuccessListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.g0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj2) {
                    SignUpEnterEmailScreen.p.n(lVar, obj2);
                }
            });
            final SignUpEnterEmailScreen signUpEnterEmailScreen2 = SignUpEnterEmailScreen.this;
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.h0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    SignUpEnterEmailScreen.p.o(signUpEnterEmailScreen2, exc);
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25767a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25767a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignUpEnterEmailScreen signUpEnterEmailScreen = SignUpEnterEmailScreen.this;
            String string = signUpEnterEmailScreen.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            signUpEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class r implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25769a;

        public r(Fragment fragment) {
            this.f25769a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25769a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25769a + " has null arguments");
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25770a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f25772c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailScreen.this.new s(this.f25772c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25770a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignUpEnterEmailScreen.this.Hf().f74572f.setEnabled(this.f25772c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f25774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(com.server.auditor.ssh.client.help.a0 a0Var, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25774b = a0Var;
            this.f25775c = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new t(this.f25774b, this.f25775c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strA;
            au.b.f();
            if (this.f25773a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.help.a0 a0Var = this.f25774b;
            String strA2 = null;
            if (a0Var != null) {
                Context contextRequireContext = this.f25775c.requireContext();
                ju.t.e(contextRequireContext, "requireContext(...)");
                strA = a0Var.a(contextRequireContext);
            } else {
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                AppCompatTextView appCompatTextView = this.f25775c.Hf().f74575i;
                ju.t.e(appCompatTextView, "emailError");
                appCompatTextView.setVisibility(8);
                this.f25775c.Hf().f74575i.setText("");
            } else {
                AppCompatTextView appCompatTextView2 = this.f25775c.Hf().f74575i;
                com.server.auditor.ssh.client.help.a0 a0Var2 = this.f25774b;
                if (a0Var2 != null) {
                    Context contextRequireContext2 = this.f25775c.requireContext();
                    ju.t.e(contextRequireContext2, "requireContext(...)");
                    strA2 = a0Var2.a(contextRequireContext2);
                }
                appCompatTextView2.setText(strA2);
                AppCompatTextView appCompatTextView3 = this.f25775c.Hf().f74575i;
                ju.t.e(appCompatTextView3, "emailError");
                appCompatTextView3.setVisibility(0);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignUpEnterEmailScreen f25778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i10, SignUpEnterEmailScreen signUpEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25777b = i10;
            this.f25778c = signUpEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new u(this.f25777b, this.f25778c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25776a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            int i10 = this.f25777b;
            if (i10 == 127) {
                this.f25778c.Hf().f74578l.setImageResource(R.drawable.ic_gradient_mail);
                this.f25778c.Hf().f74581o.setText(this.f25778c.getString(R.string.enable_ai_in_termius));
                this.f25778c.Hf().f74573g.setText(this.f25778c.getString(R.string.enable_ai_in_termius_description));
            } else if (i10 == 128) {
                this.f25778c.Hf().f74578l.setImageResource(R.drawable.ic_gradient_mail);
                this.f25778c.Hf().f74581o.setText(this.f25778c.getString(R.string.session_logs_view_in_desktop_title));
                this.f25778c.Hf().f74573g.setText(this.f25778c.getString(R.string.view_session_log_unauthorized_promo_description));
                this.f25778c.Hf().f74581o.setLineSpacing(0.0f, 1.25f);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public SignUpEnterEmailScreen() {
        iu.a aVar = new iu.a() { // from class: th.g2
            @Override // iu.a
            public final Object a() {
                return SignUpEnterEmailScreen.Pf(this.f79490a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25717d = new MoxyKtxDelegate(mvpDelegate, SignUpEnterEmailPresenter.class.getName() + ".presenter", aVar);
        this.f25718e = ut.o.a(new iu.a() { // from class: th.h2
            @Override // iu.a
            public final Object a() {
                return SignUpEnterEmailScreen.Qf(this.f79494a);
            }
        });
    }

    private final void Ef() {
        z0.F0(Hf().b(), new o4.i0() { // from class: th.i2
            @Override // o4.i0
            public final o4.a2 onApplyWindowInsets(View view, o4.a2 a2Var) {
                return SignUpEnterEmailScreen.Ff(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ff(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final SignUpEnterEmailScreenArgs Gf() {
        return (SignUpEnterEmailScreenArgs) this.f25716c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z6 Hf() {
        z6 z6Var = this.f25714a;
        if (z6Var != null) {
            return z6Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpEnterEmailPresenter If() {
        return (SignUpEnterEmailPresenter) this.f25717d.getValue(this, f25712u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Jf() {
        return (AlertDialog) this.f25718e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Hf().f74568b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: th.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignUpEnterEmailScreen.Lf(this.f79504a, view);
            }
        });
        Hf().f74579m.setOnClickListener(new View.OnClickListener() { // from class: th.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignUpEnterEmailScreen.Mf(this.f79507a, view);
            }
        });
        Hf().f74572f.setOnClickListener(new View.OnClickListener() { // from class: th.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignUpEnterEmailScreen.Nf(this.f79511a, view);
            }
        });
        TextInputEditText textInputEditText = Hf().f74574h;
        ju.t.e(textInputEditText, "emailEditText");
        textInputEditText.addTextChangedListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(SignUpEnterEmailScreen signUpEnterEmailScreen, View view) {
        signUpEnterEmailScreen.If().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(SignUpEnterEmailScreen signUpEnterEmailScreen, View view) {
        signUpEnterEmailScreen.If().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(SignUpEnterEmailScreen signUpEnterEmailScreen, View view) {
        signUpEnterEmailScreen.If().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Of(SignUpEnterEmailScreen signUpEnterEmailScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        signUpEnterEmailScreen.If().y2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignUpEnterEmailPresenter Pf(SignUpEnterEmailScreen signUpEnterEmailScreen) {
        return new SignUpEnterEmailPresenter(signUpEnterEmailScreen.Gf().getFeatureType(), signUpEnterEmailScreen.Gf().getNeedCreateTrialAccount(), signUpEnterEmailScreen.Gf().getNeedSyncKeysAndPasswords());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Qf(SignUpEnterEmailScreen signUpEnterEmailScreen) {
        Context contextRequireContext = signUpEnterEmailScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        bh.a.b(this, new m(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new t(a0Var, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void C1(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new h(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void D() {
        bh.a.b(this, new p(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void F() {
        bh.a.b(this, new q(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void Id(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new g(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void N(int i10, boolean z10, boolean z11) {
        bh.a.b(this, new j(i10, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void P(boolean z10) {
        bh.a.b(this, new s(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void V1() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void a() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void b() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void d() {
        bh.a.b(this, new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void e() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void i() {
        bh.a.b(this, new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void l() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.j2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SignUpEnterEmailScreen.Of(this.f79500a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25719f = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.f25715b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f25714a = z6.c(layoutInflater, viewGroup, false);
        Ef();
        ConstraintLayout constraintLayoutB = Hf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25714a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25719f;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        tp.m0 m0Var = this.f25715b;
        NestedScrollView nestedScrollView = Hf().f74571e;
        ju.t.e(nestedScrollView, "contentScrollContainer");
        ConstraintLayout constraintLayout = Hf().f74570d;
        ju.t.e(constraintLayout, "contentLayout");
        m0Var.b(nestedScrollView, constraintLayout, Hf().f74578l);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void t0(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new i(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void v0() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void z(int i10) {
        bh.a.b(this, new u(i10, this, null));
    }
}

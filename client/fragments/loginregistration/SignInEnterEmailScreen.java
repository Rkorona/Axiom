package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.SignInEnterEmailScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.c0;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.presenters.account.SignInEnterEmailPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.w6;
import rd.c;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInEnterEmailScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.z {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25501u = {ju.n0.g(new ju.g0(SignInEnterEmailScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/SignInEnterEmailPresenter;", 0))};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f25502v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w6 f25503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tp.m0 f25504b = new tp.m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f25505c = new androidx.navigation.x(ju.n0.b(SignInEnterEmailScreenArgs.class), new n(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f25506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f25507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.activity.e0 f25508f;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25509a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25509a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = SignInEnterEmailScreen.this.Gf().f74271i;
            ju.t.e(textInputEditText, "emailEditText");
            tp.z.c(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25511a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25511a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInEnterEmailScreen.this.Gf().f74264b.f72288b.setEnabled(true);
            SignInEnterEmailScreen.this.Gf().f74269g.setEnabled(true);
            if (SignInEnterEmailScreen.this.If().isShowing()) {
                SignInEnterEmailScreen.this.If().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SignInEnterEmailScreen.this.Hf().A2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25514a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25514a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInEnterEmailScreen.this.Jf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25516a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25516a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(SignInEnterEmailScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailScreen f25523f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignInEnterEmailScreen signInEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25519b = i10;
            this.f25520c = emailAuthentication;
            this.f25521d = z10;
            this.f25522e = z11;
            this.f25523f = signInEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f25519b, this.f25520c, this.f25521d, this.f25522e, this.f25523f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25518a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            c0.b bVarB = c0.b(this.f25519b, this.f25520c, this.f25521d, this.f25522e);
            ju.t.e(bVarB, "actionSignInEnterEmailSc…gnOnEnterEmailScreen(...)");
            androidx.navigation.fragment.c.a(this.f25523f).O(bVarB);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailScreen f25529f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignInEnterEmailScreen signInEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25525b = i10;
            this.f25526c = emailAuthentication;
            this.f25527d = z10;
            this.f25528e = z11;
            this.f25529f = signInEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f25525b, this.f25526c, this.f25527d, this.f25528e, this.f25529f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25524a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            c0.a aVarA = c0.a(this.f25525b, this.f25526c, this.f25527d, this.f25528e);
            ju.t.e(aVarA, "actionSignInEnterEmailSc…tHaveAnAccountScreen(...)");
            androidx.navigation.fragment.c.a(this.f25529f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailScreen f25535f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11, SignInEnterEmailScreen signInEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25531b = i10;
            this.f25532c = emailAuthentication;
            this.f25533d = z10;
            this.f25534e = z11;
            this.f25535f = signInEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f25531b, this.f25532c, this.f25533d, this.f25534e, this.f25535f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25530a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            c0.c cVarC = c0.c(this.f25531b, this.f25532c, this.f25533d, this.f25534e);
            ju.t.e(cVarC, "actionSignInEnterEmailSc…nEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25535f).O(cVarC);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25536a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f25538c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new i(this.f25538c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25536a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = SignInEnterEmailScreen.this.getView();
            if (view != null) {
                String str = this.f25538c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25539a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = SignInEnterEmailScreen.this.Gf().f74271i;
            ju.t.e(textInputEditText, "emailEditText");
            tp.z.e(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25541a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25541a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInEnterEmailScreen.this.Gf().f74264b.f72288b.setEnabled(false);
            SignInEnterEmailScreen.this.Gf().f74269g.setEnabled(false);
            if (!SignInEnterEmailScreen.this.If().isShowing()) {
                SignInEnterEmailScreen.this.If().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25543a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m(SignInEnterEmailScreen signInEnterEmailScreen, c.a aVar) {
            String strC = aVar.c();
            if (strC == null || su.s.m0(strC)) {
                y9.a aVar2 = y9.a.f86838a;
                String string = signInEnterEmailScreen.getString(R.string.recaptcha_empty_token_error);
                ju.t.e(string, "getString(...)");
                aVar2.g(string);
                signInEnterEmailScreen.Hf().B2();
            } else {
                signInEnterEmailScreen.Hf().C2(strC);
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(iu.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(SignInEnterEmailScreen signInEnterEmailScreen, Exception exc) {
            String message = exc.getMessage();
            if (message == null) {
                message = signInEnterEmailScreen.getString(R.string.recaptcha_error);
                ju.t.e(message, "getString(...)");
            }
            y9.a.f86838a.g(message);
            signInEnterEmailScreen.Hf().B2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            rd.d dVarA = rd.b.a(SignInEnterEmailScreen.this.requireActivity());
            ju.t.e(dVarA, "getClient(...)");
            String string = SignInEnterEmailScreen.this.getString(R.string.recaptcha_key);
            ju.t.e(string, "getString(...)");
            Task taskE = dVarA.e(string);
            final SignInEnterEmailScreen signInEnterEmailScreen = SignInEnterEmailScreen.this;
            final iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.z
                @Override // iu.l
                public final Object invoke(Object obj2) {
                    return SignInEnterEmailScreen.l.m(signInEnterEmailScreen, (c.a) obj2);
                }
            };
            Task taskAddOnSuccessListener = taskE.addOnSuccessListener(new OnSuccessListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.a0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj2) {
                    SignInEnterEmailScreen.l.n(lVar, obj2);
                }
            });
            final SignInEnterEmailScreen signInEnterEmailScreen2 = SignInEnterEmailScreen.this;
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.b0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    SignInEnterEmailScreen.l.o(signInEnterEmailScreen2, exc);
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25545a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25545a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInEnterEmailScreen signInEnterEmailScreen = SignInEnterEmailScreen.this;
            String string = signInEnterEmailScreen.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            signInEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class n implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25547a;

        public n(Fragment fragment) {
            this.f25547a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25547a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25547a + " has null arguments");
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25548a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25550c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f25550c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailScreen.this.new o(this.f25550c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25548a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInEnterEmailScreen.this.Gf().f74269g.setEnabled(this.f25550c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f25552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailScreen f25553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(com.server.auditor.ssh.client.help.a0 a0Var, SignInEnterEmailScreen signInEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25552b = a0Var;
            this.f25553c = signInEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p(this.f25552b, this.f25553c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strA;
            au.b.f();
            if (this.f25551a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.help.a0 a0Var = this.f25552b;
            String strA2 = null;
            if (a0Var != null) {
                Context contextRequireContext = this.f25553c.requireContext();
                ju.t.e(contextRequireContext, "requireContext(...)");
                strA = a0Var.a(contextRequireContext);
            } else {
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                AppCompatTextView appCompatTextView = this.f25553c.Gf().f74272j;
                ju.t.e(appCompatTextView, "emailError");
                appCompatTextView.setVisibility(8);
                this.f25553c.Gf().f74272j.setText("");
            } else {
                AppCompatTextView appCompatTextView2 = this.f25553c.Gf().f74272j;
                com.server.auditor.ssh.client.help.a0 a0Var2 = this.f25552b;
                if (a0Var2 != null) {
                    Context contextRequireContext2 = this.f25553c.requireContext();
                    ju.t.e(contextRequireContext2, "requireContext(...)");
                    strA2 = a0Var2.a(contextRequireContext2);
                }
                appCompatTextView2.setText(strA2);
                AppCompatTextView appCompatTextView3 = this.f25553c.Gf().f74272j;
                ju.t.e(appCompatTextView3, "emailError");
                appCompatTextView3.setVisibility(0);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailScreen f25556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10, SignInEnterEmailScreen signInEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25555b = i10;
            this.f25556c = signInEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new q(this.f25555b, this.f25556c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25554a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            int i10 = this.f25555b;
            if (i10 == 127) {
                this.f25556c.Gf().f74275m.setImageResource(R.drawable.ic_gradient_mail);
                this.f25556c.Gf().f74277o.setText(this.f25556c.getString(R.string.enable_ai_in_termius));
                this.f25556c.Gf().f74270h.setText(this.f25556c.getString(R.string.enable_ai_in_termius_description));
            } else if (i10 == 128) {
                this.f25556c.Gf().f74275m.setImageResource(R.drawable.ic_gradient_mail);
                this.f25556c.Gf().f74277o.setText(this.f25556c.getString(R.string.session_logs_view_in_desktop_title));
                this.f25556c.Gf().f74270h.setText(this.f25556c.getString(R.string.view_session_log_unauthorized_promo_description));
                this.f25556c.Gf().f74277o.setLineSpacing(0.0f, 1.25f);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public SignInEnterEmailScreen() {
        iu.a aVar = new iu.a() { // from class: th.a1
            @Override // iu.a
            public final Object a() {
                return SignInEnterEmailScreen.Of(this.f79473a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25506d = new MoxyKtxDelegate(mvpDelegate, SignInEnterEmailPresenter.class.getName() + ".presenter", aVar);
        this.f25507e = ut.o.a(new iu.a() { // from class: th.b1
            @Override // iu.a
            public final Object a() {
                return SignInEnterEmailScreen.Pf(this.f79476a);
            }
        });
    }

    private final void Df() {
        z0.F0(Gf().b(), new o4.i0() { // from class: th.d1
            @Override // o4.i0
            public final o4.a2 onApplyWindowInsets(View view, o4.a2 a2Var) {
                return SignInEnterEmailScreen.Ef(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final SignInEnterEmailScreenArgs Ff() {
        return (SignInEnterEmailScreenArgs) this.f25505c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w6 Gf() {
        w6 w6Var = this.f25503a;
        if (w6Var != null) {
            return w6Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignInEnterEmailPresenter Hf() {
        return (SignInEnterEmailPresenter) this.f25506d.getValue(this, f25501u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog If() {
        return (AlertDialog) this.f25507e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Gf().f74264b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: th.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInEnterEmailScreen.Kf(this.f79542a, view);
            }
        });
        Gf().f74269g.setOnClickListener(new View.OnClickListener() { // from class: th.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInEnterEmailScreen.Lf(this.f79544a, view);
            }
        });
        TextInputEditText textInputEditText = Gf().f74271i;
        ju.t.e(textInputEditText, "emailEditText");
        textInputEditText.addTextChangedListener(new c());
        Gf().f74271i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: th.z0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return SignInEnterEmailScreen.Mf(this.f79548a, textView, i10, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(SignInEnterEmailScreen signInEnterEmailScreen, View view) {
        signInEnterEmailScreen.Hf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(SignInEnterEmailScreen signInEnterEmailScreen, View view) {
        signInEnterEmailScreen.Hf().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Mf(SignInEnterEmailScreen signInEnterEmailScreen, TextView textView, int i10, KeyEvent keyEvent) {
        ju.t.f(textView, "<unused var>");
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if (((i10 & 6) == 0 && i10 != 0) || !signInEnterEmailScreen.Gf().f74269g.isEnabled()) {
            return false;
        }
        signInEnterEmailScreen.Gf().f74269g.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Nf(SignInEnterEmailScreen signInEnterEmailScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        if (signInEnterEmailScreen.Gf().f74264b.f72288b.isEnabled()) {
            signInEnterEmailScreen.Hf().y2();
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInEnterEmailPresenter Of(SignInEnterEmailScreen signInEnterEmailScreen) {
        return new SignInEnterEmailPresenter(signInEnterEmailScreen.Ff().getFeatureType(), signInEnterEmailScreen.Ff().getNeedSyncKeysAndPasswords(), signInEnterEmailScreen.Ff().getNeedCreateTrialAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Pf(SignInEnterEmailScreen signInEnterEmailScreen) {
        Context contextRequireContext = signInEnterEmailScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        bh.a.b(this, new i(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new p(a0Var, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void C1(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new f(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void D() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void F() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void L3(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new h(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void P(boolean z10) {
        bh.a.b(this, new o(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void b() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void d() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void i() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void l() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.c1
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SignInEnterEmailScreen.Nf(this.f79480a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25508f = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.f25504b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f25503a = w6.c(layoutInflater, viewGroup, false);
        Df();
        ConstraintLayout constraintLayoutB = Gf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (If().isShowing()) {
            If().dismiss();
        }
        this.f25503a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25508f;
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
        tp.m0 m0Var = this.f25504b;
        NestedScrollView nestedScrollView = Gf().f74268f;
        ju.t.e(nestedScrollView, "contentScrollContainer");
        ConstraintLayout constraintLayout = Gf().f74267e;
        ju.t.e(constraintLayout, "contentLayout");
        m0Var.b(nestedScrollView, constraintLayout, Gf().f74275m);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void t0(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new g(i10, emailAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void z(int i10) {
        bh.a.b(this, new q(i10, this, null));
    }
}

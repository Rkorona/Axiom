package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c2.o1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.UnlockVerificationByEmailScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.w0;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.presenters.account.UnlockVerificationByEmailPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.n8;
import tp.u0;
import tp.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class UnlockVerificationByEmailScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n8 f25867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25868b = new androidx.navigation.x(ju.n0.b(UnlockVerificationByEmailScreenArgs.class), new n(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.activity.e0 f25870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f25871e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25865u = {ju.n0.g(new ju.g0(UnlockVerificationByEmailScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/UnlockVerificationByEmailPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f25864f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f25866v = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25872a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25872a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = UnlockVerificationByEmailScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(1);
            fragmentActivityRequireActivity.finish();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25874a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25874a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            UnlockVerificationByEmailScreen.this.Bf().f73340b.f72288b.setEnabled(true);
            UnlockVerificationByEmailScreen.this.Bf().f73344f.setCompleteButtonState(true);
            if (UnlockVerificationByEmailScreen.this.Df().isShowing()) {
                UnlockVerificationByEmailScreen.this.Df().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d extends ClickableSpan {
        d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ju.t.f(view, "widget");
            UnlockVerificationByEmailScreen.this.Cf().A2();
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25878b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f25880d;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnlockVerificationByEmailScreen f25882b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen, zt.e eVar) {
                super(2, eVar);
                this.f25882b = unlockVerificationByEmailScreen;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f25882b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f25881a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    this.f25881a = 1;
                    if (wu.s0.b(5000L, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                this.f25882b.Bf().f73344f.setCompleteButtonState(true);
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f25880d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen, View view) {
            unlockVerificationByEmailScreen.Cf().B2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen, View view) {
            unlockVerificationByEmailScreen.Cf().z2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            e eVar2 = UnlockVerificationByEmailScreen.this.new e(this.f25880d, eVar);
            eVar2.f25878b = obj;
            return eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25877a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            wu.i0 i0Var = (wu.i0) this.f25878b;
            UnlockVerificationByEmailScreen.this.Bf().f73351m.setText(this.f25880d);
            TextView textView = UnlockVerificationByEmailScreen.this.Bf().f73351m;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            ProgressButton progressButton = UnlockVerificationByEmailScreen.this.Bf().f73344f;
            final UnlockVerificationByEmailScreen unlockVerificationByEmailScreen = UnlockVerificationByEmailScreen.this;
            progressButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnlockVerificationByEmailScreen.e.l(unlockVerificationByEmailScreen, view);
                }
            });
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = UnlockVerificationByEmailScreen.this.Bf().f73340b.f72288b;
            final UnlockVerificationByEmailScreen unlockVerificationByEmailScreen2 = UnlockVerificationByEmailScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnlockVerificationByEmailScreen.e.m(unlockVerificationByEmailScreen2, view);
                }
            });
            UnlockVerificationByEmailScreen.this.Bf().f73344f.setIndeterminateButtonState();
            UnlockVerificationByEmailScreen.this.Bf().f73344f.setEnabled(false);
            UnlockVerificationByEmailScreen.this.Ef();
            wu.k.d(i0Var, null, null, new a(UnlockVerificationByEmailScreen.this, null), 3, null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25883a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(UnlockVerificationByEmailScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UnlockVerificationByEmailScreen f25888d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(EmailAuthentication emailAuthentication, String str, UnlockVerificationByEmailScreen unlockVerificationByEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25886b = emailAuthentication;
            this.f25887c = str;
            this.f25888d = unlockVerificationByEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f25886b, this.f25887c, this.f25888d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25885a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            w0.a aVarA = w0.a(this.f25886b, this.f25887c);
            ju.t.e(aVarA, "actionUnlockVerification…RequireTwoFactorCode(...)");
            androidx.navigation.fragment.c.a(this.f25888d).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25889a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25889a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            UnlockVerificationByEmailScreen unlockVerificationByEmailScreen = UnlockVerificationByEmailScreen.this;
            String string = unlockVerificationByEmailScreen.getString(R.string.termius_contact_support_page_url);
            ju.t.e(string, "getString(...)");
            unlockVerificationByEmailScreen.If(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25891a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LoginErrorContainer f25893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(LoginErrorContainer loginErrorContainer, zt.e eVar) {
            super(2, eVar);
            this.f25893c = loginErrorContainer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new i(this.f25893c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.u0 u0VarJ;
            au.b.f();
            if (this.f25891a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.d0 d0VarA = androidx.navigation.fragment.c.a(UnlockVerificationByEmailScreen.this).A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                u0VarJ.h("VERIFICATION_BY_EMAIL_ERROR_KEY", this.f25893c);
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
        int f25894a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f25896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.server.auditor.ssh.client.help.a0 a0Var, zt.e eVar) {
            super(2, eVar);
            this.f25896c = a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new j(this.f25896c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25894a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            UnlockVerificationByEmailScreen unlockVerificationByEmailScreen = UnlockVerificationByEmailScreen.this;
            com.server.auditor.ssh.client.help.a0 a0Var = this.f25896c;
            Context contextRequireContext = unlockVerificationByEmailScreen.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            unlockVerificationByEmailScreen.k(a0Var.a(contextRequireContext));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25897a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f25899c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new k(this.f25899c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25897a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = UnlockVerificationByEmailScreen.this.getView();
            if (view != null) {
                String str = this.f25899c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
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
        int f25900a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25900a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = UnlockVerificationByEmailScreen.this.getString(R.string.toast_internet_available);
            ju.t.e(string, "getString(...)");
            UnlockVerificationByEmailScreen.this.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25902a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return UnlockVerificationByEmailScreen.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.u0 u0VarJ;
            au.b.f();
            if (this.f25902a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.d0 d0VarA = androidx.navigation.fragment.c.a(UnlockVerificationByEmailScreen.this).A();
            if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
            }
            UnlockVerificationByEmailScreen.this.Bf().f73340b.f72288b.setEnabled(false);
            UnlockVerificationByEmailScreen.this.Bf().f73344f.setDefaultButtonState();
            UnlockVerificationByEmailScreen.this.Bf().f73344f.setEnabled(false);
            if (!UnlockVerificationByEmailScreen.this.Df().isShowing()) {
                UnlockVerificationByEmailScreen.this.Df().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class n implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25904a;

        public n(Fragment fragment) {
            this.f25904a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25904a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25904a + " has null arguments");
        }
    }

    public UnlockVerificationByEmailScreen() {
        iu.a aVar = new iu.a() { // from class: th.y2
            @Override // iu.a
            public final Object a() {
                return UnlockVerificationByEmailScreen.Gf(this.f79546a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25869c = new MoxyKtxDelegate(mvpDelegate, UnlockVerificationByEmailPresenter.class.getName() + ".presenter", aVar);
        this.f25871e = ut.o.a(new iu.a() { // from class: th.z2
            @Override // iu.a
            public final Object a() {
                return UnlockVerificationByEmailScreen.Hf(this.f79550a);
            }
        });
    }

    private final UnlockVerificationByEmailScreenArgs Af() {
        return (UnlockVerificationByEmailScreenArgs) this.f25868b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n8 Bf() {
        n8 n8Var = this.f25867a;
        if (n8Var != null) {
            return n8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnlockVerificationByEmailPresenter Cf() {
        return (UnlockVerificationByEmailPresenter) this.f25869c.getValue(this, f25865u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Df() {
        return (AlertDialog) this.f25871e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.did_not_get_email_contact_us));
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        int i10 = tp.c0.i(contextRequireContext, R.attr.colorPrimary);
        w0.a aVar = tp.w0.f81061a;
        String string = getString(R.string.did_not_get_email_contact_us_part1);
        ju.t.e(string, "getString(...)");
        aVar.a(spannableStringBuilder, string, new ForegroundColorSpan(i10), new d());
        Bf().f73342d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        Bf().f73342d.setMovementMethod(LinkMovementMethod.getInstance());
        Bf().f73342d.setHighlightColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Ff(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        if (unlockVerificationByEmailScreen.Bf().f73340b.f72288b.isEnabled()) {
            unlockVerificationByEmailScreen.Cf().z2();
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnlockVerificationByEmailPresenter Gf(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen) {
        AuthenticationModel authenticationModel = unlockVerificationByEmailScreen.Af().getAuthenticationModel();
        ju.t.e(authenticationModel, "getAuthenticationModel(...)");
        String encodedPasswordHex = unlockVerificationByEmailScreen.Af().getEncodedPasswordHex();
        ju.t.e(encodedPasswordHex, "getEncodedPasswordHex(...)");
        byte[] bytes = encodedPasswordHex.getBytes(su.d.f78241b);
        ju.t.e(bytes, "getBytes(...)");
        return new UnlockVerificationByEmailPresenter(authenticationModel, bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Hf(UnlockVerificationByEmailScreen unlockVerificationByEmailScreen) {
        Context contextRequireContext = unlockVerificationByEmailScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        bh.a.b(this, new k(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void ae(EmailAuthentication emailAuthentication, String str) {
        ju.t.f(emailAuthentication, "authenticationModel");
        ju.t.f(str, "encodedPassword");
        bh.a.b(this, new g(emailAuthentication, str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void b() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void d() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void d1() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void e() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void g() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void n() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.a3
            @Override // iu.l
            public final Object invoke(Object obj) {
                return UnlockVerificationByEmailScreen.Ff(this.f79475a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25870d = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25867a = n8.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = Bf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (Df().isShowing()) {
            Df().dismiss();
        }
        this.f25867a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25870d;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void s0(LoginErrorContainer loginErrorContainer) {
        ju.t.f(loginErrorContainer, "errorModel");
        bh.a.b(this, new i(loginErrorContainer, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void u(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new e(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void ve(com.server.auditor.ssh.client.help.a0 a0Var) {
        ju.t.f(a0Var, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this, new j(a0Var, null));
    }
}

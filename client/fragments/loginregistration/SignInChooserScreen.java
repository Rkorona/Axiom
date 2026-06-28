package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.SignInChooserScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.y;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.navigation.auth.AppleSsoWebViewActivity;
import com.server.auditor.ssh.client.presenters.account.SignInChooserPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.v6;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInChooserScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25423y = {ju.n0.g(new ju.g0(SignInChooserScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/SignInChooserPresenter;", 0))};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f25424z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v6 f25425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tp.m0 f25426b = new tp.m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f25427c = new androidx.navigation.x(ju.n0.b(SignInChooserScreenArgs.class), new r(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f25428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.activity.e0 f25429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ut.n f25430f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private nj.e f25431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.c f25432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final g.b f25433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final g.b f25434x;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25435a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25435a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = SignInChooserScreen.this.requireActivity();
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
        int f25437a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25437a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (SignInChooserScreen.this.Sf().isShowing()) {
                SignInChooserScreen.this.Sf().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25439a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25439a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserScreen.this.dg();
            SignInChooserScreen.this.Xf();
            SignInChooserScreen.this.Vf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25441a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25441a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            nj.e eVar = SignInChooserScreen.this.f25431u;
            if (eVar != null) {
                eVar.n();
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
        int f25443a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.google.android.gms.auth.api.signin.c cVar = SignInChooserScreen.this.f25432v;
            if (cVar != null) {
                cVar.signOut();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25445a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(SignInChooserScreen.this).T()) {
                SignInChooserScreen.this.f();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25451e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, boolean z10, boolean z11, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25448b = i10;
            this.f25449c = z10;
            this.f25450d = z11;
            this.f25451e = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f25448b, this.f25449c, this.f25450d, this.f25451e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25447a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.a aVarA = y.a(this.f25448b, null, this.f25449c, this.f25450d);
            ju.t.e(aVarA, "actionSignInChooserScree…gnOnEnterEmailScreen(...)");
            androidx.navigation.fragment.c.a(this.f25451e).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25456e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, boolean z10, boolean z11, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25453b = i10;
            this.f25454c = z10;
            this.f25455d = z11;
            this.f25456e = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f25453b, this.f25454c, this.f25455d, this.f25456e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25452a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.b bVarB = y.b(this.f25453b, this.f25454c, this.f25455d);
            ju.t.e(bVarB, "actionSignInChooserScree…gnInEnterEmailScreen(...)");
            androidx.navigation.fragment.c.a(this.f25456e).O(bVarB);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25461e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, boolean z10, boolean z11, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25458b = i10;
            this.f25459c = z10;
            this.f25460d = z11;
            this.f25461e = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f25458b, this.f25459c, this.f25460d, this.f25461e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25457a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.d dVarD = y.d(this.f25458b, this.f25459c, this.f25460d);
            ju.t.e(dVarD, "actionSignInChooserScree…oSignUpChooserScreen(...)");
            androidx.navigation.fragment.c.a(this.f25461e).O(dVarD);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FirebaseSingleSignOnAuthentication f25464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25467f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25463b = i10;
            this.f25464c = firebaseSingleSignOnAuthentication;
            this.f25465d = z10;
            this.f25466e = z11;
            this.f25467f = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f25463b, this.f25464c, this.f25465d, this.f25466e, this.f25467f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25462a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.c cVarC = y.c(this.f25463b, this.f25464c, this.f25465d, this.f25466e);
            ju.t.e(cVarC, "actionSignInChooserScree…nEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25467f).O(cVarC);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FirebaseSingleSignOnAuthentication f25470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25473f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25469b = i10;
            this.f25470c = firebaseSingleSignOnAuthentication;
            this.f25471d = z10;
            this.f25472e = z11;
            this.f25473f = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new k(this.f25469b, this.f25470c, this.f25471d, this.f25472e, this.f25473f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25468a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            y.e eVarE = y.e(this.f25469b, this.f25470c, this.f25471d, this.f25472e);
            ju.t.e(eVarE, "actionSignInChooserScree…pEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25473f).O(eVarE);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25474a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f25476c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new l(this.f25476c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25474a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = SignInChooserScreen.this.getView();
            if (view != null) {
                String str = this.f25476c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f25479c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new m(this.f25479c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25477a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = SignInChooserScreen.this.getView();
            if (view != null) {
                String str = this.f25479c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.d(context, view, str, 0).Y();
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
        int f25480a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25480a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserScreen signInChooserScreen = SignInChooserScreen.this;
            String string = signInChooserScreen.getString(R.string.toast_internet_available);
            ju.t.e(string, "getString(...)");
            signInChooserScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25482a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25482a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!SignInChooserScreen.this.Sf().isShowing()) {
                SignInChooserScreen.this.Sf().show();
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
        int f25484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25486c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, zt.e eVar) {
            super(2, eVar);
            this.f25486c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new p(this.f25486c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25484a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = SignInChooserScreen.this.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f25486c));
            ju.t.e(string, "getString(...)");
            SignInChooserScreen.this.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25487a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25487a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserScreen signInChooserScreen = SignInChooserScreen.this;
            String string = signInChooserScreen.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            signInChooserScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class r implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25489a;

        public r(Fragment fragment) {
            this.f25489a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25489a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25489a + " has null arguments");
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25490a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f25492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Intent intent, zt.e eVar) {
            super(2, eVar);
            this.f25492c = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new s(this.f25492c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25490a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            nj.e eVar = SignInChooserScreen.this.f25431u;
            if (eVar != null) {
                eVar.e(this.f25492c);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25493a;

        t(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new t(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserScreen.this.f25434x.a(new Intent(SignInChooserScreen.this.requireActivity(), (Class<?>) AppleSsoWebViewActivity.class));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25495a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserScreen.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25495a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.google.android.gms.auth.api.signin.c cVar = SignInChooserScreen.this.f25432v;
            if (cVar != null) {
                SignInChooserScreen.this.f25433w.a(cVar.d());
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignInChooserScreen f25499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(int i10, SignInChooserScreen signInChooserScreen, zt.e eVar) {
            super(2, eVar);
            this.f25498b = i10;
            this.f25499c = signInChooserScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new v(this.f25498b, this.f25499c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25497a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            int i10 = this.f25498b;
            if (i10 == 127) {
                this.f25499c.Qf().f74169p.setImageResource(R.drawable.ic_gradient_stars);
                this.f25499c.Qf().f74172s.setText(this.f25499c.getString(R.string.enable_ai_in_termius));
                this.f25499c.Qf().f74165l.setText(this.f25499c.getString(R.string.enable_ai_in_termius_description));
                TextView textView = this.f25499c.Qf().f74165l;
                ju.t.e(textView, "description");
                textView.setVisibility(0);
            } else if (i10 == 128) {
                this.f25499c.Qf().f74169p.setImageResource(R.drawable.session_logs_promo);
                this.f25499c.Qf().f74172s.setText(this.f25499c.getString(R.string.session_logs_view_in_desktop_title));
                this.f25499c.Qf().f74165l.setText(this.f25499c.getString(R.string.view_session_log_unauthorized_promo_description));
                TextView textView2 = this.f25499c.Qf().f74165l;
                ju.t.e(textView2, "description");
                textView2.setVisibility(0);
                this.f25499c.Qf().f74172s.setLineSpacing(0.0f, 1.25f);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public SignInChooserScreen() {
        iu.a aVar = new iu.a() { // from class: th.t0
            @Override // iu.a
            public final Object a() {
                return SignInChooserScreen.fg(this.f79529a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25428d = new MoxyKtxDelegate(mvpDelegate, SignInChooserPresenter.class.getName() + ".presenter", aVar);
        this.f25430f = ut.o.a(new iu.a() { // from class: th.u0
            @Override // iu.a
            public final Object a() {
                return SignInChooserScreen.gg(this.f79533a);
            }
        });
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: th.k0
            @Override // g.a
            public final void a(Object obj) {
                SignInChooserScreen.Tf(this.f79502a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f25433w = bVarRegisterForActivityResult;
        g.b bVarRegisterForActivityResult2 = registerForActivityResult(new h.c(), new g.a() { // from class: th.l0
            @Override // g.a
            public final void a(Object obj) {
                SignInChooserScreen.Mf(this.f79505a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f25434x = bVarRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(SignInChooserScreen signInChooserScreen, ActivityResult activityResult) {
        ju.t.f(activityResult, "it");
        signInChooserScreen.Uf(activityResult);
    }

    private final void Nf() {
        z0.F0(Qf().b(), new o4.i0() { // from class: th.s0
            @Override // o4.i0
            public final o4.a2 onApplyWindowInsets(View view, o4.a2 a2Var) {
                return SignInChooserScreen.Of(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Of(View view, a2 a2Var) {
        ju.t.f(view, "view");
        ju.t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final SignInChooserScreenArgs Pf() {
        return (SignInChooserScreenArgs) this.f25427c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v6 Qf() {
        v6 v6Var = this.f25425a;
        if (v6Var != null) {
            return v6Var;
        }
        throw new IllegalStateException();
    }

    private final SignInChooserPresenter Rf() {
        return (SignInChooserPresenter) this.f25428d.getValue(this, f25423y[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Sf() {
        return (AlertDialog) this.f25430f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Tf(SignInChooserScreen signInChooserScreen, ActivityResult activityResult) {
        ju.t.f(activityResult, "it");
        signInChooserScreen.Rf().C2(activityResult.getData());
    }

    private final void Uf(ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode == -3 || resultCode == -2) {
            SignInChooserPresenter signInChooserPresenterRf = Rf();
            String string = getString(R.string.apple_sso_cannot_get_user_info_error_message);
            ju.t.e(string, "getString(...)");
            signInChooserPresenterRf.v2(string);
            return;
        }
        if (resultCode == -1) {
            SignInChooserPresenter signInChooserPresenterRf2 = Rf();
            String string2 = getString(R.string.apple_sso_wrong_request_id);
            ju.t.e(string2, "getString(...)");
            signInChooserPresenterRf2.v2(string2);
            return;
        }
        if (resultCode == 0) {
            SignInChooserPresenter signInChooserPresenterRf3 = Rf();
            String string3 = getString(R.string.apple_sso_was_canceled_error_message);
            ju.t.e(string3, "getString(...)");
            signInChooserPresenterRf3.v2(string3);
            return;
        }
        if (resultCode != 1) {
            return;
        }
        Intent data = activityResult.getData();
        String stringExtra = data != null ? data.getStringExtra("apple_sso_firebase_token_key") : null;
        Intent data2 = activityResult.getData();
        String stringExtra2 = data2 != null ? data2.getStringExtra("apple_sso_email_key") : null;
        if (stringExtra != null && !su.s.m0(stringExtra) && stringExtra2 != null && !su.s.m0(stringExtra2)) {
            Rf().w2(stringExtra, stringExtra2);
            return;
        }
        SignInChooserPresenter signInChooserPresenterRf4 = Rf();
        String string4 = getString(R.string.apple_sso_cannot_get_user_info_error_message);
        ju.t.e(string4, "getString(...)");
        signInChooserPresenterRf4.v2(string4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Vf() {
        Qf().f74170q.setOnClickListener(new View.OnClickListener() { // from class: th.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.Wf(this.f79498a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Wf(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xf() {
        Qf().f74155b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: th.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.Zf(this.f79512a, view);
            }
        });
        Qf().f74163j.setOnClickListener(new View.OnClickListener() { // from class: th.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.ag(this.f79514a, view);
            }
        });
        Qf().f74164k.setOnClickListener(new View.OnClickListener() { // from class: th.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.bg(this.f79519a, view);
            }
        });
        Qf().f74161h.setOnClickListener(new View.OnClickListener() { // from class: th.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.cg(this.f79523a, view);
            }
        });
        Qf().f74162i.setOnClickListener(new View.OnClickListener() { // from class: th.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInChooserScreen.Yf(this.f79525a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Yf(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zf(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bg(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().B2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cg(SignInChooserScreen signInChooserScreen, View view) {
        signInChooserScreen.Rf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dg() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        nj.e eVar = new nj.e(fragmentActivityRequireActivity, Rf());
        this.f25431u = eVar;
        eVar.n();
        nj.e eVar2 = this.f25431u;
        com.google.android.gms.auth.api.signin.c cVarF = eVar2 != null ? eVar2.f() : null;
        this.f25432v = cVarF;
        if (cVarF != null) {
            cVarF.signOut();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 eg(SignInChooserScreen signInChooserScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        signInChooserScreen.Rf().x2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignInChooserPresenter fg(SignInChooserScreen signInChooserScreen) {
        return new SignInChooserPresenter(signInChooserScreen.Pf().getFeatureType(), signInChooserScreen.Pf().getNeedSyncKeysAndPasswords(), signInChooserScreen.Pf().getNeedCreateTrialAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog gg(SignInChooserScreen signInChooserScreen) {
        Context contextRequireContext = signInChooserScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void A2() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void E7(int i10, boolean z10, boolean z11) {
        bh.a.b(this, new i(i10, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void H1() {
        bh.a.b(this, new u(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Jd(int i10, boolean z10, boolean z11) {
        bh.a.b(this, new g(i10, z11, z10, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void K1(Intent intent) {
        bh.a.b(this, new s(intent, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void T1(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        ju.t.f(firebaseSingleSignOnAuthentication, "firebaseSingleSignOnAuthentication");
        bh.a.b(this, new j(i10, firebaseSingleSignOnAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Y(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this, new m(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Y0(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        ju.t.f(firebaseSingleSignOnAuthentication, "firebaseSingleSignOnAuthentication");
        bh.a.b(this, new k(i10, firebaseSingleSignOnAuthentication, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void b() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void c1() {
        bh.a.b(this, new t(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void d() {
        bh.a.b(this, new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e2() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e3(int i10, boolean z10, boolean z11) {
        bh.a.b(this, new h(i10, z10, z11, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void g() {
        bh.a.b(this, new n(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void h() {
        bh.a.a(this, new q(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void k(String str) {
        ju.t.f(str, "error");
        bh.a.b(this, new l(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void m(int i10) {
        bh.a.b(this, new p(i10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.m0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return SignInChooserScreen.eg(this.f79508a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25429e = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.f25426b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f25425a = v6.c(layoutInflater, viewGroup, false);
        Nf();
        ConstraintLayout constraintLayoutB = Qf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25425a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25429e;
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
        tp.m0 m0Var = this.f25426b;
        NestedScrollView nestedScrollView = Qf().f74160g;
        ju.t.e(nestedScrollView, "contentScrollContainer");
        ConstraintLayout constraintLayout = Qf().f74159f;
        ju.t.e(constraintLayout, "contentLayout");
        m0Var.b(nestedScrollView, constraintLayout, Qf().f74169p);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void z(int i10) {
        bh.a.b(this, new v(i10, this, null));
    }
}

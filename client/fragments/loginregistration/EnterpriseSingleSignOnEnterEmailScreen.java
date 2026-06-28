package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.EnterpriseSingleSignOnEnterEmailScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.i;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.navigation.auth.EnterpriseSsoWebViewActivity;
import com.server.auditor.ssh.client.presenters.account.EnterpriseSingleSignOnEnterEmailPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.x1;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class EnterpriseSingleSignOnEnterEmailScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25246v = {ju.n0.g(new ju.g0(EnterpriseSingleSignOnEnterEmailScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/EnterpriseSingleSignOnEnterEmailPresenter;", 0))};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f25247w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x1 f25248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tp.m0 f25249b = new tp.m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.navigation.x f25250c = new androidx.navigation.x(ju.n0.b(EnterpriseSingleSignOnEnterEmailScreenArgs.class), new p(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f25251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.activity.e0 f25252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ut.n f25253f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g.b f25254u;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25255a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25255a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = EnterpriseSingleSignOnEnterEmailScreen.this.If().f74326i;
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
        int f25257a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (EnterpriseSingleSignOnEnterEmailScreen.this.Kf().isShowing()) {
                EnterpriseSingleSignOnEnterEmailScreen.this.Kf().dismiss();
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
            EnterpriseSingleSignOnEnterEmailScreen.this.Jf().E2(String.valueOf(editable));
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
        int f25260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnterpriseSingleSignOnEnterEmailScreen f25262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25261b = str;
            this.f25262c = enterpriseSingleSignOnEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f25261b, this.f25262c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25260a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f25261b != null) {
                this.f25262c.If().f74326i.setText(this.f25261b);
            }
            this.f25262c.Lf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25263a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(EnterpriseSingleSignOnEnterEmailScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnterpriseSingleSignOnAuthentication f25267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f25269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnterpriseSingleSignOnEnterEmailScreen f25270f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, boolean z10, boolean z11, EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25266b = i10;
            this.f25267c = enterpriseSingleSignOnAuthentication;
            this.f25268d = z10;
            this.f25269e = z11;
            this.f25270f = enterpriseSingleSignOnEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f25266b, this.f25267c, this.f25268d, this.f25269e, this.f25270f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i.a aVarA = com.server.auditor.ssh.client.fragments.loginregistration.i.a(this.f25266b, this.f25267c, this.f25268d, this.f25269e);
            ju.t.e(aVarA, "actionEnterpriseSingleSi…nEnterPasswordScreen(...)");
            androidx.navigation.fragment.c.a(this.f25270f).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f25273c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new g(this.f25273c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent(EnterpriseSingleSignOnEnterEmailScreen.this.requireActivity(), (Class<?>) EnterpriseSsoWebViewActivity.class);
            intent.putExtra("auth_url", this.f25273c);
            EnterpriseSingleSignOnEnterEmailScreen.this.f25254u.a(intent);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25274a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25274a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen = EnterpriseSingleSignOnEnterEmailScreen.this;
            String string = enterpriseSingleSignOnEnterEmailScreen.getString(R.string.enterprise_user_not_exist);
            ju.t.e(string, "getString(...)");
            enterpriseSingleSignOnEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25276a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen = EnterpriseSingleSignOnEnterEmailScreen.this;
            String string = enterpriseSingleSignOnEnterEmailScreen.getString(R.string.enterprise_user_not_migrated);
            ju.t.e(string, "getString(...)");
            enterpriseSingleSignOnEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25278a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f25280c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new j(this.f25280c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25278a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = EnterpriseSingleSignOnEnterEmailScreen.this.getView();
            if (view != null) {
                String str = this.f25280c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25281a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = EnterpriseSingleSignOnEnterEmailScreen.this.If().f74326i;
            ju.t.e(textInputEditText, "emailEditText");
            tp.z.e(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25283a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25283a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen = EnterpriseSingleSignOnEnterEmailScreen.this;
            String string = enterpriseSingleSignOnEnterEmailScreen.getString(R.string.toast_internet_available);
            ju.t.e(string, "getString(...)");
            enterpriseSingleSignOnEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25285a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25285a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!EnterpriseSingleSignOnEnterEmailScreen.this.Kf().isShowing()) {
                EnterpriseSingleSignOnEnterEmailScreen.this.Kf().show();
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
        int f25287a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, zt.e eVar) {
            super(2, eVar);
            this.f25289c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new n(this.f25289c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = EnterpriseSingleSignOnEnterEmailScreen.this.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f25289c));
            ju.t.e(string, "getString(...)");
            EnterpriseSingleSignOnEnterEmailScreen.this.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25290a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailScreen.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen = EnterpriseSingleSignOnEnterEmailScreen.this;
            String string = enterpriseSingleSignOnEnterEmailScreen.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            enterpriseSingleSignOnEnterEmailScreen.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class p implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25292a;

        public p(Fragment fragment) {
            this.f25292a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25292a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25292a + " has null arguments");
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f25294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnterpriseSingleSignOnEnterEmailScreen f25295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(com.server.auditor.ssh.client.help.a0 a0Var, EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25294b = a0Var;
            this.f25295c = enterpriseSingleSignOnEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new q(this.f25294b, this.f25295c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strA;
            au.b.f();
            if (this.f25293a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.help.a0 a0Var = this.f25294b;
            String strA2 = null;
            if (a0Var != null) {
                Context contextRequireContext = this.f25295c.requireContext();
                ju.t.e(contextRequireContext, "requireContext(...)");
                strA = a0Var.a(contextRequireContext);
            } else {
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                AppCompatTextView appCompatTextView = this.f25295c.If().f74327j;
                ju.t.e(appCompatTextView, "emailError");
                appCompatTextView.setVisibility(8);
                this.f25295c.If().f74327j.setText("");
            } else {
                AppCompatTextView appCompatTextView2 = this.f25295c.If().f74327j;
                com.server.auditor.ssh.client.help.a0 a0Var2 = this.f25294b;
                if (a0Var2 != null) {
                    Context contextRequireContext2 = this.f25295c.requireContext();
                    ju.t.e(contextRequireContext2, "requireContext(...)");
                    strA2 = a0Var2.a(contextRequireContext2);
                }
                appCompatTextView2.setText(strA2);
                AppCompatTextView appCompatTextView3 = this.f25295c.If().f74327j;
                ju.t.e(appCompatTextView3, "emailError");
                appCompatTextView3.setVisibility(0);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnterpriseSingleSignOnEnterEmailScreen f25298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i10, EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, zt.e eVar) {
            super(2, eVar);
            this.f25297b = i10;
            this.f25298c = enterpriseSingleSignOnEnterEmailScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new r(this.f25297b, this.f25298c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            int i10 = this.f25297b;
            if (i10 == 127) {
                this.f25298c.If().f74330m.setImageResource(R.drawable.ic_gradient_mail);
                this.f25298c.If().f74332o.setText(this.f25298c.getString(R.string.enable_ai_in_termius));
                this.f25298c.If().f74325h.setText(this.f25298c.getString(R.string.enable_ai_in_termius_description));
            } else if (i10 == 128) {
                this.f25298c.If().f74330m.setImageResource(R.drawable.ic_gradient_mail);
                this.f25298c.If().f74332o.setText(this.f25298c.getString(R.string.session_logs_view_in_desktop_title));
                this.f25298c.If().f74325h.setText(this.f25298c.getString(R.string.view_session_log_unauthorized_promo_description));
                this.f25298c.If().f74332o.setLineSpacing(0.0f, 1.25f);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public EnterpriseSingleSignOnEnterEmailScreen() {
        iu.a aVar = new iu.a() { // from class: th.e
            @Override // iu.a
            public final Object a() {
                return EnterpriseSingleSignOnEnterEmailScreen.Qf(this.f79484a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25251d = new MoxyKtxDelegate(mvpDelegate, EnterpriseSingleSignOnEnterEmailPresenter.class.getName() + ".presenter", aVar);
        this.f25253f = ut.o.a(new iu.a() { // from class: th.f
            @Override // iu.a
            public final Object a() {
                return EnterpriseSingleSignOnEnterEmailScreen.Rf(this.f79485a);
            }
        });
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: th.g
            @Override // g.a
            public final void a(Object obj) {
                EnterpriseSingleSignOnEnterEmailScreen.Gf(this.f79488a, (ActivityResult) obj);
            }
        });
        ju.t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f25254u = bVarRegisterForActivityResult;
    }

    private final void Ef() {
        z0.F0(If().b(), new o4.i0() { // from class: th.l
            @Override // o4.i0
            public final o4.a2 onApplyWindowInsets(View view, o4.a2 a2Var) {
                return EnterpriseSingleSignOnEnterEmailScreen.Ff(view, a2Var);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, ActivityResult activityResult) {
        ju.t.f(activityResult, "it");
        if (activityResult.getResultCode() != -1) {
            Intent data = activityResult.getData();
            enterpriseSingleSignOnEnterEmailScreen.Jf().G2(data != null ? Integer.valueOf(data.getIntExtra("web_client_error_result_code", -1)) : null);
            return;
        }
        Intent data2 = activityResult.getData();
        String stringExtra = data2 != null ? data2.getStringExtra("one_token") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        enterpriseSingleSignOnEnterEmailScreen.Jf().F2(stringExtra);
    }

    private final EnterpriseSingleSignOnEnterEmailScreenArgs Hf() {
        return (EnterpriseSingleSignOnEnterEmailScreenArgs) this.f25250c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1 If() {
        x1 x1Var = this.f25248a;
        if (x1Var != null) {
            return x1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnterpriseSingleSignOnEnterEmailPresenter Jf() {
        return (EnterpriseSingleSignOnEnterEmailPresenter) this.f25251d.getValue(this, f25246v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Kf() {
        return (AlertDialog) this.f25253f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        If().f74319b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: th.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterpriseSingleSignOnEnterEmailScreen.Mf(this.f79495a, view);
            }
        });
        If().f74324g.setOnClickListener(new View.OnClickListener() { // from class: th.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterpriseSingleSignOnEnterEmailScreen.Nf(this.f79497a, view);
            }
        });
        TextInputEditText textInputEditText = If().f74326i;
        ju.t.e(textInputEditText, "emailEditText");
        textInputEditText.addTextChangedListener(new c());
        If().f74326i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: th.k
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return EnterpriseSingleSignOnEnterEmailScreen.Of(this.f79501a, textView, i10, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, View view) {
        enterpriseSingleSignOnEnterEmailScreen.Jf().C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, View view) {
        enterpriseSingleSignOnEnterEmailScreen.Jf().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Of(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, TextView textView, int i10, KeyEvent keyEvent) {
        ju.t.f(textView, "<unused var>");
        if (keyEvent != null && keyEvent.getAction() != 0) {
            return false;
        }
        if (((i10 & 6) == 0 && i10 != 0) || !enterpriseSingleSignOnEnterEmailScreen.If().f74324g.isEnabled()) {
            return false;
        }
        enterpriseSingleSignOnEnterEmailScreen.If().f74324g.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Pf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        enterpriseSingleSignOnEnterEmailScreen.Jf().C2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterpriseSingleSignOnEnterEmailPresenter Qf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen) {
        int featureType = enterpriseSingleSignOnEnterEmailScreen.Hf().getFeatureType();
        EmailAuthentication authenticationModel = enterpriseSingleSignOnEnterEmailScreen.Hf().getAuthenticationModel();
        return new EnterpriseSingleSignOnEnterEmailPresenter(featureType, authenticationModel != null ? authenticationModel.getEmail() : null, enterpriseSingleSignOnEnterEmailScreen.Hf().getNeedSyncKeysAndPasswords(), enterpriseSingleSignOnEnterEmailScreen.Hf().getNeedCreateTrialAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Rf(EnterpriseSingleSignOnEnterEmailScreen enterpriseSingleSignOnEnterEmailScreen) {
        Context contextRequireContext = enterpriseSingleSignOnEnterEmailScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new q(a0Var, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void I1() {
        bh.a.a(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void a2(String str) {
        ju.t.f(str, "url");
        bh.a.a(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void b() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void d() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void e0(String str) {
        bh.a.b(this, new d(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void g() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void h() {
        bh.a.a(this, new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void i() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void k(String str) {
        ju.t.f(str, "error");
        bh.a.b(this, new j(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void l() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void m(int i10) {
        bh.a.b(this, new n(i10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: th.h
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EnterpriseSingleSignOnEnterEmailScreen.Pf(this.f79491a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f25252e = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(this.f25249b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f25248a = x1.c(layoutInflater, viewGroup, false);
        Ef();
        ConstraintLayout constraintLayoutB = If().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25248a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        androidx.activity.e0 e0Var = this.f25252e;
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
        tp.m0 m0Var = this.f25249b;
        NestedScrollView nestedScrollView = If().f74323f;
        ju.t.e(nestedScrollView, "contentScrollContainer");
        ConstraintLayout constraintLayout = If().f74322e;
        ju.t.e(constraintLayout, "contentLayout");
        m0Var.b(nestedScrollView, constraintLayout, If().f74330m);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void s2() {
        bh.a.a(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void z(int i10) {
        bh.a.b(this, new r(i10, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void z8(int i10, EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, boolean z10, boolean z11) {
        ju.t.f(enterpriseSingleSignOnAuthentication, "enterpriseAuthenticationModel");
        bh.a.b(this, new f(i10, enterpriseSingleSignOnAuthentication, z10, z11, this, null));
    }
}

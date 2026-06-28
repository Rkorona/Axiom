package com.server.auditor.ssh.client.navigation.totp;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.i0;
import com.server.auditor.ssh.client.navigation.totp.ChangePasswordRequireTwoFactorCode;
import com.server.auditor.ssh.client.presenters.ChangePasswordRequireTwoFactorCodePresenter;
import java.nio.charset.Charset;
import ju.g0;
import ju.n0;
import ju.t;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.l8;
import tp.u0;
import tp.z;
import ut.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangePasswordRequireTwoFactorCode extends MvpAppCompatFragment implements i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29895f = {n0.g(new g0(ChangePasswordRequireTwoFactorCode.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ChangePasswordRequireTwoFactorCodePresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f29896u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l8 f29897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29898b = new x(n0.b(ChangePasswordRequireTwoFactorCodeArgs.class), new p(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f29899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f29900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f29901e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29902a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29902a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity activity = ChangePasswordRequireTwoFactorCode.this.getActivity();
            if (activity != null) {
                activity.setResult(-1);
                activity.finish();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29904a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29904a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ChangePasswordRequireTwoFactorCode.this.Gf().isShowing()) {
                ChangePasswordRequireTwoFactorCode.this.Gf().dismiss();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChangePasswordRequireTwoFactorCode.this.Ff().B2(String.valueOf(editable));
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
        int f29907a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29907a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode.this.Hf();
            ChangePasswordRequireTwoFactorCode.this.Jf();
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            String string = changePasswordRequireTwoFactorCode.getString(R.string.please_enter_your_otp_code);
            t.e(string, "getString(...)");
            changePasswordRequireTwoFactorCode.Nf(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29909a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29909a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ChangePasswordRequireTwoFactorCode.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29911a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29911a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            changePasswordRequireTwoFactorCode.s(changePasswordRequireTwoFactorCode.getString(R.string.bad_request_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29913a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29913a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            changePasswordRequireTwoFactorCode.s(changePasswordRequireTwoFactorCode.getString(R.string.new_crypto_migration_security_token_throttled_later));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29915a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29915a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            changePasswordRequireTwoFactorCode.s(changePasswordRequireTwoFactorCode.getString(R.string.password_change_failed));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29917a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29917a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode.this.Ef().f73086m.requestFocus();
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            changePasswordRequireTwoFactorCode.s(changePasswordRequireTwoFactorCode.getString(R.string.required_field));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29919a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f29921c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new j(this.f29921c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29919a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = ChangePasswordRequireTwoFactorCode.this.getView();
            if (view != null) {
                String str = this.f29921c;
                u0.a aVar = u0.f81015a;
                Context context = view.getContext();
                t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29922a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29922a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputLayout textInputLayout = ChangePasswordRequireTwoFactorCode.this.Ef().f73087n;
            t.e(textInputLayout, "totp2faCodeInputLayout");
            z.e(textInputLayout);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29924a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29924a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = ChangePasswordRequireTwoFactorCode.this.getString(R.string.toast_internet_available);
            t.e(string, "getString(...)");
            ChangePasswordRequireTwoFactorCode.this.k(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29926a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29926a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ChangePasswordRequireTwoFactorCode.this.Gf().isShowing()) {
                ChangePasswordRequireTwoFactorCode.this.Gf().show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29928a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29930c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, zt.e eVar) {
            super(2, eVar);
            this.f29930c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new n(this.f29930c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29928a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = ChangePasswordRequireTwoFactorCode.this.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f29930c));
            t.e(string, "getString(...)");
            ChangePasswordRequireTwoFactorCode.this.s(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29931a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29931a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode = ChangePasswordRequireTwoFactorCode.this;
            changePasswordRequireTwoFactorCode.s(changePasswordRequireTwoFactorCode.getString(R.string.login_registration_unexpected_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class p implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29933a;

        public p(Fragment fragment) {
            this.f29933a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29933a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29933a + " has null arguments");
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29934a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29936c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new q(this.f29936c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29934a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode.this.Ef().f73077d.setEnabled(this.f29936c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29937a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, zt.e eVar) {
            super(2, eVar);
            this.f29939c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCode.this.new r(this.f29939c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29937a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangePasswordRequireTwoFactorCode.this.Ef().f73087n.setError(this.f29939c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangePasswordRequireTwoFactorCode() {
        iu.a aVar = new iu.a() { // from class: zj.h
            @Override // iu.a
            public final Object a() {
                return ChangePasswordRequireTwoFactorCode.Mf(this.f87982a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29899c = new MoxyKtxDelegate(mvpDelegate, ChangePasswordRequireTwoFactorCodePresenter.class.getName() + ".presenter", aVar);
        this.f29901e = ut.o.a(new iu.a() { // from class: zj.i
            @Override // iu.a
            public final Object a() {
                return ChangePasswordRequireTwoFactorCode.Of(this.f87984a);
            }
        });
    }

    private final void Cf() {
        z0.F0(Ef().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final ChangePasswordRequireTwoFactorCodeArgs Df() {
        return (ChangePasswordRequireTwoFactorCodeArgs) this.f29898b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l8 Ef() {
        l8 l8Var = this.f29897a;
        if (l8Var != null) {
            return l8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChangePasswordRequireTwoFactorCodePresenter Ff() {
        return (ChangePasswordRequireTwoFactorCodePresenter) this.f29899c.getValue(this, f29895f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Gf() {
        return (AlertDialog) this.f29901e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Ef().f73075b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangePasswordRequireTwoFactorCode.If(this.f87986a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode, View view) {
        changePasswordRequireTwoFactorCode.Ff().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        TextInputEditText textInputEditText = Ef().f73086m;
        t.e(textInputEditText, "totp2faCodeInputField");
        textInputEditText.addTextChangedListener(new c());
        MaterialButton materialButton = Ef().f73077d;
        t.e(materialButton, "confirmButton");
        tp.o.b(materialButton, 0L, new iu.l() { // from class: zj.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangePasswordRequireTwoFactorCode.Kf(this.f87981a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Kf(ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode, View view) {
        t.f(view, "it");
        changePasswordRequireTwoFactorCode.Ff().A2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        changePasswordRequireTwoFactorCode.Ff().z2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangePasswordRequireTwoFactorCodePresenter Mf(ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode) {
        String oldEncodedPasswordHex = changePasswordRequireTwoFactorCode.Df().getOldEncodedPasswordHex();
        t.e(oldEncodedPasswordHex, "getOldEncodedPasswordHex(...)");
        Charset charset = su.d.f78241b;
        byte[] bytes = oldEncodedPasswordHex.getBytes(charset);
        t.e(bytes, "getBytes(...)");
        String newEncodedPasswordHex = changePasswordRequireTwoFactorCode.Df().getNewEncodedPasswordHex();
        t.e(newEncodedPasswordHex, "getNewEncodedPasswordHex(...)");
        byte[] bytes2 = newEncodedPasswordHex.getBytes(charset);
        t.e(bytes2, "getBytes(...)");
        return new ChangePasswordRequireTwoFactorCodePresenter(bytes, bytes2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf(String str) {
        Ef().f73081h.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Of(ChangePasswordRequireTwoFactorCode changePasswordRequireTwoFactorCode) {
        Context contextRequireContext = changePasswordRequireTwoFactorCode.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void E1() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void M6() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void S1() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void d() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void g() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void h() {
        bh.a.b(this, new o(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void i() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void k(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this, new j(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void m(int i10) {
        bh.a.b(this, new n(i10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.e0
    public void n() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: zj.f
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangePasswordRequireTwoFactorCode.Lf(this.f87980a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f29900d = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29897a = l8.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Ef().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29897a = null;
        e();
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void s(String str) {
        bh.a.b(this, new r(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void t(boolean z10) {
        bh.a.b(this, new q(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.i0
    public void t8() {
        bh.a.b(this, new f(null));
    }
}

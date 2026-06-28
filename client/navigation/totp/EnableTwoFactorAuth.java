package com.server.auditor.ssh.client.navigation.totp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.x2;
import com.server.auditor.ssh.client.navigation.totp.EnableTwoFactorAuth;
import com.server.auditor.ssh.client.presenters.totp.EnableTwoFactorAuthPresenter;
import ju.g0;
import ju.n0;
import ju.t;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.i8;
import tp.z;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class EnableTwoFactorAuth extends MvpAppCompatFragment implements x2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f30002e = {n0.g(new g0(EnableTwoFactorAuth.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/totp/EnableTwoFactorAuthPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30003f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i8 f30004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f30005b = new x(n0.b(EnableTwoFactorAuthArgs.class), new n(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f30006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f30007d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30008a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth.this.Df(611835);
            if (EnableTwoFactorAuth.this.Mf()) {
                Toast.makeText(EnableTwoFactorAuth.this.getContext(), R.string.force_two_factor_auth_successfully_configured, 1).show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30010a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30010a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (EnableTwoFactorAuth.this.Hf().isShowing()) {
                EnableTwoFactorAuth.this.Hf().dismiss();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EnableTwoFactorAuth.this.Gf().A2(String.valueOf(editable));
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
        int f30013a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth.this.If();
            EnableTwoFactorAuth.this.Kf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30015a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30015a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(EnableTwoFactorAuth.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30017a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30017a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(EnableTwoFactorAuth.this);
            m0VarA.U(m0VarA.w().R(), false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30019a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(EnableTwoFactorAuth enableTwoFactorAuth, DialogInterface dialogInterface, int i10) {
            if (i10 == -2) {
                enableTwoFactorAuth.Df(0);
                dialogInterface.dismiss();
            } else {
                if (i10 != -1) {
                    return;
                }
                enableTwoFactorAuth.Gf().z2();
                dialogInterface.dismiss();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30019a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final EnableTwoFactorAuth enableTwoFactorAuth = EnableTwoFactorAuth.this;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.totp.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    EnableTwoFactorAuth.g.k(enableTwoFactorAuth, dialogInterface, i10);
                }
            };
            be.b positiveButton = new be.b(EnableTwoFactorAuth.this.requireActivity()).setTitle(R.string.two_factor_auth_expired_token_dialog_title).setMessage(R.string.two_factor_auth_enabling_expired_token_dialog_description).setPositiveButton(R.string.two_factor_auth_expired_token_dialog_restart_label, onClickListener);
            t.e(positiveButton, "setPositiveButton(...)");
            if (!EnableTwoFactorAuth.this.Mf()) {
                positiveButton.setNegativeButton(R.string.cancel, onClickListener);
            }
            positiveButton.setCancelable(false).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30021a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputLayout textInputLayout = EnableTwoFactorAuth.this.Ff().f72786o;
            t.e(textInputLayout, "totp2faCodeInputLayout");
            z.e(textInputLayout);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30023a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30023a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth enableTwoFactorAuth = EnableTwoFactorAuth.this;
            enableTwoFactorAuth.s(enableTwoFactorAuth.getString(R.string.login_registration_network_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30025a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30025a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!EnableTwoFactorAuth.this.Hf().isShowing()) {
                EnableTwoFactorAuth.this.Hf().show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30027a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth enableTwoFactorAuth = EnableTwoFactorAuth.this;
            enableTwoFactorAuth.s(enableTwoFactorAuth.getString(R.string.something_went_wrong_try_again_later));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30029a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, zt.e eVar) {
            super(2, eVar);
            this.f30031c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new l(this.f30031c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth enableTwoFactorAuth = EnableTwoFactorAuth.this;
            enableTwoFactorAuth.s(enableTwoFactorAuth.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f30031c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30032a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth enableTwoFactorAuth = EnableTwoFactorAuth.this;
            enableTwoFactorAuth.s(enableTwoFactorAuth.getString(R.string.login_registration_unexpected_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class n implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f30034a;

        public n(Fragment fragment) {
            this.f30034a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f30034a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f30034a + " has null arguments");
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30035a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f30037c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new o(this.f30037c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth.this.Ff().f72775d.setEnabled(this.f30037c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30038a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, zt.e eVar) {
            super(2, eVar);
            this.f30040c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuth.this.new p(this.f30040c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f30038a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnableTwoFactorAuth.this.Ff().f72786o.setError(this.f30040c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnableTwoFactorAuth() {
        iu.a aVar = new iu.a() { // from class: zj.v
            @Override // iu.a
            public final Object a() {
                return EnableTwoFactorAuth.Nf(this.f88006a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f30006c = new MoxyKtxDelegate(mvpDelegate, EnableTwoFactorAuthPresenter.class.getName() + ".presenter", aVar);
        this.f30007d = ut.o.a(new iu.a() { // from class: zj.w
            @Override // iu.a
            public final Object a() {
                return EnableTwoFactorAuth.Of(this.f88007a);
            }
        });
    }

    private final void Cf() {
        z0.F0(Ff().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    private final EnableTwoFactorAuthArgs Ef() {
        return (EnableTwoFactorAuthArgs) this.f30005b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i8 Ff() {
        i8 i8Var = this.f30004a;
        if (i8Var != null) {
            return i8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnableTwoFactorAuthPresenter Gf() {
        return (EnableTwoFactorAuthPresenter) this.f30006c.getValue(this, f30002e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Hf() {
        return (AlertDialog) this.f30007d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f72773b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnableTwoFactorAuth.Jf(this.f88008a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(EnableTwoFactorAuth enableTwoFactorAuth, View view) {
        enableTwoFactorAuth.Gf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        TextInputEditText textInputEditText = Ff().f72785n;
        t.e(textInputEditText, "totp2faCodeInputField");
        textInputEditText.addTextChangedListener(new c());
        Ff().f72775d.setOnClickListener(new View.OnClickListener() { // from class: zj.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnableTwoFactorAuth.Lf(this.f88009a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(EnableTwoFactorAuth enableTwoFactorAuth, View view) {
        enableTwoFactorAuth.Gf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Mf() {
        return androidx.navigation.fragment.c.a(this).w().R() == R.id.configure_two_factor_auth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnableTwoFactorAuthPresenter Nf(EnableTwoFactorAuth enableTwoFactorAuth) {
        String token = enableTwoFactorAuth.Ef().getToken();
        t.e(token, "getToken(...)");
        return new EnableTwoFactorAuthPresenter(token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Of(EnableTwoFactorAuth enableTwoFactorAuth) {
        Context contextRequireContext = enableTwoFactorAuth.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void B0() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void S0() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void Vb(boolean z10) {
        bh.a.b(this, new o(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void d() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void g() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void g1() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void h() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void i() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void m(int i10) {
        bh.a.b(this, new l(i10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f30004a = i8.c(layoutInflater, viewGroup, false);
        Cf();
        View viewB = Ff().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f30004a = null;
        e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            xl.a.a(activity, activity.getCurrentFocus());
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void r0() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.x2
    public void s(String str) {
        bh.a.b(this, new p(str, null));
    }
}

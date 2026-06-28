package com.server.auditor.ssh.client.navigation.totp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.v2;
import com.server.auditor.ssh.client.navigation.totp.DisableTwoFactorAuth;
import com.server.auditor.ssh.client.presenters.totp.DisableTwoFactorAuthPresenter;
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
public final class DisableTwoFactorAuth extends MvpAppCompatFragment implements v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29963e = {n0.g(new g0(DisableTwoFactorAuth.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/totp/DisableTwoFactorAuthPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29964f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i8 f29965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29966b = new x(n0.b(DisableTwoFactorAuthArgs.class), new n(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f29967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f29968d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29969a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29969a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth.this.Df(611834);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29971a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29971a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (DisableTwoFactorAuth.this.Hf().isShowing()) {
                DisableTwoFactorAuth.this.Hf().dismiss();
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
            DisableTwoFactorAuth.this.Gf().A2(String.valueOf(editable));
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
        int f29974a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29974a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth.this.If();
            DisableTwoFactorAuth.this.Kf();
            DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            String string = disableTwoFactorAuth.getString(R.string.two_factor_auth_disable_description);
            t.e(string, "getString(...)");
            disableTwoFactorAuth.Of(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29976a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29976a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(DisableTwoFactorAuth.this).T()) {
                DisableTwoFactorAuth.this.Df(0);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29978a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29978a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.m0 m0VarA = androidx.navigation.fragment.c.a(DisableTwoFactorAuth.this);
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
        int f29980a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DisableTwoFactorAuth disableTwoFactorAuth, DialogInterface dialogInterface, int i10) {
            if (i10 == -2) {
                disableTwoFactorAuth.Df(0);
                dialogInterface.dismiss();
            } else {
                if (i10 != -1) {
                    return;
                }
                disableTwoFactorAuth.Gf().z2();
                dialogInterface.dismiss();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29980a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            final DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.totp.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    DisableTwoFactorAuth.g.k(disableTwoFactorAuth, dialogInterface, i10);
                }
            };
            new be.b(DisableTwoFactorAuth.this.requireActivity()).setTitle(R.string.two_factor_auth_expired_token_dialog_title).setMessage(R.string.two_factor_auth_disabling_expired_token_dialog_description).setPositiveButton(R.string.two_factor_auth_expired_token_dialog_restart_label, onClickListener).setNegativeButton(R.string.cancel, onClickListener).setCancelable(false).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29982a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29982a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputLayout textInputLayout = DisableTwoFactorAuth.this.Ff().f72786o;
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
        int f29984a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29984a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            disableTwoFactorAuth.s(disableTwoFactorAuth.getString(R.string.login_registration_network_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29986a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29986a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!DisableTwoFactorAuth.this.Hf().isShowing()) {
                DisableTwoFactorAuth.this.Hf().show();
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
        int f29988a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29988a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            disableTwoFactorAuth.s(disableTwoFactorAuth.getString(R.string.something_went_wrong_try_again_later));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29990a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, zt.e eVar) {
            super(2, eVar);
            this.f29992c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new l(this.f29992c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29990a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            disableTwoFactorAuth.s(disableTwoFactorAuth.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f29992c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29993a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29993a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth disableTwoFactorAuth = DisableTwoFactorAuth.this;
            disableTwoFactorAuth.s(disableTwoFactorAuth.getString(R.string.login_registration_unexpected_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class n implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29995a;

        public n(Fragment fragment) {
            this.f29995a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29995a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29995a + " has null arguments");
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29996a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29998c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29998c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new o(this.f29998c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29996a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth.this.Ff().f72775d.setEnabled(this.f29998c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29999a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, zt.e eVar) {
            super(2, eVar);
            this.f30001c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuth.this.new p(this.f30001c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29999a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            DisableTwoFactorAuth.this.Ff().f72786o.setError(this.f30001c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public DisableTwoFactorAuth() {
        iu.a aVar = new iu.a() { // from class: zj.s
            @Override // iu.a
            public final Object a() {
                return DisableTwoFactorAuth.Mf(this.f88001a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29967c = new MoxyKtxDelegate(mvpDelegate, DisableTwoFactorAuthPresenter.class.getName() + ".presenter", aVar);
        this.f29968d = ut.o.a(new iu.a() { // from class: zj.t
            @Override // iu.a
            public final Object a() {
                return DisableTwoFactorAuth.Nf(this.f88003a);
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

    private final DisableTwoFactorAuthArgs Ef() {
        return (DisableTwoFactorAuthArgs) this.f29966b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i8 Ff() {
        i8 i8Var = this.f29965a;
        if (i8Var != null) {
            return i8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisableTwoFactorAuthPresenter Gf() {
        return (DisableTwoFactorAuthPresenter) this.f29967c.getValue(this, f29963e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Hf() {
        return (AlertDialog) this.f29968d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f72773b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DisableTwoFactorAuth.Jf(this.f87999a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(DisableTwoFactorAuth disableTwoFactorAuth, View view) {
        disableTwoFactorAuth.Gf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        TextInputEditText textInputEditText = Ff().f72785n;
        t.e(textInputEditText, "totp2faCodeInputField");
        textInputEditText.addTextChangedListener(new c());
        Ff().f72775d.setOnClickListener(new View.OnClickListener() { // from class: zj.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DisableTwoFactorAuth.Lf(this.f88005a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(DisableTwoFactorAuth disableTwoFactorAuth, View view) {
        disableTwoFactorAuth.Gf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisableTwoFactorAuthPresenter Mf(DisableTwoFactorAuth disableTwoFactorAuth) {
        String token = disableTwoFactorAuth.Ef().getToken();
        t.e(token, "getToken(...)");
        return new DisableTwoFactorAuthPresenter(token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Nf(DisableTwoFactorAuth disableTwoFactorAuth) {
        Context contextRequireContext = disableTwoFactorAuth.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of(String str) {
        Ff().f72779h.setText(str);
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void B0() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void S0() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void d() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void g() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void g1() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void h() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void i() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void m(int i10) {
        bh.a.b(this, new l(i10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29965a = i8.c(layoutInflater, viewGroup, false);
        Cf();
        View viewB = Ff().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29965a = null;
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

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void r0() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void s(String str) {
        bh.a.b(this, new p(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.v2
    public void t(boolean z10) {
        bh.a.b(this, new o(z10, null));
    }
}

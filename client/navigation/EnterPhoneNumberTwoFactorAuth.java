package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.i0;
import com.server.auditor.ssh.client.presenters.EnterPhoneNumberTwoFactorAuthPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.j8;

/* JADX INFO: loaded from: classes3.dex */
public final class EnterPhoneNumberTwoFactorAuth extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j8 f28153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f28154b = new androidx.navigation.x(ju.n0.b(EnterPhoneNumberTwoFactorAuthArgs.class), new l(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f28155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nq.a f28156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f28157e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28151u = {ju.n0.g(new ju.g0(EnterPhoneNumberTwoFactorAuth.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/EnterPhoneNumberTwoFactorAuthPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28150f = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28152v = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28158a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28158a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (EnterPhoneNumberTwoFactorAuth.this.Hf().isShowing()) {
                EnterPhoneNumberTwoFactorAuth.this.Hf().dismiss();
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
        int f28160a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28160a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterPhoneNumberTwoFactorAuth.this.Ff().f72891i.setError(null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d extends tp.b1 {

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnterPhoneNumberTwoFactorAuth f28164b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth, zt.e eVar) {
                super(2, eVar);
                this.f28164b = enterPhoneNumberTwoFactorAuth;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f28164b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f28163a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f28164b.Ff().f72891i.setError(null);
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        d() {
        }

        @Override // tp.b1, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (su.s.S(String.valueOf(editable), "+", false, 2, null)) {
                return;
            }
            EnterPhoneNumberTwoFactorAuth.this.Mf();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ju.t.f(charSequence, "charSequence");
            EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth = EnterPhoneNumberTwoFactorAuth.this;
            bh.a.b(enterPhoneNumberTwoFactorAuth, new a(enterPhoneNumberTwoFactorAuth, null));
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28165a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28165a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterPhoneNumberTwoFactorAuth.this.If();
            EnterPhoneNumberTwoFactorAuth.this.Kf();
            EnterPhoneNumberTwoFactorAuth.this.Nf();
            EnterPhoneNumberTwoFactorAuth.this.Mf();
            EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth = EnterPhoneNumberTwoFactorAuth.this;
            TextInputEditText textInputEditText = enterPhoneNumberTwoFactorAuth.Ff().f72888f;
            ju.t.e(textInputEditText, "editTextPhone");
            enterPhoneNumberTwoFactorAuth.Pf(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28167a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28167a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(EnterPhoneNumberTwoFactorAuth.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28169a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28169a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!EnterPhoneNumberTwoFactorAuth.this.Hf().isShowing()) {
                EnterPhoneNumberTwoFactorAuth.this.Hf().show();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28171a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28171a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            i0.a aVarA = i0.a(EnterPhoneNumberTwoFactorAuth.this.Ef().getToken());
            ju.t.e(aVarA, "actionEnterPhoneNumberToEnterTokenNumber(...)");
            androidx.navigation.fragment.c.a(EnterPhoneNumberTwoFactorAuth.this).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28173a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28173a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth = EnterPhoneNumberTwoFactorAuth.this;
            String string = enterPhoneNumberTwoFactorAuth.getString(R.string.login_registration_network_error);
            ju.t.e(string, "getString(...)");
            enterPhoneNumberTwoFactorAuth.T6(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28175a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f28177c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new j(this.f28177c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28175a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterPhoneNumberTwoFactorAuth.this.Ff().f72891i.setError(this.f28177c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28178a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuth.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28178a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth = EnterPhoneNumberTwoFactorAuth.this;
            String string = enterPhoneNumberTwoFactorAuth.getString(R.string.login_registration_unexpected_error);
            ju.t.e(string, "getString(...)");
            enterPhoneNumberTwoFactorAuth.T6(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class l implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28180a;

        public l(Fragment fragment) {
            this.f28180a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f28180a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f28180a + " has null arguments");
        }
    }

    public EnterPhoneNumberTwoFactorAuth() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.e0
            @Override // iu.a
            public final Object a() {
                return EnterPhoneNumberTwoFactorAuth.Of(this.f29041a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28155c = new MoxyKtxDelegate(mvpDelegate, EnterPhoneNumberTwoFactorAuthPresenter.class.getName() + ".presenter", aVar);
        this.f28157e = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.f0
            @Override // iu.a
            public final Object a() {
                return EnterPhoneNumberTwoFactorAuth.Qf(this.f29045a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnterPhoneNumberTwoFactorAuthArgs Ef() {
        return (EnterPhoneNumberTwoFactorAuthArgs) this.f28154b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j8 Ff() {
        j8 j8Var = this.f28153a;
        if (j8Var != null) {
            return j8Var;
        }
        throw new IllegalStateException();
    }

    private final EnterPhoneNumberTwoFactorAuthPresenter Gf() {
        return (EnterPhoneNumberTwoFactorAuthPresenter) this.f28155c.getValue(this, f28151u[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Hf() {
        return (AlertDialog) this.f28157e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f72884b.f72289c.setText(getString(R.string.enter_phone_number_2fa_title));
        Ff().f72884b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterPhoneNumberTwoFactorAuth.Jf(this.f29037a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth, View view) {
        enterPhoneNumberTwoFactorAuth.Gf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Ff().f72888f.addTextChangedListener(new d());
        Ff().f72886d.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterPhoneNumberTwoFactorAuth.Lf(this.f29049a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lf(EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth, View view) {
        if (enterPhoneNumberTwoFactorAuth.Rf()) {
            enterPhoneNumberTwoFactorAuth.Gf().u2(String.valueOf(enterPhoneNumberTwoFactorAuth.Ff().f72888f.getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Ff().f72888f.setText("+");
        Editable text = Ff().f72888f.getText();
        if (text != null) {
            Selection.setSelection(Ff().f72888f.getText(), text.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        TextInputLayout textInputLayout = Ff().f72891i;
        ju.t.e(textInputLayout, "phoneNumberInputLayout");
        TextInputEditText textInputEditText = Ff().f72888f;
        ju.t.e(textInputEditText, "editTextPhone");
        this.f28156d = new nq.a(textInputLayout, textInputEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterPhoneNumberTwoFactorAuthPresenter Of(EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth) {
        String token = enterPhoneNumberTwoFactorAuth.Ef().getToken();
        ju.t.e(token, "getToken(...)");
        return new EnterPhoneNumberTwoFactorAuthPresenter(token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pf(View view) {
        view.requestFocus();
        xl.a.c(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Qf(EnterPhoneNumberTwoFactorAuth enterPhoneNumberTwoFactorAuth) {
        Context contextRequireContext = enterPhoneNumberTwoFactorAuth.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    private final boolean Rf() {
        nq.a aVar = this.f28156d;
        if (aVar == null) {
            ju.t.t("phoneValidationManager");
            aVar = null;
        }
        return aVar.a(R.string.error_incorrect_format, new nq.c() { // from class: com.server.auditor.ssh.client.navigation.h0
            @Override // nq.c
            public final boolean a(Object obj) {
                return EnterPhoneNumberTwoFactorAuth.Sf((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Sf(String str) {
        return !TextUtils.isEmpty(str) && Patterns.PHONE.matcher(str).matches();
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void Db() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void L0() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void T6(String str) {
        ju.t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        bh.a.b(this, new j(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void b2() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void d7() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void g() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b3
    public void h() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new f(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28153a = j8.c(layoutInflater, viewGroup, false);
        View viewB = Ff().b();
        ju.t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28153a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            xl.a.a(activity, activity.getCurrentFocus());
        }
    }
}

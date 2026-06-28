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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.d0;
import com.server.auditor.ssh.client.navigation.totp.ChangeEmailRequireTwoFactorCode;
import com.server.auditor.ssh.client.presenters.ChangeEmailRequireTwoFactorCodePresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.l8;
import qu.k;
import tp.z;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangeEmailRequireTwoFactorCode extends MvpAppCompatFragment implements d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f29868f = {n0.g(new g0(ChangeEmailRequireTwoFactorCode.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ChangeEmailRequireTwoFactorCodePresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f29869u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l8 f29870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29871b = new x(n0.b(ChangeEmailRequireTwoFactorCodeArgs.class), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f29872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f29873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f29874e;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29875a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29875a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity activity = ChangeEmailRequireTwoFactorCode.this.getActivity();
            if (activity != null) {
                activity.setResult(-1);
                activity.finish();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29877a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29877a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ChangeEmailRequireTwoFactorCode.this.Gf().isShowing()) {
                ChangeEmailRequireTwoFactorCode.this.Gf().dismiss();
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
            ChangeEmailRequireTwoFactorCode.this.Ff().A2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29880a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmailRequireTwoFactorCode.this.Hf();
            ChangeEmailRequireTwoFactorCode.this.Jf();
            ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode = ChangeEmailRequireTwoFactorCode.this;
            String string = changeEmailRequireTwoFactorCode.getString(R.string.please_enter_your_otp_code);
            t.e(string, "getString(...)");
            changeEmailRequireTwoFactorCode.Of(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29882a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29882a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ChangeEmailRequireTwoFactorCode.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29884a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29884a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputLayout textInputLayout = ChangeEmailRequireTwoFactorCode.this.Ef().f73087n;
            t.e(textInputLayout, "totp2faCodeInputLayout");
            z.e(textInputLayout);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29886a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29886a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ChangeEmailRequireTwoFactorCode.this.Gf().isShowing()) {
                ChangeEmailRequireTwoFactorCode.this.Gf().show();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29888a;

        public h(Fragment fragment) {
            this.f29888a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29888a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29888a + " has null arguments");
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29889a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29891c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29891c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCode.this.new i(this.f29891c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29889a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmailRequireTwoFactorCode.this.Ef().f73077d.setEnabled(this.f29891c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ChangeEmailRequireTwoFactorCode f29894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode, zt.e eVar) {
            super(2, eVar);
            this.f29893b = str;
            this.f29894c = changeEmailRequireTwoFactorCode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f29893b, this.f29894c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29892a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f29893b != null) {
                this.f29894c.Ef().f73088o.setText(this.f29893b);
                AppCompatTextView appCompatTextView = this.f29894c.Ef().f73088o;
                t.e(appCompatTextView, "twoFaError");
                appCompatTextView.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView2 = this.f29894c.Ef().f73088o;
                t.e(appCompatTextView2, "twoFaError");
                appCompatTextView2.setVisibility(8);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangeEmailRequireTwoFactorCode() {
        iu.a aVar = new iu.a() { // from class: zj.d
            @Override // iu.a
            public final Object a() {
                return ChangeEmailRequireTwoFactorCode.Mf(this.f87976a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29872c = new MoxyKtxDelegate(mvpDelegate, ChangeEmailRequireTwoFactorCodePresenter.class.getName() + ".presenter", aVar);
        this.f29874e = o.a(new iu.a() { // from class: zj.e
            @Override // iu.a
            public final Object a() {
                return ChangeEmailRequireTwoFactorCode.Nf(this.f87978a);
            }
        });
    }

    private final void Cf() {
        z0.F0(Ef().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final ChangeEmailRequireTwoFactorCodeArgs Df() {
        return (ChangeEmailRequireTwoFactorCodeArgs) this.f29871b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l8 Ef() {
        l8 l8Var = this.f29870a;
        if (l8Var != null) {
            return l8Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChangeEmailRequireTwoFactorCodePresenter Ff() {
        return (ChangeEmailRequireTwoFactorCodePresenter) this.f29872c.getValue(this, f29868f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Gf() {
        return (AlertDialog) this.f29874e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Ef().f73075b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeEmailRequireTwoFactorCode.If(this.f87974a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode, View view) {
        changeEmailRequireTwoFactorCode.Ff().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        TextInputEditText textInputEditText = Ef().f73086m;
        t.e(textInputEditText, "totp2faCodeInputField");
        textInputEditText.addTextChangedListener(new c());
        Ef().f73077d.setOnClickListener(new View.OnClickListener() { // from class: zj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeEmailRequireTwoFactorCode.Kf(this.f87971a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode, View view) {
        changeEmailRequireTwoFactorCode.Ff().z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        changeEmailRequireTwoFactorCode.Ff().y2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeEmailRequireTwoFactorCodePresenter Mf(ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode) {
        String email = changeEmailRequireTwoFactorCode.Df().getEmail();
        t.e(email, "getEmail(...)");
        String encodedPasswordHex = changeEmailRequireTwoFactorCode.Df().getEncodedPasswordHex();
        t.e(encodedPasswordHex, "getEncodedPasswordHex(...)");
        byte[] bytes = encodedPasswordHex.getBytes(su.d.f78241b);
        t.e(bytes, "getBytes(...)");
        return new ChangeEmailRequireTwoFactorCodePresenter(email, bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Nf(ChangeEmailRequireTwoFactorCode changeEmailRequireTwoFactorCode) {
        Context contextRequireContext = changeEmailRequireTwoFactorCode.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of(String str) {
        Ef().f73081h.setText(str);
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d0
    public void d() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d0
    public void e() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d0
    public void i() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void j() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void n() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: zj.b
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangeEmailRequireTwoFactorCode.Lf(this.f87972a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f29873d = e0VarB;
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
        this.f29870a = l8.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Ef().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29870a = null;
        e();
    }

    @Override // com.server.auditor.ssh.client.contracts.d0
    public void s(String str) {
        bh.a.b(this, new j(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d0
    public void t(boolean z10) {
        bh.a.b(this, new i(z10, null));
    }
}

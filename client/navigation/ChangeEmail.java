package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.h;
import com.server.auditor.ssh.client.presenters.ChangeEmailPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChangeEmail extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.e0 f27995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.activity.e0 f27996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ut.n f27997c = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.e
        @Override // iu.a
        public final Object a() {
            return ChangeEmail.Pf(this.f29040a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f27998d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f27993f = {ju.n0.g(new ju.g0(ChangeEmail.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ChangeEmailPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27992e = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f27994u = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27999a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27999a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.Gf().f72297h.setText((CharSequence) null);
            ChangeEmail.this.Gf().f72302m.setText((CharSequence) null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28001a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.u0 u0VarJ;
            au.b.f();
            if (this.f28001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.l();
            boolean zT = androidx.navigation.fragment.c.a(ChangeEmail.this).T();
            androidx.navigation.d0 d0VarS = androidx.navigation.fragment.c.a(ChangeEmail.this).s();
            if (d0VarS != null && (u0VarJ = d0VarS.j()) != null) {
                u0VarJ.h("is_email_changed_successful", kotlin.coroutines.jvm.internal.b.a(true));
            }
            if (!zT) {
                ChangeEmail.this.x(1001);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28003a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28003a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.If().dismiss();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChangeEmail.this.Hf().E2(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ChangeEmail.this.Hf().F2(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28007a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28007a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.Jf();
            ChangeEmail.this.Lf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28009a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28009a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.l();
            if (!androidx.navigation.fragment.c.a(ChangeEmail.this).T()) {
                ChangeEmail.this.x(1000);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28011a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28013c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f28013c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new i(this.f28013c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28011a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.Gf().f72297h.setText(this.f28013c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f28016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChangeEmail f28017d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.server.auditor.ssh.client.help.a0 a0Var, ChangeEmail changeEmail, zt.e eVar) {
            super(2, eVar);
            this.f28016c = a0Var;
            this.f28017d = changeEmail;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            j jVar = new j(this.f28016c, this.f28017d, eVar);
            jVar.f28015b = obj;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                au.b.f()
                int r0 = r3.f28014a
                if (r0 != 0) goto L51
                ut.x.b(r4)
                java.lang.Object r4 = r3.f28015b
                wu.i0 r4 = (wu.i0) r4
                com.server.auditor.ssh.client.help.a0 r4 = r3.f28016c
                java.lang.String r0 = "emailError"
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.ChangeEmail r1 = r3.f28017d
                android.content.Context r1 = r1.requireContext()
                java.lang.String r2 = "requireContext(...)"
                ju.t.e(r1, r2)
                java.lang.String r4 = r4.a(r1)
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.ChangeEmail r1 = r3.f28017d
                qg.e0 r2 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r2 = r2.f72298i
                ju.t.e(r2, r0)
                r0 = 0
                r2.setVisibility(r0)
                qg.e0 r0 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r0 = r0.f72298i
                r0.setText(r4)
                goto L4e
            L3e:
                com.server.auditor.ssh.client.navigation.ChangeEmail r4 = r3.f28017d
                qg.e0 r4 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r4)
                androidx.appcompat.widget.AppCompatTextView r4 = r4.f72298i
                ju.t.e(r4, r0)
                r0 = 8
                r4.setVisibility(r0)
            L4e:
                ut.m0 r4 = ut.m0.f82633a
                return r4
            L51:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ChangeEmail.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f28020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChangeEmail f28021d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.server.auditor.ssh.client.help.a0 a0Var, ChangeEmail changeEmail, zt.e eVar) {
            super(2, eVar);
            this.f28020c = a0Var;
            this.f28021d = changeEmail;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            k kVar = new k(this.f28020c, this.f28021d, eVar);
            kVar.f28019b = obj;
            return kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                au.b.f()
                int r0 = r3.f28018a
                if (r0 != 0) goto L51
                ut.x.b(r4)
                java.lang.Object r4 = r3.f28019b
                wu.i0 r4 = (wu.i0) r4
                com.server.auditor.ssh.client.help.a0 r4 = r3.f28020c
                java.lang.String r0 = "passwordError"
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.ChangeEmail r1 = r3.f28021d
                android.content.Context r1 = r1.requireContext()
                java.lang.String r2 = "requireContext(...)"
                ju.t.e(r1, r2)
                java.lang.String r4 = r4.a(r1)
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.ChangeEmail r1 = r3.f28021d
                qg.e0 r2 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r2 = r2.f72303n
                ju.t.e(r2, r0)
                r0 = 0
                r2.setVisibility(r0)
                qg.e0 r0 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r0 = r0.f72303n
                r0.setText(r4)
                goto L4e
            L3e:
                com.server.auditor.ssh.client.navigation.ChangeEmail r4 = r3.f28021d
                qg.e0 r4 = com.server.auditor.ssh.client.navigation.ChangeEmail.xf(r4)
                androidx.appcompat.widget.AppCompatTextView r4 = r4.f72303n
                ju.t.e(r4, r0)
                r0 = 8
                r4.setVisibility(r0)
            L4e:
                ut.m0 r4 = ut.m0.f82633a
                return r4
            L51:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ChangeEmail.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28022a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmail.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChangeEmail.this.If().show();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChangeEmail f28027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, ChangeEmail changeEmail, zt.e eVar) {
            super(2, eVar);
            this.f28025b = str;
            this.f28026c = str2;
            this.f28027d = changeEmail;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new m(this.f28025b, this.f28026c, this.f28027d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            h.a aVarA = com.server.auditor.ssh.client.navigation.h.a(this.f28025b, this.f28026c);
            ju.t.e(aVarA, "actionChangeEmailToChang…RequireTwoFactorCode(...)");
            androidx.navigation.fragment.c.a(this.f28027d).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ChangeEmail() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.f
            @Override // iu.a
            public final Object a() {
                return ChangeEmail.Of();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f27998d = new MoxyKtxDelegate(mvpDelegate, ChangeEmailPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Df() {
        Window window;
        if (!com.server.auditor.ssh.client.app.a.N().w0() || (window = requireActivity().getWindow()) == null) {
            return;
        }
        window.setFlags(8192, 8192);
    }

    private final void Ef() {
        o4.z0.F0(Gf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final void Ff() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.clearFlags(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.e0 Gf() {
        qg.e0 e0Var = this.f27995a;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChangeEmailPresenter Hf() {
        return (ChangeEmailPresenter) this.f27998d.getValue(this, f27993f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog If() {
        return (AlertDialog) this.f27997c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Gf().f72291b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeEmail.Kf(this.f29036a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(ChangeEmail changeEmail, View view) {
        changeEmail.Hf().C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        TextInputEditText textInputEditText = Gf().f72297h;
        ju.t.e(textInputEditText, "emailEditText");
        textInputEditText.addTextChangedListener(new e());
        TextInputEditText textInputEditText2 = Gf().f72302m;
        ju.t.e(textInputEditText2, "passwordEditText");
        textInputEditText2.addTextChangedListener(new f());
        Gf().f72293d.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeEmail.Mf(this.f29048a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(ChangeEmail changeEmail, View view) {
        changeEmail.Hf().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Nf(ChangeEmail changeEmail, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        changeEmail.Hf().C2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeEmailPresenter Of() {
        return new ChangeEmailPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Pf(ChangeEmail changeEmail) {
        Context contextRequireContext = changeEmail.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.progressdialog_login).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        xl.a.a(requireActivity(), requireActivity().getCurrentFocus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(i10);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void C3(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new j(a0Var, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void M() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void M1(String str, String str2) {
        ju.t.f(str, "email");
        ju.t.f(str2, "encodedPasswordHex");
        bh.a.b(this, new m(str, str2, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void Ud(String str) {
        bh.a.b(this, new i(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void a() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void d() {
        bh.a.b(this, new l(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void e() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void j() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z
    public void n() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.c
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChangeEmail.Nf(this.f28991a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f27996b = e0VarB;
        if (e0VarB == null) {
            ju.t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f27995a = qg.e0.c(layoutInflater, viewGroup, false);
        Ef();
        Df();
        ConstraintLayout constraintLayoutB = Gf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27995a = null;
        Ff();
        e();
    }

    @Override // com.server.auditor.ssh.client.contracts.b0
    public void zc(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new k(a0Var, this, null));
    }
}

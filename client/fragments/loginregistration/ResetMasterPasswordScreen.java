package com.server.auditor.ssh.client.fragments.loginregistration;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import c2.o1;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.loginregistration.ResetMasterPasswordScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.r;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.presenters.account.ResetMasterPasswordPresenter;
import com.server.auditor.ssh.client.widget.ToolbarImageButtonWithOvalRipple;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.t5;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMasterPasswordScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.account.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f25359e = {ju.n0.g(new ju.g0(ResetMasterPasswordScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/account/ResetMasterPasswordPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25360f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t5 f25361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f25362b = new androidx.navigation.x(ju.n0.b(ResetMasterPasswordScreenArgs.class), new f(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f25363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f25364d;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25365a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25365a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (ResetMasterPasswordScreen.this.Af().isShowing()) {
                ResetMasterPasswordScreen.this.Af().dismiss();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25367a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(ResetMasterPasswordScreen resetMasterPasswordScreen, View view) {
            resetMasterPasswordScreen.zf().t2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(ResetMasterPasswordScreen resetMasterPasswordScreen, View view) {
            resetMasterPasswordScreen.zf().s2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25367a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = ResetMasterPasswordScreen.this.yf().f73962e;
            final ResetMasterPasswordScreen resetMasterPasswordScreen = ResetMasterPasswordScreen.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetMasterPasswordScreen.b.l(resetMasterPasswordScreen, view);
                }
            });
            ToolbarImageButtonWithOvalRipple toolbarImageButtonWithOvalRipple = ResetMasterPasswordScreen.this.yf().f73959b.f72288b;
            final ResetMasterPasswordScreen resetMasterPasswordScreen2 = ResetMasterPasswordScreen.this;
            toolbarImageButtonWithOvalRipple.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.fragments.loginregistration.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetMasterPasswordScreen.b.m(resetMasterPasswordScreen2, view);
                }
            });
            TextView textView = ResetMasterPasswordScreen.this.yf().f73969l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ResetMasterPasswordScreen.this.getResources().getString(R.string.reset_encryption_password_description));
            String string = ResetMasterPasswordScreen.this.getResources().getString(R.string.reset_encryption_password_description_highlight);
            ju.t.e(string, "getString(...)");
            Context contextRequireContext = ResetMasterPasswordScreen.this.requireContext();
            ju.t.e(contextRequireContext, "requireContext(...)");
            tp.w0.f81061a.a(spannableStringBuilder, string, new ForegroundColorSpan(tp.c0.i(contextRequireContext, R.attr.colorError)));
            ResetMasterPasswordScreen.this.yf().f73963f.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25369a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            androidx.navigation.fragment.c.a(ResetMasterPasswordScreen.this).S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25371a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25371a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ResetMasterPasswordScreen.this.Af().isShowing()) {
                ResetMasterPasswordScreen.this.Af().show();
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
        int f25373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EmailAuthentication f25374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ResetMasterPasswordScreen f25375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EmailAuthentication emailAuthentication, ResetMasterPasswordScreen resetMasterPasswordScreen, zt.e eVar) {
            super(2, eVar);
            this.f25374b = emailAuthentication;
            this.f25375c = resetMasterPasswordScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f25374b, this.f25375c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25373a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            r.a aVarA = r.a(this.f25374b);
            ju.t.e(aVarA, "actionResetMasterPasswor…structionsSentScreen(...)");
            androidx.navigation.fragment.c.a(this.f25375c).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25376a;

        public f(Fragment fragment) {
            this.f25376a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25376a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25376a + " has null arguments");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25377a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f25379c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordScreen.this.new g(this.f25379c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25377a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ResetMasterPasswordScreen.this.yf().f73969l.setText(this.f25379c);
            TextView textView = ResetMasterPasswordScreen.this.yf().f73969l;
            ju.t.e(textView, "usernameInfo");
            tp.c0.c(textView, o1.j(rk.b.y()), o1.j(rk.b.x()));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public ResetMasterPasswordScreen() {
        iu.a aVar = new iu.a() { // from class: th.z
            @Override // iu.a
            public final Object a() {
                return ResetMasterPasswordScreen.Bf(this.f79547a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f25363c = new MoxyKtxDelegate(mvpDelegate, ResetMasterPasswordPresenter.class.getName() + ".presenter", aVar);
        this.f25364d = ut.o.a(new iu.a() { // from class: th.a0
            @Override // iu.a
            public final Object a() {
                return ResetMasterPasswordScreen.Cf(this.f79472a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog Af() {
        return (AlertDialog) this.f25364d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResetMasterPasswordPresenter Bf(ResetMasterPasswordScreen resetMasterPasswordScreen) {
        EmailAuthentication emailAuthentication = resetMasterPasswordScreen.xf().getEmailAuthentication();
        ju.t.e(emailAuthentication, "getEmailAuthentication(...)");
        return new ResetMasterPasswordPresenter(emailAuthentication);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Cf(ResetMasterPasswordScreen resetMasterPasswordScreen) {
        Context contextRequireContext = resetMasterPasswordScreen.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.processing_continuation_title).create();
    }

    private final void wf() {
        z0.F0(yf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final ResetMasterPasswordScreenArgs xf() {
        return (ResetMasterPasswordScreenArgs) this.f25362b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t5 yf() {
        t5 t5Var = this.f25361a;
        if (t5Var != null) {
            return t5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResetMasterPasswordPresenter zf() {
        return (ResetMasterPasswordPresenter) this.f25363c.getValue(this, f25359e[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void H0(String str) {
        ju.t.f(str, "email");
        bh.a.b(this, new g(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void H6(EmailAuthentication emailAuthentication) {
        ju.t.f(emailAuthentication, "emailAuthentication");
        bh.a.b(this, new e(emailAuthentication, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void Z(com.server.auditor.ssh.client.help.a0 a0Var) {
        View view;
        if (a0Var == null || (view = getView()) == null) {
            return;
        }
        u0.a aVar = tp.u0.f81015a;
        Context contextRequireContext = requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        Context context = view.getContext();
        ju.t.e(context, "getContext(...)");
        aVar.b(contextRequireContext, view, a0Var.a(context), 0).Y();
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void c() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void d() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void e() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        this.f25361a = t5.c(layoutInflater, viewGroup, false);
        wf();
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        e();
        this.f25361a = null;
        super.onDestroyView();
    }
}

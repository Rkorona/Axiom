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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.navigation.r2;
import com.server.auditor.ssh.client.presenters.RequireTwoFactorAuthPasswordPresenter;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import qg.r5;

/* JADX INFO: loaded from: classes3.dex */
public final class RequireTwoFactorAuthPasswordFragment extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.z2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f28503f = {ju.n0.g(new ju.g0(RequireTwoFactorAuthPasswordFragment.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/RequireTwoFactorAuthPasswordPresenter;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28504u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r5 f28505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.x f28506b = new androidx.navigation.x(ju.n0.b(RequireTwoFactorAuthPasswordFragmentArgs.class), new n(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f28507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.activity.e0 f28508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f28509e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28510a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28510a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.Gf().f73733k.setText((CharSequence) null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28512a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (RequireTwoFactorAuthPasswordFragment.this.If().isShowing()) {
                RequireTwoFactorAuthPasswordFragment.this.If().dismiss();
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
            RequireTwoFactorAuthPasswordFragment.this.Hf().H2(editable);
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
        int f28515a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28515a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.Jf();
            RequireTwoFactorAuthPasswordFragment.this.Lf();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ RequireTwoFactorAuthPasswordFragment f28522f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, String str3, String str4, RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, zt.e eVar) {
            super(2, eVar);
            this.f28518b = str;
            this.f28519c = str2;
            this.f28520d = str3;
            this.f28521e = str4;
            this.f28522f = requireTwoFactorAuthPasswordFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f28518b, this.f28519c, this.f28520d, this.f28521e, this.f28522f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            r2.c cVarC = r2.c(this.f28518b, this.f28519c, this.f28520d, this.f28521e);
            ju.t.e(cVarC, "actionEnterPasswordToTwoFactorCopyCode(...)");
            androidx.navigation.fragment.c.a(this.f28522f).O(cVarC);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RequireTwoFactorAuthPasswordFragment f28525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, zt.e eVar) {
            super(2, eVar);
            this.f28524b = str;
            this.f28525c = requireTwoFactorAuthPasswordFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f28524b, this.f28525c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28523a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            r2.a aVarA = r2.a(this.f28524b);
            ju.t.e(aVarA, "actionEnterPasswordToDisableTwoFactor(...)");
            androidx.navigation.fragment.c.a(this.f28525c).O(aVarA);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RequireTwoFactorAuthPasswordFragment f28528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, zt.e eVar) {
            super(2, eVar);
            this.f28527b = str;
            this.f28528c = requireTwoFactorAuthPasswordFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f28527b, this.f28528c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28526a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            r2.b bVarB = r2.b(this.f28527b);
            ju.t.e(bVarB, "actionEnterPasswordToInstallAuthy(...)");
            androidx.navigation.fragment.c.a(this.f28528c).O(bVarB);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28529a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28529a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(RequireTwoFactorAuthPasswordFragment.this).T()) {
                RequireTwoFactorAuthPasswordFragment.this.p();
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
        int f28531a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28531a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!RequireTwoFactorAuthPasswordFragment.this.If().isShowing()) {
                RequireTwoFactorAuthPasswordFragment.this.If().show();
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
        int f28533a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28533a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TextInputEditText textInputEditText = RequireTwoFactorAuthPasswordFragment.this.Gf().f73733k;
            ju.t.e(textInputEditText, "passwordEditText");
            tp.z.e(textInputEditText);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28535a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28535a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.W5(new a0.a(R.string.network_is_unreachable, new Object[0]));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28537a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28537a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.W5(new a0.a(R.string.outdated_app_error_message, new Object[0]));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28539a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.W5(new a0.a(R.string.unexpected_error, new Object[0]));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class n implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28541a;

        public n(Fragment fragment) {
            this.f28541a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f28541a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f28541a + " has null arguments");
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28542a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f28544c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordFragment.this.new o(this.f28544c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            RequireTwoFactorAuthPasswordFragment.this.Gf().f73728f.setEnabled(this.f28544c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.help.a0 f28547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RequireTwoFactorAuthPasswordFragment f28548d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(com.server.auditor.ssh.client.help.a0 a0Var, RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, zt.e eVar) {
            super(2, eVar);
            this.f28547c = a0Var;
            this.f28548d = requireTwoFactorAuthPasswordFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            p pVar = new p(this.f28547c, this.f28548d, eVar);
            pVar.f28546b = obj;
            return pVar;
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
                int r0 = r3.f28545a
                if (r0 != 0) goto L51
                ut.x.b(r4)
                java.lang.Object r4 = r3.f28546b
                wu.i0 r4 = (wu.i0) r4
                com.server.auditor.ssh.client.help.a0 r4 = r3.f28547c
                java.lang.String r0 = "passwordError"
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment r1 = r3.f28548d
                android.content.Context r1 = r1.requireContext()
                java.lang.String r2 = "requireContext(...)"
                ju.t.e(r1, r2)
                java.lang.String r4 = r4.a(r1)
                if (r4 == 0) goto L3e
                com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment r1 = r3.f28548d
                qg.r5 r2 = com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r2 = r2.f73734l
                ju.t.e(r2, r0)
                r0 = 0
                r2.setVisibility(r0)
                qg.r5 r0 = com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment.xf(r1)
                androidx.appcompat.widget.AppCompatTextView r0 = r0.f73734l
                r0.setText(r4)
                goto L4e
            L3e:
                com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment r4 = r3.f28548d
                qg.r5 r4 = com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment.xf(r4)
                androidx.appcompat.widget.AppCompatTextView r4 = r4.f73734l
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
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthPasswordFragment.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public RequireTwoFactorAuthPasswordFragment() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.l2
            @Override // iu.a
            public final Object a() {
                return RequireTwoFactorAuthPasswordFragment.Of(this.f29069a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f28507c = new MoxyKtxDelegate(mvpDelegate, RequireTwoFactorAuthPasswordPresenter.class.getName() + ".presenter", aVar);
        this.f28509e = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.m2
            @Override // iu.a
            public final Object a() {
                return RequireTwoFactorAuthPasswordFragment.Pf(this.f29073a);
            }
        });
    }

    private final void Cf() {
        Window window;
        if (!com.server.auditor.ssh.client.app.a.N().w0() || (window = requireActivity().getWindow()) == null) {
            return;
        }
        window.setFlags(8192, 8192);
    }

    private final void Df() {
        o4.z0.F0(Gf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final void Ef() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.clearFlags(8192);
        }
    }

    private final RequireTwoFactorAuthPasswordFragmentArgs Ff() {
        return (RequireTwoFactorAuthPasswordFragmentArgs) this.f28506b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r5 Gf() {
        r5 r5Var = this.f28505a;
        if (r5Var != null) {
            return r5Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequireTwoFactorAuthPasswordPresenter Hf() {
        return (RequireTwoFactorAuthPasswordPresenter) this.f28507c.getValue(this, f28503f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDialog If() {
        return (AlertDialog) this.f28509e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jf() {
        Gf().f73724b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequireTwoFactorAuthPasswordFragment.Kf(this.f29333a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, View view) {
        requireTwoFactorAuthPasswordFragment.Hf().F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        TextInputEditText textInputEditText = Gf().f73733k;
        ju.t.e(textInputEditText, "passwordEditText");
        textInputEditText.addTextChangedListener(new c());
        Gf().f73728f.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequireTwoFactorAuthPasswordFragment.Mf(this.f29087a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mf(RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, View view) {
        requireTwoFactorAuthPasswordFragment.Hf().G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Nf(RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment, androidx.activity.e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        requireTwoFactorAuthPasswordFragment.Hf().F2();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequireTwoFactorAuthPasswordPresenter Of(RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment) {
        String action = requireTwoFactorAuthPasswordFragment.Ff().getAction();
        ju.t.e(action, "getAction(...)");
        return new RequireTwoFactorAuthPasswordPresenter(action, requireTwoFactorAuthPasswordFragment.Ff().getProviderId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog Pf(RequireTwoFactorAuthPasswordFragment requireTwoFactorAuthPasswordFragment) {
        Context contextRequireContext = requireTwoFactorAuthPasswordFragment.requireContext();
        ju.t.e(contextRequireContext, "requireContext(...)");
        return new yp.d(contextRequireContext, false, 2, null).setMessage(R.string.please_waiting_dialog_title).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(0);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void F5(String str, String str2, String str3, String str4) {
        ju.t.f(str, "token");
        ju.t.f(str2, "providerCode");
        ju.t.f(str3, "issuer");
        ju.t.f(str4, "email");
        bh.a.b(this, new e(str, str2, str3, str4, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void L0() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void M() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void P7(String str) {
        ju.t.f(str, "token");
        bh.a.b(this, new f(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void W5(com.server.auditor.ssh.client.help.a0 a0Var) {
        bh.a.b(this, new p(a0Var, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void b2() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void g() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void h() {
        bh.a.b(this, new m(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void i() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new h(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        androidx.activity.e0 e0VarB = androidx.activity.h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new iu.l() { // from class: com.server.auditor.ssh.client.navigation.o2
            @Override // iu.l
            public final Object invoke(Object obj) {
                return RequireTwoFactorAuthPasswordFragment.Nf(this.f29330a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f28508d = e0VarB;
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
        this.f28505a = r5.c(layoutInflater, viewGroup, false);
        Cf();
        Df();
        View viewB = Gf().b();
        ju.t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28505a = null;
        Ef();
        b2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            xl.a.a(activity, activity.getCurrentFocus());
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void t(boolean z10) {
        bh.a.b(this, new o(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void ub(String str) {
        ju.t.f(str, "token");
        bh.a.b(this, new g(str, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.z2
    public void vd() {
        bh.a.b(this, new l(null));
    }
}

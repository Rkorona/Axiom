package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import iu.p;
import ju.t;
import qg.s3;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Fragment implements k.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s3 f29167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.server.auditor.ssh.client.navigation.notifications.newcrypto.k f29168b;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29169a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29169a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73810e.requestFocus();
            Object systemService = f.this.requireActivity().getSystemService("input_method");
            t.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(f.this.xf().f73810e, 1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29171a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29171a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73812g.setVisibility(8);
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
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = f.this.f29168b;
            if (kVar == null) {
                t.t("presenter");
                kVar = null;
            }
            kVar.onPasswordChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29174a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29174a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.yf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29176a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f29178c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new e(this.f29178c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29176a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73810e.setText(this.f29178c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.f$f, reason: collision with other inner class name */
    static final class C0455f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29179a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0455f(String str, zt.e eVar) {
            super(2, eVar);
            this.f29181c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new C0455f(this.f29181c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29179a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73812g.setVisibility(0);
            f.this.xf().f73812g.setText(this.f29181c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((C0455f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29182a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29182a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f fVar = f.this;
            String string = fVar.getString(R.string.new_crypto_network_error);
            t.e(string, "getString(...)");
            fVar.O9(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f29185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f29186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Integer num, f fVar, zt.e eVar) {
            super(2, eVar);
            this.f29185b = num;
            this.f29186c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f29185b, this.f29186c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29184a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Integer num = this.f29185b;
            if (num != null) {
                String string = this.f29186c.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(num.intValue()));
                t.e(string, "getString(...)");
                this.f29186c.O9(string);
            } else {
                this.f29186c.g9();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29187a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29187a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f fVar = f.this;
            String string = fVar.getString(R.string.new_crypto_migration_unexpected_error);
            t.e(string, "getString(...)");
            fVar.O9(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29191c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new j(this.f29191c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29189a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73807b.setEnabled(this.f29191c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29194c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new k(this.f29194c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29192a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73809d.setEnabled(this.f29194c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29197c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new l(this.f29197c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29195a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73813h.setEnabled(this.f29197c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29198a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29200c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new m(this.f29200c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29198a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            f.this.xf().f73811f.setEnabled(this.f29200c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29201a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29203c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return f.this.new n(this.f29203c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29201a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProgressBar progressBar = f.this.xf().f73816k;
            t.e(progressBar, "progressView");
            progressBar.setVisibility(this.f29203c ? 0 : 8);
            AppCompatTextView appCompatTextView = f.this.xf().f73815j;
            t.e(appCompatTextView, "progressStatus");
            appCompatTextView.setVisibility(this.f29203c ? 0 : 8);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Af(f fVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = fVar.f29168b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onContinueWithPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(f fVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = fVar.f29168b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onForgotPasswordClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s3 xf() {
        s3 s3Var = this.f29167a;
        if (s3Var != null) {
            return s3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yf() {
        xf().f73807b.setOnClickListener(new View.OnClickListener() { // from class: vj.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.f.zf(this.f83464a, view);
            }
        });
        TextInputEditText textInputEditText = xf().f73810e;
        t.e(textInputEditText, "enterPasswordField");
        textInputEditText.addTextChangedListener(new c());
        xf().f73809d.setOnClickListener(new View.OnClickListener() { // from class: vj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.f.Af(this.f83465a, view);
            }
        });
        xf().f73813h.setOnClickListener(new View.OnClickListener() { // from class: vj.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.f.Bf(this.f83466a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zf(f fVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = fVar.f29168b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnterPasswordBack();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void E(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void E9(boolean z10) {
        bh.a.b(this, new m(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void G3() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void O0(String str) {
        t.f(str, "password");
        bh.a.b(this, new e(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void O9(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        bh.a.b(this, new C0455f(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void Wd(boolean z10) {
        bh.a.b(this, new l(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void Xb(boolean z10) {
        bh.a.b(this, new n(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void c() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.b
    public void g() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void g9() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.b
    public void h() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void m2(Integer num) {
        bh.a.b(this, new h(num, this, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29167a = s3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = xf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = this.f29168b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnterPasswordViewDestroyed();
        super.onDestroyView();
        this.f29167a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = (com.server.auditor.ssh.client.navigation.notifications.newcrypto.k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29168b = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnterPasswordViewCreated(this);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.f
    public void r(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }
}

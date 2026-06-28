package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import qg.t3;
import tp.c1;
import tp.u0;
import tp.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Fragment implements k.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t3 f29204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.server.auditor.ssh.client.navigation.notifications.newcrypto.k f29205b;

    public static final class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ju.t.f(view, "widget");
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = g.this.f29205b;
            if (kVar == null) {
                ju.t.t("presenter");
                kVar = null;
            }
            kVar.onResendCodeClick();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            ju.t.f(textPaint, "ds");
            textPaint.setUnderlineText(true);
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29207a;

        a0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new a0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29207a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g gVar = g.this;
            String string = gVar.getString(R.string.new_crypto_migration_unexpected_error);
            ju.t.e(string, "getString(...)");
            gVar.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ju.t.f(view, "widget");
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = g.this.f29205b;
            if (kVar == null) {
                ju.t.t("presenter");
                kVar = null;
            }
            kVar.onResendCodeClick();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            ju.t.f(textPaint, "ds");
            textPaint.setUnderlineText(true);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29210a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29212c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new b0(this.f29212c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29210a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73931b.setEnabled(this.f29212c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29213a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29213a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73933d.setVisibility(8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29215a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29217c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new c0(this.f29217c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29215a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = g.this.Ef().f73943n.f72431b;
            ju.t.e(appCompatTextView, "checkPasswordBreach");
            appCompatTextView.setVisibility(this.f29217c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29218a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73945p.setVisibility(8);
            g.this.Ef().f73946q.setVisibility(8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29220a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29222c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new d0(this.f29222c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29220a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            LinearLayout linearLayout = g.this.Ef().f73943n.f72436g;
            ju.t.e(linearLayout, "passwordBreachProgressLayout");
            linearLayout.setVisibility(this.f29222c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = g.this.f29205b;
            if (kVar == null) {
                ju.t.t("presenter");
                kVar = null;
            }
            kVar.onCodeEdit(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29224a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, zt.e eVar) {
            super(2, eVar);
            this.f29226c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new e0(this.f29226c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29224a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Df(this.f29226c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = g.this.f29205b;
            if (kVar == null) {
                ju.t.t("presenter");
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

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29228a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29230c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new f0(this.f29230c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73934e.setEnabled(this.f29230c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.notifications.newcrypto.g$g, reason: collision with other inner class name */
    public static final class C0456g implements TextWatcher {
        public C0456g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = g.this.f29205b;
            if (kVar == null) {
                ju.t.t("presenter");
                kVar = null;
            }
            kVar.onCodeCheck(String.valueOf(charSequence));
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29232a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29234c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new g0(this.f29234c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29232a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = g.this.Ef().f73943n.f72433d;
            ju.t.e(appCompatTextView, "passwordBreachFaq");
            appCompatTextView.setVisibility(this.f29234c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29235a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29235a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ff();
            g.this.If();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29237a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29239c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new h0(this.f29239c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29237a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73938i.setEnabled(this.f29239c);
            g.this.Ef().f73936g.setEnabled(this.f29239c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29240a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29240a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73933d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_circle, 0, 0, 0);
            g.this.Ef().f73933d.setTextColor(androidx.core.content.a.getColor(g.this.Ef().f73933d.getContext(), R.color.palette_red));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29242a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29244c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new i0(this.f29244c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29242a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            LinearLayout linearLayout = g.this.Ef().f73941l;
            ju.t.e(linearLayout, "newCryptoMigrationProgressLayout");
            linearLayout.setVisibility(this.f29244c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29245a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29245a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73933d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_check_green_wrapper, 0, 0, 0);
            g.this.Ef().f73933d.setTextColor(c1.a(g.this.Ef().f73933d.getContext(), android.R.attr.textColor));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29247a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(String str, zt.e eVar) {
            super(2, eVar);
            this.f29249c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new j0(this.f29249c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29247a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73936g.setError(this.f29249c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29250a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f29252c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new k(this.f29252c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29250a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73937h.setText(this.f29252c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29253a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29255c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new k0(this.f29255c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29253a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = g.this.Ef().f73943n.f72432c;
            ju.t.e(appCompatTextView, "firstSuggestion");
            appCompatTextView.setVisibility(this.f29255c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29256a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f29258c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new l(this.f29258c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29256a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73935f.setText(this.f29258c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29259a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f29261c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new l0(this.f29261c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29259a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73943n.f72437h.setStrength(this.f29261c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29262a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f29264c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new m(this.f29264c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29262a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73943n.f72432c.setText(this.f29264c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29265a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29267c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new m0(this.f29267c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = g.this.Ef().f73943n.f72441l;
            ju.t.e(appCompatTextView, "secondSuggestion");
            appCompatTextView.setVisibility(this.f29267c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29268a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, zt.e eVar) {
            super(2, eVar);
            this.f29270c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new n(this.f29270c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73943n.f72441l.setText(this.f29270c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29271a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29273c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new n0(this.f29273c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29271a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            AppCompatTextView appCompatTextView = g.this.Ef().f73943n.f72443n;
            ju.t.e(appCompatTextView, "warning");
            appCompatTextView.setVisibility(this.f29273c ? 0 : 8);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29274a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, zt.e eVar) {
            super(2, eVar);
            this.f29276c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new o(this.f29276c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29274a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73943n.f72443n.setText(this.f29276c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29277a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(int i10, zt.e eVar) {
            super(2, eVar);
            this.f29279c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new o0(this.f29279c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29277a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73933d.setText(g.this.getString(R.string.new_crypto_we_ve_sent_code_timer, kotlin.coroutines.jvm.internal.b.d(this.f29279c)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29280a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29280a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g gVar = g.this;
            String string = gVar.getString(R.string.new_crypto_we_ve_sent_code_resend);
            ju.t.e(string, "getString(...)");
            gVar.Cf(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29282a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29284c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, zt.e eVar) {
            super(2, eVar);
            this.f29284c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new p0(this.f29284c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29282a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73937h.setText(this.f29284c);
            g.this.Ef().f73937h.setSelection(this.f29284c.length());
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29285a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29285a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (g.this.Ef().f73933d.getVisibility() != 0) {
                g.this.Ef().f73933d.setVisibility(0);
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
        int f29287a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g gVar = g.this;
            String string = gVar.getString(R.string.new_crypto_expired_code_resend_code);
            ju.t.e(string, "getString(...)");
            gVar.Cf(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29289a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g gVar = g.this;
            String string = gVar.getString(R.string.new_crypto_invalid_code_resend_code);
            ju.t.e(string, "getString(...)");
            gVar.Cf(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29291a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i10, zt.e eVar) {
            super(2, eVar);
            this.f29293c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new t(this.f29293c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29291a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73933d.setText(g.this.getString(R.string.new_crypto_invalid_code_in_d_seconds, kotlin.coroutines.jvm.internal.b.d(this.f29293c)));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29294a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29294a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g gVar = g.this;
            String string = gVar.getString(R.string.new_crypto_network_error);
            ju.t.e(string, "getString(...)");
            gVar.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29296a;

        v(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new v(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.e1(true);
            g gVar = g.this;
            String string = gVar.getString(R.string.password_is_not_pwned_message);
            ju.t.e(string, "getString(...)");
            gVar.u0(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29298a;

        w(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new w(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29298a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.f0(true);
            g gVar = g.this;
            String string = gVar.getString(R.string.password_was_breached_message);
            ju.t.e(string, "getString(...)");
            gVar.Q(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29300a;

        x(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new x(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.Ef().f73945p.setVisibility(0);
            g.this.Ef().f73946q.setVisibility(0);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f29303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f29304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Integer num, g gVar, zt.e eVar) {
            super(2, eVar);
            this.f29303b = num;
            this.f29304c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new y(this.f29303b, this.f29304c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Integer num = this.f29303b;
            this.f29304c.G(num != null ? this.f29304c.getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(num.intValue())) : null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29305a;

        z(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return g.this.new z(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29305a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            g.this.f0(true);
            g gVar = g.this;
            String string = gVar.getString(R.string.hibp_checking_something_went_wrong);
            ju.t.e(string, "getString(...)");
            gVar.Q(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf(String str) {
        Ef().f73933d.setMovementMethod(LinkMovementMethod.getInstance());
        Ef().f73933d.setHighlightColor(0);
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String string = getString(R.string.new_crypto_resend_highlight);
        ju.t.e(string, "getString(...)");
        Ef().f73933d.setText(aVar.a(spannableStringBuilder, string, new a(), new StyleSpan(1)), TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df(String str) {
        Ef().f73933d.setMovementMethod(LinkMovementMethod.getInstance());
        Ef().f73933d.setHighlightColor(0);
        String string = getString(R.string.new_crypto_retry_highlight);
        ju.t.e(string, "getString(...)");
        Ef().f73933d.setText(w0.f81061a.a(new SpannableStringBuilder(str + " " + string), string, new b(), new StyleSpan(1)), TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t3 Ef() {
        t3 t3Var = this.f29204a;
        if (t3Var != null) {
            return t3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff() {
        Ef().f73931b.setOnClickListener(new View.OnClickListener() { // from class: vj.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.g.Gf(this.f83469a, view);
            }
        });
        TextInputEditText textInputEditText = Ef().f73937h;
        ju.t.e(textInputEditText, "enterVerificationCodeField");
        textInputEditText.addTextChangedListener(new e());
        TextInputEditText textInputEditText2 = Ef().f73937h;
        ju.t.e(textInputEditText2, "enterVerificationCodeField");
        textInputEditText2.addTextChangedListener(new C0456g());
        TextInputEditText textInputEditText3 = Ef().f73935f;
        ju.t.e(textInputEditText3, "enterNewPasswordField");
        textInputEditText3.addTextChangedListener(new f());
        Ef().f73934e.setOnClickListener(new View.OnClickListener() { // from class: vj.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.g.Hf(this.f83470a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gf(g gVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = gVar.f29205b;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onForgotPasswordBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Hf(g gVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = gVar.f29205b;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onContinueWithNewPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ef().f73943n.f72431b.setOnClickListener(new View.OnClickListener() { // from class: vj.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.g.Jf(this.f83467a, view);
            }
        });
        Ef().f73943n.f72433d.setOnClickListener(new View.OnClickListener() { // from class: vj.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.g.Kf(this.f83468a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(g gVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = gVar.f29205b;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onCheckPasswordBreachButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(g gVar, View view) {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = gVar.f29205b;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onHowDoWeKnowButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        View view = getView();
        if (view != null) {
            u0.a aVar = u0.f81015a;
            Context context = view.getContext();
            ju.t.e(context, "getContext(...)");
            aVar.b(context, view, str, 0).Y();
        }
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void Aa() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void E(boolean z10) {
        bh.a.b(this, new f0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void Eb() {
        bh.a.b(this, new s(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void G(String str) {
        bh.a.b(this, new j0(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void H4() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void J2(boolean z10) {
        bh.a.b(this, new m0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void K(boolean z10) {
        bh.a.b(this, new c0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void L() {
        bh.a.b(this, new z(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void O0(String str) {
        ju.t.f(str, "password");
        bh.a.b(this, new l(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void Q(String str) {
        ju.t.f(str, "warning");
        bh.a.b(this, new o(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void R5(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        bh.a.b(this, new e0(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void S(boolean z10) {
        bh.a.b(this, new d0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void U() {
        bh.a.b(this, new v(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void U8(int i10) {
        bh.a.b(this, new o0(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void V(int i10) {
        bh.a.b(this, new l0(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void Yb(String str) {
        ju.t.f(str, "trimmedCode");
        bh.a.b(this, new p0(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void aa(String str) {
        ju.t.f(str, "code");
        bh.a.b(this, new k(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void bd(int i10) {
        bh.a.b(this, new t(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void c() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void c2(boolean z10) {
        bh.a.b(this, new g0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void d0() {
        bh.a.b(this, new w(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void d5() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void e1(boolean z10) {
        bh.a.b(this, new k0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void f0(boolean z10) {
        bh.a.b(this, new n0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.b
    public void g() {
        bh.a.b(this, new u(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void g8(boolean z10) {
        bh.a.b(this, new i0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void gc() {
        bh.a.b(this, new q(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.b
    public void h() {
        bh.a.b(this, new a0(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void l4(boolean z10) {
        bh.a.b(this, new h0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void m2(Integer num) {
        bh.a.b(this, new y(num, this, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void n5() {
        bh.a.b(this, new r(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29204a = t3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = Ef().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = this.f29205b;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onForgotPasswordViewDestroyed();
        super.onDestroyView();
        this.f29204a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        com.server.auditor.ssh.client.navigation.notifications.newcrypto.k kVar = (com.server.auditor.ssh.client.navigation.notifications.newcrypto.k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29205b = kVar;
        if (kVar == null) {
            ju.t.t("presenter");
            kVar = null;
        }
        kVar.onForgotPasswordViewCreated(this);
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void r(boolean z10) {
        bh.a.b(this, new b0(z10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void rd() {
        bh.a.b(this, new p(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void s3() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void u0(String str) {
        ju.t.f(str, "suggestion");
        bh.a.b(this, new m(str, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void v8() {
        bh.a.b(this, new x(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.g
    public void z2(String str) {
        ju.t.f(str, "suggestion");
        bh.a.b(this, new n(str, null));
    }
}

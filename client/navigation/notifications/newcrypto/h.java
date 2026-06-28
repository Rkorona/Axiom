package com.server.auditor.ssh.client.navigation.notifications.newcrypto;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.k;
import iu.p;
import ju.t;
import qg.u3;
import tp.w0;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Fragment implements k.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29307c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29308d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u3 f29309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f29310b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            t.f(view, "widget");
            k kVar = h.this.f29310b;
            if (kVar == null) {
                t.t("presenter");
                kVar = null;
            }
            kVar.onNewEncryptionLinkClick();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29312a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return h.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29312a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            h.this.xf();
            h.this.yf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Af(h hVar, View view) {
        k kVar = hVar.f29310b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onDoItLaterClick();
    }

    private final u3 wf() {
        u3 u3Var = this.f29309a;
        if (u3Var != null) {
            return u3Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xf() {
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.new_crypto_landing_text_part1));
        String string = getString(R.string.new_crypto_landing_text_clickable_here);
        t.e(string, "getString(...)");
        wf().f74052f.setText(aVar.a(spannableStringBuilder, string, new b(), new StyleSpan(1)), TextView.BufferType.SPANNABLE);
        wf().f74052f.setMovementMethod(LinkMovementMethod.getInstance());
        wf().f74052f.setHighlightColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yf() {
        wf().f74050d.setOnClickListener(new View.OnClickListener() { // from class: vj.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.h.zf(this.f83471a, view);
            }
        });
        wf().f74049c.setOnClickListener(new View.OnClickListener() { // from class: vj.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.server.auditor.ssh.client.navigation.notifications.newcrypto.h.Af(this.f83472a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zf(h hVar, View view) {
        k kVar = hVar.f29310b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onEnableNewEncryptionClick();
    }

    @Override // com.server.auditor.ssh.client.navigation.notifications.newcrypto.k.h
    public void c() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29309a = u3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = wf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        k kVar = this.f29310b;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onLandingViewDestroyed();
        super.onDestroyView();
        this.f29309a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        k kVar = (k) new l1(fragmentActivityRequireActivity).a(NewCryptoViewModel.class);
        this.f29310b = kVar;
        if (kVar == null) {
            t.t("presenter");
            kVar = null;
        }
        kVar.onLandingViewCreated(this);
    }
}

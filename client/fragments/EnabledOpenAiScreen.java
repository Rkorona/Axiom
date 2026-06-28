package com.server.auditor.ssh.client.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import c2.o1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.s0;
import com.server.auditor.ssh.client.fragments.EnabledOpenAiScreen;
import com.server.auditor.ssh.client.presenters.EnabledOpenAiPresenter;
import ju.g0;
import ju.n0;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.k1;
import tp.w0;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class EnabledOpenAiScreen extends MvpAppCompatFragment implements s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f23924d = {n0.g(new g0(EnabledOpenAiScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/EnabledOpenAiPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23925e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k1 f23926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f23927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f23928c;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23929a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, zt.e eVar) {
            super(2, eVar);
            this.f23931c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiScreen.this.new a(this.f23931c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23929a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = EnabledOpenAiScreen.this.requireActivity();
            ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.setResult(this.f23931c);
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23932a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnabledOpenAiScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23932a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            EnabledOpenAiScreen.this.wf();
            EnabledOpenAiScreen.this.Af();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnabledOpenAiScreen() {
        iu.a aVar = new iu.a() { // from class: ch.x
            @Override // iu.a
            public final Object a() {
                return EnabledOpenAiScreen.Df();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f23927b = new MoxyKtxDelegate(mvpDelegate, EnabledOpenAiPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Af() {
        yf().f72928c.setOnClickListener(new View.OnClickListener() { // from class: ch.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnabledOpenAiScreen.Bf(this.f15659a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(EnabledOpenAiScreen enabledOpenAiScreen, View view) {
        enabledOpenAiScreen.zf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Cf(EnabledOpenAiScreen enabledOpenAiScreen, e0 e0Var) {
        ju.t.f(e0Var, "$this$addCallback");
        enabledOpenAiScreen.zf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnabledOpenAiPresenter Df() {
        return new EnabledOpenAiPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wf() {
        String string = getString(R.string.you_have_enabled_open_ai_in_termius);
        ju.t.e(string, "getString(...)");
        Rect rect = new Rect();
        yf().f72931f.getPaint().getTextBounds(string, 0, string.length(), rect);
        TextView textView = yf().f72931f;
        w0.a aVar = w0.f81061a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        String string2 = getString(R.string.you_have_enabled_open_ai_in_termius_highlight_helper);
        ju.t.e(string2, "getString(...)");
        textView.setText(aVar.a(spannableStringBuilder, string2, new pq.b(o1.j(rk.b.y()), o1.j(rk.b.x()), rect)));
    }

    private final void xf() {
        z0.F0(yf().b(), new pi.c(a2.l.i(), a2.l.d()));
    }

    private final k1 yf() {
        k1 k1Var = this.f23926a;
        if (k1Var != null) {
            return k1Var;
        }
        throw new IllegalStateException();
    }

    private final EnabledOpenAiPresenter zf() {
        return (EnabledOpenAiPresenter) this.f23927b.getValue(this, f23924d[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.s0
    public void c() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ju.t.f(context, "context");
        super.onAttach(context);
        this.f23928c = h0.a(requireActivity().getOnBackPressedDispatcher(), this, true, new iu.l() { // from class: ch.w
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EnabledOpenAiScreen.Cf(this.f15645a, (androidx.activity.e0) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f23926a = k1.c(layoutInflater, viewGroup, false);
        xf();
        ConstraintLayout constraintLayoutB = yf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23926a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e0 e0Var = this.f23928c;
        if (e0Var == null) {
            ju.t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }

    @Override // com.server.auditor.ssh.client.contracts.s0
    public void x(int i10) {
        bh.a.b(this, new a(i10, null));
    }
}

package com.server.auditor.ssh.client.fragments.premium;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import androidx.navigation.x;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.contracts.k1;
import com.server.auditor.ssh.client.fragments.premium.GracePeriodScreen;
import com.server.auditor.ssh.client.models.GracePeriodSubscription;
import com.server.auditor.ssh.client.presenters.premium.GracePeriodPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.n2;
import qu.k;
import su.s;
import ut.i;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class GracePeriodScreen extends MvpAppCompatFragment implements k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f25975e = {n0.g(new g0(GracePeriodScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/premium/GracePeriodPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25976f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n2 f25977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f25978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f25979c = new x(n0.b(GracePeriodScreenArgs.class), new e(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f25980d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25981a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GracePeriodScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25981a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = GracePeriodScreen.this.requireActivity();
            t.e(fragmentActivityRequireActivity, "requireActivity(...)");
            fragmentActivityRequireActivity.finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25983a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GracePeriodScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25983a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GracePeriodScreen.this.If();
            GracePeriodScreen.this.Lf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25985a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f25987c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return GracePeriodScreen.this.new c(this.f25987c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f25985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            GracePeriodScreen.this.Qf(GracePeriodScreen.this.Of(this.f25987c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d implements l0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f25988a;

        d(l lVar) {
            t.f(lVar, "function");
            this.f25988a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f25988a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f25988a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof n)) {
                return t.b(c(), ((n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class e implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f25989a;

        public e(Fragment fragment) {
            this.f25989a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f25989a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f25989a + " has null arguments");
        }
    }

    public GracePeriodScreen() {
        iu.a aVar = new iu.a() { // from class: vh.a
            @Override // iu.a
            public final Object a() {
                return GracePeriodScreen.Pf(this.f83454a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f25980d = new MoxyKtxDelegate(mvpDelegate, GracePeriodPresenter.class.getName() + ".presenter", aVar);
    }

    private final void Cf() {
        z0.F0(Gf().b(), new o4.i0() { // from class: vh.c
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return GracePeriodScreen.Df(view, a2Var);
            }
        });
        z0.F0(Gf().f73293c, new o4.i0() { // from class: vh.d
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return GracePeriodScreen.Ef(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Df(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Ef(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final GracePeriodScreenArgs Ff() {
        return (GracePeriodScreenArgs) this.f25979c.getValue();
    }

    private final n2 Gf() {
        n2 n2Var = this.f25977a;
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException();
    }

    private final GracePeriodPresenter Hf() {
        return (GracePeriodPresenter) this.f25980d.getValue(this, f25975e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Gf().f73303m.setOnClickListener(new View.OnClickListener() { // from class: vh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GracePeriodScreen.Jf(this.f83456a, view);
            }
        });
        Gf().f73298h.setOnClickListener(new View.OnClickListener() { // from class: vh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GracePeriodScreen.Kf(this.f83457a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(GracePeriodScreen gracePeriodScreen, View view) {
        gracePeriodScreen.Hf().y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(GracePeriodScreen gracePeriodScreen, View view) {
        gracePeriodScreen.Hf().x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Hf().u2().j(this, new d(new l() { // from class: vh.b
            @Override // iu.l
            public final Object invoke(Object obj) {
                return GracePeriodScreen.Mf(this.f83455a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Mf(GracePeriodScreen gracePeriodScreen, String str) {
        if (str.equals("success")) {
            gracePeriodScreen.Hf().w2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Nf(GracePeriodScreen gracePeriodScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        gracePeriodScreen.Hf().v2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Of(String str) {
        if (str == null || s.m0(str)) {
            String string = getString(R.string.billing_address_no_email, "https://account.termius.com/");
            t.c(string);
            return string;
        }
        String string2 = getString(R.string.billing_address_with_email, "https://account.termius.com/", Uri.encode(str));
        t.c(string2);
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GracePeriodPresenter Pf(GracePeriodScreen gracePeriodScreen) {
        GracePeriodSubscription gracePeriodSubscription = gracePeriodScreen.Ff().getGracePeriodSubscription();
        t.e(gracePeriodSubscription, "getGracePeriodSubscription(...)");
        return new GracePeriodPresenter(gracePeriodSubscription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new AlertDialog.Builder(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.k1
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.k1
    public void df(String str) {
        bh.a.b(this, new c(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.k1
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: vh.g
            @Override // iu.l
            public final Object invoke(Object obj) {
                return GracePeriodScreen.Nf(this.f83458a, (e0) obj);
            }
        }, 2, null);
        this.f25978b = e0VarB;
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
        this.f25977a = n2.c(layoutInflater, viewGroup, false);
        Cf();
        ConstraintLayout constraintLayoutB = Gf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25977a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f25978b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        TermiusApplication.a0(false);
        super.onDetach();
    }
}

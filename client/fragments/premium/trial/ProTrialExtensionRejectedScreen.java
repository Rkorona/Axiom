package com.server.auditor.ssh.client.fragments.premium.trial;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.t0;
import androidx.lifecycle.l0;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.y1;
import com.server.auditor.ssh.client.fragments.premium.trial.ProTrialExtensionRejectedScreen;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
import com.server.auditor.ssh.client.presenters.premium.trial.ProTrialExtensionRejectedScreenPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import ju.u;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import o4.a2;
import o4.z0;
import qg.z4;
import qu.k;
import ut.i;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ProTrialExtensionRejectedScreen extends MvpAppCompatFragment implements y1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f26044e = {n0.g(new g0(ProTrialExtensionRejectedScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/premium/trial/ProTrialExtensionRejectedScreenPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26045f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z4 f26046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f26047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f26048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f26049d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26050a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRejectedScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26050a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ProTrialExtensionRejectedScreen.this.requireActivity();
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
        int f26052a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRejectedScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26052a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ProTrialExtensionRejectedScreen.this.Hf();
            ProTrialExtensionRejectedScreen.this.Kf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26054a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRejectedScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(ProTrialExtensionRejectedScreen.this).U(R.id.endOfTrialScreen, false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26056a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProTrialExtensionRejectedScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f26056a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            String string = ProTrialExtensionRejectedScreen.this.getString(R.string.support_new_request_url);
            t.e(string, "getString(...)");
            ProTrialExtensionRejectedScreen.this.Of(string);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f26058a;

        e(l lVar) {
            t.f(lVar, "function");
            this.f26058a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f26058a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f26058a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class f extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f26059a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f26059a.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f26060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f26061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(iu.a aVar, Fragment fragment) {
            super(0);
            this.f26060a = aVar;
            this.f26061b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f26060a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f26061b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class h extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f26062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f26062a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f26062a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ProTrialExtensionRejectedScreen() {
        iu.a aVar = new iu.a() { // from class: wh.a0
            @Override // iu.a
            public final Object a() {
                return ProTrialExtensionRejectedScreen.Nf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f26047b = new MoxyKtxDelegate(mvpDelegate, ProTrialExtensionRejectedScreenPresenter.class.getName() + ".presenter", aVar);
        this.f26048c = t0.b(this, n0.b(EndOfTrialViewModel.class), new f(this), new g(null, this), new h(this));
    }

    private final void Bf() {
        z0.F0(Ff().b(), new o4.i0() { // from class: wh.y
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProTrialExtensionRejectedScreen.Cf(view, a2Var);
            }
        });
        z0.F0(Ff().f74549c, new o4.i0() { // from class: wh.z
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ProTrialExtensionRejectedScreen.Df(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Cf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 Df(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a2Var.f(a2.l.g()).f47586d);
        return a2Var;
    }

    private final EndOfTrialViewModel Ef() {
        return (EndOfTrialViewModel) this.f26048c.getValue();
    }

    private final z4 Ff() {
        z4 z4Var = this.f26046a;
        if (z4Var != null) {
            return z4Var;
        }
        throw new IllegalStateException();
    }

    private final ProTrialExtensionRejectedScreenPresenter Gf() {
        return (ProTrialExtensionRejectedScreenPresenter) this.f26047b.getValue(this, f26044e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hf() {
        Ff().f74550d.setOnClickListener(new View.OnClickListener() { // from class: wh.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProTrialExtensionRejectedScreen.If(this.f84936a, view);
            }
        });
        Ff().f74551e.setOnClickListener(new View.OnClickListener() { // from class: wh.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProTrialExtensionRejectedScreen.Jf(this.f84937a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void If(ProTrialExtensionRejectedScreen proTrialExtensionRejectedScreen, View view) {
        proTrialExtensionRejectedScreen.Gf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(ProTrialExtensionRejectedScreen proTrialExtensionRejectedScreen, View view) {
        proTrialExtensionRejectedScreen.Gf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Ef().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new e(new l() { // from class: wh.x
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProTrialExtensionRejectedScreen.Lf(this.f84952a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(ProTrialExtensionRejectedScreen proTrialExtensionRejectedScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            proTrialExtensionRejectedScreen.Gf().t2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            proTrialExtensionRejectedScreen.Gf().u2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Mf(ProTrialExtensionRejectedScreen proTrialExtensionRejectedScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        proTrialExtensionRejectedScreen.Gf().q2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProTrialExtensionRejectedScreenPresenter Nf() {
        return new ProTrialExtensionRejectedScreenPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Of(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivity(intent);
        } else {
            new be.b(requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(str).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    @Override // com.server.auditor.ssh.client.contracts.y1
    public void C2() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y1
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y1
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.y1
    public void o() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: wh.d0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ProTrialExtensionRejectedScreen.Mf(this.f84939a, (e0) obj);
            }
        }, 2, null);
        this.f26049d = e0VarB;
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
        this.f26046a = z4.c(getLayoutInflater(), viewGroup, false);
        Bf();
        ConstraintLayout constraintLayoutB = Ff().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f26046a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f26049d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

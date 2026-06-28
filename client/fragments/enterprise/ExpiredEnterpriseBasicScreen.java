package com.server.auditor.ssh.client.fragments.enterprise;

import android.content.Context;
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
import com.server.auditor.ssh.client.contracts.u0;
import com.server.auditor.ssh.client.fragments.enterprise.ExpiredEnterpriseBasicScreen;
import com.server.auditor.ssh.client.presenters.ExpiredEnterpriseBasicPresenter;
import com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel;
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
import qg.b2;
import qu.k;
import tp.c0;
import ut.i;
import ut.m0;
import ut.n;
import ut.s;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpiredEnterpriseBasicScreen extends MvpAppCompatFragment implements u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f24977e = {n0.g(new g0(ExpiredEnterpriseBasicScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/ExpiredEnterpriseBasicPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24978f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b2 f24979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f24980b = t0.b(this, n0.b(EndOfTrialViewModel.class), new e(this), new f(null, this), new g(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f24981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f24982d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24983a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredEnterpriseBasicScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24983a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FragmentActivity fragmentActivityRequireActivity = ExpiredEnterpriseBasicScreen.this.requireActivity();
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
        int f24985a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredEnterpriseBasicScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24985a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredEnterpriseBasicScreen.this.Df();
            ExpiredEnterpriseBasicScreen.this.Ff();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f24987a;

        c(l lVar) {
            t.f(lVar, "function");
            this.f24987a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f24987a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f24987a;
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

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24988a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f24990c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredEnterpriseBasicScreen.this.new d(this.f24990c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24988a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            new be.b(ExpiredEnterpriseBasicScreen.this.requireActivity()).setTitle(R.string.message_could_not_open_browser).setMessage(this.f24990c).setPositiveButton(android.R.string.ok, null).show();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f24991a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m1 a() {
            return this.f24991a.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f24992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f24993b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iu.a aVar, Fragment fragment) {
            super(0);
            this.f24992a = aVar;
            this.f24993b = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f24992a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f24993b.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class g extends u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f24994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f24994a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f24994a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public ExpiredEnterpriseBasicScreen() {
        iu.a aVar = new iu.a() { // from class: nh.a
            @Override // iu.a
            public final Object a() {
                return ExpiredEnterpriseBasicScreen.Jf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24982d = new MoxyKtxDelegate(mvpDelegate, ExpiredEnterpriseBasicPresenter.class.getName() + ".presenter", aVar);
    }

    private final EndOfTrialViewModel Af() {
        return (EndOfTrialViewModel) this.f24980b.getValue();
    }

    private final b2 Bf() {
        b2 b2Var = this.f24979a;
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException();
    }

    private final ExpiredEnterpriseBasicPresenter Cf() {
        return (ExpiredEnterpriseBasicPresenter) this.f24982d.getValue(this, f24977e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Df() {
        Bf().f71955b.setOnClickListener(new View.OnClickListener() { // from class: nh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpiredEnterpriseBasicScreen.Ef(this.f66391a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ef(ExpiredEnterpriseBasicScreen expiredEnterpriseBasicScreen, View view) {
        expiredEnterpriseBasicScreen.Cf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ff() {
        Gf();
    }

    private final void Gf() {
        Af().getSubscriptionStatusLiveData().j(getViewLifecycleOwner(), new c(new l() { // from class: nh.c
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredEnterpriseBasicScreen.Hf(this.f66389a, (EndOfTrialViewModel.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Hf(ExpiredEnterpriseBasicScreen expiredEnterpriseBasicScreen, EndOfTrialViewModel.a aVar) {
        if (t.b(aVar, EndOfTrialViewModel.a.C0579a.f37756a)) {
            expiredEnterpriseBasicScreen.Cf().u2();
        } else {
            if (!t.b(aVar, EndOfTrialViewModel.a.b.f37757a)) {
                throw new s();
            }
            expiredEnterpriseBasicScreen.Cf().v2();
        }
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 If(ExpiredEnterpriseBasicScreen expiredEnterpriseBasicScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        expiredEnterpriseBasicScreen.Cf().r2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExpiredEnterpriseBasicPresenter Jf() {
        return new ExpiredEnterpriseBasicPresenter();
    }

    private final void yf() {
        z0.F0(Bf().b(), new o4.i0() { // from class: nh.b
            @Override // o4.i0
            public final a2 onApplyWindowInsets(View view, a2 a2Var) {
                return ExpiredEnterpriseBasicScreen.zf(view, a2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a2 zf(View view, a2 a2Var) {
        t.f(view, "v");
        t.f(a2Var, "insets");
        view.setPadding(view.getPaddingLeft(), a2Var.f(a2.l.h()).f47584b, view.getPaddingRight(), view.getPaddingBottom());
        return a2Var;
    }

    @Override // com.server.auditor.ssh.client.contracts.u0
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u0
    public void f() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u0
    public void i1(String str) {
        t.f(str, "url");
        bh.a.b(this, new d(str, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.u0
    public void ie() {
        String string = getString(R.string.enterprise_contact_sales_url);
        t.e(string, "getString(...)");
        Uri uri = Uri.parse(string);
        t.c(uri);
        Context contextRequireContext = requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        if (c0.A(uri, contextRequireContext)) {
            return;
        }
        Cf().t2(string);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: nh.d
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ExpiredEnterpriseBasicScreen.If(this.f66390a, (e0) obj);
            }
        }, 2, null);
        this.f24981c = e0VarB;
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
        this.f24979a = b2.c(layoutInflater, viewGroup, false);
        yf();
        ConstraintLayout constraintLayoutB = Bf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24979a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24981c;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

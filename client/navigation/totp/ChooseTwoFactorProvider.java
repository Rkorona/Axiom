package com.server.auditor.ssh.client.navigation.totp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.g0;
import com.server.auditor.ssh.client.contracts.p2;
import com.server.auditor.ssh.client.navigation.totp.ChooseTwoFactorProvider;
import com.server.auditor.ssh.client.navigation.totp.a;
import com.server.auditor.ssh.client.presenters.totp.ChooseTwoFactorProviderPresenter;
import com.server.auditor.ssh.client.widget.c1;
import iu.l;
import iu.p;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.k0;
import qu.k;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ChooseTwoFactorProvider extends MvpAppCompatFragment implements p2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ k[] f29940v = {n0.g(new g0(ChooseTwoFactorProvider.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/totp/ChooseTwoFactorProviderPresenter;", 0))};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f29941w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k0 f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29943b = new x(n0.b(ChooseTwoFactorProviderArgs.class), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f29944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0 f29945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f29946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f29947f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c f29948u;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29949a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChooseTwoFactorProvider.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29949a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChooseTwoFactorProvider.this.If();
            ChooseTwoFactorProvider.this.Kf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29951a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChooseTwoFactorProvider.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!androidx.navigation.fragment.c.a(ChooseTwoFactorProvider.this).T()) {
                ChooseTwoFactorProvider.this.p();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c implements g0.a {
        c() {
        }

        @Override // com.server.auditor.ssh.client.adapters.g0.a
        public void a(long j10) {
            ChooseTwoFactorProvider.this.Hf().u2(j10);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChooseTwoFactorProvider f29957d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j10, ChooseTwoFactorProvider chooseTwoFactorProvider, zt.e eVar) {
            super(2, eVar);
            this.f29955b = str;
            this.f29956c = j10;
            this.f29957d = chooseTwoFactorProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f29955b, this.f29956c, this.f29957d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29954a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            a.C0460a c0460aE = com.server.auditor.ssh.client.navigation.totp.a.a(this.f29955b).e(this.f29956c);
            t.e(c0460aE, "setProviderId(...)");
            androidx.navigation.fragment.c.a(this.f29957d).O(c0460aE);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class e implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29958a;

        public e(Fragment fragment) {
            this.f29958a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29958a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29958a + " has null arguments");
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29959a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f29961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, zt.e eVar) {
            super(2, eVar);
            this.f29961c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChooseTwoFactorProvider.this.new f(this.f29961c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ChooseTwoFactorProvider.this.Df().N().clear();
            ChooseTwoFactorProvider.this.Df().N().addAll(this.f29961c);
            ChooseTwoFactorProvider.this.Df().o();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChooseTwoFactorProvider() {
        iu.a aVar = new iu.a() { // from class: zj.l
            @Override // iu.a
            public final Object a() {
                return ChooseTwoFactorProvider.Mf(this.f87990a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29944c = new MoxyKtxDelegate(mvpDelegate, ChooseTwoFactorProviderPresenter.class.getName() + ".presenter", aVar);
        this.f29946e = o.a(new iu.a() { // from class: zj.m
            @Override // iu.a
            public final Object a() {
                return ChooseTwoFactorProvider.Bf(this.f87992a);
            }
        });
        this.f29947f = o.a(new iu.a() { // from class: zj.n
            @Override // iu.a
            public final Object a() {
                return ChooseTwoFactorProvider.Cf(this.f87993a);
            }
        });
        this.f29948u = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.adapters.g0 Bf(ChooseTwoFactorProvider chooseTwoFactorProvider) {
        return new com.server.auditor.ssh.client.adapters.g0(chooseTwoFactorProvider.f29948u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 Cf(ChooseTwoFactorProvider chooseTwoFactorProvider) {
        Context contextRequireContext = chooseTwoFactorProvider.requireContext();
        t.e(contextRequireContext, "requireContext(...)");
        c1 c1Var = new c1(contextRequireContext, Integer.valueOf(chooseTwoFactorProvider.getResources().getDimensionPixelSize(R.dimen.two_factor_providers_divider_size)), chooseTwoFactorProvider.getResources().getDimensionPixelSize(R.dimen.two_factor_provider_horizontal_margin));
        c1Var.n(tp.c1.a(chooseTwoFactorProvider.requireContext(), R.attr.listViewDividerColor));
        return c1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.adapters.g0 Df() {
        return (com.server.auditor.ssh.client.adapters.g0) this.f29946e.getValue();
    }

    private final ChooseTwoFactorProviderArgs Ef() {
        return (ChooseTwoFactorProviderArgs) this.f29943b.getValue();
    }

    private final k0 Ff() {
        k0 k0Var = this.f29942a;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException();
    }

    private final c1 Gf() {
        return (c1) this.f29947f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChooseTwoFactorProviderPresenter Hf() {
        return (ChooseTwoFactorProviderPresenter) this.f29944c.getValue(this, f29940v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ff().f72918b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: zj.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseTwoFactorProvider.Jf(this.f87995a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(ChooseTwoFactorProvider chooseTwoFactorProvider, View view) {
        chooseTwoFactorProvider.Hf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Kf() {
        Ff().f72923g.setAdapter(Df());
        Ff().f72923g.setLayoutManager(new LinearLayoutManager(requireContext()));
        Ff().f72923g.i(Gf());
        Hf().v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Lf(ChooseTwoFactorProvider chooseTwoFactorProvider, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        chooseTwoFactorProvider.Hf().t2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChooseTwoFactorProviderPresenter Mf(ChooseTwoFactorProvider chooseTwoFactorProvider) {
        String action = chooseTwoFactorProvider.Ef().getAction();
        t.e(action, "getAction(...)");
        return new ChooseTwoFactorProviderPresenter(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.setResult(0);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.server.auditor.ssh.client.contracts.p2
    public void M3(List list) {
        t.f(list, "providers");
        bh.a.b(this, new f(list, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.p2
    public void S2(String str, long j10) {
        t.f(str, "action");
        bh.a.b(this, new d(str, j10, this, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: zj.k
            @Override // iu.l
            public final Object invoke(Object obj) {
                return ChooseTwoFactorProvider.Lf(this.f87988a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f29945d = e0VarB;
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
        this.f29942a = k0.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = Ff().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29942a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e0 e0Var = this.f29945d;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
    }
}

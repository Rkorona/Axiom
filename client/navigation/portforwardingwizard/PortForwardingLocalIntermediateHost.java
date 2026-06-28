package com.server.auditor.ssh.client.navigation.portforwardingwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.contracts.portforwardingwizard.n;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingLocalIntermediateHost;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingLocalIntermediateHostScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingIntermediateHostLocalRulePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.r4;
import ut.m0;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLocalIntermediateHost extends MvpAppCompatFragment implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29460e = {n0.g(new g0(PortForwardingLocalIntermediateHost.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingIntermediateHostLocalRulePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29461f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r4 f29463b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29465d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f29462a = new x(n0.b(PortForwardingLocalIntermediateHostArgs.class), new c(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ut.n f29464c = o.a(new iu.a() { // from class: wj.t
        @Override // iu.a
        public final Object a() {
            return PortForwardingLocalIntermediateHost.Cf();
        }
    });

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29466a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingLocalIntermediateHost portForwardingLocalIntermediateHost, View view) {
            portForwardingLocalIntermediateHost.zf().q2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalIntermediateHost.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29466a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingLocalIntermediateHost.this.yf().f73722f;
            final PortForwardingLocalIntermediateHost portForwardingLocalIntermediateHost = PortForwardingLocalIntermediateHost.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingLocalIntermediateHost.a.k(portForwardingLocalIntermediateHost, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29468a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalIntermediateHost.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29468a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalIntermediateHostScreenViewModel portForwardingLocalIntermediateHostScreenViewModelAf = PortForwardingLocalIntermediateHost.this.Af();
            PortForwardingWizardData wizardData = PortForwardingLocalIntermediateHost.this.xf().getWizardData();
            t.e(wizardData, "getWizardData(...)");
            portForwardingLocalIntermediateHostScreenViewModelAf.sendFragmentAction(new PortForwardingLocalIntermediateHostScreenViewModel.b.a(new PortForwardingNavGraphRoute.IntermediateHostSelectorRoute(wizardData)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class c implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29470a;

        public c(Fragment fragment) {
            this.f29470a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29470a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29470a + " has null arguments");
        }
    }

    public PortForwardingLocalIntermediateHost() {
        iu.a aVar = new iu.a() { // from class: wj.u
            @Override // iu.a
            public final Object a() {
                return PortForwardingLocalIntermediateHost.Bf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29465d = new MoxyKtxDelegate(mvpDelegate, PortForwardingIntermediateHostLocalRulePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLocalIntermediateHostScreenViewModel Af() {
        return (PortForwardingLocalIntermediateHostScreenViewModel) this.f29464c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingIntermediateHostLocalRulePresenter Bf() {
        return new PortForwardingIntermediateHostLocalRulePresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingLocalIntermediateHostScreenViewModel Cf() {
        PortForwardingLocalIntermediateHostScreenViewModel portForwardingLocalIntermediateHostScreenViewModelA = PortForwardingLocalIntermediateHostScreenViewModel.Companion.a();
        if (portForwardingLocalIntermediateHostScreenViewModelA != null) {
            return portForwardingLocalIntermediateHostScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLocalIntermediateHostArgs xf() {
        return (PortForwardingLocalIntermediateHostArgs) this.f29462a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r4 yf() {
        r4 r4Var = this.f29463b;
        if (r4Var != null) {
            return r4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingIntermediateHostLocalRulePresenter zf() {
        return (PortForwardingIntermediateHostLocalRulePresenter) this.f29465d.getValue(this, f29460e[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.n
    public void a() {
        bh.a.a(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29463b = r4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29463b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(Af().isInPanel()));
        NestedScrollView nestedScrollView = yf().f73721e;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(Af().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.n
    public void s7() {
        bh.a.a(this, new b(null));
    }
}

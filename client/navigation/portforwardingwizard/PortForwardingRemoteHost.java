package com.server.auditor.ssh.client.navigation.portforwardingwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.contracts.portforwardingwizard.p;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingRemoteHost;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingRemoteHostScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingRemoteHostPresenter;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.u4;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingRemoteHost extends MvpAppCompatFragment implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29497d = {n0.g(new g0(PortForwardingRemoteHost.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingRemoteHostPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29498e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u4 f29499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f29500b = o.a(new iu.a() { // from class: wj.y
        @Override // iu.a
        public final Object a() {
            return PortForwardingRemoteHost.Af();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MoxyKtxDelegate f29501c;

    static final class a extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29502a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingRemoteHost portForwardingRemoteHost, View view) {
            portForwardingRemoteHost.xf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteHost.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29502a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            MaterialButton materialButton = PortForwardingRemoteHost.this.wf().f74060f;
            final PortForwardingRemoteHost portForwardingRemoteHost = PortForwardingRemoteHost.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingRemoteHost.a.k(portForwardingRemoteHost, view);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29504a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29506c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteHost.this.new b(this.f29506c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29504a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingRemoteHost.this.yf().sendFragmentAction(new PortForwardingRemoteHostScreenViewModel.b.a(new PortForwardingNavGraphRoute.IntermediateHostSelectorRoute(this.f29506c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29507a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29509c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteHost.this.new c(this.f29509c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29507a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingRemoteHost.this.yf().sendFragmentAction(new PortForwardingRemoteHostScreenViewModel.b.a(new PortForwardingNavGraphRoute.PortAndAddressForRemoteRuleRoute(this.f29509c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingRemoteHost() {
        iu.a aVar = new iu.a() { // from class: wj.z
            @Override // iu.a
            public final Object a() {
                return PortForwardingRemoteHost.zf(this.f84968a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29501c = new MoxyKtxDelegate(mvpDelegate, PortForwardingRemoteHostPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingRemoteHostScreenViewModel Af() {
        PortForwardingRemoteHostScreenViewModel portForwardingRemoteHostScreenViewModelA = PortForwardingRemoteHostScreenViewModel.Companion.a();
        if (portForwardingRemoteHostScreenViewModelA != null) {
            return portForwardingRemoteHostScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u4 wf() {
        u4 u4Var = this.f29499a;
        if (u4Var != null) {
            return u4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingRemoteHostPresenter xf() {
        return (PortForwardingRemoteHostPresenter) this.f29501c.getValue(this, f29497d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingRemoteHostScreenViewModel yf() {
        return (PortForwardingRemoteHostScreenViewModel) this.f29500b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingRemoteHostPresenter zf(PortForwardingRemoteHost portForwardingRemoteHost) {
        return new PortForwardingRemoteHostPresenter(portForwardingRemoteHost.yf().getWizardData());
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void a() {
        bh.a.a(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void l9(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new c(portForwardingWizardData, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29499a = u4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = wf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29499a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = wf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(yf().isInPanel()));
        NestedScrollView nestedScrollView = wf().f74059e;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(yf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void w1(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new b(portForwardingWizardData, null));
    }
}

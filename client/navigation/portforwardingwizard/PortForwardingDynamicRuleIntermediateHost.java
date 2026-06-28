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
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingDynamicRuleIntermediateHost;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingIntermediateHostForDynamicRuleScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDynamicRuleIntermediateHostPresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.o4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingDynamicRuleIntermediateHost extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.portforwardingwizard.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29379e = {n0.g(new g0(PortForwardingDynamicRuleIntermediateHost.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDynamicRuleIntermediateHostPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29380f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o4 f29381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29382b = new x(n0.b(PortForwardingDynamicRuleIntermediateHostArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f29383c = o.a(new iu.a() { // from class: wj.h
        @Override // iu.a
        public final Object a() {
            return PortForwardingDynamicRuleIntermediateHost.Bf();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29384d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29385a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingDynamicRuleIntermediateHost portForwardingDynamicRuleIntermediateHost, View view) {
            portForwardingDynamicRuleIntermediateHost.yf().r2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleIntermediateHost.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29385a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingDynamicRuleIntermediateHost.this.xf().f73390f;
            final PortForwardingDynamicRuleIntermediateHost portForwardingDynamicRuleIntermediateHost = PortForwardingDynamicRuleIntermediateHost.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingDynamicRuleIntermediateHost.a.k(portForwardingDynamicRuleIntermediateHost, view);
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
        int f29387a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29389c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleIntermediateHost.this.new b(this.f29389c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29387a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleIntermediateHost.this.zf().sendFragmentAction(new PortForwardingIntermediateHostForDynamicRuleScreenViewModel.b.a(new PortForwardingNavGraphRoute.IntermediateHostSelectorRoute(this.f29389c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29390a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29392c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleIntermediateHost.this.new c(this.f29392c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29390a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleIntermediateHost.this.zf().sendFragmentAction(new PortForwardingIntermediateHostForDynamicRuleScreenViewModel.b.a(new PortForwardingNavGraphRoute.LabelForRuleRoute(this.f29392c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29393a;

        public d(Fragment fragment) {
            this.f29393a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29393a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29393a + " has null arguments");
        }
    }

    public PortForwardingDynamicRuleIntermediateHost() {
        iu.a aVar = new iu.a() { // from class: wj.i
            @Override // iu.a
            public final Object a() {
                return PortForwardingDynamicRuleIntermediateHost.Af(this.f84963a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29384d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDynamicRuleIntermediateHostPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDynamicRuleIntermediateHostPresenter Af(PortForwardingDynamicRuleIntermediateHost portForwardingDynamicRuleIntermediateHost) {
        PortForwardingWizardData wizardData = portForwardingDynamicRuleIntermediateHost.wf().getWizardData();
        t.e(wizardData, "getWizardData(...)");
        return new PortForwardingDynamicRuleIntermediateHostPresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingIntermediateHostForDynamicRuleScreenViewModel Bf() {
        PortForwardingIntermediateHostForDynamicRuleScreenViewModel portForwardingIntermediateHostForDynamicRuleScreenViewModelA = PortForwardingIntermediateHostForDynamicRuleScreenViewModel.Companion.a();
        if (portForwardingIntermediateHostForDynamicRuleScreenViewModelA != null) {
            return portForwardingIntermediateHostForDynamicRuleScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PortForwardingDynamicRuleIntermediateHostArgs wf() {
        return (PortForwardingDynamicRuleIntermediateHostArgs) this.f29382b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o4 xf() {
        o4 o4Var = this.f29381a;
        if (o4Var != null) {
            return o4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDynamicRuleIntermediateHostPresenter yf() {
        return (PortForwardingDynamicRuleIntermediateHostPresenter) this.f29384d.getValue(this, f29379e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingIntermediateHostForDynamicRuleScreenViewModel zf() {
        return (PortForwardingIntermediateHostForDynamicRuleScreenViewModel) this.f29383c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void J(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new c(portForwardingWizardData, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void a() {
        bh.a.a(this, new a(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29381a = o4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29381a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(zf().isInPanel()));
        NestedScrollView nestedScrollView = xf().f73389e;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(zf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void qc(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new b(portForwardingWizardData, null));
    }
}

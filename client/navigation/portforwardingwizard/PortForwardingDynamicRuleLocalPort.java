package com.server.auditor.ssh.client.navigation.portforwardingwizard;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.navigation.x;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingDynamicRuleLocalPort;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingLocalPortForDynamicViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDynamicRuleLocalPortPresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.s4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingDynamicRuleLocalPort extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.portforwardingwizard.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29395e = {n0.g(new g0(PortForwardingDynamicRuleLocalPort.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDynamicRuleLocalPortPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29396f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s4 f29397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f29398b = o.a(new iu.a() { // from class: wj.k
        @Override // iu.a
        public final Object a() {
            return PortForwardingDynamicRuleLocalPort.Bf();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f29399c = new x(n0.b(PortForwardingDynamicRuleLocalPortArgs.class), new f(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29400d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29401a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29403c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29403c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPort.this.new a(this.f29403c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29401a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleLocalPort.this.xf().f73822d.setEnabled(this.f29403c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29404a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPort.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29404a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleLocalPort.this.xf().f73824f.setError(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29406a;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingDynamicRuleLocalPort f29408a;

            public a(PortForwardingDynamicRuleLocalPort portForwardingDynamicRuleLocalPort) {
                this.f29408a = portForwardingDynamicRuleLocalPort;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29408a.yf().t2(charSequence);
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingDynamicRuleLocalPort portForwardingDynamicRuleLocalPort, View view) {
            portForwardingDynamicRuleLocalPort.yf().s2(portForwardingDynamicRuleLocalPort.xf().f73823e.getText(), portForwardingDynamicRuleLocalPort.xf().f73820b.getText());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPort.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29406a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingDynamicRuleLocalPort.this.xf().f73822d;
            final PortForwardingDynamicRuleLocalPort portForwardingDynamicRuleLocalPort = PortForwardingDynamicRuleLocalPort.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingDynamicRuleLocalPort.c.k(portForwardingDynamicRuleLocalPort, view);
                }
            });
            TextInputEditText textInputEditText = PortForwardingDynamicRuleLocalPort.this.xf().f73823e;
            t.e(textInputEditText, "localPortEditText");
            textInputEditText.addTextChangedListener(new a(PortForwardingDynamicRuleLocalPort.this));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29409a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29411c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29411c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPort.this.new d(this.f29411c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleLocalPort.this.zf().sendFragmentAction(new PortForwardingLocalPortForDynamicViewModel.b.a(new PortForwardingNavGraphRoute.IntermediateHostForDynamicRuleRoute(this.f29411c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29412a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPort.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29412a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDynamicRuleLocalPort.this.xf().f73824f.setError(PortForwardingDynamicRuleLocalPort.this.getString(R.string.incorrect_port_value_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29414a;

        public f(Fragment fragment) {
            this.f29414a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29414a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29414a + " has null arguments");
        }
    }

    public PortForwardingDynamicRuleLocalPort() {
        iu.a aVar = new iu.a() { // from class: wj.l
            @Override // iu.a
            public final Object a() {
                return PortForwardingDynamicRuleLocalPort.Af(this.f84964a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29400d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDynamicRuleLocalPortPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDynamicRuleLocalPortPresenter Af(PortForwardingDynamicRuleLocalPort portForwardingDynamicRuleLocalPort) {
        PortForwardingWizardData wizardData = portForwardingDynamicRuleLocalPort.wf().getWizardData();
        t.e(wizardData, "getWizardData(...)");
        return new PortForwardingDynamicRuleLocalPortPresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingLocalPortForDynamicViewModel Bf() {
        PortForwardingLocalPortForDynamicViewModel portForwardingLocalPortForDynamicViewModelA = PortForwardingLocalPortForDynamicViewModel.Companion.a();
        if (portForwardingLocalPortForDynamicViewModelA != null) {
            return portForwardingLocalPortForDynamicViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PortForwardingDynamicRuleLocalPortArgs wf() {
        return (PortForwardingDynamicRuleLocalPortArgs) this.f29399c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s4 xf() {
        s4 s4Var = this.f29397a;
        if (s4Var != null) {
            return s4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDynamicRuleLocalPortPresenter yf() {
        return (PortForwardingDynamicRuleLocalPortPresenter) this.f29400d.getValue(this, f29395e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLocalPortForDynamicViewModel zf() {
        return (PortForwardingLocalPortForDynamicViewModel) this.f29398b.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void Q6(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new d(portForwardingWizardData, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void a() {
        bh.a.a(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29397a = s4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29397a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(zf().isInPanel()));
        NestedScrollView nestedScrollView = xf().f73828j;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(zf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void v() {
        bh.a.a(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void w() {
        bh.a.a(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void y(boolean z10) {
        bh.a.a(this, new a(z10, null));
    }
}

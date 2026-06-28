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
import com.server.auditor.ssh.client.contracts.portforwardingwizard.r;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingDataForRemoteRule;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingPortAndAddressViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDataForRemoteRulePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.n4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingDataForRemoteRule extends MvpAppCompatFragment implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29358e = {n0.g(new g0(PortForwardingDataForRemoteRule.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDataForRemoteRulePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29359f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n4 f29360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29361b = new x(n0.b(PortForwardingDataForRemoteRuleArgs.class), new f(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f29362c = o.a(new iu.a() { // from class: wj.e
        @Override // iu.a
        public final Object a() {
            return PortForwardingDataForRemoteRule.Bf();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29363d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29364a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29366c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRule.this.new a(this.f29366c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29364a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForRemoteRule.this.xf().f73311d.setEnabled(this.f29366c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29367a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRule.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29367a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForRemoteRule.this.xf().f73313f.setError(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29369a;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingDataForRemoteRule f29371a;

            public a(PortForwardingDataForRemoteRule portForwardingDataForRemoteRule) {
                this.f29371a = portForwardingDataForRemoteRule;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29371a.yf().t2(charSequence);
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingDataForRemoteRule portForwardingDataForRemoteRule, View view) {
            portForwardingDataForRemoteRule.yf().s2(portForwardingDataForRemoteRule.xf().f73312e.getText(), portForwardingDataForRemoteRule.xf().f73309b.getText());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRule.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingDataForRemoteRule.this.xf().f73311d;
            final PortForwardingDataForRemoteRule portForwardingDataForRemoteRule = PortForwardingDataForRemoteRule.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingDataForRemoteRule.c.k(portForwardingDataForRemoteRule, view);
                }
            });
            TextInputEditText textInputEditText = PortForwardingDataForRemoteRule.this.xf().f73312e;
            t.e(textInputEditText, "portNumberEditText");
            textInputEditText.addTextChangedListener(new a(PortForwardingDataForRemoteRule.this));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29372a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29374c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRule.this.new d(this.f29374c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29372a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForRemoteRule.this.zf().sendFragmentAction(new PortForwardingPortAndAddressViewModel.b.a(new PortForwardingNavGraphRoute.DestinationHostForRemoteRuleRoute(this.f29374c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29375a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRule.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForRemoteRule.this.xf().f73313f.setError(PortForwardingDataForRemoteRule.this.getString(R.string.incorrect_port_value_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class f implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29377a;

        public f(Fragment fragment) {
            this.f29377a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29377a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29377a + " has null arguments");
        }
    }

    public PortForwardingDataForRemoteRule() {
        iu.a aVar = new iu.a() { // from class: wj.f
            @Override // iu.a
            public final Object a() {
                return PortForwardingDataForRemoteRule.Af(this.f84962a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29363d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDataForRemoteRulePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDataForRemoteRulePresenter Af(PortForwardingDataForRemoteRule portForwardingDataForRemoteRule) {
        PortForwardingWizardData wizardData = portForwardingDataForRemoteRule.wf().getWizardData();
        t.e(wizardData, "getWizardData(...)");
        return new PortForwardingDataForRemoteRulePresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingPortAndAddressViewModel Bf() {
        PortForwardingPortAndAddressViewModel portForwardingPortAndAddressViewModelA = PortForwardingPortAndAddressViewModel.Companion.a();
        if (portForwardingPortAndAddressViewModelA != null) {
            return portForwardingPortAndAddressViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PortForwardingDataForRemoteRuleArgs wf() {
        return (PortForwardingDataForRemoteRuleArgs) this.f29361b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n4 xf() {
        n4 n4Var = this.f29360a;
        if (n4Var != null) {
            return n4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDataForRemoteRulePresenter yf() {
        return (PortForwardingDataForRemoteRulePresenter) this.f29363d.getValue(this, f29358e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingPortAndAddressViewModel zf() {
        return (PortForwardingPortAndAddressViewModel) this.f29362c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.r
    public void Wa(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new d(portForwardingWizardData, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.r
    public void a() {
        bh.a.a(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29360a = n4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29360a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(zf().isInPanel()));
        NestedScrollView nestedScrollView = xf().f73317j;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(zf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.r
    public void v() {
        bh.a.a(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.r
    public void w() {
        bh.a.a(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.r
    public void y(boolean z10) {
        bh.a.a(this, new a(z10, null));
    }
}

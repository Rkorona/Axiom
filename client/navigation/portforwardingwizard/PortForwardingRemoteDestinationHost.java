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
import com.server.auditor.ssh.client.contracts.portforwardingwizard.t;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingRemoteDestinationHost;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingRemoteDestinationHostScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDestinationHostRemoteRulePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.t4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingRemoteDestinationHost extends MvpAppCompatFragment implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29471e = {n0.g(new g0(PortForwardingRemoteDestinationHost.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDestinationHostRemoteRulePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29472f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t4 f29473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f29474b = new x(n0.b(PortForwardingRemoteDestinationHostArgs.class), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f29475c = o.a(new iu.a() { // from class: wj.v
        @Override // iu.a
        public final Object a() {
            return PortForwardingRemoteDestinationHost.Bf();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29476d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29479c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new a(this.f29479c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29477a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.xf().f73949b.setEnabled(this.f29479c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29480a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29480a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.xf().f73953f.setError(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29482a;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingRemoteDestinationHost f29484a;

            public a(PortForwardingRemoteDestinationHost portForwardingRemoteDestinationHost) {
                this.f29484a = portForwardingRemoteDestinationHost;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29484a.yf().u2();
            }
        }

        public static final class b implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingRemoteDestinationHost f29485a;

            public b(PortForwardingRemoteDestinationHost portForwardingRemoteDestinationHost) {
                this.f29485a = portForwardingRemoteDestinationHost;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29485a.yf().u2();
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingRemoteDestinationHost portForwardingRemoteDestinationHost, View view) {
            portForwardingRemoteDestinationHost.yf().t2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29482a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingRemoteDestinationHost.this.xf().f73949b;
            final PortForwardingRemoteDestinationHost portForwardingRemoteDestinationHost = PortForwardingRemoteDestinationHost.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingRemoteDestinationHost.c.k(portForwardingRemoteDestinationHost, view);
                }
            });
            TextInputEditText textInputEditText = PortForwardingRemoteDestinationHost.this.xf().f73950c;
            ju.t.e(textInputEditText, "destinationAddressEditText");
            textInputEditText.addTextChangedListener(new a(PortForwardingRemoteDestinationHost.this));
            TextInputEditText textInputEditText2 = PortForwardingRemoteDestinationHost.this.xf().f73952e;
            ju.t.e(textInputEditText2, "destinationPortEditText");
            textInputEditText2.addTextChangedListener(new b(PortForwardingRemoteDestinationHost.this));
            PortForwardingRemoteDestinationHost.this.yf().u2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29486a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29486a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.yf().s2(PortForwardingRemoteDestinationHost.this.xf().f73950c.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29488a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29488a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.yf().v2(PortForwardingRemoteDestinationHost.this.xf().f73952e.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29490a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29492c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new f(this.f29492c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29490a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.zf().sendFragmentAction(new PortForwardingRemoteDestinationHostScreenViewModel.b.a(new PortForwardingNavGraphRoute.LabelForRuleRoute(this.f29492c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29493a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingRemoteDestinationHost.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingRemoteDestinationHost.this.xf().f73953f.setError(PortForwardingRemoteDestinationHost.this.getString(R.string.incorrect_port_value_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29495a;

        public h(Fragment fragment) {
            this.f29495a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29495a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29495a + " has null arguments");
        }
    }

    public PortForwardingRemoteDestinationHost() {
        iu.a aVar = new iu.a() { // from class: wj.w
            @Override // iu.a
            public final Object a() {
                return PortForwardingRemoteDestinationHost.Af(this.f84967a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f29476d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDestinationHostRemoteRulePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDestinationHostRemoteRulePresenter Af(PortForwardingRemoteDestinationHost portForwardingRemoteDestinationHost) {
        PortForwardingWizardData wizardData = portForwardingRemoteDestinationHost.wf().getWizardData();
        ju.t.e(wizardData, "getWizardData(...)");
        return new PortForwardingDestinationHostRemoteRulePresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingRemoteDestinationHostScreenViewModel Bf() {
        PortForwardingRemoteDestinationHostScreenViewModel portForwardingRemoteDestinationHostScreenViewModelA = PortForwardingRemoteDestinationHostScreenViewModel.Companion.a();
        if (portForwardingRemoteDestinationHostScreenViewModelA != null) {
            return portForwardingRemoteDestinationHostScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PortForwardingRemoteDestinationHostArgs wf() {
        return (PortForwardingRemoteDestinationHostArgs) this.f29474b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t4 xf() {
        t4 t4Var = this.f29473a;
        if (t4Var != null) {
            return t4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDestinationHostRemoteRulePresenter yf() {
        return (PortForwardingDestinationHostRemoteRulePresenter) this.f29476d.getValue(this, f29471e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingRemoteDestinationHostScreenViewModel zf() {
        return (PortForwardingRemoteDestinationHostScreenViewModel) this.f29475c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void J(PortForwardingWizardData portForwardingWizardData) {
        ju.t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new f(portForwardingWizardData, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void Y1() {
        bh.a.a(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void a() {
        bh.a.a(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void m0() {
        bh.a.a(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29473a = t4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        ju.t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29473a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        ju.t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(zf().isInPanel()));
        NestedScrollView nestedScrollView = xf().f73957j;
        ju.t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(zf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void v() {
        bh.a.a(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void w() {
        bh.a.a(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void y(boolean z10) {
        bh.a.a(this, new a(z10, null));
    }
}

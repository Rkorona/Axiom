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
import com.server.auditor.ssh.client.contracts.portforwardingwizard.l;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingLocalDestinationHost;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingLocalDestinationHostScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDestinationHostLocalRulePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.q4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLocalDestinationHost extends MvpAppCompatFragment implements l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29434e = {n0.g(new g0(PortForwardingLocalDestinationHost.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDestinationHostLocalRulePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29435f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q4 f29437b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29439d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f29436a = new x(n0.b(PortForwardingLocalDestinationHostArgs.class), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f29438c = o.a(new iu.a() { // from class: wj.q
        @Override // iu.a
        public final Object a() {
            return PortForwardingLocalDestinationHost.Bf();
        }
    });

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29440a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29442c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29442c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new a(this.f29442c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29440a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.xf().f73627b.setEnabled(this.f29442c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29443a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.xf().f73631f.setError(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29445a;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingLocalDestinationHost f29447a;

            public a(PortForwardingLocalDestinationHost portForwardingLocalDestinationHost) {
                this.f29447a = portForwardingLocalDestinationHost;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29447a.yf().u2();
            }
        }

        public static final class b implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingLocalDestinationHost f29448a;

            public b(PortForwardingLocalDestinationHost portForwardingLocalDestinationHost) {
                this.f29448a = portForwardingLocalDestinationHost;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29448a.yf().u2();
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingLocalDestinationHost portForwardingLocalDestinationHost, View view) {
            portForwardingLocalDestinationHost.yf().t2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingLocalDestinationHost.this.xf().f73627b;
            final PortForwardingLocalDestinationHost portForwardingLocalDestinationHost = PortForwardingLocalDestinationHost.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingLocalDestinationHost.c.k(portForwardingLocalDestinationHost, view);
                }
            });
            TextInputEditText textInputEditText = PortForwardingLocalDestinationHost.this.xf().f73628c;
            t.e(textInputEditText, "destinationAddressEditText");
            textInputEditText.addTextChangedListener(new a(PortForwardingLocalDestinationHost.this));
            TextInputEditText textInputEditText2 = PortForwardingLocalDestinationHost.this.xf().f73630e;
            t.e(textInputEditText2, "destinationPortEditText");
            textInputEditText2.addTextChangedListener(new b(PortForwardingLocalDestinationHost.this));
            PortForwardingLocalDestinationHost.this.yf().u2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29449a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29449a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.yf().s2(PortForwardingLocalDestinationHost.this.xf().f73628c.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29451a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.yf().v2(PortForwardingLocalDestinationHost.this.xf().f73630e.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29453a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingWizardData f29455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PortForwardingWizardData portForwardingWizardData, zt.e eVar) {
            super(2, eVar);
            this.f29455c = portForwardingWizardData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new f(this.f29455c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29453a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.zf().sendFragmentAction(new PortForwardingLocalDestinationHostScreenViewModel.b.a(new PortForwardingNavGraphRoute.LabelForRuleRoute(this.f29455c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29456a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLocalDestinationHost.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29456a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLocalDestinationHost.this.xf().f73631f.setError(PortForwardingLocalDestinationHost.this.getString(R.string.incorrect_port_value_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class h implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29458a;

        public h(Fragment fragment) {
            this.f29458a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29458a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29458a + " has null arguments");
        }
    }

    public PortForwardingLocalDestinationHost() {
        iu.a aVar = new iu.a() { // from class: wj.r
            @Override // iu.a
            public final Object a() {
                return PortForwardingLocalDestinationHost.Af(this.f84966a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29439d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDestinationHostLocalRulePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDestinationHostLocalRulePresenter Af(PortForwardingLocalDestinationHost portForwardingLocalDestinationHost) {
        PortForwardingWizardData wizardData = portForwardingLocalDestinationHost.wf().getWizardData();
        t.e(wizardData, "getWizardData(...)");
        return new PortForwardingDestinationHostLocalRulePresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingLocalDestinationHostScreenViewModel Bf() {
        PortForwardingLocalDestinationHostScreenViewModel portForwardingLocalDestinationHostScreenViewModelA = PortForwardingLocalDestinationHostScreenViewModel.Companion.a();
        if (portForwardingLocalDestinationHostScreenViewModelA != null) {
            return portForwardingLocalDestinationHostScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    private final PortForwardingLocalDestinationHostArgs wf() {
        return (PortForwardingLocalDestinationHostArgs) this.f29436a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q4 xf() {
        q4 q4Var = this.f29437b;
        if (q4Var != null) {
            return q4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDestinationHostLocalRulePresenter yf() {
        return (PortForwardingDestinationHostLocalRulePresenter) this.f29439d.getValue(this, f29434e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLocalDestinationHostScreenViewModel zf() {
        return (PortForwardingLocalDestinationHostScreenViewModel) this.f29438c.getValue();
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void J(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        bh.a.a(this, new f(portForwardingWizardData, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void Y1() {
        bh.a.a(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void a() {
        bh.a.a(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void m0() {
        bh.a.a(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29437b = q4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29437b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = xf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(zf().isInPanel()));
        NestedScrollView nestedScrollView = xf().f73635j;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(zf().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void v() {
        bh.a.a(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void w() {
        bh.a.a(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.l
    public void y(boolean z10) {
        bh.a.a(this, new a(z10, null));
    }
}

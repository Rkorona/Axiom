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
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingDataForLocalRule;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingDataForLocalRuleScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingDataLocalRulePresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.m4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingDataForLocalRule extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.portforwardingwizard.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29334e = {n0.g(new g0(PortForwardingDataForLocalRule.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingDataLocalRulePresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29335f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m4 f29336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f29337b = o.a(new iu.a() { // from class: wj.b
        @Override // iu.a
        public final Object a() {
            return PortForwardingDataForLocalRule.Cf();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f29338c = new x(n0.b(PortForwardingDataForLocalRuleArgs.class), new g(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29339d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29340a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForLocalRule.this.zf().s2(PortForwardingDataForLocalRule.this.yf().f73189g.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29342a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29344c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29344c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new b(this.f29344c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForLocalRule.this.yf().f73186d.setEnabled(this.f29344c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29345a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForLocalRule.this.yf().f73190h.setError(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29347a;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingDataForLocalRule f29349a;

            public a(PortForwardingDataForLocalRule portForwardingDataForLocalRule) {
                this.f29349a = portForwardingDataForLocalRule;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29349a.zf().s2(charSequence);
            }
        }

        d(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingDataForLocalRule portForwardingDataForLocalRule, View view) {
            portForwardingDataForLocalRule.zf().r2(portForwardingDataForLocalRule.yf().f73189g.getText(), portForwardingDataForLocalRule.yf().f73184b.getText());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29347a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = PortForwardingDataForLocalRule.this.yf().f73186d;
            final PortForwardingDataForLocalRule portForwardingDataForLocalRule = PortForwardingDataForLocalRule.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingDataForLocalRule.d.k(portForwardingDataForLocalRule, view);
                }
            });
            TextInputEditText textInputEditText = PortForwardingDataForLocalRule.this.yf().f73189g;
            t.e(textInputEditText, "portNumberEditText");
            textInputEditText.addTextChangedListener(new a(PortForwardingDataForLocalRule.this));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29350a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, String str, zt.e eVar) {
            super(2, eVar);
            this.f29352c = i10;
            this.f29353d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new e(this.f29352c, this.f29353d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingWizardData wizardData = PortForwardingDataForLocalRule.this.xf().getWizardData();
            t.e(wizardData, "getWizardData(...)");
            wizardData.setLocalPortNumber(this.f29352c);
            wizardData.setBindAddress(this.f29353d);
            PortForwardingDataForLocalRule.this.Af().sendFragmentAction(new PortForwardingDataForLocalRuleScreenViewModel.b.a(new PortForwardingNavGraphRoute.IntermediateHostForLocalRuleRoute(wizardData)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29354a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForLocalRule.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29354a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingDataForLocalRule.this.yf().f73190h.setError(PortForwardingDataForLocalRule.this.getString(R.string.incorrect_port_value_error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class g implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29356a;

        public g(Fragment fragment) {
            this.f29356a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29356a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29356a + " has null arguments");
        }
    }

    public PortForwardingDataForLocalRule() {
        iu.a aVar = new iu.a() { // from class: wj.c
            @Override // iu.a
            public final Object a() {
                return PortForwardingDataForLocalRule.Bf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29339d = new MoxyKtxDelegate(mvpDelegate, PortForwardingDataLocalRulePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDataForLocalRuleScreenViewModel Af() {
        return (PortForwardingDataForLocalRuleScreenViewModel) this.f29337b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDataLocalRulePresenter Bf() {
        return new PortForwardingDataLocalRulePresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingDataForLocalRuleScreenViewModel Cf() {
        PortForwardingDataForLocalRuleScreenViewModel portForwardingDataForLocalRuleScreenViewModelA = PortForwardingDataForLocalRuleScreenViewModel.Companion.a();
        if (portForwardingDataForLocalRuleScreenViewModelA != null) {
            return portForwardingDataForLocalRuleScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDataForLocalRuleArgs xf() {
        return (PortForwardingDataForLocalRuleArgs) this.f29338c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m4 yf() {
        m4 m4Var = this.f29336a;
        if (m4Var != null) {
            return m4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingDataLocalRulePresenter zf() {
        return (PortForwardingDataLocalRulePresenter) this.f29339d.getValue(this, f29334e[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void a() {
        bh.a.a(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void bc(int i10, String str) {
        t.f(str, "bindAddress");
        bh.a.a(this, new e(i10, str, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29336a = m4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29336a = null;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        q5();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(Af().isInPanel()));
        NestedScrollView nestedScrollView = yf().f73192j;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(Af().isInPanel()));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void q5() {
        bh.a.a(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void v() {
        bh.a.a(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void w() {
        bh.a.a(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void y(boolean z10) {
        bh.a.a(this, new b(z10, null));
    }
}

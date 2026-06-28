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
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingLabelForRule;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.PortForwardingNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.PortForwardingLabelForRuleScreenViewModel;
import com.server.auditor.ssh.client.presenters.portforwardingwizard.PortForwardingLabelPresenter;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.p4;
import ut.m0;
import ut.n;
import ut.o;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class PortForwardingLabelForRule extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.portforwardingwizard.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f29416e = {n0.g(new g0(PortForwardingLabelForRule.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/portforwardingwizard/PortForwardingLabelPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29417f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p4 f29419b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f29421d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f29418a = new x(n0.b(PortForwardingLabelForRuleArgs.class), new d(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f29420c = o.a(new iu.a() { // from class: wj.n
        @Override // iu.a
        public final Object a() {
            return PortForwardingLabelForRule.Cf();
        }
    });

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29422a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29424c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f29424c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLabelForRule.this.new a(this.f29424c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29422a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLabelForRule.this.yf().f73520b.setEnabled(this.f29424c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29425a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29428d;

        public static final class a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PortForwardingLabelForRule f29429a;

            public a(PortForwardingLabelForRule portForwardingLabelForRule) {
                this.f29429a = portForwardingLabelForRule;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                this.f29429a.zf().r2(charSequence);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, zt.e eVar) {
            super(2, eVar);
            this.f29427c = i10;
            this.f29428d = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(PortForwardingLabelForRule portForwardingLabelForRule, View view) {
            portForwardingLabelForRule.zf().q2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLabelForRule.this.new b(this.f29427c, this.f29428d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29425a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingLabelForRuleScreenViewModel portForwardingLabelForRuleScreenViewModelAf = PortForwardingLabelForRule.this.Af();
            String string = PortForwardingLabelForRule.this.getString(this.f29427c);
            t.e(string, "getString(...)");
            portForwardingLabelForRuleScreenViewModelAf.updateTitle(string);
            PortForwardingLabelForRule.this.yf().f73522d.setText(PortForwardingLabelForRule.this.getString(this.f29428d));
            TextInputEditText textInputEditText = PortForwardingLabelForRule.this.yf().f73522d;
            t.e(textInputEditText, "labelTextEdit");
            textInputEditText.addTextChangedListener(new a(PortForwardingLabelForRule.this));
            MaterialButton materialButton = PortForwardingLabelForRule.this.yf().f73520b;
            final PortForwardingLabelForRule portForwardingLabelForRule = PortForwardingLabelForRule.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.navigation.portforwardingwizard.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PortForwardingLabelForRule.b.k(portForwardingLabelForRule, view);
                }
            });
            PortForwardingLabelForRule.this.zf().r2(PortForwardingLabelForRule.this.yf().f73522d.getText());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29430a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingLabelForRule.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f29430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            PortForwardingWizardData wizardData = PortForwardingLabelForRule.this.xf().getWizardData();
            t.e(wizardData, "getWizardData(...)");
            wizardData.setRuleLabel(String.valueOf(PortForwardingLabelForRule.this.yf().f73522d.getText()));
            PortForwardingLabelForRule.this.Af().sendFragmentAction(new PortForwardingLabelForRuleScreenViewModel.b.a(new PortForwardingNavGraphRoute.EditRuleRoute(wizardData)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f29432a;

        public d(Fragment fragment) {
            this.f29432a = fragment;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle a() {
            Bundle arguments = this.f29432a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f29432a + " has null arguments");
        }
    }

    public PortForwardingLabelForRule() {
        iu.a aVar = new iu.a() { // from class: wj.o
            @Override // iu.a
            public final Object a() {
                return PortForwardingLabelForRule.Bf(this.f84965a);
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f29421d = new MoxyKtxDelegate(mvpDelegate, PortForwardingLabelPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLabelForRuleScreenViewModel Af() {
        return (PortForwardingLabelForRuleScreenViewModel) this.f29420c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingLabelPresenter Bf(PortForwardingLabelForRule portForwardingLabelForRule) {
        PortForwardingWizardData wizardData = portForwardingLabelForRule.xf().getWizardData();
        t.e(wizardData, "getWizardData(...)");
        return new PortForwardingLabelPresenter(wizardData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortForwardingLabelForRuleScreenViewModel Cf() {
        PortForwardingLabelForRuleScreenViewModel portForwardingLabelForRuleScreenViewModelA = PortForwardingLabelForRuleScreenViewModel.Companion.a();
        if (portForwardingLabelForRuleScreenViewModelA != null) {
            return portForwardingLabelForRuleScreenViewModelA;
        }
        throw new IllegalStateException("View model is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLabelForRuleArgs xf() {
        return (PortForwardingLabelForRuleArgs) this.f29418a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p4 yf() {
        p4 p4Var = this.f29419b;
        if (p4Var != null) {
            return p4Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortForwardingLabelPresenter zf() {
        return (PortForwardingLabelPresenter) this.f29421d.getValue(this, f29416e[0]);
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void J6() {
        bh.a.a(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void O4(boolean z10) {
        bh.a.a(this, new a(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void o6(int i10, int i11) {
        bh.a.a(this, new b(i10, i11, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29419b = p4.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29419b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t.f(view, "view");
        super.onViewCreated(view, bundle);
        CoordinatorLayout coordinatorLayoutB = yf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        g6.Z1(coordinatorLayoutB, getArguments(), Boolean.valueOf(Af().isInPanel()));
        NestedScrollView nestedScrollView = yf().f73524f;
        t.e(nestedScrollView, "scrollView");
        g6.Z1(nestedScrollView, getArguments(), Boolean.valueOf(Af().isInPanel()));
    }
}

package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.contracts.portforwardingwizard.d;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingDynamicRuleIntermediateHostPresenter extends MvpPresenter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37676a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37677a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PortForwardingDynamicRuleIntermediateHostPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37677a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wj.a.f84960a.c();
            PortForwardingDynamicRuleIntermediateHostPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37679a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PortForwardingDynamicRuleIntermediateHostPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37679a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDynamicRuleIntermediateHostPresenter.this.getViewState().qc(PortForwardingDynamicRuleIntermediateHostPresenter.this.f37676a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingDynamicRuleIntermediateHostPresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37676a = portForwardingWizardData;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

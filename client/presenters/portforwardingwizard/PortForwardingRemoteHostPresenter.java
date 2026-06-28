package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.contracts.portforwardingwizard.p;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
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
public final class PortForwardingRemoteHostPresenter extends MvpPresenter<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37708a;

    static final class a extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37709a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PortForwardingRemoteHostPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37709a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wj.a.f84960a.k();
            PortForwardingRemoteHostPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37711a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PortForwardingRemoteHostPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37711a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingRemoteHostPresenter.this.getViewState().w1(PortForwardingRemoteHostPresenter.this.q2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingRemoteHostPresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37708a = portForwardingWizardData;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final PortForwardingWizardData q2() {
        return this.f37708a;
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

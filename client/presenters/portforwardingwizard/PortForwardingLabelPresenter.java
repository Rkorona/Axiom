package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.portforwardingwizard.h;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingLabelPresenter extends MvpPresenter<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37702a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37703a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return PortForwardingLabelPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37703a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingLabelPresenter.this.getViewState().J6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingLabelPresenter f37707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, PortForwardingLabelPresenter portForwardingLabelPresenter, e eVar) {
            super(2, eVar);
            this.f37706b = charSequence;
            this.f37707c = portForwardingLabelPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f37706b, this.f37707c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37705a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CharSequence charSequence = this.f37706b;
            if (charSequence != null) {
                PortForwardingLabelPresenter portForwardingLabelPresenter = this.f37707c;
                if (charSequence.length() == 0 || s.m0(charSequence)) {
                    portForwardingLabelPresenter.getViewState().O4(false);
                } else {
                    portForwardingLabelPresenter.getViewState().O4(true);
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingLabelPresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37702a = portForwardingWizardData;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        int portForwardingType = this.f37702a.getPortForwardingType();
        if (portForwardingType == 0) {
            wj.a.f84960a.e();
            getViewState().o6(R.string.local_forwarding_title, R.string.port_forwarding_default_local_title);
        } else if (portForwardingType == 1) {
            wj.a.f84960a.i();
            getViewState().o6(R.string.remote_forwarding_title, R.string.port_forwarding_default_remote_title);
        } else {
            if (portForwardingType != 2) {
                return;
            }
            wj.a.f84960a.a();
            getViewState().o6(R.string.dynamic_forwarding_title, R.string.port_forwarding_default_dynamic_title);
        }
    }

    public final void q2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void r2(CharSequence charSequence) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(charSequence, this, null), 3, null);
    }
}

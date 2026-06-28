package com.server.auditor.ssh.client.presenters;

import au.b;
import com.server.auditor.ssh.client.contracts.q0;
import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
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
public final class EnabledOpenAiAndGotTrialPresenter extends MvpPresenter<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SubscriptionPeriodInfo f35520a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35521a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EnabledOpenAiAndGotTrialPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f35521a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnabledOpenAiAndGotTrialPresenter.this.getViewState().x(-1);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnabledOpenAiAndGotTrialPresenter(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        t.f(subscriptionPeriodInfo, "subscriptionPeriodInfo");
        this.f35520a = subscriptionPeriodInfo;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().fa(this.f35520a);
        getViewState().N1();
    }

    public final void q2() {
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }
}

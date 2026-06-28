package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.g1;
import iu.p;
import ju.k;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class FreeTrialCongratulationAfterSignUpPresenter extends MvpPresenter<g1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35567a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35568b = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35569a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return FreeTrialCongratulationAfterSignUpPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35569a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            FreeTrialCongratulationAfterSignUpPresenter.this.getViewState().he();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().te(14);
        getViewState().m9();
        getViewState().a();
        getViewState().fc();
    }

    public final void q2() {
    }

    public final void r2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

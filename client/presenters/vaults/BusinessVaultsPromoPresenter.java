package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.contracts.u;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class BusinessVaultsPromoPresenter extends MvpPresenter<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38449a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38450a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BusinessVaultsPromoPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38450a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsPromoPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38452a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BusinessVaultsPromoPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38452a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().c6(Avo.UpgradeButtonLocation.MULTIPLE_VAULTS_PROMO);
            BusinessVaultsPromoPresenter.this.getViewState().r5();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38454a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BusinessVaultsPromoPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38454a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().c6(Avo.UpgradeButtonLocation.MULTIPLE_VAULTS_PROMO);
            BusinessVaultsPromoPresenter.this.getViewState().Oe();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public /* synthetic */ BusinessVaultsPromoPresenter(com.server.auditor.ssh.client.app.a aVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? com.server.auditor.ssh.client.app.a.N() : aVar);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        getViewState().a();
        com.server.auditor.ssh.client.utils.analytics.a.y().D2();
        if (this.f38449a.j()) {
            getViewState().b3();
        } else {
            getViewState().Mb();
        }
    }

    public final void q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void r2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void s2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public BusinessVaultsPromoPresenter(com.server.auditor.ssh.client.app.a aVar) {
        t.f(aVar, "termiusStorage");
        this.f38449a = aVar;
    }
}

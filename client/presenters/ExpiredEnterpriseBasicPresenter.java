package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.u0;
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
public final class ExpiredEnterpriseBasicPresenter extends MvpPresenter<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35544a = com.server.auditor.ssh.client.utils.analytics.a.y();

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35545a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ExpiredEnterpriseBasicPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35545a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredEnterpriseBasicPresenter.this.getViewState().ie();
            ExpiredEnterpriseBasicPresenter.this.f35544a.f2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35547a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, e eVar) {
            super(2, eVar);
            this.f35549c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ExpiredEnterpriseBasicPresenter.this.new b(this.f35549c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35547a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredEnterpriseBasicPresenter.this.getViewState().i1(this.f35549c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35550a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ExpiredEnterpriseBasicPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredEnterpriseBasicPresenter.this.getViewState().a();
            ExpiredEnterpriseBasicPresenter.this.f35544a.i2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35552a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ExpiredEnterpriseBasicPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredEnterpriseBasicPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void r2() {
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void t2(String str) {
        t.f(str, "url");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void v2() {
    }
}

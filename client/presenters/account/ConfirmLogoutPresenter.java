package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.h;
import hg.b2;
import il.e;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfirmLogoutPresenter extends MvpPresenter<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36372a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f36373b = new e(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ri.h f36374c = b2.f52944a.z1();

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36375a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ConfirmLogoutPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36377a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36377a;
            if (i10 == 0) {
                x.b(obj);
                if (ConfirmLogoutPresenter.this.f36373b.a()) {
                    ConfirmLogoutPresenter.this.getViewState().e7();
                    return m0.f82633a;
                }
                ConfirmLogoutPresenter.this.getViewState().d();
                ri.h hVar = ConfirmLogoutPresenter.this.f36374c;
                this.f36377a = 1;
                if (hVar.d(false, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            ConfirmLogoutPresenter.this.getViewState().e();
            ConfirmLogoutPresenter.this.getViewState().h0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36379a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ConfirmLogoutPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36379a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ConfirmLogoutPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f36372a.N2();
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}

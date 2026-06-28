package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.n;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class LogoutConfirmationPresenter extends MvpPresenter<n> {

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36446a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return LogoutConfirmationPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36446a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            LogoutConfirmationPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36448a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return LogoutConfirmationPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36448a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            LogoutConfirmationPresenter.this.getViewState().Zb();
            LogoutConfirmationPresenter.this.getViewState().ye();
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
        getViewState().a();
    }

    public final void q2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

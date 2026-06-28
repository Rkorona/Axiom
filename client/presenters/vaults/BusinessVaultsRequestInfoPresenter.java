package com.server.auditor.ssh.client.presenters.vaults;

import com.server.auditor.ssh.client.contracts.w;
import hg.b2;
import il.f;
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
public final class BusinessVaultsRequestInfoPresenter extends MvpPresenter<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.interactors.b f38456a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38457a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BusinessVaultsRequestInfoPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38457a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BusinessVaultsRequestInfoPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38459a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BusinessVaultsRequestInfoPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38459a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.interactors.b bVar = BusinessVaultsRequestInfoPresenter.this.f38456a;
                this.f38459a = 1;
                if (bVar.b(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BusinessVaultsRequestInfoPresenter() {
        b2 b2Var = b2.f52944a;
        this.f38456a = new com.server.auditor.ssh.client.interactors.b(new f(b2Var.O1(), b2Var.B1()));
    }

    private final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        getViewState().a();
        s2();
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }
}

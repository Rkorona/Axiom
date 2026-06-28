package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.f3;
import com.server.auditor.ssh.client.interactors.r;
import hg.b2;
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
public final class UpdateInfoPresenter extends MvpPresenter<f3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f36230a = b2.f52944a.n1();

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UpdateInfoPresenter f36233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, UpdateInfoPresenter updateInfoPresenter, e eVar) {
            super(2, eVar);
            this.f36232b = i10;
            this.f36233c = updateInfoPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f36232b, this.f36233c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36231a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f36232b == 1001) {
                this.f36233c.getViewState().j2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36234a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return UpdateInfoPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36234a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UpdateInfoPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36236a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return UpdateInfoPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36236a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (UpdateInfoPresenter.this.f36230a.b()) {
                UpdateInfoPresenter.this.getViewState().Z3();
            } else {
                UpdateInfoPresenter.this.getViewState().a4();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36238a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return UpdateInfoPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36238a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            UpdateInfoPresenter.this.getViewState().q1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void r2(int i10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(i10, this, null), 3, null);
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}

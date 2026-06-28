package com.server.auditor.ssh.client.help;

import com.server.auditor.ssh.client.database.Column;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductBoardWebViewPresenter extends MvpPresenter<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27024a;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27025a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProductBoardWebViewPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27025a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProductBoardWebViewPresenter.this.getViewState().Re(false);
            ProductBoardWebViewPresenter.this.getViewState().ra(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27027a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ProductBoardWebViewPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f27027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ProductBoardWebViewPresenter.this.getViewState().Re(false);
            ProductBoardWebViewPresenter.this.getViewState().ra(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ProductBoardWebViewPresenter(String str) {
        ju.t.f(str, Column.ADDRESS);
        this.f27024a = str;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        getViewState().ra(false);
        getViewState().Re(true);
        getViewState().e9(this.f27024a);
    }

    public final void q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void r2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

package com.server.auditor.ssh.client.presenters.backupandsync;

import com.server.auditor.ssh.client.contracts.j;
import hg.b2;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class BackUpAndSyncSecureSyncSetupScreenPresenter extends MvpPresenter<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37098a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f37099b = com.server.auditor.ssh.client.app.a.N();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hj.c f37100c = new hj.c(b2.f52944a.y1());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37101d = true;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37102a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37102a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().n6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37104a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BackUpAndSyncSecureSyncSetupScreenPresenter f37108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, BackUpAndSyncSecureSyncSetupScreenPresenter backUpAndSyncSecureSyncSetupScreenPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37107b = z10;
            this.f37108c = backUpAndSyncSecureSyncSetupScreenPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f37107b, this.f37108c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37106a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f37107b) {
                this.f37108c.getViewState().n6();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37109a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreenPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37109a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37098a.w0(BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37101d);
            if (!BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37099b.r0()) {
                BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().p6(BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37101d);
            } else if (BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37099b.u0() && BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37100c.f()) {
                BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().Nd();
            } else {
                BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().o();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37111a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37113c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreenPresenter.this.new e(this.f37113c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37111a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37101d = this.f37113c;
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().re(!BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37101d);
            BackUpAndSyncSecureSyncSetupScreenPresenter.this.getViewState().h8(!BackUpAndSyncSecureSyncSetupScreenPresenter.this.f37101d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public final void A2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void B2(boolean z10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(z10, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void attachView(j jVar) {
        super.attachView(jVar);
        getViewState().H9(this.f37101d);
    }

    public final void w2() {
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void y2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void z2(boolean z10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(z10, this, null), 3, null);
    }
}

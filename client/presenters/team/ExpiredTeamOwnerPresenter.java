package com.server.auditor.ssh.client.presenters.team;

import com.server.auditor.ssh.client.contracts.y0;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class ExpiredTeamOwnerPresenter extends MvpPresenter<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38117a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38118b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExpiredTeamOwnerPresenter f38121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, ExpiredTeamOwnerPresenter expiredTeamOwnerPresenter, zt.e eVar) {
            super(2, eVar);
            this.f38120b = z10;
            this.f38121c = expiredTeamOwnerPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f38120b, this.f38121c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38119a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f38120b) {
                this.f38121c.getViewState().f();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38122a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f38124c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerPresenter.this.new b(this.f38124c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38122a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamOwnerPresenter.this.getViewState().i1(this.f38124c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38125a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38125a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamOwnerPresenter.this.getViewState().q();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38127a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38127a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamOwnerPresenter.this.f38117a.k2();
            ExpiredTeamOwnerPresenter.this.getViewState().a0(ExpiredTeamOwnerPresenter.this.f38118b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38129a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ExpiredTeamOwnerPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38129a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ExpiredTeamOwnerPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ExpiredTeamOwnerPresenter() {
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        this.f38118b = apiKey != null ? apiKey.getUsername() : null;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f38117a.l2();
    }

    public final void s2() {
    }

    public final void t2(boolean z10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(z10, this, null), 3, null);
    }

    public final void u2(String str) {
        t.f(str, "url");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void y2() {
    }
}

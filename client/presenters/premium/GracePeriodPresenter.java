package com.server.auditor.ssh.client.presenters.premium;

import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.contracts.k1;
import com.server.auditor.ssh.client.interactors.s;
import com.server.auditor.ssh.client.models.GracePeriodSubscription;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import hg.d;
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
public final class GracePeriodPresenter extends MvpPresenter<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GracePeriodSubscription f37738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f37739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f37742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0 f37743f;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37744a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return GracePeriodPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37744a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (GracePeriodPresenter.this.f37742e.a() != null) {
                return m0.f82633a;
            }
            GracePeriodPresenter.this.f37742e.e(GracePeriodPresenter.this.f37738a);
            GracePeriodPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37746a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return GracePeriodPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37746a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GracePeriodPresenter.this.f37741d.z2();
            GracePeriodPresenter.this.f37742e.e(GracePeriodPresenter.this.f37738a);
            GracePeriodPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37748a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return GracePeriodPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37748a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            GracePeriodPresenter.this.f37741d.b6();
            GracePeriodPresenter.this.f37742e.e(GracePeriodPresenter.this.f37738a);
            GracePeriodPresenter.this.getViewState().df(GracePeriodPresenter.this.f37740c);
            GracePeriodPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public GracePeriodPresenter(GracePeriodSubscription gracePeriodSubscription) {
        t.f(gracePeriodSubscription, "gracePeriodSubscription");
        this.f37738a = gracePeriodSubscription;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f37739b = aVarN;
        ApiKey apiKey = aVarN.getApiKey();
        this.f37740c = apiKey != null ? apiKey.getUsername() : null;
        this.f37741d = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarN, "termiusStorage");
        d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.f37742e = new s(aVarN, dVarM);
        k0 k0VarD = aVarN.D();
        t.e(k0VarD, "getBulkAccountResult(...)");
        this.f37743f = k0VarD;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f37741d.y2();
    }

    public final f0 u2() {
        return this.f37743f;
    }

    public final void v2() {
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void y2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}

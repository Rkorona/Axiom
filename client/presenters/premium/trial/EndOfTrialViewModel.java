package com.server.auditor.ssh.client.presenters.premium.trial;

import androidx.lifecycle.f0;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k0;
import hg.b2;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class EndOfTrialViewModel extends i1 {
    public static final int $stable = 8;
    private final k0 subscriptionStatus = new k0();
    private final hj.c expiredSubscriptionTypeInteractor = new hj.c(b2.f52944a.y1());

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.presenters.premium.trial.EndOfTrialViewModel$a$a, reason: collision with other inner class name */
        public static final class C0579a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0579a f37756a = new C0579a();

            private C0579a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f37757a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37758a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EndOfTrialViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37758a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialViewModel.this.subscriptionStatus.n(a.b.f37757a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37760a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EndOfTrialViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37760a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (EndOfTrialViewModel.this.expiredSubscriptionTypeInteractor.f()) {
                EndOfTrialViewModel.this.subscriptionStatus.n(a.C0579a.f37756a);
            } else {
                EndOfTrialViewModel.this.subscriptionStatus.n(a.b.f37757a);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public final f0 getBulkAccountLiveData() {
        k0 k0VarD = com.server.auditor.ssh.client.app.a.N().D();
        t.e(k0VarD, "getBulkAccountResult(...)");
        return k0VarD;
    }

    public final f0 getSubscriptionStatusLiveData() {
        return this.subscriptionStatus;
    }

    public final void onFetchAccountDetailsFailed() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onFetchAccountDetailsSuccess() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}

package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.d;
import yu.g;
import zn.c;
import zt.e;
import zu.f;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class ProSuccessfullyDeactivatedScreenViewModel extends i1 {
    public static final int $stable = 8;
    private final d _screenActionFlow;
    private final f screenActionFlow;
    private final hj.f trialPromoShowedInteractor;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39696a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39696a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39697a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ProSuccessfullyDeactivatedScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39697a;
            if (i10 == 0) {
                x.b(obj);
                ProSuccessfullyDeactivatedScreenViewModel.this.trialPromoShowedInteractor.b();
                hg.f.p().Y().updateSshIdData();
                d dVar = ProSuccessfullyDeactivatedScreenViewModel.this._screenActionFlow;
                c.a aVar = c.a.f88044a;
                this.f39697a = 1;
                if (dVar.b(aVar, this) == objF) {
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

    public ProSuccessfullyDeactivatedScreenViewModel() {
        d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.trialPromoShowedInteractor = new hj.f(dVarM);
    }

    public final f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onDoneButtonClicked() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }
}

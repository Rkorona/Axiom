package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import bo.z;
import cq.a;
import iu.p;
import java.util.Calendar;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.d;
import yu.g;
import zn.e;
import zt.e;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class ProTrialSuccessfullyExtendedViewModel extends i1 {
    public static final int $stable = 8;
    private final d _screenActionFlow;
    private final w _uiState;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final Calendar extendedUntilDate;
    private final f screenActionFlow;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39715a;

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
            if (this.f39715a != 0) {
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
        int f39716a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ProTrialSuccessfullyExtendedViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39716a;
            if (i10 == 0) {
                x.b(obj);
                hg.f.p().Y().updateSshIdData();
                d dVar = ProTrialSuccessfullyExtendedViewModel.this._screenActionFlow;
                e.a aVar = e.a.f88049a;
                this.f39716a = 1;
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
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ProTrialSuccessfullyExtendedViewModel(Calendar calendar) {
        t.f(calendar, "extendedUntilDate");
        this.extendedUntilDate = calendar;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.avoAnalytics = aVarY;
        w wVarA = zu.m0.a(new z(calculateExtendedByDays(calendar), calendar));
        this._uiState = wVarA;
        this.uiState = h.b(wVarA);
        d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        aVarY.H3();
    }

    private final int calculateExtendedByDays(Calendar calendar) {
        a.C0674a c0674a = cq.a.f47027a;
        Calendar calendar2 = Calendar.getInstance();
        t.e(calendar2, "getInstance(...)");
        return (int) c0674a.a(calendar, calendar2, 5);
    }

    public final f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final k0 getUiState() {
        return this.uiState;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onDoneButtonClicked() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }
}

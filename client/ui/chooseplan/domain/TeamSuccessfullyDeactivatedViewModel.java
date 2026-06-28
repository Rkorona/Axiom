package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import bo.n0;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.k;
import yu.d;
import yu.g;
import zn.i;
import zt.e;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamSuccessfullyDeactivatedViewModel extends i1 {
    public static final int $stable = 8;
    private final d _screenActionFlow;
    private final w _uiState;
    private final f screenActionFlow;
    private final EndOfTeamTrialTargetAction teamTrialTargetAction;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final hj.f trialPromoShowedInteractor;
    private final k0 uiState;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39746a;

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
            if (this.f39746a != 0) {
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
        int f39747a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamSuccessfullyDeactivatedViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39747a;
            if (i10 == 0) {
                x.b(obj);
                TeamSuccessfullyDeactivatedViewModel.this.markTrialPromoAsShowedIfNeeded();
                hg.f.p().Y().updateSshIdData();
                d dVar = TeamSuccessfullyDeactivatedViewModel.this._screenActionFlow;
                i.a aVar = i.a.f88056a;
                this.f39747a = 1;
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

    public TeamSuccessfullyDeactivatedViewModel(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        this.teamTrialTargetAction = endOfTeamTrialTargetAction;
        w wVarA = zu.m0.a(new n0(endOfTeamTrialTargetAction));
        this._uiState = wVarA;
        this.uiState = h.b(wVarA);
        d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.trialPromoShowedInteractor = new hj.f(dVarM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTrialPromoAsShowedIfNeeded() {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.teamTrialTargetAction;
        if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
            this.trialPromoShowedInteractor.b();
        } else if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE) && !(endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) && !(endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
            throw new s();
        }
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

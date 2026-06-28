package com.server.auditor.ssh.client.presenters.team;

import com.server.auditor.ssh.client.contracts.teamtrial.d;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoveTeamMembersConfirmationScreenPresenter extends MvpPresenter<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EndOfTeamTrialTargetAction f38131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38133c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38134a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return RemoveTeamMembersConfirmationScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38134a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RemoveTeamMembersConfirmationScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38136a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return RemoveTeamMembersConfirmationScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38136a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RemoveTeamMembersConfirmationScreenPresenter.this.f38133c.I0();
            RemoveTeamMembersConfirmationScreenPresenter.this.getViewState().a0(RemoveTeamMembersConfirmationScreenPresenter.this.f38132b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38138a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return RemoveTeamMembersConfirmationScreenPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38138a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RemoveTeamMembersConfirmationScreenPresenter.this.x2();
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = RemoveTeamMembersConfirmationScreenPresenter.this.f38131a;
            if ((endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) || (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
                RemoveTeamMembersConfirmationScreenPresenter.this.getViewState().n2(RemoveTeamMembersConfirmationScreenPresenter.this.f38131a);
            } else {
                if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE) && !t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                    throw new s();
                }
                RemoveTeamMembersConfirmationScreenPresenter.this.getViewState().W(RemoveTeamMembersConfirmationScreenPresenter.this.f38131a);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public RemoveTeamMembersConfirmationScreenPresenter(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        this.f38131a = endOfTeamTrialTargetAction;
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        this.f38132b = apiKey != null ? apiKey.getUsername() : null;
        this.f38133c = com.server.auditor.ssh.client.utils.analytics.a.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2() {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.f38131a;
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) {
            this.f38133c.C0();
            return;
        }
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan) {
            this.f38133c.F0();
        } else if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE)) {
            this.f38133c.t5();
        } else {
            if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                throw new s();
            }
            this.f38133c.O1(false);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().D1(this.f38131a);
        this.f38133c.w5();
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}

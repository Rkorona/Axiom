package com.server.auditor.ssh.client.presenters.teamtrial;

import com.server.auditor.ssh.client.contracts.teamtrial.f;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import pl.k;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.x0;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamTrialPromoExtensionScreenPresenter extends MvpPresenter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EndOfTeamTrialTargetAction f38254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f38256d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38257a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreenPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38257a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamTrialPromoExtensionScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38259a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38259a;
            if (i10 == 0) {
                x.b(obj);
                TeamTrialPromoExtensionScreenPresenter.this.A2();
                k kVar = TeamTrialPromoExtensionScreenPresenter.this.f38256d;
                this.f38259a = 1;
                obj = kVar.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            boolean z10 = ((Number) obj).intValue() > 0;
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = TeamTrialPromoExtensionScreenPresenter.this.f38254b;
            if ((endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) || (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
                if (z10) {
                    TeamTrialPromoExtensionScreenPresenter.this.getViewState().A0(TeamTrialPromoExtensionScreenPresenter.this.f38254b);
                } else {
                    TeamTrialPromoExtensionScreenPresenter.this.getViewState().n2(TeamTrialPromoExtensionScreenPresenter.this.f38254b);
                }
            } else {
                if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE) && !t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                    throw new s();
                }
                if (z10) {
                    TeamTrialPromoExtensionScreenPresenter.this.getViewState().A0(TeamTrialPromoExtensionScreenPresenter.this.f38254b);
                } else {
                    TeamTrialPromoExtensionScreenPresenter.this.getViewState().W(TeamTrialPromoExtensionScreenPresenter.this.f38254b);
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38261a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreenPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38261a;
            if (i10 == 0) {
                x.b(obj);
                k kVar = TeamTrialPromoExtensionScreenPresenter.this.f38256d;
                this.f38261a = 1;
                obj = kVar.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            TeamTrialPromoExtensionScreenPresenter.this.f38255c.D5(((Number) obj).intValue());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38263a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreenPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            TeamTrialPromoExtensionScreenPresenter.this.f38255c.n2();
            TeamTrialPromoExtensionScreenPresenter.this.getViewState().B6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38265a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialPromoExtensionScreenPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (TeamTrialPromoExtensionScreenPresenter.this.f38253a) {
                return m0.f82633a;
            }
            TeamTrialPromoExtensionScreenPresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamTrialPromoExtensionScreenPresenter(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        this.f38253a = z10;
        this.f38254b = endOfTeamTrialTargetAction;
        this.f38255c = com.server.auditor.ssh.client.utils.analytics.a.y();
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        this.f38256d = new k(cVarQ, x0.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2() {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.f38254b;
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) {
            this.f38255c.D0();
            return;
        }
        if (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan) {
            this.f38255c.G0();
        } else if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE)) {
            this.f38255c.u5();
        } else {
            if (!t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
                throw new s();
            }
            this.f38255c.Q1(false);
        }
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().D1(this.f38254b);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void v2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void w2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void x2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void z2() {
    }
}

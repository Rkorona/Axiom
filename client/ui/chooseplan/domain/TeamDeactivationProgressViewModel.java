package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.interactors.h;
import com.server.auditor.ssh.client.interactors.i;
import com.server.auditor.ssh.client.interactors.j;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import hg.b2;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import pl.q;
import to.c1;
import to.o;
import ut.m0;
import ut.s;
import ut.x;
import vl.b;
import wu.i0;
import wu.j1;
import yg.a;
import yg.d;
import yu.g;
import zu.f;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamDeactivationProgressViewModel extends i1 {
    private static final String NOT_POSSIBLE_TO_BUY_EXCEPTION_MESSAGE = "This [TeamDeactivationProgressScreen] shouldn't be shown for these [EndOfTeamTrialTargetAction] types. Check your code!";
    private final yu.d _screenActionFlow;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final h createRemoteAnnotationCryptorUseCase;
    private final i createRemoteCryptorUseCase;
    private final j createTeamAnnotationCryptorsUseCase;
    private final hj.a deactivateTeamTrialInteractor;
    private final SyncRestApiClientFactory restApiClientFactory;
    private final f screenActionFlow;
    private final SyncServiceHelper syncServiceHelper;
    private final EndOfTeamTrialTargetAction teamTrialTargetAction;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final q vaultsKeyringRepository;
    public static final b Companion = new b(null);
    public static final int $stable = 8;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39738a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamDeactivationProgressViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39738a;
            if (i10 == 0) {
                x.b(obj);
                TeamDeactivationProgressViewModel teamDeactivationProgressViewModel = TeamDeactivationProgressViewModel.this;
                this.f39738a = 1;
                if (teamDeactivationProgressViewModel.startDeactivateTeamTrialPreconditionProcess(this) == objF) {
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39740a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39740a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39741a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamDeactivationProgressViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39741a;
            if (i10 == 0) {
                x.b(obj);
                TeamDeactivationProgressViewModel teamDeactivationProgressViewModel = TeamDeactivationProgressViewModel.this;
                this.f39741a = 1;
                if (teamDeactivationProgressViewModel.startDeactivateTeamTrialPreconditionProcess(this) == objF) {
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39743a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39745c;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39743a = obj;
            this.f39745c |= RtlSpacingHelper.UNDEFINED;
            return TeamDeactivationProgressViewModel.this.performSubscriptionDeactivation(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TeamDeactivationProgressViewModel(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        t.f(endOfTeamTrialTargetAction, "teamTrialTargetAction");
        this.teamTrialTargetAction = endOfTeamTrialTargetAction;
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = zu.h.M(dVarB);
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.avoAnalytics = aVarY;
        this.syncServiceHelper = hg.f.p().Y();
        b2 b2Var = b2.f52944a;
        SyncRestApiClientFactory syncRestApiClientFactoryO1 = b2Var.O1();
        this.restApiClientFactory = syncRestApiClientFactoryO1;
        t.e(aVarN, "termiusStorage");
        i iVar = new i(aVarN);
        this.createRemoteCryptorUseCase = iVar;
        h hVar = new h();
        this.createRemoteAnnotationCryptorUseCase = hVar;
        t.e(aVarN, "termiusStorage");
        j jVar = new j(aVarN);
        this.createTeamAnnotationCryptorsUseCase = jVar;
        j1 j1VarB1 = b2Var.B1();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        k0 k0VarP = aVarN.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        t.e(aVarN, "termiusStorage");
        q qVar = new q(j1VarB1, dVarM, k0VarP, aVarN, new pl.h(null, 1, 0 == true ? 1 : 0), new pp.b(b2Var.v1()), new d.a(), new a.C1401a());
        this.vaultsKeyringRepository = qVar;
        t.e(aVarN, "termiusStorage");
        t.e(aVarY, "avoAnalytics");
        ho.e eVar = new ho.e(syncRestApiClientFactoryO1, qVar);
        pl.f fVar = new pl.f(syncRestApiClientFactoryO1, b2Var.B1());
        pl.c cVar = new pl.c(b2Var.P1(), b2Var.B1());
        ao.e eVar2 = new ao.e();
        wn.m mVar = new wn.m(b2Var.y1());
        hg.d dVarM2 = aVarN.M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        pp.k kVar = new pp.k(new pp.f(new iq.b(new wn.j(dVarM2)), b2Var.Z0()));
        o oVar = new o(b.a.b(vl.b.f83635b, null, 1, null), new c1());
        vl.g gVarB = vl.g.f83702b.b();
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM3 = aVarN.M();
        t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
        this.deactivateTeamTrialInteractor = new hj.a(aVarN, aVarY, eVar, fVar, cVar, iVar, hVar, jVar, eVar2, mVar, kVar, oVar, gVarB, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM3));
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new a(null), 3, null);
    }

    private final DowngradeToPlanType.DowngradeToIndividual getDowngradeToPlanTypeValue() {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.teamTrialTargetAction;
        if ((endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) || (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
            throw new IllegalStateException("[Developer error] Not possible case, check your code!");
        }
        if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE) || t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE)) {
            return DowngradeToPlanType.DowngradeToIndividual.INSTANCE;
        }
        throw new s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r7.b(r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r7.b(r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performSubscriptionDeactivation(com.server.auditor.ssh.client.models.DowngradeToPlanType r7, zt.e<? super ut.m0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel.e
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel$e r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel.e) r0
            int r1 = r0.f39745c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39745c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel$e r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39743a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39745c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ut.x.b(r8)
            goto L65
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ut.x.b(r8)
            goto L7f
        L3b:
            ut.x.b(r8)
            goto L4d
        L3f:
            ut.x.b(r8)
            hj.a r8 = r6.deactivateTeamTrialInteractor
            r0.f39745c = r5
            java.lang.Object r8 = r8.j(r7, r0)
            if (r8 != r1) goto L4d
            goto L7e
        L4d:
            hj.a$b r8 = (hj.a.b) r8
            boolean r7 = r8 instanceof hj.a.b.e
            if (r7 != 0) goto L68
            boolean r7 = r8 instanceof hj.a.b.C0805a
            if (r7 == 0) goto L58
            goto L68
        L58:
            yu.d r7 = r6._screenActionFlow
            zn.h$a r8 = zn.h.a.f88054a
            r0.f39745c = r3
            java.lang.Object r7 = r7.b(r8, r0)
            if (r7 != r1) goto L65
            goto L7e
        L65:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L68:
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r7 = r6.syncServiceHelper
            r7.startProfileAndBulkSync()
            yu.d r7 = r6._screenActionFlow
            zn.h$b r8 = new zn.h$b
            com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction r2 = r6.teamTrialTargetAction
            r8.<init>(r2)
            r0.f39745c = r4
            java.lang.Object r7 = r7.b(r8, r0)
            if (r7 != r1) goto L7f
        L7e:
            return r1
        L7f:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.TeamDeactivationProgressViewModel.performSubscriptionDeactivation(com.server.auditor.ssh.client.models.DowngradeToPlanType, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startDeactivateTeamTrialPreconditionProcess(zt.e<? super m0> eVar) {
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = this.teamTrialTargetAction;
        if (t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToStarterPlan.INSTANCE) || t.b(endOfTeamTrialTargetAction, EndOfTeamTrialTargetAction.DowngradeToProPlan.INSTANCE)) {
            Object objPerformSubscriptionDeactivation = performSubscriptionDeactivation(getDowngradeToPlanTypeValue(), eVar);
            return objPerformSubscriptionDeactivation == au.b.f() ? objPerformSubscriptionDeactivation : m0.f82633a;
        }
        if ((endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProMonthlyPlan) || (endOfTeamTrialTargetAction instanceof EndOfTeamTrialTargetAction.BuyProYearlyPlan)) {
            throw new IllegalStateException(NOT_POSSIBLE_TO_BUY_EXCEPTION_MESSAGE);
        }
        throw new s();
    }

    public final f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onRetryLastRequest() {
        wu.k.d(androidx.lifecycle.j1.a(this), null, null, new d(null), 3, null);
    }
}

package com.server.auditor.ssh.client.presenters.team;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.contracts.c1;
import com.server.auditor.ssh.client.interactors.h;
import com.server.auditor.ssh.client.interactors.i;
import com.server.auditor.ssh.client.interactors.j;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import hg.b2;
import hg.f;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import pl.q;
import to.o;
import ut.m0;
import ut.x;
import vl.b;
import vl.g;
import wu.i0;
import wu.j1;
import wu.s0;
import yg.a;
import yg.d;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamTrialOwnerAwaitingDowngradePresenter extends MvpPresenter<c1> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f38227y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f38228z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DowngradeToPlanType f38229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SyncServiceHelper f38232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SyncRestApiClientFactory f38233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f38234f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f38235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j f38236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final q f38237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hj.a f38238x;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38239a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38239a;
            if (i10 == 0) {
                x.b(obj);
                TeamTrialOwnerAwaitingDowngradePresenter teamTrialOwnerAwaitingDowngradePresenter = TeamTrialOwnerAwaitingDowngradePresenter.this;
                this.f38239a = 1;
                if (teamTrialOwnerAwaitingDowngradePresenter.u2(this) == objF) {
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

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38241a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38241a;
            if (i10 == 0) {
                x.b(obj);
                this.f38241a = 1;
                if (s0.b(250L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            TeamTrialOwnerAwaitingDowngradePresenter.this.getViewState().f();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38243a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamTrialOwnerAwaitingDowngradePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38243a;
            if (i10 == 0) {
                x.b(obj);
                TeamTrialOwnerAwaitingDowngradePresenter teamTrialOwnerAwaitingDowngradePresenter = TeamTrialOwnerAwaitingDowngradePresenter.this;
                this.f38243a = 1;
                if (teamTrialOwnerAwaitingDowngradePresenter.u2(this) == objF) {
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
        /* synthetic */ Object f38245a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38247c;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38245a = obj;
            this.f38247c |= RtlSpacingHelper.UNDEFINED;
            return TeamTrialOwnerAwaitingDowngradePresenter.this.u2(this);
        }
    }

    public TeamTrialOwnerAwaitingDowngradePresenter(DowngradeToPlanType downgradeToPlanType) {
        t.f(downgradeToPlanType, "downgradeToPlanType");
        this.f38229a = downgradeToPlanType;
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f38230b = aVarN;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f38231c = aVarY;
        this.f38232d = f.p().Y();
        b2 b2Var = b2.f52944a;
        SyncRestApiClientFactory syncRestApiClientFactoryO1 = b2Var.O1();
        this.f38233e = syncRestApiClientFactoryO1;
        t.e(aVarN, "termiusStorage");
        i iVar = new i(aVarN);
        this.f38234f = iVar;
        h hVar = new h();
        this.f38235u = hVar;
        t.e(aVarN, "termiusStorage");
        j jVar = new j(aVarN);
        this.f38236v = jVar;
        j1 j1VarB1 = b2Var.B1();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        k0 k0VarP = aVarN.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        t.e(aVarN, "termiusStorage");
        q qVar = new q(j1VarB1, dVarM, k0VarP, aVarN, new pl.h(null, 1, null), new pp.b(b2Var.v1()), new d.a(), new a.C1401a());
        this.f38237w = qVar;
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
        o oVar = new o(b.a.b(vl.b.f83635b, null, 1, null), new to.c1());
        g gVarB = g.f83702b.b();
        mv.b bVarS1 = b2Var.s1();
        hg.d dVarM3 = aVarN.M();
        t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
        this.f38238x = new hj.a(aVarN, aVarY, eVar, fVar, cVar, iVar, hVar, jVar, eVar2, mVar, kVar, oVar, gVarB, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u2(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter.e
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter$e r0 = (com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter.e) r0
            int r1 = r0.f38247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38247c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter$e r0 = new com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f38245a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38247c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            hj.a r5 = r4.f38238x
            com.server.auditor.ssh.client.models.DowngradeToPlanType r2 = r4.f38229a
            r0.f38247c = r3
            java.lang.Object r5 = r5.j(r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            hj.a$b r5 = (hj.a.b) r5
            boolean r0 = r5 instanceof hj.a.b.e
            if (r0 != 0) goto L56
            boolean r5 = r5 instanceof hj.a.b.C0805a
            if (r5 == 0) goto L4c
            goto L56
        L4c:
            moxy.MvpView r5 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.c1 r5 = (com.server.auditor.ssh.client.contracts.c1) r5
            r5.q0()
            goto L64
        L56:
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r5 = r4.f38232d
            r5.startProfileAndBulkSync()
            moxy.MvpView r5 = r4.getViewState()
            com.server.auditor.ssh.client.contracts.c1 r5 = (com.server.auditor.ssh.client.contracts.c1) r5
            r5.Nb()
        L64:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.team.TeamTrialOwnerAwaitingDowngradePresenter.u2(zt.e):java.lang.Object");
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f38231c.G5();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void r2() {
    }

    public final void s2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void t2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}

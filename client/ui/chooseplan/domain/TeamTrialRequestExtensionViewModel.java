package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import cq.a;
import hg.b2;
import iu.p;
import java.util.Calendar;
import java.util.Date;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import tp.d1;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.g;
import zn.j;
import zt.e;
import zu.f;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamTrialRequestExtensionViewModel extends i1 {
    public static final int $stable = 8;
    private final yu.d _screenActionFlow;
    private final hj.d requestTeamTrialExtensionInteractor;
    private final f screenActionFlow;
    private final SyncServiceHelper syncServiceHelper;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39749a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamTrialRequestExtensionViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39749a;
            if (i10 == 0) {
                x.b(obj);
                TeamTrialRequestExtensionViewModel teamTrialRequestExtensionViewModel = TeamTrialRequestExtensionViewModel.this;
                this.f39749a = 1;
                if (teamTrialRequestExtensionViewModel.requestTrialExtension(this) == objF) {
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39751a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39751a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39752a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return TeamTrialRequestExtensionViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39752a;
            if (i10 == 0) {
                x.b(obj);
                TeamTrialRequestExtensionViewModel teamTrialRequestExtensionViewModel = TeamTrialRequestExtensionViewModel.this;
                this.f39752a = 1;
                if (teamTrialRequestExtensionViewModel.requestTrialExtension(this) == objF) {
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39756c;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39754a = obj;
            this.f39756c |= RtlSpacingHelper.UNDEFINED;
            return TeamTrialRequestExtensionViewModel.this.requestTrialExtension(this);
        }
    }

    public TeamTrialRequestExtensionViewModel() {
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        this.syncServiceHelper = hg.f.p().Y();
        this.requestTeamTrialExtensionInteractor = new hj.d(new pl.m(b2.f52944a.O1()));
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onRequestTeamTrialExtensionNotAllowed(e<? super m0> eVar) {
        Object objB = this._screenActionFlow.b(j.b.f88058a, eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onRequestTeamTrialExtensionSuccess(String str, e<? super m0> eVar) {
        Date dateE = d1.e(str);
        if (dateE == null) {
            dateE = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateE);
        this.syncServiceHelper.startProfileAndBulkSync();
        a.C0674a c0674a = cq.a.f47027a;
        t.c(calendar);
        Calendar calendar2 = Calendar.getInstance();
        t.e(calendar2, "getInstance(...)");
        Object objB = this._screenActionFlow.b(new j.c((int) c0674a.a(calendar, calendar2, 5), calendar), eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onRequestTrialExtensionError(e<? super m0> eVar) {
        Object objB = this._screenActionFlow.b(j.a.f88057a, eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (onRequestTeamTrialExtensionSuccess(r8, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (onRequestTeamTrialExtensionNotAllowed(r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (onRequestTrialExtensionError(r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestTrialExtension(zt.e<? super ut.m0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel.d
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel$d r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel.d) r0
            int r1 = r0.f39756c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39756c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel$d r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39754a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39756c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            ut.x.b(r8)
            goto L9d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            ut.x.b(r8)
            goto L7e
        L3f:
            ut.x.b(r8)
            goto L6a
        L43:
            ut.x.b(r8)
            goto L55
        L47:
            ut.x.b(r8)
            hj.d r8 = r7.requestTeamTrialExtensionInteractor
            r0.f39756c = r6
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L55
            goto L9c
        L55:
            hj.d$a r8 = (hj.d.a) r8
            boolean r2 = r8 instanceof hj.d.a.C0808d
            if (r2 == 0) goto L6d
            hj.d$a$d r8 = (hj.d.a.C0808d) r8
            java.lang.String r8 = r8.a()
            r0.f39756c = r5
            java.lang.Object r8 = r7.onRequestTeamTrialExtensionSuccess(r8, r0)
            if (r8 != r1) goto L6a
            goto L9c
        L6a:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        L6d:
            hj.d$a$b r2 = hj.d.a.b.f53131a
            boolean r2 = ju.t.b(r8, r2)
            if (r2 == 0) goto L81
            r0.f39756c = r4
            java.lang.Object r8 = r7.onRequestTeamTrialExtensionNotAllowed(r0)
            if (r8 != r1) goto L7e
            goto L9c
        L7e:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        L81:
            boolean r2 = r8 instanceof hj.d.a.c
            if (r2 != 0) goto L94
            hj.d$a$a r2 = hj.d.a.C0807a.f53130a
            boolean r8 = ju.t.b(r8, r2)
            if (r8 == 0) goto L8e
            goto L94
        L8e:
            ut.s r8 = new ut.s
            r8.<init>()
            throw r8
        L94:
            r0.f39756c = r3
            java.lang.Object r8 = r7.onRequestTrialExtensionError(r0)
            if (r8 != r1) goto L9d
        L9c:
            return r1
        L9d:
            ut.m0 r8 = ut.m0.f82633a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.TeamTrialRequestExtensionViewModel.requestTrialExtension(zt.e):java.lang.Object");
    }

    public final f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onRetryLastRequest() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}

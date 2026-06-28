package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.d;
import yu.g;
import zt.e;
import zu.f;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class ThanksForPurchaseSubscriptionViewModel extends i1 {
    public static final int $stable = 8;
    private final d _screenActionFlow;
    private final f screenActionFlow;
    private final com.server.auditor.ssh.client.app.a termiusStorage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39760a;

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
            if (this.f39760a != 0) {
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
        int f39761a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ThanksForPurchaseSubscriptionViewModel.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r5.b(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            if (r5.b(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r4.f39761a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                ut.x.b(r5)
                goto L5b
            L1b:
                ut.x.b(r5)
                com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.this
                com.server.auditor.ssh.client.app.a r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.access$getTermiusStorage$p(r5)
                boolean r5 = r5.r0()
                if (r5 == 0) goto L46
                hg.f r5 = hg.f.p()
                com.server.auditor.ssh.client.synchronization.SyncServiceHelper r5 = r5.Y()
                r5.updateSshIdData()
                com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.this
                yu.d r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.access$get_screenActionFlow$p(r5)
                zn.l$a r1 = zn.l.a.f88063a
                r4.f39761a = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L5b
                goto L5a
            L46:
                com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.this
                yu.d r5 = com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.access$get_screenActionFlow$p(r5)
                zn.l$b r1 = new zn.l$b
                r3 = 0
                r1.<init>(r3)
                r4.f39761a = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L5b
            L5a:
                return r0
            L5b:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.ThanksForPurchaseSubscriptionViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ThanksForPurchaseSubscriptionViewModel() {
        d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        this.termiusStorage = com.server.auditor.ssh.client.app.a.N();
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

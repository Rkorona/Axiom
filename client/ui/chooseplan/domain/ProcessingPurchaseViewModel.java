package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.g;
import zn.f;
import zt.e;
import zu.f;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessingPurchaseViewModel extends i1 {
    public static final int $stable = 8;
    private final yu.d _screenActionFlow;
    private final com.server.auditor.ssh.client.billing.b googleBillingWrapper;
    private final AcknowledgeSubscriptionInfo purchasedSubscriptionInfo;
    private final f screenActionFlow;
    private final com.server.auditor.ssh.client.app.a termiusStorage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39718a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ProcessingPurchaseViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39718a;
            if (i10 == 0) {
                x.b(obj);
                ProcessingPurchaseViewModel processingPurchaseViewModel = ProcessingPurchaseViewModel.this;
                AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = processingPurchaseViewModel.purchasedSubscriptionInfo;
                this.f39718a = 1;
                if (processingPurchaseViewModel.acknowledgeSubscription(acknowledgeSubscriptionInfo, this) == objF) {
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

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39722c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39720a = obj;
            this.f39722c |= RtlSpacingHelper.UNDEFINED;
            return ProcessingPurchaseViewModel.this.acknowledgeSubscription(null, this);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39723a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39723a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39724a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ProcessingPurchaseViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39724a;
            if (i10 == 0) {
                x.b(obj);
                ProcessingPurchaseViewModel processingPurchaseViewModel = ProcessingPurchaseViewModel.this;
                AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = processingPurchaseViewModel.purchasedSubscriptionInfo;
                this.f39724a = 1;
                if (processingPurchaseViewModel.acknowledgeSubscription(acknowledgeSubscriptionInfo, this) == objF) {
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ProcessingPurchaseViewModel(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
        t.f(acknowledgeSubscriptionInfo, "purchasedSubscriptionInfo");
        this.purchasedSubscriptionInfo = acknowledgeSubscriptionInfo;
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._screenActionFlow = dVarB;
        this.screenActionFlow = h.M(dVarB);
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        com.server.auditor.ssh.client.billing.a aVarL1 = b2Var.l1();
        com.server.auditor.ssh.client.billing.c cVar = new com.server.auditor.ssh.client.billing.c(b2Var.P1(), b2Var.B1());
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        ol.a aVar = new ol.a(dVarM);
        hg.d dVarM2 = aVarN.M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        hj.f fVar = new hj.f(dVarM2);
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.googleBillingWrapper = new com.server.auditor.ssh.client.billing.b(aVarL1, cVar, aVar, fVar, aVarY);
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (onPurchaseAcknowledged(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (onPurchaseNotAcknowledged(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acknowledgeSubscription(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo r7, zt.e<? super ut.m0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel$b r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel.b) r0
            int r1 = r0.f39722c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39722c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel$b r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39720a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39722c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ut.x.b(r8)
            goto L6a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ut.x.b(r8)
            goto L5e
        L3b:
            ut.x.b(r8)
            goto L4d
        L3f:
            ut.x.b(r8)
            com.server.auditor.ssh.client.billing.b r8 = r6.googleBillingWrapper
            r0.f39722c = r5
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L4d
            goto L69
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L61
            r0.f39722c = r4
            java.lang.Object r7 = r6.onPurchaseAcknowledged(r0)
            if (r7 != r1) goto L5e
            goto L69
        L5e:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L61:
            r0.f39722c = r3
            java.lang.Object r7 = r6.onPurchaseNotAcknowledged(r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.ProcessingPurchaseViewModel.acknowledgeSubscription(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPurchaseAcknowledged(e<? super m0> eVar) {
        Object objB = this._screenActionFlow.b(f.b.f88051a, eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPurchaseNotAcknowledged(e<? super m0> eVar) {
        Object objB = this._screenActionFlow.b(f.a.f88050a, eVar);
        return objB == au.b.f() ? objB : m0.f82633a;
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onRetryLastRequest() {
        k.d(j1.a(this), null, null, new d(null), 3, null);
    }
}

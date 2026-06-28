package com.server.auditor.ssh.client.ui.chooseplan.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zn.g;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class RestoringPurchaseViewModel extends i1 {
    public static final int $stable = 8;
    private final yu.d _screenActionFlow;
    private final com.server.auditor.ssh.client.billing.b googleBillingWrapper;
    private final zu.f screenActionFlow;
    private final com.server.auditor.ssh.client.app.a termiusStorage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39726a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RestoringPurchaseViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39726a;
            if (i10 == 0) {
                x.b(obj);
                RestoringPurchaseViewModel restoringPurchaseViewModel = RestoringPurchaseViewModel.this;
                this.f39726a = 1;
                if (restoringPurchaseViewModel.proceedToRestoreSubscription(this) == objF) {
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

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39728a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39728a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39729a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RestoringPurchaseViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39729a;
            if (i10 == 0) {
                x.b(obj);
                RestoringPurchaseViewModel restoringPurchaseViewModel = RestoringPurchaseViewModel.this;
                this.f39729a = 1;
                if (restoringPurchaseViewModel.proceedToRestoreSubscription(this) == objF) {
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39731a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RestoringPurchaseViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39731a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = RestoringPurchaseViewModel.this._screenActionFlow;
                g.a aVar = g.a.f88052a;
                this.f39731a = 1;
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39733a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RestoringPurchaseViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39733a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = RestoringPurchaseViewModel.this._screenActionFlow;
                g.b bVar = g.b.f88053a;
                this.f39733a = 1;
                if (dVar.b(bVar, this) == objF) {
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39735a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39737c;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39735a = obj;
            this.f39737c |= RtlSpacingHelper.UNDEFINED;
            return RestoringPurchaseViewModel.this.proceedToRestoreSubscription(this);
        }
    }

    public RestoringPurchaseViewModel() {
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
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

    private final void onSubscriptionNotRestored() {
        k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    private final void onSubscriptionRestored() {
        k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proceedToRestoreSubscription(zt.e<? super ut.m0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel.f
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel$f r0 = (com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel.f) r0
            int r1 = r0.f39737c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39737c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel$f r0 = new com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f39735a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39737c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            com.server.auditor.ssh.client.billing.b r5 = r4.googleBillingWrapper
            r0.f39737c = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.billing.b$c r5 = (com.server.auditor.ssh.client.billing.b.c) r5
            com.server.auditor.ssh.client.billing.b$c$f r0 = com.server.auditor.ssh.client.billing.b.c.f.f21567a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 == 0) goto L4d
            r4.onSubscriptionRestored()
            goto L7f
        L4d:
            com.server.auditor.ssh.client.billing.b$c$c r0 = com.server.auditor.ssh.client.billing.b.c.C0335c.f21564a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 != 0) goto L7c
            com.server.auditor.ssh.client.billing.b$c$e r0 = com.server.auditor.ssh.client.billing.b.c.e.f21566a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 != 0) goto L7c
            com.server.auditor.ssh.client.billing.b$c$d r0 = com.server.auditor.ssh.client.billing.b.c.d.f21565a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 != 0) goto L7c
            com.server.auditor.ssh.client.billing.b$c$a r0 = com.server.auditor.ssh.client.billing.b.c.a.f21562a
            boolean r0 = ju.t.b(r5, r0)
            if (r0 != 0) goto L7c
            com.server.auditor.ssh.client.billing.b$c$b r0 = com.server.auditor.ssh.client.billing.b.c.C0334b.f21563a
            boolean r5 = ju.t.b(r5, r0)
            if (r5 == 0) goto L76
            goto L7c
        L76:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        L7c:
            r4.onSubscriptionNotRestored()
        L7f:
            ut.m0 r5 = ut.m0.f82633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.chooseplan.domain.RestoringPurchaseViewModel.proceedToRestoreSubscription(zt.e):java.lang.Object");
    }

    public final zu.f getScreenActionFlow() {
        return this.screenActionFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onRetryLastRequest() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}

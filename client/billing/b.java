package com.server.auditor.ssh.client.billing;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.android.billingclient.api.r;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import com.server.auditor.ssh.client.billing.ProSubscriptionType;
import com.server.auditor.ssh.client.billing.a;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import iu.p;
import java.util.Iterator;
import java.util.List;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import tp.c0;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0333b f21549g = new C0333b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21550h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.billing.a f21551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.billing.c f21552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ol.a f21553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hj.f f21554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f21555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f21556f;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.b$a$a, reason: collision with other inner class name */
        public static final class C0331a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0331a f21557a = new C0331a();

            private C0331a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0331a);
            }

            public int hashCode() {
                return 2069084150;
            }

            public String toString() {
                return "AlreadyOwned";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.b$a$b, reason: collision with other inner class name */
        public static final class C0332b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0332b f21558a = new C0332b();

            private C0332b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0332b);
            }

            public int hashCode() {
                return 889274338;
            }

            public String toString() {
                return "Canceled";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f21559a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1615199393;
            }

            public String toString() {
                return "Error";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AcknowledgeSubscriptionInfo f21560a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
                super(null);
                t.f(acknowledgeSubscriptionInfo, "purchasedSubscriptionInfo");
                this.f21560a = acknowledgeSubscriptionInfo;
            }

            public final AcknowledgeSubscriptionInfo a() {
                return this.f21560a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f21560a, ((d) obj).f21560a);
            }

            public int hashCode() {
                return this.f21560a.hashCode();
            }

            public String toString() {
                return "Purchased(purchasedSubscriptionInfo=" + this.f21560a + ")";
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f21561a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -423531590;
            }

            public String toString() {
                return "StoreServicesUnavailable";
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.b$b, reason: collision with other inner class name */
    public static final class C0333b {
        public /* synthetic */ C0333b(k kVar) {
            this();
        }

        private C0333b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21562a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1514475557;
            }

            public String toString() {
                return "BillingClientNotAvailable";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.b$c$b, reason: collision with other inner class name */
        public static final class C0334b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0334b f21563a = new C0334b();

            private C0334b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0334b);
            }

            public int hashCode() {
                return -1239079705;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.b$c$c, reason: collision with other inner class name */
        public static final class C0335c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0335c f21564a = new C0335c();

            private C0335c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0335c);
            }

            public int hashCode() {
                return -1066463242;
            }

            public String toString() {
                return "NotLogined";
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f21565a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1060013272;
            }

            public String toString() {
                return "NotRestored";
            }
        }

        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f21566a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 266324973;
            }

            public String toString() {
                return "SubscriptionNotFound";
            }
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f21567a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1076656542;
            }

            public String toString() {
                return "SuccessfullyRestored";
            }
        }

        public /* synthetic */ c(k kVar) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21568a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21570c;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21568a = obj;
            this.f21570c |= RtlSpacingHelper.UNDEFINED;
            return b.this.b(null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21572b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21574d;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21572b = obj;
            this.f21574d |= RtlSpacingHelper.UNDEFINED;
            return b.this.c(null, null, null, this);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21575a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BillingSubscriptionType f21577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Avo.BuyNowButtonLocation f21578d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BillingSubscriptionType billingSubscriptionType, Avo.BuyNowButtonLocation buyNowButtonLocation, zt.e eVar) {
            super(2, eVar);
            this.f21577c = billingSubscriptionType;
            this.f21578d = buyNowButtonLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new f(this.f21577c, this.f21578d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f21575a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            b.this.f21555e.L3(this.f21577c, this.f21578d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21580b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21582d;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21580b = obj;
            this.f21582d |= RtlSpacingHelper.UNDEFINED;
            return b.this.h(this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21584b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21586d;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21584b = obj;
            this.f21586d |= RtlSpacingHelper.UNDEFINED;
            return b.this.j(this);
        }
    }

    public b(com.server.auditor.ssh.client.billing.a aVar, com.server.auditor.ssh.client.billing.c cVar, ol.a aVar2, hj.f fVar, com.server.auditor.ssh.client.utils.analytics.a aVar3) {
        t.f(aVar, "googleBillingClientLifecycle");
        t.f(cVar, "sendSubscriptionInfoRepository");
        t.f(aVar2, "purchasedSubscriptionInfoRepository");
        t.f(fVar, "trialPromoShowedInteractor");
        t.f(aVar3, "avoAnalytics");
        this.f21551a = aVar;
        this.f21552b = cVar;
        this.f21553c = aVar2;
        this.f21554d = fVar;
        this.f21555e = aVar3;
        this.f21556f = com.server.auditor.ssh.client.app.a.N();
    }

    private final String e(BillingSubscriptionType billingSubscriptionType) {
        if (!(billingSubscriptionType instanceof BillingSubscriptionType.Pro)) {
            throw new s();
        }
        ProSubscriptionType type = ((BillingSubscriptionType.Pro) billingSubscriptionType).getType();
        String str = null;
        if (!t.b(type, ProSubscriptionType.Annual.INSTANCE)) {
            if (t.b(type, ProSubscriptionType.AnnualFreeTrial.INSTANCE)) {
                str = "annual-pro-free-trial";
            } else if (!t.b(type, ProSubscriptionType.Monthly.INSTANCE)) {
                if (!t.b(type, ProSubscriptionType.MonthlyFreeTrial.INSTANCE)) {
                    throw new s();
                }
                str = "monthly-pro-free-trial";
            }
        }
        return (String) c0.g(str);
    }

    private final String f(BillingSubscriptionType billingSubscriptionType) {
        String str;
        if (!(billingSubscriptionType instanceof BillingSubscriptionType.Pro)) {
            throw new s();
        }
        ProSubscriptionType type = ((BillingSubscriptionType.Pro) billingSubscriptionType).getType();
        if (t.b(type, ProSubscriptionType.Annual.INSTANCE)) {
            str = "annual-pro-plan";
        } else if (t.b(type, ProSubscriptionType.AnnualFreeTrial.INSTANCE)) {
            str = "annual-pro-trial";
        } else if (t.b(type, ProSubscriptionType.Monthly.INSTANCE)) {
            str = "monthly-pro-plan";
        } else {
            if (!t.b(type, ProSubscriptionType.MonthlyFreeTrial.INSTANCE)) {
                throw new s();
            }
            str = "monthly-pro-trial";
        }
        return (String) c0.g(str);
    }

    private final String g(BillingSubscriptionType billingSubscriptionType) {
        if (billingSubscriptionType instanceof BillingSubscriptionType.Pro) {
            return VariablesConverter.ApiColorSchemes.PRO;
        }
        throw new s();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo i(com.android.billingclient.api.Purchase r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L31
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto L31
            boolean r1 = su.s.m0(r5)
            if (r1 != 0) goto L10
            goto L11
        L10:
            r5 = r0
        L11:
            if (r5 == 0) goto L31
            hg.b2 r1 = hg.b2.f52944a     // Catch: java.lang.IllegalArgumentException -> L2b
            mv.b r1 = r1.s1()     // Catch: java.lang.IllegalArgumentException -> L2b
            r1.a()     // Catch: java.lang.IllegalArgumentException -> L2b
            com.server.auditor.ssh.client.billing.PurchaseInfo$b r2 = com.server.auditor.ssh.client.billing.PurchaseInfo.Companion     // Catch: java.lang.IllegalArgumentException -> L2b
            hv.c r2 = r2.serializer()     // Catch: java.lang.IllegalArgumentException -> L2b
            hv.b r2 = (hv.b) r2     // Catch: java.lang.IllegalArgumentException -> L2b
            java.lang.Object r5 = r1.b(r2, r5)     // Catch: java.lang.IllegalArgumentException -> L2b
            com.server.auditor.ssh.client.billing.PurchaseInfo r5 = (com.server.auditor.ssh.client.billing.PurchaseInfo) r5     // Catch: java.lang.IllegalArgumentException -> L2b
            goto L32
        L2b:
            r5 = move-exception
            y9.a r1 = y9.a.f86838a
            r1.i(r5)
        L31:
            r5 = r0
        L32:
            if (r5 == 0) goto L39
            java.lang.String r1 = r5.getPurchaseToken()
            goto L3a
        L39:
            r1 = r0
        L3a:
            if (r5 == 0) goto L41
            java.lang.String r2 = r5.getProductId()
            goto L42
        L41:
            r2 = r0
        L42:
            if (r5 == 0) goto L49
            java.lang.String r5 = r5.getPackageName()
            goto L4a
        L49:
            r5 = r0
        L4a:
            if (r1 == 0) goto L59
            if (r2 == 0) goto L59
            if (r5 != 0) goto L51
            goto L59
        L51:
            com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo r0 = new com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo
            java.lang.String r3 = "google_play"
            r0.<init>(r3, r1, r2, r5)
            return r0
        L59:
            y9.a r5 = y9.a.f86838a
            com.server.auditor.ssh.client.billing.GoogleBillingException r1 = new com.server.auditor.ssh.client.billing.GoogleBillingException
            java.lang.String r2 = "purchased subscription corrupted data exception"
            r1.<init>(r2)
            r5.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.b.i(com.android.billingclient.api.Purchase):com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo");
    }

    private final List k(List list, String str) {
        List listG1 = v.g1(v.o());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r.e eVar = (r.e) it.next();
            if (eVar.c().contains(str)) {
                listG1.add(eVar);
            }
        }
        return listG1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6.c(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo r6, zt.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.billing.b.d
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.billing.b$d r0 = (com.server.auditor.ssh.client.billing.b.d) r0
            int r1 = r0.f21570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21570c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.b$d r0 = new com.server.auditor.ssh.client.billing.b$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21568a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21570c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ut.x.b(r7)
            goto L46
        L38:
            ut.x.b(r7)
            com.server.auditor.ssh.client.billing.c r7 = r5.f21552b
            r0.f21570c = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L46
            goto L5a
        L46:
            com.server.auditor.ssh.client.billing.c$a r7 = (com.server.auditor.ssh.client.billing.c.a) r7
            com.server.auditor.ssh.client.billing.c$a$d r6 = com.server.auditor.ssh.client.billing.c.a.d.f21592a
            boolean r6 = ju.t.b(r7, r6)
            if (r6 == 0) goto L88
            ol.a r6 = r5.f21553c
            r0.f21570c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            com.server.auditor.ssh.client.app.a r6 = r5.f21556f
            hg.d r6 = r6.M()
            java.lang.String r7 = "getInsensitiveKeyValueRepository(...)"
            ju.t.e(r6, r7)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r7 = "key_user_account_period_from"
            r6.remove(r7)
            java.lang.String r7 = "key_user_account_period_until"
            r6.remove(r7)
            java.lang.String r7 = "key_account_user_type"
            r6.remove(r7)
            r6.apply()
            hg.f r6 = hg.f.p()
            com.server.auditor.ssh.client.synchronization.SyncServiceHelper r6 = r6.Y()
            r6.startProfileAndBulkSync()
            goto L95
        L88:
            y9.a r6 = y9.a.f86838a
            com.server.auditor.ssh.client.billing.GoogleBillingException r7 = new com.server.auditor.ssh.client.billing.GoogleBillingException
            java.lang.String r0 = "purchased subscription not acknowledged exception"
            r7.<init>(r0)
            r6.i(r7)
            r4 = 0
        L95:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.b.b(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo, zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r0.d(r15, r2) == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.app.Activity r15, com.server.auditor.ssh.client.billing.BillingSubscriptionType r16, com.server.auditor.ssh.client.utils.analytics.Avo.BuyNowButtonLocation r17, zt.e r18) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.b.c(android.app.Activity, com.server.auditor.ssh.client.billing.BillingSubscriptionType, com.server.auditor.ssh.client.utils.analytics.Avo$BuyNowButtonLocation, zt.e):java.lang.Object");
    }

    public final r.e d(BillingSubscriptionType billingSubscriptionType) {
        Object next;
        List listO;
        Object next2;
        t.f(billingSubscriptionType, "billingSubscriptionType");
        com.server.auditor.ssh.client.billing.a aVar = this.f21551a;
        if (!((a.b) aVar.s().getValue()).a()) {
            return null;
        }
        String strG = g(billingSubscriptionType);
        Iterator it = aVar.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (t.b(((r) next).c(), strG)) {
                break;
            }
        }
        r rVar = (r) next;
        if (rVar == null) {
            rVar = null;
        }
        if (rVar == null || (listO = rVar.e()) == null) {
            listO = v.o();
        }
        String strE = e(billingSubscriptionType);
        Iterator it2 = k(listO, f(billingSubscriptionType)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (t.b(((r.e) next2).b(), strE)) {
                break;
            }
        }
        r.e eVar = (r.e) next2;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r10 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zt.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.billing.b.g
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.billing.b$g r0 = (com.server.auditor.ssh.client.billing.b.g) r0
            int r1 = r0.f21582d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21582d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.b$g r0 = new com.server.auditor.ssh.client.billing.b$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f21580b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21582d
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L41
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            ut.x.b(r10)
            goto L8e
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r2 = r0.f21579a
            com.server.auditor.ssh.client.billing.a r2 = (com.server.auditor.ssh.client.billing.a) r2
            ut.x.b(r10)
            goto L7f
        L41:
            java.lang.Object r2 = r0.f21579a
            com.server.auditor.ssh.client.billing.a r2 = (com.server.auditor.ssh.client.billing.a) r2
            ut.x.b(r10)
            goto L70
        L49:
            ut.x.b(r10)
            com.server.auditor.ssh.client.billing.a r10 = r9.f21551a
            zu.k0 r2 = r10.s()
            java.lang.Object r2 = r2.getValue()
            com.server.auditor.ssh.client.billing.a$b r2 = (com.server.auditor.ssh.client.billing.a.b) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L98
            zu.k0 r2 = r10.v()
            r0.f21579a = r10
            r0.f21582d = r7
            java.lang.Object r2 = zu.h.A(r2, r0)
            if (r2 != r1) goto L6d
            goto L8d
        L6d:
            r8 = r2
            r2 = r10
            r10 = r8
        L70:
            com.android.billingclient.api.Purchase r10 = (com.android.billingclient.api.Purchase) r10
            if (r10 != 0) goto L90
            r0.f21579a = r2
            r0.f21582d = r6
            java.lang.Object r10 = r2.B(r0)
            if (r10 != r1) goto L7f
            goto L8d
        L7f:
            zu.k0 r10 = r2.v()
            r0.f21579a = r4
            r0.f21582d = r5
            java.lang.Object r10 = zu.h.A(r10, r0)
            if (r10 != r1) goto L8e
        L8d:
            return r1
        L8e:
            com.android.billingclient.api.Purchase r10 = (com.android.billingclient.api.Purchase) r10
        L90:
            if (r10 == 0) goto L93
            goto L94
        L93:
            r7 = r3
        L94:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r7)
        L98:
            if (r4 == 0) goto L9e
            boolean r3 = r4.booleanValue()
        L9e:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.b.h(zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        if (r6 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r6 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2.d(r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[PHI: r6
      0x00bc: PHI (r6v18 com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo) = 
      (r6v9 com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo)
      (r6v22 com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo)
     binds: [B:24:0x0079, B:42:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(zt.e r6) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.b.j(zt.e):java.lang.Object");
    }
}

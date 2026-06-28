package com.server.auditor.ssh.client.billing;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.q;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.i;
import com.android.billingclient.api.r;
import com.android.billingclient.api.w;
import com.android.billingclient.api.z;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.synchronization.api.VariablesConverter;
import iu.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.j0;
import wu.s2;
import wu.x0;
import zu.a0;
import zu.c0;
import zu.g0;
import zu.k0;
import zu.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements DefaultLifecycleObserver, w, com.android.billingclient.api.h {
    private static volatile a D;
    private final k0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f21500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f21501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.android.billingclient.api.b f21502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zu.w f21503f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final v f21504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zu.w f21505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k0 f21506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Purchase f21507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final a0 f21508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f21509z;
    public static final C0324a B = new C0324a(null);
    public static final int C = 8;
    private static final List E = vt.v.e(VariablesConverter.ApiColorSchemes.PRO);

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$a, reason: collision with other inner class name */
    public static final class C0324a {
        public /* synthetic */ C0324a(ju.k kVar) {
            this();
        }

        public static /* synthetic */ a b(C0324a c0324a, Context context, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = TermiusApplication.F();
            }
            if ((i10 & 2) != 0) {
                qVar = ProcessLifecycleOwner.f8637w.a().getLifecycle();
            }
            return c0324a.a(context, qVar);
        }

        public final a a(Context context, q qVar) {
            a aVar;
            t.f(context, "applicationContext");
            t.f(qVar, "appLifecycle");
            a aVar2 = a.D;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.D;
                if (aVar == null) {
                    com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
                    t.e(aVarY, "getInstance(...)");
                    a aVar3 = new a(context, qVar, aVarY, null, 8, null);
                    a.D = aVar3;
                    aVar = aVar3;
                }
            }
            return aVar;
        }

        private C0324a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$b$a, reason: collision with other inner class name */
        public static final class C0325a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0325a f21510a = new C0325a();

            private C0325a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0325a);
            }

            public int hashCode() {
                return 1566295531;
            }

            public String toString() {
                return "NotReady";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$b$b, reason: collision with other inner class name */
        public static final class C0326b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0326b f21511a = new C0326b();

            private C0326b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0326b);
            }

            public int hashCode() {
                return -1811524568;
            }

            public String toString() {
                return "Ready";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f21512a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 767531797;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        public final boolean a() {
            return this instanceof C0326b;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$c$a, reason: collision with other inner class name */
        public static final class C0327a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0327a f21513a = new C0327a();

            private C0327a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0327a);
            }

            public int hashCode() {
                return -870519221;
            }

            public String toString() {
                return "Canceled";
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21514a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1587145322;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$c$c, reason: collision with other inner class name */
        public static final class C0328c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0328c f21515a = new C0328c();

            private C0328c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0328c);
            }

            public int hashCode() {
                return -48914727;
            }

            public String toString() {
                return "InternalError";
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f21516a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -934546132;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f21517a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1964549747;
            }

            public String toString() {
                return "ServiceUnavailable";
            }
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f21518a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -391743332;
            }

            public String toString() {
                return "SubscriptionAlreadyOwned";
            }
        }

        public static final class g extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Purchase f21519a;

            public g(Purchase purchase) {
                super(null);
                this.f21519a = purchase;
            }

            public final Purchase a() {
                return this.f21519a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && t.b(this.f21519a, ((g) obj).f21519a);
            }

            public int hashCode() {
                Purchase purchase = this.f21519a;
                if (purchase == null) {
                    return 0;
                }
                return purchase.hashCode();
            }

            public String toString() {
                return "SubscriptionPurchased(purchase=" + this.f21519a + ")";
            }
        }

        public /* synthetic */ c(ju.k kVar) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21520a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21522c;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21520a = obj;
            this.f21522c |= RtlSpacingHelper.UNDEFINED;
            return a.this.r(this);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21523a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21523a;
            if (i10 == 0) {
                x.b(obj);
                a aVar = a.this;
                this.f21523a = 1;
                if (aVar.C(this) == objF) {
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

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.j f21526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f21527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.android.billingclient.api.j jVar, a aVar, zt.e eVar) {
            super(2, eVar);
            this.f21526b = jVar;
            this.f21527c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f21526b, this.f21527c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (r5.r(r4) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            if (r5.C(r4) == r0) goto L21;
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
                int r1 = r4.f21525a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r5)
                goto L55
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                ut.x.b(r5)
                goto L34
            L1e:
                ut.x.b(r5)
                com.android.billingclient.api.j r5 = r4.f21526b
                int r5 = r5.c()
                if (r5 != 0) goto L4a
                com.server.auditor.ssh.client.billing.a r5 = r4.f21527c
                r4.f21525a = r3
                java.lang.Object r5 = com.server.auditor.ssh.client.billing.a.d(r5, r4)
                if (r5 != r0) goto L34
                goto L54
            L34:
                com.server.auditor.ssh.client.billing.a r5 = r4.f21527c
                zu.w r5 = com.server.auditor.ssh.client.billing.a.j(r5)
            L3a:
                java.lang.Object r0 = r5.getValue()
                r1 = r0
                com.server.auditor.ssh.client.billing.a$b r1 = (com.server.auditor.ssh.client.billing.a.b) r1
                com.server.auditor.ssh.client.billing.a$b$b r1 = com.server.auditor.ssh.client.billing.a.b.C0326b.f21511a
                boolean r0 = r5.g(r0, r1)
                if (r0 == 0) goto L3a
                goto L55
            L4a:
                com.server.auditor.ssh.client.billing.a r5 = r4.f21527c
                r4.f21525a = r2
                java.lang.Object r5 = com.server.auditor.ssh.client.billing.a.o(r5, r4)
                if (r5 != r0) goto L55
            L54:
                return r0
            L55:
                ut.m0 r5 = ut.m0.f82633a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.j f21529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f21531d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.android.billingclient.api.j jVar, List list, a aVar, zt.e eVar) {
            super(2, eVar);
            this.f21529b = jVar;
            this.f21530c = list;
            this.f21531d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f21529b, this.f21530c, this.f21531d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r5.B(r4) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        
            if (r1.emit(r5, r4) != r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21532a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21534c;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21532a = obj;
            this.f21534c |= RtlSpacingHelper.UNDEFINED;
            return a.this.A(this);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21535a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.x f21537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.android.billingclient.api.x xVar, zt.e eVar) {
            super(2, eVar);
            this.f21537c = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a.this.new i(this.f21537c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21535a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            com.android.billingclient.api.b bVar = a.this.f21502e;
            if (bVar == null) {
                t.t("billingClient");
                bVar = null;
            }
            com.android.billingclient.api.x xVar = this.f21537c;
            this.f21535a = 1;
            Object objA = com.android.billingclient.api.g.a(bVar, xVar, this);
            return objA == objF ? objF : objA;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21538a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21540c;

        j(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21538a = obj;
            this.f21540c |= RtlSpacingHelper.UNDEFINED;
            return a.this.B(this);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21541a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f21543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(z zVar, zt.e eVar) {
            super(2, eVar);
            this.f21543c = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return a.this.new k(this.f21543c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21541a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            com.android.billingclient.api.b bVar = a.this.f21502e;
            if (bVar == null) {
                t.t("billingClient");
                bVar = null;
            }
            z zVar = this.f21543c;
            this.f21541a = 1;
            Object objC = com.android.billingclient.api.g.c(bVar, zVar, this);
            return objC == objF ? objF : objC;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements iu.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21544a;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$l$a, reason: collision with other inner class name */
        public static final class C0329a implements com.android.billingclient.api.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f21546a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.a$l$a$a, reason: collision with other inner class name */
            static final class C0330a extends m implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f21547a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f21548b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0330a(a aVar, zt.e eVar) {
                    super(2, eVar);
                    this.f21548b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new C0330a(this.f21548b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object value;
                    Object objF = au.b.f();
                    int i10 = this.f21547a;
                    if (i10 == 0) {
                        x.b(obj);
                        a aVar = this.f21548b;
                        this.f21547a = 1;
                        if (aVar.r(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x.b(obj);
                    }
                    zu.w wVar = this.f21548b.f21505v;
                    do {
                        value = wVar.getValue();
                    } while (!wVar.g(value, b.C0326b.f21511a));
                    return m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(i0 i0Var, zt.e eVar) {
                    return ((C0330a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
                }
            }

            C0329a(a aVar) {
                this.f21546a = aVar;
            }

            @Override // com.android.billingclient.api.h
            public void a(com.android.billingclient.api.j jVar) {
                Object value;
                t.f(jVar, "billingResult");
                int iC = jVar.c();
                if (iC == 0) {
                    wu.k.d(this.f21546a.f21501d, null, null, new C0330a(this.f21546a, null), 3, null);
                    return;
                }
                if (iC != 3 && iC != 5) {
                    throw new CancellationException("Failed to connect to Google Billing. " + jVar);
                }
                zu.w wVar = this.f21546a.f21505v;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, b.c.f21512a));
            }

            @Override // com.android.billingclient.api.h
            public void b() {
                Object value;
                zu.w wVar = this.f21546a.f21505v;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, b.C0325a.f21510a));
            }
        }

        l(zt.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(zt.e eVar) {
            return a.this.new l(eVar);
        }

        @Override // iu.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zt.e eVar) {
            return ((l) create(eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f21544a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            com.android.billingclient.api.b bVar = a.this.f21502e;
            if (bVar == null) {
                t.t("billingClient");
                bVar = null;
            }
            bVar.g(new C0329a(a.this));
            return m0.f82633a;
        }
    }

    private a(Context context, q qVar, com.server.auditor.ssh.client.utils.analytics.a aVar, i0 i0Var) {
        this.f21498a = context;
        this.f21499b = qVar;
        this.f21500c = aVar;
        this.f21501d = i0Var;
        zu.w wVarA = zu.m0.a(null);
        this.f21503f = wVarA;
        v vVarB = c0.b(0, 0, null, 7, null);
        this.f21504u = vVarB;
        zu.w wVarA2 = zu.m0.a(b.C0325a.f21510a);
        this.f21505v = wVarA2;
        this.f21506w = zu.h.b(wVarA2);
        this.f21508y = zu.h.N(vVarB, i0Var, g0.a.b(g0.f88389a, 0L, 0L, 3, null), 0);
        this.f21509z = vt.v.o();
        this.A = zu.h.b(wVarA);
        qVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.billing.a.h
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.billing.a$h r0 = (com.server.auditor.ssh.client.billing.a.h) r0
            int r1 = r0.f21534c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21534c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.a$h r0 = new com.server.auditor.ssh.client.billing.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21532a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21534c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r7)
            goto L8b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            ut.x.b(r7)
            java.util.List r7 = com.server.auditor.ssh.client.billing.a.E
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = vt.v.z(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r7.next()
            java.lang.String r4 = (java.lang.String) r4
            com.android.billingclient.api.x$b$a r5 = com.android.billingclient.api.x.b.a()
            com.android.billingclient.api.x$b$a r4 = r5.b(r4)
            java.lang.String r5 = "subs"
            com.android.billingclient.api.x$b$a r4 = r4.c(r5)
            com.android.billingclient.api.x$b r4 = r4.a()
            r2.add(r4)
            goto L45
        L67:
            com.android.billingclient.api.x$a r7 = com.android.billingclient.api.x.a()
            com.android.billingclient.api.x$a r7 = r7.b(r2)
            com.android.billingclient.api.x r7 = r7.a()
            java.lang.String r2 = "build(...)"
            ju.t.e(r7, r2)
            wu.g0 r2 = wu.x0.b()
            com.server.auditor.ssh.client.billing.a$i r4 = new com.server.auditor.ssh.client.billing.a$i
            r5 = 0
            r4.<init>(r7, r5)
            r0.f21534c = r3
            java.lang.Object r7 = wu.i.g(r2, r4, r0)
            if (r7 != r1) goto L8b
            return r1
        L8b:
            com.android.billingclient.api.t r7 = (com.android.billingclient.api.t) r7
            com.android.billingclient.api.j r0 = r7.a()
            int r0 = r0.c()
            java.util.List r7 = r7.b()
            if (r0 != 0) goto La0
            if (r7 == 0) goto La0
            r6.z(r7)
        La0:
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.a.A(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(zt.e eVar) {
        return tp.c0.f(3, 2000L, 2, new l(null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (B(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.billing.a.d
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.billing.a$d r0 = (com.server.auditor.ssh.client.billing.a.d) r0
            int r1 = r0.f21522c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21522c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.a$d r0 = new com.server.auditor.ssh.client.billing.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21520a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21522c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L44
        L38:
            ut.x.b(r6)
            r0.f21522c = r4
            java.lang.Object r6 = r5.A(r0)
            if (r6 != r1) goto L44
            goto L4c
        L44:
            r0.f21522c = r3
            java.lang.Object r6 = r5.B(r0)
            if (r6 != r1) goto L4d
        L4c:
            return r1
        L4d:
            ut.m0 r6 = ut.m0.f82633a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.a.r(zt.e):java.lang.Object");
    }

    private final boolean w(Purchase purchase) {
        boolean zB = t.b(purchase, this.f21507x);
        if (!zB) {
            this.f21507x = purchase;
        }
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Purchase purchase) {
        if (w(purchase)) {
            return;
        }
        this.f21503f.b(purchase);
    }

    private final void z(List list) {
        List listO;
        if (list.isEmpty()) {
            listO = vt.v.o();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (t.b(((r) obj).d(), "subs")) {
                    arrayList.add(obj);
                }
            }
            listO = arrayList;
        }
        this.f21509z = listO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.billing.a.j
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.billing.a$j r0 = (com.server.auditor.ssh.client.billing.a.j) r0
            int r1 = r0.f21540c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21540c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.a$j r0 = new com.server.auditor.ssh.client.billing.a$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21538a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21540c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r7)
            goto L76
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            ut.x.b(r7)
            com.android.billingclient.api.b r7 = r6.f21502e
            r2 = 0
            if (r7 != 0) goto L3f
            java.lang.String r7 = "billingClient"
            ju.t.t(r7)
            r7 = r2
        L3f:
            boolean r7 = r7.b()
            if (r7 != 0) goto L51
            y9.a r7 = y9.a.f86838a
            com.server.auditor.ssh.client.billing.GoogleBillingException r4 = new com.server.auditor.ssh.client.billing.GoogleBillingException
            java.lang.String r5 = "Billing not ready yet exception"
            r4.<init>(r5)
            r7.i(r4)
        L51:
            com.android.billingclient.api.z$a r7 = com.android.billingclient.api.z.b()
            java.lang.String r4 = "subs"
            com.android.billingclient.api.z$a r7 = r7.b(r4)
            com.android.billingclient.api.z r7 = r7.a()
            java.lang.String r4 = "build(...)"
            ju.t.e(r7, r4)
            wu.g0 r4 = wu.x0.b()
            com.server.auditor.ssh.client.billing.a$k r5 = new com.server.auditor.ssh.client.billing.a$k
            r5.<init>(r7, r2)
            r0.f21540c = r3
            java.lang.Object r7 = wu.i.g(r4, r5, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            com.android.billingclient.api.v r7 = (com.android.billingclient.api.v) r7
            java.util.List r7 = r7.a()
            java.lang.Object r7 = vt.v.r0(r7)
            com.android.billingclient.api.Purchase r7 = (com.android.billingclient.api.Purchase) r7
            if (r7 != 0) goto L87
            ut.m0 r7 = ut.m0.f82633a
            return r7
        L87:
            r6.y(r7)
            ut.m0 r7 = ut.m0.f82633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.a.B(zt.e):java.lang.Object");
    }

    @Override // com.android.billingclient.api.h
    public void a(com.android.billingclient.api.j jVar) {
        t.f(jVar, "billingResult");
        wu.k.d(this.f21501d, null, null, new f(jVar, this, null), 3, null);
    }

    @Override // com.android.billingclient.api.h
    public void b() {
        wu.k.d(this.f21501d, null, null, new e(null), 3, null);
    }

    @Override // com.android.billingclient.api.w
    public void c(com.android.billingclient.api.j jVar, List list) {
        t.f(jVar, "billingResult");
        wu.k.d(this.f21501d, null, null, new g(jVar, list, this, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(androidx.lifecycle.z zVar) {
        Object value;
        t.f(zVar, "owner");
        super.onCreate(zVar);
        com.android.billingclient.api.b bVarA = com.android.billingclient.api.b.d(this.f21498a).c(this).b(com.android.billingclient.api.q.c().b().a()).a();
        this.f21502e = bVarA;
        com.android.billingclient.api.b bVar = null;
        if (bVarA == null) {
            t.t("billingClient");
            bVarA = null;
        }
        if (bVarA.b()) {
            return;
        }
        zu.w wVar = this.f21505v;
        do {
            value = wVar.getValue();
        } while (!wVar.g(value, b.C0325a.f21510a));
        com.android.billingclient.api.b bVar2 = this.f21502e;
        if (bVar2 == null) {
            t.t("billingClient");
        } else {
            bVar = bVar2;
        }
        bVar.g(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.lifecycle.z zVar) {
        Object value;
        t.f(zVar, "owner");
        super.onDestroy(zVar);
        com.android.billingclient.api.b bVar = this.f21502e;
        com.android.billingclient.api.b bVar2 = null;
        if (bVar == null) {
            t.t("billingClient");
            bVar = null;
        }
        if (bVar.b()) {
            com.android.billingclient.api.b bVar3 = this.f21502e;
            if (bVar3 == null) {
                t.t("billingClient");
            } else {
                bVar2 = bVar3;
            }
            bVar2.a();
            zu.w wVar = this.f21505v;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, b.C0325a.f21510a));
        }
    }

    public final i.a q(r rVar, String str) {
        t.f(rVar, "productDetails");
        t.f(str, "offerToken");
        i.b bVarA = i.b.b().c(rVar).b(str).a();
        t.e(bVarA, "build(...)");
        i.a aVarB = com.android.billingclient.api.i.b().b(vt.v.e(bVarA));
        t.e(aVarB, "setProductDetailsParamsList(...)");
        return aVarB;
    }

    public final k0 s() {
        return this.f21506w;
    }

    public final a0 t() {
        return this.f21508y;
    }

    public final List u() {
        return this.f21509z;
    }

    public final k0 v() {
        return this.A;
    }

    public final boolean x(Activity activity, com.android.billingclient.api.i iVar) {
        t.f(activity, "activity");
        t.f(iVar, "params");
        com.android.billingclient.api.b bVar = this.f21502e;
        com.android.billingclient.api.b bVar2 = null;
        if (bVar == null) {
            t.t("billingClient");
            bVar = null;
        }
        if (!bVar.b()) {
            y9.a.f86838a.i(new GoogleBillingException("Billing not ready yet exception"));
        }
        com.android.billingclient.api.b bVar3 = this.f21502e;
        if (bVar3 == null) {
            t.t("billingClient");
        } else {
            bVar2 = bVar3;
        }
        com.android.billingclient.api.j jVarC = bVar2.c(activity, iVar);
        t.e(jVarC, "launchBillingFlow(...)");
        return jVarC.c() == 0;
    }

    /* synthetic */ a(Context context, q qVar, com.server.auditor.ssh.client.utils.analytics.a aVar, i0 i0Var, int i10, ju.k kVar) {
        this(context, qVar, aVar, (i10 & 8) != 0 ? j0.a(s2.b(null, 1, null).r0(x0.a())) : i0Var);
    }
}

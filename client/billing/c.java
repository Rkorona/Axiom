package com.server.auditor.ssh.client.billing;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.g0;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f21588b;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.c$a$a, reason: collision with other inner class name */
        public static final class C0336a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f21589a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0336a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f21589a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0336a) && t.b(this.f21589a, ((C0336a) obj).f21589a);
            }

            public int hashCode() {
                return this.f21589a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f21589a + ")";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21590a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2047492927;
            }

            public String toString() {
                return "Failed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.c$a$c, reason: collision with other inner class name */
        public static final class C0337c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0337c f21591a = new C0337c();

            private C0337c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0337c);
            }

            public int hashCode() {
                return -1377265156;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f21592a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1732808383;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21593a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21595c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21593a = obj;
            this.f21595c |= RtlSpacingHelper.UNDEFINED;
            return c.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.billing.c$c, reason: collision with other inner class name */
    static final class C0338c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f21597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AcknowledgeSubscriptionInfo f21598c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0338c(SyncRestInterface syncRestInterface, AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, e eVar) {
            super(2, eVar);
            this.f21597b = syncRestInterface;
            this.f21598c = acknowledgeSubscriptionInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0338c(this.f21597b, this.f21598c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21596a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f21597b;
            AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo = this.f21598c;
            this.f21596a = 1;
            Object objPostSubscriptionInfo = syncRestInterface.postSubscriptionInfo(acknowledgeSubscriptionInfo, this);
            return objPostSubscriptionInfo == objF ? objF : objPostSubscriptionInfo;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((C0338c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public c(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f21587a = syncRestApiClientFactory;
        this.f21588b = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.billing.c.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.billing.c$b r0 = (com.server.auditor.ssh.client.billing.c.b) r0
            int r1 = r0.f21595c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21595c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.billing.c$b r0 = new com.server.auditor.ssh.client.billing.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21593a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21595c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            goto L52
        L29:
            r7 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f21587a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createAuthenticatedRestApiClient()
            if (r8 != 0) goto L41
            com.server.auditor.ssh.client.billing.c$a$b r7 = com.server.auditor.ssh.client.billing.c.a.b.f21590a
            return r7
        L41:
            wu.g0 r2 = r6.f21588b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            com.server.auditor.ssh.client.billing.c$c r4 = new com.server.auditor.ssh.client.billing.c$c     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            r0.f21595c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            if (r8 != r1) goto L52
            return r1
        L52:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            if (r7 == 0) goto L5d
            com.server.auditor.ssh.client.billing.c$a$d r7 = com.server.auditor.ssh.client.billing.c.a.d.f21592a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            return r7
        L5d:
            com.server.auditor.ssh.client.billing.c$a$b r7 = com.server.auditor.ssh.client.billing.c.a.b.f21590a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L66
            return r7
        L60:
            com.server.auditor.ssh.client.billing.c$a$a r8 = new com.server.auditor.ssh.client.billing.c$a$a
            r8.<init>(r7)
            goto L68
        L66:
            com.server.auditor.ssh.client.billing.c$a$c r8 = com.server.auditor.ssh.client.billing.c.a.C0337c.f21591a
        L68:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.billing.c.a(com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo, zt.e):java.lang.Object");
    }
}

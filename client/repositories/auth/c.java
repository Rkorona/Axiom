package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.CryptoSpec;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import iu.p;
import ju.t;
import ut.m0;
import ut.s;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38602c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38603d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38605b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f38607b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, String str) {
                super(null);
                t.f(str, "error");
                this.f38606a = i10;
                this.f38607b = str;
            }

            public final int a() {
                return this.f38606a;
            }

            public final String b() {
                return this.f38607b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f38606a == aVar.f38606a && t.b(this.f38607b, aVar.f38607b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f38606a) * 31) + this.f38607b.hashCode();
            }

            public String toString() {
                return "Failed(code=" + this.f38606a + ", error=" + this.f38607b + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.c$b$b, reason: collision with other inner class name */
        public static final class C0588b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38608a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0588b(Exception exc) {
                super(null);
                t.f(exc, "e");
                this.f38608a = exc;
            }

            public final Exception a() {
                return this.f38608a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0588b) && t.b(this.f38608a, ((C0588b) obj).f38608a);
            }

            public int hashCode() {
                return this.f38608a.hashCode();
            }

            public String toString() {
                return "FailedException(e=" + this.f38608a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.c$b$c, reason: collision with other inner class name */
        public static final class C0589c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0589c f38609a = new C0589c();

            private C0589c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0589c);
            }

            public int hashCode() {
                return -1850838231;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38610a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f38611b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, String str2) {
                super(null);
                t.f(str, "salt");
                t.f(str2, "hmacSalt");
                this.f38610a = str;
                this.f38611b = str2;
            }

            public final String a() {
                return this.f38611b;
            }

            public final String b() {
                return this.f38610a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return t.b(this.f38610a, dVar.f38610a) && t.b(this.f38611b, dVar.f38611b);
            }

            public int hashCode() {
                return (this.f38610a.hashCode() * 31) + this.f38611b.hashCode();
            }

            public String toString() {
                return "Success(salt=" + this.f38610a + ", hmacSalt=" + this.f38611b + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f38612a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -860549855;
            }

            public String toString() {
                return "UnauthenticatedError";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f38613a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1664503592;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.c$c, reason: collision with other inner class name */
    static final class C0590c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38614a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38616c;

        C0590c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38614a = obj;
            this.f38616c |= RtlSpacingHelper.UNDEFINED;
            return c.this.c(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f38618b = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38618b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38617a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38618b;
            this.f38617a = 1;
            Object objRequestV3CryptoRegenerate = syncRestInterface.requestV3CryptoRegenerate(this);
            return objRequestV3CryptoRegenerate == objF ? objF : objRequestV3CryptoRegenerate;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public c(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38604a = syncRestApiClientFactory;
        this.f38605b = g0Var;
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        if (eVar instanceof y) {
            return b.e.f38612a;
        }
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h) && !(eVar instanceof com.server.auditor.ssh.client.models.m)) {
            if (eVar instanceof w) {
                return new b.a(eVar.b(), "Unexpected error");
            }
            if (eVar instanceof com.server.auditor.ssh.client.models.l) {
                return b.f.f38613a;
            }
            if (eVar instanceof z) {
                return new b.a(((z) eVar).b(), "Unexpected error");
            }
            throw new s();
        }
        return b.f.f38613a;
    }

    private final b b(CryptoSpec cryptoSpec) {
        if (cryptoSpec == null) {
            return b.f.f38613a;
        }
        String salt = cryptoSpec.getSalt();
        if (salt == null) {
            salt = "";
        }
        String hmacSalt = cryptoSpec.getHmacSalt();
        return new b.d(salt, hmacSalt != null ? hmacSalt : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.repositories.auth.c.C0590c
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.repositories.auth.c$c r0 = (com.server.auditor.ssh.client.repositories.auth.c.C0590c) r0
            int r1 = r0.f38616c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38616c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.c$c r0 = new com.server.auditor.ssh.client.repositories.auth.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38614a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38616c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            goto L52
        L29:
            r7 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            ut.x.b(r7)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r7 = r6.f38604a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r7 = r7.createAuthenticatedRestApiClient()
            if (r7 != 0) goto L41
            com.server.auditor.ssh.client.repositories.auth.c$b$f r7 = com.server.auditor.ssh.client.repositories.auth.c.b.f.f38613a
            return r7
        L41:
            wu.g0 r2 = r6.f38605b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.repositories.auth.c$d r4 = new com.server.auditor.ssh.client.repositories.auth.c$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            r0.f38616c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            java.lang.Object r7 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            if (r7 != r1) goto L52
            return r1
        L52:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            boolean r0 = r7.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            if (r0 == 0) goto L65
            java.lang.Object r7 = r7.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.synchronization.api.models.CryptoSpec r7 = (com.server.auditor.ssh.client.synchronization.api.models.CryptoSpec) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.repositories.auth.c$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            return r7
        L65:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.repositories.auth.c$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            return r7
        L6e:
            com.server.auditor.ssh.client.repositories.auth.c$b$b r0 = new com.server.auditor.ssh.client.repositories.auth.c$b$b
            r0.<init>(r7)
            goto L79
        L74:
            com.server.auditor.ssh.client.repositories.auth.c$b$c r0 = com.server.auditor.ssh.client.repositories.auth.c.b.C0589c.f38609a
            goto L79
        L77:
            com.server.auditor.ssh.client.repositories.auth.c$b$f r0 = com.server.auditor.ssh.client.repositories.auth.c.b.f.f38613a
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.c.c(zt.e):java.lang.Object");
    }
}

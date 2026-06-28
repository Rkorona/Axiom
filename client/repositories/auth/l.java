package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenRequest;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse;
import com.server.auditor.ssh.client.synchronization.api.models.sso.SsoDomainTokenBadRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import iu.p;
import java.util.List;
import ju.t;
import pv.e0;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38675c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38676d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38678b;

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
            private final Exception f38679a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38679a = exc;
            }

            public final Exception a() {
                return this.f38679a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f38679a, ((a) obj).f38679a);
            }

            public int hashCode() {
                return this.f38679a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38679a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.l$b$b, reason: collision with other inner class name */
        public static final class C0594b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38680a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0594b(String str) {
                super(null);
                t.f(str, "error");
                this.f38680a = str;
            }

            public final String a() {
                return this.f38680a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0594b) && t.b(this.f38680a, ((C0594b) obj).f38680a);
            }

            public int hashCode() {
                return this.f38680a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38680a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f38681a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1233782508;
            }

            public String toString() {
                return "NetworkException";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f38682a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 792587439;
            }

            public String toString() {
                return "NotMigratedError";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SsoDomainTokenResponse f38683a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SsoDomainTokenResponse ssoDomainTokenResponse) {
                super(null);
                t.f(ssoDomainTokenResponse, "response");
                this.f38683a = ssoDomainTokenResponse;
            }

            public final SsoDomainTokenResponse a() {
                return this.f38683a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && t.b(this.f38683a, ((e) obj).f38683a);
            }

            public int hashCode() {
                return this.f38683a.hashCode();
            }

            public String toString() {
                return "Success(response=" + this.f38683a + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f38684a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1950333572;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f38685a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 747382747;
            }

            public String toString() {
                return "UserNotFoundError";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38686a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38688c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38686a = obj;
            this.f38688c |= RtlSpacingHelper.UNDEFINED;
            return l.this.c(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, String str, zt.e eVar) {
            super(2, eVar);
            this.f38690b = syncRestInterface;
            this.f38691c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38690b, this.f38691c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38689a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38690b;
            SsoDomainTokenRequest ssoDomainTokenRequest = new SsoDomainTokenRequest(this.f38691c);
            this.f38689a = 1;
            Object objRequestSsoDomainToken = syncRestInterface.requestSsoDomainToken(ssoDomainTokenRequest, this);
            return objRequestSsoDomainToken == objF ? objF : objRequestSsoDomainToken;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public l(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38677a = syncRestApiClientFactory;
        this.f38678b = g0Var;
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        Object objB;
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h)) {
            if ((eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof w) || (eVar instanceof y) || (eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof z)) {
                return b.f.f38684a;
            }
            throw new s();
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = eVar.a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(SsoDomainTokenBadRequest.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        SsoDomainTokenBadRequest ssoDomainTokenBadRequest = (SsoDomainTokenBadRequest) objB;
        if (ssoDomainTokenBadRequest == null) {
            return b.f.f38684a;
        }
        List<String> errors = ssoDomainTokenBadRequest.getErrors();
        String str = errors != null ? (String) v.r0(errors) : null;
        List<String> authCode = ssoDomainTokenBadRequest.getAuthCode();
        String str2 = authCode != null ? (String) v.r0(authCode) : null;
        return str != null ? new b.C0594b(str) : str2 != null ? new b.C0594b(str2) : b.f.f38684a;
    }

    private final b b(SsoDomainTokenResponse ssoDomainTokenResponse) {
        return ssoDomainTokenResponse.getUser() == null ? b.g.f38685a : t.b(ssoDomainTokenResponse.getUser().getEncryptionSchema(), "v5") ? new b.e(ssoDomainTokenResponse) : b.d.f38682a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.l.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.l$c r0 = (com.server.auditor.ssh.client.repositories.auth.l.c) r0
            int r1 = r0.f38688c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38688c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.l$c r0 = new com.server.auditor.ssh.client.repositories.auth.l$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38686a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38688c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            goto L4d
        L29:
            r7 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38677a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createRegularRestApiClient()
            wu.g0 r2 = r6.f38678b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            com.server.auditor.ssh.client.repositories.auth.l$d r4 = new com.server.auditor.ssh.client.repositories.auth.l$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            r0.f38688c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            if (r8 != r1) goto L4d
            return r1
        L4d:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            if (r7 == 0) goto L65
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse r7 = (com.server.auditor.ssh.client.synchronization.api.models.SsoDomainTokenResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            if (r7 == 0) goto L62
            com.server.auditor.ssh.client.repositories.auth.l$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            return r7
        L62:
            com.server.auditor.ssh.client.repositories.auth.l$b$f r7 = com.server.auditor.ssh.client.repositories.auth.l.b.f.f38684a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            return r7
        L65:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            com.server.auditor.ssh.client.repositories.auth.l$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74
            return r7
        L6e:
            com.server.auditor.ssh.client.repositories.auth.l$b$a r8 = new com.server.auditor.ssh.client.repositories.auth.l$b$a
            r8.<init>(r7)
            goto L76
        L74:
            com.server.auditor.ssh.client.repositories.auth.l$b$c r8 = com.server.auditor.ssh.client.repositories.auth.l.b.c.f38681a
        L76:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.l.c(java.lang.String, zt.e):java.lang.Object");
    }
}

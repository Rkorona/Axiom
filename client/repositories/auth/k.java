package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlRequest;
import com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse;
import com.server.auditor.ssh.client.synchronization.api.models.sso.SsoDomainRedirectUriBadRequest;
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
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38660b;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.k$a$a, reason: collision with other inner class name */
        public static final class C0593a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38661a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0593a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38661a = exc;
            }

            public final Exception a() {
                return this.f38661a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0593a) && t.b(this.f38661a, ((C0593a) obj).f38661a);
            }

            public int hashCode() {
                return this.f38661a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38661a + ")";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38662a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                t.f(str, "error");
                this.f38662a = str;
            }

            public final String a() {
                return this.f38662a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f38662a, ((b) obj).f38662a);
            }

            public int hashCode() {
                return this.f38662a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38662a + ")";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38663a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                t.f(str, "error");
                this.f38663a = str;
            }

            public final String a() {
                return this.f38663a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38663a, ((c) obj).f38663a);
            }

            public int hashCode() {
                return this.f38663a.hashCode();
            }

            public String toString() {
                return "InvalidEmail(error=" + this.f38663a + ")";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f38664a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 333577994;
            }

            public String toString() {
                return "NetworkException";
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SsoDomainAuthUrlResponse f38665a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SsoDomainAuthUrlResponse ssoDomainAuthUrlResponse) {
                super(null);
                t.f(ssoDomainAuthUrlResponse, "result");
                this.f38665a = ssoDomainAuthUrlResponse;
            }

            public final SsoDomainAuthUrlResponse a() {
                return this.f38665a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && t.b(this.f38665a, ((e) obj).f38665a);
            }

            public int hashCode() {
                return this.f38665a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f38665a + ")";
            }
        }

        public static final class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38666a;

            public f(int i10) {
                super(null);
                this.f38666a = i10;
            }

            public final int a() {
                return this.f38666a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f38666a == ((f) obj).f38666a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38666a);
            }

            public String toString() {
                return "ThrottledError(seconds=" + this.f38666a + ")";
            }
        }

        public static final class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f38667a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -354411058;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38668a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38670c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38668a = obj;
            this.f38670c |= RtlSpacingHelper.UNDEFINED;
            return k.this.b(null, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38674d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SyncRestInterface syncRestInterface, String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f38672b = syncRestInterface;
            this.f38673c = str;
            this.f38674d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f38672b, this.f38673c, this.f38674d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38671a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38672b;
            SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest = new SsoDomainAuthUrlRequest(this.f38673c, this.f38674d);
            this.f38671a = 1;
            Object objRequestSsoDomainAuthUrl = syncRestInterface.requestSsoDomainAuthUrl(ssoDomainAuthUrlRequest, this);
            return objRequestSsoDomainAuthUrl == objF ? objF : objRequestSsoDomainAuthUrl;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public k(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38659a = syncRestApiClientFactory;
        this.f38660b = g0Var;
    }

    private final a a(com.server.auditor.ssh.client.models.e eVar) {
        Object objB;
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h)) {
            if (eVar instanceof w) {
                Integer numE = w.e((w) eVar, null, 1, null);
                return numE != null ? new a.f(numE.intValue()) : a.g.f38667a;
            }
            if ((eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof y) || (eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof z)) {
                return a.g.f38667a;
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
            objB = bVarS1.b(SsoDomainRedirectUriBadRequest.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        SsoDomainRedirectUriBadRequest ssoDomainRedirectUriBadRequest = (SsoDomainRedirectUriBadRequest) objB;
        if (ssoDomainRedirectUriBadRequest == null) {
            return a.g.f38667a;
        }
        List<String> email = ssoDomainRedirectUriBadRequest.getEmail();
        String str = email != null ? (String) v.r0(email) : null;
        List<String> errors = ssoDomainRedirectUriBadRequest.getErrors();
        String str2 = errors != null ? (String) v.r0(errors) : null;
        return str != null ? new a.c(str) : str2 != null ? new a.b(str2) : a.g.f38667a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, zt.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.repositories.auth.k.b
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.repositories.auth.k$b r0 = (com.server.auditor.ssh.client.repositories.auth.k.b) r0
            int r1 = r0.f38670c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38670c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.k$b r0 = new com.server.auditor.ssh.client.repositories.auth.k$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38668a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38670c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r9)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            goto L4d
        L29:
            r7 = move-exception
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r9)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r9 = r6.f38659a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r9 = r9.createRegularRestApiClient()
            wu.g0 r2 = r6.f38660b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            com.server.auditor.ssh.client.repositories.auth.k$c r4 = new com.server.auditor.ssh.client.repositories.auth.k$c     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            r5 = 0
            r4.<init>(r9, r7, r8, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            r0.f38670c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            java.lang.Object r9 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            if (r9 != r1) goto L4d
            return r1
        L4d:
            retrofit2.Response r9 = (retrofit2.Response) r9     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            boolean r7 = r9.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            if (r7 == 0) goto L66
            java.lang.Object r7 = r9.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse r7 = (com.server.auditor.ssh.client.synchronization.api.models.SsoDomainAuthUrlResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            if (r7 == 0) goto L63
            com.server.auditor.ssh.client.repositories.auth.k$a$e r8 = new com.server.auditor.ssh.client.repositories.auth.k$a$e     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            r8.<init>(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            return r8
        L63:
            com.server.auditor.ssh.client.repositories.auth.k$a$g r7 = com.server.auditor.ssh.client.repositories.auth.k.a.g.f38667a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            return r7
        L66:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r9)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            com.server.auditor.ssh.client.repositories.auth.k$a r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L75
            return r7
        L6f:
            com.server.auditor.ssh.client.repositories.auth.k$a$a r8 = new com.server.auditor.ssh.client.repositories.auth.k$a$a
            r8.<init>(r7)
            goto L77
        L75:
            com.server.auditor.ssh.client.repositories.auth.k$a$d r8 = com.server.auditor.ssh.client.repositories.auth.k.a.d.f38664a
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.k.b(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

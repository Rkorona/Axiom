package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenRequest;
import com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.ChangeEmailErrorModel;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import iu.p;
import java.util.List;
import ju.t;
import pv.e0;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38706e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38707f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f38709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38711d;

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
            public static final a f38712a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -585782902;
            }

            public String toString() {
                return "BadRequestError";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.n$b$b, reason: collision with other inner class name */
        public static final class C0596b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38713a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0596b(String str) {
                super(null);
                t.f(str, "error");
                this.f38713a = str;
            }

            public final String a() {
                return this.f38713a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0596b) && t.b(this.f38713a, ((C0596b) obj).f38713a);
            }

            public int hashCode() {
                return this.f38713a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38713a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38714a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Exception exc) {
                super(null);
                t.f(exc, "e");
                this.f38714a = exc;
            }

            public final Exception a() {
                return this.f38714a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38714a, ((c) obj).f38714a);
            }

            public int hashCode() {
                return this.f38714a.hashCode();
            }

            public String toString() {
                return "FailedException(e=" + this.f38714a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f38716b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, String str2) {
                super(null);
                t.f(str, "emailError");
                t.f(str2, "passwordError");
                this.f38715a = str;
                this.f38716b = str2;
            }

            public final String a() {
                return this.f38715a;
            }

            public final String b() {
                return this.f38716b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return t.b(this.f38715a, dVar.f38715a) && t.b(this.f38716b, dVar.f38716b);
            }

            public int hashCode() {
                return (this.f38715a.hashCode() * 31) + this.f38716b.hashCode();
            }

            public String toString() {
                return "InvalidCredentials(emailError=" + this.f38715a + ", passwordError=" + this.f38716b + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f38717a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -704644146;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38718a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(null);
                t.f(str, "secureToken");
                this.f38718a = str;
            }

            public final String a() {
                return this.f38718a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && t.b(this.f38718a, ((f) obj).f38718a);
            }

            public int hashCode() {
                return this.f38718a.hashCode();
            }

            public String toString() {
                return "Success(secureToken=" + this.f38718a + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38719a;

            public g(int i10) {
                super(null);
                this.f38719a = i10;
            }

            public final int a() {
                return this.f38719a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f38719a == ((g) obj).f38719a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38719a);
            }

            public String toString() {
                return "ThrottlingError(seconds=" + this.f38719a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f38720a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 454697158;
            }

            public String toString() {
                return "UnauthenticatedError";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f38721a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return -1352480669;
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

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38722a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38724c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38722a = obj;
            this.f38724c |= RtlSpacingHelper.UNDEFINED;
            return n.this.c(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38727c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, String str, zt.e eVar) {
            super(2, eVar);
            this.f38726b = syncRestInterface;
            this.f38727c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38726b, this.f38727c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38725a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38726b;
            ObtainSecurityTokenRequest obtainSecurityTokenRequest = new ObtainSecurityTokenRequest(this.f38727c);
            this.f38725a = 1;
            Object objObtainSecurityToken = syncRestInterface.obtainSecurityToken(obtainSecurityTokenRequest, this);
            return objObtainSecurityToken == objF ? objF : objObtainSecurityToken;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public n(SyncRestApiClientFactory syncRestApiClientFactory, j1 j1Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(j1Var, "networkDispatcher");
        this.f38708a = syncRestApiClientFactory;
        this.f38709b = j1Var;
        this.f38710c = "Cannot create request";
        this.f38711d = "Empty success body";
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        Object objB;
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h)) {
            if (eVar instanceof w) {
                w wVar = (w) eVar;
                Integer numE = w.e(wVar, null, 1, null);
                if (numE != null) {
                    return new b.g(numE.intValue());
                }
                String strC = wVar.c();
                return (strC == null || s.m0(strC)) ? new b.C0596b("Unexpected error code: 429") : new b.C0596b(strC);
            }
            if (eVar instanceof y) {
                return b.h.f38720a;
            }
            if ((eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof z)) {
                return b.i.f38721a;
            }
            throw new ut.s();
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = eVar.a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(ChangeEmailErrorModel.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        ChangeEmailErrorModel changeEmailErrorModel = (ChangeEmailErrorModel) objB;
        if (changeEmailErrorModel == null) {
            return b.a.f38712a;
        }
        List<String> passwordErrors = changeEmailErrorModel.getPasswordErrors();
        String str = passwordErrors != null ? (String) v.r0(passwordErrors) : null;
        if (str == null) {
            str = "";
        }
        List<String> emailErrors = changeEmailErrorModel.getEmailErrors();
        String str2 = emailErrors != null ? (String) v.r0(emailErrors) : null;
        String str3 = str2 != null ? str2 : "";
        return (str3.length() <= 0 && str.length() <= 0) ? b.a.f38712a : new b.d(str3, str);
    }

    private final b b(ObtainSecurityTokenResponse obtainSecurityTokenResponse) {
        return obtainSecurityTokenResponse != null ? new b.f(obtainSecurityTokenResponse.getToken()) : new b.C0596b(this.f38711d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.n.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.n$c r0 = (com.server.auditor.ssh.client.repositories.auth.n.c) r0
            int r1 = r0.f38724c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38724c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.n$c r0 = new com.server.auditor.ssh.client.repositories.auth.n$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38722a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38724c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            goto L57
        L29:
            r7 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38708a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createAuthenticatedRestApiClient()
            if (r8 != 0) goto L46
            com.server.auditor.ssh.client.repositories.auth.n$b$b r7 = new com.server.auditor.ssh.client.repositories.auth.n$b$b
            java.lang.String r8 = r6.f38710c
            r7.<init>(r8)
            return r7
        L46:
            wu.j1 r2 = r6.f38709b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            com.server.auditor.ssh.client.repositories.auth.n$d r4 = new com.server.auditor.ssh.client.repositories.auth.n$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            r0.f38724c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            if (r8 != r1) goto L57
            return r1
        L57:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenResponse r7 = (com.server.auditor.ssh.client.synchronization.api.models.newcrypto.ObtainSecurityTokenResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            com.server.auditor.ssh.client.repositories.auth.n$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            return r7
        L6a:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            com.server.auditor.ssh.client.repositories.auth.n$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 org.json.JSONException -> L7c
            return r7
        L73:
            com.server.auditor.ssh.client.repositories.auth.n$b$c r8 = new com.server.auditor.ssh.client.repositories.auth.n$b$c
            r8.<init>(r7)
            goto L7e
        L79:
            com.server.auditor.ssh.client.repositories.auth.n$b$e r8 = com.server.auditor.ssh.client.repositories.auth.n.b.e.f38717a
            goto L7e
        L7c:
            com.server.auditor.ssh.client.repositories.auth.n$b$i r8 = com.server.auditor.ssh.client.repositories.auth.n.b.i.f38721a
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.n.c(java.lang.String, zt.e):java.lang.Object");
    }
}

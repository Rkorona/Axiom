package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordRequest;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import iu.p;
import ju.t;
import org.json.JSONException;
import org.json.JSONObject;
import pv.e0;
import ut.m0;
import ut.s;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0583a f38573c = new C0583a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38574d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38576b;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.a$a, reason: collision with other inner class name */
    public static final class C0583a {
        public /* synthetic */ C0583a(ju.k kVar) {
            this();
        }

        private C0583a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.a$b$a, reason: collision with other inner class name */
        public static final class C0584a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0584a f38577a = new C0584a();

            private C0584a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0584a);
            }

            public int hashCode() {
                return 85623809;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.a$b$b, reason: collision with other inner class name */
        public static final class C0585b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38578a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0585b(String str) {
                super(null);
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.f38578a = str;
            }

            public final String a() {
                return this.f38578a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0585b) && t.b(this.f38578a, ((C0585b) obj).f38578a);
            }

            public int hashCode() {
                return this.f38578a.hashCode();
            }

            public String toString() {
                return "OtpTokenError(message=" + this.f38578a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AuthDevicePasswordResponse f38579a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AuthDevicePasswordResponse authDevicePasswordResponse) {
                super(null);
                t.f(authDevicePasswordResponse, "result");
                this.f38579a = authDevicePasswordResponse;
            }

            public final AuthDevicePasswordResponse a() {
                return this.f38579a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38579a, ((c) obj).f38579a);
            }

            public int hashCode() {
                return this.f38579a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f38579a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38580a;

            public d(int i10) {
                super(null);
                this.f38580a = i10;
            }

            public final int a() {
                return this.f38580a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f38580a == ((d) obj).f38580a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38580a);
            }

            public String toString() {
                return "ThrottlingError(seconds=" + this.f38580a + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f38581a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 804417360;
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
        /* synthetic */ Object f38582a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38584c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38582a = obj;
            this.f38584c |= RtlSpacingHelper.UNDEFINED;
            return a.this.a(null, null, null, null, null, null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuthDevicePasswordRequest f38587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, AuthDevicePasswordRequest authDevicePasswordRequest, zt.e eVar) {
            super(2, eVar);
            this.f38586b = syncRestInterface;
            this.f38587c = authDevicePasswordRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38586b, this.f38587c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38585a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38586b;
            AuthDevicePasswordRequest authDevicePasswordRequest = this.f38587c;
            this.f38585a = 1;
            Object objPostAuthDevicePassword = syncRestInterface.postAuthDevicePassword(authDevicePasswordRequest, this);
            return objPostAuthDevicePassword == objF ? objF : objPostAuthDevicePassword;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public a(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38575a = syncRestApiClientFactory;
        this.f38576b = g0Var;
    }

    private final b b(com.server.auditor.ssh.client.models.e eVar) {
        if (eVar instanceof w) {
            Integer numE = w.e((w) eVar, null, 1, null);
            return numE != null ? new b.d(numE.intValue()) : b.e.f38581a;
        }
        if ((eVar instanceof com.server.auditor.ssh.client.models.h) || (eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof y) || (eVar instanceof z) || (eVar instanceof com.server.auditor.ssh.client.models.l)) {
            return d(eVar.b(), eVar.a());
        }
        throw new s();
    }

    private final b c(e0 e0Var) {
        String string = TermiusApplication.F().getString(R.string.otp_invalid_error);
        t.e(string, "getString(...)");
        try {
            String strString = e0Var != null ? e0Var.string() : null;
            if (strString == null) {
                strString = "";
            }
            JSONObject jSONObject = new JSONObject(strString);
            if (jSONObject.has(SyncConstants.Bundle.OTP_TOKEN)) {
                string = jSONObject.getJSONArray(SyncConstants.Bundle.OTP_TOKEN).getString(0);
            }
        } catch (JSONException unused) {
        }
        t.c(string);
        return new b.C0585b(string);
    }

    private final b d(int i10, e0 e0Var) {
        return i10 == 487 ? c(e0Var) : b.e.f38581a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, zt.e r14) {
        /*
            r5 = this;
            boolean r0 = r14 instanceof com.server.auditor.ssh.client.repositories.auth.a.c
            if (r0 == 0) goto L13
            r0 = r14
            com.server.auditor.ssh.client.repositories.auth.a$c r0 = (com.server.auditor.ssh.client.repositories.auth.a.c) r0
            int r1 = r0.f38584c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38584c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.a$c r0 = new com.server.auditor.ssh.client.repositories.auth.a$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f38582a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38584c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r14)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            goto L64
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ut.x.b(r14)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r14 = r5.f38575a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r14 = r14.createAuthenticatedRestApiClient()
            if (r14 != 0) goto L3f
            com.server.auditor.ssh.client.repositories.auth.a$b$e r6 = com.server.auditor.ssh.client.repositories.auth.a.b.e.f38581a
            return r6
        L3f:
            r2 = r9
            r9 = r7
            com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordRequest r7 = new com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordRequest     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r4 = r10
            com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest r10 = new com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r10.<init>(r8, r2)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r8 = r11
            com.server.auditor.ssh.client.synchronization.api.models.changepassword.CryptoSpecRequest r11 = new com.server.auditor.ssh.client.synchronization.api.models.changepassword.CryptoSpecRequest     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r11.<init>(r4, r8)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            wu.g0 r6 = r5.f38576b     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            com.server.auditor.ssh.client.repositories.auth.a$d r8 = new com.server.auditor.ssh.client.repositories.auth.a$d     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r9 = 0
            r8.<init>(r14, r7, r9)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r0.f38584c = r3     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            java.lang.Object r14 = wu.i.g(r6, r8, r0)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            if (r14 != r1) goto L64
            return r1
        L64:
            retrofit2.Response r14 = (retrofit2.Response) r14     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            java.lang.Object r6 = r14.body()     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordResponse r6 = (com.server.auditor.ssh.client.synchronization.api.models.changepassword.AuthDevicePasswordResponse) r6     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            boolean r7 = r14.isSuccessful()     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            if (r7 == 0) goto L7a
            if (r6 == 0) goto L7a
            com.server.auditor.ssh.client.repositories.auth.a$b$c r7 = new com.server.auditor.ssh.client.repositories.auth.a$b$c     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            r7.<init>(r6)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            return r7
        L7a:
            com.server.auditor.ssh.client.models.e r6 = com.server.auditor.ssh.client.models.f.a(r14)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            com.server.auditor.ssh.client.repositories.auth.a$b r6 = r5.b(r6)     // Catch: java.lang.Exception -> L83 java.io.IOException -> L86
            return r6
        L83:
            com.server.auditor.ssh.client.repositories.auth.a$b$e r6 = com.server.auditor.ssh.client.repositories.auth.a.b.e.f38581a
            goto L88
        L86:
            com.server.auditor.ssh.client.repositories.auth.a$b$a r6 = com.server.auditor.ssh.client.repositories.auth.a.b.C0584a.f38577a
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

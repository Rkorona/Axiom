package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.UserAuthModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.AuthyTokenErrorModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.MinimalVersionErrorModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.UserLoginErrorModel;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import iu.p;
import ju.t;
import org.json.JSONException;
import org.json.JSONObject;
import pv.e0;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38637d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38638e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f38640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mv.b f38641c;

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
            private final Exception f38642a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38642a = exc;
            }

            public final Exception a() {
                return this.f38642a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f38642a, ((a) obj).f38642a);
            }

            public int hashCode() {
                return this.f38642a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38642a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.j$b$b, reason: collision with other inner class name */
        public static final class C0592b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38643a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0592b(String str) {
                super(null);
                t.f(str, "error");
                this.f38643a = str;
            }

            public final String a() {
                return this.f38643a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0592b) && t.b(this.f38643a, ((C0592b) obj).f38643a);
            }

            public int hashCode() {
                return this.f38643a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38643a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f38644a;

            public c(Integer num) {
                super(null);
                this.f38644a = num;
            }

            public final Integer a() {
                return this.f38644a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38644a, ((c) obj).f38644a);
            }

            public int hashCode() {
                Integer num = this.f38644a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "IsAuthBlocked(seconds=" + this.f38644a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38645b = MinimalVersionErrorModel.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final MinimalVersionErrorModel f38646a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(MinimalVersionErrorModel minimalVersionErrorModel) {
                super(null);
                t.f(minimalVersionErrorModel, "error");
                this.f38646a = minimalVersionErrorModel;
            }

            public final MinimalVersionErrorModel a() {
                return this.f38646a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f38646a, ((d) obj).f38646a);
            }

            public int hashCode() {
                return this.f38646a.hashCode();
            }

            public String toString() {
                return "MinimalVersionError(error=" + this.f38646a + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38647a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38647a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && t.b(this.f38647a, ((e) obj).f38647a);
            }

            public int hashCode() {
                return this.f38647a.hashCode();
            }

            public String toString() {
                return "NetworkError(exception=" + this.f38647a + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38648b = AuthyTokenErrorModel.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AuthyTokenErrorModel f38649a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(AuthyTokenErrorModel authyTokenErrorModel) {
                super(null);
                t.f(authyTokenErrorModel, "error");
                this.f38649a = authyTokenErrorModel;
            }

            public final AuthyTokenErrorModel a() {
                return this.f38649a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && t.b(this.f38649a, ((f) obj).f38649a);
            }

            public int hashCode() {
                return this.f38649a.hashCode();
            }

            public String toString() {
                return "OTPError(error=" + this.f38649a + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38650a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(null);
                t.f(str, "detail");
                this.f38650a = str;
            }

            public final String a() {
                return this.f38650a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && t.b(this.f38650a, ((g) obj).f38650a);
            }

            public int hashCode() {
                return this.f38650a.hashCode();
            }

            public String toString() {
                return "ScheduledToDelete(detail=" + this.f38650a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f38651a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Object obj) {
                super(null);
                t.f(obj, "result");
                this.f38651a = obj;
            }

            public final Object a() {
                return this.f38651a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && t.b(this.f38651a, ((h) obj).f38651a);
            }

            public int hashCode() {
                return this.f38651a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f38651a + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f38652a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return 1823542443;
            }

            public String toString() {
                return "UnknownError";
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
        /* synthetic */ Object f38653a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38655c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38653a = obj;
            this.f38655c |= RtlSpacingHelper.UNDEFINED;
            return j.this.d(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UserAuthModel f38658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, UserAuthModel userAuthModel, zt.e eVar) {
            super(2, eVar);
            this.f38657b = syncRestInterface;
            this.f38658c = userAuthModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38657b, this.f38658c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38656a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38657b;
            UserAuthModel userAuthModel = this.f38658c;
            this.f38656a = 1;
            Object objDeviceAuthNew = syncRestInterface.deviceAuthNew(userAuthModel, this);
            return objDeviceAuthNew == objF ? objF : objDeviceAuthNew;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public j(SyncRestApiClientFactory syncRestApiClientFactory, j1 j1Var, mv.b bVar) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(j1Var, "networkDispatcher");
        t.f(bVar, "jsonConverter");
        this.f38639a = syncRestApiClientFactory;
        this.f38640b = j1Var;
        this.f38641c = bVar;
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        b.C0592b c0592b;
        Object objB = null;
        if (eVar instanceof w) {
            return new b.c(w.e((w) eVar, null, 1, null));
        }
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h)) {
            if (eVar instanceof y) {
                return c((y) eVar);
            }
            if ((eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof com.server.auditor.ssh.client.models.m)) {
                return b.i.f38652a;
            }
            if (!(eVar instanceof z)) {
                throw new s();
            }
            z zVar = (z) eVar;
            return b(zVar.b(), zVar.a());
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = eVar.a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(UserLoginErrorModel.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
        }
        UserLoginErrorModel userLoginErrorModel = (UserLoginErrorModel) objB;
        if (userLoginErrorModel != null) {
            String detail = userLoginErrorModel.getDetail();
            if (detail != null && !su.s.m0(detail)) {
                return new b.C0592b(detail);
            }
            String string = TermiusApplication.F().getString(R.string.error_wrong_login_password);
            t.e(string, "getString(...)");
            c0592b = new b.C0592b(string);
        } else {
            String string2 = TermiusApplication.F().getString(R.string.login_registration_unexpected_error);
            t.e(string2, "getString(...)");
            c0592b = new b.C0592b(string2);
        }
        return c0592b;
    }

    private final b b(int i10, e0 e0Var) {
        String strString;
        String str = "";
        if (i10 == 487) {
            try {
                mv.b bVar = this.f38641c;
                strString = e0Var != null ? e0Var.string() : null;
                if (strString != null) {
                    str = strString;
                }
                bVar.a();
                return new b.f((AuthyTokenErrorModel) bVar.b(AuthyTokenErrorModel.Companion.serializer(), str));
            } catch (IllegalArgumentException e10) {
                return new b.a(e10);
            }
        }
        if (i10 != 488) {
            if (i10 != 490) {
                return b.i.f38652a;
            }
            try {
                mv.b bVar2 = this.f38641c;
                strString = e0Var != null ? e0Var.string() : null;
                if (strString != null) {
                    str = strString;
                }
                bVar2.a();
                return new b.d((MinimalVersionErrorModel) bVar2.b(MinimalVersionErrorModel.Companion.serializer(), str));
            } catch (IllegalArgumentException e11) {
                return new b.a(e11);
            }
        }
        try {
            strString = e0Var != null ? e0Var.string() : null;
            if (strString != null) {
                str = strString;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("detail")) {
                return new b.g("User scheduled to deletion.");
            }
            String string = jSONObject.getString("detail");
            t.e(string, "getString(...)");
            return new b.g(string);
        } catch (JSONException unused) {
            return new b.g("User scheduled to deletion.");
        }
    }

    private final b c(y yVar) {
        Object objB;
        b aVar;
        String str = "";
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = yVar.a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(CommonApiErrorResponse.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        CommonApiErrorResponse commonApiErrorResponse = (CommonApiErrorResponse) objB;
        if ((commonApiErrorResponse != null ? commonApiErrorResponse.getErrorMessage() : null) != null) {
            return new b.C0592b(commonApiErrorResponse.getErrorMessage());
        }
        try {
            e0 e0VarA2 = yVar.a();
            String strString2 = e0VarA2 != null ? e0VarA2.string() : null;
            if (strString2 != null) {
                str = strString2;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error")) {
                String string = jSONObject.getString("error");
                t.c(string);
                aVar = new b.C0592b(string);
            } else {
                aVar = b.i.f38652a;
            }
        } catch (JSONException e10) {
            aVar = new b.a(e10);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.server.auditor.ssh.client.synchronization.api.models.user.UserAuthModel r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.j.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.j$c r0 = (com.server.auditor.ssh.client.repositories.auth.j.c) r0
            int r1 = r0.f38655c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38655c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.j$c r0 = new com.server.auditor.ssh.client.repositories.auth.j$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38653a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38655c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            goto L4f
        L29:
            r7 = move-exception
            goto L6e
        L2b:
            r7 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38639a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createRegularRestApiClient()
            wu.j1 r2 = r6.f38640b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            com.server.auditor.ssh.client.repositories.auth.j$d r4 = new com.server.auditor.ssh.client.repositories.auth.j$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            r0.f38655c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            if (r8 != r1) goto L4f
            return r1
        L4f:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel r7 = (com.server.auditor.ssh.client.synchronization.api.models.user.AuthResponseModel) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            boolean r0 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            if (r0 == 0) goto L65
            if (r7 == 0) goto L65
            com.server.auditor.ssh.client.repositories.auth.j$b$h r8 = new com.server.auditor.ssh.client.repositories.auth.j$b$h     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            r8.<init>(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            return r8
        L65:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            com.server.auditor.ssh.client.repositories.auth.j$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            return r7
        L6e:
            com.server.auditor.ssh.client.repositories.auth.j$b$a r8 = new com.server.auditor.ssh.client.repositories.auth.j$b$a
            r8.<init>(r7)
            goto L79
        L74:
            com.server.auditor.ssh.client.repositories.auth.j$b$e r8 = new com.server.auditor.ssh.client.repositories.auth.j$b$e
            r8.<init>(r7)
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.j.d(com.server.auditor.ssh.client.synchronization.api.models.user.UserAuthModel, zt.e):java.lang.Object");
    }
}

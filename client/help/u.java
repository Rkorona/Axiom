package com.server.auditor.ssh.client.help;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import ut.m0;
import wu.i0;
import wu.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27098c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27099d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f27100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f27101b;

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
            public static final a f27102a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 553161819;
            }

            public String toString() {
                return "BadRequestError";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.help.u$b$b, reason: collision with other inner class name */
        public static final class C0427b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f27103a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0427b(Exception exc) {
                super(null);
                ju.t.f(exc, "exception");
                this.f27103a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0427b) && ju.t.b(this.f27103a, ((C0427b) obj).f27103a);
            }

            public int hashCode() {
                return this.f27103a.hashCode();
            }

            public String toString() {
                return "Failed(exception=" + this.f27103a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f27104a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1605294715;
            }

            public String toString() {
                return "JWTCreationError";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27105a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -755209571;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f27106a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -2135778107;
            }

            public String toString() {
                return "NotAuthUserError";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ProductBoardTokenResponseModel f27107a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(ProductBoardTokenResponseModel productBoardTokenResponseModel) {
                super(null);
                ju.t.f(productBoardTokenResponseModel, "tokenModel");
                this.f27107a = productBoardTokenResponseModel;
            }

            public final ProductBoardTokenResponseModel a() {
                return this.f27107a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && ju.t.b(this.f27107a, ((f) obj).f27107a);
            }

            public int hashCode() {
                return this.f27107a.hashCode();
            }

            public String toString() {
                return "Success(tokenModel=" + this.f27107a + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f27108a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -213535948;
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
        /* synthetic */ Object f27109a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27111c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27109a = obj;
            this.f27111c |= RtlSpacingHelper.UNDEFINED;
            return u.this.a(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f27113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f27113b = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f27113b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27112a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            SyncRestInterface syncRestInterface = this.f27113b;
            this.f27112a = 1;
            Object productBoardToken = syncRestInterface.getProductBoardToken(this);
            return productBoardToken == objF ? objF : productBoardToken;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public u(SyncRestApiClientFactory syncRestApiClientFactory, j1 j1Var) {
        ju.t.f(syncRestApiClientFactory, "restApiClientFactory");
        ju.t.f(j1Var, "networkDispatcher");
        this.f27100a = syncRestApiClientFactory;
        this.f27101b = j1Var;
    }

    private final b b(com.server.auditor.ssh.client.models.e eVar) {
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            return b.a.f27102a;
        }
        if (eVar instanceof com.server.auditor.ssh.client.models.y) {
            return b.e.f27106a;
        }
        if ((eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof com.server.auditor.ssh.client.models.w) || (eVar instanceof com.server.auditor.ssh.client.models.z)) {
            return c(eVar.b());
        }
        throw new ut.s();
    }

    private final b c(int i10) {
        return i10 == 424 ? b.c.f27104a : b.g.f27108a;
    }

    private final b d(ProductBoardTokenResponseModel productBoardTokenResponseModel) {
        return productBoardTokenResponseModel != null ? new b.f(productBoardTokenResponseModel) : b.g.f27108a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.help.u.c
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.help.u$c r0 = (com.server.auditor.ssh.client.help.u.c) r0
            int r1 = r0.f27111c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27111c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.help.u$c r0 = new com.server.auditor.ssh.client.help.u$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27109a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f27111c
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
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r7 = r6.f27100a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r7 = r7.createAuthenticatedRestApiClient()
            if (r7 != 0) goto L41
            com.server.auditor.ssh.client.help.u$b$g r7 = com.server.auditor.ssh.client.help.u.b.g.f27108a
            return r7
        L41:
            wu.j1 r2 = r6.f27101b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.help.u$d r4 = new com.server.auditor.ssh.client.help.u$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            r0.f27111c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            java.lang.Object r7 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            if (r7 != r1) goto L52
            return r1
        L52:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            boolean r0 = r7.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            if (r0 == 0) goto L65
            java.lang.Object r7 = r7.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.help.ProductBoardTokenResponseModel r7 = (com.server.auditor.ssh.client.help.ProductBoardTokenResponseModel) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.help.u$b r7 = r6.d(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            return r7
        L65:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            com.server.auditor.ssh.client.help.u$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L74 org.json.JSONException -> L77
            return r7
        L6e:
            com.server.auditor.ssh.client.help.u$b$b r0 = new com.server.auditor.ssh.client.help.u$b$b
            r0.<init>(r7)
            goto L79
        L74:
            com.server.auditor.ssh.client.help.u$b$d r0 = com.server.auditor.ssh.client.help.u.b.d.f27105a
            goto L79
        L77:
            com.server.auditor.ssh.client.help.u$b$g r0 = com.server.auditor.ssh.client.help.u.b.g.f27108a
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.help.u.a(zt.e):java.lang.Object");
    }
}

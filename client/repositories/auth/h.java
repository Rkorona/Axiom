package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.sso.DetectFirebaseActionModel;
import com.server.auditor.ssh.client.synchronization.api.models.sso.FirebaseBadRequestModel;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import iu.p;
import ju.t;
import pv.e0;
import ut.m0;
import ut.s;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38620c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38621d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38623b;

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
            private final Exception f38624a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38624a = exc;
            }

            public final Exception a() {
                return this.f38624a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f38624a, ((a) obj).f38624a);
            }

            public int hashCode() {
                return this.f38624a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38624a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.h$b$b, reason: collision with other inner class name */
        public static final class C0591b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38625a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0591b(String str) {
                super(null);
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.f38625a = str;
            }

            public final String a() {
                return this.f38625a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0591b) && t.b(this.f38625a, ((C0591b) obj).f38625a);
            }

            public int hashCode() {
                return this.f38625a.hashCode();
            }

            public String toString() {
                return "Failed(message=" + this.f38625a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f38626a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 604895805;
            }

            public String toString() {
                return "NetworkException";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38627a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                t.f(str, "action");
                this.f38627a = str;
            }

            public final String a() {
                return this.f38627a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f38627a, ((d) obj).f38627a);
            }

            public int hashCode() {
                return this.f38627a.hashCode();
            }

            public String toString() {
                return "Success(action=" + this.f38627a + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38628a;

            public e(int i10) {
                super(null);
                this.f38628a = i10;
            }

            public final int a() {
                return this.f38628a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f38628a == ((e) obj).f38628a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38628a);
            }

            public String toString() {
                return "ThrottledError(seconds=" + this.f38628a + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f38629a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1316909115;
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
        /* synthetic */ Object f38630a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38632c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38630a = obj;
            this.f38632c |= RtlSpacingHelper.UNDEFINED;
            return h.this.a(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f38634b = str;
            this.f38635c = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38634b, this.f38635c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38633a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            DetectFirebaseActionModel detectFirebaseActionModel = new DetectFirebaseActionModel(this.f38634b);
            SyncRestInterface syncRestInterface = this.f38635c;
            this.f38633a = 1;
            Object objFirebaseDetectAction = syncRestInterface.firebaseDetectAction(detectFirebaseActionModel, this);
            return objFirebaseDetectAction == objF ? objF : objFirebaseDetectAction;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public h(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38622a = syncRestApiClientFactory;
        this.f38623b = g0Var;
    }

    private final b b(com.server.auditor.ssh.client.models.e eVar) {
        Object objB = null;
        if (!(eVar instanceof com.server.auditor.ssh.client.models.h)) {
            if (eVar instanceof w) {
                Integer numE = w.e((w) eVar, null, 1, null);
                return numE != null ? new b.e(numE.intValue()) : b.f.f38629a;
            }
            if ((eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof y) || (eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof z)) {
                return b.f.f38629a;
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
            objB = bVarS1.b(FirebaseBadRequestModel.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
        }
        FirebaseBadRequestModel firebaseBadRequestModel = (FirebaseBadRequestModel) objB;
        if (firebaseBadRequestModel == null) {
            return b.f.f38629a;
        }
        String errorMessage = firebaseBadRequestModel.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Invalid ID Token";
        }
        return new b.C0591b(errorMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.h.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.h$c r0 = (com.server.auditor.ssh.client.repositories.auth.h.c) r0
            int r1 = r0.f38632c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38632c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.h$c r0 = new com.server.auditor.ssh.client.repositories.auth.h$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38630a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38632c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            goto L4d
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
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38622a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createRegularRestApiClient()
            wu.g0 r2 = r6.f38623b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            com.server.auditor.ssh.client.repositories.auth.h$d r4 = new com.server.auditor.ssh.client.repositories.auth.h$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            r5 = 0
            r4.<init>(r7, r8, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            r0.f38632c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            if (r8 != r1) goto L4d
            return r1
        L4d:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            com.server.auditor.ssh.client.synchronization.api.models.sso.DetectFirebaseActionResponse r7 = (com.server.auditor.ssh.client.synchronization.api.models.sso.DetectFirebaseActionResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            if (r7 == 0) goto L67
            java.lang.String r7 = r7.getAction()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            com.server.auditor.ssh.client.repositories.auth.h$b$d r8 = new com.server.auditor.ssh.client.repositories.auth.h$b$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            r8.<init>(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            return r8
        L67:
            com.server.auditor.ssh.client.repositories.auth.h$b$f r7 = com.server.auditor.ssh.client.repositories.auth.h.b.f.f38629a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            return r7
        L6a:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            com.server.auditor.ssh.client.repositories.auth.h$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79
            return r7
        L73:
            com.server.auditor.ssh.client.repositories.auth.h$b$a r8 = new com.server.auditor.ssh.client.repositories.auth.h$b$a
            r8.<init>(r7)
            goto L7b
        L79:
            com.server.auditor.ssh.client.repositories.auth.h$b$c r8 = com.server.auditor.ssh.client.repositories.auth.h.b.c.f38626a
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.h.a(java.lang.String, zt.e):java.lang.Object");
    }
}

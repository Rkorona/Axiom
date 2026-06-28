package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.ResetPasswordBadRequestResponse;
import com.server.auditor.ssh.client.synchronization.api.models.user.ResetPasswordRequestModel;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import iu.p;
import java.io.IOException;
import ju.t;
import pv.e0;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f38693b;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.m$a$a, reason: collision with other inner class name */
        public static final class C0595a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38694a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0595a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38694a = exc;
            }

            public final Exception a() {
                return this.f38694a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0595a) && t.b(this.f38694a, ((C0595a) obj).f38694a);
            }

            public int hashCode() {
                return this.f38694a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38694a + ")";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38695a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                t.f(str, "error");
                this.f38695a = str;
            }

            public final String a() {
                return this.f38695a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.b(this.f38695a, ((b) obj).f38695a);
            }

            public int hashCode() {
                return this.f38695a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38695a + ")";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IOException f38696a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(IOException iOException) {
                super(null);
                t.f(iOException, "exception");
                this.f38696a = iOException;
            }

            public final IOException a() {
                return this.f38696a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38696a, ((c) obj).f38696a);
            }

            public int hashCode() {
                return this.f38696a.hashCode();
            }

            public String toString() {
                return "NetworkError(exception=" + this.f38696a + ")";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f38697a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1672608823;
            }

            public String toString() {
                return "Success";
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38698a;

            public e(int i10) {
                super(null);
                this.f38698a = i10;
            }

            public final int a() {
                return this.f38698a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f38698a == ((e) obj).f38698a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38698a);
            }

            public String toString() {
                return "ThrottlingError(seconds=" + this.f38698a + ")";
            }
        }

        public static final class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f38699a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -2109532118;
            }

            public String toString() {
                return "UnknownError";
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
        /* synthetic */ Object f38700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38702c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38700a = obj;
            this.f38702c |= RtlSpacingHelper.UNDEFINED;
            return m.this.c(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SyncRestInterface syncRestInterface, String str, zt.e eVar) {
            super(2, eVar);
            this.f38704b = syncRestInterface;
            this.f38705c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f38704b, this.f38705c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38703a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38704b;
            ResetPasswordRequestModel resetPasswordRequestModel = new ResetPasswordRequestModel(this.f38705c);
            this.f38703a = 1;
            Object objPostPasswordReset = syncRestInterface.postPasswordReset(resetPasswordRequestModel, this);
            return objPostPasswordReset == objF ? objF : objPostPasswordReset;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public m(SyncRestApiClientFactory syncRestApiClientFactory, j1 j1Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(j1Var, "networkDispatcher");
        this.f38692a = syncRestApiClientFactory;
        this.f38693b = j1Var;
    }

    private final a a(com.server.auditor.ssh.client.models.e eVar) {
        String str;
        str = "";
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                e0 e0VarA = eVar.a();
                String strString = e0VarA != null ? e0VarA.string() : null;
                if (strString != null) {
                    str = strString;
                }
                bVarS1.a();
                objB = bVarS1.b(ResetPasswordBadRequestResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused) {
            }
            ResetPasswordBadRequestResponse resetPasswordBadRequestResponse = (ResetPasswordBadRequestResponse) objB;
            return resetPasswordBadRequestResponse != null ? new a.b((String) v.p0(resetPasswordBadRequestResponse.getEmailErrors())) : a.f.f38699a;
        }
        if (eVar instanceof w) {
            w wVar = (w) eVar;
            Integer numE = w.e(wVar, null, 1, null);
            if (numE != null) {
                return new a.e(numE.intValue());
            }
            String strC = wVar.c();
            return (strC == null || s.m0(strC)) ? a.f.f38699a : new a.b(strC);
        }
        if (eVar instanceof com.server.auditor.ssh.client.models.m) {
            e0 e0VarA2 = ((com.server.auditor.ssh.client.models.m) eVar).a();
            objB = e0VarA2 != null ? e0VarA2.string() : null;
            return new a.b(objB != null ? objB : "");
        }
        if (eVar instanceof y) {
            e0 e0VarA3 = ((y) eVar).a();
            objB = e0VarA3 != null ? e0VarA3.string() : null;
            return new a.b(objB != null ? objB : "");
        }
        if ((eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof z)) {
            return a.f.f38699a;
        }
        throw new ut.s();
    }

    private final a b(Exception exc) {
        return new a.C0595a(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.m.b
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.m$b r0 = (com.server.auditor.ssh.client.repositories.auth.m.b) r0
            int r1 = r0.f38702c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38702c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.m$b r0 = new com.server.auditor.ssh.client.repositories.auth.m$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38700a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38702c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            goto L4f
        L29:
            r7 = move-exception
            goto L63
        L2b:
            r7 = move-exception
            goto L68
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38692a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createRegularRestApiClient()
            wu.j1 r2 = r6.f38693b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            com.server.auditor.ssh.client.repositories.auth.m$c r4 = new com.server.auditor.ssh.client.repositories.auth.m$c     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            r0.f38702c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            if (r8 != r1) goto L4f
            return r1
        L4f:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            if (r7 == 0) goto L5a
            com.server.auditor.ssh.client.repositories.auth.m$a$d r7 = com.server.auditor.ssh.client.repositories.auth.m.a.d.f38697a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            return r7
        L5a:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            com.server.auditor.ssh.client.repositories.auth.m$a r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L2b
            return r7
        L63:
            com.server.auditor.ssh.client.repositories.auth.m$a r7 = r6.b(r7)
            goto L6e
        L68:
            com.server.auditor.ssh.client.repositories.auth.m$a$c r8 = new com.server.auditor.ssh.client.repositories.auth.m$a$c
            r8.<init>(r7)
            r7 = r8
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.m.c(java.lang.String, zt.e):java.lang.Object");
    }
}

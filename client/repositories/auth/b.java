package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.CheckEmailModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.errormodels.CheckEmailHasESSOBadRequest;
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
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38588c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38589d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f38591b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0586b {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.b$b$a */
        public static final class a extends AbstractC0586b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38592a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f38592a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f38592a, ((a) obj).f38592a);
            }

            public int hashCode() {
                return this.f38592a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f38592a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.b$b$b, reason: collision with other inner class name */
        public static final class C0587b extends AbstractC0586b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38593a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0587b(String str) {
                super(null);
                t.f(str, "error");
                this.f38593a = str;
            }

            public final String a() {
                return this.f38593a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0587b) && t.b(this.f38593a, ((C0587b) obj).f38593a);
            }

            public int hashCode() {
                return this.f38593a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38593a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.b$b$c */
        public static final class c extends AbstractC0586b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f38594a;

            public c(boolean z10) {
                super(null);
                this.f38594a = z10;
            }

            public final boolean a() {
                return this.f38594a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f38594a == ((c) obj).f38594a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f38594a);
            }

            public String toString() {
                return "Success(hasEnterpriseSSO=" + this.f38594a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.b$b$d */
        public static final class d extends AbstractC0586b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38595a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.f38595a = str;
            }

            public final String a() {
                return this.f38595a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f38595a, ((d) obj).f38595a);
            }

            public int hashCode() {
                return this.f38595a.hashCode();
            }

            public String toString() {
                return "ThrottlingError(message=" + this.f38595a + ")";
            }
        }

        public /* synthetic */ AbstractC0586b(ju.k kVar) {
            this();
        }

        private AbstractC0586b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38596a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38598c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38596a = obj;
            this.f38598c |= RtlSpacingHelper.UNDEFINED;
            return b.this.a(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckEmailModel f38601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, CheckEmailModel checkEmailModel, zt.e eVar) {
            super(2, eVar);
            this.f38600b = syncRestInterface;
            this.f38601c = checkEmailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38600b, this.f38601c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38599a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38600b;
            CheckEmailModel checkEmailModel = this.f38601c;
            this.f38599a = 1;
            Object objCheckEmailHasESSO = syncRestInterface.checkEmailHasESSO(checkEmailModel, this);
            return objCheckEmailHasESSO == objF ? objF : objCheckEmailHasESSO;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public b(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f38590a = syncRestApiClientFactory;
        this.f38591b = g0Var;
    }

    private final AbstractC0586b b(com.server.auditor.ssh.client.models.e eVar) {
        String str;
        List<String> emailErrors;
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            Object objB = null;
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                e0 e0VarA = eVar.a();
                String strString = e0VarA != null ? e0VarA.string() : null;
                if (strString == null) {
                    strString = "";
                }
                bVarS1.a();
                objB = bVarS1.b(CheckEmailHasESSOBadRequest.Companion.serializer(), strString);
            } catch (IllegalArgumentException unused) {
            }
            CheckEmailHasESSOBadRequest checkEmailHasESSOBadRequest = (CheckEmailHasESSOBadRequest) objB;
            if (checkEmailHasESSOBadRequest == null || (emailErrors = checkEmailHasESSOBadRequest.getEmailErrors()) == null || (str = (String) v.r0(emailErrors)) == null) {
                str = "This field is required.";
            }
            return new AbstractC0586b.C0587b(str);
        }
        if (!(eVar instanceof w)) {
            if ((eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof y) || (eVar instanceof z)) {
                return new AbstractC0586b.C0587b("Something went wrong. Please try again later.");
            }
            throw new s();
        }
        String strC = ((w) eVar).c();
        if (strC != null) {
            return new AbstractC0586b.d(strC);
        }
        return new AbstractC0586b.C0587b("Unexpected error code: " + eVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.b.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.b$c r0 = (com.server.auditor.ssh.client.repositories.auth.b.c) r0
            int r1 = r0.f38598c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38598c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.b$c r0 = new com.server.auditor.ssh.client.repositories.auth.b$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38596a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38598c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29
            goto L53
        L29:
            r7 = move-exception
            goto L7b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r8)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38590a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createRegularRestApiClient()
            com.server.auditor.ssh.client.synchronization.api.models.CheckEmailModel r2 = new com.server.auditor.ssh.client.synchronization.api.models.CheckEmailModel     // Catch: java.lang.Exception -> L29
            r4 = 2
            r5 = 0
            r2.<init>(r7, r5, r4, r5)     // Catch: java.lang.Exception -> L29
            wu.g0 r7 = r6.f38591b     // Catch: java.lang.Exception -> L29
            com.server.auditor.ssh.client.repositories.auth.b$d r4 = new com.server.auditor.ssh.client.repositories.auth.b$d     // Catch: java.lang.Exception -> L29
            r4.<init>(r8, r2, r5)     // Catch: java.lang.Exception -> L29
            r0.f38598c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = wu.i.g(r7, r4, r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L53
            return r1
        L53:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29
            if (r7 == 0) goto L72
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29
            com.server.auditor.ssh.client.synchronization.api.models.SsoDomainCheckEmail r7 = (com.server.auditor.ssh.client.synchronization.api.models.SsoDomainCheckEmail) r7     // Catch: java.lang.Exception -> L29
            com.server.auditor.ssh.client.repositories.auth.b$b$c r8 = new com.server.auditor.ssh.client.repositories.auth.b$b$c     // Catch: java.lang.Exception -> L29
            r0 = 0
            if (r7 == 0) goto L6d
            boolean r7 = r7.getHasEnterpriseSSO()     // Catch: java.lang.Exception -> L29
            if (r7 != r3) goto L6d
            goto L6e
        L6d:
            r3 = r0
        L6e:
            r8.<init>(r3)     // Catch: java.lang.Exception -> L29
            return r8
        L72:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29
            com.server.auditor.ssh.client.repositories.auth.b$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29
            return r7
        L7b:
            com.server.auditor.ssh.client.repositories.auth.b$b$a r8 = new com.server.auditor.ssh.client.repositories.auth.b$b$a
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.b.a(java.lang.String, zt.e):java.lang.Object");
    }
}

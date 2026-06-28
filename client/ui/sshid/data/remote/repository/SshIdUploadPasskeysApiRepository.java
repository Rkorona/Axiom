package com.server.auditor.ssh.client.ui.sshid.data.remote.repository;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.h;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload;
import hg.b2;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import pv.e0;
import su.s;
import ut.m0;
import ut.x;
import wu.g0;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdUploadPasskeysApiRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41008c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41009d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f41010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f41011b;

    @Keep
    public static abstract class Result {
        public static final int $stable = 0;
        private final int code;

        public static final class a extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Exception f41013b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Exception exc) {
                super(i10, null);
                t.f(exc, "exception");
                this.f41012a = i10;
                this.f41013b = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f41012a == aVar.f41012a && t.b(this.f41013b, aVar.f41013b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f41012a) * 31) + this.f41013b.hashCode();
            }

            public String toString() {
                return "Error(responseCode=" + this.f41012a + ", exception=" + this.f41013b + ")";
            }
        }

        public static final class b extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f41015b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, String str) {
                super(i10, null);
                t.f(str, "errorBody");
                this.f41014a = i10;
                this.f41015b = str;
            }

            public final String a() {
                return this.f41015b;
            }

            public final int b() {
                return this.f41014a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f41014a == bVar.f41014a && t.b(this.f41015b, bVar.f41015b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f41014a) * 31) + this.f41015b.hashCode();
            }

            public String toString() {
                return "Failed(responseCode=" + this.f41014a + ", errorBody=" + this.f41015b + ")";
            }
        }

        public static final class c extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41016a;

            public c(int i10) {
                super(i10, null);
                this.f41016a = i10;
            }

            public final int a() {
                return this.f41016a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f41016a == ((c) obj).f41016a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f41016a);
            }

            public String toString() {
                return "NetworkError(responseCode=" + this.f41016a + ")";
            }
        }

        public static final class d extends Result {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f41017c = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SshIdResponse f41019b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, SshIdResponse sshIdResponse) {
                super(i10, null);
                t.f(sshIdResponse, "sshIdResponse");
                this.f41018a = i10;
                this.f41019b = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f41019b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f41018a == dVar.f41018a && t.b(this.f41019b, dVar.f41019b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f41018a) * 31) + this.f41019b.hashCode();
            }

            public String toString() {
                return "Success(responseCode=" + this.f41018a + ", sshIdResponse=" + this.f41019b + ")";
            }
        }

        public static final class e extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41020a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f41021b;

            public e(int i10, int i11) {
                super(i10, null);
                this.f41020a = i10;
                this.f41021b = i11;
            }

            public final int a() {
                return this.f41020a;
            }

            public final int b() {
                return this.f41021b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f41020a == eVar.f41020a && this.f41021b == eVar.f41021b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f41020a) * 31) + Integer.hashCode(this.f41021b);
            }

            public String toString() {
                return "ThrottledError(responseCode=" + this.f41020a + ", seconds=" + this.f41021b + ")";
            }
        }

        public static final class f extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f41023b;

            public f(int i10, String str) {
                super(i10, null);
                this.f41022a = i10;
                this.f41023b = str;
            }

            public final String a() {
                return this.f41023b;
            }

            public final int b() {
                return this.f41022a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f41022a == fVar.f41022a && t.b(this.f41023b, fVar.f41023b);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f41022a) * 31;
                String str = this.f41023b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "UnauthenticatedError(responseCode=" + this.f41022a + ", error=" + this.f41023b + ")";
            }
        }

        public static final class g extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41024a;

            public g(int i10) {
                super(i10, null);
                this.f41024a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f41024a == ((g) obj).f41024a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f41024a);
            }

            public String toString() {
                return "UnexpectedError(responseCode=" + this.f41024a + ")";
            }
        }

        public static final class h extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f41025a;

            public h(int i10) {
                super(i10, null);
                this.f41025a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f41025a == ((h) obj).f41025a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f41025a);
            }

            public String toString() {
                return "UnknownError(responseCode=" + this.f41025a + ")";
            }
        }

        public /* synthetic */ Result(int i10, k kVar) {
            this(i10);
        }

        public final int getCode() {
            return this.code;
        }

        private Result(int i10) {
            this.code = i10;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f41026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41027b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41029d;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41027b = obj;
            this.f41029d |= RtlSpacingHelper.UNDEFINED;
            return SshIdUploadPasskeysApiRepository.this.b(null, null, this);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f41031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdUploadPasskeysPayload f41032c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SyncRestInterface syncRestInterface, SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload, e eVar) {
            super(2, eVar);
            this.f41031b = syncRestInterface;
            this.f41032c = sshIdUploadPasskeysPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f41031b, this.f41032c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41030a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f41031b;
            SshIdUploadPasskeysPayload sshIdUploadPasskeysPayload = this.f41032c;
            this.f41030a = 1;
            Object objUploadSshIdPasskeys = syncRestInterface.uploadSshIdPasskeys(sshIdUploadPasskeysPayload, this);
            return objUploadSshIdPasskeys == objF ? objF : objUploadSshIdPasskeys;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdUploadPasskeysApiRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f41010a = syncRestApiClientFactory;
        this.f41011b = g0Var;
    }

    private final Result a(com.server.auditor.ssh.client.models.e eVar) {
        String str;
        Object objB;
        String errorMessage;
        str = "";
        Object objB2 = null;
        if (eVar instanceof h) {
            int iB = eVar.b();
            e0 e0VarA = ((h) eVar).a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            return new Result.b(iB, strString != null ? strString : "");
        }
        if (eVar instanceof y) {
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                e0 e0VarA2 = eVar.a();
                String strString2 = e0VarA2 != null ? e0VarA2.string() : null;
                if (strString2 != null) {
                    str = strString2;
                }
                bVarS1.a();
                objB = bVarS1.b(CommonApiErrorResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            CommonApiErrorResponse commonApiErrorResponse = (CommonApiErrorResponse) objB;
            return new Result.f(eVar.b(), commonApiErrorResponse != null ? commonApiErrorResponse.getErrorMessage() : null);
        }
        if (eVar instanceof com.server.auditor.ssh.client.models.m) {
            try {
                mv.b bVarS12 = b2.f52944a.s1();
                e0 e0VarA3 = eVar.a();
                String strString3 = e0VarA3 != null ? e0VarA3.string() : null;
                if (strString3 != null) {
                    str = strString3;
                }
                bVarS12.a();
                objB2 = bVarS12.b(CommonApiErrorResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused2) {
            }
            CommonApiErrorResponse commonApiErrorResponse2 = (CommonApiErrorResponse) objB2;
            return (commonApiErrorResponse2 == null || (errorMessage = commonApiErrorResponse2.getErrorMessage()) == null) ? new Result.b(eVar.b(), "Something went wrong. Please try again later.") : new Result.b(eVar.b(), errorMessage);
        }
        if (eVar instanceof w) {
            w wVar = (w) eVar;
            Integer numE = w.e(wVar, null, 1, null);
            if (numE != null) {
                return new Result.e(eVar.b(), numE.intValue());
            }
            String strC = wVar.c();
            return (strC == null || s.m0(strC)) ? new Result.g(eVar.b()) : new Result.b(eVar.b(), strC);
        }
        return new Result.b(eVar.b(), "Unexpected error code: " + eVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload r8, rg.h r9, zt.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.b
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$b r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.b) r0
            int r1 = r0.f41029d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41029d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$b r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41027b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41029d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f41026a
            r9 = r8
            rg.h r9 = (rg.h) r9
            ut.x.b(r10)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            goto L5f
        L2f:
            r8 = move-exception
            goto L8d
        L31:
            r8 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            ut.x.b(r10)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r10 = r7.f41010a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r10 = r10.createAuthenticatedRestApiClient()
            if (r10 != 0) goto L4c
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$h r8 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$h
            r8.<init>(r3)
            return r8
        L4c:
            wu.g0 r2 = r7.f41011b     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$c r5 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$c     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            r6 = 0
            r5.<init>(r10, r8, r6)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            r0.f41026a = r9     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            r0.f41029d = r4     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            java.lang.Object r10 = wu.i.g(r2, r5, r0)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            if (r10 != r1) goto L5f
            return r1
        L5f:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            java.lang.Object r8 = r10.body()     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r8 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r8     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            boolean r0 = r10.isSuccessful()     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            if (r0 == 0) goto L84
            if (r8 == 0) goto L84
            java.lang.Class<com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse> r0 = com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse.class
            java.lang.Object r8 = r9.k(r8, r0)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r8 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r8     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$d r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$d     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            int r10 = r10.code()     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            ju.t.c(r8)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            r9.<init>(r10, r8)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            return r9
        L84:
            com.server.auditor.ssh.client.models.e r8 = com.server.auditor.ssh.client.models.f.a(r10)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result r8 = r7.a(r8)     // Catch: java.lang.Exception -> L2f hv.q -> L31 java.io.IOException -> L94
            return r8
        L8d:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$a r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$a
            r9.<init>(r3, r8)
            goto L9a
        L93:
            throw r8
        L94:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$c r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository$Result$c
            r8 = -1
            r9.<init>(r8)
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUploadPasskeysApiRepository.b(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUploadPasskeysPayload, rg.h, zt.e):java.lang.Object");
    }
}

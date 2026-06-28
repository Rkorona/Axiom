package com.server.auditor.ssh.client.app.repo;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.h;
import com.server.auditor.ssh.client.models.l;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kotlin.coroutines.jvm.internal.m;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.m0;
import ut.s;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class NewCryptoCodeRepo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21471c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21472d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f21473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f21474b;

    @p
    public static final class VerificationCodeError {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String detail;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21476b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21475a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.VerificationCodeError", aVar, 1);
                i2Var.r("detail", false);
                descriptor = i2Var;
                f21476b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VerificationCodeError deserialize(e eVar) {
                String strB;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            strB = cVarD.B(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new VerificationCodeError(i10, strB, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, VerificationCodeError verificationCodeError) {
                t.f(fVar, "encoder");
                t.f(verificationCodeError, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                VerificationCodeError.write$Self$Termius_app_googleProductionRelease(verificationCodeError, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21475a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ VerificationCodeError(int i10, String str, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f21475a.getDescriptor());
            }
            this.detail = str;
        }

        public static /* synthetic */ VerificationCodeError copy$default(VerificationCodeError verificationCodeError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verificationCodeError.detail;
            }
            return verificationCodeError.copy(str);
        }

        @o("detail")
        public static /* synthetic */ void getDetail$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VerificationCodeError verificationCodeError, kv.d dVar, f fVar) {
            dVar.f(fVar, 0, verificationCodeError.detail);
        }

        public final String component1() {
            return this.detail;
        }

        public final VerificationCodeError copy(String str) {
            t.f(str, "detail");
            return new VerificationCodeError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerificationCodeError) && t.b(this.detail, ((VerificationCodeError) obj).detail);
        }

        public final String getDetail() {
            return this.detail;
        }

        public int hashCode() {
            return this.detail.hashCode();
        }

        public String toString() {
            return "VerificationCodeError(detail=" + this.detail + ")";
        }

        public VerificationCodeError(String str) {
            t.f(str, "detail");
            this.detail = str;
        }
    }

    @p
    public static final class VerificationCodeResponse {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String nextRetryAvailableAt;
        private final String now;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21478b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21477a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.VerificationCodeResponse", aVar, 2);
                i2Var.r("now", false);
                i2Var.r("next_retry_available_at", false);
                descriptor = i2Var;
                f21478b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VerificationCodeResponse deserialize(e eVar) {
                String strB;
                String strB2;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    strB2 = cVarD.B(fVar, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    String strB3 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            strB3 = cVarD.B(fVar, 1);
                            i11 |= 2;
                        }
                    }
                    strB2 = strB3;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new VerificationCodeResponse(i10, strB, strB2, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, VerificationCodeResponse verificationCodeResponse) {
                t.f(fVar, "encoder");
                t.f(verificationCodeResponse, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                VerificationCodeResponse.write$Self$Termius_app_googleProductionRelease(verificationCodeResponse, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{x2Var, x2Var};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21477a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ VerificationCodeResponse(int i10, String str, String str2, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f21477a.getDescriptor());
            }
            this.now = str;
            this.nextRetryAvailableAt = str2;
        }

        public static /* synthetic */ VerificationCodeResponse copy$default(VerificationCodeResponse verificationCodeResponse, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verificationCodeResponse.now;
            }
            if ((i10 & 2) != 0) {
                str2 = verificationCodeResponse.nextRetryAvailableAt;
            }
            return verificationCodeResponse.copy(str, str2);
        }

        @o("next_retry_available_at")
        public static /* synthetic */ void getNextRetryAvailableAt$annotations() {
        }

        @o("now")
        public static /* synthetic */ void getNow$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VerificationCodeResponse verificationCodeResponse, kv.d dVar, f fVar) {
            dVar.f(fVar, 0, verificationCodeResponse.now);
            dVar.f(fVar, 1, verificationCodeResponse.nextRetryAvailableAt);
        }

        public final String component1() {
            return this.now;
        }

        public final String component2() {
            return this.nextRetryAvailableAt;
        }

        public final VerificationCodeResponse copy(String str, String str2) {
            t.f(str, "now");
            t.f(str2, "nextRetryAvailableAt");
            return new VerificationCodeResponse(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerificationCodeResponse)) {
                return false;
            }
            VerificationCodeResponse verificationCodeResponse = (VerificationCodeResponse) obj;
            return t.b(this.now, verificationCodeResponse.now) && t.b(this.nextRetryAvailableAt, verificationCodeResponse.nextRetryAvailableAt);
        }

        public final String getNextRetryAvailableAt() {
            return this.nextRetryAvailableAt;
        }

        public final String getNow() {
            return this.now;
        }

        public int hashCode() {
            return (this.now.hashCode() * 31) + this.nextRetryAvailableAt.hashCode();
        }

        public String toString() {
            return "VerificationCodeResponse(now=" + this.now + ", nextRetryAvailableAt=" + this.nextRetryAvailableAt + ")";
        }

        public VerificationCodeResponse(String str, String str2) {
            t.f(str, "now");
            t.f(str2, "nextRetryAvailableAt");
            this.now = str;
            this.nextRetryAvailableAt = str2;
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$a, reason: collision with other inner class name */
        public static final class C0321a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VerificationCodeError f21479a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0321a(VerificationCodeError verificationCodeError) {
                super(null);
                t.f(verificationCodeError, "response");
                this.f21479a = verificationCodeError;
            }

            public final VerificationCodeError a() {
                return this.f21479a;
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f21480a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(null);
                t.f(exc, "e");
                this.f21480a = exc;
            }

            public final Exception a() {
                return this.f21480a;
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f21481a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1070049876;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VerificationCodeResponse f21482a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(VerificationCodeResponse verificationCodeResponse) {
                super(null);
                t.f(verificationCodeResponse, "response");
                this.f21482a = verificationCodeResponse;
            }

            public final VerificationCodeResponse a() {
                return this.f21482a;
            }
        }

        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f21483a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(null);
                t.f(str, "details");
                this.f21483a = str;
            }

            public final String a() {
                return this.f21483a;
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21486c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21484a = obj;
            this.f21486c |= RtlSpacingHelper.UNDEFINED;
            return NewCryptoCodeRepo.this.b(this);
        }
    }

    static final class d extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f21488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f21488b = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f21488b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21487a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f21488b;
            this.f21487a = 1;
            Object objRequestSendingVerificationCode = syncRestInterface.requestSendingVerificationCode(this);
            return objRequestSendingVerificationCode == objF ? objF : objRequestSendingVerificationCode;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public NewCryptoCodeRepo(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f21473a = syncRestApiClientFactory;
        this.f21474b = g0Var;
    }

    private final a a(com.server.auditor.ssh.client.models.e eVar) {
        String strString;
        if (eVar instanceof w) {
            String strC = ((w) eVar).c();
            if (strC == null) {
                strC = "";
            }
            return new a.e(strC);
        }
        if (!(eVar instanceof h) && !(eVar instanceof com.server.auditor.ssh.client.models.m) && !(eVar instanceof y) && !(eVar instanceof l) && !(eVar instanceof z)) {
            throw new s();
        }
        pv.e0 e0VarA = eVar.a();
        if (e0VarA == null || (strString = e0VarA.string()) == null) {
            strString = "Unexpected error.";
        }
        return new a.C0321a(new VerificationCodeError(strString));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.c
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$c r0 = (com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.c) r0
            int r1 = r0.f21486c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21486c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$c r0 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21484a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21486c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            goto L5c
        L29:
            r7 = move-exception
            goto L88
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            ut.x.b(r7)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r7 = r6.f21473a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r7 = r7.createAuthenticatedRestApiClient()
            if (r7 != 0) goto L4b
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$a r7 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$a
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$VerificationCodeError r0 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$VerificationCodeError
            java.lang.String r1 = "Cannot initialize request."
            r0.<init>(r1)
            r7.<init>(r0)
            return r7
        L4b:
            wu.g0 r2 = r6.f21474b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$d r4 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            r0.f21486c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            java.lang.Object r7 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            if (r7 != r1) goto L5c
            return r1
        L5c:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            boolean r0 = r7.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            if (r0 == 0) goto L7f
            java.lang.Object r7 = r7.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$VerificationCodeResponse r7 = (com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.VerificationCodeResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            if (r7 == 0) goto L72
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$d r0 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            r0.<init>(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            return r0
        L72:
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$a r7 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$a     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$VerificationCodeError r0 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$VerificationCodeError     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            java.lang.String r1 = "Unexpected error."
            r0.<init>(r1)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            r7.<init>(r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            return r7
        L7f:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L8e
            return r7
        L88:
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$b r0 = new com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$b
            r0.<init>(r7)
            goto L90
        L8e:
            com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo$a$c r0 = com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.a.c.f21481a
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.app.repo.NewCryptoCodeRepo.b(zt.e):java.lang.Object");
    }
}

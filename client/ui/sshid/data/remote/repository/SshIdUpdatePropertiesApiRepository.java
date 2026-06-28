package com.server.auditor.ssh.client.ui.sshid.data.remote.repository;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.synchronization.FailedToEncryptException;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import iu.l;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import pv.e0;
import retrofit2.Response;
import rg.h;
import su.s;
import ut.m0;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdUpdatePropertiesApiRepository {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40974d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40975e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f40976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f40977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f40978c;

    @Keep
    public static abstract class Result {
        public static final int $stable = 0;
        private final int code;

        public static final class a extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Exception f40980b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Exception exc) {
                super(i10, null);
                t.f(exc, "exception");
                this.f40979a = i10;
                this.f40980b = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f40979a == aVar.f40979a && t.b(this.f40980b, aVar.f40980b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40979a) * 31) + this.f40980b.hashCode();
            }

            public String toString() {
                return "Error(responseCode=" + this.f40979a + ", exception=" + this.f40980b + ")";
            }
        }

        public static final class b extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40982b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, String str) {
                super(i10, null);
                t.f(str, "errorBody");
                this.f40981a = i10;
                this.f40982b = str;
            }

            public final String a() {
                return this.f40982b;
            }

            public final int b() {
                return this.f40981a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f40981a == bVar.f40981a && t.b(this.f40982b, bVar.f40982b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40981a) * 31) + this.f40982b.hashCode();
            }

            public String toString() {
                return "Failed(responseCode=" + this.f40981a + ", errorBody=" + this.f40982b + ")";
            }
        }

        public static final class c extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40983a;

            public c(int i10) {
                super(i10, null);
                this.f40983a = i10;
            }

            public final int a() {
                return this.f40983a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f40983a == ((c) obj).f40983a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40983a);
            }

            public String toString() {
                return "NetworkError(responseCode=" + this.f40983a + ")";
            }
        }

        public static final class d extends Result {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f40984c = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SshIdResponse f40986b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, SshIdResponse sshIdResponse) {
                super(i10, null);
                t.f(sshIdResponse, "sshIdData");
                this.f40985a = i10;
                this.f40986b = sshIdResponse;
            }

            public final int a() {
                return this.f40985a;
            }

            public final SshIdResponse b() {
                return this.f40986b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f40985a == dVar.f40985a && t.b(this.f40986b, dVar.f40986b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40985a) * 31) + this.f40986b.hashCode();
            }

            public String toString() {
                return "Success(responseCode=" + this.f40985a + ", sshIdData=" + this.f40986b + ")";
            }
        }

        public static final class e extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f40988b;

            public e(int i10, int i11) {
                super(i10, null);
                this.f40987a = i10;
                this.f40988b = i11;
            }

            public final int a() {
                return this.f40987a;
            }

            public final int b() {
                return this.f40988b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f40987a == eVar.f40987a && this.f40988b == eVar.f40988b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40987a) * 31) + Integer.hashCode(this.f40988b);
            }

            public String toString() {
                return "ThrottledError(responseCode=" + this.f40987a + ", seconds=" + this.f40988b + ")";
            }
        }

        public static final class f extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40989a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40990b;

            public f(int i10, String str) {
                super(i10, null);
                this.f40989a = i10;
                this.f40990b = str;
            }

            public final String a() {
                return this.f40990b;
            }

            public final int b() {
                return this.f40989a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f40989a == fVar.f40989a && t.b(this.f40990b, fVar.f40990b);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f40989a) * 31;
                String str = this.f40990b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "UnauthenticatedError(responseCode=" + this.f40989a + ", error=" + this.f40990b + ")";
            }
        }

        public static final class g extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40991a;

            public g(int i10) {
                super(i10, null);
                this.f40991a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f40991a == ((g) obj).f40991a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40991a);
            }

            public String toString() {
                return "UnexpectedError(responseCode=" + this.f40991a + ")";
            }
        }

        public static final class h extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40992a;

            public h(int i10) {
                super(i10, null);
                this.f40992a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f40992a == ((h) obj).f40992a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40992a);
            }

            public String toString() {
                return "UnknownError(responseCode=" + this.f40992a + ")";
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

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40994b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40996d;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40994b = obj;
            this.f40996d |= RtlSpacingHelper.UNDEFINED;
            return SshIdUpdatePropertiesApiRepository.this.f(null, null, this);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40997a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdUpdateCaPayload f40999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f41000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f41001e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SshIdUpdateCaPayload sshIdUpdateCaPayload, h hVar, SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f40999c = sshIdUpdateCaPayload;
            this.f41000d = hVar;
            this.f41001e = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdUpdatePropertiesApiRepository.this.new c(this.f40999c, this.f41000d, this.f41001e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, FailedToEncryptException {
            Object objF = au.b.f();
            int i10 = this.f40997a;
            try {
                if (i10 == 0) {
                    x.b(obj);
                    SshIdUpdatePropertiesApiRepository.this.f40978c.invoke(Avo.SSHidSetUpStep.ENCRYPTING_C_A);
                    SshIdUpdateCaPayload sshIdUpdateCaPayloadD = SshIdUpdatePropertiesApiRepository.this.d(this.f40999c, this.f41000d);
                    SshIdUpdatePropertiesApiRepository.this.f40978c.invoke(Avo.SSHidSetUpStep.SENDING_SS_HID_CREATE_REQUEST);
                    SyncRestInterface syncRestInterface = this.f41001e;
                    this.f40997a = 1;
                    obj = syncRestInterface.updateSshIdCa(sshIdUpdateCaPayloadD, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(obj);
                }
                return (Response) obj;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41002a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41004c;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41002a = obj;
            this.f41004c |= RtlSpacingHelper.UNDEFINED;
            return SshIdUpdatePropertiesApiRepository.this.g(null, this);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f41006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdUpdatePropertiesPayload f41007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SyncRestInterface syncRestInterface, SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload, zt.e eVar) {
            super(2, eVar);
            this.f41006b = syncRestInterface;
            this.f41007c = sshIdUpdatePropertiesPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f41006b, this.f41007c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41005a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f41006b;
            SshIdUpdatePropertiesPayload sshIdUpdatePropertiesPayload = this.f41007c;
            this.f41005a = 1;
            Object objUpdateSshIdProperties = syncRestInterface.updateSshIdProperties(sshIdUpdatePropertiesPayload, this);
            return objUpdateSshIdProperties == objF ? objF : objUpdateSshIdProperties;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdUpdatePropertiesApiRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var, l lVar) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        t.f(lVar, "onUpdateSshSetupStep");
        this.f40976a = syncRestApiClientFactory;
        this.f40977b = g0Var;
        this.f40978c = lVar;
    }

    private final SshIdResponse c(SshIdResponse sshIdResponse, h hVar) {
        Object objK = hVar.k(sshIdResponse, SshIdResponse.class);
        t.e(objK, "decrypt(...)");
        return (SshIdResponse) objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshIdUpdateCaPayload d(SshIdUpdateCaPayload sshIdUpdateCaPayload, h hVar) throws IllegalAccessException, FailedToEncryptException {
        Object objG = hVar.G(sshIdUpdateCaPayload, SshIdUpdateCaPayload.class);
        t.e(objG, "encrypt(...)");
        return (SshIdUpdateCaPayload) objG;
    }

    private final Result e(com.server.auditor.ssh.client.models.e eVar) {
        String str;
        Object objB;
        String errorMessage;
        str = "";
        Object objB2 = null;
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            int iB = eVar.b();
            e0 e0VarA = ((com.server.auditor.ssh.client.models.h) eVar).a();
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[Catch: Exception -> 0x007a, q -> 0x007d, IOException -> 0x00b9, TRY_ENTER, TryCatch #1 {q -> 0x007d, blocks: (B:31:0x006e, B:34:0x0074, B:39:0x0080, B:44:0x009d, B:45:0x00a3, B:27:0x005f), top: B:56:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[Catch: Exception -> 0x007a, q -> 0x007d, IOException -> 0x00b9, TRY_LEAVE, TryCatch #1 {q -> 0x007d, blocks: (B:31:0x006e, B:34:0x0074, B:39:0x0080, B:44:0x009d, B:45:0x00a3, B:27:0x005f), top: B:56:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload r13, rg.h r14, zt.e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.b
            if (r0 == 0) goto L13
            r0 = r15
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$b r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.b) r0
            int r1 = r0.f40996d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40996d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$b r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f40994b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40996d
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L3e
            java.lang.Object r13 = r0.f40993a
            r14 = r13
            rg.h r14 = (rg.h) r14
            ut.x.b(r15)     // Catch: java.lang.Exception -> L31 hv.q -> L36 java.io.IOException -> L3b
            r7 = r12
            goto L6e
        L31:
            r0 = move-exception
            r13 = r0
            r7 = r12
            goto Lb2
        L36:
            r0 = move-exception
            r13 = r0
            r7 = r12
            goto Lb8
        L3b:
            r7 = r12
            goto Lb9
        L3e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L46:
            ut.x.b(r15)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r15 = r12.f40976a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r10 = r15.createAuthenticatedRestApiClient()
            if (r10 != 0) goto L57
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$h r13 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$h
            r13.<init>(r3)
            return r13
        L57:
            wu.g0 r15 = r12.f40977b     // Catch: java.io.IOException -> L3b java.lang.Exception -> Lac hv.q -> Laf
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$c r6 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$c     // Catch: java.io.IOException -> L3b java.lang.Exception -> Lac hv.q -> Laf
            r11 = 0
            r7 = r12
            r8 = r13
            r9 = r14
            r6.<init>(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r0.f40993a = r9     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r0.f40996d = r4     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            java.lang.Object r15 = wu.i.g(r15, r6, r0)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            if (r15 != r1) goto L6d
            return r1
        L6d:
            r14 = r9
        L6e:
            retrofit2.Response r15 = (retrofit2.Response) r15     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            java.lang.String r13 = "Error during CA encryption"
            if (r15 != 0) goto L80
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r14.<init>(r5, r13)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            goto Lbe
        L7a:
            r0 = move-exception
        L7b:
            r13 = r0
            goto Lb2
        L7d:
            r0 = move-exception
        L7e:
            r13 = r0
            goto Lb8
        L80:
            java.lang.Object r0 = r15.body()     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r0     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            boolean r1 = r15.isSuccessful()     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            if (r1 == 0) goto La3
            if (r0 == 0) goto La3
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r14 = r12.c(r0, r14)     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            int r15 = r15.code()     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            r0.<init>(r15, r14)     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            r14 = r0
            goto Lbe
        L9d:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$b     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r14.<init>(r5, r13)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            goto Lbe
        La3:
            com.server.auditor.ssh.client.models.e r13 = com.server.auditor.ssh.client.models.f.a(r15)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result r14 = r12.e(r13)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            goto Lbe
        Lac:
            r0 = move-exception
            r7 = r12
            goto L7b
        Laf:
            r0 = move-exception
            r7 = r12
            goto L7e
        Lb2:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$a r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$a
            r14.<init>(r3, r13)
            goto Lbe
        Lb8:
            throw r13
        Lb9:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c
            r14.<init>(r5)
        Lbe:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.f(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdateCaPayload, rg.h, zt.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload r8, zt.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.d
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$d r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.d) r0
            int r1 = r0.f41004c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41004c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$d r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41002a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f41004c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            ut.x.b(r9)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            goto L58
        L2a:
            r8 = move-exception
            goto L7b
        L2c:
            r8 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ut.x.b(r9)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r9 = r7.f40976a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r9 = r9.createAuthenticatedRestApiClient()
            if (r9 != 0) goto L47
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$h r8 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$h
            r8.<init>(r3)
            return r8
        L47:
            wu.g0 r2 = r7.f40977b     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$e r5 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$e     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            r6 = 0
            r5.<init>(r9, r8, r6)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            r0.f41004c = r4     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            java.lang.Object r9 = wu.i.g(r2, r5, r0)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            if (r9 != r1) goto L58
            return r1
        L58:
            retrofit2.Response r9 = (retrofit2.Response) r9     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            java.lang.Object r8 = r9.body()     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r8 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r8     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            boolean r0 = r9.isSuccessful()     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            if (r0 == 0) goto L72
            if (r8 == 0) goto L72
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$d     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            int r9 = r9.code()     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            r0.<init>(r9, r8)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            return r0
        L72:
            com.server.auditor.ssh.client.models.e r8 = com.server.auditor.ssh.client.models.f.a(r9)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result r8 = r7.e(r8)     // Catch: java.lang.Exception -> L2a hv.q -> L2c java.io.IOException -> L82
            return r8
        L7b:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$a r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$a
            r9.<init>(r3, r8)
            goto L88
        L81:
            throw r8
        L82:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository$Result$c
            r8 = -1
            r9.<init>(r8)
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdUpdatePropertiesApiRepository.g(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdUpdatePropertiesPayload, zt.e):java.lang.Object");
    }
}

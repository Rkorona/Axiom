package com.server.auditor.ssh.client.repositories.auth;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest;
import com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import hv.p;
import java.util.List;
import ju.t;
import lv.s2;
import lv.x2;
import pv.e0;
import su.s;
import ut.m0;
import ut.o;
import ut.r;
import ut.x;
import vt.v;
import wu.i0;
import wu.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class DevicePasswordRecoveryApiRepo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38552c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38553d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f38554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f38555b;

    /* JADX INFO: Access modifiers changed from: private */
    @p
    static final class DevicePasswordRecoveryBadRequestResponse {
        private static final ut.n[] $childSerializers;
        public static final b Companion = new b(null);
        private final List<String> hmacSalt;
        private final List<String> salt;
        private final List<String> securityToken;

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f38556a;
            }

            public /* synthetic */ b(ju.k kVar) {
                this();
            }
        }

        static {
            r rVar = r.f82638b;
            $childSerializers = new ut.n[]{o.b(rVar, new iu.a() { // from class: com.server.auditor.ssh.client.repositories.auth.d
                @Override // iu.a
                public final Object a() {
                    return DevicePasswordRecoveryApiRepo.DevicePasswordRecoveryBadRequestResponse._childSerializers$_anonymous_();
                }
            }), o.b(rVar, new iu.a() { // from class: com.server.auditor.ssh.client.repositories.auth.e
                @Override // iu.a
                public final Object a() {
                    return DevicePasswordRecoveryApiRepo.DevicePasswordRecoveryBadRequestResponse._childSerializers$_anonymous_$0();
                }
            }), o.b(rVar, new iu.a() { // from class: com.server.auditor.ssh.client.repositories.auth.f
                @Override // iu.a
                public final Object a() {
                    return DevicePasswordRecoveryApiRepo.DevicePasswordRecoveryBadRequestResponse._childSerializers$_anonymous_$1();
                }
            })};
        }

        public DevicePasswordRecoveryBadRequestResponse() {
            this((List) null, (List) null, (List) null, 7, (ju.k) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(x2.f64817a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
            return new lv.f(x2.f64817a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_$1() {
            return new lv.f(x2.f64817a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DevicePasswordRecoveryBadRequestResponse copy$default(DevicePasswordRecoveryBadRequestResponse devicePasswordRecoveryBadRequestResponse, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = devicePasswordRecoveryBadRequestResponse.salt;
            }
            if ((i10 & 2) != 0) {
                list2 = devicePasswordRecoveryBadRequestResponse.hmacSalt;
            }
            if ((i10 & 4) != 0) {
                list3 = devicePasswordRecoveryBadRequestResponse.securityToken;
            }
            return devicePasswordRecoveryBadRequestResponse.copy(list, list2, list3);
        }

        @hv.o("hmac_salt")
        public static /* synthetic */ void getHmacSalt$annotations() {
        }

        @hv.o("salt")
        public static /* synthetic */ void getSalt$annotations() {
        }

        @hv.o("security_token")
        public static /* synthetic */ void getSecurityToken$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(DevicePasswordRecoveryBadRequestResponse devicePasswordRecoveryBadRequestResponse, kv.d dVar, jv.f fVar) {
            ut.n[] nVarArr = $childSerializers;
            if (dVar.E(fVar, 0) || !t.b(devicePasswordRecoveryBadRequestResponse.salt, v.o())) {
                dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), devicePasswordRecoveryBadRequestResponse.salt);
            }
            if (dVar.E(fVar, 1) || !t.b(devicePasswordRecoveryBadRequestResponse.hmacSalt, v.o())) {
                dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), devicePasswordRecoveryBadRequestResponse.hmacSalt);
            }
            if (!dVar.E(fVar, 2) && t.b(devicePasswordRecoveryBadRequestResponse.securityToken, v.o())) {
                return;
            }
            dVar.o(fVar, 2, (hv.r) nVarArr[2].getValue(), devicePasswordRecoveryBadRequestResponse.securityToken);
        }

        public final List<String> component1() {
            return this.salt;
        }

        public final List<String> component2() {
            return this.hmacSalt;
        }

        public final List<String> component3() {
            return this.securityToken;
        }

        public final DevicePasswordRecoveryBadRequestResponse copy(List<String> list, List<String> list2, List<String> list3) {
            t.f(list, "salt");
            t.f(list2, "hmacSalt");
            t.f(list3, "securityToken");
            return new DevicePasswordRecoveryBadRequestResponse(list, list2, list3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DevicePasswordRecoveryBadRequestResponse)) {
                return false;
            }
            DevicePasswordRecoveryBadRequestResponse devicePasswordRecoveryBadRequestResponse = (DevicePasswordRecoveryBadRequestResponse) obj;
            return t.b(this.salt, devicePasswordRecoveryBadRequestResponse.salt) && t.b(this.hmacSalt, devicePasswordRecoveryBadRequestResponse.hmacSalt) && t.b(this.securityToken, devicePasswordRecoveryBadRequestResponse.securityToken);
        }

        public final List<String> getHmacSalt() {
            return this.hmacSalt;
        }

        public final List<String> getSalt() {
            return this.salt;
        }

        public final List<String> getSecurityToken() {
            return this.securityToken;
        }

        public int hashCode() {
            return (((this.salt.hashCode() * 31) + this.hmacSalt.hashCode()) * 31) + this.securityToken.hashCode();
        }

        public String toString() {
            return "DevicePasswordRecoveryBadRequestResponse(salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ", securityToken=" + this.securityToken + ")";
        }

        public /* synthetic */ DevicePasswordRecoveryBadRequestResponse(int i10, List list, List list2, List list3, s2 s2Var) {
            this.salt = (i10 & 1) == 0 ? v.o() : list;
            if ((i10 & 2) == 0) {
                this.hmacSalt = v.o();
            } else {
                this.hmacSalt = list2;
            }
            if ((i10 & 4) == 0) {
                this.securityToken = v.o();
            } else {
                this.securityToken = list3;
            }
        }

        public DevicePasswordRecoveryBadRequestResponse(List<String> list, List<String> list2, List<String> list3) {
            t.f(list, "salt");
            t.f(list2, "hmacSalt");
            t.f(list3, "securityToken");
            this.salt = list;
            this.hmacSalt = list2;
            this.securityToken = list3;
        }

        public /* synthetic */ DevicePasswordRecoveryBadRequestResponse(List list, List list2, List list3, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? v.o() : list, (i10 & 2) != 0 ? v.o() : list2, (i10 & 4) != 0 ? v.o() : list3);
        }
    }

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
            public static final a f38558a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 746211640;
            }

            public String toString() {
                return "BadRequestExpiredToken";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$b, reason: collision with other inner class name */
        public static final class C0582b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0582b f38559a = new C0582b();

            private C0582b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0582b);
            }

            public int hashCode() {
                return -164040282;
            }

            public String toString() {
                return "BadRequestInvalidToken";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38560a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                t.f(str, "error");
                this.f38560a = str;
            }

            public final String a() {
                return this.f38560a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f38560a, ((c) obj).f38560a);
            }

            public int hashCode() {
                return this.f38560a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f38560a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f38561a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Exception exc) {
                super(null);
                t.f(exc, "e");
                this.f38561a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f38561a, ((d) obj).f38561a);
            }

            public int hashCode() {
                return this.f38561a.hashCode();
            }

            public String toString() {
                return "FailedException(e=" + this.f38561a + ")";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f38562a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -221218700;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DevicePasswordRecoveryResponse f38563a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(DevicePasswordRecoveryResponse devicePasswordRecoveryResponse) {
                super(null);
                t.f(devicePasswordRecoveryResponse, "apiKey");
                this.f38563a = devicePasswordRecoveryResponse;
            }

            public final DevicePasswordRecoveryResponse a() {
                return this.f38563a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && t.b(this.f38563a, ((f) obj).f38563a);
            }

            public int hashCode() {
                return this.f38563a.hashCode();
            }

            public String toString() {
                return "Success(apiKey=" + this.f38563a + ")";
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f38564a;

            public g(int i10) {
                super(null);
                this.f38564a = i10;
            }

            public final int a() {
                return this.f38564a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f38564a == ((g) obj).f38564a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38564a);
            }

            public String toString() {
                return "ThrottledError(seconds=" + this.f38564a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38565a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str) {
                super(null);
                t.f(str, "detail");
                this.f38565a = str;
            }

            public final String a() {
                return this.f38565a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && t.b(this.f38565a, ((h) obj).f38565a);
            }

            public int hashCode() {
                return this.f38565a.hashCode();
            }

            public String toString() {
                return "UnauthenticatedError(detail=" + this.f38565a + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f38566a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return -650362371;
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
        /* synthetic */ Object f38567a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38569c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38567a = obj;
            this.f38569c |= RtlSpacingHelper.UNDEFINED;
            return DevicePasswordRecoveryApiRepo.this.c(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f38571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DevicePasswordRecoveryRequest f38572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, DevicePasswordRecoveryRequest devicePasswordRecoveryRequest, zt.e eVar) {
            super(2, eVar);
            this.f38571b = syncRestInterface;
            this.f38572c = devicePasswordRecoveryRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f38571b, this.f38572c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38570a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f38571b;
            DevicePasswordRecoveryRequest devicePasswordRecoveryRequest = this.f38572c;
            this.f38570a = 1;
            Object objPostDevicePasswordRecovery = syncRestInterface.postDevicePasswordRecovery(devicePasswordRecoveryRequest, this);
            return objPostDevicePasswordRecovery == objF ? objF : objPostDevicePasswordRecovery;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public DevicePasswordRecoveryApiRepo(SyncRestApiClientFactory syncRestApiClientFactory, j1 j1Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(j1Var, "networkDispatcher");
        this.f38554a = syncRestApiClientFactory;
        this.f38555b = j1Var;
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        b cVar;
        String errorMessage;
        String str = "";
        Object objB = null;
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                e0 e0VarA = eVar.a();
                String strString = e0VarA != null ? e0VarA.string() : null;
                if (strString != null) {
                    str = strString;
                }
                bVarS1.a();
                objB = bVarS1.b(DevicePasswordRecoveryBadRequestResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused) {
            }
            DevicePasswordRecoveryBadRequestResponse devicePasswordRecoveryBadRequestResponse = (DevicePasswordRecoveryBadRequestResponse) objB;
            if (devicePasswordRecoveryBadRequestResponse == null) {
                return b.i.f38566a;
            }
            if (!devicePasswordRecoveryBadRequestResponse.getSalt().isEmpty()) {
                return new b.c((String) v.p0(devicePasswordRecoveryBadRequestResponse.getSalt()));
            }
            if (!devicePasswordRecoveryBadRequestResponse.getHmacSalt().isEmpty()) {
                return new b.c((String) v.p0(devicePasswordRecoveryBadRequestResponse.getHmacSalt()));
            }
            if (devicePasswordRecoveryBadRequestResponse.getSecurityToken().isEmpty()) {
                return b.i.f38566a;
            }
            String str2 = (String) v.p0(devicePasswordRecoveryBadRequestResponse.getSecurityToken());
            if (t.b(str2, "Security token is invalid.")) {
                return b.C0582b.f38559a;
            }
            if (t.b(str2, "Security token is expired.")) {
                return b.a.f38558a;
            }
            cVar = new b.c(str2);
        } else {
            if (eVar instanceof w) {
                w wVar = (w) eVar;
                Integer numE = w.e(wVar, null, 1, null);
                if (numE != null) {
                    return new b.g(numE.intValue());
                }
                String strC = wVar.c();
                return (strC == null || s.m0(strC)) ? b.i.f38566a : new b.c(strC);
            }
            if (!(eVar instanceof y)) {
                if ((eVar instanceof com.server.auditor.ssh.client.models.l) || (eVar instanceof com.server.auditor.ssh.client.models.m) || (eVar instanceof z)) {
                    return b.i.f38566a;
                }
                throw new ut.s();
            }
            try {
                mv.b bVarS12 = b2.f52944a.s1();
                e0 e0VarA2 = eVar.a();
                String strString2 = e0VarA2 != null ? e0VarA2.string() : null;
                if (strString2 != null) {
                    str = strString2;
                }
                bVarS12.a();
                objB = bVarS12.b(CommonApiErrorResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused2) {
            }
            CommonApiErrorResponse commonApiErrorResponse = (CommonApiErrorResponse) objB;
            if (commonApiErrorResponse == null || (errorMessage = commonApiErrorResponse.getErrorMessage()) == null) {
                return b.i.f38566a;
            }
            cVar = new b.h(errorMessage);
        }
        return cVar;
    }

    private final b b(DevicePasswordRecoveryResponse devicePasswordRecoveryResponse) {
        return devicePasswordRecoveryResponse != null ? new b.f(devicePasswordRecoveryResponse) : b.i.f38566a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest r7, zt.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo.c
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$c r0 = (com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo.c) r0
            int r1 = r0.f38569c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38569c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$c r0 = new com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38567a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38569c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
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
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r8 = r6.f38554a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r8 = r8.createAuthenticatedRestApiClient()
            if (r8 != 0) goto L46
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$c r7 = new com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$c
            java.lang.String r8 = "Cannot create request"
            r7.<init>(r8)
            return r7
        L46:
            wu.j1 r2 = r6.f38555b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$d r4 = new com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            r0.f38569c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            java.lang.Object r8 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            if (r8 != r1) goto L57
            return r1
        L57:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            boolean r7 = r8.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r8.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryResponse r7 = (com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryResponse) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b r7 = r6.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            return r7
        L6a:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r8)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L79 java.lang.IllegalArgumentException -> L7c
            return r7
        L73:
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$d r8 = new com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$d
            r8.<init>(r7)
            goto L7e
        L79:
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$e r8 = com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo.b.e.f38562a
            goto L7e
        L7c:
            com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo$b$i r8 = com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo.b.i.f38566a
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.auth.DevicePasswordRecoveryApiRepo.c(com.server.auditor.ssh.client.synchronization.api.models.password.DevicePasswordRecoveryRequest, zt.e):java.lang.Object");
    }
}

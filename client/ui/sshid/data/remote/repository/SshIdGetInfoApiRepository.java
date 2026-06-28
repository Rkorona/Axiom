package com.server.auditor.ssh.client.ui.sshid.data.remote.repository;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.models.h;
import com.server.auditor.ssh.client.models.l;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import gp.v;
import hg.b2;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import pv.e0;
import su.s;
import ut.m0;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdGetInfoApiRepository {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40936d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40937e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f40938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f40939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f40940c;

    @Keep
    public static abstract class Result {
        public static final int $stable = 0;
        private final int code;

        public static final class a extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Exception f40942b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Exception exc) {
                super(i10, null);
                t.f(exc, "exception");
                this.f40941a = i10;
                this.f40942b = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f40941a == aVar.f40941a && t.b(this.f40942b, aVar.f40942b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40941a) * 31) + this.f40942b.hashCode();
            }

            public String toString() {
                return "Error(responseCode=" + this.f40941a + ", exception=" + this.f40942b + ")";
            }
        }

        public static final class b extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40944b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, String str) {
                super(i10, null);
                t.f(str, "errorBody");
                this.f40943a = i10;
                this.f40944b = str;
            }

            public final String a() {
                return this.f40944b;
            }

            public final int b() {
                return this.f40943a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f40943a == bVar.f40943a && t.b(this.f40944b, bVar.f40944b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40943a) * 31) + this.f40944b.hashCode();
            }

            public String toString() {
                return "Failed(responseCode=" + this.f40943a + ", errorBody=" + this.f40944b + ")";
            }
        }

        public static final class c extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40945a;

            public c(int i10) {
                super(i10, null);
                this.f40945a = i10;
            }

            public final int a() {
                return this.f40945a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f40945a == ((c) obj).f40945a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40945a);
            }

            public String toString() {
                return "NetworkError(responseCode=" + this.f40945a + ")";
            }
        }

        public static final class d extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40946a;

            public d(int i10) {
                super(i10, null);
                this.f40946a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f40946a == ((d) obj).f40946a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40946a);
            }

            public String toString() {
                return "NotFoundError(responseCode=" + this.f40946a + ")";
            }
        }

        public static final class e extends Result {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f40947c = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SshIdResponse f40949b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i10, SshIdResponse sshIdResponse) {
                super(i10, null);
                t.f(sshIdResponse, "sshIdData");
                this.f40948a = i10;
                this.f40949b = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f40949b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f40948a == eVar.f40948a && t.b(this.f40949b, eVar.f40949b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40948a) * 31) + this.f40949b.hashCode();
            }

            public String toString() {
                return "Regenerate(responseCode=" + this.f40948a + ", sshIdData=" + this.f40949b + ")";
            }
        }

        public static final class f extends Result {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f40950c = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SshIdResponse f40952b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(int i10, SshIdResponse sshIdResponse) {
                super(i10, null);
                t.f(sshIdResponse, "sshIdData");
                this.f40951a = i10;
                this.f40952b = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f40952b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f40951a == fVar.f40951a && t.b(this.f40952b, fVar.f40952b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40951a) * 31) + this.f40952b.hashCode();
            }

            public String toString() {
                return "Success(responseCode=" + this.f40951a + ", sshIdData=" + this.f40952b + ")";
            }
        }

        public static final class g extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f40954b;

            public g(int i10, int i11) {
                super(i10, null);
                this.f40953a = i10;
                this.f40954b = i11;
            }

            public final int a() {
                return this.f40953a;
            }

            public final int b() {
                return this.f40954b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f40953a == gVar.f40953a && this.f40954b == gVar.f40954b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40953a) * 31) + Integer.hashCode(this.f40954b);
            }

            public String toString() {
                return "ThrottledError(responseCode=" + this.f40953a + ", seconds=" + this.f40954b + ")";
            }
        }

        public static final class h extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40955a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40956b;

            public h(int i10, String str) {
                super(i10, null);
                this.f40955a = i10;
                this.f40956b = str;
            }

            public final String a() {
                return this.f40956b;
            }

            public final int b() {
                return this.f40955a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f40955a == hVar.f40955a && t.b(this.f40956b, hVar.f40956b);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f40955a) * 31;
                String str = this.f40956b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "UnauthenticatedError(responseCode=" + this.f40955a + ", error=" + this.f40956b + ")";
            }
        }

        public static final class i extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40957a;

            public i(int i10) {
                super(i10, null);
                this.f40957a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f40957a == ((i) obj).f40957a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40957a);
            }

            public String toString() {
                return "UnexpectedError(responseCode=" + this.f40957a + ")";
            }
        }

        public static final class j extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40958a;

            public j(int i10) {
                super(i10, null);
                this.f40958a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.f40958a == ((j) obj).f40958a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40958a);
            }

            public String toString() {
                return "UnknownError(responseCode=" + this.f40958a + ")";
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
        int f40959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40961c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40963e;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40961c = obj;
            this.f40963e |= RtlSpacingHelper.UNDEFINED;
            return SshIdGetInfoApiRepository.this.d(0, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40965b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40967d;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40965b = obj;
            this.f40967d |= RtlSpacingHelper.UNDEFINED;
            return SshIdGetInfoApiRepository.this.e(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40969b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40971d;

        d(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40969b = obj;
            this.f40971d |= RtlSpacingHelper.UNDEFINED;
            return SshIdGetInfoApiRepository.this.f(null, this);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f40973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f40973b = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f40973b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40972a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f40973b;
            this.f40972a = 1;
            Object sshIdData = syncRestInterface.getSshIdData(this);
            return sshIdData == objF ? objF : sshIdData;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SshIdGetInfoApiRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f40938a = syncRestApiClientFactory;
        this.f40939b = g0Var;
        this.f40940c = new v(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final Result c(com.server.auditor.ssh.client.models.e eVar) {
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
            return new Result.h(eVar.b(), commonApiErrorResponse != null ? commonApiErrorResponse.getErrorMessage() : null);
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
                return new Result.g(eVar.b(), numE.intValue());
            }
            String strC = wVar.c();
            return (strC == null || s.m0(strC)) ? new Result.i(eVar.b()) : new Result.b(eVar.b(), strC);
        }
        if (eVar instanceof l) {
            return new Result.d(eVar.b());
        }
        return new Result.b(eVar.b(), "Unexpected error code: " + eVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r5, com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r6, zt.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.b
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$b r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.b) r0
            int r1 = r0.f40963e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40963e = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$b r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40961c
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40963e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.f40959a
            java.lang.Object r6 = r0.f40960b
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r6 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r6
            ut.x.b(r7)
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ut.x.b(r7)
            r0.f40960b = r6
            r0.f40959a = r5
            r0.f40963e = r3
            java.lang.Object r7 = r4.e(r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L55
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$e r7 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$e
            r7.<init>(r5, r6)
            return r7
        L55:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$f r7 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$f
            r7.<init>(r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.d(int, com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.c
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$c r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.c) r0
            int r1 = r0.f40967d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40967d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$c r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40965b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40967d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f40964a
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r5 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r5
            ut.x.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ut.x.b(r6)
            gp.v r6 = r4.f40940c
            java.util.List r2 = r5.getDeviceBoundKeys()
            r0.f40964a = r5
            r0.f40967d = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L59
            boolean r5 = dp.e.a(r5)
            if (r5 == 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.e(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse, zt.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(rg.h r9, zt.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.d
            if (r0 == 0) goto L13
            r0 = r10
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$d r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.d) r0
            int r1 = r0.f40971d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40971d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$d r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f40969b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40971d
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            ut.x.b(r10)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            goto L9a
        L2e:
            r9 = move-exception
            goto La6
        L31:
            r9 = move-exception
            goto Lac
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f40968a
            rg.h r9 = (rg.h) r9
            ut.x.b(r10)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            goto L67
        L44:
            ut.x.b(r10)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r10 = r8.f40938a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r10 = r10.createAuthenticatedRestApiClient()
            if (r10 != 0) goto L55
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$j r9 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$j
            r9.<init>(r4)
            return r9
        L55:
            wu.g0 r2 = r8.f40939b     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$e r7 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$e     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r7.<init>(r10, r3)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r0.f40968a = r9     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r0.f40971d = r6     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            java.lang.Object r10 = wu.i.g(r2, r7, r0)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            if (r10 != r1) goto L67
            goto L99
        L67:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            java.lang.Object r2 = r10.body()     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r2 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r2     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            boolean r6 = r10.isSuccessful()     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            if (r6 == 0) goto L9d
            if (r2 == 0) goto L9d
            java.lang.String r6 = r2.caEncryptedPrivateKey     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            int r6 = r6.length()     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            if (r6 <= 0) goto L88
            java.lang.Class<com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse> r6 = com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse.class
            java.lang.Object r9 = r9.k(r2, r6)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r2 = r9
            com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse r2 = (com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse) r2     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
        L88:
            int r9 = r10.code()     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            ju.t.c(r2)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r0.f40968a = r3     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            r0.f40971d = r5     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            java.lang.Object r10 = r8.d(r9, r2, r0)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            if (r10 != r1) goto L9a
        L99:
            return r1
        L9a:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result r10 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.Result) r10     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            return r10
        L9d:
            com.server.auditor.ssh.client.models.e r9 = com.server.auditor.ssh.client.models.f.a(r10)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result r9 = r8.c(r9)     // Catch: java.lang.Exception -> L2e hv.q -> L31 java.io.IOException -> Lad
            return r9
        La6:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$a r10 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$a
            r10.<init>(r4, r9)
            goto Lb3
        Lac:
            throw r9
        Lad:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$c r10 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository$Result$c
            r9 = -1
            r10.<init>(r9)
        Lb3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository.f(rg.h, zt.e):java.lang.Object");
    }
}

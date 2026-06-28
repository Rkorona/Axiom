package com.server.auditor.ssh.client.ui.sshid.data.remote.repository;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.synchronization.FailedToEncryptException;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload;
import com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdResponse;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import iu.l;
import java.util.List;
import ju.k;
import ju.t;
import jv.f;
import kotlin.coroutines.jvm.internal.m;
import kv.d;
import kv.e;
import lv.d2;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import retrofit2.Response;
import rg.h;
import su.s;
import ut.m0;
import ut.n;
import ut.o;
import ut.r;
import ut.x;
import vt.v;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdCreationApiRepository {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40906d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40907e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f40908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f40909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f40910c;

    @Keep
    public static abstract class Result {
        public static final int $stable = 0;
        private final int code;

        public static final class a extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Exception f40912b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Exception exc) {
                super(i10, null);
                t.f(exc, "exception");
                this.f40911a = i10;
                this.f40912b = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f40911a == aVar.f40911a && t.b(this.f40912b, aVar.f40912b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40911a) * 31) + this.f40912b.hashCode();
            }

            public String toString() {
                return "Error(responseCode=" + this.f40911a + ", exception=" + this.f40912b + ")";
            }
        }

        public static final class b extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, String str) {
                super(i10, null);
                t.f(str, "errorBody");
                this.f40913a = i10;
                this.f40914b = str;
            }

            public final String a() {
                return this.f40914b;
            }

            public final int b() {
                return this.f40913a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f40913a == bVar.f40913a && t.b(this.f40914b, bVar.f40914b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40913a) * 31) + this.f40914b.hashCode();
            }

            public String toString() {
                return "Failed(responseCode=" + this.f40913a + ", errorBody=" + this.f40914b + ")";
            }
        }

        public static final class c extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40915a;

            public c(int i10) {
                super(i10, null);
                this.f40915a = i10;
            }

            public final int a() {
                return this.f40915a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f40915a == ((c) obj).f40915a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40915a);
            }

            public String toString() {
                return "NetworkError(responseCode=" + this.f40915a + ")";
            }
        }

        public static final class d extends Result {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f40916c = SshIdResponse.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40917a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SshIdResponse f40918b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, SshIdResponse sshIdResponse) {
                super(i10, null);
                t.f(sshIdResponse, "sshIdData");
                this.f40917a = i10;
                this.f40918b = sshIdResponse;
            }

            public final SshIdResponse a() {
                return this.f40918b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f40917a == dVar.f40917a && t.b(this.f40918b, dVar.f40918b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40917a) * 31) + this.f40918b.hashCode();
            }

            public String toString() {
                return "Success(responseCode=" + this.f40917a + ", sshIdData=" + this.f40918b + ")";
            }
        }

        public static final class e extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40919a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f40920b;

            public e(int i10, int i11) {
                super(i10, null);
                this.f40919a = i10;
                this.f40920b = i11;
            }

            public final int a() {
                return this.f40919a;
            }

            public final int b() {
                return this.f40920b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f40919a == eVar.f40919a && this.f40920b == eVar.f40920b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f40919a) * 31) + Integer.hashCode(this.f40920b);
            }

            public String toString() {
                return "ThrottledError(responseCode=" + this.f40919a + ", seconds=" + this.f40920b + ")";
            }
        }

        public static final class f extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f40922b;

            public f(int i10, String str) {
                super(i10, null);
                this.f40921a = i10;
                this.f40922b = str;
            }

            public final String a() {
                return this.f40922b;
            }

            public final int b() {
                return this.f40921a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f40921a == fVar.f40921a && t.b(this.f40922b, fVar.f40922b);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f40921a) * 31;
                String str = this.f40922b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "UnauthenticatedError(responseCode=" + this.f40921a + ", error=" + this.f40922b + ")";
            }
        }

        public static final class g extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40923a;

            public g(int i10) {
                super(i10, null);
                this.f40923a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f40923a == ((g) obj).f40923a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40923a);
            }

            public String toString() {
                return "UnexpectedError(responseCode=" + this.f40923a + ")";
            }
        }

        public static final class h extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f40924a;

            public h(int i10) {
                super(i10, null);
                this.f40924a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f40924a == ((h) obj).f40924a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f40924a);
            }

            public String toString() {
                return "UnknownError(responseCode=" + this.f40924a + ")";
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

    @p
    @Keep
    public static final class SshIdUsernameApiErrorResponse {
        private final List<String> errorMessage;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: ep.a
            @Override // iu.a
            public final Object a() {
                return SshIdCreationApiRepository.SshIdUsernameApiErrorResponse._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f40925a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f40926b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f40925a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository.SshIdUsernameApiErrorResponse", aVar, 1);
                i2Var.r("username", false);
                descriptor = i2Var;
                f40926b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SshIdUsernameApiErrorResponse deserialize(e eVar) {
                List list;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = SshIdUsernameApiErrorResponse.$childSerializers;
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    list = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            list2 = (List) cVarD.i(fVar, 0, (hv.b) nVarArr[0].getValue(), list2);
                            i11 = 1;
                        }
                    }
                    list = list2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new SshIdUsernameApiErrorResponse(i10, list, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, SshIdUsernameApiErrorResponse sshIdUsernameApiErrorResponse) {
                t.f(fVar, "encoder");
                t.f(sshIdUsernameApiErrorResponse, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                d dVarD = fVar.d(fVar2);
                SshIdUsernameApiErrorResponse.write$Self$Termius_app_googleProductionRelease(sshIdUsernameApiErrorResponse, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{SshIdUsernameApiErrorResponse.$childSerializers[0].getValue()};
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
                return a.f40925a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ SshIdUsernameApiErrorResponse(int i10, List list, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f40925a.getDescriptor());
            }
            this.errorMessage = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(x2.f64817a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SshIdUsernameApiErrorResponse copy$default(SshIdUsernameApiErrorResponse sshIdUsernameApiErrorResponse, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = sshIdUsernameApiErrorResponse.errorMessage;
            }
            return sshIdUsernameApiErrorResponse.copy(list);
        }

        @hv.o("username")
        public static /* synthetic */ void getErrorMessage$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SshIdUsernameApiErrorResponse sshIdUsernameApiErrorResponse, d dVar, f fVar) {
            dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), sshIdUsernameApiErrorResponse.errorMessage);
        }

        public final List<String> component1() {
            return this.errorMessage;
        }

        public final SshIdUsernameApiErrorResponse copy(List<String> list) {
            t.f(list, ErrorResponseData.JSON_ERROR_MESSAGE);
            return new SshIdUsernameApiErrorResponse(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SshIdUsernameApiErrorResponse) && t.b(this.errorMessage, ((SshIdUsernameApiErrorResponse) obj).errorMessage);
        }

        public final List<String> getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "SshIdUsernameApiErrorResponse(errorMessage=" + this.errorMessage + ")";
        }

        public SshIdUsernameApiErrorResponse(List<String> list) {
            t.f(list, ErrorResponseData.JSON_ERROR_MESSAGE);
            this.errorMessage = list;
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
        Object f40927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40928b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f40930d;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40928b = obj;
            this.f40930d |= RtlSpacingHelper.UNDEFINED;
            return SshIdCreationApiRepository.this.f(null, null, this);
        }
    }

    static final class c extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40931a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SshIdCreationPayload f40933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f40934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f40935e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SshIdCreationPayload sshIdCreationPayload, h hVar, SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f40933c = sshIdCreationPayload;
            this.f40934d = hVar;
            this.f40935e = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdCreationApiRepository.this.new c(this.f40933c, this.f40934d, this.f40935e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, FailedToEncryptException {
            Object objF = au.b.f();
            int i10 = this.f40931a;
            try {
                if (i10 == 0) {
                    x.b(obj);
                    SshIdCreationApiRepository.this.f40910c.invoke(Avo.SSHidSetUpStep.ENCRYPTING_C_A);
                    SshIdCreationPayload sshIdCreationPayloadD = SshIdCreationApiRepository.this.d(this.f40933c, this.f40934d);
                    SshIdCreationApiRepository.this.f40910c.invoke(Avo.SSHidSetUpStep.SENDING_SS_HID_CREATE_REQUEST);
                    SyncRestInterface syncRestInterface = this.f40935e;
                    this.f40931a = 1;
                    obj = syncRestInterface.createSshId(sshIdCreationPayloadD, this);
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

    public SshIdCreationApiRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var, l lVar) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        t.f(lVar, "onUpdateSshSetupStep");
        this.f40908a = syncRestApiClientFactory;
        this.f40909b = g0Var;
        this.f40910c = lVar;
    }

    private final SshIdResponse c(SshIdResponse sshIdResponse, h hVar) {
        Object objK = hVar.k(sshIdResponse, SshIdResponse.class);
        t.e(objK, "decrypt(...)");
        return (SshIdResponse) objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SshIdCreationPayload d(SshIdCreationPayload sshIdCreationPayload, h hVar) throws IllegalAccessException, FailedToEncryptException {
        Object objG = hVar.G(sshIdCreationPayload, SshIdCreationPayload.class);
        t.e(objG, "encrypt(...)");
        return (SshIdCreationPayload) objG;
    }

    private final Result e(com.server.auditor.ssh.client.models.e eVar) {
        String str;
        Object objB;
        List<String> errorMessage;
        Object objB2;
        String errorMessage2;
        str = "";
        String str2 = null;
        Object objB3 = null;
        str2 = null;
        if (eVar instanceof com.server.auditor.ssh.client.models.h) {
            try {
                mv.b bVarS1 = b2.f52944a.s1();
                pv.e0 e0VarA = eVar.a();
                String strString = e0VarA != null ? e0VarA.string() : null;
                if (strString == null) {
                    strString = "";
                }
                bVarS1.a();
                objB = bVarS1.b(SshIdUsernameApiErrorResponse.Companion.serializer(), strString);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            SshIdUsernameApiErrorResponse sshIdUsernameApiErrorResponse = (SshIdUsernameApiErrorResponse) objB;
            int iB = eVar.b();
            if (sshIdUsernameApiErrorResponse != null && (errorMessage = sshIdUsernameApiErrorResponse.getErrorMessage()) != null) {
                str2 = (String) v.p0(errorMessage);
            }
            return new Result.b(iB, str2 != null ? str2 : "");
        }
        if (eVar instanceof y) {
            try {
                mv.b bVarS12 = b2.f52944a.s1();
                pv.e0 e0VarA2 = eVar.a();
                String strString2 = e0VarA2 != null ? e0VarA2.string() : null;
                if (strString2 != null) {
                    str = strString2;
                }
                bVarS12.a();
                objB2 = bVarS12.b(CommonApiErrorResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused2) {
                objB2 = null;
            }
            CommonApiErrorResponse commonApiErrorResponse = (CommonApiErrorResponse) objB2;
            return new Result.f(eVar.b(), commonApiErrorResponse != null ? commonApiErrorResponse.getErrorMessage() : null);
        }
        if (eVar instanceof com.server.auditor.ssh.client.models.m) {
            try {
                mv.b bVarS13 = b2.f52944a.s1();
                pv.e0 e0VarA3 = eVar.a();
                String strString3 = e0VarA3 != null ? e0VarA3.string() : null;
                if (strString3 != null) {
                    str = strString3;
                }
                bVarS13.a();
                objB3 = bVarS13.b(CommonApiErrorResponse.Companion.serializer(), str);
            } catch (IllegalArgumentException unused3) {
            }
            CommonApiErrorResponse commonApiErrorResponse2 = (CommonApiErrorResponse) objB3;
            return (commonApiErrorResponse2 == null || (errorMessage2 = commonApiErrorResponse2.getErrorMessage()) == null) ? new Result.b(eVar.b(), "Something went wrong. Please try again later.") : new Result.b(eVar.b(), errorMessage2);
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
    public final java.lang.Object f(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload r13, rg.h r14, zt.e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository.b
            if (r0 == 0) goto L13
            r0 = r15
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$b r0 = (com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository.b) r0
            int r1 = r0.f40930d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40930d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$b r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f40928b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f40930d
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L3e
            java.lang.Object r13 = r0.f40927a
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
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r15 = r12.f40908a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r10 = r15.createAuthenticatedRestApiClient()
            if (r10 != 0) goto L57
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$h r13 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$h
            r13.<init>(r3)
            return r13
        L57:
            wu.g0 r15 = r12.f40909b     // Catch: java.io.IOException -> L3b java.lang.Exception -> Lac hv.q -> Laf
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$c r6 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$c     // Catch: java.io.IOException -> L3b java.lang.Exception -> Lac hv.q -> Laf
            r11 = 0
            r7 = r12
            r8 = r13
            r9 = r14
            r6.<init>(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r0.f40927a = r9     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r0.f40930d = r4     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            java.lang.Object r15 = wu.i.g(r15, r6, r0)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            if (r15 != r1) goto L6d
            return r1
        L6d:
            r14 = r9
        L6e:
            retrofit2.Response r15 = (retrofit2.Response) r15     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            java.lang.String r13 = "Error during CA encryption"
            if (r15 != 0) goto L80
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$b r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$b     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
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
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$d r0 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$d     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            int r15 = r15.code()     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            r0.<init>(r15, r14)     // Catch: java.lang.Exception -> L7a java.lang.IllegalArgumentException -> L9d java.io.IOException -> Lb9
            r14 = r0
            goto Lbe
        L9d:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$b r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$b     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            r14.<init>(r5, r13)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            goto Lbe
        La3:
            com.server.auditor.ssh.client.models.e r13 = com.server.auditor.ssh.client.models.f.a(r15)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result r14 = r12.e(r13)     // Catch: java.lang.Exception -> L7a hv.q -> L7d java.io.IOException -> Lb9
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
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$a r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$a
            r14.<init>(r3, r13)
            goto Lbe
        Lb8:
            throw r13
        Lb9:
            com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$c r14 = new com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository$Result$c
            r14.<init>(r5)
        Lbe:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdCreationApiRepository.f(com.server.auditor.ssh.client.ui.sshid.data.remote.apimodels.SshIdCreationPayload, rg.h, zt.e):java.lang.Object");
    }
}

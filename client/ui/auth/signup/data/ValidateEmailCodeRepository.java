package com.server.auditor.ssh.client.ui.auth.signup.data;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.h;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
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
public final class ValidateEmailCodeRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39255c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39256d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f39257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f39258b;

    @Keep
    public interface Result {

        @Keep
        public static final class BadRequestMessage implements Result {
            public static final int $stable = 0;
            private final String message;

            public BadRequestMessage(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ BadRequestMessage copy$default(BadRequestMessage badRequestMessage, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = badRequestMessage.message;
                }
                return badRequestMessage.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final BadRequestMessage copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new BadRequestMessage(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BadRequestMessage) && t.b(this.message, ((BadRequestMessage) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "BadRequestMessage(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class Error implements Result {
            public static final int $stable = 8;
            private final Exception exception;

            public Error(Exception exc) {
                t.f(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = error.exception;
                }
                return error.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final Error copy(Exception exc) {
                t.f(exc, "exception");
                return new Error(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && t.b(this.exception, ((Error) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.exception + ")";
            }
        }

        @Keep
        public static final class Failed implements Result {
            public static final int $stable = 0;
            private final String errorBody;
            private final int responseCode;

            public Failed(int i10, String str) {
                t.f(str, "errorBody");
                this.responseCode = i10;
                this.errorBody = str;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = failed.responseCode;
                }
                if ((i11 & 2) != 0) {
                    str = failed.errorBody;
                }
                return failed.copy(i10, str);
            }

            public final int component1() {
                return this.responseCode;
            }

            public final String component2() {
                return this.errorBody;
            }

            public final Failed copy(int i10, String str) {
                t.f(str, "errorBody");
                return new Failed(i10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) obj;
                return this.responseCode == failed.responseCode && t.b(this.errorBody, failed.errorBody);
            }

            public final String getErrorBody() {
                return this.errorBody;
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public int hashCode() {
                return (Integer.hashCode(this.responseCode) * 31) + this.errorBody.hashCode();
            }

            public String toString() {
                return "Failed(responseCode=" + this.responseCode + ", errorBody=" + this.errorBody + ")";
            }
        }

        @Keep
        public static final class NetworkError implements Result {
            public static final int $stable = 0;
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NetworkError);
            }

            public int hashCode() {
                return -1992468751;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        @Keep
        public static final class Success implements Result {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            private Success() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return -2054967508;
            }

            public String toString() {
                return "Success";
            }
        }

        @Keep
        public static final class ThrottledError implements Result {
            public static final int $stable = 0;
            private final int seconds;

            public ThrottledError(int i10) {
                this.seconds = i10;
            }

            public static /* synthetic */ ThrottledError copy$default(ThrottledError throttledError, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = throttledError.seconds;
                }
                return throttledError.copy(i10);
            }

            public final int component1() {
                return this.seconds;
            }

            public final ThrottledError copy(int i10) {
                return new ThrottledError(i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrottledError) && this.seconds == ((ThrottledError) obj).seconds;
            }

            public final int getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.seconds);
            }

            public String toString() {
                return "ThrottledError(seconds=" + this.seconds + ")";
            }
        }

        @Keep
        public static final class UnexpectedError implements Result {
            public static final int $stable = 0;
            public static final UnexpectedError INSTANCE = new UnexpectedError();

            private UnexpectedError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnexpectedError);
            }

            public int hashCode() {
                return 7566944;
            }

            public String toString() {
                return "UnexpectedError";
            }
        }

        @Keep
        public static final class UnknownError implements Result {
            public static final int $stable = 0;
            public static final UnknownError INSTANCE = new UnknownError();

            private UnknownError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnknownError);
            }

            public int hashCode() {
                return 1002698325;
            }

            public String toString() {
                return "UnknownError";
            }
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
        /* synthetic */ Object f39259a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39261c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39259a = obj;
            this.f39261c |= RtlSpacingHelper.UNDEFINED;
            return ValidateEmailCodeRepository.this.b(null, null, this);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f39263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f39265d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SyncRestInterface syncRestInterface, String str, String str2, e eVar) {
            super(2, eVar);
            this.f39263b = syncRestInterface;
            this.f39264c = str;
            this.f39265d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(this.f39263b, this.f39264c, this.f39265d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39262a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f39263b;
            ValidateEmailCodeRequest validateEmailCodeRequest = new ValidateEmailCodeRequest(this.f39264c, this.f39265d);
            this.f39262a = 1;
            Object objValidateEmailCode = syncRestInterface.validateEmailCode(validateEmailCodeRequest, this);
            return objValidateEmailCode == objF ? objF : objValidateEmailCode;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ValidateEmailCodeRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f39257a = syncRestApiClientFactory;
        this.f39258b = g0Var;
    }

    private final Result a(com.server.auditor.ssh.client.models.e eVar) {
        Object objB;
        Result.Failed failed;
        String strString;
        if (!(eVar instanceof h)) {
            if (eVar instanceof w) {
                w wVar = (w) eVar;
                Integer numE = w.e(wVar, null, 1, null);
                if (numE != null) {
                    return new Result.ThrottledError(numE.intValue());
                }
                String strC = wVar.c();
                return (strC == null || s.m0(strC)) ? Result.UnexpectedError.INSTANCE : new Result.Failed(eVar.b(), strC);
            }
            return new Result.Failed(eVar.b(), "Unexpected error code: " + eVar.b());
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = eVar.a();
            String strString2 = e0VarA != null ? e0VarA.string() : null;
            if (strString2 == null) {
                strString2 = "";
            }
            bVarS1.a();
            objB = bVarS1.b(ValidateEmailCodeBadRequest.Companion.serializer(), strString2);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        ValidateEmailCodeBadRequest validateEmailCodeBadRequest = (ValidateEmailCodeBadRequest) objB;
        if (validateEmailCodeBadRequest != null) {
            String codeError = validateEmailCodeBadRequest.getCodeError();
            if (codeError != null) {
                return new Result.BadRequestMessage(codeError);
            }
            String generalError = validateEmailCodeBadRequest.getGeneralError();
            if (generalError != null) {
                return new Result.BadRequestMessage(generalError);
            }
            int iB = eVar.b();
            e0 e0VarA2 = ((h) eVar).a();
            strString = e0VarA2 != null ? e0VarA2.string() : null;
            failed = new Result.Failed(iB, strString != null ? strString : "");
        } else {
            int iB2 = eVar.b();
            e0 e0VarA3 = ((h) eVar).a();
            strString = e0VarA3 != null ? e0VarA3.string() : null;
            failed = new Result.Failed(iB2, strString != null ? strString : "");
        }
        return failed;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, zt.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.b
            if (r0 == 0) goto L13
            r0 = r9
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$b r0 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.b) r0
            int r1 = r0.f39261c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39261c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$b r0 = new com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f39259a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39261c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r9)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            goto L4d
        L29:
            r7 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.x.b(r9)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r9 = r6.f39257a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r9 = r9.createRegularRestApiClient()
            wu.g0 r2 = r6.f39258b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$c r4 = new com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$c     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            r5 = 0
            r4.<init>(r9, r7, r8, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            r0.f39261c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            java.lang.Object r9 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            if (r9 != r1) goto L4d
            return r1
        L4d:
            retrofit2.Response r9 = (retrofit2.Response) r9     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            boolean r7 = r9.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            if (r7 == 0) goto L58
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Success r7 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Success.INSTANCE     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            return r7
        L58:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r9)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L67
            return r7
        L61:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Error r8 = new com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Error
            r8.<init>(r7)
            goto L69
        L67:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$NetworkError r8 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.NetworkError.INSTANCE
        L69:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.b(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

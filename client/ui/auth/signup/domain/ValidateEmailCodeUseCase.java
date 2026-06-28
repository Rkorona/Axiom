package com.server.auditor.ssh.client.ui.auth.signup.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ValidateEmailCodeUseCase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39303b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39304c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValidateEmailCodeRepository f39305a;

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
        public static final class NetworkError implements Result {
            public static final int $stable = 0;
            public static final NetworkError INSTANCE = new NetworkError();

            private NetworkError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NetworkError);
            }

            public int hashCode() {
                return -427203888;
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
                return 1116304365;
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
                return 353167905;
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
                return -1727004108;
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
        /* synthetic */ Object f39306a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39308c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39306a = obj;
            this.f39308c |= RtlSpacingHelper.UNDEFINED;
            return ValidateEmailCodeUseCase.this.a(null, null, this);
        }
    }

    public ValidateEmailCodeUseCase(ValidateEmailCodeRepository validateEmailCodeRepository) {
        t.f(validateEmailCodeRepository, "validateEmailCodeRepository");
        this.f39305a = validateEmailCodeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, zt.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.b
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$b r0 = (com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.b) r0
            int r1 = r0.f39308c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39308c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$b r0 = new com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39306a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39308c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.x.b(r7)
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository r7 = r4.f39305a
            r0.f39308c = r3
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result r7 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result) r7
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Success r5 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Success.INSTANCE
            boolean r5 = ju.t.b(r7, r5)
            if (r5 == 0) goto L4c
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$Success r5 = com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.Result.Success.INSTANCE
            return r5
        L4c:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$NetworkError r5 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.NetworkError.INSTANCE
            boolean r5 = ju.t.b(r7, r5)
            if (r5 == 0) goto L57
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$NetworkError r5 = com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.Result.NetworkError.INSTANCE
            return r5
        L57:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$UnexpectedError r5 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.UnexpectedError.INSTANCE
            boolean r5 = ju.t.b(r7, r5)
            if (r5 == 0) goto L62
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$UnexpectedError r5 = com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.Result.UnexpectedError.INSTANCE
            return r5
        L62:
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$UnknownError r5 = com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.UnknownError.INSTANCE
            boolean r5 = ju.t.b(r7, r5)
            if (r5 == 0) goto L6d
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$UnknownError r5 = com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.Result.UnknownError.INSTANCE
            return r5
        L6d:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.BadRequestMessage
            if (r5 == 0) goto L7d
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$BadRequestMessage r5 = new com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$BadRequestMessage
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$BadRequestMessage r7 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.BadRequestMessage) r7
            java.lang.String r6 = r7.getMessage()
            r5.<init>(r6)
            return r5
        L7d:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Error
            if (r5 == 0) goto L8f
            y9.a r5 = y9.a.f86838a
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Error r7 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Error) r7
            java.lang.Exception r6 = r7.getException()
            r5.i(r6)
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$UnexpectedError r5 = com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.Result.UnexpectedError.INSTANCE
            return r5
        L8f:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Failed
            if (r5 == 0) goto Lb0
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$BadRequestMessage r5 = new com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$BadRequestMessage
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$Failed r7 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.Failed) r7
            int r6 = r7.getResponseCode()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unexpected error code: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            return r5
        Lb0:
            boolean r5 = r7 instanceof com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.ThrottledError
            if (r5 == 0) goto Lc0
            com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$ThrottledError r5 = new com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase$Result$ThrottledError
            com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository$Result$ThrottledError r7 = (com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository.Result.ThrottledError) r7
            int r6 = r7.getSeconds()
            r5.<init>(r6)
            return r5
        Lc0:
            ut.s r5 = new ut.s
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase.a(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

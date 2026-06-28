package com.server.auditor.ssh.client.ui.auth.signup.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.repositories.auth.b;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import sl.b;
import ut.s;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class CheckEmailAvailabilityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f39268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.repositories.auth.b f39269b;

    @Keep
    public interface Result {

        @Keep
        public static final class Error implements Result {
            public static final int $stable = 0;
            private final String message;

            public Error(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && t.b(this.message, ((Error) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class ErrorInvalidEmail implements Result {
            public static final int $stable = 0;
            public static final ErrorInvalidEmail INSTANCE = new ErrorInvalidEmail();

            private ErrorInvalidEmail() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ErrorInvalidEmail);
            }

            public int hashCode() {
                return -94433807;
            }

            public String toString() {
                return "ErrorInvalidEmail";
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
                return -85414378;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        @Keep
        public static final class RecaptchaRequired implements Result {
            public static final int $stable = 0;
            private final String error;

            public RecaptchaRequired(String str) {
                t.f(str, "error");
                this.error = str;
            }

            public static /* synthetic */ RecaptchaRequired copy$default(RecaptchaRequired recaptchaRequired, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = recaptchaRequired.error;
                }
                return recaptchaRequired.copy(str);
            }

            public final String component1() {
                return this.error;
            }

            public final RecaptchaRequired copy(String str) {
                t.f(str, "error");
                return new RecaptchaRequired(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecaptchaRequired) && t.b(this.error, ((RecaptchaRequired) obj).error);
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "RecaptchaRequired(error=" + this.error + ")";
            }
        }

        @Keep
        public static final class Success implements Result {
            public static final int $stable = 0;
            private final String email;
            private final boolean isAvailable;

            public Success(boolean z10, String str) {
                t.f(str, "email");
                this.isAvailable = z10;
                this.email = str;
            }

            public static /* synthetic */ Success copy$default(Success success, boolean z10, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = success.isAvailable;
                }
                if ((i10 & 2) != 0) {
                    str = success.email;
                }
                return success.copy(z10, str);
            }

            public final boolean component1() {
                return this.isAvailable;
            }

            public final String component2() {
                return this.email;
            }

            public final Success copy(boolean z10, String str) {
                t.f(str, "email");
                return new Success(z10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.isAvailable == success.isAvailable && t.b(this.email, success.email);
            }

            public final String getEmail() {
                return this.email;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isAvailable) * 31) + this.email.hashCode();
            }

            public final boolean isAvailable() {
                return this.isAvailable;
            }

            public String toString() {
                return "Success(isAvailable=" + this.isAvailable + ", email=" + this.email + ")";
            }
        }

        @Keep
        public static final class SuccessESSO implements Result {
            public static final int $stable = 0;
            private final String email;

            public SuccessESSO(String str) {
                t.f(str, "email");
                this.email = str;
            }

            public static /* synthetic */ SuccessESSO copy$default(SuccessESSO successESSO, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = successESSO.email;
                }
                return successESSO.copy(str);
            }

            public final String component1() {
                return this.email;
            }

            public final SuccessESSO copy(String str) {
                t.f(str, "email");
                return new SuccessESSO(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuccessESSO) && t.b(this.email, ((SuccessESSO) obj).email);
            }

            public final String getEmail() {
                return this.email;
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return "SuccessESSO(email=" + this.email + ")";
            }
        }

        @Keep
        public static final class ThrottlingError implements Result {
            public static final int $stable = 0;
            private final String message;

            public ThrottlingError(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ ThrottlingError copy$default(ThrottlingError throttlingError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = throttlingError.message;
                }
                return throttlingError.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final ThrottlingError copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new ThrottlingError(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrottlingError) && t.b(this.message, ((ThrottlingError) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "ThrottlingError(message=" + this.message + ")";
            }
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39271b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39273d;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39271b = obj;
            this.f39273d |= RtlSpacingHelper.UNDEFINED;
            return CheckEmailAvailabilityUseCase.this.b(null, null, this);
        }
    }

    public CheckEmailAvailabilityUseCase(b bVar, com.server.auditor.ssh.client.repositories.auth.b bVar2) {
        t.f(bVar, "checkUsernameApiRepository");
        t.f(bVar2, "checkEmailHasEnterpriseSSO");
        this.f39268a = bVar;
        this.f39269b = bVar2;
    }

    private final Result a(b.AbstractC0586b abstractC0586b, String str) {
        if (abstractC0586b instanceof b.AbstractC0586b.c) {
            return ((b.AbstractC0586b.c) abstractC0586b).a() ? new Result.SuccessESSO(str) : new Result.Success(false, str);
        }
        if (abstractC0586b instanceof b.AbstractC0586b.C0587b) {
            return new Result.Error(((b.AbstractC0586b.C0587b) abstractC0586b).a());
        }
        if (abstractC0586b instanceof b.AbstractC0586b.d) {
            return new Result.ThrottlingError(((b.AbstractC0586b.d) abstractC0586b).a());
        }
        if (abstractC0586b instanceof b.AbstractC0586b.a) {
            return Result.ErrorInvalidEmail.INSTANCE;
        }
        throw new s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, zt.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase.a
            if (r0 == 0) goto L13
            r0 = r8
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$a r0 = (com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase.a) r0
            int r1 = r0.f39273d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39273d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$a r0 = new com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f39271b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f39273d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f39270a
            java.lang.String r6 = (java.lang.String) r6
            ut.x.b(r8)
            goto L71
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f39270a
            java.lang.String r6 = (java.lang.String) r6
            ut.x.b(r8)
            goto L50
        L40:
            ut.x.b(r8)
            sl.b r8 = r5.f39268a
            r0.f39270a = r6
            r0.f39273d = r4
            java.lang.Object r8 = r8.a(r6, r7, r0)
            if (r8 != r1) goto L50
            goto L70
        L50:
            sl.b$b r8 = (sl.b.AbstractC1219b) r8
            boolean r7 = r8 instanceof sl.b.AbstractC1219b.e
            if (r7 == 0) goto L78
            sl.b$b$e r8 = (sl.b.AbstractC1219b.e) r8
            boolean r7 = r8.a()
            if (r7 == 0) goto L64
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$Success r7 = new com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$Success
            r7.<init>(r4, r6)
            return r7
        L64:
            com.server.auditor.ssh.client.repositories.auth.b r7 = r5.f39269b
            r0.f39270a = r6
            r0.f39273d = r3
            java.lang.Object r8 = r7.a(r6, r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            com.server.auditor.ssh.client.repositories.auth.b$b r8 = (com.server.auditor.ssh.client.repositories.auth.b.AbstractC0586b) r8
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result r6 = r5.a(r8, r6)
            return r6
        L78:
            boolean r6 = r8 instanceof sl.b.AbstractC1219b.d
            if (r6 == 0) goto L88
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$RecaptchaRequired r6 = new com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$RecaptchaRequired
            sl.b$b$d r8 = (sl.b.AbstractC1219b.d) r8
            java.lang.String r7 = r8.a()
            r6.<init>(r7)
            return r6
        L88:
            boolean r6 = r8 instanceof sl.b.AbstractC1219b.C1220b
            if (r6 == 0) goto L98
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$Error r6 = new com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$Error
            sl.b$b$b r8 = (sl.b.AbstractC1219b.C1220b) r8
            java.lang.String r7 = r8.a()
            r6.<init>(r7)
            return r6
        L98:
            boolean r6 = r8 instanceof sl.b.AbstractC1219b.f
            if (r6 == 0) goto La8
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$ThrottlingError r6 = new com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$ThrottlingError
            sl.b$b$f r8 = (sl.b.AbstractC1219b.f) r8
            java.lang.String r7 = r8.a()
            r6.<init>(r7)
            return r6
        La8:
            boolean r6 = r8 instanceof sl.b.AbstractC1219b.a
            if (r6 == 0) goto Laf
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$ErrorInvalidEmail r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase.Result.ErrorInvalidEmail.INSTANCE
            return r6
        Laf:
            sl.b$b$c r6 = sl.b.AbstractC1219b.c.f78016a
            boolean r6 = ju.t.b(r8, r6)
            if (r6 == 0) goto Lba
            com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase$Result$NetworkError r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase.Result.NetworkError.INSTANCE
            return r6
        Lba:
            ut.s r6 = new ut.s
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase.b(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

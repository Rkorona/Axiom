package com.server.auditor.ssh.client.ui.auth.signup.domain;

import androidx.annotation.Keep;
import au.b;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import ju.t;
import kotlin.coroutines.jvm.internal.h;
import lg.d;
import og.u;
import qi.i;
import ut.w;
import zt.e;
import zt.k;

/* JADX INFO: loaded from: classes4.dex */
public final class SignUpInteractorWithResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f39299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f39300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f39301c;

    @Keep
    public interface Result {

        @Keep
        public static final class SignUpEmailVerificationFailed implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignUpEmailVerificationFailed(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignUpEmailVerificationFailed copy$default(SignUpEmailVerificationFailed signUpEmailVerificationFailed, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signUpEmailVerificationFailed.message;
                }
                return signUpEmailVerificationFailed.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignUpEmailVerificationFailed copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignUpEmailVerificationFailed(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignUpEmailVerificationFailed) && t.b(this.message, ((SignUpEmailVerificationFailed) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignUpEmailVerificationFailed(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class SignUpError implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignUpError(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignUpError copy$default(SignUpError signUpError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signUpError.message;
                }
                return signUpError.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignUpError copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignUpError(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignUpError) && t.b(this.message, ((SignUpError) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignUpError(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class SignUpFailed implements Result {
            public static final int $stable = 0;
            public static final SignUpFailed INSTANCE = new SignUpFailed();

            private SignUpFailed() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignUpFailed);
            }

            public int hashCode() {
                return -698235685;
            }

            public String toString() {
                return "SignUpFailed";
            }
        }

        @Keep
        public static final class SignUpIntegrityCheckFailed implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignUpIntegrityCheckFailed(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignUpIntegrityCheckFailed copy$default(SignUpIntegrityCheckFailed signUpIntegrityCheckFailed, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signUpIntegrityCheckFailed.message;
                }
                return signUpIntegrityCheckFailed.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignUpIntegrityCheckFailed copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignUpIntegrityCheckFailed(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignUpIntegrityCheckFailed) && t.b(this.message, ((SignUpIntegrityCheckFailed) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignUpIntegrityCheckFailed(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class SignUpInvalidReCaptcha implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignUpInvalidReCaptcha(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignUpInvalidReCaptcha copy$default(SignUpInvalidReCaptcha signUpInvalidReCaptcha, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signUpInvalidReCaptcha.message;
                }
                return signUpInvalidReCaptcha.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignUpInvalidReCaptcha copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignUpInvalidReCaptcha(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignUpInvalidReCaptcha) && t.b(this.message, ((SignUpInvalidReCaptcha) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignUpInvalidReCaptcha(message=" + this.message + ")";
            }
        }

        @Keep
        public static final class SignUpNetworkError implements Result {
            public static final int $stable = 0;
            public static final SignUpNetworkError INSTANCE = new SignUpNetworkError();

            private SignUpNetworkError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignUpNetworkError);
            }

            public int hashCode() {
                return 1831302808;
            }

            public String toString() {
                return "SignUpNetworkError";
            }
        }

        @Keep
        public static final class SignUpSuccess implements Result {
            public static final int $stable = 0;
            public static final SignUpSuccess INSTANCE = new SignUpSuccess();

            private SignUpSuccess() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignUpSuccess);
            }

            public int hashCode() {
                return -951049435;
            }

            public String toString() {
                return "SignUpSuccess";
            }
        }

        @Keep
        public static final class SignUpThrottlingError implements Result {
            public static final int $stable = 0;
            public static final SignUpThrottlingError INSTANCE = new SignUpThrottlingError();

            private SignUpThrottlingError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignUpThrottlingError);
            }

            public int hashCode() {
                return 567887363;
            }

            public String toString() {
                return "SignUpThrottlingError";
            }
        }

        @Keep
        public static final class SignUpUnexpectedError implements Result {
            public static final int $stable = 0;
            public static final SignUpUnexpectedError INSTANCE = new SignUpUnexpectedError();

            private SignUpUnexpectedError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SignUpUnexpectedError);
            }

            public int hashCode() {
                return -1431510695;
            }

            public String toString() {
                return "SignUpUnexpectedError";
            }
        }

        @Keep
        public static final class SignUpUserAlreadyExists implements Result {
            public static final int $stable = 0;
            private final String message;

            public SignUpUserAlreadyExists(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SignUpUserAlreadyExists copy$default(SignUpUserAlreadyExists signUpUserAlreadyExists, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signUpUserAlreadyExists.message;
                }
                return signUpUserAlreadyExists.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SignUpUserAlreadyExists copy(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                return new SignUpUserAlreadyExists(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignUpUserAlreadyExists) && t.b(this.message, ((SignUpUserAlreadyExists) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SignUpUserAlreadyExists(message=" + this.message + ")";
            }
        }
    }

    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f39302a;

        a(e eVar) {
            this.f39302a = eVar;
        }

        @Override // qi.i.a
        public void B() {
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignUpThrottlingError.INSTANCE));
        }

        @Override // qi.i.a
        public void B1() {
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignUpSuccess.INSTANCE));
        }

        @Override // qi.i.a
        public void H1(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.SignUpError(str)));
        }

        @Override // qi.i.a
        public void I(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.SignUpInvalidReCaptcha(str)));
        }

        @Override // qi.i.a
        public void P(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.SignUpUserAlreadyExists(str)));
        }

        @Override // qi.i.a
        public void R0() {
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignUpFailed.INSTANCE));
        }

        @Override // qi.i.a
        public void T() {
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignUpNetworkError.INSTANCE));
        }

        @Override // qi.i.a
        public void U0(String str) {
            t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(new Result.SignUpIntegrityCheckFailed(str)));
        }

        @Override // qi.i.a
        public void g2() {
            e eVar = this.f39302a;
            w.a aVar = w.f82644b;
            eVar.resumeWith(w.b(Result.SignUpUnexpectedError.INSTANCE));
        }
    }

    public SignUpInteractorWithResult(d dVar, u uVar, com.server.auditor.ssh.client.utils.analytics.a aVar) {
        t.f(dVar, "signUpGrpcRepository");
        t.f(uVar, "srpSessionRepo");
        t.f(aVar, "avoAnalytics");
        this.f39299a = dVar;
        this.f39300b = uVar;
        this.f39301c = aVar;
    }

    public final Object a(AuthenticationModel authenticationModel, byte[] bArr, e eVar) throws Throwable {
        k kVar = new k(b.c(eVar));
        new i(this.f39299a, this.f39300b, this.f39301c, new a(kVar)).b(authenticationModel, bArr, false);
        Object objA = kVar.a();
        if (objA == b.f()) {
            h.c(eVar);
        }
        return objA;
    }
}

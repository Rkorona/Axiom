package com.server.auditor.ssh.client.ui.auth.signup.domain;

import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.ui.auth.signup.data.TriggerSendEmailCodeRepository;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SendEmailCodeUseCase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39293b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39294c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TriggerSendEmailCodeRepository f39295a;

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
                return 1468782530;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        @Keep
        public static final class RecaptchaError implements Result {
            public static final int $stable = 0;
            public static final RecaptchaError INSTANCE = new RecaptchaError();

            private RecaptchaError() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof RecaptchaError);
            }

            public int hashCode() {
                return -692017495;
            }

            public String toString() {
                return "RecaptchaError";
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
                return -1018548293;
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
                return 569636847;
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
                return 168982310;
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
        /* synthetic */ Object f39296a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39298c;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39296a = obj;
            this.f39298c |= RtlSpacingHelper.UNDEFINED;
            return SendEmailCodeUseCase.this.a(null, null, this);
        }
    }

    public SendEmailCodeUseCase(TriggerSendEmailCodeRepository triggerSendEmailCodeRepository) {
        t.f(triggerSendEmailCodeRepository, "triggerSendEmailCodeRepository");
        this.f39295a = triggerSendEmailCodeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, zt.e r7) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.SendEmailCodeUseCase.a(java.lang.String, java.lang.String, zt.e):java.lang.Object");
    }
}

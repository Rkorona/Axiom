package com.server.auditor.ssh.client.ui.auth.signup.data;

import androidx.annotation.Keep;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface SignUpProgressStatus {

    @Keep
    public static final class EmailVerificationError implements SignUpProgressStatus {
        public static final int $stable = 0;
        private final String error;

        public EmailVerificationError(String str) {
            t.f(str, "error");
            this.error = str;
        }

        public static /* synthetic */ EmailVerificationError copy$default(EmailVerificationError emailVerificationError, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = emailVerificationError.error;
            }
            return emailVerificationError.copy(str);
        }

        public final String component1() {
            return this.error;
        }

        public final EmailVerificationError copy(String str) {
            t.f(str, "error");
            return new EmailVerificationError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailVerificationError) && t.b(this.error, ((EmailVerificationError) obj).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "EmailVerificationError(error=" + this.error + ")";
        }
    }

    @Keep
    public static final class Error implements SignUpProgressStatus {
        public static final int $stable = 0;
        private final String error;

        public Error(String str) {
            t.f(str, "error");
            this.error = str;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.error;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.error;
        }

        public final Error copy(String str) {
            t.f(str, "error");
            return new Error(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.b(this.error, ((Error) obj).error);
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @Keep
    public static final class Idle implements SignUpProgressStatus {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public int hashCode() {
            return -1014006846;
        }

        public String toString() {
            return "Idle";
        }
    }

    @Keep
    public static final class Progress implements SignUpProgressStatus {
        public static final int $stable = 0;
        public static final Progress INSTANCE = new Progress();

        private Progress() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Progress);
        }

        public int hashCode() {
            return -180922597;
        }

        public String toString() {
            return "Progress";
        }
    }

    @Keep
    public static final class Success implements SignUpProgressStatus {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public int hashCode() {
            return -1009429163;
        }

        public String toString() {
            return "Success";
        }
    }
}

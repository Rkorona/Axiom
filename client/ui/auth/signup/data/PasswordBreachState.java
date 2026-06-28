package com.server.auditor.ssh.client.ui.auth.signup.data;

import androidx.annotation.Keep;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface PasswordBreachState {

    @Keep
    public static final class BreachFound implements PasswordBreachState {
        public static final int $stable = 0;
        public static final BreachFound INSTANCE = new BreachFound();

        private BreachFound() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BreachFound);
        }

        public int hashCode() {
            return 1877267743;
        }

        public String toString() {
            return "BreachFound";
        }
    }

    @Keep
    public static final class BreachNotFound implements PasswordBreachState {
        public static final int $stable = 0;
        public static final BreachNotFound INSTANCE = new BreachNotFound();

        private BreachNotFound() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BreachNotFound);
        }

        public int hashCode() {
            return 1906624946;
        }

        public String toString() {
            return "BreachNotFound";
        }
    }

    @Keep
    public static final class Checking implements PasswordBreachState {
        public static final int $stable = 0;
        public static final Checking INSTANCE = new Checking();

        private Checking() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Checking);
        }

        public int hashCode() {
            return -1632586964;
        }

        public String toString() {
            return "Checking";
        }
    }

    @Keep
    public static final class Error implements PasswordBreachState {
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
    public static final class NotChecked implements PasswordBreachState {
        public static final int $stable = 0;
        public static final NotChecked INSTANCE = new NotChecked();

        private NotChecked() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotChecked);
        }

        public int hashCode() {
            return -1234834906;
        }

        public String toString() {
            return "NotChecked";
        }
    }
}

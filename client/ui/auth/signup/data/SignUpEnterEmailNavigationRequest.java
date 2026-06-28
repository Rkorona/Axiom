package com.server.auditor.ssh.client.ui.auth.signup.data;

import androidx.annotation.Keep;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public interface SignUpEnterEmailNavigationRequest {

    @Keep
    public static final class NavigateToAlreadyHaveAccountRequest implements SignUpEnterEmailNavigationRequest {
        public static final int $stable = 0;
        private final String email;
        private final boolean isESSO;

        public NavigateToAlreadyHaveAccountRequest(String str, boolean z10) {
            t.f(str, "email");
            this.email = str;
            this.isESSO = z10;
        }

        public static /* synthetic */ NavigateToAlreadyHaveAccountRequest copy$default(NavigateToAlreadyHaveAccountRequest navigateToAlreadyHaveAccountRequest, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToAlreadyHaveAccountRequest.email;
            }
            if ((i10 & 2) != 0) {
                z10 = navigateToAlreadyHaveAccountRequest.isESSO;
            }
            return navigateToAlreadyHaveAccountRequest.copy(str, z10);
        }

        public final String component1() {
            return this.email;
        }

        public final boolean component2() {
            return this.isESSO;
        }

        public final NavigateToAlreadyHaveAccountRequest copy(String str, boolean z10) {
            t.f(str, "email");
            return new NavigateToAlreadyHaveAccountRequest(str, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToAlreadyHaveAccountRequest)) {
                return false;
            }
            NavigateToAlreadyHaveAccountRequest navigateToAlreadyHaveAccountRequest = (NavigateToAlreadyHaveAccountRequest) obj;
            return t.b(this.email, navigateToAlreadyHaveAccountRequest.email) && this.isESSO == navigateToAlreadyHaveAccountRequest.isESSO;
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return (this.email.hashCode() * 31) + Boolean.hashCode(this.isESSO);
        }

        public final boolean isESSO() {
            return this.isESSO;
        }

        public String toString() {
            return "NavigateToAlreadyHaveAccountRequest(email=" + this.email + ", isESSO=" + this.isESSO + ")";
        }
    }

    @Keep
    public static final class NavigateToCheckEmailRequest implements SignUpEnterEmailNavigationRequest {
        public static final int $stable = 0;
        private final String email;

        public NavigateToCheckEmailRequest(String str) {
            t.f(str, "email");
            this.email = str;
        }

        public static /* synthetic */ NavigateToCheckEmailRequest copy$default(NavigateToCheckEmailRequest navigateToCheckEmailRequest, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToCheckEmailRequest.email;
            }
            return navigateToCheckEmailRequest.copy(str);
        }

        public final String component1() {
            return this.email;
        }

        public final NavigateToCheckEmailRequest copy(String str) {
            t.f(str, "email");
            return new NavigateToCheckEmailRequest(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCheckEmailRequest) && t.b(this.email, ((NavigateToCheckEmailRequest) obj).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "NavigateToCheckEmailRequest(email=" + this.email + ")";
        }
    }
}

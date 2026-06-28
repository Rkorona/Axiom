package com.server.auditor.ssh.client.ui.auth.signin.data;

import androidx.annotation.Keep;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface EnterEmailNavigationRequest {

    @Keep
    public static final class NavigateToAccountNotFoundAction implements EnterEmailNavigationRequest {
        public static final int $stable = 0;
        private final String email;

        public NavigateToAccountNotFoundAction(String str) {
            t.f(str, "email");
            this.email = str;
        }

        public static /* synthetic */ NavigateToAccountNotFoundAction copy$default(NavigateToAccountNotFoundAction navigateToAccountNotFoundAction, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToAccountNotFoundAction.email;
            }
            return navigateToAccountNotFoundAction.copy(str);
        }

        public final String component1() {
            return this.email;
        }

        public final NavigateToAccountNotFoundAction copy(String str) {
            t.f(str, "email");
            return new NavigateToAccountNotFoundAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToAccountNotFoundAction) && t.b(this.email, ((NavigateToAccountNotFoundAction) obj).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "NavigateToAccountNotFoundAction(email=" + this.email + ")";
        }
    }

    @Keep
    public static final class NavigateToEnterPasswordAction implements EnterEmailNavigationRequest {
        public static final int $stable = 0;
        private final String email;
        private final String ssoToken;

        public NavigateToEnterPasswordAction(String str, String str2) {
            t.f(str, "email");
            this.email = str;
            this.ssoToken = str2;
        }

        public static /* synthetic */ NavigateToEnterPasswordAction copy$default(NavigateToEnterPasswordAction navigateToEnterPasswordAction, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToEnterPasswordAction.email;
            }
            if ((i10 & 2) != 0) {
                str2 = navigateToEnterPasswordAction.ssoToken;
            }
            return navigateToEnterPasswordAction.copy(str, str2);
        }

        public final String component1() {
            return this.email;
        }

        public final String component2() {
            return this.ssoToken;
        }

        public final NavigateToEnterPasswordAction copy(String str, String str2) {
            t.f(str, "email");
            return new NavigateToEnterPasswordAction(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToEnterPasswordAction)) {
                return false;
            }
            NavigateToEnterPasswordAction navigateToEnterPasswordAction = (NavigateToEnterPasswordAction) obj;
            return t.b(this.email, navigateToEnterPasswordAction.email) && t.b(this.ssoToken, navigateToEnterPasswordAction.ssoToken);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getSsoToken() {
            return this.ssoToken;
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            String str = this.ssoToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NavigateToEnterPasswordAction(email=" + this.email + ", ssoToken=" + this.ssoToken + ")";
        }

        public /* synthetic */ NavigateToEnterPasswordAction(String str, String str2, int i10, k kVar) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }
}

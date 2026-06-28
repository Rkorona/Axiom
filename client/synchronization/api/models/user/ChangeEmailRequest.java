package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ChangeEmailRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;
    private final String otpToken;
    private final String securityToken;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ChangeEmailRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ChangeEmailRequest(int i10, String str, String str2, String str3, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, ChangeEmailRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.securityToken = str2;
        if ((i10 & 4) == 0) {
            this.otpToken = null;
        } else {
            this.otpToken = str3;
        }
    }

    public static /* synthetic */ ChangeEmailRequest copy$default(ChangeEmailRequest changeEmailRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changeEmailRequest.email;
        }
        if ((i10 & 2) != 0) {
            str2 = changeEmailRequest.securityToken;
        }
        if ((i10 & 4) != 0) {
            str3 = changeEmailRequest.otpToken;
        }
        return changeEmailRequest.copy(str, str2, str3);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o(SyncConstants.Bundle.OTP_TOKEN)
    public static /* synthetic */ void getOtpToken$annotations() {
    }

    @o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ChangeEmailRequest changeEmailRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, changeEmailRequest.email);
        dVar.f(fVar, 1, changeEmailRequest.securityToken);
        if (!dVar.E(fVar, 2) && changeEmailRequest.otpToken == null) {
            return;
        }
        dVar.v(fVar, 2, x2.f64817a, changeEmailRequest.otpToken);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.securityToken;
    }

    public final String component3() {
        return this.otpToken;
    }

    public final ChangeEmailRequest copy(String str, String str2, String str3) {
        t.f(str, "email");
        t.f(str2, "securityToken");
        return new ChangeEmailRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeEmailRequest)) {
            return false;
        }
        ChangeEmailRequest changeEmailRequest = (ChangeEmailRequest) obj;
        return t.b(this.email, changeEmailRequest.email) && t.b(this.securityToken, changeEmailRequest.securityToken) && t.b(this.otpToken, changeEmailRequest.otpToken);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        int iHashCode = ((this.email.hashCode() * 31) + this.securityToken.hashCode()) * 31;
        String str = this.otpToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChangeEmailRequest(email=" + this.email + ", securityToken=" + this.securityToken + ", otpToken=" + this.otpToken + ")";
    }

    public ChangeEmailRequest(String str, String str2, String str3) {
        t.f(str, "email");
        t.f(str2, "securityToken");
        this.email = str;
        this.securityToken = str2;
        this.otpToken = str3;
    }

    public /* synthetic */ ChangeEmailRequest(String str, String str2, String str3, int i10, k kVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}

package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class Auth2faModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String otpToken;
    private final String securityToken;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return Auth2faModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ Auth2faModel(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, Auth2faModel$$serializer.INSTANCE.getDescriptor());
        }
        this.securityToken = str;
        this.otpToken = str2;
    }

    public static /* synthetic */ Auth2faModel copy$default(Auth2faModel auth2faModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = auth2faModel.securityToken;
        }
        if ((i10 & 2) != 0) {
            str2 = auth2faModel.otpToken;
        }
        return auth2faModel.copy(str, str2);
    }

    @o(SyncConstants.Bundle.OTP_TOKEN)
    public static /* synthetic */ void getOtpToken$annotations() {
    }

    @o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(Auth2faModel auth2faModel, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, auth2faModel.securityToken);
        dVar.f(fVar, 1, auth2faModel.otpToken);
    }

    public final String component1() {
        return this.securityToken;
    }

    public final String component2() {
        return this.otpToken;
    }

    public final Auth2faModel copy(String str, String str2) {
        t.f(str, "securityToken");
        t.f(str2, "otpToken");
        return new Auth2faModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Auth2faModel)) {
            return false;
        }
        Auth2faModel auth2faModel = (Auth2faModel) obj;
        return t.b(this.securityToken, auth2faModel.securityToken) && t.b(this.otpToken, auth2faModel.otpToken);
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        return (this.securityToken.hashCode() * 31) + this.otpToken.hashCode();
    }

    public String toString() {
        return "Auth2faModel(securityToken=" + this.securityToken + ", otpToken=" + this.otpToken + ")";
    }

    public Auth2faModel(String str, String str2) {
        t.f(str, "securityToken");
        t.f(str2, "otpToken");
        this.securityToken = str;
        this.otpToken = str2;
    }
}

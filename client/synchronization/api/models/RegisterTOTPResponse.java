package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class RegisterTOTPResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String account;
    private final String issuer;
    private final String secret;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return RegisterTOTPResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ RegisterTOTPResponse(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, RegisterTOTPResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.secret = str;
        this.issuer = str2;
        this.account = str3;
    }

    public static /* synthetic */ RegisterTOTPResponse copy$default(RegisterTOTPResponse registerTOTPResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = registerTOTPResponse.secret;
        }
        if ((i10 & 2) != 0) {
            str2 = registerTOTPResponse.issuer;
        }
        if ((i10 & 4) != 0) {
            str3 = registerTOTPResponse.account;
        }
        return registerTOTPResponse.copy(str, str2, str3);
    }

    @o("account")
    public static /* synthetic */ void getAccount$annotations() {
    }

    @o("issuer")
    public static /* synthetic */ void getIssuer$annotations() {
    }

    @o("secret")
    public static /* synthetic */ void getSecret$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(RegisterTOTPResponse registerTOTPResponse, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, registerTOTPResponse.secret);
        dVar.f(fVar, 1, registerTOTPResponse.issuer);
        dVar.f(fVar, 2, registerTOTPResponse.account);
    }

    public final String component1() {
        return this.secret;
    }

    public final String component2() {
        return this.issuer;
    }

    public final String component3() {
        return this.account;
    }

    public final RegisterTOTPResponse copy(String str, String str2, String str3) {
        t.f(str, "secret");
        t.f(str2, "issuer");
        t.f(str3, "account");
        return new RegisterTOTPResponse(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterTOTPResponse)) {
            return false;
        }
        RegisterTOTPResponse registerTOTPResponse = (RegisterTOTPResponse) obj;
        return t.b(this.secret, registerTOTPResponse.secret) && t.b(this.issuer, registerTOTPResponse.issuer) && t.b(this.account, registerTOTPResponse.account);
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return (((this.secret.hashCode() * 31) + this.issuer.hashCode()) * 31) + this.account.hashCode();
    }

    public String toString() {
        return "RegisterTOTPResponse(secret=" + this.secret + ", issuer=" + this.issuer + ", account=" + this.account + ")";
    }

    public RegisterTOTPResponse(String str, String str2, String str3) {
        t.f(str, "secret");
        t.f(str2, "issuer");
        t.f(str3, "account");
        this.secret = str;
        this.issuer = str2;
        this.account = str3;
    }
}

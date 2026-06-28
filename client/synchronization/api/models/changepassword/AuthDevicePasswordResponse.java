package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class AuthDevicePasswordResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CryptoSpecResponse cryptoSpec;
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AuthDevicePasswordResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ AuthDevicePasswordResponse(int i10, CryptoSpecResponse cryptoSpecResponse, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, AuthDevicePasswordResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.cryptoSpec = cryptoSpecResponse;
        this.token = str;
    }

    public static /* synthetic */ AuthDevicePasswordResponse copy$default(AuthDevicePasswordResponse authDevicePasswordResponse, CryptoSpecResponse cryptoSpecResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cryptoSpecResponse = authDevicePasswordResponse.cryptoSpec;
        }
        if ((i10 & 2) != 0) {
            str = authDevicePasswordResponse.token;
        }
        return authDevicePasswordResponse.copy(cryptoSpecResponse, str);
    }

    @o("cryptospec")
    public static /* synthetic */ void getCryptoSpec$annotations() {
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AuthDevicePasswordResponse authDevicePasswordResponse, d dVar, f fVar) {
        dVar.o(fVar, 0, CryptoSpecResponse$$serializer.INSTANCE, authDevicePasswordResponse.cryptoSpec);
        dVar.f(fVar, 1, authDevicePasswordResponse.token);
    }

    public final CryptoSpecResponse component1() {
        return this.cryptoSpec;
    }

    public final String component2() {
        return this.token;
    }

    public final AuthDevicePasswordResponse copy(CryptoSpecResponse cryptoSpecResponse, String str) {
        t.f(cryptoSpecResponse, "cryptoSpec");
        t.f(str, "token");
        return new AuthDevicePasswordResponse(cryptoSpecResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthDevicePasswordResponse)) {
            return false;
        }
        AuthDevicePasswordResponse authDevicePasswordResponse = (AuthDevicePasswordResponse) obj;
        return t.b(this.cryptoSpec, authDevicePasswordResponse.cryptoSpec) && t.b(this.token, authDevicePasswordResponse.token);
    }

    public final CryptoSpecResponse getCryptoSpec() {
        return this.cryptoSpec;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.cryptoSpec.hashCode() * 31) + this.token.hashCode();
    }

    public String toString() {
        return "AuthDevicePasswordResponse(cryptoSpec=" + this.cryptoSpec + ", token=" + this.token + ")";
    }

    public AuthDevicePasswordResponse(CryptoSpecResponse cryptoSpecResponse, String str) {
        t.f(cryptoSpecResponse, "cryptoSpec");
        t.f(str, "token");
        this.cryptoSpec = cryptoSpecResponse;
        this.token = str;
    }
}

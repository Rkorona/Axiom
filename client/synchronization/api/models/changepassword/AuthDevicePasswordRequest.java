package com.server.auditor.ssh.client.synchronization.api.models.changepassword;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedPersonalKeySetRequest$$serializer;
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
public final class AuthDevicePasswordRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CryptoSpecRequest cryptoSpec;
    private final String otpToken;
    private final EncryptedPersonalKeySetRequest personalKeySet;
    private final String securityToken;
    private final String srpSalt;
    private final String verifier;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return AuthDevicePasswordRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ AuthDevicePasswordRequest(int i10, String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, CryptoSpecRequest cryptoSpecRequest, String str3, String str4, s2 s2Var) {
        if (31 != (i10 & 31)) {
            d2.a(i10, 31, AuthDevicePasswordRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.verifier = str;
        this.srpSalt = str2;
        this.personalKeySet = encryptedPersonalKeySetRequest;
        this.cryptoSpec = cryptoSpecRequest;
        this.securityToken = str3;
        if ((i10 & 32) == 0) {
            this.otpToken = null;
        } else {
            this.otpToken = str4;
        }
    }

    public static /* synthetic */ AuthDevicePasswordRequest copy$default(AuthDevicePasswordRequest authDevicePasswordRequest, String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, CryptoSpecRequest cryptoSpecRequest, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authDevicePasswordRequest.verifier;
        }
        if ((i10 & 2) != 0) {
            str2 = authDevicePasswordRequest.srpSalt;
        }
        if ((i10 & 4) != 0) {
            encryptedPersonalKeySetRequest = authDevicePasswordRequest.personalKeySet;
        }
        if ((i10 & 8) != 0) {
            cryptoSpecRequest = authDevicePasswordRequest.cryptoSpec;
        }
        if ((i10 & 16) != 0) {
            str3 = authDevicePasswordRequest.securityToken;
        }
        if ((i10 & 32) != 0) {
            str4 = authDevicePasswordRequest.otpToken;
        }
        String str5 = str3;
        String str6 = str4;
        return authDevicePasswordRequest.copy(str, str2, encryptedPersonalKeySetRequest, cryptoSpecRequest, str5, str6);
    }

    @o("cryptospec")
    public static /* synthetic */ void getCryptoSpec$annotations() {
    }

    @o(SyncConstants.Bundle.OTP_TOKEN)
    public static /* synthetic */ void getOtpToken$annotations() {
    }

    @o("personal_keyset")
    public static /* synthetic */ void getPersonalKeySet$annotations() {
    }

    @o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    @o("srp_salt")
    public static /* synthetic */ void getSrpSalt$annotations() {
    }

    @o("verifier")
    public static /* synthetic */ void getVerifier$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(AuthDevicePasswordRequest authDevicePasswordRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, authDevicePasswordRequest.verifier);
        dVar.f(fVar, 1, authDevicePasswordRequest.srpSalt);
        dVar.o(fVar, 2, EncryptedPersonalKeySetRequest$$serializer.INSTANCE, authDevicePasswordRequest.personalKeySet);
        dVar.o(fVar, 3, CryptoSpecRequest$$serializer.INSTANCE, authDevicePasswordRequest.cryptoSpec);
        dVar.f(fVar, 4, authDevicePasswordRequest.securityToken);
        if (!dVar.E(fVar, 5) && authDevicePasswordRequest.otpToken == null) {
            return;
        }
        dVar.v(fVar, 5, x2.f64817a, authDevicePasswordRequest.otpToken);
    }

    public final String component1() {
        return this.verifier;
    }

    public final String component2() {
        return this.srpSalt;
    }

    public final EncryptedPersonalKeySetRequest component3() {
        return this.personalKeySet;
    }

    public final CryptoSpecRequest component4() {
        return this.cryptoSpec;
    }

    public final String component5() {
        return this.securityToken;
    }

    public final String component6() {
        return this.otpToken;
    }

    public final AuthDevicePasswordRequest copy(String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, CryptoSpecRequest cryptoSpecRequest, String str3, String str4) {
        t.f(str, "verifier");
        t.f(str2, "srpSalt");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        t.f(cryptoSpecRequest, "cryptoSpec");
        t.f(str3, "securityToken");
        return new AuthDevicePasswordRequest(str, str2, encryptedPersonalKeySetRequest, cryptoSpecRequest, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthDevicePasswordRequest)) {
            return false;
        }
        AuthDevicePasswordRequest authDevicePasswordRequest = (AuthDevicePasswordRequest) obj;
        return t.b(this.verifier, authDevicePasswordRequest.verifier) && t.b(this.srpSalt, authDevicePasswordRequest.srpSalt) && t.b(this.personalKeySet, authDevicePasswordRequest.personalKeySet) && t.b(this.cryptoSpec, authDevicePasswordRequest.cryptoSpec) && t.b(this.securityToken, authDevicePasswordRequest.securityToken) && t.b(this.otpToken, authDevicePasswordRequest.otpToken);
    }

    public final CryptoSpecRequest getCryptoSpec() {
        return this.cryptoSpec;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public final EncryptedPersonalKeySetRequest getPersonalKeySet() {
        return this.personalKeySet;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final String getSrpSalt() {
        return this.srpSalt;
    }

    public final String getVerifier() {
        return this.verifier;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.verifier.hashCode() * 31) + this.srpSalt.hashCode()) * 31) + this.personalKeySet.hashCode()) * 31) + this.cryptoSpec.hashCode()) * 31) + this.securityToken.hashCode()) * 31;
        String str = this.otpToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AuthDevicePasswordRequest(verifier=" + this.verifier + ", srpSalt=" + this.srpSalt + ", personalKeySet=" + this.personalKeySet + ", cryptoSpec=" + this.cryptoSpec + ", securityToken=" + this.securityToken + ", otpToken=" + this.otpToken + ")";
    }

    public AuthDevicePasswordRequest(String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, CryptoSpecRequest cryptoSpecRequest, String str3, String str4) {
        t.f(str, "verifier");
        t.f(str2, "srpSalt");
        t.f(encryptedPersonalKeySetRequest, "personalKeySet");
        t.f(cryptoSpecRequest, "cryptoSpec");
        t.f(str3, "securityToken");
        this.verifier = str;
        this.srpSalt = str2;
        this.personalKeySet = encryptedPersonalKeySetRequest;
        this.cryptoSpec = cryptoSpecRequest;
        this.securityToken = str3;
        this.otpToken = str4;
    }

    public /* synthetic */ AuthDevicePasswordRequest(String str, String str2, EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, CryptoSpecRequest cryptoSpecRequest, String str3, String str4, int i10, k kVar) {
        this(str, str2, encryptedPersonalKeySetRequest, cryptoSpecRequest, str3, (i10 & 32) != 0 ? null : str4);
    }
}

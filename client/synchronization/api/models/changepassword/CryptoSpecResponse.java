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
public final class CryptoSpecResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String hmacSalt;
    private final String salt;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CryptoSpecResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CryptoSpecResponse(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, CryptoSpecResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.salt = str;
        this.hmacSalt = str2;
    }

    public static /* synthetic */ CryptoSpecResponse copy$default(CryptoSpecResponse cryptoSpecResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cryptoSpecResponse.salt;
        }
        if ((i10 & 2) != 0) {
            str2 = cryptoSpecResponse.hmacSalt;
        }
        return cryptoSpecResponse.copy(str, str2);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CryptoSpecResponse cryptoSpecResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, cryptoSpecResponse.salt);
        dVar.f(fVar, 1, cryptoSpecResponse.hmacSalt);
    }

    public final String component1() {
        return this.salt;
    }

    public final String component2() {
        return this.hmacSalt;
    }

    public final CryptoSpecResponse copy(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "hmacSalt");
        return new CryptoSpecResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoSpecResponse)) {
            return false;
        }
        CryptoSpecResponse cryptoSpecResponse = (CryptoSpecResponse) obj;
        return t.b(this.salt, cryptoSpecResponse.salt) && t.b(this.hmacSalt, cryptoSpecResponse.hmacSalt);
    }

    public final String getHmacSalt() {
        return this.hmacSalt;
    }

    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return (this.salt.hashCode() * 31) + this.hmacSalt.hashCode();
    }

    public String toString() {
        return "CryptoSpecResponse(salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ")";
    }

    public CryptoSpecResponse(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "hmacSalt");
        this.salt = str;
        this.hmacSalt = str2;
    }
}

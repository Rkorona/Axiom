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
public final class CryptoSpecRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String hmacSalt;
    private final String salt;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CryptoSpecRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CryptoSpecRequest(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, CryptoSpecRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.salt = str;
        this.hmacSalt = str2;
    }

    public static /* synthetic */ CryptoSpecRequest copy$default(CryptoSpecRequest cryptoSpecRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cryptoSpecRequest.salt;
        }
        if ((i10 & 2) != 0) {
            str2 = cryptoSpecRequest.hmacSalt;
        }
        return cryptoSpecRequest.copy(str, str2);
    }

    @o("hmac_salt")
    public static /* synthetic */ void getHmacSalt$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CryptoSpecRequest cryptoSpecRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, cryptoSpecRequest.salt);
        dVar.f(fVar, 1, cryptoSpecRequest.hmacSalt);
    }

    public final String component1() {
        return this.salt;
    }

    public final String component2() {
        return this.hmacSalt;
    }

    public final CryptoSpecRequest copy(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "hmacSalt");
        return new CryptoSpecRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoSpecRequest)) {
            return false;
        }
        CryptoSpecRequest cryptoSpecRequest = (CryptoSpecRequest) obj;
        return t.b(this.salt, cryptoSpecRequest.salt) && t.b(this.hmacSalt, cryptoSpecRequest.hmacSalt);
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
        return "CryptoSpecRequest(salt=" + this.salt + ", hmacSalt=" + this.hmacSalt + ")";
    }

    public CryptoSpecRequest(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "hmacSalt");
        this.salt = str;
        this.hmacSalt = str2;
    }
}

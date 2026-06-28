package com.server.auditor.ssh.client.synchronization.api.models.newcrypto;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ObtainSecurityTokenResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ObtainSecurityTokenResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ObtainSecurityTokenResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ObtainSecurityTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
    }

    public static /* synthetic */ ObtainSecurityTokenResponse copy$default(ObtainSecurityTokenResponse obtainSecurityTokenResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = obtainSecurityTokenResponse.token;
        }
        return obtainSecurityTokenResponse.copy(str);
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final String component1() {
        return this.token;
    }

    public final ObtainSecurityTokenResponse copy(String str) {
        t.f(str, "token");
        return new ObtainSecurityTokenResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObtainSecurityTokenResponse) && t.b(this.token, ((ObtainSecurityTokenResponse) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "ObtainSecurityTokenResponse(token=" + this.token + ")";
    }

    public ObtainSecurityTokenResponse(String str) {
        t.f(str, "token");
        this.token = str;
    }
}

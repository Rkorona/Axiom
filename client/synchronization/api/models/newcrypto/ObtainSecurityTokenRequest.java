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
public final class ObtainSecurityTokenRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String passwordHash;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return ObtainSecurityTokenRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ObtainSecurityTokenRequest(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ObtainSecurityTokenRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.passwordHash = str;
    }

    public static /* synthetic */ ObtainSecurityTokenRequest copy$default(ObtainSecurityTokenRequest obtainSecurityTokenRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = obtainSecurityTokenRequest.passwordHash;
        }
        return obtainSecurityTokenRequest.copy(str);
    }

    @o("password")
    public static /* synthetic */ void getPasswordHash$annotations() {
    }

    public final String component1() {
        return this.passwordHash;
    }

    public final ObtainSecurityTokenRequest copy(String str) {
        t.f(str, "passwordHash");
        return new ObtainSecurityTokenRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObtainSecurityTokenRequest) && t.b(this.passwordHash, ((ObtainSecurityTokenRequest) obj).passwordHash);
    }

    public final String getPasswordHash() {
        return this.passwordHash;
    }

    public int hashCode() {
        return this.passwordHash.hashCode();
    }

    public String toString() {
        return "ObtainSecurityTokenRequest(passwordHash=" + this.passwordHash + ")";
    }

    public ObtainSecurityTokenRequest(String str) {
        t.f(str, "passwordHash");
        this.passwordHash = str;
    }
}

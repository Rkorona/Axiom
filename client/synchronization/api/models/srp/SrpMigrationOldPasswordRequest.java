package com.server.auditor.ssh.client.synchronization.api.models.srp;

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
public final class SrpMigrationOldPasswordRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String salt;
    private final String securityToken;
    private final String verifier;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SrpMigrationOldPasswordRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SrpMigrationOldPasswordRequest(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, SrpMigrationOldPasswordRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.securityToken = str;
        this.verifier = str2;
        this.salt = str3;
    }

    public static /* synthetic */ SrpMigrationOldPasswordRequest copy$default(SrpMigrationOldPasswordRequest srpMigrationOldPasswordRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = srpMigrationOldPasswordRequest.securityToken;
        }
        if ((i10 & 2) != 0) {
            str2 = srpMigrationOldPasswordRequest.verifier;
        }
        if ((i10 & 4) != 0) {
            str3 = srpMigrationOldPasswordRequest.salt;
        }
        return srpMigrationOldPasswordRequest.copy(str, str2, str3);
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    @o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    @o("verifier")
    public static /* synthetic */ void getVerifier$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SrpMigrationOldPasswordRequest srpMigrationOldPasswordRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, srpMigrationOldPasswordRequest.securityToken);
        dVar.f(fVar, 1, srpMigrationOldPasswordRequest.verifier);
        dVar.f(fVar, 2, srpMigrationOldPasswordRequest.salt);
    }

    public final String component1() {
        return this.securityToken;
    }

    public final String component2() {
        return this.verifier;
    }

    public final String component3() {
        return this.salt;
    }

    public final SrpMigrationOldPasswordRequest copy(String str, String str2, String str3) {
        t.f(str, "securityToken");
        t.f(str2, "verifier");
        t.f(str3, "salt");
        return new SrpMigrationOldPasswordRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrpMigrationOldPasswordRequest)) {
            return false;
        }
        SrpMigrationOldPasswordRequest srpMigrationOldPasswordRequest = (SrpMigrationOldPasswordRequest) obj;
        return t.b(this.securityToken, srpMigrationOldPasswordRequest.securityToken) && t.b(this.verifier, srpMigrationOldPasswordRequest.verifier) && t.b(this.salt, srpMigrationOldPasswordRequest.salt);
    }

    public final String getSalt() {
        return this.salt;
    }

    public final String getSecurityToken() {
        return this.securityToken;
    }

    public final String getVerifier() {
        return this.verifier;
    }

    public int hashCode() {
        return (((this.securityToken.hashCode() * 31) + this.verifier.hashCode()) * 31) + this.salt.hashCode();
    }

    public String toString() {
        return "SrpMigrationOldPasswordRequest(securityToken=" + this.securityToken + ", verifier=" + this.verifier + ", salt=" + this.salt + ")";
    }

    public SrpMigrationOldPasswordRequest(String str, String str2, String str3) {
        t.f(str, "securityToken");
        t.f(str2, "verifier");
        t.f(str3, "salt");
        this.securityToken = str;
        this.verifier = str2;
        this.salt = str3;
    }
}

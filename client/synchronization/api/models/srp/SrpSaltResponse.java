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
public final class SrpSaltResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String identifier;
    private final String salt;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SrpSaltResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SrpSaltResponse(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, SrpSaltResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.salt = str;
        this.identifier = str2;
    }

    public static /* synthetic */ SrpSaltResponse copy$default(SrpSaltResponse srpSaltResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = srpSaltResponse.salt;
        }
        if ((i10 & 2) != 0) {
            str2 = srpSaltResponse.identifier;
        }
        return srpSaltResponse.copy(str, str2);
    }

    @o("identifier")
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @o("salt")
    public static /* synthetic */ void getSalt$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SrpSaltResponse srpSaltResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, srpSaltResponse.salt);
        dVar.f(fVar, 1, srpSaltResponse.identifier);
    }

    public final String component1() {
        return this.salt;
    }

    public final String component2() {
        return this.identifier;
    }

    public final SrpSaltResponse copy(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "identifier");
        return new SrpSaltResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrpSaltResponse)) {
            return false;
        }
        SrpSaltResponse srpSaltResponse = (SrpSaltResponse) obj;
        return t.b(this.salt, srpSaltResponse.salt) && t.b(this.identifier, srpSaltResponse.identifier);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return (this.salt.hashCode() * 31) + this.identifier.hashCode();
    }

    public String toString() {
        return "SrpSaltResponse(salt=" + this.salt + ", identifier=" + this.identifier + ")";
    }

    public SrpSaltResponse(String str, String str2) {
        t.f(str, "salt");
        t.f(str2, "identifier");
        this.salt = str;
        this.identifier = str2;
    }
}

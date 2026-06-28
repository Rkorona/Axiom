package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class ProTrialExtensionResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String validUntil;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return ProTrialExtensionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ProTrialExtensionResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, ProTrialExtensionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.validUntil = str;
    }

    public static /* synthetic */ ProTrialExtensionResponse copy$default(ProTrialExtensionResponse proTrialExtensionResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = proTrialExtensionResponse.validUntil;
        }
        return proTrialExtensionResponse.copy(str);
    }

    @o("valid_until")
    public static /* synthetic */ void getValidUntil$annotations() {
    }

    public final String component1() {
        return this.validUntil;
    }

    public final ProTrialExtensionResponse copy(String str) {
        t.f(str, "validUntil");
        return new ProTrialExtensionResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProTrialExtensionResponse) && t.b(this.validUntil, ((ProTrialExtensionResponse) obj).validUntil);
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        return this.validUntil.hashCode();
    }

    public String toString() {
        return "ProTrialExtensionResponse(validUntil=" + this.validUntil + ")";
    }

    public ProTrialExtensionResponse(String str) {
        t.f(str, "validUntil");
        this.validUntil = str;
    }
}

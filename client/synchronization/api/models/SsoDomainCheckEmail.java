package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainCheckEmail {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean hasEnterpriseSSO;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainCheckEmail$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainCheckEmail(int i10, boolean z10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SsoDomainCheckEmail$$serializer.INSTANCE.getDescriptor());
        }
        this.hasEnterpriseSSO = z10;
    }

    public static /* synthetic */ SsoDomainCheckEmail copy$default(SsoDomainCheckEmail ssoDomainCheckEmail, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ssoDomainCheckEmail.hasEnterpriseSSO;
        }
        return ssoDomainCheckEmail.copy(z10);
    }

    @o("has_enterprise_sso")
    public static /* synthetic */ void getHasEnterpriseSSO$annotations() {
    }

    public final boolean component1() {
        return this.hasEnterpriseSSO;
    }

    public final SsoDomainCheckEmail copy(boolean z10) {
        return new SsoDomainCheckEmail(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SsoDomainCheckEmail) && this.hasEnterpriseSSO == ((SsoDomainCheckEmail) obj).hasEnterpriseSSO;
    }

    public final boolean getHasEnterpriseSSO() {
        return this.hasEnterpriseSSO;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasEnterpriseSSO);
    }

    public String toString() {
        return "SsoDomainCheckEmail(hasEnterpriseSSO=" + this.hasEnterpriseSSO + ")";
    }

    public SsoDomainCheckEmail(boolean z10) {
        this.hasEnterpriseSSO = z10;
    }
}

package com.server.auditor.ssh.client.synchronization.api.models;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainTokenRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authCode;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainTokenRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainTokenRequest(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SsoDomainTokenRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.authCode = str;
    }

    public static /* synthetic */ SsoDomainTokenRequest copy$default(SsoDomainTokenRequest ssoDomainTokenRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ssoDomainTokenRequest.authCode;
        }
        return ssoDomainTokenRequest.copy(str);
    }

    @o(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE)
    public static /* synthetic */ void getAuthCode$annotations() {
    }

    public final String component1() {
        return this.authCode;
    }

    public final SsoDomainTokenRequest copy(String str) {
        t.f(str, "authCode");
        return new SsoDomainTokenRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SsoDomainTokenRequest) && t.b(this.authCode, ((SsoDomainTokenRequest) obj).authCode);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public int hashCode() {
        return this.authCode.hashCode();
    }

    public String toString() {
        return "SsoDomainTokenRequest(authCode=" + this.authCode + ")";
    }

    public SsoDomainTokenRequest(String str) {
        t.f(str, "authCode");
        this.authCode = str;
    }
}

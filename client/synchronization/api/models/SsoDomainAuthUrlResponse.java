package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainAuthUrlResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authUrl;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainAuthUrlResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainAuthUrlResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SsoDomainAuthUrlResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.authUrl = str;
    }

    public static /* synthetic */ SsoDomainAuthUrlResponse copy$default(SsoDomainAuthUrlResponse ssoDomainAuthUrlResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ssoDomainAuthUrlResponse.authUrl;
        }
        return ssoDomainAuthUrlResponse.copy(str);
    }

    @o("auth_url")
    public static /* synthetic */ void getAuthUrl$annotations() {
    }

    public final String component1() {
        return this.authUrl;
    }

    public final SsoDomainAuthUrlResponse copy(String str) {
        t.f(str, "authUrl");
        return new SsoDomainAuthUrlResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SsoDomainAuthUrlResponse) && t.b(this.authUrl, ((SsoDomainAuthUrlResponse) obj).authUrl);
    }

    public final String getAuthUrl() {
        return this.authUrl;
    }

    public int hashCode() {
        return this.authUrl.hashCode();
    }

    public String toString() {
        return "SsoDomainAuthUrlResponse(authUrl=" + this.authUrl + ")";
    }

    public SsoDomainAuthUrlResponse(String str) {
        t.f(str, "authUrl");
        this.authUrl = str;
    }
}

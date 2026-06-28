package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainAuthUrlRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;
    private final String redirectUrl;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainAuthUrlRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainAuthUrlRequest(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, SsoDomainAuthUrlRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.redirectUrl = str2;
    }

    public static /* synthetic */ SsoDomainAuthUrlRequest copy$default(SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ssoDomainAuthUrlRequest.email;
        }
        if ((i10 & 2) != 0) {
            str2 = ssoDomainAuthUrlRequest.redirectUrl;
        }
        return ssoDomainAuthUrlRequest.copy(str, str2);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("redirect_url")
    public static /* synthetic */ void getRedirectUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, ssoDomainAuthUrlRequest.email);
        dVar.f(fVar, 1, ssoDomainAuthUrlRequest.redirectUrl);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.redirectUrl;
    }

    public final SsoDomainAuthUrlRequest copy(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "redirectUrl");
        return new SsoDomainAuthUrlRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsoDomainAuthUrlRequest)) {
            return false;
        }
        SsoDomainAuthUrlRequest ssoDomainAuthUrlRequest = (SsoDomainAuthUrlRequest) obj;
        return t.b(this.email, ssoDomainAuthUrlRequest.email) && t.b(this.redirectUrl, ssoDomainAuthUrlRequest.redirectUrl);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.redirectUrl.hashCode();
    }

    public String toString() {
        return "SsoDomainAuthUrlRequest(email=" + this.email + ", redirectUrl=" + this.redirectUrl + ")";
    }

    public SsoDomainAuthUrlRequest(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "redirectUrl");
        this.email = str;
        this.redirectUrl = str2;
    }
}

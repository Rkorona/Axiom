package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainTokenResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String token;
    private final SsoDomainUser user;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return SsoDomainTokenResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SsoDomainTokenResponse(int i10, String str, SsoDomainUser ssoDomainUser, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SsoDomainTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = ssoDomainUser;
        }
    }

    public static /* synthetic */ SsoDomainTokenResponse copy$default(SsoDomainTokenResponse ssoDomainTokenResponse, String str, SsoDomainUser ssoDomainUser, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ssoDomainTokenResponse.token;
        }
        if ((i10 & 2) != 0) {
            ssoDomainUser = ssoDomainTokenResponse.user;
        }
        return ssoDomainTokenResponse.copy(str, ssoDomainUser);
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @o("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SsoDomainTokenResponse ssoDomainTokenResponse, kv.d dVar, jv.f fVar) {
        dVar.f(fVar, 0, ssoDomainTokenResponse.token);
        if (!dVar.E(fVar, 1) && ssoDomainTokenResponse.user == null) {
            return;
        }
        dVar.v(fVar, 1, SsoDomainUser$$serializer.INSTANCE, ssoDomainTokenResponse.user);
    }

    public final String component1() {
        return this.token;
    }

    public final SsoDomainUser component2() {
        return this.user;
    }

    public final SsoDomainTokenResponse copy(String str, SsoDomainUser ssoDomainUser) {
        t.f(str, "token");
        return new SsoDomainTokenResponse(str, ssoDomainUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsoDomainTokenResponse)) {
            return false;
        }
        SsoDomainTokenResponse ssoDomainTokenResponse = (SsoDomainTokenResponse) obj;
        return t.b(this.token, ssoDomainTokenResponse.token) && t.b(this.user, ssoDomainTokenResponse.user);
    }

    public final String getToken() {
        return this.token;
    }

    public final SsoDomainUser getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        SsoDomainUser ssoDomainUser = this.user;
        return iHashCode + (ssoDomainUser == null ? 0 : ssoDomainUser.hashCode());
    }

    public String toString() {
        return "SsoDomainTokenResponse(token=" + this.token + ", user=" + this.user + ")";
    }

    public SsoDomainTokenResponse(String str, SsoDomainUser ssoDomainUser) {
        t.f(str, "token");
        this.token = str;
        this.user = ssoDomainUser;
    }

    public /* synthetic */ SsoDomainTokenResponse(String str, SsoDomainUser ssoDomainUser, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : ssoDomainUser);
    }
}

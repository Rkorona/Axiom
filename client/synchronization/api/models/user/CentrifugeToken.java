package com.server.auditor.ssh.client.synchronization.api.models.user;

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
public final class CentrifugeToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long clientId;
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CentrifugeToken$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CentrifugeToken(int i10, String str, long j10, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, CentrifugeToken$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.clientId = j10;
    }

    public static /* synthetic */ CentrifugeToken copy$default(CentrifugeToken centrifugeToken, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = centrifugeToken.token;
        }
        if ((i10 & 2) != 0) {
            j10 = centrifugeToken.clientId;
        }
        return centrifugeToken.copy(str, j10);
    }

    @o("client_id")
    public static /* synthetic */ void getClientId$annotations() {
    }

    @o("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CentrifugeToken centrifugeToken, d dVar, f fVar) {
        dVar.f(fVar, 0, centrifugeToken.token);
        dVar.q(fVar, 1, centrifugeToken.clientId);
    }

    public final String component1() {
        return this.token;
    }

    public final long component2() {
        return this.clientId;
    }

    public final CentrifugeToken copy(String str, long j10) {
        t.f(str, "token");
        return new CentrifugeToken(str, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CentrifugeToken)) {
            return false;
        }
        CentrifugeToken centrifugeToken = (CentrifugeToken) obj;
        return t.b(this.token, centrifugeToken.token) && this.clientId == centrifugeToken.clientId;
    }

    public final long getClientId() {
        return this.clientId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + Long.hashCode(this.clientId);
    }

    public String toString() {
        return "CentrifugeToken(token=" + this.token + ", clientId=" + this.clientId + ")";
    }

    public CentrifugeToken(String str, long j10) {
        t.f(str, "token");
        this.token = str;
        this.clientId = j10;
    }
}

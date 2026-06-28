package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CentrifugoClientId {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String clientId;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CentrifugoClientId$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CentrifugoClientId(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CentrifugoClientId$$serializer.INSTANCE.getDescriptor());
        }
        this.clientId = str;
    }

    public static /* synthetic */ CentrifugoClientId copy$default(CentrifugoClientId centrifugoClientId, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = centrifugoClientId.clientId;
        }
        return centrifugoClientId.copy(str);
    }

    @o("client")
    public static /* synthetic */ void getClientId$annotations() {
    }

    public final String component1() {
        return this.clientId;
    }

    public final CentrifugoClientId copy(String str) {
        t.f(str, "clientId");
        return new CentrifugoClientId(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CentrifugoClientId) && t.b(this.clientId, ((CentrifugoClientId) obj).clientId);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public int hashCode() {
        return this.clientId.hashCode();
    }

    public String toString() {
        return "CentrifugoClientId(clientId=" + this.clientId + ")";
    }

    public CentrifugoClientId(String str) {
        t.f(str, "clientId");
        this.clientId = str;
    }
}

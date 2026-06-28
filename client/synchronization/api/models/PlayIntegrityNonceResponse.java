package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class PlayIntegrityNonceResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String nonce;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return PlayIntegrityNonceResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ PlayIntegrityNonceResponse(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, PlayIntegrityNonceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.nonce = str;
    }

    public static /* synthetic */ PlayIntegrityNonceResponse copy$default(PlayIntegrityNonceResponse playIntegrityNonceResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = playIntegrityNonceResponse.nonce;
        }
        return playIntegrityNonceResponse.copy(str);
    }

    @o("nonce")
    public static /* synthetic */ void getNonce$annotations() {
    }

    public final String component1() {
        return this.nonce;
    }

    public final PlayIntegrityNonceResponse copy(String str) {
        t.f(str, "nonce");
        return new PlayIntegrityNonceResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayIntegrityNonceResponse) && t.b(this.nonce, ((PlayIntegrityNonceResponse) obj).nonce);
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return this.nonce.hashCode();
    }

    public String toString() {
        return "PlayIntegrityNonceResponse(nonce=" + this.nonce + ")";
    }

    public PlayIntegrityNonceResponse(String str) {
        t.f(str, "nonce");
        this.nonce = str;
    }
}

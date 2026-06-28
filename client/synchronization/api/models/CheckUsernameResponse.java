package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CheckUsernameResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isAvailable;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return CheckUsernameResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CheckUsernameResponse(int i10, boolean z10, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CheckUsernameResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.isAvailable = z10;
    }

    public static /* synthetic */ CheckUsernameResponse copy$default(CheckUsernameResponse checkUsernameResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = checkUsernameResponse.isAvailable;
        }
        return checkUsernameResponse.copy(z10);
    }

    @o("is_available")
    public static /* synthetic */ void isAvailable$annotations() {
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final CheckUsernameResponse copy(boolean z10) {
        return new CheckUsernameResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckUsernameResponse) && this.isAvailable == ((CheckUsernameResponse) obj).isAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "CheckUsernameResponse(isAvailable=" + this.isAvailable + ")";
    }

    public CheckUsernameResponse(boolean z10) {
        this.isAvailable = z10;
    }
}

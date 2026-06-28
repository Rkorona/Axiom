package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class StorePublicKeyRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String publicKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return StorePublicKeyRequestBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ StorePublicKeyRequestBody(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, StorePublicKeyRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.publicKey = str;
    }

    public static /* synthetic */ StorePublicKeyRequestBody copy$default(StorePublicKeyRequestBody storePublicKeyRequestBody, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storePublicKeyRequestBody.publicKey;
        }
        return storePublicKeyRequestBody.copy(str);
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public final String component1() {
        return this.publicKey;
    }

    public final StorePublicKeyRequestBody copy(String str) {
        t.f(str, Column.KEY_PUBLIC);
        return new StorePublicKeyRequestBody(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StorePublicKeyRequestBody) && t.b(this.publicKey, ((StorePublicKeyRequestBody) obj).publicKey);
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return this.publicKey.hashCode();
    }

    public String toString() {
        return "StorePublicKeyRequestBody(publicKey=" + this.publicKey + ")";
    }

    public StorePublicKeyRequestBody(String str) {
        t.f(str, Column.KEY_PUBLIC);
        this.publicKey = str;
    }
}

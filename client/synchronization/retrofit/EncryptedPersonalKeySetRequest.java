package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
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
public final class EncryptedPersonalKeySetRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String encryptedPrivateKey;
    private final String publicKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return EncryptedPersonalKeySetRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ EncryptedPersonalKeySetRequest(int i10, String str, String str2, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, EncryptedPersonalKeySetRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.encryptedPrivateKey = str;
        this.publicKey = str2;
    }

    public static /* synthetic */ EncryptedPersonalKeySetRequest copy$default(EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptedPersonalKeySetRequest.encryptedPrivateKey;
        }
        if ((i10 & 2) != 0) {
            str2 = encryptedPersonalKeySetRequest.publicKey;
        }
        return encryptedPersonalKeySetRequest.copy(str, str2);
    }

    @o(SyncConstants.Bundle.ENCRYPTED_PRIVATE_KEY)
    public static /* synthetic */ void getEncryptedPrivateKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest, d dVar, f fVar) {
        dVar.f(fVar, 0, encryptedPersonalKeySetRequest.encryptedPrivateKey);
        dVar.f(fVar, 1, encryptedPersonalKeySetRequest.publicKey);
    }

    public final String component1() {
        return this.encryptedPrivateKey;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final EncryptedPersonalKeySetRequest copy(String str, String str2) {
        t.f(str, "encryptedPrivateKey");
        t.f(str2, Column.KEY_PUBLIC);
        return new EncryptedPersonalKeySetRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedPersonalKeySetRequest)) {
            return false;
        }
        EncryptedPersonalKeySetRequest encryptedPersonalKeySetRequest = (EncryptedPersonalKeySetRequest) obj;
        return t.b(this.encryptedPrivateKey, encryptedPersonalKeySetRequest.encryptedPrivateKey) && t.b(this.publicKey, encryptedPersonalKeySetRequest.publicKey);
    }

    public final String getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (this.encryptedPrivateKey.hashCode() * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "EncryptedPersonalKeySetRequest(encryptedPrivateKey=" + this.encryptedPrivateKey + ", publicKey=" + this.publicKey + ")";
    }

    public EncryptedPersonalKeySetRequest(String str, String str2) {
        t.f(str, "encryptedPrivateKey");
        t.f(str2, Column.KEY_PUBLIC);
        this.encryptedPrivateKey = str;
        this.publicKey = str2;
    }
}

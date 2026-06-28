package com.server.auditor.ssh.client.synchronization.retrofit;

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
public final class EncryptedWith {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String publicKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return EncryptedWith$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ EncryptedWith(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, EncryptedWith$$serializer.INSTANCE.getDescriptor());
        }
        this.publicKey = str;
    }

    public static /* synthetic */ EncryptedWith copy$default(EncryptedWith encryptedWith, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptedWith.publicKey;
        }
        return encryptedWith.copy(str);
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public final String component1() {
        return this.publicKey;
    }

    public final EncryptedWith copy(String str) {
        t.f(str, Column.KEY_PUBLIC);
        return new EncryptedWith(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EncryptedWith) && t.b(this.publicKey, ((EncryptedWith) obj).publicKey);
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return this.publicKey.hashCode();
    }

    public String toString() {
        return "EncryptedWith(publicKey=" + this.publicKey + ")";
    }

    public EncryptedWith(String str) {
        t.f(str, Column.KEY_PUBLIC);
        this.publicKey = str;
    }
}

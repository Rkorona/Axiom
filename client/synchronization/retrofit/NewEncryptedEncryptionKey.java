package com.server.auditor.ssh.client.synchronization.retrofit;

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
public final class NewEncryptedEncryptionKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int encryptedForUserId;
    private final String encryptedKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return NewEncryptedEncryptionKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ NewEncryptedEncryptionKey(int i10, int i11, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, NewEncryptedEncryptionKey$$serializer.INSTANCE.getDescriptor());
        }
        this.encryptedForUserId = i11;
        this.encryptedKey = str;
    }

    public static /* synthetic */ NewEncryptedEncryptionKey copy$default(NewEncryptedEncryptionKey newEncryptedEncryptionKey, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = newEncryptedEncryptionKey.encryptedForUserId;
        }
        if ((i11 & 2) != 0) {
            str = newEncryptedEncryptionKey.encryptedKey;
        }
        return newEncryptedEncryptionKey.copy(i10, str);
    }

    @o("encrypted_for")
    public static /* synthetic */ void getEncryptedForUserId$annotations() {
    }

    @o("encrypted_key")
    public static /* synthetic */ void getEncryptedKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(NewEncryptedEncryptionKey newEncryptedEncryptionKey, d dVar, f fVar) {
        dVar.t(fVar, 0, newEncryptedEncryptionKey.encryptedForUserId);
        dVar.f(fVar, 1, newEncryptedEncryptionKey.encryptedKey);
    }

    public final int component1() {
        return this.encryptedForUserId;
    }

    public final String component2() {
        return this.encryptedKey;
    }

    public final NewEncryptedEncryptionKey copy(int i10, String str) {
        t.f(str, "encryptedKey");
        return new NewEncryptedEncryptionKey(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewEncryptedEncryptionKey)) {
            return false;
        }
        NewEncryptedEncryptionKey newEncryptedEncryptionKey = (NewEncryptedEncryptionKey) obj;
        return this.encryptedForUserId == newEncryptedEncryptionKey.encryptedForUserId && t.b(this.encryptedKey, newEncryptedEncryptionKey.encryptedKey);
    }

    public final int getEncryptedForUserId() {
        return this.encryptedForUserId;
    }

    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public int hashCode() {
        return (Integer.hashCode(this.encryptedForUserId) * 31) + this.encryptedKey.hashCode();
    }

    public String toString() {
        return "NewEncryptedEncryptionKey(encryptedForUserId=" + this.encryptedForUserId + ", encryptedKey=" + this.encryptedKey + ")";
    }

    public NewEncryptedEncryptionKey(int i10, String str) {
        t.f(str, "encryptedKey");
        this.encryptedForUserId = i10;
        this.encryptedKey = str;
    }
}

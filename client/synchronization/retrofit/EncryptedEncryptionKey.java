package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.h1;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class EncryptedEncryptionKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String encryptedKey;
    private final EncryptedWith encryptedWith;
    private final Long originalKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return EncryptedEncryptionKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ EncryptedEncryptionKey(int i10, Long l10, String str, EncryptedWith encryptedWith, s2 s2Var) {
        if (4 != (i10 & 4)) {
            d2.a(i10, 4, EncryptedEncryptionKey$$serializer.INSTANCE.getDescriptor());
        }
        this.originalKey = (i10 & 1) == 0 ? null : l10;
        if ((i10 & 2) == 0) {
            this.encryptedKey = "";
        } else {
            this.encryptedKey = str;
        }
        this.encryptedWith = encryptedWith;
    }

    public static /* synthetic */ EncryptedEncryptionKey copy$default(EncryptedEncryptionKey encryptedEncryptionKey, Long l10, String str, EncryptedWith encryptedWith, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = encryptedEncryptionKey.originalKey;
        }
        if ((i10 & 2) != 0) {
            str = encryptedEncryptionKey.encryptedKey;
        }
        if ((i10 & 4) != 0) {
            encryptedWith = encryptedEncryptionKey.encryptedWith;
        }
        return encryptedEncryptionKey.copy(l10, str, encryptedWith);
    }

    @o("encrypted_key")
    public static /* synthetic */ void getEncryptedKey$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("original_key")
    public static /* synthetic */ void getOriginalKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EncryptedEncryptionKey encryptedEncryptionKey, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || encryptedEncryptionKey.originalKey != null) {
            dVar.v(fVar, 0, h1.f64699a, encryptedEncryptionKey.originalKey);
        }
        if (dVar.E(fVar, 1) || !t.b(encryptedEncryptionKey.encryptedKey, "")) {
            dVar.f(fVar, 1, encryptedEncryptionKey.encryptedKey);
        }
        dVar.o(fVar, 2, EncryptedWith$$serializer.INSTANCE, encryptedEncryptionKey.encryptedWith);
    }

    public final Long component1() {
        return this.originalKey;
    }

    public final String component2() {
        return this.encryptedKey;
    }

    public final EncryptedWith component3() {
        return this.encryptedWith;
    }

    public final EncryptedEncryptionKey copy(Long l10, String str, EncryptedWith encryptedWith) {
        t.f(str, "encryptedKey");
        t.f(encryptedWith, "encryptedWith");
        return new EncryptedEncryptionKey(l10, str, encryptedWith);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedEncryptionKey)) {
            return false;
        }
        EncryptedEncryptionKey encryptedEncryptionKey = (EncryptedEncryptionKey) obj;
        return t.b(this.originalKey, encryptedEncryptionKey.originalKey) && t.b(this.encryptedKey, encryptedEncryptionKey.encryptedKey) && t.b(this.encryptedWith, encryptedEncryptionKey.encryptedWith);
    }

    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public final EncryptedWith getEncryptedWith() {
        return this.encryptedWith;
    }

    public final Long getOriginalKey() {
        return this.originalKey;
    }

    public int hashCode() {
        Long l10 = this.originalKey;
        return ((((l10 == null ? 0 : l10.hashCode()) * 31) + this.encryptedKey.hashCode()) * 31) + this.encryptedWith.hashCode();
    }

    public String toString() {
        return "EncryptedEncryptionKey(originalKey=" + this.originalKey + ", encryptedKey=" + this.encryptedKey + ", encryptedWith=" + this.encryptedWith + ")";
    }

    public EncryptedEncryptionKey(Long l10, String str, EncryptedWith encryptedWith) {
        t.f(str, "encryptedKey");
        t.f(encryptedWith, "encryptedWith");
        this.originalKey = l10;
        this.encryptedKey = str;
        this.encryptedWith = encryptedWith;
    }

    public /* synthetic */ EncryptedEncryptionKey(Long l10, String str, EncryptedWith encryptedWith, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? "" : str, encryptedWith);
    }
}

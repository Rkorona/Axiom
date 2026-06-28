package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedWith;
import com.server.auditor.ssh.client.synchronization.retrofit.EncryptedWith$$serializer;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class EncryptionKeyApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String encryptedKey;
    private final EncryptedWith encryptedWith;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39029id;
    private final boolean isDefault;
    private final long originalKey;
    private final String role;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return EncryptionKeyApiModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ EncryptionKeyApiModel(int i10, long j10, EncryptedWith encryptedWith, String str, String str2, long j11, boolean z10, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, EncryptionKeyApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.originalKey = j10;
        this.encryptedWith = encryptedWith;
        this.encryptedKey = str;
        this.role = str2;
        this.f39029id = j11;
        this.isDefault = z10;
    }

    public static /* synthetic */ EncryptionKeyApiModel copy$default(EncryptionKeyApiModel encryptionKeyApiModel, long j10, EncryptedWith encryptedWith, String str, String str2, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = encryptionKeyApiModel.originalKey;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            encryptedWith = encryptionKeyApiModel.encryptedWith;
        }
        EncryptedWith encryptedWith2 = encryptedWith;
        if ((i10 & 4) != 0) {
            str = encryptionKeyApiModel.encryptedKey;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = encryptionKeyApiModel.role;
        }
        return encryptionKeyApiModel.copy(j12, encryptedWith2, str3, str2, (i10 & 16) != 0 ? encryptionKeyApiModel.f39029id : j11, (i10 & 32) != 0 ? encryptionKeyApiModel.isDefault : z10);
    }

    @o("encrypted_key")
    public static /* synthetic */ void getEncryptedKey$annotations() {
    }

    @o("encrypted_with")
    public static /* synthetic */ void getEncryptedWith$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o("original_key")
    public static /* synthetic */ void getOriginalKey$annotations() {
    }

    @o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @o("is_default")
    public static /* synthetic */ void isDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EncryptionKeyApiModel encryptionKeyApiModel, kv.d dVar, jv.f fVar) {
        dVar.q(fVar, 0, encryptionKeyApiModel.originalKey);
        dVar.o(fVar, 1, EncryptedWith$$serializer.INSTANCE, encryptionKeyApiModel.encryptedWith);
        dVar.f(fVar, 2, encryptionKeyApiModel.encryptedKey);
        dVar.f(fVar, 3, encryptionKeyApiModel.role);
        dVar.q(fVar, 4, encryptionKeyApiModel.f39029id);
        dVar.u(fVar, 5, encryptionKeyApiModel.isDefault);
    }

    public final long component1() {
        return this.originalKey;
    }

    public final EncryptedWith component2() {
        return this.encryptedWith;
    }

    public final String component3() {
        return this.encryptedKey;
    }

    public final String component4() {
        return this.role;
    }

    public final long component5() {
        return this.f39029id;
    }

    public final boolean component6() {
        return this.isDefault;
    }

    public final EncryptionKeyApiModel copy(long j10, EncryptedWith encryptedWith, String str, String str2, long j11, boolean z10) {
        t.f(encryptedWith, "encryptedWith");
        t.f(str, "encryptedKey");
        t.f(str2, "role");
        return new EncryptionKeyApiModel(j10, encryptedWith, str, str2, j11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionKeyApiModel)) {
            return false;
        }
        EncryptionKeyApiModel encryptionKeyApiModel = (EncryptionKeyApiModel) obj;
        return this.originalKey == encryptionKeyApiModel.originalKey && t.b(this.encryptedWith, encryptionKeyApiModel.encryptedWith) && t.b(this.encryptedKey, encryptionKeyApiModel.encryptedKey) && t.b(this.role, encryptionKeyApiModel.role) && this.f39029id == encryptionKeyApiModel.f39029id && this.isDefault == encryptionKeyApiModel.isDefault;
    }

    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public final EncryptedWith getEncryptedWith() {
        return this.encryptedWith;
    }

    public final long getId() {
        return this.f39029id;
    }

    public final long getOriginalKey() {
        return this.originalKey;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.originalKey) * 31) + this.encryptedWith.hashCode()) * 31) + this.encryptedKey.hashCode()) * 31) + this.role.hashCode()) * 31) + Long.hashCode(this.f39029id)) * 31) + Boolean.hashCode(this.isDefault);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        return "EncryptionKeyApiModel(originalKey=" + this.originalKey + ", encryptedWith=" + this.encryptedWith + ", encryptedKey=" + this.encryptedKey + ", role=" + this.role + ", id=" + this.f39029id + ", isDefault=" + this.isDefault + ")";
    }

    public EncryptionKeyApiModel(long j10, EncryptedWith encryptedWith, String str, String str2, long j11, boolean z10) {
        t.f(encryptedWith, "encryptedWith");
        t.f(str, "encryptedKey");
        t.f(str2, "role");
        this.originalKey = j10;
        this.encryptedWith = encryptedWith;
        this.encryptedKey = str;
        this.role = str2;
        this.f39029id = j11;
        this.isDefault = z10;
    }
}

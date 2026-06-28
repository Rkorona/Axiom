package com.server.auditor.ssh.client.synchronization.retrofit;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class EncryptedPersonalKeySet implements Parcelable {
    private final String encryptedPersonalKey;
    private final String encryptedPrivateKey;
    private final String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EncryptedPersonalKeySet> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return EncryptedPersonalKeySet$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<EncryptedPersonalKeySet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EncryptedPersonalKeySet createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new EncryptedPersonalKeySet(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EncryptedPersonalKeySet[] newArray(int i10) {
            return new EncryptedPersonalKeySet[i10];
        }
    }

    public /* synthetic */ EncryptedPersonalKeySet(int i10, String str, String str2, String str3, s2 s2Var) {
        if (7 != (i10 & 7)) {
            d2.a(i10, 7, EncryptedPersonalKeySet$$serializer.INSTANCE.getDescriptor());
        }
        this.encryptedPrivateKey = str;
        this.encryptedPersonalKey = str2;
        this.publicKey = str3;
    }

    public static /* synthetic */ EncryptedPersonalKeySet copy$default(EncryptedPersonalKeySet encryptedPersonalKeySet, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptedPersonalKeySet.encryptedPrivateKey;
        }
        if ((i10 & 2) != 0) {
            str2 = encryptedPersonalKeySet.encryptedPersonalKey;
        }
        if ((i10 & 4) != 0) {
            str3 = encryptedPersonalKeySet.publicKey;
        }
        return encryptedPersonalKeySet.copy(str, str2, str3);
    }

    @o("encrypted_personal_key")
    public static /* synthetic */ void getEncryptedPersonalKey$annotations() {
    }

    @o(SyncConstants.Bundle.ENCRYPTED_PRIVATE_KEY)
    public static /* synthetic */ void getEncryptedPrivateKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(EncryptedPersonalKeySet encryptedPersonalKeySet, d dVar, f fVar) {
        dVar.f(fVar, 0, encryptedPersonalKeySet.encryptedPrivateKey);
        dVar.f(fVar, 1, encryptedPersonalKeySet.encryptedPersonalKey);
        dVar.f(fVar, 2, encryptedPersonalKeySet.publicKey);
    }

    public final String component1() {
        return this.encryptedPrivateKey;
    }

    public final String component2() {
        return this.encryptedPersonalKey;
    }

    public final String component3() {
        return this.publicKey;
    }

    public final EncryptedPersonalKeySet copy(String str, String str2, String str3) {
        t.f(str, "encryptedPrivateKey");
        t.f(str2, "encryptedPersonalKey");
        t.f(str3, Column.KEY_PUBLIC);
        return new EncryptedPersonalKeySet(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedPersonalKeySet)) {
            return false;
        }
        EncryptedPersonalKeySet encryptedPersonalKeySet = (EncryptedPersonalKeySet) obj;
        return t.b(this.encryptedPrivateKey, encryptedPersonalKeySet.encryptedPrivateKey) && t.b(this.encryptedPersonalKey, encryptedPersonalKeySet.encryptedPersonalKey) && t.b(this.publicKey, encryptedPersonalKeySet.publicKey);
    }

    public final String getEncryptedPersonalKey() {
        return this.encryptedPersonalKey;
    }

    public final String getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return (((this.encryptedPrivateKey.hashCode() * 31) + this.encryptedPersonalKey.hashCode()) * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "EncryptedPersonalKeySet(encryptedPrivateKey=" + this.encryptedPrivateKey + ", encryptedPersonalKey=" + this.encryptedPersonalKey + ", publicKey=" + this.publicKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.f(parcel, "dest");
        parcel.writeString(this.encryptedPrivateKey);
        parcel.writeString(this.encryptedPersonalKey);
        parcel.writeString(this.publicKey);
    }

    public EncryptedPersonalKeySet(String str, String str2, String str3) {
        t.f(str, "encryptedPrivateKey");
        t.f(str2, "encryptedPersonalKey");
        t.f(str3, Column.KEY_PUBLIC);
        this.encryptedPrivateKey = str;
        this.encryptedPersonalKey = str2;
        this.publicKey = str3;
    }
}

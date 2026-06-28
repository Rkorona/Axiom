package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageItem implements Parcelable, IVaultKeyIdHolder {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f27860id;
    private final boolean isShared;
    private final String label;
    private final int snippetsCount;
    private VaultKeyId vaultKeyId;
    public static final Parcelable.Creator<PackageItem> CREATOR = new a();
    public static final int $stable = 8;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PackageItem createFromParcel(Parcel parcel) {
            ju.t.f(parcel, "parcel");
            return new PackageItem(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, VaultKeyId.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PackageItem[] newArray(int i10) {
            return new PackageItem[i10];
        }
    }

    public PackageItem(String str, long j10, boolean z10, VaultKeyId vaultKeyId, int i10) {
        ju.t.f(str, "label");
        ju.t.f(vaultKeyId, "vaultKeyId");
        this.label = str;
        this.f27860id = j10;
        this.isShared = z10;
        this.vaultKeyId = vaultKeyId;
        this.snippetsCount = i10;
    }

    public static /* synthetic */ PackageItem copy$default(PackageItem packageItem, String str, long j10, boolean z10, VaultKeyId vaultKeyId, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = packageItem.label;
        }
        if ((i11 & 2) != 0) {
            j10 = packageItem.f27860id;
        }
        if ((i11 & 4) != 0) {
            z10 = packageItem.isShared;
        }
        if ((i11 & 8) != 0) {
            vaultKeyId = packageItem.vaultKeyId;
        }
        if ((i11 & 16) != 0) {
            i10 = packageItem.snippetsCount;
        }
        int i12 = i10;
        boolean z11 = z10;
        return packageItem.copy(str, j10, z11, vaultKeyId, i12);
    }

    public final String component1() {
        return this.label;
    }

    public final long component2() {
        return this.f27860id;
    }

    public final boolean component3() {
        return this.isShared;
    }

    public final VaultKeyId component4() {
        return this.vaultKeyId;
    }

    public final int component5() {
        return this.snippetsCount;
    }

    public final PackageItem copy(String str, long j10, boolean z10, VaultKeyId vaultKeyId, int i10) {
        ju.t.f(str, "label");
        ju.t.f(vaultKeyId, "vaultKeyId");
        return new PackageItem(str, j10, z10, vaultKeyId, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ju.t.b(PackageItem.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ju.t.d(obj, "null cannot be cast to non-null type com.server.auditor.ssh.client.models.PackageItem");
        PackageItem packageItem = (PackageItem) obj;
        return ju.t.b(this.label, packageItem.label) && this.f27860id == packageItem.f27860id;
    }

    public final long getId() {
        return this.f27860id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getSnippetsCount() {
        return this.snippetsCount;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + Long.hashCode(this.f27860id);
    }

    public final boolean isShared() {
        return this.isShared;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        ju.t.f(vaultKeyId, "<set-?>");
        this.vaultKeyId = vaultKeyId;
    }

    public String toString() {
        return "PackageItem(label=" + this.label + ", id=" + this.f27860id + ", isShared=" + this.isShared + ", vaultKeyId=" + this.vaultKeyId + ", snippetsCount=" + this.snippetsCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ju.t.f(parcel, "dest");
        parcel.writeString(this.label);
        parcel.writeLong(this.f27860id);
        parcel.writeInt(this.isShared ? 1 : 0);
        this.vaultKeyId.writeToParcel(parcel, i10);
        parcel.writeInt(this.snippetsCount);
    }

    public /* synthetic */ PackageItem(String str, long j10, boolean z10, VaultKeyId vaultKeyId, int i10, int i11, ju.k kVar) {
        this(str, j10, z10, vaultKeyId, (i11 & 16) != 0 ? 0 : i10);
    }
}

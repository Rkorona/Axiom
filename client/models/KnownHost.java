package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;

/* JADX INFO: loaded from: classes3.dex */
public class KnownHost implements Parcelable, IVaultKeyIdHolder {
    public static final Parcelable.Creator<KnownHost> CREATOR = new a();
    private String mHostname;
    private long mId;
    private Boolean mIsInHosts;
    private String mPublicKey;
    private VaultKeyId vaultKeyId;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KnownHost createFromParcel(Parcel parcel) {
            return new KnownHost(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KnownHost[] newArray(int i10) {
            return new KnownHost[i10];
        }
    }

    public KnownHost(long j10, String str, String str2) {
        this.mIsInHosts = Boolean.FALSE;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mId = j10;
        this.mHostname = str;
        this.mPublicKey = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHost() {
        return this.mHostname;
    }

    public long getId() {
        return this.mId;
    }

    public Boolean getIsInHosts() {
        return this.mIsInHosts;
    }

    public String getKey() {
        return this.mPublicKey;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public void setHost(String str) {
        this.mHostname = str;
    }

    public void setId(long j10) {
        this.mId = j10;
    }

    public void setIsInHosts(Boolean bool) {
        this.mIsInHosts = bool;
    }

    public void setKey(String str) {
        this.mPublicKey = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.mId);
        parcel.writeString(this.mHostname);
        parcel.writeString(this.mPublicKey);
        parcel.writeByte(this.mIsInHosts.booleanValue() ? (byte) 1 : (byte) 0);
        this.vaultKeyId.writeToParcel(parcel, i10);
    }

    public KnownHost(String str, String str2) {
        this.mIsInHosts = Boolean.FALSE;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mHostname = str;
        this.mPublicKey = str2;
    }

    public KnownHost(KnownHostsDBModel knownHostsDBModel) {
        this.mIsInHosts = Boolean.FALSE;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mId = knownHostsDBModel.getIdInDatabase();
        this.mHostname = knownHostsDBModel.getHostname();
        this.mPublicKey = knownHostsDBModel.getPublicKey();
        this.vaultKeyId = knownHostsDBModel.getVaultKeyId();
    }

    public KnownHost(Parcel parcel) {
        this.mIsInHosts = Boolean.FALSE;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mId = parcel.readLong();
        this.mHostname = parcel.readString();
        this.mPublicKey = parcel.readString();
        this.mIsInHosts = Boolean.valueOf(parcel.readByte() != 0);
        this.vaultKeyId = VaultKeyId.CREATOR.createFromParcel(parcel);
    }
}

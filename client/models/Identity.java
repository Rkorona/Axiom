package com.server.auditor.ssh.client.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Arrays;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public class Identity extends Authentication implements IVaultKeyIdHolder {
    public static final Parcelable.Creator<Identity> CREATOR = new a();
    private boolean isMultiKey;
    private Long mDbId;
    private String mGroupTitle;
    private boolean mIsVisible;
    private String mTitle;
    private com.server.auditor.ssh.client.models.properties.c sshIdMode;
    private com.server.auditor.ssh.client.models.properties.c username;
    private VaultKeyId vaultKeyId;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Identity createFromParcel(Parcel parcel) {
            return new Identity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Identity[] newArray(int i10) {
            return new Identity[i10];
        }
    }

    public boolean areAllCredentialsFieldsNull() {
        return this.username.b() == null && getPassword() == null && getSshKeyData().b() == null && getSshIdModeData().b() == null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.server.auditor.ssh.client.models.Authentication
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Identity identity = (Identity) obj;
        String str = this.mTitle;
        if (str == null ? identity.mTitle == null : str.equals(identity.mTitle)) {
            return this.username.b() != null ? ((String) this.username.b()).equals(identity.username.b()) : identity.username.b() == null;
        }
        return false;
    }

    public String getGroupTitle() {
        return this.mGroupTitle;
    }

    public long getId() {
        Long l10 = this.mDbId;
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public String getSshIdMode() {
        return (String) this.sshIdMode.b();
    }

    public com.server.auditor.ssh.client.models.properties.c getSshIdModeData() {
        return this.sshIdMode;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.server.auditor.ssh.client.models.Authentication
    public String getUsername() {
        return (String) this.username.b();
    }

    public com.server.auditor.ssh.client.models.properties.c getUsernameData() {
        return this.username;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    public int hashCode() {
        String[] strArr = {(String) this.username.b(), getPassword(), String.valueOf(isVisible()), (String) this.sshIdMode.b()};
        SshKeyDBModel sshKey = getSshKey();
        return Arrays.hashCode(strArr) + (sshKey != null ? sshKey.hashCode() : 0);
    }

    public boolean isMultiKey() {
        return this.isMultiKey;
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public void patch(Identity identity) {
        if (identity == null) {
            return;
        }
        if (c0.p(getUsername())) {
            setUsername(identity.getUsername());
        }
        if (c0.p(getPassword())) {
            setPassword(identity.getPassword());
        }
        if (this.sshIdMode.b() == null && getSshKey() == null) {
            if (identity.getSshIdMode() != null) {
                setSshIdMode(identity.getSshIdMode());
            } else if (identity.getSshKey() != null) {
                setSshKey(identity.getSshKey());
            }
        }
    }

    public void setGroupTitle(String str) {
        this.mGroupTitle = str;
    }

    public void setId(Long l10) {
        this.mDbId = l10;
    }

    public void setMultiKey(boolean z10) {
        this.isMultiKey = z10;
    }

    @Override // com.server.auditor.ssh.client.models.Authentication
    public void setPassword(String str) {
        super.setPassword(str);
    }

    public void setSshIdMode(String str) {
        this.sshIdMode.f(str);
    }

    public void setSshIdModeAndSource(String str, String str2) {
        this.sshIdMode.f(str);
        this.sshIdMode.e(str2);
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setUsername(String str) {
        this.username.f(str);
    }

    public void setUsernameAndSource(String str, String str2) {
        this.username.f(str);
        this.username.e(str2);
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    public void setVisible(boolean z10) {
        this.mIsVisible = z10;
    }

    public String toString() {
        return "Identity{mTitle='" + this.mTitle + "', mUsername='" + ((String) this.username.b()) + "', mDbId=" + this.mDbId + ", mIsVisible=" + this.mIsVisible + ", sshIdMode=" + ((String) this.sshIdMode.b()) + '}';
    }

    @Override // com.server.auditor.ssh.client.models.Authentication, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mTitle);
        parcel.writeString((String) this.username.b());
        parcel.writeValue(this.mDbId);
        parcel.writeByte(this.mIsVisible ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMultiKey ? (byte) 1 : (byte) 0);
        this.vaultKeyId.writeToParcel(parcel, i10);
    }

    public Identity() {
        this.username = new com.server.auditor.ssh.client.models.properties.c();
        this.mDbId = null;
        this.mGroupTitle = "";
        this.isMultiKey = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.sshIdMode = new com.server.auditor.ssh.client.models.properties.c();
    }

    public Identity(String str, String str2, String str3, SshKeyDBModel sshKeyDBModel, long j10, boolean z10, boolean z11, VaultKeyId vaultKeyId, String str4) {
        super(str3, sshKeyDBModel);
        this.username = new com.server.auditor.ssh.client.models.properties.c();
        this.mDbId = null;
        this.mGroupTitle = "";
        this.isMultiKey = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.sshIdMode = new com.server.auditor.ssh.client.models.properties.c();
        this.mTitle = str;
        this.username.f(str2);
        this.mDbId = Long.valueOf(j10);
        this.mIsVisible = z10;
        this.sshIdMode.f(str4);
        this.isMultiKey = z11;
        this.vaultKeyId = vaultKeyId;
    }

    public Identity(String str, String str2, String str3, SshKeyDBModel sshKeyDBModel, long j10, boolean z10, VaultKeyId vaultKeyId, String str4) {
        super(str3, sshKeyDBModel);
        this.username = new com.server.auditor.ssh.client.models.properties.c();
        this.mDbId = null;
        this.mGroupTitle = "";
        this.isMultiKey = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.sshIdMode = new com.server.auditor.ssh.client.models.properties.c();
        this.mTitle = str;
        this.username.f(str2);
        this.mDbId = Long.valueOf(j10);
        this.mIsVisible = z10;
        this.vaultKeyId = vaultKeyId;
        this.sshIdMode.f(str4);
    }

    public Identity(String str, String str2, SshKeyDBModel sshKeyDBModel, boolean z10) {
        super(str2, sshKeyDBModel);
        this.username = new com.server.auditor.ssh.client.models.properties.c();
        this.mDbId = null;
        this.mGroupTitle = "";
        this.isMultiKey = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.sshIdMode = new com.server.auditor.ssh.client.models.properties.c();
        this.mTitle = "invisible";
        this.username.f(str);
        this.mIsVisible = z10;
    }

    private Identity(Parcel parcel) {
        super(parcel);
        this.username = new com.server.auditor.ssh.client.models.properties.c();
        this.mDbId = null;
        this.mGroupTitle = "";
        this.isMultiKey = false;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.sshIdMode = new com.server.auditor.ssh.client.models.properties.c();
        this.mTitle = parcel.readString();
        this.username.f(parcel.readString());
        this.mDbId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mIsVisible = parcel.readByte() != 0;
        this.isMultiKey = parcel.readByte() != 0;
        this.vaultKeyId = VaultKeyId.CREATOR.createFromParcel(parcel);
    }

    public Identity(Identity identity) {
        this(identity.getTitle(), identity.getUsername(), identity.getPassword(), identity.getSshKey() != null ? new SshKeyDBModel(identity.getSshKey()) : null, identity.getId(), identity.isVisible(), identity.isMultiKey, identity.vaultKeyId, identity.getSshIdMode());
    }
}

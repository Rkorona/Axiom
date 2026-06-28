package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import fw.l;
import java.util.Arrays;
import kj.a;
import kj.f;
import rg.s;
import tp.i;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityDBModel extends SyncableModel implements f, a, Parcelable {
    public static final Parcelable.Creator<IdentityDBModel> CREATOR = new Parcelable.Creator<IdentityDBModel>() { // from class: com.server.auditor.ssh.client.database.models.IdentityDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityDBModel createFromParcel(Parcel parcel) {
            return new IdentityDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityDBModel[] newArray(int i10) {
            return new IdentityDBModel[i10];
        }
    };
    private Long biometricKeyId;
    private boolean mIsVisible;
    private String mPassword;
    private Long mSshKeyId;
    private String mTitle;
    private String mUsername;
    private String sshIdMode;

    public IdentityDBModel() {
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
    }

    public static IdentityDBModel getSshIdentityModelWithExternalReferences(Cursor cursor, s sVar) {
        IdentityDBModel identityDBModel = new IdentityDBModel(cursor, sVar);
        SshKeyDBModel itemByLocalId = hg.f.p().W().getItemByLocalId(cursor.getLong(cursor.getColumnIndex(Column.SSH_KEY_ID)));
        if (itemByLocalId != null) {
            identityDBModel.setSshKeyId(Long.valueOf(itemByLocalId.getIdOnServer() == -1 ? itemByLocalId.getIdInDatabase() : itemByLocalId.getIdOnServer()));
        }
        SshKeyDBModel itemByLocalId2 = hg.f.p().W().getItemByLocalId(cursor.getLong(cursor.getColumnIndex(Column.BIOMETRIC_KEY_ID)));
        if (itemByLocalId2 != null) {
            identityDBModel.setBiometricKeyId(Long.valueOf(itemByLocalId2.getIdOnServer() == -1 ? itemByLocalId2.getIdInDatabase() : itemByLocalId2.getIdOnServer()));
        }
        return identityDBModel;
    }

    public Identity convertToIdentity() {
        SshKeyDBModel itemByLocalId = this.mSshKeyId != null ? hg.f.p().W().getItemByLocalId(this.mSshKeyId.longValue()) : null;
        if (this.biometricKeyId != null) {
            itemByLocalId = hg.f.p().W().getItemByLocalId(this.biometricKeyId.longValue());
        }
        SshKeyDBModel sshKeyDBModel = itemByLocalId;
        String str = this.mUsername;
        this.mUsername = (str == null || !str.isEmpty()) ? this.mUsername : null;
        String str2 = this.mPassword;
        this.mPassword = (str2 == null || !str2.isEmpty()) ? this.mPassword : null;
        Identity identity = new Identity(this.mTitle, this.mUsername, this.mPassword, sshKeyDBModel, this.mId, this.mIsVisible, this.vaultKeyId, this.sshIdMode);
        Boolean bool = this.isShared;
        if (bool != null) {
            identity.setShared(bool.booleanValue());
        }
        if (!com.server.auditor.ssh.client.ui.vaults.data.a.b(this.vaultKeyId)) {
            identity.setVaultKeyId(this.vaultKeyId);
        }
        return identity;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IdentityDBModel)) {
            return false;
        }
        Long l10 = this.mSshKeyId;
        boolean zEquals = l10 != null ? l10.equals(((IdentityDBModel) obj).mSshKeyId) : ((IdentityDBModel) obj).mSshKeyId == null;
        Long l11 = this.biometricKeyId;
        boolean zEquals2 = l11 != null ? l11.equals(((IdentityDBModel) obj).biometricKeyId) : ((IdentityDBModel) obj).biometricKeyId == null;
        IdentityDBModel identityDBModel = (IdentityDBModel) obj;
        return TextUtils.equals(identityDBModel.mUsername, this.mUsername) && TextUtils.equals(identityDBModel.mTitle, this.mTitle) && TextUtils.equals(identityDBModel.mPassword, this.mPassword) && zEquals && zEquals2;
    }

    public Long getBiometricKeyId() {
        return this.biometricKeyId;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public String getSshIdMode() {
        return this.sshIdMode;
    }

    public Long getSshKeyId() {
        return this.mSshKeyId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public int hashCode() {
        Long l10 = this.mSshKeyId;
        String string = l10 != null ? l10.toString() : "";
        Long l11 = this.biometricKeyId;
        return Arrays.hashCode(new String[]{this.mTitle, this.mUsername, this.mPassword, string, l11 != null ? l11.toString() : ""});
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public void setBiometricKeyId(Long l10) {
        this.biometricKeyId = l10;
    }

    public void setPassword(String str) {
        this.mPassword = str;
    }

    public void setSshIdMode(String str) {
        this.sshIdMode = str;
    }

    public void setSshKeyId(Long l10) {
        this.mSshKeyId = l10;
    }

    public void setTitle(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            y9.a.f86838a.i(new MergeException("Couldn't validate a value on IdentityDBModel.java"));
        }
        this.mTitle = str;
    }

    public void setUsername(String str) {
        this.mUsername = str;
    }

    public void setVisible(boolean z10) {
        this.mIsVisible = z10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("username", i.e(this.mUsername));
        contentValues.put("password", sVar.a(i.e(this.mPassword)));
        contentValues.put("title", i.e(this.mTitle));
        contentValues.put(Column.IS_VISIBLE, Boolean.valueOf(this.mIsVisible));
        contentValues.put(Column.SSH_KEY_ID, this.mSshKeyId);
        contentValues.put(Column.BIOMETRIC_KEY_ID, this.biometricKeyId);
        contentValues.put(Column.SSH_ID_MODE, this.sshIdMode);
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mUsername);
        parcel.writeString(this.mPassword);
        parcel.writeString(this.mTitle);
        parcel.writeInt(this.mIsVisible ? 1 : 0);
        parcel.writeValue(this.mSshKeyId);
        parcel.writeValue(this.biometricKeyId);
        parcel.writeValue(this.sshIdMode);
    }

    public IdentityDBModel(Parcel parcel) {
        super(parcel);
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
        this.mUsername = parcel.readString();
        this.mPassword = parcel.readString();
        this.mTitle = parcel.readString();
        this.mIsVisible = parcel.readInt() == 1;
        this.mSshKeyId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.biometricKeyId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.sshIdMode = parcel.readString();
    }

    public IdentityDBModel(String str, String str2, String str3, Long l10, Long l11, boolean z10, String str4) {
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
        if (z10) {
            try {
                l.f(str3);
            } catch (NullPointerException unused) {
                y9.a.f86838a.i(new MergeException("Couldn't validate a value on IdentityDBModel.java"));
            }
        }
        this.mUsername = str;
        this.mPassword = str2;
        this.mTitle = str3;
        this.mIsVisible = z10;
        this.mSshKeyId = l10;
        this.biometricKeyId = l11;
        this.sshIdMode = str4;
    }

    public IdentityDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
        int columnIndex = cursor.getColumnIndex("username");
        int columnIndex2 = cursor.getColumnIndex("password");
        int columnIndex3 = cursor.getColumnIndex("title");
        int columnIndex4 = cursor.getColumnIndex(Column.IS_VISIBLE);
        int columnIndex5 = cursor.getColumnIndex(Column.SSH_ID_MODE);
        this.mUsername = cursor.getString(columnIndex);
        this.mPassword = cursor.getString(columnIndex2);
        this.mTitle = cursor.getString(columnIndex3);
        this.mPassword = sVar.b(this.mPassword);
        this.mIsVisible = 1 == cursor.getInt(columnIndex4);
        this.sshIdMode = cursor.getString(columnIndex5);
        int columnIndex6 = cursor.getColumnIndex(Column.SSH_KEY_ID);
        if (!cursor.isNull(columnIndex6)) {
            this.mSshKeyId = cursor.getLong(columnIndex6) == 0 ? null : Long.valueOf(cursor.getLong(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(Column.BIOMETRIC_KEY_ID);
        if (cursor.isNull(columnIndex7)) {
            return;
        }
        this.biometricKeyId = cursor.getLong(columnIndex7) != 0 ? Long.valueOf(cursor.getLong(columnIndex7)) : null;
    }

    public IdentityDBModel(String str, String str2, String str3, int i10, int i11, String str4, boolean z10, VaultKeyId vaultKeyId, String str5) {
        super(i10, str4, i11);
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
        if (z10) {
            try {
                l.f(str3);
            } catch (NullPointerException unused) {
                y9.a.f86838a.i(new MergeException("Couldn't validate a value on IdentityDBModel.java"));
            }
        }
        this.mUsername = str;
        this.mPassword = str2;
        this.mTitle = str3;
        this.mIsVisible = z10;
        this.vaultKeyId = vaultKeyId;
        this.sshIdMode = str5;
    }

    public IdentityDBModel(String str, String str2, String str3, boolean z10) {
        this.mSshKeyId = null;
        this.biometricKeyId = null;
        this.sshIdMode = null;
        if (z10) {
            try {
                l.f(str3);
            } catch (NullPointerException unused) {
                y9.a.f86838a.i(new MergeException("Couldn't validate a value on IdentityDBModel.java"));
            }
        }
        this.mUsername = str;
        this.mPassword = str2;
        this.mTitle = str3;
        this.mIsVisible = z10;
    }
}

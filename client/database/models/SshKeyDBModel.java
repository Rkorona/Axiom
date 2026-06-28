package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cj.b;
import com.crystalnix.termius.libtermius.Keygen;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import java.util.Arrays;
import rg.s;
import u9.a;
import y9.a;

/* JADX INFO: loaded from: classes3.dex */
public class SshKeyDBModel extends SyncableModel implements Parcelable {
    public static final Parcelable.Creator<SshKeyDBModel> CREATOR = new Parcelable.Creator<SshKeyDBModel>() { // from class: com.server.auditor.ssh.client.database.models.SshKeyDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SshKeyDBModel createFromParcel(Parcel parcel) {
            return new SshKeyDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SshKeyDBModel[] newArray(int i10) {
            return new SshKeyDBModel[i10];
        }
    };
    private String biometricAlias;
    protected String mDatetime;
    private String mKeyType;
    protected String mLabel;
    protected String mPassphrase;
    protected String mPrivateKey;
    protected String mPublicKey;

    public SshKeyDBModel(String str, String str2, String str3, String str4) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on SshKeyDBModel.java"));
        }
        this.mLabel = str;
        this.mPassphrase = str2;
        this.mPrivateKey = str3;
        this.mPublicKey = str4;
        determineAndSetKeyType();
    }

    private void determineAndSetKeyType() {
        if (!TextUtils.isEmpty(this.mKeyType) || TextUtils.isEmpty(this.mPrivateKey)) {
            return;
        }
        u9.a aVarB = new b().b(Keygen.getKeyTypeFromPrivateKey(this.mPrivateKey));
        if (aVarB instanceof a.e) {
            return;
        }
        this.mKeyType = aVarB.a();
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SshKeyDBModel) {
            return ((SshKeyDBModel) obj).getLabel().equals(getLabel());
        }
        return false;
    }

    public String getBiometricAlias() {
        return this.biometricAlias;
    }

    public String getDatetime() {
        return this.mDatetime;
    }

    public String getKeyType() {
        String str = this.mKeyType;
        return str != null ? str : a.e.f81656b.a();
    }

    public String getLabel() {
        return this.mLabel;
    }

    public String getPassphrase() {
        return this.mPassphrase;
    }

    public String getPrivateKey() {
        return this.mPrivateKey;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.mLabel, this.mPrivateKey, this.mPublicKey, this.mPassphrase, this.biometricAlias});
    }

    public void setBiometricAlias(String str) {
        this.biometricAlias = str;
    }

    public void setDateTime(String str) {
        this.mDatetime = str;
    }

    public void setKeyType(String str) {
        this.mKeyType = str;
    }

    public void setLabel(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            y9.a.f86838a.i(new MergeException("Couldn't validate a value on SshKeyDBModel.java"));
        }
        this.mLabel = str;
    }

    public void setPassphrase(String str) {
        this.mPassphrase = str;
    }

    public void setPublicKey(String str) {
        this.mPublicKey = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("title", this.mLabel);
        contentValues.put(Column.PASS_PHRASE, sVar.a(this.mPassphrase));
        contentValues.put(Column.KEY_PRIVATE, sVar.a(this.mPrivateKey));
        contentValues.put(Column.KEY_PUBLIC, sVar.a(this.mPublicKey));
        contentValues.put(Column.DATETIME, this.mDatetime);
        contentValues.put(Column.KEY_TYPE, this.mKeyType);
        contentValues.put(Column.BIOMETRIC_ALIAS, this.biometricAlias);
        return contentValues;
    }

    public String toString() {
        return this.mLabel;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mLabel);
        parcel.writeString(this.mPassphrase);
        parcel.writeString(this.mPrivateKey);
        parcel.writeString(this.mPublicKey);
        parcel.writeString(this.mDatetime);
        parcel.writeString(this.mKeyType);
        parcel.writeString(this.biometricAlias);
    }

    public SshKeyDBModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4);
        this.mDatetime = str6;
        this.mKeyType = str5;
    }

    public SshKeyDBModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str7);
        this.biometricAlias = str6;
    }

    public SshKeyDBModel(String str, String str2, String str3, String str4, String str5, long j10, int i10) {
        super(j10, str5, i10);
        this.mLabel = str;
        this.mPassphrase = str2;
        this.mPrivateKey = str3;
        this.mPublicKey = str4;
        this.mDatetime = str5;
        determineAndSetKeyType();
    }

    public SshKeyDBModel(String str, String str2, String str3, String str4, String str5, long j10, int i10, String str6) {
        this(str, str2, str3, str4, str5, j10, i10);
        this.mKeyType = str6;
    }

    protected SshKeyDBModel(Parcel parcel) {
        super(parcel);
        this.mLabel = parcel.readString();
        this.mPassphrase = parcel.readString();
        this.mPrivateKey = parcel.readString();
        this.mPublicKey = parcel.readString();
        this.mDatetime = parcel.readString();
        this.mKeyType = parcel.readString();
        this.biometricAlias = parcel.readString();
    }

    public SshKeyDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex("title");
        int columnIndex2 = cursor.getColumnIndex(Column.PASS_PHRASE);
        int columnIndex3 = cursor.getColumnIndex(Column.KEY_PRIVATE);
        int columnIndex4 = cursor.getColumnIndex(Column.KEY_PUBLIC);
        int columnIndex5 = cursor.getColumnIndex(Column.DATETIME);
        int columnIndex6 = cursor.getColumnIndex(Column.KEY_TYPE);
        int columnIndex7 = cursor.getColumnIndex(Column.BIOMETRIC_ALIAS);
        this.mLabel = cursor.getString(columnIndex);
        this.mPassphrase = cursor.getString(columnIndex2);
        this.mPrivateKey = cursor.getString(columnIndex3);
        this.mPublicKey = cursor.getString(columnIndex4);
        this.mDatetime = cursor.getString(columnIndex5);
        this.mPassphrase = sVar.b(this.mPassphrase);
        this.mPrivateKey = sVar.b(this.mPrivateKey);
        this.mPublicKey = sVar.b(this.mPublicKey);
        this.mKeyType = cursor.getString(columnIndex6);
        this.biometricAlias = cursor.getString(columnIndex7);
    }

    public SshKeyDBModel(SshKeyDBModel sshKeyDBModel) {
        this(sshKeyDBModel.getLabel(), sshKeyDBModel.getPassphrase(), sshKeyDBModel.getPrivateKey(), sshKeyDBModel.getPublicKey(), sshKeyDBModel.getDatetime(), sshKeyDBModel.mIdOnServer, sshKeyDBModel.mStatus, sshKeyDBModel.mKeyType);
        this.biometricAlias = sshKeyDBModel.getBiometricAlias();
        this.mId = sshKeyDBModel.getIdInDatabase();
    }
}

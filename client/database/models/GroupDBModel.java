package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.properties.TelnetProperties;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import hg.f;
import java.util.Objects;
import rg.s;
import y9.a;

/* JADX INFO: loaded from: classes3.dex */
public class GroupDBModel extends SyncableModel implements Parcelable {
    public static final Parcelable.Creator<GroupDBModel> CREATOR = new Parcelable.Creator<GroupDBModel>() { // from class: com.server.auditor.ssh.client.database.models.GroupDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GroupDBModel createFromParcel(Parcel parcel) {
            return new GroupDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GroupDBModel[] newArray(int i10) {
            return new GroupDBModel[i10];
        }
    };
    private String credentialsMode;
    private transient int mCountAllNestedHosts;
    private GroupDBModel mParentGroupDbModel;
    private Long mParentGroupId;
    private Long mSshConfigId;
    private SshProperties mSshProperties;
    private Long mTelnetConfigId;
    private TelnetProperties mTelnetProperties;
    private String mTitle;
    private String sharingMode;

    public GroupDBModel() {
        this.mSshConfigId = null;
        this.mTelnetConfigId = null;
        this.mParentGroupId = null;
        this.sharingMode = null;
        this.credentialsMode = null;
        this.mCountAllNestedHosts = 0;
    }

    public static GroupDBModel getGroupDBModelWithExternalReferences(Cursor cursor, s sVar) {
        TelnetRemoteConfigDBModel itemByLocalId;
        SshRemoteConfigDBModel itemByLocalId2;
        GroupDBModel itemByLocalId3;
        GroupDBModel groupDBModel = new GroupDBModel(cursor, sVar);
        if (groupDBModel.mParentGroupId != null && (itemByLocalId3 = f.p().h().getItemByLocalId(groupDBModel.mParentGroupId.longValue())) != null) {
            long j10 = itemByLocalId3.mIdOnServer;
            if (j10 != -1) {
                groupDBModel.mParentGroupId = Long.valueOf(j10);
            }
        }
        if (groupDBModel.mSshConfigId != null && (itemByLocalId2 = f.p().S().getItemByLocalId(groupDBModel.mSshConfigId.longValue())) != null) {
            long j11 = itemByLocalId2.mIdOnServer;
            if (j11 != -1) {
                groupDBModel.mSshConfigId = Long.valueOf(j11);
            }
        }
        if (groupDBModel.mTelnetConfigId != null && (itemByLocalId = f.p().e0().getItemByLocalId(groupDBModel.mTelnetConfigId.longValue())) != null) {
            long j12 = itemByLocalId.mIdOnServer;
            if (j12 != -1) {
                groupDBModel.mTelnetConfigId = Long.valueOf(j12);
            }
        }
        return groupDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupDBModel) {
            GroupDBModel groupDBModel = (GroupDBModel) obj;
            if (this.mCountAllNestedHosts == groupDBModel.mCountAllNestedHosts && Objects.equals(this.mTitle, groupDBModel.mTitle) && Objects.equals(this.mSshConfigId, groupDBModel.mSshConfigId) && Objects.equals(this.mTelnetConfigId, groupDBModel.mTelnetConfigId) && Objects.equals(this.mParentGroupId, groupDBModel.mParentGroupId) && Objects.equals(getSharingMode(), groupDBModel.getSharingMode()) && Objects.equals(getCredentialsMode(), groupDBModel.getCredentialsMode())) {
                return true;
            }
        }
        return false;
    }

    public int getCountAllNestedHosts() {
        return this.mCountAllNestedHosts;
    }

    public String getCredentialsMode() {
        return this.credentialsMode;
    }

    public GroupDBModel getParentGroupDBModel() {
        return this.mParentGroupDbModel;
    }

    public Long getParentGroupId() {
        return this.mParentGroupId;
    }

    public String getSharingMode() {
        return this.sharingMode;
    }

    public SshProperties getSshConfig() {
        return this.mSshProperties;
    }

    public Long getSshConfigId() {
        return this.mSshConfigId;
    }

    public TelnetProperties getTelnetConfig() {
        return this.mTelnetProperties;
    }

    public Long getTelnetConfigId() {
        return this.mTelnetConfigId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSshConfigId, this.mTelnetConfigId, this.mParentGroupId, getSharingMode(), getCredentialsMode(), Integer.valueOf(this.mCountAllNestedHosts));
    }

    public void setCountAllNestedHosts(int i10) {
        this.mCountAllNestedHosts = i10;
    }

    public void setCredentialsMode(String str) {
        this.credentialsMode = str;
    }

    public void setParentGroupId(Long l10) {
        this.mParentGroupId = l10;
    }

    public void setSharingMode(String str) {
        this.sharingMode = str;
    }

    public void setSshConfigId(Long l10) {
        this.mSshConfigId = l10;
    }

    public void setTelnetConfigId(Long l10) {
        this.mTelnetConfigId = l10;
    }

    public void setTitle(String str) {
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on GroupDBModel.java"));
        }
        this.mTitle = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put("title", this.mTitle);
        contentValues.put(Column.SSH_CONFIG_ID, this.mSshConfigId);
        contentValues.put(Column.TELNET_CONFIG_ID, this.mTelnetConfigId);
        contentValues.put(Column.PARENT_GROUP_ID, this.mParentGroupId);
        contentValues.put("sharing_mode", this.sharingMode);
        contentValues.put("credentials_mode", this.credentialsMode);
        return contentValues;
    }

    public String toString() {
        return this.mTitle;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mTitle);
        parcel.writeValue(this.mSshConfigId);
        parcel.writeValue(this.mTelnetConfigId);
        parcel.writeValue(this.mParentGroupId);
        parcel.writeString(this.sharingMode);
        parcel.writeString(this.credentialsMode);
        parcel.writeValue(this.mSshProperties);
        parcel.writeValue(this.mTelnetProperties);
        parcel.writeValue(this.mParentGroupDbModel);
    }

    public GroupDBModel(String str) {
        this.mSshConfigId = null;
        this.mTelnetConfigId = null;
        this.mParentGroupId = null;
        this.sharingMode = null;
        this.credentialsMode = null;
        this.mCountAllNestedHosts = 0;
        try {
            l.f(str);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on GroupDBModel.java"));
        }
        this.mTitle = str;
    }

    public GroupDBModel(String str, SshProperties sshProperties, TelnetProperties telnetProperties, GroupDBModel groupDBModel) {
        this(str);
        this.mSshProperties = sshProperties;
        this.mTelnetProperties = telnetProperties;
        this.mParentGroupDbModel = groupDBModel;
    }

    public GroupDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mSshConfigId = null;
        this.mTelnetConfigId = null;
        this.mParentGroupId = null;
        this.sharingMode = null;
        this.credentialsMode = null;
        this.mCountAllNestedHosts = 0;
        int columnIndex = cursor.getColumnIndex(Column.SSH_CONFIG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.TELNET_CONFIG_ID);
        int columnIndex3 = cursor.getColumnIndex(Column.PARENT_GROUP_ID);
        int columnIndex4 = cursor.getColumnIndex("sharing_mode");
        int columnIndex5 = cursor.getColumnIndex("credentials_mode");
        this.mTitle = cursor.getString(cursor.getColumnIndex("title"));
        this.sharingMode = cursor.getString(columnIndex4);
        this.credentialsMode = cursor.getString(columnIndex5);
        if (!cursor.isNull(columnIndex)) {
            this.mSshConfigId = Long.valueOf(cursor.getLong(columnIndex));
        }
        if (!cursor.isNull(columnIndex2)) {
            this.mTelnetConfigId = Long.valueOf(cursor.getLong(columnIndex2));
        }
        if (cursor.isNull(columnIndex3)) {
            return;
        }
        this.mParentGroupId = Long.valueOf(cursor.getLong(columnIndex3));
    }

    public GroupDBModel(Parcel parcel) {
        super(parcel);
        this.mSshConfigId = null;
        this.mTelnetConfigId = null;
        this.mParentGroupId = null;
        this.sharingMode = null;
        this.credentialsMode = null;
        this.mCountAllNestedHosts = 0;
        this.mTitle = parcel.readString();
        this.mSshConfigId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mTelnetConfigId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mParentGroupId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.sharingMode = parcel.readString();
        this.credentialsMode = parcel.readString();
        this.mSshProperties = (SshProperties) parcel.readValue(SshProperties.class.getClassLoader());
        this.mTelnetProperties = (TelnetProperties) parcel.readValue(TelnetProperties.class.getClassLoader());
        this.mParentGroupDbModel = (GroupDBModel) parcel.readValue(GroupDBModel.class.getClassLoader());
    }
}

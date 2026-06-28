package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.hostinfo.HostIconUtil;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import hg.f;
import rg.s;
import y9.a;

/* JADX INFO: loaded from: classes3.dex */
public class HostDBModel extends SyncableModel implements Parcelable {
    public static final Parcelable.Creator<HostDBModel> CREATOR = new Parcelable.Creator<HostDBModel>() { // from class: com.server.auditor.ssh.client.database.models.HostDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HostDBModel createFromParcel(Parcel parcel) {
            return new HostDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HostDBModel[] newArray(int i10) {
            return new HostDBModel[i10];
        }
    };
    private String credentialsMode;
    private String mAddress;
    private Boolean mBackspaceType;
    private Long mGroupId;
    private String mInteractionDate;
    private Long mLocalConfigId;
    private HostIconUtil.OsModelType mOsModelType;
    private String mRecentConnectionDate;
    private Long mSshConfigId;
    private Long mTelnetConfigId;
    private String mTitle;
    private Integer mUseCounter;

    public HostDBModel(String str, String str2, String str3, Long l10, Long l11, Long l12, Long l13, String str4, String str5) {
        this.mSshConfigId = null;
        this.mLocalConfigId = null;
        this.mTelnetConfigId = null;
        this.mGroupId = null;
        this.mUseCounter = 0;
        this.mBackspaceType = null;
        this.credentialsMode = null;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        try {
            l.f(str3);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on HostDBModel.java"));
        }
        this.mAddress = str3;
        this.mTitle = str;
        this.mSshConfigId = l10;
        this.mTelnetConfigId = l11;
        this.mLocalConfigId = l12;
        this.mGroupId = l13;
        this.mRecentConnectionDate = str4;
        this.mInteractionDate = str5;
    }

    private boolean areConfigsEquals(Long l10, Long l11) {
        if (l10 == null && l11 == null) {
            return true;
        }
        if (l10 == null || l11 == null) {
            return false;
        }
        return l10.equals(l11);
    }

    public static HostDBModel getHostDBModelWithExternalReferences(Cursor cursor, s sVar) {
        TelnetRemoteConfigDBModel itemByLocalId;
        SshRemoteConfigDBModel itemByLocalId2;
        GroupDBModel itemByLocalId3;
        HostDBModel hostDBModel = new HostDBModel(cursor, sVar);
        if (hostDBModel.mGroupId != null && (itemByLocalId3 = f.p().h().getItemByLocalId(hostDBModel.mGroupId.longValue())) != null) {
            long j10 = itemByLocalId3.mIdOnServer;
            if (j10 != -1) {
                hostDBModel.mGroupId = Long.valueOf(j10);
            }
        }
        if (hostDBModel.mSshConfigId != null && (itemByLocalId2 = f.p().S().getItemByLocalId(hostDBModel.mSshConfigId.longValue())) != null) {
            long j11 = itemByLocalId2.mIdOnServer;
            if (j11 != -1) {
                hostDBModel.mSshConfigId = Long.valueOf(j11);
            }
        }
        if (hostDBModel.mTelnetConfigId != null && (itemByLocalId = f.p().e0().getItemByLocalId(hostDBModel.mTelnetConfigId.longValue())) != null) {
            long j12 = itemByLocalId.mIdOnServer;
            if (j12 != -1) {
                hostDBModel.mTelnetConfigId = Long.valueOf(j12);
            }
        }
        return hostDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HostDBModel)) {
            return false;
        }
        HostDBModel hostDBModel = (HostDBModel) obj;
        return hostDBModel.mAddress.equals(this.mAddress) && hostDBModel.mTitle.equals(this.mTitle) && areConfigsEquals(hostDBModel.mSshConfigId, this.mSshConfigId) && areConfigsEquals(hostDBModel.mTelnetConfigId, this.mTelnetConfigId) && areConfigsEquals(hostDBModel.mLocalConfigId, this.mLocalConfigId);
    }

    public String getAddress() {
        return this.mAddress;
    }

    public Boolean getBackspaceType() {
        return this.mBackspaceType;
    }

    public String getCredentialsMode() {
        return this.credentialsMode;
    }

    public Long getGroupId() {
        return this.mGroupId;
    }

    public String getInteractionDate() {
        return this.mInteractionDate;
    }

    public Long getLocalConfigId() {
        return this.mLocalConfigId;
    }

    public HostIconUtil.OsModelType getOsModelType() {
        return this.mOsModelType;
    }

    @Deprecated
    public HostIconUtil.SupportedOS getOsName() {
        return null;
    }

    public String getRecentConnectionDate() {
        return this.mRecentConnectionDate;
    }

    public Long getSshConfigId() {
        return this.mSshConfigId;
    }

    public Long getTelnetConfigId() {
        return this.mTelnetConfigId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Integer getUseCounter() {
        return this.mUseCounter;
    }

    public boolean hasGroup() {
        return this.mGroupId != null;
    }

    public boolean hasLocalConfig() {
        return this.mLocalConfigId != null;
    }

    public boolean hasSshConfig() {
        return this.mSshConfigId != null;
    }

    public boolean hasTelnetConfig() {
        return this.mTelnetConfigId != null;
    }

    public void resetGroupId() {
        this.mGroupId = null;
    }

    public void resetSshConfigId() {
        this.mSshConfigId = null;
    }

    public void resetTelnetConfigId() {
        this.mTelnetConfigId = null;
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setBackspaceType(Boolean bool) {
        this.mBackspaceType = bool;
    }

    public void setCredentialsMode(String str) {
        this.credentialsMode = str;
    }

    public void setGroupId(Long l10) {
        this.mGroupId = l10;
    }

    public void setInteractionDate(String str) {
        this.mInteractionDate = str;
    }

    public void setLocalConfigId(Long l10) {
        this.mLocalConfigId = l10;
    }

    public void setOsModelType(HostIconUtil.OsModelType osModelType) {
        this.mOsModelType = osModelType;
    }

    @Deprecated
    public void setRecentConnectionDate(String str) {
        this.mRecentConnectionDate = str;
    }

    public void setSshConfigId(Long l10) {
        this.mSshConfigId = l10;
    }

    public void setTelnetConfigId(Long l10) {
        this.mTelnetConfigId = l10;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setUseCounter(Integer num) {
        this.mUseCounter = num;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.SSH_CONFIG_ID, this.mSshConfigId);
        contentValues.put(Column.TELNET_CONFIG_ID, this.mTelnetConfigId);
        contentValues.put(Column.LOCAL_CONFIG_ID, this.mLocalConfigId);
        contentValues.put(Column.GROUP_ID, this.mGroupId);
        contentValues.put(Column.ADDRESS, this.mAddress);
        contentValues.put("title", this.mTitle);
        contentValues.put(Column.OS_NAME, this.mOsModelType.toString());
        String str = this.mRecentConnectionDate;
        if (str != null) {
            contentValues.put(Column.RECENT_CONNECTION_DATE, str);
        }
        String str2 = this.mInteractionDate;
        if (str2 != null) {
            contentValues.put(Column.INTERACTION_DATE, str2);
        }
        Integer num = this.mUseCounter;
        if (num != null) {
            contentValues.put(Column.USE_COUNTER, num);
        }
        Boolean bool = this.mBackspaceType;
        if (bool != null) {
            contentValues.put(Column.BACKSPACE_TYPE, bool);
        }
        contentValues.put("credentials_mode", this.credentialsMode);
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mTitle);
        parcel.writeValue(this.mSshConfigId);
        parcel.writeValue(this.mLocalConfigId);
        parcel.writeValue(this.mTelnetConfigId);
        parcel.writeString(this.mAddress);
        parcel.writeValue(this.mGroupId);
        parcel.writeString(this.mRecentConnectionDate);
        parcel.writeString(this.mInteractionDate);
        parcel.writeValue(this.mUseCounter);
        parcel.writeValue(this.mBackspaceType);
        parcel.writeString(this.credentialsMode);
    }

    public HostDBModel(String str, String str2, String str3, Long l10, Long l11, Long l12, Long l13, String str4, String str5, int i10, Boolean bool, String str6) {
        this.mSshConfigId = null;
        this.mLocalConfigId = null;
        this.mTelnetConfigId = null;
        this.mGroupId = null;
        this.mUseCounter = 0;
        this.mBackspaceType = null;
        this.credentialsMode = null;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        try {
            l.f(str3);
        } catch (NullPointerException unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on HostDBModel.java"));
        }
        this.mAddress = str3;
        this.mTitle = str;
        this.mSshConfigId = l10;
        this.mTelnetConfigId = l11;
        this.mLocalConfigId = l12;
        this.mGroupId = l13;
        this.mRecentConnectionDate = str4;
        this.mInteractionDate = str5;
        this.mUseCounter = Integer.valueOf(i10);
        this.mBackspaceType = bool;
        this.credentialsMode = str6;
    }

    public HostDBModel(String str, String str2) {
        this.mSshConfigId = null;
        this.mLocalConfigId = null;
        this.mTelnetConfigId = null;
        this.mGroupId = null;
        this.mUseCounter = 0;
        this.mBackspaceType = null;
        this.credentialsMode = null;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        try {
            l.d(str2);
        } catch (Exception unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on HostDBModel.java"));
        }
        this.mAddress = str2;
        this.mTitle = str;
    }

    public HostDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mSshConfigId = null;
        this.mLocalConfigId = null;
        this.mTelnetConfigId = null;
        this.mGroupId = null;
        this.mUseCounter = 0;
        this.mBackspaceType = null;
        this.credentialsMode = null;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        int columnIndex = cursor.getColumnIndex(Column.SSH_CONFIG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.TELNET_CONFIG_ID);
        int columnIndex3 = cursor.getColumnIndex(Column.LOCAL_CONFIG_ID);
        int columnIndex4 = cursor.getColumnIndex(Column.GROUP_ID);
        int columnIndex5 = cursor.getColumnIndex(Column.INTERACTION_DATE);
        int columnIndex6 = cursor.getColumnIndex(Column.BACKSPACE_TYPE);
        int columnIndex7 = cursor.getColumnIndex(Column.USE_COUNTER);
        int columnIndex8 = cursor.getColumnIndex(Column.ADDRESS);
        int columnIndex9 = cursor.getColumnIndex("title");
        int columnIndex10 = cursor.getColumnIndex(Column.OS_NAME);
        int columnIndex11 = cursor.getColumnIndex("credentials_mode");
        this.mAddress = cursor.getString(columnIndex8);
        this.mTitle = cursor.getString(columnIndex9);
        if (cursor.isNull(columnIndex)) {
            this.mSshConfigId = null;
        } else {
            this.mSshConfigId = Long.valueOf(cursor.getLong(columnIndex));
        }
        if (cursor.isNull(columnIndex3)) {
            this.mLocalConfigId = null;
        } else {
            this.mLocalConfigId = Long.valueOf(cursor.getLong(columnIndex3));
        }
        if (cursor.isNull(columnIndex2)) {
            this.mTelnetConfigId = null;
        } else {
            this.mTelnetConfigId = Long.valueOf(cursor.getLong(columnIndex2));
        }
        if (cursor.isNull(columnIndex4)) {
            this.mGroupId = null;
        } else {
            this.mGroupId = Long.valueOf(cursor.getLong(columnIndex4));
        }
        if (cursor.isNull(columnIndex5)) {
            this.mInteractionDate = null;
        } else {
            this.mInteractionDate = cursor.getString(columnIndex5);
        }
        if (cursor.isNull(columnIndex6)) {
            this.mBackspaceType = null;
        } else {
            this.mBackspaceType = Boolean.valueOf(cursor.getInt(columnIndex6) == 1);
        }
        if (cursor.isNull(columnIndex7)) {
            this.mUseCounter = 0;
        } else {
            this.mUseCounter = Integer.valueOf(cursor.getInt(columnIndex7));
        }
        if (columnIndex11 != -1) {
            this.credentialsMode = cursor.getString(columnIndex11);
        }
        try {
            this.mOsModelType = HostIconUtil.OsModelType.valueOf(cursor.getString(columnIndex10));
        } catch (IllegalArgumentException e10) {
            a.f86838a.i(e10);
        }
    }

    public HostDBModel(Parcel parcel) {
        super(parcel);
        this.mSshConfigId = null;
        this.mLocalConfigId = null;
        this.mTelnetConfigId = null;
        this.mGroupId = null;
        this.mUseCounter = 0;
        this.mBackspaceType = null;
        this.credentialsMode = null;
        this.mOsModelType = HostIconUtil.OsModelType.none;
        this.mTitle = parcel.readString();
        this.mSshConfigId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mLocalConfigId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mTelnetConfigId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mAddress = parcel.readString();
        this.mGroupId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mRecentConnectionDate = parcel.readString();
        this.mInteractionDate = parcel.readString();
        this.mUseCounter = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.mBackspaceType = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.credentialsMode = parcel.readString();
    }
}

package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.MergeException;
import fw.l;
import hg.f;
import rg.s;
import y9.a;

/* JADX INFO: loaded from: classes3.dex */
public class RuleDBModel extends SyncableModel implements IPFRule, Parcelable {
    public static final Parcelable.Creator<RuleDBModel> CREATOR = new Parcelable.Creator<RuleDBModel>() { // from class: com.server.auditor.ssh.client.database.models.RuleDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RuleDBModel createFromParcel(Parcel parcel) {
            return new RuleDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RuleDBModel[] newArray(int i10) {
            return new RuleDBModel[i10];
        }
    };
    protected boolean mAutoForwarding;
    protected String mBoundAddress;
    protected String mHost;
    protected long mHostId;
    protected String mLabel;
    protected int mLocalPort;
    protected int mRemotePort;
    protected String mType;

    public RuleDBModel(long j10, String str, String str2, int i10, String str3, int i11, String str4) {
        try {
            l.c(j10 > 0);
            l.c(i11 >= 0);
            l.c(i10 >= 0);
        } catch (Exception unused) {
            a.f86838a.i(new MergeException("Couldn't validate a value on RuleDBModel.java"));
        }
        this.mHostId = j10;
        this.mType = str;
        this.mLocalPort = i10;
        this.mHost = str3;
        this.mRemotePort = i11;
        this.mBoundAddress = str2;
        this.mLabel = str4;
    }

    public static RuleDBModel getRuleDBModelWithExternalRefrences(Cursor cursor, s sVar) {
        HostDBModel itemByLocalId;
        RuleDBModel ruleDBModel = new RuleDBModel(cursor, sVar);
        if (ruleDBModel.mHostId > 0 && (itemByLocalId = f.p().i().getItemByLocalId(ruleDBModel.mHostId)) != null) {
            long j10 = itemByLocalId.mIdOnServer;
            if (j10 != -1) {
                ruleDBModel.mHostId = j10;
            }
        }
        return ruleDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public String getBoundAddress() {
        return this.mBoundAddress;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public String getHost() {
        return this.mHost;
    }

    public long getHostId() {
        return this.mHostId;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public int getId() {
        return (int) getIdInDatabase();
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public String getLabel() {
        return this.mLabel;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public int getLocalPort() {
        return this.mLocalPort;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public int getRemotePort() {
        return this.mRemotePort;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public String getType() {
        return this.mType;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public boolean isAutoForwarding() {
        return this.mAutoForwarding;
    }

    public void setAutoForwarding(boolean z10) {
        this.mAutoForwarding = z10;
    }

    public void setBoundAddress(String str) {
        this.mBoundAddress = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setHostId(int i10) {
        this.mHostId = i10;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // com.crystalnix.terminal.transport.ssh.portforwarding.IPFRule
    public void setLocalPort(int i10) {
        this.mLocalPort = i10;
    }

    public void setRemotePort(int i10) {
        this.mRemotePort = i10;
    }

    public void setType(String str) {
        this.mType = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.HOST_ID, Long.valueOf(this.mHostId));
        contentValues.put(Column.TYPE, this.mType);
        contentValues.put(Column.BOUND_ADDRESS, this.mBoundAddress);
        contentValues.put(Column.LOCAL_PORT, Integer.valueOf(this.mLocalPort));
        contentValues.put(Column.FORWARDING_HOST, this.mHost);
        contentValues.put("label", this.mLabel);
        contentValues.put(Column.REMOTE_PORT, Integer.valueOf(this.mRemotePort));
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeLong(this.mHostId);
        parcel.writeString(this.mType);
        parcel.writeString(this.mBoundAddress);
        parcel.writeValue(Integer.valueOf(this.mLocalPort));
        parcel.writeString(this.mHost);
        parcel.writeString(this.mLabel);
        parcel.writeValue(Integer.valueOf(this.mRemotePort));
        parcel.writeValue(Boolean.valueOf(this.mAutoForwarding));
    }

    public RuleDBModel(long j10, String str, String str2, int i10, String str3, int i11, long j11, long j12, int i12, String str4) {
        this(j10, str, str2, i10, str3, i11, str4);
        this.mId = j11;
        this.mIdOnServer = j12;
        this.mStatus = i12;
    }

    public RuleDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.HOST_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.TYPE);
        int columnIndex3 = cursor.getColumnIndex(Column.BOUND_ADDRESS);
        int columnIndex4 = cursor.getColumnIndex(Column.LOCAL_PORT);
        int columnIndex5 = cursor.getColumnIndex(Column.FORWARDING_HOST);
        int columnIndex6 = cursor.getColumnIndex(Column.REMOTE_PORT);
        int columnIndex7 = cursor.getColumnIndex(Column.AUTO_FORWARD);
        int columnIndex8 = cursor.getColumnIndex("label");
        this.mHostId = cursor.getLong(columnIndex);
        this.mType = cursor.getString(columnIndex2);
        this.mBoundAddress = cursor.getString(columnIndex3);
        this.mLocalPort = cursor.getInt(columnIndex4);
        this.mHost = cursor.getString(columnIndex5);
        this.mRemotePort = cursor.getInt(columnIndex6);
        this.mAutoForwarding = 1 == cursor.getInt(columnIndex7);
        this.mLabel = cursor.getString(columnIndex8);
    }

    protected RuleDBModel(Parcel parcel) {
        super(parcel);
        this.mHostId = parcel.readLong();
        this.mType = parcel.readString();
        this.mBoundAddress = parcel.readString();
        this.mLocalPort = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
        this.mHost = parcel.readString();
        this.mLabel = parcel.readString();
        this.mRemotePort = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
        this.mAutoForwarding = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
    }
}

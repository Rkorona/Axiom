package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import fw.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteRulesPortMixPatch extends AbsPatch {
    private static final String AUTO_FORWARD = "auto_forwarding";
    private static final String BOUND_ADDRESS = "bound_address";
    private static final int EMPTY_ID_ON_SERVER = -1;
    private static final String FORWARDING_HOST = "forwarding_host";
    private static final String HOST_ID = "host_id";
    private static final String ID = "_id";
    private static final String ID_ON_SERVER = "id_on_server";
    private static final String LOCAL_PORT = "local_port";
    private static final String PF_TYPE_REMOTE = "REMOTE";
    private static final String PORT_FORWARDING = "port_forwarding";
    private static final String REMOTE_PORT = "remote_port";
    private static final String STATUS = "status";
    private static final int TRUE = 1;
    private static final String TYPE = "type";
    private static final String UPDATED_AT = "updated_at";
    private static final int UPDATE_FAILED = 1;

    private static abstract class SyncableModel {
        protected long mId;
        protected long mIdOnServer;
        protected int mStatus;
        protected String mUpdateAtTime;

        protected SyncableModel() {
            this(-1L, null, 1);
        }

        private static int getIdColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("_id");
        }

        private static int getIdOnServerColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("id_on_server");
        }

        private static int getStatusColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("status");
        }

        private static int getUpdatedAtColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("updated_at");
        }

        public long getIdInDatabase() {
            return this.mId;
        }

        public long getIdOnServer() {
            return this.mIdOnServer;
        }

        public int getStatus() {
            return this.mStatus;
        }

        public String getUpdatedAtTime() {
            return this.mUpdateAtTime;
        }

        protected void loadGeneralData(Cursor cursor) {
            this.mId = cursor.getLong(getIdColumnIndex(cursor));
            this.mIdOnServer = cursor.getLong(getIdOnServerColumnIndex(cursor));
            this.mUpdateAtTime = cursor.getString(getUpdatedAtColumnIndex(cursor));
            this.mStatus = cursor.getInt(getStatusColumnIndex(cursor));
        }

        public void setIdInDatabase(long j10) {
            this.mId = j10;
        }

        public void setIdOnServer(long j10) {
            this.mIdOnServer = j10;
        }

        public void setStatus(int i10) {
            this.mStatus = i10;
        }

        public void setUpdatedAtTime(String str) {
            this.mUpdateAtTime = str;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id_on_server", Long.valueOf(this.mIdOnServer));
            contentValues.put("updated_at", this.mUpdateAtTime);
            contentValues.put("status", Integer.valueOf(this.mStatus));
            return contentValues;
        }

        protected SyncableModel(long j10, String str, int i10) {
            this.mId = 0L;
            this.mIdOnServer = j10;
            this.mStatus = i10;
            this.mUpdateAtTime = str;
        }

        protected SyncableModel(Cursor cursor) {
            this.mId = 0L;
            this.mIdOnServer = 0L;
            this.mUpdateAtTime = "";
            this.mStatus = 0;
            this.mId = cursor.getLong(getIdColumnIndex(cursor));
            this.mIdOnServer = cursor.getLong(getIdOnServerColumnIndex(cursor));
            this.mUpdateAtTime = cursor.getString(getUpdatedAtColumnIndex(cursor));
            this.mStatus = cursor.getInt(getStatusColumnIndex(cursor));
        }

        protected SyncableModel(Parcel parcel) {
            this.mId = 0L;
            this.mIdOnServer = 0L;
            this.mUpdateAtTime = "";
            this.mStatus = 0;
            this.mId = parcel.readLong();
            this.mIdOnServer = parcel.readLong();
            this.mUpdateAtTime = parcel.readString();
            this.mStatus = parcel.readInt();
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        ArrayList<RuleDBModel> arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("port_forwarding", null, null, null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    RuleDBModel ruleDBModel = new RuleDBModel(cursorQuery);
                    if (ruleDBModel.getType().equalsIgnoreCase(PF_TYPE_REMOTE)) {
                        arrayList.add(ruleDBModel);
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (arrayList.size() > 0) {
                for (RuleDBModel ruleDBModel2 : arrayList) {
                    int remotePort = ruleDBModel2.getRemotePort();
                    ruleDBModel2.setRemotePort(ruleDBModel2.getLocalPort());
                    ruleDBModel2.setLocalPort(remotePort);
                    sQLiteDatabase.update("port_forwarding", ruleDBModel2.toContentValues(), "_id=?", new String[]{String.valueOf(ruleDBModel2.getId())});
                }
            }
        } finally {
        }
    }

    private static class RuleDBModel extends SyncableModel {
        public static final Parcelable.Creator<RuleDBModel> CREATOR = new Parcelable.Creator<RuleDBModel>() { // from class: com.server.auditor.ssh.client.database.patches.tables.RemoteRulesPortMixPatch.RuleDBModel.1
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
        private boolean mAutoForwarding;
        private String mBoundAddress;
        private String mHost;
        private long mHostId;
        private int mLocalPort;
        private int mRemotePort;
        private String mType;

        public RuleDBModel(long j10, String str, String str2, int i10, String str3, int i11) {
            l.f(str2);
            l.d(str3);
            l.c(j10 > 0);
            l.c(i11 >= 0);
            l.c(i10 >= 0);
            this.mHostId = j10;
            this.mType = str;
            this.mLocalPort = i10;
            this.mHost = str3;
            this.mRemotePort = i11;
            this.mBoundAddress = str2;
        }

        private static int getAutoForwardColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("auto_forwarding");
        }

        private static int getBoundAddressColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("bound_address");
        }

        private static int getForwardingHostColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("forwarding_host");
        }

        private static int getHostIdColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("host_id");
        }

        private static int getLocalPortColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("local_port");
        }

        private static int getRemotePortColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("remote_port");
        }

        private static int getTypeColumnIndex(Cursor cursor) {
            return cursor.getColumnIndex("type");
        }

        public String getBoundAddress() {
            return this.mBoundAddress;
        }

        public String getHost() {
            return this.mHost;
        }

        public long getHostId() {
            return this.mHostId;
        }

        public int getId() {
            return (int) getIdInDatabase();
        }

        public int getLocalPort() {
            return this.mLocalPort;
        }

        public int getRemotePort() {
            return this.mRemotePort;
        }

        public String getType() {
            return this.mType;
        }

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

        public void setLocalPort(int i10) {
            this.mLocalPort = i10;
        }

        public void setRemotePort(int i10) {
            this.mRemotePort = i10;
        }

        public void setType(String str) {
            this.mType = str;
        }

        @Override // com.server.auditor.ssh.client.database.patches.tables.RemoteRulesPortMixPatch.SyncableModel
        public ContentValues toContentValues() {
            ContentValues contentValues = super.toContentValues();
            contentValues.put("host_id", Long.valueOf(this.mHostId));
            contentValues.put("type", this.mType);
            contentValues.put("bound_address", this.mBoundAddress);
            contentValues.put("local_port", Integer.valueOf(this.mLocalPort));
            contentValues.put("forwarding_host", this.mHost);
            contentValues.put("remote_port", Integer.valueOf(this.mRemotePort));
            return contentValues;
        }

        public RuleDBModel(long j10, String str, String str2, int i10, String str3, int i11, long j11, long j12, int i12) {
            this(j10, str, str2, i10, str3, i11);
            this.mId = j11;
            this.mIdOnServer = j12;
            this.mStatus = i12;
        }

        public RuleDBModel(Cursor cursor) {
            super(cursor);
            this.mHostId = cursor.getLong(getHostIdColumnIndex(cursor));
            this.mType = cursor.getString(getTypeColumnIndex(cursor));
            this.mBoundAddress = cursor.getString(getBoundAddressColumnIndex(cursor));
            this.mLocalPort = cursor.getInt(getLocalPortColumnIndex(cursor));
            this.mHost = cursor.getString(getForwardingHostColumnIndex(cursor));
            this.mRemotePort = cursor.getInt(getRemotePortColumnIndex(cursor));
            this.mAutoForwarding = 1 == cursor.getInt(getAutoForwardColumnIndex(cursor));
        }

        protected RuleDBModel(Parcel parcel) {
            super(parcel);
            this.mHostId = parcel.readLong();
            this.mType = parcel.readString();
            this.mBoundAddress = parcel.readString();
            this.mLocalPort = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
            this.mHost = parcel.readString();
            this.mRemotePort = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
            this.mAutoForwarding = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        }
    }
}

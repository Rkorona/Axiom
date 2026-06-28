package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyDBModel extends SyncableModel implements Parcelable {
    public static final Parcelable.Creator<ProxyDBModel> CREATOR = new Parcelable.Creator<ProxyDBModel>() { // from class: com.server.auditor.ssh.client.database.models.ProxyDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyDBModel createFromParcel(Parcel parcel) {
            return new ProxyDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyDBModel[] newArray(int i10) {
            return new ProxyDBModel[i10];
        }
    };
    private String mHost;
    private Long mIdentityId;
    private int mPort;
    private String mType;

    public ProxyDBModel(String str, String str2, int i10) {
        this.mIdentityId = null;
        this.mType = str;
        this.mHost = str2;
        this.mPort = i10;
    }

    public static ProxyDBModel getProxyDBModelWithExternalReferences(Cursor cursor, s sVar) {
        IdentityDBModel itemByLocalId;
        ProxyDBModel proxyDBModel = new ProxyDBModel(cursor, sVar);
        if (proxyDBModel.mIdentityId != null && (itemByLocalId = f.p().n().getItemByLocalId(proxyDBModel.mIdentityId.longValue())) != null && itemByLocalId.getIdOnServer() != -1) {
            proxyDBModel.setIdentityId(Long.valueOf(itemByLocalId.getIdOnServer()));
        }
        return proxyDBModel;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHost() {
        return this.mHost;
    }

    public Long getIdentityId() {
        return this.mIdentityId;
    }

    public int getPort() {
        return this.mPort;
    }

    public String getType() {
        return this.mType;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setIdentityId(Long l10) {
        this.mIdentityId = l10;
    }

    public void setPort(int i10) {
        this.mPort = i10;
    }

    public void setType(String str) {
        this.mType = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.TYPE, this.mType);
        contentValues.put("host", this.mHost);
        contentValues.put(Column.PORT, Integer.valueOf(this.mPort));
        contentValues.put(Column.IDENTITY_ID, this.mIdentityId);
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mType);
        parcel.writeString(this.mHost);
        parcel.writeInt(this.mPort);
        parcel.writeLong(this.mIdentityId.longValue());
    }

    public ProxyDBModel(String str, String str2, int i10, Long l10) {
        this.mType = str;
        this.mHost = str2;
        this.mPort = i10;
        this.mIdentityId = l10;
    }

    public ProxyDBModel(String str, String str2, int i10, Long l10, long j10, int i11, String str3) {
        this.mType = str;
        this.mHost = str2;
        this.mPort = i10;
        this.mIdentityId = l10;
        this.mIdOnServer = j10;
        this.mStatus = i11;
        this.mUpdateAtTime = str3;
    }

    public ProxyDBModel(Proxy proxy) {
        this.mIdentityId = null;
        this.mType = proxy.getType().name();
        this.mHost = proxy.getHost();
        this.mPort = proxy.getPort();
        this.mIdentityId = null;
        if (proxy.getIdentity() != null) {
            this.mIdentityId = Long.valueOf(proxy.getIdentity().getId());
        }
    }

    public ProxyDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mIdentityId = null;
        int columnIndex = cursor.getColumnIndex(Column.TYPE);
        int columnIndex2 = cursor.getColumnIndex("host");
        int columnIndex3 = cursor.getColumnIndex(Column.PORT);
        int columnIndex4 = cursor.getColumnIndex(Column.IDENTITY_ID);
        this.mType = cursor.getString(columnIndex);
        this.mHost = cursor.getString(columnIndex2);
        this.mPort = cursor.getInt(columnIndex3);
        if (cursor.isNull(columnIndex4) || columnIndex4 < 0) {
            return;
        }
        this.mIdentityId = Long.valueOf(cursor.getLong(columnIndex4));
    }

    public ProxyDBModel(Parcel parcel) {
        super(parcel);
        this.mIdentityId = null;
        this.mType = parcel.readString();
        this.mHost = parcel.readString();
        this.mPort = parcel.readInt();
        this.mIdentityId = Long.valueOf(parcel.readLong());
    }
}

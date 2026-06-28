package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.database.Column;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class KnownHostsDBModel extends SyncableModel implements a, Parcelable {
    public static final Parcelable.Creator<KnownHostsDBModel> CREATOR = new Parcelable.Creator<KnownHostsDBModel>() { // from class: com.server.auditor.ssh.client.database.models.KnownHostsDBModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KnownHostsDBModel createFromParcel(Parcel parcel) {
            return new KnownHostsDBModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KnownHostsDBModel[] newArray(int i10) {
            return new KnownHostsDBModel[i10];
        }
    };
    private final String mComment;
    private final String mHostname;
    private final String mMarker;
    private final String mPublicKey;

    public KnownHostsDBModel(String str, String str2, String str3, String str4, long j10, int i10) {
        this.mHostname = str;
        this.mPublicKey = str2;
        this.mMarker = str3;
        this.mComment = str4;
        this.mId = j10;
        this.mStatus = i10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KnownHostsDBModel)) {
            return false;
        }
        KnownHostsDBModel knownHostsDBModel = (KnownHostsDBModel) obj;
        return this.mHostname.equals(knownHostsDBModel.getHostname()) && this.mPublicKey.equals(knownHostsDBModel.getPublicKey());
    }

    public String getHostname() {
        return this.mHostname;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public int hashCode() {
        String str = this.mHostname;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.HOSTNAMES, this.mHostname);
        contentValues.put(Column.KEY_PUBLIC, sVar.a(this.mPublicKey));
        contentValues.put(Column.MARKER, this.mMarker);
        contentValues.put(Column.COMMENT, this.mComment);
        return contentValues;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mHostname);
        parcel.writeString(this.mPublicKey);
        parcel.writeString(this.mMarker);
        parcel.writeString(this.mComment);
    }

    public KnownHostsDBModel(String str, String str2, String str3, String str4, long j10, int i10, String str5) {
        super(j10, str5, i10);
        this.mHostname = str;
        this.mPublicKey = str2;
        this.mMarker = str3;
        this.mComment = str4;
    }

    public KnownHostsDBModel(String str, String str2, String str3, String str4, int i10) {
        this.mHostname = str;
        this.mPublicKey = str2;
        this.mMarker = str3;
        this.mComment = str4;
        this.mStatus = i10;
    }

    public KnownHostsDBModel(String str, String str2) {
        this.mHostname = str;
        this.mPublicKey = str2;
        this.mMarker = "";
        this.mComment = "";
        this.mStatus = 1;
    }

    public KnownHostsDBModel(Parcel parcel) {
        super(parcel);
        this.mHostname = parcel.readString();
        this.mPublicKey = parcel.readString();
        this.mMarker = parcel.readString();
        this.mComment = parcel.readString();
    }

    public KnownHostsDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.HOSTNAMES);
        int columnIndex2 = cursor.getColumnIndex(Column.KEY_PUBLIC);
        int columnIndex3 = cursor.getColumnIndex(Column.MARKER);
        int columnIndex4 = cursor.getColumnIndex(Column.COMMENT);
        this.mHostname = cursor.getString(columnIndex);
        this.mPublicKey = sVar.b(cursor.getString(columnIndex2));
        this.mMarker = cursor.getString(columnIndex3);
        this.mComment = cursor.getString(columnIndex4);
    }
}

package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.VaultKeyIdDbConverter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import kj.a;
import kj.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SyncableModel implements Parcelable, f, a, IVaultKeyIdHolder {
    private String content;

    @Deprecated
    protected Boolean isShared;
    protected long mId;
    protected long mIdOnServer;
    protected int mStatus;
    protected String mUpdateAtTime;
    protected boolean needUpdateContent;
    protected VaultKeyId vaultKeyId;

    protected SyncableModel() {
        this(-1L, null, 1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        if (TextUtils.isEmpty(this.content)) {
            return null;
        }
        return this.content;
    }

    @Override // kj.f
    public long getIdInDatabase() {
        return this.mId;
    }

    @Override // kj.f
    public long getIdOnServer() {
        return this.mIdOnServer;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getUpdatedAtTime() {
        return this.mUpdateAtTime;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public VaultKeyId getVaultKeyId() {
        return this.vaultKeyId;
    }

    @Deprecated
    public boolean isShared() {
        Boolean bool = this.isShared;
        if (bool != null && bool.booleanValue() && com.server.auditor.ssh.client.ui.vaults.data.a.b(this.vaultKeyId)) {
            return true;
        }
        return !com.server.auditor.ssh.client.ui.vaults.data.a.b(this.vaultKeyId);
    }

    public void setContent(String str) {
        this.content = str;
    }

    @Override // kj.f
    public void setIdInDatabase(long j10) {
        this.mId = j10;
    }

    public void setIdOnServer(long j10) {
        this.mIdOnServer = j10;
    }

    public void setNeedUpdateContent(boolean z10) {
        this.needUpdateContent = z10;
    }

    @Deprecated
    public void setShared(boolean z10) {
        this.isShared = Boolean.valueOf(z10);
    }

    @Override // kj.f
    public void setStatus(int i10) {
        this.mStatus = i10;
    }

    public void setUpdatedAtTime(String str) {
        this.mUpdateAtTime = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.IVaultKeyIdHolder
    public void setVaultKeyId(VaultKeyId vaultKeyId) {
        this.vaultKeyId = vaultKeyId;
    }

    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.ID_ON_SERVER, Long.valueOf(this.mIdOnServer));
        contentValues.put("updated_at", this.mUpdateAtTime);
        contentValues.put(Column.STATUS, Integer.valueOf(this.mStatus));
        contentValues.put(Column.IS_SHARED, Integer.valueOf(isShared() ? 1 : 0));
        if (this.needUpdateContent) {
            contentValues.put(Column.CONTENT, sVar.a(this.content));
        }
        contentValues.put("encrypted_with", new VaultKeyIdDbConverter().fromVaultKeyId(this.vaultKeyId));
        return contentValues;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.mId);
        parcel.writeLong(this.mIdOnServer);
        parcel.writeString(this.mUpdateAtTime);
        parcel.writeInt(this.mStatus);
        Boolean bool = this.isShared;
        if (bool == null || !bool.booleanValue()) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
        }
        parcel.writeString(this.content);
        this.vaultKeyId.writeToParcel(parcel, i10);
    }

    protected SyncableModel(long j10, String str, int i10, Boolean bool) {
        this.mId = 0L;
        this.mIdOnServer = -1L;
        this.needUpdateContent = false;
        this.mUpdateAtTime = "";
        this.mStatus = 0;
        this.isShared = null;
        this.content = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mIdOnServer = j10;
        this.mStatus = i10;
        this.mUpdateAtTime = str;
        this.isShared = bool;
    }

    protected SyncableModel(long j10, String str, int i10) {
        this.mId = 0L;
        this.mIdOnServer = -1L;
        this.needUpdateContent = false;
        this.mUpdateAtTime = "";
        this.mStatus = 0;
        this.isShared = null;
        this.content = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mIdOnServer = j10;
        this.mStatus = i10;
        this.mUpdateAtTime = str;
    }

    protected SyncableModel(Cursor cursor, s sVar) {
        this.mId = 0L;
        this.mIdOnServer = -1L;
        this.needUpdateContent = false;
        this.mUpdateAtTime = "";
        this.mStatus = 0;
        this.isShared = null;
        this.content = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        int columnIndex = cursor.getColumnIndex(Column.ID);
        int columnIndex2 = cursor.getColumnIndex(Column.ID_ON_SERVER);
        int columnIndex3 = cursor.getColumnIndex("updated_at");
        int columnIndex4 = cursor.getColumnIndex(Column.STATUS);
        int columnIndex5 = cursor.getColumnIndex(Column.CONTENT);
        int columnIndex6 = cursor.getColumnIndex(Column.IS_SHARED);
        int columnIndex7 = cursor.getColumnIndex(Column.CONTENT);
        this.mId = cursor.getLong(columnIndex);
        this.mIdOnServer = cursor.getLong(columnIndex2);
        this.mUpdateAtTime = cursor.getString(columnIndex3);
        this.mStatus = cursor.getInt(columnIndex4);
        if (columnIndex6 >= 0 && !cursor.isNull(columnIndex6)) {
            this.isShared = Boolean.valueOf(1 == cursor.getInt(columnIndex6));
        }
        if (columnIndex7 >= 0 && !cursor.isNull(columnIndex7)) {
            String string = cursor.getString(columnIndex5);
            this.content = string;
            this.content = sVar.b(string);
        }
        this.vaultKeyId = new VaultKeyIdDbConverter().toVaultKeyId(cursor);
    }

    protected SyncableModel(Parcel parcel) {
        this.mId = 0L;
        this.mIdOnServer = -1L;
        this.needUpdateContent = false;
        this.mUpdateAtTime = "";
        this.mStatus = 0;
        this.isShared = null;
        this.content = null;
        this.vaultKeyId = VaultKeyId.Companion.a();
        this.mId = parcel.readLong();
        this.mIdOnServer = parcel.readLong();
        this.mUpdateAtTime = parcel.readString();
        this.mStatus = parcel.readInt();
        this.isShared = Boolean.valueOf(parcel.readInt() == 1);
        this.content = parcel.readString();
        this.vaultKeyId = VaultKeyId.CREATOR.createFromParcel(parcel);
    }
}

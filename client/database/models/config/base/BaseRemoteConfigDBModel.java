package com.server.auditor.ssh.client.database.models.config.base;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.Identity;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRemoteConfigDBModel extends BaseConfigDBModel {
    protected Long mIdentityId;
    protected Boolean mIsCursorBlink;
    protected Integer mPort;

    public BaseRemoteConfigDBModel() {
        this.mIdentityId = null;
    }

    protected Identity getIdentity() {
        if (this.mIdentityId != null) {
            return f.p().n().getItemByLocalId(this.mIdentityId.longValue()).convertToIdentity();
        }
        return null;
    }

    public Long getIdentityId() {
        return this.mIdentityId;
    }

    public Integer getPort() {
        return this.mPort;
    }

    public boolean hasIdentity() {
        return this.mIdentityId != null;
    }

    public Boolean isIsCursorBlink() {
        return this.mIsCursorBlink;
    }

    public void setIdentityId(Long l10) {
        this.mIdentityId = l10;
    }

    public void setIsCursorBlink(Boolean bool) {
        this.mIsCursorBlink = bool;
    }

    public void setPort(Integer num) {
        this.mPort = num;
    }

    @Override // com.server.auditor.ssh.client.database.models.config.base.BaseConfigDBModel, com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.IDENTITY_ID, this.mIdentityId);
        contentValues.put(Column.PORT, this.mPort);
        contentValues.put(Column.IS_CUSROS_BLINK, this.mIsCursorBlink);
        return contentValues;
    }

    public BaseRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, String str, String str2, Long l10) {
        super(num, str, str2);
        this.mIdentityId = l10;
        this.mPort = num2;
        this.mIsCursorBlink = bool;
    }

    public BaseRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, String str, String str2, Long l10, long j10, String str3, int i10) {
        super(num, str, str2, j10, str3, i10);
        this.mIdentityId = l10;
        this.mPort = num2;
        this.mIsCursorBlink = bool;
    }

    public BaseRemoteConfigDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mIdentityId = null;
        int columnIndex = cursor.getColumnIndex(Column.IDENTITY_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.PORT);
        int columnIndex3 = cursor.getColumnIndex(Column.IS_CUSROS_BLINK);
        if (!cursor.isNull(columnIndex)) {
            this.mIdentityId = Long.valueOf(cursor.getLong(columnIndex));
        }
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            this.mPort = Integer.valueOf(cursor.getInt(columnIndex2));
        }
        if (columnIndex3 < 0 || cursor.isNull(columnIndex3)) {
            return;
        }
        this.mIsCursorBlink = Boolean.valueOf(1 == cursor.getInt(columnIndex3));
    }
}

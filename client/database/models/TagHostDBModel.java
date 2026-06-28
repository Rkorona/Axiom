package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class TagHostDBModel extends SyncableModel {
    private long mHostId;
    private long mTagId;

    public TagHostDBModel(long j10, long j11, long j12, String str, int i10) {
        super(j12, str, i10);
        this.mTagId = j10;
        this.mHostId = j11;
    }

    public static TagHostDBModel getTagHostDBModelWithExternalReferences(Cursor cursor, s sVar) {
        TagHostDBModel tagHostDBModel = new TagHostDBModel(cursor, sVar);
        TagDBModel itemByLocalId = f.p().a0().getItemByLocalId(tagHostDBModel.getTagId());
        if (itemByLocalId != null) {
            long j10 = itemByLocalId.mIdOnServer;
            if (j10 != -1) {
                tagHostDBModel.mTagId = j10;
            }
        }
        HostDBModel itemByLocalId2 = f.p().i().getItemByLocalId(tagHostDBModel.getHostId());
        if (itemByLocalId2 != null) {
            long j11 = itemByLocalId2.mIdOnServer;
            if (j11 != -1) {
                tagHostDBModel.mHostId = j11;
            }
        }
        return tagHostDBModel;
    }

    public long getHostId() {
        return this.mHostId;
    }

    public long getTagId() {
        return this.mTagId;
    }

    public int hashCode() {
        return (int) this.mTagId;
    }

    public void setHostId(long j10) {
        this.mHostId = j10;
    }

    public void setTagId(long j10) {
        this.mTagId = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.TAG_ID, Long.valueOf(this.mTagId));
        contentValues.put(Column.HOST_ID, Long.valueOf(this.mHostId));
        return contentValues;
    }

    public TagHostDBModel(long j10, long j11) {
        this.mTagId = j10;
        this.mHostId = j11;
    }

    public TagHostDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.TAG_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.HOST_ID);
        this.mTagId = cursor.getLong(columnIndex);
        this.mHostId = cursor.getLong(columnIndex2);
    }
}

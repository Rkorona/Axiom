package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class SnippetHostDBModel extends SyncableModel {
    private long mHostId;
    private long mSnippetId;

    public SnippetHostDBModel(long j10, long j11, long j12, String str, int i10) {
        super(j12, str, i10);
        this.mSnippetId = j10;
        this.mHostId = j11;
    }

    public static SnippetHostDBModel getSnippetHostDBModelWithExternalReferences(Cursor cursor, s sVar) {
        SnippetHostDBModel snippetHostDBModel = new SnippetHostDBModel(cursor, sVar);
        SnippetDBModel itemByLocalId = f.p().J().getItemByLocalId(snippetHostDBModel.getSnippetId());
        if (itemByLocalId != null) {
            long j10 = itemByLocalId.mIdOnServer;
            if (j10 != -1) {
                snippetHostDBModel.mSnippetId = j10;
            }
        }
        HostDBModel itemByLocalId2 = f.p().i().getItemByLocalId(snippetHostDBModel.getHostId());
        if (itemByLocalId2 != null) {
            long j11 = itemByLocalId2.mIdOnServer;
            if (j11 != -1) {
                snippetHostDBModel.mHostId = j11;
            }
        }
        return snippetHostDBModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SnippetHostDBModel snippetHostDBModel = (SnippetHostDBModel) obj;
            if (this.mHostId == snippetHostDBModel.mHostId && this.mSnippetId == snippetHostDBModel.mSnippetId) {
                return true;
            }
        }
        return false;
    }

    public long getHostId() {
        return this.mHostId;
    }

    public long getSnippetId() {
        return this.mSnippetId;
    }

    public int hashCode() {
        long j10 = this.mSnippetId;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public void setHostId(long j10) {
        this.mHostId = j10;
    }

    public void setSnippetId(long j10) {
        this.mSnippetId = j10;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.SNIPPET_ID, Long.valueOf(this.mSnippetId));
        contentValues.put(Column.HOST_ID, Long.valueOf(this.mHostId));
        return contentValues;
    }

    public SnippetHostDBModel(long j10, long j11) {
        this.mSnippetId = j10;
        this.mHostId = j11;
    }

    public SnippetHostDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.SNIPPET_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.HOST_ID);
        this.mSnippetId = cursor.getLong(columnIndex);
        this.mHostId = cursor.getLong(columnIndex2);
    }
}

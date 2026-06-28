package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import ju.t;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiKeyDBModel extends SyncableModel {
    public static final int $stable = 8;
    private String name;
    private String username;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiKeyDBModel(String str, String str2, long j10, String str3, int i10) {
        super(j10, str3, i10);
        t.f(str3, "updatedAt");
        this.name = str;
        this.username = str2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        t.f(sVar, "cryptor");
        ContentValues contentValues = super.toContentValues(sVar);
        String str = this.name;
        if (str != null) {
            contentValues.put(Column.MULTI_KEY_NAME, sVar.a(str));
        }
        String str2 = this.username;
        if (str2 != null) {
            contentValues.put("username", sVar.a(str2));
        }
        t.c(contentValues);
        return contentValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiKeyDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        t.f(cursor, "cursor");
        t.f(sVar, "cryptor");
        int columnIndex = cursor.getColumnIndex(Column.MULTI_KEY_NAME);
        int columnIndex2 = cursor.getColumnIndex("username");
        if (!cursor.isNull(columnIndex)) {
            this.name = sVar.b(cursor.getString(columnIndex));
        }
        if (cursor.isNull(columnIndex2)) {
            return;
        }
        this.username = sVar.b(cursor.getString(columnIndex2));
    }
}

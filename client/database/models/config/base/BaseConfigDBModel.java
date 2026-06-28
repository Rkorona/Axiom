package com.server.auditor.ssh.client.database.models.config.base;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.SyncableModel;
import kj.a;
import kj.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseConfigDBModel extends SyncableModel implements f, a {
    protected String mCharset;
    protected String mColorScheme;
    protected Integer mFontSize;

    public BaseConfigDBModel() {
    }

    public String getCharset() {
        return this.mCharset;
    }

    public String getColorScheme() {
        return this.mColorScheme;
    }

    public Integer getFontSize() {
        return null;
    }

    public void setCharset(String str) {
        this.mCharset = str;
    }

    public void setColorScheme(String str) {
        this.mColorScheme = str;
    }

    public void setFontSize(Integer num) {
    }

    @Override // com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.COLOR_SCHEME, this.mColorScheme);
        contentValues.put(Column.CHARSET, this.mCharset);
        return contentValues;
    }

    public BaseConfigDBModel(Integer num, String str, String str2) {
        this.mColorScheme = str;
        this.mCharset = str2;
        this.mFontSize = num;
    }

    public BaseConfigDBModel(Integer num, String str, String str2, long j10, String str3, int i10) {
        super(j10, str3, i10);
        this.mFontSize = num;
        this.mColorScheme = str;
        this.mCharset = str2;
    }

    public BaseConfigDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        int columnIndex = cursor.getColumnIndex(Column.COLOR_SCHEME);
        int columnIndex2 = cursor.getColumnIndex(Column.CHARSET);
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            this.mColorScheme = cursor.getString(columnIndex);
        }
        if (columnIndex2 >= 0) {
            this.mCharset = cursor.getString(columnIndex2);
        }
    }
}

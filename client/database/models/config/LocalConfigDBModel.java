package com.server.auditor.ssh.client.database.models.config;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.Column;
import java.util.Arrays;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class LocalConfigDBModel implements a {
    private String mCharset;
    private String mColorScheme;
    private Integer mFontSize;
    private long mId;
    private String[] mLocalShellArgc;
    private String mLocalShellPath;
    private Long mStartupSnippetId;

    public LocalConfigDBModel(Integer num, String str, String str2, Long l10, String str3, String[] strArr) {
        this.mFontSize = num;
        this.mColorScheme = str;
        this.mCharset = str2;
        this.mStartupSnippetId = l10;
        this.mLocalShellPath = str3;
        this.mLocalShellArgc = strArr;
    }

    public String getCharset() {
        return this.mCharset;
    }

    public String getColorScheme() {
        return this.mColorScheme;
    }

    public Integer getFontSize() {
        return this.mFontSize;
    }

    public long getId() {
        return this.mId;
    }

    public String[] getLocalShellArgc() {
        return this.mLocalShellArgc;
    }

    public String getLocalShellPath() {
        return this.mLocalShellPath;
    }

    public Long getStartupSnippetId() {
        return this.mStartupSnippetId;
    }

    public void setCharset(String str) {
        this.mCharset = str;
    }

    public void setColorScheme(String str) {
        this.mColorScheme = str;
    }

    public void setFontSize(Integer num) {
        this.mFontSize = num;
    }

    public void setId(long j10) {
        this.mId = j10;
    }

    public void setLocalShellArgc(String[] strArr) {
        this.mLocalShellArgc = strArr;
    }

    public void setLocalShellPath(String str) {
        this.mLocalShellPath = str;
    }

    public void setStartupSnippetId(Long l10) {
        this.mStartupSnippetId = l10;
    }

    @Override // kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.FONT_SIZE, this.mFontSize);
        contentValues.put(Column.COLOR_SCHEME, this.mColorScheme);
        contentValues.put(Column.CHARSET, this.mCharset);
        contentValues.put(Column.START_UP_SNIPPET_ID, this.mStartupSnippetId);
        contentValues.put(Column.LOCAL_SHELL_PATH, this.mLocalShellPath);
        String[] strArr = this.mLocalShellArgc;
        if (strArr != null) {
            contentValues.put(Column.LOCAL_SHELL_ARGC, Arrays.toString(strArr));
        }
        return contentValues;
    }

    public LocalConfigDBModel(Cursor cursor) {
        this.mStartupSnippetId = null;
        int columnIndex = cursor.getColumnIndex(Column.ID);
        int columnIndex2 = cursor.getColumnIndex(Column.FONT_SIZE);
        int columnIndex3 = cursor.getColumnIndex(Column.COLOR_SCHEME);
        int columnIndex4 = cursor.getColumnIndex(Column.CHARSET);
        int columnIndex5 = cursor.getColumnIndex(Column.START_UP_SNIPPET_ID);
        int columnIndex6 = cursor.getColumnIndex(Column.LOCAL_SHELL_PATH);
        int columnIndex7 = cursor.getColumnIndex(Column.LOCAL_SHELL_ARGC);
        this.mId = cursor.getLong(columnIndex);
        if (!cursor.isNull(columnIndex2) && columnIndex2 >= 0) {
            this.mFontSize = Integer.valueOf(cursor.getInt(columnIndex2));
        }
        if (!cursor.isNull(columnIndex3) && columnIndex3 >= 0) {
            this.mColorScheme = cursor.getString(columnIndex3);
        }
        if (!cursor.isNull(columnIndex4) && columnIndex4 >= 0) {
            this.mCharset = cursor.getString(columnIndex4);
        }
        if (!cursor.isNull(columnIndex5) && columnIndex5 >= 0) {
            this.mStartupSnippetId = Long.valueOf(cursor.getLong(columnIndex5));
        }
        if (!cursor.isNull(columnIndex6) && columnIndex6 >= 0) {
            this.mLocalShellPath = cursor.getString(columnIndex6);
        }
        if (cursor.isNull(columnIndex7) || columnIndex7 < 0) {
            return;
        }
        String string = cursor.getString(columnIndex7);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.mLocalShellArgc = string.split(" ");
    }
}

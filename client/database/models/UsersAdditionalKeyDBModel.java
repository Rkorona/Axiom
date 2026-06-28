package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.server.auditor.ssh.client.database.Column;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class UsersAdditionalKeyDBModel implements a {
    private String mExpression;
    private String mTitle;

    public UsersAdditionalKeyDBModel() {
    }

    public String getExpression() {
        return this.mExpression;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setExpression(String str) {
        this.mExpression = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    @Override // kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", this.mTitle);
        contentValues.put(Column.EXPRESSION, this.mExpression);
        return contentValues;
    }

    public UsersAdditionalKeyDBModel(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Title and expression of user's key can't be empty");
        }
        this.mTitle = str;
        this.mExpression = str2;
    }

    public UsersAdditionalKeyDBModel(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("title");
        int columnIndex2 = cursor.getColumnIndex(Column.EXPRESSION);
        this.mTitle = cursor.getString(columnIndex);
        this.mExpression = cursor.getString(columnIndex2);
    }
}

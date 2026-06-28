package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class CompletionDBModel implements a {
    private final s cryptor;
    private String mCommand;
    private long mId;
    private long mUpdated;
    private int mUseCounter;

    CompletionDBModel(long j10, String str, int i10, long j11, s sVar) {
        this.mId = j10;
        this.mCommand = str;
        this.mUseCounter = i10;
        this.mUpdated = j11;
        this.cryptor = sVar;
    }

    private static String getCommand(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Column.COMMAND));
    }

    private static long getCompletionDictId(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex(Column.COMPLETION_DICT_ID));
    }

    private static long getUpdatedAt(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("updated_at"));
    }

    private static int getUseCounter(Cursor cursor) {
        return cursor.getInt(cursor.getColumnIndex(Column.USE_COUNTER));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.mCommand;
            String str2 = ((CompletionDBModel) obj).mCommand;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public long getId() {
        return this.mId;
    }

    public long getUpdated() {
        return this.mUpdated;
    }

    public int hashCode() {
        String str = this.mCommand;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setUpdated(long j10) {
        this.mUpdated = j10;
    }

    public void setUseCounter(int i10) {
        this.mUseCounter = i10;
    }

    @Override // kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = new ContentValues();
        long j10 = this.mId;
        if (j10 > -1) {
            contentValues.put(Column.COMPLETION_DICT_ID, Long.valueOf(j10));
        }
        contentValues.put(Column.COMMAND, sVar.a(this.mCommand));
        contentValues.put(Column.USE_COUNTER, Integer.valueOf(this.mUseCounter));
        contentValues.put("updated_at", Long.valueOf(this.mUpdated));
        return contentValues;
    }

    public String toString() {
        return "CompletionDBModel{mCommand='" + this.mCommand + "', mUseCounter=" + this.mUseCounter + '}';
    }

    public String getCommand() {
        return this.mCommand;
    }

    public int getUseCounter() {
        return this.mUseCounter;
    }

    public CompletionDBModel(String str, long j10, s sVar) {
        this.mId = -1L;
        this.mUseCounter = 1;
        this.mCommand = str;
        this.mUpdated = j10;
        this.cryptor = sVar;
    }

    public CompletionDBModel(Cursor cursor, s sVar) {
        this(getCompletionDictId(cursor), sVar.b(getCommand(cursor)), getUseCounter(cursor), getUpdatedAt(cursor), sVar);
    }
}

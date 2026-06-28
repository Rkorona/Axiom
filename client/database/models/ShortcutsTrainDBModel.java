package com.server.auditor.ssh.client.database.models;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.b;
import kj.a;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class ShortcutsTrainDBModel implements a {
    private long mId;
    private double mOrder;
    private String[] mShortcuts;

    private ShortcutsTrainDBModel(long j10, String str, String str2, String str3, String str4, double d10) {
        this.mId = j10;
        this.mShortcuts = new String[]{str, str2, str3, str4};
        this.mOrder = d10;
    }

    private static long getIdByCursor(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex(Column.ID));
    }

    private static String getShortcut1ByCursor(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Column.SHORTCUT_1));
    }

    private static String getShortcut2ByCursor(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Column.SHORTCUT_2));
    }

    private static String getShortcut3ByCursor(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Column.SHORTCUT_3));
    }

    private static String getShortcut4ByCursor(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Column.SHORTCUT_4));
    }

    private static double getShortcutOrderByCursor(Cursor cursor) {
        return cursor.getDouble(cursor.getColumnIndex(Column.SHORTCUT_ORDER));
    }

    public long getId() {
        return this.mId;
    }

    public double getOrder() {
        return this.mOrder;
    }

    public String[] getShortcuts() {
        return this.mShortcuts;
    }

    public void setShortcuts(String[] strArr) {
        this.mShortcuts = strArr;
    }

    @Override // kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Column.SHORTCUT_1, this.mShortcuts[0]);
        contentValues.put(Column.SHORTCUT_2, this.mShortcuts[1]);
        contentValues.put(Column.SHORTCUT_3, this.mShortcuts[2]);
        contentValues.put(Column.SHORTCUT_4, this.mShortcuts[3]);
        contentValues.put(Column.SHORTCUT_ORDER, Double.valueOf(this.mOrder));
        return contentValues;
    }

    public ShortcutsTrainDBModel(Cursor cursor) {
        this(getIdByCursor(cursor), getShortcut1ByCursor(cursor), getShortcut2ByCursor(cursor), getShortcut3ByCursor(cursor), getShortcut4ByCursor(cursor), getShortcutOrderByCursor(cursor));
    }

    public ShortcutsTrainDBModel(b bVar) {
        this(bVar.b(), bVar.a()[0], bVar.a()[1], bVar.a()[2], bVar.a()[3], bVar.c());
    }

    public ShortcutsTrainDBModel(String[] strArr, double d10) {
        this(0L, strArr[0], strArr[1], strArr[2], strArr[3], d10);
    }
}

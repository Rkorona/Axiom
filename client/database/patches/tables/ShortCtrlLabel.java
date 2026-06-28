package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class ShortCtrlLabel extends AbsPatch {
    private static final String CTRL_STRING = "Ctrl+";
    private static final String ID = "_id";
    private static final String NEW_CTRL_STRING = "^";
    private static final String NEW_PAGE_STRING = "Pg";
    private static final String PAGE_STRING = "Page";
    private static final String SHORTCUT_1 = "shortcut_1";
    private static final String SHORTCUT_2 = "shortcut_2";
    private static final String SHORTCUT_3 = "shortcut_3";
    private static final String SHORTCUT_4 = "shortcut_4";
    private static final String SHORTCUT_ORDER = "shortcut_order";
    private static final String SHORTCUT_TRAINS = "shortcut_trains";

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        Cursor cursorQuery = sQLiteDatabase.query("shortcut_trains", null, null, null, null, null, null);
        ArrayList<ShortcutsTrainDBModel> arrayList = new ArrayList();
        if (cursorQuery.moveToFirst()) {
            do {
                arrayList.add(new ShortcutsTrainDBModel(cursorQuery));
            } while (cursorQuery.moveToNext());
        }
        cursorQuery.close();
        if (arrayList.size() > 0) {
            Pattern patternCompile = Pattern.compile("^Ctrl[+].+");
            Pattern patternCompile2 = Pattern.compile("^Page.+");
            for (ShortcutsTrainDBModel shortcutsTrainDBModel : arrayList) {
                String[] strArr = new String[shortcutsTrainDBModel.getShortcuts().length];
                for (int i10 = 0; i10 < shortcutsTrainDBModel.getShortcuts().length; i10++) {
                    StringBuilder sb2 = new StringBuilder(shortcutsTrainDBModel.getShortcuts()[i10]);
                    Matcher matcher = patternCompile.matcher(sb2);
                    Matcher matcher2 = patternCompile2.matcher(sb2);
                    if (matcher.matches()) {
                        sb2.replace(0, 5, NEW_CTRL_STRING);
                    } else if (matcher2.matches()) {
                        sb2.replace(0, 4, NEW_PAGE_STRING);
                    }
                    strArr[i10] = sb2.toString();
                }
                shortcutsTrainDBModel.setShortcuts(strArr);
            }
            for (ShortcutsTrainDBModel shortcutsTrainDBModel2 : arrayList) {
                sQLiteDatabase.update("shortcut_trains", shortcutsTrainDBModel2.toContentValues(), "_id=?", new String[]{String.valueOf(shortcutsTrainDBModel2.getId())});
            }
        }
    }

    private static class ShortcutsTrainDBModel {
        private long mId;
        private double mOrder;
        private String[] mShortcuts;

        private ShortcutsTrainDBModel(long j10, String str, String str2, String str3, String str4, double d10) {
            this.mId = j10;
            this.mShortcuts = new String[]{str, str2, str3, str4};
            this.mOrder = d10;
        }

        private static long getIdByCursor(Cursor cursor) {
            return cursor.getLong(cursor.getColumnIndex("_id"));
        }

        private static String getShortcut1ByCursor(Cursor cursor) {
            return cursor.getString(cursor.getColumnIndex("shortcut_1"));
        }

        private static String getShortcut2ByCursor(Cursor cursor) {
            return cursor.getString(cursor.getColumnIndex("shortcut_2"));
        }

        private static String getShortcut3ByCursor(Cursor cursor) {
            return cursor.getString(cursor.getColumnIndex("shortcut_3"));
        }

        private static String getShortcut4ByCursor(Cursor cursor) {
            return cursor.getString(cursor.getColumnIndex("shortcut_4"));
        }

        private static double getShortcutOrderByCursor(Cursor cursor) {
            return cursor.getDouble(cursor.getColumnIndex("shortcut_order"));
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

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("shortcut_1", this.mShortcuts[0]);
            contentValues.put("shortcut_2", this.mShortcuts[1]);
            contentValues.put("shortcut_3", this.mShortcuts[2]);
            contentValues.put("shortcut_4", this.mShortcuts[3]);
            contentValues.put("shortcut_order", Double.valueOf(this.mOrder));
            return contentValues;
        }

        public ShortcutsTrainDBModel(Cursor cursor) {
            this(getIdByCursor(cursor), getShortcut1ByCursor(cursor), getShortcut2ByCursor(cursor), getShortcut3ByCursor(cursor), getShortcut4ByCursor(cursor), getShortcutOrderByCursor(cursor));
        }
    }
}

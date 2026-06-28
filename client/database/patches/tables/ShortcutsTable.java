package com.server.auditor.ssh.client.database.patches.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ShortcutsTable extends AbsPatch {
    private static final String[] ARRAY_ADDITIONAL_KEYS_DEFAULT = {"Ctrl", "Esc", "-", "/", "Left", "Up", "Down", "Right", "Alt", "Tab", "Insert", "Delete", "Home", "Pg Up", "Pg Dn", "End", "|", ":", ";", "!", "~", "@", "$", "*", "^", "%", "=", "`", "<", ">", "(", ")", "{", "}", "[", "]", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "^_", "^W", "^R", "^XX", "^C", "^L", "^S", "^Z", "^X", "^G", "^N", "^P"};
    private static final String ID = "_id";
    private static final int KEY_GROUP_LENGTH = 4;
    private static final String SHORTCUTS_OLD = "key_shared_prefs";
    private static final String SHORTCUT_1 = "shortcut_1";
    private static final String SHORTCUT_2 = "shortcut_2";
    private static final String SHORTCUT_3 = "shortcut_3";
    private static final String SHORTCUT_4 = "shortcut_4";
    private static final String SHORTCUT_ORDER = "shortcut_order";
    private static final String SHORTCUT_TRAINS = "shortcut_trains";

    private static class ShortcutsTrainDBModel {
        private long mId;
        private double mOrder;
        private String[] mShortcuts;

        public ShortcutsTrainDBModel(String[] strArr, double d10) {
            this(0L, strArr[0], strArr[1], strArr[2], strArr[3], d10);
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

        private ShortcutsTrainDBModel(long j10, String str, String str2, String str3, String str4, double d10) {
            this.mId = j10;
            this.mShortcuts = new String[]{str, str2, str3, str4};
            this.mOrder = d10;
        }
    }

    private void migrateShortcuts(SQLiteDatabase sQLiteDatabase, Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove(SHORTCUTS_OLD).apply();
        String[] strArr = ARRAY_ADDITIONAL_KEYS_DEFAULT;
        ArrayList arrayList = new ArrayList(strArr.length);
        arrayList.addAll(Arrays.asList(strArr));
        saveShortcutsToDb(sQLiteDatabase, arrayList);
    }

    private void saveShortcutsToDb(SQLiteDatabase sQLiteDatabase, List<String> list) {
        String[] strArr = {"", "", "", ""};
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            strArr[i10] = list.get(i11);
            if (i10 == 3) {
                sQLiteDatabase.insert("shortcut_trains", null, new ShortcutsTrainDBModel(strArr, (i11 / 4) * 100).toContentValues());
                strArr = new String[]{"", "", "", ""};
                i10 = 0;
            } else {
                i10++;
            }
        }
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", "shortcut_trains"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s TEXT DEFAULT NULL, %s DOUBLE NOT NULL DEFAULT 0.0)", "shortcut_trains", "_id", "shortcut_1", "shortcut_2", "shortcut_3", "shortcut_4", "shortcut_order"));
        migrateShortcuts(sQLiteDatabase, context);
    }
}

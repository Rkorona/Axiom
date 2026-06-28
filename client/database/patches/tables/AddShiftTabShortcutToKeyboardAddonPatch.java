package com.server.auditor.ssh.client.database.patches.tables;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.server.auditor.ssh.client.database.patches.AbsPatch;
import hg.d2;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes3.dex */
public final class AddShiftTabShortcutToKeyboardAddonPatch extends AbsPatch {
    private static final String BACK_SLASH_SHORTCUT = "\\";
    private static final String CTRL_SHORTCUT = "Ctrl";
    private static final String ESC_SHORTCUT = "Esc";
    private static final String MINUS_SHORTCUT = "-";
    private static final String QUESTION_MARK_SHORTCUT = "?";
    private static final double SHIFT_SHORTCUT_ORDER_BY = 100.0d;
    private static final String SHIFT_TAB_SHORTCUT = "Shift+Tab";
    private static final String SLASH_SHORTCUT = "/";
    private static final String VERTICAL_BAR_SHORTCUT = "|";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void createNewShortcutGroup(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4, double d10) {
        shiftExistedShortcuts(sQLiteDatabase, d10);
        sQLiteDatabase.execSQL("INSERT INTO shortcut_trains (shortcut_1, shortcut_2, shortcut_3, shortcut_4, shortcut_order)\nVALUES (?, ?, ?, ?, ?)", new Object[]{str, str2, str3, str4, Double.valueOf(d10)});
    }

    private final boolean hasSuccessfulConnections() {
        return new d2().c().getInt("count_of_successful_connections", 0) > 0;
    }

    private final void shiftExistedShortcuts(SQLiteDatabase sQLiteDatabase, double d10) {
        sQLiteDatabase.execSQL("UPDATE shortcut_trains\nSET shortcut_order = shortcut_order + ?\nWHERE shortcut_order >= ?", new Object[]{Double.valueOf(SHIFT_SHORTCUT_ORDER_BY), Double.valueOf(d10)});
    }

    @Override // com.server.auditor.ssh.client.database.patches.AbsPatch
    public void apply(SQLiteDatabase sQLiteDatabase, Context context) {
        t.f(sQLiteDatabase, "db");
        t.f(context, "ct");
        if (hasSuccessfulConnections()) {
            createNewShortcutGroup(sQLiteDatabase, SHIFT_TAB_SHORTCUT, CTRL_SHORTCUT, ESC_SHORTCUT, SLASH_SHORTCUT, 400.0d);
            createNewShortcutGroup(sQLiteDatabase, VERTICAL_BAR_SHORTCUT, BACK_SLASH_SHORTCUT, QUESTION_MARK_SHORTCUT, MINUS_SHORTCUT, 500.0d);
        } else {
            sQLiteDatabase.execSQL("UPDATE shortcut_trains\nSET shortcut_1 = ?,\nshortcut_2 = ?,\nshortcut_3 = ?,\nshortcut_4 = ?\nWHERE shortcut_order = ?", new Object[]{SHIFT_TAB_SHORTCUT, CTRL_SHORTCUT, ESC_SHORTCUT, SLASH_SHORTCUT, Double.valueOf(0.0d)});
            createNewShortcutGroup(sQLiteDatabase, VERTICAL_BAR_SHORTCUT, BACK_SLASH_SHORTCUT, QUESTION_MARK_SHORTCUT, MINUS_SHORTCUT, 400.0d);
        }
    }
}

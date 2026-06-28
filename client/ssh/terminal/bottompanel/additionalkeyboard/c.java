package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import com.server.auditor.ssh.client.database.adapters.ShortcutsTrainDBAdapter;
import com.server.auditor.ssh.client.database.models.ShortcutsTrainDBModel;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    private static void a(hg.d dVar) {
        dVar.edit().putInt("key_autocomplete_state", KeyTextView.State.Pressed.ordinal()).apply();
        ShortcutsTrainDBAdapter shortcutsTrainDBAdapterH = hg.f.p().H();
        shortcutsTrainDBAdapterH.add(new ShortcutsTrainDBModel(AdditionalPanelKeys.f38942b, shortcutsTrainDBAdapterH.getMinOrder() - 1.0d));
        dVar.edit().putBoolean("key_pro_shortcuts_promoted_v2.5.5", true).apply();
    }

    public static void b(hg.d dVar) {
        if (dVar.getBoolean("key_pro_shortcuts_promoted_v2.5.5", false) || dVar.getBoolean("key_pro_shortcuts_promoted", false)) {
            return;
        }
        a(dVar);
    }
}

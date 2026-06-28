package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        if (sharedPreferences.getBoolean("key_is_pro_mode_inactive", true)) {
            sharedPreferences.edit().putInt("key_autocomplete_state", KeyTextView.State.Pressed.ordinal()).putBoolean("enable_ac_for_new_connection", true).apply();
        }
    }
}

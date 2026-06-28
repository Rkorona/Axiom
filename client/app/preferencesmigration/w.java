package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;

/* JADX INFO: loaded from: classes2.dex */
class w implements k {
    w() {
    }

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("terminal_tabs_settings")) {
            return;
        }
        if (TermiusApplication.F().getResources().getBoolean(R.bool.isTablet)) {
            sharedPreferences.edit().putString("terminal_tabs_settings", "show_always").apply();
        } else {
            sharedPreferences.edit().putString("terminal_tabs_settings", "show_time").apply();
        }
    }
}

package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        if (sharedPreferences.contains("sharedPreferencesTheme")) {
            int i10 = sharedPreferences.getInt("sharedPreferencesTheme", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (i10 == 2) {
                editorEdit.putInt("sharedPreferencesTheme", 1);
                editorEdit.apply();
            }
        }
    }
}

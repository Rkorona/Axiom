package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        sharedPreferences.edit().remove("is_hardware_key_storage_available").apply();
    }
}

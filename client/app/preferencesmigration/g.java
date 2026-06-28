package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class g implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.getBoolean("key_should_init_purchase_test", false)) {
            sharedPreferences.edit().putString("key_purchase_flow_a_b_type", "a_type").apply();
        }
    }
}

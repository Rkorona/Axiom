package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21439a = "compression_level_new";

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.getString("compression_level_new", String.valueOf(0)).equals(String.valueOf(0))) {
            sharedPreferences.edit().putString("compression_level_new", String.valueOf(2)).apply();
        }
    }
}

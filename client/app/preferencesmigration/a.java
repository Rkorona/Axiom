package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21437a = "SA_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21438b = "sharedPreferencesIsAPIMigrated";

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        if (TextUtils.isEmpty(sharedPreferences.getString(this.f21437a, ""))) {
            sharedPreferences.edit().putBoolean(this.f21438b, true).apply();
        }
    }
}

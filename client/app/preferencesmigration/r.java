package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.synchronization.SyncConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        sharedPreferences.edit().remove(SyncConstants.LastSyncTime.PREFS_LAST_TIME_KEY).apply();
    }
}

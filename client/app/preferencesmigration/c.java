package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("compression_level_new")) {
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.get("compression_level_new") instanceof Integer) {
                Object obj = all.get("compression_level_new");
                if (obj instanceof Integer) {
                    sharedPreferences.edit().remove(SyncConstants.LastSyncTime.PREFS_LAST_TIME_KEY).putString("compression_level_new", String.valueOf(((Integer) obj).intValue())).apply();
                }
            }
        }
    }
}

package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21444a = new a(null);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final void b(SharedPreferences sharedPreferences) {
        String[] strArr = {"500", "250", "100", "10", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE};
        if (sharedPreferences.contains("swipe_timer_serverauditor")) {
            int i10 = sharedPreferences.getInt("swipe_timer_serverauditor", 2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("swipe_timer_serverauditor", strArr[i10]);
            editorEdit.apply();
        }
    }

    private final void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("pin_code_time")) {
            int i10 = sharedPreferences.getInt("pin_code_time", 5);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("pin_code_time", String.valueOf(i10));
            editorEdit.apply();
        }
    }

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        b(sharedPreferences);
        c(sharedPreferences);
    }
}

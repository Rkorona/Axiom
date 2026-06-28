package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21443a = new a(null);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("session_logs_screen_column_states");
        editorEdit.apply();
    }
}

package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21442a = "is_need_resend_fcm_push_token";

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(this.f21442a);
        editorEdit.apply();
    }
}

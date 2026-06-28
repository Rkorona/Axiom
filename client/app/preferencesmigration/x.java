package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21445a = "fonts/SourceCodePro-Medium.ttf";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21446b = "fonts/OperatorMono-Medium.ttf";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21447c = "fontTerminal";

    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        ju.t.f(sharedPreferences, "preferences");
        try {
            if (sharedPreferences.contains(this.f21447c) && ju.t.b(sharedPreferences.getString(this.f21447c, ""), this.f21446b)) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(this.f21447c, this.f21445a);
                editorEdit.apply();
            }
        } catch (ClassCastException unused) {
        }
    }
}

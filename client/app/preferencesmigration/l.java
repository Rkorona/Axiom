package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21441a = new a(null);

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
        String string = sharedPreferences.getString("fontTerminal", "");
        String str = string != null ? string : "";
        if (ju.t.b(str, "fonts/AndaleMono.ttf") || ju.t.b(str, "fonts/OperatorMono-Book.ttf")) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("fontTerminal", "fonts/SourceCodePro-Medium.ttf");
            editorEdit.apply();
        }
    }
}

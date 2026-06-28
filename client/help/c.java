package com.server.auditor.ssh.client.help;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27038a;

    public c(Context context) {
        ju.t.f(context, "context");
        this.f27038a = context;
    }

    public final ClipboardManager a() {
        Object systemService = this.f27038a.getSystemService("clipboard");
        ju.t.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    public final ClipData b(String str, String str2) {
        ju.t.f(str, "label");
        ju.t.f(str2, "text");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        ju.t.e(clipDataNewPlainText, "newPlainText(...)");
        return clipDataNewPlainText;
    }
}

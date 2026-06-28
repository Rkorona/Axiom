package com.server.auditor.ssh.client.utils.binaries;

import android.content.Context;
import com.server.auditor.ssh.client.app.TermiusApplication;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static String a(Context context) {
        return new File(context.getFilesDir(), "bin").getAbsolutePath();
    }

    public static String b(Context context, String str) {
        return String.format("%s/%s", a(context), str);
    }

    public static String c() {
        return new File(TermiusApplication.F().getFilesDir(), "terminfo").getAbsolutePath();
    }
}

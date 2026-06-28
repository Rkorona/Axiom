package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.database.DatabaseIntegrityException;
import io.sentry.f5;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27560a = new a(null);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final void a(String str) {
        ju.t.f(str, "report");
        Charset charset = StandardCharsets.UTF_8;
        ju.t.e(charset, "UTF_8");
        byte[] bytes = str.getBytes(charset);
        ju.t.e(bytes, "getBytes(...)");
        f5.l(new DatabaseIntegrityException(null, null, 3, null), io.sentry.i0.q(new io.sentry.b(bytes, "database_report_sentry.log")));
    }
}

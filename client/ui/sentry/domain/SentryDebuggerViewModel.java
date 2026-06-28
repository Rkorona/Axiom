package com.server.auditor.ssh.client.ui.sentry.domain;

import androidx.lifecycle.i1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import ju.t;
import po.e;
import ut.s;
import y9.a;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryDebuggerViewModel extends i1 {
    public static final int $stable = 8;

    public final void addBreadcrumb(String str, String str2) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        t.f(str2, "category");
        a.f86838a.c(str, str2);
    }

    public final void addTag(String str, String str2) {
        t.f(str, "tagKey");
        t.f(str2, "tagValue");
        a.f86838a.d(str, str2);
    }

    public final void clearBreadcrumbs() {
        a.f86838a.e();
    }

    public final void removeTag(String str) {
        t.f(str, "tagKey");
        a.f86838a.p(str);
    }

    public final void sendTestEvent(e eVar) {
        t.f(eVar, "sentryTestEvent");
        if (eVar instanceof e.b) {
            a.f86838a.g(((e.b) eVar).a());
        } else {
            if (!(eVar instanceof e.a)) {
                throw new s();
            }
            a.f86838a.i(((e.a) eVar).a());
        }
    }
}

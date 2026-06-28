package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import com.server.auditor.ssh.client.ui.sessionlogs.domain.c;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f40632a;

    public b(c cVar) {
        t.f(cVar, "setSessionLogsPromotionDialogState");
        this.f40632a = cVar;
    }

    public final b a(c cVar) {
        t.f(cVar, "setSessionLogsPromotionDialogState");
        return new b(cVar);
    }

    public final c b() {
        return this.f40632a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && t.b(this.f40632a, ((b) obj).f40632a);
    }

    public int hashCode() {
        return this.f40632a.hashCode();
    }

    public String toString() {
        return "DebugPromotionsUiState(setSessionLogsPromotionDialogState=" + this.f40632a + ")";
    }

    public /* synthetic */ b(c cVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? c.a.f40633a : cVar);
    }
}

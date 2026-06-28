package com.server.auditor.ssh.client.fragments.hostngroups;

import com.server.auditor.ssh.client.ui.connections.data.RecentConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecentConnection f25080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RecentConnection recentConnection, boolean z10) {
        super(12, null);
        ju.t.f(recentConnection, "recentConnection");
        this.f25080b = recentConnection;
        this.f25081c = z10;
    }

    public final RecentConnection b() {
        return this.f25080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return ju.t.b(this.f25080b, hVar.f25080b) && this.f25081c == hVar.f25081c;
    }

    public int hashCode() {
        return (this.f25080b.hashCode() * 31) + Boolean.hashCode(this.f25081c);
    }

    public String toString() {
        return "HistoryContainer(recentConnection=" + this.f25080b + ", hasConnecting=" + this.f25081c + ")";
    }
}

package com.server.auditor.ssh.client.navigation;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f29072c;

    public m0(boolean z10, String str, List list) {
        ju.t.f(str, "dotType");
        ju.t.f(list, "inAppMessages");
        this.f29070a = z10;
        this.f29071b = str;
        this.f29072c = list;
    }

    public final String a() {
        return this.f29071b;
    }

    public final List b() {
        return this.f29072c;
    }

    public final boolean c() {
        return this.f29070a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f29070a == m0Var.f29070a && ju.t.b(this.f29071b, m0Var.f29071b) && ju.t.b(this.f29072c, m0Var.f29072c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f29070a) * 31) + this.f29071b.hashCode()) * 31) + this.f29072c.hashCode();
    }

    public String toString() {
        return "InAppMessageContainer(isSyncing=" + this.f29070a + ", dotType=" + this.f29071b + ", inAppMessages=" + this.f29072c + ")";
    }
}

package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34981a;

    public y(List list) {
        ju.t.f(list, "items");
        this.f34981a = list;
    }

    public final List a() {
        return this.f34981a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && ju.t.b(this.f34981a, ((y) obj).f34981a);
    }

    public int hashCode() {
        return this.f34981a.hashCode();
    }

    public String toString() {
        return "ListOfConnectionStyles(items=" + this.f34981a + ")";
    }
}

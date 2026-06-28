package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34982a;

    public z(List list) {
        ju.t.f(list, "items");
        this.f34982a = list;
    }

    public final List a() {
        return this.f34982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && ju.t.b(this.f34982a, ((z) obj).f34982a);
    }

    public int hashCode() {
        return this.f34982a.hashCode();
    }

    public String toString() {
        return "ListOfConnectionTabBarItems(items=" + this.f34982a + ")";
    }
}

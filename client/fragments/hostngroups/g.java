package com.server.auditor.ssh.client.fragments.hostngroups;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(-1, null);
        ju.t.f(str, "header");
        this.f25076b = str;
    }

    public final String b() {
        return this.f25076b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && ju.t.b(this.f25076b, ((g) obj).f25076b);
    }

    public int hashCode() {
        return this.f25076b.hashCode();
    }

    public String toString() {
        return "HeaderContainer(header=" + this.f25076b + ")";
    }
}

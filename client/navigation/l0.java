package com.server.auditor.ssh.client.navigation;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29067c;

    public l0(int i10, String str, String str2) {
        ju.t.f(str, "username");
        ju.t.f(str2, "userFullName");
        this.f29065a = i10;
        this.f29066b = str;
        this.f29067c = str2;
    }

    public final int a() {
        return this.f29065a;
    }

    public final String b() {
        return this.f29067c;
    }

    public final String c() {
        return this.f29066b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f29065a == l0Var.f29065a && ju.t.b(this.f29066b, l0Var.f29066b) && ju.t.b(this.f29067c, l0Var.f29067c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f29065a) * 31) + this.f29066b.hashCode()) * 31) + this.f29067c.hashCode();
    }

    public String toString() {
        return "InAppMessageAttributes(id=" + this.f29065a + ", username=" + this.f29066b + ", userFullName=" + this.f29067c + ")";
    }
}

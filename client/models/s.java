package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27945a;

    public s(String str) {
        ju.t.f(str, "title");
        this.f27945a = str;
    }

    public final String a() {
        return this.f27945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && ju.t.b(this.f27945a, ((s) obj).f27945a);
    }

    public int hashCode() {
        return this.f27945a.hashCode();
    }

    public String toString() {
        return "TagItem(title=" + this.f27945a + ")";
    }
}

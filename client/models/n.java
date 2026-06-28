package com.server.auditor.ssh.client.models;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f27917c;

    public n(int i10, List list, List list2) {
        ju.t.f(list, "warnings");
        ju.t.f(list2, "suggestions");
        this.f27915a = i10;
        this.f27916b = list;
        this.f27917c = list2;
    }

    public final int a() {
        return this.f27915a;
    }

    public final List b() {
        return this.f27917c;
    }

    public final List c() {
        return this.f27916b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f27915a == nVar.f27915a && ju.t.b(this.f27916b, nVar.f27916b) && ju.t.b(this.f27917c, nVar.f27917c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f27915a) * 31) + this.f27916b.hashCode()) * 31) + this.f27917c.hashCode();
    }

    public String toString() {
        return "PasswordStrengthMeasureResult(strengthScore=" + this.f27915a + ", warnings=" + this.f27916b + ", suggestions=" + this.f27917c + ")";
    }

    public /* synthetic */ n(int i10, List list, List list2, int i11, ju.k kVar) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? vt.v.o() : list, (i11 & 4) != 0 ? vt.v.o() : list2);
    }
}

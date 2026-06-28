package com.server.auditor.ssh.client.adapters;

import com.server.auditor.ssh.client.database.Column;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21321g;

    public h(int i10, String str, String str2, String str3, boolean z10, String str4, String str5) {
        ju.t.f(str, "title");
        ju.t.f(str2, "description");
        ju.t.f(str3, "time");
        ju.t.f(str4, Column.TYPE);
        this.f21315a = i10;
        this.f21316b = str;
        this.f21317c = str2;
        this.f21318d = str3;
        this.f21319e = z10;
        this.f21320f = str4;
        this.f21321g = str5;
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public abstract String e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c() == hVar.c() && ju.t.b(f(), hVar.f()) && ju.t.b(b(), hVar.b()) && ju.t.b(e(), hVar.e()) && d() == hVar.d() && ju.t.b(g(), hVar.g()) && ju.t.b(a(), hVar.a());
    }

    public abstract String f();

    public abstract String g();

    public int hashCode() {
        int iC = ((((((((((c() * 31) + f().hashCode()) * 31) + b().hashCode()) * 31) + e().hashCode()) * 31) + Boolean.hashCode(d())) * 31) + g().hashCode()) * 31;
        String strA = a();
        return iC + (strA != null ? strA.hashCode() : 0);
    }
}

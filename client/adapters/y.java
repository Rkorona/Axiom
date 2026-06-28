package com.server.auditor.ssh.client.adapters;

import com.server.auditor.ssh.client.database.Column;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f21382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21385n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10, String str, String str2, String str3, boolean z10, String str4, String str5) {
        super(i10, str, str2, str3, z10, str4, str5);
        ju.t.f(str, "title");
        ju.t.f(str2, "description");
        ju.t.f(str3, "time");
        ju.t.f(str4, Column.TYPE);
        this.f21379h = i10;
        this.f21380i = str;
        this.f21381j = str2;
        this.f21382k = str3;
        this.f21383l = z10;
        this.f21384m = str4;
        this.f21385n = str5;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String a() {
        return this.f21385n;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String b() {
        return this.f21381j;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public int c() {
        return this.f21379h;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public boolean d() {
        return this.f21383l;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String e() {
        return this.f21382k;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f21379h == yVar.f21379h && ju.t.b(this.f21380i, yVar.f21380i) && ju.t.b(this.f21381j, yVar.f21381j) && ju.t.b(this.f21382k, yVar.f21382k) && this.f21383l == yVar.f21383l && ju.t.b(this.f21384m, yVar.f21384m) && ju.t.b(this.f21385n, yVar.f21385n);
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String f() {
        return this.f21380i;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public String g() {
        return this.f21384m;
    }

    @Override // com.server.auditor.ssh.client.adapters.h
    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.f21379h) * 31) + this.f21380i.hashCode()) * 31) + this.f21381j.hashCode()) * 31) + this.f21382k.hashCode()) * 31) + Boolean.hashCode(this.f21383l)) * 31) + this.f21384m.hashCode()) * 31;
        String str = this.f21385n;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NotificationModel(id=" + this.f21379h + ", title=" + this.f21380i + ", description=" + this.f21381j + ", time=" + this.f21382k + ", showed=" + this.f21383l + ", type=" + this.f21384m + ", buttonName=" + this.f21385n + ")";
    }
}

package com.server.auditor.ssh.client.adapters;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f21353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, List list, z zVar, boolean z10) {
        super(z10, null);
        ju.t.f(str, "currencySymbol");
        ju.t.f(str2, "price");
        ju.t.f(list, "pricePerType");
        ju.t.f(zVar, "payPeriodInfo");
        this.f21350b = str;
        this.f21351c = str2;
        this.f21352d = list;
        this.f21353e = zVar;
        this.f21354f = z10;
    }

    @Override // com.server.auditor.ssh.client.adapters.n
    public boolean a() {
        return this.f21354f;
    }

    public final String b() {
        return this.f21350b;
    }

    public final z c() {
        return this.f21353e;
    }

    public final String d() {
        return this.f21351c;
    }

    public final List e() {
        return this.f21352d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return ju.t.b(this.f21350b, oVar.f21350b) && ju.t.b(this.f21351c, oVar.f21351c) && ju.t.b(this.f21352d, oVar.f21352d) && ju.t.b(this.f21353e, oVar.f21353e) && this.f21354f == oVar.f21354f;
    }

    public int hashCode() {
        return (((((((this.f21350b.hashCode() * 31) + this.f21351c.hashCode()) * 31) + this.f21352d.hashCode()) * 31) + this.f21353e.hashCode()) * 31) + Boolean.hashCode(this.f21354f);
    }

    public String toString() {
        return "EndOfTrialBusinessPlanModel(currencySymbol=" + this.f21350b + ", price=" + this.f21351c + ", pricePerType=" + this.f21352d + ", payPeriodInfo=" + this.f21353e + ", isShowOutline=" + this.f21354f + ")";
    }
}

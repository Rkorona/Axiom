package com.server.auditor.ssh.client.adapters;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f21361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, List list, z zVar, boolean z10) {
        super(z10, null);
        ju.t.f(str, "currencySymbol");
        ju.t.f(str2, "price");
        ju.t.f(list, "pricePerType");
        ju.t.f(zVar, "payPeriodInfo");
        this.f21358b = str;
        this.f21359c = str2;
        this.f21360d = list;
        this.f21361e = zVar;
        this.f21362f = z10;
    }

    @Override // com.server.auditor.ssh.client.adapters.n
    public boolean a() {
        return this.f21362f;
    }

    public final String b() {
        return this.f21358b;
    }

    public final z c() {
        return this.f21361e;
    }

    public final String d() {
        return this.f21359c;
    }

    public final List e() {
        return this.f21360d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return ju.t.b(this.f21358b, qVar.f21358b) && ju.t.b(this.f21359c, qVar.f21359c) && ju.t.b(this.f21360d, qVar.f21360d) && ju.t.b(this.f21361e, qVar.f21361e) && this.f21362f == qVar.f21362f;
    }

    public int hashCode() {
        return (((((((this.f21358b.hashCode() * 31) + this.f21359c.hashCode()) * 31) + this.f21360d.hashCode()) * 31) + this.f21361e.hashCode()) * 31) + Boolean.hashCode(this.f21362f);
    }

    public String toString() {
        return "EndOfTrialProPlanModel(currencySymbol=" + this.f21358b + ", price=" + this.f21359c + ", pricePerType=" + this.f21360d + ", payPeriodInfo=" + this.f21361e + ", isShowOutline=" + this.f21362f + ")";
    }
}

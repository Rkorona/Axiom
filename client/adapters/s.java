package com.server.auditor.ssh.client.adapters;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f21367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, String str2, List list, z zVar, boolean z10) {
        super(z10, null);
        ju.t.f(str, "currencySymbol");
        ju.t.f(str2, "price");
        ju.t.f(list, "pricePerType");
        ju.t.f(zVar, "payPeriodInfo");
        this.f21364b = str;
        this.f21365c = str2;
        this.f21366d = list;
        this.f21367e = zVar;
        this.f21368f = z10;
    }

    @Override // com.server.auditor.ssh.client.adapters.n
    public boolean a() {
        return this.f21368f;
    }

    public final String b() {
        return this.f21364b;
    }

    public final z c() {
        return this.f21367e;
    }

    public final String d() {
        return this.f21365c;
    }

    public final List e() {
        return this.f21366d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return ju.t.b(this.f21364b, sVar.f21364b) && ju.t.b(this.f21365c, sVar.f21365c) && ju.t.b(this.f21366d, sVar.f21366d) && ju.t.b(this.f21367e, sVar.f21367e) && this.f21368f == sVar.f21368f;
    }

    public int hashCode() {
        return (((((((this.f21364b.hashCode() * 31) + this.f21365c.hashCode()) * 31) + this.f21366d.hashCode()) * 31) + this.f21367e.hashCode()) * 31) + Boolean.hashCode(this.f21368f);
    }

    public String toString() {
        return "EndOfTrialTeamPlanModel(currencySymbol=" + this.f21364b + ", price=" + this.f21365c + ", pricePerType=" + this.f21366d + ", payPeriodInfo=" + this.f21367e + ", isShowOutline=" + this.f21368f + ")";
    }
}

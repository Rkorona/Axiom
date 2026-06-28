package com.server.auditor.ssh.client.adapters;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21363b;

    public /* synthetic */ r(boolean z10, int i10, ju.k kVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // com.server.auditor.ssh.client.adapters.n
    public boolean a() {
        return this.f21363b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f21363b == ((r) obj).f21363b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f21363b);
    }

    public String toString() {
        return "EndOfTrialStarterPlanModel(isShowOutline=" + this.f21363b + ")";
    }

    public r(boolean z10) {
        super(z10, null);
        this.f21363b = z10;
    }
}

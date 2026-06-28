package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.help.a0 f27880b;

    public a0(boolean z10, com.server.auditor.ssh.client.help.a0 a0Var) {
        this.f27879a = z10;
        this.f27880b = a0Var;
    }

    public final com.server.auditor.ssh.client.help.a0 a() {
        return this.f27880b;
    }

    public final boolean b() {
        return this.f27879a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f27879a == a0Var.f27879a && ju.t.b(this.f27880b, a0Var.f27880b);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f27879a) * 31;
        com.server.auditor.ssh.client.help.a0 a0Var = this.f27880b;
        return iHashCode + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public String toString() {
        return "ValidationResult(successful=" + this.f27879a + ", errorMessage=" + this.f27880b + ")";
    }

    public /* synthetic */ a0(boolean z10, com.server.auditor.ssh.client.help.a0 a0Var, int i10, ju.k kVar) {
        this(z10, (i10 & 2) != 0 ? null : a0Var);
    }
}

package com.server.auditor.ssh.client.models;

import pv.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f27991d;

    public z(int i10, e0 e0Var) {
        super(i10, e0Var, null);
        this.f27990c = i10;
        this.f27991d = e0Var;
    }

    @Override // com.server.auditor.ssh.client.models.e
    public e0 a() {
        return this.f27991d;
    }

    @Override // com.server.auditor.ssh.client.models.e
    public int b() {
        return this.f27990c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f27990c == zVar.f27990c && ju.t.b(this.f27991d, zVar.f27991d);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f27990c) * 31;
        e0 e0Var = this.f27991d;
        return iHashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public String toString() {
        return "UnhandledErrorResponse(responseCode=" + this.f27990c + ", errorBody=" + this.f27991d + ")";
    }
}

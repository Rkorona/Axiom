package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import pv.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f27989c;

    public y(e0 e0Var) {
        super(SyncConstants.ResultCode.UNAUTHORIZED, e0Var, null);
        this.f27989c = e0Var;
    }

    @Override // com.server.auditor.ssh.client.models.e
    public e0 a() {
        return this.f27989c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && ju.t.b(this.f27989c, ((y) obj).f27989c);
    }

    public int hashCode() {
        e0 e0Var = this.f27989c;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public String toString() {
        return "UnauthorizedErrorResponse(errorBody=" + this.f27989c + ")";
    }
}

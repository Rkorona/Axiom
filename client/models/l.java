package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import pv.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f27913c;

    public l(e0 e0Var) {
        super(SyncConstants.ResultCode.NOT_FOUND, e0Var, null);
        this.f27913c = e0Var;
    }

    @Override // com.server.auditor.ssh.client.models.e
    public e0 a() {
        return this.f27913c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && ju.t.b(this.f27913c, ((l) obj).f27913c);
    }

    public int hashCode() {
        e0 e0Var = this.f27913c;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public String toString() {
        return "NotFoundErrorResponse(errorBody=" + this.f27913c + ")";
    }
}

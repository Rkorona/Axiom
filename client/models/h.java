package com.server.auditor.ssh.client.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.models.CommonBadRequestResponse;
import hg.b2;
import pv.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27904d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27905e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f27906c;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public h(e0 e0Var) {
        super(SyncConstants.ResultCode.BAD_REQUEST, e0Var, null);
        this.f27906c = e0Var;
    }

    @Override // com.server.auditor.ssh.client.models.e
    public e0 a() {
        return this.f27906c;
    }

    public final CommonBadRequestResponse c() {
        Object objB = null;
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            e0 e0VarA = a();
            String strString = e0VarA != null ? e0VarA.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(iv.a.u(CommonBadRequestResponse.Companion.serializer()), strString);
        } catch (IllegalArgumentException unused) {
        }
        return (CommonBadRequestResponse) objB;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && ju.t.b(this.f27906c, ((h) obj).f27906c);
    }

    public int hashCode() {
        e0 e0Var = this.f27906c;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public String toString() {
        return "BadRequestErrorResponse(errorBody=" + this.f27906c + ")";
    }
}

package com.server.auditor.ssh.client.synchronization.api.models.srp;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SrpSaltBadRequestError {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String detail;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SrpSaltBadRequestError$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ SrpSaltBadRequestError(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, SrpSaltBadRequestError$$serializer.INSTANCE.getDescriptor());
        }
        this.detail = str;
    }

    public static /* synthetic */ SrpSaltBadRequestError copy$default(SrpSaltBadRequestError srpSaltBadRequestError, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = srpSaltBadRequestError.detail;
        }
        return srpSaltBadRequestError.copy(str);
    }

    @o("detail")
    public static /* synthetic */ void getDetail$annotations() {
    }

    public final String component1() {
        return this.detail;
    }

    public final SrpSaltBadRequestError copy(String str) {
        t.f(str, "detail");
        return new SrpSaltBadRequestError(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SrpSaltBadRequestError) && t.b(this.detail, ((SrpSaltBadRequestError) obj).detail);
    }

    public final String getDetail() {
        return this.detail;
    }

    public int hashCode() {
        return this.detail.hashCode();
    }

    public String toString() {
        return "SrpSaltBadRequestError(detail=" + this.detail + ")";
    }

    public SrpSaltBadRequestError(String str) {
        t.f(str, "detail");
        this.detail = str;
    }
}

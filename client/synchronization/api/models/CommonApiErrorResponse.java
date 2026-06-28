package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CommonApiErrorResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String errorMessage;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return CommonApiErrorResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonApiErrorResponse() {
        this((String) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CommonApiErrorResponse copy$default(CommonApiErrorResponse commonApiErrorResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = commonApiErrorResponse.errorMessage;
        }
        return commonApiErrorResponse.copy(str);
    }

    @o("detail")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CommonApiErrorResponse commonApiErrorResponse, kv.d dVar, jv.f fVar) {
        if (!dVar.E(fVar, 0) && commonApiErrorResponse.errorMessage == null) {
            return;
        }
        dVar.v(fVar, 0, x2.f64817a, commonApiErrorResponse.errorMessage);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final CommonApiErrorResponse copy(String str) {
        return new CommonApiErrorResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonApiErrorResponse) && t.b(this.errorMessage, ((CommonApiErrorResponse) obj).errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "CommonApiErrorResponse(errorMessage=" + this.errorMessage + ")";
    }

    public /* synthetic */ CommonApiErrorResponse(int i10, String str, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
    }

    public CommonApiErrorResponse(String str) {
        this.errorMessage = str;
    }

    public /* synthetic */ CommonApiErrorResponse(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}

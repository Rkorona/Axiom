package com.server.auditor.ssh.client.synchronization.api.models;

import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CommonBadRequestResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String errorMessage;

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return CommonBadRequestResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonBadRequestResponse() {
        this((String) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CommonBadRequestResponse copy$default(CommonBadRequestResponse commonBadRequestResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = commonBadRequestResponse.errorMessage;
        }
        return commonBadRequestResponse.copy(str);
    }

    @o("error")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CommonBadRequestResponse commonBadRequestResponse, kv.d dVar, jv.f fVar) {
        if (!dVar.E(fVar, 0) && commonBadRequestResponse.errorMessage == null) {
            return;
        }
        dVar.v(fVar, 0, x2.f64817a, commonBadRequestResponse.errorMessage);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final CommonBadRequestResponse copy(String str) {
        return new CommonBadRequestResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonBadRequestResponse) && t.b(this.errorMessage, ((CommonBadRequestResponse) obj).errorMessage);
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
        return "CommonBadRequestResponse(errorMessage=" + this.errorMessage + ")";
    }

    public /* synthetic */ CommonBadRequestResponse(int i10, String str, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
    }

    public CommonBadRequestResponse(String str) {
        this.errorMessage = str;
    }

    public /* synthetic */ CommonBadRequestResponse(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}

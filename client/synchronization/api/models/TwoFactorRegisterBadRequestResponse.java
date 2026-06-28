package com.server.auditor.ssh.client.synchronization.api.models;

import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TwoFactorRegisterBadRequestResponse {
    private final List<String> errors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.e
        @Override // iu.a
        public final Object a() {
            return TwoFactorRegisterBadRequestResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return TwoFactorRegisterBadRequestResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TwoFactorRegisterBadRequestResponse() {
        this((List) null, 1, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwoFactorRegisterBadRequestResponse copy$default(TwoFactorRegisterBadRequestResponse twoFactorRegisterBadRequestResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = twoFactorRegisterBadRequestResponse.errors;
        }
        return twoFactorRegisterBadRequestResponse.copy(list);
    }

    @hv.o("error")
    public static /* synthetic */ void getErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TwoFactorRegisterBadRequestResponse twoFactorRegisterBadRequestResponse, kv.d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (!dVar.E(fVar, 0) && t.b(twoFactorRegisterBadRequestResponse.errors, v.o())) {
            return;
        }
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), twoFactorRegisterBadRequestResponse.errors);
    }

    public final List<String> component1() {
        return this.errors;
    }

    public final TwoFactorRegisterBadRequestResponse copy(List<String> list) {
        t.f(list, "errors");
        return new TwoFactorRegisterBadRequestResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TwoFactorRegisterBadRequestResponse) && t.b(this.errors, ((TwoFactorRegisterBadRequestResponse) obj).errors);
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public String toString() {
        return "TwoFactorRegisterBadRequestResponse(errors=" + this.errors + ")";
    }

    public /* synthetic */ TwoFactorRegisterBadRequestResponse(int i10, List list, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errors = v.o();
        } else {
            this.errors = list;
        }
    }

    public TwoFactorRegisterBadRequestResponse(List<String> list) {
        t.f(list, "errors");
        this.errors = list;
    }

    public /* synthetic */ TwoFactorRegisterBadRequestResponse(List list, int i10, k kVar) {
        this((i10 & 1) != 0 ? v.o() : list);
    }
}

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
public final class ResetPasswordBadRequestResponse {
    private final List<String> emailErrors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.api.models.b
        @Override // iu.a
        public final Object a() {
            return ResetPasswordBadRequestResponse._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final hv.c serializer() {
            return ResetPasswordBadRequestResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResetPasswordBadRequestResponse() {
        this((List) null, 1, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return new lv.f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetPasswordBadRequestResponse copy$default(ResetPasswordBadRequestResponse resetPasswordBadRequestResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = resetPasswordBadRequestResponse.emailErrors;
        }
        return resetPasswordBadRequestResponse.copy(list);
    }

    @hv.o("username")
    public static /* synthetic */ void getEmailErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ResetPasswordBadRequestResponse resetPasswordBadRequestResponse, kv.d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (!dVar.E(fVar, 0) && t.b(resetPasswordBadRequestResponse.emailErrors, v.o())) {
            return;
        }
        dVar.o(fVar, 0, (hv.r) nVarArr[0].getValue(), resetPasswordBadRequestResponse.emailErrors);
    }

    public final List<String> component1() {
        return this.emailErrors;
    }

    public final ResetPasswordBadRequestResponse copy(List<String> list) {
        t.f(list, "emailErrors");
        return new ResetPasswordBadRequestResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetPasswordBadRequestResponse) && t.b(this.emailErrors, ((ResetPasswordBadRequestResponse) obj).emailErrors);
    }

    public final List<String> getEmailErrors() {
        return this.emailErrors;
    }

    public int hashCode() {
        return this.emailErrors.hashCode();
    }

    public String toString() {
        return "ResetPasswordBadRequestResponse(emailErrors=" + this.emailErrors + ")";
    }

    public /* synthetic */ ResetPasswordBadRequestResponse(int i10, List list, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.emailErrors = v.o();
        } else {
            this.emailErrors = list;
        }
    }

    public ResetPasswordBadRequestResponse(List<String> list) {
        t.f(list, "emailErrors");
        this.emailErrors = list;
    }

    public /* synthetic */ ResetPasswordBadRequestResponse(List list, int i10, k kVar) {
        this((i10 & 1) != 0 ? v.o() : list);
    }
}

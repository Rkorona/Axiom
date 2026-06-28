package com.server.auditor.ssh.client.synchronization.api.models.sso;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.server.auditor.ssh.client.synchronization.api.models.sso.SsoDomainTokenBadRequest;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.f;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class SsoDomainTokenBadRequest {
    private static final n[] $childSerializers;
    private final List<String> authCode;
    private final List<String> errors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SsoDomainTokenBadRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: en.d
            @Override // iu.a
            public final Object a() {
                return SsoDomainTokenBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: en.e
            @Override // iu.a
            public final Object a() {
                return SsoDomainTokenBadRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SsoDomainTokenBadRequest() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SsoDomainTokenBadRequest copy$default(SsoDomainTokenBadRequest ssoDomainTokenBadRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ssoDomainTokenBadRequest.errors;
        }
        if ((i10 & 2) != 0) {
            list2 = ssoDomainTokenBadRequest.authCode;
        }
        return ssoDomainTokenBadRequest.copy(list, list2);
    }

    @hv.o(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE)
    public static /* synthetic */ void getAuthCode$annotations() {
    }

    @hv.o("error")
    public static /* synthetic */ void getErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SsoDomainTokenBadRequest ssoDomainTokenBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || ssoDomainTokenBadRequest.errors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), ssoDomainTokenBadRequest.errors);
        }
        if (!dVar.E(fVar, 1) && ssoDomainTokenBadRequest.authCode == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), ssoDomainTokenBadRequest.authCode);
    }

    public final List<String> component1() {
        return this.errors;
    }

    public final List<String> component2() {
        return this.authCode;
    }

    public final SsoDomainTokenBadRequest copy(List<String> list, List<String> list2) {
        return new SsoDomainTokenBadRequest(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsoDomainTokenBadRequest)) {
            return false;
        }
        SsoDomainTokenBadRequest ssoDomainTokenBadRequest = (SsoDomainTokenBadRequest) obj;
        return t.b(this.errors, ssoDomainTokenBadRequest.errors) && t.b(this.authCode, ssoDomainTokenBadRequest.authCode);
    }

    public final List<String> getAuthCode() {
        return this.authCode;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<String> list = this.errors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.authCode;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "SsoDomainTokenBadRequest(errors=" + this.errors + ", authCode=" + this.authCode + ")";
    }

    public /* synthetic */ SsoDomainTokenBadRequest(int i10, List list, List list2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errors = null;
        } else {
            this.errors = list;
        }
        if ((i10 & 2) == 0) {
            this.authCode = null;
        } else {
            this.authCode = list2;
        }
    }

    public SsoDomainTokenBadRequest(List<String> list, List<String> list2) {
        this.errors = list;
        this.authCode = list2;
    }

    public /* synthetic */ SsoDomainTokenBadRequest(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}

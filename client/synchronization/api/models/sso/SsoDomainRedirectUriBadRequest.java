package com.server.auditor.ssh.client.synchronization.api.models.sso;

import com.server.auditor.ssh.client.synchronization.api.models.sso.SsoDomainRedirectUriBadRequest;
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
public final class SsoDomainRedirectUriBadRequest {
    private static final n[] $childSerializers;
    private final List<String> email;
    private final List<String> errors;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SsoDomainRedirectUriBadRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: en.b
            @Override // iu.a
            public final Object a() {
                return SsoDomainRedirectUriBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: en.c
            @Override // iu.a
            public final Object a() {
                return SsoDomainRedirectUriBadRequest._childSerializers$_anonymous_$0();
            }
        })};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SsoDomainRedirectUriBadRequest() {
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
    public static /* synthetic */ SsoDomainRedirectUriBadRequest copy$default(SsoDomainRedirectUriBadRequest ssoDomainRedirectUriBadRequest, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ssoDomainRedirectUriBadRequest.errors;
        }
        if ((i10 & 2) != 0) {
            list2 = ssoDomainRedirectUriBadRequest.email;
        }
        return ssoDomainRedirectUriBadRequest.copy(list, list2);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @hv.o("error")
    public static /* synthetic */ void getErrors$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SsoDomainRedirectUriBadRequest ssoDomainRedirectUriBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || ssoDomainRedirectUriBadRequest.errors != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), ssoDomainRedirectUriBadRequest.errors);
        }
        if (!dVar.E(fVar, 1) && ssoDomainRedirectUriBadRequest.email == null) {
            return;
        }
        dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), ssoDomainRedirectUriBadRequest.email);
    }

    public final List<String> component1() {
        return this.errors;
    }

    public final List<String> component2() {
        return this.email;
    }

    public final SsoDomainRedirectUriBadRequest copy(List<String> list, List<String> list2) {
        return new SsoDomainRedirectUriBadRequest(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsoDomainRedirectUriBadRequest)) {
            return false;
        }
        SsoDomainRedirectUriBadRequest ssoDomainRedirectUriBadRequest = (SsoDomainRedirectUriBadRequest) obj;
        return t.b(this.errors, ssoDomainRedirectUriBadRequest.errors) && t.b(this.email, ssoDomainRedirectUriBadRequest.email);
    }

    public final List<String> getEmail() {
        return this.email;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<String> list = this.errors;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.email;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "SsoDomainRedirectUriBadRequest(errors=" + this.errors + ", email=" + this.email + ")";
    }

    public /* synthetic */ SsoDomainRedirectUriBadRequest(int i10, List list, List list2, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.errors = null;
        } else {
            this.errors = list;
        }
        if ((i10 & 2) == 0) {
            this.email = null;
        } else {
            this.email = list2;
        }
    }

    public SsoDomainRedirectUriBadRequest(List<String> list, List<String> list2) {
        this.errors = list;
        this.email = list2;
    }

    public /* synthetic */ SsoDomainRedirectUriBadRequest(List list, List list2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}

package com.server.auditor.ssh.client.synchronization.api.models.srp;

import com.server.auditor.ssh.client.synchronization.api.models.srp.SrpMigrationBadRequest;
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
public final class SrpMigrationBadRequest {
    private static final n[] $childSerializers;
    private final List<String> securityToken;
    private final List<String> verificationCode;
    private final List<String> verifier;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return SrpMigrationBadRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        r rVar = r.f82638b;
        $childSerializers = new n[]{o.b(rVar, new a() { // from class: dn.a
            @Override // iu.a
            public final Object a() {
                return SrpMigrationBadRequest._childSerializers$_anonymous_();
            }
        }), o.b(rVar, new a() { // from class: dn.b
            @Override // iu.a
            public final Object a() {
                return SrpMigrationBadRequest._childSerializers$_anonymous_$0();
            }
        }), o.b(rVar, new a() { // from class: dn.c
            @Override // iu.a
            public final Object a() {
                return SrpMigrationBadRequest._childSerializers$_anonymous_$1();
            }
        })};
    }

    public SrpMigrationBadRequest() {
        this((List) null, (List) null, (List) null, 7, (k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$0() {
        return new f(x2.f64817a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_$1() {
        return new f(x2.f64817a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SrpMigrationBadRequest copy$default(SrpMigrationBadRequest srpMigrationBadRequest, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = srpMigrationBadRequest.securityToken;
        }
        if ((i10 & 2) != 0) {
            list2 = srpMigrationBadRequest.verifier;
        }
        if ((i10 & 4) != 0) {
            list3 = srpMigrationBadRequest.verificationCode;
        }
        return srpMigrationBadRequest.copy(list, list2, list3);
    }

    @hv.o("security_token")
    public static /* synthetic */ void getSecurityToken$annotations() {
    }

    @hv.o("verification_code")
    public static /* synthetic */ void getVerificationCode$annotations() {
    }

    @hv.o("verifier")
    public static /* synthetic */ void getVerifier$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(SrpMigrationBadRequest srpMigrationBadRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 0) || srpMigrationBadRequest.securityToken != null) {
            dVar.v(fVar, 0, (hv.r) nVarArr[0].getValue(), srpMigrationBadRequest.securityToken);
        }
        if (dVar.E(fVar, 1) || srpMigrationBadRequest.verifier != null) {
            dVar.v(fVar, 1, (hv.r) nVarArr[1].getValue(), srpMigrationBadRequest.verifier);
        }
        if (!dVar.E(fVar, 2) && srpMigrationBadRequest.verificationCode == null) {
            return;
        }
        dVar.v(fVar, 2, (hv.r) nVarArr[2].getValue(), srpMigrationBadRequest.verificationCode);
    }

    public final List<String> component1() {
        return this.securityToken;
    }

    public final List<String> component2() {
        return this.verifier;
    }

    public final List<String> component3() {
        return this.verificationCode;
    }

    public final SrpMigrationBadRequest copy(List<String> list, List<String> list2, List<String> list3) {
        return new SrpMigrationBadRequest(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrpMigrationBadRequest)) {
            return false;
        }
        SrpMigrationBadRequest srpMigrationBadRequest = (SrpMigrationBadRequest) obj;
        return t.b(this.securityToken, srpMigrationBadRequest.securityToken) && t.b(this.verifier, srpMigrationBadRequest.verifier) && t.b(this.verificationCode, srpMigrationBadRequest.verificationCode);
    }

    public final List<String> getSecurityToken() {
        return this.securityToken;
    }

    public final List<String> getVerificationCode() {
        return this.verificationCode;
    }

    public final List<String> getVerifier() {
        return this.verifier;
    }

    public int hashCode() {
        List<String> list = this.securityToken;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.verifier;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.verificationCode;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "SrpMigrationBadRequest(securityToken=" + this.securityToken + ", verifier=" + this.verifier + ", verificationCode=" + this.verificationCode + ")";
    }

    public /* synthetic */ SrpMigrationBadRequest(int i10, List list, List list2, List list3, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.securityToken = null;
        } else {
            this.securityToken = list;
        }
        if ((i10 & 2) == 0) {
            this.verifier = null;
        } else {
            this.verifier = list2;
        }
        if ((i10 & 4) == 0) {
            this.verificationCode = null;
        } else {
            this.verificationCode = list3;
        }
    }

    public SrpMigrationBadRequest(List<String> list, List<String> list2, List<String> list3) {
        this.securityToken = list;
        this.verifier = list2;
        this.verificationCode = list3;
    }

    public /* synthetic */ SrpMigrationBadRequest(List list, List list2, List list3, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2, (i10 & 4) != 0 ? null : list3);
    }
}

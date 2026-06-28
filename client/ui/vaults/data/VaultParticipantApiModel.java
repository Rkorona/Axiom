package com.server.auditor.ssh.client.ui.vaults.data;

import com.server.auditor.ssh.client.ui.vaults.data.VaultParticipantApiModel;
import hv.e0;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import ju.k;
import ju.t;
import jv.f;
import kv.c;
import kv.d;
import kv.e;
import lv.d2;
import lv.h1;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class VaultParticipantApiModel {
    public static final int $stable = 0;
    private final VaultMemberRole role;
    private final String userEmail;
    private final String userFullName;
    private final long userId;
    private final long vaultId;
    private final long vaultUserId;
    public static final b Companion = new b(null);
    private static final n[] $childSerializers = {null, null, null, null, null, o.b(r.f82638b, new iu.a() { // from class: op.k
        @Override // iu.a
        public final Object a() {
            return VaultParticipantApiModel._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41425b;
        private static final f descriptor;

        static {
            a aVar = new a();
            f41424a = aVar;
            i2 i2Var = new i2("com.server.auditor.ssh.client.ui.vaults.data.VaultParticipantApiModel", aVar, 6);
            i2Var.r("id", false);
            i2Var.r("vault_id", false);
            i2Var.r("user_id", false);
            i2Var.r("email", false);
            i2Var.r("full_name", true);
            i2Var.r("role", false);
            descriptor = i2Var;
            f41425b = 8;
        }

        private a() {
        }

        @Override // hv.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VaultParticipantApiModel deserialize(e eVar) {
            int i10;
            String str;
            long j10;
            String str2;
            VaultMemberRole vaultMemberRole;
            long j11;
            long j12;
            t.f(eVar, "decoder");
            f fVar = descriptor;
            c cVarD = eVar.d(fVar);
            n[] nVarArr = VaultParticipantApiModel.$childSerializers;
            String strB = null;
            if (cVarD.l()) {
                long jO = cVarD.o(fVar, 0);
                long jO2 = cVarD.o(fVar, 1);
                long jO3 = cVarD.o(fVar, 2);
                String strB2 = cVarD.B(fVar, 3);
                String str3 = (String) cVarD.v(fVar, 4, x2.f64817a, null);
                vaultMemberRole = (VaultMemberRole) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                str = strB2;
                str2 = str3;
                i10 = 63;
                j10 = jO2;
                j11 = jO;
                j12 = jO3;
            } else {
                long jO4 = 0;
                boolean z10 = true;
                int i11 = 0;
                String str4 = null;
                VaultMemberRole vaultMemberRole2 = null;
                long jO5 = 0;
                long jO6 = 0;
                while (z10) {
                    int iD = cVarD.D(fVar);
                    switch (iD) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            jO5 = cVarD.o(fVar, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            jO4 = cVarD.o(fVar, 1);
                            i11 |= 2;
                            break;
                        case 2:
                            jO6 = cVarD.o(fVar, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            strB = cVarD.B(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            str4 = (String) cVarD.v(fVar, 4, x2.f64817a, str4);
                            i11 |= 16;
                            break;
                        case 5:
                            vaultMemberRole2 = (VaultMemberRole) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), vaultMemberRole2);
                            i11 |= 32;
                            break;
                        default:
                            throw new e0(iD);
                    }
                }
                i10 = i11;
                str = strB;
                j10 = jO4;
                str2 = str4;
                vaultMemberRole = vaultMemberRole2;
                j11 = jO5;
                j12 = jO6;
            }
            cVarD.b(fVar);
            return new VaultParticipantApiModel(i10, j11, j10, j12, str, str2, vaultMemberRole, (s2) null);
        }

        @Override // hv.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(kv.f fVar, VaultParticipantApiModel vaultParticipantApiModel) {
            t.f(fVar, "encoder");
            t.f(vaultParticipantApiModel, SerializableEvent.VALUE_FIELD);
            f fVar2 = descriptor;
            d dVarD = fVar.d(fVar2);
            VaultParticipantApiModel.write$Self$Termius_app_googleProductionRelease(vaultParticipantApiModel, dVarD, fVar2);
            dVarD.b(fVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lv.n0
        public final hv.c[] childSerializers() {
            n[] nVarArr = VaultParticipantApiModel.$childSerializers;
            h1 h1Var = h1.f64699a;
            x2 x2Var = x2.f64817a;
            return new hv.c[]{h1Var, h1Var, h1Var, x2Var, iv.a.u(x2Var), nVarArr[5].getValue()};
        }

        @Override // hv.c, hv.r, hv.b
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // lv.n0
        public hv.c[] typeParametersSerializers() {
            return n0.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public final hv.c serializer() {
            return a.f41424a;
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public /* synthetic */ VaultParticipantApiModel(int i10, long j10, long j11, long j12, String str, String str2, VaultMemberRole vaultMemberRole, s2 s2Var) {
        if (47 != (i10 & 47)) {
            d2.a(i10, 47, a.f41424a.getDescriptor());
        }
        this.vaultUserId = j10;
        this.vaultId = j11;
        this.userId = j12;
        this.userEmail = str;
        if ((i10 & 16) == 0) {
            this.userFullName = null;
        } else {
            this.userFullName = str2;
        }
        this.role = vaultMemberRole;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
        return VaultMemberRole.Companion.serializer();
    }

    public static /* synthetic */ VaultParticipantApiModel copy$default(VaultParticipantApiModel vaultParticipantApiModel, long j10, long j11, long j12, String str, String str2, VaultMemberRole vaultMemberRole, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = vaultParticipantApiModel.vaultUserId;
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = vaultParticipantApiModel.vaultId;
        }
        return vaultParticipantApiModel.copy(j13, j11, (i10 & 4) != 0 ? vaultParticipantApiModel.userId : j12, (i10 & 8) != 0 ? vaultParticipantApiModel.userEmail : str, (i10 & 16) != 0 ? vaultParticipantApiModel.userFullName : str2, (i10 & 32) != 0 ? vaultParticipantApiModel.role : vaultMemberRole);
    }

    @hv.o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @hv.o("email")
    public static /* synthetic */ void getUserEmail$annotations() {
    }

    @hv.o("full_name")
    public static /* synthetic */ void getUserFullName$annotations() {
    }

    @hv.o("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @hv.o("vault_id")
    public static /* synthetic */ void getVaultId$annotations() {
    }

    @hv.o("id")
    public static /* synthetic */ void getVaultUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(VaultParticipantApiModel vaultParticipantApiModel, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.q(fVar, 0, vaultParticipantApiModel.vaultUserId);
        dVar.q(fVar, 1, vaultParticipantApiModel.vaultId);
        dVar.q(fVar, 2, vaultParticipantApiModel.userId);
        dVar.f(fVar, 3, vaultParticipantApiModel.userEmail);
        if (dVar.E(fVar, 4) || vaultParticipantApiModel.userFullName != null) {
            dVar.v(fVar, 4, x2.f64817a, vaultParticipantApiModel.userFullName);
        }
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), vaultParticipantApiModel.role);
    }

    public final long component1() {
        return this.vaultUserId;
    }

    public final long component2() {
        return this.vaultId;
    }

    public final long component3() {
        return this.userId;
    }

    public final String component4() {
        return this.userEmail;
    }

    public final String component5() {
        return this.userFullName;
    }

    public final VaultMemberRole component6() {
        return this.role;
    }

    public final VaultParticipantApiModel copy(long j10, long j11, long j12, String str, String str2, VaultMemberRole vaultMemberRole) {
        t.f(str, "userEmail");
        t.f(vaultMemberRole, "role");
        return new VaultParticipantApiModel(j10, j11, j12, str, str2, vaultMemberRole);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultParticipantApiModel)) {
            return false;
        }
        VaultParticipantApiModel vaultParticipantApiModel = (VaultParticipantApiModel) obj;
        return this.vaultUserId == vaultParticipantApiModel.vaultUserId && this.vaultId == vaultParticipantApiModel.vaultId && this.userId == vaultParticipantApiModel.userId && t.b(this.userEmail, vaultParticipantApiModel.userEmail) && t.b(this.userFullName, vaultParticipantApiModel.userFullName) && this.role == vaultParticipantApiModel.role;
    }

    public final VaultMemberRole getRole() {
        return this.role;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final String getUserFullName() {
        return this.userFullName;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getVaultId() {
        return this.vaultId;
    }

    public final long getVaultUserId() {
        return this.vaultUserId;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.vaultUserId) * 31) + Long.hashCode(this.vaultId)) * 31) + Long.hashCode(this.userId)) * 31) + this.userEmail.hashCode()) * 31;
        String str = this.userFullName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.role.hashCode();
    }

    public String toString() {
        return "VaultParticipantApiModel(vaultUserId=" + this.vaultUserId + ", vaultId=" + this.vaultId + ", userId=" + this.userId + ", userEmail=" + this.userEmail + ", userFullName=" + this.userFullName + ", role=" + this.role + ")";
    }

    public VaultParticipantApiModel(long j10, long j11, long j12, String str, String str2, VaultMemberRole vaultMemberRole) {
        t.f(str, "userEmail");
        t.f(vaultMemberRole, "role");
        this.vaultUserId = j10;
        this.vaultId = j11;
        this.userId = j12;
        this.userEmail = str;
        this.userFullName = str2;
        this.role = vaultMemberRole;
    }

    public /* synthetic */ VaultParticipantApiModel(long j10, long j11, long j12, String str, String str2, VaultMemberRole vaultMemberRole, int i10, k kVar) {
        this(j10, j11, j12, str, (i10 & 16) != 0 ? null : str2, vaultMemberRole);
    }
}

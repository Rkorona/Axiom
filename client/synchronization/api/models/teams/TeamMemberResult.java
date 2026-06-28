package com.server.auditor.ssh.client.synchronization.api.models.teams;

import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberResult;
import hv.c;
import hv.p;
import iu.a;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamMemberResult {
    public static final int $stable = 0;
    private final String email;
    private final String fullName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f39066id;
    private final boolean isAccessGranted;
    private final TeamMemberRole role;
    private final int userId;
    public static final Companion Companion = new Companion(null);
    private static final n[] $childSerializers = {null, null, null, null, null, o.b(r.f82638b, new a() { // from class: fn.d
        @Override // iu.a
        public final Object a() {
            return TeamMemberResult._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamMemberResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamMemberResult(int i10, int i11, int i12, String str, String str2, boolean z10, TeamMemberRole teamMemberRole, s2 s2Var) {
        if (63 != (i10 & 63)) {
            d2.a(i10, 63, TeamMemberResult$$serializer.INSTANCE.getDescriptor());
        }
        this.f39066id = i11;
        this.userId = i12;
        this.email = str;
        this.fullName = str2;
        this.isAccessGranted = z10;
        this.role = teamMemberRole;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return TeamMemberRole.Companion.serializer();
    }

    public static /* synthetic */ TeamMemberResult copy$default(TeamMemberResult teamMemberResult, int i10, int i11, String str, String str2, boolean z10, TeamMemberRole teamMemberRole, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = teamMemberResult.f39066id;
        }
        if ((i12 & 2) != 0) {
            i11 = teamMemberResult.userId;
        }
        if ((i12 & 4) != 0) {
            str = teamMemberResult.email;
        }
        if ((i12 & 8) != 0) {
            str2 = teamMemberResult.fullName;
        }
        if ((i12 & 16) != 0) {
            z10 = teamMemberResult.isAccessGranted;
        }
        if ((i12 & 32) != 0) {
            teamMemberRole = teamMemberResult.role;
        }
        boolean z11 = z10;
        TeamMemberRole teamMemberRole2 = teamMemberRole;
        return teamMemberResult.copy(i10, i11, str, str2, z11, teamMemberRole2);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @hv.o("full_name")
    public static /* synthetic */ void getFullName$annotations() {
    }

    @hv.o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @hv.o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @hv.o("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @hv.o("is_access_granted")
    public static /* synthetic */ void isAccessGranted$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamMemberResult teamMemberResult, d dVar, f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.t(fVar, 0, teamMemberResult.f39066id);
        dVar.t(fVar, 1, teamMemberResult.userId);
        dVar.f(fVar, 2, teamMemberResult.email);
        dVar.v(fVar, 3, x2.f64817a, teamMemberResult.fullName);
        dVar.u(fVar, 4, teamMemberResult.isAccessGranted);
        dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), teamMemberResult.role);
    }

    public final int component1() {
        return this.f39066id;
    }

    public final int component2() {
        return this.userId;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.fullName;
    }

    public final boolean component5() {
        return this.isAccessGranted;
    }

    public final TeamMemberRole component6() {
        return this.role;
    }

    public final TeamMemberResult copy(int i10, int i11, String str, String str2, boolean z10, TeamMemberRole teamMemberRole) {
        t.f(str, "email");
        t.f(teamMemberRole, "role");
        return new TeamMemberResult(i10, i11, str, str2, z10, teamMemberRole);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamMemberResult)) {
            return false;
        }
        TeamMemberResult teamMemberResult = (TeamMemberResult) obj;
        return this.f39066id == teamMemberResult.f39066id && this.userId == teamMemberResult.userId && t.b(this.email, teamMemberResult.email) && t.b(this.fullName, teamMemberResult.fullName) && this.isAccessGranted == teamMemberResult.isAccessGranted && this.role == teamMemberResult.role;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getId() {
        return this.f39066id;
    }

    public final TeamMemberRole getRole() {
        return this.role;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f39066id) * 31) + Integer.hashCode(this.userId)) * 31) + this.email.hashCode()) * 31;
        String str = this.fullName;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isAccessGranted)) * 31) + this.role.hashCode();
    }

    public final boolean isAccessGranted() {
        return this.isAccessGranted;
    }

    public String toString() {
        return "TeamMemberResult(id=" + this.f39066id + ", userId=" + this.userId + ", email=" + this.email + ", fullName=" + this.fullName + ", isAccessGranted=" + this.isAccessGranted + ", role=" + this.role + ")";
    }

    public TeamMemberResult(int i10, int i11, String str, String str2, boolean z10, TeamMemberRole teamMemberRole) {
        t.f(str, "email");
        t.f(teamMemberRole, "role");
        this.f39066id = i10;
        this.userId = i11;
        this.email = str;
        this.fullName = str2;
        this.isAccessGranted = z10;
        this.role = teamMemberRole;
    }
}

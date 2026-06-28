package com.server.auditor.ssh.client.synchronization.api.models.teams;

import com.server.auditor.ssh.client.synchronization.api.models.teams.InviteResult;
import hv.c;
import hv.p;
import iu.a;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class InviteResult {
    public static final int $stable = 0;
    private final String email;
    private final TeamMemberRole role;
    public static final Companion Companion = new Companion(null);
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: fn.a
        @Override // iu.a
        public final Object a() {
            return InviteResult._childSerializers$_anonymous_();
        }
    }), null};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return InviteResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ InviteResult(int i10, TeamMemberRole teamMemberRole, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, InviteResult$$serializer.INSTANCE.getDescriptor());
        }
        this.role = teamMemberRole;
        this.email = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return TeamMemberRole.Companion.serializer();
    }

    public static /* synthetic */ InviteResult copy$default(InviteResult inviteResult, TeamMemberRole teamMemberRole, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            teamMemberRole = inviteResult.role;
        }
        if ((i10 & 2) != 0) {
            str = inviteResult.email;
        }
        return inviteResult.copy(teamMemberRole, str);
    }

    @hv.o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @hv.o("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InviteResult inviteResult, d dVar, f fVar) {
        dVar.o(fVar, 0, (hv.r) $childSerializers[0].getValue(), inviteResult.role);
        dVar.f(fVar, 1, inviteResult.email);
    }

    public final TeamMemberRole component1() {
        return this.role;
    }

    public final String component2() {
        return this.email;
    }

    public final InviteResult copy(TeamMemberRole teamMemberRole, String str) {
        t.f(teamMemberRole, "role");
        t.f(str, "email");
        return new InviteResult(teamMemberRole, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteResult)) {
            return false;
        }
        InviteResult inviteResult = (InviteResult) obj;
        return this.role == inviteResult.role && t.b(this.email, inviteResult.email);
    }

    public final String getEmail() {
        return this.email;
    }

    public final TeamMemberRole getRole() {
        return this.role;
    }

    public int hashCode() {
        return (this.role.hashCode() * 31) + this.email.hashCode();
    }

    public String toString() {
        return "InviteResult(role=" + this.role + ", email=" + this.email + ")";
    }

    public InviteResult(TeamMemberRole teamMemberRole, String str) {
        t.f(teamMemberRole, "role");
        t.f(str, "email");
        this.role = teamMemberRole;
        this.email = str;
    }
}

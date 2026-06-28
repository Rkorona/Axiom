package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.p;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CreateTeamTrialRequest {
    private final List<TeamMemberInvite> invites;
    private final String teamName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, o.b(r.f82638b, new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.retrofit.a
        @Override // iu.a
        public final Object a() {
            return CreateTeamTrialRequest._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CreateTeamTrialRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CreateTeamTrialRequest(int i10, String str, List list, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, CreateTeamTrialRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.teamName = str;
        this.invites = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(TeamMemberInvite$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateTeamTrialRequest copy$default(CreateTeamTrialRequest createTeamTrialRequest, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createTeamTrialRequest.teamName;
        }
        if ((i10 & 2) != 0) {
            list = createTeamTrialRequest.invites;
        }
        return createTeamTrialRequest.copy(str, list);
    }

    @hv.o("invites")
    public static /* synthetic */ void getInvites$annotations() {
    }

    @hv.o("team_name")
    public static /* synthetic */ void getTeamName$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CreateTeamTrialRequest createTeamTrialRequest, d dVar, jv.f fVar) {
        n[] nVarArr = $childSerializers;
        dVar.f(fVar, 0, createTeamTrialRequest.teamName);
        dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), createTeamTrialRequest.invites);
    }

    public final String component1() {
        return this.teamName;
    }

    public final List<TeamMemberInvite> component2() {
        return this.invites;
    }

    public final CreateTeamTrialRequest copy(String str, List<TeamMemberInvite> list) {
        t.f(str, "teamName");
        t.f(list, "invites");
        return new CreateTeamTrialRequest(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateTeamTrialRequest)) {
            return false;
        }
        CreateTeamTrialRequest createTeamTrialRequest = (CreateTeamTrialRequest) obj;
        return t.b(this.teamName, createTeamTrialRequest.teamName) && t.b(this.invites, createTeamTrialRequest.invites);
    }

    public final List<TeamMemberInvite> getInvites() {
        return this.invites;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public int hashCode() {
        return (this.teamName.hashCode() * 31) + this.invites.hashCode();
    }

    public String toString() {
        return "CreateTeamTrialRequest(teamName=" + this.teamName + ", invites=" + this.invites + ")";
    }

    public CreateTeamTrialRequest(String str, List<TeamMemberInvite> list) {
        t.f(str, "teamName");
        t.f(list, "invites");
        this.teamName = str;
        this.invites = list;
    }
}

package com.server.auditor.ssh.client.synchronization.api.models.user;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CreateATeamResponse {
    private final AccountResponse account;
    private final TeamResponse team;
    private final TrialResponse trial;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CreateATeamResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public CreateATeamResponse() {
        this((TrialResponse) null, (AccountResponse) null, (TeamResponse) null, 7, (k) null);
    }

    public static /* synthetic */ CreateATeamResponse copy$default(CreateATeamResponse createATeamResponse, TrialResponse trialResponse, AccountResponse accountResponse, TeamResponse teamResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            trialResponse = createATeamResponse.trial;
        }
        if ((i10 & 2) != 0) {
            accountResponse = createATeamResponse.account;
        }
        if ((i10 & 4) != 0) {
            teamResponse = createATeamResponse.team;
        }
        return createATeamResponse.copy(trialResponse, accountResponse, teamResponse);
    }

    @o("account")
    public static /* synthetic */ void getAccount$annotations() {
    }

    @o("team")
    public static /* synthetic */ void getTeam$annotations() {
    }

    @o("trial")
    public static /* synthetic */ void getTrial$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(CreateATeamResponse createATeamResponse, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || createATeamResponse.trial != null) {
            dVar.v(fVar, 0, TrialResponse$$serializer.INSTANCE, createATeamResponse.trial);
        }
        if (dVar.E(fVar, 1) || createATeamResponse.account != null) {
            dVar.v(fVar, 1, AccountResponse$$serializer.INSTANCE, createATeamResponse.account);
        }
        if (!dVar.E(fVar, 2) && createATeamResponse.team == null) {
            return;
        }
        dVar.v(fVar, 2, TeamResponse$$serializer.INSTANCE, createATeamResponse.team);
    }

    public final TrialResponse component1() {
        return this.trial;
    }

    public final AccountResponse component2() {
        return this.account;
    }

    public final TeamResponse component3() {
        return this.team;
    }

    public final CreateATeamResponse copy(TrialResponse trialResponse, AccountResponse accountResponse, TeamResponse teamResponse) {
        return new CreateATeamResponse(trialResponse, accountResponse, teamResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateATeamResponse)) {
            return false;
        }
        CreateATeamResponse createATeamResponse = (CreateATeamResponse) obj;
        return t.b(this.trial, createATeamResponse.trial) && t.b(this.account, createATeamResponse.account) && t.b(this.team, createATeamResponse.team);
    }

    public final AccountResponse getAccount() {
        return this.account;
    }

    public final TeamResponse getTeam() {
        return this.team;
    }

    public final TrialResponse getTrial() {
        return this.trial;
    }

    public int hashCode() {
        TrialResponse trialResponse = this.trial;
        int iHashCode = (trialResponse == null ? 0 : trialResponse.hashCode()) * 31;
        AccountResponse accountResponse = this.account;
        int iHashCode2 = (iHashCode + (accountResponse == null ? 0 : accountResponse.hashCode())) * 31;
        TeamResponse teamResponse = this.team;
        return iHashCode2 + (teamResponse != null ? teamResponse.hashCode() : 0);
    }

    public String toString() {
        return "CreateATeamResponse(trial=" + this.trial + ", account=" + this.account + ", team=" + this.team + ")";
    }

    public /* synthetic */ CreateATeamResponse(int i10, TrialResponse trialResponse, AccountResponse accountResponse, TeamResponse teamResponse, s2 s2Var) {
        if ((i10 & 1) == 0) {
            this.trial = null;
        } else {
            this.trial = trialResponse;
        }
        if ((i10 & 2) == 0) {
            this.account = null;
        } else {
            this.account = accountResponse;
        }
        if ((i10 & 4) == 0) {
            this.team = null;
        } else {
            this.team = teamResponse;
        }
    }

    public CreateATeamResponse(TrialResponse trialResponse, AccountResponse accountResponse, TeamResponse teamResponse) {
        this.trial = trialResponse;
        this.account = accountResponse;
        this.team = teamResponse;
    }

    public /* synthetic */ CreateATeamResponse(TrialResponse trialResponse, AccountResponse accountResponse, TeamResponse teamResponse, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : trialResponse, (i10 & 2) != 0 ? null : accountResponse, (i10 & 4) != 0 ? null : teamResponse);
    }
}

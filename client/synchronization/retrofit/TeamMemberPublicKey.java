package com.server.auditor.ssh.client.synchronization.retrofit;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;
import lv.x2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamMemberPublicKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean hasTeamKey;
    private final String publicKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamMemberPublicKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamMemberPublicKey(int i10, String str, boolean z10, s2 s2Var) {
        if (2 != (i10 & 2)) {
            d2.a(i10, 2, TeamMemberPublicKey$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str;
        }
        this.hasTeamKey = z10;
    }

    public static /* synthetic */ TeamMemberPublicKey copy$default(TeamMemberPublicKey teamMemberPublicKey, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = teamMemberPublicKey.publicKey;
        }
        if ((i10 & 2) != 0) {
            z10 = teamMemberPublicKey.hasTeamKey;
        }
        return teamMemberPublicKey.copy(str, z10);
    }

    @o("has_team_key")
    public static /* synthetic */ void getHasTeamKey$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamMemberPublicKey teamMemberPublicKey, d dVar, f fVar) {
        if (dVar.E(fVar, 0) || teamMemberPublicKey.publicKey != null) {
            dVar.v(fVar, 0, x2.f64817a, teamMemberPublicKey.publicKey);
        }
        dVar.u(fVar, 1, teamMemberPublicKey.hasTeamKey);
    }

    public final String component1() {
        return this.publicKey;
    }

    public final boolean component2() {
        return this.hasTeamKey;
    }

    public final TeamMemberPublicKey copy(String str, boolean z10) {
        return new TeamMemberPublicKey(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamMemberPublicKey)) {
            return false;
        }
        TeamMemberPublicKey teamMemberPublicKey = (TeamMemberPublicKey) obj;
        return t.b(this.publicKey, teamMemberPublicKey.publicKey) && this.hasTeamKey == teamMemberPublicKey.hasTeamKey;
    }

    public final boolean getHasTeamKey() {
        return this.hasTeamKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.publicKey;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.hasTeamKey);
    }

    public String toString() {
        return "TeamMemberPublicKey(publicKey=" + this.publicKey + ", hasTeamKey=" + this.hasTeamKey + ")";
    }

    public TeamMemberPublicKey(String str, boolean z10) {
        this.publicKey = str;
        this.hasTeamKey = z10;
    }

    public /* synthetic */ TeamMemberPublicKey(String str, boolean z10, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, z10);
    }
}

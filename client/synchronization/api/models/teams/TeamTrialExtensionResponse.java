package com.server.auditor.ssh.client.synchronization.api.models.teams;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import jv.f;
import kv.d;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamTrialExtensionResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int extendedTimes;
    private final String validUntil;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamTrialExtensionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamTrialExtensionResponse(int i10, String str, int i11, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, TeamTrialExtensionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.validUntil = str;
        this.extendedTimes = i11;
    }

    public static /* synthetic */ TeamTrialExtensionResponse copy$default(TeamTrialExtensionResponse teamTrialExtensionResponse, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = teamTrialExtensionResponse.validUntil;
        }
        if ((i11 & 2) != 0) {
            i10 = teamTrialExtensionResponse.extendedTimes;
        }
        return teamTrialExtensionResponse.copy(str, i10);
    }

    @o("extended_times")
    public static /* synthetic */ void getExtendedTimes$annotations() {
    }

    @o("valid_until")
    public static /* synthetic */ void getValidUntil$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamTrialExtensionResponse teamTrialExtensionResponse, d dVar, f fVar) {
        dVar.f(fVar, 0, teamTrialExtensionResponse.validUntil);
        dVar.t(fVar, 1, teamTrialExtensionResponse.extendedTimes);
    }

    public final String component1() {
        return this.validUntil;
    }

    public final int component2() {
        return this.extendedTimes;
    }

    public final TeamTrialExtensionResponse copy(String str, int i10) {
        t.f(str, "validUntil");
        return new TeamTrialExtensionResponse(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamTrialExtensionResponse)) {
            return false;
        }
        TeamTrialExtensionResponse teamTrialExtensionResponse = (TeamTrialExtensionResponse) obj;
        return t.b(this.validUntil, teamTrialExtensionResponse.validUntil) && this.extendedTimes == teamTrialExtensionResponse.extendedTimes;
    }

    public final int getExtendedTimes() {
        return this.extendedTimes;
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        return (this.validUntil.hashCode() * 31) + Integer.hashCode(this.extendedTimes);
    }

    public String toString() {
        return "TeamTrialExtensionResponse(validUntil=" + this.validUntil + ", extendedTimes=" + this.extendedTimes + ")";
    }

    public TeamTrialExtensionResponse(String str, int i10) {
        t.f(str, "validUntil");
        this.validUntil = str;
        this.extendedTimes = i10;
    }
}

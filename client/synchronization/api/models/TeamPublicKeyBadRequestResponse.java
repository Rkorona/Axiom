package com.server.auditor.ssh.client.synchronization.api.models;

import com.server.auditor.ssh.client.synchronization.SyncConstants;
import hv.o;
import java.util.List;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamPublicKeyBadRequestResponse {
    public static final int $stable = 8;
    private final List<String> device;
    private final List<String> publicKey;
    private final List<String> team;

    public TeamPublicKeyBadRequestResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPublicKeyBadRequestResponse copy$default(TeamPublicKeyBadRequestResponse teamPublicKeyBadRequestResponse, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamPublicKeyBadRequestResponse.publicKey;
        }
        if ((i10 & 2) != 0) {
            list2 = teamPublicKeyBadRequestResponse.team;
        }
        if ((i10 & 4) != 0) {
            list3 = teamPublicKeyBadRequestResponse.device;
        }
        return teamPublicKeyBadRequestResponse.copy(list, list2, list3);
    }

    @o("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @o("team")
    public static /* synthetic */ void getTeam$annotations() {
    }

    public final List<String> component1() {
        return this.publicKey;
    }

    public final List<String> component2() {
        return this.team;
    }

    public final List<String> component3() {
        return this.device;
    }

    public final TeamPublicKeyBadRequestResponse copy(List<String> list, List<String> list2, List<String> list3) {
        return new TeamPublicKeyBadRequestResponse(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPublicKeyBadRequestResponse)) {
            return false;
        }
        TeamPublicKeyBadRequestResponse teamPublicKeyBadRequestResponse = (TeamPublicKeyBadRequestResponse) obj;
        return t.b(this.publicKey, teamPublicKeyBadRequestResponse.publicKey) && t.b(this.team, teamPublicKeyBadRequestResponse.team) && t.b(this.device, teamPublicKeyBadRequestResponse.device);
    }

    public final List<String> getDevice() {
        return this.device;
    }

    public final List<String> getPublicKey() {
        return this.publicKey;
    }

    public final List<String> getTeam() {
        return this.team;
    }

    public int hashCode() {
        List<String> list = this.publicKey;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.team;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.device;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "TeamPublicKeyBadRequestResponse(publicKey=" + this.publicKey + ", team=" + this.team + ", device=" + this.device + ")";
    }

    public TeamPublicKeyBadRequestResponse(List<String> list, List<String> list2, List<String> list3) {
        this.publicKey = list;
        this.team = list2;
        this.device = list3;
    }

    public /* synthetic */ TeamPublicKeyBadRequestResponse(List list, List list2, List list3, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2, (i10 & 4) != 0 ? null : list3);
    }
}

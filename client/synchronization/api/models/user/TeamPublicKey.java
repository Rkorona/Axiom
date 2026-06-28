package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
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
public final class TeamPublicKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long deviceId;
    private final String generatedAt;
    private final String publicKey;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamPublicKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamPublicKey(int i10, long j10, String str, String str2, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TeamPublicKey$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceId = j10;
        if ((i10 & 2) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str;
        }
        if ((i10 & 4) == 0) {
            this.generatedAt = null;
        } else {
            this.generatedAt = str2;
        }
    }

    public static /* synthetic */ TeamPublicKey copy$default(TeamPublicKey teamPublicKey, long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = teamPublicKey.deviceId;
        }
        if ((i10 & 2) != 0) {
            str = teamPublicKey.publicKey;
        }
        if ((i10 & 4) != 0) {
            str2 = teamPublicKey.generatedAt;
        }
        return teamPublicKey.copy(j10, str, str2);
    }

    @o(Column.DEVICE_ID)
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @o("generated_at")
    public static /* synthetic */ void getGeneratedAt$annotations() {
    }

    @o(SyncConstants.Bundle.PUBLIC_KEY)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamPublicKey teamPublicKey, d dVar, f fVar) {
        dVar.q(fVar, 0, teamPublicKey.deviceId);
        if (dVar.E(fVar, 1) || teamPublicKey.publicKey != null) {
            dVar.v(fVar, 1, x2.f64817a, teamPublicKey.publicKey);
        }
        if (!dVar.E(fVar, 2) && teamPublicKey.generatedAt == null) {
            return;
        }
        dVar.v(fVar, 2, x2.f64817a, teamPublicKey.generatedAt);
    }

    public final long component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final String component3() {
        return this.generatedAt;
    }

    public final TeamPublicKey copy(long j10, String str, String str2) {
        return new TeamPublicKey(j10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPublicKey)) {
            return false;
        }
        TeamPublicKey teamPublicKey = (TeamPublicKey) obj;
        return this.deviceId == teamPublicKey.deviceId && t.b(this.publicKey, teamPublicKey.publicKey) && t.b(this.generatedAt, teamPublicKey.generatedAt);
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final String getGeneratedAt() {
        return this.generatedAt;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.deviceId) * 31;
        String str = this.publicKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.generatedAt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TeamPublicKey(deviceId=" + this.deviceId + ", publicKey=" + this.publicKey + ", generatedAt=" + this.generatedAt + ")";
    }

    public TeamPublicKey(long j10, String str, String str2) {
        this.deviceId = j10;
        this.publicKey = str;
        this.generatedAt = str2;
    }

    public /* synthetic */ TeamPublicKey(long j10, String str, String str2, int i10, k kVar) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}

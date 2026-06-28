package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.database.Column;
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
public final class TeamPublicKeyDevice {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39069id;
    private final String name;
    private final String osVersion;
    private final long userId;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamPublicKeyDevice$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamPublicKeyDevice(int i10, long j10, String str, String str2, long j11, s2 s2Var) {
        if (15 != (i10 & 15)) {
            d2.a(i10, 15, TeamPublicKeyDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.f39069id = j10;
        this.name = str;
        this.osVersion = str2;
        this.userId = j11;
    }

    public static /* synthetic */ TeamPublicKeyDevice copy$default(TeamPublicKeyDevice teamPublicKeyDevice, long j10, String str, String str2, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = teamPublicKeyDevice.f39069id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = teamPublicKeyDevice.name;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = teamPublicKeyDevice.osVersion;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j11 = teamPublicKeyDevice.userId;
        }
        return teamPublicKeyDevice.copy(j12, str3, str4, j11);
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @o(Column.MULTI_KEY_NAME)
    public static /* synthetic */ void getName$annotations() {
    }

    @o("os_version")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @o("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamPublicKeyDevice teamPublicKeyDevice, d dVar, f fVar) {
        dVar.q(fVar, 0, teamPublicKeyDevice.f39069id);
        dVar.f(fVar, 1, teamPublicKeyDevice.name);
        dVar.f(fVar, 2, teamPublicKeyDevice.osVersion);
        dVar.q(fVar, 3, teamPublicKeyDevice.userId);
    }

    public final long component1() {
        return this.f39069id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.osVersion;
    }

    public final long component4() {
        return this.userId;
    }

    public final TeamPublicKeyDevice copy(long j10, String str, String str2, long j11) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "osVersion");
        return new TeamPublicKeyDevice(j10, str, str2, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPublicKeyDevice)) {
            return false;
        }
        TeamPublicKeyDevice teamPublicKeyDevice = (TeamPublicKeyDevice) obj;
        return this.f39069id == teamPublicKeyDevice.f39069id && t.b(this.name, teamPublicKeyDevice.name) && t.b(this.osVersion, teamPublicKeyDevice.osVersion) && this.userId == teamPublicKeyDevice.userId;
    }

    public final long getId() {
        return this.f39069id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f39069id) * 31) + this.name.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + Long.hashCode(this.userId);
    }

    public String toString() {
        return "TeamPublicKeyDevice(id=" + this.f39069id + ", name=" + this.name + ", osVersion=" + this.osVersion + ", userId=" + this.userId + ")";
    }

    public TeamPublicKeyDevice(long j10, String str, String str2, long j11) {
        t.f(str, Column.MULTI_KEY_NAME);
        t.f(str2, "osVersion");
        this.f39069id = j10;
        this.name = str;
        this.osVersion = str2;
        this.userId = j11;
    }
}

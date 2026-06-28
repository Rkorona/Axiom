package com.server.auditor.ssh.client.synchronization.api.models.user;

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
public final class TeamPublicKeyUser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f39070id;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamPublicKeyUser$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamPublicKeyUser(int i10, long j10, String str, s2 s2Var) {
        if (3 != (i10 & 3)) {
            d2.a(i10, 3, TeamPublicKeyUser$$serializer.INSTANCE.getDescriptor());
        }
        this.f39070id = j10;
        this.email = str;
    }

    public static /* synthetic */ TeamPublicKeyUser copy$default(TeamPublicKeyUser teamPublicKeyUser, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = teamPublicKeyUser.f39070id;
        }
        if ((i10 & 2) != 0) {
            str = teamPublicKeyUser.email;
        }
        return teamPublicKeyUser.copy(j10, str);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @o("id")
    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamPublicKeyUser teamPublicKeyUser, d dVar, f fVar) {
        dVar.q(fVar, 0, teamPublicKeyUser.f39070id);
        dVar.f(fVar, 1, teamPublicKeyUser.email);
    }

    public final long component1() {
        return this.f39070id;
    }

    public final String component2() {
        return this.email;
    }

    public final TeamPublicKeyUser copy(long j10, String str) {
        t.f(str, "email");
        return new TeamPublicKeyUser(j10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPublicKeyUser)) {
            return false;
        }
        TeamPublicKeyUser teamPublicKeyUser = (TeamPublicKeyUser) obj;
        return this.f39070id == teamPublicKeyUser.f39070id && t.b(this.email, teamPublicKeyUser.email);
    }

    public final String getEmail() {
        return this.email;
    }

    public final long getId() {
        return this.f39070id;
    }

    public int hashCode() {
        return (Long.hashCode(this.f39070id) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "TeamPublicKeyUser(id=" + this.f39070id + ", email=" + this.email + ")";
    }

    public TeamPublicKeyUser(long j10, String str) {
        t.f(str, "email");
        this.f39070id = j10;
        this.email = str;
    }
}

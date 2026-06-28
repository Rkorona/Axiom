package com.server.auditor.ssh.client.synchronization.retrofit;

import hv.c;
import hv.o;
import hv.p;
import ju.k;
import ju.t;
import lv.d2;
import lv.s2;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class TeamMemberInvite {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return TeamMemberInvite$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ TeamMemberInvite(int i10, String str, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, TeamMemberInvite$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
    }

    public static /* synthetic */ TeamMemberInvite copy$default(TeamMemberInvite teamMemberInvite, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = teamMemberInvite.email;
        }
        return teamMemberInvite.copy(str);
    }

    @o("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    public final String component1() {
        return this.email;
    }

    public final TeamMemberInvite copy(String str) {
        t.f(str, "email");
        return new TeamMemberInvite(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TeamMemberInvite) && t.b(this.email, ((TeamMemberInvite) obj).email);
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        return "TeamMemberInvite(email=" + this.email + ")";
    }

    public TeamMemberInvite(String str) {
        t.f(str, "email");
        this.email = str;
    }
}

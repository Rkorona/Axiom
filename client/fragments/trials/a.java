package com.server.auditor.ssh.client.fragments.trials;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.trials.a$a, reason: collision with other inner class name */
    public static class C0425a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26962a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26962a.containsKey("isNeedCreateTeam")) {
                bundle.putBoolean("isNeedCreateTeam", ((Boolean) this.f26962a.get("isNeedCreateTeam")).booleanValue());
            }
            if (this.f26962a.containsKey("invites")) {
                bundle.putParcelableArray("invites", (TeamMemberInvitation[]) this.f26962a.get("invites"));
            }
            if (this.f26962a.containsKey("isNeedShowSuccessScreen")) {
                bundle.putBoolean("isNeedShowSuccessScreen", ((Boolean) this.f26962a.get("isNeedShowSuccessScreen")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_endOfTrialInviteColleaguesScreen_to_endOfTrialCreateTeamTrialProgressScreen;
        }

        public TeamMemberInvitation[] c() {
            return (TeamMemberInvitation[]) this.f26962a.get("invites");
        }

        public boolean d() {
            return ((Boolean) this.f26962a.get("isNeedCreateTeam")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f26962a.get("isNeedShowSuccessScreen")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0425a c0425a = (C0425a) obj;
            if (this.f26962a.containsKey("isNeedCreateTeam") != c0425a.f26962a.containsKey("isNeedCreateTeam") || d() != c0425a.d() || this.f26962a.containsKey("invites") != c0425a.f26962a.containsKey("invites")) {
                return false;
            }
            if (c() == null ? c0425a.c() == null : c().equals(c0425a.c())) {
                return this.f26962a.containsKey("isNeedShowSuccessScreen") == c0425a.f26962a.containsKey("isNeedShowSuccessScreen") && e() == c0425a.e() && b() == c0425a.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((((d() ? 1 : 0) + 31) * 31) + Arrays.hashCode(c())) * 31) + (e() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialInviteColleaguesScreenToEndOfTrialCreateTeamTrialProgressScreen(actionId=" + b() + "){isNeedCreateTeam=" + d() + ", invites=" + c() + ", isNeedShowSuccessScreen=" + e() + "}";
        }

        private C0425a(boolean z10, TeamMemberInvitation[] teamMemberInvitationArr, boolean z11) {
            HashMap map = new HashMap();
            this.f26962a = map;
            map.put("isNeedCreateTeam", Boolean.valueOf(z10));
            if (teamMemberInvitationArr == null) {
                throw new IllegalArgumentException("Argument \"invites\" is marked as non-null but was passed a null value.");
            }
            map.put("invites", teamMemberInvitationArr);
            map.put("isNeedShowSuccessScreen", Boolean.valueOf(z11));
        }
    }

    public static C0425a a(boolean z10, TeamMemberInvitation[] teamMemberInvitationArr, boolean z11) {
        return new C0425a(z10, teamMemberInvitationArr, z11);
    }
}

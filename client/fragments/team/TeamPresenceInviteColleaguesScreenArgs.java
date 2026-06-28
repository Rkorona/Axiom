package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TeamPresenceInviteColleaguesScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26625a;

        public a(boolean z10) {
            HashMap map = new HashMap();
            this.f26625a = map;
            map.put("isNeedShowTeamVaultPromotion", Boolean.valueOf(z10));
        }

        public TeamPresenceInviteColleaguesScreenArgs a() {
            return new TeamPresenceInviteColleaguesScreenArgs(this.f26625a);
        }
    }

    public static TeamPresenceInviteColleaguesScreenArgs fromBundle(Bundle bundle) {
        TeamPresenceInviteColleaguesScreenArgs teamPresenceInviteColleaguesScreenArgs = new TeamPresenceInviteColleaguesScreenArgs();
        bundle.setClassLoader(TeamPresenceInviteColleaguesScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("isNeedShowTeamVaultPromotion")) {
            throw new IllegalArgumentException("Required argument \"isNeedShowTeamVaultPromotion\" is missing and does not have an android:defaultValue");
        }
        teamPresenceInviteColleaguesScreenArgs.arguments.put("isNeedShowTeamVaultPromotion", Boolean.valueOf(bundle.getBoolean("isNeedShowTeamVaultPromotion")));
        return teamPresenceInviteColleaguesScreenArgs;
    }

    public static TeamPresenceInviteColleaguesScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamPresenceInviteColleaguesScreenArgs teamPresenceInviteColleaguesScreenArgs = new TeamPresenceInviteColleaguesScreenArgs();
        if (!u0Var.b("isNeedShowTeamVaultPromotion")) {
            throw new IllegalArgumentException("Required argument \"isNeedShowTeamVaultPromotion\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isNeedShowTeamVaultPromotion");
        bool.booleanValue();
        teamPresenceInviteColleaguesScreenArgs.arguments.put("isNeedShowTeamVaultPromotion", bool);
        return teamPresenceInviteColleaguesScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamPresenceInviteColleaguesScreenArgs teamPresenceInviteColleaguesScreenArgs = (TeamPresenceInviteColleaguesScreenArgs) obj;
        return this.arguments.containsKey("isNeedShowTeamVaultPromotion") == teamPresenceInviteColleaguesScreenArgs.arguments.containsKey("isNeedShowTeamVaultPromotion") && getIsNeedShowTeamVaultPromotion() == teamPresenceInviteColleaguesScreenArgs.getIsNeedShowTeamVaultPromotion();
    }

    public boolean getIsNeedShowTeamVaultPromotion() {
        return ((Boolean) this.arguments.get("isNeedShowTeamVaultPromotion")).booleanValue();
    }

    public int hashCode() {
        return 31 + (getIsNeedShowTeamVaultPromotion() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isNeedShowTeamVaultPromotion")) {
            bundle.putBoolean("isNeedShowTeamVaultPromotion", ((Boolean) this.arguments.get("isNeedShowTeamVaultPromotion")).booleanValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("isNeedShowTeamVaultPromotion")) {
            Boolean bool = (Boolean) this.arguments.get("isNeedShowTeamVaultPromotion");
            bool.booleanValue();
            u0Var.h("isNeedShowTeamVaultPromotion", bool);
        }
        return u0Var;
    }

    public String toString() {
        return "TeamPresenceInviteColleaguesScreenArgs{isNeedShowTeamVaultPromotion=" + getIsNeedShowTeamVaultPromotion() + "}";
    }

    private TeamPresenceInviteColleaguesScreenArgs() {
        this.arguments = new HashMap();
    }

    private TeamPresenceInviteColleaguesScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

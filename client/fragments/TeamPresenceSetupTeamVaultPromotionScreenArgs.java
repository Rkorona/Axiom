package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.lifecycle.u0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TeamPresenceSetupTeamVaultPromotionScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private TeamPresenceSetupTeamVaultPromotionScreenArgs() {
        this.arguments = new HashMap();
    }

    public static TeamPresenceSetupTeamVaultPromotionScreenArgs fromBundle(Bundle bundle) {
        TeamPresenceSetupTeamVaultPromotionScreenArgs teamPresenceSetupTeamVaultPromotionScreenArgs = new TeamPresenceSetupTeamVaultPromotionScreenArgs();
        bundle.setClassLoader(TeamPresenceSetupTeamVaultPromotionScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        teamPresenceSetupTeamVaultPromotionScreenArgs.arguments.put("invitedColleaguesCount", Integer.valueOf(bundle.getInt("invitedColleaguesCount")));
        return teamPresenceSetupTeamVaultPromotionScreenArgs;
    }

    public static TeamPresenceSetupTeamVaultPromotionScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamPresenceSetupTeamVaultPromotionScreenArgs teamPresenceSetupTeamVaultPromotionScreenArgs = new TeamPresenceSetupTeamVaultPromotionScreenArgs();
        if (!u0Var.b("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("invitedColleaguesCount");
        num.intValue();
        teamPresenceSetupTeamVaultPromotionScreenArgs.arguments.put("invitedColleaguesCount", num);
        return teamPresenceSetupTeamVaultPromotionScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamPresenceSetupTeamVaultPromotionScreenArgs teamPresenceSetupTeamVaultPromotionScreenArgs = (TeamPresenceSetupTeamVaultPromotionScreenArgs) obj;
        return this.arguments.containsKey("invitedColleaguesCount") == teamPresenceSetupTeamVaultPromotionScreenArgs.arguments.containsKey("invitedColleaguesCount") && getInvitedColleaguesCount() == teamPresenceSetupTeamVaultPromotionScreenArgs.getInvitedColleaguesCount();
    }

    public int getInvitedColleaguesCount() {
        return ((Integer) this.arguments.get("invitedColleaguesCount")).intValue();
    }

    public int hashCode() {
        return 31 + getInvitedColleaguesCount();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            bundle.putInt("invitedColleaguesCount", ((Integer) this.arguments.get("invitedColleaguesCount")).intValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            Integer num = (Integer) this.arguments.get("invitedColleaguesCount");
            num.intValue();
            u0Var.h("invitedColleaguesCount", num);
        }
        return u0Var;
    }

    public String toString() {
        return "TeamPresenceSetupTeamVaultPromotionScreenArgs{invitedColleaguesCount=" + getInvitedColleaguesCount() + "}";
    }

    private TeamPresenceSetupTeamVaultPromotionScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

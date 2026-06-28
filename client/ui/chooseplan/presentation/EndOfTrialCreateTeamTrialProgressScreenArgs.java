package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class EndOfTrialCreateTeamTrialProgressScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private EndOfTrialCreateTeamTrialProgressScreenArgs() {
        this.arguments = new HashMap();
    }

    public static EndOfTrialCreateTeamTrialProgressScreenArgs fromBundle(Bundle bundle) {
        TeamMemberInvitation[] teamMemberInvitationArr;
        EndOfTrialCreateTeamTrialProgressScreenArgs endOfTrialCreateTeamTrialProgressScreenArgs = new EndOfTrialCreateTeamTrialProgressScreenArgs();
        bundle.setClassLoader(EndOfTrialCreateTeamTrialProgressScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("isNeedCreateTeam")) {
            throw new IllegalArgumentException("Required argument \"isNeedCreateTeam\" is missing and does not have an android:defaultValue");
        }
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("isNeedCreateTeam", Boolean.valueOf(bundle.getBoolean("isNeedCreateTeam")));
        if (!bundle.containsKey("invites")) {
            throw new IllegalArgumentException("Required argument \"invites\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("invites");
        if (parcelableArray != null) {
            teamMemberInvitationArr = new TeamMemberInvitation[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, teamMemberInvitationArr, 0, parcelableArray.length);
        } else {
            teamMemberInvitationArr = null;
        }
        if (teamMemberInvitationArr == null) {
            throw new IllegalArgumentException("Argument \"invites\" is marked as non-null but was passed a null value.");
        }
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("invites", teamMemberInvitationArr);
        if (!bundle.containsKey("isNeedShowSuccessScreen")) {
            throw new IllegalArgumentException("Required argument \"isNeedShowSuccessScreen\" is missing and does not have an android:defaultValue");
        }
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("isNeedShowSuccessScreen", Boolean.valueOf(bundle.getBoolean("isNeedShowSuccessScreen")));
        return endOfTrialCreateTeamTrialProgressScreenArgs;
    }

    public static EndOfTrialCreateTeamTrialProgressScreenArgs fromSavedStateHandle(u0 u0Var) {
        EndOfTrialCreateTeamTrialProgressScreenArgs endOfTrialCreateTeamTrialProgressScreenArgs = new EndOfTrialCreateTeamTrialProgressScreenArgs();
        if (!u0Var.b("isNeedCreateTeam")) {
            throw new IllegalArgumentException("Required argument \"isNeedCreateTeam\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isNeedCreateTeam");
        bool.booleanValue();
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("isNeedCreateTeam", bool);
        if (!u0Var.b("invites")) {
            throw new IllegalArgumentException("Required argument \"invites\" is missing and does not have an android:defaultValue");
        }
        TeamMemberInvitation[] teamMemberInvitationArr = (TeamMemberInvitation[]) u0Var.c("invites");
        if (teamMemberInvitationArr == null) {
            throw new IllegalArgumentException("Argument \"invites\" is marked as non-null but was passed a null value.");
        }
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("invites", teamMemberInvitationArr);
        if (!u0Var.b("isNeedShowSuccessScreen")) {
            throw new IllegalArgumentException("Required argument \"isNeedShowSuccessScreen\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("isNeedShowSuccessScreen");
        bool2.booleanValue();
        endOfTrialCreateTeamTrialProgressScreenArgs.arguments.put("isNeedShowSuccessScreen", bool2);
        return endOfTrialCreateTeamTrialProgressScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndOfTrialCreateTeamTrialProgressScreenArgs endOfTrialCreateTeamTrialProgressScreenArgs = (EndOfTrialCreateTeamTrialProgressScreenArgs) obj;
        if (this.arguments.containsKey("isNeedCreateTeam") != endOfTrialCreateTeamTrialProgressScreenArgs.arguments.containsKey("isNeedCreateTeam") || getIsNeedCreateTeam() != endOfTrialCreateTeamTrialProgressScreenArgs.getIsNeedCreateTeam() || this.arguments.containsKey("invites") != endOfTrialCreateTeamTrialProgressScreenArgs.arguments.containsKey("invites")) {
            return false;
        }
        if (getInvites() == null ? endOfTrialCreateTeamTrialProgressScreenArgs.getInvites() == null : getInvites().equals(endOfTrialCreateTeamTrialProgressScreenArgs.getInvites())) {
            return this.arguments.containsKey("isNeedShowSuccessScreen") == endOfTrialCreateTeamTrialProgressScreenArgs.arguments.containsKey("isNeedShowSuccessScreen") && getIsNeedShowSuccessScreen() == endOfTrialCreateTeamTrialProgressScreenArgs.getIsNeedShowSuccessScreen();
        }
        return false;
    }

    public TeamMemberInvitation[] getInvites() {
        return (TeamMemberInvitation[]) this.arguments.get("invites");
    }

    public boolean getIsNeedCreateTeam() {
        return ((Boolean) this.arguments.get("isNeedCreateTeam")).booleanValue();
    }

    public boolean getIsNeedShowSuccessScreen() {
        return ((Boolean) this.arguments.get("isNeedShowSuccessScreen")).booleanValue();
    }

    public int hashCode() {
        return (((((getIsNeedCreateTeam() ? 1 : 0) + 31) * 31) + Arrays.hashCode(getInvites())) * 31) + (getIsNeedShowSuccessScreen() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isNeedCreateTeam")) {
            bundle.putBoolean("isNeedCreateTeam", ((Boolean) this.arguments.get("isNeedCreateTeam")).booleanValue());
        }
        if (this.arguments.containsKey("invites")) {
            bundle.putParcelableArray("invites", (TeamMemberInvitation[]) this.arguments.get("invites"));
        }
        if (this.arguments.containsKey("isNeedShowSuccessScreen")) {
            bundle.putBoolean("isNeedShowSuccessScreen", ((Boolean) this.arguments.get("isNeedShowSuccessScreen")).booleanValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("isNeedCreateTeam")) {
            Boolean bool = (Boolean) this.arguments.get("isNeedCreateTeam");
            bool.booleanValue();
            u0Var.h("isNeedCreateTeam", bool);
        }
        if (this.arguments.containsKey("invites")) {
            u0Var.h("invites", (TeamMemberInvitation[]) this.arguments.get("invites"));
        }
        if (this.arguments.containsKey("isNeedShowSuccessScreen")) {
            Boolean bool2 = (Boolean) this.arguments.get("isNeedShowSuccessScreen");
            bool2.booleanValue();
            u0Var.h("isNeedShowSuccessScreen", bool2);
        }
        return u0Var;
    }

    public String toString() {
        return "EndOfTrialCreateTeamTrialProgressScreenArgs{isNeedCreateTeam=" + getIsNeedCreateTeam() + ", invites=" + getInvites() + ", isNeedShowSuccessScreen=" + getIsNeedShowSuccessScreen() + "}";
    }

    private EndOfTrialCreateTeamTrialProgressScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

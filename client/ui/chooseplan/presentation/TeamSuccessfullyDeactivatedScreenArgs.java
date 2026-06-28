package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TeamSuccessfullyDeactivatedScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private TeamSuccessfullyDeactivatedScreenArgs() {
        this.arguments = new HashMap();
    }

    public static TeamSuccessfullyDeactivatedScreenArgs fromBundle(Bundle bundle) {
        TeamSuccessfullyDeactivatedScreenArgs teamSuccessfullyDeactivatedScreenArgs = new TeamSuccessfullyDeactivatedScreenArgs();
        bundle.setClassLoader(TeamSuccessfullyDeactivatedScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("endOfTeamTrialTargetAction")) {
            throw new IllegalArgumentException("Required argument \"endOfTeamTrialTargetAction\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class) && !Serializable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class)) {
            throw new UnsupportedOperationException(EndOfTeamTrialTargetAction.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) bundle.get("endOfTeamTrialTargetAction");
        if (endOfTeamTrialTargetAction == null) {
            throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
        }
        teamSuccessfullyDeactivatedScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return teamSuccessfullyDeactivatedScreenArgs;
    }

    public static TeamSuccessfullyDeactivatedScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamSuccessfullyDeactivatedScreenArgs teamSuccessfullyDeactivatedScreenArgs = new TeamSuccessfullyDeactivatedScreenArgs();
        if (!u0Var.b("endOfTeamTrialTargetAction")) {
            throw new IllegalArgumentException("Required argument \"endOfTeamTrialTargetAction\" is missing and does not have an android:defaultValue");
        }
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) u0Var.c("endOfTeamTrialTargetAction");
        if (endOfTeamTrialTargetAction == null) {
            throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
        }
        teamSuccessfullyDeactivatedScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return teamSuccessfullyDeactivatedScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamSuccessfullyDeactivatedScreenArgs teamSuccessfullyDeactivatedScreenArgs = (TeamSuccessfullyDeactivatedScreenArgs) obj;
        if (this.arguments.containsKey("endOfTeamTrialTargetAction") != teamSuccessfullyDeactivatedScreenArgs.arguments.containsKey("endOfTeamTrialTargetAction")) {
            return false;
        }
        return getEndOfTeamTrialTargetAction() == null ? teamSuccessfullyDeactivatedScreenArgs.getEndOfTeamTrialTargetAction() == null : getEndOfTeamTrialTargetAction().equals(teamSuccessfullyDeactivatedScreenArgs.getEndOfTeamTrialTargetAction());
    }

    public EndOfTeamTrialTargetAction getEndOfTeamTrialTargetAction() {
        return (EndOfTeamTrialTargetAction) this.arguments.get("endOfTeamTrialTargetAction");
    }

    public int hashCode() {
        return 31 + (getEndOfTeamTrialTargetAction() != null ? getEndOfTeamTrialTargetAction().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("endOfTeamTrialTargetAction")) {
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.arguments.get("endOfTeamTrialTargetAction");
            if (!Parcelable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class) && endOfTeamTrialTargetAction != null) {
                if (Serializable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class)) {
                    bundle.putSerializable("endOfTeamTrialTargetAction", (Serializable) Serializable.class.cast(endOfTeamTrialTargetAction));
                    return bundle;
                }
                throw new UnsupportedOperationException(EndOfTeamTrialTargetAction.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("endOfTeamTrialTargetAction", (Parcelable) Parcelable.class.cast(endOfTeamTrialTargetAction));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("endOfTeamTrialTargetAction")) {
            EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) this.arguments.get("endOfTeamTrialTargetAction");
            if (!Parcelable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class) && endOfTeamTrialTargetAction != null) {
                if (Serializable.class.isAssignableFrom(EndOfTeamTrialTargetAction.class)) {
                    u0Var.h("endOfTeamTrialTargetAction", (Serializable) Serializable.class.cast(endOfTeamTrialTargetAction));
                    return u0Var;
                }
                throw new UnsupportedOperationException(EndOfTeamTrialTargetAction.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("endOfTeamTrialTargetAction", (Parcelable) Parcelable.class.cast(endOfTeamTrialTargetAction));
        }
        return u0Var;
    }

    public String toString() {
        return "TeamSuccessfullyDeactivatedScreenArgs{endOfTeamTrialTargetAction=" + getEndOfTeamTrialTargetAction() + "}";
    }

    private TeamSuccessfullyDeactivatedScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

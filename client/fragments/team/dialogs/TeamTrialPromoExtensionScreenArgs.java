package com.server.auditor.ssh.client.fragments.team.dialogs;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TeamTrialPromoExtensionScreenArgs implements w {
    private final HashMap arguments;

    private TeamTrialPromoExtensionScreenArgs() {
        this.arguments = new HashMap();
    }

    public static TeamTrialPromoExtensionScreenArgs fromBundle(Bundle bundle) {
        TeamTrialPromoExtensionScreenArgs teamTrialPromoExtensionScreenArgs = new TeamTrialPromoExtensionScreenArgs();
        bundle.setClassLoader(TeamTrialPromoExtensionScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("isPromoMode")) {
            throw new IllegalArgumentException("Required argument \"isPromoMode\" is missing and does not have an android:defaultValue");
        }
        teamTrialPromoExtensionScreenArgs.arguments.put("isPromoMode", Boolean.valueOf(bundle.getBoolean("isPromoMode")));
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
        teamTrialPromoExtensionScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return teamTrialPromoExtensionScreenArgs;
    }

    public static TeamTrialPromoExtensionScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamTrialPromoExtensionScreenArgs teamTrialPromoExtensionScreenArgs = new TeamTrialPromoExtensionScreenArgs();
        if (!u0Var.b("isPromoMode")) {
            throw new IllegalArgumentException("Required argument \"isPromoMode\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isPromoMode");
        bool.booleanValue();
        teamTrialPromoExtensionScreenArgs.arguments.put("isPromoMode", bool);
        if (!u0Var.b("endOfTeamTrialTargetAction")) {
            throw new IllegalArgumentException("Required argument \"endOfTeamTrialTargetAction\" is missing and does not have an android:defaultValue");
        }
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) u0Var.c("endOfTeamTrialTargetAction");
        if (endOfTeamTrialTargetAction == null) {
            throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
        }
        teamTrialPromoExtensionScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return teamTrialPromoExtensionScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamTrialPromoExtensionScreenArgs teamTrialPromoExtensionScreenArgs = (TeamTrialPromoExtensionScreenArgs) obj;
        if (this.arguments.containsKey("isPromoMode") == teamTrialPromoExtensionScreenArgs.arguments.containsKey("isPromoMode") && getIsPromoMode() == teamTrialPromoExtensionScreenArgs.getIsPromoMode() && this.arguments.containsKey("endOfTeamTrialTargetAction") == teamTrialPromoExtensionScreenArgs.arguments.containsKey("endOfTeamTrialTargetAction")) {
            return getEndOfTeamTrialTargetAction() == null ? teamTrialPromoExtensionScreenArgs.getEndOfTeamTrialTargetAction() == null : getEndOfTeamTrialTargetAction().equals(teamTrialPromoExtensionScreenArgs.getEndOfTeamTrialTargetAction());
        }
        return false;
    }

    public EndOfTeamTrialTargetAction getEndOfTeamTrialTargetAction() {
        return (EndOfTeamTrialTargetAction) this.arguments.get("endOfTeamTrialTargetAction");
    }

    public boolean getIsPromoMode() {
        return ((Boolean) this.arguments.get("isPromoMode")).booleanValue();
    }

    public int hashCode() {
        return (((getIsPromoMode() ? 1 : 0) + 31) * 31) + (getEndOfTeamTrialTargetAction() != null ? getEndOfTeamTrialTargetAction().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isPromoMode")) {
            bundle.putBoolean("isPromoMode", ((Boolean) this.arguments.get("isPromoMode")).booleanValue());
        }
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
        if (this.arguments.containsKey("isPromoMode")) {
            Boolean bool = (Boolean) this.arguments.get("isPromoMode");
            bool.booleanValue();
            u0Var.h("isPromoMode", bool);
        }
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
        return "TeamTrialPromoExtensionScreenArgs{isPromoMode=" + getIsPromoMode() + ", endOfTeamTrialTargetAction=" + getEndOfTeamTrialTargetAction() + "}";
    }

    private TeamTrialPromoExtensionScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

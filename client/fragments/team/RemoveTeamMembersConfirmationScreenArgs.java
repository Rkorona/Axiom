package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class RemoveTeamMembersConfirmationScreenArgs implements w {
    private final HashMap arguments;

    private RemoveTeamMembersConfirmationScreenArgs() {
        this.arguments = new HashMap();
    }

    public static RemoveTeamMembersConfirmationScreenArgs fromBundle(Bundle bundle) {
        RemoveTeamMembersConfirmationScreenArgs removeTeamMembersConfirmationScreenArgs = new RemoveTeamMembersConfirmationScreenArgs();
        bundle.setClassLoader(RemoveTeamMembersConfirmationScreenArgs.class.getClassLoader());
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
        removeTeamMembersConfirmationScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return removeTeamMembersConfirmationScreenArgs;
    }

    public static RemoveTeamMembersConfirmationScreenArgs fromSavedStateHandle(u0 u0Var) {
        RemoveTeamMembersConfirmationScreenArgs removeTeamMembersConfirmationScreenArgs = new RemoveTeamMembersConfirmationScreenArgs();
        if (!u0Var.b("endOfTeamTrialTargetAction")) {
            throw new IllegalArgumentException("Required argument \"endOfTeamTrialTargetAction\" is missing and does not have an android:defaultValue");
        }
        EndOfTeamTrialTargetAction endOfTeamTrialTargetAction = (EndOfTeamTrialTargetAction) u0Var.c("endOfTeamTrialTargetAction");
        if (endOfTeamTrialTargetAction == null) {
            throw new IllegalArgumentException("Argument \"endOfTeamTrialTargetAction\" is marked as non-null but was passed a null value.");
        }
        removeTeamMembersConfirmationScreenArgs.arguments.put("endOfTeamTrialTargetAction", endOfTeamTrialTargetAction);
        return removeTeamMembersConfirmationScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveTeamMembersConfirmationScreenArgs removeTeamMembersConfirmationScreenArgs = (RemoveTeamMembersConfirmationScreenArgs) obj;
        if (this.arguments.containsKey("endOfTeamTrialTargetAction") != removeTeamMembersConfirmationScreenArgs.arguments.containsKey("endOfTeamTrialTargetAction")) {
            return false;
        }
        return getEndOfTeamTrialTargetAction() == null ? removeTeamMembersConfirmationScreenArgs.getEndOfTeamTrialTargetAction() == null : getEndOfTeamTrialTargetAction().equals(removeTeamMembersConfirmationScreenArgs.getEndOfTeamTrialTargetAction());
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
        return "RemoveTeamMembersConfirmationScreenArgs{endOfTeamTrialTargetAction=" + getEndOfTeamTrialTargetAction() + "}";
    }

    private RemoveTeamMembersConfirmationScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

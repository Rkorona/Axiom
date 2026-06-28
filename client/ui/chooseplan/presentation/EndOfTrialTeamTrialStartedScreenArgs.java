package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class EndOfTrialTeamTrialStartedScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private EndOfTrialTeamTrialStartedScreenArgs() {
        this.arguments = new HashMap();
    }

    public static EndOfTrialTeamTrialStartedScreenArgs fromBundle(Bundle bundle) {
        EndOfTrialTeamTrialStartedScreenArgs endOfTrialTeamTrialStartedScreenArgs = new EndOfTrialTeamTrialStartedScreenArgs();
        bundle.setClassLoader(EndOfTrialTeamTrialStartedScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("grantedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"grantedUntilDate\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Calendar.class) && !Serializable.class.isAssignableFrom(Calendar.class)) {
            throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Calendar calendar = (Calendar) bundle.get("grantedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"grantedUntilDate\" is marked as non-null but was passed a null value.");
        }
        endOfTrialTeamTrialStartedScreenArgs.arguments.put("grantedUntilDate", calendar);
        return endOfTrialTeamTrialStartedScreenArgs;
    }

    public static EndOfTrialTeamTrialStartedScreenArgs fromSavedStateHandle(u0 u0Var) {
        EndOfTrialTeamTrialStartedScreenArgs endOfTrialTeamTrialStartedScreenArgs = new EndOfTrialTeamTrialStartedScreenArgs();
        if (!u0Var.b("grantedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"grantedUntilDate\" is missing and does not have an android:defaultValue");
        }
        Calendar calendar = (Calendar) u0Var.c("grantedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"grantedUntilDate\" is marked as non-null but was passed a null value.");
        }
        endOfTrialTeamTrialStartedScreenArgs.arguments.put("grantedUntilDate", calendar);
        return endOfTrialTeamTrialStartedScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndOfTrialTeamTrialStartedScreenArgs endOfTrialTeamTrialStartedScreenArgs = (EndOfTrialTeamTrialStartedScreenArgs) obj;
        if (this.arguments.containsKey("grantedUntilDate") != endOfTrialTeamTrialStartedScreenArgs.arguments.containsKey("grantedUntilDate")) {
            return false;
        }
        return getGrantedUntilDate() == null ? endOfTrialTeamTrialStartedScreenArgs.getGrantedUntilDate() == null : getGrantedUntilDate().equals(endOfTrialTeamTrialStartedScreenArgs.getGrantedUntilDate());
    }

    public Calendar getGrantedUntilDate() {
        return (Calendar) this.arguments.get("grantedUntilDate");
    }

    public int hashCode() {
        return 31 + (getGrantedUntilDate() != null ? getGrantedUntilDate().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("grantedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("grantedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    bundle.putSerializable("grantedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return bundle;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("grantedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("grantedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("grantedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    u0Var.h("grantedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return u0Var;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("grantedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return u0Var;
    }

    public String toString() {
        return "EndOfTrialTeamTrialStartedScreenArgs{grantedUntilDate=" + getGrantedUntilDate() + "}";
    }

    private EndOfTrialTeamTrialStartedScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

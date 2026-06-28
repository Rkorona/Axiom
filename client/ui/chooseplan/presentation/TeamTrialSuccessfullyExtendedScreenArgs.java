package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TeamTrialSuccessfullyExtendedScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private TeamTrialSuccessfullyExtendedScreenArgs() {
        this.arguments = new HashMap();
    }

    public static TeamTrialSuccessfullyExtendedScreenArgs fromBundle(Bundle bundle) {
        TeamTrialSuccessfullyExtendedScreenArgs teamTrialSuccessfullyExtendedScreenArgs = new TeamTrialSuccessfullyExtendedScreenArgs();
        bundle.setClassLoader(TeamTrialSuccessfullyExtendedScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("extendedByDays")) {
            throw new IllegalArgumentException("Required argument \"extendedByDays\" is missing and does not have an android:defaultValue");
        }
        teamTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedByDays", Integer.valueOf(bundle.getInt("extendedByDays")));
        if (!bundle.containsKey("extendedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"extendedUntilDate\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Calendar.class) && !Serializable.class.isAssignableFrom(Calendar.class)) {
            throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Calendar calendar = (Calendar) bundle.get("extendedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"extendedUntilDate\" is marked as non-null but was passed a null value.");
        }
        teamTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedUntilDate", calendar);
        return teamTrialSuccessfullyExtendedScreenArgs;
    }

    public static TeamTrialSuccessfullyExtendedScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamTrialSuccessfullyExtendedScreenArgs teamTrialSuccessfullyExtendedScreenArgs = new TeamTrialSuccessfullyExtendedScreenArgs();
        if (!u0Var.b("extendedByDays")) {
            throw new IllegalArgumentException("Required argument \"extendedByDays\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("extendedByDays");
        num.intValue();
        teamTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedByDays", num);
        if (!u0Var.b("extendedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"extendedUntilDate\" is missing and does not have an android:defaultValue");
        }
        Calendar calendar = (Calendar) u0Var.c("extendedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"extendedUntilDate\" is marked as non-null but was passed a null value.");
        }
        teamTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedUntilDate", calendar);
        return teamTrialSuccessfullyExtendedScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamTrialSuccessfullyExtendedScreenArgs teamTrialSuccessfullyExtendedScreenArgs = (TeamTrialSuccessfullyExtendedScreenArgs) obj;
        if (this.arguments.containsKey("extendedByDays") == teamTrialSuccessfullyExtendedScreenArgs.arguments.containsKey("extendedByDays") && getExtendedByDays() == teamTrialSuccessfullyExtendedScreenArgs.getExtendedByDays() && this.arguments.containsKey("extendedUntilDate") == teamTrialSuccessfullyExtendedScreenArgs.arguments.containsKey("extendedUntilDate")) {
            return getExtendedUntilDate() == null ? teamTrialSuccessfullyExtendedScreenArgs.getExtendedUntilDate() == null : getExtendedUntilDate().equals(teamTrialSuccessfullyExtendedScreenArgs.getExtendedUntilDate());
        }
        return false;
    }

    public int getExtendedByDays() {
        return ((Integer) this.arguments.get("extendedByDays")).intValue();
    }

    public Calendar getExtendedUntilDate() {
        return (Calendar) this.arguments.get("extendedUntilDate");
    }

    public int hashCode() {
        return ((getExtendedByDays() + 31) * 31) + (getExtendedUntilDate() != null ? getExtendedUntilDate().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("extendedByDays")) {
            bundle.putInt("extendedByDays", ((Integer) this.arguments.get("extendedByDays")).intValue());
        }
        if (this.arguments.containsKey("extendedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("extendedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    bundle.putSerializable("extendedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return bundle;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("extendedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("extendedByDays")) {
            Integer num = (Integer) this.arguments.get("extendedByDays");
            num.intValue();
            u0Var.h("extendedByDays", num);
        }
        if (this.arguments.containsKey("extendedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("extendedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    u0Var.h("extendedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return u0Var;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("extendedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return u0Var;
    }

    public String toString() {
        return "TeamTrialSuccessfullyExtendedScreenArgs{extendedByDays=" + getExtendedByDays() + ", extendedUntilDate=" + getExtendedUntilDate() + "}";
    }

    private TeamTrialSuccessfullyExtendedScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

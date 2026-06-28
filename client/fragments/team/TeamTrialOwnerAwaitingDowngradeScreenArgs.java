package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TeamTrialOwnerAwaitingDowngradeScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26690a;

        public a(DowngradeToPlanType downgradeToPlanType) {
            HashMap map = new HashMap();
            this.f26690a = map;
            if (downgradeToPlanType == null) {
                throw new IllegalArgumentException("Argument \"downgradeToPlanType\" is marked as non-null but was passed a null value.");
            }
            map.put("downgradeToPlanType", downgradeToPlanType);
        }

        public TeamTrialOwnerAwaitingDowngradeScreenArgs a() {
            return new TeamTrialOwnerAwaitingDowngradeScreenArgs(this.f26690a);
        }
    }

    public static TeamTrialOwnerAwaitingDowngradeScreenArgs fromBundle(Bundle bundle) {
        TeamTrialOwnerAwaitingDowngradeScreenArgs teamTrialOwnerAwaitingDowngradeScreenArgs = new TeamTrialOwnerAwaitingDowngradeScreenArgs();
        bundle.setClassLoader(TeamTrialOwnerAwaitingDowngradeScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("downgradeToPlanType")) {
            throw new IllegalArgumentException("Required argument \"downgradeToPlanType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DowngradeToPlanType.class) && !Serializable.class.isAssignableFrom(DowngradeToPlanType.class)) {
            throw new UnsupportedOperationException(DowngradeToPlanType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        DowngradeToPlanType downgradeToPlanType = (DowngradeToPlanType) bundle.get("downgradeToPlanType");
        if (downgradeToPlanType == null) {
            throw new IllegalArgumentException("Argument \"downgradeToPlanType\" is marked as non-null but was passed a null value.");
        }
        teamTrialOwnerAwaitingDowngradeScreenArgs.arguments.put("downgradeToPlanType", downgradeToPlanType);
        return teamTrialOwnerAwaitingDowngradeScreenArgs;
    }

    public static TeamTrialOwnerAwaitingDowngradeScreenArgs fromSavedStateHandle(u0 u0Var) {
        TeamTrialOwnerAwaitingDowngradeScreenArgs teamTrialOwnerAwaitingDowngradeScreenArgs = new TeamTrialOwnerAwaitingDowngradeScreenArgs();
        if (!u0Var.b("downgradeToPlanType")) {
            throw new IllegalArgumentException("Required argument \"downgradeToPlanType\" is missing and does not have an android:defaultValue");
        }
        DowngradeToPlanType downgradeToPlanType = (DowngradeToPlanType) u0Var.c("downgradeToPlanType");
        if (downgradeToPlanType == null) {
            throw new IllegalArgumentException("Argument \"downgradeToPlanType\" is marked as non-null but was passed a null value.");
        }
        teamTrialOwnerAwaitingDowngradeScreenArgs.arguments.put("downgradeToPlanType", downgradeToPlanType);
        return teamTrialOwnerAwaitingDowngradeScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TeamTrialOwnerAwaitingDowngradeScreenArgs teamTrialOwnerAwaitingDowngradeScreenArgs = (TeamTrialOwnerAwaitingDowngradeScreenArgs) obj;
        if (this.arguments.containsKey("downgradeToPlanType") != teamTrialOwnerAwaitingDowngradeScreenArgs.arguments.containsKey("downgradeToPlanType")) {
            return false;
        }
        return getDowngradeToPlanType() == null ? teamTrialOwnerAwaitingDowngradeScreenArgs.getDowngradeToPlanType() == null : getDowngradeToPlanType().equals(teamTrialOwnerAwaitingDowngradeScreenArgs.getDowngradeToPlanType());
    }

    public DowngradeToPlanType getDowngradeToPlanType() {
        return (DowngradeToPlanType) this.arguments.get("downgradeToPlanType");
    }

    public int hashCode() {
        return 31 + (getDowngradeToPlanType() != null ? getDowngradeToPlanType().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("downgradeToPlanType")) {
            DowngradeToPlanType downgradeToPlanType = (DowngradeToPlanType) this.arguments.get("downgradeToPlanType");
            if (!Parcelable.class.isAssignableFrom(DowngradeToPlanType.class) && downgradeToPlanType != null) {
                if (Serializable.class.isAssignableFrom(DowngradeToPlanType.class)) {
                    bundle.putSerializable("downgradeToPlanType", (Serializable) Serializable.class.cast(downgradeToPlanType));
                    return bundle;
                }
                throw new UnsupportedOperationException(DowngradeToPlanType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("downgradeToPlanType", (Parcelable) Parcelable.class.cast(downgradeToPlanType));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("downgradeToPlanType")) {
            DowngradeToPlanType downgradeToPlanType = (DowngradeToPlanType) this.arguments.get("downgradeToPlanType");
            if (!Parcelable.class.isAssignableFrom(DowngradeToPlanType.class) && downgradeToPlanType != null) {
                if (Serializable.class.isAssignableFrom(DowngradeToPlanType.class)) {
                    u0Var.h("downgradeToPlanType", (Serializable) Serializable.class.cast(downgradeToPlanType));
                    return u0Var;
                }
                throw new UnsupportedOperationException(DowngradeToPlanType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("downgradeToPlanType", (Parcelable) Parcelable.class.cast(downgradeToPlanType));
        }
        return u0Var;
    }

    public String toString() {
        return "TeamTrialOwnerAwaitingDowngradeScreenArgs{downgradeToPlanType=" + getDowngradeToPlanType() + "}";
    }

    private TeamTrialOwnerAwaitingDowngradeScreenArgs() {
        this.arguments = new HashMap();
    }

    private TeamTrialOwnerAwaitingDowngradeScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

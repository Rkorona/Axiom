package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.lifecycle.u0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SetupTeamVaultEntitiesToShareScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private SetupTeamVaultEntitiesToShareScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SetupTeamVaultEntitiesToShareScreenArgs fromBundle(Bundle bundle) {
        SetupTeamVaultEntitiesToShareScreenArgs setupTeamVaultEntitiesToShareScreenArgs = new SetupTeamVaultEntitiesToShareScreenArgs();
        bundle.setClassLoader(SetupTeamVaultEntitiesToShareScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("invitedColleaguesCount", Integer.valueOf(bundle.getInt("invitedColleaguesCount")));
        if (!bundle.containsKey("isSharedCredentials")) {
            throw new IllegalArgumentException("Required argument \"isSharedCredentials\" is missing and does not have an android:defaultValue");
        }
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("isSharedCredentials", Boolean.valueOf(bundle.getBoolean("isSharedCredentials")));
        if (!bundle.containsKey("callerFeature")) {
            setupTeamVaultEntitiesToShareScreenArgs.arguments.put("callerFeature", null);
            return setupTeamVaultEntitiesToShareScreenArgs;
        }
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("callerFeature", bundle.getString("callerFeature"));
        return setupTeamVaultEntitiesToShareScreenArgs;
    }

    public static SetupTeamVaultEntitiesToShareScreenArgs fromSavedStateHandle(u0 u0Var) {
        SetupTeamVaultEntitiesToShareScreenArgs setupTeamVaultEntitiesToShareScreenArgs = new SetupTeamVaultEntitiesToShareScreenArgs();
        if (!u0Var.b("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("invitedColleaguesCount");
        num.intValue();
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("invitedColleaguesCount", num);
        if (!u0Var.b("isSharedCredentials")) {
            throw new IllegalArgumentException("Required argument \"isSharedCredentials\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isSharedCredentials");
        bool.booleanValue();
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("isSharedCredentials", bool);
        if (!u0Var.b("callerFeature")) {
            setupTeamVaultEntitiesToShareScreenArgs.arguments.put("callerFeature", null);
            return setupTeamVaultEntitiesToShareScreenArgs;
        }
        setupTeamVaultEntitiesToShareScreenArgs.arguments.put("callerFeature", (String) u0Var.c("callerFeature"));
        return setupTeamVaultEntitiesToShareScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupTeamVaultEntitiesToShareScreenArgs setupTeamVaultEntitiesToShareScreenArgs = (SetupTeamVaultEntitiesToShareScreenArgs) obj;
        if (this.arguments.containsKey("invitedColleaguesCount") == setupTeamVaultEntitiesToShareScreenArgs.arguments.containsKey("invitedColleaguesCount") && getInvitedColleaguesCount() == setupTeamVaultEntitiesToShareScreenArgs.getInvitedColleaguesCount() && this.arguments.containsKey("isSharedCredentials") == setupTeamVaultEntitiesToShareScreenArgs.arguments.containsKey("isSharedCredentials") && getIsSharedCredentials() == setupTeamVaultEntitiesToShareScreenArgs.getIsSharedCredentials() && this.arguments.containsKey("callerFeature") == setupTeamVaultEntitiesToShareScreenArgs.arguments.containsKey("callerFeature")) {
            return getCallerFeature() == null ? setupTeamVaultEntitiesToShareScreenArgs.getCallerFeature() == null : getCallerFeature().equals(setupTeamVaultEntitiesToShareScreenArgs.getCallerFeature());
        }
        return false;
    }

    public String getCallerFeature() {
        return (String) this.arguments.get("callerFeature");
    }

    public int getInvitedColleaguesCount() {
        return ((Integer) this.arguments.get("invitedColleaguesCount")).intValue();
    }

    public boolean getIsSharedCredentials() {
        return ((Boolean) this.arguments.get("isSharedCredentials")).booleanValue();
    }

    public int hashCode() {
        return ((((getInvitedColleaguesCount() + 31) * 31) + (getIsSharedCredentials() ? 1 : 0)) * 31) + (getCallerFeature() != null ? getCallerFeature().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            bundle.putInt("invitedColleaguesCount", ((Integer) this.arguments.get("invitedColleaguesCount")).intValue());
        }
        if (this.arguments.containsKey("isSharedCredentials")) {
            bundle.putBoolean("isSharedCredentials", ((Boolean) this.arguments.get("isSharedCredentials")).booleanValue());
        }
        if (this.arguments.containsKey("callerFeature")) {
            bundle.putString("callerFeature", (String) this.arguments.get("callerFeature"));
            return bundle;
        }
        bundle.putString("callerFeature", null);
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            Integer num = (Integer) this.arguments.get("invitedColleaguesCount");
            num.intValue();
            u0Var.h("invitedColleaguesCount", num);
        }
        if (this.arguments.containsKey("isSharedCredentials")) {
            Boolean bool = (Boolean) this.arguments.get("isSharedCredentials");
            bool.booleanValue();
            u0Var.h("isSharedCredentials", bool);
        }
        if (this.arguments.containsKey("callerFeature")) {
            u0Var.h("callerFeature", (String) this.arguments.get("callerFeature"));
            return u0Var;
        }
        u0Var.h("callerFeature", null);
        return u0Var;
    }

    public String toString() {
        return "SetupTeamVaultEntitiesToShareScreenArgs{invitedColleaguesCount=" + getInvitedColleaguesCount() + ", isSharedCredentials=" + getIsSharedCredentials() + ", callerFeature=" + getCallerFeature() + "}";
    }

    private SetupTeamVaultEntitiesToShareScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

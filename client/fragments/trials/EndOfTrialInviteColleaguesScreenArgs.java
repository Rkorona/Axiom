package com.server.auditor.ssh.client.fragments.trials;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EndOfTrialInviteColleaguesScreenArgs implements w {
    private final HashMap arguments;

    private EndOfTrialInviteColleaguesScreenArgs() {
        this.arguments = new HashMap();
    }

    public static EndOfTrialInviteColleaguesScreenArgs fromBundle(Bundle bundle) {
        EndOfTrialInviteColleaguesScreenArgs endOfTrialInviteColleaguesScreenArgs = new EndOfTrialInviteColleaguesScreenArgs();
        bundle.setClassLoader(EndOfTrialInviteColleaguesScreenArgs.class.getClassLoader());
        if (bundle.containsKey("isNeedCreateTeam")) {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedCreateTeam", Boolean.valueOf(bundle.getBoolean("isNeedCreateTeam")));
        } else {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedCreateTeam", Boolean.TRUE);
        }
        if (bundle.containsKey("isNeedShowSuccessScreen")) {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedShowSuccessScreen", Boolean.valueOf(bundle.getBoolean("isNeedShowSuccessScreen")));
        } else {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedShowSuccessScreen", Boolean.TRUE);
        }
        if (!bundle.containsKey("canSkipInviteColleagues")) {
            throw new IllegalArgumentException("Required argument \"canSkipInviteColleagues\" is missing and does not have an android:defaultValue");
        }
        endOfTrialInviteColleaguesScreenArgs.arguments.put("canSkipInviteColleagues", Boolean.valueOf(bundle.getBoolean("canSkipInviteColleagues")));
        if (!bundle.containsKey("canNavigateBack")) {
            throw new IllegalArgumentException("Required argument \"canNavigateBack\" is missing and does not have an android:defaultValue");
        }
        endOfTrialInviteColleaguesScreenArgs.arguments.put("canNavigateBack", Boolean.valueOf(bundle.getBoolean("canNavigateBack")));
        return endOfTrialInviteColleaguesScreenArgs;
    }

    public static EndOfTrialInviteColleaguesScreenArgs fromSavedStateHandle(u0 u0Var) {
        EndOfTrialInviteColleaguesScreenArgs endOfTrialInviteColleaguesScreenArgs = new EndOfTrialInviteColleaguesScreenArgs();
        if (u0Var.b("isNeedCreateTeam")) {
            Boolean bool = (Boolean) u0Var.c("isNeedCreateTeam");
            bool.booleanValue();
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedCreateTeam", bool);
        } else {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedCreateTeam", Boolean.TRUE);
        }
        if (u0Var.b("isNeedShowSuccessScreen")) {
            Boolean bool2 = (Boolean) u0Var.c("isNeedShowSuccessScreen");
            bool2.booleanValue();
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedShowSuccessScreen", bool2);
        } else {
            endOfTrialInviteColleaguesScreenArgs.arguments.put("isNeedShowSuccessScreen", Boolean.TRUE);
        }
        if (!u0Var.b("canSkipInviteColleagues")) {
            throw new IllegalArgumentException("Required argument \"canSkipInviteColleagues\" is missing and does not have an android:defaultValue");
        }
        Boolean bool3 = (Boolean) u0Var.c("canSkipInviteColleagues");
        bool3.booleanValue();
        endOfTrialInviteColleaguesScreenArgs.arguments.put("canSkipInviteColleagues", bool3);
        if (!u0Var.b("canNavigateBack")) {
            throw new IllegalArgumentException("Required argument \"canNavigateBack\" is missing and does not have an android:defaultValue");
        }
        Boolean bool4 = (Boolean) u0Var.c("canNavigateBack");
        bool4.booleanValue();
        endOfTrialInviteColleaguesScreenArgs.arguments.put("canNavigateBack", bool4);
        return endOfTrialInviteColleaguesScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndOfTrialInviteColleaguesScreenArgs endOfTrialInviteColleaguesScreenArgs = (EndOfTrialInviteColleaguesScreenArgs) obj;
        return this.arguments.containsKey("isNeedCreateTeam") == endOfTrialInviteColleaguesScreenArgs.arguments.containsKey("isNeedCreateTeam") && getIsNeedCreateTeam() == endOfTrialInviteColleaguesScreenArgs.getIsNeedCreateTeam() && this.arguments.containsKey("isNeedShowSuccessScreen") == endOfTrialInviteColleaguesScreenArgs.arguments.containsKey("isNeedShowSuccessScreen") && getIsNeedShowSuccessScreen() == endOfTrialInviteColleaguesScreenArgs.getIsNeedShowSuccessScreen() && this.arguments.containsKey("canSkipInviteColleagues") == endOfTrialInviteColleaguesScreenArgs.arguments.containsKey("canSkipInviteColleagues") && getCanSkipInviteColleagues() == endOfTrialInviteColleaguesScreenArgs.getCanSkipInviteColleagues() && this.arguments.containsKey("canNavigateBack") == endOfTrialInviteColleaguesScreenArgs.arguments.containsKey("canNavigateBack") && getCanNavigateBack() == endOfTrialInviteColleaguesScreenArgs.getCanNavigateBack();
    }

    public boolean getCanNavigateBack() {
        return ((Boolean) this.arguments.get("canNavigateBack")).booleanValue();
    }

    public boolean getCanSkipInviteColleagues() {
        return ((Boolean) this.arguments.get("canSkipInviteColleagues")).booleanValue();
    }

    public boolean getIsNeedCreateTeam() {
        return ((Boolean) this.arguments.get("isNeedCreateTeam")).booleanValue();
    }

    public boolean getIsNeedShowSuccessScreen() {
        return ((Boolean) this.arguments.get("isNeedShowSuccessScreen")).booleanValue();
    }

    public int hashCode() {
        return (((((((getIsNeedCreateTeam() ? 1 : 0) + 31) * 31) + (getIsNeedShowSuccessScreen() ? 1 : 0)) * 31) + (getCanSkipInviteColleagues() ? 1 : 0)) * 31) + (getCanNavigateBack() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("isNeedCreateTeam")) {
            bundle.putBoolean("isNeedCreateTeam", ((Boolean) this.arguments.get("isNeedCreateTeam")).booleanValue());
        } else {
            bundle.putBoolean("isNeedCreateTeam", true);
        }
        if (this.arguments.containsKey("isNeedShowSuccessScreen")) {
            bundle.putBoolean("isNeedShowSuccessScreen", ((Boolean) this.arguments.get("isNeedShowSuccessScreen")).booleanValue());
        } else {
            bundle.putBoolean("isNeedShowSuccessScreen", true);
        }
        if (this.arguments.containsKey("canSkipInviteColleagues")) {
            bundle.putBoolean("canSkipInviteColleagues", ((Boolean) this.arguments.get("canSkipInviteColleagues")).booleanValue());
        }
        if (this.arguments.containsKey("canNavigateBack")) {
            bundle.putBoolean("canNavigateBack", ((Boolean) this.arguments.get("canNavigateBack")).booleanValue());
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("isNeedCreateTeam")) {
            Boolean bool = (Boolean) this.arguments.get("isNeedCreateTeam");
            bool.booleanValue();
            u0Var.h("isNeedCreateTeam", bool);
        } else {
            u0Var.h("isNeedCreateTeam", Boolean.TRUE);
        }
        if (this.arguments.containsKey("isNeedShowSuccessScreen")) {
            Boolean bool2 = (Boolean) this.arguments.get("isNeedShowSuccessScreen");
            bool2.booleanValue();
            u0Var.h("isNeedShowSuccessScreen", bool2);
        } else {
            u0Var.h("isNeedShowSuccessScreen", Boolean.TRUE);
        }
        if (this.arguments.containsKey("canSkipInviteColleagues")) {
            Boolean bool3 = (Boolean) this.arguments.get("canSkipInviteColleagues");
            bool3.booleanValue();
            u0Var.h("canSkipInviteColleagues", bool3);
        }
        if (this.arguments.containsKey("canNavigateBack")) {
            Boolean bool4 = (Boolean) this.arguments.get("canNavigateBack");
            bool4.booleanValue();
            u0Var.h("canNavigateBack", bool4);
        }
        return u0Var;
    }

    public String toString() {
        return "EndOfTrialInviteColleaguesScreenArgs{isNeedCreateTeam=" + getIsNeedCreateTeam() + ", isNeedShowSuccessScreen=" + getIsNeedShowSuccessScreen() + ", canSkipInviteColleagues=" + getCanSkipInviteColleagues() + ", canNavigateBack=" + getCanNavigateBack() + "}";
    }

    private EndOfTrialInviteColleaguesScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

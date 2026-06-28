package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SetupTeamVaultSuccessScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private SetupTeamVaultSuccessScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SetupTeamVaultSuccessScreenArgs fromBundle(Bundle bundle) {
        SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr;
        SetupTeamVaultSuccessScreenArgs setupTeamVaultSuccessScreenArgs = new SetupTeamVaultSuccessScreenArgs();
        bundle.setClassLoader(SetupTeamVaultSuccessScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        setupTeamVaultSuccessScreenArgs.arguments.put("invitedColleaguesCount", Integer.valueOf(bundle.getInt("invitedColleaguesCount")));
        if (!bundle.containsKey("sharedEntities")) {
            throw new IllegalArgumentException("Required argument \"sharedEntities\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("sharedEntities");
        if (parcelableArray != null) {
            setupTeamVaultShareEntitiesSectionTypeArr = new SetupTeamVaultShareEntitiesSectionType[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, setupTeamVaultShareEntitiesSectionTypeArr, 0, parcelableArray.length);
        } else {
            setupTeamVaultShareEntitiesSectionTypeArr = null;
        }
        if (setupTeamVaultShareEntitiesSectionTypeArr == null) {
            throw new IllegalArgumentException("Argument \"sharedEntities\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultSuccessScreenArgs.arguments.put("sharedEntities", setupTeamVaultShareEntitiesSectionTypeArr);
        return setupTeamVaultSuccessScreenArgs;
    }

    public static SetupTeamVaultSuccessScreenArgs fromSavedStateHandle(u0 u0Var) {
        SetupTeamVaultSuccessScreenArgs setupTeamVaultSuccessScreenArgs = new SetupTeamVaultSuccessScreenArgs();
        if (!u0Var.b("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("invitedColleaguesCount");
        num.intValue();
        setupTeamVaultSuccessScreenArgs.arguments.put("invitedColleaguesCount", num);
        if (!u0Var.b("sharedEntities")) {
            throw new IllegalArgumentException("Required argument \"sharedEntities\" is missing and does not have an android:defaultValue");
        }
        SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr = (SetupTeamVaultShareEntitiesSectionType[]) u0Var.c("sharedEntities");
        if (setupTeamVaultShareEntitiesSectionTypeArr == null) {
            throw new IllegalArgumentException("Argument \"sharedEntities\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultSuccessScreenArgs.arguments.put("sharedEntities", setupTeamVaultShareEntitiesSectionTypeArr);
        return setupTeamVaultSuccessScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupTeamVaultSuccessScreenArgs setupTeamVaultSuccessScreenArgs = (SetupTeamVaultSuccessScreenArgs) obj;
        if (this.arguments.containsKey("invitedColleaguesCount") == setupTeamVaultSuccessScreenArgs.arguments.containsKey("invitedColleaguesCount") && getInvitedColleaguesCount() == setupTeamVaultSuccessScreenArgs.getInvitedColleaguesCount() && this.arguments.containsKey("sharedEntities") == setupTeamVaultSuccessScreenArgs.arguments.containsKey("sharedEntities")) {
            return getSharedEntities() == null ? setupTeamVaultSuccessScreenArgs.getSharedEntities() == null : getSharedEntities().equals(setupTeamVaultSuccessScreenArgs.getSharedEntities());
        }
        return false;
    }

    public int getInvitedColleaguesCount() {
        return ((Integer) this.arguments.get("invitedColleaguesCount")).intValue();
    }

    public SetupTeamVaultShareEntitiesSectionType[] getSharedEntities() {
        return (SetupTeamVaultShareEntitiesSectionType[]) this.arguments.get("sharedEntities");
    }

    public int hashCode() {
        return ((getInvitedColleaguesCount() + 31) * 31) + Arrays.hashCode(getSharedEntities());
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            bundle.putInt("invitedColleaguesCount", ((Integer) this.arguments.get("invitedColleaguesCount")).intValue());
        }
        if (this.arguments.containsKey("sharedEntities")) {
            bundle.putParcelableArray("sharedEntities", (SetupTeamVaultShareEntitiesSectionType[]) this.arguments.get("sharedEntities"));
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
        if (this.arguments.containsKey("sharedEntities")) {
            u0Var.h("sharedEntities", (SetupTeamVaultShareEntitiesSectionType[]) this.arguments.get("sharedEntities"));
        }
        return u0Var;
    }

    public String toString() {
        return "SetupTeamVaultSuccessScreenArgs{invitedColleaguesCount=" + getInvitedColleaguesCount() + ", sharedEntities=" + getSharedEntities() + "}";
    }

    private SetupTeamVaultSuccessScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

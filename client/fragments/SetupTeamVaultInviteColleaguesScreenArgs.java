package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SetupTeamVaultInviteColleaguesScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private SetupTeamVaultInviteColleaguesScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SetupTeamVaultInviteColleaguesScreenArgs fromBundle(Bundle bundle) {
        TypedEntityIdentifier[] typedEntityIdentifierArr;
        SetupTeamVaultInviteColleaguesScreenArgs setupTeamVaultInviteColleaguesScreenArgs = new SetupTeamVaultInviteColleaguesScreenArgs();
        bundle.setClassLoader(SetupTeamVaultInviteColleaguesScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("typedEntityToShareIdentifiers")) {
            throw new IllegalArgumentException("Required argument \"typedEntityToShareIdentifiers\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("typedEntityToShareIdentifiers");
        if (parcelableArray != null) {
            typedEntityIdentifierArr = new TypedEntityIdentifier[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, typedEntityIdentifierArr, 0, parcelableArray.length);
        } else {
            typedEntityIdentifierArr = null;
        }
        if (typedEntityIdentifierArr == null) {
            throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (!bundle.containsKey("isSharedCredentials")) {
            throw new IllegalArgumentException("Required argument \"isSharedCredentials\" is missing and does not have an android:defaultValue");
        }
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("isSharedCredentials", Boolean.valueOf(bundle.getBoolean("isSharedCredentials")));
        if (!bundle.containsKey("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("analyticsFunnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("analyticsFunnelId", string);
        return setupTeamVaultInviteColleaguesScreenArgs;
    }

    public static SetupTeamVaultInviteColleaguesScreenArgs fromSavedStateHandle(u0 u0Var) {
        SetupTeamVaultInviteColleaguesScreenArgs setupTeamVaultInviteColleaguesScreenArgs = new SetupTeamVaultInviteColleaguesScreenArgs();
        if (!u0Var.b("typedEntityToShareIdentifiers")) {
            throw new IllegalArgumentException("Required argument \"typedEntityToShareIdentifiers\" is missing and does not have an android:defaultValue");
        }
        TypedEntityIdentifier[] typedEntityIdentifierArr = (TypedEntityIdentifier[]) u0Var.c("typedEntityToShareIdentifiers");
        if (typedEntityIdentifierArr == null) {
            throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (!u0Var.b("isSharedCredentials")) {
            throw new IllegalArgumentException("Required argument \"isSharedCredentials\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("isSharedCredentials");
        bool.booleanValue();
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("isSharedCredentials", bool);
        if (!u0Var.b("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("analyticsFunnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultInviteColleaguesScreenArgs.arguments.put("analyticsFunnelId", str);
        return setupTeamVaultInviteColleaguesScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupTeamVaultInviteColleaguesScreenArgs setupTeamVaultInviteColleaguesScreenArgs = (SetupTeamVaultInviteColleaguesScreenArgs) obj;
        if (this.arguments.containsKey("typedEntityToShareIdentifiers") != setupTeamVaultInviteColleaguesScreenArgs.arguments.containsKey("typedEntityToShareIdentifiers")) {
            return false;
        }
        if (getTypedEntityToShareIdentifiers() == null ? setupTeamVaultInviteColleaguesScreenArgs.getTypedEntityToShareIdentifiers() != null : !getTypedEntityToShareIdentifiers().equals(setupTeamVaultInviteColleaguesScreenArgs.getTypedEntityToShareIdentifiers())) {
            return false;
        }
        if (this.arguments.containsKey("isSharedCredentials") == setupTeamVaultInviteColleaguesScreenArgs.arguments.containsKey("isSharedCredentials") && getIsSharedCredentials() == setupTeamVaultInviteColleaguesScreenArgs.getIsSharedCredentials() && this.arguments.containsKey("analyticsFunnelId") == setupTeamVaultInviteColleaguesScreenArgs.arguments.containsKey("analyticsFunnelId")) {
            return getAnalyticsFunnelId() == null ? setupTeamVaultInviteColleaguesScreenArgs.getAnalyticsFunnelId() == null : getAnalyticsFunnelId().equals(setupTeamVaultInviteColleaguesScreenArgs.getAnalyticsFunnelId());
        }
        return false;
    }

    public String getAnalyticsFunnelId() {
        return (String) this.arguments.get("analyticsFunnelId");
    }

    public boolean getIsSharedCredentials() {
        return ((Boolean) this.arguments.get("isSharedCredentials")).booleanValue();
    }

    public TypedEntityIdentifier[] getTypedEntityToShareIdentifiers() {
        return (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers");
    }

    public int hashCode() {
        return ((((Arrays.hashCode(getTypedEntityToShareIdentifiers()) + 31) * 31) + (getIsSharedCredentials() ? 1 : 0)) * 31) + (getAnalyticsFunnelId() != null ? getAnalyticsFunnelId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("typedEntityToShareIdentifiers")) {
            bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers"));
        }
        if (this.arguments.containsKey("isSharedCredentials")) {
            bundle.putBoolean("isSharedCredentials", ((Boolean) this.arguments.get("isSharedCredentials")).booleanValue());
        }
        if (this.arguments.containsKey("analyticsFunnelId")) {
            bundle.putString("analyticsFunnelId", (String) this.arguments.get("analyticsFunnelId"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("typedEntityToShareIdentifiers")) {
            u0Var.h("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers"));
        }
        if (this.arguments.containsKey("isSharedCredentials")) {
            Boolean bool = (Boolean) this.arguments.get("isSharedCredentials");
            bool.booleanValue();
            u0Var.h("isSharedCredentials", bool);
        }
        if (this.arguments.containsKey("analyticsFunnelId")) {
            u0Var.h("analyticsFunnelId", (String) this.arguments.get("analyticsFunnelId"));
        }
        return u0Var;
    }

    public String toString() {
        return "SetupTeamVaultInviteColleaguesScreenArgs{typedEntityToShareIdentifiers=" + getTypedEntityToShareIdentifiers() + ", isSharedCredentials=" + getIsSharedCredentials() + ", analyticsFunnelId=" + getAnalyticsFunnelId() + "}";
    }

    private SetupTeamVaultInviteColleaguesScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

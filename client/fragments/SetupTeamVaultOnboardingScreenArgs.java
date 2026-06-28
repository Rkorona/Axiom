package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SetupTeamVaultOnboardingScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24234a;

        public a(TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
            HashMap map = new HashMap();
            this.f24234a = map;
            if (typedEntityIdentifierArr == null) {
                throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
            }
            map.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("analyticsFunnelId", str);
        }

        public SetupTeamVaultOnboardingScreenArgs a() {
            return new SetupTeamVaultOnboardingScreenArgs(this.f24234a);
        }
    }

    public static SetupTeamVaultOnboardingScreenArgs fromBundle(Bundle bundle) {
        TypedEntityIdentifier[] typedEntityIdentifierArr;
        SetupTeamVaultOnboardingScreenArgs setupTeamVaultOnboardingScreenArgs = new SetupTeamVaultOnboardingScreenArgs();
        bundle.setClassLoader(SetupTeamVaultOnboardingScreenArgs.class.getClassLoader());
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
        setupTeamVaultOnboardingScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (!bundle.containsKey("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("analyticsFunnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultOnboardingScreenArgs.arguments.put("analyticsFunnelId", string);
        return setupTeamVaultOnboardingScreenArgs;
    }

    public static SetupTeamVaultOnboardingScreenArgs fromSavedStateHandle(u0 u0Var) {
        SetupTeamVaultOnboardingScreenArgs setupTeamVaultOnboardingScreenArgs = new SetupTeamVaultOnboardingScreenArgs();
        if (!u0Var.b("typedEntityToShareIdentifiers")) {
            throw new IllegalArgumentException("Required argument \"typedEntityToShareIdentifiers\" is missing and does not have an android:defaultValue");
        }
        TypedEntityIdentifier[] typedEntityIdentifierArr = (TypedEntityIdentifier[]) u0Var.c("typedEntityToShareIdentifiers");
        if (typedEntityIdentifierArr == null) {
            throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultOnboardingScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (!u0Var.b("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("analyticsFunnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultOnboardingScreenArgs.arguments.put("analyticsFunnelId", str);
        return setupTeamVaultOnboardingScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupTeamVaultOnboardingScreenArgs setupTeamVaultOnboardingScreenArgs = (SetupTeamVaultOnboardingScreenArgs) obj;
        if (this.arguments.containsKey("typedEntityToShareIdentifiers") != setupTeamVaultOnboardingScreenArgs.arguments.containsKey("typedEntityToShareIdentifiers")) {
            return false;
        }
        if (getTypedEntityToShareIdentifiers() == null ? setupTeamVaultOnboardingScreenArgs.getTypedEntityToShareIdentifiers() != null : !getTypedEntityToShareIdentifiers().equals(setupTeamVaultOnboardingScreenArgs.getTypedEntityToShareIdentifiers())) {
            return false;
        }
        if (this.arguments.containsKey("analyticsFunnelId") != setupTeamVaultOnboardingScreenArgs.arguments.containsKey("analyticsFunnelId")) {
            return false;
        }
        return getAnalyticsFunnelId() == null ? setupTeamVaultOnboardingScreenArgs.getAnalyticsFunnelId() == null : getAnalyticsFunnelId().equals(setupTeamVaultOnboardingScreenArgs.getAnalyticsFunnelId());
    }

    public String getAnalyticsFunnelId() {
        return (String) this.arguments.get("analyticsFunnelId");
    }

    public TypedEntityIdentifier[] getTypedEntityToShareIdentifiers() {
        return (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers");
    }

    public int hashCode() {
        return ((Arrays.hashCode(getTypedEntityToShareIdentifiers()) + 31) * 31) + (getAnalyticsFunnelId() != null ? getAnalyticsFunnelId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("typedEntityToShareIdentifiers")) {
            bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers"));
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
        if (this.arguments.containsKey("analyticsFunnelId")) {
            u0Var.h("analyticsFunnelId", (String) this.arguments.get("analyticsFunnelId"));
        }
        return u0Var;
    }

    public String toString() {
        return "SetupTeamVaultOnboardingScreenArgs{typedEntityToShareIdentifiers=" + getTypedEntityToShareIdentifiers() + ", analyticsFunnelId=" + getAnalyticsFunnelId() + "}";
    }

    private SetupTeamVaultOnboardingScreenArgs() {
        this.arguments = new HashMap();
    }

    private SetupTeamVaultOnboardingScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

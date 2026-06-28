package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SetupTeamVaultCredentialsModeScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24090a;

        public a(int i10, TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
            HashMap map = new HashMap();
            this.f24090a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            if (typedEntityIdentifierArr == null) {
                throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
            }
            map.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("analyticsFunnelId", str);
        }

        public SetupTeamVaultCredentialsModeScreenArgs a() {
            return new SetupTeamVaultCredentialsModeScreenArgs(this.f24090a);
        }

        public a b(String str) {
            this.f24090a.put("callerFeature", str);
            return this;
        }
    }

    public static SetupTeamVaultCredentialsModeScreenArgs fromBundle(Bundle bundle) {
        TypedEntityIdentifier[] typedEntityIdentifierArr;
        SetupTeamVaultCredentialsModeScreenArgs setupTeamVaultCredentialsModeScreenArgs = new SetupTeamVaultCredentialsModeScreenArgs();
        bundle.setClassLoader(SetupTeamVaultCredentialsModeScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("invitedColleaguesCount", Integer.valueOf(bundle.getInt("invitedColleaguesCount")));
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
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (bundle.containsKey("callerFeature")) {
            setupTeamVaultCredentialsModeScreenArgs.arguments.put("callerFeature", bundle.getString("callerFeature"));
        } else {
            setupTeamVaultCredentialsModeScreenArgs.arguments.put("callerFeature", null);
        }
        if (!bundle.containsKey("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("analyticsFunnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("analyticsFunnelId", string);
        return setupTeamVaultCredentialsModeScreenArgs;
    }

    public static SetupTeamVaultCredentialsModeScreenArgs fromSavedStateHandle(u0 u0Var) {
        SetupTeamVaultCredentialsModeScreenArgs setupTeamVaultCredentialsModeScreenArgs = new SetupTeamVaultCredentialsModeScreenArgs();
        if (!u0Var.b("invitedColleaguesCount")) {
            throw new IllegalArgumentException("Required argument \"invitedColleaguesCount\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("invitedColleaguesCount");
        num.intValue();
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("invitedColleaguesCount", num);
        if (!u0Var.b("typedEntityToShareIdentifiers")) {
            throw new IllegalArgumentException("Required argument \"typedEntityToShareIdentifiers\" is missing and does not have an android:defaultValue");
        }
        TypedEntityIdentifier[] typedEntityIdentifierArr = (TypedEntityIdentifier[]) u0Var.c("typedEntityToShareIdentifiers");
        if (typedEntityIdentifierArr == null) {
            throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
        if (u0Var.b("callerFeature")) {
            setupTeamVaultCredentialsModeScreenArgs.arguments.put("callerFeature", (String) u0Var.c("callerFeature"));
        } else {
            setupTeamVaultCredentialsModeScreenArgs.arguments.put("callerFeature", null);
        }
        if (!u0Var.b("analyticsFunnelId")) {
            throw new IllegalArgumentException("Required argument \"analyticsFunnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("analyticsFunnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
        }
        setupTeamVaultCredentialsModeScreenArgs.arguments.put("analyticsFunnelId", str);
        return setupTeamVaultCredentialsModeScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupTeamVaultCredentialsModeScreenArgs setupTeamVaultCredentialsModeScreenArgs = (SetupTeamVaultCredentialsModeScreenArgs) obj;
        if (this.arguments.containsKey("invitedColleaguesCount") != setupTeamVaultCredentialsModeScreenArgs.arguments.containsKey("invitedColleaguesCount") || getInvitedColleaguesCount() != setupTeamVaultCredentialsModeScreenArgs.getInvitedColleaguesCount() || this.arguments.containsKey("typedEntityToShareIdentifiers") != setupTeamVaultCredentialsModeScreenArgs.arguments.containsKey("typedEntityToShareIdentifiers")) {
            return false;
        }
        if (getTypedEntityToShareIdentifiers() == null ? setupTeamVaultCredentialsModeScreenArgs.getTypedEntityToShareIdentifiers() != null : !getTypedEntityToShareIdentifiers().equals(setupTeamVaultCredentialsModeScreenArgs.getTypedEntityToShareIdentifiers())) {
            return false;
        }
        if (this.arguments.containsKey("callerFeature") != setupTeamVaultCredentialsModeScreenArgs.arguments.containsKey("callerFeature")) {
            return false;
        }
        if (getCallerFeature() == null ? setupTeamVaultCredentialsModeScreenArgs.getCallerFeature() != null : !getCallerFeature().equals(setupTeamVaultCredentialsModeScreenArgs.getCallerFeature())) {
            return false;
        }
        if (this.arguments.containsKey("analyticsFunnelId") != setupTeamVaultCredentialsModeScreenArgs.arguments.containsKey("analyticsFunnelId")) {
            return false;
        }
        return getAnalyticsFunnelId() == null ? setupTeamVaultCredentialsModeScreenArgs.getAnalyticsFunnelId() == null : getAnalyticsFunnelId().equals(setupTeamVaultCredentialsModeScreenArgs.getAnalyticsFunnelId());
    }

    public String getAnalyticsFunnelId() {
        return (String) this.arguments.get("analyticsFunnelId");
    }

    public String getCallerFeature() {
        return (String) this.arguments.get("callerFeature");
    }

    public int getInvitedColleaguesCount() {
        return ((Integer) this.arguments.get("invitedColleaguesCount")).intValue();
    }

    public TypedEntityIdentifier[] getTypedEntityToShareIdentifiers() {
        return (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers");
    }

    public int hashCode() {
        return ((((((getInvitedColleaguesCount() + 31) * 31) + Arrays.hashCode(getTypedEntityToShareIdentifiers())) * 31) + (getCallerFeature() != null ? getCallerFeature().hashCode() : 0)) * 31) + (getAnalyticsFunnelId() != null ? getAnalyticsFunnelId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("invitedColleaguesCount")) {
            bundle.putInt("invitedColleaguesCount", ((Integer) this.arguments.get("invitedColleaguesCount")).intValue());
        }
        if (this.arguments.containsKey("typedEntityToShareIdentifiers")) {
            bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers"));
        }
        if (this.arguments.containsKey("callerFeature")) {
            bundle.putString("callerFeature", (String) this.arguments.get("callerFeature"));
        } else {
            bundle.putString("callerFeature", null);
        }
        if (this.arguments.containsKey("analyticsFunnelId")) {
            bundle.putString("analyticsFunnelId", (String) this.arguments.get("analyticsFunnelId"));
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
        if (this.arguments.containsKey("typedEntityToShareIdentifiers")) {
            u0Var.h("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.arguments.get("typedEntityToShareIdentifiers"));
        }
        if (this.arguments.containsKey("callerFeature")) {
            u0Var.h("callerFeature", (String) this.arguments.get("callerFeature"));
        } else {
            u0Var.h("callerFeature", null);
        }
        if (this.arguments.containsKey("analyticsFunnelId")) {
            u0Var.h("analyticsFunnelId", (String) this.arguments.get("analyticsFunnelId"));
        }
        return u0Var;
    }

    public String toString() {
        return "SetupTeamVaultCredentialsModeScreenArgs{invitedColleaguesCount=" + getInvitedColleaguesCount() + ", typedEntityToShareIdentifiers=" + getTypedEntityToShareIdentifiers() + ", callerFeature=" + getCallerFeature() + ", analyticsFunnelId=" + getAnalyticsFunnelId() + "}";
    }

    private SetupTeamVaultCredentialsModeScreenArgs() {
        this.arguments = new HashMap();
    }

    private SetupTeamVaultCredentialsModeScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

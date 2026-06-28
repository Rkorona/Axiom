package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class RequireTwoFactorAuthPasswordFragmentArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28549a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f28549a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
        }

        public RequireTwoFactorAuthPasswordFragmentArgs a() {
            return new RequireTwoFactorAuthPasswordFragmentArgs(this.f28549a);
        }
    }

    public static RequireTwoFactorAuthPasswordFragmentArgs fromBundle(Bundle bundle) {
        RequireTwoFactorAuthPasswordFragmentArgs requireTwoFactorAuthPasswordFragmentArgs = new RequireTwoFactorAuthPasswordFragmentArgs();
        bundle.setClassLoader(RequireTwoFactorAuthPasswordFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("action");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        requireTwoFactorAuthPasswordFragmentArgs.arguments.put("action", string);
        if (!bundle.containsKey("providerId")) {
            requireTwoFactorAuthPasswordFragmentArgs.arguments.put("providerId", -1L);
            return requireTwoFactorAuthPasswordFragmentArgs;
        }
        requireTwoFactorAuthPasswordFragmentArgs.arguments.put("providerId", Long.valueOf(bundle.getLong("providerId")));
        return requireTwoFactorAuthPasswordFragmentArgs;
    }

    public static RequireTwoFactorAuthPasswordFragmentArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        RequireTwoFactorAuthPasswordFragmentArgs requireTwoFactorAuthPasswordFragmentArgs = new RequireTwoFactorAuthPasswordFragmentArgs();
        if (!u0Var.b("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("action");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        requireTwoFactorAuthPasswordFragmentArgs.arguments.put("action", str);
        if (!u0Var.b("providerId")) {
            requireTwoFactorAuthPasswordFragmentArgs.arguments.put("providerId", -1L);
            return requireTwoFactorAuthPasswordFragmentArgs;
        }
        Long l10 = (Long) u0Var.c("providerId");
        l10.longValue();
        requireTwoFactorAuthPasswordFragmentArgs.arguments.put("providerId", l10);
        return requireTwoFactorAuthPasswordFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequireTwoFactorAuthPasswordFragmentArgs requireTwoFactorAuthPasswordFragmentArgs = (RequireTwoFactorAuthPasswordFragmentArgs) obj;
        if (this.arguments.containsKey("action") != requireTwoFactorAuthPasswordFragmentArgs.arguments.containsKey("action")) {
            return false;
        }
        if (getAction() == null ? requireTwoFactorAuthPasswordFragmentArgs.getAction() == null : getAction().equals(requireTwoFactorAuthPasswordFragmentArgs.getAction())) {
            return this.arguments.containsKey("providerId") == requireTwoFactorAuthPasswordFragmentArgs.arguments.containsKey("providerId") && getProviderId() == requireTwoFactorAuthPasswordFragmentArgs.getProviderId();
        }
        return false;
    }

    public String getAction() {
        return (String) this.arguments.get("action");
    }

    public long getProviderId() {
        return ((Long) this.arguments.get("providerId")).longValue();
    }

    public int hashCode() {
        return (((getAction() != null ? getAction().hashCode() : 0) + 31) * 31) + ((int) (getProviderId() ^ (getProviderId() >>> 32)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("action")) {
            bundle.putString("action", (String) this.arguments.get("action"));
        }
        if (this.arguments.containsKey("providerId")) {
            bundle.putLong("providerId", ((Long) this.arguments.get("providerId")).longValue());
            return bundle;
        }
        bundle.putLong("providerId", -1L);
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("action")) {
            u0Var.h("action", (String) this.arguments.get("action"));
        }
        if (!this.arguments.containsKey("providerId")) {
            u0Var.h("providerId", -1L);
            return u0Var;
        }
        Long l10 = (Long) this.arguments.get("providerId");
        l10.longValue();
        u0Var.h("providerId", l10);
        return u0Var;
    }

    public String toString() {
        return "RequireTwoFactorAuthPasswordFragmentArgs{action=" + getAction() + ", providerId=" + getProviderId() + "}";
    }

    private RequireTwoFactorAuthPasswordFragmentArgs() {
        this.arguments = new HashMap();
    }

    private RequireTwoFactorAuthPasswordFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

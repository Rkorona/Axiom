package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigureTwoFactorAuthFragmentArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28138a;

        public a(String str) {
            HashMap map = new HashMap();
            this.f28138a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
        }

        public ConfigureTwoFactorAuthFragmentArgs a() {
            return new ConfigureTwoFactorAuthFragmentArgs(this.f28138a);
        }
    }

    public static ConfigureTwoFactorAuthFragmentArgs fromBundle(Bundle bundle) {
        ConfigureTwoFactorAuthFragmentArgs configureTwoFactorAuthFragmentArgs = new ConfigureTwoFactorAuthFragmentArgs();
        bundle.setClassLoader(ConfigureTwoFactorAuthFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("action");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        configureTwoFactorAuthFragmentArgs.arguments.put("action", string);
        return configureTwoFactorAuthFragmentArgs;
    }

    public static ConfigureTwoFactorAuthFragmentArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        ConfigureTwoFactorAuthFragmentArgs configureTwoFactorAuthFragmentArgs = new ConfigureTwoFactorAuthFragmentArgs();
        if (!u0Var.b("action")) {
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("action");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        }
        configureTwoFactorAuthFragmentArgs.arguments.put("action", str);
        return configureTwoFactorAuthFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigureTwoFactorAuthFragmentArgs configureTwoFactorAuthFragmentArgs = (ConfigureTwoFactorAuthFragmentArgs) obj;
        if (this.arguments.containsKey("action") != configureTwoFactorAuthFragmentArgs.arguments.containsKey("action")) {
            return false;
        }
        return getAction() == null ? configureTwoFactorAuthFragmentArgs.getAction() == null : getAction().equals(configureTwoFactorAuthFragmentArgs.getAction());
    }

    public String getAction() {
        return (String) this.arguments.get("action");
    }

    public int hashCode() {
        return 31 + (getAction() != null ? getAction().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("action")) {
            bundle.putString("action", (String) this.arguments.get("action"));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("action")) {
            u0Var.h("action", (String) this.arguments.get("action"));
        }
        return u0Var;
    }

    public String toString() {
        return "ConfigureTwoFactorAuthFragmentArgs{action=" + getAction() + "}";
    }

    private ConfigureTwoFactorAuthFragmentArgs() {
        this.arguments = new HashMap();
    }

    private ConfigureTwoFactorAuthFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

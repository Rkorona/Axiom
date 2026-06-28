package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class InstallAuthyFragmentArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private InstallAuthyFragmentArgs() {
        this.arguments = new HashMap();
    }

    public static InstallAuthyFragmentArgs fromBundle(Bundle bundle) {
        InstallAuthyFragmentArgs installAuthyFragmentArgs = new InstallAuthyFragmentArgs();
        bundle.setClassLoader(InstallAuthyFragmentArgs.class.getClassLoader());
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("token");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        installAuthyFragmentArgs.arguments.put("token", string);
        return installAuthyFragmentArgs;
    }

    public static InstallAuthyFragmentArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        InstallAuthyFragmentArgs installAuthyFragmentArgs = new InstallAuthyFragmentArgs();
        if (!u0Var.b("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("token");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        installAuthyFragmentArgs.arguments.put("token", str);
        return installAuthyFragmentArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstallAuthyFragmentArgs installAuthyFragmentArgs = (InstallAuthyFragmentArgs) obj;
        if (this.arguments.containsKey("token") != installAuthyFragmentArgs.arguments.containsKey("token")) {
            return false;
        }
        return getToken() == null ? installAuthyFragmentArgs.getToken() == null : getToken().equals(installAuthyFragmentArgs.getToken());
    }

    public String getToken() {
        return (String) this.arguments.get("token");
    }

    public int hashCode() {
        return 31 + (getToken() != null ? getToken().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("token")) {
            bundle.putString("token", (String) this.arguments.get("token"));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("token")) {
            u0Var.h("token", (String) this.arguments.get("token"));
        }
        return u0Var;
    }

    public String toString() {
        return "InstallAuthyFragmentArgs{token=" + getToken() + "}";
    }

    private InstallAuthyFragmentArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EnableTwoFactorAuthArgs implements w {
    private final HashMap arguments;

    private EnableTwoFactorAuthArgs() {
        this.arguments = new HashMap();
    }

    public static EnableTwoFactorAuthArgs fromBundle(Bundle bundle) {
        EnableTwoFactorAuthArgs enableTwoFactorAuthArgs = new EnableTwoFactorAuthArgs();
        bundle.setClassLoader(EnableTwoFactorAuthArgs.class.getClassLoader());
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("token");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        enableTwoFactorAuthArgs.arguments.put("token", string);
        return enableTwoFactorAuthArgs;
    }

    public static EnableTwoFactorAuthArgs fromSavedStateHandle(u0 u0Var) {
        EnableTwoFactorAuthArgs enableTwoFactorAuthArgs = new EnableTwoFactorAuthArgs();
        if (!u0Var.b("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("token");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        enableTwoFactorAuthArgs.arguments.put("token", str);
        return enableTwoFactorAuthArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableTwoFactorAuthArgs enableTwoFactorAuthArgs = (EnableTwoFactorAuthArgs) obj;
        if (this.arguments.containsKey("token") != enableTwoFactorAuthArgs.arguments.containsKey("token")) {
            return false;
        }
        return getToken() == null ? enableTwoFactorAuthArgs.getToken() == null : getToken().equals(enableTwoFactorAuthArgs.getToken());
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

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("token")) {
            u0Var.h("token", (String) this.arguments.get("token"));
        }
        return u0Var;
    }

    public String toString() {
        return "EnableTwoFactorAuthArgs{token=" + getToken() + "}";
    }

    private EnableTwoFactorAuthArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

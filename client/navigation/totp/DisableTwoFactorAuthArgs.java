package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class DisableTwoFactorAuthArgs implements w {
    private final HashMap arguments;

    private DisableTwoFactorAuthArgs() {
        this.arguments = new HashMap();
    }

    public static DisableTwoFactorAuthArgs fromBundle(Bundle bundle) {
        DisableTwoFactorAuthArgs disableTwoFactorAuthArgs = new DisableTwoFactorAuthArgs();
        bundle.setClassLoader(DisableTwoFactorAuthArgs.class.getClassLoader());
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("token");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        disableTwoFactorAuthArgs.arguments.put("token", string);
        return disableTwoFactorAuthArgs;
    }

    public static DisableTwoFactorAuthArgs fromSavedStateHandle(u0 u0Var) {
        DisableTwoFactorAuthArgs disableTwoFactorAuthArgs = new DisableTwoFactorAuthArgs();
        if (!u0Var.b("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("token");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        disableTwoFactorAuthArgs.arguments.put("token", str);
        return disableTwoFactorAuthArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableTwoFactorAuthArgs disableTwoFactorAuthArgs = (DisableTwoFactorAuthArgs) obj;
        if (this.arguments.containsKey("token") != disableTwoFactorAuthArgs.arguments.containsKey("token")) {
            return false;
        }
        return getToken() == null ? disableTwoFactorAuthArgs.getToken() == null : getToken().equals(disableTwoFactorAuthArgs.getToken());
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
        return "DisableTwoFactorAuthArgs{token=" + getToken() + "}";
    }

    private DisableTwoFactorAuthArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

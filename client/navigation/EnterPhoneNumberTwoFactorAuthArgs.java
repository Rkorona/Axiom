package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EnterPhoneNumberTwoFactorAuthArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private EnterPhoneNumberTwoFactorAuthArgs() {
        this.arguments = new HashMap();
    }

    public static EnterPhoneNumberTwoFactorAuthArgs fromBundle(Bundle bundle) {
        EnterPhoneNumberTwoFactorAuthArgs enterPhoneNumberTwoFactorAuthArgs = new EnterPhoneNumberTwoFactorAuthArgs();
        bundle.setClassLoader(EnterPhoneNumberTwoFactorAuthArgs.class.getClassLoader());
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("token");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        enterPhoneNumberTwoFactorAuthArgs.arguments.put("token", string);
        return enterPhoneNumberTwoFactorAuthArgs;
    }

    public static EnterPhoneNumberTwoFactorAuthArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        EnterPhoneNumberTwoFactorAuthArgs enterPhoneNumberTwoFactorAuthArgs = new EnterPhoneNumberTwoFactorAuthArgs();
        if (!u0Var.b("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("token");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        enterPhoneNumberTwoFactorAuthArgs.arguments.put("token", str);
        return enterPhoneNumberTwoFactorAuthArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterPhoneNumberTwoFactorAuthArgs enterPhoneNumberTwoFactorAuthArgs = (EnterPhoneNumberTwoFactorAuthArgs) obj;
        if (this.arguments.containsKey("token") != enterPhoneNumberTwoFactorAuthArgs.arguments.containsKey("token")) {
            return false;
        }
        return getToken() == null ? enterPhoneNumberTwoFactorAuthArgs.getToken() == null : getToken().equals(enterPhoneNumberTwoFactorAuthArgs.getToken());
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
        return "EnterPhoneNumberTwoFactorAuthArgs{token=" + getToken() + "}";
    }

    private EnterPhoneNumberTwoFactorAuthArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

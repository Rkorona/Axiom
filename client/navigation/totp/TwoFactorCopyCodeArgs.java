package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TwoFactorCopyCodeArgs implements w {
    private final HashMap arguments;

    private TwoFactorCopyCodeArgs() {
        this.arguments = new HashMap();
    }

    public static TwoFactorCopyCodeArgs fromBundle(Bundle bundle) {
        TwoFactorCopyCodeArgs twoFactorCopyCodeArgs = new TwoFactorCopyCodeArgs();
        bundle.setClassLoader(TwoFactorCopyCodeArgs.class.getClassLoader());
        if (!bundle.containsKey("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("token");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("token", string);
        if (!bundle.containsKey("providerCode")) {
            throw new IllegalArgumentException("Required argument \"providerCode\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("providerCode");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"providerCode\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("providerCode", string2);
        if (!bundle.containsKey("issuer")) {
            throw new IllegalArgumentException("Required argument \"issuer\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("issuer");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"issuer\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("issuer", string3);
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("email");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("email", string4);
        return twoFactorCopyCodeArgs;
    }

    public static TwoFactorCopyCodeArgs fromSavedStateHandle(u0 u0Var) {
        TwoFactorCopyCodeArgs twoFactorCopyCodeArgs = new TwoFactorCopyCodeArgs();
        if (!u0Var.b("token")) {
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("token");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("token", str);
        if (!u0Var.b("providerCode")) {
            throw new IllegalArgumentException("Required argument \"providerCode\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("providerCode");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"providerCode\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("providerCode", str2);
        if (!u0Var.b("issuer")) {
            throw new IllegalArgumentException("Required argument \"issuer\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) u0Var.c("issuer");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"issuer\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("issuer", str3);
        if (!u0Var.b("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) u0Var.c("email");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        twoFactorCopyCodeArgs.arguments.put("email", str4);
        return twoFactorCopyCodeArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TwoFactorCopyCodeArgs twoFactorCopyCodeArgs = (TwoFactorCopyCodeArgs) obj;
        if (this.arguments.containsKey("token") != twoFactorCopyCodeArgs.arguments.containsKey("token")) {
            return false;
        }
        if (getToken() == null ? twoFactorCopyCodeArgs.getToken() != null : !getToken().equals(twoFactorCopyCodeArgs.getToken())) {
            return false;
        }
        if (this.arguments.containsKey("providerCode") != twoFactorCopyCodeArgs.arguments.containsKey("providerCode")) {
            return false;
        }
        if (getProviderCode() == null ? twoFactorCopyCodeArgs.getProviderCode() != null : !getProviderCode().equals(twoFactorCopyCodeArgs.getProviderCode())) {
            return false;
        }
        if (this.arguments.containsKey("issuer") != twoFactorCopyCodeArgs.arguments.containsKey("issuer")) {
            return false;
        }
        if (getIssuer() == null ? twoFactorCopyCodeArgs.getIssuer() != null : !getIssuer().equals(twoFactorCopyCodeArgs.getIssuer())) {
            return false;
        }
        if (this.arguments.containsKey("email") != twoFactorCopyCodeArgs.arguments.containsKey("email")) {
            return false;
        }
        return getEmail() == null ? twoFactorCopyCodeArgs.getEmail() == null : getEmail().equals(twoFactorCopyCodeArgs.getEmail());
    }

    public String getEmail() {
        return (String) this.arguments.get("email");
    }

    public String getIssuer() {
        return (String) this.arguments.get("issuer");
    }

    public String getProviderCode() {
        return (String) this.arguments.get("providerCode");
    }

    public String getToken() {
        return (String) this.arguments.get("token");
    }

    public int hashCode() {
        return (((((((getToken() != null ? getToken().hashCode() : 0) + 31) * 31) + (getProviderCode() != null ? getProviderCode().hashCode() : 0)) * 31) + (getIssuer() != null ? getIssuer().hashCode() : 0)) * 31) + (getEmail() != null ? getEmail().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("token")) {
            bundle.putString("token", (String) this.arguments.get("token"));
        }
        if (this.arguments.containsKey("providerCode")) {
            bundle.putString("providerCode", (String) this.arguments.get("providerCode"));
        }
        if (this.arguments.containsKey("issuer")) {
            bundle.putString("issuer", (String) this.arguments.get("issuer"));
        }
        if (this.arguments.containsKey("email")) {
            bundle.putString("email", (String) this.arguments.get("email"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("token")) {
            u0Var.h("token", (String) this.arguments.get("token"));
        }
        if (this.arguments.containsKey("providerCode")) {
            u0Var.h("providerCode", (String) this.arguments.get("providerCode"));
        }
        if (this.arguments.containsKey("issuer")) {
            u0Var.h("issuer", (String) this.arguments.get("issuer"));
        }
        if (this.arguments.containsKey("email")) {
            u0Var.h("email", (String) this.arguments.get("email"));
        }
        return u0Var;
    }

    public String toString() {
        return "TwoFactorCopyCodeArgs{token=" + getToken() + ", providerCode=" + getProviderCode() + ", issuer=" + getIssuer() + ", email=" + getEmail() + "}";
    }

    private TwoFactorCopyCodeArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

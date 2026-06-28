package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SignInEnterEmailScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private SignInEnterEmailScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SignInEnterEmailScreenArgs fromBundle(Bundle bundle) {
        SignInEnterEmailScreenArgs signInEnterEmailScreenArgs = new SignInEnterEmailScreenArgs();
        bundle.setClassLoader(SignInEnterEmailScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        signInEnterEmailScreenArgs.arguments.put("featureType", Integer.valueOf(bundle.getInt("featureType")));
        if (!bundle.containsKey("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        signInEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", Boolean.valueOf(bundle.getBoolean("needSyncKeysAndPasswords")));
        if (!bundle.containsKey("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        signInEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", Boolean.valueOf(bundle.getBoolean("needCreateTrialAccount")));
        return signInEnterEmailScreenArgs;
    }

    public static SignInEnterEmailScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        SignInEnterEmailScreenArgs signInEnterEmailScreenArgs = new SignInEnterEmailScreenArgs();
        if (!u0Var.b("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("featureType");
        num.intValue();
        signInEnterEmailScreenArgs.arguments.put("featureType", num);
        if (!u0Var.b("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("needSyncKeysAndPasswords");
        bool.booleanValue();
        signInEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", bool);
        if (!u0Var.b("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("needCreateTrialAccount");
        bool2.booleanValue();
        signInEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", bool2);
        return signInEnterEmailScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignInEnterEmailScreenArgs signInEnterEmailScreenArgs = (SignInEnterEmailScreenArgs) obj;
        return this.arguments.containsKey("featureType") == signInEnterEmailScreenArgs.arguments.containsKey("featureType") && getFeatureType() == signInEnterEmailScreenArgs.getFeatureType() && this.arguments.containsKey("needSyncKeysAndPasswords") == signInEnterEmailScreenArgs.arguments.containsKey("needSyncKeysAndPasswords") && getNeedSyncKeysAndPasswords() == signInEnterEmailScreenArgs.getNeedSyncKeysAndPasswords() && this.arguments.containsKey("needCreateTrialAccount") == signInEnterEmailScreenArgs.arguments.containsKey("needCreateTrialAccount") && getNeedCreateTrialAccount() == signInEnterEmailScreenArgs.getNeedCreateTrialAccount();
    }

    public int getFeatureType() {
        return ((Integer) this.arguments.get("featureType")).intValue();
    }

    public boolean getNeedCreateTrialAccount() {
        return ((Boolean) this.arguments.get("needCreateTrialAccount")).booleanValue();
    }

    public boolean getNeedSyncKeysAndPasswords() {
        return ((Boolean) this.arguments.get("needSyncKeysAndPasswords")).booleanValue();
    }

    public int hashCode() {
        return ((((getFeatureType() + 31) * 31) + (getNeedSyncKeysAndPasswords() ? 1 : 0)) * 31) + (getNeedCreateTrialAccount() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("featureType")) {
            bundle.putInt("featureType", ((Integer) this.arguments.get("featureType")).intValue());
        }
        if (this.arguments.containsKey("needSyncKeysAndPasswords")) {
            bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.arguments.get("needSyncKeysAndPasswords")).booleanValue());
        }
        if (this.arguments.containsKey("needCreateTrialAccount")) {
            bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.arguments.get("needCreateTrialAccount")).booleanValue());
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("featureType")) {
            Integer num = (Integer) this.arguments.get("featureType");
            num.intValue();
            u0Var.h("featureType", num);
        }
        if (this.arguments.containsKey("needSyncKeysAndPasswords")) {
            Boolean bool = (Boolean) this.arguments.get("needSyncKeysAndPasswords");
            bool.booleanValue();
            u0Var.h("needSyncKeysAndPasswords", bool);
        }
        if (this.arguments.containsKey("needCreateTrialAccount")) {
            Boolean bool2 = (Boolean) this.arguments.get("needCreateTrialAccount");
            bool2.booleanValue();
            u0Var.h("needCreateTrialAccount", bool2);
        }
        return u0Var;
    }

    public String toString() {
        return "SignInEnterEmailScreenArgs{featureType=" + getFeatureType() + ", needSyncKeysAndPasswords=" + getNeedSyncKeysAndPasswords() + ", needCreateTrialAccount=" + getNeedCreateTrialAccount() + "}";
    }

    private SignInEnterEmailScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

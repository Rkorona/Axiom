package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpEnterEmailScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private SignUpEnterEmailScreenArgs() {
        this.arguments = new HashMap();
    }

    public static SignUpEnterEmailScreenArgs fromBundle(Bundle bundle) {
        SignUpEnterEmailScreenArgs signUpEnterEmailScreenArgs = new SignUpEnterEmailScreenArgs();
        bundle.setClassLoader(SignUpEnterEmailScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        signUpEnterEmailScreenArgs.arguments.put("featureType", Integer.valueOf(bundle.getInt("featureType")));
        if (!bundle.containsKey("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        signUpEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", Boolean.valueOf(bundle.getBoolean("needCreateTrialAccount")));
        if (!bundle.containsKey("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        signUpEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", Boolean.valueOf(bundle.getBoolean("needSyncKeysAndPasswords")));
        return signUpEnterEmailScreenArgs;
    }

    public static SignUpEnterEmailScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        SignUpEnterEmailScreenArgs signUpEnterEmailScreenArgs = new SignUpEnterEmailScreenArgs();
        if (!u0Var.b("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("featureType");
        num.intValue();
        signUpEnterEmailScreenArgs.arguments.put("featureType", num);
        if (!u0Var.b("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("needCreateTrialAccount");
        bool.booleanValue();
        signUpEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", bool);
        if (!u0Var.b("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("needSyncKeysAndPasswords");
        bool2.booleanValue();
        signUpEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", bool2);
        return signUpEnterEmailScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignUpEnterEmailScreenArgs signUpEnterEmailScreenArgs = (SignUpEnterEmailScreenArgs) obj;
        return this.arguments.containsKey("featureType") == signUpEnterEmailScreenArgs.arguments.containsKey("featureType") && getFeatureType() == signUpEnterEmailScreenArgs.getFeatureType() && this.arguments.containsKey("needCreateTrialAccount") == signUpEnterEmailScreenArgs.arguments.containsKey("needCreateTrialAccount") && getNeedCreateTrialAccount() == signUpEnterEmailScreenArgs.getNeedCreateTrialAccount() && this.arguments.containsKey("needSyncKeysAndPasswords") == signUpEnterEmailScreenArgs.arguments.containsKey("needSyncKeysAndPasswords") && getNeedSyncKeysAndPasswords() == signUpEnterEmailScreenArgs.getNeedSyncKeysAndPasswords();
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
        return ((((getFeatureType() + 31) * 31) + (getNeedCreateTrialAccount() ? 1 : 0)) * 31) + (getNeedSyncKeysAndPasswords() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("featureType")) {
            bundle.putInt("featureType", ((Integer) this.arguments.get("featureType")).intValue());
        }
        if (this.arguments.containsKey("needCreateTrialAccount")) {
            bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.arguments.get("needCreateTrialAccount")).booleanValue());
        }
        if (this.arguments.containsKey("needSyncKeysAndPasswords")) {
            bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.arguments.get("needSyncKeysAndPasswords")).booleanValue());
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
        if (this.arguments.containsKey("needCreateTrialAccount")) {
            Boolean bool = (Boolean) this.arguments.get("needCreateTrialAccount");
            bool.booleanValue();
            u0Var.h("needCreateTrialAccount", bool);
        }
        if (this.arguments.containsKey("needSyncKeysAndPasswords")) {
            Boolean bool2 = (Boolean) this.arguments.get("needSyncKeysAndPasswords");
            bool2.booleanValue();
            u0Var.h("needSyncKeysAndPasswords", bool2);
        }
        return u0Var;
    }

    public String toString() {
        return "SignUpEnterEmailScreenArgs{featureType=" + getFeatureType() + ", needCreateTrialAccount=" + getNeedCreateTrialAccount() + ", needSyncKeysAndPasswords=" + getNeedSyncKeysAndPasswords() + "}";
    }

    private SignUpEnterEmailScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

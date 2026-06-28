package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpChooserScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25711a;

        public a(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25711a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }

        public SignUpChooserScreenArgs a() {
            return new SignUpChooserScreenArgs(this.f25711a);
        }

        public a b(boolean z10) {
            this.f25711a.put("needCreateTrialAccount", Boolean.valueOf(z10));
            return this;
        }
    }

    public static SignUpChooserScreenArgs fromBundle(Bundle bundle) {
        SignUpChooserScreenArgs signUpChooserScreenArgs = new SignUpChooserScreenArgs();
        bundle.setClassLoader(SignUpChooserScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        signUpChooserScreenArgs.arguments.put("featureType", Integer.valueOf(bundle.getInt("featureType")));
        if (!bundle.containsKey("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        signUpChooserScreenArgs.arguments.put("needSyncKeysAndPasswords", Boolean.valueOf(bundle.getBoolean("needSyncKeysAndPasswords")));
        if (!bundle.containsKey("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        signUpChooserScreenArgs.arguments.put("needCreateTrialAccount", Boolean.valueOf(bundle.getBoolean("needCreateTrialAccount")));
        return signUpChooserScreenArgs;
    }

    public static SignUpChooserScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        SignUpChooserScreenArgs signUpChooserScreenArgs = new SignUpChooserScreenArgs();
        if (!u0Var.b("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("featureType");
        num.intValue();
        signUpChooserScreenArgs.arguments.put("featureType", num);
        if (!u0Var.b("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("needSyncKeysAndPasswords");
        bool.booleanValue();
        signUpChooserScreenArgs.arguments.put("needSyncKeysAndPasswords", bool);
        if (!u0Var.b("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("needCreateTrialAccount");
        bool2.booleanValue();
        signUpChooserScreenArgs.arguments.put("needCreateTrialAccount", bool2);
        return signUpChooserScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignUpChooserScreenArgs signUpChooserScreenArgs = (SignUpChooserScreenArgs) obj;
        return this.arguments.containsKey("featureType") == signUpChooserScreenArgs.arguments.containsKey("featureType") && getFeatureType() == signUpChooserScreenArgs.getFeatureType() && this.arguments.containsKey("needSyncKeysAndPasswords") == signUpChooserScreenArgs.arguments.containsKey("needSyncKeysAndPasswords") && getNeedSyncKeysAndPasswords() == signUpChooserScreenArgs.getNeedSyncKeysAndPasswords() && this.arguments.containsKey("needCreateTrialAccount") == signUpChooserScreenArgs.arguments.containsKey("needCreateTrialAccount") && getNeedCreateTrialAccount() == signUpChooserScreenArgs.getNeedCreateTrialAccount();
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
        return "SignUpChooserScreenArgs{featureType=" + getFeatureType() + ", needSyncKeysAndPasswords=" + getNeedSyncKeysAndPasswords() + ", needCreateTrialAccount=" + getNeedCreateTrialAccount() + "}";
    }

    private SignUpChooserScreenArgs() {
        this.arguments = new HashMap();
    }

    private SignUpChooserScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

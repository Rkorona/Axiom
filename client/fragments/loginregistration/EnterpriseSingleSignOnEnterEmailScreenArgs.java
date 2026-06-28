package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EnterpriseSingleSignOnEnterEmailScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private EnterpriseSingleSignOnEnterEmailScreenArgs() {
        this.arguments = new HashMap();
    }

    public static EnterpriseSingleSignOnEnterEmailScreenArgs fromBundle(Bundle bundle) {
        EnterpriseSingleSignOnEnterEmailScreenArgs enterpriseSingleSignOnEnterEmailScreenArgs = new EnterpriseSingleSignOnEnterEmailScreenArgs();
        bundle.setClassLoader(EnterpriseSingleSignOnEnterEmailScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("featureType", Integer.valueOf(bundle.getInt("featureType")));
        if (!bundle.containsKey("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(EmailAuthentication.class) && !Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
            throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("authenticationModel", (EmailAuthentication) bundle.get("authenticationModel"));
        if (!bundle.containsKey("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", Boolean.valueOf(bundle.getBoolean("needCreateTrialAccount")));
        if (!bundle.containsKey("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", Boolean.valueOf(bundle.getBoolean("needSyncKeysAndPasswords")));
        return enterpriseSingleSignOnEnterEmailScreenArgs;
    }

    public static EnterpriseSingleSignOnEnterEmailScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        EnterpriseSingleSignOnEnterEmailScreenArgs enterpriseSingleSignOnEnterEmailScreenArgs = new EnterpriseSingleSignOnEnterEmailScreenArgs();
        if (!u0Var.b("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("featureType");
        num.intValue();
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("featureType", num);
        if (!u0Var.b("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("authenticationModel", (EmailAuthentication) u0Var.c("authenticationModel"));
        if (!u0Var.b("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("needCreateTrialAccount");
        bool.booleanValue();
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("needCreateTrialAccount", bool);
        if (!u0Var.b("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("needSyncKeysAndPasswords");
        bool2.booleanValue();
        enterpriseSingleSignOnEnterEmailScreenArgs.arguments.put("needSyncKeysAndPasswords", bool2);
        return enterpriseSingleSignOnEnterEmailScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseSingleSignOnEnterEmailScreenArgs enterpriseSingleSignOnEnterEmailScreenArgs = (EnterpriseSingleSignOnEnterEmailScreenArgs) obj;
        if (this.arguments.containsKey("featureType") != enterpriseSingleSignOnEnterEmailScreenArgs.arguments.containsKey("featureType") || getFeatureType() != enterpriseSingleSignOnEnterEmailScreenArgs.getFeatureType() || this.arguments.containsKey("authenticationModel") != enterpriseSingleSignOnEnterEmailScreenArgs.arguments.containsKey("authenticationModel")) {
            return false;
        }
        if (getAuthenticationModel() == null ? enterpriseSingleSignOnEnterEmailScreenArgs.getAuthenticationModel() == null : getAuthenticationModel().equals(enterpriseSingleSignOnEnterEmailScreenArgs.getAuthenticationModel())) {
            return this.arguments.containsKey("needCreateTrialAccount") == enterpriseSingleSignOnEnterEmailScreenArgs.arguments.containsKey("needCreateTrialAccount") && getNeedCreateTrialAccount() == enterpriseSingleSignOnEnterEmailScreenArgs.getNeedCreateTrialAccount() && this.arguments.containsKey("needSyncKeysAndPasswords") == enterpriseSingleSignOnEnterEmailScreenArgs.arguments.containsKey("needSyncKeysAndPasswords") && getNeedSyncKeysAndPasswords() == enterpriseSingleSignOnEnterEmailScreenArgs.getNeedSyncKeysAndPasswords();
        }
        return false;
    }

    public EmailAuthentication getAuthenticationModel() {
        return (EmailAuthentication) this.arguments.get("authenticationModel");
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
        return ((((((getFeatureType() + 31) * 31) + (getAuthenticationModel() != null ? getAuthenticationModel().hashCode() : 0)) * 31) + (getNeedCreateTrialAccount() ? 1 : 0)) * 31) + (getNeedSyncKeysAndPasswords() ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("featureType")) {
            bundle.putInt("featureType", ((Integer) this.arguments.get("featureType")).intValue());
        }
        if (this.arguments.containsKey("authenticationModel")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("authenticationModel");
            if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(emailAuthentication));
            } else {
                if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(emailAuthentication));
            }
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
        if (this.arguments.containsKey("authenticationModel")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("authenticationModel");
            if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                u0Var.h("authenticationModel", (Parcelable) Parcelable.class.cast(emailAuthentication));
            } else {
                if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("authenticationModel", (Serializable) Serializable.class.cast(emailAuthentication));
            }
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
        return "EnterpriseSingleSignOnEnterEmailScreenArgs{featureType=" + getFeatureType() + ", authenticationModel=" + getAuthenticationModel() + ", needCreateTrialAccount=" + getNeedCreateTrialAccount() + ", needSyncKeysAndPasswords=" + getNeedSyncKeysAndPasswords() + "}";
    }

    private EnterpriseSingleSignOnEnterEmailScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

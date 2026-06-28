package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ResetPasswordInstructionsSentScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private ResetPasswordInstructionsSentScreenArgs() {
        this.arguments = new HashMap();
    }

    public static ResetPasswordInstructionsSentScreenArgs fromBundle(Bundle bundle) {
        ResetPasswordInstructionsSentScreenArgs resetPasswordInstructionsSentScreenArgs = new ResetPasswordInstructionsSentScreenArgs();
        bundle.setClassLoader(ResetPasswordInstructionsSentScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        resetPasswordInstructionsSentScreenArgs.arguments.put("featureType", Integer.valueOf(bundle.getInt("featureType")));
        if (!bundle.containsKey("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(AuthenticationModel.class) && !Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
            throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        AuthenticationModel authenticationModel = (AuthenticationModel) bundle.get("authenticationModel");
        if (authenticationModel == null) {
            throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
        }
        resetPasswordInstructionsSentScreenArgs.arguments.put("authenticationModel", authenticationModel);
        if (!bundle.containsKey("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        resetPasswordInstructionsSentScreenArgs.arguments.put("needCreateTrialAccount", Boolean.valueOf(bundle.getBoolean("needCreateTrialAccount")));
        if (!bundle.containsKey("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        resetPasswordInstructionsSentScreenArgs.arguments.put("needSyncKeysAndPasswords", Boolean.valueOf(bundle.getBoolean("needSyncKeysAndPasswords")));
        return resetPasswordInstructionsSentScreenArgs;
    }

    public static ResetPasswordInstructionsSentScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        ResetPasswordInstructionsSentScreenArgs resetPasswordInstructionsSentScreenArgs = new ResetPasswordInstructionsSentScreenArgs();
        if (!u0Var.b("featureType")) {
            throw new IllegalArgumentException("Required argument \"featureType\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) u0Var.c("featureType");
        num.intValue();
        resetPasswordInstructionsSentScreenArgs.arguments.put("featureType", num);
        if (!u0Var.b("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        AuthenticationModel authenticationModel = (AuthenticationModel) u0Var.c("authenticationModel");
        if (authenticationModel == null) {
            throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
        }
        resetPasswordInstructionsSentScreenArgs.arguments.put("authenticationModel", authenticationModel);
        if (!u0Var.b("needCreateTrialAccount")) {
            throw new IllegalArgumentException("Required argument \"needCreateTrialAccount\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("needCreateTrialAccount");
        bool.booleanValue();
        resetPasswordInstructionsSentScreenArgs.arguments.put("needCreateTrialAccount", bool);
        if (!u0Var.b("needSyncKeysAndPasswords")) {
            throw new IllegalArgumentException("Required argument \"needSyncKeysAndPasswords\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) u0Var.c("needSyncKeysAndPasswords");
        bool2.booleanValue();
        resetPasswordInstructionsSentScreenArgs.arguments.put("needSyncKeysAndPasswords", bool2);
        return resetPasswordInstructionsSentScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetPasswordInstructionsSentScreenArgs resetPasswordInstructionsSentScreenArgs = (ResetPasswordInstructionsSentScreenArgs) obj;
        if (this.arguments.containsKey("featureType") != resetPasswordInstructionsSentScreenArgs.arguments.containsKey("featureType") || getFeatureType() != resetPasswordInstructionsSentScreenArgs.getFeatureType() || this.arguments.containsKey("authenticationModel") != resetPasswordInstructionsSentScreenArgs.arguments.containsKey("authenticationModel")) {
            return false;
        }
        if (getAuthenticationModel() == null ? resetPasswordInstructionsSentScreenArgs.getAuthenticationModel() == null : getAuthenticationModel().equals(resetPasswordInstructionsSentScreenArgs.getAuthenticationModel())) {
            return this.arguments.containsKey("needCreateTrialAccount") == resetPasswordInstructionsSentScreenArgs.arguments.containsKey("needCreateTrialAccount") && getNeedCreateTrialAccount() == resetPasswordInstructionsSentScreenArgs.getNeedCreateTrialAccount() && this.arguments.containsKey("needSyncKeysAndPasswords") == resetPasswordInstructionsSentScreenArgs.arguments.containsKey("needSyncKeysAndPasswords") && getNeedSyncKeysAndPasswords() == resetPasswordInstructionsSentScreenArgs.getNeedSyncKeysAndPasswords();
        }
        return false;
    }

    public AuthenticationModel getAuthenticationModel() {
        return (AuthenticationModel) this.arguments.get("authenticationModel");
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
            AuthenticationModel authenticationModel = (AuthenticationModel) this.arguments.get("authenticationModel");
            if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
            } else {
                if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                    throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
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
            AuthenticationModel authenticationModel = (AuthenticationModel) this.arguments.get("authenticationModel");
            if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                u0Var.h("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
            } else {
                if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                    throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
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
        return "ResetPasswordInstructionsSentScreenArgs{featureType=" + getFeatureType() + ", authenticationModel=" + getAuthenticationModel() + ", needCreateTrialAccount=" + getNeedCreateTrialAccount() + ", needSyncKeysAndPasswords=" + getNeedSyncKeysAndPasswords() + "}";
    }

    private ResetPasswordInstructionsSentScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

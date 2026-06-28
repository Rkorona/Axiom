package com.server.auditor.ssh.client.navigation.account;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MasterPasswordEnterPasswordScreenArgs implements w {
    private final HashMap arguments;

    private MasterPasswordEnterPasswordScreenArgs() {
        this.arguments = new HashMap();
    }

    public static MasterPasswordEnterPasswordScreenArgs fromBundle(Bundle bundle) {
        MasterPasswordEnterPasswordScreenArgs masterPasswordEnterPasswordScreenArgs = new MasterPasswordEnterPasswordScreenArgs();
        bundle.setClassLoader(MasterPasswordEnterPasswordScreenArgs.class.getClassLoader());
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
        masterPasswordEnterPasswordScreenArgs.arguments.put("authenticationModel", authenticationModel);
        return masterPasswordEnterPasswordScreenArgs;
    }

    public static MasterPasswordEnterPasswordScreenArgs fromSavedStateHandle(u0 u0Var) {
        MasterPasswordEnterPasswordScreenArgs masterPasswordEnterPasswordScreenArgs = new MasterPasswordEnterPasswordScreenArgs();
        if (!u0Var.b("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        AuthenticationModel authenticationModel = (AuthenticationModel) u0Var.c("authenticationModel");
        if (authenticationModel == null) {
            throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
        }
        masterPasswordEnterPasswordScreenArgs.arguments.put("authenticationModel", authenticationModel);
        return masterPasswordEnterPasswordScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterPasswordEnterPasswordScreenArgs masterPasswordEnterPasswordScreenArgs = (MasterPasswordEnterPasswordScreenArgs) obj;
        if (this.arguments.containsKey("authenticationModel") != masterPasswordEnterPasswordScreenArgs.arguments.containsKey("authenticationModel")) {
            return false;
        }
        return getAuthenticationModel() == null ? masterPasswordEnterPasswordScreenArgs.getAuthenticationModel() == null : getAuthenticationModel().equals(masterPasswordEnterPasswordScreenArgs.getAuthenticationModel());
    }

    public AuthenticationModel getAuthenticationModel() {
        return (AuthenticationModel) this.arguments.get("authenticationModel");
    }

    public int hashCode() {
        return 31 + (getAuthenticationModel() != null ? getAuthenticationModel().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("authenticationModel")) {
            AuthenticationModel authenticationModel = (AuthenticationModel) this.arguments.get("authenticationModel");
            if (!Parcelable.class.isAssignableFrom(AuthenticationModel.class) && authenticationModel != null) {
                if (Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                    return bundle;
                }
                throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("authenticationModel")) {
            AuthenticationModel authenticationModel = (AuthenticationModel) this.arguments.get("authenticationModel");
            if (!Parcelable.class.isAssignableFrom(AuthenticationModel.class) && authenticationModel != null) {
                if (Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                    u0Var.h("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                    return u0Var;
                }
                throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
        }
        return u0Var;
    }

    public String toString() {
        return "MasterPasswordEnterPasswordScreenArgs{authenticationModel=" + getAuthenticationModel() + "}";
    }

    private MasterPasswordEnterPasswordScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

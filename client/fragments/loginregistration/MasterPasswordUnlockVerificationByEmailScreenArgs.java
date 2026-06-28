package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MasterPasswordUnlockVerificationByEmailScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private MasterPasswordUnlockVerificationByEmailScreenArgs() {
        this.arguments = new HashMap();
    }

    public static MasterPasswordUnlockVerificationByEmailScreenArgs fromBundle(Bundle bundle) {
        MasterPasswordUnlockVerificationByEmailScreenArgs masterPasswordUnlockVerificationByEmailScreenArgs = new MasterPasswordUnlockVerificationByEmailScreenArgs();
        bundle.setClassLoader(MasterPasswordUnlockVerificationByEmailScreenArgs.class.getClassLoader());
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
        masterPasswordUnlockVerificationByEmailScreenArgs.arguments.put("authenticationModel", authenticationModel);
        if (!bundle.containsKey("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("encodedPasswordHex");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        masterPasswordUnlockVerificationByEmailScreenArgs.arguments.put("encodedPasswordHex", string);
        return masterPasswordUnlockVerificationByEmailScreenArgs;
    }

    public static MasterPasswordUnlockVerificationByEmailScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        MasterPasswordUnlockVerificationByEmailScreenArgs masterPasswordUnlockVerificationByEmailScreenArgs = new MasterPasswordUnlockVerificationByEmailScreenArgs();
        if (!u0Var.b("authenticationModel")) {
            throw new IllegalArgumentException("Required argument \"authenticationModel\" is missing and does not have an android:defaultValue");
        }
        AuthenticationModel authenticationModel = (AuthenticationModel) u0Var.c("authenticationModel");
        if (authenticationModel == null) {
            throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
        }
        masterPasswordUnlockVerificationByEmailScreenArgs.arguments.put("authenticationModel", authenticationModel);
        if (!u0Var.b("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("encodedPasswordHex");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        masterPasswordUnlockVerificationByEmailScreenArgs.arguments.put("encodedPasswordHex", str);
        return masterPasswordUnlockVerificationByEmailScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterPasswordUnlockVerificationByEmailScreenArgs masterPasswordUnlockVerificationByEmailScreenArgs = (MasterPasswordUnlockVerificationByEmailScreenArgs) obj;
        if (this.arguments.containsKey("authenticationModel") != masterPasswordUnlockVerificationByEmailScreenArgs.arguments.containsKey("authenticationModel")) {
            return false;
        }
        if (getAuthenticationModel() == null ? masterPasswordUnlockVerificationByEmailScreenArgs.getAuthenticationModel() != null : !getAuthenticationModel().equals(masterPasswordUnlockVerificationByEmailScreenArgs.getAuthenticationModel())) {
            return false;
        }
        if (this.arguments.containsKey("encodedPasswordHex") != masterPasswordUnlockVerificationByEmailScreenArgs.arguments.containsKey("encodedPasswordHex")) {
            return false;
        }
        return getEncodedPasswordHex() == null ? masterPasswordUnlockVerificationByEmailScreenArgs.getEncodedPasswordHex() == null : getEncodedPasswordHex().equals(masterPasswordUnlockVerificationByEmailScreenArgs.getEncodedPasswordHex());
    }

    public AuthenticationModel getAuthenticationModel() {
        return (AuthenticationModel) this.arguments.get("authenticationModel");
    }

    public String getEncodedPasswordHex() {
        return (String) this.arguments.get("encodedPasswordHex");
    }

    public int hashCode() {
        return (((getAuthenticationModel() != null ? getAuthenticationModel().hashCode() : 0) + 31) * 31) + (getEncodedPasswordHex() != null ? getEncodedPasswordHex().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
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
        if (this.arguments.containsKey("encodedPasswordHex")) {
            bundle.putString("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
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
        if (this.arguments.containsKey("encodedPasswordHex")) {
            u0Var.h("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return u0Var;
    }

    public String toString() {
        return "MasterPasswordUnlockVerificationByEmailScreenArgs{authenticationModel=" + getAuthenticationModel() + ", encodedPasswordHex=" + getEncodedPasswordHex() + "}";
    }

    private MasterPasswordUnlockVerificationByEmailScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeEmailRequireTwoFactorCodeArgs implements w {
    private final HashMap arguments;

    private ChangeEmailRequireTwoFactorCodeArgs() {
        this.arguments = new HashMap();
    }

    public static ChangeEmailRequireTwoFactorCodeArgs fromBundle(Bundle bundle) {
        ChangeEmailRequireTwoFactorCodeArgs changeEmailRequireTwoFactorCodeArgs = new ChangeEmailRequireTwoFactorCodeArgs();
        bundle.setClassLoader(ChangeEmailRequireTwoFactorCodeArgs.class.getClassLoader());
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        changeEmailRequireTwoFactorCodeArgs.arguments.put("email", string);
        if (!bundle.containsKey("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("encodedPasswordHex");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changeEmailRequireTwoFactorCodeArgs.arguments.put("encodedPasswordHex", string2);
        return changeEmailRequireTwoFactorCodeArgs;
    }

    public static ChangeEmailRequireTwoFactorCodeArgs fromSavedStateHandle(u0 u0Var) {
        ChangeEmailRequireTwoFactorCodeArgs changeEmailRequireTwoFactorCodeArgs = new ChangeEmailRequireTwoFactorCodeArgs();
        if (!u0Var.b("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("email");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        changeEmailRequireTwoFactorCodeArgs.arguments.put("email", str);
        if (!u0Var.b("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("encodedPasswordHex");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changeEmailRequireTwoFactorCodeArgs.arguments.put("encodedPasswordHex", str2);
        return changeEmailRequireTwoFactorCodeArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeEmailRequireTwoFactorCodeArgs changeEmailRequireTwoFactorCodeArgs = (ChangeEmailRequireTwoFactorCodeArgs) obj;
        if (this.arguments.containsKey("email") != changeEmailRequireTwoFactorCodeArgs.arguments.containsKey("email")) {
            return false;
        }
        if (getEmail() == null ? changeEmailRequireTwoFactorCodeArgs.getEmail() != null : !getEmail().equals(changeEmailRequireTwoFactorCodeArgs.getEmail())) {
            return false;
        }
        if (this.arguments.containsKey("encodedPasswordHex") != changeEmailRequireTwoFactorCodeArgs.arguments.containsKey("encodedPasswordHex")) {
            return false;
        }
        return getEncodedPasswordHex() == null ? changeEmailRequireTwoFactorCodeArgs.getEncodedPasswordHex() == null : getEncodedPasswordHex().equals(changeEmailRequireTwoFactorCodeArgs.getEncodedPasswordHex());
    }

    public String getEmail() {
        return (String) this.arguments.get("email");
    }

    public String getEncodedPasswordHex() {
        return (String) this.arguments.get("encodedPasswordHex");
    }

    public int hashCode() {
        return (((getEmail() != null ? getEmail().hashCode() : 0) + 31) * 31) + (getEncodedPasswordHex() != null ? getEncodedPasswordHex().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("email")) {
            bundle.putString("email", (String) this.arguments.get("email"));
        }
        if (this.arguments.containsKey("encodedPasswordHex")) {
            bundle.putString("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("email")) {
            u0Var.h("email", (String) this.arguments.get("email"));
        }
        if (this.arguments.containsKey("encodedPasswordHex")) {
            u0Var.h("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return u0Var;
    }

    public String toString() {
        return "ChangeEmailRequireTwoFactorCodeArgs{email=" + getEmail() + ", encodedPasswordHex=" + getEncodedPasswordHex() + "}";
    }

    private ChangeEmailRequireTwoFactorCodeArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

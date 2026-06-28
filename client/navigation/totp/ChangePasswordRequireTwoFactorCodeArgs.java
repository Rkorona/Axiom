package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ChangePasswordRequireTwoFactorCodeArgs implements w {
    private final HashMap arguments;

    private ChangePasswordRequireTwoFactorCodeArgs() {
        this.arguments = new HashMap();
    }

    public static ChangePasswordRequireTwoFactorCodeArgs fromBundle(Bundle bundle) {
        ChangePasswordRequireTwoFactorCodeArgs changePasswordRequireTwoFactorCodeArgs = new ChangePasswordRequireTwoFactorCodeArgs();
        bundle.setClassLoader(ChangePasswordRequireTwoFactorCodeArgs.class.getClassLoader());
        if (!bundle.containsKey("oldEncodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"oldEncodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("oldEncodedPasswordHex");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"oldEncodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changePasswordRequireTwoFactorCodeArgs.arguments.put("oldEncodedPasswordHex", string);
        if (!bundle.containsKey("newEncodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"newEncodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("newEncodedPasswordHex");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"newEncodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changePasswordRequireTwoFactorCodeArgs.arguments.put("newEncodedPasswordHex", string2);
        return changePasswordRequireTwoFactorCodeArgs;
    }

    public static ChangePasswordRequireTwoFactorCodeArgs fromSavedStateHandle(u0 u0Var) {
        ChangePasswordRequireTwoFactorCodeArgs changePasswordRequireTwoFactorCodeArgs = new ChangePasswordRequireTwoFactorCodeArgs();
        if (!u0Var.b("oldEncodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"oldEncodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("oldEncodedPasswordHex");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"oldEncodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changePasswordRequireTwoFactorCodeArgs.arguments.put("oldEncodedPasswordHex", str);
        if (!u0Var.b("newEncodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"newEncodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("newEncodedPasswordHex");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"newEncodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        changePasswordRequireTwoFactorCodeArgs.arguments.put("newEncodedPasswordHex", str2);
        return changePasswordRequireTwoFactorCodeArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePasswordRequireTwoFactorCodeArgs changePasswordRequireTwoFactorCodeArgs = (ChangePasswordRequireTwoFactorCodeArgs) obj;
        if (this.arguments.containsKey("oldEncodedPasswordHex") != changePasswordRequireTwoFactorCodeArgs.arguments.containsKey("oldEncodedPasswordHex")) {
            return false;
        }
        if (getOldEncodedPasswordHex() == null ? changePasswordRequireTwoFactorCodeArgs.getOldEncodedPasswordHex() != null : !getOldEncodedPasswordHex().equals(changePasswordRequireTwoFactorCodeArgs.getOldEncodedPasswordHex())) {
            return false;
        }
        if (this.arguments.containsKey("newEncodedPasswordHex") != changePasswordRequireTwoFactorCodeArgs.arguments.containsKey("newEncodedPasswordHex")) {
            return false;
        }
        return getNewEncodedPasswordHex() == null ? changePasswordRequireTwoFactorCodeArgs.getNewEncodedPasswordHex() == null : getNewEncodedPasswordHex().equals(changePasswordRequireTwoFactorCodeArgs.getNewEncodedPasswordHex());
    }

    public String getNewEncodedPasswordHex() {
        return (String) this.arguments.get("newEncodedPasswordHex");
    }

    public String getOldEncodedPasswordHex() {
        return (String) this.arguments.get("oldEncodedPasswordHex");
    }

    public int hashCode() {
        return (((getOldEncodedPasswordHex() != null ? getOldEncodedPasswordHex().hashCode() : 0) + 31) * 31) + (getNewEncodedPasswordHex() != null ? getNewEncodedPasswordHex().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("oldEncodedPasswordHex")) {
            bundle.putString("oldEncodedPasswordHex", (String) this.arguments.get("oldEncodedPasswordHex"));
        }
        if (this.arguments.containsKey("newEncodedPasswordHex")) {
            bundle.putString("newEncodedPasswordHex", (String) this.arguments.get("newEncodedPasswordHex"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("oldEncodedPasswordHex")) {
            u0Var.h("oldEncodedPasswordHex", (String) this.arguments.get("oldEncodedPasswordHex"));
        }
        if (this.arguments.containsKey("newEncodedPasswordHex")) {
            u0Var.h("newEncodedPasswordHex", (String) this.arguments.get("newEncodedPasswordHex"));
        }
        return u0Var;
    }

    public String toString() {
        return "ChangePasswordRequireTwoFactorCodeArgs{oldEncodedPasswordHex=" + getOldEncodedPasswordHex() + ", newEncodedPasswordHex=" + getNewEncodedPasswordHex() + "}";
    }

    private ChangePasswordRequireTwoFactorCodeArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

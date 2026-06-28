package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class LoginRequireTwoFactorCodeArgs implements w {
    private final HashMap arguments;

    private LoginRequireTwoFactorCodeArgs() {
        this.arguments = new HashMap();
    }

    public static LoginRequireTwoFactorCodeArgs fromBundle(Bundle bundle) {
        LoginRequireTwoFactorCodeArgs loginRequireTwoFactorCodeArgs = new LoginRequireTwoFactorCodeArgs();
        bundle.setClassLoader(LoginRequireTwoFactorCodeArgs.class.getClassLoader());
        if (!bundle.containsKey("emailAuthentication")) {
            throw new IllegalArgumentException("Required argument \"emailAuthentication\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(EmailAuthentication.class) && !Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
            throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        EmailAuthentication emailAuthentication = (EmailAuthentication) bundle.get("emailAuthentication");
        if (emailAuthentication == null) {
            throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
        }
        loginRequireTwoFactorCodeArgs.arguments.put("emailAuthentication", emailAuthentication);
        if (!bundle.containsKey("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("encodedPasswordHex");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        loginRequireTwoFactorCodeArgs.arguments.put("encodedPasswordHex", string);
        return loginRequireTwoFactorCodeArgs;
    }

    public static LoginRequireTwoFactorCodeArgs fromSavedStateHandle(u0 u0Var) {
        LoginRequireTwoFactorCodeArgs loginRequireTwoFactorCodeArgs = new LoginRequireTwoFactorCodeArgs();
        if (!u0Var.b("emailAuthentication")) {
            throw new IllegalArgumentException("Required argument \"emailAuthentication\" is missing and does not have an android:defaultValue");
        }
        EmailAuthentication emailAuthentication = (EmailAuthentication) u0Var.c("emailAuthentication");
        if (emailAuthentication == null) {
            throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
        }
        loginRequireTwoFactorCodeArgs.arguments.put("emailAuthentication", emailAuthentication);
        if (!u0Var.b("encodedPasswordHex")) {
            throw new IllegalArgumentException("Required argument \"encodedPasswordHex\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("encodedPasswordHex");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
        }
        loginRequireTwoFactorCodeArgs.arguments.put("encodedPasswordHex", str);
        return loginRequireTwoFactorCodeArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginRequireTwoFactorCodeArgs loginRequireTwoFactorCodeArgs = (LoginRequireTwoFactorCodeArgs) obj;
        if (this.arguments.containsKey("emailAuthentication") != loginRequireTwoFactorCodeArgs.arguments.containsKey("emailAuthentication")) {
            return false;
        }
        if (getEmailAuthentication() == null ? loginRequireTwoFactorCodeArgs.getEmailAuthentication() != null : !getEmailAuthentication().equals(loginRequireTwoFactorCodeArgs.getEmailAuthentication())) {
            return false;
        }
        if (this.arguments.containsKey("encodedPasswordHex") != loginRequireTwoFactorCodeArgs.arguments.containsKey("encodedPasswordHex")) {
            return false;
        }
        return getEncodedPasswordHex() == null ? loginRequireTwoFactorCodeArgs.getEncodedPasswordHex() == null : getEncodedPasswordHex().equals(loginRequireTwoFactorCodeArgs.getEncodedPasswordHex());
    }

    public EmailAuthentication getEmailAuthentication() {
        return (EmailAuthentication) this.arguments.get("emailAuthentication");
    }

    public String getEncodedPasswordHex() {
        return (String) this.arguments.get("encodedPasswordHex");
    }

    public int hashCode() {
        return (((getEmailAuthentication() != null ? getEmailAuthentication().hashCode() : 0) + 31) * 31) + (getEncodedPasswordHex() != null ? getEncodedPasswordHex().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("emailAuthentication")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("emailAuthentication");
            if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                bundle.putParcelable("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
            } else {
                if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
            }
        }
        if (this.arguments.containsKey("encodedPasswordHex")) {
            bundle.putString("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("emailAuthentication")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("emailAuthentication");
            if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                u0Var.h("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
            } else {
                if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
            }
        }
        if (this.arguments.containsKey("encodedPasswordHex")) {
            u0Var.h("encodedPasswordHex", (String) this.arguments.get("encodedPasswordHex"));
        }
        return u0Var;
    }

    public String toString() {
        return "LoginRequireTwoFactorCodeArgs{emailAuthentication=" + getEmailAuthentication() + ", encodedPasswordHex=" + getEncodedPasswordHex() + "}";
    }

    private LoginRequireTwoFactorCodeArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

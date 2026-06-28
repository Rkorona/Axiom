package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ResetMasterPasswordScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private ResetMasterPasswordScreenArgs() {
        this.arguments = new HashMap();
    }

    public static ResetMasterPasswordScreenArgs fromBundle(Bundle bundle) {
        ResetMasterPasswordScreenArgs resetMasterPasswordScreenArgs = new ResetMasterPasswordScreenArgs();
        bundle.setClassLoader(ResetMasterPasswordScreenArgs.class.getClassLoader());
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
        resetMasterPasswordScreenArgs.arguments.put("emailAuthentication", emailAuthentication);
        return resetMasterPasswordScreenArgs;
    }

    public static ResetMasterPasswordScreenArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        ResetMasterPasswordScreenArgs resetMasterPasswordScreenArgs = new ResetMasterPasswordScreenArgs();
        if (!u0Var.b("emailAuthentication")) {
            throw new IllegalArgumentException("Required argument \"emailAuthentication\" is missing and does not have an android:defaultValue");
        }
        EmailAuthentication emailAuthentication = (EmailAuthentication) u0Var.c("emailAuthentication");
        if (emailAuthentication == null) {
            throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
        }
        resetMasterPasswordScreenArgs.arguments.put("emailAuthentication", emailAuthentication);
        return resetMasterPasswordScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetMasterPasswordScreenArgs resetMasterPasswordScreenArgs = (ResetMasterPasswordScreenArgs) obj;
        if (this.arguments.containsKey("emailAuthentication") != resetMasterPasswordScreenArgs.arguments.containsKey("emailAuthentication")) {
            return false;
        }
        return getEmailAuthentication() == null ? resetMasterPasswordScreenArgs.getEmailAuthentication() == null : getEmailAuthentication().equals(resetMasterPasswordScreenArgs.getEmailAuthentication());
    }

    public EmailAuthentication getEmailAuthentication() {
        return (EmailAuthentication) this.arguments.get("emailAuthentication");
    }

    public int hashCode() {
        return 31 + (getEmailAuthentication() != null ? getEmailAuthentication().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("emailAuthentication")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("emailAuthentication");
            if (!Parcelable.class.isAssignableFrom(EmailAuthentication.class) && emailAuthentication != null) {
                if (Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    bundle.putSerializable("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
                    return bundle;
                }
                throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("emailAuthentication")) {
            EmailAuthentication emailAuthentication = (EmailAuthentication) this.arguments.get("emailAuthentication");
            if (!Parcelable.class.isAssignableFrom(EmailAuthentication.class) && emailAuthentication != null) {
                if (Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                    u0Var.h("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
                    return u0Var;
                }
                throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
        }
        return u0Var;
    }

    public String toString() {
        return "ResetMasterPasswordScreenArgs{emailAuthentication=" + getEmailAuthentication() + "}";
    }

    private ResetMasterPasswordScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

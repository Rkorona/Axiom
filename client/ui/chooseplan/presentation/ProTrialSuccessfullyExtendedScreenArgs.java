package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ProTrialSuccessfullyExtendedScreenArgs implements androidx.navigation.w {
    private final HashMap arguments;

    private ProTrialSuccessfullyExtendedScreenArgs() {
        this.arguments = new HashMap();
    }

    public static ProTrialSuccessfullyExtendedScreenArgs fromBundle(Bundle bundle) {
        ProTrialSuccessfullyExtendedScreenArgs proTrialSuccessfullyExtendedScreenArgs = new ProTrialSuccessfullyExtendedScreenArgs();
        bundle.setClassLoader(ProTrialSuccessfullyExtendedScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("extendedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"extendedUntilDate\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Calendar.class) && !Serializable.class.isAssignableFrom(Calendar.class)) {
            throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Calendar calendar = (Calendar) bundle.get("extendedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"extendedUntilDate\" is marked as non-null but was passed a null value.");
        }
        proTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedUntilDate", calendar);
        return proTrialSuccessfullyExtendedScreenArgs;
    }

    public static ProTrialSuccessfullyExtendedScreenArgs fromSavedStateHandle(u0 u0Var) {
        ProTrialSuccessfullyExtendedScreenArgs proTrialSuccessfullyExtendedScreenArgs = new ProTrialSuccessfullyExtendedScreenArgs();
        if (!u0Var.b("extendedUntilDate")) {
            throw new IllegalArgumentException("Required argument \"extendedUntilDate\" is missing and does not have an android:defaultValue");
        }
        Calendar calendar = (Calendar) u0Var.c("extendedUntilDate");
        if (calendar == null) {
            throw new IllegalArgumentException("Argument \"extendedUntilDate\" is marked as non-null but was passed a null value.");
        }
        proTrialSuccessfullyExtendedScreenArgs.arguments.put("extendedUntilDate", calendar);
        return proTrialSuccessfullyExtendedScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProTrialSuccessfullyExtendedScreenArgs proTrialSuccessfullyExtendedScreenArgs = (ProTrialSuccessfullyExtendedScreenArgs) obj;
        if (this.arguments.containsKey("extendedUntilDate") != proTrialSuccessfullyExtendedScreenArgs.arguments.containsKey("extendedUntilDate")) {
            return false;
        }
        return getExtendedUntilDate() == null ? proTrialSuccessfullyExtendedScreenArgs.getExtendedUntilDate() == null : getExtendedUntilDate().equals(proTrialSuccessfullyExtendedScreenArgs.getExtendedUntilDate());
    }

    public Calendar getExtendedUntilDate() {
        return (Calendar) this.arguments.get("extendedUntilDate");
    }

    public int hashCode() {
        return 31 + (getExtendedUntilDate() != null ? getExtendedUntilDate().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("extendedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("extendedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    bundle.putSerializable("extendedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return bundle;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("extendedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("extendedUntilDate")) {
            Calendar calendar = (Calendar) this.arguments.get("extendedUntilDate");
            if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                if (Serializable.class.isAssignableFrom(Calendar.class)) {
                    u0Var.h("extendedUntilDate", (Serializable) Serializable.class.cast(calendar));
                    return u0Var;
                }
                throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("extendedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
        }
        return u0Var;
    }

    public String toString() {
        return "ProTrialSuccessfullyExtendedScreenArgs{extendedUntilDate=" + getExtendedUntilDate() + "}";
    }

    private ProTrialSuccessfullyExtendedScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

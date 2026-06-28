package com.server.auditor.ssh.client.fragments.quickimport;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.ImportOptionType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class QuickImportOptionScreenArgs implements w {
    private final HashMap arguments;

    private QuickImportOptionScreenArgs() {
        this.arguments = new HashMap();
    }

    public static QuickImportOptionScreenArgs fromBundle(Bundle bundle) {
        QuickImportOptionScreenArgs quickImportOptionScreenArgs = new QuickImportOptionScreenArgs();
        bundle.setClassLoader(QuickImportOptionScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("importOptionType")) {
            throw new IllegalArgumentException("Required argument \"importOptionType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ImportOptionType.class) && !Serializable.class.isAssignableFrom(ImportOptionType.class)) {
            throw new UnsupportedOperationException(ImportOptionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        ImportOptionType importOptionType = (ImportOptionType) bundle.get("importOptionType");
        if (importOptionType == null) {
            throw new IllegalArgumentException("Argument \"importOptionType\" is marked as non-null but was passed a null value.");
        }
        quickImportOptionScreenArgs.arguments.put("importOptionType", importOptionType);
        return quickImportOptionScreenArgs;
    }

    public static QuickImportOptionScreenArgs fromSavedStateHandle(u0 u0Var) {
        QuickImportOptionScreenArgs quickImportOptionScreenArgs = new QuickImportOptionScreenArgs();
        if (!u0Var.b("importOptionType")) {
            throw new IllegalArgumentException("Required argument \"importOptionType\" is missing and does not have an android:defaultValue");
        }
        ImportOptionType importOptionType = (ImportOptionType) u0Var.c("importOptionType");
        if (importOptionType == null) {
            throw new IllegalArgumentException("Argument \"importOptionType\" is marked as non-null but was passed a null value.");
        }
        quickImportOptionScreenArgs.arguments.put("importOptionType", importOptionType);
        return quickImportOptionScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuickImportOptionScreenArgs quickImportOptionScreenArgs = (QuickImportOptionScreenArgs) obj;
        if (this.arguments.containsKey("importOptionType") != quickImportOptionScreenArgs.arguments.containsKey("importOptionType")) {
            return false;
        }
        return getImportOptionType() == null ? quickImportOptionScreenArgs.getImportOptionType() == null : getImportOptionType().equals(quickImportOptionScreenArgs.getImportOptionType());
    }

    public ImportOptionType getImportOptionType() {
        return (ImportOptionType) this.arguments.get("importOptionType");
    }

    public int hashCode() {
        return 31 + (getImportOptionType() != null ? getImportOptionType().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("importOptionType")) {
            ImportOptionType importOptionType = (ImportOptionType) this.arguments.get("importOptionType");
            if (!Parcelable.class.isAssignableFrom(ImportOptionType.class) && importOptionType != null) {
                if (Serializable.class.isAssignableFrom(ImportOptionType.class)) {
                    bundle.putSerializable("importOptionType", (Serializable) Serializable.class.cast(importOptionType));
                    return bundle;
                }
                throw new UnsupportedOperationException(ImportOptionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("importOptionType", (Parcelable) Parcelable.class.cast(importOptionType));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("importOptionType")) {
            ImportOptionType importOptionType = (ImportOptionType) this.arguments.get("importOptionType");
            if (!Parcelable.class.isAssignableFrom(ImportOptionType.class) && importOptionType != null) {
                if (Serializable.class.isAssignableFrom(ImportOptionType.class)) {
                    u0Var.h("importOptionType", (Serializable) Serializable.class.cast(importOptionType));
                    return u0Var;
                }
                throw new UnsupportedOperationException(ImportOptionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("importOptionType", (Parcelable) Parcelable.class.cast(importOptionType));
        }
        return u0Var;
    }

    public String toString() {
        return "QuickImportOptionScreenArgs{importOptionType=" + getImportOptionType() + "}";
    }

    private QuickImportOptionScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

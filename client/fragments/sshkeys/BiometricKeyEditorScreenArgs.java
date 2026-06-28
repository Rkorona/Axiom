package com.server.auditor.ssh.client.fragments.sshkeys;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BiometricKeyEditorScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26464a;

        public a(EditKeyData editKeyData, String str) {
            HashMap map = new HashMap();
            this.f26464a = map;
            if (editKeyData == null) {
                throw new IllegalArgumentException("Argument \"sshKeyData\" is marked as non-null but was passed a null value.");
            }
            map.put("sshKeyData", editKeyData);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("funnelId", str);
        }

        public BiometricKeyEditorScreenArgs a() {
            return new BiometricKeyEditorScreenArgs(this.f26464a);
        }
    }

    public static BiometricKeyEditorScreenArgs fromBundle(Bundle bundle) {
        BiometricKeyEditorScreenArgs biometricKeyEditorScreenArgs = new BiometricKeyEditorScreenArgs();
        bundle.setClassLoader(BiometricKeyEditorScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("sshKeyData")) {
            throw new IllegalArgumentException("Required argument \"sshKeyData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(EditKeyData.class) && !Serializable.class.isAssignableFrom(EditKeyData.class)) {
            throw new UnsupportedOperationException(EditKeyData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        EditKeyData editKeyData = (EditKeyData) bundle.get("sshKeyData");
        if (editKeyData == null) {
            throw new IllegalArgumentException("Argument \"sshKeyData\" is marked as non-null but was passed a null value.");
        }
        biometricKeyEditorScreenArgs.arguments.put("sshKeyData", editKeyData);
        if (!bundle.containsKey("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("funnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        biometricKeyEditorScreenArgs.arguments.put("funnelId", string);
        return biometricKeyEditorScreenArgs;
    }

    public static BiometricKeyEditorScreenArgs fromSavedStateHandle(u0 u0Var) {
        BiometricKeyEditorScreenArgs biometricKeyEditorScreenArgs = new BiometricKeyEditorScreenArgs();
        if (!u0Var.b("sshKeyData")) {
            throw new IllegalArgumentException("Required argument \"sshKeyData\" is missing and does not have an android:defaultValue");
        }
        EditKeyData editKeyData = (EditKeyData) u0Var.c("sshKeyData");
        if (editKeyData == null) {
            throw new IllegalArgumentException("Argument \"sshKeyData\" is marked as non-null but was passed a null value.");
        }
        biometricKeyEditorScreenArgs.arguments.put("sshKeyData", editKeyData);
        if (!u0Var.b("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("funnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        biometricKeyEditorScreenArgs.arguments.put("funnelId", str);
        return biometricKeyEditorScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BiometricKeyEditorScreenArgs biometricKeyEditorScreenArgs = (BiometricKeyEditorScreenArgs) obj;
        if (this.arguments.containsKey("sshKeyData") != biometricKeyEditorScreenArgs.arguments.containsKey("sshKeyData")) {
            return false;
        }
        if (getSshKeyData() == null ? biometricKeyEditorScreenArgs.getSshKeyData() != null : !getSshKeyData().equals(biometricKeyEditorScreenArgs.getSshKeyData())) {
            return false;
        }
        if (this.arguments.containsKey("funnelId") != biometricKeyEditorScreenArgs.arguments.containsKey("funnelId")) {
            return false;
        }
        return getFunnelId() == null ? biometricKeyEditorScreenArgs.getFunnelId() == null : getFunnelId().equals(biometricKeyEditorScreenArgs.getFunnelId());
    }

    public String getFunnelId() {
        return (String) this.arguments.get("funnelId");
    }

    public EditKeyData getSshKeyData() {
        return (EditKeyData) this.arguments.get("sshKeyData");
    }

    public int hashCode() {
        return (((getSshKeyData() != null ? getSshKeyData().hashCode() : 0) + 31) * 31) + (getFunnelId() != null ? getFunnelId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("sshKeyData")) {
            EditKeyData editKeyData = (EditKeyData) this.arguments.get("sshKeyData");
            if (Parcelable.class.isAssignableFrom(EditKeyData.class) || editKeyData == null) {
                bundle.putParcelable("sshKeyData", (Parcelable) Parcelable.class.cast(editKeyData));
            } else {
                if (!Serializable.class.isAssignableFrom(EditKeyData.class)) {
                    throw new UnsupportedOperationException(EditKeyData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("sshKeyData", (Serializable) Serializable.class.cast(editKeyData));
            }
        }
        if (this.arguments.containsKey("funnelId")) {
            bundle.putString("funnelId", (String) this.arguments.get("funnelId"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("sshKeyData")) {
            EditKeyData editKeyData = (EditKeyData) this.arguments.get("sshKeyData");
            if (Parcelable.class.isAssignableFrom(EditKeyData.class) || editKeyData == null) {
                u0Var.h("sshKeyData", (Parcelable) Parcelable.class.cast(editKeyData));
            } else {
                if (!Serializable.class.isAssignableFrom(EditKeyData.class)) {
                    throw new UnsupportedOperationException(EditKeyData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("sshKeyData", (Serializable) Serializable.class.cast(editKeyData));
            }
        }
        if (this.arguments.containsKey("funnelId")) {
            u0Var.h("funnelId", (String) this.arguments.get("funnelId"));
        }
        return u0Var;
    }

    public String toString() {
        return "BiometricKeyEditorScreenArgs{sshKeyData=" + getSshKeyData() + ", funnelId=" + getFunnelId() + "}";
    }

    private BiometricKeyEditorScreenArgs() {
        this.arguments = new HashMap();
    }

    private BiometricKeyEditorScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

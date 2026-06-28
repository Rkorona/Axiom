package com.server.auditor.ssh.client.navigation.sshkey;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SshKeyEditorScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29854a;

        public a(EditKeyData editKeyData, String str) {
            HashMap map = new HashMap();
            this.f29854a = map;
            if (editKeyData == null) {
                throw new IllegalArgumentException("Argument \"sshKeyData\" is marked as non-null but was passed a null value.");
            }
            map.put("sshKeyData", editKeyData);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("funnelId", str);
        }

        public SshKeyEditorScreenArgs a() {
            return new SshKeyEditorScreenArgs(this.f29854a);
        }
    }

    public static SshKeyEditorScreenArgs fromBundle(Bundle bundle) {
        SshKeyEditorScreenArgs sshKeyEditorScreenArgs = new SshKeyEditorScreenArgs();
        bundle.setClassLoader(SshKeyEditorScreenArgs.class.getClassLoader());
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
        sshKeyEditorScreenArgs.arguments.put("sshKeyData", editKeyData);
        if (!bundle.containsKey("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("funnelId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        sshKeyEditorScreenArgs.arguments.put("funnelId", string);
        return sshKeyEditorScreenArgs;
    }

    public static SshKeyEditorScreenArgs fromSavedStateHandle(u0 u0Var) {
        SshKeyEditorScreenArgs sshKeyEditorScreenArgs = new SshKeyEditorScreenArgs();
        if (!u0Var.b("sshKeyData")) {
            throw new IllegalArgumentException("Required argument \"sshKeyData\" is missing and does not have an android:defaultValue");
        }
        EditKeyData editKeyData = (EditKeyData) u0Var.c("sshKeyData");
        if (editKeyData == null) {
            throw new IllegalArgumentException("Argument \"sshKeyData\" is marked as non-null but was passed a null value.");
        }
        sshKeyEditorScreenArgs.arguments.put("sshKeyData", editKeyData);
        if (!u0Var.b("funnelId")) {
            throw new IllegalArgumentException("Required argument \"funnelId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("funnelId");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"funnelId\" is marked as non-null but was passed a null value.");
        }
        sshKeyEditorScreenArgs.arguments.put("funnelId", str);
        return sshKeyEditorScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SshKeyEditorScreenArgs sshKeyEditorScreenArgs = (SshKeyEditorScreenArgs) obj;
        if (this.arguments.containsKey("sshKeyData") != sshKeyEditorScreenArgs.arguments.containsKey("sshKeyData")) {
            return false;
        }
        if (getSshKeyData() == null ? sshKeyEditorScreenArgs.getSshKeyData() != null : !getSshKeyData().equals(sshKeyEditorScreenArgs.getSshKeyData())) {
            return false;
        }
        if (this.arguments.containsKey("funnelId") != sshKeyEditorScreenArgs.arguments.containsKey("funnelId")) {
            return false;
        }
        return getFunnelId() == null ? sshKeyEditorScreenArgs.getFunnelId() == null : getFunnelId().equals(sshKeyEditorScreenArgs.getFunnelId());
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
        return "SshKeyEditorScreenArgs{sshKeyData=" + getSshKeyData() + ", funnelId=" + getFunnelId() + "}";
    }

    private SshKeyEditorScreenArgs() {
        this.arguments = new HashMap();
    }

    private SshKeyEditorScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

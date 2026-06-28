package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PackageSelectorArgs implements androidx.navigation.w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28358a;

        public a(boolean z10, VaultKeyId vaultKeyId) {
            HashMap map = new HashMap();
            this.f28358a = map;
            map.put("bundle_is_panel_terminal_key", Boolean.valueOf(z10));
            if (vaultKeyId == null) {
                throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
            }
            map.put("targetVaultKeyId", vaultKeyId);
        }

        public PackageSelectorArgs a() {
            return new PackageSelectorArgs(this.f28358a);
        }
    }

    public static PackageSelectorArgs fromBundle(Bundle bundle) {
        PackageSelectorArgs packageSelectorArgs = new PackageSelectorArgs();
        bundle.setClassLoader(PackageSelectorArgs.class.getClassLoader());
        if (!bundle.containsKey("bundle_is_panel_terminal_key")) {
            throw new IllegalArgumentException("Required argument \"bundle_is_panel_terminal_key\" is missing and does not have an android:defaultValue");
        }
        packageSelectorArgs.arguments.put("bundle_is_panel_terminal_key", Boolean.valueOf(bundle.getBoolean("bundle_is_panel_terminal_key")));
        if (!bundle.containsKey("targetVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"targetVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && !Serializable.class.isAssignableFrom(VaultKeyId.class)) {
            throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) bundle.get("targetVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        packageSelectorArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        return packageSelectorArgs;
    }

    public static PackageSelectorArgs fromSavedStateHandle(androidx.lifecycle.u0 u0Var) {
        PackageSelectorArgs packageSelectorArgs = new PackageSelectorArgs();
        if (!u0Var.b("bundle_is_panel_terminal_key")) {
            throw new IllegalArgumentException("Required argument \"bundle_is_panel_terminal_key\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) u0Var.c("bundle_is_panel_terminal_key");
        bool.booleanValue();
        packageSelectorArgs.arguments.put("bundle_is_panel_terminal_key", bool);
        if (!u0Var.b("targetVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"targetVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) u0Var.c("targetVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        packageSelectorArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        return packageSelectorArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageSelectorArgs packageSelectorArgs = (PackageSelectorArgs) obj;
        if (this.arguments.containsKey("bundle_is_panel_terminal_key") == packageSelectorArgs.arguments.containsKey("bundle_is_panel_terminal_key") && getBundleIsPanelTerminalKey() == packageSelectorArgs.getBundleIsPanelTerminalKey() && this.arguments.containsKey("targetVaultKeyId") == packageSelectorArgs.arguments.containsKey("targetVaultKeyId")) {
            return getTargetVaultKeyId() == null ? packageSelectorArgs.getTargetVaultKeyId() == null : getTargetVaultKeyId().equals(packageSelectorArgs.getTargetVaultKeyId());
        }
        return false;
    }

    public boolean getBundleIsPanelTerminalKey() {
        return ((Boolean) this.arguments.get("bundle_is_panel_terminal_key")).booleanValue();
    }

    public VaultKeyId getTargetVaultKeyId() {
        return (VaultKeyId) this.arguments.get("targetVaultKeyId");
    }

    public int hashCode() {
        return (((getBundleIsPanelTerminalKey() ? 1 : 0) + 31) * 31) + (getTargetVaultKeyId() != null ? getTargetVaultKeyId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("bundle_is_panel_terminal_key")) {
            bundle.putBoolean("bundle_is_panel_terminal_key", ((Boolean) this.arguments.get("bundle_is_panel_terminal_key")).booleanValue());
        }
        if (this.arguments.containsKey("targetVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("targetVaultKeyId");
            if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && vaultKeyId != null) {
                if (Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    bundle.putSerializable("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                    return bundle;
                }
                throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
        }
        return bundle;
    }

    public androidx.lifecycle.u0 toSavedStateHandle() {
        androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0();
        if (this.arguments.containsKey("bundle_is_panel_terminal_key")) {
            Boolean bool = (Boolean) this.arguments.get("bundle_is_panel_terminal_key");
            bool.booleanValue();
            u0Var.h("bundle_is_panel_terminal_key", bool);
        }
        if (this.arguments.containsKey("targetVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("targetVaultKeyId");
            if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && vaultKeyId != null) {
                if (Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    u0Var.h("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                    return u0Var;
                }
                throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
        }
        return u0Var;
    }

    public String toString() {
        return "PackageSelectorArgs{bundleIsPanelTerminalKey=" + getBundleIsPanelTerminalKey() + ", targetVaultKeyId=" + getTargetVaultKeyId() + "}";
    }

    private PackageSelectorArgs() {
        this.arguments = new HashMap();
    }

    private PackageSelectorArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

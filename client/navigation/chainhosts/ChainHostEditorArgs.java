package com.server.auditor.ssh.client.navigation.chainhosts;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ChainHostEditorArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29033a;

        public a(VaultKeyId vaultKeyId) {
            HashMap map = new HashMap();
            this.f29033a = map;
            if (vaultKeyId == null) {
                throw new IllegalArgumentException("Argument \"filterVaultKeyId\" is marked as non-null but was passed a null value.");
            }
            map.put("filterVaultKeyId", vaultKeyId);
        }

        public ChainHostEditorArgs a() {
            return new ChainHostEditorArgs(this.f29033a);
        }

        public a b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"chainingTypeKey\" is marked as non-null but was passed a null value.");
            }
            this.f29033a.put("chainingTypeKey", str);
            return this;
        }

        public a c(ChainingHost chainingHost) {
            this.f29033a.put("currentChainingHostKey", chainingHost);
            return this;
        }

        public a d(long j10) {
            this.f29033a.put("finishChainHostId", Long.valueOf(j10));
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"finishChainHostNameKey\" is marked as non-null but was passed a null value.");
            }
            this.f29033a.put("finishChainHostNameKey", str);
            return this;
        }
    }

    public static ChainHostEditorArgs fromBundle(Bundle bundle) {
        ChainHostEditorArgs chainHostEditorArgs = new ChainHostEditorArgs();
        bundle.setClassLoader(ChainHostEditorArgs.class.getClassLoader());
        if (bundle.containsKey("finishChainHostId")) {
            chainHostEditorArgs.arguments.put("finishChainHostId", Long.valueOf(bundle.getLong("finishChainHostId")));
        } else {
            chainHostEditorArgs.arguments.put("finishChainHostId", -1L);
        }
        if (bundle.containsKey("finishChainHostNameKey")) {
            String string = bundle.getString("finishChainHostNameKey");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"finishChainHostNameKey\" is marked as non-null but was passed a null value.");
            }
            chainHostEditorArgs.arguments.put("finishChainHostNameKey", string);
        } else {
            chainHostEditorArgs.arguments.put("finishChainHostNameKey", "");
        }
        if (!bundle.containsKey("currentChainingHostKey")) {
            chainHostEditorArgs.arguments.put("currentChainingHostKey", null);
        } else {
            if (!Parcelable.class.isAssignableFrom(ChainingHost.class) && !Serializable.class.isAssignableFrom(ChainingHost.class)) {
                throw new UnsupportedOperationException(ChainingHost.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            chainHostEditorArgs.arguments.put("currentChainingHostKey", (ChainingHost) bundle.get("currentChainingHostKey"));
        }
        if (bundle.containsKey("chainingTypeKey")) {
            String string2 = bundle.getString("chainingTypeKey");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"chainingTypeKey\" is marked as non-null but was passed a null value.");
            }
            chainHostEditorArgs.arguments.put("chainingTypeKey", string2);
        } else {
            chainHostEditorArgs.arguments.put("chainingTypeKey", "host");
        }
        if (!bundle.containsKey("filterVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"filterVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && !Serializable.class.isAssignableFrom(VaultKeyId.class)) {
            throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) bundle.get("filterVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"filterVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        chainHostEditorArgs.arguments.put("filterVaultKeyId", vaultKeyId);
        return chainHostEditorArgs;
    }

    public static ChainHostEditorArgs fromSavedStateHandle(u0 u0Var) {
        ChainHostEditorArgs chainHostEditorArgs = new ChainHostEditorArgs();
        if (u0Var.b("finishChainHostId")) {
            Long l10 = (Long) u0Var.c("finishChainHostId");
            l10.longValue();
            chainHostEditorArgs.arguments.put("finishChainHostId", l10);
        } else {
            chainHostEditorArgs.arguments.put("finishChainHostId", -1L);
        }
        if (u0Var.b("finishChainHostNameKey")) {
            String str = (String) u0Var.c("finishChainHostNameKey");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"finishChainHostNameKey\" is marked as non-null but was passed a null value.");
            }
            chainHostEditorArgs.arguments.put("finishChainHostNameKey", str);
        } else {
            chainHostEditorArgs.arguments.put("finishChainHostNameKey", "");
        }
        if (u0Var.b("currentChainingHostKey")) {
            chainHostEditorArgs.arguments.put("currentChainingHostKey", (ChainingHost) u0Var.c("currentChainingHostKey"));
        } else {
            chainHostEditorArgs.arguments.put("currentChainingHostKey", null);
        }
        if (u0Var.b("chainingTypeKey")) {
            String str2 = (String) u0Var.c("chainingTypeKey");
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"chainingTypeKey\" is marked as non-null but was passed a null value.");
            }
            chainHostEditorArgs.arguments.put("chainingTypeKey", str2);
        } else {
            chainHostEditorArgs.arguments.put("chainingTypeKey", "host");
        }
        if (!u0Var.b("filterVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"filterVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) u0Var.c("filterVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"filterVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        chainHostEditorArgs.arguments.put("filterVaultKeyId", vaultKeyId);
        return chainHostEditorArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChainHostEditorArgs chainHostEditorArgs = (ChainHostEditorArgs) obj;
        if (this.arguments.containsKey("finishChainHostId") != chainHostEditorArgs.arguments.containsKey("finishChainHostId") || getFinishChainHostId() != chainHostEditorArgs.getFinishChainHostId() || this.arguments.containsKey("finishChainHostNameKey") != chainHostEditorArgs.arguments.containsKey("finishChainHostNameKey")) {
            return false;
        }
        if (getFinishChainHostNameKey() == null ? chainHostEditorArgs.getFinishChainHostNameKey() != null : !getFinishChainHostNameKey().equals(chainHostEditorArgs.getFinishChainHostNameKey())) {
            return false;
        }
        if (this.arguments.containsKey("currentChainingHostKey") != chainHostEditorArgs.arguments.containsKey("currentChainingHostKey")) {
            return false;
        }
        if (getCurrentChainingHostKey() == null ? chainHostEditorArgs.getCurrentChainingHostKey() != null : !getCurrentChainingHostKey().equals(chainHostEditorArgs.getCurrentChainingHostKey())) {
            return false;
        }
        if (this.arguments.containsKey("chainingTypeKey") != chainHostEditorArgs.arguments.containsKey("chainingTypeKey")) {
            return false;
        }
        if (getChainingTypeKey() == null ? chainHostEditorArgs.getChainingTypeKey() != null : !getChainingTypeKey().equals(chainHostEditorArgs.getChainingTypeKey())) {
            return false;
        }
        if (this.arguments.containsKey("filterVaultKeyId") != chainHostEditorArgs.arguments.containsKey("filterVaultKeyId")) {
            return false;
        }
        return getFilterVaultKeyId() == null ? chainHostEditorArgs.getFilterVaultKeyId() == null : getFilterVaultKeyId().equals(chainHostEditorArgs.getFilterVaultKeyId());
    }

    public String getChainingTypeKey() {
        return (String) this.arguments.get("chainingTypeKey");
    }

    public ChainingHost getCurrentChainingHostKey() {
        return (ChainingHost) this.arguments.get("currentChainingHostKey");
    }

    public VaultKeyId getFilterVaultKeyId() {
        return (VaultKeyId) this.arguments.get("filterVaultKeyId");
    }

    public long getFinishChainHostId() {
        return ((Long) this.arguments.get("finishChainHostId")).longValue();
    }

    public String getFinishChainHostNameKey() {
        return (String) this.arguments.get("finishChainHostNameKey");
    }

    public int hashCode() {
        return ((((((((((int) (getFinishChainHostId() ^ (getFinishChainHostId() >>> 32))) + 31) * 31) + (getFinishChainHostNameKey() != null ? getFinishChainHostNameKey().hashCode() : 0)) * 31) + (getCurrentChainingHostKey() != null ? getCurrentChainingHostKey().hashCode() : 0)) * 31) + (getChainingTypeKey() != null ? getChainingTypeKey().hashCode() : 0)) * 31) + (getFilterVaultKeyId() != null ? getFilterVaultKeyId().hashCode() : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("finishChainHostId")) {
            bundle.putLong("finishChainHostId", ((Long) this.arguments.get("finishChainHostId")).longValue());
        } else {
            bundle.putLong("finishChainHostId", -1L);
        }
        if (this.arguments.containsKey("finishChainHostNameKey")) {
            bundle.putString("finishChainHostNameKey", (String) this.arguments.get("finishChainHostNameKey"));
        } else {
            bundle.putString("finishChainHostNameKey", "");
        }
        if (this.arguments.containsKey("currentChainingHostKey")) {
            ChainingHost chainingHost = (ChainingHost) this.arguments.get("currentChainingHostKey");
            if (Parcelable.class.isAssignableFrom(ChainingHost.class) || chainingHost == null) {
                bundle.putParcelable("currentChainingHostKey", (Parcelable) Parcelable.class.cast(chainingHost));
            } else {
                if (!Serializable.class.isAssignableFrom(ChainingHost.class)) {
                    throw new UnsupportedOperationException(ChainingHost.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("currentChainingHostKey", (Serializable) Serializable.class.cast(chainingHost));
            }
        } else {
            bundle.putSerializable("currentChainingHostKey", null);
        }
        if (this.arguments.containsKey("chainingTypeKey")) {
            bundle.putString("chainingTypeKey", (String) this.arguments.get("chainingTypeKey"));
        } else {
            bundle.putString("chainingTypeKey", "host");
        }
        if (this.arguments.containsKey("filterVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("filterVaultKeyId");
            if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && vaultKeyId != null) {
                if (Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    bundle.putSerializable("filterVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                    return bundle;
                }
                throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putParcelable("filterVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("finishChainHostId")) {
            Long l10 = (Long) this.arguments.get("finishChainHostId");
            l10.longValue();
            u0Var.h("finishChainHostId", l10);
        } else {
            u0Var.h("finishChainHostId", -1L);
        }
        if (this.arguments.containsKey("finishChainHostNameKey")) {
            u0Var.h("finishChainHostNameKey", (String) this.arguments.get("finishChainHostNameKey"));
        } else {
            u0Var.h("finishChainHostNameKey", "");
        }
        if (this.arguments.containsKey("currentChainingHostKey")) {
            ChainingHost chainingHost = (ChainingHost) this.arguments.get("currentChainingHostKey");
            if (Parcelable.class.isAssignableFrom(ChainingHost.class) || chainingHost == null) {
                u0Var.h("currentChainingHostKey", (Parcelable) Parcelable.class.cast(chainingHost));
            } else {
                if (!Serializable.class.isAssignableFrom(ChainingHost.class)) {
                    throw new UnsupportedOperationException(ChainingHost.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("currentChainingHostKey", (Serializable) Serializable.class.cast(chainingHost));
            }
        } else {
            u0Var.h("currentChainingHostKey", null);
        }
        if (this.arguments.containsKey("chainingTypeKey")) {
            u0Var.h("chainingTypeKey", (String) this.arguments.get("chainingTypeKey"));
        } else {
            u0Var.h("chainingTypeKey", "host");
        }
        if (this.arguments.containsKey("filterVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("filterVaultKeyId");
            if (!Parcelable.class.isAssignableFrom(VaultKeyId.class) && vaultKeyId != null) {
                if (Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    u0Var.h("filterVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                    return u0Var;
                }
                throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            u0Var.h("filterVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
        }
        return u0Var;
    }

    public String toString() {
        return "ChainHostEditorArgs{finishChainHostId=" + getFinishChainHostId() + ", finishChainHostNameKey=" + getFinishChainHostNameKey() + ", currentChainingHostKey=" + getCurrentChainingHostKey() + ", chainingTypeKey=" + getChainingTypeKey() + ", filterVaultKeyId=" + getFilterVaultKeyId() + "}";
    }

    private ChainHostEditorArgs() {
        this.arguments = new HashMap();
    }

    private ChainHostEditorArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

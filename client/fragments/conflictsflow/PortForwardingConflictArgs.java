package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PortForwardingConflictArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24465a;

        public a(String str, String str2, long j10, String str3, VaultKeyId vaultKeyId, String str4, SourceEntitiesArgData[] sourceEntitiesArgDataArr, ConflictsArgData[] conflictsArgDataArr) {
            HashMap map = new HashMap();
            this.f24465a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
            }
            map.put("wayToMove", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
            }
            map.put("wizardId", str2);
            map.put("targetDragAndDropIdArg", Long.valueOf(j10));
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"ordinaryConflictsResolveMethod\" is marked as non-null but was passed a null value.");
            }
            map.put("ordinaryConflictsResolveMethod", str3);
            if (vaultKeyId == null) {
                throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
            }
            map.put("targetVaultKeyId", vaultKeyId);
            if (str4 == null) {
                throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
            }
            map.put("credentialsMode", str4);
            if (sourceEntitiesArgDataArr == null) {
                throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
            }
            map.put("sourceData", sourceEntitiesArgDataArr);
            if (conflictsArgDataArr == null) {
                throw new IllegalArgumentException("Argument \"conflictsData\" is marked as non-null but was passed a null value.");
            }
            map.put("conflictsData", conflictsArgDataArr);
        }

        public PortForwardingConflictArgs a() {
            return new PortForwardingConflictArgs(this.f24465a);
        }
    }

    public static PortForwardingConflictArgs fromBundle(Bundle bundle) {
        SourceEntitiesArgData[] sourceEntitiesArgDataArr;
        PortForwardingConflictArgs portForwardingConflictArgs = new PortForwardingConflictArgs();
        bundle.setClassLoader(PortForwardingConflictArgs.class.getClassLoader());
        if (!bundle.containsKey("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("wayToMove");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("wayToMove", string);
        if (!bundle.containsKey("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("wizardId");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("wizardId", string2);
        if (!bundle.containsKey("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        portForwardingConflictArgs.arguments.put("targetDragAndDropIdArg", Long.valueOf(bundle.getLong("targetDragAndDropIdArg")));
        if (!bundle.containsKey("ordinaryConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"ordinaryConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("ordinaryConflictsResolveMethod");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"ordinaryConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("ordinaryConflictsResolveMethod", string3);
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
        portForwardingConflictArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!bundle.containsKey("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("credentialsMode");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("credentialsMode", string4);
        if (!bundle.containsKey("sourceData")) {
            throw new IllegalArgumentException("Required argument \"sourceData\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("sourceData");
        ConflictsArgData[] conflictsArgDataArr = null;
        if (parcelableArray != null) {
            sourceEntitiesArgDataArr = new SourceEntitiesArgData[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, sourceEntitiesArgDataArr, 0, parcelableArray.length);
        } else {
            sourceEntitiesArgDataArr = null;
        }
        if (sourceEntitiesArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
        if (!bundle.containsKey("conflictsData")) {
            throw new IllegalArgumentException("Required argument \"conflictsData\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("conflictsData");
        if (parcelableArray2 != null) {
            conflictsArgDataArr = new ConflictsArgData[parcelableArray2.length];
            System.arraycopy(parcelableArray2, 0, conflictsArgDataArr, 0, parcelableArray2.length);
        }
        if (conflictsArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"conflictsData\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("conflictsData", conflictsArgDataArr);
        return portForwardingConflictArgs;
    }

    public static PortForwardingConflictArgs fromSavedStateHandle(u0 u0Var) {
        PortForwardingConflictArgs portForwardingConflictArgs = new PortForwardingConflictArgs();
        if (!u0Var.b("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("wayToMove");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("wayToMove", str);
        if (!u0Var.b("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("wizardId");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("wizardId", str2);
        if (!u0Var.b("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) u0Var.c("targetDragAndDropIdArg");
        l10.longValue();
        portForwardingConflictArgs.arguments.put("targetDragAndDropIdArg", l10);
        if (!u0Var.b("ordinaryConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"ordinaryConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) u0Var.c("ordinaryConflictsResolveMethod");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"ordinaryConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("ordinaryConflictsResolveMethod", str3);
        if (!u0Var.b("targetVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"targetVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) u0Var.c("targetVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!u0Var.b("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) u0Var.c("credentialsMode");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("credentialsMode", str4);
        if (!u0Var.b("sourceData")) {
            throw new IllegalArgumentException("Required argument \"sourceData\" is missing and does not have an android:defaultValue");
        }
        SourceEntitiesArgData[] sourceEntitiesArgDataArr = (SourceEntitiesArgData[]) u0Var.c("sourceData");
        if (sourceEntitiesArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
        if (!u0Var.b("conflictsData")) {
            throw new IllegalArgumentException("Required argument \"conflictsData\" is missing and does not have an android:defaultValue");
        }
        ConflictsArgData[] conflictsArgDataArr = (ConflictsArgData[]) u0Var.c("conflictsData");
        if (conflictsArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"conflictsData\" is marked as non-null but was passed a null value.");
        }
        portForwardingConflictArgs.arguments.put("conflictsData", conflictsArgDataArr);
        return portForwardingConflictArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortForwardingConflictArgs portForwardingConflictArgs = (PortForwardingConflictArgs) obj;
        if (this.arguments.containsKey("wayToMove") != portForwardingConflictArgs.arguments.containsKey("wayToMove")) {
            return false;
        }
        if (getWayToMove() == null ? portForwardingConflictArgs.getWayToMove() != null : !getWayToMove().equals(portForwardingConflictArgs.getWayToMove())) {
            return false;
        }
        if (this.arguments.containsKey("wizardId") != portForwardingConflictArgs.arguments.containsKey("wizardId")) {
            return false;
        }
        if (getWizardId() == null ? portForwardingConflictArgs.getWizardId() != null : !getWizardId().equals(portForwardingConflictArgs.getWizardId())) {
            return false;
        }
        if (this.arguments.containsKey("targetDragAndDropIdArg") != portForwardingConflictArgs.arguments.containsKey("targetDragAndDropIdArg") || getTargetDragAndDropIdArg() != portForwardingConflictArgs.getTargetDragAndDropIdArg() || this.arguments.containsKey("ordinaryConflictsResolveMethod") != portForwardingConflictArgs.arguments.containsKey("ordinaryConflictsResolveMethod")) {
            return false;
        }
        if (getOrdinaryConflictsResolveMethod() == null ? portForwardingConflictArgs.getOrdinaryConflictsResolveMethod() != null : !getOrdinaryConflictsResolveMethod().equals(portForwardingConflictArgs.getOrdinaryConflictsResolveMethod())) {
            return false;
        }
        if (this.arguments.containsKey("targetVaultKeyId") != portForwardingConflictArgs.arguments.containsKey("targetVaultKeyId")) {
            return false;
        }
        if (getTargetVaultKeyId() == null ? portForwardingConflictArgs.getTargetVaultKeyId() != null : !getTargetVaultKeyId().equals(portForwardingConflictArgs.getTargetVaultKeyId())) {
            return false;
        }
        if (this.arguments.containsKey("credentialsMode") != portForwardingConflictArgs.arguments.containsKey("credentialsMode")) {
            return false;
        }
        if (getCredentialsMode() == null ? portForwardingConflictArgs.getCredentialsMode() != null : !getCredentialsMode().equals(portForwardingConflictArgs.getCredentialsMode())) {
            return false;
        }
        if (this.arguments.containsKey("sourceData") != portForwardingConflictArgs.arguments.containsKey("sourceData")) {
            return false;
        }
        if (getSourceData() == null ? portForwardingConflictArgs.getSourceData() != null : !getSourceData().equals(portForwardingConflictArgs.getSourceData())) {
            return false;
        }
        if (this.arguments.containsKey("conflictsData") != portForwardingConflictArgs.arguments.containsKey("conflictsData")) {
            return false;
        }
        return getConflictsData() == null ? portForwardingConflictArgs.getConflictsData() == null : getConflictsData().equals(portForwardingConflictArgs.getConflictsData());
    }

    public ConflictsArgData[] getConflictsData() {
        return (ConflictsArgData[]) this.arguments.get("conflictsData");
    }

    public String getCredentialsMode() {
        return (String) this.arguments.get("credentialsMode");
    }

    public String getOrdinaryConflictsResolveMethod() {
        return (String) this.arguments.get("ordinaryConflictsResolveMethod");
    }

    public SourceEntitiesArgData[] getSourceData() {
        return (SourceEntitiesArgData[]) this.arguments.get("sourceData");
    }

    public long getTargetDragAndDropIdArg() {
        return ((Long) this.arguments.get("targetDragAndDropIdArg")).longValue();
    }

    public VaultKeyId getTargetVaultKeyId() {
        return (VaultKeyId) this.arguments.get("targetVaultKeyId");
    }

    public String getWayToMove() {
        return (String) this.arguments.get("wayToMove");
    }

    public String getWizardId() {
        return (String) this.arguments.get("wizardId");
    }

    public int hashCode() {
        return (((((((((((((((getWayToMove() != null ? getWayToMove().hashCode() : 0) + 31) * 31) + (getWizardId() != null ? getWizardId().hashCode() : 0)) * 31) + ((int) (getTargetDragAndDropIdArg() ^ (getTargetDragAndDropIdArg() >>> 32)))) * 31) + (getOrdinaryConflictsResolveMethod() != null ? getOrdinaryConflictsResolveMethod().hashCode() : 0)) * 31) + (getTargetVaultKeyId() != null ? getTargetVaultKeyId().hashCode() : 0)) * 31) + (getCredentialsMode() != null ? getCredentialsMode().hashCode() : 0)) * 31) + Arrays.hashCode(getSourceData())) * 31) + Arrays.hashCode(getConflictsData());
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.arguments.containsKey("wayToMove")) {
            bundle.putString("wayToMove", (String) this.arguments.get("wayToMove"));
        }
        if (this.arguments.containsKey("wizardId")) {
            bundle.putString("wizardId", (String) this.arguments.get("wizardId"));
        }
        if (this.arguments.containsKey("targetDragAndDropIdArg")) {
            bundle.putLong("targetDragAndDropIdArg", ((Long) this.arguments.get("targetDragAndDropIdArg")).longValue());
        }
        if (this.arguments.containsKey("ordinaryConflictsResolveMethod")) {
            bundle.putString("ordinaryConflictsResolveMethod", (String) this.arguments.get("ordinaryConflictsResolveMethod"));
        }
        if (this.arguments.containsKey("targetVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("targetVaultKeyId");
            if (Parcelable.class.isAssignableFrom(VaultKeyId.class) || vaultKeyId == null) {
                bundle.putParcelable("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
            } else {
                if (!Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putSerializable("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
            }
        }
        if (this.arguments.containsKey("credentialsMode")) {
            bundle.putString("credentialsMode", (String) this.arguments.get("credentialsMode"));
        }
        if (this.arguments.containsKey("sourceData")) {
            bundle.putParcelableArray("sourceData", (SourceEntitiesArgData[]) this.arguments.get("sourceData"));
        }
        if (this.arguments.containsKey("conflictsData")) {
            bundle.putParcelableArray("conflictsData", (ConflictsArgData[]) this.arguments.get("conflictsData"));
        }
        return bundle;
    }

    public u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (this.arguments.containsKey("wayToMove")) {
            u0Var.h("wayToMove", (String) this.arguments.get("wayToMove"));
        }
        if (this.arguments.containsKey("wizardId")) {
            u0Var.h("wizardId", (String) this.arguments.get("wizardId"));
        }
        if (this.arguments.containsKey("targetDragAndDropIdArg")) {
            Long l10 = (Long) this.arguments.get("targetDragAndDropIdArg");
            l10.longValue();
            u0Var.h("targetDragAndDropIdArg", l10);
        }
        if (this.arguments.containsKey("ordinaryConflictsResolveMethod")) {
            u0Var.h("ordinaryConflictsResolveMethod", (String) this.arguments.get("ordinaryConflictsResolveMethod"));
        }
        if (this.arguments.containsKey("targetVaultKeyId")) {
            VaultKeyId vaultKeyId = (VaultKeyId) this.arguments.get("targetVaultKeyId");
            if (Parcelable.class.isAssignableFrom(VaultKeyId.class) || vaultKeyId == null) {
                u0Var.h("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
            } else {
                if (!Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                    throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                u0Var.h("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
            }
        }
        if (this.arguments.containsKey("credentialsMode")) {
            u0Var.h("credentialsMode", (String) this.arguments.get("credentialsMode"));
        }
        if (this.arguments.containsKey("sourceData")) {
            u0Var.h("sourceData", (SourceEntitiesArgData[]) this.arguments.get("sourceData"));
        }
        if (this.arguments.containsKey("conflictsData")) {
            u0Var.h("conflictsData", (ConflictsArgData[]) this.arguments.get("conflictsData"));
        }
        return u0Var;
    }

    public String toString() {
        return "PortForwardingConflictArgs{wayToMove=" + getWayToMove() + ", wizardId=" + getWizardId() + ", targetDragAndDropIdArg=" + getTargetDragAndDropIdArg() + ", ordinaryConflictsResolveMethod=" + getOrdinaryConflictsResolveMethod() + ", targetVaultKeyId=" + getTargetVaultKeyId() + ", credentialsMode=" + getCredentialsMode() + ", sourceData=" + getSourceData() + ", conflictsData=" + getConflictsData() + "}";
    }

    private PortForwardingConflictArgs() {
        this.arguments = new HashMap();
    }

    private PortForwardingConflictArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

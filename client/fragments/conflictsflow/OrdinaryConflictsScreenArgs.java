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
public class OrdinaryConflictsScreenArgs implements w {
    private final HashMap arguments;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24443a;

        public a(String str, String str2, long j10, VaultKeyId vaultKeyId, String str3, SourceEntitiesArgData[] sourceEntitiesArgDataArr, ConflictsArgData[] conflictsArgDataArr) {
            HashMap map = new HashMap();
            this.f24443a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
            }
            map.put("wayToMove", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
            }
            map.put("wizardId", str2);
            map.put("targetDragAndDropIdArg", Long.valueOf(j10));
            if (vaultKeyId == null) {
                throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
            }
            map.put("targetVaultKeyId", vaultKeyId);
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
            }
            map.put("credentialsMode", str3);
            if (sourceEntitiesArgDataArr == null) {
                throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
            }
            map.put("sourceData", sourceEntitiesArgDataArr);
            if (conflictsArgDataArr == null) {
                throw new IllegalArgumentException("Argument \"conflictsData\" is marked as non-null but was passed a null value.");
            }
            map.put("conflictsData", conflictsArgDataArr);
        }

        public OrdinaryConflictsScreenArgs a() {
            return new OrdinaryConflictsScreenArgs(this.f24443a);
        }
    }

    public static OrdinaryConflictsScreenArgs fromBundle(Bundle bundle) {
        SourceEntitiesArgData[] sourceEntitiesArgDataArr;
        OrdinaryConflictsScreenArgs ordinaryConflictsScreenArgs = new OrdinaryConflictsScreenArgs();
        bundle.setClassLoader(OrdinaryConflictsScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("wayToMove");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("wayToMove", string);
        if (!bundle.containsKey("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("wizardId");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("wizardId", string2);
        if (!bundle.containsKey("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        ordinaryConflictsScreenArgs.arguments.put("targetDragAndDropIdArg", Long.valueOf(bundle.getLong("targetDragAndDropIdArg")));
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
        ordinaryConflictsScreenArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!bundle.containsKey("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("credentialsMode");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("credentialsMode", string3);
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
        ordinaryConflictsScreenArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
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
        ordinaryConflictsScreenArgs.arguments.put("conflictsData", conflictsArgDataArr);
        return ordinaryConflictsScreenArgs;
    }

    public static OrdinaryConflictsScreenArgs fromSavedStateHandle(u0 u0Var) {
        OrdinaryConflictsScreenArgs ordinaryConflictsScreenArgs = new OrdinaryConflictsScreenArgs();
        if (!u0Var.b("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("wayToMove");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("wayToMove", str);
        if (!u0Var.b("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("wizardId");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("wizardId", str2);
        if (!u0Var.b("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) u0Var.c("targetDragAndDropIdArg");
        l10.longValue();
        ordinaryConflictsScreenArgs.arguments.put("targetDragAndDropIdArg", l10);
        if (!u0Var.b("targetVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"targetVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) u0Var.c("targetVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!u0Var.b("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) u0Var.c("credentialsMode");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("credentialsMode", str3);
        if (!u0Var.b("sourceData")) {
            throw new IllegalArgumentException("Required argument \"sourceData\" is missing and does not have an android:defaultValue");
        }
        SourceEntitiesArgData[] sourceEntitiesArgDataArr = (SourceEntitiesArgData[]) u0Var.c("sourceData");
        if (sourceEntitiesArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
        if (!u0Var.b("conflictsData")) {
            throw new IllegalArgumentException("Required argument \"conflictsData\" is missing and does not have an android:defaultValue");
        }
        ConflictsArgData[] conflictsArgDataArr = (ConflictsArgData[]) u0Var.c("conflictsData");
        if (conflictsArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"conflictsData\" is marked as non-null but was passed a null value.");
        }
        ordinaryConflictsScreenArgs.arguments.put("conflictsData", conflictsArgDataArr);
        return ordinaryConflictsScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrdinaryConflictsScreenArgs ordinaryConflictsScreenArgs = (OrdinaryConflictsScreenArgs) obj;
        if (this.arguments.containsKey("wayToMove") != ordinaryConflictsScreenArgs.arguments.containsKey("wayToMove")) {
            return false;
        }
        if (getWayToMove() == null ? ordinaryConflictsScreenArgs.getWayToMove() != null : !getWayToMove().equals(ordinaryConflictsScreenArgs.getWayToMove())) {
            return false;
        }
        if (this.arguments.containsKey("wizardId") != ordinaryConflictsScreenArgs.arguments.containsKey("wizardId")) {
            return false;
        }
        if (getWizardId() == null ? ordinaryConflictsScreenArgs.getWizardId() != null : !getWizardId().equals(ordinaryConflictsScreenArgs.getWizardId())) {
            return false;
        }
        if (this.arguments.containsKey("targetDragAndDropIdArg") != ordinaryConflictsScreenArgs.arguments.containsKey("targetDragAndDropIdArg") || getTargetDragAndDropIdArg() != ordinaryConflictsScreenArgs.getTargetDragAndDropIdArg() || this.arguments.containsKey("targetVaultKeyId") != ordinaryConflictsScreenArgs.arguments.containsKey("targetVaultKeyId")) {
            return false;
        }
        if (getTargetVaultKeyId() == null ? ordinaryConflictsScreenArgs.getTargetVaultKeyId() != null : !getTargetVaultKeyId().equals(ordinaryConflictsScreenArgs.getTargetVaultKeyId())) {
            return false;
        }
        if (this.arguments.containsKey("credentialsMode") != ordinaryConflictsScreenArgs.arguments.containsKey("credentialsMode")) {
            return false;
        }
        if (getCredentialsMode() == null ? ordinaryConflictsScreenArgs.getCredentialsMode() != null : !getCredentialsMode().equals(ordinaryConflictsScreenArgs.getCredentialsMode())) {
            return false;
        }
        if (this.arguments.containsKey("sourceData") != ordinaryConflictsScreenArgs.arguments.containsKey("sourceData")) {
            return false;
        }
        if (getSourceData() == null ? ordinaryConflictsScreenArgs.getSourceData() != null : !getSourceData().equals(ordinaryConflictsScreenArgs.getSourceData())) {
            return false;
        }
        if (this.arguments.containsKey("conflictsData") != ordinaryConflictsScreenArgs.arguments.containsKey("conflictsData")) {
            return false;
        }
        return getConflictsData() == null ? ordinaryConflictsScreenArgs.getConflictsData() == null : getConflictsData().equals(ordinaryConflictsScreenArgs.getConflictsData());
    }

    public ConflictsArgData[] getConflictsData() {
        return (ConflictsArgData[]) this.arguments.get("conflictsData");
    }

    public String getCredentialsMode() {
        return (String) this.arguments.get("credentialsMode");
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
        return (((((((((((((getWayToMove() != null ? getWayToMove().hashCode() : 0) + 31) * 31) + (getWizardId() != null ? getWizardId().hashCode() : 0)) * 31) + ((int) (getTargetDragAndDropIdArg() ^ (getTargetDragAndDropIdArg() >>> 32)))) * 31) + (getTargetVaultKeyId() != null ? getTargetVaultKeyId().hashCode() : 0)) * 31) + (getCredentialsMode() != null ? getCredentialsMode().hashCode() : 0)) * 31) + Arrays.hashCode(getSourceData())) * 31) + Arrays.hashCode(getConflictsData());
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
        return "OrdinaryConflictsScreenArgs{wayToMove=" + getWayToMove() + ", wizardId=" + getWizardId() + ", targetDragAndDropIdArg=" + getTargetDragAndDropIdArg() + ", targetVaultKeyId=" + getTargetVaultKeyId() + ", credentialsMode=" + getCredentialsMode() + ", sourceData=" + getSourceData() + ", conflictsData=" + getConflictsData() + "}";
    }

    private OrdinaryConflictsScreenArgs() {
        this.arguments = new HashMap();
    }

    private OrdinaryConflictsScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

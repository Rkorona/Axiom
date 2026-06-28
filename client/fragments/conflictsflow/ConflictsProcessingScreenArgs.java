package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import androidx.navigation.w;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ConflictsProcessingScreenArgs implements w {
    private final HashMap arguments;

    private ConflictsProcessingScreenArgs() {
        this.arguments = new HashMap();
    }

    public static ConflictsProcessingScreenArgs fromBundle(Bundle bundle) {
        SourceEntitiesArgData[] sourceEntitiesArgDataArr;
        ConflictsProcessingScreenArgs conflictsProcessingScreenArgs = new ConflictsProcessingScreenArgs();
        bundle.setClassLoader(ConflictsProcessingScreenArgs.class.getClassLoader());
        if (!bundle.containsKey("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("wayToMove");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("wayToMove", string);
        if (!bundle.containsKey("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("wizardId");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("wizardId", string2);
        if (!bundle.containsKey("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        conflictsProcessingScreenArgs.arguments.put("targetDragAndDropIdArg", Long.valueOf(bundle.getLong("targetDragAndDropIdArg")));
        if (!bundle.containsKey("ordinaryConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"ordinaryConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("ordinaryConflictsResolveMethod");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"ordinaryConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("ordinaryConflictsResolveMethod", string3);
        if (!bundle.containsKey("pfConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"pfConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("pfConflictsResolveMethod");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"pfConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("pfConflictsResolveMethod", string4);
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
        conflictsProcessingScreenArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!bundle.containsKey("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("credentialsMode");
        if (string5 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("credentialsMode", string5);
        if (!bundle.containsKey("sourceData")) {
            throw new IllegalArgumentException("Required argument \"sourceData\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("sourceData");
        if (parcelableArray != null) {
            sourceEntitiesArgDataArr = new SourceEntitiesArgData[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, sourceEntitiesArgDataArr, 0, parcelableArray.length);
        } else {
            sourceEntitiesArgDataArr = null;
        }
        if (sourceEntitiesArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
        return conflictsProcessingScreenArgs;
    }

    public static ConflictsProcessingScreenArgs fromSavedStateHandle(u0 u0Var) {
        ConflictsProcessingScreenArgs conflictsProcessingScreenArgs = new ConflictsProcessingScreenArgs();
        if (!u0Var.b("wayToMove")) {
            throw new IllegalArgumentException("Required argument \"wayToMove\" is missing and does not have an android:defaultValue");
        }
        String str = (String) u0Var.c("wayToMove");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"wayToMove\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("wayToMove", str);
        if (!u0Var.b("wizardId")) {
            throw new IllegalArgumentException("Required argument \"wizardId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) u0Var.c("wizardId");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"wizardId\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("wizardId", str2);
        if (!u0Var.b("targetDragAndDropIdArg")) {
            throw new IllegalArgumentException("Required argument \"targetDragAndDropIdArg\" is missing and does not have an android:defaultValue");
        }
        Long l10 = (Long) u0Var.c("targetDragAndDropIdArg");
        l10.longValue();
        conflictsProcessingScreenArgs.arguments.put("targetDragAndDropIdArg", l10);
        if (!u0Var.b("ordinaryConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"ordinaryConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) u0Var.c("ordinaryConflictsResolveMethod");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"ordinaryConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("ordinaryConflictsResolveMethod", str3);
        if (!u0Var.b("pfConflictsResolveMethod")) {
            throw new IllegalArgumentException("Required argument \"pfConflictsResolveMethod\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) u0Var.c("pfConflictsResolveMethod");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"pfConflictsResolveMethod\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("pfConflictsResolveMethod", str4);
        if (!u0Var.b("targetVaultKeyId")) {
            throw new IllegalArgumentException("Required argument \"targetVaultKeyId\" is missing and does not have an android:defaultValue");
        }
        VaultKeyId vaultKeyId = (VaultKeyId) u0Var.c("targetVaultKeyId");
        if (vaultKeyId == null) {
            throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("targetVaultKeyId", vaultKeyId);
        if (!u0Var.b("credentialsMode")) {
            throw new IllegalArgumentException("Required argument \"credentialsMode\" is missing and does not have an android:defaultValue");
        }
        String str5 = (String) u0Var.c("credentialsMode");
        if (str5 == null) {
            throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("credentialsMode", str5);
        if (!u0Var.b("sourceData")) {
            throw new IllegalArgumentException("Required argument \"sourceData\" is missing and does not have an android:defaultValue");
        }
        SourceEntitiesArgData[] sourceEntitiesArgDataArr = (SourceEntitiesArgData[]) u0Var.c("sourceData");
        if (sourceEntitiesArgDataArr == null) {
            throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
        }
        conflictsProcessingScreenArgs.arguments.put("sourceData", sourceEntitiesArgDataArr);
        return conflictsProcessingScreenArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConflictsProcessingScreenArgs conflictsProcessingScreenArgs = (ConflictsProcessingScreenArgs) obj;
        if (this.arguments.containsKey("wayToMove") != conflictsProcessingScreenArgs.arguments.containsKey("wayToMove")) {
            return false;
        }
        if (getWayToMove() == null ? conflictsProcessingScreenArgs.getWayToMove() != null : !getWayToMove().equals(conflictsProcessingScreenArgs.getWayToMove())) {
            return false;
        }
        if (this.arguments.containsKey("wizardId") != conflictsProcessingScreenArgs.arguments.containsKey("wizardId")) {
            return false;
        }
        if (getWizardId() == null ? conflictsProcessingScreenArgs.getWizardId() != null : !getWizardId().equals(conflictsProcessingScreenArgs.getWizardId())) {
            return false;
        }
        if (this.arguments.containsKey("targetDragAndDropIdArg") != conflictsProcessingScreenArgs.arguments.containsKey("targetDragAndDropIdArg") || getTargetDragAndDropIdArg() != conflictsProcessingScreenArgs.getTargetDragAndDropIdArg() || this.arguments.containsKey("ordinaryConflictsResolveMethod") != conflictsProcessingScreenArgs.arguments.containsKey("ordinaryConflictsResolveMethod")) {
            return false;
        }
        if (getOrdinaryConflictsResolveMethod() == null ? conflictsProcessingScreenArgs.getOrdinaryConflictsResolveMethod() != null : !getOrdinaryConflictsResolveMethod().equals(conflictsProcessingScreenArgs.getOrdinaryConflictsResolveMethod())) {
            return false;
        }
        if (this.arguments.containsKey("pfConflictsResolveMethod") != conflictsProcessingScreenArgs.arguments.containsKey("pfConflictsResolveMethod")) {
            return false;
        }
        if (getPfConflictsResolveMethod() == null ? conflictsProcessingScreenArgs.getPfConflictsResolveMethod() != null : !getPfConflictsResolveMethod().equals(conflictsProcessingScreenArgs.getPfConflictsResolveMethod())) {
            return false;
        }
        if (this.arguments.containsKey("targetVaultKeyId") != conflictsProcessingScreenArgs.arguments.containsKey("targetVaultKeyId")) {
            return false;
        }
        if (getTargetVaultKeyId() == null ? conflictsProcessingScreenArgs.getTargetVaultKeyId() != null : !getTargetVaultKeyId().equals(conflictsProcessingScreenArgs.getTargetVaultKeyId())) {
            return false;
        }
        if (this.arguments.containsKey("credentialsMode") != conflictsProcessingScreenArgs.arguments.containsKey("credentialsMode")) {
            return false;
        }
        if (getCredentialsMode() == null ? conflictsProcessingScreenArgs.getCredentialsMode() != null : !getCredentialsMode().equals(conflictsProcessingScreenArgs.getCredentialsMode())) {
            return false;
        }
        if (this.arguments.containsKey("sourceData") != conflictsProcessingScreenArgs.arguments.containsKey("sourceData")) {
            return false;
        }
        return getSourceData() == null ? conflictsProcessingScreenArgs.getSourceData() == null : getSourceData().equals(conflictsProcessingScreenArgs.getSourceData());
    }

    public String getCredentialsMode() {
        return (String) this.arguments.get("credentialsMode");
    }

    public String getOrdinaryConflictsResolveMethod() {
        return (String) this.arguments.get("ordinaryConflictsResolveMethod");
    }

    public String getPfConflictsResolveMethod() {
        return (String) this.arguments.get("pfConflictsResolveMethod");
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
        return (((((((((((((((getWayToMove() != null ? getWayToMove().hashCode() : 0) + 31) * 31) + (getWizardId() != null ? getWizardId().hashCode() : 0)) * 31) + ((int) (getTargetDragAndDropIdArg() ^ (getTargetDragAndDropIdArg() >>> 32)))) * 31) + (getOrdinaryConflictsResolveMethod() != null ? getOrdinaryConflictsResolveMethod().hashCode() : 0)) * 31) + (getPfConflictsResolveMethod() != null ? getPfConflictsResolveMethod().hashCode() : 0)) * 31) + (getTargetVaultKeyId() != null ? getTargetVaultKeyId().hashCode() : 0)) * 31) + (getCredentialsMode() != null ? getCredentialsMode().hashCode() : 0)) * 31) + Arrays.hashCode(getSourceData());
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
        if (this.arguments.containsKey("pfConflictsResolveMethod")) {
            bundle.putString("pfConflictsResolveMethod", (String) this.arguments.get("pfConflictsResolveMethod"));
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
        if (this.arguments.containsKey("pfConflictsResolveMethod")) {
            u0Var.h("pfConflictsResolveMethod", (String) this.arguments.get("pfConflictsResolveMethod"));
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
        return u0Var;
    }

    public String toString() {
        return "ConflictsProcessingScreenArgs{wayToMove=" + getWayToMove() + ", wizardId=" + getWizardId() + ", targetDragAndDropIdArg=" + getTargetDragAndDropIdArg() + ", ordinaryConflictsResolveMethod=" + getOrdinaryConflictsResolveMethod() + ", pfConflictsResolveMethod=" + getPfConflictsResolveMethod() + ", targetVaultKeyId=" + getTargetVaultKeyId() + ", credentialsMode=" + getCredentialsMode() + ", sourceData=" + getSourceData() + "}";
    }

    private ConflictsProcessingScreenArgs(HashMap map) {
        HashMap map2 = new HashMap();
        this.arguments = map2;
        map2.putAll(map);
    }
}

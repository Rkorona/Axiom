package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.conflictsflow.a$a, reason: collision with other inner class name */
    public static class C0390a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24466a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f24466a.containsKey("wayToMove")) {
                bundle.putString("wayToMove", (String) this.f24466a.get("wayToMove"));
            }
            if (this.f24466a.containsKey("wizardId")) {
                bundle.putString("wizardId", (String) this.f24466a.get("wizardId"));
            }
            if (this.f24466a.containsKey("targetDragAndDropIdArg")) {
                bundle.putLong("targetDragAndDropIdArg", ((Long) this.f24466a.get("targetDragAndDropIdArg")).longValue());
            }
            if (this.f24466a.containsKey("ordinaryConflictsResolveMethod")) {
                bundle.putString("ordinaryConflictsResolveMethod", (String) this.f24466a.get("ordinaryConflictsResolveMethod"));
            }
            if (this.f24466a.containsKey("pfConflictsResolveMethod")) {
                bundle.putString("pfConflictsResolveMethod", (String) this.f24466a.get("pfConflictsResolveMethod"));
            }
            if (this.f24466a.containsKey("targetVaultKeyId")) {
                VaultKeyId vaultKeyId = (VaultKeyId) this.f24466a.get("targetVaultKeyId");
                if (Parcelable.class.isAssignableFrom(VaultKeyId.class) || vaultKeyId == null) {
                    bundle.putParcelable("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
                } else {
                    if (!Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                        throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                }
            }
            if (this.f24466a.containsKey("credentialsMode")) {
                bundle.putString("credentialsMode", (String) this.f24466a.get("credentialsMode"));
            }
            if (this.f24466a.containsKey("sourceData")) {
                bundle.putParcelableArray("sourceData", (SourceEntitiesArgData[]) this.f24466a.get("sourceData"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_dependenciesConflictsScreen_to_conflicts_processing_screen;
        }

        public String c() {
            return (String) this.f24466a.get("credentialsMode");
        }

        public String d() {
            return (String) this.f24466a.get("ordinaryConflictsResolveMethod");
        }

        public String e() {
            return (String) this.f24466a.get("pfConflictsResolveMethod");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0390a c0390a = (C0390a) obj;
            if (this.f24466a.containsKey("wayToMove") != c0390a.f24466a.containsKey("wayToMove")) {
                return false;
            }
            if (i() == null ? c0390a.i() != null : !i().equals(c0390a.i())) {
                return false;
            }
            if (this.f24466a.containsKey("wizardId") != c0390a.f24466a.containsKey("wizardId")) {
                return false;
            }
            if (j() == null ? c0390a.j() != null : !j().equals(c0390a.j())) {
                return false;
            }
            if (this.f24466a.containsKey("targetDragAndDropIdArg") != c0390a.f24466a.containsKey("targetDragAndDropIdArg") || g() != c0390a.g() || this.f24466a.containsKey("ordinaryConflictsResolveMethod") != c0390a.f24466a.containsKey("ordinaryConflictsResolveMethod")) {
                return false;
            }
            if (d() == null ? c0390a.d() != null : !d().equals(c0390a.d())) {
                return false;
            }
            if (this.f24466a.containsKey("pfConflictsResolveMethod") != c0390a.f24466a.containsKey("pfConflictsResolveMethod")) {
                return false;
            }
            if (e() == null ? c0390a.e() != null : !e().equals(c0390a.e())) {
                return false;
            }
            if (this.f24466a.containsKey("targetVaultKeyId") != c0390a.f24466a.containsKey("targetVaultKeyId")) {
                return false;
            }
            if (h() == null ? c0390a.h() != null : !h().equals(c0390a.h())) {
                return false;
            }
            if (this.f24466a.containsKey("credentialsMode") != c0390a.f24466a.containsKey("credentialsMode")) {
                return false;
            }
            if (c() == null ? c0390a.c() != null : !c().equals(c0390a.c())) {
                return false;
            }
            if (this.f24466a.containsKey("sourceData") != c0390a.f24466a.containsKey("sourceData")) {
                return false;
            }
            if (f() == null ? c0390a.f() == null : f().equals(c0390a.f())) {
                return b() == c0390a.b();
            }
            return false;
        }

        public SourceEntitiesArgData[] f() {
            return (SourceEntitiesArgData[]) this.f24466a.get("sourceData");
        }

        public long g() {
            return ((Long) this.f24466a.get("targetDragAndDropIdArg")).longValue();
        }

        public VaultKeyId h() {
            return (VaultKeyId) this.f24466a.get("targetVaultKeyId");
        }

        public int hashCode() {
            return (((((((((((((((((i() != null ? i().hashCode() : 0) + 31) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + ((int) (g() ^ (g() >>> 32)))) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + Arrays.hashCode(f())) * 31) + b();
        }

        public String i() {
            return (String) this.f24466a.get("wayToMove");
        }

        public String j() {
            return (String) this.f24466a.get("wizardId");
        }

        public String toString() {
            return "ActionDependenciesConflictsScreenToConflictsProcessingScreen(actionId=" + b() + "){wayToMove=" + i() + ", wizardId=" + j() + ", targetDragAndDropIdArg=" + g() + ", ordinaryConflictsResolveMethod=" + d() + ", pfConflictsResolveMethod=" + e() + ", targetVaultKeyId=" + h() + ", credentialsMode=" + c() + ", sourceData=" + f() + "}";
        }

        private C0390a(String str, String str2, long j10, String str3, String str4, VaultKeyId vaultKeyId, String str5, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
            HashMap map = new HashMap();
            this.f24466a = map;
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
            if (str4 == null) {
                throw new IllegalArgumentException("Argument \"pfConflictsResolveMethod\" is marked as non-null but was passed a null value.");
            }
            map.put("pfConflictsResolveMethod", str4);
            if (vaultKeyId == null) {
                throw new IllegalArgumentException("Argument \"targetVaultKeyId\" is marked as non-null but was passed a null value.");
            }
            map.put("targetVaultKeyId", vaultKeyId);
            if (str5 == null) {
                throw new IllegalArgumentException("Argument \"credentialsMode\" is marked as non-null but was passed a null value.");
            }
            map.put("credentialsMode", str5);
            if (sourceEntitiesArgDataArr == null) {
                throw new IllegalArgumentException("Argument \"sourceData\" is marked as non-null but was passed a null value.");
            }
            map.put("sourceData", sourceEntitiesArgDataArr);
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24467a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f24467a.containsKey("wayToMove")) {
                bundle.putString("wayToMove", (String) this.f24467a.get("wayToMove"));
            }
            if (this.f24467a.containsKey("wizardId")) {
                bundle.putString("wizardId", (String) this.f24467a.get("wizardId"));
            }
            if (this.f24467a.containsKey("targetDragAndDropIdArg")) {
                bundle.putLong("targetDragAndDropIdArg", ((Long) this.f24467a.get("targetDragAndDropIdArg")).longValue());
            }
            if (this.f24467a.containsKey("ordinaryConflictsResolveMethod")) {
                bundle.putString("ordinaryConflictsResolveMethod", (String) this.f24467a.get("ordinaryConflictsResolveMethod"));
            }
            if (this.f24467a.containsKey("targetVaultKeyId")) {
                VaultKeyId vaultKeyId = (VaultKeyId) this.f24467a.get("targetVaultKeyId");
                if (Parcelable.class.isAssignableFrom(VaultKeyId.class) || vaultKeyId == null) {
                    bundle.putParcelable("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
                } else {
                    if (!Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                        throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                }
            }
            if (this.f24467a.containsKey("credentialsMode")) {
                bundle.putString("credentialsMode", (String) this.f24467a.get("credentialsMode"));
            }
            if (this.f24467a.containsKey("sourceData")) {
                bundle.putParcelableArray("sourceData", (SourceEntitiesArgData[]) this.f24467a.get("sourceData"));
            }
            if (this.f24467a.containsKey("conflictsData")) {
                bundle.putParcelableArray("conflictsData", (ConflictsArgData[]) this.f24467a.get("conflictsData"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_dependenciesConflictsScreen_to_pf_conflict_screen;
        }

        public ConflictsArgData[] c() {
            return (ConflictsArgData[]) this.f24467a.get("conflictsData");
        }

        public String d() {
            return (String) this.f24467a.get("credentialsMode");
        }

        public String e() {
            return (String) this.f24467a.get("ordinaryConflictsResolveMethod");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24467a.containsKey("wayToMove") != bVar.f24467a.containsKey("wayToMove")) {
                return false;
            }
            if (i() == null ? bVar.i() != null : !i().equals(bVar.i())) {
                return false;
            }
            if (this.f24467a.containsKey("wizardId") != bVar.f24467a.containsKey("wizardId")) {
                return false;
            }
            if (j() == null ? bVar.j() != null : !j().equals(bVar.j())) {
                return false;
            }
            if (this.f24467a.containsKey("targetDragAndDropIdArg") != bVar.f24467a.containsKey("targetDragAndDropIdArg") || g() != bVar.g() || this.f24467a.containsKey("ordinaryConflictsResolveMethod") != bVar.f24467a.containsKey("ordinaryConflictsResolveMethod")) {
                return false;
            }
            if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
                return false;
            }
            if (this.f24467a.containsKey("targetVaultKeyId") != bVar.f24467a.containsKey("targetVaultKeyId")) {
                return false;
            }
            if (h() == null ? bVar.h() != null : !h().equals(bVar.h())) {
                return false;
            }
            if (this.f24467a.containsKey("credentialsMode") != bVar.f24467a.containsKey("credentialsMode")) {
                return false;
            }
            if (d() == null ? bVar.d() != null : !d().equals(bVar.d())) {
                return false;
            }
            if (this.f24467a.containsKey("sourceData") != bVar.f24467a.containsKey("sourceData")) {
                return false;
            }
            if (f() == null ? bVar.f() != null : !f().equals(bVar.f())) {
                return false;
            }
            if (this.f24467a.containsKey("conflictsData") != bVar.f24467a.containsKey("conflictsData")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return b() == bVar.b();
            }
            return false;
        }

        public SourceEntitiesArgData[] f() {
            return (SourceEntitiesArgData[]) this.f24467a.get("sourceData");
        }

        public long g() {
            return ((Long) this.f24467a.get("targetDragAndDropIdArg")).longValue();
        }

        public VaultKeyId h() {
            return (VaultKeyId) this.f24467a.get("targetVaultKeyId");
        }

        public int hashCode() {
            return (((((((((((((((((i() != null ? i().hashCode() : 0) + 31) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + ((int) (g() ^ (g() >>> 32)))) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0)) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + Arrays.hashCode(f())) * 31) + Arrays.hashCode(c())) * 31) + b();
        }

        public String i() {
            return (String) this.f24467a.get("wayToMove");
        }

        public String j() {
            return (String) this.f24467a.get("wizardId");
        }

        public String toString() {
            return "ActionDependenciesConflictsScreenToPfConflictScreen(actionId=" + b() + "){wayToMove=" + i() + ", wizardId=" + j() + ", targetDragAndDropIdArg=" + g() + ", ordinaryConflictsResolveMethod=" + e() + ", targetVaultKeyId=" + h() + ", credentialsMode=" + d() + ", sourceData=" + f() + ", conflictsData=" + c() + "}";
        }

        private b(String str, String str2, long j10, String str3, VaultKeyId vaultKeyId, String str4, SourceEntitiesArgData[] sourceEntitiesArgDataArr, ConflictsArgData[] conflictsArgDataArr) {
            HashMap map = new HashMap();
            this.f24467a = map;
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
    }

    public static C0390a a(String str, String str2, long j10, String str3, String str4, VaultKeyId vaultKeyId, String str5, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        return new C0390a(str, str2, j10, str3, str4, vaultKeyId, str5, sourceEntitiesArgDataArr);
    }

    public static b b(String str, String str2, long j10, String str3, VaultKeyId vaultKeyId, String str4, SourceEntitiesArgData[] sourceEntitiesArgDataArr, ConflictsArgData[] conflictsArgDataArr) {
        return new b(str, str2, j10, str3, vaultKeyId, str4, sourceEntitiesArgDataArr, conflictsArgDataArr);
    }
}

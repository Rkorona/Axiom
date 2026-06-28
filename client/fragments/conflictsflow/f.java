package com.server.auditor.ssh.client.fragments.conflictsflow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f24472a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f24472a.containsKey("wayToMove")) {
                bundle.putString("wayToMove", (String) this.f24472a.get("wayToMove"));
            }
            if (this.f24472a.containsKey("wizardId")) {
                bundle.putString("wizardId", (String) this.f24472a.get("wizardId"));
            }
            if (this.f24472a.containsKey("targetDragAndDropIdArg")) {
                bundle.putLong("targetDragAndDropIdArg", ((Long) this.f24472a.get("targetDragAndDropIdArg")).longValue());
            }
            if (this.f24472a.containsKey("ordinaryConflictsResolveMethod")) {
                bundle.putString("ordinaryConflictsResolveMethod", (String) this.f24472a.get("ordinaryConflictsResolveMethod"));
            }
            if (this.f24472a.containsKey("pfConflictsResolveMethod")) {
                bundle.putString("pfConflictsResolveMethod", (String) this.f24472a.get("pfConflictsResolveMethod"));
            }
            if (this.f24472a.containsKey("targetVaultKeyId")) {
                VaultKeyId vaultKeyId = (VaultKeyId) this.f24472a.get("targetVaultKeyId");
                if (Parcelable.class.isAssignableFrom(VaultKeyId.class) || vaultKeyId == null) {
                    bundle.putParcelable("targetVaultKeyId", (Parcelable) Parcelable.class.cast(vaultKeyId));
                } else {
                    if (!Serializable.class.isAssignableFrom(VaultKeyId.class)) {
                        throw new UnsupportedOperationException(VaultKeyId.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("targetVaultKeyId", (Serializable) Serializable.class.cast(vaultKeyId));
                }
            }
            if (this.f24472a.containsKey("credentialsMode")) {
                bundle.putString("credentialsMode", (String) this.f24472a.get("credentialsMode"));
            }
            if (this.f24472a.containsKey("sourceData")) {
                bundle.putParcelableArray("sourceData", (SourceEntitiesArgData[]) this.f24472a.get("sourceData"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_pf_conflict_screen_to_conflicts_processing_screen;
        }

        public String c() {
            return (String) this.f24472a.get("credentialsMode");
        }

        public String d() {
            return (String) this.f24472a.get("ordinaryConflictsResolveMethod");
        }

        public String e() {
            return (String) this.f24472a.get("pfConflictsResolveMethod");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24472a.containsKey("wayToMove") != aVar.f24472a.containsKey("wayToMove")) {
                return false;
            }
            if (i() == null ? aVar.i() != null : !i().equals(aVar.i())) {
                return false;
            }
            if (this.f24472a.containsKey("wizardId") != aVar.f24472a.containsKey("wizardId")) {
                return false;
            }
            if (j() == null ? aVar.j() != null : !j().equals(aVar.j())) {
                return false;
            }
            if (this.f24472a.containsKey("targetDragAndDropIdArg") != aVar.f24472a.containsKey("targetDragAndDropIdArg") || g() != aVar.g() || this.f24472a.containsKey("ordinaryConflictsResolveMethod") != aVar.f24472a.containsKey("ordinaryConflictsResolveMethod")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f24472a.containsKey("pfConflictsResolveMethod") != aVar.f24472a.containsKey("pfConflictsResolveMethod")) {
                return false;
            }
            if (e() == null ? aVar.e() != null : !e().equals(aVar.e())) {
                return false;
            }
            if (this.f24472a.containsKey("targetVaultKeyId") != aVar.f24472a.containsKey("targetVaultKeyId")) {
                return false;
            }
            if (h() == null ? aVar.h() != null : !h().equals(aVar.h())) {
                return false;
            }
            if (this.f24472a.containsKey("credentialsMode") != aVar.f24472a.containsKey("credentialsMode")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f24472a.containsKey("sourceData") != aVar.f24472a.containsKey("sourceData")) {
                return false;
            }
            if (f() == null ? aVar.f() == null : f().equals(aVar.f())) {
                return b() == aVar.b();
            }
            return false;
        }

        public SourceEntitiesArgData[] f() {
            return (SourceEntitiesArgData[]) this.f24472a.get("sourceData");
        }

        public long g() {
            return ((Long) this.f24472a.get("targetDragAndDropIdArg")).longValue();
        }

        public VaultKeyId h() {
            return (VaultKeyId) this.f24472a.get("targetVaultKeyId");
        }

        public int hashCode() {
            return (((((((((((((((((i() != null ? i().hashCode() : 0) + 31) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + ((int) (g() ^ (g() >>> 32)))) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + Arrays.hashCode(f())) * 31) + b();
        }

        public String i() {
            return (String) this.f24472a.get("wayToMove");
        }

        public String j() {
            return (String) this.f24472a.get("wizardId");
        }

        public String toString() {
            return "ActionPfConflictScreenToConflictsProcessingScreen(actionId=" + b() + "){wayToMove=" + i() + ", wizardId=" + j() + ", targetDragAndDropIdArg=" + g() + ", ordinaryConflictsResolveMethod=" + d() + ", pfConflictsResolveMethod=" + e() + ", targetVaultKeyId=" + h() + ", credentialsMode=" + c() + ", sourceData=" + f() + "}";
        }

        private a(String str, String str2, long j10, String str3, String str4, VaultKeyId vaultKeyId, String str5, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
            HashMap map = new HashMap();
            this.f24472a = map;
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

    public static a a(String str, String str2, long j10, String str3, String str4, VaultKeyId vaultKeyId, String str5, SourceEntitiesArgData[] sourceEntitiesArgDataArr) {
        return new a(str, str2, j10, str3, str4, vaultKeyId, str5, sourceEntitiesArgDataArr);
    }
}

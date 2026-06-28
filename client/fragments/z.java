package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f27018a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f27018a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f27018a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f27018a.containsKey("typedEntityToShareIdentifiers")) {
                bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.f27018a.get("typedEntityToShareIdentifiers"));
            }
            if (this.f27018a.containsKey("callerFeature")) {
                bundle.putString("callerFeature", (String) this.f27018a.get("callerFeature"));
            } else {
                bundle.putString("callerFeature", null);
            }
            if (this.f27018a.containsKey("analyticsFunnelId")) {
                bundle.putString("analyticsFunnelId", (String) this.f27018a.get("analyticsFunnelId"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultOnboardingScreen_to_setupTeamVaultCredentialsModeScreen;
        }

        public String c() {
            return (String) this.f27018a.get("analyticsFunnelId");
        }

        public String d() {
            return (String) this.f27018a.get("callerFeature");
        }

        public int e() {
            return ((Integer) this.f27018a.get("invitedColleaguesCount")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27018a.containsKey("invitedColleaguesCount") != aVar.f27018a.containsKey("invitedColleaguesCount") || e() != aVar.e() || this.f27018a.containsKey("typedEntityToShareIdentifiers") != aVar.f27018a.containsKey("typedEntityToShareIdentifiers")) {
                return false;
            }
            if (f() == null ? aVar.f() != null : !f().equals(aVar.f())) {
                return false;
            }
            if (this.f27018a.containsKey("callerFeature") != aVar.f27018a.containsKey("callerFeature")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f27018a.containsKey("analyticsFunnelId") != aVar.f27018a.containsKey("analyticsFunnelId")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public TypedEntityIdentifier[] f() {
            return (TypedEntityIdentifier[]) this.f27018a.get("typedEntityToShareIdentifiers");
        }

        public int hashCode() {
            return ((((((((e() + 31) * 31) + Arrays.hashCode(f())) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultOnboardingScreenToSetupTeamVaultCredentialsModeScreen(actionId=" + b() + "){invitedColleaguesCount=" + e() + ", typedEntityToShareIdentifiers=" + f() + ", callerFeature=" + d() + ", analyticsFunnelId=" + c() + "}";
        }

        private a(int i10, TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
            HashMap map = new HashMap();
            this.f27018a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            if (typedEntityIdentifierArr == null) {
                throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
            }
            map.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("analyticsFunnelId", str);
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f27019a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f27019a.containsKey("typedEntityToShareIdentifiers")) {
                bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.f27019a.get("typedEntityToShareIdentifiers"));
            }
            if (this.f27019a.containsKey("isSharedCredentials")) {
                bundle.putBoolean("isSharedCredentials", ((Boolean) this.f27019a.get("isSharedCredentials")).booleanValue());
            }
            if (this.f27019a.containsKey("analyticsFunnelId")) {
                bundle.putString("analyticsFunnelId", (String) this.f27019a.get("analyticsFunnelId"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultOnboardingScreen_to_setupTeamVaultInviteColleaguesScreen;
        }

        public String c() {
            return (String) this.f27019a.get("analyticsFunnelId");
        }

        public boolean d() {
            return ((Boolean) this.f27019a.get("isSharedCredentials")).booleanValue();
        }

        public TypedEntityIdentifier[] e() {
            return (TypedEntityIdentifier[]) this.f27019a.get("typedEntityToShareIdentifiers");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f27019a.containsKey("typedEntityToShareIdentifiers") != bVar.f27019a.containsKey("typedEntityToShareIdentifiers")) {
                return false;
            }
            if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
                return false;
            }
            if (this.f27019a.containsKey("isSharedCredentials") != bVar.f27019a.containsKey("isSharedCredentials") || d() != bVar.d() || this.f27019a.containsKey("analyticsFunnelId") != bVar.f27019a.containsKey("analyticsFunnelId")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return b() == bVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((((Arrays.hashCode(e()) + 31) * 31) + (d() ? 1 : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultOnboardingScreenToSetupTeamVaultInviteColleaguesScreen(actionId=" + b() + "){typedEntityToShareIdentifiers=" + e() + ", isSharedCredentials=" + d() + ", analyticsFunnelId=" + c() + "}";
        }

        private b(TypedEntityIdentifier[] typedEntityIdentifierArr, boolean z10, String str) {
            HashMap map = new HashMap();
            this.f27019a = map;
            if (typedEntityIdentifierArr == null) {
                throw new IllegalArgumentException("Argument \"typedEntityToShareIdentifiers\" is marked as non-null but was passed a null value.");
            }
            map.put("typedEntityToShareIdentifiers", typedEntityIdentifierArr);
            map.put("isSharedCredentials", Boolean.valueOf(z10));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"analyticsFunnelId\" is marked as non-null but was passed a null value.");
            }
            map.put("analyticsFunnelId", str);
        }
    }

    public static a a(int i10, TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
        return new a(i10, typedEntityIdentifierArr, str);
    }

    public static b b(TypedEntityIdentifier[] typedEntityIdentifierArr, boolean z10, String str) {
        return new b(typedEntityIdentifierArr, z10, str);
    }
}

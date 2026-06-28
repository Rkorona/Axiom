package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25969a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25969a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f25969a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f25969a.containsKey("isSharedCredentials")) {
                bundle.putBoolean("isSharedCredentials", ((Boolean) this.f25969a.get("isSharedCredentials")).booleanValue());
            }
            if (this.f25969a.containsKey("callerFeature")) {
                bundle.putString("callerFeature", (String) this.f25969a.get("callerFeature"));
                return bundle;
            }
            bundle.putString("callerFeature", null);
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultCredentialsModeScreen_to_setupTeamVaultEntitiesToShareScreen;
        }

        public String c() {
            return (String) this.f25969a.get("callerFeature");
        }

        public int d() {
            return ((Integer) this.f25969a.get("invitedColleaguesCount")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25969a.get("isSharedCredentials")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25969a.containsKey("invitedColleaguesCount") != aVar.f25969a.containsKey("invitedColleaguesCount") || d() != aVar.d() || this.f25969a.containsKey("isSharedCredentials") != aVar.f25969a.containsKey("isSharedCredentials") || e() != aVar.e() || this.f25969a.containsKey("callerFeature") != aVar.f25969a.containsKey("callerFeature")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public a f(String str) {
            this.f25969a.put("callerFeature", str);
            return this;
        }

        public int hashCode() {
            return ((((((d() + 31) * 31) + (e() ? 1 : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultCredentialsModeScreenToSetupTeamVaultEntitiesToShareScreen(actionId=" + b() + "){invitedColleaguesCount=" + d() + ", isSharedCredentials=" + e() + ", callerFeature=" + c() + "}";
        }

        private a(int i10, boolean z10) {
            HashMap map = new HashMap();
            this.f25969a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            map.put("isSharedCredentials", Boolean.valueOf(z10));
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25970a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25970a.containsKey("typedEntityToShareIdentifiers")) {
                bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.f25970a.get("typedEntityToShareIdentifiers"));
            }
            if (this.f25970a.containsKey("isSharedCredentials")) {
                bundle.putBoolean("isSharedCredentials", ((Boolean) this.f25970a.get("isSharedCredentials")).booleanValue());
            }
            if (this.f25970a.containsKey("analyticsFunnelId")) {
                bundle.putString("analyticsFunnelId", (String) this.f25970a.get("analyticsFunnelId"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultCredentialsModeScreen_to_setupTeamVaultInviteColleaguesScreen;
        }

        public String c() {
            return (String) this.f25970a.get("analyticsFunnelId");
        }

        public boolean d() {
            return ((Boolean) this.f25970a.get("isSharedCredentials")).booleanValue();
        }

        public TypedEntityIdentifier[] e() {
            return (TypedEntityIdentifier[]) this.f25970a.get("typedEntityToShareIdentifiers");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25970a.containsKey("typedEntityToShareIdentifiers") != bVar.f25970a.containsKey("typedEntityToShareIdentifiers")) {
                return false;
            }
            if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
                return false;
            }
            if (this.f25970a.containsKey("isSharedCredentials") != bVar.f25970a.containsKey("isSharedCredentials") || d() != bVar.d() || this.f25970a.containsKey("analyticsFunnelId") != bVar.f25970a.containsKey("analyticsFunnelId")) {
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
            return "ActionSetupTeamVaultCredentialsModeScreenToSetupTeamVaultInviteColleaguesScreen(actionId=" + b() + "){typedEntityToShareIdentifiers=" + e() + ", isSharedCredentials=" + d() + ", analyticsFunnelId=" + c() + "}";
        }

        private b(TypedEntityIdentifier[] typedEntityIdentifierArr, boolean z10, String str) {
            HashMap map = new HashMap();
            this.f25970a = map;
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

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25971a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25971a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f25971a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f25971a.containsKey("sharedEntities")) {
                bundle.putParcelableArray("sharedEntities", (SetupTeamVaultShareEntitiesSectionType[]) this.f25971a.get("sharedEntities"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultCredentialsModeScreen_to_setupTeamVaultSuccessScreen;
        }

        public int c() {
            return ((Integer) this.f25971a.get("invitedColleaguesCount")).intValue();
        }

        public SetupTeamVaultShareEntitiesSectionType[] d() {
            return (SetupTeamVaultShareEntitiesSectionType[]) this.f25971a.get("sharedEntities");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25971a.containsKey("invitedColleaguesCount") != cVar.f25971a.containsKey("invitedColleaguesCount") || c() != cVar.c() || this.f25971a.containsKey("sharedEntities") != cVar.f25971a.containsKey("sharedEntities")) {
                return false;
            }
            if (d() == null ? cVar.d() == null : d().equals(cVar.d())) {
                return b() == cVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((c() + 31) * 31) + Arrays.hashCode(d())) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultCredentialsModeScreenToSetupTeamVaultSuccessScreen(actionId=" + b() + "){invitedColleaguesCount=" + c() + ", sharedEntities=" + d() + "}";
        }

        private c(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
            HashMap map = new HashMap();
            this.f25971a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            if (setupTeamVaultShareEntitiesSectionTypeArr == null) {
                throw new IllegalArgumentException("Argument \"sharedEntities\" is marked as non-null but was passed a null value.");
            }
            map.put("sharedEntities", setupTeamVaultShareEntitiesSectionTypeArr);
        }
    }

    public static a a(int i10, boolean z10) {
        return new a(i10, z10);
    }

    public static b b(TypedEntityIdentifier[] typedEntityIdentifierArr, boolean z10, String str) {
        return new b(typedEntityIdentifierArr, z10, str);
    }

    public static c c(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
        return new c(i10, setupTeamVaultShareEntitiesSectionTypeArr);
    }
}

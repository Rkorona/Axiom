package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26988a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26988a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f26988a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f26988a.containsKey("typedEntityToShareIdentifiers")) {
                bundle.putParcelableArray("typedEntityToShareIdentifiers", (TypedEntityIdentifier[]) this.f26988a.get("typedEntityToShareIdentifiers"));
            }
            if (this.f26988a.containsKey("callerFeature")) {
                bundle.putString("callerFeature", (String) this.f26988a.get("callerFeature"));
            } else {
                bundle.putString("callerFeature", null);
            }
            if (this.f26988a.containsKey("analyticsFunnelId")) {
                bundle.putString("analyticsFunnelId", (String) this.f26988a.get("analyticsFunnelId"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultInviteColleaguesScreen_to_setupTeamVaultCredentialsModeScreen;
        }

        public String c() {
            return (String) this.f26988a.get("analyticsFunnelId");
        }

        public String d() {
            return (String) this.f26988a.get("callerFeature");
        }

        public int e() {
            return ((Integer) this.f26988a.get("invitedColleaguesCount")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26988a.containsKey("invitedColleaguesCount") != aVar.f26988a.containsKey("invitedColleaguesCount") || e() != aVar.e() || this.f26988a.containsKey("typedEntityToShareIdentifiers") != aVar.f26988a.containsKey("typedEntityToShareIdentifiers")) {
                return false;
            }
            if (f() == null ? aVar.f() != null : !f().equals(aVar.f())) {
                return false;
            }
            if (this.f26988a.containsKey("callerFeature") != aVar.f26988a.containsKey("callerFeature")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f26988a.containsKey("analyticsFunnelId") != aVar.f26988a.containsKey("analyticsFunnelId")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public TypedEntityIdentifier[] f() {
            return (TypedEntityIdentifier[]) this.f26988a.get("typedEntityToShareIdentifiers");
        }

        public int hashCode() {
            return ((((((((e() + 31) * 31) + Arrays.hashCode(f())) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultInviteColleaguesScreenToSetupTeamVaultCredentialsModeScreen(actionId=" + b() + "){invitedColleaguesCount=" + e() + ", typedEntityToShareIdentifiers=" + f() + ", callerFeature=" + d() + ", analyticsFunnelId=" + c() + "}";
        }

        private a(int i10, TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
            HashMap map = new HashMap();
            this.f26988a = map;
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
        private final HashMap f26989a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26989a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f26989a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f26989a.containsKey("sharedEntities")) {
                bundle.putParcelableArray("sharedEntities", (SetupTeamVaultShareEntitiesSectionType[]) this.f26989a.get("sharedEntities"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultInviteColleaguesScreen_to_setupTeamVaultSuccessScreen;
        }

        public int c() {
            return ((Integer) this.f26989a.get("invitedColleaguesCount")).intValue();
        }

        public SetupTeamVaultShareEntitiesSectionType[] d() {
            return (SetupTeamVaultShareEntitiesSectionType[]) this.f26989a.get("sharedEntities");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26989a.containsKey("invitedColleaguesCount") != bVar.f26989a.containsKey("invitedColleaguesCount") || c() != bVar.c() || this.f26989a.containsKey("sharedEntities") != bVar.f26989a.containsKey("sharedEntities")) {
                return false;
            }
            if (d() == null ? bVar.d() == null : d().equals(bVar.d())) {
                return b() == bVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((c() + 31) * 31) + Arrays.hashCode(d())) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultInviteColleaguesScreenToSetupTeamVaultSuccessScreen(actionId=" + b() + "){invitedColleaguesCount=" + c() + ", sharedEntities=" + d() + "}";
        }

        private b(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
            HashMap map = new HashMap();
            this.f26989a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            if (setupTeamVaultShareEntitiesSectionTypeArr == null) {
                throw new IllegalArgumentException("Argument \"sharedEntities\" is marked as non-null but was passed a null value.");
            }
            map.put("sharedEntities", setupTeamVaultShareEntitiesSectionTypeArr);
        }
    }

    public static a a(int i10, TypedEntityIdentifier[] typedEntityIdentifierArr, String str) {
        return new a(i10, typedEntityIdentifierArr, str);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_setupTeamVaultInviteColleaguesScreen_to_setupTeamVaultInternalErrorScreen);
    }

    public static k1 c() {
        return new androidx.navigation.a(R.id.action_setupTeamVaultInviteColleaguesScreen_to_setupTeamVaultNetworkErrorScreen);
    }

    public static b d(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
        return new b(i10, setupTeamVaultShareEntitiesSectionTypeArr);
    }
}

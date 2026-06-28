package com.server.auditor.ssh.client.fragments;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26968a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26968a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f26968a.get("invitedColleaguesCount")).intValue());
            }
            if (this.f26968a.containsKey("sharedEntities")) {
                bundle.putParcelableArray("sharedEntities", (SetupTeamVaultShareEntitiesSectionType[]) this.f26968a.get("sharedEntities"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_setupTeamVaultEntitiesToShareScreen_to_setupTeamVaultSuccessScreen;
        }

        public int c() {
            return ((Integer) this.f26968a.get("invitedColleaguesCount")).intValue();
        }

        public SetupTeamVaultShareEntitiesSectionType[] d() {
            return (SetupTeamVaultShareEntitiesSectionType[]) this.f26968a.get("sharedEntities");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26968a.containsKey("invitedColleaguesCount") != aVar.f26968a.containsKey("invitedColleaguesCount") || c() != aVar.c() || this.f26968a.containsKey("sharedEntities") != aVar.f26968a.containsKey("sharedEntities")) {
                return false;
            }
            if (d() == null ? aVar.d() == null : d().equals(aVar.d())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((c() + 31) * 31) + Arrays.hashCode(d())) * 31) + b();
        }

        public String toString() {
            return "ActionSetupTeamVaultEntitiesToShareScreenToSetupTeamVaultSuccessScreen(actionId=" + b() + "){invitedColleaguesCount=" + c() + ", sharedEntities=" + d() + "}";
        }

        private a(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
            HashMap map = new HashMap();
            this.f26968a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
            if (setupTeamVaultShareEntitiesSectionTypeArr == null) {
                throw new IllegalArgumentException("Argument \"sharedEntities\" is marked as non-null but was passed a null value.");
            }
            map.put("sharedEntities", setupTeamVaultShareEntitiesSectionTypeArr);
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_setupTeamVaultEntitiesToShareScreen_to_setupTeamVaultInternalErrorScreen);
    }

    public static a b(int i10, SetupTeamVaultShareEntitiesSectionType[] setupTeamVaultShareEntitiesSectionTypeArr) {
        return new a(i10, setupTeamVaultShareEntitiesSectionTypeArr);
    }
}

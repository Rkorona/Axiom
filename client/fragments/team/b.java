package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26692a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26692a.containsKey("invitedColleaguesCount")) {
                bundle.putInt("invitedColleaguesCount", ((Integer) this.f26692a.get("invitedColleaguesCount")).intValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_teamPresenceInviteColleaguesScreen_to_teamPresenceSetupTeamVaultPromotionScreen;
        }

        public int c() {
            return ((Integer) this.f26692a.get("invitedColleaguesCount")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26692a.containsKey("invitedColleaguesCount") == aVar.f26692a.containsKey("invitedColleaguesCount") && c() == aVar.c() && b() == aVar.b();
        }

        public int hashCode() {
            return ((c() + 31) * 31) + b();
        }

        public String toString() {
            return "ActionTeamPresenceInviteColleaguesScreenToTeamPresenceSetupTeamVaultPromotionScreen(actionId=" + b() + "){invitedColleaguesCount=" + c() + "}";
        }

        private a(int i10) {
            HashMap map = new HashMap();
            this.f26692a = map;
            map.put("invitedColleaguesCount", Integer.valueOf(i10));
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_teamPresenceInviteColleaguesScreen_to_setupTeamVaultInternalErrorScreen);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_teamPresenceInviteColleaguesScreen_to_setupTeamVaultNetworkErrorScreen);
    }

    public static k1 c() {
        return new androidx.navigation.a(R.id.action_teamPresenceInviteColleaguesScreen_to_teamPresenceInvitesSentScreen);
    }

    public static a d(int i10) {
        return new a(i10);
    }
}

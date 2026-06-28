package com.server.auditor.ssh.client.fragments.team;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26693a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26693a.containsKey("isNeedShowTeamVaultPromotion")) {
                bundle.putBoolean("isNeedShowTeamVaultPromotion", ((Boolean) this.f26693a.get("isNeedShowTeamVaultPromotion")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_teamPresenceScreen_to_teamPresenceInviteColleaguesScreen;
        }

        public boolean c() {
            return ((Boolean) this.f26693a.get("isNeedShowTeamVaultPromotion")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26693a.containsKey("isNeedShowTeamVaultPromotion") == aVar.f26693a.containsKey("isNeedShowTeamVaultPromotion") && c() == aVar.c() && b() == aVar.b();
        }

        public int hashCode() {
            return (((c() ? 1 : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionTeamPresenceScreenToTeamPresenceInviteColleaguesScreen(actionId=" + b() + "){isNeedShowTeamVaultPromotion=" + c() + "}";
        }

        private a(boolean z10) {
            HashMap map = new HashMap();
            this.f26693a = map;
            map.put("isNeedShowTeamVaultPromotion", Boolean.valueOf(z10));
        }
    }

    public static a a(boolean z10) {
        return new a(z10);
    }
}

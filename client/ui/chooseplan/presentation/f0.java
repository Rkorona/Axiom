package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f39950a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f39950a.containsKey("isNeedCreateTeam")) {
                bundle.putBoolean("isNeedCreateTeam", ((Boolean) this.f39950a.get("isNeedCreateTeam")).booleanValue());
            } else {
                bundle.putBoolean("isNeedCreateTeam", true);
            }
            if (this.f39950a.containsKey("isNeedShowSuccessScreen")) {
                bundle.putBoolean("isNeedShowSuccessScreen", ((Boolean) this.f39950a.get("isNeedShowSuccessScreen")).booleanValue());
            } else {
                bundle.putBoolean("isNeedShowSuccessScreen", true);
            }
            if (this.f39950a.containsKey("canSkipInviteColleagues")) {
                bundle.putBoolean("canSkipInviteColleagues", ((Boolean) this.f39950a.get("canSkipInviteColleagues")).booleanValue());
            }
            if (this.f39950a.containsKey("canNavigateBack")) {
                bundle.putBoolean("canNavigateBack", ((Boolean) this.f39950a.get("canNavigateBack")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_teamTrialSuccessfullyExtendedScreen_to_endOfTrialInviteColleaguesScreen;
        }

        public boolean c() {
            return ((Boolean) this.f39950a.get("canNavigateBack")).booleanValue();
        }

        public boolean d() {
            return ((Boolean) this.f39950a.get("canSkipInviteColleagues")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f39950a.get("isNeedCreateTeam")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39950a.containsKey("isNeedCreateTeam") == aVar.f39950a.containsKey("isNeedCreateTeam") && e() == aVar.e() && this.f39950a.containsKey("isNeedShowSuccessScreen") == aVar.f39950a.containsKey("isNeedShowSuccessScreen") && f() == aVar.f() && this.f39950a.containsKey("canSkipInviteColleagues") == aVar.f39950a.containsKey("canSkipInviteColleagues") && d() == aVar.d() && this.f39950a.containsKey("canNavigateBack") == aVar.f39950a.containsKey("canNavigateBack") && c() == aVar.c() && b() == aVar.b();
        }

        public boolean f() {
            return ((Boolean) this.f39950a.get("isNeedShowSuccessScreen")).booleanValue();
        }

        public a g(boolean z10) {
            this.f39950a.put("isNeedCreateTeam", Boolean.valueOf(z10));
            return this;
        }

        public a h(boolean z10) {
            this.f39950a.put("isNeedShowSuccessScreen", Boolean.valueOf(z10));
            return this;
        }

        public int hashCode() {
            return (((((((((e() ? 1 : 0) + 31) * 31) + (f() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + (c() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionTeamTrialSuccessfullyExtendedScreenToEndOfTrialInviteColleaguesScreen(actionId=" + b() + "){isNeedCreateTeam=" + e() + ", isNeedShowSuccessScreen=" + f() + ", canSkipInviteColleagues=" + d() + ", canNavigateBack=" + c() + "}";
        }

        private a(boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f39950a = map;
            map.put("canSkipInviteColleagues", Boolean.valueOf(z10));
            map.put("canNavigateBack", Boolean.valueOf(z11));
        }
    }

    public static a a(boolean z10, boolean z11) {
        return new a(z10, z11);
    }
}

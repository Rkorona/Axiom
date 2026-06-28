package com.server.auditor.ssh.client.fragments.quickimport;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f26160a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f26160a.containsKey("isPromoMode")) {
                bundle.putBoolean("isPromoMode", ((Boolean) this.f26160a.get("isPromoMode")).booleanValue());
            } else {
                bundle.putBoolean("isPromoMode", true);
            }
            if (this.f26160a.containsKey("avoChoosePlanSource")) {
                bundle.putString("avoChoosePlanSource", (String) this.f26160a.get("avoChoosePlanSource"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_quickImportOptionScreen_to_end_of_trial_flow;
        }

        public String c() {
            return (String) this.f26160a.get("avoChoosePlanSource");
        }

        public boolean d() {
            return ((Boolean) this.f26160a.get("isPromoMode")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26160a.containsKey("isPromoMode") != aVar.f26160a.containsKey("isPromoMode") || d() != aVar.d() || this.f26160a.containsKey("avoChoosePlanSource") != aVar.f26160a.containsKey("avoChoosePlanSource")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((d() ? 1 : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionQuickImportOptionScreenToEndOfTrialFlow(actionId=" + b() + "){isPromoMode=" + d() + ", avoChoosePlanSource=" + c() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f26160a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"avoChoosePlanSource\" is marked as non-null but was passed a null value.");
            }
            map.put("avoChoosePlanSource", str);
        }
    }

    public static a a(String str) {
        return new a(str);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_quickImportOptionScreen_to_quickImportDesktopPromoScreen);
    }
}

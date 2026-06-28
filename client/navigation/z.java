package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    public static class a implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f35127a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f35127a.containsKey("action")) {
                bundle.putString("action", (String) this.f35127a.get("action"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_configure_two_factor_auth_to_chooseTwoFactorProvider;
        }

        public String c() {
            return (String) this.f35127a.get("action");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f35127a.containsKey("action") != aVar.f35127a.containsKey("action")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionConfigureTwoFactorAuthToChooseTwoFactorProvider(actionId=" + b() + "){action=" + c() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f35127a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
        }
    }

    public static a a(String str) {
        return new a(str);
    }
}

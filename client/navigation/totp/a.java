package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.totp.a$a, reason: collision with other inner class name */
    public static class C0460a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f30170a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f30170a.containsKey("action")) {
                bundle.putString("action", (String) this.f30170a.get("action"));
            }
            if (this.f30170a.containsKey("providerId")) {
                bundle.putLong("providerId", ((Long) this.f30170a.get("providerId")).longValue());
                return bundle;
            }
            bundle.putLong("providerId", -1L);
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_chooseTwoFactorProvider_to_enter_password;
        }

        public String c() {
            return (String) this.f30170a.get("action");
        }

        public long d() {
            return ((Long) this.f30170a.get("providerId")).longValue();
        }

        public C0460a e(long j10) {
            this.f30170a.put("providerId", Long.valueOf(j10));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0460a c0460a = (C0460a) obj;
            if (this.f30170a.containsKey("action") != c0460a.f30170a.containsKey("action")) {
                return false;
            }
            if (c() == null ? c0460a.c() == null : c().equals(c0460a.c())) {
                return this.f30170a.containsKey("providerId") == c0460a.f30170a.containsKey("providerId") && d() == c0460a.d() && b() == c0460a.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((c() != null ? c().hashCode() : 0) + 31) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + b();
        }

        public String toString() {
            return "ActionChooseTwoFactorProviderToEnterPassword(actionId=" + b() + "){action=" + c() + ", providerId=" + d() + "}";
        }

        private C0460a(String str) {
            HashMap map = new HashMap();
            this.f30170a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
            }
            map.put("action", str);
        }
    }

    public static C0460a a(String str) {
        return new C0460a(str);
    }
}

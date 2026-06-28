package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f30175a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f30175a.containsKey("token")) {
                bundle.putString("token", (String) this.f30175a.get("token"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_twoFactorCopyCode_to_twoFactorEnableTOTP;
        }

        public String c() {
            return (String) this.f30175a.get("token");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30175a.containsKey("token") != aVar.f30175a.containsKey("token")) {
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
            return "ActionTwoFactorCopyCodeToTwoFactorEnableTOTP(actionId=" + b() + "){token=" + c() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f30175a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            map.put("token", str);
        }
    }

    public static a a(String str) {
        return new a(str);
    }
}

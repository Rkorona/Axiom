package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25952a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25952a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25952a.get("featureType")).intValue());
            }
            if (this.f25952a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25952a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            if (this.f25952a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25952a.get("needCreateTrialAccount")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpEnterPasswordScreen_to_signInChooserScreen;
        }

        public int c() {
            return ((Integer) this.f25952a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25952a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25952a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25952a.containsKey("featureType") == aVar.f25952a.containsKey("featureType") && c() == aVar.c() && this.f25952a.containsKey("needSyncKeysAndPasswords") == aVar.f25952a.containsKey("needSyncKeysAndPasswords") && e() == aVar.e() && this.f25952a.containsKey("needCreateTrialAccount") == aVar.f25952a.containsKey("needCreateTrialAccount") && d() == aVar.d() && b() == aVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (e() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpEnterPasswordScreenToSignInChooserScreen(actionId=" + b() + "){featureType=" + c() + ", needSyncKeysAndPasswords=" + e() + ", needCreateTrialAccount=" + d() + "}";
        }

        private a(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25952a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }
    }

    public static a a(int i10, boolean z10, boolean z11) {
        return new a(i10, z10, z11);
    }
}

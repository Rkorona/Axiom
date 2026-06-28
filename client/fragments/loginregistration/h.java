package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25926a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25926a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25926a.get("featureType")).intValue());
            }
            if (this.f25926a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25926a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25926a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25926a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25926a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25926a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_dontHaveAnAccountScreen_to_signUpEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25926a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25926a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25926a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25926a.containsKey("featureType") != aVar.f25926a.containsKey("featureType") || d() != aVar.d() || this.f25926a.containsKey("authenticationModel") != aVar.f25926a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return this.f25926a.containsKey("needCreateTrialAccount") == aVar.f25926a.containsKey("needCreateTrialAccount") && e() == aVar.e() && this.f25926a.containsKey("needSyncKeysAndPasswords") == aVar.f25926a.containsKey("needSyncKeysAndPasswords") && f() == aVar.f() && b() == aVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25926a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionDontHaveAnAccountScreenToSignUpEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private a(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25926a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static a a(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new a(i10, authenticationModel, z10, z11);
    }
}

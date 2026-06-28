package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25918a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25918a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25918a.get("featureType")).intValue());
            }
            if (this.f25918a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25918a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            if (this.f25918a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25918a.get("needCreateTrialAccount")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpChooserScreen_to_signInChooserScreen;
        }

        public int c() {
            return ((Integer) this.f25918a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25918a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25918a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25918a.containsKey("featureType") == aVar.f25918a.containsKey("featureType") && c() == aVar.c() && this.f25918a.containsKey("needSyncKeysAndPasswords") == aVar.f25918a.containsKey("needSyncKeysAndPasswords") && e() == aVar.e() && this.f25918a.containsKey("needCreateTrialAccount") == aVar.f25918a.containsKey("needCreateTrialAccount") && d() == aVar.d() && b() == aVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (e() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpChooserScreenToSignInChooserScreen(actionId=" + b() + "){featureType=" + c() + ", needSyncKeysAndPasswords=" + e() + ", needCreateTrialAccount=" + d() + "}";
        }

        private a(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25918a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25919a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25919a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25919a.get("featureType")).intValue());
            }
            if (this.f25919a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25919a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25919a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25919a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25919a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25919a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpChooserScreen_to_signInEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25919a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25919a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25919a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25919a.containsKey("featureType") != bVar.f25919a.containsKey("featureType") || d() != bVar.d() || this.f25919a.containsKey("authenticationModel") != bVar.f25919a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return this.f25919a.containsKey("needCreateTrialAccount") == bVar.f25919a.containsKey("needCreateTrialAccount") && e() == bVar.e() && this.f25919a.containsKey("needSyncKeysAndPasswords") == bVar.f25919a.containsKey("needSyncKeysAndPasswords") && f() == bVar.f() && b() == bVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25919a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpChooserScreenToSignInEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private b(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25919a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25920a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25920a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25920a.get("featureType")).intValue());
            }
            if (this.f25920a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25920a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25920a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25920a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpChooserScreen_to_signUpEnterEmailScreen;
        }

        public int c() {
            return ((Integer) this.f25920a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25920a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25920a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f25920a.containsKey("featureType") == cVar.f25920a.containsKey("featureType") && c() == cVar.c() && this.f25920a.containsKey("needCreateTrialAccount") == cVar.f25920a.containsKey("needCreateTrialAccount") && d() == cVar.d() && this.f25920a.containsKey("needSyncKeysAndPasswords") == cVar.f25920a.containsKey("needSyncKeysAndPasswords") && e() == cVar.e() && b() == cVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (d() ? 1 : 0)) * 31) + (e() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpChooserScreenToSignUpEnterEmailScreen(actionId=" + b() + "){featureType=" + c() + ", needCreateTrialAccount=" + d() + ", needSyncKeysAndPasswords=" + e() + "}";
        }

        private c(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25920a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class d implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25921a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25921a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25921a.get("featureType")).intValue());
            }
            if (this.f25921a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25921a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25921a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25921a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25921a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25921a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpChooserScreen_to_signUpEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25921a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25921a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25921a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f25921a.containsKey("featureType") != dVar.f25921a.containsKey("featureType") || d() != dVar.d() || this.f25921a.containsKey("authenticationModel") != dVar.f25921a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? dVar.c() == null : c().equals(dVar.c())) {
                return this.f25921a.containsKey("needCreateTrialAccount") == dVar.f25921a.containsKey("needCreateTrialAccount") && e() == dVar.e() && this.f25921a.containsKey("needSyncKeysAndPasswords") == dVar.f25921a.containsKey("needSyncKeysAndPasswords") && f() == dVar.f() && b() == dVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25921a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpChooserScreenToSignUpEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private d(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25921a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static a a(int i10, boolean z10, boolean z11) {
        return new a(i10, z10, z11);
    }

    public static b b(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new b(i10, authenticationModel, z10, z11);
    }

    public static c c(int i10, boolean z10, boolean z11) {
        return new c(i10, z10, z11);
    }

    public static d d(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new d(i10, authenticationModel, z10, z11);
    }
}

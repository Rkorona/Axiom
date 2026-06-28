package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25929a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25929a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25929a.get("featureType")).intValue());
            }
            if (this.f25929a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25929a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25929a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25929a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25929a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25929a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpEnterEmailScreen_to_alreadyHaveAnAccountScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25929a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25929a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25929a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25929a.containsKey("featureType") != aVar.f25929a.containsKey("featureType") || d() != aVar.d() || this.f25929a.containsKey("authenticationModel") != aVar.f25929a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return this.f25929a.containsKey("needCreateTrialAccount") == aVar.f25929a.containsKey("needCreateTrialAccount") && e() == aVar.e() && this.f25929a.containsKey("needSyncKeysAndPasswords") == aVar.f25929a.containsKey("needSyncKeysAndPasswords") && f() == aVar.f() && b() == aVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25929a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpEnterEmailScreenToAlreadyHaveAnAccountScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private a(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25929a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25930a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25930a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25930a.get("featureType")).intValue());
            }
            if (this.f25930a.containsKey("authenticationModel")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f25930a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(emailAuthentication));
                } else {
                    if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(emailAuthentication));
                }
            }
            if (this.f25930a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25930a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25930a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25930a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpEnterEmailScreen_to_enterpriseSingleSignOnEnterEmailScreen;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f25930a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25930a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25930a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25930a.containsKey("featureType") != bVar.f25930a.containsKey("featureType") || d() != bVar.d() || this.f25930a.containsKey("authenticationModel") != bVar.f25930a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return this.f25930a.containsKey("needCreateTrialAccount") == bVar.f25930a.containsKey("needCreateTrialAccount") && e() == bVar.e() && this.f25930a.containsKey("needSyncKeysAndPasswords") == bVar.f25930a.containsKey("needSyncKeysAndPasswords") && f() == bVar.f() && b() == bVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25930a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpEnterEmailScreenToEnterpriseSingleSignOnEnterEmailScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private b(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25930a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("authenticationModel", emailAuthentication);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25931a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25931a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25931a.get("featureType")).intValue());
            }
            if (this.f25931a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25931a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            if (this.f25931a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25931a.get("needCreateTrialAccount")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpEnterEmailScreen_to_signInChooserScreen;
        }

        public int c() {
            return ((Integer) this.f25931a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25931a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25931a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f25931a.containsKey("featureType") == cVar.f25931a.containsKey("featureType") && c() == cVar.c() && this.f25931a.containsKey("needSyncKeysAndPasswords") == cVar.f25931a.containsKey("needSyncKeysAndPasswords") && e() == cVar.e() && this.f25931a.containsKey("needCreateTrialAccount") == cVar.f25931a.containsKey("needCreateTrialAccount") && d() == cVar.d() && b() == cVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (e() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpEnterEmailScreenToSignInChooserScreen(actionId=" + b() + "){featureType=" + c() + ", needSyncKeysAndPasswords=" + e() + ", needCreateTrialAccount=" + d() + "}";
        }

        private c(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25931a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }
    }

    public static class d implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25932a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25932a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25932a.get("featureType")).intValue());
            }
            if (this.f25932a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25932a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25932a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25932a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25932a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25932a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signUpEnterEmailScreen_to_signUpEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25932a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25932a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25932a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f25932a.containsKey("featureType") != dVar.f25932a.containsKey("featureType") || d() != dVar.d() || this.f25932a.containsKey("authenticationModel") != dVar.f25932a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? dVar.c() == null : c().equals(dVar.c())) {
                return this.f25932a.containsKey("needCreateTrialAccount") == dVar.f25932a.containsKey("needCreateTrialAccount") && e() == dVar.e() && this.f25932a.containsKey("needSyncKeysAndPasswords") == dVar.f25932a.containsKey("needSyncKeysAndPasswords") && f() == dVar.f() && b() == dVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25932a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignUpEnterEmailScreenToSignUpEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private d(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25932a = map;
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

    public static b b(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        return new b(i10, emailAuthentication, z10, z11);
    }

    public static c c(int i10, boolean z10, boolean z11) {
        return new c(i10, z10, z11);
    }

    public static d d(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new d(i10, authenticationModel, z10, z11);
    }
}

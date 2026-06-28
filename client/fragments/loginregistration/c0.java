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
public abstract class c0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25910a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25910a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25910a.get("featureType")).intValue());
            }
            if (this.f25910a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25910a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25910a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25910a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25910a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25910a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInEnterEmailScreen_to_dontHaveAnAccountScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25910a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25910a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25910a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25910a.containsKey("featureType") != aVar.f25910a.containsKey("featureType") || d() != aVar.d() || this.f25910a.containsKey("authenticationModel") != aVar.f25910a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return this.f25910a.containsKey("needCreateTrialAccount") == aVar.f25910a.containsKey("needCreateTrialAccount") && e() == aVar.e() && this.f25910a.containsKey("needSyncKeysAndPasswords") == aVar.f25910a.containsKey("needSyncKeysAndPasswords") && f() == aVar.f() && b() == aVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25910a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInEnterEmailScreenToDontHaveAnAccountScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private a(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25910a = map;
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
        private final HashMap f25911a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25911a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25911a.get("featureType")).intValue());
            }
            if (this.f25911a.containsKey("authenticationModel")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f25911a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(emailAuthentication));
                } else {
                    if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(emailAuthentication));
                }
            }
            if (this.f25911a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25911a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25911a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25911a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInEnterEmailScreen_to_enterpriseSingleSignOnEnterEmailScreen;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f25911a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25911a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25911a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25911a.containsKey("featureType") != bVar.f25911a.containsKey("featureType") || d() != bVar.d() || this.f25911a.containsKey("authenticationModel") != bVar.f25911a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return this.f25911a.containsKey("needCreateTrialAccount") == bVar.f25911a.containsKey("needCreateTrialAccount") && e() == bVar.e() && this.f25911a.containsKey("needSyncKeysAndPasswords") == bVar.f25911a.containsKey("needSyncKeysAndPasswords") && f() == bVar.f() && b() == bVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25911a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInEnterEmailScreenToEnterpriseSingleSignOnEnterEmailScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private b(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25911a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("authenticationModel", emailAuthentication);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25912a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25912a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25912a.get("featureType")).intValue());
            }
            if (this.f25912a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25912a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25912a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25912a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25912a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25912a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInEnterEmailScreen_to_signInEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25912a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25912a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25912a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25912a.containsKey("featureType") != cVar.f25912a.containsKey("featureType") || d() != cVar.d() || this.f25912a.containsKey("authenticationModel") != cVar.f25912a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? cVar.c() == null : c().equals(cVar.c())) {
                return this.f25912a.containsKey("needCreateTrialAccount") == cVar.f25912a.containsKey("needCreateTrialAccount") && e() == cVar.e() && this.f25912a.containsKey("needSyncKeysAndPasswords") == cVar.f25912a.containsKey("needSyncKeysAndPasswords") && f() == cVar.f() && b() == cVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25912a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInEnterEmailScreenToSignInEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25912a = map;
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

    public static c c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new c(i10, authenticationModel, z10, z11);
    }
}

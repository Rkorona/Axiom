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
public abstract class y {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25960a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25960a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25960a.get("featureType")).intValue());
            }
            if (this.f25960a.containsKey("authenticationModel")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f25960a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(emailAuthentication));
                } else {
                    if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(emailAuthentication));
                }
            }
            if (this.f25960a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25960a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25960a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25960a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInChooserScreen_to_enterpriseSingleSignOnEnterEmailScreen;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f25960a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25960a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25960a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25960a.containsKey("featureType") != aVar.f25960a.containsKey("featureType") || d() != aVar.d() || this.f25960a.containsKey("authenticationModel") != aVar.f25960a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return this.f25960a.containsKey("needCreateTrialAccount") == aVar.f25960a.containsKey("needCreateTrialAccount") && e() == aVar.e() && this.f25960a.containsKey("needSyncKeysAndPasswords") == aVar.f25960a.containsKey("needSyncKeysAndPasswords") && f() == aVar.f() && b() == aVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25960a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInChooserScreenToEnterpriseSingleSignOnEnterEmailScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private a(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25960a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("authenticationModel", emailAuthentication);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25961a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25961a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25961a.get("featureType")).intValue());
            }
            if (this.f25961a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25961a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            if (this.f25961a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25961a.get("needCreateTrialAccount")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInChooserScreen_to_signInEnterEmailScreen;
        }

        public int c() {
            return ((Integer) this.f25961a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25961a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25961a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f25961a.containsKey("featureType") == bVar.f25961a.containsKey("featureType") && c() == bVar.c() && this.f25961a.containsKey("needSyncKeysAndPasswords") == bVar.f25961a.containsKey("needSyncKeysAndPasswords") && e() == bVar.e() && this.f25961a.containsKey("needCreateTrialAccount") == bVar.f25961a.containsKey("needCreateTrialAccount") && d() == bVar.d() && b() == bVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (e() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInChooserScreenToSignInEnterEmailScreen(actionId=" + b() + "){featureType=" + c() + ", needSyncKeysAndPasswords=" + e() + ", needCreateTrialAccount=" + d() + "}";
        }

        private b(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25961a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25962a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25962a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25962a.get("featureType")).intValue());
            }
            if (this.f25962a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25962a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25962a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25962a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25962a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25962a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInChooserScreen_to_signInEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25962a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25962a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25962a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25962a.containsKey("featureType") != cVar.f25962a.containsKey("featureType") || d() != cVar.d() || this.f25962a.containsKey("authenticationModel") != cVar.f25962a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? cVar.c() == null : c().equals(cVar.c())) {
                return this.f25962a.containsKey("needCreateTrialAccount") == cVar.f25962a.containsKey("needCreateTrialAccount") && e() == cVar.e() && this.f25962a.containsKey("needSyncKeysAndPasswords") == cVar.f25962a.containsKey("needSyncKeysAndPasswords") && f() == cVar.f() && b() == cVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25962a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInChooserScreenToSignInEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25962a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static class d implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25963a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25963a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25963a.get("featureType")).intValue());
            }
            if (this.f25963a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25963a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            if (this.f25963a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25963a.get("needCreateTrialAccount")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInChooserScreen_to_signUpChooserScreen;
        }

        public int c() {
            return ((Integer) this.f25963a.get("featureType")).intValue();
        }

        public boolean d() {
            return ((Boolean) this.f25963a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean e() {
            return ((Boolean) this.f25963a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f25963a.containsKey("featureType") == dVar.f25963a.containsKey("featureType") && c() == dVar.c() && this.f25963a.containsKey("needSyncKeysAndPasswords") == dVar.f25963a.containsKey("needSyncKeysAndPasswords") && e() == dVar.e() && this.f25963a.containsKey("needCreateTrialAccount") == dVar.f25963a.containsKey("needCreateTrialAccount") && d() == dVar.d() && b() == dVar.b();
        }

        public int hashCode() {
            return ((((((c() + 31) * 31) + (e() ? 1 : 0)) * 31) + (d() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInChooserScreenToSignUpChooserScreen(actionId=" + b() + "){featureType=" + c() + ", needSyncKeysAndPasswords=" + e() + ", needCreateTrialAccount=" + d() + "}";
        }

        private d(int i10, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25963a = map;
            map.put("featureType", Integer.valueOf(i10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z10));
            map.put("needCreateTrialAccount", Boolean.valueOf(z11));
        }
    }

    public static class e implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25964a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25964a.containsKey("featureType")) {
                bundle.putInt("featureType", ((Integer) this.f25964a.get("featureType")).intValue());
            }
            if (this.f25964a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25964a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f25964a.containsKey("needCreateTrialAccount")) {
                bundle.putBoolean("needCreateTrialAccount", ((Boolean) this.f25964a.get("needCreateTrialAccount")).booleanValue());
            }
            if (this.f25964a.containsKey("needSyncKeysAndPasswords")) {
                bundle.putBoolean("needSyncKeysAndPasswords", ((Boolean) this.f25964a.get("needSyncKeysAndPasswords")).booleanValue());
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_signInChooserScreen_to_signUpEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25964a.get("authenticationModel");
        }

        public int d() {
            return ((Integer) this.f25964a.get("featureType")).intValue();
        }

        public boolean e() {
            return ((Boolean) this.f25964a.get("needCreateTrialAccount")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f25964a.containsKey("featureType") != eVar.f25964a.containsKey("featureType") || d() != eVar.d() || this.f25964a.containsKey("authenticationModel") != eVar.f25964a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? eVar.c() == null : c().equals(eVar.c())) {
                return this.f25964a.containsKey("needCreateTrialAccount") == eVar.f25964a.containsKey("needCreateTrialAccount") && e() == eVar.e() && this.f25964a.containsKey("needSyncKeysAndPasswords") == eVar.f25964a.containsKey("needSyncKeysAndPasswords") && f() == eVar.f() && b() == eVar.b();
            }
            return false;
        }

        public boolean f() {
            return ((Boolean) this.f25964a.get("needSyncKeysAndPasswords")).booleanValue();
        }

        public int hashCode() {
            return ((((((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (e() ? 1 : 0)) * 31) + (f() ? 1 : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionSignInChooserScreenToSignUpEnterPasswordScreen(actionId=" + b() + "){featureType=" + d() + ", authenticationModel=" + c() + ", needCreateTrialAccount=" + e() + ", needSyncKeysAndPasswords=" + f() + "}";
        }

        private e(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            HashMap map = new HashMap();
            this.f25964a = map;
            map.put("featureType", Integer.valueOf(i10));
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            map.put("needCreateTrialAccount", Boolean.valueOf(z10));
            map.put("needSyncKeysAndPasswords", Boolean.valueOf(z11));
        }
    }

    public static a a(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        return new a(i10, emailAuthentication, z10, z11);
    }

    public static b b(int i10, boolean z10, boolean z11) {
        return new b(i10, z10, z11);
    }

    public static c c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new c(i10, authenticationModel, z10, z11);
    }

    public static d d(int i10, boolean z10, boolean z11) {
        return new d(i10, z10, z11);
    }

    public static e e(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        return new e(i10, authenticationModel, z10, z11);
    }
}

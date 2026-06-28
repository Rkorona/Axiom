package com.server.auditor.ssh.client.navigation.account;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28978a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f28978a.containsKey("emailAuthentication")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f28978a.get("emailAuthentication");
                if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                    bundle.putParcelable("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
                } else {
                    if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
                }
            }
            if (this.f28978a.containsKey("encodedPasswordHex")) {
                bundle.putString("encodedPasswordHex", (String) this.f28978a.get("encodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_masterPasswordEnterPasswordScreen_to_masterPasswordRequireTwoFactorCode;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f28978a.get("emailAuthentication");
        }

        public String d() {
            return (String) this.f28978a.get("encodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28978a.containsKey("emailAuthentication") != aVar.f28978a.containsKey("emailAuthentication")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f28978a.containsKey("encodedPasswordHex") != aVar.f28978a.containsKey("encodedPasswordHex")) {
                return false;
            }
            if (d() == null ? aVar.d() == null : d().equals(aVar.d())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((c() != null ? c().hashCode() : 0) + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionMasterPasswordEnterPasswordScreenToMasterPasswordRequireTwoFactorCode(actionId=" + b() + "){emailAuthentication=" + c() + ", encodedPasswordHex=" + d() + "}";
        }

        private a(EmailAuthentication emailAuthentication, String str) {
            HashMap map = new HashMap();
            this.f28978a = map;
            if (emailAuthentication == null) {
                throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
            }
            map.put("emailAuthentication", emailAuthentication);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
            }
            map.put("encodedPasswordHex", str);
        }
    }

    public static class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28979a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f28979a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f28979a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f28979a.containsKey("encodedPasswordHex")) {
                bundle.putString("encodedPasswordHex", (String) this.f28979a.get("encodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_masterPasswordEnterPasswordScreen_to_masterPasswordUnlockVerificationByEmailScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f28979a.get("authenticationModel");
        }

        public String d() {
            return (String) this.f28979a.get("encodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f28979a.containsKey("authenticationModel") != bVar.f28979a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? bVar.c() != null : !c().equals(bVar.c())) {
                return false;
            }
            if (this.f28979a.containsKey("encodedPasswordHex") != bVar.f28979a.containsKey("encodedPasswordHex")) {
                return false;
            }
            if (d() == null ? bVar.d() == null : d().equals(bVar.d())) {
                return b() == bVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((c() != null ? c().hashCode() : 0) + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionMasterPasswordEnterPasswordScreenToMasterPasswordUnlockVerificationByEmailScreen(actionId=" + b() + "){authenticationModel=" + c() + ", encodedPasswordHex=" + d() + "}";
        }

        private b(AuthenticationModel authenticationModel, String str) {
            HashMap map = new HashMap();
            this.f28979a = map;
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
            if (str == null) {
                throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
            }
            map.put("encodedPasswordHex", str);
        }
    }

    public static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f28980a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f28980a.containsKey("emailAuthentication")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f28980a.get("emailAuthentication");
                if (!Parcelable.class.isAssignableFrom(EmailAuthentication.class) && emailAuthentication != null) {
                    if (Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        bundle.putSerializable("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_masterPasswordEnterPasswordScreen_to_resetMasterPasswordScreen;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f28980a.get("emailAuthentication");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f28980a.containsKey("emailAuthentication") != cVar.f28980a.containsKey("emailAuthentication")) {
                return false;
            }
            if (c() == null ? cVar.c() == null : c().equals(cVar.c())) {
                return b() == cVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionMasterPasswordEnterPasswordScreenToResetMasterPasswordScreen(actionId=" + b() + "){emailAuthentication=" + c() + "}";
        }

        private c(EmailAuthentication emailAuthentication) {
            HashMap map = new HashMap();
            this.f28980a = map;
            if (emailAuthentication == null) {
                throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
            }
            map.put("emailAuthentication", emailAuthentication);
        }
    }

    public static a a(EmailAuthentication emailAuthentication, String str) {
        return new a(emailAuthentication, str);
    }

    public static b b(AuthenticationModel authenticationModel, String str) {
        return new b(authenticationModel, str);
    }

    public static c c(EmailAuthentication emailAuthentication) {
        return new c(emailAuthentication);
    }
}

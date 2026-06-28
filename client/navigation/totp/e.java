package com.server.auditor.ssh.client.navigation.totp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f30174a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f30174a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f30174a.get("authenticationModel");
                if (Parcelable.class.isAssignableFrom(AuthenticationModel.class) || authenticationModel == null) {
                    bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
                } else {
                    if (!Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                }
            }
            if (this.f30174a.containsKey("encodedPasswordHex")) {
                bundle.putString("encodedPasswordHex", (String) this.f30174a.get("encodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_masterPasswordRequireTwoFactorCode_to_masterPasswordUnlockVerificationByEmailScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f30174a.get("authenticationModel");
        }

        public String d() {
            return (String) this.f30174a.get("encodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30174a.containsKey("authenticationModel") != aVar.f30174a.containsKey("authenticationModel")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f30174a.containsKey("encodedPasswordHex") != aVar.f30174a.containsKey("encodedPasswordHex")) {
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
            return "ActionMasterPasswordRequireTwoFactorCodeToMasterPasswordUnlockVerificationByEmailScreen(actionId=" + b() + "){authenticationModel=" + c() + ", encodedPasswordHex=" + d() + "}";
        }

        private a(AuthenticationModel authenticationModel, String str) {
            HashMap map = new HashMap();
            this.f30174a = map;
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

    public static a a(AuthenticationModel authenticationModel, String str) {
        return new a(authenticationModel, str);
    }
}

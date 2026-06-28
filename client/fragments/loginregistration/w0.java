package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25958a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25958a.containsKey("emailAuthentication")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f25958a.get("emailAuthentication");
                if (Parcelable.class.isAssignableFrom(EmailAuthentication.class) || emailAuthentication == null) {
                    bundle.putParcelable("emailAuthentication", (Parcelable) Parcelable.class.cast(emailAuthentication));
                } else {
                    if (!Serializable.class.isAssignableFrom(EmailAuthentication.class)) {
                        throw new UnsupportedOperationException(EmailAuthentication.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    bundle.putSerializable("emailAuthentication", (Serializable) Serializable.class.cast(emailAuthentication));
                }
            }
            if (this.f25958a.containsKey("encodedPasswordHex")) {
                bundle.putString("encodedPasswordHex", (String) this.f25958a.get("encodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_unlockVerificationByEmailScreen_to_loginRequireTwoFactorCode;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f25958a.get("emailAuthentication");
        }

        public String d() {
            return (String) this.f25958a.get("encodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25958a.containsKey("emailAuthentication") != aVar.f25958a.containsKey("emailAuthentication")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f25958a.containsKey("encodedPasswordHex") != aVar.f25958a.containsKey("encodedPasswordHex")) {
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
            return "ActionUnlockVerificationByEmailScreenToLoginRequireTwoFactorCode(actionId=" + b() + "){emailAuthentication=" + c() + ", encodedPasswordHex=" + d() + "}";
        }

        private a(EmailAuthentication emailAuthentication, String str) {
            HashMap map = new HashMap();
            this.f25958a = map;
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

    public static a a(EmailAuthentication emailAuthentication, String str) {
        return new a(emailAuthentication, str);
    }
}

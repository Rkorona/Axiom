package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25947a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25947a.containsKey("emailAuthentication")) {
                EmailAuthentication emailAuthentication = (EmailAuthentication) this.f25947a.get("emailAuthentication");
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
            return R.id.action_resetMasterPasswordScreen_to_resetMasterPasswordInstructionsSentScreen;
        }

        public EmailAuthentication c() {
            return (EmailAuthentication) this.f25947a.get("emailAuthentication");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25947a.containsKey("emailAuthentication") != aVar.f25947a.containsKey("emailAuthentication")) {
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
            return "ActionResetMasterPasswordScreenToResetMasterPasswordInstructionsSentScreen(actionId=" + b() + "){emailAuthentication=" + c() + "}";
        }

        private a(EmailAuthentication emailAuthentication) {
            HashMap map = new HashMap();
            this.f25947a = map;
            if (emailAuthentication == null) {
                throw new IllegalArgumentException("Argument \"emailAuthentication\" is marked as non-null but was passed a null value.");
            }
            map.put("emailAuthentication", emailAuthentication);
        }
    }

    public static a a(EmailAuthentication emailAuthentication) {
        return new a(emailAuthentication);
    }
}

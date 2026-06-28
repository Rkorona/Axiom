package com.server.auditor.ssh.client.fragments.loginregistration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f25942a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f25942a.containsKey("authenticationModel")) {
                AuthenticationModel authenticationModel = (AuthenticationModel) this.f25942a.get("authenticationModel");
                if (!Parcelable.class.isAssignableFrom(AuthenticationModel.class) && authenticationModel != null) {
                    if (Serializable.class.isAssignableFrom(AuthenticationModel.class)) {
                        bundle.putSerializable("authenticationModel", (Serializable) Serializable.class.cast(authenticationModel));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(AuthenticationModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("authenticationModel", (Parcelable) Parcelable.class.cast(authenticationModel));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_resetMasterPasswordInstructionsSentScreen_to_masterPasswordEnterPasswordScreen;
        }

        public AuthenticationModel c() {
            return (AuthenticationModel) this.f25942a.get("authenticationModel");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25942a.containsKey("authenticationModel") != aVar.f25942a.containsKey("authenticationModel")) {
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
            return "ActionResetMasterPasswordInstructionsSentScreenToMasterPasswordEnterPasswordScreen(actionId=" + b() + "){authenticationModel=" + c() + "}";
        }

        private a(AuthenticationModel authenticationModel) {
            HashMap map = new HashMap();
            this.f25942a = map;
            if (authenticationModel == null) {
                throw new IllegalArgumentException("Argument \"authenticationModel\" is marked as non-null but was passed a null value.");
            }
            map.put("authenticationModel", authenticationModel);
        }
    }

    public static a a(AuthenticationModel authenticationModel) {
        return new a(authenticationModel);
    }
}

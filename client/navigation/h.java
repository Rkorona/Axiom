package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public static class a implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29052a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f29052a.containsKey("email")) {
                bundle.putString("email", (String) this.f29052a.get("email"));
            }
            if (this.f29052a.containsKey("encodedPasswordHex")) {
                bundle.putString("encodedPasswordHex", (String) this.f29052a.get("encodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_changeEmail_to_changeEmailRequireTwoFactorCode;
        }

        public String c() {
            return (String) this.f29052a.get("email");
        }

        public String d() {
            return (String) this.f29052a.get("encodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29052a.containsKey("email") != aVar.f29052a.containsKey("email")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f29052a.containsKey("encodedPasswordHex") != aVar.f29052a.containsKey("encodedPasswordHex")) {
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
            return "ActionChangeEmailToChangeEmailRequireTwoFactorCode(actionId=" + b() + "){email=" + c() + ", encodedPasswordHex=" + d() + "}";
        }

        private a(String str, String str2) {
            HashMap map = new HashMap();
            this.f29052a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put("email", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"encodedPasswordHex\" is marked as non-null but was passed a null value.");
            }
            map.put("encodedPasswordHex", str2);
        }
    }

    public static a a(String str, String str2) {
        return new a(str, str2);
    }
}

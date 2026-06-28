package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    public static class a implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29577a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f29577a.containsKey("oldEncodedPasswordHex")) {
                bundle.putString("oldEncodedPasswordHex", (String) this.f29577a.get("oldEncodedPasswordHex"));
            }
            if (this.f29577a.containsKey("newEncodedPasswordHex")) {
                bundle.putString("newEncodedPasswordHex", (String) this.f29577a.get("newEncodedPasswordHex"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_changePassword_to_requireTwoFactorCode;
        }

        public String c() {
            return (String) this.f29577a.get("newEncodedPasswordHex");
        }

        public String d() {
            return (String) this.f29577a.get("oldEncodedPasswordHex");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29577a.containsKey("oldEncodedPasswordHex") != aVar.f29577a.containsKey("oldEncodedPasswordHex")) {
                return false;
            }
            if (d() == null ? aVar.d() != null : !d().equals(aVar.d())) {
                return false;
            }
            if (this.f29577a.containsKey("newEncodedPasswordHex") != aVar.f29577a.containsKey("newEncodedPasswordHex")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((((d() != null ? d().hashCode() : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionChangePasswordToRequireTwoFactorCode(actionId=" + b() + "){oldEncodedPasswordHex=" + d() + ", newEncodedPasswordHex=" + c() + "}";
        }

        private a(String str, String str2) {
            HashMap map = new HashMap();
            this.f29577a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"oldEncodedPasswordHex\" is marked as non-null but was passed a null value.");
            }
            map.put("oldEncodedPasswordHex", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"newEncodedPasswordHex\" is marked as non-null but was passed a null value.");
            }
            map.put("newEncodedPasswordHex", str2);
        }
    }

    public static a a(String str, String str2) {
        return new a(str, str2);
    }
}

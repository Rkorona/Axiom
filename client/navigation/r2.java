package com.server.auditor.ssh.client.navigation;

import android.os.Bundle;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r2 {

    public static class a implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29579a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f29579a.containsKey("token")) {
                bundle.putString("token", (String) this.f29579a.get("token"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_enter_password_to_disableTwoFactor;
        }

        public String c() {
            return (String) this.f29579a.get("token");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29579a.containsKey("token") != aVar.f29579a.containsKey("token")) {
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
            return "ActionEnterPasswordToDisableTwoFactor(actionId=" + b() + "){token=" + c() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f29579a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            map.put("token", str);
        }
    }

    public static class b implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29580a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f29580a.containsKey("token")) {
                bundle.putString("token", (String) this.f29580a.get("token"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_enter_password_to_install_authy;
        }

        public String c() {
            return (String) this.f29580a.get("token");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f29580a.containsKey("token") != bVar.f29580a.containsKey("token")) {
                return false;
            }
            if (c() == null ? bVar.c() == null : c().equals(bVar.c())) {
                return b() == bVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionEnterPasswordToInstallAuthy(actionId=" + b() + "){token=" + c() + "}";
        }

        private b(String str) {
            HashMap map = new HashMap();
            this.f29580a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            map.put("token", str);
        }
    }

    public static class c implements androidx.navigation.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f29581a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f29581a.containsKey("token")) {
                bundle.putString("token", (String) this.f29581a.get("token"));
            }
            if (this.f29581a.containsKey("providerCode")) {
                bundle.putString("providerCode", (String) this.f29581a.get("providerCode"));
            }
            if (this.f29581a.containsKey("issuer")) {
                bundle.putString("issuer", (String) this.f29581a.get("issuer"));
            }
            if (this.f29581a.containsKey("email")) {
                bundle.putString("email", (String) this.f29581a.get("email"));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_enter_password_to_twoFactorCopyCode;
        }

        public String c() {
            return (String) this.f29581a.get("email");
        }

        public String d() {
            return (String) this.f29581a.get("issuer");
        }

        public String e() {
            return (String) this.f29581a.get("providerCode");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f29581a.containsKey("token") != cVar.f29581a.containsKey("token")) {
                return false;
            }
            if (f() == null ? cVar.f() != null : !f().equals(cVar.f())) {
                return false;
            }
            if (this.f29581a.containsKey("providerCode") != cVar.f29581a.containsKey("providerCode")) {
                return false;
            }
            if (e() == null ? cVar.e() != null : !e().equals(cVar.e())) {
                return false;
            }
            if (this.f29581a.containsKey("issuer") != cVar.f29581a.containsKey("issuer")) {
                return false;
            }
            if (d() == null ? cVar.d() != null : !d().equals(cVar.d())) {
                return false;
            }
            if (this.f29581a.containsKey("email") != cVar.f29581a.containsKey("email")) {
                return false;
            }
            if (c() == null ? cVar.c() == null : c().equals(cVar.c())) {
                return b() == cVar.b();
            }
            return false;
        }

        public String f() {
            return (String) this.f29581a.get("token");
        }

        public int hashCode() {
            return (((((((((f() != null ? f().hashCode() : 0) + 31) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionEnterPasswordToTwoFactorCopyCode(actionId=" + b() + "){token=" + f() + ", providerCode=" + e() + ", issuer=" + d() + ", email=" + c() + "}";
        }

        private c(String str, String str2, String str3, String str4) {
            HashMap map = new HashMap();
            this.f29581a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
            }
            map.put("token", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"providerCode\" is marked as non-null but was passed a null value.");
            }
            map.put("providerCode", str2);
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"issuer\" is marked as non-null but was passed a null value.");
            }
            map.put("issuer", str3);
            if (str4 == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            map.put("email", str4);
        }
    }

    public static a a(String str) {
        return new a(str);
    }

    public static b b(String str) {
        return new b(str);
    }

    public static c c(String str, String str2, String str3, String str4) {
        return new c(str, str2, str3, str4);
    }
}

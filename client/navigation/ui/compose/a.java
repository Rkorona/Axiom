package com.server.auditor.ssh.client.navigation.ui.compose;

import com.server.auditor.ssh.client.database.Column;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.a$a, reason: collision with other inner class name */
    public static final class C0462a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0462a f30215a = new C0462a();

        private C0462a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0462a);
        }

        public int hashCode() {
            return 1544803869;
        }

        public String toString() {
            return "Divider";
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f30218c;

        public b(int i10, String str, Integer num) {
            ju.t.f(str, Column.MULTI_KEY_NAME);
            this.f30216a = i10;
            this.f30217b = str;
            this.f30218c = num;
        }

        public final Integer a() {
            return this.f30218c;
        }

        public final int b() {
            return this.f30216a;
        }

        public final String c() {
            return this.f30217b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30216a == bVar.f30216a && ju.t.b(this.f30217b, bVar.f30217b) && ju.t.b(this.f30218c, bVar.f30218c);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f30216a) * 31) + this.f30217b.hashCode()) * 31;
            Integer num = this.f30218c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "OptionsItemData(id=" + this.f30216a + ", name=" + this.f30217b + ", iconResId=" + this.f30218c + ")";
        }
    }
}

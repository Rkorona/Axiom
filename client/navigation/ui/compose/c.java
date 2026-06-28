package com.server.auditor.ssh.client.navigation.ui.compose;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f30349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30350b;

        public a(List list, int i10) {
            ju.t.f(list, "options");
            this.f30349a = list;
            this.f30350b = i10;
        }

        public final List a() {
            return this.f30349a;
        }

        public final int b() {
            return this.f30350b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ju.t.b(this.f30349a, aVar.f30349a) && this.f30350b == aVar.f30350b;
        }

        public int hashCode() {
            return (this.f30349a.hashCode() * 31) + Integer.hashCode(this.f30350b);
        }

        public String toString() {
            return "ActionMode(options=" + this.f30349a + ", selected=" + this.f30350b + ")";
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30351a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 703645989;
        }

        public String toString() {
            return "BaseMode";
        }
    }
}

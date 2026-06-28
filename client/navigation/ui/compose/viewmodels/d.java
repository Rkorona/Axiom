package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import c2.n1;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f34959a;

        public a(c cVar) {
            ju.t.f(cVar, "connectionStyle");
            this.f34959a = cVar;
        }

        public final c a() {
            return this.f34959a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ju.t.b(this.f34959a, ((a) obj).f34959a);
        }

        public int hashCode() {
            return this.f34959a.hashCode();
        }

        public String toString() {
            return "ConnectionTab(connectionStyle=" + this.f34959a + ")";
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f34960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n1 f34961b;

        public /* synthetic */ b(boolean z10, n1 n1Var, ju.k kVar) {
            this(z10, n1Var);
        }

        public final n1 a() {
            return this.f34961b;
        }

        public final boolean b() {
            return this.f34960a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f34960a == bVar.f34960a && ju.t.b(this.f34961b, bVar.f34961b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f34960a) * 31;
            n1 n1Var = this.f34961b;
            return iHashCode + (n1Var == null ? 0 : n1.v(n1Var.x()));
        }

        public String toString() {
            return "VaultsTab(isSelected=" + this.f34960a + ", terminalUIColor=" + this.f34961b + ")";
        }

        private b(boolean z10, n1 n1Var) {
            this.f34960a = z10;
            this.f34961b = n1Var;
        }
    }
}

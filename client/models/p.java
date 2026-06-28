package com.server.auditor.ssh.client.models;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27924a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1354280552;
        }

        public String toString() {
            return "CloseFlow";
        }
    }

    public static final class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27925a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -423502954;
        }

        public String toString() {
            return "NavigateBack";
        }
    }

    public static final class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27926a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1649375155;
        }

        public String toString() {
            return "NavigateToInternalErrorScreen";
        }
    }

    public static final class d extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f27928b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, List list) {
            super(null);
            ju.t.f(list, "entitiesToShare");
            this.f27927a = i10;
            this.f27928b = list;
        }

        public final List a() {
            return this.f27928b;
        }

        public final int b() {
            return this.f27927a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27927a == dVar.f27927a && ju.t.b(this.f27928b, dVar.f27928b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27927a) * 31) + this.f27928b.hashCode();
        }

        public String toString() {
            return "NavigateToSuccessScreen(invitedColleaguesCount=" + this.f27927a + ", entitiesToShare=" + this.f27928b + ")";
        }
    }

    public /* synthetic */ p(ju.k kVar) {
        this();
    }

    private p() {
    }
}

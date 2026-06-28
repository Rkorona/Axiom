package com.server.auditor.ssh.client.models;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    public static final class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27939a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -428041738;
        }

        public String toString() {
            return "CloseFlow";
        }
    }

    public static final class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27940a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1237668288;
        }

        public String toString() {
            return "NavigateToAuthenticationScreen";
        }
    }

    public static final class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, String str) {
            super(null);
            ju.t.f(list, "entitiesToShare");
            ju.t.f(str, "analyticsFunnelId");
            this.f27941a = list;
            this.f27942b = str;
        }

        public final String a() {
            return this.f27942b;
        }

        public final List b() {
            return this.f27941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ju.t.b(this.f27941a, cVar.f27941a) && ju.t.b(this.f27942b, cVar.f27942b);
        }

        public int hashCode() {
            return (this.f27941a.hashCode() * 31) + this.f27942b.hashCode();
        }

        public String toString() {
            return "NavigateToChooseCredentialsModeScreen(entitiesToShare=" + this.f27941a + ", analyticsFunnelId=" + this.f27942b + ")";
        }
    }

    public static final class d extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f27943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, String str) {
            super(null);
            ju.t.f(str, "analyticsFunnelId");
            this.f27943a = z10;
            this.f27944b = str;
        }

        public final String a() {
            return this.f27944b;
        }

        public final boolean b() {
            return this.f27943a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27943a == dVar.f27943a && ju.t.b(this.f27944b, dVar.f27944b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f27943a) * 31) + this.f27944b.hashCode();
        }

        public String toString() {
            return "NavigateToInviteColleaguesScreen(isSharedCredentials=" + this.f27943a + ", analyticsFunnelId=" + this.f27944b + ")";
        }
    }

    public /* synthetic */ q(ju.k kVar) {
        this();
    }

    private q() {
    }
}

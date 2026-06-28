package com.server.auditor.ssh.client.models;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27918a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27919a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27920a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImportOptionType f27921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImportOptionType importOptionType) {
            super(null);
            ju.t.f(importOptionType, "importOption");
            this.f27921a = importOptionType;
        }

        public final ImportOptionType a() {
            return this.f27921a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && ju.t.b(this.f27921a, ((d) obj).f27921a);
        }

        public int hashCode() {
            return this.f27921a.hashCode();
        }

        public String toString() {
            return "QuickImportOptionInfoStep(importOption=" + this.f27921a + ")";
        }
    }

    public static final class e extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27922a = new e();

        private e() {
            super(null);
        }
    }

    public static final class f extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27923a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ o(ju.k kVar) {
        this();
    }

    private o() {
    }
}

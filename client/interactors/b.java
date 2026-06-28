package com.server.auditor.ssh.client.interactors;

import il.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.f f27285a;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.b$a$a, reason: collision with other inner class name */
        public static final class C0431a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0431a f27286a = new C0431a();

            private C0431a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0431a);
            }

            public int hashCode() {
                return -106379818;
            }

            public String toString() {
                return "Failed";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.b$a$b, reason: collision with other inner class name */
        public static final class C0432b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0432b f27287a = new C0432b();

            private C0432b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0432b);
            }

            public int hashCode() {
                return -1662349485;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f27288a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1521141108;
            }

            public String toString() {
                return "Restricted";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27289a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 216613258;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.b$b, reason: collision with other inner class name */
    static final class C0433b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27290a;

        C0433b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new C0433b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27290a;
            if (i10 == 0) {
                ut.x.b(obj);
                il.f fVar = b.this.f27285a;
                this.f27290a = 1;
                obj = fVar.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            f.a aVar = (f.a) obj;
            if (ju.t.b(aVar, f.a.d.f56371a)) {
                return a.d.f27289a;
            }
            if (aVar instanceof f.a.C0838a) {
                y9.a.f86838a.i(((f.a.C0838a) aVar).a());
                return a.C0431a.f27286a;
            }
            if (ju.t.b(aVar, f.a.b.f56369a)) {
                return a.C0432b.f27287a;
            }
            if (aVar instanceof f.a.c) {
                return a.c.f27288a;
            }
            if (ju.t.b(aVar, f.a.e.f56372a)) {
                return a.C0431a.f27286a;
            }
            throw new ut.s();
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((C0433b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public b(il.f fVar) {
        ju.t.f(fVar, "repository");
        this.f27285a = fVar;
    }

    public final Object b(zt.e eVar) {
        return wu.j0.e(new C0433b(null), eVar);
    }
}

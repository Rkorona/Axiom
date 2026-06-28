package com.server.auditor.ssh.client.interactors;

import il.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.j0 f27591a;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.s0$a$a, reason: collision with other inner class name */
        public static final class C0440a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0440a f27592a = new C0440a();

            private C0440a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27593a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                ju.t.f(str, "playIntegrityNonce");
                this.f27593a = str;
            }

            public final String a() {
                return this.f27593a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && ju.t.b(this.f27593a, ((b) obj).f27593a);
            }

            public int hashCode() {
                return this.f27593a.hashCode();
            }

            public String toString() {
                return "Success(playIntegrityNonce=" + this.f27593a + ")";
            }
        }

        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27594a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return s0.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27594a;
            if (i10 == 0) {
                ut.x.b(obj);
                il.j0 j0Var = s0.this.f27591a;
                this.f27594a = 1;
                obj = j0Var.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            j0.a aVar = (j0.a) obj;
            if (aVar instanceof j0.a.d) {
                return new a.b(((j0.a.d) aVar).a());
            }
            if (aVar instanceof j0.a.C0842a) {
                y9.a.f86838a.i(((j0.a.C0842a) aVar).a());
                return a.C0440a.f27592a;
            }
            if ((aVar instanceof j0.a.e) || ju.t.b(aVar, j0.a.c.f56449a) || ju.t.b(aVar, j0.a.f.f56452a) || (aVar instanceof j0.a.b)) {
                return a.C0440a.f27592a;
            }
            throw new ut.s();
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public s0(il.j0 j0Var) {
        ju.t.f(j0Var, "repository");
        this.f27591a = j0Var;
    }

    public final Object b(zt.e eVar) {
        return wu.j0.e(new b(null), eVar);
    }
}

package com.server.auditor.ssh.client.interactors;

import il.i0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27565c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27566d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.i0 f27567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final to.y f27568b;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f27569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Exception f27570b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, Exception exc) {
                super(null);
                ju.t.f(exc, "exception");
                this.f27569a = i10;
                this.f27570b = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f27569a == aVar.f27569a && ju.t.b(this.f27570b, aVar.f27570b);
            }

            public int hashCode() {
                return (Integer.hashCode(this.f27569a) * 31) + this.f27570b.hashCode();
            }

            public String toString() {
                return "Error(responseCode=" + this.f27569a + ", exception=" + this.f27570b + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.r0$b$b, reason: collision with other inner class name */
        public static final class C0439b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f27571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f27572b;

            public C0439b(int i10, String str) {
                super(null);
                this.f27571a = i10;
                this.f27572b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0439b)) {
                    return false;
                }
                C0439b c0439b = (C0439b) obj;
                return this.f27571a == c0439b.f27571a && ju.t.b(this.f27572b, c0439b.f27572b);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f27571a) * 31;
                String str = this.f27572b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Failed(responseCode=" + this.f27571a + ", errorMessage=" + this.f27572b + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f27573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f27574b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f27575c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f27576d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final List f27577e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final List f27578f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final List f27579g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f27580h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i10, List list, List list2, List list3, List list4, List list5, List list6, String str) {
                super(null);
                ju.t.f(list, "historyConnections");
                ju.t.f(list2, "hostInteractions");
                ju.t.f(list3, "deleteHistoryConnectionIds");
                ju.t.f(list4, "sessionLogs");
                ju.t.f(list5, "deletedSessionLogIds");
                ju.t.f(list6, "devicesInfo");
                this.f27573a = i10;
                this.f27574b = list;
                this.f27575c = list2;
                this.f27576d = list3;
                this.f27577e = list4;
                this.f27578f = list5;
                this.f27579g = list6;
                this.f27580h = str;
            }

            public final List a() {
                return this.f27576d;
            }

            public final List b() {
                return this.f27578f;
            }

            public final List c() {
                return this.f27579g;
            }

            public final List d() {
                return this.f27574b;
            }

            public final List e() {
                return this.f27575c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f27573a == cVar.f27573a && ju.t.b(this.f27574b, cVar.f27574b) && ju.t.b(this.f27575c, cVar.f27575c) && ju.t.b(this.f27576d, cVar.f27576d) && ju.t.b(this.f27577e, cVar.f27577e) && ju.t.b(this.f27578f, cVar.f27578f) && ju.t.b(this.f27579g, cVar.f27579g) && ju.t.b(this.f27580h, cVar.f27580h);
            }

            public final String f() {
                return this.f27580h;
            }

            public final List g() {
                return this.f27577e;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((Integer.hashCode(this.f27573a) * 31) + this.f27574b.hashCode()) * 31) + this.f27575c.hashCode()) * 31) + this.f27576d.hashCode()) * 31) + this.f27577e.hashCode()) * 31) + this.f27578f.hashCode()) * 31) + this.f27579g.hashCode()) * 31;
                String str = this.f27580h;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Success(responseCode=" + this.f27573a + ", historyConnections=" + this.f27574b + ", hostInteractions=" + this.f27575c + ", deleteHistoryConnectionIds=" + this.f27576d + ", sessionLogs=" + this.f27577e + ", deletedSessionLogIds=" + this.f27578f + ", devicesInfo=" + this.f27579g + ", revision=" + this.f27580h + ")";
            }
        }

        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27581a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return r0.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27581a;
            if (i10 == 0) {
                ut.x.b(obj);
                String strA = r0.this.f27568b.a();
                il.i0 i0Var = r0.this.f27567a;
                this.f27581a = 1;
                obj = i0Var.b(strA, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            i0.b bVar = (i0.b) obj;
            if (bVar instanceof i0.b.d) {
                i0.b.d dVar = (i0.b.d) bVar;
                return new b.c(dVar.b(), dVar.a().getHistoryConnections(), dVar.a().getHostInteractions(), dVar.a().getDeleteHistoryConnectionIds(), dVar.a().getSessionLogs(), dVar.a().getDeletedSessionLogIds(), dVar.a().getDevicesInfo(), dVar.a().getRevision());
            }
            if (bVar instanceof i0.b.C0841b) {
                i0.b.C0841b c0841b = (i0.b.C0841b) bVar;
                return new b.C0439b(c0841b.b(), c0841b.a());
            }
            if (bVar instanceof i0.b.f) {
                i0.b.f fVar = (i0.b.f) bVar;
                return new b.C0439b(fVar.b(), fVar.a());
            }
            if (bVar instanceof i0.b.e) {
                i0.b.e eVar = (i0.b.e) bVar;
                return new b.C0439b(eVar.a(), "Too many failed attempts. Try again after:  " + eVar.b() + " seconds.");
            }
            if (bVar instanceof i0.b.a) {
                i0.b.a aVar = (i0.b.a) bVar;
                return new b.a(aVar.b(), aVar.a());
            }
            if (bVar instanceof i0.b.c) {
                return new b.C0439b(((i0.b.c) bVar).a(), "Unexpected error. Please try again later.");
            }
            if (bVar instanceof i0.b.g) {
                return new b.C0439b(((i0.b.g) bVar).a(), "Unexpected error. Please try again later.");
            }
            if (bVar instanceof i0.b.h) {
                return new b.C0439b(((i0.b.h) bVar).a(), "Unexpected error. Please try again later.");
            }
            throw new ut.s();
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public r0(il.i0 i0Var, to.y yVar) {
        ju.t.f(i0Var, "requestHistoryConnectionsApiRepository");
        ju.t.f(yVar, "historySyncRevisionRepository");
        this.f27567a = i0Var;
        this.f27568b = yVar;
    }

    public final Object c(zt.e eVar) {
        return wu.j0.e(new c(null), eVar);
    }
}

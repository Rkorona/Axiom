package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.synchronization.api.models.PostHistoryConnectionModel;
import il.d0;
import io.sentry.i4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27473c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27474d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.d0 f27475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final to.y f27476b;

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
            private final Exception f27477a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                ju.t.f(exc, "exception");
                this.f27477a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ju.t.b(this.f27477a, ((a) obj).f27477a);
            }

            public int hashCode() {
                return this.f27477a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f27477a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.n0$b$b, reason: collision with other inner class name */
        public static final class C0438b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0438b f27478a = new C0438b();

            private C0438b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0438b);
            }

            public int hashCode() {
                return 620052750;
            }

            public String toString() {
                return "Failed";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27479a;

            public c(String str) {
                super(null);
                this.f27479a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && ju.t.b(this.f27479a, ((c) obj).f27479a);
            }

            public int hashCode() {
                String str = this.f27479a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "NotPermitted(errorMessage=" + this.f27479a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27480a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1317682108;
            }

            public String toString() {
                return "PayloadTooLarge";
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f27481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f27482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f27483c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f27484d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final List f27485e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final List f27486f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final String f27487g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list, List list2, List list3, List list4, List list5, List list6, String str) {
                super(null);
                ju.t.f(list, "historyConnections");
                ju.t.f(list2, "hostInteractions");
                ju.t.f(list3, "deleteHistoryConnectionIds");
                ju.t.f(list4, "sessionLogs");
                ju.t.f(list5, "deletedSessionLogIds");
                ju.t.f(list6, "devicesInfo");
                this.f27481a = list;
                this.f27482b = list2;
                this.f27483c = list3;
                this.f27484d = list4;
                this.f27485e = list5;
                this.f27486f = list6;
                this.f27487g = str;
            }

            public final List a() {
                return this.f27483c;
            }

            public final List b() {
                return this.f27485e;
            }

            public final List c() {
                return this.f27486f;
            }

            public final List d() {
                return this.f27481a;
            }

            public final List e() {
                return this.f27482b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return ju.t.b(this.f27481a, eVar.f27481a) && ju.t.b(this.f27482b, eVar.f27482b) && ju.t.b(this.f27483c, eVar.f27483c) && ju.t.b(this.f27484d, eVar.f27484d) && ju.t.b(this.f27485e, eVar.f27485e) && ju.t.b(this.f27486f, eVar.f27486f) && ju.t.b(this.f27487g, eVar.f27487g);
            }

            public final String f() {
                return this.f27487g;
            }

            public final List g() {
                return this.f27484d;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.f27481a.hashCode() * 31) + this.f27482b.hashCode()) * 31) + this.f27483c.hashCode()) * 31) + this.f27484d.hashCode()) * 31) + this.f27485e.hashCode()) * 31) + this.f27486f.hashCode()) * 31;
                String str = this.f27487g;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Success(historyConnections=" + this.f27481a + ", hostInteractions=" + this.f27482b + ", deleteHistoryConnectionIds=" + this.f27483c + ", sessionLogs=" + this.f27484d + ", deletedSessionLogIds=" + this.f27485e + ", devicesInfo=" + this.f27486f + ", revision=" + this.f27487g + ")";
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f27488a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -1384730615;
            }

            public String toString() {
                return "Throttled";
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
        int f27489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f27491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, zt.e eVar) {
            super(2, eVar);
            this.f27491c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return n0.this.new c(this.f27491c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27489a;
            if (i10 == 0) {
                ut.x.b(obj);
                String strA = n0.this.f27476b.a();
                il.d0 d0Var = n0.this.f27475a;
                List list = this.f27491c;
                this.f27489a = 1;
                obj = d0Var.b(list, strA, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            d0.b bVar = (d0.b) obj;
            if (bVar instanceof d0.b.f) {
                d0.b.f fVar = (d0.b.f) bVar;
                return new b.e(fVar.d(), fVar.e(), fVar.a(), fVar.g(), fVar.b(), fVar.c(), fVar.f());
            }
            if (bVar instanceof d0.b.e) {
                return b.d.f27480a;
            }
            if (bVar instanceof d0.b.d) {
                return new b.c(((d0.b.d) bVar).a());
            }
            if (bVar instanceof d0.b.g) {
                return b.f.f27488a;
            }
            if (bVar instanceof d0.b.C0837b) {
                d0.b.C0837b c0837b = (d0.b.C0837b) bVar;
                n0.this.f(this.f27491c, c0837b.b(), c0837b.a());
                return b.C0438b.f27478a;
            }
            if ((bVar instanceof d0.b.h) || ju.t.b(bVar, d0.b.i.f56353a) || ju.t.b(bVar, d0.b.j.f56354a) || ju.t.b(bVar, d0.b.c.f56341a)) {
                return b.C0438b.f27478a;
            }
            if (bVar instanceof d0.b.a) {
                return new b.a(((d0.b.a) bVar).a());
            }
            throw new ut.s();
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public n0(il.d0 d0Var, to.y yVar) {
        ju.t.f(d0Var, "postHistoryConnectionsApiRepository");
        ju.t.f(yVar, "historySyncRevisionRepository");
        this.f27475a = d0Var;
        this.f27476b = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List list, final int i10, final String str) {
        mv.b bVarB = mv.t.b(null, new iu.l() { // from class: com.server.auditor.ssh.client.interactors.l0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return n0.g((mv.d) obj);
            }
        }, 1, null);
        bVarB.a();
        final String strC = bVarB.c(new lv.f(PostHistoryConnectionModel.Companion.serializer()), list);
        y9.a.f86838a.l("History-sync API request failed\nSee the attachment for details.", new i4() { // from class: com.server.auditor.ssh.client.interactors.m0
            @Override // io.sentry.i4
            public final void a(io.sentry.a1 a1Var) {
                n0.h(i10, str, strC, a1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(mv.d dVar) {
        ju.t.f(dVar, "$this$Json");
        dVar.f(true);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, String str, String str2, io.sentry.a1 a1Var) {
        ju.t.f(a1Var, "scope");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("response_code: " + i10);
        sb2.append('\n');
        sb2.append("error_body: " + str);
        sb2.append('\n');
        sb2.append("payload: " + str2);
        sb2.append('\n');
        String string = sb2.toString();
        ju.t.e(string, "toString(...)");
        byte[] bytes = string.getBytes(su.d.f78241b);
        ju.t.e(bytes, "getBytes(...)");
        a1Var.O(new io.sentry.b(bytes, "history_sync_failed.log", "text/plain"));
    }

    public final Object i(List list, zt.e eVar) {
        return wu.j0.e(new c(list, null), eVar);
    }
}

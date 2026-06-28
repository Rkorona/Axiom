package com.server.auditor.ssh.client.interactors;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.server.auditor.ssh.client.interactors.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f27336a;

    public static abstract class a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.c0$a$a, reason: collision with other inner class name */
        public static final class C0435a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0435a f27337a = new C0435a();

            private C0435a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0435a);
            }

            public int hashCode() {
                return 915435132;
            }

            public String toString() {
                return "Available";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27338a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -787389505;
            }

            public String toString() {
                return "Losing";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f27339a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 995827601;
            }

            public String toString() {
                return "Lost";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27340a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -495281341;
            }

            public String toString() {
                return "Unavailable";
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
        int f27341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27342b;

        public static final class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yu.s f27344a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.c0$b$a$a, reason: collision with other inner class name */
            static final class C0436a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27345a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ yu.s f27346b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0436a(yu.s sVar, zt.e eVar) {
                    super(2, eVar);
                    this.f27346b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new C0436a(this.f27346b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = au.b.f();
                    int i10 = this.f27345a;
                    if (i10 == 0) {
                        ut.x.b(obj);
                        yu.s sVar = this.f27346b;
                        a.C0435a c0435a = a.C0435a.f27337a;
                        this.f27345a = 1;
                        if (sVar.b(c0435a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                    }
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((C0436a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.interactors.c0$b$a$b, reason: collision with other inner class name */
            static final class C0437b extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27347a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ yu.s f27348b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0437b(yu.s sVar, zt.e eVar) {
                    super(2, eVar);
                    this.f27348b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new C0437b(this.f27348b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = au.b.f();
                    int i10 = this.f27347a;
                    if (i10 == 0) {
                        ut.x.b(obj);
                        yu.s sVar = this.f27348b;
                        a.b bVar = a.b.f27338a;
                        this.f27347a = 1;
                        if (sVar.b(bVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                    }
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((C0437b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27349a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ yu.s f27350b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(yu.s sVar, zt.e eVar) {
                    super(2, eVar);
                    this.f27350b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new c(this.f27350b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = au.b.f();
                    int i10 = this.f27349a;
                    if (i10 == 0) {
                        ut.x.b(obj);
                        yu.s sVar = this.f27350b;
                        a.c cVar = a.c.f27339a;
                        this.f27349a = 1;
                        if (sVar.b(cVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                    }
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f27351a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ yu.s f27352b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(yu.s sVar, zt.e eVar) {
                    super(2, eVar);
                    this.f27352b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new d(this.f27352b, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = au.b.f();
                    int i10 = this.f27351a;
                    if (i10 == 0) {
                        ut.x.b(obj);
                        yu.s sVar = this.f27352b;
                        a.d dVar = a.d.f27340a;
                        this.f27351a = 1;
                        if (sVar.b(dVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                    }
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            a(yu.s sVar) {
                this.f27344a = sVar;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ju.t.f(network, "network");
                super.onAvailable(network);
                yu.s sVar = this.f27344a;
                wu.k.d(sVar, null, null, new C0436a(sVar, null), 3, null);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i10) {
                ju.t.f(network, "network");
                super.onLosing(network, i10);
                yu.s sVar = this.f27344a;
                wu.k.d(sVar, null, null, new C0437b(sVar, null), 3, null);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ju.t.f(network, "network");
                super.onLost(network);
                yu.s sVar = this.f27344a;
                wu.k.d(sVar, null, null, new c(sVar, null), 3, null);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
                yu.s sVar = this.f27344a;
                wu.k.d(sVar, null, null, new d(sVar, null), 3, null);
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 l(c0 c0Var, a aVar) {
            c0Var.f27336a.unregisterNetworkCallback(aVar);
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            b bVar = c0.this.new b(eVar);
            bVar.f27342b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f27341a;
            if (i10 == 0) {
                ut.x.b(obj);
                yu.s sVar = (yu.s) this.f27342b;
                final a aVar = new a(sVar);
                c0.this.f27336a.registerDefaultNetworkCallback(aVar);
                final c0 c0Var = c0.this;
                iu.a aVar2 = new iu.a() { // from class: com.server.auditor.ssh.client.interactors.d0
                    @Override // iu.a
                    public final Object a() {
                        return c0.b.l(c0Var, aVar);
                    }
                };
                this.f27341a = 1;
                if (yu.q.a(sVar, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yu.s sVar, zt.e eVar) {
            return ((b) create(sVar, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public c0(Context context) {
        ju.t.f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ju.t.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f27336a = (ConnectivityManager) systemService;
    }

    public final zu.f b() {
        return zu.h.q(zu.h.e(new b(null)));
    }
}

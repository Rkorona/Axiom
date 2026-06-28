package com.server.auditor.ssh.client.widget;

import androidx.appcompat.app.AlertDialog;
import wu.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46817f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46818g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AlertDialog f46819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u1 f46822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u1 f46823e;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46824a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f46827b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, zt.e eVar) {
                super(2, eVar);
                this.f46827b = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f46827b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f46826a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f46827b.f();
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return o.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (wu.i.g(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f46824a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r7)
                goto L45
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                ut.x.b(r7)
                goto L30
            L1e:
                ut.x.b(r7)
                com.server.auditor.ssh.client.widget.o r7 = com.server.auditor.ssh.client.widget.o.this
                long r4 = com.server.auditor.ssh.client.widget.o.a(r7)
                r6.f46824a = r3
                java.lang.Object r7 = wu.s0.b(r4, r6)
                if (r7 != r0) goto L30
                goto L44
            L30:
                wu.g2 r7 = wu.x0.c()
                com.server.auditor.ssh.client.widget.o$b$a r1 = new com.server.auditor.ssh.client.widget.o$b$a
                com.server.auditor.ssh.client.widget.o r3 = com.server.auditor.ssh.client.widget.o.this
                r4 = 0
                r1.<init>(r3, r4)
                r6.f46824a = r2
                java.lang.Object r7 = wu.i.g(r7, r1, r6)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.widget.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46828a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f46831b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, zt.e eVar) {
                super(2, eVar);
                this.f46831b = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f46831b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f46830a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.f46831b.h();
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return o.this.new c(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (wu.i.g(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f46828a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r7)
                goto L45
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                ut.x.b(r7)
                goto L30
            L1e:
                ut.x.b(r7)
                com.server.auditor.ssh.client.widget.o r7 = com.server.auditor.ssh.client.widget.o.this
                long r4 = com.server.auditor.ssh.client.widget.o.b(r7)
                r6.f46828a = r3
                java.lang.Object r7 = wu.s0.b(r4, r6)
                if (r7 != r0) goto L30
                goto L44
            L30:
                wu.g2 r7 = wu.x0.c()
                com.server.auditor.ssh.client.widget.o$c$a r1 = new com.server.auditor.ssh.client.widget.o$c$a
                com.server.auditor.ssh.client.widget.o r3 = com.server.auditor.ssh.client.widget.o.this
                r4 = 0
                r1.<init>(r3, r4)
                r6.f46828a = r2
                java.lang.Object r7 = wu.i.g(r7, r1, r6)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                ut.m0 r7 = ut.m0.f82633a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.widget.o.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public o(AlertDialog alertDialog, long j10, long j11) {
        ju.t.f(alertDialog, "progressDialog");
        this.f46819a = alertDialog;
        this.f46820b = j10;
        this.f46821c = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (this.f46819a.isShowing()) {
            this.f46819a.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.f46819a.isShowing()) {
            return;
        }
        this.f46819a.show();
    }

    public final void e() {
        u1 u1Var = this.f46822d;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f46822d = null;
        u1 u1Var2 = this.f46823e;
        if (u1Var2 == null || !u1Var2.e()) {
            u1 u1Var3 = this.f46823e;
            if (u1Var3 != null) {
                u1.a.a(u1Var3, null, 1, null);
            }
            this.f46823e = wu.k.d(wu.j0.a(wu.x0.a()), null, null, new b(null), 3, null);
        }
    }

    public final void g() {
        u1 u1Var = this.f46823e;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.f46823e = null;
        u1 u1Var2 = this.f46822d;
        if (u1Var2 != null) {
            u1.a.a(u1Var2, null, 1, null);
        }
        this.f46822d = wu.k.d(wu.j0.a(wu.x0.a()), null, null, new c(null), 3, null);
    }

    public /* synthetic */ o(AlertDialog alertDialog, long j10, long j11, int i10, ju.k kVar) {
        this(alertDialog, (i10 & 2) != 0 ? 500L : j10, (i10 & 4) != 0 ? 250L : j11);
    }
}

package com.server.auditor.ssh.client.ui.enterprise.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k0;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import og.s;
import tp.g0;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;
import zu.f;
import zu.g;
import zu.h;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterpriseContinueOnDesktopViewModel extends i1 {
    public static final int $stable = 8;
    private final com.server.auditor.ssh.client.utils.analytics.a avoAnalytics;
    private final com.server.auditor.ssh.client.ui.enterprise.domain.a determineEnterpriseIntroductionStatusUseCase;
    private final f enterpriseIntroductionStatusFlow;
    private final g0 liveSharedPreferences;
    private final com.server.auditor.ssh.client.app.a termiusStorage;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40174a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return EnterpriseContinueOnDesktopViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40174a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseContinueOnDesktopViewModel.this.avoAnalytics.g2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40176a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40176a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40177a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f40177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f40180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnterpriseContinueOnDesktopViewModel f40181d;

        public static final class a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f40182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnterpriseContinueOnDesktopViewModel f40183b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel$d$a$a, reason: collision with other inner class name */
            public static final class C0625a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f40184a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f40185b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f40187d;

                public C0625a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40184a = obj;
                    this.f40185b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(g gVar, EnterpriseContinueOnDesktopViewModel enterpriseContinueOnDesktopViewModel) {
                this.f40183b = enterpriseContinueOnDesktopViewModel;
                this.f40182a = gVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
            
                if (r7.emit((com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a) r8, r0) != r1) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, zt.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel.d.a.C0625a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel$d$a$a r0 = (com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel.d.a.C0625a) r0
                    int r1 = r0.f40185b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40185b = r1
                    goto L18
                L13:
                    com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel$d$a$a r0 = new com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel$d$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f40184a
                    java.lang.Object r1 = au.b.f()
                    int r2 = r0.f40185b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    ut.x.b(r8)
                    goto L6d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f40187d
                    zu.g r7 = (zu.g) r7
                    ut.x.b(r8)
                    goto L5f
                L3c:
                    ut.x.b(r8)
                    zu.g r8 = r6.f40182a
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String r2 = "success"
                    boolean r7 = ju.t.b(r7, r2)
                    if (r7 == 0) goto L6d
                    com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel r7 = r6.f40183b
                    com.server.auditor.ssh.client.ui.enterprise.domain.a r7 = com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel.access$getDetermineEnterpriseIntroductionStatusUseCase$p(r7)
                    r0.f40187d = r8
                    r0.f40185b = r4
                    java.lang.Object r7 = r7.a(r0)
                    if (r7 != r1) goto L5c
                    goto L6c
                L5c:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L5f:
                    com.server.auditor.ssh.client.ui.enterprise.domain.a$a r8 = (com.server.auditor.ssh.client.ui.enterprise.domain.a.InterfaceC0626a) r8
                    r2 = 0
                    r0.f40187d = r2
                    r0.f40185b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L6d
                L6c:
                    return r1
                L6d:
                    ut.m0 r7 = ut.m0.f82633a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.enterprise.domain.EnterpriseContinueOnDesktopViewModel.d.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, e eVar, EnterpriseContinueOnDesktopViewModel enterpriseContinueOnDesktopViewModel) {
            super(2, eVar);
            this.f40180c = fVar;
            this.f40181d = enterpriseContinueOnDesktopViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            d dVar = new d(this.f40180c, eVar, this.f40181d);
            dVar.f40179b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f40178a;
            if (i10 == 0) {
                x.b(obj);
                g gVar = (g) this.f40179b;
                f fVar = this.f40180c;
                a aVar = new a(gVar, this.f40181d);
                this.f40178a = 1;
                if (fVar.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(g gVar, e eVar) {
            return ((d) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnterpriseContinueOnDesktopViewModel() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        b2 b2Var = b2.f52944a;
        g0 g0VarY1 = b2Var.y1();
        this.liveSharedPreferences = g0VarY1;
        this.avoAnalytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        il.m mVar = new il.m(dVarM, b2Var.s1());
        hg.d dVarM2 = aVarN.M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        this.determineEnterpriseIntroductionStatusUseCase = new com.server.auditor.ssh.client.ui.enterprise.domain.a(mVar, new s(dVarM2), new kp.c(new in.c(g0VarY1)));
        k0 k0VarD = aVarN.D();
        t.e(k0VarD, "getBulkAccountResult(...)");
        this.enterpriseIntroductionStatusFlow = h.B(new d(androidx.lifecycle.m.a(k0VarD), null, this));
        k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final f getEnterpriseIntroductionStatusFlow() {
        return this.enterpriseIntroductionStatusFlow;
    }

    public final void onBackPressed() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onDismissPopUpRequested() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}

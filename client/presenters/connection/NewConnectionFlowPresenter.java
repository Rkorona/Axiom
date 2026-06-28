package com.server.auditor.ssh.client.presenters.connection;

import android.content.SharedPreferences;
import android.text.Editable;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.crystalnix.termius.libtermius.wrappers.TerminalSessionHelper;
import com.crystalnix.termius.libtermius.wrappers.TypeOfCurrentConnection;
import com.crystalnix.termius.libtermius.wrappers.WebAuthnAuth;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.adapters.HostsDBAdapter;
import com.server.auditor.ssh.client.database.adapters.IdentityDBAdapter;
import com.server.auditor.ssh.client.database.adapters.MultiKeyDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshCertificateDBAdapter;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.synchronization.api.adapters.MultiKeyApiAdapter;
import hg.b2;
import io.split.android.client.dtos.SerializableEvent;
import java.util.ArrayList;
import java.util.List;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import rh.z;
import ui.b;
import ui.d;
import ui.e;

/* JADX INFO: loaded from: classes4.dex */
public final class NewConnectionFlowPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.connection.d> implements d.a, b.a, e.a {
    public static final a D = new a(null);
    public static final int E = 8;
    private final b A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f37263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ui.d f37264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ui.b f37265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ui.e f37266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ui.a f37267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f37268f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f37269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f37270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList f37271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f37272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f37273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TypeOfCurrentConnection f37274z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class a0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37275a;

        a0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new a0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37275a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().d3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class a1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f37280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f37281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f37282f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f37284v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ lj.y f37285w;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37286a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ NewConnectionFlowPresenter f37287b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ lj.y f37288c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NewConnectionFlowPresenter newConnectionFlowPresenter, lj.y yVar, zt.e eVar) {
                super(2, eVar);
                this.f37287b = newConnectionFlowPresenter;
                this.f37288c = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f37287b, this.f37288c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f37286a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    return obj;
                }
                ut.x.b(obj);
                ui.e eVar = this.f37287b.f37266d;
                long jB = this.f37288c.b();
                this.f37286a = 1;
                Object objB = eVar.b(jB, this);
                return objB == objF ? objF : objB;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(boolean z10, lj.y yVar, zt.e eVar) {
            super(2, eVar);
            this.f37284v = z10;
            this.f37285w = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new a1(this.f37284v, this.f37285w, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
        
            if (r15 == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
        
            if (r15.h(r1, r14) == r0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[PHI: r15
          0x00e6: PHI (r15v23 java.lang.Object) = (r15v22 java.lang.Object), (r15v0 java.lang.Object) binds: [B:31:0x00e2, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.a1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((a1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37300a;

        b0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new b0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.f(NewConnectionFlowPresenter.this.f37269u, NewConnectionFlowPresenter.this.f37272x));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class b1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37302a;

        b1(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new b1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            gh.s sVarV = NewConnectionFlowPresenter.this.f37264b.v();
            NewConnectionFlowPresenter.this.f37264b.n();
            NewConnectionFlowPresenter.this.getViewState().B8(NewConnectionFlowPresenter.this.f37274z, sVarV);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37306c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37305b = str;
            this.f37306c = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(this.f37305b, this.f37306c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37304a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.b.c cVar = new NewConnectionFlowDialog.b.c(this.f37305b);
            this.f37306c.getViewState().k7(cVar);
            this.f37306c.getViewState().F9(cVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37307a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37310d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f37309c = str;
            this.f37310d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new c0(this.f37309c, this.f37310d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37307a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.o(this.f37309c, this.f37310d);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f37316f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(int i10, boolean z10, boolean z11, boolean z12, zt.e eVar) {
            super(2, eVar);
            this.f37313c = i10;
            this.f37314d = z10;
            this.f37315e = z11;
            this.f37316f = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new c1(this.f37313c, this.f37314d, this.f37315e, this.f37316f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37268f = kotlin.coroutines.jvm.internal.b.d(this.f37313c);
            NewConnectionFlowPresenter.this.getViewState().h9(this.f37314d, this.f37315e, this.f37316f);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37317a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37317a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.k();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37323e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(String str, String str2, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37321c = str;
            this.f37322d = str2;
            this.f37323e = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d0(this.f37321c, this.f37322d, this.f37323e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var;
            Object objF = au.b.f();
            int i10 = this.f37320b;
            if (i10 == 0) {
                ut.x.b(obj);
                Integer numV = su.s.v(this.f37321c);
                String str = this.f37322d;
                if (str.length() == 0) {
                    str = TerminalSessionHelper.MOSH_SERVER_COMMAND_DEFAULT;
                }
                String str2 = str;
                Long lC = this.f37323e.A.c();
                if (lC != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = this.f37323e;
                    long jLongValue = lC.longValue();
                    ui.a aVar = newConnectionFlowPresenter.f37267e;
                    this.f37319a = lC;
                    this.f37320b = 1;
                    d0Var = this;
                    if (aVar.f(jLongValue, numV, str2, d0Var) == objF) {
                        return objF;
                    }
                }
                d0Var.f37323e.f37264b.o(d0Var.f37321c, d0Var.f37322d);
                d0Var.f37323e.getViewState().Sa(true);
                d0Var.f37323e.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
                return ut.m0.f82633a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            d0Var = this;
            d0Var.f37323e.f37264b.o(d0Var.f37321c, d0Var.f37322d);
            d0Var.f37323e.getViewState().Sa(true);
            d0Var.f37323e.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37325b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37327d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new d1(this.f37327d, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r10.f37325b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r10.f37324a
                java.lang.Long r0 = (java.lang.Long) r0
                ut.x.b(r11)
                goto L5a
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                ut.x.b(r11)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r11)
                boolean r11 = r11.e()
                if (r11 == 0) goto L31
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                boolean r1 = r10.f37327d
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.L2(r11, r1)
            L31:
                boolean r11 = r10.f37327d
                if (r11 == 0) goto L5a
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r11)
                java.lang.Long r11 = r11.c()
                if (r11 == 0) goto L5a
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                long r4 = r11.longValue()
                ui.a r3 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.y2(r1)
                r10.f37324a = r11
                r10.f37325b = r2
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ui.a.k(r3, r4, r6, r7, r8, r9)
                if (r11 != r0) goto L5b
                return r0
            L5a:
                r7 = r10
            L5b:
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                ui.d r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.v2(r11)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r0)
                java.lang.String r0 = r0.h()
                if (r0 != 0) goto L6f
                java.lang.String r0 = ""
            L6f:
                r11.q(r0)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r11 = r11.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r11 = (com.server.auditor.ssh.client.contracts.connection.d) r11
                r11.Sa(r2)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r11 = r11.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r11 = (com.server.auditor.ssh.client.contracts.connection.d) r11
                com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog$b$k r0 = com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.b.k.f24516a
                r11.F9(r0)
                ut.m0 r11 = ut.m0.f82633a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.d1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f37330c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new e(this.f37330c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37328a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37330c;
            NewConnectionFlowDialog.b.a aVar = NewConnectionFlowDialog.b.a.f24490a;
            NewConnectionFlowPresenter.this.getViewState().k7(aVar);
            NewConnectionFlowPresenter.this.getViewState().F9(aVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37333c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new e0(this.f37333c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.p(this.f37333c);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f37336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(long j10, zt.e eVar) {
            super(2, eVar);
            this.f37336c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new e1(this.f37336c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().ha();
            NewConnectionFlowPresenter.this.f37264b.T(this.f37336c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37337a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().j6();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37341c = str;
            this.f37342d = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f0(this.f37341c, this.f37342d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37340b;
            if (i10 == 0) {
                ut.x.b(obj);
                Integer numV = su.s.v(this.f37341c);
                Long lC = this.f37342d.A.c();
                if (lC != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = this.f37342d;
                    long jLongValue = lC.longValue();
                    ui.a aVar = newConnectionFlowPresenter.f37267e;
                    this.f37339a = lC;
                    this.f37340b = 1;
                    if (aVar.h(jLongValue, numV, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            this.f37342d.f37264b.p(this.f37341c);
            this.f37342d.getViewState().Sa(true);
            this.f37342d.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f1(List list, zt.e eVar) {
            super(2, eVar);
            this.f37345c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new f1(this.f37345c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37343a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37271w.clear();
            NewConnectionFlowPresenter.this.f37271w.addAll(this.f37345c);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.m(NewConnectionFlowPresenter.this.f37269u, NewConnectionFlowPresenter.this.f37272x, NewConnectionFlowPresenter.this.f37271w));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37346a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37346a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.k();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37348a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37350c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new g0(this.f37350c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37348a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.q(this.f37350c);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37351a;

        g1(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new g1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37351a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().d3();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37353a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37353a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            boolean zE = NewConnectionFlowPresenter.this.A.e();
            com.server.auditor.ssh.client.utils.analytics.a.y().d1(NewConnectionFlowPresenter.this.A.b());
            com.server.auditor.ssh.client.contracts.connection.d viewState = NewConnectionFlowPresenter.this.getViewState();
            String strG = NewConnectionFlowPresenter.this.A.g();
            if (strG == null) {
                strG = "";
            }
            String strD = NewConnectionFlowPresenter.this.A.d();
            if (strD == null) {
                strD = TerminalSessionHelper.MOSH_SERVER_COMMAND_DEFAULT;
            }
            viewState.F9(new NewConnectionFlowDialog.b.h(strG, strD, zE));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37358d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37357c = str;
            this.f37358d = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h0(this.f37357c, this.f37358d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37356b;
            if (i10 == 0) {
                ut.x.b(obj);
                Integer numV = su.s.v(this.f37357c);
                Long lC = this.f37358d.A.c();
                if (lC != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = this.f37358d;
                    long jLongValue = lC.longValue();
                    ui.a aVar = newConnectionFlowPresenter.f37267e;
                    this.f37355a = lC;
                    this.f37356b = 1;
                    if (aVar.j(jLongValue, numV, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            this.f37358d.f37264b.q(this.f37357c);
            this.f37358d.getViewState().Sa(true);
            this.f37358d.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37359a;

        h1(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new h1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37359a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().e6();
            NewConnectionFlowPresenter.this.f37271w.clear();
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.m(NewConnectionFlowPresenter.this.f37269u, NewConnectionFlowPresenter.this.f37272x, NewConnectionFlowPresenter.this.f37271w));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37361a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37361a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            boolean zE = NewConnectionFlowPresenter.this.A.e();
            com.server.auditor.ssh.client.utils.analytics.a.y().d1(NewConnectionFlowPresenter.this.A.b());
            com.server.auditor.ssh.client.contracts.connection.d viewState = NewConnectionFlowPresenter.this.getViewState();
            String strG = NewConnectionFlowPresenter.this.A.g();
            if (strG == null) {
                strG = "";
            }
            viewState.F9(new NewConnectionFlowDialog.b.r(strG, zE));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37363a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37365c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new i0(this.f37365c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37363a;
            if (i10 == 0) {
                ut.x.b(obj);
                NewConnectionFlowPresenter.this.getViewState().Sa(true);
                NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
                ui.d dVar = NewConnectionFlowPresenter.this.f37264b;
                Long lF = NewConnectionFlowPresenter.this.A.f();
                String str = this.f37365c;
                this.f37363a = 1;
                if (dVar.e(lF, str, this) == objF) {
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
            return ((i0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37366a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(String str, zt.e eVar) {
            super(2, eVar);
            this.f37368c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new i1(this.f37368c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.j(this.f37368c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37369a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            boolean zE = NewConnectionFlowPresenter.this.A.e();
            com.server.auditor.ssh.client.utils.analytics.a.y().d1(NewConnectionFlowPresenter.this.A.b());
            com.server.auditor.ssh.client.contracts.connection.d viewState = NewConnectionFlowPresenter.this.getViewState();
            String strH = NewConnectionFlowPresenter.this.A.h();
            if (strH == null) {
                strH = "";
            }
            viewState.F9(new NewConnectionFlowDialog.b.s(strH, zE));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37372b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37374d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new j0(this.f37374d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        
            if (r8.e(r1, r3, r7) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r7.f37372b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ut.x.b(r8)
                goto L7e
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f37371a
                java.lang.Long r1 = (java.lang.Long) r1
                ut.x.b(r8)
                goto L60
            L22:
                ut.x.b(r8)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r8 = r8.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r8 = (com.server.auditor.ssh.client.contracts.connection.d) r8
                r8.Sa(r3)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r8 = r8.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r8 = (com.server.auditor.ssh.client.contracts.connection.d) r8
                com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog$b$k r1 = com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.b.k.f24516a
                r8.F9(r1)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r8)
                java.lang.Long r8 = r8.f()
                if (r8 == 0) goto L60
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                java.lang.String r4 = r7.f37374d
                long r5 = r8.longValue()
                ui.e r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.A2(r1)
                r7.f37371a = r8
                r7.f37372b = r3
                java.lang.Object r8 = r1.d(r5, r4, r7)
                if (r8 != r0) goto L60
                goto L7d
            L60:
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                ui.d r8 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.v2(r8)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r1)
                java.lang.Long r1 = r1.f()
                java.lang.String r3 = r7.f37374d
                r4 = 0
                r7.f37371a = r4
                r7.f37372b = r2
                java.lang.Object r8 = r8.e(r1, r3, r7)
                if (r8 != r0) goto L7e
            L7d:
                return r0
            L7e:
                ut.m0 r8 = ut.m0.f82633a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37376b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37378d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j1(String str, zt.e eVar) {
            super(2, eVar);
            this.f37378d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new j1(this.f37378d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37376b;
            if (i10 == 0) {
                ut.x.b(obj);
                NewConnectionFlowPresenter.this.getViewState().Sa(true);
                NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
                Long lC = NewConnectionFlowPresenter.this.A.c();
                if (lC != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = NewConnectionFlowPresenter.this;
                    String str = this.f37378d;
                    long jLongValue = lC.longValue();
                    Identity identity = new Identity();
                    identity.setUsername(str);
                    ui.a aVar = newConnectionFlowPresenter.f37267e;
                    this.f37375a = lC;
                    this.f37376b = 1;
                    if (aVar.e(jLongValue, identity, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            NewConnectionFlowPresenter.this.f37264b.j(this.f37378d);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f37384f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f37385u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Long f37386v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f37387w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f37388x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f37389y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ boolean f37390z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, String str3, String str4, String str5, Long l10, String str6, boolean z10, boolean z11, boolean z12, zt.e eVar) {
            super(2, eVar);
            this.f37381c = str;
            this.f37382d = str2;
            this.f37383e = str3;
            this.f37384f = str4;
            this.f37385u = str5;
            this.f37386v = l10;
            this.f37387w = str6;
            this.f37388x = z10;
            this.f37389y = z11;
            this.f37390z = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new k(this.f37381c, this.f37382d, this.f37383e, this.f37384f, this.f37385u, this.f37386v, this.f37387w, this.f37388x, this.f37389y, this.f37390z, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37379a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b bVar = NewConnectionFlowPresenter.this.A;
            Long l10 = this.f37386v;
            String str = this.f37387w;
            boolean z10 = this.f37388x;
            String str2 = this.f37383e;
            String str3 = this.f37384f;
            boolean z11 = this.f37389y;
            String str4 = this.f37385u;
            boolean z12 = this.f37390z;
            bVar.m(l10);
            bVar.j(str);
            bVar.k(z10);
            bVar.q(str2);
            bVar.n(str3);
            bVar.l(z11);
            bVar.r(str4);
            bVar.o((z10 || z11 || !z12) ? false : true);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.d(this.f37381c, this.f37382d, NewConnectionFlowPresenter.this.B, NewConnectionFlowPresenter.this.A.e(), this.f37383e, this.f37384f, this.f37385u));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37391a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37393c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new k0(this.f37393c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37391a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.f(this.f37393c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37394a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Long f37399f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f37400u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k1(String str, boolean z10, String str2, Long l10, boolean z11, zt.e eVar) {
            super(2, eVar);
            this.f37396c = str;
            this.f37397d = z10;
            this.f37398e = str2;
            this.f37399f = l10;
            this.f37400u = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new k1(this.f37396c, this.f37397d, this.f37398e, this.f37399f, this.f37400u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37394a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37396c;
            NewConnectionFlowPresenter.this.f37273y = this.f37397d;
            NewConnectionFlowPresenter.this.f37270v = this.f37398e;
            NewConnectionFlowPresenter.this.A.m(this.f37399f);
            NewConnectionFlowPresenter.this.A.i(this.f37400u);
            NewConnectionFlowDialog.b.t tVar = new NewConnectionFlowDialog.b.t(this.f37396c, this.f37397d, this.f37400u, this.f37398e);
            NewConnectionFlowPresenter.this.getViewState().k7(tVar);
            NewConnectionFlowPresenter.this.getViewState().F9(tVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37401a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long hostId;
            au.b.f();
            if (this.f37401a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.n();
            if (!(NewConnectionFlowPresenter.this.f37274z instanceof TypeOfCurrentConnection.Unknown) && (hostId = NewConnectionFlowPresenter.this.f37274z.getHostId()) != null) {
                NewConnectionFlowPresenter.this.getViewState().Cb(hostId.longValue());
            }
            NewConnectionFlowPresenter.this.getViewState().kd();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37403a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f37406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37407e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str, Long l10, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37405c = str;
            this.f37406d = l10;
            this.f37407e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new l0(this.f37405c, this.f37406d, this.f37407e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37403a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37405c;
            NewConnectionFlowPresenter.this.A.m(this.f37406d);
            NewConnectionFlowPresenter.this.A.i(this.f37407e);
            NewConnectionFlowDialog.b.j jVar = new NewConnectionFlowDialog.b.j(this.f37405c, this.f37407e);
            NewConnectionFlowPresenter.this.getViewState().k7(jVar);
            NewConnectionFlowPresenter.this.getViewState().F9(jVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37408a;

        l1(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new l1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37408a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.s();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37410a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37410a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().dd();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37413b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str, zt.e eVar) {
            super(2, eVar);
            this.f37415d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new m0(this.f37415d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37413b;
            if (i10 == 0) {
                ut.x.b(obj);
                NewConnectionFlowPresenter.this.getViewState().Sa(true);
                NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
                Long lC = NewConnectionFlowPresenter.this.A.c();
                if (lC != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = NewConnectionFlowPresenter.this;
                    String str = this.f37415d;
                    long jLongValue = lC.longValue();
                    Identity identity = new Identity();
                    identity.setPassword(str);
                    ui.a aVar = newConnectionFlowPresenter.f37267e;
                    this.f37412a = lC;
                    this.f37413b = 1;
                    if (aVar.e(jLongValue, identity, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            NewConnectionFlowPresenter.this.f37264b.f(this.f37415d);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebAuthnAuth f37419d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m1(String str, WebAuthnAuth webAuthnAuth, zt.e eVar) {
            super(2, eVar);
            this.f37418c = str;
            this.f37419d = webAuthnAuth;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new m1(this.f37418c, this.f37419d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37416a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37418c;
            NewConnectionFlowDialog.b.C0391b c0391b = new NewConnectionFlowDialog.b.C0391b(this.f37419d);
            NewConnectionFlowPresenter.this.getViewState().k7(c0391b);
            NewConnectionFlowPresenter.this.getViewState().F9(c0391b);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37420a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().c();
            NewConnectionFlowPresenter.this.f37264b.l();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37422a;

        n0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new n0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37422a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.i();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37424a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f37426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n1(byte[] bArr, zt.e eVar) {
            super(2, eVar);
            this.f37426c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new n1(this.f37426c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37424a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.Q(this.f37426c);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37427a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37427a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.b();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37429a;

        o0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new o0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37429a;
            if (i10 == 0) {
                ut.x.b(obj);
                ui.b bVar = NewConnectionFlowPresenter.this.f37265c;
                String str = NewConnectionFlowPresenter.this.f37270v;
                Long lC = NewConnectionFlowPresenter.this.A.c();
                this.f37429a = 1;
                if (bVar.b(str, lC, this) == objF) {
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
            return ((o0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37431a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o1(int i10, int i11, String str, zt.e eVar) {
            super(2, eVar);
            this.f37433c = i10;
            this.f37434d = i11;
            this.f37435e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new o1(this.f37433c, this.f37434d, this.f37435e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37431a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.R(this.f37433c, this.f37434d, this.f37435e);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37440e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2, String str3, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37437b = str;
            this.f37438c = str2;
            this.f37439d = str3;
            this.f37440e = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p(this.f37437b, this.f37438c, this.f37439d, this.f37440e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37436a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.b.e eVar = new NewConnectionFlowDialog.b.e(this.f37437b, this.f37438c, this.f37439d);
            this.f37440e.getViewState().k7(eVar);
            this.f37440e.getViewState().F9(eVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypeOfCurrentConnection f37442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NewConnectionFlowPresenter f37444d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(TypeOfCurrentConnection typeOfCurrentConnection, String str, NewConnectionFlowPresenter newConnectionFlowPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37442b = typeOfCurrentConnection;
            this.f37443c = str;
            this.f37444d = newConnectionFlowPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new p0(this.f37442b, this.f37443c, this.f37444d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            au.b.f();
            if (this.f37441a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            TypeOfCurrentConnection typeOfCurrentConnection = this.f37442b;
            if (typeOfCurrentConnection instanceof TypeOfCurrentConnection.TerminalConnection) {
                z10 = true;
            } else {
                if (!(typeOfCurrentConnection instanceof TypeOfCurrentConnection.PortForwardingConnection) && !(typeOfCurrentConnection instanceof TypeOfCurrentConnection.SftpConnection) && !ju.t.b(typeOfCurrentConnection, TypeOfCurrentConnection.Unknown.INSTANCE)) {
                    throw new ut.s();
                }
                z10 = false;
            }
            NewConnectionFlowDialog.b.g gVar = new NewConnectionFlowDialog.b.g(this.f37443c, z10, this.f37442b.isLastConnection());
            this.f37444d.f37274z = this.f37442b;
            this.f37444d.getViewState().k7(gVar);
            this.f37444d.getViewState().F9(gVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p1 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37445a;

        p1(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new p1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (NewConnectionFlowPresenter.this.f37274z instanceof TypeOfCurrentConnection.Unknown) {
                NewConnectionFlowPresenter.this.getViewState().L1(false);
            } else {
                NewConnectionFlowPresenter.this.getViewState().L1(NewConnectionFlowPresenter.this.f37274z.getHostId() != null);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p1) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37447a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37449c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(List list, zt.e eVar) {
            super(2, eVar);
            this.f37449c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new q(this.f37449c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37447a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.l(NewConnectionFlowPresenter.this.f37269u, this.f37449c, NewConnectionFlowPresenter.this.B, NewConnectionFlowPresenter.this.A.a()));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class q0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37450a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypeOfCurrentConnection f37452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f37453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37454e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(TypeOfCurrentConnection typeOfCurrentConnection, List list, String str, zt.e eVar) {
            super(2, eVar);
            this.f37452c = typeOfCurrentConnection;
            this.f37453d = list;
            this.f37454e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new q0(this.f37452c, this.f37453d, this.f37454e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37450a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().K9();
            NewConnectionFlowPresenter.this.getViewState().Sa(false);
            NewConnectionFlowPresenter.this.f37274z = this.f37452c;
            NewConnectionFlowDialog.b.n nVar = new NewConnectionFlowDialog.b.n(this.f37453d, this.f37454e);
            if (!NewConnectionFlowPresenter.this.C) {
                NewConnectionFlowPresenter.this.C = true;
                NewConnectionFlowPresenter.this.getViewState().k7(nVar);
                NewConnectionFlowPresenter.this.getViewState().K9();
            }
            NewConnectionFlowPresenter.this.getViewState().F9(nVar);
            NewConnectionFlowPresenter.this.getViewState().Xe();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((q0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37455a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37455a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.t(NewConnectionFlowPresenter.this.f37269u, NewConnectionFlowPresenter.this.f37273y, true, NewConnectionFlowPresenter.this.f37270v));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class r0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37457a;

        r0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new r0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37457a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37264b.S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((r0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37460b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z.a f37463e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z10, z.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f37462d = z10;
            this.f37463e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new s(this.f37462d, this.f37463e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Long lC;
            Object objF = au.b.f();
            int i10 = this.f37460b;
            if (i10 == 0) {
                ut.x.b(obj);
                if (NewConnectionFlowPresenter.this.A.a()) {
                    NewConnectionFlowPresenter.this.I3(this.f37462d);
                }
                NewConnectionFlowPresenter.this.getViewState().Sa(true);
                NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
                if (this.f37462d && this.f37463e.f76893a != null && (lC = NewConnectionFlowPresenter.this.A.c()) != null) {
                    NewConnectionFlowPresenter newConnectionFlowPresenter = NewConnectionFlowPresenter.this;
                    z.a aVar = this.f37463e;
                    long jLongValue = lC.longValue();
                    ui.a aVar2 = newConnectionFlowPresenter.f37267e;
                    Identity identity = aVar.f76893a;
                    ju.t.e(identity, "mIdentity");
                    this.f37459a = lC;
                    this.f37460b = 1;
                    if (aVar2.e(jLongValue, identity, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            NewConnectionFlowPresenter.this.f37264b.c(this.f37463e);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class s0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37464a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f37467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f37469f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Editable f37470u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, Long l10, String str2, String str3, Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f37466c = str;
            this.f37467d = l10;
            this.f37468e = str2;
            this.f37469f = str3;
            this.f37470u = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new s0(this.f37466c, this.f37467d, this.f37468e, this.f37469f, this.f37470u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37464a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37466c;
            NewConnectionFlowPresenter.this.A.m(this.f37467d);
            NewConnectionFlowDialog.b.q qVar = new NewConnectionFlowDialog.b.q(this.f37466c, this.f37468e, this.f37469f, this.f37470u);
            NewConnectionFlowPresenter.this.getViewState().k7(qVar);
            NewConnectionFlowPresenter.this.getViewState().F9(qVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((s0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37471a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f37473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f37476f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(long j10, String str, String str2, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37473c = j10;
            this.f37474d = str;
            this.f37475e = str2;
            this.f37476f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new t(this.f37473c, this.f37474d, this.f37475e, this.f37476f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37471a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.A.p(kotlin.coroutines.jvm.internal.b.e(this.f37473c));
            NewConnectionFlowDialog.b.i iVar = new NewConnectionFlowDialog.b.i(this.f37474d, this.f37475e, this.f37476f);
            NewConnectionFlowPresenter.this.getViewState().k7(iVar);
            NewConnectionFlowPresenter.this.getViewState().F9(iVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class t0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37477a;

        t0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new t0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37477a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.g();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((t0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37479a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37481c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, zt.e eVar) {
            super(2, eVar);
            this.f37481c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new u(this.f37481c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37479a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.utils.analytics.a.y().q3();
            NewConnectionFlowPresenter.this.f37264b.d(this.f37481c);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class u0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37482a;

        u0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new u0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37482a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().ue();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((u0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f37486c = str;
            this.f37487d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new v(this.f37486c, this.f37487d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37484a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37269u = this.f37486c;
            NewConnectionFlowPresenter.this.f37272x = this.f37487d;
            NewConnectionFlowDialog.b.f fVar = new NewConnectionFlowDialog.b.f(this.f37486c, this.f37487d);
            NewConnectionFlowPresenter.this.getViewState().k7(fVar);
            NewConnectionFlowPresenter.this.getViewState().F9(fVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class v0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37488a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypeOfCurrentConnection f37490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f37491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37492e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v0(TypeOfCurrentConnection typeOfCurrentConnection, List list, String str, zt.e eVar) {
            super(2, eVar);
            this.f37490c = typeOfCurrentConnection;
            this.f37491d = list;
            this.f37492e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new v0(this.f37490c, this.f37491d, this.f37492e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37488a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().K9();
            NewConnectionFlowPresenter.this.getViewState().Sa(false);
            NewConnectionFlowPresenter.this.f37274z = this.f37490c;
            NewConnectionFlowDialog.b.o oVar = new NewConnectionFlowDialog.b.o(this.f37491d, this.f37492e);
            if (!NewConnectionFlowPresenter.this.C) {
                NewConnectionFlowPresenter.this.C = true;
                NewConnectionFlowPresenter.this.getViewState().k7(oVar);
                NewConnectionFlowPresenter.this.getViewState().K9();
            }
            NewConnectionFlowPresenter.this.getViewState().F9(oVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((v0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37493a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z10, boolean z11, boolean z12, zt.e eVar) {
            super(2, eVar);
            this.f37495c = z10;
            this.f37496d = z11;
            this.f37497e = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new w(this.f37495c, this.f37496d, this.f37497e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Integer num = NewConnectionFlowPresenter.this.f37268f;
            if (num != null) {
                boolean z10 = this.f37495c;
                boolean z11 = this.f37496d;
                NewConnectionFlowPresenter newConnectionFlowPresenter = NewConnectionFlowPresenter.this;
                boolean z12 = this.f37497e;
                int iIntValue = num.intValue();
                if (z10 && z11) {
                    newConnectionFlowPresenter.getViewState().Ie(iIntValue);
                } else if (!z12) {
                    newConnectionFlowPresenter.getViewState().kd();
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class w0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37498a;

        w0(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new w0(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37498a;
            if (i10 == 0) {
                ut.x.b(obj);
                NewConnectionFlowPresenter.this.getViewState().Sa(true);
                NewConnectionFlowPresenter.this.getViewState().H3();
                NewConnectionFlowPresenter.this.getViewState().T9();
                this.f37498a = 1;
                if (wu.s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            NewConnectionFlowPresenter.this.f37264b.U();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((w0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37501b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37503d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37503d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new x(this.f37503d, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r11.f37501b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r11.f37500a
                java.lang.Long r0 = (java.lang.Long) r0
                ut.x.b(r12)
                goto L5b
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                ut.x.b(r12)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r12)
                boolean r12 = r12.e()
                if (r12 == 0) goto L31
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                boolean r1 = r11.f37503d
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.L2(r12, r1)
            L31:
                boolean r12 = r11.f37503d
                if (r12 == 0) goto L5b
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r12)
                java.lang.Long r12 = r12.c()
                if (r12 == 0) goto L5b
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                long r4 = r12.longValue()
                ui.a r3 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.y2(r1)
                r11.f37500a = r12
                r11.f37501b = r2
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ui.a.g(r3, r4, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L5c
                return r0
            L5b:
                r8 = r11
            L5c:
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                ui.d r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.v2(r12)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r0)
                java.lang.String r0 = r0.g()
                java.lang.String r1 = ""
                if (r0 != 0) goto L71
                r0 = r1
            L71:
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r3 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r3 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r3)
                java.lang.String r3 = r3.d()
                if (r3 != 0) goto L7e
                goto L7f
            L7e:
                r1 = r3
            L7f:
                r12.o(r0, r1)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r12 = r12.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r12 = (com.server.auditor.ssh.client.contracts.connection.d) r12
                r12.Sa(r2)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r12 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r12 = r12.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r12 = (com.server.auditor.ssh.client.contracts.connection.d) r12
                com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog$b$k r0 = com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.b.k.f24516a
                r12.F9(r0)
                ut.m0 r12 = ut.m0.f82633a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class x0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37505b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37507d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37507d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new x0(this.f37507d, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r10.f37505b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r10.f37504a
                java.lang.Long r0 = (java.lang.Long) r0
                ut.x.b(r11)
                goto L5a
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                ut.x.b(r11)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r11)
                boolean r11 = r11.e()
                if (r11 == 0) goto L31
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                boolean r1 = r10.f37507d
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.L2(r11, r1)
            L31:
                boolean r11 = r10.f37507d
                if (r11 == 0) goto L5a
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r11)
                java.lang.Long r11 = r11.c()
                if (r11 == 0) goto L5a
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r1 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                long r4 = r11.longValue()
                ui.a r3 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.y2(r1)
                r10.f37504a = r11
                r10.f37505b = r2
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ui.a.i(r3, r4, r6, r7, r8, r9)
                if (r11 != r0) goto L5b
                return r0
            L5a:
                r7 = r10
            L5b:
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                ui.d r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.v2(r11)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter$b r0 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x2(r0)
                java.lang.String r0 = r0.g()
                if (r0 != 0) goto L6f
                java.lang.String r0 = ""
            L6f:
                r11.p(r0)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r11 = r11.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r11 = (com.server.auditor.ssh.client.contracts.connection.d) r11
                r11.Sa(r2)
                com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter r11 = com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.this
                moxy.MvpView r11 = r11.getViewState()
                com.server.auditor.ssh.client.contracts.connection.d r11 = (com.server.auditor.ssh.client.contracts.connection.d) r11
                com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog$b$k r0 = com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog.b.k.f24516a
                r11.F9(r0)
                ut.m0 r11 = ut.m0.f82633a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.connection.NewConnectionFlowPresenter.x0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((x0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37508a;

        y(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new y(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37508a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.getViewState().Sa(true);
            NewConnectionFlowPresenter.this.getViewState().F9(NewConnectionFlowDialog.b.k.f24516a);
            NewConnectionFlowPresenter.this.f37264b.r();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class y0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37510a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37513d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(List list, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37512c = list;
            this.f37513d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new y0(this.f37512c, this.f37513d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37510a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowDialog.b.p pVar = new NewConnectionFlowDialog.b.p(NewConnectionFlowPresenter.this.f37269u, this.f37512c, NewConnectionFlowPresenter.this.B, this.f37513d);
            NewConnectionFlowPresenter.this.getViewState().k7(pVar);
            NewConnectionFlowPresenter.this.getViewState().F9(pVar);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((y0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(List list, zt.e eVar) {
            super(2, eVar);
            this.f37516c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new z(this.f37516c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37514a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            NewConnectionFlowPresenter.this.f37271w.clear();
            NewConnectionFlowPresenter.this.f37271w.addAll(this.f37516c);
            NewConnectionFlowPresenter.this.getViewState().F9(new NewConnectionFlowDialog.b.m(NewConnectionFlowPresenter.this.f37269u, NewConnectionFlowPresenter.this.f37272x, NewConnectionFlowPresenter.this.f37271w));
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class z0 extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37517a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f37520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(String str, Long l10, boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f37519c = str;
            this.f37520d = l10;
            this.f37521e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return NewConnectionFlowPresenter.this.new z0(this.f37519c, this.f37520d, this.f37521e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37517a;
            if (i10 == 0) {
                ut.x.b(obj);
                NewConnectionFlowPresenter.this.f37269u = this.f37519c;
                NewConnectionFlowPresenter.this.A.m(this.f37520d);
                NewConnectionFlowPresenter.this.A.i(this.f37521e);
                ui.e eVar = NewConnectionFlowPresenter.this.f37266d;
                boolean z10 = this.f37521e;
                this.f37517a = 1;
                if (eVar.c(z10, this) == objF) {
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
            return ((z0) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public NewConnectionFlowPresenter() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f37263a = aVarN;
        ll.a aVarC1 = b2.f52944a.C1();
        il.q0 q0VarX = hg.f.p().X();
        ju.t.e(q0VarX, "getSshKeyDBRepository(...)");
        HostsDBAdapter hostsDBAdapterI = hg.f.p().i();
        ju.t.e(hostsDBAdapterI, "getHostDBAdapter(...)");
        IdentityDBAdapter identityDBAdapterN = hg.f.p().n();
        ju.t.e(identityDBAdapterN, "getIdentityDBAdapter(...)");
        MultiKeyDBAdapter multiKeyDBAdapterX = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW, "getMultiKeyApiAdapter(...)");
        il.y yVar = new il.y(multiKeyDBAdapterX, multiKeyApiAdapterW);
        SshCertificateDBAdapter sshCertificateDBAdapterQ = hg.f.p().Q();
        ju.t.e(sshCertificateDBAdapterQ, "getSshCertificateDBAdapter(...)");
        ug.c cVarQ = aVarN.Q();
        ju.t.e(cVarQ, "getKeyValueStorage(...)");
        ju.t.e(aVarN, "termiusStorage");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        ju.t.e(aVarY, "getInstance(...)");
        this.f37264b = new ui.d(aVarC1, q0VarX, hostsDBAdapterI, identityDBAdapterN, yVar, sshCertificateDBAdapterQ, cVarQ, aVarN, aVarY, this);
        il.t tVarO = hg.f.p().o();
        ju.t.e(tVarO, "getIdentityDBRepository(...)");
        MultiKeyDBAdapter multiKeyDBAdapterX2 = hg.f.p().x();
        ju.t.e(multiKeyDBAdapterX2, "getMultiKeyDBAdapter(...)");
        MultiKeyApiAdapter multiKeyApiAdapterW2 = hg.f.p().w();
        ju.t.e(multiKeyApiAdapterW2, "getMultiKeyApiAdapter(...)");
        il.y yVar2 = new il.y(multiKeyDBAdapterX2, multiKeyApiAdapterW2);
        ju.t.e(aVarN, "termiusStorage");
        this.f37265c = new ui.b(tVarO, yVar2, aVarN, this);
        il.q0 q0VarX2 = hg.f.p().X();
        ju.t.e(q0VarX2, "getSshKeyDBRepository(...)");
        this.f37266d = new ui.e(q0VarX2, this);
        il.r rVarJ = hg.f.p().j();
        ju.t.e(rVarJ, "getHostDBRepository(...)");
        zp.e eVarK = hg.f.p().k(hg.f.p().Y());
        ju.t.e(eVarK, "getHostManager(...)");
        this.f37267e = new ui.a(rVarJ, eVarK, null, 4, null);
        this.f37269u = "";
        this.f37270v = "no_credentials_sharing";
        this.f37271w = new ArrayList();
        this.f37272x = "";
        this.f37274z = TypeOfCurrentConnection.Unknown.INSTANCE;
        this.A = new b(null, false, false, null, null, false, null, null, false, false, null, 2047, null);
        this.B = aVarN.M().getBoolean("connection_flow_save_toggle_state", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(boolean z10) {
        hg.d dVarM = this.f37263a.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        SharedPreferences.Editor editorEdit = dVarM.edit();
        editorEdit.putBoolean("connection_flow_save_toggle_state", z10);
        editorEdit.apply();
        this.B = z10;
    }

    public final void A3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g1(null), 3, null);
    }

    public final void B3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h1(null), 3, null);
    }

    public final void C3(String str) {
        ju.t.f(str, "username");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i1(str, null), 3, null);
    }

    public final void D3(String str) {
        ju.t.f(str, "username");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j1(str, null), 3, null);
    }

    public final void E3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l1(null), 3, null);
    }

    @Override // ui.d.a
    public void F0(Long l10, String str, boolean z10, boolean z11, String str2) {
        ju.t.f(str, "hostTitle");
        ju.t.f(str2, "credentialsMode");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k1(str, z10, str2, l10, z11, null), 3, null);
    }

    public final void F3(byte[] bArr) {
        ju.t.f(bArr, "signature");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n1(bArr, null), 3, null);
    }

    @Override // ui.d.a
    public void G0(Long l10, String str, boolean z10) {
        ju.t.f(str, "hostTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new z0(str, l10, z10, null), 3, null);
    }

    @Override // ui.d.a
    public void G1(String str, int i10, TypeOfCurrentConnection typeOfCurrentConnection) {
        ju.t.f(str, "logs");
        ju.t.f(typeOfCurrentConnection, "typeOfCurrentConnection");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p0(typeOfCurrentConnection, str, this, null), 3, null);
    }

    public final void G3(int i10, int i11, String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o1(i10, i11, str, null), 3, null);
    }

    @Override // ui.d.a
    public void H(Long l10, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, String str6, boolean z12) {
        ju.t.f(str, "alias");
        ju.t.f(str2, Column.ADDRESS);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, str2, str4, str5, str6, l10, str3, z10, z11, z12, null), 3, null);
    }

    public final void H3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p1(null), 3, null);
    }

    @Override // ui.b.a
    public void J1(List list) {
        ju.t.f(list, "identities");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(list, null), 3, null);
    }

    public final void M2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void N2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void O2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void P2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // ui.d.a
    public void Q(List list, TypeOfCurrentConnection typeOfCurrentConnection, String str) {
        ju.t.f(list, "passkeysData");
        ju.t.f(typeOfCurrentConnection, "typeOfConnection");
        ju.t.f(str, "logs");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new v0(typeOfCurrentConnection, list, str, null), 3, null);
    }

    public final void Q2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // ui.d.a
    public void R1(List list, TypeOfCurrentConnection typeOfCurrentConnection, String str) {
        ju.t.f(list, "hardwarePasskeysData");
        ju.t.f(typeOfCurrentConnection, "typeOfConnection");
        ju.t.f(str, "logs");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q0(typeOfCurrentConnection, list, str, null), 3, null);
    }

    public final void R2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    public final void S2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    public final void T2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    public final void U2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(null), 3, null);
    }

    public final void V2(z.a aVar, boolean z10) {
        ju.t.f(aVar, "container");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(z10, aVar, null), 3, null);
    }

    public final void W2(String str) {
        ju.t.f(str, "password");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new u(str, null), 3, null);
    }

    public final void X2(boolean z10, boolean z11, boolean z12) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new w(z10, z12, z11, null), 3, null);
    }

    public final void Y2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new x(z10, null), 3, null);
    }

    @Override // ui.d.a
    public void Z1(String str, String str2, long j10, boolean z10) {
        ju.t.f(str, "sshKeyTitle");
        ju.t.f(str2, "sshKeyType");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(j10, str, str2, z10, null), 3, null);
    }

    public final void Z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new y(null), 3, null);
    }

    @Override // ui.d.a
    public void a2(String str, String str2, String str3) {
        ju.t.f(str, "host");
        ju.t.f(str2, "fingerprintType");
        ju.t.f(str3, "fingerprint");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(str, str2, str3, this, null), 3, null);
    }

    public final void a3(List list) {
        ju.t.f(list, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new z(list, null), 3, null);
    }

    public final void b3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a0(null), 3, null);
    }

    @Override // ui.d.a
    public void c1(Long l10, String str, String str2, String str3, Editable editable) {
        ju.t.f(str, "hostTitle");
        ju.t.f(str2, "snippetTitle");
        ju.t.f(str3, "snippetScript");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s0(str, l10, str2, str3, editable, null), 3, null);
    }

    public final void c3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b0(null), 3, null);
    }

    public final void d3(String str, String str2) {
        ju.t.f(str, "portNumberText");
        ju.t.f(str2, "commandText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c0(str, str2, null), 3, null);
    }

    public final void e3(String str, String str2) {
        ju.t.f(str, "portNumberText");
        ju.t.f(str2, "commandText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d0(str, str2, this, null), 3, null);
    }

    public final void f3(String str) {
        ju.t.f(str, "portNumberText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e0(str, null), 3, null);
    }

    @Override // ui.d.a
    public void g1(String str, WebAuthnAuth webAuthnAuth) {
        ju.t.f(str, "hostTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m1(str, webAuthnAuth, null), 3, null);
    }

    public final void g3(String str) {
        ju.t.f(str, "portNumberText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f0(str, this, null), 3, null);
    }

    @Override // ui.d.a
    public void h0(String str) {
        ju.t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, this, null), 3, null);
    }

    public final void h3(String str) {
        ju.t.f(str, "portNumberText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g0(str, null), 3, null);
    }

    @Override // ui.e.a
    public void i0(List list, boolean z10) {
        ju.t.f(list, "sshKeyList");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new y0(list, z10, null), 3, null);
    }

    @Override // ui.d.a
    public void i2(int i10, boolean z10, boolean z11, boolean z12) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c1(i10, z10, z11, z12, null), 3, null);
    }

    public final void i3(String str) {
        ju.t.f(str, "portNumberText");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h0(str, this, null), 3, null);
    }

    public final void j3(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i0(str, null), 3, null);
    }

    public final void l3(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j0(str, null), 3, null);
    }

    public final void m3(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k0(str, null), 3, null);
    }

    public final void n3(String str) {
        ju.t.f(str, SerializableEvent.VALUE_FIELD);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m0(str, null), 3, null);
    }

    @Override // ui.d.a
    public void o1(Long l10, String str, boolean z10) {
        ju.t.f(str, "hostTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l0(str, l10, z10, null), 3, null);
    }

    public final void o3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n0(null), 3, null);
    }

    @Override // ui.d.a
    public void onCanceled() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.f37264b.N();
        super.onDestroy();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void p3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o0(null), 3, null);
    }

    @Override // ui.d.a
    public void q0(String str) {
        ju.t.f(str, "hostTitle");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(str, null), 3, null);
    }

    public final void q3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r0(null), 3, null);
    }

    public final void r3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t0(null), 3, null);
    }

    public final void s3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new u0(null), 3, null);
    }

    public final void t3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new w0(null), 3, null);
    }

    public final void u3(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new x0(z10, null), 3, null);
    }

    public final void v3(lj.y yVar, boolean z10) {
        ju.t.f(yVar, "sshKey");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a1(z10, yVar, null), 3, null);
    }

    public final void w3() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b1(null), 3, null);
    }

    public final void x3(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d1(z10, null), 3, null);
    }

    @Override // ui.d.a
    public void y(String str, String str2, boolean z10, boolean z11) {
        ju.t.f(str, "hostTitle");
        ju.t.f(str2, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new v(str, str2, null), 3, null);
    }

    public final void y3(long j10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e1(j10, null), 3, null);
    }

    public final void z3(List list) {
        ju.t.f(list, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f1(list, null), 3, null);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f37289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f37292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f37293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f37294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f37295g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f37296h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f37297i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f37298j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f37299k;

        public b(Long l10, boolean z10, boolean z11, String str, String str2, boolean z12, String str3, Long l11, boolean z13, boolean z14, String str4) {
            this.f37289a = l10;
            this.f37290b = z10;
            this.f37291c = z11;
            this.f37292d = str;
            this.f37293e = str2;
            this.f37294f = z12;
            this.f37295g = str3;
            this.f37296h = l11;
            this.f37297i = z13;
            this.f37298j = z14;
            this.f37299k = str4;
        }

        public final boolean a() {
            return this.f37298j;
        }

        public final String b() {
            return this.f37299k;
        }

        public final Long c() {
            return this.f37289a;
        }

        public final String d() {
            return this.f37293e;
        }

        public final boolean e() {
            return this.f37297i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ju.t.b(this.f37289a, bVar.f37289a) && this.f37290b == bVar.f37290b && this.f37291c == bVar.f37291c && ju.t.b(this.f37292d, bVar.f37292d) && ju.t.b(this.f37293e, bVar.f37293e) && this.f37294f == bVar.f37294f && ju.t.b(this.f37295g, bVar.f37295g) && ju.t.b(this.f37296h, bVar.f37296h) && this.f37297i == bVar.f37297i && this.f37298j == bVar.f37298j && ju.t.b(this.f37299k, bVar.f37299k);
        }

        public final Long f() {
            return this.f37296h;
        }

        public final String g() {
            return this.f37292d;
        }

        public final String h() {
            return this.f37295g;
        }

        public int hashCode() {
            Long l10 = this.f37289a;
            int iHashCode = (((((l10 == null ? 0 : l10.hashCode()) * 31) + Boolean.hashCode(this.f37290b)) * 31) + Boolean.hashCode(this.f37291c)) * 31;
            String str = this.f37292d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f37293e;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f37294f)) * 31;
            String str3 = this.f37295g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l11 = this.f37296h;
            int iHashCode5 = (((((iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31) + Boolean.hashCode(this.f37297i)) * 31) + Boolean.hashCode(this.f37298j)) * 31;
            String str4 = this.f37299k;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void i(boolean z10) {
            this.f37298j = z10;
        }

        public final void j(String str) {
            this.f37299k = str;
        }

        public final void k(boolean z10) {
            this.f37291c = z10;
        }

        public final void l(boolean z10) {
            this.f37294f = z10;
        }

        public final void m(Long l10) {
            this.f37289a = l10;
        }

        public final void n(String str) {
            this.f37293e = str;
        }

        public final void o(boolean z10) {
            this.f37297i = z10;
        }

        public final void p(Long l10) {
            this.f37296h = l10;
        }

        public final void q(String str) {
            this.f37292d = str;
        }

        public final void r(String str) {
            this.f37295g = str;
        }

        public String toString() {
            return "PendingSaveBuffer(hostId=" + this.f37289a + ", isMosh=" + this.f37290b + ", hasSsh=" + this.f37291c + ", sshPort=" + this.f37292d + ", moshCommand=" + this.f37293e + ", hasTelnet=" + this.f37294f + ", telnetPort=" + this.f37295g + ", sshKeyId=" + this.f37296h + ", showSaveToHost=" + this.f37297i + ", canSaveIdentity=" + this.f37298j + ", connectionUuid=" + this.f37299k + ")";
        }

        public /* synthetic */ b(Long l10, boolean z10, boolean z11, String str, String str2, boolean z12, String str3, Long l11, boolean z13, boolean z14, String str4, int i10, ju.k kVar) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : l11, (i10 & 256) != 0 ? false : z13, (i10 & File.FLAG_O_TRUNC) != 0 ? false : z14, (i10 & File.FLAG_O_APPEND) != 0 ? null : str4);
        }
    }
}

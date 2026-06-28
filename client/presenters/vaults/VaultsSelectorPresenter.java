package com.server.auditor.ssh.client.presenters.vaults;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyIdSpecification;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dq.h0;
import dq.u;
import dq.y;
import dq.z;
import hg.b2;
import iu.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import og.s;
import tl.l2;
import tp.g0;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vt.v;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class VaultsSelectorPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.vaults.h> {
    private final h0 A;
    private final n B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qq.b f38505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f38507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VaultKeyIdSpecification f38508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f38509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0 f38510f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38511u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final s f38512v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final vl.g f38513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final gj.b f38514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final kp.c f38515y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final kp.e f38516z;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38518b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38520d;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38518b = obj;
            this.f38520d |= RtlSpacingHelper.UNDEFINED;
            return VaultsSelectorPresenter.this.G2(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38521a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38523c;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38521a = obj;
            this.f38523c |= RtlSpacingHelper.UNDEFINED;
            return VaultsSelectorPresenter.this.J2(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38524a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38526c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38524a = obj;
            this.f38526c |= RtlSpacingHelper.UNDEFINED;
            return VaultsSelectorPresenter.this.L2(this);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38527a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsSelectorPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38527a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            VaultKeyId vaultKeyIdA = com.server.auditor.ssh.client.ui.vaults.data.b.a(VaultsSelectorPresenter.this.f38508d);
            if (vaultKeyIdA == null) {
                return m0.f82633a;
            }
            if (!t.b(VaultsSelectorPresenter.this.f38505a.c(), "Copy")) {
                VaultsSelectorPresenter.this.getViewState().Ja(new qq.a(vaultKeyIdA, VaultsSelectorPresenter.this.f38505a.g(), VaultsSelectorPresenter.this.f38505a.c(), VaultsSelectorPresenter.this.f38505a.i(), VaultsSelectorPresenter.this.f38505a.j(), VaultsSelectorPresenter.this.f38505a.h(), VaultsSelectorPresenter.this.f38505a.e(), VaultsSelectorPresenter.this.f38505a.d()));
            } else if (!VaultsSelectorPresenter.this.f38506b) {
                VaultsSelectorPresenter.this.getViewState().Ja(new qq.a(vaultKeyIdA, VaultsSelectorPresenter.this.f38505a.g(), VaultsSelectorPresenter.this.f38505a.c(), VaultsSelectorPresenter.this.f38505a.i(), VaultsSelectorPresenter.this.f38505a.j(), VaultsSelectorPresenter.this.f38505a.h(), VaultsSelectorPresenter.this.f38505a.e(), VaultsSelectorPresenter.this.f38505a.d()));
                if (VaultsSelectorPresenter.this.f38505a.i()) {
                    VaultsSelectorPresenter.this.getViewState().Z2();
                } else {
                    VaultsSelectorPresenter.this.getViewState().r1();
                }
            } else if (com.server.auditor.ssh.client.ui.vaults.data.a.b(vaultKeyIdA)) {
                VaultsSelectorPresenter.this.getViewState().E3();
                VaultsSelectorPresenter.this.getViewState().Z2();
            } else {
                VaultsSelectorPresenter.this.getViewState().r1();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38530b;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsSelectorPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            Object objF = au.b.f();
            int i10 = this.f38530b;
            if (i10 == 0) {
                x.b(obj);
                VaultsSelectorPresenter.this.getViewState().a();
                VaultsSelectorPresenter.this.f38507c.clear();
                List list2 = VaultsSelectorPresenter.this.f38507c;
                VaultsSelectorPresenter vaultsSelectorPresenter = VaultsSelectorPresenter.this;
                this.f38529a = list2;
                this.f38530b = 1;
                Object objJ2 = vaultsSelectorPresenter.J2(this);
                if (objJ2 == objF) {
                    return objF;
                }
                list = list2;
                obj = objJ2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f38529a;
                x.b(obj);
            }
            list.addAll((Collection) obj);
            VaultsSelectorPresenter.this.getViewState().y7(VaultsSelectorPresenter.this.f38507c);
            VaultsSelectorPresenter.this.K2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38532a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return VaultsSelectorPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38532a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            VaultsSelectorPresenter.this.f38511u.o3(VaultsSelectorPresenter.this.F2());
            if (VaultsSelectorPresenter.this.O2()) {
                VaultsSelectorPresenter.this.getViewState().me();
            } else {
                VaultsSelectorPresenter.this.getViewState().t3();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f38535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VaultsSelectorPresenter f38536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z zVar, VaultsSelectorPresenter vaultsSelectorPresenter, zt.e eVar) {
            super(2, eVar);
            this.f38535b = zVar;
            this.f38536c = vaultsSelectorPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f38535b, this.f38536c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38534a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (t.b(this.f38535b.e(), y.b.f47965a)) {
                this.f38536c.getViewState().t4();
            } else {
                VaultKeyId vaultKeyIdG = this.f38535b.f().g();
                this.f38536c.f38508d = new VaultKeyIdSpecification.Specified(vaultKeyIdG);
                this.f38536c.K2();
                List<Object> list = this.f38536c.f38507c;
                ArrayList arrayList = new ArrayList(v.z(list, 10));
                for (Object objC : list) {
                    if (objC instanceof z) {
                        z zVar = (z) objC;
                        objC = z.c(zVar, null, null, t.b(zVar.e(), y.b.f47965a) ? false : t.b(zVar.f().g(), vaultKeyIdG), false, null, 27, null);
                    }
                    arrayList.add(objC);
                }
                List listG1 = v.g1(arrayList);
                if (this.f38536c.Q2()) {
                    u uVar = u.f47956b;
                    if (!listG1.contains(uVar)) {
                        listG1.add(uVar);
                    }
                } else {
                    kotlin.coroutines.jvm.internal.b.a(listG1.remove(u.f47956b));
                }
                this.f38536c.f38507c.clear();
                this.f38536c.f38507c.addAll(listG1);
                this.f38536c.getViewState().y7(this.f38536c.f38507c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f38542f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f38543u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f38545w;

        h(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38543u = obj;
            this.f38545w |= RtlSpacingHelper.UNDEFINED;
            return VaultsSelectorPresenter.this.U2(null, this);
        }
    }

    public VaultsSelectorPresenter(qq.b bVar, boolean z10) {
        t.f(bVar, "vaultSelectorFlowData");
        this.f38505a = bVar;
        this.f38506b = z10;
        this.f38507c = new ArrayList();
        this.f38508d = bVar.f();
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f38509e = aVarN;
        g0 g0VarY1 = b2.f52944a.y1();
        this.f38510f = g0VarY1;
        this.f38511u = com.server.auditor.ssh.client.utils.analytics.a.y();
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        s sVar = new s(dVarM);
        this.f38512v = sVar;
        vl.g gVarB = vl.g.f83702b.b();
        this.f38513w = gVarB;
        this.f38514x = new gj.b(gVarB);
        kp.c cVar = new kp.c(new in.c(g0VarY1));
        this.f38515y = cVar;
        t.e(aVarN, "termiusStorage");
        this.f38516z = new kp.e(aVarN, sVar, cVar);
        this.A = new h0(gVarB, null, null, 6, null);
        this.B = o.a(new iu.a() { // from class: gl.d
            @Override // iu.a
            public final Object a() {
                return Boolean.valueOf(VaultsSelectorPresenter.N2(this.f51396a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Avo.NewVaultSource F2() {
        return this.f38505a.g() ? Avo.NewVaultSource.EDIT_FORM : t.b(this.f38505a.c(), "Move") ? Avo.NewVaultSource.MOVE_IN_CONTEXT_MENU : Avo.NewVaultSource.COPY_IN_CONTEXT_MENU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G2(tl.l2 r5, zt.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.a
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$a r0 = (com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.a) r0
            int r1 = r0.f38520d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38520d = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$a r0 = new com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38518b
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38520d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f38517a
            tl.l2 r5 = (tl.l2) r5
            ut.x.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ut.x.b(r6)
            boolean r6 = sp.a.g(r5)
            if (r6 == 0) goto L54
            r0.f38517a = r5
            r0.f38520d = r3
            java.lang.Object r6 = r4.L2(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L54
            dq.y$a r5 = dq.y.a.f47964a
            return r5
        L54:
            boolean r6 = r4.M2()
            if (r6 == 0) goto L67
            com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId r5 = r5.g()
            boolean r5 = com.server.auditor.ssh.client.ui.vaults.data.a.c(r5)
            if (r5 == 0) goto L67
            dq.y$b r5 = dq.y.b.f47965a
            return r5
        L67:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.G2(tl.l2, zt.e):java.lang.Object");
    }

    private final boolean H2(l2 l2Var) {
        return !t.b(l2Var.f(), "Member");
    }

    private final boolean I2() {
        return this.f38512v.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(zt.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.b
            if (r0 == 0) goto L13
            r0 = r6
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$b r0 = (com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.b) r0
            int r1 = r0.f38523c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38523c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$b r0 = new com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38521a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38523c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ut.x.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ut.x.b(r6)
            goto L55
        L38:
            ut.x.b(r6)
            og.s r6 = r5.f38512v
            boolean r6 = r6.b()
            if (r6 == 0) goto L4a
            gj.b r6 = r5.f38514x
            java.util.List r6 = r6.b()
            goto L57
        L4a:
            gj.b r6 = r5.f38514x
            r0.f38523c = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L55
            goto L5f
        L55:
            java.util.List r6 = (java.util.List) r6
        L57:
            r0.f38523c = r3
            java.lang.Object r6 = r5.U2(r6, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.J2(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2() {
        getViewState().eb(!com.server.auditor.ssh.client.ui.vaults.data.b.b(this.f38508d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(zt.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.c
            if (r0 == 0) goto L13
            r0 = r5
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$c r0 = (com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.c) r0
            int r1 = r0.f38526c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38526c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$c r0 = new com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f38524a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f38526c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.x.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ut.x.b(r5)
            kp.c r5 = r4.f38515y
            r0.f38526c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            jp.a r5 = (jp.a) r5
            boolean r5 = jp.b.a(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.L2(zt.e):java.lang.Object");
    }

    private final boolean M2() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N2(VaultsSelectorPresenter vaultsSelectorPresenter) {
        return vaultsSelectorPresenter.f38512v.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O2() {
        return P2() && !I2();
    }

    private final boolean P2() {
        return this.f38512v.d() && this.f38509e.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q2() {
        return this.f38505a.h() && !t.b(this.f38505a.e(), com.server.auditor.ssh.client.ui.vaults.data.b.a(this.f38508d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:41:0x0117, B:44:0x011f], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b9 -> B:28:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d1 -> B:28:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010a -> B:38:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0114 -> B:40:0x0115). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U2(java.util.List r22, zt.e r23) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.vaults.VaultsSelectorPresenter.U2(java.util.List, zt.e):java.lang.Object");
    }

    public final void R2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void S2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void T2(z zVar) {
        t.f(zVar, "selectedVaultContainer");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(zVar, this, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }
}

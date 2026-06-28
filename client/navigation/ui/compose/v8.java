package com.server.auditor.ssh.client.navigation.ui.compose;

import androidx.compose.runtime.m;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.navigation.ui.compose.v8;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v8 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.p f33787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b f33788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f33789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f33790d;

        a(iu.p pVar, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar, iu.a aVar, androidx.compose.runtime.e2 e2Var) {
            this.f33787a = pVar;
            this.f33788b = bVar;
            this.f33789c = aVar;
            this.f33790d = e2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.p pVar, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar, iu.a aVar, androidx.compose.runtime.e2 e2Var) {
            b.C0568b c0568b = (b.C0568b) bVar;
            Object objA = c0568b.a();
            String strM = v8.c(e2Var).m();
            if (strM.length() == 0) {
                strM = c0568b.b();
            }
            pVar.invoke(objA, strM);
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1679351857, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.RenameConnectionDialog.<anonymous> (RenameConnectionDialog.kt:62)");
            }
            mVar.W(-1224400529);
            boolean zV = mVar.V(this.f33787a) | mVar.F(this.f33788b) | mVar.V(this.f33789c);
            final iu.p pVar = this.f33787a;
            final com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar = this.f33788b;
            final iu.a aVar = this.f33789c;
            final androidx.compose.runtime.e2 e2Var = this.f33790d;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.u8
                    @Override // iu.a
                    public final Object a() {
                        return v8.a.e(pVar, bVar, aVar, e2Var);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            co.p.j((iu.a) objD, null, false, o.f32962a.c(), mVar, 3072, 6);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f33791a;

        b(iu.a aVar) {
            this.f33791a = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(334493521, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.RenameConnectionDialog.<anonymous> (RenameConnectionDialog.kt:75)");
            }
            co.p.x(this.f33791a, null, false, null, null, null, null, null, null, o.f32962a.a(), mVar, 805306368, 510);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b f33792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f33793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f33794c;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f33796b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.e2 f33797c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var, zt.e eVar) {
                super(2, eVar);
                this.f33796b = oVar;
                this.f33797c = e2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f33796b, this.f33797c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f33795a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                androidx.compose.ui.focus.o.g(this.f33796b, 0, 1, null);
                androidx.compose.runtime.e2 e2Var = this.f33797c;
                v8.d(e2Var, j3.t0.h(v8.c(e2Var), null, e3.h3.b(0, v8.c(this.f33797c).m().length()), null, 5, null));
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        c(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar, androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var) {
            this.f33792a = bVar;
            this.f33793b = oVar;
            this.f33794c = e2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g(androidx.compose.runtime.e2 e2Var, a2.o oVar) {
            ju.t.f(oVar, "focusState");
            if (oVar.b()) {
                v8.d(e2Var, j3.t0.h(v8.c(e2Var), null, e3.h3.b(0, v8.c(e2Var).m().length()), null, 5, null));
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
            ju.t.f(t0Var, "newValue");
            v8.d(e2Var, t0Var);
            return ut.m0.f82633a;
        }

        public final void e(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-939705708, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.RenameConnectionDialog.<anonymous> (RenameConnectionDialog.kt:83)");
            }
            j3.t0 t0VarC = v8.c(this.f33794c);
            String strB = ((b.C0568b) this.f33792a).b();
            v1.m mVarA = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), this.f33793b);
            mVar.W(5004770);
            final androidx.compose.runtime.e2 e2Var = this.f33794c;
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.w8
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return v8.c.g(e2Var, (a2.o) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            v1.m mVarA2 = androidx.compose.ui.focus.e.a(mVarA, (iu.l) objD);
            mVar.W(5004770);
            final androidx.compose.runtime.e2 e2Var2 = this.f33794c;
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.x8
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return v8.c.h(e2Var2, (j3.t0) obj);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            bk.b6.c(t0VarC, (iu.l) objD2, mVarA2, false, false, null, null, strB, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, null, mVar, 48, 0, 0, 16777080);
            ut.m0 m0Var = ut.m0.f82633a;
            mVar.W(-1633490746);
            androidx.compose.ui.focus.o oVar = this.f33793b;
            androidx.compose.runtime.e2 e2Var3 = this.f33794c;
            Object objD3 = mVar.D();
            if (objD3 == aVar.a()) {
                objD3 = new a(oVar, e2Var3, null);
                mVar.t(objD3);
            }
            mVar.Q();
            androidx.compose.runtime.a1.e(m0Var, (iu.p) objD3, mVar, 6);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    public static final void b(final com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar, final iu.p pVar, final iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        androidx.compose.runtime.m mVar2;
        ju.t.f(bVar, "dialogState");
        ju.t.f(pVar, "onRename");
        ju.t.f(aVar, "onDismissRequest");
        androidx.compose.runtime.m mVarG = mVar.g(1356445314);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? mVarG.V(bVar) : mVarG.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(pVar) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && mVarG.h()) {
            mVarG.M();
            mVar2 = mVarG;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1356445314, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.RenameConnectionDialog (RenameConnectionDialog.kt:42)");
            }
            if (bVar instanceof b.C0568b) {
                mVarG.W(1849434622);
                Object objD = mVarG.D();
                m.a aVar2 = androidx.compose.runtime.m.f5359a;
                if (objD == aVar2.a()) {
                    objD = androidx.compose.runtime.f5.e(new j3.t0(((b.C0568b) bVar).b(), 0L, (e3.g3) null, 6, (ju.k) null), null, 2, null);
                    mVarG.t(objD);
                }
                androidx.compose.runtime.e2 e2Var = (androidx.compose.runtime.e2) objD;
                mVarG.Q();
                mVarG.W(1849434622);
                Object objD2 = mVarG.D();
                if (objD2 == aVar2.a()) {
                    objD2 = new androidx.compose.ui.focus.o();
                    mVarG.t(objD2);
                }
                mVarG.Q();
                mVar2 = mVarG;
                a1.j.b(aVar, q1.h.d(-1679351857, true, new a(pVar, bVar, aVar, e2Var), mVarG, 54), z.j1.f(v1.m.f83247a, z.m1.c(z.e1.f87495a, mVarG, 6)), q1.h.d(334493521, true, new b(aVar), mVarG, 54), null, o.f32962a.b(), q1.h.d(-939705708, true, new c(bVar, (androidx.compose.ui.focus.o) objD2, e2Var), mVarG, 54), null, 0L, 0L, 0L, 0L, 0.0f, new androidx.compose.ui.window.l(true, true, null, false, false, null, 36, null), mVar2, ((i11 >> 6) & 14) | 1772592, 3072, 8080);
            } else {
                mVar2 = mVarG;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVar2.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.t8
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return v8.e(bVar, pVar, aVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 c(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.b bVar, iu.p pVar, iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        b(bVar, pVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }
}

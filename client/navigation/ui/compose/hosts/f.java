package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.ui.node.c;
import bk.a;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.navigation.ui.compose.a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f31183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f31184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f31185c;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.f$a$a, reason: collision with other inner class name */
        static final class C0484a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f31186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f31187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f31188c;

            C0484a(List list, iu.a aVar, iu.l lVar) {
                this.f31186a = list;
                this.f31187b = aVar;
                this.f31188c = lVar;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1121705768, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ActionModeContextPopup.<anonymous>.<anonymous> (ActionModeContextActions.kt:70)");
                }
                float f10 = 10;
                f.i(androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(v1.m.f83247a, null, false, 3, null), 0.0f, q3.h.m(f10), 0.0f, q3.h.m(f10), 5, null), this.f31186a, this.f31187b, this.f31188c, mVar, 6, 0);
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

        a(List list, iu.a aVar, iu.l lVar) {
            this.f31183a = list;
            this.f31184b = aVar;
            this.f31185c = lVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(217227091, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ActionModeContextPopup.<anonymous> (ActionModeContextActions.kt:64)");
            }
            a1.je.c(androidx.compose.foundation.layout.i0.u(v1.m.f83247a, q3.h.m(220)), g0.g.c(q3.h.m(20)), qk.a.f74718a.a(mVar, 6).i(), 0L, 0.0f, q3.h.m(3), null, q1.h.d(-1121705768, true, new C0484a(this.f31183a, this.f31184b, this.f31185c), mVar, 54), mVar, 12779526, 88);
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

    public static final void f(final a.b bVar, iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        final iu.a aVar2;
        ju.t.f(bVar, "state");
        ju.t.f(aVar, "onDismissContextActionsMenu");
        ju.t.f(lVar, "onActionItemClick");
        androidx.compose.runtime.m mVarG = mVar.g(-1707468687);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && mVarG.h()) {
            mVarG.M();
            aVar2 = aVar;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1707468687, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ActionModeContextActions (ActionModeContextActions.kt:32)");
            }
            q3.d dVar = (q3.d) mVarG.n(androidx.compose.ui.platform.s1.g());
            long jF = q3.n.f((((long) ((int) dVar.K1(q3.h.m(0)))) << 32) | (((long) ((int) dVar.K1(q3.h.m(45)))) & 4294967295L));
            List listA = bVar.a();
            mVarG.W(5004770);
            boolean z10 = (i11 & 896) == 256;
            Object objD = mVarG.D();
            if (z10 || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.a
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return f.g(lVar, ((Integer) obj).intValue());
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            aVar2 = aVar;
            l(jF, listA, aVar2, (iu.l) objD, mVarG, (i11 << 3) & 896, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.b
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return f.h(bVar, aVar2, lVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(iu.l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h(a.b bVar, iu.a aVar, iu.l lVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        f(bVar, aVar, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    public static final void i(v1.m mVar, final List list, final iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar2, final int i10, final int i11) {
        v1.m mVar3;
        int i12;
        final v1.m mVar4;
        v1.m mVar5;
        ju.t.f(list, "actions");
        ju.t.f(aVar, "onDismissRequest");
        ju.t.f(lVar, "onActionClick");
        androidx.compose.runtime.m mVarG = mVar2.g(40634919);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            mVar3 = mVar;
        } else if ((i10 & 6) == 0) {
            mVar3 = mVar;
            i12 = (mVarG.V(mVar3) ? 4 : 2) | i10;
        } else {
            mVar3 = mVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= mVarG.F(list) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= LibTermiusKeygen.KEY_SIZE_384;
        } else if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i12 |= mVarG.F(aVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= mVarG.F(lVar) ? 2048 : File.FLAG_O_APPEND;
        }
        int i14 = i12;
        if ((i14 & 1171) == 1170 && mVarG.h()) {
            mVarG.M();
            mVar4 = mVar3;
        } else {
            v1.m mVar6 = i13 != 0 ? v1.m.f83247a : mVar3;
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(40634919, i14, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ActionModeContextMenuContent (ActionModeContextActions.kt:88)");
            }
            s2.e0 e0VarA = z.m.a(z.e.f87467a.o(q3.h.m(10)), v1.e.f83199a.k(), mVarG, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVarG, 0));
            androidx.compose.runtime.i0 i0VarR = mVarG.r();
            v1.m mVarE = v1.k.e(mVarG, mVar6);
            c.a aVar2 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar2.a();
            if (mVarG.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVarG.I();
            if (mVarG.e()) {
                mVarG.u(aVarA);
            } else {
                mVarG.s();
            }
            androidx.compose.runtime.m mVarB = androidx.compose.runtime.q5.b(mVarG);
            androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar2.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar2.e());
            iu.p pVarB = aVar2.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar2.d());
            z.q qVar = z.q.f87592a;
            mVarG.W(-256217902);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.server.auditor.ssh.client.navigation.ui.compose.a aVar3 = (com.server.auditor.ssh.client.navigation.ui.compose.a) it.next();
                if (aVar3 instanceof a.b) {
                    mVarG.W(15010848);
                    a.b bVar = (a.b) aVar3;
                    v1.m mVar7 = mVar6;
                    String strC = bVar.c();
                    Integer numA = bVar.a();
                    mVarG.W(-1746271574);
                    boolean zV = ((i14 & 7168) == 2048) | mVarG.V(aVar3) | ((i14 & 896) == 256);
                    Object objD = mVarG.D();
                    if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.d
                            @Override // iu.a
                            public final Object a() {
                                return f.j(lVar, aVar3, aVar);
                            }
                        };
                        mVarG.t(objD);
                    }
                    mVarG.Q();
                    mVar5 = mVar7;
                    bk.h1.b(strC, numA, (iu.a) objD, mVarG, 0, 0);
                    mVarG.Q();
                } else {
                    mVar5 = mVar6;
                    if (!(aVar3 instanceof a.C0462a)) {
                        mVarG.W(1247407842);
                        mVarG.Q();
                        throw new ut.s();
                    }
                    mVarG.W(15401169);
                    bk.k.c(mVarG, 0);
                    mVarG.Q();
                }
                mVar6 = mVar5;
            }
            v1.m mVar8 = mVar6;
            mVarG.Q();
            mVarG.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
            mVar4 = mVar8;
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.e
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return f.k(mVar4, list, aVar, lVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 j(iu.l lVar, com.server.auditor.ssh.client.navigation.ui.compose.a aVar, iu.a aVar2) {
        lVar.invoke(Integer.valueOf(((a.b) aVar).b()));
        aVar2.a();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 k(v1.m mVar, List list, iu.a aVar, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        i(mVar, list, aVar, lVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void l(long j10, final List list, final iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar, final int i10, final int i11) {
        long j11;
        int i12;
        long jF;
        ju.t.f(list, "actions");
        ju.t.f(aVar, "onDismissRequest");
        ju.t.f(lVar, "onActionClick");
        androidx.compose.runtime.m mVarG = mVar.g(512746134);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            j11 = j10;
        } else if ((i10 & 6) == 0) {
            j11 = j10;
            i12 = (mVarG.d(j11) ? 4 : 2) | i10;
        } else {
            j11 = j10;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= mVarG.F(list) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= LibTermiusKeygen.KEY_SIZE_384;
        } else if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i12 |= mVarG.F(aVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= mVarG.F(lVar) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i12 & 1171) == 1170 && mVarG.h()) {
            mVarG.M();
            jF = j11;
        } else {
            if (i13 != 0) {
                long j12 = 0;
                jF = q3.n.f((j12 & 4294967295L) | (j12 << 32));
            } else {
                jF = j11;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(512746134, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.ActionModeContextPopup (ActionModeContextActions.kt:53)");
            }
            androidx.compose.ui.window.c.c(v1.e.f83199a.n(), jF, aVar, new androidx.compose.ui.window.u(true, true, true, false, 8, (ju.k) null), q1.h.d(217227091, true, new a(list, aVar, lVar), mVarG, 54), mVarG, ((i12 << 3) & 112) | 27654 | (i12 & 896), 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            final long j13 = jF;
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.c
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return f.m(j13, list, aVar, lVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m(long j10, List list, iu.a aVar, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        l(j10, list, aVar, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

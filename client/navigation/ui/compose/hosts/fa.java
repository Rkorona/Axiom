package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.fa;
import java.util.Iterator;
import java.util.List;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fa {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u6 f31223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.l f31224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f31225c;

        a(u6 u6Var, iu.l lVar, iu.a aVar) {
            this.f31223a = u6Var;
            this.f31224b = lVar;
            this.f31225c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, u6 u6Var, iu.a aVar) {
            lVar.invoke(u6Var.a());
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(eVar, "$this$item");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1583993634, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HostsBreadcrumbsSelector.kt:115)");
            }
            String strB = this.f31223a.b();
            mVar.W(-1746271574);
            boolean zV = mVar.V(this.f31224b) | mVar.V(this.f31223a) | mVar.V(this.f31225c);
            final iu.l lVar = this.f31224b;
            final u6 u6Var = this.f31223a;
            final iu.a aVar = this.f31225c;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ea
                    @Override // iu.a
                    public final Object a() {
                        return fa.a.e(lVar, u6Var, aVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            bk.m.b(false, R.drawable.ic_group, strB, (iu.a) objD, mVar, 54);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            d((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f31226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f31227b;

        b(iu.l lVar, iu.a aVar) {
            this.f31226a = lVar;
            this.f31227b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, iu.a aVar) {
            lVar.invoke(-1L);
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(eVar, "$this$item");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-302414381, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsContent.<anonymous>.<anonymous>.<anonymous> (HostsBreadcrumbsSelector.kt:128)");
            }
            g2.b bVarC = z2.d.c(R.drawable.ic_nav_hosts, mVar, 6);
            String strB = z2.h.b(R.string.all_hosts, mVar, 6);
            mVar.W(-1633490746);
            boolean zV = mVar.V(this.f31226a) | mVar.V(this.f31227b);
            final iu.l lVar = this.f31226a;
            final iu.a aVar = this.f31227b;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ga
                    @Override // iu.a
                    public final Object a() {
                        return fa.b.e(lVar, aVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            bk.k.e(bVarC, null, strB, (iu.a) objD, mVar, 0, 2);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            d((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f31228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f31229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f31230c;

        static final class a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f31231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f31232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.l f31233c;

            a(List list, iu.a aVar, iu.l lVar) {
                this.f31231a = list;
                this.f31232b = aVar;
                this.f31233c = lVar;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-628895130, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsPopup.<anonymous>.<anonymous> (HostsBreadcrumbsSelector.kt:90)");
                }
                float f10 = 10;
                fa.f(androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(v1.m.f83247a, null, false, 3, null), 0.0f, q3.h.m(f10), 0.0f, q3.h.m(f10), 5, null), this.f31231a, this.f31232b, this.f31233c, mVar, 6, 0);
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

        c(List list, iu.a aVar, iu.l lVar) {
            this.f31228a = list;
            this.f31229b = aVar;
            this.f31230c = lVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-2076433525, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsPopup.<anonymous> (HostsBreadcrumbsSelector.kt:84)");
            }
            a1.je.c(androidx.compose.foundation.layout.i0.u(v1.m.f83247a, q3.h.m(220)), g0.g.c(q3.h.m(20)), qk.a.f74718a.a(mVar, 6).i(), 0L, 0.0f, q3.h.m(3), null, q1.h.d(-628895130, true, new a(this.f31228a, this.f31229b, this.f31230c), mVar, 54), mVar, 12779526, 88);
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

    public static final void f(v1.m mVar, final List list, final iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar2, final int i10, final int i11) {
        v1.m mVar3;
        int i12;
        androidx.compose.runtime.m mVar4;
        final v1.m mVar5;
        ju.t.f(list, "groupsStack");
        ju.t.f(aVar, "onDismissRequest");
        ju.t.f(lVar, "onClickItem");
        androidx.compose.runtime.m mVarG = mVar2.g(-2083495042);
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
        if ((i12 & 1171) == 1170 && mVarG.h()) {
            mVarG.M();
            mVar4 = mVarG;
            mVar5 = mVar3;
        } else {
            v1.m mVar6 = i13 != 0 ? v1.m.f83247a : mVar3;
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-2083495042, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsContent (HostsBreadcrumbsSelector.kt:108)");
            }
            e.f fVarO = z.e.f87467a.o(q3.h.m(10));
            mVarG.W(-1746271574);
            boolean zF = mVarG.F(list) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object objD = mVarG.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ca
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return fa.g(list, lVar, aVar, (b0.k0) obj);
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            mVar4 = mVarG;
            b0.d.c(mVar6, null, null, false, fVarO, null, null, false, null, (iu.l) objD, mVar4, (i12 & 14) | 24576, 494);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
            mVar5 = mVar6;
        }
        androidx.compose.runtime.z3 z3VarJ = mVar4.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.da
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return fa.h(mVar5, list, aVar, lVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(List list, iu.l lVar, iu.a aVar, b0.k0 k0Var) {
        ju.t.f(k0Var, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0.k0.b(k0Var, null, null, q1.h.b(-1583993634, true, new a((u6) it.next(), lVar, aVar)), 3, null);
        }
        b0.k0.b(k0Var, null, null, q1.h.b(-302414381, true, new b(lVar, aVar)), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h(v1.m mVar, List list, iu.a aVar, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        f(mVar, list, aVar, lVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void i(long j10, final boolean z10, final List list, final iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar, final int i10, final int i11) {
        long jF;
        int i12;
        ju.t.f(list, "groupsStack");
        ju.t.f(aVar, "onDismissRequest");
        ju.t.f(lVar, "onClickItem");
        androidx.compose.runtime.m mVarG = mVar.g(-156483864);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            jF = j10;
        } else if ((i10 & 6) == 0) {
            jF = j10;
            i12 = (mVarG.d(jF) ? 4 : 2) | i10;
        } else {
            jF = j10;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= mVarG.a(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= LibTermiusKeygen.KEY_SIZE_384;
        } else if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i12 |= mVarG.F(list) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= mVarG.F(aVar) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= mVarG.F(lVar) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && mVarG.h()) {
            mVarG.M();
        } else {
            if (i13 != 0) {
                long j11 = 0;
                jF = q3.n.f((j11 & 4294967295L) | (j11 << 32));
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-156483864, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsPopup (HostsBreadcrumbsSelector.kt:69)");
            }
            androidx.compose.ui.window.c.c(z10 ? v1.e.f83199a.m() : v1.e.f83199a.o(), jF, aVar, new androidx.compose.ui.window.u(true, true, true, false, 8, (ju.k) null), q1.h.d(-2076433525, true, new c(list, aVar, lVar), mVarG, 54), mVarG, ((i12 << 3) & 112) | 27648 | ((i12 >> 3) & 896), 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            final long j12 = jF;
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ba
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return fa.j(j12, z10, list, aVar, lVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 j(long j10, boolean z10, List list, iu.a aVar, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        i(j10, z10, list, aVar, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void k(boolean z10, final List list, iu.a aVar, final iu.l lVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        boolean z11;
        iu.a aVar2;
        ju.t.f(list, "groupItems");
        ju.t.f(aVar, "onDismissGroupBreadcrumb");
        ju.t.f(lVar, "onUpdateList");
        androidx.compose.runtime.m mVarG = mVar.g(548279589);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(list) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= mVarG.F(lVar) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i11 & 1171) == 1170 && mVarG.h()) {
            mVarG.M();
            z11 = z10;
            aVar2 = aVar;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(548279589, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsBreadcrumbsSelector (HostsBreadcrumbsSelector.kt:38)");
            }
            q3.d dVar = (q3.d) mVarG.n(androidx.compose.ui.platform.s1.g());
            long jF = z10 ? q3.n.f((((long) ((int) dVar.K1(q3.h.m(0)))) << 32) | (4294967295L & ((long) ((int) dVar.K1(q3.h.m(40)))))) : q3.n.f((((long) (-((int) dVar.K1(q3.h.m(10))))) << 32) | (4294967295L & ((long) ((int) dVar.K1(q3.h.m(40))))));
            List listL = l(androidx.compose.runtime.y4.p(vt.v.g0(list, 1), mVarG, 0));
            mVarG.W(5004770);
            boolean z12 = (i11 & 7168) == 2048;
            Object objD = mVarG.D();
            if (z12 || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.z9
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return fa.m(lVar, (Long) obj);
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            z11 = z10;
            aVar2 = aVar;
            i(jF, z11, listL, aVar2, (iu.l) objD, mVarG, (i11 << 3) & 7280, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            final boolean z13 = z11;
            final iu.a aVar3 = aVar2;
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.aa
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return fa.n(z13, list, aVar3, lVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List l(androidx.compose.runtime.l5 l5Var) {
        return (List) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m(iu.l lVar, Long l10) {
        lVar.invoke(l10);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 n(boolean z10, List list, iu.a aVar, iu.l lVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        k(z10, list, aVar, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }
}

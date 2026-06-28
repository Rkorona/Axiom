package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.lf;
import a1.wc;
import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.j9;
import java.util.List;
import v1.e;
import v1.m;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j9 {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.m f32521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f32522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f32523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.a f32524d;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.j9$a$a, reason: collision with other inner class name */
        static final class C0496a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p9.a f32525a;

            C0496a(p9.a aVar) {
                this.f32525a = aVar;
            }

            public final void b(b0.e eVar, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(eVar, "$this$item");
                if ((i10 & 17) == 16 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-470668775, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SftpDeleteConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SftpDeleteConfirmationBottomSheet.kt:78)");
                }
                String strB = this.f32525a.b();
                ju.t.e(strB, "getFileName(...)");
                qk.a aVar = qk.a.f74718a;
                lf.j(strB, androidx.compose.foundation.layout.c0.p(v1.m.f83247a, 0.0f, q3.h.m(10), 1, null), aVar.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.b(mVar, 6).b(), mVar, 48, 0, 131064);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((b0.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        a(v1.m mVar, List list, iu.a aVar, iu.a aVar2) {
            this.f32521a = mVar;
            this.f32522b = list;
            this.f32523c = aVar;
            this.f32524d = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(List list, b0.k0 k0Var) {
            ju.t.f(k0Var, "$this$LazyRow");
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    vt.v.y();
                }
                b0.k0.b(k0Var, null, null, q1.h.b(-470668775, true, new C0496a((p9.a) obj)), 3, null);
                if (i10 < vt.v.q(list)) {
                    b0.k0.b(k0Var, null, null, q.f33016a.a(), 3, null);
                }
                i10 = i11;
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 i(iu.a aVar) {
            aVar.a();
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(iu.a aVar) {
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void g(z.p pVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(pVar, "$this$ModalBottomSheet");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-227753074, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.SftpDeleteConfirmationBottomSheet.<anonymous> (SftpDeleteConfirmationBottomSheet.kt:57)");
            }
            e.f fVarO = z.e.f87467a.o(q3.h.m(0));
            m.a aVar = v1.m.f83247a;
            float f10 = 20;
            v1.m mVarP = androidx.compose.foundation.layout.c0.p(androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(aVar, null, false, 3, null), 0.0f, 0.0f, 0.0f, q3.h.m(f10), 7, null), q3.h.m(25), 0.0f, 2, null);
            v1.m mVar2 = this.f32521a;
            final List list = this.f32522b;
            final iu.a aVar2 = this.f32523c;
            final iu.a aVar3 = this.f32524d;
            e.a aVar4 = v1.e.f83199a;
            s2.e0 e0VarA = z.m.a(fVarO, aVar4.k(), mVar, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarP);
            c.a aVar5 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar5.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar5.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar5.e());
            iu.p pVarB = aVar5.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar5.d());
            z.q qVar = z.q.f87592a;
            String strB = z2.h.b(R.string.sftp_tab_confirm_delete_dialog_title, mVar, 6);
            qk.a aVar6 = qk.a.f74718a;
            float f11 = 10;
            lf.j(strB, androidx.compose.foundation.layout.c0.p(aVar, 0.0f, q3.h.m(f11), 1, null), aVar6.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.b(mVar, 6).m(), mVar, 48, 0, 131064);
            v1.m mVarH = androidx.compose.foundation.layout.i0.h(androidx.compose.foundation.layout.i0.y(mVar2, null, false, 3, null), 0.0f, 1, null);
            mVar.W(5004770);
            boolean zF = mVar.F(list);
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.g9
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return j9.a.h(list, (b0.k0) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            b0.d.e(mVarH, null, null, false, null, null, null, false, null, (iu.l) objD, mVar, 0, 510);
            float f12 = 15;
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f12)), mVar, 6);
            v1.m mVarD = androidx.compose.foundation.b.d(z1.g.a(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), g0.g.d(q3.h.m(f12), q3.h.m(f12), q3.h.m(f12), q3.h.m(f12))), aVar6.a(mVar, 6).i(), null, 2, null);
            mVar.W(5004770);
            boolean zV = mVar.V(aVar2);
            Object objD2 = mVar.D();
            if (zV || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.h9
                    @Override // iu.a
                    public final Object a() {
                        return j9.a.i(aVar2);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            v1.m mVarN = androidx.compose.foundation.layout.c0.n(androidx.compose.foundation.e.j(mVarD, false, null, null, null, (iu.a) objD2, 15, null), q3.h.m(f12));
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(aVar4.o(), false);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR2 = mVar.r();
            v1.m mVarE2 = v1.k.e(mVar, mVarN);
            iu.a aVarA2 = aVar5.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA2);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB2 = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB2, e0VarI, aVar5.c());
            androidx.compose.runtime.q5.e(mVarB2, i0VarR2, aVar5.e());
            iu.p pVarB2 = aVar5.b();
            if (mVarB2.e() || !ju.t.b(mVarB2.D(), Integer.valueOf(iHashCode2))) {
                mVarB2.t(Integer.valueOf(iHashCode2));
                mVarB2.m(Integer.valueOf(iHashCode2), pVarB2);
            }
            androidx.compose.runtime.q5.e(mVarB2, mVarE2, aVar5.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            lf.j(z2.h.b(R.string.sftp_tab_confirm_delete_action, mVar, 6), null, aVar6.a(mVar, 6).s(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.b(mVar, 6).k(), mVar, 0, 0, 131066);
            mVar.w();
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f11)), mVar, 6);
            v1.m mVarD2 = androidx.compose.foundation.b.d(z1.g.a(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), g0.g.d(q3.h.m(f12), q3.h.m(f12), q3.h.m(f12), q3.h.m(f12))), aVar6.a(mVar, 6).i(), null, 2, null);
            mVar.W(5004770);
            boolean zV2 = mVar.V(aVar3);
            Object objD3 = mVar.D();
            if (zV2 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.i9
                    @Override // iu.a
                    public final Object a() {
                        return j9.a.k(aVar3);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            v1.m mVarN2 = androidx.compose.foundation.layout.c0.n(androidx.compose.foundation.e.j(mVarD2, false, null, null, null, (iu.a) objD3, 15, null), q3.h.m(f12));
            s2.e0 e0VarI2 = androidx.compose.foundation.layout.i.i(aVar4.o(), false);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR3 = mVar.r();
            v1.m mVarE3 = v1.k.e(mVar, mVarN2);
            iu.a aVarA3 = aVar5.a();
            if (mVar.i() == null) {
                androidx.compose.runtime.h.d();
            }
            mVar.I();
            if (mVar.e()) {
                mVar.u(aVarA3);
            } else {
                mVar.s();
            }
            androidx.compose.runtime.m mVarB3 = androidx.compose.runtime.q5.b(mVar);
            androidx.compose.runtime.q5.e(mVarB3, e0VarI2, aVar5.c());
            androidx.compose.runtime.q5.e(mVarB3, i0VarR3, aVar5.e());
            iu.p pVarB3 = aVar5.b();
            if (mVarB3.e() || !ju.t.b(mVarB3.D(), Integer.valueOf(iHashCode3))) {
                mVarB3.t(Integer.valueOf(iHashCode3));
                mVarB3.m(Integer.valueOf(iHashCode3), pVarB3);
            }
            androidx.compose.runtime.q5.e(mVarB3, mVarE3, aVar5.d());
            lf.j(z2.h.b(R.string.sftp_tab_cancel_delete_action, mVar, 6), null, aVar6.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.b(mVar, 6).k(), mVar, 0, 0, 131066);
            mVar.w();
            z.y0.a(androidx.compose.foundation.layout.i0.i(aVar, q3.h.m(f10)), mVar, 6);
            mVar.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            g((z.p) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(a1.wc r29, final java.util.List r30, final iu.a r31, final iu.a r32, v1.m r33, androidx.compose.runtime.m r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.j9.c(a1.wc, java.util.List, iu.a, iu.a, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 d(iu.a aVar) {
        aVar.a();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(wc wcVar, List list, iu.a aVar, iu.a aVar2, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        c(wcVar, list, aVar, aVar2, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

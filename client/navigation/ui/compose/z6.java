package com.server.auditor.ssh.client.navigation.ui.compose;

import a1.je;
import a1.lf;
import androidx.compose.ui.node.c;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.z6;
import v1.e;
import v1.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z6 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f35070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f35071b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.z6$a$a, reason: collision with other inner class name */
        static final class C0569a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.l f35072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f35073b;

            C0569a(iu.l lVar, iu.a aVar) {
                this.f35072a = lVar;
                this.f35073b = aVar;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(195878868, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantsPopup.<anonymous>.<anonymous> (NewConnectionVariantsPopup.kt:61)");
                }
                z6.l(this.f35072a, this.f35073b, null, mVar, 0, 4);
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

        a(iu.l lVar, iu.a aVar) {
            this.f35070a = lVar;
            this.f35071b = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-509476743, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantsPopup.<anonymous> (NewConnectionVariantsPopup.kt:54)");
            }
            je.c(androidx.compose.foundation.layout.i0.u(v1.m.f83247a, q3.h.m(220)), g0.g.c(q3.h.m(20)), qk.a.f74718a.a(mVar, 6).i(), 0L, 0.0f, q3.h.m(3), null, q1.h.d(195878868, true, new C0569a(this.f35070a, this.f35071b), mVar, 54), mVar, 12779526, 88);
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

    static final class b implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f35074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f35075b;

        b(iu.l lVar, iu.a aVar) {
            this.f35074a = lVar;
            this.f35075b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, iu.a aVar) {
            lVar.invoke("terminal");
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
                androidx.compose.runtime.w.b0(-1944596005, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantsPopupContent.<anonymous>.<anonymous>.<anonymous> (NewConnectionVariantsPopup.kt:81)");
            }
            String strB = z2.h.b(R.string.new_connection_variant_terminal, mVar, 6);
            h2.d dVarB = z2.i.b(h2.d.f52365k, R.drawable.ic_connection, mVar, 54);
            mVar.W(-1633490746);
            boolean zV = mVar.V(this.f35074a) | mVar.V(this.f35075b);
            final iu.l lVar = this.f35074a;
            final iu.a aVar = this.f35075b;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.a7
                    @Override // iu.a
                    public final Object a() {
                        return z6.b.e(lVar, aVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            z6.i(strB, dVarB, (iu.a) objD, mVar, 0);
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

    static final class c implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f35076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f35077b;

        c(iu.l lVar, iu.a aVar) {
            this.f35076a = lVar;
            this.f35077b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, iu.a aVar) {
            lVar.invoke("sftp");
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
                androidx.compose.runtime.w.b0(1826135556, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantsPopupContent.<anonymous>.<anonymous>.<anonymous> (NewConnectionVariantsPopup.kt:92)");
            }
            String strB = z2.h.b(R.string.new_connection_variant_sftp, mVar, 6);
            h2.d dVarB = z2.i.b(h2.d.f52365k, R.drawable.ic_sftp_file_folder, mVar, 54);
            mVar.W(-1633490746);
            boolean zV = mVar.V(this.f35076a) | mVar.V(this.f35077b);
            final iu.l lVar = this.f35076a;
            final iu.a aVar = this.f35077b;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.b7
                    @Override // iu.a
                    public final Object a() {
                        return z6.c.e(lVar, aVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            z6.i(strB, dVarB, (iu.a) objD, mVar, 0);
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

    static final class d implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f35078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f35079b;

        d(iu.l lVar, iu.a aVar) {
            this.f35078a = lVar;
            this.f35079b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, iu.a aVar) {
            lVar.invoke("serial");
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
                androidx.compose.runtime.w.b0(-1174412893, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantsPopupContent.<anonymous>.<anonymous>.<anonymous> (NewConnectionVariantsPopup.kt:103)");
            }
            String strB = z2.h.b(R.string.new_connection_variant_serial, mVar, 6);
            h2.d dVarB = z2.i.b(h2.d.f52365k, R.drawable.ic_serial_connect, mVar, 54);
            mVar.W(-1633490746);
            boolean zV = mVar.V(this.f35078a) | mVar.V(this.f35079b);
            final iu.l lVar = this.f35078a;
            final iu.a aVar = this.f35079b;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.c7
                    @Override // iu.a
                    public final Object a() {
                        return z6.d.e(lVar, aVar);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            z6.i(strB, dVarB, (iu.a) objD, mVar, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, final h2.d dVar, final iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        androidx.compose.runtime.m mVar2;
        final String str2 = str;
        androidx.compose.runtime.m mVarG = mVar.g(2010388013);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.V(str2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.V(dVar) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && mVarG.h()) {
            mVarG.M();
            mVar2 = mVarG;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(2010388013, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.NewConnectionVariantPopupOptionItem (NewConnectionVariantsPopup.kt:120)");
            }
            e.c cVarI = v1.e.f83199a.i();
            m.a aVar2 = v1.m.f83247a;
            float f10 = 10;
            v1.m mVarO = androidx.compose.foundation.layout.c0.o(androidx.compose.foundation.layout.i0.h(androidx.compose.foundation.e.j(aVar2, false, null, null, null, aVar, 15, null), 0.0f, 1, null), q3.h.m(20), q3.h.m(f10));
            s2.e0 e0VarB = z.t0.b(z.e.f87467a.g(), cVarI, mVarG, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVarG, 0));
            androidx.compose.runtime.i0 i0VarR = mVarG.r();
            v1.m mVarE = v1.k.e(mVarG, mVarO);
            c.a aVar3 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar3.a();
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
            androidx.compose.runtime.q5.e(mVarB, e0VarB, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar3.e());
            iu.p pVarB = aVar3.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar3.d());
            z.x0 x0Var = z.x0.f87621a;
            qk.a aVar4 = qk.a.f74718a;
            a1.z4.e(dVar, str2, androidx.compose.foundation.layout.i0.p(aVar2, q3.h.m(16)), aVar4.a(mVarG, 6).r(), mVarG, ((i12 >> 3) & 14) | LibTermiusKeygen.KEY_SIZE_384 | ((i12 << 3) & 112), 0);
            z.y0.a(androidx.compose.foundation.layout.i0.u(aVar2, q3.h.m(f10)), mVarG, 6);
            str2 = str;
            lf.j(str2, androidx.compose.foundation.layout.i0.h(aVar2, 0.0f, 1, null), aVar4.a(mVarG, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVarG, 6).a(), mVarG, (i12 & 14) | 48, 0, 131064);
            mVar2 = mVarG;
            mVar2.w();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVar2.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.v6
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return z6.j(str2, dVar, aVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 j(String str, h2.d dVar, iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        i(str, dVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(long r20, iu.l r22, iu.a r23, androidx.compose.runtime.m r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.z6.k(long, iu.l, iu.a, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(iu.l r18, iu.a r19, v1.m r20, androidx.compose.runtime.m r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.z6.l(iu.l, iu.a, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m(iu.l lVar, iu.a aVar, b0.k0 k0Var) {
        ju.t.f(k0Var, "$this$LazyColumn");
        b0.k0.b(k0Var, null, null, q1.h.b(-1944596005, true, new b(lVar, aVar)), 3, null);
        b0.k0.b(k0Var, null, null, q1.h.b(1826135556, true, new c(lVar, aVar)), 3, null);
        b0.k0.b(k0Var, null, null, q1.h.b(-1174412893, true, new d(lVar, aVar)), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 n(iu.l lVar, iu.a aVar, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        l(lVar, aVar, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o(String str) {
        ju.t.f(str, "it");
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 p() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 q(String str) {
        ju.t.f(str, "it");
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 r() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 s(long j10, iu.l lVar, iu.a aVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        k(j10, lVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    private static final long v(androidx.compose.runtime.m mVar, int i10) {
        mVar.W(501748472);
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.b0(501748472, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.<get-NewConnectionPopUpOffset> (NewConnectionVariantsPopup.kt:176)");
        }
        q3.d dVar = (q3.d) mVar.n(androidx.compose.ui.platform.s1.g());
        float f10 = 25;
        long jF = q3.n.f((((long) ((int) dVar.K1(q3.h.m(f10)))) << 32) | (((long) ((int) dVar.K1(q3.h.m(f10)))) & 4294967295L));
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.a0();
        }
        mVar.Q();
        return jF;
    }
}

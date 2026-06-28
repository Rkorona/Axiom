package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.y9;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y9 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f32397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f32398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f32399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.a f32400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f32401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iu.a f32402f;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.y9$a$a, reason: collision with other inner class name */
        static final class C0495a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.a f32403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f32404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f32405c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ iu.a f32406d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ iu.a f32407e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ iu.a f32408f;

            C0495a(iu.a aVar, iu.a aVar2, boolean z10, iu.a aVar3, iu.a aVar4, iu.a aVar5) {
                this.f32403a = aVar;
                this.f32404b = aVar2;
                this.f32405c = z10;
                this.f32406d = aVar3;
                this.f32407e = aVar4;
                this.f32408f = aVar5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 i(iu.a aVar, iu.a aVar2) {
                aVar.a();
                aVar2.a();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 k(iu.a aVar, iu.a aVar2) {
                aVar.a();
                aVar2.a();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 l(iu.a aVar, iu.a aVar2) {
                aVar.a();
                aVar2.a();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 m(iu.a aVar, iu.a aVar2) {
                aVar.a();
                aVar2.a();
                return ut.m0.f82633a;
            }

            public final void h(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-2116443868, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsAddPopup.<anonymous>.<anonymous> (HostsAddPopup.kt:55)");
                }
                float f10 = 10;
                e.f fVarO = z.e.f87467a.o(q3.h.m(f10));
                v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(v1.m.f83247a, null, false, 3, null), 0.0f, q3.h.m(f10), 0.0f, q3.h.m(f10), 5, null);
                final iu.a aVar = this.f32403a;
                final iu.a aVar2 = this.f32404b;
                boolean z10 = this.f32405c;
                final iu.a aVar3 = this.f32406d;
                final iu.a aVar4 = this.f32407e;
                final iu.a aVar5 = this.f32408f;
                s2.e0 e0VarA = z.m.a(fVarO, v1.e.f83199a.k(), mVar, 6);
                int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                androidx.compose.runtime.i0 i0VarR = mVar.r();
                v1.m mVarE = v1.k.e(mVar, mVarR);
                c.a aVar6 = androidx.compose.ui.node.c.f6166i;
                iu.a aVarA = aVar6.a();
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
                androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar6.c());
                androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar6.e());
                iu.p pVarB = aVar6.b();
                if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                    mVarB.t(Integer.valueOf(iHashCode));
                    mVarB.m(Integer.valueOf(iHashCode), pVarB);
                }
                androidx.compose.runtime.q5.e(mVarB, mVarE, aVar6.d());
                z.q qVar = z.q.f87592a;
                g2.b bVarC = z2.d.c(R.drawable.ic_hosts_new_host, mVar, 6);
                String strB = z2.h.b(R.string.new_host_menu_item, mVar, 6);
                mVar.W(-1633490746);
                boolean zV = mVar.V(aVar) | mVar.V(aVar2);
                Object objD = mVar.D();
                if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.u9
                        @Override // iu.a
                        public final Object a() {
                            return y9.a.C0495a.i(aVar, aVar2);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                bk.k.e(bVarC, null, strB, (iu.a) objD, mVar, 0, 2);
                mVar.W(972477725);
                if (z10) {
                    g2.b bVarC2 = z2.d.c(R.drawable.ic_hosts_new_local, mVar, 6);
                    String strB2 = z2.h.b(R.string.new_local_menu_item, mVar, 6);
                    mVar.W(-1633490746);
                    boolean zV2 = mVar.V(aVar) | mVar.V(aVar3);
                    Object objD2 = mVar.D();
                    if (zV2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.v9
                            @Override // iu.a
                            public final Object a() {
                                return y9.a.C0495a.k(aVar, aVar3);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    bk.k.e(bVarC2, null, strB2, (iu.a) objD2, mVar, 0, 2);
                }
                mVar.Q();
                g2.b bVarC3 = z2.d.c(R.drawable.ic_hosts_new_group, mVar, 6);
                String strB3 = z2.h.b(R.string.new_group_menu_item, mVar, 6);
                mVar.W(-1633490746);
                boolean zV3 = mVar.V(aVar) | mVar.V(aVar4);
                Object objD3 = mVar.D();
                if (zV3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                    objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.w9
                        @Override // iu.a
                        public final Object a() {
                            return y9.a.C0495a.l(aVar, aVar4);
                        }
                    };
                    mVar.t(objD3);
                }
                mVar.Q();
                bk.k.e(bVarC3, null, strB3, (iu.a) objD3, mVar, 0, 2);
                bk.k.c(mVar, 0);
                g2.b bVarC4 = z2.d.c(R.drawable.ic_import, mVar, 6);
                String strB4 = z2.h.b(R.string.fab_quick_import_label, mVar, 6);
                mVar.W(-1633490746);
                boolean zV4 = mVar.V(aVar) | mVar.V(aVar5);
                Object objD4 = mVar.D();
                if (zV4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                    objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.x9
                        @Override // iu.a
                        public final Object a() {
                            return y9.a.C0495a.m(aVar, aVar5);
                        }
                    };
                    mVar.t(objD4);
                }
                mVar.Q();
                bk.k.e(bVarC4, null, strB4, (iu.a) objD4, mVar, 0, 2);
                mVar.w();
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                h((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
                return ut.m0.f82633a;
            }
        }

        a(iu.a aVar, iu.a aVar2, boolean z10, iu.a aVar3, iu.a aVar4, iu.a aVar5) {
            this.f32397a = aVar;
            this.f32398b = aVar2;
            this.f32399c = z10;
            this.f32400d = aVar3;
            this.f32401e = aVar4;
            this.f32402f = aVar5;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(2140652169, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsAddPopup.<anonymous> (HostsAddPopup.kt:49)");
            }
            a1.je.c(androidx.compose.foundation.layout.i0.u(v1.m.f83247a, q3.h.m(260)), g0.g.c(q3.h.m(20)), qk.a.f74718a.a(mVar, 6).i(), 0L, 0.0f, q3.h.m(3), null, q1.h.d(-2116443868, true, new C0495a(this.f32397a, this.f32398b, this.f32399c, this.f32400d, this.f32401e, this.f32402f), mVar, 54), mVar, 12779526, 88);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(long r23, boolean r25, iu.a r26, iu.a r27, iu.a r28, iu.a r29, iu.a r30, androidx.compose.runtime.m r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.y9.g(long, boolean, iu.a, iu.a, iu.a, iu.a, iu.a, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 i(long j10, boolean z10, iu.a aVar, iu.a aVar2, iu.a aVar3, iu.a aVar4, iu.a aVar5, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        g(j10, z10, aVar, aVar2, aVar3, aVar4, aVar5, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 j() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 k() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 l() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 m() {
        return ut.m0.f82633a;
    }
}

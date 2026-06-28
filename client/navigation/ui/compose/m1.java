package com.server.auditor.ssh.client.navigation.ui.compose;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 {
    public static final void d(final iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        ju.t.f(aVar, "onFabClicked");
        androidx.compose.runtime.m mVarG = mVar.g(1127176471);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1127176471, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.FabConnect (FabPlus.kt:49)");
            }
            a1.q4.d(aVar, z.j1.f(v1.m.f83247a, z.h1.e(z.m1.d(z.e1.f87495a, mVarG, 6), z.l1.f87562a.f())), null, qk.a.f74718a.a(mVarG, 6).d(), 0L, null, null, f.f30451a.b(), mVarG, (i11 & 14) | 12582912, 116);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.l1
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return m1.e(aVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        d(aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    public static final void f(v1.m mVar, final iu.a aVar, androidx.compose.runtime.m mVar2, final int i10, final int i11) {
        v1.m mVar3;
        int i12;
        final v1.m mVar4;
        ju.t.f(aVar, "onFabClicked");
        androidx.compose.runtime.m mVarG = mVar2.g(483363616);
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
            i12 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && mVarG.h()) {
            mVarG.M();
            mVar4 = mVar3;
        } else {
            mVar4 = i13 != 0 ? v1.m.f83247a : mVar3;
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(483363616, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.FabPlus (FabPlus.kt:22)");
            }
            a1.q4.d(aVar, z.j1.f(mVar4, z.h1.e(z.m1.d(z.e1.f87495a, mVarG, 6), z.l1.f87562a.f())), null, qk.a.f74718a.a(mVarG, 6).d(), 0L, null, null, f.f30451a.c(), mVarG, ((i12 >> 3) & 14) | 12582912, 116);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.j1
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return m1.g(mVar4, aVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(v1.m mVar, iu.a aVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        f(mVar, aVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void h(v1.m mVar, final iu.a aVar, androidx.compose.runtime.m mVar2, final int i10, final int i11) {
        v1.m mVar3;
        int i12;
        final v1.m mVar4;
        ju.t.f(aVar, "onFabClicked");
        androidx.compose.runtime.m mVarG = mVar2.g(827794702);
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
            i12 |= mVarG.F(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && mVarG.h()) {
            mVarG.M();
            mVar4 = mVar3;
        } else {
            mVar4 = i13 != 0 ? v1.m.f83247a : mVar3;
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(827794702, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.FabSend (FabPlus.kt:36)");
            }
            a1.q4.d(aVar, z.j1.f(mVar4, z.h1.e(z.m1.d(z.e1.f87495a, mVarG, 6), z.l1.f87562a.f())), null, qk.a.f74718a.a(mVarG, 6).d(), 0L, null, null, f.f30451a.a(), mVarG, ((i12 >> 3) & 14) | 12582912, 116);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.k1
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return m1.i(mVar4, aVar, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 i(v1.m mVar, iu.a aVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        h(mVar, aVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

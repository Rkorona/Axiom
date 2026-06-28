package com.server.auditor.ssh.client.navigation.ui.compose;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fa {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r31, boolean r32, final long r33, long r35, float r37, float r38, v1.m r39, androidx.compose.runtime.m r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.fa.c(float, boolean, long, long, float, float, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    private static final float d(androidx.compose.runtime.l5 l5Var) {
        return ((Number) l5Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(float f10, float f11, long j10, boolean z10, long j11, float f12, androidx.compose.runtime.l5 l5Var, e2.f fVar) {
        char c10;
        c2.l2 l2Var;
        float f13;
        boolean z11;
        float f14;
        ut.u uVarA;
        ju.t.f(fVar, "$this$drawBehind");
        float density = f10 * fVar.getDensity();
        float density2 = fVar.getDensity() * f11;
        float f15 = density / 2.0f;
        long jE = b2.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) - density;
        b2.g gVarC = b2.h.c(jE, b2.k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - density)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
        c2.l2 l2VarA = c2.s0.a();
        float fL = gVarC.l();
        float fO = gVarC.o();
        float fM = gVarC.m();
        float fI = gVarC.i();
        float f16 = 2;
        l2VarA.t(((gVarC.m() - gVarC.l()) / f16) + fL, fO);
        l2VarA.x(fM - density2, fO);
        if (density2 > 0.0f) {
            float f17 = density2 * 2.0f;
            c10 = ' ';
            f13 = f16;
            l2Var = l2VarA;
            l2Var.v(b2.h.c(b2.e.e((((long) Float.floatToRawIntBits(fO)) & 4294967295L) | (Float.floatToRawIntBits(fM - f17) << 32)), b2.k.d((((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32))), 270.0f, 90.0f, false);
        } else {
            c10 = ' ';
            l2Var = l2VarA;
            f13 = f16;
        }
        l2Var.x(fM, fI - density2);
        if (density2 > 0.0f) {
            float f18 = density2 * 2.0f;
            l2Var.v(b2.h.c(b2.e.e((((long) Float.floatToRawIntBits(fM - f18)) << c10) | (((long) Float.floatToRawIntBits(fI - f18)) & 4294967295L)), b2.k.d((((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (Float.floatToRawIntBits(f18) << c10))), 0.0f, 90.0f, false);
        }
        l2Var.x(fL + density2, fI);
        if (density2 > 0.0f) {
            float f19 = density2 * 2.0f;
            l2Var.v(b2.h.c(b2.e.e((((long) Float.floatToRawIntBits(fL)) << c10) | (((long) Float.floatToRawIntBits(fI - f19)) & 4294967295L)), b2.k.d((((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (Float.floatToRawIntBits(f19) << c10))), 90.0f, 90.0f, false);
        }
        l2Var.x(fL, fO + density2);
        if (density2 > 0.0f) {
            float f20 = density2 * 2.0f;
            z11 = false;
            l2Var.v(b2.h.c(b2.e.e((((long) Float.floatToRawIntBits(fL)) << c10) | (((long) Float.floatToRawIntBits(fO)) & 4294967295L)), b2.k.d((((long) Float.floatToRawIntBits(f20)) << c10) | (((long) Float.floatToRawIntBits(f20)) & 4294967295L))), 180.0f, 90.0f, false);
        } else {
            z11 = false;
        }
        l2Var.x(fL + ((gVarC.m() - gVarC.l()) / f13), fO);
        if (c2.n1.p(j10, c2.n1.f14986b.f())) {
            f14 = density;
        } else {
            f14 = density;
            c2.l2 l2Var2 = l2Var;
            e2.f.k1(fVar, l2Var2, j10, 0.0f, new e2.k(density, 0.0f, c2.g3.f14938a.b(), 0, null, 26, null), null, 0, 52, null);
            l2Var = l2Var2;
        }
        if (z10) {
            c2.o2 o2VarA = c2.r0.a();
            o2VarA.b(l2Var, z11);
            float fC = o2VarA.c();
            float f21 = 0.3f * fC;
            if (d(l5Var) <= 0.2f) {
                uVarA = ut.b0.a(Float.valueOf(0.0f), Float.valueOf(f21 * (d(l5Var) / 0.2f)));
            } else if (d(l5Var) <= 0.8f) {
                float fD = fC * ((d(l5Var) - 0.2f) / 0.6f) * 0.7f;
                uVarA = ut.b0.a(Float.valueOf(fD), Float.valueOf(fD + f21));
            } else {
                float fD2 = (d(l5Var) - 0.8f) / 0.19999999f;
                float f22 = ((0.7f * fC) + (f21 * fD2)) % fC;
                uVarA = ut.b0.a(Float.valueOf(f22), Float.valueOf(pu.m.h(f22 + (f21 * (1.0f - fD2)), fC)));
            }
            float fFloatValue = ((Number) uVarA.a()).floatValue();
            float fFloatValue2 = ((Number) uVarA.b()).floatValue();
            if (fFloatValue2 > fFloatValue) {
                c2.l2 l2VarA2 = c2.s0.a();
                o2VarA.a(fFloatValue, fFloatValue2, l2VarA2, true);
                e2.f.k1(fVar, l2VarA2, j11, 0.0f, new e2.k(f14, 0.0f, c2.g3.f14938a.b(), 0, null, 26, null), null, 0, 52, null);
            }
        } else {
            float f23 = f14;
            if (f12 > 0.0f) {
                c2.o2 o2VarA2 = c2.r0.a();
                o2VarA2.b(l2Var, z11);
                float fC2 = o2VarA2.c() * f12;
                c2.l2 l2VarA3 = c2.s0.a();
                o2VarA2.a(0.0f, fC2, l2VarA3, true);
                e2.f.k1(fVar, l2VarA3, j11, 0.0f, new e2.k(f23, 0.0f, c2.g3.f14938a.b(), 0, null, 26, null), null, 0, 52, null);
            }
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f(float f10, boolean z10, long j10, long j11, float f11, float f12, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        c(f10, z10, j10, j11, f11, f12, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

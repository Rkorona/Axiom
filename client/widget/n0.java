package com.server.auditor.ssh.client.widget;

import androidx.compose.runtime.l5;
import c2.d1;
import c2.e3;
import c2.i2;
import c2.t2;
import com.server.auditor.ssh.client.widget.n0;
import java.util.List;
import r.g1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f46807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f46808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f46809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f46810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f46811e;

        a(boolean z10, int i10, g1 g1Var, List list, boolean z11) {
            this.f46807a = z10;
            this.f46808b = i10;
            this.f46809c = g1Var;
            this.f46810d = list;
            this.f46811e = z11;
        }

        private static final float e(l5 l5Var) {
            return ((Number) l5Var.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g(List list, boolean z10, l5 l5Var, e2.c cVar) {
            ju.t.f(cVar, "$this$drawWithContent");
            cVar.d2();
            float fE = e(l5Var) * Float.intBitsToFloat((int) (cVar.b() >> 32));
            d1.a aVar = c2.d1.f14925b;
            long jE = b2.e.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            float fIntBitsToFloat = fE + Float.intBitsToFloat((int) (cVar.b() >> 32));
            e2.f.X1(cVar, d1.a.e(aVar, list, jE, b2.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), 0, 8, null), 0L, 0L, 0.0f, null, null, z10 ? androidx.compose.ui.graphics.c.f5841a.i() : androidx.compose.ui.graphics.c.f5841a.z(), 62, null);
            return ut.m0.f82633a;
        }

        public final v1.m d(v1.m mVar, androidx.compose.runtime.m mVar2, int i10) {
            ju.t.f(mVar, "$this$composed");
            mVar2.W(1357353409);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1357353409, i10, -1, "com.server.auditor.ssh.client.widget.iconShimmer.<anonymous> (Shimmer.kt:110)");
            }
            if (!this.f46807a) {
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
                mVar2.Q();
                return mVar;
            }
            final l5 l5VarC = r.v0.c(r.v0.g("IconShimmerTransition", mVar2, 6, 0), -2.0f, 2.0f, r.l.e(r.l.l(this.f46808b, 0, r.g0.e(), 2, null), this.f46809c, 0L, 4, null), "IconShimmerAnimation", mVar2, r.q0.f75781f | 24960 | (r.o0.f75757d << 9), 0);
            v1.m mVarE = androidx.compose.ui.graphics.f.e(mVar, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524283, null);
            mVar2.W(-1746271574);
            boolean zV = mVar2.V(l5VarC) | mVar2.F(this.f46810d) | mVar2.a(this.f46811e);
            final List list = this.f46810d;
            final boolean z10 = this.f46811e;
            Object objD = mVar2.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.widget.m0
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return n0.a.g(list, z10, l5VarC, (e2.c) obj);
                    }
                };
                mVar2.t(objD);
            }
            mVar2.Q();
            v1.m mVarD = androidx.compose.ui.draw.b.d(mVarE, (iu.l) objD);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
            mVar2.Q();
            return mVarD;
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d((v1.m) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f46812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.d0 f46813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f46814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f46815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e3 f46816e;

        b(boolean z10, r.d0 d0Var, g1 g1Var, List list, e3 e3Var) {
            this.f46812a = z10;
            this.f46813b = d0Var;
            this.f46814c = g1Var;
            this.f46815d = list;
            this.f46816e = e3Var;
        }

        private static final float e(l5 l5Var) {
            return ((Number) l5Var.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g(List list, e3 e3Var, l5 l5Var, e2.c cVar) {
            ju.t.f(cVar, "$this$drawWithContent");
            float fE = e(l5Var) * Float.intBitsToFloat((int) (cVar.b() >> 32));
            d1.a aVar = c2.d1.f14925b;
            long jE = b2.e.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            float fIntBitsToFloat = fE + Float.intBitsToFloat((int) (cVar.b() >> 32));
            c2.d1 d1VarE = d1.a.e(aVar, list, jE, b2.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.b() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0, 8, null);
            cVar.d2();
            i2.c(cVar, e3Var.a(cVar.b(), cVar.getLayoutDirection(), cVar), d1VarE, 0.0f, null, null, 0, 60, null);
            return ut.m0.f82633a;
        }

        public final v1.m d(v1.m mVar, androidx.compose.runtime.m mVar2, int i10) {
            ju.t.f(mVar, "$this$composed");
            mVar2.W(-582027794);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-582027794, i10, -1, "com.server.auditor.ssh.client.widget.shimmer.<anonymous> (Shimmer.kt:70)");
            }
            if (!this.f46812a) {
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
                mVar2.Q();
                return mVar;
            }
            final l5 l5VarC = r.v0.c(r.v0.g("", mVar2, 6, 0), -2.0f, 2.0f, r.l.e(this.f46813b, this.f46814c, 0L, 4, null), "ShimmerEffectAnimation", mVar2, r.q0.f75781f | 24960 | (r.o0.f75757d << 9), 0);
            mVar2.W(-1746271574);
            boolean zV = mVar2.V(l5VarC) | mVar2.F(this.f46815d) | mVar2.V(this.f46816e);
            final List list = this.f46815d;
            final e3 e3Var = this.f46816e;
            Object objD = mVar2.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.widget.o0
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return n0.b.g(list, e3Var, l5VarC, (e2.c) obj);
                    }
                };
                mVar2.t(objD);
            }
            mVar2.Q();
            v1.m mVarD = androidx.compose.ui.draw.b.d(mVar, (iu.l) objD);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
            mVar2.Q();
            return mVarD;
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d((v1.m) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final v1.m a(v1.m mVar, boolean z10, boolean z11, int i10, List list, g1 g1Var) {
        ju.t.f(mVar, "<this>");
        ju.t.f(list, "shimmerColors");
        ju.t.f(g1Var, "repeatMode");
        return v1.k.c(mVar, null, new a(z10, i10, g1Var, list, z11), 1, null);
    }

    public static /* synthetic */ v1.m b(v1.m mVar, boolean z10, boolean z11, int i10, List list, g1 g1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 4) != 0) {
            i10 = 1800;
        }
        if ((i11 & 8) != 0) {
            list = l0.f46799a.a();
        }
        if ((i11 & 16) != 0) {
            g1Var = g1.f75598a;
        }
        g1 g1Var2 = g1Var;
        int i12 = i10;
        return a(mVar, z10, z11, i12, list, g1Var2);
    }

    public static final v1.m c(v1.m mVar, boolean z10, e3 e3Var, int i10, List list, g1 g1Var) {
        ju.t.f(mVar, "<this>");
        ju.t.f(e3Var, "shape");
        ju.t.f(list, "shimmerColors");
        ju.t.f(g1Var, "repeatMode");
        return d(mVar, z10, e3Var, list, r.l.l(i10, 0, r.g0.e(), 2, null), g1Var);
    }

    public static final v1.m d(v1.m mVar, boolean z10, e3 e3Var, List list, r.d0 d0Var, g1 g1Var) {
        ju.t.f(mVar, "<this>");
        ju.t.f(e3Var, "shape");
        ju.t.f(list, "shimmerColors");
        ju.t.f(d0Var, "animation");
        ju.t.f(g1Var, "repeatMode");
        return v1.k.c(mVar, null, new b(z10, d0Var, g1Var, list, e3Var), 1, null);
    }

    public static /* synthetic */ v1.m e(v1.m mVar, boolean z10, e3 e3Var, int i10, List list, g1 g1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            e3Var = t2.a();
        }
        if ((i11 & 4) != 0) {
            i10 = 1800;
        }
        if ((i11 & 8) != 0) {
            list = l0.f46799a.a();
        }
        if ((i11 & 16) != 0) {
            g1Var = g1.f75598a;
        }
        g1 g1Var2 = g1Var;
        int i12 = i10;
        return c(mVar, z10, e3Var, i12, list, g1Var2);
    }
}

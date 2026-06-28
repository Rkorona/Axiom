package com.server.auditor.ssh.client.widget;

import androidx.compose.runtime.e2;
import androidx.compose.runtime.f5;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y4;
import androidx.compose.ui.platform.s1;
import c2.n1;
import com.server.auditor.ssh.client.widget.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f46853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f46854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f46855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f46856d;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.widget.t$a$a, reason: collision with other inner class name */
        static final class C0667a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f46857a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f46858b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f46859c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList f46860d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f46861e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f46862f;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ e2 f46863u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0667a(SnapshotStateList snapshotStateList, int i10, float f10, e2 e2Var, zt.e eVar) {
                super(2, eVar);
                this.f46860d = snapshotStateList;
                this.f46861e = i10;
                this.f46862f = f10;
                this.f46863u = e2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean k(int i10, e2 e2Var, long j10) {
                return a.h(e2Var) - j10 > ((long) i10);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                C0667a c0667a = new C0667a(this.f46860d, this.f46861e, this.f46862f, this.f46863u, eVar);
                c0667a.f46859c = obj;
                return c0667a;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = au.b.f()
                    int r1 = r9.f46858b
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    long r3 = r9.f46857a
                    java.lang.Object r1 = r9.f46859c
                    wu.i0 r1 = (wu.i0) r1
                    ut.x.b(r10)
                    goto L47
                L15:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1d:
                    ut.x.b(r10)
                    java.lang.Object r10 = r9.f46859c
                    wu.i0 r10 = (wu.i0) r10
                    long r3 = java.lang.System.currentTimeMillis()
                    androidx.compose.runtime.snapshots.SnapshotStateList r1 = r9.f46860d
                    r5 = 0
                    java.lang.Long r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                    r1.add(r5)
                    r1 = r10
                L34:
                    boolean r10 = wu.j0.g(r1)
                    if (r10 == 0) goto L8d
                    r9.f46859c = r1
                    r9.f46857a = r3
                    r9.f46858b = r2
                    java.lang.Object r10 = xu.e.e(r9)
                    if (r10 != r0) goto L47
                    return r0
                L47:
                    androidx.compose.runtime.e2 r10 = r9.f46863u
                    long r5 = java.lang.System.currentTimeMillis()
                    long r5 = r5 - r3
                    com.server.auditor.ssh.client.widget.t.a.e(r10, r5)
                    androidx.compose.runtime.snapshots.SnapshotStateList r10 = r9.f46860d
                    java.lang.Object r10 = vt.v.B0(r10)
                    java.lang.Number r10 = (java.lang.Number) r10
                    long r5 = r10.longValue()
                    androidx.compose.runtime.e2 r10 = r9.f46863u
                    long r7 = com.server.auditor.ssh.client.widget.t.a.d(r10)
                    long r7 = r7 - r5
                    float r10 = (float) r7
                    int r5 = r9.f46861e
                    float r5 = (float) r5
                    float r6 = r9.f46862f
                    float r5 = r5 * r6
                    int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                    if (r10 < 0) goto L7e
                    androidx.compose.runtime.snapshots.SnapshotStateList r10 = r9.f46860d
                    androidx.compose.runtime.e2 r5 = r9.f46863u
                    long r5 = com.server.auditor.ssh.client.widget.t.a.d(r5)
                    java.lang.Long r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                    r10.add(r5)
                L7e:
                    androidx.compose.runtime.snapshots.SnapshotStateList r10 = r9.f46860d
                    int r5 = r9.f46861e
                    androidx.compose.runtime.e2 r6 = r9.f46863u
                    com.server.auditor.ssh.client.widget.s r7 = new com.server.auditor.ssh.client.widget.s
                    r7.<init>()
                    vt.v.L(r10, r7)
                    goto L34
                L8d:
                    ut.m0 r10 = ut.m0.f82633a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.widget.t.a.C0667a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((C0667a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        a(int i10, float f10, long j10, float f11) {
            this.f46853a = i10;
            this.f46854b = f10;
            this.f46855c = j10;
            this.f46856d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long h(e2 e2Var) {
            return ((Number) e2Var.getValue()).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(e2 e2Var, long j10) {
            e2Var.setValue(Long.valueOf(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(SnapshotStateList snapshotStateList, int i10, float f10, long j10, e2 e2Var, e2.f fVar) {
            e2.f fVar2 = fVar;
            ju.t.f(fVar2, "$this$drawBehind");
            long jE = b2.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)) / 2.0f)) & 4294967295L));
            Iterator it = snapshotStateList.iterator();
            while (it.hasNext()) {
                float fH = (h(e2Var) - ((Number) it.next()).longValue()) / i10;
                if (0.0f <= fH && fH <= 1.0f) {
                    float fA = r.g0.f().a(pu.m.l(fH, 0.0f, 1.0f));
                    e2.f.v0(fVar2, n1.n(j10, (1.0f - fA) * n1.q(j10), 0.0f, 0.0f, 0.0f, 14, null), f10 * fA, jE, 0.0f, null, null, 0, 120, null);
                }
                fVar2 = fVar;
            }
            return ut.m0.f82633a;
        }

        public final v1.m g(v1.m mVar, androidx.compose.runtime.m mVar2, int i10) {
            ju.t.f(mVar, "$this$composed");
            mVar2.W(1696550929);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1696550929, i10, -1, "com.server.auditor.ssh.client.widget.pulsatingCircle.<anonymous> (PulsatingRadar.kt:53)");
            }
            mVar2.W(1849434622);
            Object objD = mVar2.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = y4.f();
                mVar2.t(objD);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objD;
            mVar2.Q();
            mVar2.W(1849434622);
            Object objD2 = mVar2.D();
            if (objD2 == aVar.a()) {
                objD2 = f5.e(0L, null, 2, null);
                mVar2.t(objD2);
            }
            final e2 e2Var = (e2) objD2;
            mVar2.Q();
            final float fK1 = ((q3.d) mVar2.n(s1.g())).K1(this.f46856d);
            ut.m0 m0Var = ut.m0.f82633a;
            mVar2.W(-1224400529);
            boolean zC = mVar2.c(this.f46853a) | mVar2.b(this.f46854b);
            int i11 = this.f46853a;
            float f10 = this.f46854b;
            Object objD3 = mVar2.D();
            if (zC || objD3 == aVar.a()) {
                C0667a c0667a = new C0667a(snapshotStateList, i11, f10, e2Var, null);
                mVar2.t(c0667a);
                objD3 = c0667a;
            }
            mVar2.Q();
            androidx.compose.runtime.a1.e(m0Var, (iu.p) objD3, mVar2, 6);
            mVar2.W(-1224400529);
            boolean zC2 = mVar2.c(this.f46853a) | mVar2.b(fK1) | mVar2.d(this.f46855c);
            final int i12 = this.f46853a;
            final long j10 = this.f46855c;
            Object objD4 = mVar2.D();
            if (zC2 || objD4 == aVar.a()) {
                objD4 = new iu.l() { // from class: com.server.auditor.ssh.client.widget.r
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return t.a.k(snapshotStateList, i12, fK1, j10, e2Var, (e2.f) obj);
                    }
                };
                mVar2.t(objD4);
            }
            mVar2.Q();
            v1.m mVarB = androidx.compose.ui.draw.b.b(mVar, (iu.l) objD4);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
            mVar2.Q();
            return mVarB;
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((v1.m) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final v1.m a(v1.m mVar, long j10, float f10, int i10, float f11) {
        ju.t.f(mVar, "$this$pulsatingCircle");
        return v1.k.c(mVar, null, new a(i10, f11, j10, f10), 1, null);
    }

    public static /* synthetic */ v1.m b(v1.m mVar, long j10, float f10, int i10, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = q3.h.m(24);
        }
        float f12 = f10;
        if ((i11 & 4) != 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            f11 = 0.5f;
        }
        return a(mVar, j10, f12, i12, f11);
    }
}

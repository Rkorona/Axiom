package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.o6;
import v1.m;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o6 {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.p f31791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f31792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f31793f;

        a(boolean z10, String str, String str2, iu.p pVar, androidx.compose.runtime.e2 e2Var, androidx.compose.runtime.e2 e2Var2) {
            this.f31788a = z10;
            this.f31789b = str;
            this.f31790c = str2;
            this.f31791d = pVar;
            this.f31792e = e2Var;
            this.f31793f = e2Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
            ju.t.f(t0Var, "newValue");
            o6.e(e2Var, t0Var);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 i(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
            ju.t.f(t0Var, "newValue");
            o6.g(e2Var, t0Var);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(iu.p pVar, androidx.compose.runtime.e2 e2Var, androidx.compose.runtime.e2 e2Var2) {
            pVar.invoke(o6.d(e2Var).m(), o6.f(e2Var2).m());
            return ut.m0.f82633a;
        }

        public final void g(z.p pVar, androidx.compose.runtime.m mVar, int i10) {
            int i11;
            String strB;
            final androidx.compose.runtime.e2 e2Var;
            final androidx.compose.runtime.e2 e2Var2;
            ju.t.f(pVar, "$this$ModalBottomSheet");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-225449974, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.CreateEnvironmentVariableDialog.<anonymous> (CreateEnvironmentVariableDialog.kt:62)");
            }
            float f10 = 20;
            e.f fVarO = z.e.f87467a.o(q3.h.m(f10));
            m.a aVar = v1.m.f83247a;
            float f11 = 10;
            v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(aVar, null, false, 3, null), 0.0f, 0.0f, 0.0f, q3.h.m(f11), 7, null);
            boolean z10 = this.f31788a;
            String str = this.f31789b;
            String str2 = this.f31790c;
            final iu.p pVar2 = this.f31791d;
            androidx.compose.runtime.e2 e2Var3 = this.f31792e;
            androidx.compose.runtime.e2 e2Var4 = this.f31793f;
            s2.e0 e0VarA = z.m.a(fVarO, v1.e.f83199a.k(), mVar, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarR);
            c.a aVar2 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar2.a();
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
            androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar2.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar2.e());
            iu.p pVarB = aVar2.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar2.d());
            z.q qVar = z.q.f87592a;
            if (z10) {
                mVar.W(-1742228384);
                i11 = 6;
                strB = z2.h.b(R.string.edit_variable, mVar, 6);
                mVar.Q();
            } else {
                i11 = 6;
                mVar.W(-1742145087);
                strB = z2.h.b(R.string.new_variable, mVar, 6);
                mVar.Q();
            }
            qk.a aVar3 = qk.a.f74718a;
            a1.lf.j(strB, androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), q3.h.m(f11), q3.h.m(f10), 0.0f, 8, null), aVar3.a(mVar, i11).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.b(mVar, i11).j(), mVar, 0, 0, 131064);
            j3.t0 t0VarD = o6.d(e2Var3);
            String strB2 = z2.h.b(R.string.env_variables_variable_name, mVar, 6);
            v1.m mVarR2 = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), 0.0f, 10, null);
            mVar.W(5004770);
            Object objD = mVar.D();
            m.a aVar4 = androidx.compose.runtime.m.f5359a;
            if (objD == aVar4.a()) {
                e2Var = e2Var3;
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.l6
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return o6.a.h(e2Var, (j3.t0) obj);
                    }
                };
                mVar.t(objD);
            } else {
                e2Var = e2Var3;
            }
            mVar.Q();
            final androidx.compose.runtime.e2 e2Var5 = e2Var;
            bk.b6.c(t0VarD, (iu.l) objD, mVarR2, false, false, null, strB2, str, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, null, mVar, 432, 12582912, 0, 16645944);
            j3.t0 t0VarF = o6.f(e2Var4);
            String strB3 = z2.h.b(R.string.env_variables_variable_value, mVar, 6);
            v1.m mVarR3 = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), 0.0f, 10, null);
            mVar.W(5004770);
            Object objD2 = mVar.D();
            if (objD2 == aVar4.a()) {
                e2Var2 = e2Var4;
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.m6
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return o6.a.i(e2Var2, (j3.t0) obj);
                    }
                };
                mVar.t(objD2);
            } else {
                e2Var2 = e2Var4;
            }
            mVar.Q();
            final androidx.compose.runtime.e2 e2Var6 = e2Var2;
            bk.b6.c(t0VarF, (iu.l) objD2, mVarR3, false, false, null, strB3, str2, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, null, mVar, 432, 12582912, 0, 16645944);
            boolean z11 = o6.d(e2Var5).m().length() > 0 && o6.f(e2Var6).m().length() > 0;
            v1.m mVarR4 = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), q3.h.m(f11), 2, null);
            mVar.W(-1746271574);
            boolean zV = mVar.V(pVar2);
            Object objD3 = mVar.D();
            if (zV || objD3 == aVar4.a()) {
                objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.n6
                    @Override // iu.a
                    public final Object a() {
                        return o6.a.k(pVar2, e2Var5, e2Var6);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            co.p.j((iu.a) objD3, mVarR4, z11, q.f31921a.a(), mVar, 3120, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final iu.a r25, a1.wc r26, java.lang.String r27, java.lang.String r28, final iu.p r29, androidx.compose.runtime.m r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.o6.c(iu.a, a1.wc, java.lang.String, java.lang.String, iu.p, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 d(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 f(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h(iu.a aVar) {
        aVar.a();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 i(iu.a aVar, a1.wc wcVar, String str, String str2, iu.p pVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        c(aVar, wcVar, str, str2, pVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

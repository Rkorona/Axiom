package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.ve;
import v1.m;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ve {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f32325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f32326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f32328f;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ve$a$a, reason: collision with other inner class name */
        static final class C0494a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32329a;

            C0494a(String str) {
                this.f32329a = str;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(1638001902, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.SftpRenameDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SftpRenameDialog.kt:108)");
                }
                qk.a aVar = qk.a.f74718a;
                e3.i3 i3VarB = aVar.b(mVar, 6).b();
                a1.lf.j(this.f32329a, null, aVar.a(mVar, 6).s(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, i3VarB, mVar, 0, 0, 131066);
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

        a(String str, String str2, iu.a aVar, androidx.compose.ui.focus.o oVar, String str3, androidx.compose.runtime.e2 e2Var) {
            this.f32323a = str;
            this.f32324b = str2;
            this.f32325c = aVar;
            this.f32326d = oVar;
            this.f32327e = str3;
            this.f32328f = e2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(iu.a aVar, h0.j2 j2Var) {
            ju.t.f(j2Var, "$this$KeyboardActions");
            aVar.a();
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 i(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
            ju.t.f(t0Var, "newValue");
            ve.g(e2Var, t0Var);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(iu.a aVar) {
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void g(z.p pVar, androidx.compose.runtime.m mVar, int i10) {
            final androidx.compose.runtime.e2 e2Var;
            ju.t.f(pVar, "$this$ModalBottomSheet");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1666975185, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.SftpRenameDialog.<anonymous> (SftpRenameDialog.kt:64)");
            }
            float f10 = 20;
            e.f fVarO = z.e.f87467a.o(q3.h.m(f10));
            m.a aVar = v1.m.f83247a;
            float f11 = 10;
            v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(aVar, null, false, 3, null), 0.0f, 0.0f, 0.0f, q3.h.m(f11), 7, null);
            String str = this.f32323a;
            String str2 = this.f32324b;
            final iu.a aVar2 = this.f32325c;
            androidx.compose.ui.focus.o oVar = this.f32326d;
            String str3 = this.f32327e;
            androidx.compose.runtime.e2 e2Var2 = this.f32328f;
            s2.e0 e0VarA = z.m.a(fVarO, v1.e.f83199a.k(), mVar, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarR);
            c.a aVar3 = androidx.compose.ui.node.c.f6166i;
            iu.a aVarA = aVar3.a();
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
            androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar3.e());
            iu.p pVarB = aVar3.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar3.d());
            z.q qVar = z.q.f87592a;
            qk.a aVar4 = qk.a.f74718a;
            a1.lf.j(str, androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), q3.h.m(f11), q3.h.m(f10), 0.0f, 8, null), aVar4.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.b(mVar, 6).j(), mVar, 0, 0, 131064);
            j3.t0 t0VarE = ve.e(e2Var2);
            boolean z10 = str2 != null;
            h0.l2 l2Var = new h0.l2(0, null, j3.z.f61295b.h(), 0, null, null, null, 123, null);
            mVar.W(5004770);
            boolean zV = mVar.V(aVar2);
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.se
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return ve.a.h(aVar2, (h0.j2) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            h0.k2 k2Var = new h0.k2((iu.l) objD, null, null, null, null, null, 62, null);
            v1.m mVarA = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), 0.0f, 10, null), oVar);
            mVar.W(404542680);
            q1.b bVarD = str2 == null ? null : q1.h.d(1638001902, true, new C0494a(str2), mVar, 54);
            mVar.Q();
            mVar.W(5004770);
            Object objD2 = mVar.D();
            m.a aVar5 = androidx.compose.runtime.m.f5359a;
            if (objD2 == aVar5.a()) {
                e2Var = e2Var2;
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.te
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return ve.a.i(e2Var, (j3.t0) obj);
                    }
                };
                mVar.t(objD2);
            } else {
                e2Var = e2Var2;
            }
            mVar.Q();
            bk.b6.c(t0VarE, (iu.l) objD2, mVarA, false, false, null, null, str3, null, null, null, null, bVarD, z10, null, l2Var, k2Var, true, 0, 0, null, null, null, null, mVar, 48, 12779520, 0, 16535416);
            boolean z11 = ve.e(e2Var).m().length() > 0;
            v1.m mVarR2 = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), q3.h.m(f10), 0.0f, q3.h.m(f10), q3.h.m(f11), 2, null);
            mVar.W(5004770);
            boolean zV2 = mVar.V(aVar2);
            Object objD3 = mVar.D();
            if (zV2 || objD3 == aVar5.a()) {
                objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ue
                    @Override // iu.a
                    public final Object a() {
                        return ve.a.k(aVar2);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            co.p.j((iu.a) objD3, mVarR2, z11, c1.f31013a.a(), mVar, 3120, 0);
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

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1.wc f32331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f32332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a1.wc wcVar, androidx.compose.ui.focus.o oVar, zt.e eVar) {
            super(2, eVar);
            this.f32331b = wcVar;
            this.f32332c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f32331b, this.f32332c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f32330a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f32331b.p()) {
                androidx.compose.ui.focus.o.g(this.f32332c, 0, 1, null);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r33, final iu.a r34, a1.wc r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, final iu.l r39, androidx.compose.runtime.m r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ve.d(java.lang.String, iu.a, a1.wc, java.lang.String, java.lang.String, java.lang.String, iu.l, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 e(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 f(String str, iu.a aVar, a1.wc wcVar, String str2, String str3, String str4, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        d(str, aVar, wcVar, str2, str3, str4, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h(String str, iu.l lVar, androidx.compose.runtime.e2 e2Var) {
        if (str.length() > 0 || e(e2Var).m().length() > 0) {
            String strM = e(e2Var).m();
            if (strM.length() != 0) {
                str = strM;
            }
            lVar.invoke(str);
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 i(iu.a aVar) {
        aVar.a();
        return ut.m0.f82633a;
    }
}

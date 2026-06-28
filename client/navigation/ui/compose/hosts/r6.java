package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.r6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r6 {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.l f32158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f32159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f32160c;

        a(iu.l lVar, iu.a aVar, androidx.compose.runtime.e2 e2Var) {
            this.f32158a = lVar;
            this.f32159b = aVar;
            this.f32160c = e2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(iu.l lVar, iu.a aVar, androidx.compose.runtime.e2 e2Var) {
            lVar.invoke(r6.c(e2Var).m());
            aVar.a();
            return ut.m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1242656425, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.CreateTagDialog.<anonymous> (CreateTagDialog.kt:49)");
            }
            mVar.W(-1746271574);
            boolean zV = mVar.V(this.f32158a) | mVar.V(this.f32159b);
            final iu.l lVar = this.f32158a;
            final iu.a aVar = this.f32159b;
            final androidx.compose.runtime.e2 e2Var = this.f32160c;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.q6
                    @Override // iu.a
                    public final Object a() {
                        return r6.a.e(lVar, aVar, e2Var);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            co.p.j((iu.a) objD, null, false, r.f32069a.a(), mVar, 3072, 6);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f32161a;

        b(iu.a aVar) {
            this.f32161a = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1129060441, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.CreateTagDialog.<anonymous> (CreateTagDialog.kt:62)");
            }
            co.p.x(this.f32161a, null, false, null, null, null, null, null, null, r.f32069a.b(), mVar, 805306368, 510);
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

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32162a;

        c(boolean z10) {
            this.f32162a = z10;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            String strB;
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-794189989, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.CreateTagDialog.<anonymous> (CreateTagDialog.kt:96)");
            }
            if (this.f32162a) {
                mVar.W(1260931166);
                strB = z2.h.b(R.string.edit_tag, mVar, 6);
                mVar.Q();
            } else {
                mVar.W(1261009720);
                strB = z2.h.b(R.string.create_new_tag, mVar, 6);
                mVar.Q();
            }
            qk.a aVar = qk.a.f74718a;
            e3.i3 i3VarJ = aVar.b(mVar, 6).j();
            String str = strB;
            a1.lf.j(str, androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), aVar.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, i3VarJ, mVar, 48, 0, 131064);
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

    static final class d implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f32165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f32166d;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f32167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f32168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.e2 f32169c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var, zt.e eVar) {
                super(2, eVar);
                this.f32168b = oVar;
                this.f32169c = e2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f32168b, this.f32169c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f32167a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                androidx.compose.ui.focus.o.g(this.f32168b, 0, 1, null);
                androidx.compose.runtime.e2 e2Var = this.f32169c;
                r6.d(e2Var, j3.t0.h(r6.c(e2Var), null, e3.h3.b(0, r6.c(this.f32169c).m().length()), null, 5, null));
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        d(boolean z10, String str, androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var) {
            this.f32163a = z10;
            this.f32164b = str;
            this.f32165c = oVar;
            this.f32166d = e2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 g(androidx.compose.runtime.e2 e2Var, a2.o oVar) {
            ju.t.f(oVar, "focusState");
            if (oVar.b()) {
                r6.d(e2Var, j3.t0.h(r6.c(e2Var), null, e3.h3.b(0, r6.c(e2Var).m().length()), null, 5, null));
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 h(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
            ju.t.f(t0Var, "newValue");
            r6.d(e2Var, t0Var);
            return ut.m0.f82633a;
        }

        public final void e(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1755815204, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.CreateTagDialog.<anonymous> (CreateTagDialog.kt:70)");
            }
            j3.t0 t0VarC = r6.c(this.f32166d);
            mVar.W(583742925);
            String strB = this.f32163a ? this.f32164b : z2.h.b(R.string.new_tag, mVar, 6);
            mVar.Q();
            v1.m mVarA = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), this.f32165c);
            mVar.W(5004770);
            final androidx.compose.runtime.e2 e2Var = this.f32166d;
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.s6
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return r6.d.g(e2Var, (a2.o) obj);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            v1.m mVarA2 = androidx.compose.ui.focus.e.a(mVarA, (iu.l) objD);
            mVar.W(5004770);
            final androidx.compose.runtime.e2 e2Var2 = this.f32166d;
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.t6
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return r6.d.h(e2Var2, (j3.t0) obj);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            bk.b6.c(t0VarC, (iu.l) objD2, mVarA2, false, false, null, null, strB, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, null, mVar, 48, 0, 0, 16777080);
            ut.m0 m0Var = ut.m0.f82633a;
            mVar.W(-1633490746);
            androidx.compose.ui.focus.o oVar = this.f32165c;
            androidx.compose.runtime.e2 e2Var3 = this.f32166d;
            Object objD3 = mVar.D();
            if (objD3 == aVar.a()) {
                objD3 = new a(oVar, e2Var3, null);
                mVar.t(objD3);
            }
            mVar.Q();
            androidx.compose.runtime.a1.e(m0Var, (iu.p) objD3, mVar, 6);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((androidx.compose.runtime.m) obj, ((Number) obj2).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final iu.a r22, final java.lang.String r23, final iu.l r24, v1.m r25, androidx.compose.runtime.m r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.r6.b(iu.a, java.lang.String, iu.l, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 c(androidx.compose.runtime.e2 e2Var) {
        return (j3.t0) e2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.runtime.e2 e2Var, j3.t0 t0Var) {
        e2Var.setValue(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(iu.a aVar, String str, iu.l lVar, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        b(aVar, str, lVar, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}

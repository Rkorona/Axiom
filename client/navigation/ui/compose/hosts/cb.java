package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.crystalnix.termius.libtermius.wrappers.sftp.modern.LibTermiusFileReader;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.cb;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cb {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f31050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f31051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.a f31052d;

        a(boolean z10, List list, op.n nVar, iu.a aVar) {
            this.f31049a = z10;
            this.f31050b = list;
            this.f31051c = nVar;
            this.f31052d = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1410725234, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:156)");
            }
            cb.E(this.f31049a, this.f31050b, this.f31051c, this.f31052d, mVar, op.n.f69484c << 6);
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
        final /* synthetic */ iu.a A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j3.t0 f31057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iu.l f31058f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ iu.a f31059u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ iu.a f31060v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ iu.a f31061w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f31062x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f31063y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ iu.l f31064z;

        b(boolean z10, boolean z11, boolean z12, String str, j3.t0 t0Var, iu.l lVar, iu.a aVar, iu.a aVar2, iu.a aVar3, TermiusSortType termiusSortType, boolean z13, iu.l lVar2, iu.a aVar4) {
            this.f31053a = z10;
            this.f31054b = z11;
            this.f31055c = z12;
            this.f31056d = str;
            this.f31057e = t0Var;
            this.f31058f = lVar;
            this.f31059u = aVar;
            this.f31060v = aVar2;
            this.f31061w = aVar3;
            this.f31062x = termiusSortType;
            this.f31063y = z13;
            this.f31064z = lVar2;
            this.A = aVar4;
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$CenterAlignedTopAppBar");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-238472023, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:139)");
            }
            cb.u(this.f31053a, this.f31054b, this.f31055c, this.f31056d, this.f31057e, this.f31058f, this.f31059u, this.f31060v, this.f31061w, this.f31062x, this.f31063y, this.f31064z, this.A, mVar, 0, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((z.w0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f31066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f31067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f31069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iu.l f31070f;

        c(boolean z10, List list, iu.a aVar, boolean z11, iu.a aVar2, iu.l lVar) {
            this.f31065a = z10;
            this.f31066b = list;
            this.f31067c = aVar;
            this.f31068d = z11;
            this.f31069e = aVar2;
            this.f31070f = lVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-94234842, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:86)");
            }
            cb.G(this.f31065a, this.f31066b, this.f31067c, this.f31068d, false, this.f31069e, this.f31070f, mVar, 24576, 0);
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
        final /* synthetic */ boolean f31071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f31072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ op.n f31073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.a f31074d;

        d(boolean z10, List list, op.n nVar, iu.a aVar) {
            this.f31071a = z10;
            this.f31072b = list;
            this.f31073c = nVar;
            this.f31074d = aVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-755129816, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:115)");
            }
            cb.E(this.f31071a, this.f31072b, this.f31073c, this.f31074d, mVar, op.n.f69484c << 6);
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

    static final class e implements iu.q {
        final /* synthetic */ iu.a A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j3.t0 f31079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iu.l f31080f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ iu.a f31081u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ iu.a f31082v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ iu.a f31083w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ TermiusSortType f31084x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f31085y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ iu.l f31086z;

        e(boolean z10, boolean z11, boolean z12, String str, j3.t0 t0Var, iu.l lVar, iu.a aVar, iu.a aVar2, iu.a aVar3, TermiusSortType termiusSortType, boolean z13, iu.l lVar2, iu.a aVar4) {
            this.f31075a = z10;
            this.f31076b = z11;
            this.f31077c = z12;
            this.f31078d = str;
            this.f31079e = t0Var;
            this.f31080f = lVar;
            this.f31081u = aVar;
            this.f31082v = aVar2;
            this.f31083w = aVar3;
            this.f31084x = termiusSortType;
            this.f31085y = z13;
            this.f31086z = lVar2;
            this.A = aVar4;
        }

        public final void b(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(w0Var, "$this$TopAppBar");
            if ((i10 & 17) == 16 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-84295855, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:98)");
            }
            cb.u(this.f31075a, this.f31076b, this.f31077c, this.f31078d, this.f31079e, this.f31080f, this.f31081u, this.f31082v, this.f31083w, this.f31084x, this.f31085y, this.f31086z, this.A, mVar, 0, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((z.w0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class f implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f31088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f31089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f31091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ iu.l f31092f;

        f(boolean z10, List list, iu.a aVar, boolean z11, iu.a aVar2, iu.l lVar) {
            this.f31087a = z10;
            this.f31088b = list;
            this.f31089c = aVar;
            this.f31090d = z11;
            this.f31091e = aVar2;
            this.f31092f = lVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-2023549516, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenBaseModeTopAppBar.<anonymous> (HostsScreenBaseModeTopAppBar.kt:127)");
            }
            cb.G(this.f31087a, this.f31088b, this.f31089c, this.f31090d, true, this.f31091e, this.f31092f, mVar, 24576, 0);
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

    static final class g implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3.t0 f31093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.l f31094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.a f31095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31097e;

        g(j3.t0 t0Var, iu.l lVar, iu.a aVar, boolean z10, String str) {
            this.f31093a = t0Var;
            this.f31094b = lVar;
            this.f31095c = aVar;
            this.f31096d = z10;
            this.f31097e = str;
        }

        private static final boolean h(androidx.compose.runtime.e2 e2Var) {
            return ((Boolean) e2Var.getValue()).booleanValue();
        }

        private static final void i(androidx.compose.runtime.e2 e2Var, boolean z10) {
            e2Var.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var, s2.r rVar) {
            ju.t.f(rVar, "it");
            if (!h(e2Var)) {
                androidx.compose.ui.focus.o.g(oVar, 0, 1, null);
                i(e2Var, true);
            }
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 l(iu.a aVar, iu.l lVar) {
            aVar.a();
            lVar.invoke(new j3.t0((String) null, 0L, (e3.g3) null, 7, (ju.k) null));
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m() {
            return ut.m0.f82633a;
        }

        public final void g(q.e eVar, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(eVar, "$this$AnimatedVisibility");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-882066542, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenTopBarActions.<anonymous> (HostsScreenBaseModeTopAppBar.kt:235)");
            }
            mVar.W(1849434622);
            Object objD = mVar.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = new androidx.compose.ui.focus.o();
                mVar.t(objD);
            }
            final androidx.compose.ui.focus.o oVar = (androidx.compose.ui.focus.o) objD;
            mVar.Q();
            mVar.W(1849434622);
            Object objD2 = mVar.D();
            if (objD2 == aVar.a()) {
                objD2 = androidx.compose.runtime.f5.e(Boolean.FALSE, null, 2, null);
                mVar.t(objD2);
            }
            final androidx.compose.runtime.e2 e2Var = (androidx.compose.runtime.e2) objD2;
            mVar.Q();
            float f10 = 4;
            v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), oVar), q3.h.m(f10), 0.0f, q3.h.m(f10), 0.0f, 10, null);
            mVar.W(-1633490746);
            Object objD3 = mVar.D();
            if (objD3 == aVar.a()) {
                objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.db
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return cb.g.k(oVar, e2Var, (s2.r) obj);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            v1.m mVarA = androidx.compose.ui.layout.q.a(mVarR, (iu.l) objD3);
            j3.t0 t0Var = this.f31093a;
            iu.l lVar = this.f31094b;
            mVar.W(-1633490746);
            boolean zV = mVar.V(this.f31095c) | mVar.V(this.f31094b);
            final iu.a aVar2 = this.f31095c;
            final iu.l lVar2 = this.f31094b;
            Object objD4 = mVar.D();
            if (zV || objD4 == aVar.a()) {
                objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.eb
                    @Override // iu.a
                    public final Object a() {
                        return cb.g.l(aVar2, lVar2);
                    }
                };
                mVar.t(objD4);
            }
            iu.a aVar3 = (iu.a) objD4;
            mVar.Q();
            mVar.W(1849434622);
            Object objD5 = mVar.D();
            if (objD5 == aVar.a()) {
                objD5 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.fb
                    @Override // iu.a
                    public final Object a() {
                        return cb.g.m();
                    }
                };
                mVar.t(objD5);
            }
            mVar.Q();
            bk.v5.h(t0Var, true, lVar, aVar3, (iu.a) objD5, mVarA, this.f31096d, false, false, null, this.f31097e, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, mVar, 24624, 805306368, 0, 33028992);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            g((q.e) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f31099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.e2 f31100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(iu.a aVar, androidx.compose.runtime.e2 e2Var, zt.e eVar) {
            super(2, eVar);
            this.f31099b = aVar;
            this.f31100c = e2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f31099b, this.f31100c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f31098a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (cb.v(this.f31100c)) {
                this.f31099b.a();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 A(boolean z10, androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var, s2.r rVar) {
        ju.t.f(rVar, "it");
        if (!x(e2Var) && z10) {
            androidx.compose.ui.focus.o.g(oVar, 0, 1, null);
            y(e2Var, true);
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 B(iu.a aVar, a2.h hVar, iu.l lVar) {
        aVar.a();
        a2.h.e(hVar, false, 1, null);
        lVar.invoke(new j3.t0((String) null, 0L, (e3.g3) null, 7, (ju.k) null));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 C(androidx.compose.ui.focus.o oVar) {
        androidx.compose.ui.focus.o.g(oVar, 0, 1, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 D(boolean z10, boolean z11, boolean z12, String str, j3.t0 t0Var, iu.l lVar, iu.a aVar, iu.a aVar2, iu.a aVar3, TermiusSortType termiusSortType, boolean z13, iu.l lVar2, iu.a aVar4, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        u(z10, z11, z12, str, t0Var, lVar, aVar, aVar2, aVar3, termiusSortType, z13, lVar2, aVar4, mVar, androidx.compose.runtime.e3.a(i10 | 1), androidx.compose.runtime.e3.a(i11));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final boolean z10, final List list, op.n nVar, iu.a aVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        final op.n nVar2;
        final iu.a aVar2;
        androidx.compose.runtime.m mVarG = mVar.g(-1904669693);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(list) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= (i10 & File.FLAG_O_TRUNC) == 0 ? mVarG.V(nVar) : mVarG.F(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= mVarG.F(aVar) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i11 & 1171) == 1170 && mVarG.h()) {
            mVarG.M();
            aVar2 = aVar;
            nVar2 = nVar;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1904669693, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenTopBarNavigationIcon (HostsScreenBaseModeTopAppBar.kt:337)");
            }
            if (z10 || !list.isEmpty()) {
                int i12 = i11 >> 3;
                bk.g6.b(list.isEmpty(), nVar, aVar, mVarG, (op.n.f69484c << 3) | (i12 & 112) | (i12 & 896), 0);
                nVar2 = nVar;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                nVar2 = nVar;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ya
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return cb.F(z10, list, nVar2, aVar2, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 F(boolean z10, List list, op.n nVar, iu.a aVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        E(z10, list, nVar, aVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final boolean r35, final java.util.List r36, final iu.a r37, boolean r38, final boolean r39, final iu.a r40, final iu.l r41, androidx.compose.runtime.m r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.cb.G(boolean, java.util.List, iu.a, boolean, boolean, iu.a, iu.l, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 H(boolean z10, List list, iu.a aVar, boolean z11, boolean z12, iu.a aVar2, iu.l lVar, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        G(z10, list, aVar, z11, z12, aVar2, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    private static final a1.cg M(androidx.compose.runtime.m mVar, int i10) {
        mVar.W(-1835791926);
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.b0(-1835791926, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.hostsScreenTopBarColors (HostsScreenBaseModeTopAppBar.kt:202)");
        }
        a1.eg egVar = a1.eg.f658a;
        a1.q5 q5Var = a1.q5.f1818a;
        int i11 = a1.q5.f1819b;
        a1.cg cgVarE = egVar.e(q5Var.a(mVar, i11).Z(), q5Var.a(mVar, i11).R(), 0L, 0L, 0L, mVar, a1.eg.f668k << 15, 28);
        if (androidx.compose.runtime.w.R()) {
            androidx.compose.runtime.w.a0();
        }
        mVar.Q();
        return cgVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final java.lang.String r38, v1.m r39, final boolean r40, boolean r41, final java.util.List r42, final java.lang.String r43, boolean r44, iu.a r45, iu.a r46, final j3.t0 r47, final iu.l r48, final iu.a r49, iu.a r50, iu.a r51, iu.a r52, final com.server.auditor.ssh.client.utils.sort.TermiusSortType r53, final op.n r54, final boolean r55, final iu.a r56, final iu.l r57, final boolean r58, final iu.l r59, final iu.a r60, androidx.compose.runtime.m r61, final int r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instruction units count: 1381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.cb.n(java.lang.String, v1.m, boolean, boolean, java.util.List, java.lang.String, boolean, iu.a, iu.a, j3.t0, iu.l, iu.a, iu.a, iu.a, iu.a, com.server.auditor.ssh.client.utils.sort.TermiusSortType, op.n, boolean, iu.a, iu.l, boolean, iu.l, iu.a, androidx.compose.runtime.m, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 p(String str, v1.m mVar, boolean z10, boolean z11, List list, String str2, boolean z12, iu.a aVar, iu.a aVar2, j3.t0 t0Var, iu.l lVar, iu.a aVar3, iu.a aVar4, iu.a aVar5, iu.a aVar6, TermiusSortType termiusSortType, op.n nVar, boolean z13, iu.a aVar7, iu.l lVar2, boolean z14, iu.l lVar3, iu.a aVar8, int i10, int i11, int i12, int i13, androidx.compose.runtime.m mVar2, int i14) {
        n(str, mVar, z10, z11, list, str2, z12, aVar, aVar2, t0Var, lVar, aVar3, aVar4, aVar5, aVar6, termiusSortType, nVar, z13, aVar7, lVar2, z14, lVar3, aVar8, mVar2, androidx.compose.runtime.e3.a(i10 | 1), androidx.compose.runtime.e3.a(i11), androidx.compose.runtime.e3.a(i12), i13);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 q() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 r() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 s() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 t() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final boolean z10, final boolean z11, final boolean z12, final String str, final j3.t0 t0Var, final iu.l lVar, final iu.a aVar, final iu.a aVar2, final iu.a aVar3, final TermiusSortType termiusSortType, final boolean z13, final iu.l lVar2, final iu.a aVar4, androidx.compose.runtime.m mVar, final int i10, final int i11) {
        int i12;
        j3.t0 t0Var2;
        int i13;
        androidx.compose.runtime.m mVar2;
        androidx.compose.runtime.m mVarG = mVar.g(-2130241174);
        if ((i10 & 6) == 0) {
            i12 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= mVarG.a(z11) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i12 |= mVarG.a(z12) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= mVarG.V(str) ? 2048 : File.FLAG_O_APPEND;
        }
        if ((i10 & 24576) == 0) {
            t0Var2 = t0Var;
            i12 |= mVarG.V(t0Var2) ? 16384 : 8192;
        } else {
            t0Var2 = t0Var;
        }
        if ((i10 & 196608) == 0) {
            i12 |= mVarG.F(lVar) ? 131072 : LibTermiusFileReader.DOWNLOAD_BUFFER_SIZE;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= mVarG.F(aVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= mVarG.F(aVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= mVarG.F(aVar3) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= mVarG.c(termiusSortType.ordinal()) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (mVarG.a(z13) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= mVarG.F(lVar2) ? 32 : 16;
        }
        if ((i11 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i13 |= mVarG.F(aVar4) ? 256 : 128;
        }
        int i15 = i13;
        if ((i14 & 306783379) == 306783378 && (i15 & 147) == 146 && mVarG.h()) {
            mVarG.M();
            mVar2 = mVarG;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-2130241174, i14, i15, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.HostsScreenTopBarActions (HostsScreenBaseModeTopAppBar.kt:224)");
            }
            q.d.h((z10 || z11) && z12, null, androidx.compose.animation.f.o(r.l.l(250, 0, null, 6, null), 0.0f, 2, null).c(androidx.compose.animation.f.i(r.l.l(250, 0, null, 6, null), null, false, null, 14, null)), androidx.compose.animation.f.q(r.l.l(250, 0, null, 6, null), 0.0f, 2, null).c(androidx.compose.animation.f.u(r.l.l(250, 0, null, 6, null), v1.e.f83199a.k(), false, null, 12, null)), null, q1.h.d(-882066542, true, new g(t0Var2, lVar, aVar, z11, str), mVarG, 54), mVarG, 200064, 18);
            if (z10 || z11) {
                mVar2 = mVarG;
                mVar2.W(424076083);
                if (!z12) {
                    int i16 = i14 >> 21;
                    a1.v4.c(aVar2, null, false, null, null, null, p0.f31873a.a(), mVar2, (i16 & 14) | 1572864, 62);
                    int i17 = i15 << 6;
                    ck.j.b(termiusSortType, aVar3, z13, lVar2, aVar4, mVar2, ((i14 >> 27) & 14) | (i16 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                }
                mVar2.Q();
            } else {
                mVarG.W(424724231);
                final a2.h hVar = (a2.h) mVarG.n(androidx.compose.ui.platform.s1.h());
                mVarG.W(1849434622);
                Object objD = mVarG.D();
                m.a aVar5 = androidx.compose.runtime.m.f5359a;
                if (objD == aVar5.a()) {
                    objD = androidx.compose.runtime.f5.e(Boolean.FALSE, null, 2, null);
                    mVarG.t(objD);
                }
                final androidx.compose.runtime.e2 e2Var = (androidx.compose.runtime.e2) objD;
                mVarG.Q();
                Boolean boolValueOf = Boolean.valueOf(v(e2Var));
                mVarG.W(-1633490746);
                boolean z14 = (29360128 & i14) == 8388608;
                Object objD2 = mVarG.D();
                if (z14 || objD2 == aVar5.a()) {
                    objD2 = new h(aVar2, e2Var, null);
                    mVarG.t(objD2);
                }
                mVarG.Q();
                androidx.compose.runtime.a1.e(boolValueOf, (iu.p) objD2, mVarG, 0);
                mVarG.W(1849434622);
                Object objD3 = mVarG.D();
                if (objD3 == aVar5.a()) {
                    objD3 = new androidx.compose.ui.focus.o();
                    mVarG.t(objD3);
                }
                final androidx.compose.ui.focus.o oVar = (androidx.compose.ui.focus.o) objD3;
                mVarG.Q();
                mVarG.W(1849434622);
                Object objD4 = mVarG.D();
                if (objD4 == aVar5.a()) {
                    objD4 = androidx.compose.runtime.f5.e(Boolean.FALSE, null, 2, null);
                    mVarG.t(objD4);
                }
                final androidx.compose.runtime.e2 e2Var2 = (androidx.compose.runtime.e2) objD4;
                mVarG.Q();
                v1.m mVarA = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.i0.h(androidx.compose.foundation.layout.i0.w(v1.m.f83247a, 0.0f, q3.h.m(SyncConstants.ResultCode.MULTIPLE_CHOICES), 1, null), 0.0f, 1, null), oVar);
                mVarG.W(5004770);
                Object objD5 = mVarG.D();
                if (objD5 == aVar5.a()) {
                    objD5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ab
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return cb.z(e2Var, (a2.o) obj);
                        }
                    };
                    mVarG.t(objD5);
                }
                mVarG.Q();
                v1.m mVarA2 = androidx.compose.ui.focus.b.a(mVarA, (iu.l) objD5);
                mVarG.W(-1746271574);
                boolean z15 = (i14 & 896) == 256;
                Object objD6 = mVarG.D();
                if (z15 || objD6 == aVar5.a()) {
                    objD6 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.bb
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return cb.A(z12, oVar, e2Var2, (s2.r) obj);
                        }
                    };
                    mVarG.t(objD6);
                }
                mVarG.Q();
                v1.m mVarA3 = androidx.compose.ui.layout.q.a(mVarA2, (iu.l) objD6);
                mVarG.W(-1746271574);
                boolean zF = ((3670016 & i14) == 1048576) | mVarG.F(hVar) | ((458752 & i14) == 131072);
                Object objD7 = mVarG.D();
                if (zF || objD7 == aVar5.a()) {
                    objD7 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.qa
                        @Override // iu.a
                        public final Object a() {
                            return cb.B(aVar, hVar, lVar);
                        }
                    };
                    mVarG.t(objD7);
                }
                iu.a aVar6 = (iu.a) objD7;
                mVarG.Q();
                mVarG.W(5004770);
                Object objD8 = mVarG.D();
                if (objD8 == aVar5.a()) {
                    objD8 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ra
                        @Override // iu.a
                        public final Object a() {
                            return cb.C(oVar);
                        }
                    };
                    mVarG.t(objD8);
                }
                mVarG.Q();
                int i18 = i14 >> 9;
                bk.v5.h(t0Var, z12, lVar, aVar6, (iu.a) objD8, mVarA3, false, false, false, null, str, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, mVarG, ((i14 >> 12) & 14) | 24576 | ((i14 >> 3) & 112) | (i18 & 896), (i18 & 14) | 805306368, 0, 33029056);
                mVar2 = mVarG;
                int i19 = i15 << 6;
                ck.j.b(termiusSortType, aVar3, z13, lVar2, aVar4, mVar2, ((i14 >> 21) & 112) | ((i14 >> 27) & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344));
                mVar2.Q();
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVar2.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.sa
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return cb.D(z10, z11, z12, str, t0Var, lVar, aVar, aVar2, aVar3, termiusSortType, z13, lVar2, aVar4, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    private static final void w(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean x(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    private static final void y(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 z(androidx.compose.runtime.e2 e2Var, a2.o oVar) {
        ju.t.f(oVar, "it");
        w(e2Var, oVar.b());
        return ut.m0.f82633a;
    }
}

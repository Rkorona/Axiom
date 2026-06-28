package com.server.auditor.ssh.client.navigation.ui.compose.hosts;

import androidx.compose.runtime.m;
import androidx.compose.ui.node.c;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.navigation.ui.compose.hosts.of;
import com.server.auditor.ssh.client.navigation.ui.compose.navigation.HostsNavGraphRoute;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TagSelectScreenViewModel;
import com.server.auditor.ssh.client.utils.sort.TermiusSortType;
import java.util.List;
import java.util.Map;
import v1.e;
import v1.m;
import z.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class of {

    static final class a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f31831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.a f31832b;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of$a$a, reason: collision with other inner class name */
        static final class C0487a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.a f31833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu.a f31834b;

            C0487a(iu.a aVar, iu.a aVar2) {
                this.f31833a = aVar;
                this.f31834b = aVar2;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-892409818, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagItem.<anonymous>.<anonymous>.<anonymous> (TagSelectScreen.kt:412)");
                }
                z.e eVar = z.e.f87467a;
                float f10 = 10;
                e.f fVarO = eVar.o(q3.h.m(f10));
                m.a aVar = v1.m.f83247a;
                v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.foundation.layout.i0.y(aVar, null, false, 3, null), 0.0f, q3.h.m(f10), 0.0f, q3.h.m(f10), 5, null);
                iu.a aVar2 = this.f31833a;
                iu.a aVar3 = this.f31834b;
                e.a aVar4 = v1.e.f83199a;
                s2.e0 e0VarA = z.m.a(fVarO, aVar4.k(), mVar, 6);
                int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                androidx.compose.runtime.i0 i0VarR = mVar.r();
                v1.m mVarE = v1.k.e(mVar, mVarR);
                c.a aVar5 = androidx.compose.ui.node.c.f6166i;
                iu.a aVarA = aVar5.a();
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
                androidx.compose.runtime.q5.e(mVarB, e0VarA, aVar5.c());
                androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar5.e());
                iu.p pVarB = aVar5.b();
                if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                    mVarB.t(Integer.valueOf(iHashCode));
                    mVarB.m(Integer.valueOf(iHashCode), pVarB);
                }
                androidx.compose.runtime.q5.e(mVarB, mVarE, aVar5.d());
                z.q qVar = z.q.f87592a;
                float f11 = 20;
                v1.m mVarQ = androidx.compose.foundation.layout.c0.q(androidx.compose.foundation.layout.i0.h(androidx.compose.foundation.e.j(aVar, false, null, null, null, aVar2, 15, null), 0.0f, 1, null), q3.h.m(f11), q3.h.m(f10), q3.h.m(f11), q3.h.m(f10));
                s2.e0 e0VarB = z.t0.b(eVar.g(), aVar4.i(), mVar, 48);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                androidx.compose.runtime.i0 i0VarR2 = mVar.r();
                v1.m mVarE2 = v1.k.e(mVar, mVarQ);
                iu.a aVarA2 = aVar5.a();
                if (mVar.i() == null) {
                    androidx.compose.runtime.h.d();
                }
                mVar.I();
                if (mVar.e()) {
                    mVar.u(aVarA2);
                } else {
                    mVar.s();
                }
                androidx.compose.runtime.m mVarB2 = androidx.compose.runtime.q5.b(mVar);
                androidx.compose.runtime.q5.e(mVarB2, e0VarB, aVar5.c());
                androidx.compose.runtime.q5.e(mVarB2, i0VarR2, aVar5.e());
                iu.p pVarB2 = aVar5.b();
                if (mVarB2.e() || !ju.t.b(mVarB2.D(), Integer.valueOf(iHashCode2))) {
                    mVarB2.t(Integer.valueOf(iHashCode2));
                    mVarB2.m(Integer.valueOf(iHashCode2), pVarB2);
                }
                androidx.compose.runtime.q5.e(mVarB2, mVarE2, aVar5.d());
                z.x0 x0Var = z.x0.f87621a;
                float f12 = 16;
                v1.m mVarP = androidx.compose.foundation.layout.i0.p(aVar, q3.h.m(f12));
                u0.a aVar6 = u0.a.f81262a;
                h2.d dVarA = w0.h.a(aVar6.a());
                qk.a aVar7 = qk.a.f74718a;
                a1.z4.e(dVarA, null, mVarP, aVar7.a(mVar, 6).r(), mVar, 432, 0);
                z.y0.a(androidx.compose.foundation.layout.i0.u(aVar, q3.h.m(f10)), mVar, 6);
                a1.lf.j(z2.h.b(R.string.edit_tag, mVar, 6), androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), aVar7.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.b(mVar, 6).a(), mVar, 48, 0, 131064);
                mVar.w();
                v1.m mVarQ2 = androidx.compose.foundation.layout.c0.q(androidx.compose.foundation.layout.i0.h(androidx.compose.foundation.e.j(aVar, false, null, null, null, aVar3, 15, null), 0.0f, 1, null), q3.h.m(f11), q3.h.m(f10), q3.h.m(f11), q3.h.m(f10));
                s2.e0 e0VarB2 = z.t0.b(eVar.g(), aVar4.i(), mVar, 48);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                androidx.compose.runtime.i0 i0VarR3 = mVar.r();
                v1.m mVarE3 = v1.k.e(mVar, mVarQ2);
                iu.a aVarA3 = aVar5.a();
                if (mVar.i() == null) {
                    androidx.compose.runtime.h.d();
                }
                mVar.I();
                if (mVar.e()) {
                    mVar.u(aVarA3);
                } else {
                    mVar.s();
                }
                androidx.compose.runtime.m mVarB3 = androidx.compose.runtime.q5.b(mVar);
                androidx.compose.runtime.q5.e(mVarB3, e0VarB2, aVar5.c());
                androidx.compose.runtime.q5.e(mVarB3, i0VarR3, aVar5.e());
                iu.p pVarB3 = aVar5.b();
                if (mVarB3.e() || !ju.t.b(mVarB3.D(), Integer.valueOf(iHashCode3))) {
                    mVarB3.t(Integer.valueOf(iHashCode3));
                    mVarB3.m(Integer.valueOf(iHashCode3), pVarB3);
                }
                androidx.compose.runtime.q5.e(mVarB3, mVarE3, aVar5.d());
                a1.z4.e(w0.f.a(aVar6.a()), null, androidx.compose.foundation.layout.i0.p(aVar, q3.h.m(f12)), aVar7.a(mVar, 6).r(), mVar, 432, 0);
                z.y0.a(androidx.compose.foundation.layout.i0.u(aVar, q3.h.m(f10)), mVar, 6);
                a1.lf.j(z2.h.b(R.string.remove, mVar, 6), androidx.compose.foundation.layout.i0.h(aVar, 0.0f, 1, null), aVar7.a(mVar, 6).q(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.b(mVar, 6).a(), mVar, 48, 0, 131064);
                mVar.w();
                mVar.w();
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

        a(iu.a aVar, iu.a aVar2) {
            this.f31831a = aVar;
            this.f31832b = aVar2;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-2077466421, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagItem.<anonymous>.<anonymous> (TagSelectScreen.kt:406)");
            }
            a1.je.c(androidx.compose.foundation.layout.i0.u(v1.m.f83247a, q3.h.m(130)), g0.g.c(q3.h.m(20)), qk.a.f74718a.a(mVar, 6).i(), 0L, 0.0f, q3.h.m(3), null, q1.h.d(-892409818, true, new C0487a(this.f31831a, this.f31832b), mVar, 54), mVar, 12779526, 88);
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

    static final class b implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f31837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ iu.a f31839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TagSelectScreenViewModel f31840f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31841u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31842v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31843w;

        static final class a implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31844a;

            a(androidx.compose.runtime.l5 l5Var) {
                this.f31844a = l5Var;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(1509926331, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous>.<anonymous> (TagSelectScreen.kt:134)");
                }
                if (!of.N(this.f31844a)) {
                    a1.lf.j(z2.h.b(R.string.select_tags, mVar, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, qk.a.f74718a.b(mVar, 6).j(), mVar, 0, 0, 131070);
                }
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

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of$b$b, reason: collision with other inner class name */
        static final class C0488b implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ iu.l f31845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iu.a f31847c;

            C0488b(iu.l lVar, androidx.compose.runtime.l5 l5Var, iu.a aVar) {
                this.f31845a = lVar;
                this.f31846b = l5Var;
                this.f31847c = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 e(iu.l lVar, iu.a aVar, androidx.compose.runtime.l5 l5Var) {
                lVar.invoke(of.J(l5Var));
                aVar.a();
                return ut.m0.f82633a;
            }

            public final void d(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1238957063, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous>.<anonymous> (TagSelectScreen.kt:209)");
                }
                mVar.W(-1746271574);
                boolean zV = mVar.V(this.f31845a) | mVar.V(this.f31846b) | mVar.V(this.f31847c);
                final iu.l lVar = this.f31845a;
                final iu.a aVar = this.f31847c;
                final androidx.compose.runtime.l5 l5Var = this.f31846b;
                Object objD = mVar.D();
                if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.pf
                        @Override // iu.a
                        public final Object a() {
                            return of.b.C0488b.e(lVar, aVar, l5Var);
                        }
                    };
                    mVar.t(objD);
                }
                mVar.Q();
                a1.v4.c((iu.a) objD, null, false, null, null, null, f1.f31189a.a(), mVar, 1572864, 62);
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

        static final class c implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TagSelectScreenViewModel f31848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31850c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31851d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.l5 f31852e;

            static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f31853a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ TagSelectScreenViewModel f31854b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.e2 f31855c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(TagSelectScreenViewModel tagSelectScreenViewModel, androidx.compose.runtime.e2 e2Var, zt.e eVar) {
                    super(2, eVar);
                    this.f31854b = tagSelectScreenViewModel;
                    this.f31855c = e2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zt.e create(Object obj, zt.e eVar) {
                    return new a(this.f31854b, this.f31855c, eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    au.b.f();
                    if (this.f31853a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                    if (c.B(this.f31855c)) {
                        this.f31854b.showSearch();
                    }
                    return ut.m0.f82633a;
                }

                @Override // iu.p
                public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                    return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                }
            }

            c(TagSelectScreenViewModel tagSelectScreenViewModel, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4) {
                this.f31848a = tagSelectScreenViewModel;
                this.f31849b = l5Var;
                this.f31850c = l5Var2;
                this.f31851d = l5Var3;
                this.f31852e = l5Var4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 A(TagSelectScreenViewModel tagSelectScreenViewModel) {
                tagSelectScreenViewModel.onDismissSortTypeSelector();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean B(androidx.compose.runtime.e2 e2Var) {
                return ((Boolean) e2Var.getValue()).booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 p(TagSelectScreenViewModel tagSelectScreenViewModel) {
                tagSelectScreenViewModel.showSearch();
                return ut.m0.f82633a;
            }

            private static final void q(androidx.compose.runtime.e2 e2Var, boolean z10) {
                e2Var.setValue(Boolean.valueOf(z10));
            }

            private static final boolean r(androidx.compose.runtime.e2 e2Var) {
                return ((Boolean) e2Var.getValue()).booleanValue();
            }

            private static final void s(androidx.compose.runtime.e2 e2Var, boolean z10) {
                e2Var.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 t(androidx.compose.runtime.e2 e2Var, a2.o oVar) {
                ju.t.f(oVar, "it");
                q(e2Var, oVar.b());
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 u(androidx.compose.ui.focus.o oVar, androidx.compose.runtime.e2 e2Var, s2.r rVar) {
                ju.t.f(rVar, "it");
                if (r(e2Var)) {
                    androidx.compose.ui.focus.o.g(oVar, 0, 1, null);
                    s(e2Var, false);
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 v(TagSelectScreenViewModel tagSelectScreenViewModel, j3.t0 t0Var) {
                ju.t.f(t0Var, "it");
                tagSelectScreenViewModel.onSearchQueryChanged(t0Var);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 w(TagSelectScreenViewModel tagSelectScreenViewModel, a2.h hVar) {
                tagSelectScreenViewModel.onDismissSearch();
                a2.h.e(hVar, false, 1, null);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 x(androidx.compose.ui.focus.o oVar) {
                androidx.compose.ui.focus.o.g(oVar, 0, 1, null);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 y(TagSelectScreenViewModel tagSelectScreenViewModel) {
                tagSelectScreenViewModel.onSortingClicked();
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 z(TagSelectScreenViewModel tagSelectScreenViewModel, TermiusSortType termiusSortType) {
                ju.t.f(termiusSortType, "it");
                tagSelectScreenViewModel.onSortingChanged(termiusSortType);
                return ut.m0.f82633a;
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                o((z.w0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }

            public final void o(z.w0 w0Var, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(w0Var, "$this$TopAppBar");
                if ((i10 & 17) == 16 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-2107521936, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous>.<anonymous> (TagSelectScreen.kt:142)");
                }
                if (of.N(this.f31849b)) {
                    mVar.W(-1352916996);
                    final a2.h hVar = (a2.h) mVar.n(androidx.compose.ui.platform.s1.h());
                    mVar.W(1849434622);
                    Object objD = mVar.D();
                    m.a aVar = androidx.compose.runtime.m.f5359a;
                    if (objD == aVar.a()) {
                        objD = androidx.compose.runtime.f5.e(Boolean.FALSE, null, 2, null);
                        mVar.t(objD);
                    }
                    final androidx.compose.runtime.e2 e2Var = (androidx.compose.runtime.e2) objD;
                    mVar.Q();
                    Boolean boolValueOf = Boolean.valueOf(B(e2Var));
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f31848a);
                    TagSelectScreenViewModel tagSelectScreenViewModel = this.f31848a;
                    Object objD2 = mVar.D();
                    if (zF || objD2 == aVar.a()) {
                        objD2 = new a(tagSelectScreenViewModel, e2Var, null);
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    androidx.compose.runtime.a1.e(boolValueOf, (iu.p) objD2, mVar, 0);
                    mVar.W(1849434622);
                    Object objD3 = mVar.D();
                    if (objD3 == aVar.a()) {
                        objD3 = new androidx.compose.ui.focus.o();
                        mVar.t(objD3);
                    }
                    final androidx.compose.ui.focus.o oVar = (androidx.compose.ui.focus.o) objD3;
                    mVar.Q();
                    mVar.W(1849434622);
                    Object objD4 = mVar.D();
                    if (objD4 == aVar.a()) {
                        objD4 = androidx.compose.runtime.f5.e(Boolean.TRUE, null, 2, null);
                        mVar.t(objD4);
                    }
                    final androidx.compose.runtime.e2 e2Var2 = (androidx.compose.runtime.e2) objD4;
                    mVar.Q();
                    j3.t0 t0VarO = of.O(this.f31852e);
                    v1.m mVarR = androidx.compose.foundation.layout.c0.r(androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.i0.h(v1.m.f83247a, 0.0f, 1, null), oVar), q3.h.m(4), 0.0f, 0.0f, 0.0f, 14, null);
                    mVar.W(5004770);
                    Object objD5 = mVar.D();
                    if (objD5 == aVar.a()) {
                        objD5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.uf
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return of.b.c.t(e2Var, (a2.o) obj);
                            }
                        };
                        mVar.t(objD5);
                    }
                    mVar.Q();
                    v1.m mVarA = androidx.compose.ui.focus.b.a(mVarR, (iu.l) objD5);
                    mVar.W(-1633490746);
                    Object objD6 = mVar.D();
                    if (objD6 == aVar.a()) {
                        objD6 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.vf
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return of.b.c.u(oVar, e2Var2, (s2.r) obj);
                            }
                        };
                        mVar.t(objD6);
                    }
                    mVar.Q();
                    v1.m mVarA2 = androidx.compose.ui.layout.q.a(mVarA, (iu.l) objD6);
                    String strB = z2.h.b(R.string.search_hosts_and_groups_placeholder, mVar, 6);
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f31848a);
                    final TagSelectScreenViewModel tagSelectScreenViewModel2 = this.f31848a;
                    Object objD7 = mVar.D();
                    if (zF2 || objD7 == aVar.a()) {
                        objD7 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.wf
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return of.b.c.v(tagSelectScreenViewModel2, (j3.t0) obj);
                            }
                        };
                        mVar.t(objD7);
                    }
                    iu.l lVar = (iu.l) objD7;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF3 = mVar.F(this.f31848a) | mVar.F(hVar);
                    final TagSelectScreenViewModel tagSelectScreenViewModel3 = this.f31848a;
                    Object objD8 = mVar.D();
                    if (zF3 || objD8 == aVar.a()) {
                        objD8 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.xf
                            @Override // iu.a
                            public final Object a() {
                                return of.b.c.w(tagSelectScreenViewModel3, hVar);
                            }
                        };
                        mVar.t(objD8);
                    }
                    iu.a aVar2 = (iu.a) objD8;
                    mVar.Q();
                    mVar.W(5004770);
                    Object objD9 = mVar.D();
                    if (objD9 == aVar.a()) {
                        objD9 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.yf
                            @Override // iu.a
                            public final Object a() {
                                return of.b.c.x(oVar);
                            }
                        };
                        mVar.t(objD9);
                    }
                    mVar.Q();
                    bk.v5.h(t0VarO, true, lVar, aVar2, (iu.a) objD9, mVarA2, false, false, false, null, strB, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, mVar, 24624, 805306368, 0, 33029056);
                    mVar.Q();
                } else {
                    mVar.W(-1353989472);
                    mVar.W(5004770);
                    boolean zF4 = mVar.F(this.f31848a);
                    final TagSelectScreenViewModel tagSelectScreenViewModel4 = this.f31848a;
                    Object objD10 = mVar.D();
                    if (zF4 || objD10 == androidx.compose.runtime.m.f5359a.a()) {
                        objD10 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.qf
                            @Override // iu.a
                            public final Object a() {
                                return of.b.c.p(tagSelectScreenViewModel4);
                            }
                        };
                        mVar.t(objD10);
                    }
                    mVar.Q();
                    a1.v4.c((iu.a) objD10, null, false, null, null, null, f1.f31189a.b(), mVar, 1572864, 62);
                    TermiusSortType termiusSortTypeP = of.P(this.f31850c);
                    mVar.W(5004770);
                    boolean zF5 = mVar.F(this.f31848a);
                    final TagSelectScreenViewModel tagSelectScreenViewModel5 = this.f31848a;
                    Object objD11 = mVar.D();
                    if (zF5 || objD11 == androidx.compose.runtime.m.f5359a.a()) {
                        objD11 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.rf
                            @Override // iu.a
                            public final Object a() {
                                return of.b.c.y(tagSelectScreenViewModel5);
                            }
                        };
                        mVar.t(objD11);
                    }
                    iu.a aVar3 = (iu.a) objD11;
                    mVar.Q();
                    boolean zQ = of.Q(this.f31851d);
                    mVar.W(5004770);
                    boolean zF6 = mVar.F(this.f31848a);
                    final TagSelectScreenViewModel tagSelectScreenViewModel6 = this.f31848a;
                    Object objD12 = mVar.D();
                    if (zF6 || objD12 == androidx.compose.runtime.m.f5359a.a()) {
                        objD12 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.sf
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return of.b.c.z(tagSelectScreenViewModel6, (TermiusSortType) obj);
                            }
                        };
                        mVar.t(objD12);
                    }
                    iu.l lVar2 = (iu.l) objD12;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF7 = mVar.F(this.f31848a);
                    final TagSelectScreenViewModel tagSelectScreenViewModel7 = this.f31848a;
                    Object objD13 = mVar.D();
                    if (zF7 || objD13 == androidx.compose.runtime.m.f5359a.a()) {
                        objD13 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.tf
                            @Override // iu.a
                            public final Object a() {
                                return of.b.c.A(tagSelectScreenViewModel7);
                            }
                        };
                        mVar.t(objD13);
                    }
                    mVar.Q();
                    ck.j.b(termiusSortTypeP, aVar3, zQ, lVar2, (iu.a) objD13, mVar, 0);
                    mVar.Q();
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }
        }

        b(boolean z10, androidx.compose.runtime.l5 l5Var, iu.l lVar, androidx.compose.runtime.l5 l5Var2, iu.a aVar, TagSelectScreenViewModel tagSelectScreenViewModel, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, androidx.compose.runtime.l5 l5Var5) {
            this.f31835a = z10;
            this.f31836b = l5Var;
            this.f31837c = lVar;
            this.f31838d = l5Var2;
            this.f31839e = aVar;
            this.f31840f = tagSelectScreenViewModel;
            this.f31841u = l5Var3;
            this.f31842v = l5Var4;
            this.f31843w = l5Var5;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            long j10;
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1743624447, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous> (TagSelectScreen.kt:125)");
            }
            a1.eg egVar = a1.eg.f658a;
            if (this.f31835a) {
                mVar.W(981561418);
                j10 = qk.a.f74718a.a(mVar, 6).k();
                mVar.Q();
            } else {
                mVar.W(981655627);
                j10 = qk.a.f74718a.a(mVar, 6).j();
                mVar.Q();
            }
            a1.d0.u(q1.h.d(1509926331, true, new a(this.f31836b), mVar, 54), null, q1.h.d(-1238957063, true, new C0488b(this.f31837c, this.f31838d, this.f31839e), mVar, 54), q1.h.d(-2107521936, true, new c(this.f31840f, this.f31836b, this.f31841u, this.f31842v, this.f31843w), mVar, 54), 0.0f, null, egVar.i(j10, 0L, 0L, 0L, 0L, 0L, mVar, a1.eg.f668k << 18, 62), null, mVar, 3462, 178);
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
        final /* synthetic */ TagSelectScreenViewModel f31856a;

        c(TagSelectScreenViewModel tagSelectScreenViewModel) {
            this.f31856a = tagSelectScreenViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 e(TagSelectScreenViewModel tagSelectScreenViewModel) {
            tagSelectScreenViewModel.showCreateTagDialog();
            return ut.m0.f82633a;
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(662245314, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous> (TagSelectScreen.kt:222)");
            }
            mVar.W(5004770);
            boolean zF = mVar.F(this.f31856a);
            final TagSelectScreenViewModel tagSelectScreenViewModel = this.f31856a;
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.zf
                    @Override // iu.a
                    public final Object a() {
                        return of.c.e(tagSelectScreenViewModel);
                    }
                };
                mVar.t(objD);
            }
            mVar.Q();
            com.server.auditor.ssh.client.navigation.ui.compose.m1.f(null, (iu.a) objD, mVar, 0, 1);
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

    static final class d implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f31857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TagSelectScreenViewModel f31858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31862f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f31863u;

        d(boolean z10, TagSelectScreenViewModel tagSelectScreenViewModel, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, androidx.compose.runtime.l5 l5Var5) {
            this.f31857a = z10;
            this.f31858b = tagSelectScreenViewModel;
            this.f31859c = l5Var;
            this.f31860d = l5Var2;
            this.f31861e = l5Var3;
            this.f31862f = l5Var4;
            this.f31863u = l5Var5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 l(TagSelectScreenViewModel tagSelectScreenViewModel, String str) {
            ju.t.f(str, "it");
            tagSelectScreenViewModel.onConfirmCreateTag(str);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m(TagSelectScreenViewModel tagSelectScreenViewModel) {
            tagSelectScreenViewModel.dismissNotEnoughPermissionsDialog();
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 n(TagSelectScreenViewModel tagSelectScreenViewModel, long j10) {
            tagSelectScreenViewModel.showTagEdit(j10);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 o(TagSelectScreenViewModel tagSelectScreenViewModel, long j10) {
            tagSelectScreenViewModel.onRemoveTagClick(j10);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 p(TagSelectScreenViewModel tagSelectScreenViewModel, long j10) {
            tagSelectScreenViewModel.onTagClicked(j10);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 q(TagSelectScreenViewModel tagSelectScreenViewModel) {
            tagSelectScreenViewModel.dismissCreateTagDialog();
            return ut.m0.f82633a;
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            k((z.n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }

        public final void k(z.n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
            int i11;
            long j10;
            ju.t.f(n0Var, "innerPaddings");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(n0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1316345482, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagSelectScreen.<anonymous> (TagSelectScreen.kt:229)");
            }
            m.a aVar = v1.m.f83247a;
            v1.m mVarF = androidx.compose.foundation.layout.i0.f(androidx.compose.foundation.layout.c0.l(aVar, n0Var), 0.0f, 1, null);
            if (this.f31857a) {
                mVar.W(-2097917409);
                j10 = qk.a.f74718a.a(mVar, 6).k();
                mVar.Q();
            } else {
                mVar.W(-2097823200);
                j10 = qk.a.f74718a.a(mVar, 6).j();
                mVar.Q();
            }
            v1.m mVarD = androidx.compose.foundation.b.d(mVarF, j10, null, 2, null);
            final TagSelectScreenViewModel tagSelectScreenViewModel = this.f31858b;
            androidx.compose.runtime.l5 l5Var = this.f31859c;
            androidx.compose.runtime.l5 l5Var2 = this.f31860d;
            e.a aVar2 = v1.e.f83199a;
            s2.e0 e0VarI = androidx.compose.foundation.layout.i.i(aVar2.o(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
            androidx.compose.runtime.i0 i0VarR = mVar.r();
            v1.m mVarE = v1.k.e(mVar, mVarD);
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
            androidx.compose.runtime.q5.e(mVarB, e0VarI, aVar3.c());
            androidx.compose.runtime.q5.e(mVarB, i0VarR, aVar3.e());
            iu.p pVarB = aVar3.b();
            if (mVarB.e() || !ju.t.b(mVarB.D(), Integer.valueOf(iHashCode))) {
                mVarB.t(Integer.valueOf(iHashCode));
                mVarB.m(Integer.valueOf(iHashCode), pVarB);
            }
            androidx.compose.runtime.q5.e(mVarB, mVarE, aVar3.d());
            androidx.compose.foundation.layout.n nVar = androidx.compose.foundation.layout.n.f4427a;
            List listM = of.M(l5Var);
            v1.m mVarF2 = androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null);
            mVar.W(5004770);
            boolean zF = mVar.F(tagSelectScreenViewModel);
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ag
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return of.d.n(tagSelectScreenViewModel, ((Long) obj).longValue());
                    }
                };
                mVar.t(objD);
            }
            iu.l lVar = (iu.l) objD;
            mVar.Q();
            mVar.W(5004770);
            boolean zF2 = mVar.F(tagSelectScreenViewModel);
            Object objD2 = mVar.D();
            if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.bg
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return of.d.o(tagSelectScreenViewModel, ((Long) obj).longValue());
                    }
                };
                mVar.t(objD2);
            }
            iu.l lVar2 = (iu.l) objD2;
            mVar.Q();
            mVar.W(5004770);
            boolean zF3 = mVar.F(tagSelectScreenViewModel);
            Object objD3 = mVar.D();
            if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.cg
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return of.d.p(tagSelectScreenViewModel, ((Long) obj).longValue());
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            of.R(listM, lVar, lVar2, (iu.l) objD3, mVarF2, mVar, 24576, 0);
            TagSelectScreenViewModel.b bVarF = of.F(l5Var2);
            if (ju.t.b(bVarF, TagSelectScreenViewModel.b.a.f34805a)) {
                mVar.W(1247578428);
                mVar.Q();
            } else if (ju.t.b(bVarF, TagSelectScreenViewModel.b.C0562b.f34806a)) {
                mVar.W(1247653913);
                bk.e3.b(mVar, 0);
                mVar.Q();
            } else {
                if (!ju.t.b(bVarF, TagSelectScreenViewModel.b.c.f34807a)) {
                    mVar.W(732979126);
                    mVar.Q();
                    throw new ut.s();
                }
                mVar.W(1247808138);
                v1.e eVarE = aVar2.e();
                v1.m mVarF3 = androidx.compose.foundation.layout.i0.f(aVar, 0.0f, 1, null);
                s2.e0 e0VarI2 = androidx.compose.foundation.layout.i.i(eVarE, false);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.h.b(mVar, 0));
                androidx.compose.runtime.i0 i0VarR2 = mVar.r();
                v1.m mVarE2 = v1.k.e(mVar, mVarF3);
                iu.a aVarA2 = aVar3.a();
                if (mVar.i() == null) {
                    androidx.compose.runtime.h.d();
                }
                mVar.I();
                if (mVar.e()) {
                    mVar.u(aVarA2);
                } else {
                    mVar.s();
                }
                androidx.compose.runtime.m mVarB2 = androidx.compose.runtime.q5.b(mVar);
                androidx.compose.runtime.q5.e(mVarB2, e0VarI2, aVar3.c());
                androidx.compose.runtime.q5.e(mVarB2, i0VarR2, aVar3.e());
                iu.p pVarB2 = aVar3.b();
                if (mVarB2.e() || !ju.t.b(mVarB2.D(), Integer.valueOf(iHashCode2))) {
                    mVarB2.t(Integer.valueOf(iHashCode2));
                    mVarB2.m(Integer.valueOf(iHashCode2), pVarB2);
                }
                androidx.compose.runtime.q5.e(mVarB2, mVarE2, aVar3.d());
                bk.l1.b(z2.i.b(h2.d.f52365k, R.drawable.ic_tag_shape, mVar, 54), z2.h.b(R.string.nes_default_tag_select_empty_title, mVar, 6), z2.h.b(R.string.nes_default_tag_select_empty_subtitle, mVar, 6), mVar, 0);
                mVar.w();
                mVar.Q();
            }
            mVar.w();
            mVar.W(-2007284455);
            if (of.K(this.f31861e)) {
                TagSelectScreenViewModel.c cVarL = of.L(this.f31862f);
                String strB = cVarL != null ? cVarL.b() : null;
                if (strB == null) {
                    strB = "";
                }
                String str = strB;
                v1.m mVarF4 = z.j1.f(androidx.compose.foundation.layout.c0.l(aVar, n0Var), z.m1.c(z.e1.f87495a, mVar, 6));
                mVar.W(5004770);
                boolean zF4 = mVar.F(this.f31858b);
                final TagSelectScreenViewModel tagSelectScreenViewModel2 = this.f31858b;
                Object objD4 = mVar.D();
                if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                    objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.dg
                        @Override // iu.a
                        public final Object a() {
                            return of.d.q(tagSelectScreenViewModel2);
                        }
                    };
                    mVar.t(objD4);
                }
                iu.a aVar4 = (iu.a) objD4;
                mVar.Q();
                mVar.W(5004770);
                boolean zF5 = mVar.F(this.f31858b);
                final TagSelectScreenViewModel tagSelectScreenViewModel3 = this.f31858b;
                Object objD5 = mVar.D();
                if (zF5 || objD5 == androidx.compose.runtime.m.f5359a.a()) {
                    objD5 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.eg
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return of.d.l(tagSelectScreenViewModel3, (String) obj);
                        }
                    };
                    mVar.t(objD5);
                }
                mVar.Q();
                r6.b(aVar4, str, (iu.l) objD5, mVarF4, mVar, 0, 0);
            }
            mVar.Q();
            if (of.G(this.f31863u)) {
                mVar.W(5004770);
                boolean zF6 = mVar.F(this.f31858b);
                final TagSelectScreenViewModel tagSelectScreenViewModel4 = this.f31858b;
                Object objD6 = mVar.D();
                if (zF6 || objD6 == androidx.compose.runtime.m.f5359a.a()) {
                    objD6 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.fg
                        @Override // iu.a
                        public final Object a() {
                            return of.d.m(tagSelectScreenViewModel4);
                        }
                    };
                    mVar.t(objD6);
                }
                mVar.Q();
                bk.i3.c((iu.a) objD6, mVar, 0);
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
    }

    static final class e implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f31864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iu.l f31865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iu.l f31866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ iu.l f31867d;

        e(List list, iu.l lVar, iu.l lVar2, iu.l lVar3) {
            this.f31864a = list;
            this.f31865b = lVar;
            this.f31866c = lVar2;
            this.f31867d = lVar3;
        }

        public final void b(b0.e eVar, int i10, androidx.compose.runtime.m mVar, int i11) {
            int i12;
            ju.t.f(eVar, "$this$items");
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(eVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.c(i10) ? 32 : 16;
            }
            if ((i12 & 147) == 146 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1031081431, i12, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.TagsList.<anonymous>.<anonymous>.<anonymous> (TagSelectScreen.kt:486)");
            }
            we weVar = (we) this.f31864a.get(i10);
            boolean z10 = true;
            boolean z11 = i10 == 0;
            if (i10 != this.f31864a.size() - 1) {
                z10 = false;
            }
            of.u(weVar, z11, z10, this.f31865b, this.f31866c, this.f31867d, b0.e.c(eVar, v1.m.f83247a, null, null, null, 7, null), mVar, 0, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((b0.e) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    static final class f implements iu.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f31869b;

        static final class a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f31870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HostsNavGraphRoute.TagSelectRoute f31871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f31872c;

            a(String str, HostsNavGraphRoute.TagSelectRoute tagSelectRoute, androidx.navigation.r1 r1Var) {
                this.f31870a = str;
                this.f31871b = tagSelectRoute;
                this.f31872c = r1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 g(androidx.navigation.r1 r1Var) {
                if (r1Var.A() != null) {
                    r1Var.S();
                }
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 h(androidx.navigation.r1 r1Var, List list) {
                androidx.lifecycle.u0 u0VarJ;
                ju.t.f(list, Table.TAG);
                androidx.navigation.d0 d0VarA = r1Var.A();
                if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                    u0VarJ.h("selected_tags", list);
                }
                return ut.m0.f82633a;
            }

            public final void e(String str, androidx.compose.runtime.m mVar, int i10) {
                ju.t.f(str, "it");
                if ((i10 & 17) == 16 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(2095987635, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.registerTagSelectRoute.<anonymous>.<anonymous> (TagSelectScreen.kt:563)");
                }
                v1.m mVarF = androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null);
                z.n0 n0VarG = androidx.compose.foundation.layout.c0.g(0.0f, 0.0f, 3, null);
                boolean zL = f1.c0.l(this.f31870a, f1.c0.f49444b.c());
                List<Long> chosenTagIds = this.f31871b.getChosenTagIds();
                mVar.W(5004770);
                boolean zF = mVar.F(this.f31872c);
                final androidx.navigation.r1 r1Var = this.f31872c;
                Object objD = mVar.D();
                if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                    objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.gg
                        @Override // iu.a
                        public final Object a() {
                            return of.f.a.g(r1Var);
                        }
                    };
                    mVar.t(objD);
                }
                iu.a aVar = (iu.a) objD;
                mVar.Q();
                mVar.W(5004770);
                boolean zF2 = mVar.F(this.f31872c);
                final androidx.navigation.r1 r1Var2 = this.f31872c;
                Object objD2 = mVar.D();
                if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                    objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.hg
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return of.f.a.h(r1Var2, (List) obj);
                        }
                    };
                    mVar.t(objD2);
                }
                mVar.Q();
                of.D(mVarF, n0VarG, zL, chosenTagIds, aVar, (iu.l) objD2, null, mVar, 54, 64);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e(((f1.c0) obj).o(), (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }
        }

        f(String str, androidx.navigation.r1 r1Var) {
            this.f31868a = str;
            this.f31869b = r1Var;
        }

        public final void b(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
            ju.t.f(bVar, "$this$composable");
            ju.t.f(d0Var, "it");
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-679738792, i10, -1, "com.server.auditor.ssh.client.navigation.ui.compose.hosts.registerTagSelectRoute.<anonymous> (TagSelectScreen.kt:561)");
            }
            HostsNavGraphRoute.TagSelectRoute tagSelectRoute = (HostsNavGraphRoute.TagSelectRoute) androidx.navigation.e0.a(d0Var, ju.n0.b(HostsNavGraphRoute.TagSelectRoute.class));
            String str = this.f31868a;
            bk.f5.b(str, q1.h.d(2095987635, true, new a(str, tagSelectRoute, this.f31869b), mVar, 54), mVar, 48);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 A(j2.a aVar, androidx.compose.runtime.e2 e2Var) {
        aVar.a(j2.b.f61137a.f());
        w(e2Var, true);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 B(iu.l lVar, we weVar) {
        lVar.invoke(Long.valueOf(weVar.a()));
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 C(we weVar, boolean z10, boolean z11, iu.l lVar, iu.l lVar2, iu.l lVar3, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        u(weVar, z10, z11, lVar, lVar2, lVar3, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(final v1.m r28, final z.n0 r29, final boolean r30, final java.util.List r31, iu.a r32, final iu.l r33, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TagSelectScreenViewModel r34, androidx.compose.runtime.m r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of.D(v1.m, z.n0, boolean, java.util.List, iu.a, iu.l, com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.TagSelectScreenViewModel, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 E() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagSelectScreenViewModel.b F(androidx.compose.runtime.l5 l5Var) {
        return (TagSelectScreenViewModel.b) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 H(TagSelectScreenViewModel tagSelectScreenViewModel) {
        tagSelectScreenViewModel.onDismissSearch();
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 I(v1.m mVar, z.n0 n0Var, boolean z10, List list, iu.a aVar, iu.l lVar, TagSelectScreenViewModel tagSelectScreenViewModel, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        D(mVar, n0Var, z10, list, aVar, lVar, tagSelectScreenViewModel, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J(androidx.compose.runtime.l5 l5Var) {
        return (List) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TagSelectScreenViewModel.c L(androidx.compose.runtime.l5 l5Var) {
        return (TagSelectScreenViewModel.c) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M(androidx.compose.runtime.l5 l5Var) {
        return (List) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.t0 O(androidx.compose.runtime.l5 l5Var) {
        return (j3.t0) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TermiusSortType P(androidx.compose.runtime.l5 l5Var) {
        return (TermiusSortType) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(final java.util.List r20, final iu.l r21, final iu.l r22, final iu.l r23, v1.m r24, androidx.compose.runtime.m r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of.R(java.util.List, iu.l, iu.l, iu.l, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 S(List list, iu.l lVar, iu.l lVar2, iu.l lVar3, b0.k0 k0Var) {
        ju.t.f(k0Var, "$this$LazyColumn");
        b0.k0.i(k0Var, list.size(), null, null, q1.h.b(1031081431, true, new e(list, lVar, lVar2, lVar3)), 6, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 T(List list, iu.l lVar, iu.l lVar2, iu.l lVar3, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        R(list, lVar, lVar2, lVar3, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final void g0(androidx.navigation.o1 o1Var, androidx.navigation.r1 r1Var, String str) {
        ju.t.f(o1Var, "$this$registerTagSelectRoute");
        ju.t.f(r1Var, "navController");
        ju.t.f(str, "navigationSuiteType");
        Map mapA = HostsNavGraphRoute.TagSelectRoute.Companion.a();
        iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.xe
            @Override // iu.l
            public final Object invoke(Object obj) {
                return of.h0((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.ff
            @Override // iu.l
            public final Object invoke(Object obj) {
                return of.i0((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.gf
            @Override // iu.l
            public final Object invoke(Object obj) {
                return of.j0((androidx.compose.animation.d) obj);
            }
        };
        iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.hosts.hf
            @Override // iu.l
            public final Object invoke(Object obj) {
                return of.k0((androidx.compose.animation.d) obj);
            }
        };
        q1.b bVarB = q1.h.b(-679738792, true, new f(str, r1Var));
        androidx.navigation.compose.r.a(o1Var, ju.n0.b(HostsNavGraphRoute.TagSelectRoute.class), mapA, vt.v.o(), lVar, lVar2, lVar3, lVar4, null, bVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h h0(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.ca.f30377a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j i0(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.h1.f30620a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.h j0(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.h1.f30620a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.j k0(androidx.compose.animation.d dVar) {
        ju.t.f(dVar, "$this$composable");
        return com.server.auditor.ssh.client.navigation.ui.compose.ca.f30377a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final java.lang.String r39, final boolean r40, final iu.a r41, final iu.a r42, boolean r43, iu.a r44, v1.m r45, androidx.compose.runtime.m r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of.r(java.lang.String, boolean, iu.a, iu.a, boolean, iu.a, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 s() {
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 t(String str, boolean z10, iu.a aVar, iu.a aVar2, boolean z11, iu.a aVar3, v1.m mVar, int i10, int i11, androidx.compose.runtime.m mVar2, int i12) {
        r(str, z10, aVar, aVar2, z11, aVar3, mVar, mVar2, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final com.server.auditor.ssh.client.navigation.ui.compose.hosts.we r33, final boolean r34, final boolean r35, final iu.l r36, final iu.l r37, final iu.l r38, v1.m r39, androidx.compose.runtime.m r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.hosts.of.u(com.server.auditor.ssh.client.navigation.ui.compose.hosts.we, boolean, boolean, iu.l, iu.l, iu.l, v1.m, androidx.compose.runtime.m, int, int):void");
    }

    private static final boolean v(androidx.compose.runtime.e2 e2Var) {
        return ((Boolean) e2Var.getValue()).booleanValue();
    }

    private static final void w(androidx.compose.runtime.e2 e2Var, boolean z10) {
        e2Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 x(iu.l lVar, we weVar, androidx.compose.runtime.e2 e2Var) {
        lVar.invoke(Long.valueOf(weVar.a()));
        w(e2Var, false);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 y(iu.l lVar, we weVar, androidx.compose.runtime.e2 e2Var) {
        lVar.invoke(Long.valueOf(weVar.a()));
        w(e2Var, false);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 z(androidx.compose.runtime.e2 e2Var) {
        w(e2Var, false);
        return ut.m0.f82633a;
    }
}

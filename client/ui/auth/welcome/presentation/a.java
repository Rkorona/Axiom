package com.server.auditor.ssh.client.ui.auth.welcome.presentation;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m;
import androidx.compose.runtime.y4;
import androidx.compose.runtime.z2;
import androidx.compose.runtime.z3;
import androidx.compose.ui.platform.s1;
import androidx.navigation.h2;
import androidx.navigation.k2;
import androidx.navigation.v1;
import c2.d1;
import com.crystalnix.termius.libtermius.wrappers.LibTermiusKeygen;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.SecurityToken;
import com.server.auditor.ssh.client.navigation.ui.compose.q6;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes;
import com.server.auditor.ssh.client.ui.auth.welcome.presentation.a;
import com.server.auditor.ssh.client.ui.base.domain.SplashScreenViewModel;
import i5.a;
import java.util.Map;
import qn.c3;
import qn.d4;
import qn.g3;
import qn.l2;
import qn.r3;
import qn.x1;
import tn.a3;
import tn.c4;
import tn.n2;
import tn.u3;
import ut.m0;
import v1.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z2 f39498a = androidx.compose.runtime.h0.h(null, new iu.a() { // from class: vn.n
        @Override // iu.a
        public final Object a() {
            return com.server.auditor.ssh.client.ui.auth.welcome.presentation.a.e();
        }
    }, 1, null);

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$a, reason: collision with other inner class name */
    static final class C0605a implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.p f39499a;

        C0605a(iu.p pVar) {
            this.f39499a = pVar;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(523970862, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.ProvideWelcomeFlowMetrics.<anonymous> (WelcomeFlow.kt:907)");
            }
            this.f39499a.invoke(mVar, 0);
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

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SplashScreenViewModel f39501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SplashScreenViewModel splashScreenViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39501b = splashScreenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(this.f39501b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39500a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            this.f39501b.onWelcomeScreenResultReceived();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WelcomeFlowViewModel f39502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.r1 f39503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wu.i0 f39504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f39505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l5 f39506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l5 f39507f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ l5 f39508u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ l5 f39509v;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a, reason: collision with other inner class name */
        static final class C0606a implements iu.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WelcomeFlowViewModel f39510a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.navigation.r1 f39511b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wu.i0 f39512c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Activity f39513d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l5 f39514e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l5 f39515f;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ l5 f39516u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ l5 f39517v;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$a, reason: collision with other inner class name */
            static final class C0607a implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ wu.i0 f39518a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39520c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Activity f39521d;

                /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$a$a, reason: collision with other inner class name */
                static final class C0608a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f39522a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ WelcomeFlowViewModel f39523b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.navigation.r1 f39524c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f39525d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0608a(WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, int i10, zt.e eVar) {
                        super(2, eVar);
                        this.f39523b = welcomeFlowViewModel;
                        this.f39524c = r1Var;
                        this.f39525d = i10;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ut.m0 l(v1 v1Var) {
                        v1Var.e(ju.n0.b(WelcomeFlowGraphRoutes.WelcomeIntro.class), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.l
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.C0607a.C0608a.m((k2) obj);
                            }
                        });
                        return ut.m0.f82633a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ut.m0 m(k2 k2Var) {
                        k2Var.c(true);
                        return ut.m0.f82633a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zt.e create(Object obj, zt.e eVar) {
                        return new C0608a(this.f39523b, this.f39524c, this.f39525d, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objF = au.b.f();
                        int i10 = this.f39522a;
                        if (i10 == 0) {
                            ut.x.b(obj);
                            this.f39523b.onIntroDismissed();
                            this.f39522a = 1;
                            if (wu.s0.b(300L, this) == objF) {
                                return objF;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ut.x.b(obj);
                        }
                        this.f39524c.Q(new WelcomeFlowGraphRoutes.SignUpChooser(this.f39525d), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.k
                            @Override // iu.l
                            public final Object invoke(Object obj2) {
                                return a.c.C0606a.C0607a.C0608a.l((v1) obj2);
                            }
                        });
                        return ut.m0.f82633a;
                    }

                    @Override // iu.p
                    public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                        return ((C0608a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                    }
                }

                C0607a(wu.i0 i0Var, WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, Activity activity) {
                    this.f39518a = i0Var;
                    this.f39519b = welcomeFlowViewModel;
                    this.f39520c = r1Var;
                    this.f39521d = activity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(wu.i0 i0Var, WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, int i10) {
                    wu.k.d(i0Var, null, null, new C0608a(welcomeFlowViewModel, r1Var, i10, null), 3, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 i(Activity activity) {
                    if (activity != null) {
                        activity.finish();
                    }
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(WelcomeFlowViewModel welcomeFlowViewModel, kn.f fVar) {
                    ju.t.f(fVar, "params");
                    welcomeFlowViewModel.updateWelcomeShineBoxParams(fVar);
                    return ut.m0.f82633a;
                }

                public final void g(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(1704874332, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:130)");
                    }
                    mVar.W(-1746271574);
                    boolean zF = mVar.F(this.f39518a) | mVar.F(this.f39519b) | mVar.F(this.f39520c);
                    final wu.i0 i0Var = this.f39518a;
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39519b;
                    final androidx.navigation.r1 r1Var = this.f39520c;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.h
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.C0607a.h(i0Var, welcomeFlowViewModel, r1Var, ((Integer) obj).intValue());
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.l lVar = (iu.l) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39521d);
                    final Activity activity = this.f39521d;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.i
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.C0607a.i(activity);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.a aVar = (iu.a) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39519b);
                    final WelcomeFlowViewModel welcomeFlowViewModel2 = this.f39519b;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.j
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.C0607a.k(welcomeFlowViewModel2, (kn.f) obj);
                            }
                        };
                        mVar.t(objD3);
                    }
                    mVar.Q();
                    vn.e0.F(lVar, aVar, (iu.l) objD3, null, mVar, 0, 8);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    g((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$b */
            static final class b implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39526a;

                b(androidx.navigation.r1 r1Var) {
                    this.f39526a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpCheckEmail signUpCheckEmail, String str) {
                    ju.t.f(str, "code");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpEnterPassword(new EmailAuthentication(signUpCheckEmail.getEmail(), (String) null, (SecurityToken) null, str, 6, (ju.k) null), signUpCheckEmail.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void e(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-533042281, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:319)");
                    }
                    final WelcomeFlowGraphRoutes.SignUpCheckEmail signUpCheckEmail = (WelcomeFlowGraphRoutes.SignUpCheckEmail) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpCheckEmail.class));
                    String str = (String) q6.a(d0Var, "SIGN_UP_VERIFICATION_ERROR", mVar, ((i10 >> 3) & 14) | 48);
                    String email = signUpCheckEmail.getEmail();
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39526a) | mVar.V(signUpCheckEmail);
                    final androidx.navigation.r1 r1Var = this.f39526a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.m
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.b.g(r1Var, signUpCheckEmail, (String) obj);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.l lVar = (iu.l) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39526a);
                    final androidx.navigation.r1 r1Var2 = this.f39526a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.n
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.b.h(r1Var2);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    tn.r1.o(email, str, lVar, (iu.a) objD2, null, mVar, 0, 16);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$c, reason: collision with other inner class name */
            static final class C0609c implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39527a;

                C0609c(androidx.navigation.r1 r1Var) {
                    this.f39527a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount signUpAlreadyHaveAccount, String str) {
                    ju.t.f(str, "domainToken");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterPassword(signUpAlreadyHaveAccount.getFeatureType(), !signUpAlreadyHaveAccount.isESSO() ? new EmailAuthentication(signUpAlreadyHaveAccount.getEmail(), (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null) : new EnterpriseSingleSignOnAuthentication(signUpAlreadyHaveAccount.getEmail(), str)), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var, String str) {
                    androidx.navigation.d0 d0VarA;
                    androidx.lifecycle.u0 u0VarJ;
                    ju.t.f(str, "error");
                    if (str.length() > 0 && (d0VarA = r1Var.A()) != null && (u0VarJ = d0VarA.j()) != null) {
                        u0VarJ.h("SIGN_UP_ERROR", str);
                    }
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void e(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-671827688, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:345)");
                    }
                    final WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount signUpAlreadyHaveAccount = (WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount.class));
                    String email = signUpAlreadyHaveAccount.getEmail();
                    boolean zIsESSO = signUpAlreadyHaveAccount.isESSO();
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39527a) | mVar.V(signUpAlreadyHaveAccount);
                    final androidx.navigation.r1 r1Var = this.f39527a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.o
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.C0609c.g(r1Var, signUpAlreadyHaveAccount, (String) obj);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.l lVar = (iu.l) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39527a);
                    final androidx.navigation.r1 r1Var2 = this.f39527a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.p
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.C0609c.h(r1Var2, (String) obj);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    tn.z0.m(email, zIsESSO, lVar, (iu.l) objD2, null, mVar, 0, 16);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$d */
            static final class d implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39528a;

                d(androidx.navigation.r1 r1Var) {
                    this.f39528a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInAccountNotFound signInAccountNotFound) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpCheckEmail(signInAccountNotFound.getEmail(), signInAccountNotFound.getFeatureType(), (String) null, 4, (ju.k) null), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void e(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-810613095, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:379)");
                    }
                    final WelcomeFlowGraphRoutes.SignInAccountNotFound signInAccountNotFound = (WelcomeFlowGraphRoutes.SignInAccountNotFound) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInAccountNotFound.class));
                    String email = signInAccountNotFound.getEmail();
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39528a) | mVar.V(signInAccountNotFound);
                    final androidx.navigation.r1 r1Var = this.f39528a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.q
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.d.g(r1Var, signInAccountNotFound);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39528a);
                    final androidx.navigation.r1 r1Var2 = this.f39528a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.r
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.d.h(r1Var2);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    qn.e1.g(email, aVar, (iu.a) objD2, mVar, 0);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$e */
            static final class e implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39529a;

                e(androidx.navigation.r1 r1Var) {
                    this.f39529a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpEnterPassword signUpEnterPassword, byte[] bArr) {
                    ju.t.f(bArr, "password");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpInitPersonalVault(signUpEnterPassword.getAuthenticationModel(), bArr, signUpEnterPassword.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void e(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    androidx.lifecycle.u0 u0VarJ;
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-949398502, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:402)");
                    }
                    final WelcomeFlowGraphRoutes.SignUpEnterPassword signUpEnterPassword = (WelcomeFlowGraphRoutes.SignUpEnterPassword) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpEnterPassword.class));
                    int i11 = ((i10 >> 3) & 14) | 48;
                    String str = (String) q6.a(d0Var, "SIGN_UP_ERROR", mVar, i11);
                    String str2 = (String) q6.a(d0Var, "SIGN_UP_VERIFICATION_ERROR", mVar, i11);
                    if (str2 != null) {
                        androidx.navigation.d0 d0VarA = this.f39529a.A();
                        if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                            u0VarJ.h("SIGN_UP_VERIFICATION_ERROR", str2);
                        }
                        this.f39529a.T();
                    }
                    AuthenticationModel authenticationModel = signUpEnterPassword.getAuthenticationModel();
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39529a) | mVar.F(signUpEnterPassword);
                    final androidx.navigation.r1 r1Var = this.f39529a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.s
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.e.g(r1Var, signUpEnterPassword, (byte[]) obj);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.l lVar = (iu.l) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39529a);
                    final androidx.navigation.r1 r1Var2 = this.f39529a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.t
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.e.h(r1Var2);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    u3.y(authenticationModel, str, lVar, (iu.a) objD2, null, mVar, 0, 16);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$f */
            static final class f implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39530a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39531b;

                f(androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel) {
                    this.f39530a = r1Var;
                    this.f39531b = welcomeFlowViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInEnterPassword signInEnterPassword, byte[] bArr) {
                    ju.t.f(bArr, "password");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterVerificationCode(signInEnterPassword.getFeatureType(), signInEnterPassword.getAuthenticationModel(), bArr), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInEnterPassword signInEnterPassword, byte[] bArr) {
                    ju.t.f(bArr, "password");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInCheckEmailToVerify(signInEnterPassword.getFeatureType(), signInEnterPassword.getAuthenticationModel(), bArr), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInEnterPassword signInEnterPassword) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.ResetPasswordGetInstructions(signInEnterPassword.getFeatureType(), signInEnterPassword.getAuthenticationModel()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(WelcomeFlowViewModel welcomeFlowViewModel, boolean z10) {
                    welcomeFlowViewModel.finishSignedIn(z10);
                    return ut.m0.f82633a;
                }

                public final void i(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-1088183909, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:436)");
                    }
                    final WelcomeFlowGraphRoutes.SignInEnterPassword signInEnterPassword = (WelcomeFlowGraphRoutes.SignInEnterPassword) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterPassword.class));
                    LoginErrorContainer loginErrorContainer = (LoginErrorContainer) q6.a(d0Var, "VERIFICATION_BY_EMAIL_ERROR_KEY", mVar, ((i10 >> 3) & 14) | 48);
                    AuthenticationModel authenticationModel = signInEnterPassword.getAuthenticationModel();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39530a);
                    final androidx.navigation.r1 r1Var = this.f39530a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.u
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.f.k(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF2 = mVar.F(this.f39530a) | mVar.F(signInEnterPassword);
                    final androidx.navigation.r1 r1Var2 = this.f39530a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.v
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.f.l(r1Var2, signInEnterPassword, (byte[]) obj);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.l lVar = (iu.l) objD2;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF3 = mVar.F(this.f39530a) | mVar.F(signInEnterPassword);
                    final androidx.navigation.r1 r1Var3 = this.f39530a;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.w
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.f.m(r1Var3, signInEnterPassword, (byte[]) obj);
                            }
                        };
                        mVar.t(objD3);
                    }
                    iu.l lVar2 = (iu.l) objD3;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF4 = mVar.F(this.f39530a) | mVar.F(signInEnterPassword);
                    final androidx.navigation.r1 r1Var4 = this.f39530a;
                    Object objD4 = mVar.D();
                    if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                        objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.x
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.f.n(r1Var4, signInEnterPassword);
                            }
                        };
                        mVar.t(objD4);
                    }
                    iu.a aVar2 = (iu.a) objD4;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF5 = mVar.F(this.f39531b);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39531b;
                    Object objD5 = mVar.D();
                    if (zF5 || objD5 == androidx.compose.runtime.m.f5359a.a()) {
                        objD5 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.y
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.f.o(welcomeFlowViewModel, ((Boolean) obj).booleanValue());
                            }
                        };
                        mVar.t(objD5);
                    }
                    mVar.Q();
                    c3.t(authenticationModel, loginErrorContainer, aVar, lVar, lVar2, aVar2, (iu.l) objD5, null, mVar, 0, 128);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$g */
            static final class g implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39532a;

                g(androidx.navigation.r1 r1Var) {
                    this.f39532a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 i(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.ResetPasswordGetInstructions resetPasswordGetInstructions) {
                    r1Var.Q(new WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent(resetPasswordGetInstructions.getFeatureType(), resetPasswordGetInstructions.getAuthenticationModel()), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.b0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.g.l((v1) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(v1 v1Var) {
                    ju.t.f(v1Var, "$this$navigate");
                    v1Var.e(ju.n0.b(WelcomeFlowGraphRoutes.ResetPasswordGetInstructions.class), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.c0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.g.m((k2) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(k2 k2Var) {
                    ju.t.f(k2Var, "$this$popUpTo");
                    k2Var.c(true);
                    return ut.m0.f82633a;
                }

                public final void h(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    String email;
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(92989929, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:483)");
                    }
                    final WelcomeFlowGraphRoutes.ResetPasswordGetInstructions resetPasswordGetInstructions = (WelcomeFlowGraphRoutes.ResetPasswordGetInstructions) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.ResetPasswordGetInstructions.class));
                    AuthenticationModel authenticationModel = resetPasswordGetInstructions.getAuthenticationModel();
                    if (authenticationModel instanceof EmailAuthentication) {
                        email = ((EmailAuthentication) resetPasswordGetInstructions.getAuthenticationModel()).getEmail();
                    } else if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
                        email = ((EnterpriseSingleSignOnAuthentication) resetPasswordGetInstructions.getAuthenticationModel()).getEmail();
                    } else if (authenticationModel instanceof AppleSingleSignOnAuthentication) {
                        email = ((AppleSingleSignOnAuthentication) resetPasswordGetInstructions.getAuthenticationModel()).getEmail();
                    } else {
                        if (!(authenticationModel instanceof GoogleSingleSignOnAuthentication)) {
                            throw new ut.s();
                        }
                        email = ((GoogleSingleSignOnAuthentication) resetPasswordGetInstructions.getAuthenticationModel()).getEmail();
                    }
                    String str = email;
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39532a);
                    final androidx.navigation.r1 r1Var = this.f39532a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.z
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.g.i(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF2 = mVar.F(this.f39532a) | mVar.F(resetPasswordGetInstructions);
                    final androidx.navigation.r1 r1Var2 = this.f39532a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.g.k(r1Var2, resetPasswordGetInstructions);
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    r3.o(str, aVar, (iu.a) objD2, null, mVar, 0, 8);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    h((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$h */
            static final class h implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39533a;

                h(androidx.navigation.r1 r1Var) {
                    this.f39533a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 e(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void d(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    String email;
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-45795478, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:515)");
                    }
                    WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent resetPasswordInstructionsSent = (WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent.class));
                    AuthenticationModel authenticationModel = resetPasswordInstructionsSent.getAuthenticationModel();
                    if (authenticationModel instanceof EmailAuthentication) {
                        email = ((EmailAuthentication) resetPasswordInstructionsSent.getAuthenticationModel()).getEmail();
                    } else if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
                        email = ((EnterpriseSingleSignOnAuthentication) resetPasswordInstructionsSent.getAuthenticationModel()).getEmail();
                    } else if (authenticationModel instanceof AppleSingleSignOnAuthentication) {
                        email = ((AppleSingleSignOnAuthentication) resetPasswordInstructionsSent.getAuthenticationModel()).getEmail();
                    } else {
                        if (!(authenticationModel instanceof GoogleSingleSignOnAuthentication)) {
                            throw new ut.s();
                        }
                        email = ((GoogleSingleSignOnAuthentication) resetPasswordInstructionsSent.getAuthenticationModel()).getEmail();
                    }
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39533a);
                    final androidx.navigation.r1 r1Var = this.f39533a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.d0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.h.e(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    mVar.Q();
                    g3.g(email, (iu.a) objD, mVar, 0);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    d((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$i */
            static final class i implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39534a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39535b;

                i(androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel) {
                    this.f39534a = r1Var;
                    this.f39535b = welcomeFlowViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 g(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(WelcomeFlowViewModel welcomeFlowViewModel, boolean z10) {
                    welcomeFlowViewModel.finishSignedIn(z10);
                    return ut.m0.f82633a;
                }

                public final void e(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-184580885, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:536)");
                    }
                    WelcomeFlowGraphRoutes.SignInEnterVerificationCode signInEnterVerificationCode = (WelcomeFlowGraphRoutes.SignInEnterVerificationCode) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterVerificationCode.class));
                    AuthenticationModel authenticationModel = signInEnterVerificationCode.getAuthenticationModel();
                    byte[] password = signInEnterVerificationCode.getPassword();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39534a);
                    final androidx.navigation.r1 r1Var = this.f39534a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.e0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.i.g(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39535b);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39535b;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.f0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.i.h(welcomeFlowViewModel, ((Boolean) obj).booleanValue());
                            }
                        };
                        mVar.t(objD2);
                    }
                    mVar.Q();
                    qn.a1.l(authenticationModel, password, aVar, (iu.l) objD2, null, mVar, 0, 16);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$j */
            static final class j implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39536a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39537b;

                j(androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel) {
                    this.f39536a = r1Var;
                    this.f39537b = welcomeFlowViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 i(androidx.navigation.r1 r1Var, LoginErrorContainer loginErrorContainer) {
                    androidx.lifecycle.u0 u0VarJ;
                    ju.t.f(loginErrorContainer, "loginErrorContainer");
                    androidx.navigation.d0 d0VarA = r1Var.A();
                    if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                        u0VarJ.h("VERIFICATION_BY_EMAIL_ERROR_KEY", loginErrorContainer);
                    }
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(WelcomeFlowViewModel welcomeFlowViewModel, boolean z10) {
                    welcomeFlowViewModel.finishSignedIn(z10);
                    return ut.m0.f82633a;
                }

                public final void g(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-323366292, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:555)");
                    }
                    WelcomeFlowGraphRoutes.SignInCheckEmailToVerify signInCheckEmailToVerify = (WelcomeFlowGraphRoutes.SignInCheckEmailToVerify) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInCheckEmailToVerify.class));
                    AuthenticationModel authenticationModel = signInCheckEmailToVerify.getAuthenticationModel();
                    byte[] password = signInCheckEmailToVerify.getPassword();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39536a);
                    final androidx.navigation.r1 r1Var = this.f39536a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.g0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.j.h(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39536a);
                    final androidx.navigation.r1 r1Var2 = this.f39536a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.h0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.j.i(r1Var2, (LoginErrorContainer) obj);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.l lVar = (iu.l) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39537b);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39537b;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.i0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.j.k(welcomeFlowViewModel, ((Boolean) obj).booleanValue());
                            }
                        };
                        mVar.t(objD3);
                    }
                    mVar.Q();
                    d4.p(authenticationModel, password, aVar, lVar, (iu.l) objD3, null, mVar, 0, 32);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    g((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$k */
            static final class k implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39538a;

                k(androidx.navigation.r1 r1Var) {
                    this.f39538a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(androidx.navigation.r1 r1Var) {
                    r1Var.Q(WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp.INSTANCE, new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.n0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.k.n((v1) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(v1 v1Var) {
                    ju.t.f(v1Var, "$this$navigate");
                    v1Var.d(0, new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.o0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.k.o((k2) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(k2 k2Var) {
                    ju.t.f(k2Var, "$this$popUpTo");
                    k2Var.c(true);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 p(androidx.navigation.r1 r1Var, String str) {
                    androidx.lifecycle.u0 u0VarJ;
                    ju.t.f(str, "it");
                    androidx.navigation.d0 d0VarA = r1Var.A();
                    if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                        u0VarJ.h("SIGN_UP_ERROR", str);
                    }
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 q(androidx.navigation.r1 r1Var, String str) {
                    androidx.lifecycle.u0 u0VarJ;
                    ju.t.f(str, "apiError");
                    androidx.navigation.d0 d0VarA = r1Var.A();
                    if (d0VarA != null && (u0VarJ = d0VarA.j()) != null) {
                        u0VarJ.h("SIGN_UP_VERIFICATION_ERROR", str);
                    }
                    r1Var.T();
                    return ut.m0.f82633a;
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    k((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }

                public final void k(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-462151699, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:580)");
                    }
                    WelcomeFlowGraphRoutes.SignUpInitPersonalVault signUpInitPersonalVault = (WelcomeFlowGraphRoutes.SignUpInitPersonalVault) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpInitPersonalVault.class));
                    AuthenticationModel authenticationModel = signUpInitPersonalVault.getAuthenticationModel();
                    byte[] password = signUpInitPersonalVault.getPassword();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39538a);
                    final androidx.navigation.r1 r1Var = this.f39538a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.j0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.k.l(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39538a);
                    final androidx.navigation.r1 r1Var2 = this.f39538a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.k0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.k.p(r1Var2, (String) obj);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.l lVar = (iu.l) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39538a);
                    final androidx.navigation.r1 r1Var3 = this.f39538a;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.l0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.k.q(r1Var3, (String) obj);
                            }
                        };
                        mVar.t(objD3);
                    }
                    iu.l lVar2 = (iu.l) objD3;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF4 = mVar.F(this.f39538a);
                    final androidx.navigation.r1 r1Var4 = this.f39538a;
                    Object objD4 = mVar.D();
                    if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                        objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.m0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.k.m(r1Var4);
                            }
                        };
                        mVar.t(objD4);
                    }
                    mVar.Q();
                    c4.k(authenticationModel, password, aVar, lVar, lVar2, (iu.a) objD4, null, mVar, 0, 64);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$l */
            static final class l implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l5 f39539a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39540b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39541c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Activity f39542d;

                l(l5 l5Var, androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel, Activity activity) {
                    this.f39539a = l5Var;
                    this.f39540b = r1Var;
                    this.f39541c = welcomeFlowViewModel;
                    this.f39542d = activity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel, l5 l5Var) {
                    if (a.j(l5Var) instanceof WelcomeFlowViewModel.BillingPlansState.Available) {
                        r1Var.Q(WelcomeFlowGraphRoutes.SignUpPromotePremium.INSTANCE, new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.s0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.l.l((v1) obj);
                            }
                        });
                    } else {
                        welcomeFlowViewModel.finishWelcomeFlowSkippedTrialOffer();
                    }
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(v1 v1Var) {
                    ju.t.f(v1Var, "$this$navigate");
                    v1Var.e(ju.n0.b(WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp.class), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.t0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.l.m((k2) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(k2 k2Var) {
                    ju.t.f(k2Var, "$this$popUpTo");
                    k2Var.c(true);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(WelcomeFlowViewModel welcomeFlowViewModel) {
                    welcomeFlowViewModel.finishWelcomeFlowHasDesktop();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(Activity activity) {
                    if (activity != null) {
                        activity.finish();
                    }
                    return ut.m0.f82633a;
                }

                public final void i(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-600937106, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:612)");
                    }
                    mVar.W(-1746271574);
                    boolean zV = mVar.V(this.f39539a) | mVar.F(this.f39540b) | mVar.F(this.f39541c);
                    final androidx.navigation.r1 r1Var = this.f39540b;
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39541c;
                    final l5 l5Var = this.f39539a;
                    Object objD = mVar.D();
                    if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.p0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.l.k(r1Var, welcomeFlowViewModel, l5Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39541c);
                    final WelcomeFlowViewModel welcomeFlowViewModel2 = this.f39541c;
                    Object objD2 = mVar.D();
                    if (zF || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.q0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.l.n(welcomeFlowViewModel2);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.a aVar2 = (iu.a) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39542d);
                    final Activity activity = this.f39542d;
                    Object objD3 = mVar.D();
                    if (zF2 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.r0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.l.o(activity);
                            }
                        };
                        mVar.t(objD3);
                    }
                    mVar.Q();
                    on.f0.k(aVar, aVar2, (iu.a) objD3, null, mVar, 0, 8);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$m */
            static final class m implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39543a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39544b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Activity f39545c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ l5 f39546d;

                m(WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, Activity activity, l5 l5Var) {
                    this.f39543a = welcomeFlowViewModel;
                    this.f39544b = r1Var;
                    this.f39545c = activity;
                    this.f39546d = l5Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(WelcomeFlowViewModel welcomeFlowViewModel) {
                    welcomeFlowViewModel.finishWelcomeFlowSkippedTrialOffer();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(androidx.navigation.r1 r1Var, int i10) {
                    r1Var.Q(new WelcomeFlowGraphRoutes.SignUpCongratulation(i10), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.x0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.m.m((v1) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(v1 v1Var) {
                    ju.t.f(v1Var, "$this$navigate");
                    v1Var.e(ju.n0.b(WelcomeFlowGraphRoutes.SignUpPromotePremium.class), new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.y0
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.m.n((k2) obj);
                        }
                    });
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(k2 k2Var) {
                    ju.t.f(k2Var, "$this$popUpTo");
                    k2Var.c(true);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(Activity activity) {
                    if (activity != null) {
                        activity.finish();
                    }
                    return ut.m0.f82633a;
                }

                public final void i(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-739722513, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:634)");
                    }
                    WelcomeFlowViewModel.BillingPlansState billingPlansStateJ = a.j(this.f39546d);
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39543a);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39543a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.u0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.m.k(welcomeFlowViewModel);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39544b);
                    final androidx.navigation.r1 r1Var = this.f39544b;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.v0
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.m.l(r1Var, ((Integer) obj).intValue());
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.l lVar = (iu.l) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39545c);
                    final Activity activity = this.f39545c;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.w0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.m.o(activity);
                            }
                        };
                        mVar.t(objD3);
                    }
                    mVar.Q();
                    on.c1.r(billingPlansStateJ, aVar, lVar, (iu.a) objD3, null, mVar, 0, 16);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$n */
            static final class n implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39547a;

                n(WelcomeFlowViewModel welcomeFlowViewModel) {
                    this.f39547a = welcomeFlowViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 e(WelcomeFlowViewModel welcomeFlowViewModel) {
                    welcomeFlowViewModel.finishWelcomeFlowAsTrial();
                    return ut.m0.f82633a;
                }

                public final void d(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-878507920, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:653)");
                    }
                    int trialDays = ((WelcomeFlowGraphRoutes.SignUpCongratulation) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpCongratulation.class))).getTrialDays();
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39547a);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39547a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.z0
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.n.e(welcomeFlowViewModel);
                            }
                        };
                        mVar.t(objD);
                    }
                    mVar.Q();
                    on.u.g(trialDays, (iu.a) objD, mVar, 0);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    d((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$o */
            static final class o implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39548a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WelcomeFlowViewModel f39549b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Activity f39550c;

                o(androidx.navigation.r1 r1Var, WelcomeFlowViewModel welcomeFlowViewModel, Activity activity) {
                    this.f39548a = r1Var;
                    this.f39549b = welcomeFlowViewModel;
                    this.f39550c = activity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpChooser signUpChooser) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpEnterEmail(signUpChooser.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpChooser signUpChooser) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInChooser(signUpChooser.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(WelcomeFlowViewModel welcomeFlowViewModel) {
                    welcomeFlowViewModel.skipWelcomeFlow();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(Activity activity) {
                    if (activity != null) {
                        activity.finish();
                    }
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 p(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpChooser signUpChooser, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication) {
                    ju.t.f(firebaseSingleSignOnAuthentication, "it");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpEnterPassword(firebaseSingleSignOnAuthentication, signUpChooser.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 q(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpChooser signUpChooser, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication) {
                    ju.t.f(firebaseSingleSignOnAuthentication, "it");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterPassword(signUpChooser.getFeatureType(), firebaseSingleSignOnAuthentication), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    k((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }

                public final void k(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(22099347, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:159)");
                    }
                    final WelcomeFlowGraphRoutes.SignUpChooser signUpChooser = (WelcomeFlowGraphRoutes.SignUpChooser) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpChooser.class));
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39548a) | mVar.V(signUpChooser);
                    final androidx.navigation.r1 r1Var = this.f39548a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.o.l(r1Var, signUpChooser);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF2 = mVar.F(this.f39549b);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39549b;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.b1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.o.n(welcomeFlowViewModel);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.a aVar2 = (iu.a) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39550c);
                    final Activity activity = this.f39550c;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.c1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.o.o(activity);
                            }
                        };
                        mVar.t(objD3);
                    }
                    iu.a aVar3 = (iu.a) objD3;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF4 = mVar.F(this.f39548a) | mVar.V(signUpChooser);
                    final androidx.navigation.r1 r1Var2 = this.f39548a;
                    Object objD4 = mVar.D();
                    if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                        objD4 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.d1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.o.p(r1Var2, signUpChooser, (FirebaseSingleSignOnAuthentication) obj);
                            }
                        };
                        mVar.t(objD4);
                    }
                    iu.l lVar = (iu.l) objD4;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF5 = mVar.F(this.f39548a) | mVar.V(signUpChooser);
                    final androidx.navigation.r1 r1Var3 = this.f39548a;
                    Object objD5 = mVar.D();
                    if (zF5 || objD5 == androidx.compose.runtime.m.f5359a.a()) {
                        objD5 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.e1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.o.q(r1Var3, signUpChooser, (FirebaseSingleSignOnAuthentication) obj);
                            }
                        };
                        mVar.t(objD5);
                    }
                    iu.l lVar2 = (iu.l) objD5;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF6 = mVar.F(this.f39548a) | mVar.V(signUpChooser);
                    final androidx.navigation.r1 r1Var4 = this.f39548a;
                    Object objD6 = mVar.D();
                    if (zF6 || objD6 == androidx.compose.runtime.m.f5359a.a()) {
                        objD6 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.f1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.o.m(r1Var4, signUpChooser);
                            }
                        };
                        mVar.t(objD6);
                    }
                    mVar.Q();
                    n2.E(aVar, aVar2, aVar3, lVar, lVar2, (iu.a) objD6, null, mVar, 0, 64);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$p */
            static final class p implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39551a;

                p(androidx.navigation.r1 r1Var) {
                    this.f39551a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInChooser signInChooser) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterEmail(signInChooser.getFeatureType(), false, 2, (ju.k) null), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInChooser signInChooser, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication) {
                    ju.t.f(firebaseSingleSignOnAuthentication, "it");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpEnterPassword(firebaseSingleSignOnAuthentication, signInChooser.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 n(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInChooser signInChooser, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication) {
                    ju.t.f(firebaseSingleSignOnAuthentication, "it");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterPassword(signInChooser.getFeatureType(), firebaseSingleSignOnAuthentication), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 o(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInChooser signInChooser) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterEmail(signInChooser.getFeatureType(), true), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                public final void i(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-116686060, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:202)");
                    }
                    final WelcomeFlowGraphRoutes.SignInChooser signInChooser = (WelcomeFlowGraphRoutes.SignInChooser) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInChooser.class));
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39551a);
                    final androidx.navigation.r1 r1Var = this.f39551a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.g1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.p.k(r1Var);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.a aVar = (iu.a) objD;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF2 = mVar.F(this.f39551a) | mVar.V(signInChooser);
                    final androidx.navigation.r1 r1Var2 = this.f39551a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.h1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.p.l(r1Var2, signInChooser);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.a aVar2 = (iu.a) objD2;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF3 = mVar.F(this.f39551a) | mVar.V(signInChooser);
                    final androidx.navigation.r1 r1Var3 = this.f39551a;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.i1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.p.m(r1Var3, signInChooser, (FirebaseSingleSignOnAuthentication) obj);
                            }
                        };
                        mVar.t(objD3);
                    }
                    iu.l lVar = (iu.l) objD3;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF4 = mVar.F(this.f39551a) | mVar.V(signInChooser);
                    final androidx.navigation.r1 r1Var4 = this.f39551a;
                    Object objD4 = mVar.D();
                    if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                        objD4 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.j1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.p.n(r1Var4, signInChooser, (FirebaseSingleSignOnAuthentication) obj);
                            }
                        };
                        mVar.t(objD4);
                    }
                    iu.l lVar2 = (iu.l) objD4;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF5 = mVar.F(this.f39551a) | mVar.V(signInChooser);
                    final androidx.navigation.r1 r1Var5 = this.f39551a;
                    Object objD5 = mVar.D();
                    if (zF5 || objD5 == androidx.compose.runtime.m.f5359a.a()) {
                        objD5 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.k1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.p.o(r1Var5, signInChooser);
                            }
                        };
                        mVar.t(objD5);
                    }
                    mVar.Q();
                    x1.z(aVar, aVar2, lVar, lVar2, (iu.a) objD5, null, mVar, 0, 32);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$q */
            static final class q implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39552a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ wu.i0 f39553b;

                /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$q$a, reason: collision with other inner class name */
                static final class C0610a extends kotlin.coroutines.jvm.internal.m implements iu.p {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f39554a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ androidx.navigation.r1 f39555b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0610a(androidx.navigation.r1 r1Var, zt.e eVar) {
                        super(2, eVar);
                        this.f39555b = r1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zt.e create(Object obj, zt.e eVar) {
                        return new C0610a(this.f39555b, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        au.b.f();
                        if (this.f39554a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ut.x.b(obj);
                        this.f39555b.S();
                        return ut.m0.f82633a;
                    }

                    @Override // iu.p
                    public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                        return ((C0610a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
                    }
                }

                q(androidx.navigation.r1 r1Var, wu.i0 i0Var) {
                    this.f39552a = r1Var;
                    this.f39553b = i0Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 i(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpEnterEmail signUpEnterEmail, String str) {
                    ju.t.f(str, "email");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpCheckEmail(str, signUpEnterEmail.getFeatureType(), (String) null, 4, (ju.k) null), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpEnterEmail signUpEnterEmail, String str, boolean z10) {
                    ju.t.f(str, "email");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount(str, z10, signUpEnterEmail.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 l(wu.i0 i0Var, androidx.navigation.r1 r1Var) {
                    wu.k.d(i0Var, null, null, new C0610a(r1Var, null), 3, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 m(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignUpEnterEmail signUpEnterEmail) {
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInChooser(signUpEnterEmail.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                public final void h(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "navBackStackEntry");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-255471467, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:246)");
                    }
                    final WelcomeFlowGraphRoutes.SignUpEnterEmail signUpEnterEmail = (WelcomeFlowGraphRoutes.SignUpEnterEmail) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpEnterEmail.class));
                    String str = (String) q6.a(d0Var, "SIGN_UP_ERROR", mVar, ((i10 >> 3) & 14) | 48);
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39552a) | mVar.V(signUpEnterEmail);
                    final androidx.navigation.r1 r1Var = this.f39552a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.l1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.q.i(r1Var, signUpEnterEmail, (String) obj);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.l lVar = (iu.l) objD;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF2 = mVar.F(this.f39552a) | mVar.V(signUpEnterEmail);
                    final androidx.navigation.r1 r1Var2 = this.f39552a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.p() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.m1
                            @Override // iu.p
                            public final Object invoke(Object obj, Object obj2) {
                                return a.c.C0606a.q.k(r1Var2, signUpEnterEmail, (String) obj, ((Boolean) obj2).booleanValue());
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.p pVar = (iu.p) objD2;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF3 = mVar.F(this.f39553b) | mVar.F(this.f39552a);
                    final wu.i0 i0Var = this.f39553b;
                    final androidx.navigation.r1 r1Var3 = this.f39552a;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.n1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.q.l(i0Var, r1Var3);
                            }
                        };
                        mVar.t(objD3);
                    }
                    iu.a aVar = (iu.a) objD3;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF4 = mVar.F(this.f39552a) | mVar.V(signUpEnterEmail);
                    final androidx.navigation.r1 r1Var4 = this.f39552a;
                    Object objD4 = mVar.D();
                    if (zF4 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                        objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.o1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.q.m(r1Var4, signUpEnterEmail);
                            }
                        };
                        mVar.t(objD4);
                    }
                    mVar.Q();
                    a3.p(str, lVar, pVar, aVar, (iu.a) objD4, null, mVar, 0, 32);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    h((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.ui.auth.welcome.presentation.a$c$a$r */
            static final class r implements iu.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.navigation.r1 f39556a;

                r(androidx.navigation.r1 r1Var) {
                    this.f39556a = r1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 h(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInEnterEmail signInEnterEmail, String str, String str2) {
                    ju.t.f(str, "email");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInEnterPassword(signInEnterEmail.getFeatureType(), str2 != null ? new EnterpriseSingleSignOnAuthentication(str, str2) : new EmailAuthentication(str, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null)), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 i(androidx.navigation.r1 r1Var, WelcomeFlowGraphRoutes.SignInEnterEmail signInEnterEmail, String str) {
                    ju.t.f(str, "email");
                    androidx.navigation.m0.R(r1Var, new WelcomeFlowGraphRoutes.SignInAccountNotFound(str, signInEnterEmail.getFeatureType()), null, null, 6, null);
                    return ut.m0.f82633a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ut.m0 k(androidx.navigation.r1 r1Var) {
                    r1Var.S();
                    return ut.m0.f82633a;
                }

                public final void g(q.b bVar, androidx.navigation.d0 d0Var, androidx.compose.runtime.m mVar, int i10) {
                    ju.t.f(bVar, "$this$composable");
                    ju.t.f(d0Var, "it");
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(-394256874, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeFlow.kt:284)");
                    }
                    final WelcomeFlowGraphRoutes.SignInEnterEmail signInEnterEmail = (WelcomeFlowGraphRoutes.SignInEnterEmail) androidx.navigation.e0.a(d0Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterEmail.class));
                    mVar.W(-1633490746);
                    boolean zF = mVar.F(this.f39556a) | mVar.V(signInEnterEmail);
                    final androidx.navigation.r1 r1Var = this.f39556a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.p() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.p1
                            @Override // iu.p
                            public final Object invoke(Object obj, Object obj2) {
                                return a.c.C0606a.r.h(r1Var, signInEnterEmail, (String) obj, (String) obj2);
                            }
                        };
                        mVar.t(objD);
                    }
                    iu.p pVar = (iu.p) objD;
                    mVar.Q();
                    mVar.W(-1633490746);
                    boolean zF2 = mVar.F(this.f39556a) | mVar.V(signInEnterEmail);
                    final androidx.navigation.r1 r1Var2 = this.f39556a;
                    Object objD2 = mVar.D();
                    if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                        objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.q1
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.r.i(r1Var2, signInEnterEmail, (String) obj);
                            }
                        };
                        mVar.t(objD2);
                    }
                    iu.l lVar = (iu.l) objD2;
                    mVar.Q();
                    mVar.W(5004770);
                    boolean zF3 = mVar.F(this.f39556a);
                    final androidx.navigation.r1 r1Var3 = this.f39556a;
                    Object objD3 = mVar.D();
                    if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                        objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.r1
                            @Override // iu.a
                            public final Object a() {
                                return a.c.C0606a.r.k(r1Var3);
                            }
                        };
                        mVar.t(objD3);
                    }
                    mVar.Q();
                    l2.p(pVar, lVar, (iu.a) objD3, null, mVar, 0, 8);
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    g((q.b) obj, (androidx.navigation.d0) obj2, (androidx.compose.runtime.m) obj3, ((Number) obj4).intValue());
                    return ut.m0.f82633a;
                }
            }

            C0606a(WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, wu.i0 i0Var, Activity activity, l5 l5Var, l5 l5Var2, l5 l5Var3, l5 l5Var4) {
                this.f39510a = welcomeFlowViewModel;
                this.f39511b = r1Var;
                this.f39512c = i0Var;
                this.f39513d = activity;
                this.f39514e = l5Var;
                this.f39515f = l5Var2;
                this.f39516u = l5Var3;
                this.f39517v = l5Var4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 l(WelcomeFlowViewModel welcomeFlowViewModel, kn.f fVar) {
                ju.t.f(fVar, "params");
                welcomeFlowViewModel.updateWelcomeShineBoxParams(fVar);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ut.m0 m(wu.i0 i0Var, WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, Activity activity, l5 l5Var, androidx.navigation.o1 o1Var) {
                ju.t.f(o1Var, "$this$NavHost");
                q1.b bVarB = q1.h.b(1704874332, true, new C0607a(i0Var, welcomeFlowViewModel, r1Var, activity));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.WelcomeIntro.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB);
                iu.l lVar = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.d
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return a.c.C0606a.n((androidx.compose.animation.d) obj);
                    }
                };
                iu.l lVar2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.e
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return a.c.C0606a.o((androidx.compose.animation.d) obj);
                    }
                };
                q1.b bVarB2 = q1.h.b(22099347, true, new o(r1Var, welcomeFlowViewModel, activity));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpChooser.class), vt.s0.h(), vt.v.o(), lVar, lVar2, lVar, lVar2, null, bVarB2);
                q1.b bVarB3 = q1.h.b(-116686060, true, new p(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInChooser.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB3);
                iu.l lVar3 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.f
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return a.c.C0606a.p((androidx.compose.animation.d) obj);
                    }
                };
                iu.l lVar4 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.g
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return a.c.C0606a.q((androidx.compose.animation.d) obj);
                    }
                };
                q1.b bVarB4 = q1.h.b(-255471467, true, new q(r1Var, i0Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpEnterEmail.class), vt.s0.h(), vt.v.o(), lVar3, lVar4, lVar3, lVar4, null, bVarB4);
                q1.b bVarB5 = q1.h.b(-394256874, true, new r(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterEmail.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB5);
                q1.b bVarB6 = q1.h.b(-533042281, true, new b(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpCheckEmail.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB6);
                q1.b bVarB7 = q1.h.b(-671827688, true, new C0609c(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpAlreadyHaveAccount.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB7);
                q1.b bVarB8 = q1.h.b(-810613095, true, new d(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInAccountNotFound.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB8);
                Map mapF = vt.s0.f(WelcomeFlowGraphRoutes.SignUpEnterPassword.Companion.a());
                q1.b bVarB9 = q1.h.b(-949398502, true, new e(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpEnterPassword.class), mapF, vt.v.o(), null, null, null, null, null, bVarB9);
                Map mapF2 = vt.s0.f(WelcomeFlowGraphRoutes.SignInEnterPassword.Companion.a());
                q1.b bVarB10 = q1.h.b(-1088183909, true, new f(r1Var, welcomeFlowViewModel));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterPassword.class), mapF2, vt.v.o(), null, null, null, null, null, bVarB10);
                Map mapF3 = vt.s0.f(WelcomeFlowGraphRoutes.ResetPasswordGetInstructions.Companion.a());
                q1.b bVarB11 = q1.h.b(92989929, true, new g(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.ResetPasswordGetInstructions.class), mapF3, vt.v.o(), null, null, null, null, null, bVarB11);
                Map mapF4 = vt.s0.f(WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent.Companion.a());
                q1.b bVarB12 = q1.h.b(-45795478, true, new h(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.ResetPasswordInstructionsSent.class), mapF4, vt.v.o(), null, null, null, null, null, bVarB12);
                WelcomeFlowGraphRoutes.SignInEnterVerificationCode.b bVar = WelcomeFlowGraphRoutes.SignInEnterVerificationCode.Companion;
                Map mapK = vt.s0.k(bVar.a(), bVar.b());
                q1.b bVarB13 = q1.h.b(-184580885, true, new i(r1Var, welcomeFlowViewModel));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInEnterVerificationCode.class), mapK, vt.v.o(), null, null, null, null, null, bVarB13);
                WelcomeFlowGraphRoutes.SignInCheckEmailToVerify.b bVar2 = WelcomeFlowGraphRoutes.SignInCheckEmailToVerify.Companion;
                Map mapK2 = vt.s0.k(bVar2.a(), bVar2.b());
                q1.b bVarB14 = q1.h.b(-323366292, true, new j(r1Var, welcomeFlowViewModel));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignInCheckEmailToVerify.class), mapK2, vt.v.o(), null, null, null, null, null, bVarB14);
                WelcomeFlowGraphRoutes.SignUpInitPersonalVault.b bVar3 = WelcomeFlowGraphRoutes.SignUpInitPersonalVault.Companion;
                Map mapK3 = vt.s0.k(bVar3.a(), bVar3.b());
                q1.b bVarB15 = q1.h.b(-462151699, true, new k(r1Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpInitPersonalVault.class), mapK3, vt.v.o(), null, null, null, null, null, bVarB15);
                q1.b bVarB16 = q1.h.b(-600937106, true, new l(l5Var, r1Var, welcomeFlowViewModel, activity));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB16);
                q1.b bVarB17 = q1.h.b(-739722513, true, new m(welcomeFlowViewModel, r1Var, activity, l5Var));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpPromotePremium.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB17);
                q1.b bVarB18 = q1.h.b(-878507920, true, new n(welcomeFlowViewModel));
                androidx.navigation.compose.r.a(o1Var, ju.n0.b(WelcomeFlowGraphRoutes.SignUpCongratulation.class), vt.s0.h(), vt.v.o(), null, null, null, null, null, bVarB18);
                return ut.m0.f82633a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.animation.h n(androidx.compose.animation.d dVar) {
                ju.t.f(dVar, "$this$composable");
                return androidx.compose.animation.f.o(r.l.l(SyncConstants.ResultCode.BAD_REQUEST, 0, null, 6, null), 0.0f, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.animation.j o(androidx.compose.animation.d dVar) {
                ju.t.f(dVar, "$this$composable");
                return androidx.compose.animation.f.q(r.l.l(SyncConstants.ResultCode.BAD_REQUEST, 0, null, 6, null), 0.0f, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.animation.h p(androidx.compose.animation.d dVar) {
                ju.t.f(dVar, "$this$composable");
                return androidx.compose.animation.f.o(r.l.l(SyncConstants.ResultCode.BAD_REQUEST, 0, null, 6, null), 0.0f, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final androidx.compose.animation.j q(androidx.compose.animation.d dVar) {
                ju.t.f(dVar, "$this$composable");
                return androidx.compose.animation.f.q(r.l.l(SyncConstants.ResultCode.BAD_REQUEST, 0, null, 6, null), 0.0f, 2, null);
            }

            @Override // iu.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                k((z.k) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                return ut.m0.f82633a;
            }

            public final void k(z.k kVar, androidx.compose.runtime.m mVar, int i10) {
                int i11;
                ju.t.f(kVar, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar.V(kVar) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-1569726373, i11, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous>.<anonymous> (WelcomeFlow.kt:108)");
                }
                mVar.W(-973522613);
                if (a.k(this.f39515f)) {
                    float fK1 = ((q3.d) mVar.n(s1.g())).K1(kVar.c());
                    kn.f fVarM = a.m(this.f39516u);
                    mVar.W(5004770);
                    boolean zF = mVar.F(this.f39510a);
                    final WelcomeFlowViewModel welcomeFlowViewModel = this.f39510a;
                    Object objD = mVar.D();
                    if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                        objD = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.b
                            @Override // iu.l
                            public final Object invoke(Object obj) {
                                return a.c.C0606a.l(welcomeFlowViewModel, (kn.f) obj);
                            }
                        };
                        mVar.t(objD);
                    }
                    mVar.Q();
                    vn.j0.b(fK1, fVarM, (iu.l) objD, mVar, 0);
                }
                mVar.Q();
                kn.e.c(a.m(this.f39516u), mVar, 0);
                androidx.navigation.r1 r1Var = this.f39511b;
                WelcomeFlowGraphRoutes welcomeFlowGraphRoutesI = a.i(this.f39517v);
                m.a aVar = v1.m.f83247a;
                mVar.W(-1224400529);
                boolean zF2 = mVar.F(this.f39512c) | mVar.F(this.f39510a) | mVar.F(this.f39511b) | mVar.F(this.f39513d) | mVar.V(this.f39514e);
                final wu.i0 i0Var = this.f39512c;
                final WelcomeFlowViewModel welcomeFlowViewModel2 = this.f39510a;
                final androidx.navigation.r1 r1Var2 = this.f39511b;
                final Activity activity = this.f39513d;
                final l5 l5Var = this.f39514e;
                Object objD2 = mVar.D();
                if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                    objD2 = new iu.l() { // from class: com.server.auditor.ssh.client.ui.auth.welcome.presentation.c
                        @Override // iu.l
                        public final Object invoke(Object obj) {
                            return a.c.C0606a.m(i0Var, welcomeFlowViewModel2, r1Var2, activity, l5Var, (androidx.navigation.o1) obj);
                        }
                    };
                    mVar.t(objD2);
                }
                mVar.Q();
                androidx.navigation.compose.o0.r(r1Var, welcomeFlowGraphRoutesI, aVar, null, null, null, null, null, null, null, null, (iu.l) objD2, mVar, LibTermiusKeygen.KEY_SIZE_384, 0, 2040);
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.a0();
                }
            }
        }

        c(WelcomeFlowViewModel welcomeFlowViewModel, androidx.navigation.r1 r1Var, wu.i0 i0Var, Activity activity, l5 l5Var, l5 l5Var2, l5 l5Var3, l5 l5Var4) {
            this.f39502a = welcomeFlowViewModel;
            this.f39503b = r1Var;
            this.f39504c = i0Var;
            this.f39505d = activity;
            this.f39506e = l5Var;
            this.f39507f = l5Var2;
            this.f39508u = l5Var3;
            this.f39509v = l5Var4;
        }

        public final void b(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1664802811, i10, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow.<anonymous> (WelcomeFlow.kt:101)");
            }
            z.j.c(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.i0.f(v1.m.f83247a, 0.0f, 1, null), a.u(), null, 0.0f, 6, null), null, false, q1.h.d(-1569726373, true, new C0606a(this.f39502a, this.f39503b, this.f39504c, this.f39505d, this.f39506e, this.f39507f, this.f39508u, this.f39509v), mVar, 54), mVar, 3078, 6);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final vn.p e() {
        throw new IllegalStateException("TermiusScreenMetrics not provided");
    }

    public static final void f(final boolean z10, final boolean z11, final iu.p pVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        ju.t.f(pVar, "content");
        androidx.compose.runtime.m mVarG = mVar.g(-1056099218);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.a(z11) ? 32 : 16;
        }
        if ((i10 & LibTermiusKeygen.KEY_SIZE_384) == 0) {
            i11 |= mVarG.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && mVarG.h()) {
            mVarG.M();
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(-1056099218, i11, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.ProvideWelcomeFlowMetrics (WelcomeFlow.kt:900)");
            }
            androidx.compose.runtime.h0.c(f39498a.d(new vn.p(z10, z11)), q1.h.d(523970862, true, new C0605a(pVar), mVarG, 54), mVarG, androidx.compose.runtime.a3.f5133i | 48);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: vn.o
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return com.server.auditor.ssh.client.ui.auth.welcome.presentation.a.g(z10, z11, pVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 g(boolean z10, boolean z11, iu.p pVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        f(z10, z11, pVar, mVar, e3.a(i10 | 1));
        return ut.m0.f82633a;
    }

    public static final void h(WelcomeFlowViewModel welcomeFlowViewModel, SplashScreenViewModel splashScreenViewModel, androidx.compose.runtime.m mVar, final int i10, final int i11) {
        WelcomeFlowViewModel welcomeFlowViewModel2;
        int i12;
        final SplashScreenViewModel splashScreenViewModel2;
        final WelcomeFlowViewModel welcomeFlowViewModel3;
        boolean z10;
        Resources resources;
        Configuration configuration;
        int i13;
        androidx.compose.runtime.m mVarG = mVar.g(714434156);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                welcomeFlowViewModel2 = welcomeFlowViewModel;
                if (mVarG.F(welcomeFlowViewModel2)) {
                    i13 = 4;
                }
                i12 = i13 | i10;
            } else {
                welcomeFlowViewModel2 = welcomeFlowViewModel;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            welcomeFlowViewModel2 = welcomeFlowViewModel;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            splashScreenViewModel2 = splashScreenViewModel;
            i12 |= ((i11 & 2) == 0 && mVarG.F(splashScreenViewModel2)) ? 32 : 16;
        } else {
            splashScreenViewModel2 = splashScreenViewModel;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && mVarG.h()) {
            mVarG.M();
            welcomeFlowViewModel3 = welcomeFlowViewModel2;
        } else {
            mVarG.G();
            if ((i10 & 1) == 0 || mVarG.O()) {
                if ((i11 & 1) != 0) {
                    androidx.lifecycle.n1 n1VarC = j5.b.f61329a.c(mVarG, 6);
                    if (n1VarC == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    androidx.lifecycle.i1 i1VarC = j5.d.c(ju.n0.b(WelcomeFlowViewModel.class), n1VarC, null, null, n1VarC instanceof androidx.lifecycle.o ? ((androidx.lifecycle.o) n1VarC).getDefaultViewModelCreationExtras() : a.b.f55949c, mVarG, 0, 0);
                    mVarG = mVarG;
                    welcomeFlowViewModel2 = (WelcomeFlowViewModel) i1VarC;
                    i14 &= -15;
                }
                int i15 = i14;
                WelcomeFlowViewModel welcomeFlowViewModel4 = welcomeFlowViewModel2;
                if ((i11 & 2) != 0) {
                    Object objN = mVarG.n(e.f.a());
                    ju.t.d(objN, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                    androidx.lifecycle.n1 n1Var = (androidx.lifecycle.n1) objN;
                    androidx.compose.runtime.m mVar2 = mVarG;
                    mVarG = mVar2;
                    splashScreenViewModel2 = (SplashScreenViewModel) j5.d.c(ju.n0.b(SplashScreenViewModel.class), n1Var, null, null, n1Var instanceof androidx.lifecycle.o ? ((androidx.lifecycle.o) n1Var).getDefaultViewModelCreationExtras() : a.b.f55949c, mVar2, 0, 0);
                    welcomeFlowViewModel3 = welcomeFlowViewModel4;
                    i14 = i15 & (-113);
                } else {
                    welcomeFlowViewModel3 = welcomeFlowViewModel4;
                    i14 = i15;
                }
            } else {
                mVarG.M();
                if ((i11 & 1) != 0) {
                    i14 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i14 &= -113;
                }
                welcomeFlowViewModel3 = welcomeFlowViewModel2;
            }
            mVarG.x();
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(714434156, i14, -1, "com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlow (WelcomeFlow.kt:79)");
            }
            l5 l5VarB = f5.a.b(welcomeFlowViewModel3.getStartDestination(), null, null, null, mVarG, 0, 7);
            boolean z11 = false;
            androidx.navigation.r1 r1VarB = androidx.navigation.compose.s.b(new h2[0], mVarG, 0);
            Object objD = mVarG.D();
            m.a aVar = androidx.compose.runtime.m.f5359a;
            if (objD == aVar.a()) {
                objD = androidx.compose.runtime.a1.k(zt.j.f88331a, mVarG);
                mVarG.t(objD);
            }
            final wu.i0 i0Var = (wu.i0) objD;
            Activity activity = (Activity) mVarG.n(e.f.a());
            l5 l5VarB2 = f5.a.b(welcomeFlowViewModel3.getPlansState(), null, null, null, mVarG, 0, 7);
            l5 l5VarB3 = f5.a.b(welcomeFlowViewModel3.getIntroDismissed(), null, null, null, mVarG, 0, 7);
            l5 l5VarP = y4.p(Boolean.valueOf(f1.c0.l(f1.i.f49478a.a(b1.b.b(mVarG, 0)), f1.c0.f49444b.c())), mVarG, 0);
            if (activity == null || (resources = activity.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.keyboard != 2) {
                z10 = true;
            } else {
                z11 = true;
                z10 = true;
            }
            boolean z12 = z10;
            l5 l5VarB4 = f5.a.b(welcomeFlowViewModel3.getWelcomeShineBoxParams(), null, null, null, mVarG, 0, 7);
            zu.f dismissedWelcomeFlow = welcomeFlowViewModel3.getDismissedWelcomeFlow();
            mVarG.W(-1633490746);
            boolean zF = mVarG.F(i0Var) | mVarG.F(splashScreenViewModel2);
            Object objD2 = mVarG.D();
            if (zF || objD2 == aVar.a()) {
                objD2 = new iu.l() { // from class: vn.l
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return com.server.auditor.ssh.client.ui.auth.welcome.presentation.a.n(i0Var, splashScreenViewModel2, (m0) obj);
                    }
                };
                mVarG.t(objD2);
            }
            mVarG.Q();
            np.n.b(dismissedWelcomeFlow, null, null, (iu.l) objD2, mVarG, 0, 6);
            f(l(l5VarP), z11, q1.h.d(-1664802811, z12, new c(welcomeFlowViewModel3, r1VarB, i0Var, activity, l5VarB2, l5VarB3, l5VarB4, l5VarB), mVarG, 54), mVarG, LibTermiusKeygen.KEY_SIZE_384);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: vn.m
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return com.server.auditor.ssh.client.ui.auth.welcome.presentation.a.o(welcomeFlowViewModel3, splashScreenViewModel2, i10, i11, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WelcomeFlowGraphRoutes i(l5 l5Var) {
        return (WelcomeFlowGraphRoutes) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WelcomeFlowViewModel.BillingPlansState j(l5 l5Var) {
        return (WelcomeFlowViewModel.BillingPlansState) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    private static final boolean l(l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn.f m(l5 l5Var) {
        return (kn.f) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 n(wu.i0 i0Var, SplashScreenViewModel splashScreenViewModel, ut.m0 m0Var) {
        ju.t.f(m0Var, "it");
        wu.k.d(i0Var, null, null, new b(splashScreenViewModel, null), 3, null);
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 o(WelcomeFlowViewModel welcomeFlowViewModel, SplashScreenViewModel splashScreenViewModel, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        h(welcomeFlowViewModel, splashScreenViewModel, mVar, e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }

    public static final z2 t() {
        return f39498a;
    }

    public static final c2.d1 u() {
        return d1.a.j(c2.d1.f14925b, vt.v.r(c2.n1.j(rk.b.h0()), c2.n1.j(rk.b.g0())), 0.0f, 0.0f, 0, 14, null);
    }
}

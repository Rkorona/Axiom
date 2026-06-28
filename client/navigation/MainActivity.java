package com.server.auditor.ssh.client.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.l5;
import androidx.lifecycle.l1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.SyncServiceHelper;
import com.server.auditor.ssh.client.ui.base.domain.SplashScreenViewModel;
import com.server.auditor.ssh.client.ui.enterprise.domain.a;
import com.server.auditor.ssh.client.ui.enterprise.presentation.EnterpriseContinueOnDesktopScreen;
import l4.g;

/* JADX INFO: loaded from: classes3.dex */
public final class MainActivity extends TermiusBasicActivity {
    public static final a N = new a(null);
    public static final int O = 8;
    private final uj.q A;
    private final com.server.auditor.ssh.client.ui.sshid.domain.a B;
    private final uj.s C;
    private final uj.h D;
    private final uj.l E;
    private final uj.f F;
    private final uj.k G;
    private final uj.c H;
    private final eo.e I;
    private final uj.i J;
    private final uj.a K;
    private final uj.j L;
    private final wn.g M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ut.n f28210d = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.navigation.y0
        @Override // iu.a
        public final Object a() {
            return MainActivity.B0(this.f35125a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ut.n f28211e = new androidx.lifecycle.k1(ju.n0.b(SplashScreenViewModel.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final uj.u f28212f = new uj.u(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final uj.e f28213u = new uj.e(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f28214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final jn.g f28215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final tp.g0 f28216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.server.auditor.ssh.client.ui.enterprise.domain.a f28217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final uj.n f28218z;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b implements iu.p {

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28221b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l5 f28222c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, l5 l5Var, zt.e eVar) {
                super(2, eVar);
                this.f28221b = mainActivity;
                this.f28222c = l5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f28221b, this.f28222c, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f28220a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                if (!b.e(this.f28222c)) {
                    this.f28221b.y0();
                }
                return ut.m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.MainActivity$b$b, reason: collision with other inner class name */
        static final class C0448b implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l5 f28223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28224b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.MainActivity$b$b$a */
            static final class a implements iu.q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ MainActivity f28225a;

                a(MainActivity mainActivity) {
                    this.f28225a = mainActivity;
                }

                public final void b(boolean z10, androidx.compose.runtime.m mVar, int i10) {
                    if ((i10 & 6) == 0) {
                        i10 |= mVar.a(z10) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && mVar.h()) {
                        mVar.M();
                        return;
                    }
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.b0(745028378, i10, -1, "com.server.auditor.ssh.client.navigation.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:239)");
                    }
                    if (z10) {
                        mVar.W(-1250541295);
                        com.server.auditor.ssh.client.ui.auth.welcome.presentation.a.h(null, null, mVar, 0, 3);
                        if (!co.g0.f(mVar, 0)) {
                            co.g0.c(this.f28225a, 0, mVar, 0, 1);
                        }
                        mVar.Q();
                    } else {
                        mVar.W(-1250357620);
                        g6.e0(null, mVar, 0, 1);
                        mVar.Q();
                    }
                    if (androidx.compose.runtime.w.R()) {
                        androidx.compose.runtime.w.a0();
                    }
                }

                @Override // iu.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b(((Boolean) obj).booleanValue(), (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
                    return ut.m0.f82633a;
                }
            }

            C0448b(l5 l5Var, MainActivity mainActivity) {
                this.f28223a = l5Var;
                this.f28224b = mainActivity;
            }

            public final void b(androidx.compose.runtime.m mVar, int i10) {
                if ((i10 & 3) == 2 && mVar.h()) {
                    mVar.M();
                    return;
                }
                if (androidx.compose.runtime.w.R()) {
                    androidx.compose.runtime.w.b0(-536603621, i10, -1, "com.server.auditor.ssh.client.navigation.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:238)");
                }
                q.j.a(Boolean.valueOf(b.e(this.f28223a)), null, r.l.l(SyncConstants.ResultCode.BAD_REQUEST, 0, null, 6, null), null, q1.h.d(745028378, true, new a(this.f28224b), mVar, 54), mVar, 24576, 10);
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

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(l5 l5Var) {
            return ((Boolean) l5Var.getValue()).booleanValue();
        }

        public final void d(androidx.compose.runtime.m mVar, int i10) {
            if ((i10 & 3) == 2 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1544666655, i10, -1, "com.server.auditor.ssh.client.navigation.MainActivity.onCreate.<anonymous> (MainActivity.kt:229)");
            }
            androidx.activity.r.b(MainActivity.this, null, null, 3, null);
            l5 l5VarB = f5.a.b(MainActivity.this.A0().getShowWelcome(), null, null, null, mVar, 0, 7);
            Boolean boolValueOf = Boolean.valueOf(e(l5VarB));
            mVar.W(-1633490746);
            boolean zV = mVar.V(l5VarB) | mVar.F(MainActivity.this);
            MainActivity mainActivity = MainActivity.this;
            Object objD = mVar.D();
            if (zV || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new a(mainActivity, l5VarB, null);
                mVar.t(objD);
            }
            mVar.Q();
            androidx.compose.runtime.a1.e(boolValueOf, (iu.p) objD, mVar, 0);
            qk.d.d(false, q1.h.d(-536603621, true, new C0448b(l5VarB, MainActivity.this), mVar, 54), mVar, 48, 1);
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

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28226a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f28226a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (TermiusApplication.T()) {
                TermiusApplication.s();
                TermiusApplication.d();
            }
            if (TermiusApplication.T()) {
                TermiusApplication.t();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4.s f28227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f28228b;

        d(l4.s sVar, MainActivity mainActivity) {
            this.f28227a = sVar;
            this.f28228b = mainActivity;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ju.t.f(animator, "animation");
            this.f28227a.b();
            this.f28228b.y0();
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28229a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MainActivity.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f28229a;
            if (i10 == 0) {
                ut.x.b(obj);
                if (MainActivity.this.M.a()) {
                    return ut.m0.f82633a;
                }
                com.server.auditor.ssh.client.ui.enterprise.domain.a aVar = MainActivity.this.f28217y;
                this.f28229a = 1;
                obj = aVar.a(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            if (((a.InterfaceC0626a) obj) instanceof a.InterfaceC0626a.C0627a) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) EnterpriseContinueOnDesktopScreen.class));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public static final class f extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f28231a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l1.c a() {
            return this.f28231a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28232a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28232a = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.m1 a() {
            return this.f28232a.getViewModelStore();
        }
    }

    public static final class h extends ju.u implements iu.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ iu.a f28233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28234b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(iu.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f28233a = aVar;
            this.f28234b = componentActivity;
        }

        @Override // iu.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i5.a a() {
            i5.a aVar;
            iu.a aVar2 = this.f28233a;
            return (aVar2 == null || (aVar = (i5.a) aVar2.a()) == null) ? this.f28234b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public MainActivity() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.f28214v = aVarN;
        ug.c cVarQ = aVarN.Q();
        ju.t.e(cVarQ, "getKeyValueStorage(...)");
        this.f28215w = new jn.g(cVarQ);
        hg.b2 b2Var = hg.b2.f52944a;
        tp.g0 g0VarY1 = b2Var.y1();
        this.f28216x = g0VarY1;
        hg.d dVarM = aVarN.M();
        ju.t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        il.m mVar = new il.m(dVarM, b2Var.s1());
        hg.d dVarM2 = aVarN.M();
        ju.t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        this.f28217y = new com.server.auditor.ssh.client.ui.enterprise.domain.a(mVar, new og.s(dVarM2), new kp.c(new in.c(g0VarY1)));
        ju.t.e(aVarN, "termiusStorage");
        uj.n nVar = new uj.n(this, aVarN);
        this.f28218z = nVar;
        SyncServiceHelper syncServiceHelperY = hg.f.p().Y();
        ju.t.e(syncServiceHelperY, "getSyncServiceHelper(...)");
        uj.q qVar = new uj.q(this, syncServiceHelperY);
        this.A = qVar;
        ug.c cVarQ2 = com.server.auditor.ssh.client.app.a.N().Q();
        ju.t.e(cVarQ2, "getKeyValueStorage(...)");
        com.server.auditor.ssh.client.ui.sshid.domain.a aVar = new com.server.auditor.ssh.client.ui.sshid.domain.a(this, new wn.g(new jn.g(cVarQ2)));
        this.B = aVar;
        SyncServiceHelper syncServiceHelperY2 = hg.f.p().Y();
        ju.t.e(syncServiceHelperY2, "getSyncServiceHelper(...)");
        hg.d dVarM3 = aVarN.M();
        ju.t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.interactors.a0 a0Var = new com.server.auditor.ssh.client.interactors.a0(dVarM3);
        ju.t.e(aVarN, "termiusStorage");
        hg.d dVarM4 = aVarN.M();
        ju.t.e(dVarM4, "getInsensitiveKeyValueRepository(...)");
        this.C = new uj.s(this, nVar, qVar, aVar, syncServiceHelperY2, a0Var, aVarN, dVarM4);
        FirebaseMessaging firebaseMessagingL = FirebaseMessaging.l();
        ju.t.e(firebaseMessagingL, "getInstance(...)");
        ug.c cVarQ3 = aVarN.Q();
        ju.t.e(cVarQ3, "getKeyValueStorage(...)");
        ju.t.e(aVarN, "termiusStorage");
        SyncServiceHelper syncServiceHelperY3 = hg.f.p().Y();
        ju.t.e(syncServiceHelperY3, "getSyncServiceHelper(...)");
        this.D = new uj.h(firebaseMessagingL, cVarQ3, aVarN, syncServiceHelperY3);
        androidx.lifecycle.k0 k0VarD = aVarN.D();
        ju.t.e(k0VarD, "getBulkAccountResult(...)");
        ju.t.e(aVarN, "termiusStorage");
        SyncServiceHelper syncServiceHelperY4 = hg.f.p().Y();
        ju.t.e(syncServiceHelperY4, "getSyncServiceHelper(...)");
        this.E = new uj.l(this, k0VarD, aVarN, syncServiceHelperY4);
        SessionManager sessionManager = SessionManager.getInstance();
        ju.t.e(sessionManager, "getInstance(...)");
        this.F = new uj.f(this, sessionManager);
        this.G = new uj.k(this);
        uj.c cVar = new uj.c(this);
        this.H = cVar;
        eo.e eVar = new eo.e();
        this.I = eVar;
        uj.i iVar = new uj.i(this, null, null, 6, null);
        this.J = iVar;
        this.K = new uj.a(cVar, eVar, iVar);
        this.L = new uj.j(this, nVar);
        ug.c cVarQ4 = com.server.auditor.ssh.client.app.a.N().Q();
        ju.t.e(cVarQ4, "getKeyValueStorage(...)");
        this.M = new wn.g(new jn.g(cVarQ4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SplashScreenViewModel A0() {
        return (SplashScreenViewModel) this.f28211e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeScreenViewModel B0(MainActivity mainActivity) {
        return (HomeScreenViewModel) new androidx.lifecycle.l1(mainActivity).a(HomeScreenViewModel.class);
    }

    private final boolean C0(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        String scheme = data.getScheme();
        return ju.t.b("ssh", scheme) || ju.t.b("telnet", scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D0(MainActivity mainActivity) {
        return ((Boolean) mainActivity.A0().isLoading().getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(MainActivity mainActivity, l4.s sVar) {
        ju.t.f(sVar, "provider");
        mainActivity.F0(sVar);
    }

    private final void F0(l4.s sVar) {
        y0();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(sVar.a(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new d(sVar, this));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(MainActivity mainActivity) {
        tp.r0.c(mainActivity.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        if (getResources().getBoolean(R.bool.isTablet) || ((Boolean) A0().getShowWelcome().getValue()).booleanValue()) {
            o4.z2 z2VarA = o4.m1.a(getWindow(), getWindow().getDecorView());
            ju.t.e(z2VarA, "getInsetsController(...)");
            z2VarA.d(false);
        } else {
            boolean zC = tp.c1.c(this);
            o4.z2 z2VarA2 = o4.m1.a(getWindow(), getWindow().getDecorView());
            ju.t.e(z2VarA2, "getInsetsController(...)");
            z2VarA2.d(!zC);
        }
    }

    public final void H0() {
        bh.a.b(this, new e(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.InAppMessageRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        l4.g gVarA = l4.g.f63579b.a(this);
        super.onCreate(bundle);
        y0();
        gVarA.c(new g.d() { // from class: com.server.auditor.ssh.client.navigation.w0
            @Override // l4.g.d
            public final boolean a() {
                return MainActivity.D0(this.f35089a);
            }
        });
        gVarA.d(new g.e() { // from class: com.server.auditor.ssh.client.navigation.x0
            @Override // l4.g.e
            public final void a(l4.s sVar) {
                MainActivity.E0(this.f35093a, sVar);
            }
        });
        this.E.e();
        e.e.b(this, null, q1.h.b(1544666655, true, new b()), 1, null);
        Intent intent = getIntent();
        if (intent != null && ju.t.b("termius://app/launch", intent.getDataString())) {
            com.server.auditor.ssh.client.utils.analytics.a.y().U5();
        }
        this.G.b();
        this.C.f();
        this.K.h(bundle, getIntent(), this);
        this.f28218z.c();
        this.f28213u.g();
        this.f28212f.f();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.C.g();
        this.F.b();
        this.E.f();
        this.G.c();
        if (isFinishing()) {
            uj.o.f81956a.a();
        }
        mj.b.a();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        ju.t.f(intent, "intent");
        super.onNewIntent(intent);
        this.K.i(intent, this);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        TermiusApplication.e();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f28214v.t0()) {
            setIntent(new Intent());
            this.f28214v.E0();
        }
        this.D.b();
        this.F.c();
        this.f28218z.e();
        if (!this.f28215w.a()) {
            if (C0(getIntent())) {
                setIntent(new Intent());
            }
            this.K.d(this);
            NewConnectionFlowActivity.Companion.reopenDialogIfNeeded();
        }
        H0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        SessionManager.getInstance().terminalSessionHelper.resetTabSelectedToVaultsOnMainScreenStart();
        this.L.a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.L.b();
        new Thread(new Runnable() { // from class: com.server.auditor.ssh.client.navigation.z0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.G0(this.f35128a);
            }
        }).start();
        super.onStop();
    }

    public final HomeScreenViewModel z0() {
        return (HomeScreenViewModel) this.f28210d.getValue();
    }
}

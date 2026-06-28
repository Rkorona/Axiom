package com.server.auditor.ssh.client.ui.base.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.base.domain.SplashScreenViewModel;
import iu.p;
import iu.q;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wn.h;
import wn.i;
import wu.i0;
import zu.g;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SplashScreenViewModel extends AndroidViewModel {
    private static final long LOADING_TIMEOUT = 6000;
    private final w _isSplitLoading;
    private final w _showWelcome;
    private final hg.d insensitiveKeyValueRepository;
    private final nn.a isDesktopPromoStartedUseCase;
    private final k0 isLoading;
    private final h isOnboardingFinishedUseCase;
    private final i isShowWelcomeNeeded;
    private final nn.b isTrialPromoStartedUseCase;
    private final nn.c sendWelcomePassedOnceUseCase;
    private final k0 showWelcome;
    private final zu.f timeout;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39645a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m0 k(SplashScreenViewModel splashScreenViewModel) {
            Object value;
            w wVar = splashScreenViewModel._isSplitLoading;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, Boolean.FALSE));
            return m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SplashScreenViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39645a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            hg.h hVar = hg.h.f53016a;
            final SplashScreenViewModel splashScreenViewModel = SplashScreenViewModel.this;
            hVar.d(new iu.a() { // from class: com.server.auditor.ssh.client.ui.base.domain.a
                @Override // iu.a
                public final Object a() {
                    return SplashScreenViewModel.b.k(splashScreenViewModel);
                }
            });
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f39648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f39649c;

        c(zt.e eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, boolean z11, zt.e eVar) {
            c cVar = new c(eVar);
            cVar.f39648b = z10;
            cVar.f39649c = z11;
            return cVar.invokeSuspend(m0.f82633a);
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zt.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39647a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(!this.f39649c && this.f39648b);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39650a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SplashScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39650a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SplashScreenViewModel.this.initSplit();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(g gVar, zt.e eVar) {
            return ((d) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39652a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SplashScreenViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39652a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (SplashScreenViewModel.this.isShowWelcomeNeeded.a()) {
                w wVar = SplashScreenViewModel.this._showWelcome;
                do {
                    value2 = wVar.getValue();
                    ((Boolean) value2).getClass();
                } while (!wVar.g(value2, kotlin.coroutines.jvm.internal.b.a(true)));
            } else {
                w wVar2 = SplashScreenViewModel.this._showWelcome;
                do {
                    value = wVar2.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar2.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
                SplashScreenViewModel.this.sendWelcomePassedOnceUseCase.a();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(g gVar, zt.e eVar) {
            return ((e) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f39655b;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            f fVar = new f(eVar);
            fVar.f39655b = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            if (r1.emit(r8, r7) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r7.f39654a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                ut.x.b(r8)
                goto L62
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f39655b
                zu.g r1 = (zu.g) r1
                ut.x.b(r8)
                goto L52
            L25:
                java.lang.Object r1 = r7.f39655b
                zu.g r1 = (zu.g) r1
                ut.x.b(r8)
                goto L45
            L2d:
                ut.x.b(r8)
                java.lang.Object r8 = r7.f39655b
                zu.g r8 = (zu.g) r8
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r7.f39655b = r8
                r7.f39654a = r4
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L44
                goto L61
            L44:
                r1 = r8
            L45:
                r7.f39655b = r1
                r7.f39654a = r3
                r5 = 6000(0x1770, double:2.9644E-320)
                java.lang.Object r8 = wu.s0.b(r5, r7)
                if (r8 != r0) goto L52
                goto L61
            L52:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
                r3 = 0
                r7.f39655b = r3
                r7.f39654a = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L62
            L61:
                return r0
            L62:
                ut.m0 r8 = ut.m0.f82633a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.base.domain.SplashScreenViewModel.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(g gVar, zt.e eVar) {
            return ((f) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewModel(Application application) {
        super(application);
        t.f(application, "application");
        zu.f fVarB = zu.h.B(new f(null));
        this.timeout = fVarB;
        Boolean bool = Boolean.TRUE;
        w wVarA = zu.m0.a(bool);
        this._isSplitLoading = wVarA;
        zu.f fVarL = zu.h.L(zu.h.h(wVarA, fVarB, new c(null)), new d(null));
        i0 i0VarA = j1.a(this);
        g0.a aVar = g0.f88389a;
        this.isLoading = zu.h.P(fVarL, i0VarA, aVar.c(), bool);
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        this.insensitiveKeyValueRepository = dVarM;
        t.e(dVarM, "insensitiveKeyValueRepository");
        nn.a aVar2 = new nn.a(dVarM);
        this.isDesktopPromoStartedUseCase = aVar2;
        t.e(dVarM, "insensitiveKeyValueRepository");
        nn.b bVar = new nn.b(dVarM);
        this.isTrialPromoStartedUseCase = bVar;
        t.e(dVarM, "insensitiveKeyValueRepository");
        h hVar = new h(dVarM);
        this.isOnboardingFinishedUseCase = hVar;
        this.isShowWelcomeNeeded = new i(hVar, bVar, aVar2);
        t.e(dVarM, "insensitiveKeyValueRepository");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.sendWelcomePassedOnceUseCase = new nn.c(dVarM, aVarY);
        Boolean bool2 = Boolean.FALSE;
        w wVarA2 = zu.m0.a(bool2);
        this._showWelcome = wVarA2;
        this.showWelcome = zu.h.P(zu.h.L(wVarA2, new e(null)), j1.a(this), aVar.c(), bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSplit() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final k0 getShowWelcome() {
        return this.showWelcome;
    }

    public final k0 isLoading() {
        return this.isLoading;
    }

    public final void onWelcomeScreenResultReceived() {
        Object value;
        w wVar = this._showWelcome;
        do {
            value = wVar.getValue();
            ((Boolean) value).getClass();
        } while (!wVar.g(value, Boolean.FALSE));
        this.sendWelcomePassedOnceUseCase.a();
    }
}

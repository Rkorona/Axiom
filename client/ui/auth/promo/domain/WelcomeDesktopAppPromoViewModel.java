package com.server.auditor.ssh.client.ui.auth.promo.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.R;
import hg.b2;
import il.l0;
import iu.p;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.s0;
import zu.g;
import zu.g0;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeDesktopAppPromoViewModel extends AndroidViewModel {
    private static final long DELAY_BEFORE_RESET_COPIED_STATE = 3000;
    private final w _isCopied;
    private final w _isWaiting;
    private final w _linkSent;
    private final yu.d _onSkipWaiting;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final k0 hasDesktop;
    private final k0 isCopied;
    private final k0 isWaiting;
    private final k0 linkSent;
    private final zu.f onSkipWaiting;
    private final l0 sendBackUpAndSyncPromoEmailRepository;
    private final nn.d updateScreenStartedUseCase;
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
        int f39086a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39086a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            hg.f.p().Y().startProfileAndBulkSync();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(g gVar, zt.e eVar) {
            return ((b) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39087a;

        static final class a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f39089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WelcomeDesktopAppPromoViewModel f39090b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WelcomeDesktopAppPromoViewModel welcomeDesktopAppPromoViewModel, zt.e eVar) {
                super(2, eVar);
                this.f39090b = welcomeDesktopAppPromoViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f39090b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object objF = au.b.f();
                int i10 = this.f39089a;
                if (i10 == 0) {
                    x.b(obj);
                    this.f39089a = 1;
                    if (s0.b(WelcomeDesktopAppPromoViewModel.DELAY_BEFORE_RESET_COPIED_STATE, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(obj);
                }
                w wVar = this.f39090b._isCopied;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeDesktopAppPromoViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            au.b.f();
            if (this.f39087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeDesktopAppPromoViewModel.this._isCopied;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            String string = WelcomeDesktopAppPromoViewModel.this.getApplication().getString(R.string.welcome_install_desktop);
            t.e(string, "getString(...)");
            String string2 = WelcomeDesktopAppPromoViewModel.this.getApplication().getString(R.string.welcome_install_desktop_link_uri);
            t.e(string2, "getString(...)");
            com.server.auditor.ssh.client.help.c cVarY0 = b2.f52944a.Y0();
            cVarY0.a().setPrimaryClip(cVarY0.b(string, string2));
            w wVar2 = WelcomeDesktopAppPromoViewModel.this._isWaiting;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(true)));
            w wVar3 = WelcomeDesktopAppPromoViewModel.this._isCopied;
            do {
                value3 = wVar3.getValue();
                ((Boolean) value3).getClass();
            } while (!wVar3.g(value3, kotlin.coroutines.jvm.internal.b.a(true)));
            WelcomeDesktopAppPromoViewModel.this.analytics.n6();
            wu.k.d(j1.a(WelcomeDesktopAppPromoViewModel.this), null, null, new a(WelcomeDesktopAppPromoViewModel.this, null), 3, null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39091a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeDesktopAppPromoViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object objF = au.b.f();
            int i10 = this.f39091a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeDesktopAppPromoViewModel.this._isWaiting;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                l0 l0Var = WelcomeDesktopAppPromoViewModel.this.sendBackUpAndSyncPromoEmailRepository;
                this.f39091a = 1;
                obj = l0Var.b(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (t.b((l0.a) obj, l0.a.d.f56475a)) {
                w wVar2 = WelcomeDesktopAppPromoViewModel.this._linkSent;
                do {
                    value3 = wVar2.getValue();
                    ((Boolean) value3).getClass();
                } while (!wVar2.g(value3, kotlin.coroutines.jvm.internal.b.a(true)));
            } else {
                w wVar3 = WelcomeDesktopAppPromoViewModel.this._isWaiting;
                do {
                    value2 = wVar3.getValue();
                    ((Boolean) value2).getClass();
                } while (!wVar3.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            }
            WelcomeDesktopAppPromoViewModel.this.analytics.o6();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39093a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeDesktopAppPromoViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39093a;
            if (i10 == 0) {
                x.b(obj);
                WelcomeDesktopAppPromoViewModel.this.updateScreenStarted(false);
                yu.d dVar = WelcomeDesktopAppPromoViewModel.this._onSkipWaiting;
                m0 m0Var = m0.f82633a;
                this.f39093a = 1;
                if (dVar.b(m0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39095a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39097c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f39097c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeDesktopAppPromoViewModel.this.new f(this.f39097c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39095a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeDesktopAppPromoViewModel.this.updateScreenStartedUseCase.a(this.f39097c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeDesktopAppPromoViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        Boolean bool = Boolean.FALSE;
        w wVarA = zu.m0.a(bool);
        this._isWaiting = wVarA;
        this.isWaiting = h.b(wVarA);
        w wVarA2 = zu.m0.a(bool);
        this._isCopied = wVarA2;
        this.isCopied = h.b(wVarA2);
        w wVarA3 = zu.m0.a(bool);
        this._linkSent = wVarA3;
        this.linkSent = h.b(wVarA3);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._onSkipWaiting = dVarB;
        this.onSkipWaiting = h.M(dVarB);
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.updateScreenStartedUseCase = new nn.d(dVarM);
        b2 b2Var = b2.f52944a;
        this.sendBackUpAndSyncPromoEmailRepository = new l0(b2Var.O1());
        this.hasDesktop = h.P(h.L(androidx.lifecycle.m.a(b2Var.y1().b("promotions_has_desktop_device", false)), new b(null)), j1.a(this), g0.a.b(g0.f88389a, 5000L, 0L, 2, null), bool);
        aVarY.v0();
    }

    public final k0 getHasDesktop() {
        return this.hasDesktop;
    }

    public final k0 getLinkSent() {
        return this.linkSent;
    }

    public final zu.f getOnSkipWaiting() {
        return this.onSkipWaiting;
    }

    public final k0 isCopied() {
        return this.isCopied;
    }

    public final k0 isWaiting() {
        return this.isWaiting;
    }

    public final void onCopyPressed() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onGetEmailPressed() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onSkipPressed() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void updateScreenStarted(boolean z10) {
        wu.k.d(j1.a(this), null, null, new f(z10, null), 3, null);
    }
}

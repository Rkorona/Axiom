package com.server.auditor.ssh.client.pincode;

import android.os.Build;
import android.view.KeyEvent;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.pincode.pattern.widget.LockPatternView;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import hg.b2;
import io.split.android.client.service.sseclient.EventStreamParser;
import java.util.Arrays;
import java.util.List;
import jg.a;
import ju.t;
import og.u;
import qi.d;
import ut.x;
import vk.g0;
import vk.h0;
import vk.i0;
import vk.j0;
import vk.k0;
import vk.l0;
import vk.m0;
import vk.n0;
import vk.o0;
import vk.r0;
import vk.v0;
import wu.s0;
import wu.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class PinScreenViewModel extends i1 implements a.InterfaceC0920a {
    private static int failedRetries = 0;
    public static final int maxRetriesThreshold = 5;
    public static final int minPatternComplexity = 4;
    private static final int minuteSeconds = 60;
    private static final long patternReloadDelay = 1000;
    private static final long repeatUIDelay = 500;
    private static final long secondMillis = 1000;
    private static final long successMatchUIDelay = 500;
    private static final long unlockTimerRepeatDelay = 1000;
    private static final long wrongMatchUIDelay = 5000;
    private String action;
    private jg.a appLockMasterPasswordInteractor;
    private vk.e checkHasApiKeyRepository;
    private boolean isNeedShowBiometricUnlock;
    private h0 lockPatternInteractor;
    private i0 mainView;
    private j0 masterPasswordFragmentView;
    private g0 patternFragmentView;
    private k0 pinCode4Interactor;
    private k0 pinCode6Interactor;
    private l0 pinFragmentView;
    private u1 reloadJob;
    private m0 termiusIsUnderAttackView;
    private n0 timedLockFragmentView;
    private o0 timedLockInteractor;
    private u1 timedUnlockJob;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private static final su.p pinCodeRegex = new su.p("^[0-9]+");
    private byte[] encodedPasswordByteArray = new byte[0];
    private String username = "";

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35173b;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            b bVar = PinScreenViewModel.this.new b(eVar);
            bVar.f35173b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            wu.i0 i0Var;
            Object objF = au.b.f();
            int i10 = this.f35172a;
            if (i10 == 0) {
                x.b(obj);
                wu.i0 i0Var2 = (wu.i0) this.f35173b;
                this.f35173b = i0Var2;
                this.f35172a = 1;
                if (s0.b(1000L, this) == objF) {
                    return objF;
                }
                i0Var = i0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var = (wu.i0) this.f35173b;
                x.b(obj);
            }
            if (wu.j0.g(i0Var)) {
                g0 g0Var = PinScreenViewModel.this.patternFragmentView;
                if (g0Var != null) {
                    g0Var.J1();
                }
                PinScreenViewModel.this.onPatternCleared();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35175a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35175a;
            if (i10 == 0) {
                x.b(obj);
                this.f35175a = 1;
                if (s0.b(5000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            g0 g0Var = PinScreenViewModel.this.patternFragmentView;
            if (g0Var != null) {
                g0Var.k4(LockPatternView.DisplayMode.Wrong);
            }
            g0 g0Var2 = PinScreenViewModel.this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.p2(TermiusApplication.F().getResources().getString(R.string.app_lock_wrong_pattern_attempts_left, kotlin.coroutines.jvm.internal.b.d(PinScreenViewModel.this.remainTries())));
            }
            PinScreenViewModel.this.wrongPatternReload();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35177a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PinScreenViewModel.this.unlock();
            i0 i0Var = PinScreenViewModel.this.mainView;
            i0 i0Var2 = null;
            if (i0Var == null) {
                t.t("mainView");
                i0Var = null;
            }
            i0Var.s();
            i0 i0Var3 = PinScreenViewModel.this.mainView;
            if (i0Var3 == null) {
                t.t("mainView");
            } else {
                i0Var2 = i0Var3;
            }
            i0Var2.close();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35179a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a f35181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d.a aVar, zt.e eVar) {
            super(2, eVar);
            this.f35181c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new e(this.f35181c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35179a;
            if (i10 == 0) {
                x.b(obj);
                j0 j0Var = PinScreenViewModel.this.masterPasswordFragmentView;
                if (j0Var == null) {
                    t.t("masterPasswordFragmentView");
                    j0Var = null;
                }
                j0Var.b0(false);
                j0 j0Var2 = PinScreenViewModel.this.masterPasswordFragmentView;
                if (j0Var2 == null) {
                    t.t("masterPasswordFragmentView");
                    j0Var2 = null;
                }
                j0Var2.oa(false);
                j0 j0Var3 = PinScreenViewModel.this.masterPasswordFragmentView;
                if (j0Var3 == null) {
                    t.t("masterPasswordFragmentView");
                    j0Var3 = null;
                }
                j0Var3.d();
                jg.a aVar = PinScreenViewModel.this.appLockMasterPasswordInteractor;
                if (aVar == null) {
                    t.t("appLockMasterPasswordInteractor");
                    aVar = null;
                }
                byte[] bArrA = this.f35181c.a();
                ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
                String token = apiKey != null ? apiKey.getToken() : null;
                if (token == null) {
                    token = "";
                }
                this.f35179a = 1;
                if (aVar.a(bArrA, token, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35182a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35182a;
            if (i10 == 0) {
                x.b(obj);
                this.f35182a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (!PinScreenViewModel.this.switchCreateMode()) {
                String str = PinScreenViewModel.this.action;
                if (str == null) {
                    t.t("action");
                    str = null;
                }
                if (t.b(str, "pin_screen_action_enter")) {
                    l0 l0Var = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var != null) {
                        l0Var.z0();
                    }
                    l0 l0Var2 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var2 != null) {
                        l0Var2.R(false);
                    }
                    l0 l0Var3 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var3 != null) {
                        l0Var3.c0(false);
                    }
                    l0 l0Var4 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var4 != null) {
                        l0Var4.O(false);
                    }
                    l0 l0Var5 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var5 != null) {
                        l0Var5.c9(false);
                    }
                    l0 l0Var6 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var6 != null) {
                        l0Var6.p2(null);
                    }
                    l0 l0Var7 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var7 != null) {
                        l0Var7.x2(false);
                    }
                    l0 l0Var8 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var8 != null) {
                        l0Var8.l();
                    }
                } else {
                    PinScreenViewModel.this.finishWithSuccess();
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35184a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35184a;
            if (i10 == 0) {
                x.b(obj);
                this.f35184a = 1;
                if (s0.b(5000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (!PinScreenViewModel.this.showLockOnFailedRetry()) {
                PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
                PinScreenViewModel.this.updatePinMasterPasswordVisibility();
                l0 l0Var = PinScreenViewModel.this.pinFragmentView;
                if (l0Var != null) {
                    l0Var.p2(TermiusApplication.F().getString(R.string.app_lock_wrong_pin_attempts_left, kotlin.coroutines.jvm.internal.b.d(PinScreenViewModel.this.remainTries())));
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35186a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35186a;
            if (i10 == 0) {
                x.b(obj);
                this.f35186a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (!PinScreenViewModel.this.switchCreateMode()) {
                String str = PinScreenViewModel.this.action;
                if (str == null) {
                    t.t("action");
                    str = null;
                }
                if (t.b(str, "pin_screen_action_enter")) {
                    l0 l0Var = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var != null) {
                        l0Var.z0();
                    }
                    l0 l0Var2 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var2 != null) {
                        l0Var2.R(false);
                    }
                    l0 l0Var3 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var3 != null) {
                        l0Var3.c0(false);
                    }
                    l0 l0Var4 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var4 != null) {
                        l0Var4.O(false);
                    }
                    l0 l0Var5 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var5 != null) {
                        l0Var5.c9(false);
                    }
                    l0 l0Var6 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var6 != null) {
                        l0Var6.p2(null);
                    }
                    l0 l0Var7 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var7 != null) {
                        l0Var7.x2(false);
                    }
                    l0 l0Var8 = PinScreenViewModel.this.pinFragmentView;
                    if (l0Var8 != null) {
                        l0Var8.l();
                    }
                } else {
                    PinScreenViewModel.this.finishWithSuccess();
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35188a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35188a;
            if (i10 == 0) {
                x.b(obj);
                this.f35188a = 1;
                if (s0.b(5000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            if (!PinScreenViewModel.this.showLockOnFailedRetry()) {
                PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
                PinScreenViewModel.this.updatePinMasterPasswordVisibility();
                l0 l0Var = PinScreenViewModel.this.pinFragmentView;
                if (l0Var != null) {
                    l0Var.p2(TermiusApplication.F().getString(R.string.app_lock_wrong_pin_attempts_left, kotlin.coroutines.jvm.internal.b.d(PinScreenViewModel.this.remainTries())));
                }
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35190a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35190a;
            if (i10 == 0) {
                x.b(obj);
                this.f35190a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PinScreenViewModel.this.finishWithSuccess();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35192a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35192a;
            if (i10 == 0) {
                x.b(obj);
                this.f35192a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            l0 l0Var = PinScreenViewModel.this.pinFragmentView;
            if (l0Var != null) {
                l0Var.x5();
            }
            PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35194a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35194a;
            if (i10 == 0) {
                x.b(obj);
                this.f35194a = 1;
                if (s0.b(5000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
            l0 l0Var = PinScreenViewModel.this.pinFragmentView;
            if (l0Var != null) {
                l0Var.p2(TermiusApplication.F().getString(R.string.app_lock_incorrect_pin_try_again));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35196a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35196a;
            if (i10 == 0) {
                x.b(obj);
                this.f35196a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PinScreenViewModel.this.finishWithSuccess();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35198a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35198a;
            if (i10 == 0) {
                x.b(obj);
                this.f35198a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            l0 l0Var = PinScreenViewModel.this.pinFragmentView;
            if (l0Var != null) {
                l0Var.x5();
            }
            PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35200a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35200a;
            if (i10 == 0) {
                x.b(obj);
                this.f35200a = 1;
                if (s0.b(5000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            PinScreenViewModel.this.clearPinCodeOnUiAndShowKeyboard();
            l0 l0Var = PinScreenViewModel.this.pinFragmentView;
            if (l0Var != null) {
                l0Var.p2(TermiusApplication.F().getString(R.string.app_lock_incorrect_pin_try_again));
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35202a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PinScreenViewModel.this.new p(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f35202a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                ut.x.b(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                ut.x.b(r6)
            L1a:
                r5.f35202a = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = wu.s0.b(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                com.server.auditor.ssh.client.pincode.PinScreenViewModel r6 = com.server.auditor.ssh.client.pincode.PinScreenViewModel.this
                vk.o0 r6 = com.server.auditor.ssh.client.pincode.PinScreenViewModel.access$getTimedLockInteractor$p(r6)
                r1 = 0
                if (r6 != 0) goto L34
                java.lang.String r6 = "timedLockInteractor"
                ju.t.t(r6)
                r6 = r1
            L34:
                boolean r6 = r6.e()
                if (r6 == 0) goto L40
                com.server.auditor.ssh.client.pincode.PinScreenViewModel r6 = com.server.auditor.ssh.client.pincode.PinScreenViewModel.this
                com.server.auditor.ssh.client.pincode.PinScreenViewModel.access$updateTimedLockSecondsViews(r6)
                goto L1a
            L40:
                r6 = 0
                com.server.auditor.ssh.client.pincode.PinScreenViewModel.access$setFailedRetries$cp(r6)
                com.server.auditor.ssh.client.pincode.PinScreenViewModel r6 = com.server.auditor.ssh.client.pincode.PinScreenViewModel.this
                com.server.auditor.ssh.client.pincode.PinScreenViewModel.access$switchUnlockMode(r6)
                com.server.auditor.ssh.client.pincode.PinScreenViewModel r6 = com.server.auditor.ssh.client.pincode.PinScreenViewModel.this
                com.server.auditor.ssh.client.pincode.PinScreenViewModel.access$setTimedUnlockJob$p(r6, r1)
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.pincode.PinScreenViewModel.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    private final boolean areCurrentLockMethodsInvalid() {
        k0 k0Var = this.pinCode4Interactor;
        h0 h0Var = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.c1()) {
            return true;
        }
        k0 k0Var2 = this.pinCode6Interactor;
        if (k0Var2 == null) {
            t.t("pinCode6Interactor");
            k0Var2 = null;
        }
        if (!k0Var2.c1()) {
            return true;
        }
        h0 h0Var2 = this.lockPatternInteractor;
        if (h0Var2 == null) {
            t.t("lockPatternInteractor");
        } else {
            h0Var = h0Var2;
        }
        return !h0Var.i();
    }

    private final boolean areSetLockMethodModeRequest() {
        h0 h0Var = this.lockPatternInteractor;
        k0 k0Var = null;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.h()) {
            return true;
        }
        k0 k0Var2 = this.pinCode4Interactor;
        if (k0Var2 == null) {
            t.t("pinCode4Interactor");
            k0Var2 = null;
        }
        if (k0Var2.i1()) {
            return true;
        }
        k0 k0Var3 = this.pinCode6Interactor;
        if (k0Var3 == null) {
            t.t("pinCode6Interactor");
        } else {
            k0Var = k0Var3;
        }
        return k0Var.i1();
    }

    private final void cancelPatternReload() {
        u1 u1Var = this.reloadJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.reloadJob = null;
    }

    private final void clearHasLockMode() {
        k0 k0Var = this.pinCode4Interactor;
        h0 h0Var = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        k0Var.d1(false);
        k0 k0Var2 = this.pinCode6Interactor;
        if (k0Var2 == null) {
            t.t("pinCode6Interactor");
            k0Var2 = null;
        }
        k0Var2.d1(false);
        h0 h0Var2 = this.lockPatternInteractor;
        if (h0Var2 == null) {
            t.t("lockPatternInteractor");
            h0Var2 = null;
        }
        h0Var2.e(false);
        k0 k0Var3 = this.pinCode4Interactor;
        if (k0Var3 == null) {
            t.t("pinCode4Interactor");
            k0Var3 = null;
        }
        k0Var3.b1();
        k0 k0Var4 = this.pinCode6Interactor;
        if (k0Var4 == null) {
            t.t("pinCode6Interactor");
            k0Var4 = null;
        }
        k0Var4.b1();
        h0 h0Var3 = this.lockPatternInteractor;
        if (h0Var3 == null) {
            t.t("lockPatternInteractor");
        } else {
            h0Var = h0Var3;
        }
        h0Var.J1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPinCodeOnUiAndShowKeyboard() {
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            l0Var.b1();
        }
        l0 l0Var2 = this.pinFragmentView;
        if (l0Var2 != null) {
            l0Var2.i();
        }
    }

    private final void delayedPatternReload() {
        u1 u1Var = this.reloadJob;
        if (u1Var != null) {
            u1.a.a(u1Var, null, 1, null);
        }
        this.reloadJob = wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    private final boolean detectSecurityIssues() {
        if (!areCurrentLockMethodsInvalid()) {
            return false;
        }
        i0 i0Var = this.mainView;
        if (i0Var == null) {
            t.t("mainView");
            i0Var = null;
        }
        i0Var.j();
        return true;
    }

    private final void doCheckAndCreatePattern(List<LockPatternView.Cell> list) {
        if (list.size() < 4) {
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.k4(LockPatternView.DisplayMode.Wrong);
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.p2(TermiusApplication.F().getResources().getQuantityString(R.plurals.alp_42447968_pmsg_connect_x_dots, 4, 4));
            }
            delayedPatternReload();
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.R(true);
                return;
            }
            return;
        }
        h0 h0Var = this.lockPatternInteractor;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        h0Var.d(list);
        g0 g0Var4 = this.patternFragmentView;
        if (g0Var4 != null) {
            g0Var4.W4();
        }
        g0 g0Var5 = this.patternFragmentView;
        if (g0Var5 != null) {
            g0Var5.p2(null);
        }
        g0 g0Var6 = this.patternFragmentView;
        if (g0Var6 != null) {
            g0Var6.Ib(R.string.alp_42447968_cmd_continue);
        }
        g0 g0Var7 = this.patternFragmentView;
        if (g0Var7 != null) {
            g0Var7.E(true);
        }
        g0 g0Var8 = this.patternFragmentView;
        if (g0Var8 != null) {
            g0Var8.g6(true);
        }
        g0 g0Var9 = this.patternFragmentView;
        if (g0Var9 != null) {
            g0Var9.R(true);
        }
    }

    private final void doComparePattern(List<LockPatternView.Cell> list) {
        h0 h0Var = this.lockPatternInteractor;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (!h0Var.c(list)) {
            failedRetries++;
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.b5();
            }
            if (showLockOnFailedRetry()) {
                return;
            }
            u1 u1Var = this.reloadJob;
            if (u1Var != null) {
                u1.a.a(u1Var, null, 1, null);
            }
            this.reloadJob = wu.k.d(j1.a(this), null, null, new c(null), 3, null);
            return;
        }
        unlock();
        clearHasLockMode();
        if (switchCreateMode()) {
            return;
        }
        String str = this.action;
        if (str == null) {
            t.t("action");
            str = null;
        }
        if (!t.b(str, "pin_screen_action_enter")) {
            finishWithSuccess();
            return;
        }
        g0 g0Var2 = this.patternFragmentView;
        if (g0Var2 != null) {
            g0Var2.z0();
        }
        g0 g0Var3 = this.patternFragmentView;
        if (g0Var3 != null) {
            g0Var3.R(false);
        }
        g0 g0Var4 = this.patternFragmentView;
        if (g0Var4 != null) {
            g0Var4.c0(false);
        }
        g0 g0Var5 = this.patternFragmentView;
        if (g0Var5 != null) {
            g0Var5.O(false);
        }
        g0 g0Var6 = this.patternFragmentView;
        if (g0Var6 != null) {
            g0Var6.y3(false);
        }
        g0 g0Var7 = this.patternFragmentView;
        if (g0Var7 != null) {
            g0Var7.g6(false);
        }
        g0 g0Var8 = this.patternFragmentView;
        if (g0Var8 != null) {
            g0Var8.x2(false);
        }
        g0 g0Var9 = this.patternFragmentView;
        if (g0Var9 != null) {
            g0Var9.p2(null);
        }
    }

    private final void doConfirmCreate(List<LockPatternView.Cell> list) {
        h0 h0Var = this.lockPatternInteractor;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.c(list)) {
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.td();
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.Ib(R.string.alp_42447968_cmd_confirm);
            }
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.E(true);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.g6(true);
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.R(true);
                return;
            }
            return;
        }
        g0 g0Var6 = this.patternFragmentView;
        if (g0Var6 != null) {
            g0Var6.E(false);
        }
        g0 g0Var7 = this.patternFragmentView;
        if (g0Var7 != null) {
            g0Var7.g6(true);
        }
        g0 g0Var8 = this.patternFragmentView;
        if (g0Var8 != null) {
            g0Var8.za();
        }
        g0 g0Var9 = this.patternFragmentView;
        if (g0Var9 != null) {
            g0Var9.k4(LockPatternView.DisplayMode.Wrong);
        }
        g0 g0Var10 = this.patternFragmentView;
        if (g0Var10 != null) {
            g0Var10.p2(TermiusApplication.F().getResources().getString(R.string.app_lock_wrong_pattern));
        }
        g0 g0Var11 = this.patternFragmentView;
        if (g0Var11 != null) {
            g0Var11.Ib(R.string.alp_42447968_cmd_confirm);
        }
        g0 g0Var12 = this.patternFragmentView;
        if (g0Var12 != null) {
            g0Var12.R(true);
        }
        delayedPatternReload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithSuccess() {
        failedRetries = 0;
        o0 o0Var = this.timedLockInteractor;
        i0 i0Var = null;
        if (o0Var == null) {
            t.t("timedLockInteractor");
            o0Var = null;
        }
        o0Var.b();
        i0 i0Var2 = this.mainView;
        if (i0Var2 == null) {
            t.t("mainView");
            i0Var2 = null;
        }
        i0Var2.s();
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var3;
        }
        i0Var.close();
    }

    private final int getPinCodeMaxLength() {
        k0 k0Var = this.pinCode6Interactor;
        k0 k0Var2 = null;
        if (k0Var == null) {
            t.t("pinCode6Interactor");
            k0Var = null;
        }
        if (k0Var.k1()) {
            k0 k0Var3 = this.pinCode6Interactor;
            if (k0Var3 == null) {
                t.t("pinCode6Interactor");
            } else {
                k0Var2 = k0Var3;
            }
            return k0Var2.e1();
        }
        k0 k0Var4 = this.pinCode4Interactor;
        if (k0Var4 == null) {
            t.t("pinCode4Interactor");
            k0Var4 = null;
        }
        if (k0Var4.k1()) {
            k0 k0Var5 = this.pinCode4Interactor;
            if (k0Var5 == null) {
                t.t("pinCode4Interactor");
            } else {
                k0Var2 = k0Var5;
            }
            return k0Var2.e1();
        }
        k0 k0Var6 = this.pinCode6Interactor;
        if (k0Var6 == null) {
            t.t("pinCode6Interactor");
            k0Var6 = null;
        }
        if (k0Var6.i1()) {
            k0 k0Var7 = this.pinCode6Interactor;
            if (k0Var7 == null) {
                t.t("pinCode6Interactor");
            } else {
                k0Var2 = k0Var7;
            }
            return k0Var2.e1();
        }
        k0 k0Var8 = this.pinCode4Interactor;
        if (k0Var8 == null) {
            t.t("pinCode4Interactor");
            k0Var8 = null;
        }
        if (!k0Var8.i1()) {
            throw new IllegalStateException("Impossible case. Check your code!");
        }
        k0 k0Var9 = this.pinCode4Interactor;
        if (k0Var9 == null) {
            t.t("pinCode4Interactor");
        } else {
            k0Var2 = k0Var9;
        }
        return k0Var2.e1();
    }

    private final void initCheckHasApiKeyRepository() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        this.checkHasApiKeyRepository = new vk.e(aVarN);
    }

    private final void initCode4Interactor(String str) {
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        vk.m mVar = new vk.m(cVarQ);
        mVar.e();
        mVar.g(t.b("pin_screen_action_set_code_4", str));
        this.pinCode4Interactor = mVar;
    }

    private final void initCode6Interactor(String str) {
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        vk.n nVar = new vk.n(cVarQ);
        nVar.e();
        nVar.g(t.b("pin_screen_action_set_code_6", str));
        this.pinCode6Interactor = nVar;
    }

    private final void initLockPatternInteractor(String str) {
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        wk.n nVar = new wk.n(cVarQ);
        nVar.k();
        nVar.m(t.b("pin_screen_action_set_lock_pattern", str));
        this.lockPatternInteractor = nVar;
    }

    private final void initLoginInteractor() {
        b2 b2Var = b2.f52944a;
        com.server.auditor.ssh.client.repositories.auth.n nVar = new com.server.auditor.ssh.client.repositories.auth.n(b2Var.O1(), b2Var.B1());
        qi.g gVar = new qi.g(new lg.b(), new u());
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        this.appLockMasterPasswordInteractor = new jg.a(nVar, gVar, aVarN, this);
    }

    private final void initShowTouchDialog(String str) {
        boolean zA = prepareBiometricUnlockInteractor().a();
        boolean zB = t.b(str, "pin_screen_action_disable_lock_methods");
        if (areCurrentLockMethodsInvalid() || zB || areSetLockMethodModeRequest()) {
            zA = false;
        }
        this.isNeedShowBiometricUnlock = zA;
    }

    private final void initTimedLockInteractor() {
        ug.c cVarA = com.server.auditor.ssh.client.app.a.N().A();
        t.e(cVarA, "getAppLockStorage(...)");
        v0 v0Var = new v0(cVarA);
        v0Var.h();
        this.timedLockInteractor = v0Var;
    }

    private final void onPinEntered(String str) {
        k0 k0Var = this.pinCode6Interactor;
        k0 k0Var2 = null;
        if (k0Var == null) {
            t.t("pinCode6Interactor");
            k0Var = null;
        }
        if (k0Var.k1()) {
            performCheckExistedPin6(str);
            return;
        }
        k0 k0Var3 = this.pinCode4Interactor;
        if (k0Var3 == null) {
            t.t("pinCode4Interactor");
            k0Var3 = null;
        }
        if (k0Var3.k1()) {
            performCheckExistedPin4(str);
            return;
        }
        k0 k0Var4 = this.pinCode6Interactor;
        if (k0Var4 == null) {
            t.t("pinCode6Interactor");
            k0Var4 = null;
        }
        if (k0Var4.i1()) {
            performCheckNewPin6(str);
            return;
        }
        k0 k0Var5 = this.pinCode4Interactor;
        if (k0Var5 == null) {
            t.t("pinCode4Interactor");
        } else {
            k0Var2 = k0Var5;
        }
        if (k0Var2.i1()) {
            performCheckNewPin4(str);
        }
    }

    private final void performCheckExistedPin4(String str) {
        k0 k0Var = this.pinCode4Interactor;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.j1(str)) {
            failedRetries++;
            u1 u1Var = this.reloadJob;
            if (u1Var != null) {
                u1.a.a(u1Var, null, 1, null);
            }
            this.reloadJob = wu.k.d(j1.a(this), null, null, new g(null), 3, null);
            return;
        }
        k0 k0Var2 = this.pinCode4Interactor;
        if (k0Var2 == null) {
            t.t("pinCode4Interactor");
            k0Var2 = null;
        }
        k0Var2.b1();
        k0 k0Var3 = this.pinCode4Interactor;
        if (k0Var3 == null) {
            t.t("pinCode4Interactor");
            k0Var3 = null;
        }
        k0Var3.d1(false);
        unlock();
        u1 u1Var2 = this.reloadJob;
        if (u1Var2 != null) {
            u1.a.a(u1Var2, null, 1, null);
        }
        this.reloadJob = wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    private final void performCheckExistedPin6(String str) {
        k0 k0Var = this.pinCode6Interactor;
        if (k0Var == null) {
            t.t("pinCode6Interactor");
            k0Var = null;
        }
        if (!k0Var.j1(str)) {
            failedRetries++;
            u1 u1Var = this.reloadJob;
            if (u1Var != null) {
                u1.a.a(u1Var, null, 1, null);
            }
            this.reloadJob = wu.k.d(j1.a(this), null, null, new i(null), 3, null);
            return;
        }
        k0 k0Var2 = this.pinCode6Interactor;
        if (k0Var2 == null) {
            t.t("pinCode6Interactor");
            k0Var2 = null;
        }
        k0Var2.b1();
        k0 k0Var3 = this.pinCode6Interactor;
        if (k0Var3 == null) {
            t.t("pinCode6Interactor");
            k0Var3 = null;
        }
        k0Var3.d1(false);
        unlock();
        u1 u1Var2 = this.reloadJob;
        if (u1Var2 != null) {
            u1.a.a(u1Var2, null, 1, null);
        }
        this.reloadJob = wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    private final void performCheckNewPin4(String str) {
        k0 k0Var = this.pinCode4Interactor;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (k0Var.g1()) {
            k0 k0Var2 = this.pinCode4Interactor;
            if (k0Var2 == null) {
                t.t("pinCode4Interactor");
                k0Var2 = null;
            }
            if (k0Var2.j1(str)) {
                k0 k0Var3 = this.pinCode4Interactor;
                if (k0Var3 == null) {
                    t.t("pinCode4Interactor");
                    k0Var3 = null;
                }
                k0Var3.h1(str);
                k0 k0Var4 = this.pinCode4Interactor;
                if (k0Var4 == null) {
                    t.t("pinCode4Interactor");
                    k0Var4 = null;
                }
                k0Var4.b();
                k0 k0Var5 = this.pinCode6Interactor;
                if (k0Var5 == null) {
                    t.t("pinCode6Interactor");
                    k0Var5 = null;
                }
                k0Var5.b1();
                k0 k0Var6 = this.pinCode6Interactor;
                if (k0Var6 == null) {
                    t.t("pinCode6Interactor");
                    k0Var6 = null;
                }
                k0Var6.b();
                h0 h0Var = this.lockPatternInteractor;
                if (h0Var == null) {
                    t.t("lockPatternInteractor");
                    h0Var = null;
                }
                h0Var.J1();
                h0 h0Var2 = this.lockPatternInteractor;
                if (h0Var2 == null) {
                    t.t("lockPatternInteractor");
                    h0Var2 = null;
                }
                h0Var2.b();
                unlock();
                u1 u1Var = this.reloadJob;
                if (u1Var != null) {
                    u1.a.a(u1Var, null, 1, null);
                }
                this.reloadJob = wu.k.d(j1.a(this), null, null, new j(null), 3, null);
                return;
            }
        }
        k0 k0Var7 = this.pinCode4Interactor;
        if (k0Var7 == null) {
            t.t("pinCode4Interactor");
            k0Var7 = null;
        }
        if (!k0Var7.f1()) {
            u1 u1Var2 = this.reloadJob;
            if (u1Var2 != null) {
                u1.a.a(u1Var2, null, 1, null);
            }
            this.reloadJob = wu.k.d(j1.a(this), null, null, new l(null), 3, null);
            return;
        }
        k0 k0Var8 = this.pinCode4Interactor;
        if (k0Var8 == null) {
            t.t("pinCode4Interactor");
            k0Var8 = null;
        }
        k0Var8.h1(str);
        k0 k0Var9 = this.pinCode4Interactor;
        if (k0Var9 == null) {
            t.t("pinCode4Interactor");
            k0Var9 = null;
        }
        k0Var9.a(true);
        u1 u1Var3 = this.reloadJob;
        if (u1Var3 != null) {
            u1.a.a(u1Var3, null, 1, null);
        }
        this.reloadJob = wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    private final void performCheckNewPin6(String str) {
        k0 k0Var = this.pinCode6Interactor;
        if (k0Var == null) {
            t.t("pinCode6Interactor");
            k0Var = null;
        }
        if (k0Var.g1()) {
            k0 k0Var2 = this.pinCode6Interactor;
            if (k0Var2 == null) {
                t.t("pinCode6Interactor");
                k0Var2 = null;
            }
            if (k0Var2.j1(str)) {
                k0 k0Var3 = this.pinCode6Interactor;
                if (k0Var3 == null) {
                    t.t("pinCode6Interactor");
                    k0Var3 = null;
                }
                k0Var3.h1(str);
                k0 k0Var4 = this.pinCode6Interactor;
                if (k0Var4 == null) {
                    t.t("pinCode6Interactor");
                    k0Var4 = null;
                }
                k0Var4.b();
                k0 k0Var5 = this.pinCode4Interactor;
                if (k0Var5 == null) {
                    t.t("pinCode4Interactor");
                    k0Var5 = null;
                }
                k0Var5.b1();
                k0 k0Var6 = this.pinCode4Interactor;
                if (k0Var6 == null) {
                    t.t("pinCode4Interactor");
                    k0Var6 = null;
                }
                k0Var6.b();
                h0 h0Var = this.lockPatternInteractor;
                if (h0Var == null) {
                    t.t("lockPatternInteractor");
                    h0Var = null;
                }
                h0Var.J1();
                h0 h0Var2 = this.lockPatternInteractor;
                if (h0Var2 == null) {
                    t.t("lockPatternInteractor");
                    h0Var2 = null;
                }
                h0Var2.b();
                unlock();
                u1 u1Var = this.reloadJob;
                if (u1Var != null) {
                    u1.a.a(u1Var, null, 1, null);
                }
                this.reloadJob = wu.k.d(j1.a(this), null, null, new m(null), 3, null);
                return;
            }
        }
        k0 k0Var7 = this.pinCode6Interactor;
        if (k0Var7 == null) {
            t.t("pinCode6Interactor");
            k0Var7 = null;
        }
        if (!k0Var7.f1()) {
            u1 u1Var2 = this.reloadJob;
            if (u1Var2 != null) {
                u1.a.a(u1Var2, null, 1, null);
            }
            this.reloadJob = wu.k.d(j1.a(this), null, null, new o(null), 3, null);
            return;
        }
        k0 k0Var8 = this.pinCode6Interactor;
        if (k0Var8 == null) {
            t.t("pinCode6Interactor");
            k0Var8 = null;
        }
        k0Var8.h1(str);
        k0 k0Var9 = this.pinCode6Interactor;
        if (k0Var9 == null) {
            t.t("pinCode6Interactor");
            k0Var9 = null;
        }
        k0Var9.a(true);
        u1 u1Var3 = this.reloadJob;
        if (u1Var3 != null) {
            u1.a.a(u1Var3, null, 1, null);
        }
        this.reloadJob = wu.k.d(j1.a(this), null, null, new n(null), 3, null);
    }

    private final vk.c prepareBiometricUnlockInteractor() {
        vk.b bVar = new vk.b(Build.VERSION.SDK_INT);
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        vk.d dVar = new vk.d(cVarQ);
        androidx.biometric.e eVarG = androidx.biometric.e.g(TermiusApplication.F());
        t.e(eVarG, "from(...)");
        return new vk.c(bVar, dVar, eVarG);
    }

    private final void presentInitialView() {
        o0 o0Var = this.timedLockInteractor;
        i0 i0Var = null;
        if (o0Var == null) {
            t.t("timedLockInteractor");
            o0Var = null;
        }
        if (o0Var.e()) {
            i0 i0Var2 = this.mainView;
            if (i0Var2 == null) {
                t.t("mainView");
            } else {
                i0Var = i0Var2;
            }
            i0Var.a();
            return;
        }
        if (switchUnlockMode() || switchCreateMode()) {
            return;
        }
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var3;
        }
        i0Var.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int remainTries() {
        return 5 - failedRetries;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showLockOnFailedRetry() {
        if (failedRetries < 5) {
            return false;
        }
        o0 o0Var = this.timedLockInteractor;
        i0 i0Var = null;
        if (o0Var == null) {
            t.t("timedLockInteractor");
            o0Var = null;
        }
        o0Var.c();
        i0 i0Var2 = this.mainView;
        if (i0Var2 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var2;
        }
        i0Var.a();
        return true;
    }

    private final void startUnlockWatcher() {
        this.timedUnlockJob = wu.k.d(j1.a(this), null, null, new p(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean switchCreateMode() {
        k0 k0Var = this.pinCode4Interactor;
        i0 i0Var = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.i1()) {
            k0 k0Var2 = this.pinCode6Interactor;
            if (k0Var2 == null) {
                t.t("pinCode6Interactor");
                k0Var2 = null;
            }
            if (!k0Var2.i1()) {
                h0 h0Var = this.lockPatternInteractor;
                if (h0Var == null) {
                    t.t("lockPatternInteractor");
                    h0Var = null;
                }
                if (!h0Var.h()) {
                    return false;
                }
                i0 i0Var2 = this.mainView;
                if (i0Var2 == null) {
                    t.t("mainView");
                } else {
                    i0Var = i0Var2;
                }
                i0Var.f();
                return true;
            }
        }
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var3;
        }
        i0Var.k();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean switchUnlockMode() {
        k0 k0Var = this.pinCode4Interactor;
        i0 i0Var = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.k1()) {
            k0 k0Var2 = this.pinCode6Interactor;
            if (k0Var2 == null) {
                t.t("pinCode6Interactor");
                k0Var2 = null;
            }
            if (!k0Var2.k1()) {
                h0 h0Var = this.lockPatternInteractor;
                if (h0Var == null) {
                    t.t("lockPatternInteractor");
                    h0Var = null;
                }
                if (!h0Var.f()) {
                    return false;
                }
                i0 i0Var2 = this.mainView;
                if (i0Var2 == null) {
                    t.t("mainView");
                } else {
                    i0Var = i0Var2;
                }
                i0Var.f();
                return true;
            }
        }
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var3;
        }
        i0Var.k();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unlock() {
        byte[] bytes = r0.b(false, "6170705F6C6F636B6564").getBytes(su.d.f78241b);
        t.e(bytes, "getBytes(...)");
        com.server.auditor.ssh.client.app.a.N().Q().g("6170705F6C6F636B6564", bytes);
    }

    private final void updateDotsVisibility() {
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            l0Var.w8(getPinCodeMaxLength());
        }
    }

    private final void updatePatternViews() {
        h0 h0Var = this.lockPatternInteractor;
        h0 h0Var2 = null;
        String str = null;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.f()) {
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.v5();
            }
            String str2 = this.action;
            if (str2 == null) {
                t.t("action");
            } else {
                str = str2;
            }
            if (!t.b(str, "pin_screen_action_enter")) {
                onLockImageMovedToTop();
                return;
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.B1();
                return;
            }
            return;
        }
        h0 h0Var3 = this.lockPatternInteractor;
        if (h0Var3 == null) {
            t.t("lockPatternInteractor");
        } else {
            h0Var2 = h0Var3;
        }
        if (h0Var2.h()) {
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.k8();
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.o2();
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.R(true);
            }
            g0 g0Var6 = this.patternFragmentView;
            if (g0Var6 != null) {
                g0Var6.c0(true);
            }
            g0 g0Var7 = this.patternFragmentView;
            if (g0Var7 != null) {
                g0Var7.O(false);
            }
            g0 g0Var8 = this.patternFragmentView;
            if (g0Var8 != null) {
                g0Var8.y3(true);
            }
            g0 g0Var9 = this.patternFragmentView;
            if (g0Var9 != null) {
                g0Var9.g6(true);
            }
            g0 g0Var10 = this.patternFragmentView;
            if (g0Var10 != null) {
                g0Var10.E(false);
            }
        }
    }

    private final void updatePinCodeViews() {
        k0 k0Var = this.pinCode4Interactor;
        String str = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.k1()) {
            k0 k0Var2 = this.pinCode6Interactor;
            if (k0Var2 == null) {
                t.t("pinCode6Interactor");
                k0Var2 = null;
            }
            if (!k0Var2.k1()) {
                l0 l0Var = this.pinFragmentView;
                if (l0Var != null) {
                    l0Var.rc();
                }
                l0 l0Var2 = this.pinFragmentView;
                if (l0Var2 != null) {
                    l0Var2.o2();
                }
                l0 l0Var3 = this.pinFragmentView;
                if (l0Var3 != null) {
                    l0Var3.R(true);
                }
                l0 l0Var4 = this.pinFragmentView;
                if (l0Var4 != null) {
                    l0Var4.c0(true);
                }
                l0 l0Var5 = this.pinFragmentView;
                if (l0Var5 != null) {
                    l0Var5.c9(true);
                }
                l0 l0Var6 = this.pinFragmentView;
                if (l0Var6 != null) {
                    l0Var6.p2(null);
                }
                l0 l0Var7 = this.pinFragmentView;
                if (l0Var7 != null) {
                    l0Var7.x2(false);
                }
                updateDotsVisibility();
                clearPinCodeOnUiAndShowKeyboard();
                return;
            }
        }
        l0 l0Var8 = this.pinFragmentView;
        if (l0Var8 != null) {
            l0Var8.j9();
        }
        String str2 = this.action;
        if (str2 == null) {
            t.t("action");
        } else {
            str = str2;
        }
        if (!t.b(str, "pin_screen_action_enter")) {
            onLockImageMovedToTop();
            return;
        }
        l0 l0Var9 = this.pinFragmentView;
        if (l0Var9 != null) {
            l0Var9.B1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePinMasterPasswordVisibility() {
        k0 k0Var = this.pinCode4Interactor;
        vk.e eVar = null;
        if (k0Var == null) {
            t.t("pinCode4Interactor");
            k0Var = null;
        }
        if (!k0Var.k1()) {
            k0 k0Var2 = this.pinCode6Interactor;
            if (k0Var2 == null) {
                t.t("pinCode6Interactor");
                k0Var2 = null;
            }
            if (!k0Var2.k1()) {
                return;
            }
        }
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            vk.e eVar2 = this.checkHasApiKeyRepository;
            if (eVar2 == null) {
                t.t("checkHasApiKeyRepository");
            } else {
                eVar = eVar2;
            }
            l0Var.x2(eVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimedLockSecondsViews() {
        o0 o0Var = this.timedLockInteractor;
        n0 n0Var = null;
        if (o0Var == null) {
            t.t("timedLockInteractor");
            o0Var = null;
        }
        long jD = o0Var.d();
        if (jD > 0) {
            o0 o0Var2 = this.timedLockInteractor;
            if (o0Var2 == null) {
                t.t("timedLockInteractor");
                o0Var2 = null;
            }
            long jA = o0Var2.a() / 1000;
            long j10 = jA / ((long) 60);
            n0 n0Var2 = this.timedLockFragmentView;
            if (n0Var2 == null) {
                t.t("timedLockFragmentView");
                n0Var2 = null;
            }
            n0Var2.sa((int) jA);
            n0 n0Var3 = this.timedLockFragmentView;
            if (n0Var3 == null) {
                t.t("timedLockFragmentView");
                n0Var3 = null;
            }
            n0Var3.i5((int) jD);
            n0 n0Var4 = this.timedLockFragmentView;
            if (n0Var4 == null) {
                t.t("timedLockFragmentView");
                n0Var4 = null;
            }
            n0Var4.af(jD);
            if (j10 > 1) {
                n0 n0Var5 = this.timedLockFragmentView;
                if (n0Var5 == null) {
                    t.t("timedLockFragmentView");
                } else {
                    n0Var = n0Var5;
                }
                String string = TermiusApplication.F().getString(R.string.app_lock_throttling_minutes_left, Long.valueOf(j10));
                t.e(string, "getString(...)");
                n0Var.Z8(string);
                return;
            }
            n0 n0Var6 = this.timedLockFragmentView;
            if (n0Var6 == null) {
                t.t("timedLockFragmentView");
            } else {
                n0Var = n0Var6;
            }
            String string2 = TermiusApplication.F().getString(R.string.app_lock_throttling_1_minute_left);
            t.e(string2, "getString(...)");
            n0Var.Z8(string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wrongPatternReload() {
        g0 g0Var = this.patternFragmentView;
        if (g0Var != null) {
            g0Var.J1();
        }
        onPatternCleared();
    }

    public void onBackPressed() {
        i0 i0Var = this.mainView;
        i0 i0Var2 = null;
        if (i0Var == null) {
            t.t("mainView");
            i0Var = null;
        }
        i0Var.x();
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var2 = i0Var3;
        }
        i0Var2.close();
    }

    public void onBiometricAuthenticationError() {
        l0 l0Var = this.pinFragmentView;
        vk.e eVar = null;
        boolean z10 = false;
        if (l0Var != null) {
            if (l0Var != null) {
                l0Var.R(false);
            }
            l0 l0Var2 = this.pinFragmentView;
            if (l0Var2 != null) {
                l0Var2.c0(true);
            }
            l0 l0Var3 = this.pinFragmentView;
            if (l0Var3 != null) {
                l0Var3.O(true);
            }
            l0 l0Var4 = this.pinFragmentView;
            if (l0Var4 != null) {
                l0Var4.c9(true);
            }
            l0 l0Var5 = this.pinFragmentView;
            if (l0Var5 != null) {
                l0Var5.p2(null);
            }
            updatePinMasterPasswordVisibility();
            updateDotsVisibility();
            clearPinCodeOnUiAndShowKeyboard();
            return;
        }
        g0 g0Var = this.patternFragmentView;
        if (g0Var != null) {
            if (g0Var != null) {
                g0Var.R(false);
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.c0(true);
            }
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.O(true);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.y3(true);
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.g6(true);
            }
            g0 g0Var6 = this.patternFragmentView;
            if (g0Var6 != null) {
                g0Var6.E(false);
            }
            g0 g0Var7 = this.patternFragmentView;
            if (g0Var7 != null) {
                g0Var7.g6(false);
            }
            g0 g0Var8 = this.patternFragmentView;
            if (g0Var8 != null) {
                h0 h0Var = this.lockPatternInteractor;
                if (h0Var == null) {
                    t.t("lockPatternInteractor");
                    h0Var = null;
                }
                if (h0Var.f()) {
                    vk.e eVar2 = this.checkHasApiKeyRepository;
                    if (eVar2 == null) {
                        t.t("checkHasApiKeyRepository");
                    } else {
                        eVar = eVar2;
                    }
                    if (eVar.a()) {
                        z10 = true;
                    }
                }
                g0Var8.x2(z10);
            }
        }
    }

    public void onBiometricAuthenticationSuccess() {
        unlock();
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            if (l0Var != null) {
                l0Var.z0();
            }
            l0 l0Var2 = this.pinFragmentView;
            if (l0Var2 != null) {
                l0Var2.R(false);
            }
            l0 l0Var3 = this.pinFragmentView;
            if (l0Var3 != null) {
                l0Var3.c0(false);
            }
            l0 l0Var4 = this.pinFragmentView;
            if (l0Var4 != null) {
                l0Var4.O(false);
            }
            l0 l0Var5 = this.pinFragmentView;
            if (l0Var5 != null) {
                l0Var5.c9(false);
            }
            l0 l0Var6 = this.pinFragmentView;
            if (l0Var6 != null) {
                l0Var6.p2(null);
            }
            l0 l0Var7 = this.pinFragmentView;
            if (l0Var7 != null) {
                l0Var7.x2(false);
            }
            l0 l0Var8 = this.pinFragmentView;
            if (l0Var8 != null) {
                l0Var8.l();
                return;
            }
            return;
        }
        g0 g0Var = this.patternFragmentView;
        if (g0Var != null) {
            if (g0Var != null) {
                g0Var.z0();
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.R(false);
            }
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.c0(false);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.O(false);
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.y3(false);
            }
            g0 g0Var6 = this.patternFragmentView;
            if (g0Var6 != null) {
                g0Var6.g6(false);
            }
            g0 g0Var7 = this.patternFragmentView;
            if (g0Var7 != null) {
                g0Var7.x2(false);
            }
            g0 g0Var8 = this.patternFragmentView;
            if (g0Var8 != null) {
                g0Var8.p2(null);
            }
        }
    }

    public void onCreate(i0 i0Var, String str) {
        t.f(i0Var, "view");
        t.f(str, "action");
        this.mainView = i0Var;
        this.action = str;
        i0Var.x();
        initCheckHasApiKeyRepository();
        initLockPatternInteractor(str);
        initCode4Interactor(str);
        initCode6Interactor(str);
        initTimedLockInteractor();
        initLoginInteractor();
        initShowTouchDialog(str);
        if (detectSecurityIssues()) {
            return;
        }
        presentInitialView();
        com.server.auditor.ssh.client.utils.analytics.a.y().x3();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        t.f(keyEvent, EventStreamParser.EVENT_FIELD);
        if (4 != i10) {
            return false;
        }
        String str = this.action;
        i0 i0Var = null;
        if (str == null) {
            t.t("action");
            str = null;
        }
        if (t.b(str, "pin_screen_action_enter")) {
            return false;
        }
        i0 i0Var2 = this.mainView;
        if (i0Var2 == null) {
            t.t("mainView");
            i0Var2 = null;
        }
        i0Var2.x();
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var = i0Var3;
        }
        i0Var.close();
        return false;
    }

    public void onLockImageMovedToCenter() {
        g0 g0Var = this.patternFragmentView;
        if (g0Var != null) {
            if (g0Var != null) {
                g0Var.I2();
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.R(false);
            }
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.c0(false);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.O(false);
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.y3(false);
            }
            g0 g0Var6 = this.patternFragmentView;
            if (g0Var6 != null) {
                g0Var6.g6(false);
            }
            g0 g0Var7 = this.patternFragmentView;
            if (g0Var7 != null) {
                g0Var7.x2(false);
            }
            g0 g0Var8 = this.patternFragmentView;
            if (g0Var8 != null) {
                g0Var8.p2(null);
            }
        }
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            if (l0Var != null) {
                l0Var.I2();
            }
            l0 l0Var2 = this.pinFragmentView;
            if (l0Var2 != null) {
                l0Var2.R(false);
            }
            l0 l0Var3 = this.pinFragmentView;
            if (l0Var3 != null) {
                l0Var3.c0(false);
            }
            l0 l0Var4 = this.pinFragmentView;
            if (l0Var4 != null) {
                l0Var4.O(false);
            }
            l0 l0Var5 = this.pinFragmentView;
            if (l0Var5 != null) {
                l0Var5.c9(false);
            }
            l0 l0Var6 = this.pinFragmentView;
            if (l0Var6 != null) {
                l0Var6.p2(null);
            }
            l0 l0Var7 = this.pinFragmentView;
            if (l0Var7 != null) {
                l0Var7.l();
            }
            l0 l0Var8 = this.pinFragmentView;
            if (l0Var8 != null) {
                l0Var8.x2(false);
            }
        }
        finishWithSuccess();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLockImageMovedToTop() {
        /*
            r6 = this;
            vk.g0 r0 = r6.patternFragmentView
            java.lang.String r1 = "mainView"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L79
            if (r0 == 0) goto Le
            r0.o2()
        Le:
            boolean r0 = r6.isNeedShowBiometricUnlock
            if (r0 == 0) goto L1e
            vk.i0 r0 = r6.mainView
            if (r0 != 0) goto L1a
            ju.t.t(r1)
            r0 = r2
        L1a:
            r0.m()
            goto L79
        L1e:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L25
            r0.R(r3)
        L25:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L2c
            r0.c0(r4)
        L2c:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L33
            r0.O(r4)
        L33:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L3a
            r0.y3(r4)
        L3a:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L41
            r0.g6(r4)
        L41:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L48
            r0.E(r3)
        L48:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L4f
            r0.g6(r3)
        L4f:
            vk.g0 r0 = r6.patternFragmentView
            if (r0 == 0) goto L79
            vk.h0 r5 = r6.lockPatternInteractor
            if (r5 != 0) goto L5d
            java.lang.String r5 = "lockPatternInteractor"
            ju.t.t(r5)
            r5 = r2
        L5d:
            boolean r5 = r5.f()
            if (r5 == 0) goto L75
            vk.e r5 = r6.checkHasApiKeyRepository
            if (r5 != 0) goto L6d
            java.lang.String r5 = "checkHasApiKeyRepository"
            ju.t.t(r5)
            r5 = r2
        L6d:
            boolean r5 = r5.a()
            if (r5 == 0) goto L75
            r5 = r4
            goto L76
        L75:
            r5 = r3
        L76:
            r0.x2(r5)
        L79:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto Lc1
            if (r0 == 0) goto L82
            r0.o2()
        L82:
            boolean r0 = r6.isNeedShowBiometricUnlock
            if (r0 == 0) goto L95
            r6.isNeedShowBiometricUnlock = r3
            vk.i0 r0 = r6.mainView
            if (r0 != 0) goto L90
            ju.t.t(r1)
            goto L91
        L90:
            r2 = r0
        L91:
            r2.m()
            return
        L95:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto L9c
            r0.R(r3)
        L9c:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto La3
            r0.c0(r4)
        La3:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto Laa
            r0.O(r4)
        Laa:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto Lb1
            r0.c9(r4)
        Lb1:
            vk.l0 r0 = r6.pinFragmentView
            if (r0 == 0) goto Lb8
            r0.p2(r2)
        Lb8:
            r6.updatePinMasterPasswordVisibility()
            r6.updateDotsVisibility()
            r6.clearPinCodeOnUiAndShowKeyboard()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.pincode.PinScreenViewModel.onLockImageMovedToTop():void");
    }

    public void onPasswordFieldTextChanged(byte[] bArr) {
        t.f(bArr, "encodedPassword");
        Arrays.fill(this.encodedPasswordByteArray, (byte) 0);
        this.encodedPasswordByteArray = bArr;
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.G(null);
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var3;
        }
        j0Var2.b0(!(bArr.length == 0));
    }

    public void onPatternCancelButtonClick() {
        i0 i0Var = this.mainView;
        i0 i0Var2 = null;
        if (i0Var == null) {
            t.t("mainView");
            i0Var = null;
        }
        i0Var.x();
        i0 i0Var3 = this.mainView;
        if (i0Var3 == null) {
            t.t("mainView");
        } else {
            i0Var2 = i0Var3;
        }
        i0Var2.close();
    }

    public void onPatternCellAdded(List<LockPatternView.Cell> list) {
        t.f(list, "patternCells");
    }

    public void onPatternCleared() {
        cancelPatternReload();
        h0 h0Var = this.lockPatternInteractor;
        h0 h0Var2 = null;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.f()) {
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.k4(LockPatternView.DisplayMode.Correct);
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.v5();
                return;
            }
            return;
        }
        h0 h0Var3 = this.lockPatternInteractor;
        if (h0Var3 == null) {
            t.t("lockPatternInteractor");
            h0Var3 = null;
        }
        if (h0Var3.h()) {
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.k4(LockPatternView.DisplayMode.Correct);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.E(false);
            }
            h0 h0Var4 = this.lockPatternInteractor;
            if (h0Var4 == null) {
                t.t("lockPatternInteractor");
            } else {
                h0Var2 = h0Var4;
            }
            if (h0Var2.j()) {
                g0 g0Var5 = this.patternFragmentView;
                if (g0Var5 != null) {
                    g0Var5.za();
                    return;
                }
                return;
            }
            g0 g0Var6 = this.patternFragmentView;
            if (g0Var6 != null) {
                g0Var6.k8();
            }
        }
    }

    public void onPatternConfirmButtonClick() {
        h0 h0Var = this.lockPatternInteractor;
        k0 k0Var = null;
        h0 h0Var2 = null;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.g()) {
            h0 h0Var3 = this.lockPatternInteractor;
            if (h0Var3 == null) {
                t.t("lockPatternInteractor");
            } else {
                h0Var2 = h0Var3;
            }
            h0Var2.a(true);
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.J1();
            }
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.E(false);
            }
            g0 g0Var3 = this.patternFragmentView;
            if (g0Var3 != null) {
                g0Var3.g6(true);
            }
            g0 g0Var4 = this.patternFragmentView;
            if (g0Var4 != null) {
                g0Var4.za();
            }
            g0 g0Var5 = this.patternFragmentView;
            if (g0Var5 != null) {
                g0Var5.Ib(R.string.alp_42447968_cmd_confirm);
                return;
            }
            return;
        }
        h0 h0Var4 = this.lockPatternInteractor;
        if (h0Var4 == null) {
            t.t("lockPatternInteractor");
            h0Var4 = null;
        }
        if (h0Var4.j()) {
            h0 h0Var5 = this.lockPatternInteractor;
            if (h0Var5 == null) {
                t.t("lockPatternInteractor");
                h0Var5 = null;
            }
            h0Var5.b();
            k0 k0Var2 = this.pinCode4Interactor;
            if (k0Var2 == null) {
                t.t("pinCode4Interactor");
                k0Var2 = null;
            }
            k0Var2.b1();
            k0 k0Var3 = this.pinCode4Interactor;
            if (k0Var3 == null) {
                t.t("pinCode4Interactor");
                k0Var3 = null;
            }
            k0Var3.b();
            k0 k0Var4 = this.pinCode6Interactor;
            if (k0Var4 == null) {
                t.t("pinCode6Interactor");
                k0Var4 = null;
            }
            k0Var4.b1();
            k0 k0Var5 = this.pinCode6Interactor;
            if (k0Var5 == null) {
                t.t("pinCode6Interactor");
            } else {
                k0Var = k0Var5;
            }
            k0Var.b();
            finishWithSuccess();
        }
    }

    public void onPatternDetected(List<LockPatternView.Cell> list) {
        t.f(list, "patternCells");
        h0 h0Var = this.lockPatternInteractor;
        h0 h0Var2 = null;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.f()) {
            doComparePattern(list);
            return;
        }
        h0 h0Var3 = this.lockPatternInteractor;
        if (h0Var3 == null) {
            t.t("lockPatternInteractor");
            h0Var3 = null;
        }
        if (h0Var3.j()) {
            doConfirmCreate(list);
            return;
        }
        h0 h0Var4 = this.lockPatternInteractor;
        if (h0Var4 == null) {
            t.t("lockPatternInteractor");
        } else {
            h0Var2 = h0Var4;
        }
        if (h0Var2.g()) {
            doCheckAndCreatePattern(list);
        }
    }

    public void onPatternStart() {
        cancelPatternReload();
        h0 h0Var = this.lockPatternInteractor;
        if (h0Var == null) {
            t.t("lockPatternInteractor");
            h0Var = null;
        }
        if (h0Var.f()) {
            g0 g0Var = this.patternFragmentView;
            if (g0Var != null) {
                g0Var.B5();
            }
        } else {
            g0 g0Var2 = this.patternFragmentView;
            if (g0Var2 != null) {
                g0Var2.D3();
            }
        }
        g0 g0Var3 = this.patternFragmentView;
        if (g0Var3 != null) {
            g0Var3.p2(null);
        }
        g0 g0Var4 = this.patternFragmentView;
        if (g0Var4 != null) {
            g0Var4.k4(LockPatternView.DisplayMode.Correct);
        }
        g0 g0Var5 = this.patternFragmentView;
        if (g0Var5 != null) {
            g0Var5.E(false);
        }
        g0 g0Var6 = this.patternFragmentView;
        if (g0Var6 != null) {
            g0Var6.R(false);
        }
    }

    public void onPinCodeEntered(String str) {
        t.f(str, "pinCode");
        l0 l0Var = this.pinFragmentView;
        if (l0Var != null) {
            l0Var.p2(null);
        }
        if (str.length() > 0 && !pinCodeRegex.f(str)) {
            l0 l0Var2 = this.pinFragmentView;
            if (l0Var2 != null) {
                l0Var2.b1();
            }
            l0 l0Var3 = this.pinFragmentView;
            if (l0Var3 != null) {
                l0Var3.i();
                return;
            }
            return;
        }
        if (str.length() == getPinCodeMaxLength()) {
            l0 l0Var4 = this.pinFragmentView;
            if (l0Var4 != null) {
                l0Var4.l();
            }
            l0 l0Var5 = this.pinFragmentView;
            if (l0Var5 != null) {
                l0Var5.x2(false);
            }
            onPinEntered(str);
        }
    }

    public void onSecurityTokenError(String str) {
        t.f(str, "details");
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.G(str);
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenFailed() {
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.h();
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenInvalidPassword(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.G(str);
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenIsBlocked(Integer num) {
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.G(num == null ? TermiusApplication.F().getString(R.string.new_crypto_migration_security_token_throttled_later) : TermiusApplication.F().getString(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(num.intValue())));
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenMinimalVersionError() {
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.G(TermiusApplication.F().getString(R.string.outdated_app_error_message));
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenNetworkError() {
        j0 j0Var = this.masterPasswordFragmentView;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.e();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.G(TermiusApplication.F().getString(R.string.login_registration_network_error));
    }

    @Override // jg.a.InterfaceC0920a
    public void onSecurityTokenSuccess() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public void onUnlockButtonClick() {
        String username;
        ApiKey apiKey = com.server.auditor.ssh.client.app.a.N().getApiKey();
        if (apiKey == null || (username = apiKey.getUsername()) == null) {
            username = "";
        }
        this.username = username;
        wu.k.d(j1.a(this), null, null, new e(new d.a(this.username, this.encodedPasswordByteArray, null, null, null, null, null, 124, null), null), 3, null);
    }

    public void onUnlockWithMasterPasswordClick() {
        i0 i0Var = this.mainView;
        if (i0Var == null) {
            t.t("mainView");
            i0Var = null;
        }
        i0Var.b();
    }

    public void updateFragmentView(l0 l0Var) {
        t.f(l0Var, "view");
        this.pinFragmentView = l0Var;
        updatePinCodeViews();
    }

    public void updateFragmentView(g0 g0Var) {
        t.f(g0Var, "view");
        this.patternFragmentView = g0Var;
        g0Var.c();
        updatePatternViews();
    }

    public void updateFragmentView(n0 n0Var) {
        t.f(n0Var, "view");
        this.timedLockFragmentView = n0Var;
        updateTimedLockSecondsViews();
        startUnlockWatcher();
    }

    public void updateFragmentView(j0 j0Var) {
        t.f(j0Var, "view");
        this.masterPasswordFragmentView = j0Var;
        j0 j0Var2 = null;
        if (j0Var == null) {
            t.t("masterPasswordFragmentView");
            j0Var = null;
        }
        j0Var.c();
        j0 j0Var3 = this.masterPasswordFragmentView;
        if (j0Var3 == null) {
            t.t("masterPasswordFragmentView");
            j0Var3 = null;
        }
        j0Var3.oa(true);
        j0 j0Var4 = this.masterPasswordFragmentView;
        if (j0Var4 == null) {
            t.t("masterPasswordFragmentView");
        } else {
            j0Var2 = j0Var4;
        }
        j0Var2.b0(false);
    }

    public void updateFragmentView(m0 m0Var) {
        t.f(m0Var, "view");
        this.termiusIsUnderAttackView = m0Var;
    }
}

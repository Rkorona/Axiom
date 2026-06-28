package com.server.auditor.ssh.client.ui.auth.welcome.domain;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.auth.welcome.data.WelcomeIntroStages;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import yu.g;
import zt.e;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeIntroViewModel extends i1 {
    public static final int $stable = 8;
    private final w _animationState;
    private final w _lottieAnimationMinProgress;
    private final yu.d _navigateToSignUpChooserScreenEvent;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final k0 animationStage;
    private final k0 lottieAnimationMinProgress;
    private final f navigateToSignUpChooserScreenEvent;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f39448a;

        public a(int i10) {
            this.f39448a = i10;
        }

        public final int a() {
            return this.f39448a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f39448a == ((a) obj).f39448a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f39448a);
        }

        public String toString() {
            return "NavigateToSignUpChooserScreenEvent(featureType=" + this.f39448a + ")";
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39449a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return WelcomeIntroViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39449a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeIntroViewModel.this._animationState;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, WelcomeIntroStages.Exiting.INSTANCE));
                yu.d dVar = WelcomeIntroViewModel.this._navigateToSignUpChooserScreenEvent;
                a aVar = new a(109);
                this.f39449a = 1;
                if (dVar.b(aVar, this) == objF) {
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
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39451a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f39453c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, e eVar) {
            super(2, eVar);
            this.f39453c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return WelcomeIntroViewModel.this.new c(this.f39453c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeIntroViewModel.this._lottieAnimationMinProgress.setValue(kotlin.coroutines.jvm.internal.b.c(this.f39453c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39454a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WelcomeIntroStages f39456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(WelcomeIntroStages welcomeIntroStages, e eVar) {
            super(2, eVar);
            this.f39456c = welcomeIntroStages;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return WelcomeIntroViewModel.this.new d(this.f39456c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39454a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeIntroViewModel.this._animationState.setValue(this.f39456c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public WelcomeIntroViewModel() {
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._navigateToSignUpChooserScreenEvent = dVarB;
        this.navigateToSignUpChooserScreenEvent = h.M(dVarB);
        w wVarA = zu.m0.a(WelcomeIntroStages.Initial.INSTANCE);
        this._animationState = wVarA;
        this.animationStage = h.b(wVarA);
        w wVarA2 = zu.m0.a(Float.valueOf(0.0f));
        this._lottieAnimationMinProgress = wVarA2;
        this.lottieAnimationMinProgress = h.b(wVarA2);
        aVarY.q6();
    }

    public final k0 getAnimationStage() {
        return this.animationStage;
    }

    public final k0 getLottieAnimationMinProgress() {
        return this.lottieAnimationMinProgress;
    }

    public final f getNavigateToSignUpChooserScreenEvent() {
        return this.navigateToSignUpChooserScreenEvent;
    }

    public final void onGetStartedClicked() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onLottieAnimationFinished(float f10) {
        k.d(j1.a(this), null, null, new c(f10, null), 3, null);
    }

    public final void updateAnimationStage(WelcomeIntroStages welcomeIntroStages) {
        t.f(welcomeIntroStages, "stage");
        k.d(j1.a(this), null, null, new d(welcomeIntroStages, null), 3, null);
    }
}

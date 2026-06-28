package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import e3.g3;
import hg.b2;
import iu.p;
import j3.t0;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import yu.g;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignUpEnterEmailViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final w _email;
    private final w _error;
    private final w _isProgress;
    private final yu.d _navigateRequest;
    private final w _showRecaptchaRequest;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final CheckEmailAvailabilityUseCase checkEmailAvailabilityUseCase;
    private final k0 email;
    private final k0 error;
    private final k0 isProgress;
    private final f navigateRequest;
    private String recaptchaToken;
    private final k0 showRecaptchaRequest;
    private final sn.b validateEmailLocalUseCase;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39380a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterEmailViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpEnterEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            WelcomeSignUpEnterEmailViewModel.this.recaptchaToken = "";
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39382a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterEmailViewModel.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
        
            if (r11.b(r1, r10) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x018f, code lost:
        
            if (r11.b(r1, r10) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01b7, code lost:
        
            if (r11.b(r1, r10) == r0) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 551
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpEnterEmailViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39384a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f39386c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterEmailViewModel.this.new c(this.f39386c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39384a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeSignUpEnterEmailViewModel.this.recaptchaToken = this.f39386c;
            w wVar = WelcomeSignUpEnterEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            w wVar2 = WelcomeSignUpEnterEmailViewModel.this._error;
            do {
                value2 = wVar2.getValue();
            } while (!wVar2.g(value2, ""));
            if (WelcomeSignUpEnterEmailViewModel.this.recaptchaToken.length() > 0) {
                WelcomeSignUpEnterEmailViewModel.this.onContinueClicked();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39387a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f39389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f39389c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterEmailViewModel.this.new d(this.f39389c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39387a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpEnterEmailViewModel.this._email;
            t0 t0Var = this.f39389c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, t0.i(t0Var, s.n1(t0Var.m()).toString(), 0L, null, 6, null)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39390a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f39392c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterEmailViewModel.this.new e(this.f39392c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39390a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpEnterEmailViewModel.this._error;
            String str = this.f39392c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, str));
            w wVar2 = WelcomeSignUpEnterEmailViewModel.this._isProgress;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignUpEnterEmailViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._navigateRequest = dVarB;
        this.navigateRequest = h.M(dVarB);
        Boolean bool = Boolean.FALSE;
        w wVarA = zu.m0.a(bool);
        this._showRecaptchaRequest = wVarA;
        this.showRecaptchaRequest = h.b(wVarA);
        w wVarA2 = zu.m0.a(new t0("", 0L, (g3) null, 6, (k) null));
        this._email = wVarA2;
        this.email = h.b(wVarA2);
        w wVarA3 = zu.m0.a("");
        this._error = wVarA3;
        this.error = h.b(wVarA3);
        w wVarA4 = zu.m0.a(bool);
        this._isProgress = wVarA4;
        this.isProgress = h.b(wVarA4);
        this.recaptchaToken = "";
        this.validateEmailLocalUseCase = new sn.b();
        b2 b2Var = b2.f52944a;
        this.checkEmailAvailabilityUseCase = new CheckEmailAvailabilityUseCase(new sl.b(b2Var.P1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.b(b2Var.P1(), b2Var.B1()));
        aVarY.e2(Avo.AuthMethod.EMAIL);
    }

    public final void dismissRecaptchaByError() {
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final k0 getEmail() {
        return this.email;
    }

    public final k0 getError() {
        return this.error;
    }

    public final f getNavigateRequest() {
        return this.navigateRequest;
    }

    public final k0 getShowRecaptchaRequest() {
        return this.showRecaptchaRequest;
    }

    public final k0 isProgress() {
        return this.isProgress;
    }

    public final void onContinueClicked() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onRecaptchaTokenChange(String str) {
        t.f(str, "newRecaptchaToken");
        wu.k.d(j1.a(this), null, null, new c(str, null), 3, null);
    }

    public final void updateEmail(t0 t0Var) {
        t.f(t0Var, "newEmail");
        wu.k.d(j1.a(this), null, null, new d(t0Var, null), 3, null);
    }

    public final void updateReceivedApiError(String str) {
        t.f(str, "apiError");
        wu.k.d(j1.a(this), null, null, new e(str, null), 3, null);
    }
}

package com.server.auditor.ssh.client.ui.auth.signin.domain;

import android.app.Application;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.repositories.auth.l;
import com.server.auditor.ssh.client.ui.auth.signup.domain.CheckEmailAvailabilityUseCase;
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
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignInEnterEmailViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final w _email;
    private final w _error;
    private final w _isProgress;
    private final yu.d _navigateRequest;
    private final yu.d _showEnterpriseSingleSignOnWebView;
    private final w _showRecaptchaRequest;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final CheckEmailAvailabilityUseCase checkEmailAvailabilityUseCase;
    private final k0 email;
    private final EnterpriseSsoDomainTokenUseCase enterpriseSsoDomainTokenUseCase;
    private final EnterpriseSsoDomainUrlUseCase enterpriseSsoDomainUrlUseCase;
    private final k0 error;
    private final k0 isProgress;
    private final zu.f navigateRequest;
    private String recaptchaToken;
    private final zu.f showEnterpriseSingleSignOnWebView;
    private final k0 showRecaptchaRequest;
    private final sn.b validateEmailLocalUseCase;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39186a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39186a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInEnterEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            WelcomeSignInEnterEmailViewModel.this.recaptchaToken = "";
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39188a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39188a;
            if (i10 == 0) {
                x.b(obj);
                WelcomeSignInEnterEmailViewModel welcomeSignInEnterEmailViewModel = WelcomeSignInEnterEmailViewModel.this;
                String strM = ((t0) welcomeSignInEnterEmailViewModel.getEmail().getValue()).m();
                String str = WelcomeSignInEnterEmailViewModel.this.recaptchaToken;
                this.f39188a = 1;
                if (welcomeSignInEnterEmailViewModel.startValidateAndEmailCheckingProcess(strM, str, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39190a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f39192c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new c(this.f39192c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        
            if (r1.b(r3, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 480
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.WelcomeSignInEnterEmailViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39193a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f39195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Integer num, zt.e eVar) {
            super(2, eVar);
            this.f39195c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new d(this.f39195c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            String string;
            Object value2;
            au.b.f();
            if (this.f39193a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInEnterEmailViewModel.this._error;
            WelcomeSignInEnterEmailViewModel welcomeSignInEnterEmailViewModel = WelcomeSignInEnterEmailViewModel.this;
            do {
                value = wVar.getValue();
                string = welcomeSignInEnterEmailViewModel.getApplication().getString(R.string.login_registration_unexpected_error);
                t.e(string, "getString(...)");
            } while (!wVar.g(value, string));
            w wVar2 = WelcomeSignInEnterEmailViewModel.this._isProgress;
            do {
                value2 = wVar2.getValue();
                ((Boolean) value2).getClass();
            } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
            Integer num = this.f39195c;
            if (num != null) {
                y9.a.f86838a.g("SAML SSO failed with " + num);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39196a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f39198c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new e(this.f39198c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39196a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeSignInEnterEmailViewModel.this.recaptchaToken = this.f39198c;
            w wVar = WelcomeSignInEnterEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            w wVar2 = WelcomeSignInEnterEmailViewModel.this._error;
            do {
                value2 = wVar2.getValue();
            } while (!wVar2.g(value2, ""));
            if (WelcomeSignInEnterEmailViewModel.this.recaptchaToken.length() > 0) {
                WelcomeSignInEnterEmailViewModel.this.onContinueClicked();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39199a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39201c;

        f(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39199a = obj;
            this.f39201c |= RtlSpacingHelper.UNDEFINED;
            return WelcomeSignInEnterEmailViewModel.this.requestDomainUrl(this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39203b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39205d;

        g(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39203b = obj;
            this.f39205d |= RtlSpacingHelper.UNDEFINED;
            return WelcomeSignInEnterEmailViewModel.this.startValidateAndEmailCheckingProcess(null, null, this);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39206a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f39208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f39208c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInEnterEmailViewModel.this.new h(this.f39208c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39206a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInEnterEmailViewModel.this._email;
            t0 t0Var = this.f39208c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, t0.i(t0Var, s.n1(t0Var.m()).toString(), 0L, null, 6, null)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignInEnterEmailViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._navigateRequest = dVarB;
        this.navigateRequest = zu.h.M(dVarB);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._showEnterpriseSingleSignOnWebView = dVarB2;
        this.showEnterpriseSingleSignOnWebView = zu.h.M(dVarB2);
        Boolean bool = Boolean.FALSE;
        w wVarA = zu.m0.a(bool);
        this._showRecaptchaRequest = wVarA;
        this.showRecaptchaRequest = zu.h.b(wVarA);
        w wVarA2 = zu.m0.a(new t0("", 0L, (g3) null, 6, (k) null));
        this._email = wVarA2;
        this.email = zu.h.b(wVarA2);
        w wVarA3 = zu.m0.a("");
        this._error = wVarA3;
        this.error = zu.h.b(wVarA3);
        this.recaptchaToken = "";
        w wVarA4 = zu.m0.a(bool);
        this._isProgress = wVarA4;
        this.isProgress = zu.h.b(wVarA4);
        this.validateEmailLocalUseCase = new sn.b();
        b2 b2Var = b2.f52944a;
        this.checkEmailAvailabilityUseCase = new CheckEmailAvailabilityUseCase(new sl.b(b2Var.P1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.b(b2Var.P1(), b2Var.B1()));
        this.enterpriseSsoDomainUrlUseCase = new EnterpriseSsoDomainUrlUseCase(new com.server.auditor.ssh.client.repositories.auth.k(b2Var.O1(), b2Var.B1()));
        this.enterpriseSsoDomainTokenUseCase = new EnterpriseSsoDomainTokenUseCase(new l(b2Var.O1(), b2Var.B1()));
        aVarY.e2(Avo.AuthMethod.EMAIL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r2.b(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestDomainUrl(zt.e<? super ut.m0> r6) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.WelcomeSignInEnterEmailViewModel.requestDomainUrl(zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0171, code lost:
    
        if (r12.b(r13, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0183, code lost:
    
        if (r12.b(r13, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
    
        if (requestDomainUrl(r0) == r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startValidateAndEmailCheckingProcess(java.lang.String r11, java.lang.String r12, zt.e<? super ut.m0> r13) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.WelcomeSignInEnterEmailViewModel.startValidateAndEmailCheckingProcess(java.lang.String, java.lang.String, zt.e):java.lang.Object");
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

    public final zu.f getNavigateRequest() {
        return this.navigateRequest;
    }

    public final zu.f getShowEnterpriseSingleSignOnWebView() {
        return this.showEnterpriseSingleSignOnWebView;
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

    public final void onEnterpriseSsoDataReceived(String str) {
        t.f(str, "oneToken");
        wu.k.d(j1.a(this), null, null, new c(str, null), 3, null);
    }

    public final void onEnterpriseSsoFailed(Integer num) {
        wu.k.d(j1.a(this), null, null, new d(num, null), 3, null);
    }

    public final void onRecaptchaTokenChange(String str) {
        t.f(str, "newRecaptchaToken");
        wu.k.d(j1.a(this), null, null, new e(str, null), 3, null);
    }

    public final void updateEmail(t0 t0Var) {
        t.f(t0Var, "newEmail");
        wu.k.d(j1.a(this), null, null, new h(t0Var, null), 3, null);
    }
}

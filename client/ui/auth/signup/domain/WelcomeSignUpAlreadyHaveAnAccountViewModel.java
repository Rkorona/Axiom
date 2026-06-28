package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.app.Application;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.repositories.auth.k;
import com.server.auditor.ssh.client.repositories.auth.l;
import com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainTokenUseCase;
import com.server.auditor.ssh.client.ui.auth.signin.domain.EnterpriseSsoDomainUrlUseCase;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import wu.i0;
import yu.g;
import zu.f;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignUpAlreadyHaveAnAccountViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final yu.d _error;
    private final w _isProgress;
    private final yu.d _navigationRequest;
    private final yu.d _showEnterpriseSingleSignOnWebView;
    private final String email;
    private final EnterpriseSsoDomainTokenUseCase enterpriseSsoDomainTokenUseCase;
    private final EnterpriseSsoDomainUrlUseCase enterpriseSsoDomainUrlUseCase;
    private final f error;
    private final boolean isESSO;
    private final k0 isProgress;
    private final f navigationRequest;
    private final f showEnterpriseSingleSignOnWebView;
    private final c1 validateEmailInteractor;

    public static final class a implements l1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39310c;

        public a(String str, boolean z10) {
            t.f(str, "email");
            this.f39309b = str;
            this.f39310c = z10;
        }

        @Override // androidx.lifecycle.l1.c
        public i1 a(Class cls, i5.a aVar) {
            t.f(cls, "modelClass");
            t.f(aVar, "extras");
            Object objA = aVar.a(l1.a.f8762h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new WelcomeSignUpAlreadyHaveAnAccountViewModel(this.f39309b, this.f39310c, (Application) objA);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39311a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpAlreadyHaveAnAccountViewModel.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r6.b("", r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r6.requestDomainUrl(r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r5.f39311a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                ut.x.b(r6)
                goto L5c
            L1b:
                ut.x.b(r6)
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.this
                boolean r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.access$isESSO$p(r6)
                if (r6 != 0) goto L37
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.this
                yu.d r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.access$get_navigationRequest$p(r6)
                r5.f39311a = r3
                java.lang.String r1 = ""
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L5c
                goto L5b
            L37:
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.this
                zu.w r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.access$get_isProgress$p(r6)
            L3d:
                java.lang.Object r1 = r6.getValue()
                r4 = r1
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                r4.getClass()
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
                boolean r1 = r6.g(r1, r4)
                if (r1 == 0) goto L3d
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.this
                r5.f39311a = r2
                java.lang.Object r6 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.access$requestDomainUrl(r6, r5)
                if (r6 != r0) goto L5c
            L5b:
                return r0
            L5c:
                ut.m0 r6 = ut.m0.f82633a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39313a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39315c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f39315c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpAlreadyHaveAnAccountViewModel.this.new c(this.f39315c, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
        
            if (r1.b(r6, r5) == r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        
            if (r1.b(r6, r5) == r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
        
            if (r6.b(r1, r5) == r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
        
            if (r6.b(r1, r5) == r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x016d, code lost:
        
            if (r6.b(r1, r5) == r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01b0, code lost:
        
            if (r6.b(r1, r5) == r0) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39316a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f39318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Integer num, zt.e eVar) {
            super(2, eVar);
            this.f39318c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpAlreadyHaveAnAccountViewModel.this.new d(this.f39318c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39316a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignUpAlreadyHaveAnAccountViewModel.this._error;
                String string = WelcomeSignUpAlreadyHaveAnAccountViewModel.this.getApplication().getString(R.string.login_registration_unexpected_error);
                t.e(string, "getString(...)");
                this.f39316a = 1;
                if (dVar.b(string, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            w wVar = WelcomeSignUpAlreadyHaveAnAccountViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            Integer num = this.f39318c;
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

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39319a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39321c;

        e(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39319a = obj;
            this.f39321c |= RtlSpacingHelper.UNDEFINED;
            return WelcomeSignUpAlreadyHaveAnAccountViewModel.this.requestDomainUrl(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignUpAlreadyHaveAnAccountViewModel(String str, boolean z10, Application application) {
        super(application);
        t.f(str, "email");
        t.f(application, "application");
        this.email = str;
        this.isESSO = z10;
        yu.d dVarB = g.b(-2, null, null, 6, null);
        this._navigationRequest = dVarB;
        this.navigationRequest = h.M(dVarB);
        w wVarA = zu.m0.a(Boolean.FALSE);
        this._isProgress = wVarA;
        this.isProgress = h.b(wVarA);
        yu.d dVarB2 = g.b(-2, null, null, 6, null);
        this._error = dVarB2;
        this.error = h.M(dVarB2);
        yu.d dVarB3 = g.b(-2, null, null, 6, null);
        this._showEnterpriseSingleSignOnWebView = dVarB3;
        this.showEnterpriseSingleSignOnWebView = h.M(dVarB3);
        this.validateEmailInteractor = new c1();
        b2 b2Var = b2.f52944a;
        this.enterpriseSsoDomainUrlUseCase = new EnterpriseSsoDomainUrlUseCase(new k(b2Var.O1(), b2Var.B1()));
        this.enterpriseSsoDomainTokenUseCase = new EnterpriseSsoDomainTokenUseCase(new l(b2Var.O1(), b2Var.B1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r2.b(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r2.b(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r2.b(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
    
        if (r2.b(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        if (r2.b(r7, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        if (r7.b(r2, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
    
        if (r7.b(r2, r0) == r1) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestDomainUrl(zt.e<? super ut.m0> r7) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpAlreadyHaveAnAccountViewModel.requestDomainUrl(zt.e):java.lang.Object");
    }

    public final f getError() {
        return this.error;
    }

    public final f getNavigationRequest() {
        return this.navigationRequest;
    }

    public final f getShowEnterpriseSingleSignOnWebView() {
        return this.showEnterpriseSingleSignOnWebView;
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
}

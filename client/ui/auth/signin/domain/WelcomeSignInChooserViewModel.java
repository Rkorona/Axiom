package com.server.auditor.ssh.client.ui.auth.signin.domain;

import android.app.Application;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignInChooserViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final yu.d _events;
    private final yu.d _firebaseSignInContinuation;
    private final yu.d _firebaseSignUpContinuation;
    private final w _isProgress;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final zu.f events;
    private final qi.c firebaseDetectActionInteractor;
    private final zu.f firebaseSignInContinuation;
    private final zu.f firebaseSignUpContinuation;
    private final k0 isProgress;

    @Keep
    public interface ContinueWith {

        @Keep
        public static final class Apple implements ContinueWith {
            public static final int $stable = 0;
            public static final Apple INSTANCE = new Apple();

            private Apple() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Apple);
            }

            public int hashCode() {
                return 1203477715;
            }

            public String toString() {
                return "Apple";
            }
        }

        @Keep
        public static final class Email implements ContinueWith {
            public static final int $stable = 0;
            public static final Email INSTANCE = new Email();

            private Email() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Email);
            }

            public int hashCode() {
                return 1207067925;
            }

            public String toString() {
                return "Email";
            }
        }

        @Keep
        public static final class EnterpriseSSO implements ContinueWith {
            public static final int $stable = 0;
            public static final EnterpriseSSO INSTANCE = new EnterpriseSSO();

            private EnterpriseSSO() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof EnterpriseSSO);
            }

            public int hashCode() {
                return -684402841;
            }

            public String toString() {
                return "EnterpriseSSO";
            }
        }

        @Keep
        public static final class Google implements ContinueWith {
            public static final int $stable = 0;
            public static final Google INSTANCE = new Google();

            private Google() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Google);
            }

            public int hashCode() {
                return -1176079392;
            }

            public String toString() {
                return "Google";
            }
        }
    }

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResult f39160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WelcomeSignInChooserViewModel f39161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ActivityResult activityResult, WelcomeSignInChooserViewModel welcomeSignInChooserViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39160b = activityResult;
            this.f39161c = welcomeSignInChooserViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f39160b, this.f39161c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object objF = au.b.f();
            int i10 = this.f39159a;
            if (i10 == 0) {
                x.b(obj);
                int resultCode = this.f39160b.getResultCode();
                if (resultCode == -3 || resultCode == -2) {
                    w wVar = this.f39161c._isProgress;
                    do {
                        value = wVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == -1) {
                    w wVar2 = this.f39161c._isProgress;
                    do {
                        value2 = wVar2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == 0) {
                    w wVar3 = this.f39161c._isProgress;
                    do {
                        value3 = wVar3.getValue();
                        ((Boolean) value3).getClass();
                    } while (!wVar3.g(value3, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == 1) {
                    Intent data = this.f39160b.getData();
                    String stringExtra = data != null ? data.getStringExtra("apple_sso_firebase_token_key") : null;
                    Intent data2 = this.f39160b.getData();
                    String stringExtra2 = data2 != null ? data2.getStringExtra("apple_sso_email_key") : null;
                    if (stringExtra == null || s.m0(stringExtra) || stringExtra2 == null || s.m0(stringExtra2)) {
                        w wVar4 = this.f39161c._isProgress;
                        do {
                            value4 = wVar4.getValue();
                            ((Boolean) value4).getClass();
                        } while (!wVar4.g(value4, kotlin.coroutines.jvm.internal.b.a(false)));
                    } else {
                        WelcomeSignInChooserViewModel welcomeSignInChooserViewModel = this.f39161c;
                        AppleSingleSignOnAuthentication appleSingleSignOnAuthentication = new AppleSingleSignOnAuthentication(stringExtra2, stringExtra);
                        this.f39159a = 1;
                        if (welcomeSignInChooserViewModel.requestFirebaseSingleSignOnDetectAction(appleSingleSignOnAuthentication, this) == objF) {
                            return objF;
                        }
                    }
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39162a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39162a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignInChooserViewModel.this._events;
                ContinueWith.Apple apple = ContinueWith.Apple.INSTANCE;
                this.f39162a = 1;
                if (dVar.b(apple, this) == objF) {
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
        int f39164a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39164a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignInChooserViewModel.this._events;
                ContinueWith.Email email = ContinueWith.Email.INSTANCE;
                this.f39164a = 1;
                if (dVar.b(email, this) == objF) {
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39166a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39166a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignInChooserViewModel.this._events;
                ContinueWith.EnterpriseSSO enterpriseSSO = ContinueWith.EnterpriseSSO.INSTANCE;
                this.f39166a = 1;
                if (dVar.b(enterpriseSSO, this) == objF) {
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39168a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39168a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeSignInChooserViewModel.this._isProgress;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                yu.d dVar = WelcomeSignInChooserViewModel.this._events;
                ContinueWith.Google google = ContinueWith.Google.INSTANCE;
                this.f39168a = 1;
                if (dVar.b(google, this) == objF) {
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
        int f39170a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInChooserViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39172a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39172a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInChooserViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39174a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39174a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInChooserViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39176a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignInChooserViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39176a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignInChooserViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WelcomeSignInChooserViewModel f39181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, WelcomeSignInChooserViewModel welcomeSignInChooserViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39179b = str;
            this.f39180c = str2;
            this.f39181d = welcomeSignInChooserViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f39179b, this.f39180c, this.f39181d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39178a;
            if (i10 == 0) {
                x.b(obj);
                GoogleSingleSignOnAuthentication googleSingleSignOnAuthentication = new GoogleSingleSignOnAuthentication(this.f39179b, this.f39180c);
                WelcomeSignInChooserViewModel welcomeSignInChooserViewModel = this.f39181d;
                this.f39178a = 1;
                if (welcomeSignInChooserViewModel.requestFirebaseSingleSignOnDetectAction(googleSingleSignOnAuthentication, this) == objF) {
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
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39183b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39185d;

        k(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39183b = obj;
            this.f39185d |= RtlSpacingHelper.UNDEFINED;
            return WelcomeSignInChooserViewModel.this.requestFirebaseSingleSignOnDetectAction(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignInChooserViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._events = dVarB;
        this.events = zu.h.M(dVarB);
        w wVarA = zu.m0.a(Boolean.FALSE);
        this._isProgress = wVarA;
        this.isProgress = zu.h.b(wVarA);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._firebaseSignUpContinuation = dVarB2;
        this.firebaseSignUpContinuation = zu.h.M(dVarB2);
        yu.d dVarB3 = yu.g.b(-2, null, null, 6, null);
        this._firebaseSignInContinuation = dVarB3;
        this.firebaseSignInContinuation = zu.h.M(dVarB3);
        aVarY.b5();
        b2 b2Var = b2.f52944a;
        this.firebaseDetectActionInteractor = new qi.c(new com.server.auditor.ssh.client.repositories.auth.h(b2Var.O1(), b2Var.B1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r9.b(r8, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r9.b(r8, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestFirebaseSingleSignOnDetectAction(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication r8, zt.e<? super ut.m0> r9) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signin.domain.WelcomeSignInChooserViewModel.requestFirebaseSingleSignOnDetectAction(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication, zt.e):java.lang.Object");
    }

    public final zu.f getEvents() {
        return this.events;
    }

    public final zu.f getFirebaseSignInContinuation() {
        return this.firebaseSignInContinuation;
    }

    public final zu.f getFirebaseSignUpContinuation() {
        return this.firebaseSignUpContinuation;
    }

    public final void handleAppleSSOResult(ActivityResult activityResult) {
        t.f(activityResult, "result");
        wu.k.d(j1.a(this), null, null, new a(activityResult, this, null), 3, null);
    }

    public final k0 isProgress() {
        return this.isProgress;
    }

    public final void onContinueWithAppleClick() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onContinueWithEmailClick() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onContinueWithEnterpriseSSOClick() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onContinueWithGoogleClick() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onFirebaseAuthCanceled() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void onFirebaseAuthWarning(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void onFirebaseNetworkErrorOccurred() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final void onGoogleAuthFailed(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final void onGoogleAuthSuccess(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "firebaseToken");
        wu.k.d(j1.a(this), null, null, new j(str, str2, this, null), 3, null);
    }
}

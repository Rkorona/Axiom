package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
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
import wu.k;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignUpChooserViewModel extends i1 {
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
    private final nn.e updateNeedSendWelcomePassedUseCase;

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
                return 39657235;
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
                return 43247445;
            }

            public String toString() {
                return "Email";
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
                return 1400191392;
            }

            public String toString() {
                return "Google";
            }
        }
    }

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResult f39356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WelcomeSignUpChooserViewModel f39357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ActivityResult activityResult, WelcomeSignUpChooserViewModel welcomeSignUpChooserViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39356b = activityResult;
            this.f39357c = welcomeSignUpChooserViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f39356b, this.f39357c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object objF = au.b.f();
            int i10 = this.f39355a;
            if (i10 == 0) {
                x.b(obj);
                int resultCode = this.f39356b.getResultCode();
                if (resultCode == -3 || resultCode == -2) {
                    w wVar = this.f39357c._isProgress;
                    do {
                        value = wVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == -1) {
                    w wVar2 = this.f39357c._isProgress;
                    do {
                        value2 = wVar2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!wVar2.g(value2, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == 0) {
                    w wVar3 = this.f39357c._isProgress;
                    do {
                        value3 = wVar3.getValue();
                        ((Boolean) value3).getClass();
                    } while (!wVar3.g(value3, kotlin.coroutines.jvm.internal.b.a(false)));
                } else if (resultCode == 1) {
                    Intent data = this.f39356b.getData();
                    String stringExtra = data != null ? data.getStringExtra("apple_sso_firebase_token_key") : null;
                    Intent data2 = this.f39356b.getData();
                    String stringExtra2 = data2 != null ? data2.getStringExtra("apple_sso_email_key") : null;
                    if (stringExtra == null || s.m0(stringExtra) || stringExtra2 == null || s.m0(stringExtra2)) {
                        w wVar4 = this.f39357c._isProgress;
                        do {
                            value4 = wVar4.getValue();
                            ((Boolean) value4).getClass();
                        } while (!wVar4.g(value4, kotlin.coroutines.jvm.internal.b.a(false)));
                    } else {
                        WelcomeSignUpChooserViewModel welcomeSignUpChooserViewModel = this.f39357c;
                        AppleSingleSignOnAuthentication appleSingleSignOnAuthentication = new AppleSingleSignOnAuthentication(stringExtra2, stringExtra);
                        this.f39355a = 1;
                        if (welcomeSignUpChooserViewModel.requestFirebaseSingleSignOnDetectAction(appleSingleSignOnAuthentication, this) == objF) {
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
        int f39358a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39358a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignUpChooserViewModel.this._events;
                ContinueWith.Apple apple = ContinueWith.Apple.INSTANCE;
                this.f39358a = 1;
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
        int f39360a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39360a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignUpChooserViewModel.this._events;
                ContinueWith.Email email = ContinueWith.Email.INSTANCE;
                this.f39360a = 1;
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
        int f39362a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39362a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeSignUpChooserViewModel.this._isProgress;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                yu.d dVar = WelcomeSignUpChooserViewModel.this._events;
                ContinueWith.Google google = ContinueWith.Google.INSTANCE;
                this.f39362a = 1;
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39364a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39364a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpChooserViewModel.this._isProgress;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39366a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpChooserViewModel.this._isProgress;
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
        int f39368a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpChooserViewModel.this._isProgress;
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
        int f39370a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpChooserViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpChooserViewModel.this._isProgress;
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
        int f39372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WelcomeSignUpChooserViewModel f39375d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, WelcomeSignUpChooserViewModel welcomeSignUpChooserViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39373b = str;
            this.f39374c = str2;
            this.f39375d = welcomeSignUpChooserViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f39373b, this.f39374c, this.f39375d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39372a;
            if (i10 == 0) {
                x.b(obj);
                GoogleSingleSignOnAuthentication googleSingleSignOnAuthentication = new GoogleSingleSignOnAuthentication(this.f39373b, this.f39374c);
                WelcomeSignUpChooserViewModel welcomeSignUpChooserViewModel = this.f39375d;
                this.f39372a = 1;
                if (welcomeSignUpChooserViewModel.requestFirebaseSingleSignOnDetectAction(googleSingleSignOnAuthentication, this) == objF) {
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
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39377b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39379d;

        j(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39377b = obj;
            this.f39379d |= RtlSpacingHelper.UNDEFINED;
            return WelcomeSignUpChooserViewModel.this.requestFirebaseSingleSignOnDetectAction(null, this);
        }
    }

    public WelcomeSignUpChooserViewModel() {
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
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        nn.e eVar = new nn.e(dVarM);
        this.updateNeedSendWelcomePassedUseCase = eVar;
        aVarY.r6();
        eVar.a(true);
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
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpChooserViewModel.requestFirebaseSingleSignOnDetectAction(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication, zt.e):java.lang.Object");
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
        k.d(j1.a(this), null, null, new a(activityResult, this, null), 3, null);
    }

    public final k0 isProgress() {
        return this.isProgress;
    }

    public final void onContinueWithAppleClick() {
        k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onContinueWithEmailClick() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onContinueWithGoogleClick() {
        k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onFirebaseAuthCanceled() {
        k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onFirebaseAuthWarning(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void onFirebaseNetworkErrorOccurred() {
        k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void onGoogleAuthFailed(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final void onGoogleAuthSuccess(String str, String str2) {
        t.f(str, "email");
        t.f(str2, "firebaseToken");
        k.d(j1.a(this), null, null, new i(str, str2, this, null), 3, null);
    }
}

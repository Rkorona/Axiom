package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.ui.auth.signup.data.TriggerSendEmailCodeRepository;
import com.server.auditor.ssh.client.ui.auth.signup.data.ValidateEmailCodeRepository;
import com.server.auditor.ssh.client.ui.auth.signup.domain.ReadClipboardUseCase;
import com.server.auditor.ssh.client.ui.auth.signup.domain.SendEmailCodeUseCase;
import com.server.auditor.ssh.client.ui.auth.signup.domain.ValidateEmailCodeUseCase;
import e3.g3;
import hg.b2;
import iu.p;
import j3.t0;
import java.util.Locale;
import ju.t;
import rn.c;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignUpCheckEmailViewModel extends AndroidViewModel {
    private static final int DEFAULT_REMAIN_SECONDS = 60;
    private static final long MILLISECONDS_IN_SECOND = 1000;
    private static final long ONE_SEC_DELAY = 1000;
    private final w _code;
    private final w _error;
    private final w _isProgress;
    private final w _lastClip;
    private final w _lastSendCodeTime;
    private final yu.d _navigateToEnterPassword;
    private final w _resendState;
    private final w _showRecaptchaRequest;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final k0 code;
    private final String email;
    private final k0 error;
    private final k0 isProgress;
    private final k0 lastClip;
    private final zu.f navigateToEnterPassword;
    private final ReadClipboardUseCase readClipboardUseCase;
    private String recaptchaToken;
    private final k0 resendState;
    private final SendEmailCodeUseCase sendEmailCodeUseCase;
    private final k0 showRecaptchaRequest;
    private final sn.a validateCodeByRegexUseCase;
    private final ValidateEmailCodeUseCase validateEmailCodeUseCase;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements l1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39322b;

        public b(String str) {
            t.f(str, "email");
            this.f39322b = str;
        }

        @Override // androidx.lifecycle.l1.c
        public i1 a(Class cls, i5.a aVar) {
            t.f(cls, "modelClass");
            t.f(aVar, "extras");
            Object objA = aVar.a(l1.a.f8762h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new WelcomeSignUpCheckEmailViewModel(this.f39322b, (Application) objA);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39323a;

        public c(String str) {
            t.f(str, "code");
            this.f39323a = str;
        }

        public final String a() {
            return this.f39323a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && t.b(this.f39323a, ((c) obj).f39323a);
        }

        public int hashCode() {
            return this.f39323a.hashCode();
        }

        public String toString() {
            return "NavigateToEnterPassword(code=" + this.f39323a + ")";
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39324a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39324a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpCheckEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            WelcomeSignUpCheckEmailViewModel.this.clearSentRecaptchaToken();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39326a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39326a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpCheckEmailViewModel.this._lastSendCodeTime;
            do {
                value = wVar.getValue();
                ((Number) value).longValue();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis())));
            w wVar2 = WelcomeSignUpCheckEmailViewModel.this._error;
            do {
                value2 = wVar2.getValue();
            } while (!wVar2.g(value2, ""));
            WelcomeSignUpCheckEmailViewModel.this.triggerSendCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f39330c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new f(this.f39330c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39328a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (WelcomeSignUpCheckEmailViewModel.this._lastClip.getValue() != null && !((Boolean) WelcomeSignUpCheckEmailViewModel.this.isProgress().getValue()).booleanValue() && WelcomeSignUpCheckEmailViewModel.this.validateCodeByRegexUseCase.a(this.f39330c)) {
                w wVar = WelcomeSignUpCheckEmailViewModel.this._code;
                String str = this.f39330c;
                do {
                    value2 = wVar.getValue();
                } while (!wVar.g(value2, new t0(str, 0L, (g3) null, 6, (ju.k) null)));
                WelcomeSignUpCheckEmailViewModel.this.onContinueClick();
            }
            w wVar2 = WelcomeSignUpCheckEmailViewModel.this._lastClip;
            String str2 = this.f39330c;
            do {
                value = wVar2.getValue();
            } while (!wVar2.g(value, str2));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f39333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t0 t0Var, zt.e eVar) {
            super(2, eVar);
            this.f39333c = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new g(this.f39333c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpCheckEmailViewModel.this._code;
            t0 t0Var = this.f39333c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, t0Var));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f39335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f39336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39337d;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            String strM;
            String upperCase;
            WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel;
            Object objA;
            String str;
            Object value3;
            String string;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            String string2;
            Object value8;
            Object value9;
            String string3;
            Object value10;
            Object value11;
            String string4;
            Object value12;
            Object value13;
            Object value14;
            WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel2;
            w wVar;
            Object value15;
            Object objF = au.b.f();
            int i10 = this.f39337d;
            if (i10 == 0) {
                x.b(obj);
                w wVar2 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value = wVar2.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar2.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
                WelcomeSignUpCheckEmailViewModel.this.analytics.s6();
                w wVar3 = WelcomeSignUpCheckEmailViewModel.this._error;
                do {
                    value2 = wVar3.getValue();
                } while (!wVar3.g(value2, ""));
                Object value16 = WelcomeSignUpCheckEmailViewModel.this.getCode().getValue();
                if (((t0) value16).m().length() <= 0) {
                    value16 = null;
                }
                t0 t0Var = (t0) value16;
                if (t0Var != null && (strM = t0Var.m()) != null) {
                    upperCase = strM.toUpperCase(Locale.ROOT);
                    t.e(upperCase, "toUpperCase(...)");
                    if (upperCase != null) {
                        welcomeSignUpCheckEmailViewModel = WelcomeSignUpCheckEmailViewModel.this;
                        ValidateEmailCodeUseCase validateEmailCodeUseCase = welcomeSignUpCheckEmailViewModel.validateEmailCodeUseCase;
                        String str2 = welcomeSignUpCheckEmailViewModel.email;
                        this.f39334a = upperCase;
                        this.f39335b = welcomeSignUpCheckEmailViewModel;
                        this.f39336c = upperCase;
                        this.f39337d = 1;
                        objA = validateEmailCodeUseCase.a(upperCase, str2, this);
                        if (objA != objF) {
                            str = upperCase;
                        }
                        return objF;
                    }
                }
                return m0.f82633a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                welcomeSignUpCheckEmailViewModel2 = (WelcomeSignUpCheckEmailViewModel) this.f39335b;
                x.b(obj);
                wVar = welcomeSignUpCheckEmailViewModel2._isProgress;
                do {
                    value15 = wVar.getValue();
                    ((Boolean) value15).getClass();
                } while (!wVar.g(value15, kotlin.coroutines.jvm.internal.b.a(false)));
                return m0.f82633a;
            }
            upperCase = (String) this.f39336c;
            WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel3 = (WelcomeSignUpCheckEmailViewModel) this.f39335b;
            String str3 = (String) this.f39334a;
            x.b(obj);
            str = str3;
            welcomeSignUpCheckEmailViewModel = welcomeSignUpCheckEmailViewModel3;
            objA = obj;
            ValidateEmailCodeUseCase.Result result = (ValidateEmailCodeUseCase.Result) objA;
            if (t.b(result, ValidateEmailCodeUseCase.Result.Success.INSTANCE)) {
                w wVar4 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value13 = wVar4.getValue();
                } while (!wVar4.g(value13, ""));
                w wVar5 = welcomeSignUpCheckEmailViewModel._code;
                do {
                    value14 = wVar5.getValue();
                } while (!wVar5.g(value14, new t0("", 0L, (g3) null, 6, (ju.k) null)));
                yu.d dVar = welcomeSignUpCheckEmailViewModel._navigateToEnterPassword;
                c cVar = new c(upperCase);
                this.f39334a = str;
                this.f39335b = welcomeSignUpCheckEmailViewModel;
                this.f39336c = null;
                this.f39337d = 2;
                if (dVar.b(cVar, this) != objF) {
                    welcomeSignUpCheckEmailViewModel2 = welcomeSignUpCheckEmailViewModel;
                    wVar = welcomeSignUpCheckEmailViewModel2._isProgress;
                    do {
                        value15 = wVar.getValue();
                        ((Boolean) value15).getClass();
                    } while (!wVar.g(value15, kotlin.coroutines.jvm.internal.b.a(false)));
                    return m0.f82633a;
                }
                return objF;
            }
            if (t.b(result, ValidateEmailCodeUseCase.Result.NetworkError.INSTANCE)) {
                w wVar6 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value11 = wVar6.getValue();
                    string4 = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.toast_internet_available);
                    t.e(string4, "getString(...)");
                } while (!wVar6.g(value11, string4));
                w wVar7 = welcomeSignUpCheckEmailViewModel._isProgress;
                do {
                    value12 = wVar7.getValue();
                    ((Boolean) value12).getClass();
                } while (!wVar7.g(value12, kotlin.coroutines.jvm.internal.b.a(false)));
            } else if (t.b(result, ValidateEmailCodeUseCase.Result.UnexpectedError.INSTANCE)) {
                w wVar8 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value9 = wVar8.getValue();
                    string3 = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.login_registration_unexpected_error);
                    t.e(string3, "getString(...)");
                } while (!wVar8.g(value9, string3));
                w wVar9 = welcomeSignUpCheckEmailViewModel._isProgress;
                do {
                    value10 = wVar9.getValue();
                    ((Boolean) value10).getClass();
                } while (!wVar9.g(value10, kotlin.coroutines.jvm.internal.b.a(false)));
            } else if (t.b(result, ValidateEmailCodeUseCase.Result.UnknownError.INSTANCE)) {
                w wVar10 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value7 = wVar10.getValue();
                    string2 = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.login_registration_unexpected_error);
                    t.e(string2, "getString(...)");
                } while (!wVar10.g(value7, string2));
                w wVar11 = welcomeSignUpCheckEmailViewModel._isProgress;
                do {
                    value8 = wVar11.getValue();
                    ((Boolean) value8).getClass();
                } while (!wVar11.g(value8, kotlin.coroutines.jvm.internal.b.a(false)));
            } else if (result instanceof ValidateEmailCodeUseCase.Result.BadRequestMessage) {
                w wVar12 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value5 = wVar12.getValue();
                } while (!wVar12.g(value5, ((ValidateEmailCodeUseCase.Result.BadRequestMessage) result).getMessage()));
                w wVar13 = welcomeSignUpCheckEmailViewModel._isProgress;
                do {
                    value6 = wVar13.getValue();
                    ((Boolean) value6).getClass();
                } while (!wVar13.g(value6, kotlin.coroutines.jvm.internal.b.a(false)));
            } else {
                if (!(result instanceof ValidateEmailCodeUseCase.Result.ThrottledError)) {
                    throw new s();
                }
                w wVar14 = welcomeSignUpCheckEmailViewModel._error;
                do {
                    value3 = wVar14.getValue();
                    string = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.two_factor_security_token_throttled_mm_ss, kotlin.coroutines.jvm.internal.b.d(((ValidateEmailCodeUseCase.Result.ThrottledError) result).getSeconds()));
                    t.e(string, "getString(...)");
                } while (!wVar14.g(value3, string));
                w wVar15 = welcomeSignUpCheckEmailViewModel._isProgress;
                do {
                    value4 = wVar15.getValue();
                    ((Boolean) value4).getClass();
                } while (!wVar15.g(value4, kotlin.coroutines.jvm.internal.b.a(false)));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39339a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            String string;
            Object value2;
            String string2;
            Object value3;
            Object value4;
            au.b.f();
            if (this.f39339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ReadClipboardUseCase.Result resultA = WelcomeSignUpCheckEmailViewModel.this.readClipboardUseCase.a();
            if (resultA instanceof ReadClipboardUseCase.Result.ValidCode) {
                w wVar = WelcomeSignUpCheckEmailViewModel.this._error;
                do {
                    value3 = wVar.getValue();
                } while (!wVar.g(value3, ""));
                w wVar2 = WelcomeSignUpCheckEmailViewModel.this._code;
                do {
                    value4 = wVar2.getValue();
                } while (!wVar2.g(value4, new t0(((ReadClipboardUseCase.Result.ValidCode) resultA).getCode(), 0L, (g3) null, 6, (ju.k) null)));
                WelcomeSignUpCheckEmailViewModel.this.onContinueClick();
            } else if (resultA instanceof ReadClipboardUseCase.Result.Unrecognized) {
                w wVar3 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value2 = wVar3.getValue();
                    string2 = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.welcome_paste_from_buffer_error_not_recognized);
                    t.e(string2, "getString(...)");
                } while (!wVar3.g(value2, string2));
            } else {
                if (!(resultA instanceof ReadClipboardUseCase.Result.Empty)) {
                    throw new s();
                }
                w wVar4 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel2 = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value = wVar4.getValue();
                    string = welcomeSignUpCheckEmailViewModel2.getApplication().getString(R.string.welcome_paste_from_buffer_error_empty);
                    t.e(string, "getString(...)");
                } while (!wVar4.g(value, string));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39341a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39343c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f39343c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new j(this.f39343c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            au.b.f();
            if (this.f39341a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeSignUpCheckEmailViewModel.this.recaptchaToken = this.f39343c;
            w wVar = WelcomeSignUpCheckEmailViewModel.this._showRecaptchaRequest;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
            w wVar2 = WelcomeSignUpCheckEmailViewModel.this._error;
            do {
                value2 = wVar2.getValue();
            } while (!wVar2.g(value2, ""));
            if (WelcomeSignUpCheckEmailViewModel.this.recaptchaToken.length() > 0) {
                WelcomeSignUpCheckEmailViewModel.this.triggerSendCode();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39344a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39344a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeSignUpCheckEmailViewModel.this.triggerSendCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39346a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39346a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeSignUpCheckEmailViewModel.this.initialSendEmailCode();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((l) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39348a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new m(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:13:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r13.f39348a
                r2 = 1000(0x3e8, double:4.94E-321)
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L24
                if (r1 == r6) goto L20
                if (r1 == r5) goto L1c
                if (r1 != r4) goto L14
                goto L24
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                ut.x.b(r14)
                goto L85
            L20:
                ut.x.b(r14)
                goto L6b
            L24:
                ut.x.b(r14)
            L27:
                zt.i r14 = r13.getContext()
                boolean r14 = wu.y1.s(r14)
                if (r14 == 0) goto L85
                long r7 = java.lang.System.currentTimeMillis()
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.this
                zu.w r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.access$get_lastSendCodeTime$p(r14)
                java.lang.Object r14 = r14.getValue()
                java.lang.Number r14 = (java.lang.Number) r14
                long r9 = r14.longValue()
                r11 = 0
                int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                r1 = 0
                if (r14 <= 0) goto L55
                long r7 = r7 - r9
                long r7 = r7 / r2
                int r14 = (int) r7
                int r14 = 60 - r14
                int r1 = java.lang.Math.max(r1, r14)
            L55:
                if (r1 <= 0) goto L74
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.this
                zu.w r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.access$get_resendState$p(r14)
                rn.c$b r7 = new rn.c$b
                r7.<init>(r1)
                r13.f39348a = r6
                java.lang.Object r14 = r14.emit(r7, r13)
                if (r14 != r0) goto L6b
                goto L84
            L6b:
                r13.f39348a = r4
                java.lang.Object r14 = wu.s0.b(r2, r13)
                if (r14 != r0) goto L27
                goto L84
            L74:
                com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.this
                zu.w r14 = com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.access$get_resendState$p(r14)
                rn.c$a r1 = rn.c.a.f77133a
                r13.f39348a = r5
                java.lang.Object r14 = r14.emit(r1, r13)
                if (r14 != r0) goto L85
            L84:
                return r0
            L85:
                ut.m0 r14 = ut.m0.f82633a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.signup.domain.WelcomeSignUpCheckEmailViewModel.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39350a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            String string;
            Object value8;
            Object value9;
            Object value10;
            Object value11;
            Object value12;
            String string2;
            Object value13;
            Object value14;
            Object value15;
            String string3;
            Object value16;
            Object value17;
            Object value18;
            String string4;
            Object value19;
            Object value20;
            Object value21;
            Object value22;
            Object objF = au.b.f();
            int i10 = this.f39350a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeSignUpCheckEmailViewModel.this._error;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, ""));
                w wVar2 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value2 = wVar2.getValue();
                } while (!wVar2.g(value2, c.C1195c.f77135a));
                SendEmailCodeUseCase sendEmailCodeUseCase = WelcomeSignUpCheckEmailViewModel.this.sendEmailCodeUseCase;
                String str = WelcomeSignUpCheckEmailViewModel.this.recaptchaToken;
                String str2 = WelcomeSignUpCheckEmailViewModel.this.email;
                this.f39350a = 1;
                obj = sendEmailCodeUseCase.a(str, str2, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            SendEmailCodeUseCase.Result result = (SendEmailCodeUseCase.Result) obj;
            if (t.b(result, SendEmailCodeUseCase.Result.Success.INSTANCE)) {
                w wVar3 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value20 = wVar3.getValue();
                    ((Boolean) value20).getClass();
                } while (!wVar3.g(value20, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar4 = WelcomeSignUpCheckEmailViewModel.this._error;
                do {
                    value21 = wVar4.getValue();
                } while (!wVar4.g(value21, ""));
                w wVar5 = WelcomeSignUpCheckEmailViewModel.this._lastSendCodeTime;
                do {
                    value22 = wVar5.getValue();
                    ((Number) value22).longValue();
                } while (!wVar5.g(value22, kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis())));
                WelcomeSignUpCheckEmailViewModel.this.startCooldownCounting();
            } else if (t.b(result, SendEmailCodeUseCase.Result.NetworkError.INSTANCE)) {
                w wVar6 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value17 = wVar6.getValue();
                    ((Boolean) value17).getClass();
                } while (!wVar6.g(value17, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar7 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value18 = wVar7.getValue();
                    string4 = welcomeSignUpCheckEmailViewModel.getApplication().getString(R.string.toast_internet_available);
                    t.e(string4, "getString(...)");
                } while (!wVar7.g(value18, string4));
                w wVar8 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value19 = wVar8.getValue();
                } while (!wVar8.g(value19, c.a.f77133a));
            } else if (t.b(result, SendEmailCodeUseCase.Result.UnexpectedError.INSTANCE)) {
                w wVar9 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value14 = wVar9.getValue();
                    ((Boolean) value14).getClass();
                } while (!wVar9.g(value14, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar10 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel2 = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value15 = wVar10.getValue();
                    string3 = welcomeSignUpCheckEmailViewModel2.getApplication().getString(R.string.login_registration_unexpected_error);
                    t.e(string3, "getString(...)");
                } while (!wVar10.g(value15, string3));
                w wVar11 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value16 = wVar11.getValue();
                } while (!wVar11.g(value16, c.a.f77133a));
            } else if (t.b(result, SendEmailCodeUseCase.Result.UnknownError.INSTANCE)) {
                w wVar12 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value11 = wVar12.getValue();
                    ((Boolean) value11).getClass();
                } while (!wVar12.g(value11, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar13 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel3 = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value12 = wVar13.getValue();
                    string2 = welcomeSignUpCheckEmailViewModel3.getApplication().getString(R.string.login_registration_unexpected_error);
                    t.e(string2, "getString(...)");
                } while (!wVar13.g(value12, string2));
                w wVar14 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value13 = wVar14.getValue();
                } while (!wVar14.g(value13, c.a.f77133a));
            } else if (t.b(result, SendEmailCodeUseCase.Result.RecaptchaError.INSTANCE)) {
                WelcomeSignUpCheckEmailViewModel.this.clearSentRecaptchaToken();
                w wVar15 = WelcomeSignUpCheckEmailViewModel.this._showRecaptchaRequest;
                do {
                    value9 = wVar15.getValue();
                    ((Boolean) value9).getClass();
                } while (!wVar15.g(value9, kotlin.coroutines.jvm.internal.b.a(true)));
                w wVar16 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value10 = wVar16.getValue();
                } while (!wVar16.g(value10, c.a.f77133a));
            } else if (result instanceof SendEmailCodeUseCase.Result.ThrottledError) {
                w wVar17 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value6 = wVar17.getValue();
                    ((Boolean) value6).getClass();
                } while (!wVar17.g(value6, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar18 = WelcomeSignUpCheckEmailViewModel.this._error;
                WelcomeSignUpCheckEmailViewModel welcomeSignUpCheckEmailViewModel4 = WelcomeSignUpCheckEmailViewModel.this;
                do {
                    value7 = wVar18.getValue();
                    string = welcomeSignUpCheckEmailViewModel4.getApplication().getString(R.string.two_factor_security_token_throttled_mm_ss, kotlin.coroutines.jvm.internal.b.d(((SendEmailCodeUseCase.Result.ThrottledError) result).getSeconds()));
                    t.e(string, "getString(...)");
                } while (!wVar18.g(value7, string));
                w wVar19 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value8 = wVar19.getValue();
                } while (!wVar19.g(value8, c.a.f77133a));
            } else {
                if (!(result instanceof SendEmailCodeUseCase.Result.BadRequestMessage)) {
                    throw new s();
                }
                w wVar20 = WelcomeSignUpCheckEmailViewModel.this._error;
                do {
                    value3 = wVar20.getValue();
                } while (!wVar20.g(value3, ((SendEmailCodeUseCase.Result.BadRequestMessage) result).getMessage()));
                w wVar21 = WelcomeSignUpCheckEmailViewModel.this._isProgress;
                do {
                    value4 = wVar21.getValue();
                    ((Boolean) value4).getClass();
                } while (!wVar21.g(value4, kotlin.coroutines.jvm.internal.b.a(false)));
                w wVar22 = WelcomeSignUpCheckEmailViewModel.this._resendState;
                do {
                    value5 = wVar22.getValue();
                } while (!wVar22.g(value5, c.a.f77133a));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39352a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, zt.e eVar) {
            super(2, eVar);
            this.f39354c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpCheckEmailViewModel.this.new o(this.f39354c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpCheckEmailViewModel.this._error;
            String str = this.f39354c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, str));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignUpCheckEmailViewModel(String str, Application application) {
        super(application);
        t.f(str, "email");
        t.f(application, "application");
        this.email = str;
        this.analytics = com.server.auditor.ssh.client.utils.analytics.a.y();
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._navigateToEnterPassword = dVarB;
        this.navigateToEnterPassword = zu.h.M(dVarB);
        this.recaptchaToken = "";
        w wVarA = zu.m0.a(new t0("", 0L, (g3) null, 6, (ju.k) null));
        this._code = wVarA;
        this.code = zu.h.b(wVarA);
        w wVarA2 = zu.m0.a("");
        this._error = wVarA2;
        this.error = zu.h.b(wVarA2);
        w wVarA3 = zu.m0.a(null);
        this._lastClip = wVarA3;
        this.lastClip = zu.h.b(wVarA3);
        Boolean bool = Boolean.FALSE;
        w wVarA4 = zu.m0.a(bool);
        this._isProgress = wVarA4;
        this.isProgress = zu.h.b(wVarA4);
        w wVarA5 = zu.m0.a(bool);
        this._showRecaptchaRequest = wVarA5;
        this.showRecaptchaRequest = zu.h.b(wVarA5);
        this._lastSendCodeTime = zu.m0.a(0L);
        c.C1195c c1195c = c.C1195c.f77135a;
        w wVarA6 = zu.m0.a(c1195c);
        this._resendState = wVarA6;
        this.resendState = zu.h.P(zu.h.L(wVarA6, new l(null)), j1.a(this), g0.f88389a.d(), c1195c);
        b2 b2Var = b2.f52944a;
        this.sendEmailCodeUseCase = new SendEmailCodeUseCase(new TriggerSendEmailCodeRepository(b2Var.O1(), b2Var.B1()));
        this.validateEmailCodeUseCase = new ValidateEmailCodeUseCase(new ValidateEmailCodeRepository(b2Var.O1(), b2Var.B1()));
        sn.a aVar = new sn.a();
        this.validateCodeByRegexUseCase = aVar;
        this.readClipboardUseCase = new ReadClipboardUseCase(b2Var.Y0(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSentRecaptchaToken() {
        this.recaptchaToken = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initialSendEmailCode() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCooldownCounting() {
        wu.k.d(j1.a(this), null, null, new m(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerSendCode() {
        wu.k.d(j1.a(this), null, null, new n(null), 3, null);
    }

    public final void dismissRecaptchaByError() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final k0 getCode() {
        return this.code;
    }

    public final k0 getError() {
        return this.error;
    }

    public final k0 getLastClip() {
        return this.lastClip;
    }

    public final zu.f getNavigateToEnterPassword() {
        return this.navigateToEnterPassword;
    }

    public final k0 getResendState() {
        return this.resendState;
    }

    public final k0 getShowRecaptchaRequest() {
        return this.showRecaptchaRequest;
    }

    public final k0 isProgress() {
        return this.isProgress;
    }

    public final void onClipboardCodeDetected(String str) {
        t.f(str, "code");
        wu.k.d(j1.a(this), null, null, new f(str, null), 3, null);
    }

    public final void onCodeChange(t0 t0Var) {
        t.f(t0Var, "newCode");
        wu.k.d(j1.a(this), null, null, new g(t0Var, null), 3, null);
    }

    public final void onContinueClick() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final void onPasteClick() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final void onRecaptchaTokenChange(String str) {
        t.f(str, "newRecaptchaToken");
        wu.k.d(j1.a(this), null, null, new j(str, null), 3, null);
    }

    public final void onResendClick() {
        wu.k.d(j1.a(this), null, null, new k(null), 3, null);
    }

    public final void updateReceivedApiError(String str) {
        t.f(str, "error");
        wu.k.d(j1.a(this), null, null, new o(str, null), 3, null);
    }
}

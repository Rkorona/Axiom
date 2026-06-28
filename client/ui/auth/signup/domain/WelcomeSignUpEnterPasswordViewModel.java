package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.n;
import com.server.auditor.ssh.client.synchronization.retrofit.PasswordBreachApiClientFactory;
import com.server.auditor.ssh.client.ui.auth.base.data.PasswordStrengthState;
import com.server.auditor.ssh.client.ui.auth.signup.data.PasswordBreachState;
import hg.b2;
import il.c0;
import iu.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jg.l;
import jg.m;
import ju.k;
import ju.t;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeSignUpEnterPasswordViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final w _apiError;
    private final yu.d _navigateToInitVault;
    private final yu.d _openHIBPDocumentation;
    private final w _password;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final AuthenticationModel authenticationModel;
    private final w breachCheckingState;
    private final zu.f navigateToInitVault;
    private final zu.f openHIBPDocumentation;
    private final k0 password;
    private final l passwordBreachCheckInteractor;
    private final m passwordStrengthInteractor;
    private final k0 passwordStrengthState;
    private final zu.f strengthInfoFlow;

    public static final class a implements l1.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AuthenticationModel f39393b;

        public a(AuthenticationModel authenticationModel) {
            t.f(authenticationModel, "authenticationModel");
            this.f39393b = authenticationModel;
        }

        @Override // androidx.lifecycle.l1.c
        public i1 a(Class cls, i5.a aVar) {
            t.f(cls, "modelClass");
            t.f(aVar, "extras");
            Object objA = aVar.a(l1.a.f8762h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new WelcomeSignUpEnterPasswordViewModel(this.f39393b, (Application) objA);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f39394a;

        public b(byte[] bArr) {
            t.f(bArr, "password");
            this.f39394a = bArr;
        }

        public final byte[] a() {
            return this.f39394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && t.b(this.f39394a, ((b) obj).f39394a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f39394a);
        }

        public String toString() {
            return "NavigateToInitVault(password=" + Arrays.toString(this.f39394a) + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f39395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f39398d;

        public c(int i10, String str, String str2, String str3) {
            t.f(str, "error");
            t.f(str2, "suggestion");
            t.f(str3, "suggestion2");
            this.f39395a = i10;
            this.f39396b = str;
            this.f39397c = str2;
            this.f39398d = str3;
        }

        public final String a() {
            return this.f39396b;
        }

        public final int b() {
            return this.f39395a;
        }

        public final String c() {
            return this.f39397c;
        }

        public final String d() {
            return this.f39398d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f39395a == cVar.f39395a && t.b(this.f39396b, cVar.f39396b) && t.b(this.f39397c, cVar.f39397c) && t.b(this.f39398d, cVar.f39398d);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f39395a) * 31) + this.f39396b.hashCode()) * 31) + this.f39397c.hashCode()) * 31) + this.f39398d.hashCode();
        }

        public String toString() {
            return "PasswordStrengthInfo(score=" + this.f39395a + ", error=" + this.f39396b + ", suggestion=" + this.f39397c + ", suggestion2=" + this.f39398d + ")";
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39399a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterPasswordViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object error;
            Object value2;
            Object objF = au.b.f();
            int i10 = this.f39399a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeSignUpEnterPasswordViewModel.this.breachCheckingState;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, PasswordBreachState.Checking.INSTANCE));
                l lVar = WelcomeSignUpEnterPasswordViewModel.this.passwordBreachCheckInteractor;
                byte[] bArr = (byte[]) WelcomeSignUpEnterPasswordViewModel.this.getPassword().getValue();
                this.f39399a = 1;
                obj = lVar.d(bArr, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            WelcomeSignUpEnterPasswordViewModel welcomeSignUpEnterPasswordViewModel = WelcomeSignUpEnterPasswordViewModel.this;
            l.b bVar = (l.b) obj;
            if (t.b(bVar, l.b.a.f61688a)) {
                error = PasswordBreachState.BreachFound.INSTANCE;
            } else if (t.b(bVar, l.b.d.f61691a)) {
                error = PasswordBreachState.BreachNotFound.INSTANCE;
            } else if (t.b(bVar, l.b.C0925b.f61689a)) {
                String string = welcomeSignUpEnterPasswordViewModel.getApplication().getString(R.string.welcome_password_breach_failed_to_check);
                t.e(string, "getString(...)");
                error = new PasswordBreachState.Error(string);
            } else {
                if (!t.b(bVar, l.b.c.f61690a)) {
                    throw new s();
                }
                String string2 = welcomeSignUpEnterPasswordViewModel.getApplication().getString(R.string.welcome_password_breach_network_error);
                t.e(string2, "getString(...)");
                error = new PasswordBreachState.Error(string2);
            }
            w wVar2 = WelcomeSignUpEnterPasswordViewModel.this.breachCheckingState;
            do {
                value2 = wVar2.getValue();
            } while (!wVar2.g(value2, error));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39401a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterPasswordViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39401a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignUpEnterPasswordViewModel.this._navigateToInitVault;
                b bVar = new b((byte[]) WelcomeSignUpEnterPasswordViewModel.this._password.getValue());
                this.f39401a = 1;
                if (dVar.b(bVar, this) == objF) {
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

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39403a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterPasswordViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39403a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeSignUpEnterPasswordViewModel.this._openHIBPDocumentation;
                m0 m0Var = m0.f82633a;
                this.f39403a = 1;
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f39407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f39408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f39409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Application f39410f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Application application, zt.e eVar) {
            super(5, eVar);
            this.f39410f = application;
        }

        @Override // iu.s
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object j(byte[] bArr, c cVar, PasswordBreachState passwordBreachState, String str, zt.e eVar) {
            g gVar = new g(this.f39410f, eVar);
            gVar.f39406b = bArr;
            gVar.f39407c = cVar;
            gVar.f39408d = passwordBreachState;
            gVar.f39409e = str;
            return gVar.invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            byte[] bArr = (byte[]) this.f39406b;
            c cVar = (c) this.f39407c;
            PasswordBreachState passwordBreachState = (PasswordBreachState) this.f39408d;
            String strA = (String) this.f39409e;
            boolean z10 = bArr.length == 0;
            PasswordBreachState.NotChecked notChecked = PasswordBreachState.NotChecked.INSTANCE;
            boolean z11 = (t.b(passwordBreachState, notChecked) || t.b(passwordBreachState, PasswordBreachState.BreachNotFound.INSTANCE)) && !z10 && cVar.b() >= 3;
            if (strA == null || strA.length() <= 0) {
                if (t.b(passwordBreachState, PasswordBreachState.BreachFound.INSTANCE)) {
                    strA = this.f39410f.getString(R.string.password_was_breached_message);
                    t.c(strA);
                } else {
                    strA = cVar.a();
                }
            }
            String str = strA;
            PasswordBreachState.BreachFound breachFound = PasswordBreachState.BreachFound.INSTANCE;
            int iB = t.b(passwordBreachState, breachFound) ? 0 : cVar.b();
            String strC = cVar.c();
            PasswordBreachState.BreachNotFound breachNotFound = PasswordBreachState.BreachNotFound.INSTANCE;
            String string = t.b(passwordBreachState, breachNotFound) ? this.f39410f.getString(R.string.password_is_not_pwned_message) : cVar.d();
            t.c(string);
            return new PasswordStrengthState(iB, str, cVar.c(), string, t.b(passwordBreachState, PasswordBreachState.Checking.INSTANCE), !z10 && str.length() == 0 && string.length() == 0 && strC.length() == 0 && t.b(passwordBreachState, notChecked), !z10 && (t.b(passwordBreachState, breachFound) || t.b(passwordBreachState, breachNotFound)), z11);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39412b;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            h hVar = WelcomeSignUpEnterPasswordViewModel.this.new h(eVar);
            hVar.f39412b = obj;
            return hVar;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(byte[] bArr, zt.e eVar) {
            return ((h) create(bArr, eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String email;
            Object objF = au.b.f();
            int i10 = this.f39411a;
            if (i10 == 0) {
                x.b(obj);
                byte[] bArr = (byte[]) this.f39412b;
                AuthenticationModel authenticationModel = WelcomeSignUpEnterPasswordViewModel.this.authenticationModel;
                if (authenticationModel instanceof EmailAuthentication) {
                    email = ((EmailAuthentication) authenticationModel).getEmail();
                } else if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
                    email = ((EnterpriseSingleSignOnAuthentication) authenticationModel).getEmail();
                } else {
                    if (!(authenticationModel instanceof FirebaseSingleSignOnAuthentication)) {
                        throw new s();
                    }
                    email = ((FirebaseSingleSignOnAuthentication) authenticationModel).getEmail();
                }
                m mVar = WelcomeSignUpEnterPasswordViewModel.this.passwordStrengthInteractor;
                List listE = v.e(email);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listE) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                this.f39411a = 1;
                obj = mVar.e(bArr, arrayList, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            n nVar = (n) obj;
            String str = (String) v.r0(nVar.b());
            if (str == null) {
                str = "";
            }
            String str2 = (String) v.s0(nVar.b(), 1);
            if (str2 == null) {
                str2 = "";
            }
            int iA = nVar.a();
            String str3 = (String) v.r0(nVar.c());
            return new c(iA, str3 != null ? str3 : "", str, str2);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f39415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WelcomeSignUpEnterPasswordViewModel f39416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(byte[] bArr, WelcomeSignUpEnterPasswordViewModel welcomeSignUpEnterPasswordViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39415b = bArr;
            this.f39416c = welcomeSignUpEnterPasswordViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new i(this.f39415b, this.f39416c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            au.b.f();
            if (this.f39414a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!Arrays.equals(this.f39415b, (byte[]) this.f39416c._password.getValue())) {
                w wVar = this.f39416c._apiError;
                do {
                    value3 = wVar.getValue();
                } while (!wVar.g(value3, null));
            }
            w wVar2 = this.f39416c._password;
            byte[] bArr = this.f39415b;
            do {
                value = wVar2.getValue();
            } while (!wVar2.g(value, bArr));
            w wVar3 = this.f39416c.breachCheckingState;
            do {
                value2 = wVar3.getValue();
            } while (!wVar3.g(value2, PasswordBreachState.NotChecked.INSTANCE));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39417a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f39419c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeSignUpEnterPasswordViewModel.this.new j(this.f39419c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39417a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeSignUpEnterPasswordViewModel.this._apiError;
            String str = this.f39419c;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, str));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeSignUpEnterPasswordViewModel(AuthenticationModel authenticationModel, Application application) {
        super(application);
        t.f(authenticationModel, "authenticationModel");
        t.f(application, "application");
        this.authenticationModel = authenticationModel;
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        w wVarA = zu.m0.a(new byte[0]);
        this._password = wVarA;
        this.password = zu.h.b(wVarA);
        w wVarA2 = zu.m0.a(null);
        this._apiError = wVarA2;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._openHIBPDocumentation = dVarB;
        this.openHIBPDocumentation = zu.h.M(dVarB);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._navigateToInitVault = dVarB2;
        this.navigateToInitVault = zu.h.M(dVarB2);
        this.passwordStrengthInteractor = new m();
        c0 c0Var = new c0(new PasswordBreachApiClientFactory(), b2.f52944a.B1());
        t.e(aVarY, "analytics");
        this.passwordBreachCheckInteractor = new l(c0Var, aVarY);
        w wVarA3 = zu.m0.a(PasswordBreachState.NotChecked.INSTANCE);
        this.breachCheckingState = wVarA3;
        aVarY.c5(aVarY.k(authenticationModel));
        zu.f fVarG = zu.h.G(zu.h.m(zu.h.a(wVarA)), new h(null));
        this.strengthInfoFlow = fVarG;
        this.passwordStrengthState = zu.h.P(zu.h.j(wVarA, fVarG, wVarA3, wVarA2, new g(application, null)), j1.a(this), g0.a.b(g0.f88389a, 5000L, 0L, 2, null), new PasswordStrengthState(0, (String) null, (String) null, (String) null, false, false, false, false, 255, (k) null));
    }

    private static /* synthetic */ void getStrengthInfoFlow$annotations() {
    }

    public final zu.f getNavigateToInitVault() {
        return this.navigateToInitVault;
    }

    public final zu.f getOpenHIBPDocumentation() {
        return this.openHIBPDocumentation;
    }

    public final k0 getPassword() {
        return this.password;
    }

    public final k0 getPasswordStrengthState() {
        return this.passwordStrengthState;
    }

    public final void onCheckPasswordClicked() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void onContinueClicked() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void onHowDoWeKnowClicked() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final void updatePassword(byte[] bArr) {
        t.f(bArr, "newPassword");
        wu.k.d(j1.a(this), null, null, new i(bArr, this, null), 3, null);
    }

    public final void updateReceivedApiError(String str) {
        wu.k.d(j1.a(this), null, null, new j(str, null), 3, null);
    }
}

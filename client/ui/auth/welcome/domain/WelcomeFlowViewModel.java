package com.server.auditor.ssh.client.ui.auth.welcome.domain;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.android.billingclient.api.r;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import com.server.auditor.ssh.client.billing.ProSubscriptionType;
import com.server.auditor.ssh.client.billing.a;
import com.server.auditor.ssh.client.navigation.k2;
import com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import com.server.auditor.ssh.client.ui.auth.welcome.presentation.WelcomeFlowGraphRoutes;
import hg.b2;
import iu.p;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import pg.a;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import vt.v;
import wu.i0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeFlowViewModel extends AndroidViewModel {
    private static final int YEAR_MONTH = 12;
    public static final String planTypeFree = "Free";
    private final yu.d _dismissedWelcomeFlow;
    private final w _introDismissed;
    private final w _plans;
    private final w _startDestination;
    private final w _welcomeShineBoxParams;
    private final zu.f dismissedWelcomeFlow;
    private final zu.f googleBillingClientStateFlow;
    private final n googleBillingWrapper$delegate;
    private final k0 introDismissed;
    private final nn.a isDesktopPromoStartedUseCase;
    private final nn.b isTrialPromoStartedUseCase;
    private final k0 plansState;
    private final k0 startDestination;
    private final nn.d updateDesktopPromoStartedUseCase;
    private final nn.e updateNeedSendWelcomePassedUseCase;
    private final nn.f updateTrialPromoStartedUseCase;
    private final k0 welcomeShineBoxParams;
    public static final b Companion = new b(null);
    public static final int $stable = 8;
    public static String keyPrefOnboarding = "onboarding";

    @Keep
    public interface BillingPlansState {

        @Keep
        public static final class Available implements BillingPlansState {
            public static final int $stable = 8;
            private final List<SubscriptionPlan> plans;

            public Available(List<SubscriptionPlan> list) {
                t.f(list, "plans");
                this.plans = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Available copy$default(Available available, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = available.plans;
                }
                return available.copy(list);
            }

            public final List<SubscriptionPlan> component1() {
                return this.plans;
            }

            public final Available copy(List<SubscriptionPlan> list) {
                t.f(list, "plans");
                return new Available(list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Available) && t.b(this.plans, ((Available) obj).plans);
            }

            public final List<SubscriptionPlan> getPlans() {
                return this.plans;
            }

            public int hashCode() {
                return this.plans.hashCode();
            }

            public String toString() {
                return "Available(plans=" + this.plans + ")";
            }
        }

        @Keep
        public static final class Initializing implements BillingPlansState {
            public static final int $stable = 0;
            public static final Initializing INSTANCE = new Initializing();

            private Initializing() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Initializing);
            }

            public int hashCode() {
                return -169541808;
            }

            public String toString() {
                return "Initializing";
            }
        }

        @Keep
        public static final class NotAvailable implements BillingPlansState {
            public static final int $stable = 0;
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NotAvailable);
            }

            public int hashCode() {
                return -399034311;
            }

            public String toString() {
                return "NotAvailable";
            }
        }
    }

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39429b;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            a aVar = WelcomeFlowViewModel.this.new a(eVar);
            aVar.f39429b = obj;
            return aVar;
        }

        @Override // iu.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.b bVar, zt.e eVar) {
            return ((a) create(bVar, eVar)).invokeSuspend(m0.f82633a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39428a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (((a.b) this.f39429b).a()) {
                WelcomeFlowViewModel.this.requestBillingInfo();
            }
            return m0.f82633a;
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39431a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f39433c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new c(this.f39433c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39431a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
                boolean z10 = this.f39433c;
                hg.d dVarM = aVarN.M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                SharedPreferences.Editor editorEdit = dVarM.edit();
                editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
                editorEdit.apply();
                aVarN.Y0(z10);
                WelcomeFlowViewModel.this.updateDesktopPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateTrialPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateNeedSendWelcomePassedUseCase.a(false);
                yu.d dVar = WelcomeFlowViewModel.this._dismissedWelcomeFlow;
                m0 m0Var = m0.f82633a;
                this.f39431a = 1;
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
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39434a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39434a;
            if (i10 == 0) {
                x.b(obj);
                hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                SharedPreferences.Editor editorEdit = dVarM.edit();
                editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
                editorEdit.apply();
                WelcomeFlowViewModel.this.updateDesktopPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateTrialPromoStartedUseCase.a(false);
                yu.d dVar = WelcomeFlowViewModel.this._dismissedWelcomeFlow;
                m0 m0Var = m0.f82633a;
                this.f39434a = 1;
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39436a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39436a;
            if (i10 == 0) {
                x.b(obj);
                hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                SharedPreferences.Editor editorEdit = dVarM.edit();
                editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
                editorEdit.apply();
                WelcomeFlowViewModel.this.updateDesktopPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateTrialPromoStartedUseCase.a(false);
                yu.d dVar = WelcomeFlowViewModel.this._dismissedWelcomeFlow;
                m0 m0Var = m0.f82633a;
                this.f39436a = 1;
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
        int f39438a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39438a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
                hg.d dVarM = aVarN.M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                SharedPreferences.Editor editorEdit = dVarM.edit();
                editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
                editorEdit.apply();
                aVarN.X0(WelcomeFlowViewModel.planTypeFree);
                com.server.auditor.ssh.client.utils.analytics.a.y().X5();
                WelcomeFlowViewModel.this.updateDesktopPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateTrialPromoStartedUseCase.a(false);
                yu.d dVar = WelcomeFlowViewModel.this._dismissedWelcomeFlow;
                m0 m0Var = m0.f82633a;
                this.f39438a = 1;
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

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39440a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39440a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeFlowViewModel.this._introDismissed;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(true)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39442a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object next;
            Object next2;
            au.b.f();
            if (this.f39442a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            r.e eVarD = WelcomeFlowViewModel.this.getGoogleBillingWrapper().d(new BillingSubscriptionType.Pro(ProSubscriptionType.AnnualFreeTrial.INSTANCE));
            r.e eVarD2 = WelcomeFlowViewModel.this.getGoogleBillingWrapper().d(new BillingSubscriptionType.Pro(ProSubscriptionType.MonthlyFreeTrial.INSTANCE));
            if (eVarD == null || eVarD2 == null) {
                w wVar = WelcomeFlowViewModel.this._plans;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, BillingPlansState.NotAvailable.INSTANCE));
            } else {
                WelcomeFlowViewModel welcomeFlowViewModel = WelcomeFlowViewModel.this;
                List listA = eVarD2.e().a();
                t.e(listA, "getPricingPhaseList(...)");
                Iterator it = listA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((r.c) next).b() == 0) {
                        break;
                    }
                }
                r.c cVar = (r.c) next;
                List listA2 = eVarD2.e().a();
                t.e(listA2, "getPricingPhaseList(...)");
                r.c cVar2 = (r.c) v.B0(listA2);
                Currency currency = Currency.getInstance(cVar2.c());
                t.e(currency, "getInstance(...)");
                String symbol = currency.getSymbol(Locale.getDefault(Locale.Category.FORMAT));
                k2 k2Var = k2.f29063a;
                t.c(symbol);
                a.C1077a c1077a = pg.a.f70175a;
                t.c(cVar2);
                String strA = k2Var.a(symbol, c1077a.i(cVar2));
                double d10 = 12;
                String strA2 = k2Var.a(symbol, c1077a.h(currency, c1077a.k(cVar2) * d10));
                int iA = cVar != null ? c1077a.a(cVar) : 0;
                Calendar calendar = Calendar.getInstance();
                calendar.add(5, iA);
                BillingSubscriptionType.Pro pro = new BillingSubscriptionType.Pro(ProSubscriptionType.MonthlyFreeTrial.INSTANCE);
                String strB = eVarD2.b();
                if (strB == null) {
                    strB = eVarD2.a();
                    t.e(strB, "getBasePlanId(...)");
                }
                String string = welcomeFlowViewModel.getApplication().getString(R.string.welcome_try_termius_month_plan_title);
                t.e(string, "getString(...)");
                String string2 = welcomeFlowViewModel.getApplication().getString(R.string.welcome_try_termius_that_is_price, strA2);
                t.e(string2, "getString(...)");
                String string3 = welcomeFlowViewModel.getApplication().getString(R.string.welcome_try_termius_price_per_month, strA);
                t.e(string3, "getString(...)");
                Date time = calendar.getTime();
                t.e(time, "getTime(...)");
                SubscriptionPlan subscriptionPlan = new SubscriptionPlan(pro, strB, false, string, string2, string3, null, null, time, iA, 196, null);
                WelcomeFlowViewModel welcomeFlowViewModel2 = WelcomeFlowViewModel.this;
                List listA3 = eVarD.e().a();
                t.e(listA3, "getPricingPhaseList(...)");
                Iterator it2 = listA3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((r.c) next2).b() == 0) {
                        break;
                    }
                }
                r.c cVar3 = (r.c) next2;
                List listA4 = eVarD.e().a();
                t.e(listA4, "getPricingPhaseList(...)");
                r.c cVar4 = (r.c) v.B0(listA4);
                a.C1077a c1077a2 = pg.a.f70175a;
                t.c(cVar4);
                double dK = c1077a2.k(cVar4);
                Currency currency2 = Currency.getInstance(cVar4.c());
                t.e(currency2, "getInstance(...)");
                String symbol2 = currency2.getSymbol(Locale.getDefault(Locale.Category.FORMAT));
                k2 k2Var2 = k2.f29063a;
                t.c(symbol2);
                String strA3 = k2Var2.a(symbol2, c1077a2.i(cVar4));
                String strA4 = k2Var2.a(symbol2, c1077a2.h(currency2, c1077a2.d(dK)));
                int iA2 = cVar3 != null ? c1077a2.a(cVar3) : 0;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(5, iA2);
                List listA5 = eVarD2.e().a();
                t.e(listA5, "getPricingPhaseList(...)");
                Object objB0 = v.B0(listA5);
                int i10 = iA2;
                t.e(objB0, "last(...)");
                double dK2 = c1077a2.k((r.c) objB0) * d10;
                List listA6 = eVarD.e().a();
                t.e(listA6, "getPricingPhaseList(...)");
                Object objB02 = v.B0(listA6);
                t.e(objB02, "last(...)");
                SubscriptionPlan subscriptionPlan2 = subscriptionPlan;
                String strCalculateSavePercentageText = welcomeFlowViewModel2.calculateSavePercentageText(dK2, c1077a2.k((r.c) objB02));
                List listA7 = eVarD2.e().a();
                t.e(listA7, "getPricingPhaseList(...)");
                Object objB03 = v.B0(listA7);
                t.e(objB03, "last(...)");
                String strA5 = k2Var2.a(symbol2, c1077a2.h(currency2, c1077a2.k((r.c) objB03) * d10));
                BillingSubscriptionType.Pro pro2 = new BillingSubscriptionType.Pro(ProSubscriptionType.AnnualFreeTrial.INSTANCE);
                String strB2 = eVarD.b();
                if (strB2 == null) {
                    strB2 = eVarD.a();
                    t.e(strB2, "getBasePlanId(...)");
                }
                String str = strB2;
                String string4 = welcomeFlowViewModel2.getApplication().getString(R.string.welcome_try_termius_annual_plan_title);
                t.e(string4, "getString(...)");
                String string5 = welcomeFlowViewModel2.getApplication().getString(R.string.welcome_try_termius_that_is_only_price, strA4);
                t.e(string5, "getString(...)");
                String string6 = welcomeFlowViewModel2.getApplication().getString(R.string.welcome_try_termius_price_per_year, strA3);
                t.e(string6, "getString(...)");
                String string7 = welcomeFlowViewModel2.getApplication().getString(R.string.welcome_try_termius_price_per_year, strA5);
                t.e(string7, "getString(...)");
                Date time2 = calendar2.getTime();
                t.e(time2, "getTime(...)");
                SubscriptionPlan subscriptionPlan3 = new SubscriptionPlan(pro2, str, false, string4, string5, string6, string7, strCalculateSavePercentageText, time2, i10, 4, null);
                w wVar2 = WelcomeFlowViewModel.this._plans;
                while (true) {
                    Object value2 = wVar2.getValue();
                    SubscriptionPlan subscriptionPlan4 = subscriptionPlan2;
                    if (wVar2.g(value2, new BillingPlansState.Available(v.r(subscriptionPlan3, subscriptionPlan4)))) {
                        break;
                    }
                    subscriptionPlan2 = subscriptionPlan4;
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39444a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39444a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
                hg.d dVarM = aVarN.M();
                t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
                SharedPreferences.Editor editorEdit = dVarM.edit();
                editorEdit.putBoolean(WelcomeFlowViewModel.keyPrefOnboarding, true);
                editorEdit.apply();
                aVarN.X0(WelcomeFlowViewModel.planTypeFree);
                WelcomeFlowViewModel.this.updateDesktopPromoStartedUseCase.a(false);
                WelcomeFlowViewModel.this.updateTrialPromoStartedUseCase.a(false);
                yu.d dVar = WelcomeFlowViewModel.this._dismissedWelcomeFlow;
                m0 m0Var = m0.f82633a;
                this.f39444a = 1;
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
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39446a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeFlowViewModel.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            au.b.f();
            if (this.f39446a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            boolean zA = WelcomeFlowViewModel.this.isDesktopPromoStartedUseCase.a();
            boolean zA2 = WelcomeFlowViewModel.this.isTrialPromoStartedUseCase.a();
            if (zA) {
                w wVar = WelcomeFlowViewModel.this._startDestination;
                do {
                    value3 = wVar.getValue();
                } while (!wVar.g(value3, WelcomeFlowGraphRoutes.SignUpPromoteDesktopApp.INSTANCE));
            } else if (zA2) {
                w wVar2 = WelcomeFlowViewModel.this._startDestination;
                do {
                    value2 = wVar2.getValue();
                } while (!wVar2.g(value2, WelcomeFlowGraphRoutes.SignUpPromotePremium.INSTANCE));
            } else {
                w wVar3 = WelcomeFlowViewModel.this._startDestination;
                do {
                    value = wVar3.getValue();
                } while (!wVar3.g(value, WelcomeFlowGraphRoutes.WelcomeIntro.INSTANCE));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(zu.g gVar, zt.e eVar) {
            return ((j) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFlowViewModel(Application application) {
        super(application);
        t.f(application, "application");
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.isDesktopPromoStartedUseCase = new nn.a(dVarM);
        hg.d dVarM2 = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
        this.isTrialPromoStartedUseCase = new nn.b(dVarM2);
        hg.d dVarM3 = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
        this.updateDesktopPromoStartedUseCase = new nn.d(dVarM3);
        hg.d dVarM4 = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM4, "getInsensitiveKeyValueRepository(...)");
        this.updateTrialPromoStartedUseCase = new nn.f(dVarM4);
        WelcomeFlowGraphRoutes.WelcomeIntro welcomeIntro = WelcomeFlowGraphRoutes.WelcomeIntro.INSTANCE;
        w wVarA = zu.m0.a(welcomeIntro);
        this._startDestination = wVarA;
        this.startDestination = zu.h.P(zu.h.L(wVarA, new j(null)), j1.a(this), g0.f88389a.c(), welcomeIntro);
        w wVarA2 = zu.m0.a(new kn.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null));
        this._welcomeShineBoxParams = wVarA2;
        this.welcomeShineBoxParams = zu.h.b(wVarA2);
        w wVarA3 = zu.m0.a(Boolean.FALSE);
        this._introDismissed = wVarA3;
        this.introDismissed = zu.h.b(wVarA3);
        this.googleBillingWrapper$delegate = o.a(new iu.a() { // from class: un.a
            @Override // iu.a
            public final Object a() {
                return WelcomeFlowViewModel.googleBillingWrapper_delegate$lambda$0();
            }
        });
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._dismissedWelcomeFlow = dVarB;
        this.dismissedWelcomeFlow = zu.h.M(dVarB);
        hg.d dVarM5 = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM5, "getInsensitiveKeyValueRepository(...)");
        this.updateNeedSendWelcomePassedUseCase = new nn.e(dVarM5);
        zu.f fVarO = zu.h.o(b2.f52944a.l1().s(), 1000L);
        this.googleBillingClientStateFlow = fVarO;
        w wVarA4 = zu.m0.a(BillingPlansState.Initializing.INSTANCE);
        this._plans = wVarA4;
        this.plansState = zu.h.b(wVarA4);
        zu.h.F(zu.h.K(fVarO, new a(null)), j1.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateSavePercentageText(double d10, double d11) {
        int iB = pg.a.f70175a.b(d10, d11);
        if (iB <= 0) {
            return "";
        }
        String string = getApplication().getString(R.string.discount_label, Integer.valueOf(iB));
        t.c(string);
        return string;
    }

    private static /* synthetic */ void getGoogleBillingClientStateFlow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.billing.b getGoogleBillingWrapper() {
        return (com.server.auditor.ssh.client.billing.b) this.googleBillingWrapper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.billing.b googleBillingWrapper_delegate$lambda$0() {
        return b2.f52944a.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestBillingInfo() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final void finishSignedIn(boolean z10) {
        wu.k.d(j1.a(this), null, null, new c(z10, null), 3, null);
    }

    public final void finishWelcomeFlowAsTrial() {
        wu.k.d(j1.a(this), null, null, new d(null), 3, null);
    }

    public final void finishWelcomeFlowHasDesktop() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    public final void finishWelcomeFlowSkippedTrialOffer() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    public final zu.f getDismissedWelcomeFlow() {
        return this.dismissedWelcomeFlow;
    }

    public final k0 getIntroDismissed() {
        return this.introDismissed;
    }

    public final k0 getPlansState() {
        return this.plansState;
    }

    public final k0 getStartDestination() {
        return this.startDestination;
    }

    public final k0 getWelcomeShineBoxParams() {
        return this.welcomeShineBoxParams;
    }

    public final void onIntroDismissed() {
        wu.k.d(j1.a(this), null, null, new g(null), 3, null);
    }

    public final void skipWelcomeFlow() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final void updateWelcomeShineBoxParams(kn.f fVar) {
        t.f(fVar, "params");
        this._welcomeShineBoxParams.setValue(fVar);
    }
}

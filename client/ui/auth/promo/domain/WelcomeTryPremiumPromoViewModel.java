package com.server.auditor.ssh.client.ui.auth.promo.domain;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.billing.b;
import com.server.auditor.ssh.client.ui.auth.promo.data.BillingIsNotAvailable;
import com.server.auditor.ssh.client.ui.auth.promo.data.CannotRestoreSubscription;
import com.server.auditor.ssh.client.ui.auth.promo.data.NavigateToCongratulationScreen;
import com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import hg.b2;
import iu.p;
import iu.q;
import java.util.ArrayList;
import java.util.List;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.s;
import ut.x;
import vt.v;
import wu.i0;
import zu.g0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class WelcomeTryPremiumPromoViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final yu.d _billingIsNotAvailable;
    private final yu.d _cannotRestoreSubscription;
    private final w _isLockedUI;
    private final yu.d _navigateToCongratulationScreen;
    private final w _plans;
    private final w _selectedIndex;
    private final yu.d _startBuySubscription;
    private final com.server.auditor.ssh.client.utils.analytics.a analytics;
    private final zu.f billingIsNotAvailable;
    private final zu.f cannotRestoreSubscription;
    private final com.server.auditor.ssh.client.billing.b googleBillingWrapper;
    private final k0 isLockedUI;
    private final zu.f navigateToCongratulationScreen;
    private final k0 plans;
    private final zu.f startBuySubscription;
    private final nn.f updateScreenStartedUseCase;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39098a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39098a;
            if (i10 == 0) {
                x.b(obj);
                w wVar = WelcomeTryPremiumPromoViewModel.this._isLockedUI;
                do {
                    value = wVar.getValue();
                    ((Boolean) value).getClass();
                } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.a(false)));
                WelcomeTryPremiumPromoViewModel.this.updateScreenStarted(false);
                yu.d dVar = WelcomeTryPremiumPromoViewModel.this._billingIsNotAvailable;
                BillingIsNotAvailable billingIsNotAvailable = BillingIsNotAvailable.INSTANCE;
                this.f39098a = 1;
                if (dVar.b(billingIsNotAvailable, this) == objF) {
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
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f39100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f39101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f39102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39103d;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        
            if (r9.b(r6, r8) == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r8.f39103d
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.f39100a
                com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan r0 = (com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan) r0
                ut.x.b(r9)
                goto Lb9
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f39102c
                com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan r1 = (com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan) r1
                java.lang.Object r4 = r8.f39101b
                com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel r4 = (com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel) r4
                java.lang.Object r5 = r8.f39100a
                com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan r5 = (com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan) r5
                ut.x.b(r9)
                goto L8d
            L30:
                ut.x.b(r9)
                com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel r9 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.this
                zu.k0 r9 = r9.getPlans()
                java.lang.Object r9 = r9.getValue()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L43:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L57
                java.lang.Object r1 = r9.next()
                r5 = r1
                com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan r5 = (com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan) r5
                boolean r5 = r5.isSelected()
                if (r5 == 0) goto L43
                goto L58
            L57:
                r1 = r3
            L58:
                com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan r1 = (com.server.auditor.ssh.client.ui.auth.promo.data.SubscriptionPlan) r1
                if (r1 == 0) goto Lb9
                com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel r9 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.this
                zu.w r5 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.access$get_isLockedUI$p(r9)
            L62:
                java.lang.Object r6 = r5.getValue()
                r7 = r6
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                r7.getClass()
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                boolean r6 = r5.g(r6, r7)
                if (r6 == 0) goto L62
                com.server.auditor.ssh.client.billing.b r5 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.access$getGoogleBillingWrapper$p(r9)
                r8.f39100a = r1
                r8.f39101b = r9
                r8.f39102c = r1
                r8.f39103d = r4
                java.lang.Object r4 = r5.h(r8)
                if (r4 != r0) goto L89
                goto Lb8
            L89:
                r5 = r4
                r4 = r9
                r9 = r5
                r5 = r1
            L8d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L99
                com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.access$restoreSubscription(r4)
                goto Lb9
            L99:
                yu.d r9 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.access$get_startBuySubscription$p(r4)
                com.server.auditor.ssh.client.ui.auth.promo.data.BuySubscriptionPayload r6 = new com.server.auditor.ssh.client.ui.auth.promo.data.BuySubscriptionPayload
                com.server.auditor.ssh.client.billing.b r4 = com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.access$getGoogleBillingWrapper$p(r4)
                com.server.auditor.ssh.client.billing.BillingSubscriptionType$Pro r1 = r1.getBillingSubscriptionType()
                r6.<init>(r4, r1)
                r8.f39100a = r5
                r8.f39101b = r3
                r8.f39102c = r3
                r8.f39103d = r2
                java.lang.Object r9 = r9.b(r6, r8)
                if (r9 != r0) goto Lb9
            Lb8:
                return r0
            Lb9:
                ut.m0 r9 = ut.m0.f82633a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39105a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39105a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeTryPremiumPromoViewModel.this.restoreSubscription();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39108b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AcknowledgeSubscriptionInfo f39110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo, zt.e eVar) {
            super(2, eVar);
            this.f39110d = acknowledgeSubscriptionInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new d(this.f39110d, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
        
            if (r13.b(r2, r12) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        
            if (r13.b(r3, r12) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.auth.promo.domain.WelcomeTryPremiumPromoViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39111a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39111a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = WelcomeTryPremiumPromoViewModel.this._cannotRestoreSubscription;
                CannotRestoreSubscription cannotRestoreSubscription = CannotRestoreSubscription.INSTANCE;
                this.f39111a = 1;
                if (dVar.b(cannotRestoreSubscription, this) == objF) {
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
        int f39113a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39113a;
            if (i10 == 0) {
                x.b(obj);
                WelcomeTryPremiumPromoViewModel.this.updateScreenStarted(false);
                yu.d dVar = WelcomeTryPremiumPromoViewModel.this._navigateToCongratulationScreen;
                SubscriptionPlan subscriptionPlan = (SubscriptionPlan) v.r0((List) WelcomeTryPremiumPromoViewModel.this.getPlans().getValue());
                NavigateToCongratulationScreen navigateToCongratulationScreen = new NavigateToCongratulationScreen(subscriptionPlan != null ? subscriptionPlan.getTrialDays() : 0);
                this.f39113a = 1;
                if (dVar.b(navigateToCongratulationScreen, this) == objF) {
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

    static final class g extends m implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f39117c;

        g(zt.e eVar) {
            super(3, eVar);
        }

        public final Object i(List list, int i10, zt.e eVar) {
            g gVar = new g(eVar);
            gVar.f39116b = list;
            gVar.f39117c = i10;
            return gVar.invokeSuspend(m0.f82633a);
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((List) obj, ((Number) obj2).intValue(), (zt.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39115a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            List list = (List) this.f39116b;
            int i10 = this.f39117c;
            ArrayList arrayList = new ArrayList(v.z(list, 10));
            int i11 = 0;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.y();
                }
                SubscriptionPlan subscriptionPlan = (SubscriptionPlan) obj2;
                arrayList.add(i11 == i10 ? SubscriptionPlan.copy$default(subscriptionPlan, null, null, true, null, null, null, null, null, null, 0, 1019, null) : SubscriptionPlan.copy$default(subscriptionPlan, null, null, false, null, null, null, null, null, null, 0, 1019, null));
                i11 = i12;
            }
            return arrayList;
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39118a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = au.b.f();
            int i10 = this.f39118a;
            if (i10 == 0) {
                x.b(obj);
                com.server.auditor.ssh.client.billing.b bVar = WelcomeTryPremiumPromoViewModel.this.googleBillingWrapper;
                this.f39118a = 1;
                obj = bVar.j(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            b.c cVar = (b.c) obj;
            if (t.b(cVar, b.c.f.f21567a)) {
                WelcomeTryPremiumPromoViewModel.this.onSubscriptionRestored();
            } else {
                if (!t.b(cVar, b.c.C0335c.f21564a) && !t.b(cVar, b.c.e.f21566a) && !t.b(cVar, b.c.d.f21565a) && !t.b(cVar, b.c.a.f21562a) && !t.b(cVar, b.c.C0334b.f21563a)) {
                    throw new s();
                }
                WelcomeTryPremiumPromoViewModel.this.onSubscriptionNotRestored();
            }
            w wVar = WelcomeTryPremiumPromoViewModel.this._isLockedUI;
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
        int f39120a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39120a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeTryPremiumPromoViewModel.this._isLockedUI;
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
        int f39122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WelcomeFlowViewModel.BillingPlansState f39123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WelcomeTryPremiumPromoViewModel f39124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(WelcomeFlowViewModel.BillingPlansState billingPlansState, WelcomeTryPremiumPromoViewModel welcomeTryPremiumPromoViewModel, zt.e eVar) {
            super(2, eVar);
            this.f39123b = billingPlansState;
            this.f39124c = welcomeTryPremiumPromoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new j(this.f39123b, this.f39124c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39122a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (this.f39123b instanceof WelcomeFlowViewModel.BillingPlansState.Available) {
                w wVar = this.f39124c._plans;
                WelcomeFlowViewModel.BillingPlansState billingPlansState = this.f39123b;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, ((WelcomeFlowViewModel.BillingPlansState.Available) billingPlansState).getPlans()));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39125a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39127c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f39127c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new k(this.f39127c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39125a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            WelcomeTryPremiumPromoViewModel.this.updateScreenStartedUseCase.a(this.f39127c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39128a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, zt.e eVar) {
            super(2, eVar);
            this.f39130c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return WelcomeTryPremiumPromoViewModel.this.new l(this.f39130c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            au.b.f();
            if (this.f39128a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            w wVar = WelcomeTryPremiumPromoViewModel.this._selectedIndex;
            int i10 = this.f39130c;
            do {
                value = wVar.getValue();
                ((Number) value).intValue();
            } while (!wVar.g(value, kotlin.coroutines.jvm.internal.b.d(i10)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeTryPremiumPromoViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.analytics = aVarY;
        w wVarA = zu.m0.a(v.o());
        this._plans = wVarA;
        w wVarA2 = zu.m0.a(0);
        this._selectedIndex = wVarA2;
        w wVarA3 = zu.m0.a(Boolean.FALSE);
        this._isLockedUI = wVarA3;
        this.isLockedUI = zu.h.b(wVarA3);
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._startBuySubscription = dVarB;
        this.startBuySubscription = zu.h.M(dVarB);
        yu.d dVarB2 = yu.g.b(-2, null, null, 6, null);
        this._billingIsNotAvailable = dVarB2;
        this.billingIsNotAvailable = zu.h.M(dVarB2);
        yu.d dVarB3 = yu.g.b(-2, null, null, 6, null);
        this._cannotRestoreSubscription = dVarB3;
        this.cannotRestoreSubscription = zu.h.M(dVarB3);
        yu.d dVarB4 = yu.g.b(-2, null, null, 6, null);
        this._navigateToCongratulationScreen = dVarB4;
        this.navigateToCongratulationScreen = zu.h.M(dVarB4);
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.updateScreenStartedUseCase = new nn.f(dVarM);
        this.plans = zu.h.P(zu.h.C(wVarA, wVarA2, new g(null)), j1.a(this), g0.a.b(g0.f88389a, 5000L, 0L, 2, null), v.o());
        aVarY.Y5();
        this.googleBillingWrapper = b2.f52944a.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubscriptionNotRestored() {
        wu.k.d(j1.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubscriptionRestored() {
        wu.k.d(j1.a(this), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreSubscription() {
        wu.k.d(j1.a(this), null, null, new h(null), 3, null);
    }

    public final zu.f getBillingIsNotAvailable() {
        return this.billingIsNotAvailable;
    }

    public final zu.f getCannotRestoreSubscription() {
        return this.cannotRestoreSubscription;
    }

    public final zu.f getNavigateToCongratulationScreen() {
        return this.navigateToCongratulationScreen;
    }

    public final k0 getPlans() {
        return this.plans;
    }

    public final zu.f getStartBuySubscription() {
        return this.startBuySubscription;
    }

    public final k0 isLockedUI() {
        return this.isLockedUI;
    }

    public final void onBillingServicesUnavailable() {
        wu.k.d(j1.a(this), null, null, new a(null), 3, null);
    }

    public final void onContinueClicked() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void onProductAlreadyOwned() {
        wu.k.d(j1.a(this), null, null, new c(null), 3, null);
    }

    public final void onProductPurchased(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
        t.f(acknowledgeSubscriptionInfo, "purchasedSubscription");
        wu.k.d(j1.a(this), null, null, new d(acknowledgeSubscriptionInfo, null), 3, null);
    }

    public final void unlockUI() {
        wu.k.d(j1.a(this), null, null, new i(null), 3, null);
    }

    public final void updatePlansState(WelcomeFlowViewModel.BillingPlansState billingPlansState) {
        t.f(billingPlansState, "plansState");
        wu.k.d(j1.a(this), null, null, new j(billingPlansState, this, null), 3, null);
    }

    public final void updateScreenStarted(boolean z10) {
        wu.k.d(j1.a(this), null, null, new k(z10, null), 3, null);
    }

    public final void updateSelectedPlan(int i10) {
        wu.k.d(j1.a(this), null, null, new l(i10, null), 3, null);
    }
}

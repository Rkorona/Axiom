package com.server.auditor.ssh.client.contracts.trials;

import com.server.auditor.ssh.client.billing.AcknowledgeSubscriptionInfo;
import com.server.auditor.ssh.client.fragments.trials.EndOfTrialScreen;
import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import com.server.auditor.ssh.client.models.SubscriptionPeriod;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.trials.f> implements com.server.auditor.ssh.client.contracts.trials.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        a() {
            super("buyMonthlyProSubscription", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Zd();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        a0() {
            super("showProPlanBottomPart", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.u8();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        b() {
            super("buyYearlyProSubscription", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.G9();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        b0() {
            super("showStarterPlanBottomPart", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Ta();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        c() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.f();
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionPeriod f23196a;

        c0(SubscriptionPeriod subscriptionPeriod) {
            super("showStillHaveTrialTimeAlertDialog", OneExecutionStateStrategy.class);
            this.f23196a = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.d4(this.f23196a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.a();
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        d0() {
            super("showTeamTrialPlanBottomPart", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.qd();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.trials.e$e, reason: collision with other inner class name */
    public class C0367e extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        C0367e() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.b();
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        e0() {
            super("showTitleForPaidSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.ib();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23203b;

        f(boolean z10, boolean z11) {
            super("navigateToInviteColleaguesScreen", OneExecutionStateStrategy.class);
            this.f23202a = z10;
            this.f23203b = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.t5(this.f23202a, this.f23203b);
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23205a;

        f0(int i10) {
            super("slideToPlan", OneExecutionStateStrategy.class);
            this.f23205a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.O2(this.f23205a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        g() {
            super("navigateToProPaidRenewingScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.ca();
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23208a;

        g0(boolean z10) {
            super("updateBackNavigationVisibility", AddToEndSingleStrategy.class);
            this.f23208a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.N8(this.f23208a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        h() {
            super("navigateToProSuccessfullyDeactivatedScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.r2();
        }
    }

    public class h0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTrialScreen.a[] f23211a;

        h0(EndOfTrialScreen.a[] aVarArr) {
            super("updateBusinessPlanBottomButtonsVisibility", AddToEndSingleStrategy.class);
            this.f23211a = aVarArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.F3(this.f23211a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        i() {
            super("navigateToProTrialExtensionScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.fd();
        }
    }

    public class i0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        i0() {
            super("updateBusinessPlanBuyNowButtonLabel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.g4();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcknowledgeSubscriptionInfo f23215a;

        j(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
            super("navigateToProcessingPurchaseScreen", OneExecutionStateStrategy.class);
            this.f23215a = acknowledgeSubscriptionInfo;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.id(this.f23215a);
        }
    }

    public class j0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        j0() {
            super("updateBusinessPlanUpgradeNowButtonLabel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Ne();
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23218a;

        k(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToRemoveTeamMembersConfirmationScreen", OneExecutionStateStrategy.class);
            this.f23218a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.A0(this.f23218a);
        }
    }

    public class k0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23220a;

        k0(int i10) {
            super("updateBusinessTrialPlanButtonPrices", AddToEndSingleStrategy.class);
            this.f23220a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Rc(this.f23220a);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        l() {
            super("navigateToRestoreSubscriptionScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.wa();
        }
    }

    public class l0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTrialScreen.c[] f23223a;

        l0(EndOfTrialScreen.c[] cVarArr) {
            super("updateProPlanBottomButtonsVisibility", AddToEndSingleStrategy.class);
            this.f23223a = cVarArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.vc(this.f23223a);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23225a;

        m(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToTeamDeactivationProgressScreen", OneExecutionStateStrategy.class);
            this.f23225a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.W(this.f23225a);
        }
    }

    public class m0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23230d;

        m0(String str, String str2, String str3, int i10) {
            super("updateProPlanButtonPrices", AddToEndSingleStrategy.class);
            this.f23227a = str;
            this.f23228b = str2;
            this.f23229c = str3;
            this.f23230d = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.G7(this.f23227a, this.f23228b, this.f23229c, this.f23230d);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23233b;

        n(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToTeamTrialExtensionScreen", OneExecutionStateStrategy.class);
            this.f23232a = z10;
            this.f23233b = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.M5(this.f23232a, this.f23233b);
        }
    }

    public class n0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTrialScreen.d[] f23235a;

        n0(EndOfTrialScreen.d[] dVarArr) {
            super("updateStarterPlanBottomButtonsVisibility", AddToEndSingleStrategy.class);
            this.f23235a = dVarArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.jc(this.f23235a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        o() {
            super("navigateToThanksForPurchaseScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.r7();
        }
    }

    public class o0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTrialScreen.e[] f23238a;

        o0(EndOfTrialScreen.e[] eVarArr) {
            super("updateTeamPlanBottomButtonsVisibility", AddToEndSingleStrategy.class);
            this.f23238a = eVarArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.n3(this.f23238a);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23240a;

        p(String str) {
            super("openPurchaseBusinessPlanSitePage", OneExecutionStateStrategy.class);
            this.f23240a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.D4(this.f23240a);
        }
    }

    public class p0 extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23242a;

        p0(int i10) {
            super("updateTeamTrialPlanButtonPrices", AddToEndSingleStrategy.class);
            this.f23242a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.L2(this.f23242a);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23244a;

        q(String str) {
            super("openPurchaseProPlanSitePage", OneExecutionStateStrategy.class);
            this.f23244a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Dc(this.f23244a);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23246a;

        r(String str) {
            super("openPurchaseTeamPlanSitePage", OneExecutionStateStrategy.class);
            this.f23246a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.a0(this.f23246a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        s() {
            super("selectedUnknownPlanCard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.k6();
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        t() {
            super("showBusinessTrialPlanBottomPart", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.q9();
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        u() {
            super("showDefaultTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.N4();
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionPeriod f23251a;

        v(SubscriptionPeriod subscriptionPeriod) {
            super("showDescriptionForActiveTeamTrialSubscription", AddToEndSingleStrategy.class);
            this.f23251a = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.ze(this.f23251a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionPeriod f23253a;

        w(SubscriptionPeriod subscriptionPeriod) {
            super("showDescriptionForActiveTrialSubscription", AddToEndSingleStrategy.class);
            this.f23253a = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.hc(this.f23253a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        x() {
            super("showDescriptionForExpiredPaidSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.h6();
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        y() {
            super("showDescriptionForExpiredTrialSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.Z6();
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.f> {
        z() {
            super("showDescriptionForPaidSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.f fVar) {
            fVar.W9();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void A0(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        k kVar = new k(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).A0(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void D4(String str) {
        p pVar = new p(str);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).D4(str);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Dc(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Dc(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void F3(EndOfTrialScreen.a... aVarArr) {
        h0 h0Var = new h0(aVarArr);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).F3(aVarArr);
        }
        this.viewCommands.afterApply(h0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void G7(String str, String str2, String str3, int i10) {
        m0 m0Var = new m0(str, str2, str3, i10);
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).G7(str, str2, str3, i10);
        }
        this.viewCommands.afterApply(m0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void G9() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).G9();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void L2(int i10) {
        p0 p0Var = new p0(i10);
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).L2(i10);
        }
        this.viewCommands.afterApply(p0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void M5(boolean z10, EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        n nVar = new n(z10, endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).M5(z10, endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void N4() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).N4();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void N8(boolean z10) {
        g0 g0Var = new g0(z10);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).N8(z10);
        }
        this.viewCommands.afterApply(g0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Ne() {
        j0 j0Var = new j0();
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Ne();
        }
        this.viewCommands.afterApply(j0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void O2(int i10) {
        f0 f0Var = new f0(i10);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).O2(i10);
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Rc(int i10) {
        k0 k0Var = new k0(i10);
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Rc(i10);
        }
        this.viewCommands.afterApply(k0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Ta() {
        b0 b0Var = new b0();
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Ta();
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        m mVar = new m(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).W(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void W9() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).W9();
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Z6() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Z6();
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void Zd() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).Zd();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void a0(String str) {
        r rVar = new r(str);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).a0(str);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void b() {
        C0367e c0367e = new C0367e();
        this.viewCommands.beforeApply(c0367e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).b();
        }
        this.viewCommands.afterApply(c0367e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ca() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).ca();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void d4(SubscriptionPeriod subscriptionPeriod) {
        c0 c0Var = new c0(subscriptionPeriod);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).d4(subscriptionPeriod);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void f() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).f();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void fd() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).fd();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void g4() {
        i0 i0Var = new i0();
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).g4();
        }
        this.viewCommands.afterApply(i0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void h6() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).h6();
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void hc(SubscriptionPeriod subscriptionPeriod) {
        w wVar = new w(subscriptionPeriod);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).hc(subscriptionPeriod);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ib() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).ib();
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void id(AcknowledgeSubscriptionInfo acknowledgeSubscriptionInfo) {
        j jVar = new j(acknowledgeSubscriptionInfo);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).id(acknowledgeSubscriptionInfo);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void jc(EndOfTrialScreen.d... dVarArr) {
        n0 n0Var = new n0(dVarArr);
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).jc(dVarArr);
        }
        this.viewCommands.afterApply(n0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void k6() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).k6();
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void n3(EndOfTrialScreen.e... eVarArr) {
        o0 o0Var = new o0(eVarArr);
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).n3(eVarArr);
        }
        this.viewCommands.afterApply(o0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void q9() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).q9();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void qd() {
        d0 d0Var = new d0();
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).qd();
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void r2() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).r2();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void r7() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).r7();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void t5(boolean z10, boolean z11) {
        f fVar = new f(z10, z11);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).t5(z10, z11);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void u8() {
        a0 a0Var = new a0();
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).u8();
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void vc(EndOfTrialScreen.c... cVarArr) {
        l0 l0Var = new l0(cVarArr);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).vc(cVarArr);
        }
        this.viewCommands.afterApply(l0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void wa() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).wa();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.f
    public void ze(SubscriptionPeriod subscriptionPeriod) {
        v vVar = new v(subscriptionPeriod);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.f) it.next()).ze(subscriptionPeriod);
        }
        this.viewCommands.afterApply(vVar);
    }
}

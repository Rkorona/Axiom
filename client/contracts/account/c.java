package com.server.auditor.ssh.client.contracts.account;

import android.content.DialogInterface;
import android.net.Uri;
import com.server.auditor.ssh.client.models.SubscriptionPeriod;
import com.server.auditor.ssh.client.presenters.account.AccountStartScreenPresenter;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.account.d> implements com.server.auditor.ssh.client.contracts.account.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DialogInterface f21676a;

        a(DialogInterface dialogInterface) {
            super("dismissDialog", OneExecutionStateStrategy.class);
            this.f21676a = dialogInterface;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Ya(this.f21676a);
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21679b;

        a0(String str, String str2) {
            super("showUIForBusinessTeamMemberAccount", AddToEndSingleStrategy.class);
            this.f21678a = str;
            this.f21679b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.j3(this.f21678a, this.f21679b);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        b() {
            super("finishFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.p();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21682a;

        b0(String str) {
            super("showUIForBusinessTeamOwnerAccount", AddToEndSingleStrategy.class);
            this.f21682a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.A6(this.f21682a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.account.c$c, reason: collision with other inner class name */
    public class C0341c extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21684a;

        C0341c(String str) {
            super("formatAndUpdateLastSyncDate", AddToEndSingleStrategy.class);
            this.f21684a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.ge(this.f21684a);
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21687b;

        c0(String str, String str2) {
            super("showUIForEnterpriseTrialAccount", AddToEndSingleStrategy.class);
            this.f21686a = str;
            this.f21687b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.ee(this.f21686a, this.f21687b);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.a();
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21690a;

        d0(String str) {
            super("showUIForFreeAccount", AddToEndSingleStrategy.class);
            this.f21690a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.uc(this.f21690a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        e() {
            super("navigateToChoosePlanScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.o();
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        e0() {
            super("showUIForLoadingState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.F6();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        f() {
            super("navigateToLogoutConfirmationScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.q();
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21696b;

        f0(String str, boolean z10) {
            super("showUIForProAccount", AddToEndSingleStrategy.class);
            this.f21695a = str;
            this.f21696b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.X2(this.f21695a, this.f21696b);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        g() {
            super("restoreSubscription", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Ca();
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21699a;

        g0(String str) {
            super("showUIForStudentAccount", AddToEndSingleStrategy.class);
            this.f21699a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.A3(this.f21699a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21702b;

        h(int i10, String str) {
            super("setCustomUserAvatar", AddToEndSingleStrategy.class);
            this.f21701a = i10;
            this.f21702b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.w7(this.f21701a, this.f21702b);
        }
    }

    public class h0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21704a;

        h0(String str) {
            super("showUIForTeacherAccount", AddToEndSingleStrategy.class);
            this.f21704a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.nd(this.f21704a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f21706a;

        i(Uri uri) {
            super("setUserAvatar", AddToEndSingleStrategy.class);
            this.f21706a = uri;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.K5(this.f21706a);
        }
    }

    public class i0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21709b;

        i0(String str, String str2) {
            super("showUIForTeamMemberAccount", AddToEndSingleStrategy.class);
            this.f21708a = str;
            this.f21709b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.R7(this.f21708a, this.f21709b);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        j() {
            super("showChangeEmailFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.S9();
        }
    }

    public class j0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21712a;

        j0(String str) {
            super("showUIForTeamOwnerAccount", AddToEndSingleStrategy.class);
            this.f21712a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.wb(this.f21712a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        k() {
            super("showChangePasswordFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.C5();
        }
    }

    public class k0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscriptionPeriod f21716b;

        k0(String str, SubscriptionPeriod subscriptionPeriod) {
            super("showUIForTeamTrialAccount", AddToEndSingleStrategy.class);
            this.f21715a = str;
            this.f21716b = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.x6(this.f21715a, this.f21716b);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        l() {
            super("showContextMenu", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.l8();
        }
    }

    public class l0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscriptionPeriod f21720b;

        l0(String str, SubscriptionPeriod subscriptionPeriod) {
            super("showUIForTeamTrialWithPremiumAccount", AddToEndSingleStrategy.class);
            this.f21719a = str;
            this.f21720b = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.U7(this.f21719a, this.f21720b);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        m() {
            super("showDevicesList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Ma();
        }
    }

    public class m0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscriptionPeriod f21724b;

        m0(String str, SubscriptionPeriod subscriptionPeriod) {
            super("showUIForTrialAccount", AddToEndSingleStrategy.class);
            this.f21723a = str;
            this.f21724b = subscriptionPeriod;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.q6(this.f21723a, this.f21724b);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        n() {
            super("showDisable2faButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Qb();
        }
    }

    public class n0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        n0() {
            super("start2faActivationProcess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.p5();
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        o() {
            super("showEmailVerificationDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.g5();
        }
    }

    public class o0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        o0() {
            super("start2faDeactivationProcess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Ad();
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        p() {
            super("showEnable2faButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.l6();
        }
    }

    public class p0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        p0() {
            super("startSpinningContextMenu", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.e8();
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21732a;

        q(String str) {
            super("showErrorSnackBarMessage", OneExecutionStateStrategy.class);
            this.f21732a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Fc(this.f21732a);
        }
    }

    public class q0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        q0() {
            super("stopSpinningContextMenu", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.s5();
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21735a;

        r(int i10) {
            super("showFeaturePromoScreen", OneExecutionStateStrategy.class);
            this.f21735a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.u7(this.f21735a);
        }
    }

    public class r0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountStartScreenPresenter.b f21737a;

        r0(AccountStartScreenPresenter.b bVar) {
            super("updateChangeEmailVisibilityState", AddToEndSingleStrategy.class);
            this.f21737a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.R2(this.f21737a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21739a;

        s(String str) {
            super("showManageSubscriptionPage", OneExecutionStateStrategy.class);
            this.f21739a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.X5(this.f21739a);
        }
    }

    public class s0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21741a;

        s0(boolean z10) {
            super("updateLogoutButtonState", AddToEndSingleStrategy.class);
            this.f21741a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.T2(this.f21741a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        t() {
            super("showNotFoundSubscriptionSnackBar", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.r8();
        }
    }

    public class t0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21744a;

        t0(boolean z10) {
            super("updatePricesViews", AddToEndSingleStrategy.class);
            this.f21744a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.z6(this.f21744a);
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        u() {
            super("showSshIdScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Kb();
        }
    }

    public class u0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21747a;

        u0(String str) {
            super("updateScreenSubtitle", AddToEndSingleStrategy.class);
            this.f21747a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.S7(this.f21747a);
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        v() {
            super("showSubscriptionAlreadyPurchasedSnackBar", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.I6();
        }
    }

    public class v0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21750a;

        v0(String str) {
            super("updateScreenTitle", AddToEndSingleStrategy.class);
            this.f21750a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.Q1(this.f21750a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        w() {
            super("showSubscriptionNotRestoredErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.r6();
        }
    }

    public class w0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21753a;

        w0(boolean z10) {
            super("updateSshIdButtonState", AddToEndSingleStrategy.class);
            this.f21753a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.m8(this.f21753a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        x() {
            super("showSubscriptionRestorationUnavailableErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.vb();
        }
    }

    public class x0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21756a;

        x0(boolean z10) {
            super("updateSyncKeysAndIdentitiesState", AddToEndSingleStrategy.class);
            this.f21756a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.gb(this.f21756a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21758a;

        y(String str) {
            super("showSuccessSnackBarMessage", OneExecutionStateStrategy.class);
            this.f21758a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.S4(this.f21758a);
        }
    }

    public class y0 extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21760a;

        y0(boolean z10) {
            super("updateVerifyEmailVisibility", AddToEndSingleStrategy.class);
            this.f21760a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.w6(this.f21760a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.account.d> {
        z() {
            super("showSyncPromo", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.d dVar) {
            dVar.f9();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void A3(String str) {
        g0 g0Var = new g0(str);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).A3(str);
        }
        this.viewCommands.afterApply(g0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void A6(String str) {
        b0 b0Var = new b0(str);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).A6(str);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Ad() {
        o0 o0Var = new o0();
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Ad();
        }
        this.viewCommands.afterApply(o0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void C5() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).C5();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Ca() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Ca();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void F6() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).F6();
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Fc(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Fc(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void I6() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).I6();
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void K5(Uri uri) {
        i iVar = new i(uri);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).K5(uri);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Kb() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Kb();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Ma() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Ma();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Q1(String str) {
        v0 v0Var = new v0(str);
        this.viewCommands.beforeApply(v0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Q1(str);
        }
        this.viewCommands.afterApply(v0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Qb() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Qb();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void R2(AccountStartScreenPresenter.b bVar) {
        r0 r0Var = new r0(bVar);
        this.viewCommands.beforeApply(r0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).R2(bVar);
        }
        this.viewCommands.afterApply(r0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void R7(String str, String str2) {
        i0 i0Var = new i0(str, str2);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).R7(str, str2);
        }
        this.viewCommands.afterApply(i0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void S4(String str) {
        y yVar = new y(str);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).S4(str);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void S7(String str) {
        u0 u0Var = new u0(str);
        this.viewCommands.beforeApply(u0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).S7(str);
        }
        this.viewCommands.afterApply(u0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void S9() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).S9();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void T2(boolean z10) {
        s0 s0Var = new s0(z10);
        this.viewCommands.beforeApply(s0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).T2(z10);
        }
        this.viewCommands.afterApply(s0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void U7(String str, SubscriptionPeriod subscriptionPeriod) {
        l0 l0Var = new l0(str, subscriptionPeriod);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).U7(str, subscriptionPeriod);
        }
        this.viewCommands.afterApply(l0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void X2(String str, boolean z10) {
        f0 f0Var = new f0(str, z10);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).X2(str, z10);
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void X5(String str) {
        s sVar = new s(str);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).X5(str);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void Ya(DialogInterface dialogInterface) {
        a aVar = new a(dialogInterface);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).Ya(dialogInterface);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void e8() {
        p0 p0Var = new p0();
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).e8();
        }
        this.viewCommands.afterApply(p0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void ee(String str, String str2) {
        c0 c0Var = new c0(str, str2);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).ee(str, str2);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void f9() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).f9();
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void g5() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).g5();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void gb(boolean z10) {
        x0 x0Var = new x0(z10);
        this.viewCommands.beforeApply(x0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).gb(z10);
        }
        this.viewCommands.afterApply(x0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void ge(String str) {
        C0341c c0341c = new C0341c(str);
        this.viewCommands.beforeApply(c0341c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).ge(str);
        }
        this.viewCommands.afterApply(c0341c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void j3(String str, String str2) {
        a0 a0Var = new a0(str, str2);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).j3(str, str2);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void l6() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).l6();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void l8() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).l8();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void m8(boolean z10) {
        w0 w0Var = new w0(z10);
        this.viewCommands.beforeApply(w0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).m8(z10);
        }
        this.viewCommands.afterApply(w0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void nd(String str) {
        h0 h0Var = new h0(str);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).nd(str);
        }
        this.viewCommands.afterApply(h0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void o() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).o();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void p() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).p();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void p5() {
        n0 n0Var = new n0();
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).p5();
        }
        this.viewCommands.afterApply(n0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void q() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).q();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void q6(String str, SubscriptionPeriod subscriptionPeriod) {
        m0 m0Var = new m0(str, subscriptionPeriod);
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).q6(str, subscriptionPeriod);
        }
        this.viewCommands.afterApply(m0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void r6() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).r6();
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void r8() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).r8();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void s5() {
        q0 q0Var = new q0();
        this.viewCommands.beforeApply(q0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).s5();
        }
        this.viewCommands.afterApply(q0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void u7(int i10) {
        r rVar = new r(i10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).u7(i10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void uc(String str) {
        d0 d0Var = new d0(str);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).uc(str);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void vb() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).vb();
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void w6(boolean z10) {
        y0 y0Var = new y0(z10);
        this.viewCommands.beforeApply(y0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).w6(z10);
        }
        this.viewCommands.afterApply(y0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void w7(int i10, String str) {
        h hVar = new h(i10, str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).w7(i10, str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void wb(String str) {
        j0 j0Var = new j0(str);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).wb(str);
        }
        this.viewCommands.afterApply(j0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void x6(String str, SubscriptionPeriod subscriptionPeriod) {
        k0 k0Var = new k0(str, subscriptionPeriod);
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).x6(str, subscriptionPeriod);
        }
        this.viewCommands.afterApply(k0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d
    public void z6(boolean z10) {
        t0 t0Var = new t0(z10);
        this.viewCommands.beforeApply(t0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.d) it.next()).z6(z10);
        }
        this.viewCommands.afterApply(t0Var);
    }
}

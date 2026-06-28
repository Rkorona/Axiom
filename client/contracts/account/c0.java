package com.server.auditor.ssh.client.contracts.account;

import android.content.Intent;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c0 extends MvpViewState<d0> implements d0 {

    public class a extends ViewCommand<d0> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.f();
        }
    }

    public class b extends ViewCommand<d0> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.e();
        }
    }

    public class c extends ViewCommand<d0> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.a();
        }
    }

    public class d extends ViewCommand<d0> {
        d() {
            super("makeFirebaseAuthManagerSignedOut", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.e2();
        }
    }

    public class e extends ViewCommand<d0> {
        e() {
            super("makeGoogleClientSignedOut", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.A2();
        }
    }

    public class f extends ViewCommand<d0> {
        f() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.b();
        }
    }

    public class g extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21771c;

        g(int i10, boolean z10, boolean z11) {
            super("navigateToSignInChooserScreen", OneExecutionStateStrategy.class);
            this.f21769a = i10;
            this.f21770b = z10;
            this.f21771c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.N(this.f21769a, this.f21770b, this.f21771c);
        }
    }

    public class h extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21775c;

        h(int i10, boolean z10, boolean z11) {
            super("navigateToSignUpEnterEmailScreen", OneExecutionStateStrategy.class);
            this.f21773a = i10;
            this.f21774b = z10;
            this.f21775c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.ba(this.f21773a, this.f21774b, this.f21775c);
        }
    }

    public class i extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FirebaseSingleSignOnAuthentication f21778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21780d;

        i(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
            super("navigateToSingleSignOnSignInScreen", OneExecutionStateStrategy.class);
            this.f21777a = i10;
            this.f21778b = firebaseSingleSignOnAuthentication;
            this.f21779c = z10;
            this.f21780d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.T1(this.f21777a, this.f21778b, this.f21779c, this.f21780d);
        }
    }

    public class j extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FirebaseSingleSignOnAuthentication f21783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21785d;

        j(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
            super("navigateToSingleSignOnSignUpScreen", OneExecutionStateStrategy.class);
            this.f21782a = i10;
            this.f21783b = firebaseSingleSignOnAuthentication;
            this.f21784c = z10;
            this.f21785d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.Y0(this.f21782a, this.f21783b, this.f21784c, this.f21785d);
        }
    }

    public class k extends ViewCommand<d0> {
        k() {
            super("openPrivacyPolicyWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.v0();
        }
    }

    public class l extends ViewCommand<d0> {
        l() {
            super("openTermsOfServiceWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.V1();
        }
    }

    public class m extends ViewCommand<d0> {
        m() {
            super("putRewindToFirstSlideFlag", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.P8();
        }
    }

    public class n extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21790a;

        n(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f21790a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.k(this.f21790a);
        }
    }

    public class o extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21792a;

        o(String str) {
            super("showInfoSnackBar", OneExecutionStateStrategy.class);
            this.f21792a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.Y(this.f21792a);
        }
    }

    public class p extends ViewCommand<d0> {
        p() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.g();
        }
    }

    public class q extends ViewCommand<d0> {
        q() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.d();
        }
    }

    public class r extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21796a;

        r(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f21796a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.m(this.f21796a);
        }
    }

    public class s extends ViewCommand<d0> {
        s() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.h();
        }
    }

    public class t extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f21799a;

        t(Intent intent) {
            super("startGoogleSignOnProcess", OneExecutionStateStrategy.class);
            this.f21799a = intent;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.K1(this.f21799a);
        }
    }

    public class u extends ViewCommand<d0> {
        u() {
            super("tryToAuthenticateWithApple", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.c1();
        }
    }

    public class v extends ViewCommand<d0> {
        v() {
            super("tryToAuthenticateWithGoogle", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.H1();
        }
    }

    public class w extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21803a;

        w(boolean z10) {
            super("updateSkipOnboardingButtonVisibility", AddToEndSingleStrategy.class);
            this.f21803a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.ea(this.f21803a);
        }
    }

    public class x extends ViewCommand<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21805a;

        x(int i10) {
            super("updateViewForFeature", AddToEndSingleStrategy.class);
            this.f21805a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d0 d0Var) {
            d0Var.gf(this.f21805a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void A2() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).A2();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void H1() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).H1();
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void K1(Intent intent) {
        t tVar = new t(intent);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).K1(intent);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void N(int i10, boolean z10, boolean z11) {
        g gVar = new g(i10, z10, z11);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).N(i10, z10, z11);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void P8() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).P8();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void T1(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        i iVar = new i(i10, firebaseSingleSignOnAuthentication, z10, z11);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).T1(i10, firebaseSingleSignOnAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void V1() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).V1();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void Y(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).Y(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void Y0(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        j jVar = new j(i10, firebaseSingleSignOnAuthentication, z10, z11);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).Y0(i10, firebaseSingleSignOnAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).b();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void ba(int i10, boolean z10, boolean z11) {
        h hVar = new h(i10, z10, z11);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).ba(i10, z10, z11);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void c1() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).c1();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void d() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).d();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void e2() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e2();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void ea(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).ea(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void g() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).g();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void gf(int i10) {
        x xVar = new x(i10);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).gf(i10);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void h() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).h();
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void k(String str) {
        n nVar = new n(str);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).k(str);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void m(int i10) {
        r rVar = new r(i10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).m(i10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.d0
    public void v0() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).v0();
        }
        this.viewCommands.afterApply(kVar);
    }
}

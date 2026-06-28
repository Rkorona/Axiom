package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class n1 extends MvpViewState<o1> implements o1 {

    public class a extends ViewCommand<o1> {
        a() {
            super("finishFlowWithLogoutResult", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.j2();
        }
    }

    public class b extends ViewCommand<o1> {
        b() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.l();
        }
    }

    public class c extends ViewCommand<o1> {
        c() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.e();
        }
    }

    public class d extends ViewCommand<o1> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.a();
        }
    }

    public class e extends ViewCommand<o1> {
        e() {
            super("navigateToLogoutConfirmationScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.q();
        }
    }

    public class f extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthenticationModel f22591a;

        f(AuthenticationModel authenticationModel) {
            super("navigateToMasterPasswordEnterPasswordScreen", OneExecutionStateStrategy.class);
            this.f22591a = authenticationModel;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.I4(this.f22591a);
        }
    }

    public class g extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22593a;

        g(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showEmailError", OneExecutionStateStrategy.class);
            this.f22593a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.Z(this.f22593a);
        }
    }

    public class h extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22595a;

        h(String str) {
            super("showEnterpriseSingleSignOnWebView", OneExecutionStateStrategy.class);
            this.f22595a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.a2(this.f22595a);
        }
    }

    public class i extends ViewCommand<o1> {
        i() {
            super("showEnterpriseUserNotExist", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.s2();
        }
    }

    public class j extends ViewCommand<o1> {
        j() {
            super("showEnterpriseUserNotMigrated", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.I1();
        }
    }

    public class k extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22599a;

        k(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f22599a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.k(this.f22599a);
        }
    }

    public class l extends ViewCommand<o1> {
        l() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.i();
        }
    }

    public class m extends ViewCommand<o1> {
        m() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.g();
        }
    }

    public class n extends ViewCommand<o1> {
        n() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.d();
        }
    }

    public class o extends ViewCommand<o1> {
        o() {
            super("showReCaptcha", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.D();
        }
    }

    public class p extends ViewCommand<o1> {
        p() {
            super("showReCaptchaError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.F();
        }
    }

    public class q extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22606a;

        q(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f22606a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.m(this.f22606a);
        }
    }

    public class r extends ViewCommand<o1> {
        r() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.h();
        }
    }

    public class s extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22609a;

        s(boolean z10) {
            super("updateContinueButtonEnabled", AddToEndSingleStrategy.class);
            this.f22609a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.P(this.f22609a);
        }
    }

    public class t extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22611a;

        t(String str) {
            super("updateEmailField", OneExecutionStateStrategy.class);
            this.f22611a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.Bc(this.f22611a);
        }
    }

    public class u extends ViewCommand<o1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22613a;

        u(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateEmailInputFieldError", OneExecutionStateStrategy.class);
            this.f22613a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o1 o1Var) {
            o1Var.C(this.f22613a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void Bc(String str) {
        t tVar = new t(str);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).Bc(str);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        u uVar = new u(a0Var);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).C(a0Var);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void D() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).D();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void F() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).F();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void I1() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).I1();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void I4(AuthenticationModel authenticationModel) {
        f fVar = new f(authenticationModel);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).I4(authenticationModel);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void P(boolean z10) {
        s sVar = new s(z10);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).P(z10);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void Z(com.server.auditor.ssh.client.help.a0 a0Var) {
        g gVar = new g(a0Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).Z(a0Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void a2(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).a2(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void d() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).d();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void e() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).e();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void g() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).g();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void h() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).h();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void i() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).i();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void j2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).j2();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void k(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).k(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void l() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).l();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void m(int i10) {
        q qVar = new q(i10);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).m(i10);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void q() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).q();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o1
    public void s2() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).s2();
        }
        this.viewCommands.afterApply(iVar);
    }
}

package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class p1 extends MvpViewState<q1> implements q1 {

    public class a extends ViewCommand<q1> {
        a() {
            super("clearPasswordInputField", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.j0();
        }
    }

    public class b extends ViewCommand<q1> {
        b() {
            super("finishFlowWithLogout", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.ff();
        }
    }

    public class c extends ViewCommand<q1> {
        c() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.n();
        }
    }

    public class d extends ViewCommand<q1> {
        d() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.l();
        }
    }

    public class e extends ViewCommand<q1> {
        e() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.e();
        }
    }

    public class f extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22689a;

        f(String str) {
            super("initView", AddToEndSingleStrategy.class);
            this.f22689a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.e0(this.f22689a);
        }
    }

    public class g extends ViewCommand<q1> {
        g() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.b();
        }
    }

    public class h extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthenticationModel f22692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22693b;

        h(AuthenticationModel authenticationModel, String str) {
            super("navigateToEmailApprovalScreen", OneExecutionStateStrategy.class);
            this.f22692a = authenticationModel;
            this.f22693b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.o0(this.f22692a, this.f22693b);
        }
    }

    public class i extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailAuthentication f22695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22696b;

        i(EmailAuthentication emailAuthentication, String str) {
            super("navigateToTwoFactorVerificationScreen", OneExecutionStateStrategy.class);
            this.f22695a = emailAuthentication;
            this.f22696b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.x1(this.f22695a, this.f22696b);
        }
    }

    public class j extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22698a;

        j(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f22698a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.k(this.f22698a);
        }
    }

    public class k extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22700a;

        k(String str) {
            super("showInfoSnackBar", OneExecutionStateStrategy.class);
            this.f22700a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.Y(this.f22700a);
        }
    }

    public class l extends ViewCommand<q1> {
        l() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.i();
        }
    }

    public class m extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f22703a;

        m(Integer num) {
            super("showLoginIsBlocked", OneExecutionStateStrategy.class);
            this.f22703a = num;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.F7(this.f22703a);
        }
    }

    public class n extends ViewCommand<q1> {
        n() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.g();
        }
    }

    public class o extends ViewCommand<q1> {
        o() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.d();
        }
    }

    public class p extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22707a;

        p(String str) {
            super("showResetPasswordDialog", OneExecutionStateStrategy.class);
            this.f22707a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.Wc(this.f22707a);
        }
    }

    public class q extends ViewCommand<q1> {
        q() {
            super("showResetPasswordLinkSuccessfullySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.P0();
        }
    }

    public class r extends ViewCommand<q1> {
        r() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.h();
        }
    }

    public class s extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22711a;

        s(String str) {
            super("showUserScheduledToDeleteDialog", OneExecutionStateStrategy.class);
            this.f22711a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.yb(this.f22711a);
        }
    }

    public class t extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22713a;

        t(boolean z10) {
            super("updateBackButtonState", AddToEndSingleStrategy.class);
            this.f22713a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.r(this.f22713a);
        }
    }

    public class u extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22715a;

        u(String str) {
            super("updatePasswordFieldError", OneExecutionStateStrategy.class);
            this.f22715a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.G(this.f22715a);
        }
    }

    public class v extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22717a;

        v(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateShowThrottled", AddToEndSingleStrategy.class);
            this.f22717a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.j1(this.f22717a);
        }
    }

    public class w extends ViewCommand<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22719a;

        w(boolean z10) {
            super("updateUnlockButtonState", AddToEndSingleStrategy.class);
            this.f22719a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q1 q1Var) {
            q1Var.b0(this.f22719a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void F7(Integer num) {
        m mVar = new m(num);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).F7(num);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void G(String str) {
        u uVar = new u(str);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).G(str);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void P0() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).P0();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void Wc(String str) {
        p pVar = new p(str);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).Wc(str);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void Y(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).Y(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void b() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).b();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void b0(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).b0(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void d() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).d();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void e() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).e();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void e0(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).e0(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void ff() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).ff();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void g() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).g();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void h() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).h();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void i() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).i();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void j0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).j0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void j1(com.server.auditor.ssh.client.help.a0 a0Var) {
        v vVar = new v(a0Var);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).j1(a0Var);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void k(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).k(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void l() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).l();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void n() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).n();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void o0(AuthenticationModel authenticationModel, String str) {
        h hVar = new h(authenticationModel, str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).o0(authenticationModel, str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void r(boolean z10) {
        t tVar = new t(z10);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).r(z10);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void x1(EmailAuthentication emailAuthentication, String str) {
        i iVar = new i(emailAuthentication, str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).x1(emailAuthentication, str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q1
    public void yb(String str) {
        s sVar = new s(str);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).yb(str);
        }
        this.viewCommands.afterApply(sVar);
    }
}

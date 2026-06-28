package com.server.auditor.ssh.client.contracts.auth;

import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.auth.b> implements com.server.auditor.ssh.client.contracts.auth.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.auth.a$a, reason: collision with other inner class name */
    public class C0343a extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        C0343a() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.n();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.e();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.a();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.b();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthenticationModel f22067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22068b;

        e(AuthenticationModel authenticationModel, String str) {
            super("navigateToLoginApprovalScreen", OneExecutionStateStrategy.class);
            this.f22067a = authenticationModel;
            this.f22068b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.Q8(this.f22067a, this.f22068b);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoginErrorContainer f22070a;

        f(LoginErrorContainer loginErrorContainer) {
            super("setErrorModelResult", OneExecutionStateStrategy.class);
            this.f22070a = loginErrorContainer;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.s0(this.f22070a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        g() {
            super("showEmptyTwoFactorCodeError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.Ic();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22073a;

        h(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f22073a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.k(this.f22073a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        i() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.i();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        j() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.g();
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        k() {
            super("showOTPTokenError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.G4();
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        l() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.d();
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {
        m() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.h();
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22080a;

        n(boolean z10) {
            super("updateConfirmButtonState", OneExecutionStateStrategy.class);
            this.f22080a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.t(this.f22080a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.auth.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22082a;

        o(String str) {
            super("updateInputFieldError", OneExecutionStateStrategy.class);
            this.f22082a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.auth.b bVar) {
            bVar.s(this.f22082a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void G4() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).G4();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void Ic() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).Ic();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void Q8(AuthenticationModel authenticationModel, String str) {
        e eVar = new e(authenticationModel, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).Q8(authenticationModel, str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void d() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).d();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void g() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).g();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void h() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).h();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void i() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).i();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void k(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).k(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void n() {
        C0343a c0343a = new C0343a();
        this.viewCommands.beforeApply(c0343a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).n();
        }
        this.viewCommands.afterApply(c0343a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void s(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).s(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void s0(LoginErrorContainer loginErrorContainer) {
        f fVar = new f(loginErrorContainer);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).s0(loginErrorContainer);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.auth.b
    public void t(boolean z10) {
        n nVar = new n(z10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.auth.b) it.next()).t(z10);
        }
        this.viewCommands.afterApply(nVar);
    }
}

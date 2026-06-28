package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends MvpViewState<b0> implements b0 {

    public class a extends ViewCommand<b0> {
        a() {
            super("clearPasswordInputField", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.j0();
        }
    }

    public class b extends ViewCommand<b0> {
        b() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.n();
        }
    }

    public class c extends ViewCommand<b0> {
        c() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.l();
        }
    }

    public class d extends ViewCommand<b0> {
        d() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.e();
        }
    }

    public class e extends ViewCommand<b0> {
        e() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.a();
        }
    }

    public class f extends ViewCommand<b0> {
        f() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.b();
        }
    }

    public class g extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AuthenticationModel f21645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21646b;

        g(AuthenticationModel authenticationModel, String str) {
            super("navigateToEmailApprovalScreen", OneExecutionStateStrategy.class);
            this.f21645a = authenticationModel;
            this.f21646b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.o0(this.f21645a, this.f21646b);
        }
    }

    public class h extends ViewCommand<b0> {
        h() {
            super("navigateToLogoutConfirmationScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.q();
        }
    }

    public class i extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AuthenticationModel f21650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21652d;

        i(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            super("navigateToResetPasswordScreen", OneExecutionStateStrategy.class);
            this.f21649a = i10;
            this.f21650b = authenticationModel;
            this.f21651c = z10;
            this.f21652d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.C9(this.f21649a, this.f21650b, this.f21651c, this.f21652d);
        }
    }

    public class j extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailAuthentication f21654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21655b;

        j(EmailAuthentication emailAuthentication, String str) {
            super("navigateToTwoFactorVerificationScreen", OneExecutionStateStrategy.class);
            this.f21654a = emailAuthentication;
            this.f21655b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.x1(this.f21654a, this.f21655b);
        }
    }

    public class k extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21657a;

        k(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f21657a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.k(this.f21657a);
        }
    }

    public class l extends ViewCommand<b0> {
        l() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.i();
        }
    }

    public class m extends ViewCommand<b0> {
        m() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.g();
        }
    }

    public class n extends ViewCommand<b0> {
        n() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.d();
        }
    }

    public class o extends ViewCommand<b0> {
        o() {
            super("showResetPasswordLinkSuccessfullySent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.P0();
        }
    }

    public class p extends ViewCommand<b0> {
        p() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.h();
        }
    }

    public class q extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21664a;

        q(boolean z10) {
            super("updateActionBarVisibility", AddToEndSingleStrategy.class);
            this.f21664a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.R(this.f21664a);
        }
    }

    public class r extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21666a;

        r(boolean z10) {
            super("updateLogoutButtonVisibility", AddToEndSingleStrategy.class);
            this.f21666a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.V2(this.f21666a);
        }
    }

    public class s extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21668a;

        s(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updatePasswordFieldError", OneExecutionStateStrategy.class);
            this.f21668a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.mc(this.f21668a);
        }
    }

    public class t extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21670a;

        t(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateShowThrottled", AddToEndSingleStrategy.class);
            this.f21670a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.j1(this.f21670a);
        }
    }

    public class u extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21672a;

        u(boolean z10) {
            super("updateUnlockButtonState", AddToEndSingleStrategy.class);
            this.f21672a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.b0(this.f21672a);
        }
    }

    public class v extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21674a;

        v(String str) {
            super("updateUsernameInfo", AddToEndSingleStrategy.class);
            this.f21674a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.dc(this.f21674a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void C9(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        i iVar = new i(i10, authenticationModel, z10, z11);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).C9(i10, authenticationModel, z10, z11);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void P0() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).P0();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void R(boolean z10) {
        q qVar = new q(z10);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).R(z10);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void V2(boolean z10) {
        r rVar = new r(z10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).V2(z10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void a() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void b0(boolean z10) {
        u uVar = new u(z10);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b0(z10);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void d() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).d();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void dc(String str) {
        v vVar = new v(str);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).dc(str);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void e() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).e();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void g() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).g();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void h() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).h();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void i() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).i();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void j0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).j0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void j1(com.server.auditor.ssh.client.help.a0 a0Var) {
        t tVar = new t(a0Var);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).j1(a0Var);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void k(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).k(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void l() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).l();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void mc(com.server.auditor.ssh.client.help.a0 a0Var) {
        s sVar = new s(a0Var);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).mc(a0Var);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void n() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).n();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void o0(AuthenticationModel authenticationModel, String str) {
        g gVar = new g(authenticationModel, str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).o0(authenticationModel, str);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void q() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).q();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b0
    public void x1(EmailAuthentication emailAuthentication, String str) {
        j jVar = new j(emailAuthentication, str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).x1(emailAuthentication, str);
        }
        this.viewCommands.afterApply(jVar);
    }
}

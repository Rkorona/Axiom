package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.fragments.loginregistration.LoginErrorContainer;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class i0 extends MvpViewState<j0> implements j0 {

    public class a extends ViewCommand<j0> {
        a() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.n();
        }
    }

    public class b extends ViewCommand<j0> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.e();
        }
    }

    public class c extends ViewCommand<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21912a;

        c(String str) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f21912a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.u(this.f21912a);
        }
    }

    public class d extends ViewCommand<j0> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.b();
        }
    }

    public class e extends ViewCommand<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailAuthentication f21915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21916b;

        e(EmailAuthentication emailAuthentication, String str) {
            super("navigateToTwoFactorAuthScreen", OneExecutionStateStrategy.class);
            this.f21915a = emailAuthentication;
            this.f21916b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.ae(this.f21915a, this.f21916b);
        }
    }

    public class f extends ViewCommand<j0> {
        f() {
            super("openContactSupportWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.d1();
        }
    }

    public class g extends ViewCommand<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoginErrorContainer f21919a;

        g(LoginErrorContainer loginErrorContainer) {
            super("setErrorModelResult", OneExecutionStateStrategy.class);
            this.f21919a = loginErrorContainer;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.s0(this.f21919a);
        }
    }

    public class h extends ViewCommand<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21921a;

        h(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showErrorMessagePopup", OneExecutionStateStrategy.class);
            this.f21921a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.ve(this.f21921a);
        }
    }

    public class i extends ViewCommand<j0> {
        i() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.g();
        }
    }

    public class j extends ViewCommand<j0> {
        j() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j0 j0Var) {
            j0Var.d();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void ae(EmailAuthentication emailAuthentication, String str) {
        e eVar = new e(emailAuthentication, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).ae(emailAuthentication, str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void d() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).d();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void d1() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).d1();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void g() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).g();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void n() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).n();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void s0(LoginErrorContainer loginErrorContainer) {
        g gVar = new g(loginErrorContainer);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).s0(loginErrorContainer);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void u(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).u(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j0
    public void ve(com.server.auditor.ssh.client.help.a0 a0Var) {
        h hVar = new h(a0Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).ve(a0Var);
        }
        this.viewCommands.afterApply(hVar);
    }
}

package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class k extends MvpViewState<com.server.auditor.ssh.client.contracts.account.l> implements com.server.auditor.ssh.client.contracts.account.l {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        a() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.l();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.e();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21927a;

        c(String str) {
            super("initView", AddToEndSingleStrategy.class);
            this.f21927a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.e0(this.f21927a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.b();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnterpriseSingleSignOnAuthentication f21931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21933d;

        e(int i10, EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, boolean z10, boolean z11) {
            super("navigateToSignInEnterPasswordScreen", OneExecutionStateStrategy.class);
            this.f21930a = i10;
            this.f21931b = enterpriseSingleSignOnAuthentication;
            this.f21932c = z10;
            this.f21933d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.z8(this.f21930a, this.f21931b, this.f21932c, this.f21933d);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21935a;

        f(String str) {
            super("showEnterpriseSingleSignOnWebView", OneExecutionStateStrategy.class);
            this.f21935a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.a2(this.f21935a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        g() {
            super("showEnterpriseUserNotExist", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.s2();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        h() {
            super("showEnterpriseUserNotMigrated", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.I1();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21939a;

        i(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f21939a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.k(this.f21939a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        j() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.i();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.account.k$k, reason: collision with other inner class name */
    public class C0342k extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        C0342k() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.g();
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        l() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.d();
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21944a;

        m(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f21944a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.m(this.f21944a);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {
        n() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.h();
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21947a;

        o(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateEmailInputFieldError", OneExecutionStateStrategy.class);
            this.f21947a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.C(this.f21947a);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.account.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21949a;

        p(int i10) {
            super("updateViewsForFeature", AddToEndSingleStrategy.class);
            this.f21949a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.l lVar) {
            lVar.z(this.f21949a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        o oVar = new o(a0Var);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).C(a0Var);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void I1() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).I1();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void a2(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).a2(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void d() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).d();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void e0(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).e0(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void g() {
        C0342k c0342k = new C0342k();
        this.viewCommands.beforeApply(c0342k);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).g();
        }
        this.viewCommands.afterApply(c0342k);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void h() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).h();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void i() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).i();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void k(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).k(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void l() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).l();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void m(int i10) {
        m mVar = new m(i10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).m(i10);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void s2() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).s2();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void z(int i10) {
        p pVar = new p(i10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).z(i10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.l
    public void z8(int i10, EnterpriseSingleSignOnAuthentication enterpriseSingleSignOnAuthentication, boolean z10, boolean z11) {
        e eVar = new e(i10, enterpriseSingleSignOnAuthentication, z10, z11);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.l) it.next()).z8(i10, enterpriseSingleSignOnAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(eVar);
    }
}

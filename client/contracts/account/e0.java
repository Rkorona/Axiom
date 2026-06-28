package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e0 extends MvpViewState<f0> implements f0 {

    public class a extends ViewCommand<f0> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.f();
        }
    }

    public class b extends ViewCommand<f0> {
        b() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.l();
        }
    }

    public class c extends ViewCommand<f0> {
        c() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.e();
        }
    }

    public class d extends ViewCommand<f0> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.a();
        }
    }

    public class e extends ViewCommand<f0> {
        e() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.b();
        }
    }

    public class f extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f21821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21823d;

        f(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToAlreadyHaveAnAccountScreen", OneExecutionStateStrategy.class);
            this.f21820a = i10;
            this.f21821b = emailAuthentication;
            this.f21822c = z10;
            this.f21823d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.Id(this.f21820a, this.f21821b, this.f21822c, this.f21823d);
        }
    }

    public class g extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f21826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21828d;

        g(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToESSOScreen", OneExecutionStateStrategy.class);
            this.f21825a = i10;
            this.f21826b = emailAuthentication;
            this.f21827c = z10;
            this.f21828d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.C1(this.f21825a, this.f21826b, this.f21827c, this.f21828d);
        }
    }

    public class h extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f21831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21833d;

        h(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToSetupPasswordScreen", OneExecutionStateStrategy.class);
            this.f21830a = i10;
            this.f21831b = emailAuthentication;
            this.f21832c = z10;
            this.f21833d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.t0(this.f21830a, this.f21831b, this.f21832c, this.f21833d);
        }
    }

    public class i extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21837c;

        i(int i10, boolean z10, boolean z11) {
            super("navigateToSignInChooserScreen", OneExecutionStateStrategy.class);
            this.f21835a = i10;
            this.f21836b = z10;
            this.f21837c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.N(this.f21835a, this.f21836b, this.f21837c);
        }
    }

    public class j extends ViewCommand<f0> {
        j() {
            super("openPrivacyPolicyWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.v0();
        }
    }

    public class k extends ViewCommand<f0> {
        k() {
            super("openTermsOfServiceWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.V1();
        }
    }

    public class l extends ViewCommand<f0> {
        l() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.i();
        }
    }

    public class m extends ViewCommand<f0> {
        m() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.d();
        }
    }

    public class n extends ViewCommand<f0> {
        n() {
            super("showReCaptcha", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.D();
        }
    }

    public class o extends ViewCommand<f0> {
        o() {
            super("showReCaptchaError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.F();
        }
    }

    public class p extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21845a;

        p(boolean z10) {
            super("updateContinueButtonEnabled", AddToEndSingleStrategy.class);
            this.f21845a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.P(this.f21845a);
        }
    }

    public class q extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21847a;

        q(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateEmailInputFieldError", OneExecutionStateStrategy.class);
            this.f21847a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.C(this.f21847a);
        }
    }

    public class r extends ViewCommand<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21849a;

        r(int i10) {
            super("updateViewsForFeature", AddToEndSingleStrategy.class);
            this.f21849a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f0 f0Var) {
            f0Var.z(this.f21849a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        q qVar = new q(a0Var);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).C(a0Var);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void C1(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        g gVar = new g(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).C1(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void D() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).D();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void F() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).F();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void Id(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        f fVar = new f(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).Id(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void N(int i10, boolean z10, boolean z11) {
        i iVar = new i(i10, z10, z11);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).N(i10, z10, z11);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void P(boolean z10) {
        p pVar = new p(z10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).P(z10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void V1() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).V1();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void b() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void d() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void e() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).e();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void i() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).i();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void l() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).l();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void t0(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        h hVar = new h(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).t0(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void v0() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).v0();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f0
    public void z(int i10) {
        r rVar = new r(i10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).z(i10);
        }
        this.viewCommands.afterApply(rVar);
    }
}

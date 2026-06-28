package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class y extends MvpViewState<z> implements z {

    public class a extends ViewCommand<z> {
        a() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.l();
        }
    }

    public class b extends ViewCommand<z> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.e();
        }
    }

    public class c extends ViewCommand<z> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.a();
        }
    }

    public class d extends ViewCommand<z> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.b();
        }
    }

    public class e extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f22039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22041d;

        e(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToESSOScreen", OneExecutionStateStrategy.class);
            this.f22038a = i10;
            this.f22039b = emailAuthentication;
            this.f22040c = z10;
            this.f22041d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.C1(this.f22038a, this.f22039b, this.f22040c, this.f22041d);
        }
    }

    public class f extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f22044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22046d;

        f(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToSetupPasswordScreen", OneExecutionStateStrategy.class);
            this.f22043a = i10;
            this.f22044b = emailAuthentication;
            this.f22045c = z10;
            this.f22046d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.t0(this.f22043a, this.f22044b, this.f22045c, this.f22046d);
        }
    }

    public class g extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailAuthentication f22049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22051d;

        g(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
            super("navigateToSignInEnterPasswordScreen", OneExecutionStateStrategy.class);
            this.f22048a = i10;
            this.f22049b = emailAuthentication;
            this.f22050c = z10;
            this.f22051d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.L3(this.f22048a, this.f22049b, this.f22050c, this.f22051d);
        }
    }

    public class h extends ViewCommand<z> {
        h() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.i();
        }
    }

    public class i extends ViewCommand<z> {
        i() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.d();
        }
    }

    public class j extends ViewCommand<z> {
        j() {
            super("showReCaptcha", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.D();
        }
    }

    public class k extends ViewCommand<z> {
        k() {
            super("showReCaptchaError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.F();
        }
    }

    public class l extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22057a;

        l(boolean z10) {
            super("updateContinueButtonEnabled", AddToEndSingleStrategy.class);
            this.f22057a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.P(this.f22057a);
        }
    }

    public class m extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22059a;

        m(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateEmailInputFieldError", OneExecutionStateStrategy.class);
            this.f22059a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.C(this.f22059a);
        }
    }

    public class n extends ViewCommand<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22061a;

        n(int i10) {
            super("updateViewsForFeature", AddToEndSingleStrategy.class);
            this.f22061a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z zVar) {
            zVar.z(this.f22061a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void C(com.server.auditor.ssh.client.help.a0 a0Var) {
        m mVar = new m(a0Var);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).C(a0Var);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void C1(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        e eVar = new e(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).C1(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void D() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).D();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void F() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).F();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void L3(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        g gVar = new g(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).L3(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void P(boolean z10) {
        l lVar = new l(z10);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).P(z10);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void d() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).d();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void i() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).i();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void l() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).l();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void t0(int i10, EmailAuthentication emailAuthentication, boolean z10, boolean z11) {
        f fVar = new f(i10, emailAuthentication, z10, z11);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).t0(i10, emailAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.z
    public void z(int i10) {
        n nVar = new n(i10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z) it.next()).z(i10);
        }
        this.viewCommands.afterApply(nVar);
    }
}

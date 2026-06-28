package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.b> implements com.server.auditor.ssh.client.contracts.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.a$a, reason: collision with other inner class name */
    public class C0339a extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        C0339a() {
            super("clearErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.qa();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        b() {
            super("copyDownloadLink", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.K0();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        c() {
            super("finishFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.p();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.a();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        e() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.b();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21604a;

        f(String str) {
            super("showErrorMessage", OneExecutionStateStrategy.class);
            this.f21604a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.showErrorMessage(this.f21604a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        g() {
            super("showNetworkErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.n0();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {
        h() {
            super("showUnknownErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.s9();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f21608a;

        i(ProgressButton.b bVar) {
            super("updateCopyDownloadLinkButtonState", OneExecutionStateStrategy.class);
            this.f21608a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.T0(this.f21608a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f21610a;

        j(ProgressButton.b bVar) {
            super("updateSendLinkViaEmailButtonState", OneExecutionStateStrategy.class);
            this.f21610a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.b bVar) {
            bVar.wd(this.f21610a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void K0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).K0();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void T0(ProgressButton.b bVar) {
        i iVar = new i(bVar);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).T0(bVar);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void b() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).b();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void n0() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).n0();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void p() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).p();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void qa() {
        C0339a c0339a = new C0339a();
        this.viewCommands.beforeApply(c0339a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).qa();
        }
        this.viewCommands.afterApply(c0339a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void s9() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).s9();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void showErrorMessage(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).showErrorMessage(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b
    public void wd(ProgressButton.b bVar) {
        j jVar = new j(bVar);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.b) it.next()).wd(bVar);
        }
        this.viewCommands.afterApply(jVar);
    }
}

package com.server.auditor.ssh.client.contracts.views;

import com.server.auditor.ssh.client.presenters.QuickImportDesktopPromoScreenPresenter;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.views.b> implements com.server.auditor.ssh.client.contracts.views.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.a$a, reason: collision with other inner class name */
    public class C0372a extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {
        C0372a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.f();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {
        b() {
            super("copyDownloadLink", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.K0();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.a();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f23322a;

        d(ProgressButton.b bVar) {
            super("updateCopyDownloadLinkButtonState", OneExecutionStateStrategy.class);
            this.f23322a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.T0(this.f23322a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QuickImportDesktopPromoScreenPresenter.b f23324a;

        e(QuickImportDesktopPromoScreenPresenter.b bVar) {
            super("updateErrorMessage", OneExecutionStateStrategy.class);
            this.f23324a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.sd(this.f23324a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.views.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f23326a;

        f(ProgressButton.b bVar) {
            super("updateGetLinkViaEmailButtonState", OneExecutionStateStrategy.class);
            this.f23326a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.b bVar) {
            bVar.x4(this.f23326a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void K0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).K0();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void T0(ProgressButton.b bVar) {
        d dVar = new d(bVar);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).T0(bVar);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void f() {
        C0372a c0372a = new C0372a();
        this.viewCommands.beforeApply(c0372a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).f();
        }
        this.viewCommands.afterApply(c0372a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void sd(QuickImportDesktopPromoScreenPresenter.b bVar) {
        e eVar = new e(bVar);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).sd(bVar);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.b
    public void x4(ProgressButton.b bVar) {
        f fVar = new f(bVar);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.b) it.next()).x4(bVar);
        }
        this.viewCommands.afterApply(fVar);
    }
}

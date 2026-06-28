package com.server.auditor.ssh.client.contracts.account;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.account.b> implements com.server.auditor.ssh.client.contracts.account.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.account.a$a, reason: collision with other inner class name */
    public class C0340a extends ViewCommand<com.server.auditor.ssh.client.contracts.account.b> {
        C0340a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.b bVar) {
            bVar.a();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.account.b> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.account.b bVar) {
            bVar.b();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b
    public void a() {
        C0340a c0340a = new C0340a();
        this.viewCommands.beforeApply(c0340a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.b) it.next()).a();
        }
        this.viewCommands.afterApply(c0340a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.b
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.account.b) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }
}

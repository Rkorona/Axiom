package com.server.auditor.ssh.client.contracts.teamtrial;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.teamtrial.b> implements com.server.auditor.ssh.client.contracts.teamtrial.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.teamtrial.a$a, reason: collision with other inner class name */
    public class C0362a extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.b> {
        C0362a() {
            super("cancelTrialExtension", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.b bVar) {
            bVar.Sd();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.b> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.b bVar) {
            bVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.b> {
        c() {
            super("retryLastRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.b bVar) {
            bVar.H();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.b
    public void H() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.b) it.next()).H();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.b
    public void Sd() {
        C0362a c0362a = new C0362a();
        this.viewCommands.beforeApply(c0362a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.b) it.next()).Sd();
        }
        this.viewCommands.afterApply(c0362a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.b
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.b) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }
}

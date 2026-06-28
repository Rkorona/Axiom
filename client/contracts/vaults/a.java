package com.server.auditor.ssh.client.contracts.vaults;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.vaults.b> implements com.server.auditor.ssh.client.contracts.vaults.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.vaults.a$a, reason: collision with other inner class name */
    public class C0368a extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f23289a;

        C0368a(Long l10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f23289a = l10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.b bVar) {
            bVar.h3(this.f23289a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.b> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.b bVar) {
            bVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.b> {
        c() {
            super("showSuccessUI", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.b bVar) {
            bVar.jd();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.b) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void h3(Long l10) {
        C0368a c0368a = new C0368a(l10);
        this.viewCommands.beforeApply(c0368a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.b) it.next()).h3(l10);
        }
        this.viewCommands.afterApply(c0368a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.b
    public void jd() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.b) it.next()).jd();
        }
        this.viewCommands.afterApply(cVar);
    }
}

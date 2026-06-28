package com.server.auditor.ssh.client.contracts.vaults;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.vaults.d> implements com.server.auditor.ssh.client.contracts.vaults.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.d> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.d dVar) {
            dVar.f();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.d> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.d dVar) {
            dVar.a();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.vaults.c$c, reason: collision with other inner class name */
    public class C0369c extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23295a;

        C0369c(String str) {
            super("navigateToPortForwardingConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f23295a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.d dVar) {
            dVar.Bb(this.f23295a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23297a;

        d(String str) {
            super("navigateToProcessConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f23297a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.d dVar) {
            dVar.Rd(this.f23297a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void Bb(String str) {
        C0369c c0369c = new C0369c(str);
        this.viewCommands.beforeApply(c0369c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.d) it.next()).Bb(str);
        }
        this.viewCommands.afterApply(c0369c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void Rd(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.d) it.next()).Rd(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.d) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.d
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.d) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }
}

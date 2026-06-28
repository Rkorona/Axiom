package com.server.auditor.ssh.client.contracts.vaults;

import dq.w;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class g extends MvpViewState<com.server.auditor.ssh.client.contracts.vaults.h> implements com.server.auditor.ssh.client.contracts.vaults.h {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        a() {
            super("closeScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.r1();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        c() {
            super("onNotifyMakeCopyOfSharedSnippetRequested", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.E3();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.a f23309a;

        d(qq.a aVar) {
            super("onNotifyVaultSelected", OneExecutionStateStrategy.class);
            this.f23309a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.Ja(this.f23309a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23311a;

        e(boolean z10) {
            super("onUpdateDoneButtonState", AddToEndSingleStrategy.class);
            this.f23311a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.eb(this.f23311a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        f() {
            super("showBusinessVaultsPromoFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.me();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.vaults.g$g, reason: collision with other inner class name */
    public class C0371g extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        C0371g() {
            super("showSuccessScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.Z2();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        h() {
            super("showUpgradeToTeamPromoScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.t4();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {
        i() {
            super("showVaultCreationWebPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.t3();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends w> f23317a;

        j(List<? extends w> list) {
            super("updateVaultContainers", AddToEndSingleStrategy.class);
            this.f23317a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.h hVar) {
            hVar.y7(this.f23317a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void E3() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).E3();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void Ja(qq.a aVar) {
        d dVar = new d(aVar);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).Ja(aVar);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void Z2() {
        C0371g c0371g = new C0371g();
        this.viewCommands.beforeApply(c0371g);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).Z2();
        }
        this.viewCommands.afterApply(c0371g);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void eb(boolean z10) {
        e eVar = new e(z10);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).eb(z10);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void me() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).me();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void r1() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).r1();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void t3() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).t3();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void t4() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).t4();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.h
    public void y7(List<? extends w> list) {
        j jVar = new j(list);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.h) it.next()).y7(list);
        }
        this.viewCommands.afterApply(jVar);
    }
}

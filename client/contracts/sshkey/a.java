package com.server.auditor.ssh.client.contracts.sshkey;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.sshkey.b> implements com.server.auditor.ssh.client.contracts.sshkey.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.sshkey.a$a, reason: collision with other inner class name */
    public class C0354a extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {
        C0354a() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.c();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {
        b() {
            super("navigateUpWithCancel", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.z1();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {
        c() {
            super("resetErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.tc();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22925a;

        d(String str) {
            super("saveWithResult", OneExecutionStateStrategy.class);
            this.f22925a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.c5(this.f22925a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {
        e() {
            super("showEmptyClipboardError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.K2();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {
        f() {
            super("showErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.y2();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22929a;

        g(String str) {
            super("updateCertificateTextOnOpen", OneExecutionStateStrategy.class);
            this.f22929a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.a8(this.f22929a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22931a;

        h(boolean z10) {
            super("updateValidateSaveButtonsState", AddToEndSingleStrategy.class);
            this.f22931a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.b bVar) {
            bVar.F0(this.f22931a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void F0(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).F0(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void K2() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).K2();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void a8(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).a8(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void c() {
        C0354a c0354a = new C0354a();
        this.viewCommands.beforeApply(c0354a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).c();
        }
        this.viewCommands.afterApply(c0354a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void c5(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).c5(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void tc() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).tc();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void y2() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).y2();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.b
    public void z1() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.b) it.next()).z1();
        }
        this.viewCommands.afterApply(bVar);
    }
}

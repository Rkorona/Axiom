package com.server.auditor.ssh.client.contracts.sshkey;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class i extends MvpViewState<com.server.auditor.ssh.client.contracts.sshkey.j> implements com.server.auditor.ssh.client.contracts.sshkey.j {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        a() {
            super("clearPrivateKeyError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.Da();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        b() {
            super("dismissProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.g0();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        c() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.c();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        d() {
            super("navigateUpWithCancel", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.z1();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23084b;

        e(String str, String str2) {
            super("saveWithResult", OneExecutionStateStrategy.class);
            this.f23083a = str;
            this.f23084b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.Vd(this.f23083a, this.f23084b);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        f() {
            super("showEmptyClipboardError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.K2();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        g() {
            super("showProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.A();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        h() {
            super("updateDialogGeneration", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.Ba();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.sshkey.i$i, reason: collision with other inner class name */
    public class C0358i extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {
        C0358i() {
            super("updatePrivateKeyError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.n9();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23090a;

        j(String str) {
            super("updatePrivateKeyTextOnOpen", OneExecutionStateStrategy.class);
            this.f23090a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.od(this.f23090a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23092a;

        k(boolean z10) {
            super("updateValidateSaveButtonsState", AddToEndSingleStrategy.class);
            this.f23092a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.j jVar) {
            jVar.F0(this.f23092a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void A() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).A();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Ba() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).Ba();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Da() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).Da();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void F0(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).F0(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void K2() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).K2();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void Vd(String str, String str2) {
        e eVar = new e(str, str2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).Vd(str, str2);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void c() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).c();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void g0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).g0();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void n9() {
        C0358i c0358i = new C0358i();
        this.viewCommands.beforeApply(c0358i);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).n9();
        }
        this.viewCommands.afterApply(c0358i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void od(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).od(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.j
    public void z1() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.j) it.next()).z1();
        }
        this.viewCommands.afterApply(dVar);
    }
}

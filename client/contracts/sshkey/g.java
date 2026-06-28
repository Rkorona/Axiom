package com.server.auditor.ssh.client.contracts.sshkey;

import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class g extends MvpViewState<com.server.auditor.ssh.client.contracts.sshkey.h> implements com.server.auditor.ssh.client.contracts.sshkey.h {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {
        a() {
            super("dismissProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.g0();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.c();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditKeyData f23064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23065b;

        c(EditKeyData editKeyData, String str) {
            super("navigateToKeyEdit", OneExecutionStateStrategy.class);
            this.f23064a = editKeyData;
            this.f23065b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.O7(this.f23064a, this.f23065b);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {
        d() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.j();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {
        e() {
            super("showErrorMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.y2();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {
        f() {
            super("showProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.A();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.sshkey.g$g, reason: collision with other inner class name */
    public class C0357g extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23070a;

        C0357g(boolean z10) {
            super("updateEdRoundsVisibility", AddToEndSingleStrategy.class);
            this.f23070a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.J8(this.f23070a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u9.a f23072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer[] f23073b;

        h(u9.a aVar, Integer[] numArr) {
            super("updateKeySizeSpinner", AddToEndSingleStrategy.class);
            this.f23072a = aVar;
            this.f23073b = numArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.Pb(this.f23072a, this.f23073b);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23075a;

        i(boolean z10) {
            super("updatePassphraseRevealState", OneExecutionStateStrategy.class);
            this.f23075a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.Me(this.f23075a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23077a;

        j(boolean z10) {
            super("updateSavePassphraseIsEnabled", AddToEndSingleStrategy.class);
            this.f23077a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.h hVar) {
            hVar.Ue(this.f23077a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void A() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).A();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void J8(boolean z10) {
        C0357g c0357g = new C0357g(z10);
        this.viewCommands.beforeApply(c0357g);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).J8(z10);
        }
        this.viewCommands.afterApply(c0357g);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void Me(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).Me(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void O7(EditKeyData editKeyData, String str) {
        c cVar = new c(editKeyData, str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).O7(editKeyData, str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void Pb(u9.a aVar, Integer[] numArr) {
        h hVar = new h(aVar, numArr);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).Pb(aVar, numArr);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void Ue(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).Ue(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void g0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).g0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void j() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).j();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.h
    public void y2() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.h) it.next()).y2();
        }
        this.viewCommands.afterApply(eVar);
    }
}

package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class i extends MvpViewState<j> implements j {

    public class a extends ViewCommand<j> {
        a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.a();
        }
    }

    public class b extends ViewCommand<j> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.b();
        }
    }

    public class c extends ViewCommand<j> {
        c() {
            super("navigateToBackUpAndSyncDesktopPromoScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.Nd();
        }
    }

    public class d extends ViewCommand<j> {
        d() {
            super("navigateToBackUpAndSyncLoadingScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.n6();
        }
    }

    public class e extends ViewCommand<j> {
        e() {
            super("navigateToChoosePlanScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.o();
        }
    }

    public class f extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22334a;

        f(boolean z10) {
            super("navigateToCreateAccountScreen", OneExecutionStateStrategy.class);
            this.f22334a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.p6(this.f22334a);
        }
    }

    public class g extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22336a;

        g(boolean z10) {
            super("updateSyncIdentitiesStatusVisibility", AddToEndSingleStrategy.class);
            this.f22336a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.re(this.f22336a);
        }
    }

    public class h extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22338a;

        h(boolean z10) {
            super("updateSyncKeysAndPasswordsCheckboxStatus", OneExecutionStateStrategy.class);
            this.f22338a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.H9(this.f22338a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.i$i, reason: collision with other inner class name */
    public class C0347i extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22340a;

        C0347i(boolean z10) {
            super("updateSyncSSHKeysStatusVisibility", AddToEndSingleStrategy.class);
            this.f22340a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.h8(this.f22340a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void H9(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).H9(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void Nd() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).Nd();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void h8(boolean z10) {
        C0347i c0347i = new C0347i(z10);
        this.viewCommands.beforeApply(c0347i);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).h8(z10);
        }
        this.viewCommands.afterApply(c0347i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void n6() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).n6();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void o() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).o();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void p6(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).p6(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.j
    public void re(boolean z10) {
        g gVar = new g(z10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).re(z10);
        }
        this.viewCommands.afterApply(gVar);
    }
}

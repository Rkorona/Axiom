package com.server.auditor.ssh.client.contracts.vaults;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.vaults.f> implements com.server.auditor.ssh.client.contracts.vaults.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.f();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {
        c() {
            super("setCloseBehaviorForBackButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.K6();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {
        d() {
            super("setUsualBehaviorForBackButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.Q4();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.vaults.e$e, reason: collision with other inner class name */
    public class C0370e extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {
        C0370e() {
            super("showPreviousScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.K3();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.vaults.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23304a;

        f(String str) {
            super("showProcessingScreen", OneExecutionStateStrategy.class);
            this.f23304a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.vaults.f fVar) {
            fVar.Ed(this.f23304a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void Ed(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).Ed(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void K3() {
        C0370e c0370e = new C0370e();
        this.viewCommands.beforeApply(c0370e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).K3();
        }
        this.viewCommands.afterApply(c0370e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void K6() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).K6();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void Q4() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).Q4();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.vaults.f
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.vaults.f) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }
}

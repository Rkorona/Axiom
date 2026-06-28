package com.server.auditor.ssh.client.contracts.sshkey;

import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.models.Host;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.sshkey.f> implements com.server.auditor.ssh.client.contracts.sshkey.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {
        a() {
            super("dismissProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.O3();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {
        b() {
            super("finishFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.p();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Host f23055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<? extends TagDBModel> f23056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<? extends TagHostDBModel> f23057c;

        c(Host host, List<? extends TagDBModel> list, List<? extends TagHostDBModel> list2) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f23055a = host;
            this.f23056b = list;
            this.f23057c = list2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.v4(this.f23055a, this.f23056b, this.f23057c);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {
        d() {
            super("navigateToHostSelector", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.b9();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.sshkey.e$e, reason: collision with other inner class name */
    public class C0356e extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {
        C0356e() {
            super("showFailedExportToast", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.i3();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.f> {
        f() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.f fVar) {
            fVar.d();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void O3() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).O3();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void b9() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).b9();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void d() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).d();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void i3() {
        C0356e c0356e = new C0356e();
        this.viewCommands.beforeApply(c0356e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).i3();
        }
        this.viewCommands.afterApply(c0356e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void p() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).p();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.f
    public void v4(Host host, List<? extends TagDBModel> list, List<? extends TagHostDBModel> list2) {
        c cVar = new c(host, list, list2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.f) it.next()).v4(host, list, list2);
        }
        this.viewCommands.afterApply(cVar);
    }
}

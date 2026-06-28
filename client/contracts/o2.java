package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class o2 extends MvpViewState<p2> implements p2 {

    public class a extends ViewCommand<p2> {
        a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p2 p2Var) {
            p2Var.a();
        }
    }

    public class b extends ViewCommand<p2> {
        b() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p2 p2Var) {
            p2Var.j();
        }
    }

    public class c extends ViewCommand<p2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22618b;

        c(String str, long j10) {
            super("showEnterPasswordScreen", OneExecutionStateStrategy.class);
            this.f22617a = str;
            this.f22618b = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p2 p2Var) {
            p2Var.S2(this.f22617a, this.f22618b);
        }
    }

    public class d extends ViewCommand<p2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.server.auditor.ssh.client.models.x> f22620a;

        d(List<com.server.auditor.ssh.client.models.x> list) {
            super("updateProvidersList", OneExecutionStateStrategy.class);
            this.f22620a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p2 p2Var) {
            p2Var.M3(this.f22620a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.p2
    public void M3(List<com.server.auditor.ssh.client.models.x> list) {
        d dVar = new d(list);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).M3(list);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.p2
    public void S2(String str, long j10) {
        c cVar = new c(str, j10);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).S2(str, j10);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).a();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).j();
        }
        this.viewCommands.afterApply(bVar);
    }
}

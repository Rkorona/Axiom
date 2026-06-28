package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class r0 extends MvpViewState<s0> implements s0 {

    public class a extends ViewCommand<s0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22878a;

        a(int i10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f22878a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(s0 s0Var) {
            s0Var.x(this.f22878a);
        }
    }

    public class b extends ViewCommand<s0> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(s0 s0Var) {
            s0Var.c();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.s0
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.s0
    public void x(int i10) {
        a aVar = new a(i10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).x(i10);
        }
        this.viewCommands.afterApply(aVar);
    }
}

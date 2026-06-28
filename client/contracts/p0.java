package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class p0 extends MvpViewState<q0> implements q0 {

    public class a extends ViewCommand<q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22679a;

        a(int i10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f22679a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q0 q0Var) {
            q0Var.x(this.f22679a);
        }
    }

    public class b extends ViewCommand<q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionPeriodInfo f22681a;

        b(SubscriptionPeriodInfo subscriptionPeriodInfo) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f22681a = subscriptionPeriodInfo;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q0 q0Var) {
            q0Var.fa(this.f22681a);
        }
    }

    public class c extends ViewCommand<q0> {
        c() {
            super("startAnimation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(q0 q0Var) {
            q0Var.N1();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q0
    public void N1() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).N1();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q0
    public void fa(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        b bVar = new b(subscriptionPeriodInfo);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).fa(subscriptionPeriodInfo);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q0
    public void x(int i10) {
        a aVar = new a(i10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).x(i10);
        }
        this.viewCommands.afterApply(aVar);
    }
}

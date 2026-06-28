package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.SubscriptionPeriodInfo;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class d1 extends MvpViewState<e1> implements e1 {

    public class a extends ViewCommand<e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22157a;

        a(int i10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f22157a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e1 e1Var) {
            e1Var.x(this.f22157a);
        }
    }

    public class b extends ViewCommand<e1> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e1 e1Var) {
            e1Var.c();
        }
    }

    public class c extends ViewCommand<e1> {
        c() {
            super("navigateToAuthenticationFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e1 e1Var) {
            e1Var.Nc();
        }
    }

    public class d extends ViewCommand<e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionPeriodInfo f22161a;

        d(SubscriptionPeriodInfo subscriptionPeriodInfo) {
            super("navigateToEnabledOpenAiAngGotTrialScreen", OneExecutionStateStrategy.class);
            this.f22161a = subscriptionPeriodInfo;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e1 e1Var) {
            e1Var.y6(this.f22161a);
        }
    }

    public class e extends ViewCommand<e1> {
        e() {
            super("navigateToEnabledOpenAiScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e1 e1Var) {
            e1Var.W2();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e1
    public void Nc() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).Nc();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e1
    public void W2() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).W2();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e1
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e1
    public void x(int i10) {
        a aVar = new a(i10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).x(i10);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e1
    public void y6(SubscriptionPeriodInfo subscriptionPeriodInfo) {
        d dVar = new d(subscriptionPeriodInfo);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).y6(subscriptionPeriodInfo);
        }
        this.viewCommands.afterApply(dVar);
    }
}

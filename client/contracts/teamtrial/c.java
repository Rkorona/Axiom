package com.server.auditor.ssh.client.contracts.teamtrial;

import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.teamtrial.d> implements com.server.auditor.ssh.client.contracts.teamtrial.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23149a;

        a(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("initView", AddToEndSingleStrategy.class);
            this.f23149a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.d dVar) {
            dVar.D1(this.f23149a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.d> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.d dVar) {
            dVar.b();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.teamtrial.c$c, reason: collision with other inner class name */
    public class C0363c extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23152a;

        C0363c(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToChoosePlanScreenAndBuyProSubscription", OneExecutionStateStrategy.class);
            this.f23152a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.d dVar) {
            dVar.n2(this.f23152a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23154a;

        d(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToTeamDeactivationProgressScreen", OneExecutionStateStrategy.class);
            this.f23154a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.d dVar) {
            dVar.W(this.f23154a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23156a;

        e(String str) {
            super("openPurchaseTeamPlanSitePage", OneExecutionStateStrategy.class);
            this.f23156a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.d dVar) {
            dVar.a0(this.f23156a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void D1(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        a aVar = new a(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.d) it.next()).D1(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        d dVar = new d(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.d) it.next()).W(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void a0(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.d) it.next()).a0(str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.d) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.d
    public void n2(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        C0363c c0363c = new C0363c(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(c0363c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.d) it.next()).n2(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(c0363c);
    }
}

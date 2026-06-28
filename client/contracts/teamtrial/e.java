package com.server.auditor.ssh.client.contracts.teamtrial;

import com.server.auditor.ssh.client.models.EndOfTeamTrialTargetAction;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.teamtrial.f> implements com.server.auditor.ssh.client.contracts.teamtrial.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.f();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23159a;

        b(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("initView", AddToEndSingleStrategy.class);
            this.f23159a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.D1(this.f23159a);
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.b();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23162a;

        d(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToChoosePlanScreenAndBuyProSubscription", OneExecutionStateStrategy.class);
            this.f23162a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.n2(this.f23162a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.teamtrial.e$e, reason: collision with other inner class name */
    public class C0364e extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {
        C0364e() {
            super("navigateToOopsScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.q0();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23165a;

        f(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToRemoveTeamMembersConfirmationScreen", OneExecutionStateStrategy.class);
            this.f23165a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.A0(this.f23165a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EndOfTeamTrialTargetAction f23167a;

        g(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
            super("navigateToTeamDeactivationProgressScreen", OneExecutionStateStrategy.class);
            this.f23167a = endOfTeamTrialTargetAction;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.W(this.f23167a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.teamtrial.f> {
        h() {
            super("navigateToTeamTrialExtensionScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.teamtrial.f fVar) {
            fVar.B6();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void A0(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        f fVar = new f(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).A0(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void B6() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).B6();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void D1(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        b bVar = new b(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).D1(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void W(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        g gVar = new g(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).W(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void n2(EndOfTeamTrialTargetAction endOfTeamTrialTargetAction) {
        d dVar = new d(endOfTeamTrialTargetAction);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).n2(endOfTeamTrialTargetAction);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.teamtrial.f
    public void q0() {
        C0364e c0364e = new C0364e();
        this.viewCommands.beforeApply(c0364e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.teamtrial.f) it.next()).q0();
        }
        this.viewCommands.afterApply(c0364e);
    }
}

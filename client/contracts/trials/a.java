package com.server.auditor.ssh.client.contracts.trials;

import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.trials.b> implements com.server.auditor.ssh.client.contracts.trials.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.trials.a$a, reason: collision with other inner class name */
    public class C0365a extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeamMemberInvitation f23173a;

        C0365a(TeamMemberInvitation teamMemberInvitation) {
            super("addAnotherEmailInputField", AddToEndStrategy.class);
            this.f23173a = teamMemberInvitation;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.i0(this.f23173a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {
        b() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.f();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.a();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.b();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<TeamMemberInvitation> f23179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23180c;

        e(boolean z10, List<TeamMemberInvitation> list, boolean z11) {
            super("navigateToCreateTeamTrialProgressScreen", OneExecutionStateStrategy.class);
            this.f23178a = z10;
            this.f23179b = list;
            this.f23180c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.X3(this.f23178a, this.f23179b, this.f23180c);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23182a;

        f(boolean z10) {
            super("updateBackButtonVisibility", AddToEndSingleStrategy.class);
            this.f23182a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.M2(this.f23182a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23184a;

        g(boolean z10) {
            super("updateDoItLaterButtonVisibility", AddToEndSingleStrategy.class);
            this.f23184a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.l0(this.f23184a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.trials.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23186a;

        h(boolean z10) {
            super("updateSendInvitesButtonState", AddToEndSingleStrategy.class);
            this.f23186a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.trials.b bVar) {
            bVar.T(this.f23186a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void M2(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).M2(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void T(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).T(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void X3(boolean z10, List<TeamMemberInvitation> list, boolean z11) {
        e eVar = new e(z10, list, z11);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).X3(z10, list, z11);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void f() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).f();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        C0365a c0365a = new C0365a(teamMemberInvitation);
        this.viewCommands.beforeApply(c0365a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).i0(teamMemberInvitation);
        }
        this.viewCommands.afterApply(c0365a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.trials.b
    public void l0(boolean z10) {
        g gVar = new g(z10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.trials.b) it.next()).l0(z10);
        }
        this.viewCommands.afterApply(gVar);
    }
}

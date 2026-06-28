package com.server.auditor.ssh.client.contracts.team;

import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.team.b> implements com.server.auditor.ssh.client.contracts.team.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.team.a$a, reason: collision with other inner class name */
    public class C0359a extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeamMemberInvitation f23109a;

        C0359a(TeamMemberInvitation teamMemberInvitation) {
            super("addAnotherEmailInputField", AddToEndStrategy.class);
            this.f23109a = teamMemberInvitation;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.i0(this.f23109a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.b();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {
        d() {
            super("navigateToInternalErrorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.C0();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {
        e() {
            super("navigateToInvitesSentScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.e5();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {
        f() {
            super("navigateToNetworkErrorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.U0();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23116a;

        g(int i10) {
            super("navigateToSetupTeamVaultPromotionScreen", OneExecutionStateStrategy.class);
            this.f23116a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.y9(this.f23116a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23118a;

        h(boolean z10) {
            super("updateAddAnotherEmailButtonState", AddToEndSingleStrategy.class);
            this.f23118a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.B2(this.f23118a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23120a;

        i(boolean z10) {
            super("updateBackButtonState", AddToEndSingleStrategy.class);
            this.f23120a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.r(this.f23120a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23122a;

        j(boolean z10) {
            super("updateInviteColleaguesFieldsState", AddToEndSingleStrategy.class);
            this.f23122a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.P1(this.f23122a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f23124a;

        k(ProgressButton.b bVar) {
            super("updateSendInvitesButtonState", OneExecutionStateStrategy.class);
            this.f23124a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.A1(this.f23124a);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.team.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23126a;

        l(boolean z10) {
            super("updateSendInvitesButtonState", AddToEndSingleStrategy.class);
            this.f23126a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.b bVar) {
            bVar.T(this.f23126a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void A1(ProgressButton.b bVar) {
        k kVar = new k(bVar);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).A1(bVar);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void B2(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).B2(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void C0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).C0();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void P1(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).P1(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void T(boolean z10) {
        l lVar = new l(z10);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).T(z10);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void U0() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).U0();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void e5() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).e5();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        C0359a c0359a = new C0359a(teamMemberInvitation);
        this.viewCommands.beforeApply(c0359a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).i0(teamMemberInvitation);
        }
        this.viewCommands.afterApply(c0359a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void r(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).r(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.b
    public void y9(int i10) {
        g gVar = new g(i10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.b) it.next()).y9(i10);
        }
        this.viewCommands.afterApply(gVar);
    }
}

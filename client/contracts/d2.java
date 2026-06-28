package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.SetupTeamVaultShareEntitiesSectionType;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.models.teams.TeamMemberInvitation;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class d2 extends MvpViewState<e2> implements e2 {

    public class a extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeamMemberInvitation f22164a;

        a(TeamMemberInvitation teamMemberInvitation) {
            super("addAnotherEmailInputField", AddToEndStrategy.class);
            this.f22164a = teamMemberInvitation;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.i0(this.f22164a);
        }
    }

    public class b extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22166a;

        b(int i10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f22166a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.x(this.f22166a);
        }
    }

    public class c extends ViewCommand<e2> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.a();
        }
    }

    public class d extends ViewCommand<e2> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.b();
        }
    }

    public class e extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<TypedEntityIdentifier> f22171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22172c;

        e(int i10, List<TypedEntityIdentifier> list, String str) {
            super("navigateToChooseCredentialsModeScreen", OneExecutionStateStrategy.class);
            this.f22170a = i10;
            this.f22171b = list;
            this.f22172c = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.ya(this.f22170a, this.f22171b, this.f22172c);
        }
    }

    public class f extends ViewCommand<e2> {
        f() {
            super("navigateToInternalErrorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.C0();
        }
    }

    public class g extends ViewCommand<e2> {
        g() {
            super("navigateToNetworkErrorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.U0();
        }
    }

    public class h extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends SetupTeamVaultShareEntitiesSectionType<?>> f22176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22177b;

        h(List<? extends SetupTeamVaultShareEntitiesSectionType<?>> list, int i10) {
            super("navigateToSuccessScreen", OneExecutionStateStrategy.class);
            this.f22176a = list;
            this.f22177b = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.m4(this.f22176a, this.f22177b);
        }
    }

    public class i extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22179a;

        i(boolean z10) {
            super("updateAddAnotherEmailButtonState", AddToEndSingleStrategy.class);
            this.f22179a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.B2(this.f22179a);
        }
    }

    public class j extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22181a;

        j(boolean z10) {
            super("updateBackButtonState", AddToEndSingleStrategy.class);
            this.f22181a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.r(this.f22181a);
        }
    }

    public class k extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22183a;

        k(boolean z10) {
            super("updateInviteColleaguesFieldsState", AddToEndSingleStrategy.class);
            this.f22183a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.P1(this.f22183a);
        }
    }

    public class l extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f22185a;

        l(ProgressButton.b bVar) {
            super("updateSendInvitesButtonState", AddToEndSingleStrategy.class);
            this.f22185a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.A1(this.f22185a);
        }
    }

    public class m extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22187a;

        m(boolean z10) {
            super("updateSendInvitesButtonState", AddToEndSingleStrategy.class);
            this.f22187a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.T(this.f22187a);
        }
    }

    public class n extends ViewCommand<e2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22189a;

        n(boolean z10) {
            super("updateStepInfoVisibility", AddToEndSingleStrategy.class);
            this.f22189a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(e2 e2Var) {
            e2Var.c8(this.f22189a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void A1(ProgressButton.b bVar) {
        l lVar = new l(bVar);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).A1(bVar);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void B2(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).B2(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void C0() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).C0();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void P1(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).P1(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void T(boolean z10) {
        m mVar = new m(z10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).T(z10);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void U0() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).U0();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void c8(boolean z10) {
        n nVar = new n(z10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).c8(z10);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void i0(TeamMemberInvitation teamMemberInvitation) {
        a aVar = new a(teamMemberInvitation);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).i0(teamMemberInvitation);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void m4(List<? extends SetupTeamVaultShareEntitiesSectionType<?>> list, int i10) {
        h hVar = new h(list, i10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).m4(list, i10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void r(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).r(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void x(int i10) {
        b bVar = new b(i10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).x(i10);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e2
    public void ya(int i10, List<TypedEntityIdentifier> list, String str) {
        e eVar = new e(i10, list, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((e2) it.next()).ya(i10, list, str);
        }
        this.viewCommands.afterApply(eVar);
    }
}

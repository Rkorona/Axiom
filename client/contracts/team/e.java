package com.server.auditor.ssh.client.contracts.team;

import com.server.auditor.ssh.client.models.u;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.team.f> implements com.server.auditor.ssh.client.contracts.team.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.f();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.b();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23136a;

        d(boolean z10) {
            super("navigateToInviteTeamMemberScreen", OneExecutionStateStrategy.class);
            this.f23136a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.N6(this.f23136a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.team.e$e, reason: collision with other inner class name */
    public class C0361e extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23138a;

        C0361e(String str) {
            super("openAccountManagementTeamSitePage", OneExecutionStateStrategy.class);
            this.f23138a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.Y3(this.f23138a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23140a;

        f(boolean z10) {
            super("updateInvitationMemberInfoVisibility", OneExecutionStateStrategy.class);
            this.f23140a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.Y9(this.f23140a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<u> f23142a;

        g(List<u> list) {
            super("updateTeamPresenceRecyclerView", OneExecutionStateStrategy.class);
            this.f23142a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.pa(this.f23142a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.team.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23144a;

        h(boolean z10) {
            super("updateTitleVisibility", OneExecutionStateStrategy.class);
            this.f23144a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.team.f fVar) {
            fVar.c0(this.f23144a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void N6(boolean z10) {
        d dVar = new d(z10);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).N6(z10);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void Y3(String str) {
        C0361e c0361e = new C0361e(str);
        this.viewCommands.beforeApply(c0361e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).Y3(str);
        }
        this.viewCommands.afterApply(c0361e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void Y9(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).Y9(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void c0(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).c0(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.team.f
    public void pa(List<u> list) {
        g gVar = new g(list);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.team.f) it.next()).pa(list);
        }
        this.viewCommands.afterApply(gVar);
    }
}

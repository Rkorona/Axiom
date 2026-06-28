package com.server.auditor.ssh.client.contracts.connection;

import com.crystalnix.termius.libtermius.wrappers.TypeOfCurrentConnection;
import com.server.auditor.ssh.client.fragments.connection.NewConnectionFlowDialog;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.connection.d> implements com.server.auditor.ssh.client.contracts.connection.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewConnectionFlowDialog.b f22125a;

        a(NewConnectionFlowDialog.b bVar) {
            super("addProgressStep", AddToEndStrategy.class);
            this.f22125a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.k7(this.f22125a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        b() {
            super("closeDialogByCancel", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.j6();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.connection.c$c, reason: collision with other inner class name */
    public class C0346c extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        C0346c() {
            super("closeDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.kd();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        d() {
            super("hideAnimatedSshIdHardwareConnectionProcess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.Xe();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        e() {
            super("hideSshIdHardwareKeysList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.Xd();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        f() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.c();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22132a;

        g(long j10) {
            super("openHostEditor", OneExecutionStateStrategy.class);
            this.f22132a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.Cb(this.f22132a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        h() {
            super("openIntegrationPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.ue();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        i() {
            super("openTermiusDocumentationPage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.W1();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        j() {
            super("setProgressAsFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.dd();
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        k() {
            super("setProgressColorForSshId", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.K9();
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        l() {
            super("setProgressColorForSshIdRetry", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.T9();
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        m() {
            super("showAnimatedSshIdConnectionProcess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.H3();
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        n() {
            super("showAnimatedSshIdHardwareConnectionProcess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.ha();
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22143c;

        o(boolean z10, boolean z11, boolean z12) {
            super("showSuccess", OneExecutionStateStrategy.class);
            this.f22141a = z10;
            this.f22142b = z11;
            this.f22143c = z12;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.h9(this.f22141a, this.f22142b, this.f22143c);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeOfCurrentConnection f22145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gh.s f22146b;

        p(TypeOfCurrentConnection typeOfCurrentConnection, gh.s sVar) {
            super("startOver", OneExecutionStateStrategy.class);
            this.f22145a = typeOfCurrentConnection;
            this.f22146b = sVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.B8(this.f22145a, this.f22146b);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22148a;

        q(int i10) {
            super("startTerminalActivity", OneExecutionStateStrategy.class);
            this.f22148a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.Ie(this.f22148a);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {
        r() {
            super("triggerCheckingYubikeyCodes", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.d3();
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewConnectionFlowDialog.b f22151a;

        s(NewConnectionFlowDialog.b bVar) {
            super("updateCurrentStep", AddToEndSingleStrategy.class);
            this.f22151a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.F9(this.f22151a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22153a;

        t(boolean z10) {
            super("updateHostEditButtonVisibility", OneExecutionStateStrategy.class);
            this.f22153a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.L1(this.f22153a);
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22155a;

        u(boolean z10) {
            super("updateShowProgressWheel", AddToEndSingleStrategy.class);
            this.f22155a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.d dVar) {
            dVar.Sa(this.f22155a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void B8(TypeOfCurrentConnection typeOfCurrentConnection, gh.s sVar) {
        p pVar = new p(typeOfCurrentConnection, sVar);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).B8(typeOfCurrentConnection, sVar);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Cb(long j10) {
        g gVar = new g(j10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).Cb(j10);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void F9(NewConnectionFlowDialog.b bVar) {
        s sVar = new s(bVar);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).F9(bVar);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void H3() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).H3();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Ie(int i10) {
        q qVar = new q(i10);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).Ie(i10);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void K9() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).K9();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void L1(boolean z10) {
        t tVar = new t(z10);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).L1(z10);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Sa(boolean z10) {
        u uVar = new u(z10);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).Sa(z10);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void T9() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).T9();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void W1() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).W1();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Xd() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).Xd();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void Xe() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).Xe();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void c() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).c();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void d3() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).d3();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void dd() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).dd();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void h9(boolean z10, boolean z11, boolean z12) {
        o oVar = new o(z10, z11, z12);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).h9(z10, z11, z12);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void ha() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).ha();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void j6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).j6();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void k7(NewConnectionFlowDialog.b bVar) {
        a aVar = new a(bVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).k7(bVar);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void kd() {
        C0346c c0346c = new C0346c();
        this.viewCommands.beforeApply(c0346c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).kd();
        }
        this.viewCommands.afterApply(c0346c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.d
    public void ue() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.d) it.next()).ue();
        }
        this.viewCommands.afterApply(hVar);
    }
}

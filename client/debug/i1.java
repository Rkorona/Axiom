package com.server.auditor.ssh.client.debug;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes3.dex */
public class i1 extends MvpViewState<j1> implements j1 {

    public class a extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23713a;

        a(int i10) {
            super("initAppearanceSection", AddToEndSingleStrategy.class);
            this.f23713a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.Sb(this.f23713a);
        }
    }

    public class b extends ViewCommand<j1> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.c();
        }
    }

    public class c extends ViewCommand<j1> {
        c() {
            super("showConfirmGenerateNewLocalCryptoDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.n8();
        }
    }

    public class d extends ViewCommand<j1> {
        d() {
            super("showConfirmRemoveLastSyncDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.Jb();
        }
    }

    public class e extends ViewCommand<j1> {
        e() {
            super("showErrorSnackbar", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.M8();
        }
    }

    public class f extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23719a;

        f(String str) {
            super("showInfoSnackbar", OneExecutionStateStrategy.class);
            this.f23719a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.D6(this.f23719a);
        }
    }

    public class g extends ViewCommand<j1> {
        g() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.d();
        }
    }

    public class h extends ViewCommand<j1> {
        h() {
            super("showSuccessSnackbar", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.o5();
        }
    }

    public class i extends ViewCommand<j1> {
        i() {
            super("startConnectionFlowProgressPrototype", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.qe();
        }
    }

    public class j extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23724a;

        j(boolean z10) {
            super("updateBypassHasDesktopDeviceCheckCheckbox", OneExecutionStateStrategy.class);
            this.f23724a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.la(this.f23724a);
        }
    }

    public class k extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23726a;

        k(boolean z10) {
            super("updateEnableNewSftpAnnouncementState", AddToEndSingleStrategy.class);
            this.f23726a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.H7(this.f23726a);
        }
    }

    public class l extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23728a;

        l(boolean z10) {
            super("updateEnableTermiusXAnnouncementState", AddToEndSingleStrategy.class);
            this.f23728a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.H5(this.f23728a);
        }
    }

    public class m extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23730a;

        m(boolean z10) {
            super("updateIsTrialOnboardingFinished", OneExecutionStateStrategy.class);
            this.f23730a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.Fd(this.f23730a);
        }
    }

    public class n extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23732a;

        n(boolean z10) {
            super("updateShowRateUsItemInHosts", AddToEndSingleStrategy.class);
            this.f23732a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.b6(this.f23732a);
        }
    }

    public class o extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23734a;

        o(boolean z10) {
            super("updateStateOfUpdatingPasskeyAfterSuccessfulSshidConnection", AddToEndSingleStrategy.class);
            this.f23734a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.Ce(this.f23734a);
        }
    }

    public class p extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23736a;

        p(boolean z10) {
            super("updateWasLoggedEnterpriseSSO", AddToEndSingleStrategy.class);
            this.f23736a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.Zc(this.f23736a);
        }
    }

    public class q extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23738a;

        q(boolean z10) {
            super("updateWasSharedFlagCheckbox", AddToEndSingleStrategy.class);
            this.f23738a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.R8(this.f23738a);
        }
    }

    public class r extends ViewCommand<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23740a;

        r(boolean z10) {
            super("updateWasTrialPromoShowedCheckbox", AddToEndSingleStrategy.class);
            this.f23740a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j1 j1Var) {
            j1Var.ef(this.f23740a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void Ce(boolean z10) {
        o oVar = new o(z10);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).Ce(z10);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void D6(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).D6(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void Fd(boolean z10) {
        m mVar = new m(z10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).Fd(z10);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void H5(boolean z10) {
        l lVar = new l(z10);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).H5(z10);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void H7(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).H7(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void Jb() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).Jb();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void M8() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).M8();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void R8(boolean z10) {
        q qVar = new q(z10);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).R8(z10);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void Sb(int i10) {
        a aVar = new a(i10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).Sb(i10);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void Zc(boolean z10) {
        p pVar = new p(z10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).Zc(z10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void b6(boolean z10) {
        n nVar = new n(z10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).b6(z10);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void d() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).d();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void ef(boolean z10) {
        r rVar = new r(z10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).ef(z10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void la(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).la(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void n8() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).n8();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void o5() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).o5();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.debug.j1
    public void qe() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).qe();
        }
        this.viewCommands.afterApply(iVar);
    }
}

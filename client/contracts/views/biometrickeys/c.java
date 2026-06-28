package com.server.auditor.ssh.client.contracts.views.biometrickeys;

import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> implements com.server.auditor.ssh.client.contracts.views.biometrickeys.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        a() {
            super("dismissProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.g0();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        b() {
            super("exitScreenCanceled", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.wc();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.biometrickeys.c$c, reason: collision with other inner class name */
    public class C0374c extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23387a;

        C0374c(int i10) {
            super("exitScreen", OneExecutionStateStrategy.class);
            this.f23387a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.K8(this.f23387a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        d() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.c();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SshKeyDBModel f23390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23391b;

        e(SshKeyDBModel sshKeyDBModel, String str) {
            super("navigateToEditBiometricKey", OneExecutionStateStrategy.class);
            this.f23390a = sshKeyDBModel;
            this.f23391b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.z9(this.f23390a, this.f23391b);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        f() {
            super("showDocumentation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.E4();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        g() {
            super("showErrorCannotAuthenticate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.ld();
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        h() {
            super("showErrorNotSupported", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.Yd();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {
        i() {
            super("showProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.A();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23397a;

        j(boolean z10) {
            super("updateBiometricUnlockErrorVisibility", OneExecutionStateStrategy.class);
            this.f23397a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.f5(this.f23397a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23399a;

        k(boolean z10) {
            super("updateGenerateKeyButtonEnabled", AddToEndSingleStrategy.class);
            this.f23399a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.d dVar) {
            dVar.d9(this.f23399a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void A() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).A();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void E4() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).E4();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void K8(int i10) {
        C0374c c0374c = new C0374c(i10);
        this.viewCommands.beforeApply(c0374c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).K8(i10);
        }
        this.viewCommands.afterApply(c0374c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void Yd() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).Yd();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void c() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).c();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void d9(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).d9(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void f5(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).f5(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void g0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).g0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void ld() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).ld();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void wc() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).wc();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.d
    public void z9(SshKeyDBModel sshKeyDBModel, String str) {
        e eVar = new e(sshKeyDBModel, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.d) it.next()).z9(sshKeyDBModel, str);
        }
        this.viewCommands.afterApply(eVar);
    }
}

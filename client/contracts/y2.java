package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class y2 extends MvpViewState<z2> implements z2 {

    public class a extends ViewCommand<z2> {
        a() {
            super("clearSensitiveData", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.M();
        }
    }

    public class b extends ViewCommand<z2> {
        b() {
            super("hideCheckingProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.b2();
        }
    }

    public class c extends ViewCommand<z2> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.a();
        }
    }

    public class d extends ViewCommand<z2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f23495d;

        d(String str, String str2, String str3, String str4) {
            super("navigateToCopyTwoFactorCodeScreen", OneExecutionStateStrategy.class);
            this.f23492a = str;
            this.f23493b = str2;
            this.f23494c = str3;
            this.f23495d = str4;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.F5(this.f23492a, this.f23493b, this.f23494c, this.f23495d);
        }
    }

    public class e extends ViewCommand<z2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23497a;

        e(String str) {
            super("navigateToDisableTwoFactorScreen", OneExecutionStateStrategy.class);
            this.f23497a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.P7(this.f23497a);
        }
    }

    public class f extends ViewCommand<z2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23499a;

        f(String str) {
            super("navigateToInstallAuthyScreen", OneExecutionStateStrategy.class);
            this.f23499a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.ub(this.f23499a);
        }
    }

    public class g extends ViewCommand<z2> {
        g() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.j();
        }
    }

    public class h extends ViewCommand<z2> {
        h() {
            super("showCheckingProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.L0();
        }
    }

    public class i extends ViewCommand<z2> {
        i() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.i();
        }
    }

    public class j extends ViewCommand<z2> {
        j() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.g();
        }
    }

    public class k extends ViewCommand<z2> {
        k() {
            super("showOutdatedAppError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.vd();
        }
    }

    public class l extends ViewCommand<z2> {
        l() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.h();
        }
    }

    public class m extends ViewCommand<z2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23507a;

        m(boolean z10) {
            super("updateConfirmButtonState", AddToEndSingleStrategy.class);
            this.f23507a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.t(this.f23507a);
        }
    }

    public class n extends ViewCommand<z2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f23509a;

        n(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateInputFieldError", OneExecutionStateStrategy.class);
            this.f23509a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(z2 z2Var) {
            z2Var.W5(this.f23509a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void F5(String str, String str2, String str3, String str4) {
        d dVar = new d(str, str2, str3, str4);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).F5(str, str2, str3, str4);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void L0() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).L0();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void M() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).M();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void P7(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).P7(str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void W5(com.server.auditor.ssh.client.help.a0 a0Var) {
        n nVar = new n(a0Var);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).W5(a0Var);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void b2() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).b2();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void g() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).g();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void h() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).h();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void i() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).i();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).j();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void t(boolean z10) {
        m mVar = new m(z10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).t(z10);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void ub(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).ub(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z2
    public void vd() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((z2) it.next()).vd();
        }
        this.viewCommands.afterApply(kVar);
    }
}

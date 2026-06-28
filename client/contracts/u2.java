package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class u2 extends MvpViewState<v2> implements v2 {

    public class a extends ViewCommand<v2> {
        a() {
            super("finishFlowWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.r0();
        }
    }

    public class b extends ViewCommand<v2> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.e();
        }
    }

    public class c extends ViewCommand<v2> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.a();
        }
    }

    public class d extends ViewCommand<v2> {
        d() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.j();
        }
    }

    public class e extends ViewCommand<v2> {
        e() {
            super("restartFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.g1();
        }
    }

    public class f extends ViewCommand<v2> {
        f() {
            super("showExpiredTokenError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.B0();
        }
    }

    public class g extends ViewCommand<v2> {
        g() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.i();
        }
    }

    public class h extends ViewCommand<v2> {
        h() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.g();
        }
    }

    public class i extends ViewCommand<v2> {
        i() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.d();
        }
    }

    public class j extends ViewCommand<v2> {
        j() {
            super("showSomethingWentWrongError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.S0();
        }
    }

    public class k extends ViewCommand<v2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23268a;

        k(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f23268a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.m(this.f23268a);
        }
    }

    public class l extends ViewCommand<v2> {
        l() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.h();
        }
    }

    public class m extends ViewCommand<v2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23271a;

        m(boolean z10) {
            super("updateConfirmButtonState", OneExecutionStateStrategy.class);
            this.f23271a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.t(this.f23271a);
        }
    }

    public class n extends ViewCommand<v2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23273a;

        n(String str) {
            super("updateInputFieldError", OneExecutionStateStrategy.class);
            this.f23273a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v2 v2Var) {
            v2Var.s(this.f23273a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void B0() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).B0();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void S0() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).S0();
        }
        this.viewCommands.afterApply(jVar);
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
            ((v2) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void d() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).d();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void g() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).g();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void g1() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).g1();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void h() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).h();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void i() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).i();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).j();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void m(int i10) {
        k kVar = new k(i10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).m(i10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void r0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).r0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void s(String str) {
        n nVar = new n(str);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).s(str);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.v2
    public void t(boolean z10) {
        m mVar = new m(z10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v2) it.next()).t(z10);
        }
        this.viewCommands.afterApply(mVar);
    }
}

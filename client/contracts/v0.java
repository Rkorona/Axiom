package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class v0 extends MvpViewState<w0> implements w0 {

    public class a extends ViewCommand<w0> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w0 w0Var) {
            w0Var.f();
        }
    }

    public class b extends ViewCommand<w0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23278a;

        b(String str) {
            super("composeMailToTeamOwner", OneExecutionStateStrategy.class);
            this.f23278a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w0 w0Var) {
            w0Var.pb(this.f23278a);
        }
    }

    public class c extends ViewCommand<w0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23280a;

        c(String str) {
            super("initView", AddToEndSingleStrategy.class);
            this.f23280a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w0 w0Var) {
            w0Var.e0(this.f23280a);
        }
    }

    public class d extends ViewCommand<w0> {
        d() {
            super("navigateToLogoutConfirmationScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w0 w0Var) {
            w0Var.q();
        }
    }

    public class e extends ViewCommand<w0> {
        e() {
            super("showEmailClientNotFoundError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w0 w0Var) {
            w0Var.K4();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.w0
    public void K4() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w0) it.next()).K4();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.w0
    public void e0(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w0) it.next()).e0(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.w0
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w0) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.w0
    public void pb(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w0) it.next()).pb(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.w0
    public void q() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w0) it.next()).q();
        }
        this.viewCommands.afterApply(dVar);
    }
}

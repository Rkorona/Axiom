package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class u extends MvpViewState<v> implements v {

    public class a extends ViewCommand<v> {
        a() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.e();
        }
    }

    public class b extends ViewCommand<v> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.c();
        }
    }

    public class c extends ViewCommand<v> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.b();
        }
    }

    public class d extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21981a;

        d(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showEmailError", OneExecutionStateStrategy.class);
            this.f21981a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.Z(this.f21981a);
        }
    }

    public class e extends ViewCommand<v> {
        e() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.d();
        }
    }

    public class f extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AuthenticationModel f21985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21987d;

        f(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            super("showResetPasswordLinkSuccessfullySent", OneExecutionStateStrategy.class);
            this.f21984a = i10;
            this.f21985b = authenticationModel;
            this.f21986c = z10;
            this.f21987d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.D5(this.f21984a, this.f21985b, this.f21986c, this.f21987d);
        }
    }

    public class g extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21989a;

        g(String str) {
            super("updateEmail", AddToEndSingleStrategy.class);
            this.f21989a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.H0(this.f21989a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void D5(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        f fVar = new f(i10, authenticationModel, z10, z11);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).D5(i10, authenticationModel, z10, z11);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void H0(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).H0(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void Z(com.server.auditor.ssh.client.help.a0 a0Var) {
        d dVar = new d(a0Var);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).Z(a0Var);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void d() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).d();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.v
    public void e() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).e();
        }
        this.viewCommands.afterApply(aVar);
    }
}

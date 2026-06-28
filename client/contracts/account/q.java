package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class q extends MvpViewState<r> implements r {

    public class a extends ViewCommand<r> {
        a() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.e();
        }
    }

    public class b extends ViewCommand<r> {
        b() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.c();
        }
    }

    public class c extends ViewCommand<r> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.b();
        }
    }

    public class d extends ViewCommand<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21963a;

        d(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showEmailError", OneExecutionStateStrategy.class);
            this.f21963a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.Z(this.f21963a);
        }
    }

    public class e extends ViewCommand<r> {
        e() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.d();
        }
    }

    public class f extends ViewCommand<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailAuthentication f21966a;

        f(EmailAuthentication emailAuthentication) {
            super("showResetPasswordLinkSuccessfullySent", OneExecutionStateStrategy.class);
            this.f21966a = emailAuthentication;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.H6(this.f21966a);
        }
    }

    public class g extends ViewCommand<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21968a;

        g(String str) {
            super("updateEmail", AddToEndSingleStrategy.class);
            this.f21968a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(r rVar) {
            rVar.H0(this.f21968a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void H0(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).H0(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void H6(EmailAuthentication emailAuthentication) {
        f fVar = new f(emailAuthentication);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).H6(emailAuthentication);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void Z(com.server.auditor.ssh.client.help.a0 a0Var) {
        d dVar = new d(a0Var);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).Z(a0Var);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void c() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).c();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void d() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).d();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.r
    public void e() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((r) it.next()).e();
        }
        this.viewCommands.afterApply(aVar);
    }
}

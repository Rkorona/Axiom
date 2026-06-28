package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class o extends MvpViewState<p> implements p {

    public class a extends ViewCommand<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21955a;

        a(String str) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f21955a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.u(this.f21955a);
        }
    }

    public class b extends ViewCommand<p> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.b();
        }
    }

    public class c extends ViewCommand<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailAuthentication f21958a;

        c(EmailAuthentication emailAuthentication) {
            super("navigateMasterPasswordEnterPassword", OneExecutionStateStrategy.class);
            this.f21958a = emailAuthentication;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.S3(this.f21958a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void S3(EmailAuthentication emailAuthentication) {
        c cVar = new c(emailAuthentication);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).S3(emailAuthentication);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.p
    public void u(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).u(str);
        }
        this.viewCommands.afterApply(aVar);
    }
}

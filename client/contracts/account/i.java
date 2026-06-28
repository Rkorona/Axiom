package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class i extends MvpViewState<j> implements j {

    public class a extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21902a;

        a(String str) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f21902a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.u(this.f21902a);
        }
    }

    public class b extends ViewCommand<j> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.b();
        }
    }

    public class c extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AuthenticationModel f21906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21908d;

        c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            super("navigateToSetupTeamVault", OneExecutionStateStrategy.class);
            this.f21905a = i10;
            this.f21906b = authenticationModel;
            this.f21907c = z10;
            this.f21908d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.sc(this.f21905a, this.f21906b, this.f21907c, this.f21908d);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void sc(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        c cVar = new c(i10, authenticationModel, z10, z11);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).sc(i10, authenticationModel, z10, z11);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.j
    public void u(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).u(str);
        }
        this.viewCommands.afterApply(aVar);
    }
}

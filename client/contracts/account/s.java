package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class s extends MvpViewState<t> implements t {

    public class a extends ViewCommand<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21970a;

        a(String str) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f21970a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.u(this.f21970a);
        }
    }

    public class b extends ViewCommand<t> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.b();
        }
    }

    public class c extends ViewCommand<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AuthenticationModel f21974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21976d;

        c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            super("navigateSignInChooser", OneExecutionStateStrategy.class);
            this.f21973a = i10;
            this.f21974b = authenticationModel;
            this.f21975c = z10;
            this.f21976d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.r4(this.f21973a, this.f21974b, this.f21975c, this.f21976d);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void r4(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        c cVar = new c(i10, authenticationModel, z10, z11);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).r4(i10, authenticationModel, z10, z11);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.t
    public void u(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).u(str);
        }
        this.viewCommands.afterApply(aVar);
    }
}

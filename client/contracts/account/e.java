package com.server.auditor.ssh.client.contracts.account;

import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<f> implements f {

    public class a extends ViewCommand<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21807a;

        a(String str) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f21807a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.u(this.f21807a);
        }
    }

    public class b extends ViewCommand<f> {
        b() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.b();
        }
    }

    public class c extends ViewCommand<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AuthenticationModel f21811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21813d;

        c(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
            super("navigateToUnlockWithPassword", OneExecutionStateStrategy.class);
            this.f21810a = i10;
            this.f21811b = authenticationModel;
            this.f21812c = z10;
            this.f21813d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.va(this.f21810a, this.f21811b, this.f21812c, this.f21813d);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void b() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void u(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).u(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.f
    public void va(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        c cVar = new c(i10, authenticationModel, z10, z11);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).va(i10, authenticationModel, z10, z11);
        }
        this.viewCommands.afterApply(cVar);
    }
}

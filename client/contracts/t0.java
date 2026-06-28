package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class t0 extends MvpViewState<u0> implements u0 {

    public class a extends ViewCommand<u0> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(u0 u0Var) {
            u0Var.f();
        }
    }

    public class b extends ViewCommand<u0> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(u0 u0Var) {
            u0Var.a();
        }
    }

    public class c extends ViewCommand<u0> {
        c() {
            super("openContactSalesSitePage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(u0 u0Var) {
            u0Var.ie();
        }
    }

    public class d extends ViewCommand<u0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23103a;

        d(String str) {
            super("showFailedToOpenWebBrowserError", OneExecutionStateStrategy.class);
            this.f23103a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(u0 u0Var) {
            u0Var.i1(this.f23103a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.u0
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.u0
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.u0
    public void i1(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).i1(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.u0
    public void ie() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).ie();
        }
        this.viewCommands.afterApply(cVar);
    }
}

package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class j0 extends MvpViewState<k0> implements k0 {

    public class a extends ViewCommand<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f22342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mq.d f22343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22344c;

        a(List<String> list, mq.d dVar, String str) {
            super("initListAdapter", OneExecutionStateStrategy.class);
            this.f22342a = list;
            this.f22343b = dVar;
            this.f22344c = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k0 k0Var) {
            k0Var.Ac(this.f22342a, this.f22343b, this.f22344c);
        }
    }

    public class b extends ViewCommand<k0> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k0 k0Var) {
            k0Var.a();
        }
    }

    public class c extends ViewCommand<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22347a;

        c(String str) {
            super("onChoose", OneExecutionStateStrategy.class);
            this.f22347a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k0 k0Var) {
            k0Var.g2(this.f22347a);
        }
    }

    public class d extends ViewCommand<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22349a;

        d(String str) {
            super("setCurrentCharsetUI", OneExecutionStateStrategy.class);
            this.f22349a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k0 k0Var) {
            k0Var.T7(this.f22349a);
        }
    }

    public class e extends ViewCommand<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22351a;

        e(String str) {
            super("setDefaultCharsetUI", OneExecutionStateStrategy.class);
            this.f22351a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k0 k0Var) {
            k0Var.m6(this.f22351a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k0
    public void Ac(List<String> list, mq.d dVar, String str) {
        a aVar = new a(list, dVar, str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).Ac(list, dVar, str);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k0
    public void T7(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).T7(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k0
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k0
    public void g2(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).g2(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k0
    public void m6(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k0) it.next()).m6(str);
        }
        this.viewCommands.afterApply(eVar);
    }
}

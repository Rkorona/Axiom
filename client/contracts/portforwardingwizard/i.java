package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class i extends MvpViewState<j> implements j {

    public class a extends ViewCommand<j> {
        a() {
            super("checkCurrentPortNumberValue", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.q5();
        }
    }

    public class b extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22813a;

        b(boolean z10) {
            super("enableContinueButton", AddToEndSingleStrategy.class);
            this.f22813a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.y(this.f22813a);
        }
    }

    public class c extends ViewCommand<j> {
        c() {
            super("hidePortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.w();
        }
    }

    public class d extends ViewCommand<j> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.a();
        }
    }

    public class e extends ViewCommand<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22818b;

        e(int i10, String str) {
            super("showHostSelectorScreen", OneExecutionStateStrategy.class);
            this.f22817a = i10;
            this.f22818b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.bc(this.f22817a, this.f22818b);
        }
    }

    public class f extends ViewCommand<j> {
        f() {
            super("showPortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(j jVar) {
            jVar.v();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void bc(int i10, String str) {
        e eVar = new e(i10, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).bc(i10, str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void q5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).q5();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void v() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).v();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void w() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).w();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.j
    public void y(boolean z10) {
        b bVar = new b(z10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((j) it.next()).y(z10);
        }
        this.viewCommands.afterApply(bVar);
    }
}

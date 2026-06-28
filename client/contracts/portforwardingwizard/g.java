package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class g extends MvpViewState<h> implements h {

    public class a extends ViewCommand<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22806a;

        a(boolean z10) {
            super("enableDoneButton", AddToEndSingleStrategy.class);
            this.f22806a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h hVar) {
            hVar.O4(this.f22806a);
        }
    }

    public class b extends ViewCommand<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22809b;

        b(int i10, int i11) {
            super("initView", AddToEndSingleStrategy.class);
            this.f22808a = i10;
            this.f22809b = i11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h hVar) {
            hVar.o6(this.f22808a, this.f22809b);
        }
    }

    public class c extends ViewCommand<h> {
        c() {
            super("showFinishScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h hVar) {
            hVar.J6();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void J6() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h) it.next()).J6();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void O4(boolean z10) {
        a aVar = new a(z10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h) it.next()).O4(z10);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.h
    public void o6(int i10, int i11) {
        b bVar = new b(i10, i11);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h) it.next()).o6(i10, i11);
        }
        this.viewCommands.afterApply(bVar);
    }
}

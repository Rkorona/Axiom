package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<d> implements d {

    public class a extends ViewCommand<d> {
        a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.a();
        }
    }

    public class b extends ViewCommand<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22795a;

        b(PortForwardingWizardData portForwardingWizardData) {
            super("showHostSelectorScreen", OneExecutionStateStrategy.class);
            this.f22795a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.qc(this.f22795a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.portforwardingwizard.c$c, reason: collision with other inner class name */
    public class C0351c extends ViewCommand<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22797a;

        C0351c(PortForwardingWizardData portForwardingWizardData) {
            super("showLabelScreen", OneExecutionStateStrategy.class);
            this.f22797a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.J(this.f22797a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void J(PortForwardingWizardData portForwardingWizardData) {
        C0351c c0351c = new C0351c(portForwardingWizardData);
        this.viewCommands.beforeApply(c0351c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).J(portForwardingWizardData);
        }
        this.viewCommands.afterApply(c0351c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.d
    public void qc(PortForwardingWizardData portForwardingWizardData) {
        b bVar = new b(portForwardingWizardData);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).qc(portForwardingWizardData);
        }
        this.viewCommands.afterApply(bVar);
    }
}

package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class o extends MvpViewState<p> implements p {

    public class a extends ViewCommand<p> {
        a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.a();
        }
    }

    public class b extends ViewCommand<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22833a;

        b(PortForwardingWizardData portForwardingWizardData) {
            super("showHostSelector", OneExecutionStateStrategy.class);
            this.f22833a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.w1(this.f22833a);
        }
    }

    public class c extends ViewCommand<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22835a;

        c(PortForwardingWizardData portForwardingWizardData) {
            super("showRemoteRuleDataScreen", OneExecutionStateStrategy.class);
            this.f22835a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(p pVar) {
            pVar.l9(this.f22835a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void l9(PortForwardingWizardData portForwardingWizardData) {
        c cVar = new c(portForwardingWizardData);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).l9(portForwardingWizardData);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.p
    public void w1(PortForwardingWizardData portForwardingWizardData) {
        b bVar = new b(portForwardingWizardData);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((p) it.next()).w1(portForwardingWizardData);
        }
        this.viewCommands.afterApply(bVar);
    }
}

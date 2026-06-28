package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<f> implements f {

    public class a extends ViewCommand<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22799a;

        a(boolean z10) {
            super("enableContinueButton", AddToEndSingleStrategy.class);
            this.f22799a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.y(this.f22799a);
        }
    }

    public class b extends ViewCommand<f> {
        b() {
            super("hidePortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.w();
        }
    }

    public class c extends ViewCommand<f> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.a();
        }
    }

    public class d extends ViewCommand<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22803a;

        d(PortForwardingWizardData portForwardingWizardData) {
            super("showIntermediateHostScreen", OneExecutionStateStrategy.class);
            this.f22803a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.Q6(this.f22803a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.portforwardingwizard.e$e, reason: collision with other inner class name */
    public class C0352e extends ViewCommand<f> {
        C0352e() {
            super("showPortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(f fVar) {
            fVar.v();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void Q6(PortForwardingWizardData portForwardingWizardData) {
        d dVar = new d(portForwardingWizardData);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).Q6(portForwardingWizardData);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void v() {
        C0352e c0352e = new C0352e();
        this.viewCommands.beforeApply(c0352e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).v();
        }
        this.viewCommands.afterApply(c0352e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void w() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).w();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.f
    public void y(boolean z10) {
        a aVar = new a(z10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((f) it.next()).y(z10);
        }
        this.viewCommands.afterApply(aVar);
    }
}

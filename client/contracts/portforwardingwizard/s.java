package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class s extends MvpViewState<t> implements t {

    public class a extends ViewCommand<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22844a;

        a(boolean z10) {
            super("enableContinueButton", AddToEndSingleStrategy.class);
            this.f22844a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.y(this.f22844a);
        }
    }

    public class b extends ViewCommand<t> {
        b() {
            super("hidePortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.w();
        }
    }

    public class c extends ViewCommand<t> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.a();
        }
    }

    public class d extends ViewCommand<t> {
        d() {
            super("sendAddressValueToCheck", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.Y1();
        }
    }

    public class e extends ViewCommand<t> {
        e() {
            super("sendPortValueToCheck", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.m0();
        }
    }

    public class f extends ViewCommand<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22850a;

        f(PortForwardingWizardData portForwardingWizardData) {
            super("showLabelScreen", OneExecutionStateStrategy.class);
            this.f22850a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.J(this.f22850a);
        }
    }

    public class g extends ViewCommand<t> {
        g() {
            super("showPortNumberError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t tVar) {
            tVar.v();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void J(PortForwardingWizardData portForwardingWizardData) {
        f fVar = new f(portForwardingWizardData);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).J(portForwardingWizardData);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void Y1() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).Y1();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void m0() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).m0();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void v() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).v();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void w() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).w();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.t
    public void y(boolean z10) {
        a aVar = new a(z10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t) it.next()).y(z10);
        }
        this.viewCommands.afterApply(aVar);
    }
}

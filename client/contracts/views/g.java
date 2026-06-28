package com.server.auditor.ssh.client.contracts.views;

import com.server.auditor.ssh.client.models.Host;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class g extends MvpViewState<com.server.auditor.ssh.client.contracts.views.h> implements com.server.auditor.ssh.client.contracts.views.h {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {
        a() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.c();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {
        b() {
            super("readDevicesList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.q3();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {
        c() {
            super("startCheckingDevicePermissions", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.i7();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Host f23431a;

        d(Host host) {
            super("startConnection", OneExecutionStateStrategy.class);
            this.f23431a = host;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.Ec(this.f23431a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23433a;

        e(int i10) {
            super("updateBaudRateField", AddToEndSingleStrategy.class);
            this.f23433a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.cb(this.f23433a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23435a;

        f(int i10) {
            super("updateControlFlowField", AddToEndSingleStrategy.class);
            this.f23435a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.U2(this.f23435a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.g$g, reason: collision with other inner class name */
    public class C0378g extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23437a;

        C0378g(int i10) {
            super("updateDataBitsSwitch", AddToEndSingleStrategy.class);
            this.f23437a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.Ea(this.f23437a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23439a;

        h(int i10) {
            super("updateParitySwitch", AddToEndSingleStrategy.class);
            this.f23439a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.I9(this.f23439a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23441a;

        i(int i10) {
            super("updateStopBitsSwitch", AddToEndSingleStrategy.class);
            this.f23441a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.K7(this.f23441a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.views.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23443a;

        j(boolean z10) {
            super("updateStubVisibility", AddToEndSingleStrategy.class);
            this.f23443a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.h hVar) {
            hVar.s6(this.f23443a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void Ea(int i10) {
        C0378g c0378g = new C0378g(i10);
        this.viewCommands.beforeApply(c0378g);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).Ea(i10);
        }
        this.viewCommands.afterApply(c0378g);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void Ec(Host host) {
        d dVar = new d(host);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).Ec(host);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void I9(int i10) {
        h hVar = new h(i10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).I9(i10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void K7(int i10) {
        i iVar = new i(i10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).K7(i10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void U2(int i10) {
        f fVar = new f(i10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).U2(i10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void c() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).c();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void cb(int i10) {
        e eVar = new e(i10);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).cb(i10);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void i7() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).i7();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void q3() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).q3();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.h
    public void s6(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.h) it.next()).s6(z10);
        }
        this.viewCommands.afterApply(jVar);
    }
}

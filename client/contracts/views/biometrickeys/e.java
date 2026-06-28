package com.server.auditor.ssh.client.contracts.views.biometrickeys;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class e extends MvpViewState<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> implements com.server.auditor.ssh.client.contracts.views.biometrickeys.f {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {
        a() {
            super("finishFlowWithLoggedOutResult", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.h0();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.e();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {
        c() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.c();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {
        d() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.b();
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.biometrickeys.e$e, reason: collision with other inner class name */
    public class C0375e extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {
        C0375e() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.d();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23406a;

        f(int i10) {
            super("updateBiometricKeysCount", AddToEndSingleStrategy.class);
            this.f23406a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.f fVar) {
            fVar.L4(this.f23406a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void L4(int i10) {
        f fVar = new f(i10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).L4(i10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).b();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void c() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).c();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void d() {
        C0375e c0375e = new C0375e();
        this.viewCommands.beforeApply(c0375e);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).d();
        }
        this.viewCommands.afterApply(c0375e);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.f
    public void h0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.f) it.next()).h0();
        }
        this.viewCommands.afterApply(aVar);
    }
}

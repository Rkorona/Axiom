package com.server.auditor.ssh.client.contracts.connection;

import com.server.auditor.ssh.client.help.a0;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.connection.b> implements com.server.auditor.ssh.client.contracts.connection.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.connection.a$a, reason: collision with other inner class name */
    public class C0345a extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {
        C0345a() {
            super("onWebAuthnAuthCanceled", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.be();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {
        b() {
            super("onWebAuthnAuthFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.L6();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f22113a;

        c(byte[] bArr) {
            super("onWebAuthnAuthSuccess", OneExecutionStateStrategy.class);
            this.f22113a = bArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.R4(this.f22113a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f22117c;

        d(String str, String str2, byte[] bArr) {
            super("requestFido2Authentication", OneExecutionStateStrategy.class);
            this.f22115a = str;
            this.f22116b = str2;
            this.f22117c = bArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.m3(this.f22115a, this.f22116b, this.f22117c);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f22121c;

        e(int i10, int i11, a0 a0Var) {
            super("sendConnectionFlowLogMessage", OneExecutionStateStrategy.class);
            this.f22119a = i10;
            this.f22120b = i11;
            this.f22121c = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.x7(this.f22119a, this.f22120b, this.f22121c);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.connection.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22123a;

        f(boolean z10) {
            super("updateProgressBarVisibility", OneExecutionStateStrategy.class);
            this.f22123a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.connection.b bVar) {
            bVar.Ae(this.f22123a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void Ae(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).Ae(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void L6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).L6();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void R4(byte[] bArr) {
        c cVar = new c(bArr);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).R4(bArr);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void be() {
        C0345a c0345a = new C0345a();
        this.viewCommands.beforeApply(c0345a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).be();
        }
        this.viewCommands.afterApply(c0345a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void m3(String str, String str2, byte[] bArr) {
        d dVar = new d(str, str2, bArr);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).m3(str, str2, bArr);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.connection.b
    public void x7(int i10, int i11, a0 a0Var) {
        e eVar = new e(i10, i11, a0Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.connection.b) it.next()).x7(i10, i11, a0Var);
        }
        this.viewCommands.afterApply(eVar);
    }
}

package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends MvpViewState<b0> implements b0 {

    public class a extends ViewCommand<b0> {
        a() {
            super("clearSensitiveData", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.M();
        }
    }

    public class b extends ViewCommand<b0> {
        b() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.n();
        }
    }

    public class c extends ViewCommand<b0> {
        c() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.e();
        }
    }

    public class d extends ViewCommand<b0> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.a();
        }
    }

    public class e extends ViewCommand<b0> {
        e() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.j();
        }
    }

    public class f extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21617a;

        f(String str) {
            super("setEmailFieldText", AddToEndSingleStrategy.class);
            this.f21617a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.Ud(this.f21617a);
        }
    }

    public class g extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21619a;

        g(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showEmailErrorMessage", OneExecutionStateStrategy.class);
            this.f21619a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.C3(this.f21619a);
        }
    }

    public class h extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f21621a;

        h(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showPasswordErrorMessage", OneExecutionStateStrategy.class);
            this.f21621a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.zc(this.f21621a);
        }
    }

    public class i extends ViewCommand<b0> {
        i() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.d();
        }
    }

    public class j extends ViewCommand<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21625b;

        j(String str, String str2) {
            super("showTwoFactorVerifyCodeScreen", OneExecutionStateStrategy.class);
            this.f21624a = str;
            this.f21625b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(b0 b0Var) {
            b0Var.M1(this.f21624a, this.f21625b);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void C3(com.server.auditor.ssh.client.help.a0 a0Var) {
        g gVar = new g(a0Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).C3(a0Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void M() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).M();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void M1(String str, String str2) {
        j jVar = new j(str, str2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).M1(str, str2);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void Ud(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).Ud(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void d() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).d();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void e() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).e();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z
    public void j() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).j();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.z
    public void n() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).n();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.b0
    public void zc(com.server.auditor.ssh.client.help.a0 a0Var) {
        h hVar = new h(a0Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).zc(a0Var);
        }
        this.viewCommands.afterApply(hVar);
    }
}

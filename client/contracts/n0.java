package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.proxy.ProxyDataMediator;
import com.server.auditor.ssh.client.models.proxy.ProxyType;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class n0 extends MvpViewState<o0> implements o0 {

    public class a extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProxyDataMediator f22556a;

        a(ProxyDataMediator proxyDataMediator) {
            super("closeScreen", OneExecutionStateStrategy.class);
            this.f22556a = proxyDataMediator;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.Hb(this.f22556a);
        }
    }

    public class b extends ViewCommand<o0> {
        b() {
            super("concealPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.I0();
        }
    }

    public class c extends ViewCommand<o0> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.a();
        }
    }

    public class d extends ViewCommand<o0> {
        d() {
            super("navigateToPinUnlockScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.h2();
        }
    }

    public class e extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22561a;

        e(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showAddressError", OneExecutionStateStrategy.class);
            this.f22561a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.G5(this.f22561a);
        }
    }

    public class f extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22564b;

        f(VaultKeyId vaultKeyId, boolean z10) {
            super("showIdentitySelectorScreen", OneExecutionStateStrategy.class);
            this.f22563a = vaultKeyId;
            this.f22564b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.V5(this.f22563a, this.f22564b);
        }
    }

    public class g extends ViewCommand<o0> {
        g() {
            super("showPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.m7();
        }
    }

    public class h extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22567a;

        h(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showPortError", OneExecutionStateStrategy.class);
            this.f22567a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.ga(this.f22567a);
        }
    }

    public class i extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22569a;

        i(String str) {
            super("updateAddress", OneExecutionStateStrategy.class);
            this.f22569a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.Q9(this.f22569a);
        }
    }

    public class j extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Identity f22571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22572b;

        j(Identity identity, boolean z10) {
            super("updateIdentity", OneExecutionStateStrategy.class);
            this.f22571a = identity;
            this.f22572b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.w9(this.f22571a, this.f22572b);
        }
    }

    public class k extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22574a;

        k(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateIdentityPasswordError", OneExecutionStateStrategy.class);
            this.f22574a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.r9(this.f22574a);
        }
    }

    public class l extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22576a;

        l(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateIdentityUsernameError", OneExecutionStateStrategy.class);
            this.f22576a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.Q5(this.f22576a);
        }
    }

    public class m extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f22578a;

        m(Integer num) {
            super("updatePort", OneExecutionStateStrategy.class);
            this.f22578a = num;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.fb(this.f22578a);
        }
    }

    public class n extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22580a;

        n(int i10) {
            super("updatePortPlaceholder", OneExecutionStateStrategy.class);
            this.f22580a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.Ge(this.f22580a);
        }
    }

    public class o extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProxyType f22582a;

        o(ProxyType proxyType) {
            super("updateProxyType", OneExecutionStateStrategy.class);
            this.f22582a = proxyType;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.ke(this.f22582a);
        }
    }

    public class p extends ViewCommand<o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22584a;

        p(boolean z10) {
            super("updateSaveButtonState", OneExecutionStateStrategy.class);
            this.f22584a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(o0 o0Var) {
            o0Var.X(this.f22584a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void G5(com.server.auditor.ssh.client.help.a0 a0Var) {
        e eVar = new e(a0Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).G5(a0Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void Ge(int i10) {
        n nVar = new n(i10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).Ge(i10);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void Hb(ProxyDataMediator proxyDataMediator) {
        a aVar = new a(proxyDataMediator);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).Hb(proxyDataMediator);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void I0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).I0();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void Q5(com.server.auditor.ssh.client.help.a0 a0Var) {
        l lVar = new l(a0Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).Q5(a0Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void Q9(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).Q9(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void V5(VaultKeyId vaultKeyId, boolean z10) {
        f fVar = new f(vaultKeyId, z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).V5(vaultKeyId, z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void X(boolean z10) {
        p pVar = new p(z10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).X(z10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void fb(Integer num) {
        m mVar = new m(num);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).fb(num);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void ga(com.server.auditor.ssh.client.help.a0 a0Var) {
        h hVar = new h(a0Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).ga(a0Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void h2() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).h2();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void ke(ProxyType proxyType) {
        o oVar = new o(proxyType);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).ke(proxyType);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void m7() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).m7();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void r9(com.server.auditor.ssh.client.help.a0 a0Var) {
        k kVar = new k(a0Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).r9(a0Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o0
    public void w9(Identity identity, boolean z10) {
        j jVar = new j(identity, z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).w9(identity, z10);
        }
        this.viewCommands.afterApply(jVar);
    }
}

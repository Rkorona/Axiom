package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.navigation.sshkey.EditKeyData;
import com.server.auditor.ssh.client.widget.ProgressButton;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class h1 extends MvpViewState<i1> implements i1 {

    public class a extends ViewCommand<i1> {
        a() {
            super("closeScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.r1();
        }
    }

    public class b extends ViewCommand<i1> {
        b() {
            super("hidePassphrase", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Z7();
        }
    }

    public class c extends ViewCommand<i1> {
        c() {
            super("initViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.c();
        }
    }

    public class d extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditKeyData f22286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22287b;

        d(EditKeyData editKeyData, String str) {
            super("navigateToEditPasskeyScreen", OneExecutionStateStrategy.class);
            this.f22286a = editKeyData;
            this.f22287b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Xc(this.f22286a, this.f22287b);
        }
    }

    public class e extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22290b;

        e(String str, String str2) {
            super("requestFido2Register", OneExecutionStateStrategy.class);
            this.f22289a = str;
            this.f22290b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Cc(this.f22289a, this.f22290b);
        }
    }

    public class f extends ViewCommand<i1> {
        f() {
            super("revealPassphrase", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.m1();
        }
    }

    public class g extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22293a;

        g(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("showErrorSnackbar", OneExecutionStateStrategy.class);
            this.f22293a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.B4(this.f22293a);
        }
    }

    public class h extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22295a;

        h(boolean z10) {
            super("updateBackButtonState", AddToEndSingleStrategy.class);
            this.f22295a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.r(this.f22295a);
        }
    }

    public class i extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressButton.b f22297a;

        i(ProgressButton.b bVar) {
            super("updateGenerateButtonState", AddToEndSingleStrategy.class);
            this.f22297a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.bf(this.f22297a);
        }
    }

    public class j extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22299a;

        j(boolean z10) {
            super("updateGenerateButtonState", AddToEndSingleStrategy.class);
            this.f22299a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.yc(this.f22299a);
        }
    }

    public class k extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22301a;

        k(boolean z10) {
            super("updateInputKeyNameLayoutState", AddToEndSingleStrategy.class);
            this.f22301a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Oc(this.f22301a);
        }
    }

    public class l extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22303a;

        l(boolean z10) {
            super("updateInputPassphraseLayoutState", AddToEndSingleStrategy.class);
            this.f22303a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.P9(this.f22303a);
        }
    }

    public class m extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22305a;

        m(String str) {
            super("updateKeyName", OneExecutionStateStrategy.class);
            this.f22305a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.E2(this.f22305a);
        }
    }

    public class n extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22307a;

        n(String str) {
            super("updateKeyNamePlaceholder", OneExecutionStateStrategy.class);
            this.f22307a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.R0(this.f22307a);
        }
    }

    public class o extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22309a;

        o(boolean z10) {
            super("updateNetworkErrorLayoutVisibility", OneExecutionStateStrategy.class);
            this.f22309a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Wb(this.f22309a);
        }
    }

    public class p extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22311a;

        p(boolean z10) {
            super("updateSavePassphraseCheckbox", OneExecutionStateStrategy.class);
            this.f22311a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.B3(this.f22311a);
        }
    }

    public class q extends ViewCommand<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22313a;

        q(boolean z10) {
            super("updateSavePassphraseCheckboxState", OneExecutionStateStrategy.class);
            this.f22313a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i1 i1Var) {
            i1Var.Yc(this.f22313a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void B3(boolean z10) {
        p pVar = new p(z10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).B3(z10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void B4(com.server.auditor.ssh.client.help.a0 a0Var) {
        g gVar = new g(a0Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).B4(a0Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Cc(String str, String str2) {
        e eVar = new e(str, str2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Cc(str, str2);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void E2(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).E2(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Oc(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Oc(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void P9(boolean z10) {
        l lVar = new l(z10);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).P9(z10);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void R0(String str) {
        n nVar = new n(str);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).R0(str);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Wb(boolean z10) {
        o oVar = new o(z10);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Wb(z10);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Xc(EditKeyData editKeyData, String str) {
        d dVar = new d(editKeyData, str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Xc(editKeyData, str);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Yc(boolean z10) {
        q qVar = new q(z10);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Yc(z10);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void Z7() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).Z7();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void bf(ProgressButton.b bVar) {
        i iVar = new i(bVar);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).bf(bVar);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void c() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).c();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void m1() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).m1();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void r(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).r(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void r1() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).r1();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i1
    public void yc(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).yc(z10);
        }
        this.viewCommands.afterApply(jVar);
    }
}

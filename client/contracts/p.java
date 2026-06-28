package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class p extends MvpViewState<com.server.auditor.ssh.client.contracts.q> implements com.server.auditor.ssh.client.contracts.q {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {
        a() {
            super("concealPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.I0();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22623a;

        a0(String str) {
            super("updateUsername", OneExecutionStateStrategy.class);
            this.f22623a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.F2(this.f22623a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {
        b() {
            super("navigateToPinUnlockScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.h2();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22626a;

        b0(boolean z10) {
            super("updateUsernameInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22626a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.y1(this.f22626a);
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.a f22628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22629b;

        c(qq.a aVar, boolean z10) {
            super("openCredentialsModeSelector", OneExecutionStateStrategy.class);
            this.f22628a = aVar;
            this.f22629b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.f2(this.f22628a, this.f22629b);
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22631a;

        c0(String str) {
            super("updateUsernameInheritanceName", OneExecutionStateStrategy.class);
            this.f22631a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.u2(this.f22631a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {
        d() {
            super("revealPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.de();
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {
        e() {
            super("showCharsetSelectorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.a6();
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {
        f() {
            super("showColorSchemeSelectorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.w4();
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22636a;

        g(boolean z10) {
            super("showIdentitySelectorScreen", OneExecutionStateStrategy.class);
            this.f22636a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.x0(this.f22636a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22638a;

        h(String str) {
            super("updateAttachedIdentityName", OneExecutionStateStrategy.class);
            this.f22638a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.i2(this.f22638a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22640a;

        i(String str) {
            super("updateAttachedInheritedIdentityName", OneExecutionStateStrategy.class);
            this.f22640a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.N0(this.f22640a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22643b;

        j(String str, String str2) {
            super("updateCharsetData", OneExecutionStateStrategy.class);
            this.f22642a = str;
            this.f22643b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.oe(this.f22642a, this.f22643b);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22646b;

        k(String str, String str2) {
            super("updateColorSchemeData", OneExecutionStateStrategy.class);
            this.f22645a = str;
            this.f22646b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.Ld(this.f22645a, this.f22646b);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22648a;

        l(String str) {
            super("updateCredentialsMode", OneExecutionStateStrategy.class);
            this.f22648a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.a1(this.f22648a);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22650a;

        m(boolean z10) {
            super("updateCredentialsModeSelectorState", OneExecutionStateStrategy.class);
            this.f22650a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.G2(this.f22650a);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22652a;

        n(boolean z10) {
            super("updateCredentialsModeSelectorVisibility", OneExecutionStateStrategy.class);
            this.f22652a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.V0(this.f22652a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.b f22654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22655b;

        o(IdentityEditorLayout.b bVar, boolean z10) {
            super("updateIdentityIconState", OneExecutionStateStrategy.class);
            this.f22654a = bVar;
            this.f22655b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.q2(this.f22654a, this.f22655b);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.p$p, reason: collision with other inner class name */
    public class C0349p extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22657a;

        C0349p(boolean z10) {
            super("updateIdentityInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22657a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.X0(this.f22657a);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22659a;

        q(String str) {
            super("updateIdentityInheritanceName", OneExecutionStateStrategy.class);
            this.f22659a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.Z0(this.f22659a);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22661a;

        r(boolean z10) {
            super("updateIdentitySectionState", OneExecutionStateStrategy.class);
            this.f22661a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.k2(this.f22661a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.IdentityEditorMode f22663a;

        s(IdentityEditorLayout.IdentityEditorMode identityEditorMode) {
            super("updateIdentitySectionVisibility", OneExecutionStateStrategy.class);
            this.f22663a = identityEditorMode;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.l1(this.f22663a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22665a;

        t(String str) {
            super("updateInheritedPassword", OneExecutionStateStrategy.class);
            this.f22665a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.W0(this.f22665a);
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22667a;

        u(String str) {
            super("updateInheritedUsername", OneExecutionStateStrategy.class);
            this.f22667a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.D2(this.f22667a);
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22669a;

        v(String str) {
            super("updatePassword", OneExecutionStateStrategy.class);
            this.f22669a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.E0(this.f22669a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22671a;

        w(boolean z10) {
            super("updatePasswordInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22671a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.J0(this.f22671a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22673a;

        x(String str) {
            super("updatePasswordInheritanceName", OneExecutionStateStrategy.class);
            this.f22673a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.G0(this.f22673a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22675a;

        y(boolean z10) {
            super("updatePasswordSectionState", OneExecutionStateStrategy.class);
            this.f22675a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.d2(this.f22675a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22677a;

        z(boolean z10) {
            super("updatePasswordSectionVisibility", OneExecutionStateStrategy.class);
            this.f22677a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.q qVar) {
            qVar.t1(this.f22677a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void D2(String str) {
        u uVar = new u(str);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).D2(str);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void E0(String str) {
        v vVar = new v(str);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).E0(str);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void F2(String str) {
        a0 a0Var = new a0(str);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).F2(str);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void G0(String str) {
        x xVar = new x(str);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).G0(str);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void G2(boolean z10) {
        m mVar = new m(z10);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).G2(z10);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void I0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).I0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void J0(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).J0(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void Ld(String str, String str2) {
        k kVar = new k(str, str2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).Ld(str, str2);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void N0(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).N0(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void V0(boolean z10) {
        n nVar = new n(z10);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).V0(z10);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void W0(String str) {
        t tVar = new t(str);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).W0(str);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void X0(boolean z10) {
        C0349p c0349p = new C0349p(z10);
        this.viewCommands.beforeApply(c0349p);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).X0(z10);
        }
        this.viewCommands.afterApply(c0349p);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void Z0(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).Z0(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void a1(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).a1(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void a6() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).a6();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void d2(boolean z10) {
        y yVar = new y(z10);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).d2(z10);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void de() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).de();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void f2(qq.a aVar, boolean z10) {
        c cVar = new c(aVar, z10);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).f2(aVar, z10);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void h2() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).h2();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void i2(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).i2(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void k2(boolean z10) {
        r rVar = new r(z10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).k2(z10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void l1(IdentityEditorLayout.IdentityEditorMode identityEditorMode) {
        s sVar = new s(identityEditorMode);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).l1(identityEditorMode);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void oe(String str, String str2) {
        j jVar = new j(str, str2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).oe(str, str2);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void q2(IdentityEditorLayout.b bVar, boolean z10) {
        o oVar = new o(bVar, z10);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).q2(bVar, z10);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void t1(boolean z10) {
        z zVar = new z(z10);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).t1(z10);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void u2(String str) {
        c0 c0Var = new c0(str);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).u2(str);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void w4() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).w4();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void x0(boolean z10) {
        g gVar = new g(z10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).x0(z10);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.q
    public void y1(boolean z10) {
        b0 b0Var = new b0(z10);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.q) it.next()).y1(z10);
        }
        this.viewCommands.afterApply(b0Var);
    }
}

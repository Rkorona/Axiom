package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.proxy.Proxy;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdSettingsData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.widget.editors.IdentityEditorLayout;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class n extends MvpViewState<com.server.auditor.ssh.client.contracts.o> implements com.server.auditor.ssh.client.contracts.o {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        a() {
            super("clearEditingEnvironmentVariable", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.T5();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22447a;

        a0(boolean z10) {
            super("updateCredentialsModeSelectorVisibility", OneExecutionStateStrategy.class);
            this.f22447a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.V0(this.f22447a);
        }
    }

    public class a1 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22449a;

        a1(boolean z10) {
            super("updateUsernameInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22449a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.y1(this.f22449a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        b() {
            super("concealPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.I0();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f22455d;

        b0(String str, boolean z10, String str2, String str3) {
            super("updateCredentialsViewByAttachedSshId", OneExecutionStateStrategy.class);
            this.f22452a = str;
            this.f22453b = z10;
            this.f22454c = str2;
            this.f22455d = str3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.X7(this.f22452a, this.f22453b, this.f22454c, this.f22455d);
        }
    }

    public class b1 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22457a;

        b1(String str) {
            super("updateUsernameInheritanceName", OneExecutionStateStrategy.class);
            this.f22457a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.u2(this.f22457a);
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        c() {
            super("hideUsernameAndPasswordFields", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.A7();
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ut.u> f22460a;

        c0(List<ut.u> list) {
            super("updateEnvironmentVariables", OneExecutionStateStrategy.class);
            this.f22460a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.p7(this.f22460a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        d() {
            super("navigateToPinUnlockScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.h2();
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.b f22463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22464b;

        d0(IdentityEditorLayout.b bVar, boolean z10) {
            super("updateIdentityIconState", OneExecutionStateStrategy.class);
            this.f22463a = bVar;
            this.f22464b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.q2(this.f22463a, this.f22464b);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.a f22466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22467b;

        e(qq.a aVar, boolean z10) {
            super("openCredentialsModeSelector", OneExecutionStateStrategy.class);
            this.f22466a = aVar;
            this.f22467b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.f2(this.f22466a, this.f22467b);
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22469a;

        e0(boolean z10) {
            super("updateIdentityInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22469a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.X0(this.f22469a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22471a;

        f(VaultKeyId vaultKeyId) {
            super("openHostChainEditorScreen", OneExecutionStateStrategy.class);
            this.f22471a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.o7(this.f22471a);
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22473a;

        f0(String str) {
            super("updateIdentityInheritanceName", OneExecutionStateStrategy.class);
            this.f22473a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.Z0(this.f22473a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        g() {
            super("openMultikeyEditor", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.a7();
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22476a;

        g0(boolean z10) {
            super("updateIdentitySectionState", OneExecutionStateStrategy.class);
            this.f22476a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.k2(this.f22476a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Proxy f22478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VaultKeyId f22479b;

        h(Proxy proxy, VaultKeyId vaultKeyId) {
            super("openProxyEditorScreen", OneExecutionStateStrategy.class);
            this.f22478a = proxy;
            this.f22479b = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.V3(this.f22478a, this.f22479b);
        }
    }

    public class h0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.IdentityEditorMode f22481a;

        h0(IdentityEditorLayout.IdentityEditorMode identityEditorMode) {
            super("updateIdentitySectionVisibility", OneExecutionStateStrategy.class);
            this.f22481a = identityEditorMode;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.l1(this.f22481a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22483a;

        i(VaultKeyId vaultKeyId) {
            super("openSnippetPickerManager", OneExecutionStateStrategy.class);
            this.f22483a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.ob(this.f22483a);
        }
    }

    public class i0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22485a;

        i0(String str) {
            super("updateInheritedPassword", OneExecutionStateStrategy.class);
            this.f22485a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.W0(this.f22485a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        j() {
            super("revealPassword", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.de();
        }
    }

    public class j0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22488a;

        j0(String str) {
            super("updateInheritedUsername", OneExecutionStateStrategy.class);
            this.f22488a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.D2(this.f22488a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22490a;

        k(boolean z10) {
            super("setDetachSshIdButtonVisibility", OneExecutionStateStrategy.class);
            this.f22490a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.Ye(this.f22490a);
        }
    }

    public class k0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.d f22492a;

        k0(IdentityEditorLayout.d dVar) {
            super("updateKeyContainerHint", OneExecutionStateStrategy.class);
            this.f22492a = dVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.pd(this.f22492a);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        l() {
            super("showCharsetSelectorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.a6();
        }
    }

    public class l0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22495a;

        l0(boolean z10) {
            super("updateKeyContainerVisibility", OneExecutionStateStrategy.class);
            this.f22495a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.R3(this.f22495a);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        m() {
            super("showColorSchemeSelectorScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.w4();
        }
    }

    public class m0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.c f22498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22499b;

        m0(IdentityEditorLayout.c cVar, boolean z10) {
            super("updateKeyIconState", OneExecutionStateStrategy.class);
            this.f22498a = cVar;
            this.f22499b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.b8(this.f22498a, this.f22499b);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.n$n, reason: collision with other inner class name */
    public class C0348n extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {
        C0348n() {
            super("showCreateVariableEditor", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.A9();
        }
    }

    public class n0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22502a;

        n0(boolean z10) {
            super("updateKeyInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22502a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.qb(this.f22502a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22504a;

        o(boolean z10) {
            super("showIdentitySelectorScreen", OneExecutionStateStrategy.class);
            this.f22504a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.x0(this.f22504a);
        }
    }

    public class o0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22506a;

        o0(String str) {
            super("updateKeyInheritanceName", OneExecutionStateStrategy.class);
            this.f22506a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.q8(this.f22506a);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22508a;

        p(boolean z10) {
            super("showKeySelectorScreen", OneExecutionStateStrategy.class);
            this.f22508a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.T4(this.f22508a);
        }
    }

    public class p0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22510a;

        p0(boolean z10) {
            super("updateKeySectionState", OneExecutionStateStrategy.class);
            this.f22510a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.ja(this.f22510a);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SshIdSettingsData f22512a;

        q(SshIdSettingsData sshIdSettingsData) {
            super("showSshIdParametersScreen", OneExecutionStateStrategy.class);
            this.f22512a = sshIdSettingsData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.x9(this.f22512a);
        }
    }

    public class q0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22514a;

        q0(String str) {
            super("updateMultikeyInfo", OneExecutionStateStrategy.class);
            this.f22514a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.W8(this.f22514a);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22518c;

        r(String str, String str2, int i10) {
            super("showVariablesEditor", OneExecutionStateStrategy.class);
            this.f22516a = str;
            this.f22517b = str2;
            this.f22518c = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.e4(this.f22516a, this.f22517b, this.f22518c);
        }
    }

    public class r0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22520a;

        r0(boolean z10) {
            super("updateMultikeyVisibility", OneExecutionStateStrategy.class);
            this.f22520a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.l5(this.f22520a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22522a;

        s(String str) {
            super("updateAttachedIdentityName", OneExecutionStateStrategy.class);
            this.f22522a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.i2(this.f22522a);
        }
    }

    public class s0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22524a;

        s0(String str) {
            super("updatePassword", OneExecutionStateStrategy.class);
            this.f22524a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.E0(this.f22524a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22526a;

        t(String str) {
            super("updateAttachedInheritedIdentityName", OneExecutionStateStrategy.class);
            this.f22526a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.N0(this.f22526a);
        }
    }

    public class t0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22528a;

        t0(boolean z10) {
            super("updatePasswordInheritanceInfoVisibility", OneExecutionStateStrategy.class);
            this.f22528a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.J0(this.f22528a);
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22530a;

        u(String str) {
            super("updateAttachedInheritedKeyName", OneExecutionStateStrategy.class);
            this.f22530a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.Gb(this.f22530a);
        }
    }

    public class u0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22532a;

        u0(String str) {
            super("updatePasswordInheritanceName", OneExecutionStateStrategy.class);
            this.f22532a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.G0(this.f22532a);
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22534a;

        v(String str) {
            super("updateAttachedKeyName", OneExecutionStateStrategy.class);
            this.f22534a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.f3(this.f22534a);
        }
    }

    public class v0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22536a;

        v0(boolean z10) {
            super("updatePasswordSectionState", OneExecutionStateStrategy.class);
            this.f22536a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.d2(this.f22536a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22539b;

        w(String str, String str2) {
            super("updateCharsetData", OneExecutionStateStrategy.class);
            this.f22538a = str;
            this.f22539b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.oe(this.f22538a, this.f22539b);
        }
    }

    public class w0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22541a;

        w0(boolean z10) {
            super("updatePasswordSectionVisibility", OneExecutionStateStrategy.class);
            this.f22541a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.t1(this.f22541a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22544b;

        x(String str, String str2) {
            super("updateColorSchemeData", OneExecutionStateStrategy.class);
            this.f22543a = str;
            this.f22544b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.Ld(this.f22543a, this.f22544b);
        }
    }

    public class x0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdentityEditorLayout.d f22546a;

        x0(IdentityEditorLayout.d dVar) {
            super("updateSshIdTagsViewVisibilityByKeySectionState", OneExecutionStateStrategy.class);
            this.f22546a = dVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.f4(this.f22546a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22548a;

        y(String str) {
            super("updateCredentialsMode", OneExecutionStateStrategy.class);
            this.f22548a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.a1(this.f22548a);
        }
    }

    public class y0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22550a;

        y0(VaultKeyId vaultKeyId) {
            super("updateStateOfLayouts", OneExecutionStateStrategy.class);
            this.f22550a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.Gd(this.f22550a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22552a;

        z(boolean z10) {
            super("updateCredentialsModeSelectorState", OneExecutionStateStrategy.class);
            this.f22552a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.G2(this.f22552a);
        }
    }

    public class z0 extends ViewCommand<com.server.auditor.ssh.client.contracts.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22554a;

        z0(String str) {
            super("updateUsername", OneExecutionStateStrategy.class);
            this.f22554a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.o oVar) {
            oVar.F2(this.f22554a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void A7() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).A7();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void A9() {
        C0348n c0348n = new C0348n();
        this.viewCommands.beforeApply(c0348n);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).A9();
        }
        this.viewCommands.afterApply(c0348n);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void D2(String str) {
        j0 j0Var = new j0(str);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).D2(str);
        }
        this.viewCommands.afterApply(j0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void E0(String str) {
        s0 s0Var = new s0(str);
        this.viewCommands.beforeApply(s0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).E0(str);
        }
        this.viewCommands.afterApply(s0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void F2(String str) {
        z0 z0Var = new z0(str);
        this.viewCommands.beforeApply(z0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).F2(str);
        }
        this.viewCommands.afterApply(z0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void G0(String str) {
        u0 u0Var = new u0(str);
        this.viewCommands.beforeApply(u0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).G0(str);
        }
        this.viewCommands.afterApply(u0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void G2(boolean z10) {
        z zVar = new z(z10);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).G2(z10);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void Gb(String str) {
        u uVar = new u(str);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).Gb(str);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void Gd(VaultKeyId vaultKeyId) {
        y0 y0Var = new y0(vaultKeyId);
        this.viewCommands.beforeApply(y0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).Gd(vaultKeyId);
        }
        this.viewCommands.afterApply(y0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void I0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).I0();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void J0(boolean z10) {
        t0 t0Var = new t0(z10);
        this.viewCommands.beforeApply(t0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).J0(z10);
        }
        this.viewCommands.afterApply(t0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void Ld(String str, String str2) {
        x xVar = new x(str, str2);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).Ld(str, str2);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void N0(String str) {
        t tVar = new t(str);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).N0(str);
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void R3(boolean z10) {
        l0 l0Var = new l0(z10);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).R3(z10);
        }
        this.viewCommands.afterApply(l0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void T4(boolean z10) {
        p pVar = new p(z10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).T4(z10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void T5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).T5();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void V0(boolean z10) {
        a0 a0Var = new a0(z10);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).V0(z10);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void V3(Proxy proxy, VaultKeyId vaultKeyId) {
        h hVar = new h(proxy, vaultKeyId);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).V3(proxy, vaultKeyId);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void W0(String str) {
        i0 i0Var = new i0(str);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).W0(str);
        }
        this.viewCommands.afterApply(i0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void W8(String str) {
        q0 q0Var = new q0(str);
        this.viewCommands.beforeApply(q0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).W8(str);
        }
        this.viewCommands.afterApply(q0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void X0(boolean z10) {
        e0 e0Var = new e0(z10);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).X0(z10);
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void X7(String str, boolean z10, String str2, String str3) {
        b0 b0Var = new b0(str, z10, str2, str3);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).X7(str, z10, str2, str3);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void Ye(boolean z10) {
        k kVar = new k(z10);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).Ye(z10);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void Z0(String str) {
        f0 f0Var = new f0(str);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).Z0(str);
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void a1(String str) {
        y yVar = new y(str);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).a1(str);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void a6() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).a6();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void a7() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).a7();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void b8(IdentityEditorLayout.c cVar, boolean z10) {
        m0 m0Var = new m0(cVar, z10);
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).b8(cVar, z10);
        }
        this.viewCommands.afterApply(m0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void d2(boolean z10) {
        v0 v0Var = new v0(z10);
        this.viewCommands.beforeApply(v0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).d2(z10);
        }
        this.viewCommands.afterApply(v0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void de() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).de();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void e4(String str, String str2, int i10) {
        r rVar = new r(str, str2, i10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).e4(str, str2, i10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void f2(qq.a aVar, boolean z10) {
        e eVar = new e(aVar, z10);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).f2(aVar, z10);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void f3(String str) {
        v vVar = new v(str);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).f3(str);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void f4(IdentityEditorLayout.d dVar) {
        x0 x0Var = new x0(dVar);
        this.viewCommands.beforeApply(x0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).f4(dVar);
        }
        this.viewCommands.afterApply(x0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void h2() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).h2();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void i2(String str) {
        s sVar = new s(str);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).i2(str);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void ja(boolean z10) {
        p0 p0Var = new p0(z10);
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).ja(z10);
        }
        this.viewCommands.afterApply(p0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void k2(boolean z10) {
        g0 g0Var = new g0(z10);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).k2(z10);
        }
        this.viewCommands.afterApply(g0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void l1(IdentityEditorLayout.IdentityEditorMode identityEditorMode) {
        h0 h0Var = new h0(identityEditorMode);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).l1(identityEditorMode);
        }
        this.viewCommands.afterApply(h0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void l5(boolean z10) {
        r0 r0Var = new r0(z10);
        this.viewCommands.beforeApply(r0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).l5(z10);
        }
        this.viewCommands.afterApply(r0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void o7(VaultKeyId vaultKeyId) {
        f fVar = new f(vaultKeyId);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).o7(vaultKeyId);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void ob(VaultKeyId vaultKeyId) {
        i iVar = new i(vaultKeyId);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).ob(vaultKeyId);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void oe(String str, String str2) {
        w wVar = new w(str, str2);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).oe(str, str2);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void p7(List<ut.u> list) {
        c0 c0Var = new c0(list);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).p7(list);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void pd(IdentityEditorLayout.d dVar) {
        k0 k0Var = new k0(dVar);
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).pd(dVar);
        }
        this.viewCommands.afterApply(k0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void q2(IdentityEditorLayout.b bVar, boolean z10) {
        d0 d0Var = new d0(bVar, z10);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).q2(bVar, z10);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void q8(String str) {
        o0 o0Var = new o0(str);
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).q8(str);
        }
        this.viewCommands.afterApply(o0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void qb(boolean z10) {
        n0 n0Var = new n0(z10);
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).qb(z10);
        }
        this.viewCommands.afterApply(n0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void t1(boolean z10) {
        w0 w0Var = new w0(z10);
        this.viewCommands.beforeApply(w0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).t1(z10);
        }
        this.viewCommands.afterApply(w0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void u2(String str) {
        b1 b1Var = new b1(str);
        this.viewCommands.beforeApply(b1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).u2(str);
        }
        this.viewCommands.afterApply(b1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m
    public void w4() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).w4();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void x0(boolean z10) {
        o oVar = new o(z10);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).x0(z10);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void x9(SshIdSettingsData sshIdSettingsData) {
        q qVar = new q(sshIdSettingsData);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).x9(sshIdSettingsData);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.o
    public void y1(boolean z10) {
        a1 a1Var = new a1(z10);
        this.viewCommands.beforeApply(a1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.o) it.next()).y1(z10);
        }
        this.viewCommands.afterApply(a1Var);
    }
}

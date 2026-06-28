package com.server.auditor.ssh.client.contracts.sshkey;

import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import tl.l2;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<com.server.auditor.ssh.client.contracts.sshkey.d> implements com.server.auditor.ssh.client.contracts.sshkey.d {

    public class a extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        a() {
            super("clearPassphraseViews", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Kc();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        a0() {
            super("showPassphraseError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Tb();
        }
    }

    public class a1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22935a;

        a1(String str) {
            super("updateKeyName", AddToEndSingleStrategy.class);
            this.f22935a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.E2(this.f22935a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        b() {
            super("closeVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.I();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22938a;

        b0(boolean z10) {
            super("showPassphrasePopup", OneExecutionStateStrategy.class);
            this.f22938a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.z3(this.f22938a);
        }
    }

    public class b1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22940a;

        b1(String str) {
            super("updateKeyNamePlaceholder", AddToEndSingleStrategy.class);
            this.f22940a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.R0(this.f22940a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.sshkey.c$c, reason: collision with other inner class name */
    public class C0355c extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        C0355c() {
            super("concealCertificate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.y0();
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22943a;

        c0(String str) {
            super("showPasteCertificateScreen", OneExecutionStateStrategy.class);
            this.f22943a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.w0(this.f22943a);
        }
    }

    public class c1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22945a;

        c1(String str) {
            super("updateKeyType", AddToEndSingleStrategy.class);
            this.f22945a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.E5(this.f22945a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        d() {
            super("concealPassphrase", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.cc();
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22948a;

        d0(String str) {
            super("showPastePrivateKeyScreen", OneExecutionStateStrategy.class);
            this.f22948a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.U3(this.f22948a);
        }
    }

    public class d1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22950a;

        d1(boolean z10) {
            super("updateLoadingDialogVisibility", AddToEndSingleStrategy.class);
            this.f22950a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.t2(this.f22950a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        e() {
            super("concealPrivateKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.I3();
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        e0() {
            super("showPrivateKeyImportBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.N5();
        }
    }

    public class e1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22954a;

        e1(boolean z10) {
            super("updateMoreMenuVisibility", AddToEndSingleStrategy.class);
            this.f22954a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.P4(this.f22954a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        f() {
            super("concealPublicKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.U1();
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        f0() {
            super("showPrivateKeyIsNotAttachedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.E8();
        }
    }

    public class f1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22958a;

        f1(String str) {
            super("updatePassphrase", AddToEndSingleStrategy.class);
            this.f22958a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Lc(this.f22958a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        g() {
            super("finishFlowCanceled", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.ud();
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        g0() {
            super("showPrivateKeyPopup", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Fe();
        }
    }

    public class g1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22962a;

        g1(boolean z10) {
            super("updatePassphraseVisibility", AddToEndSingleStrategy.class);
            this.f22962a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Ze(this.f22962a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22964a;

        h(long j10) {
            super("finishFlow", OneExecutionStateStrategy.class);
            this.f22964a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Td(this.f22964a);
        }
    }

    public class h0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        h0() {
            super("showPublicKeyPopup", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.b4();
        }
    }

    public class h1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22967a;

        h1(String str) {
            super("updatePrivateKey", AddToEndSingleStrategy.class);
            this.f22967a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.o9(this.f22967a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22969a;

        i(boolean z10) {
            super("initView", AddToEndSingleStrategy.class);
            this.f22969a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.V7(this.f22969a);
        }
    }

    public class i0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22971a;

        i0(String str) {
            super("showReadonlyPassphrase", OneExecutionStateStrategy.class);
            this.f22971a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.xe(this.f22971a);
        }
    }

    public class i1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u9.a f22973a;

        i1(u9.a aVar) {
            super("updatePrivateKeyIcon", AddToEndSingleStrategy.class);
            this.f22973a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Od(this.f22973a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<TypedEntityIdentifier> f22975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22976b;

        j(List<TypedEntityIdentifier> list, String str) {
            super("navigateToSetupTeamVaultFlow", OneExecutionStateStrategy.class);
            this.f22975a = list;
            this.f22976b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.zd(this.f22975a, this.f22976b);
        }
    }

    public class j0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22979b;

        j0(String str, boolean z10) {
            super("showRequestPassphraseForExport", OneExecutionStateStrategy.class);
            this.f22978a = str;
            this.f22979b = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Qd(this.f22978a, this.f22979b);
        }
    }

    public class j1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22981a;

        j1(boolean z10) {
            super("updatePrivateKeyVisibility", AddToEndSingleStrategy.class);
            this.f22981a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.k9(this.f22981a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        k() {
            super("resetPassphraseError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.J9();
        }
    }

    public class k0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        k0() {
            super("showSavedToFileToast", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.A8();
        }
    }

    public class k1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22985a;

        k1(String str) {
            super("updatePublicKeyView", AddToEndSingleStrategy.class);
            this.f22985a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.u4(this.f22985a);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        l() {
            super("revealCertificate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.X1();
        }
    }

    public class l0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22988a;

        l0(VaultKeyId vaultKeyId) {
            super("showSshKeyHostSelector", OneExecutionStateStrategy.class);
            this.f22988a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.h5(this.f22988a);
        }
    }

    public class l1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22990a;

        l1(boolean z10) {
            super("updateSaveButtonVisibility", AddToEndSingleStrategy.class);
            this.f22990a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.J4(this.f22990a);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        m() {
            super("revealPassphrase", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.m1();
        }
    }

    public class m0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.b f22993a;

        m0(qq.b bVar) {
            super("showVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
            this.f22993a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.B(this.f22993a);
        }
    }

    public class m1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22995a;

        m1(boolean z10) {
            super("updateSshKeyPanelVisibility", AddToEndSingleStrategy.class);
            this.f22995a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.cf(this.f22995a);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        n() {
            super("revealPrivateKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.y4();
        }
    }

    public class n0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        n0() {
            super("showVaultSelectorSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.v9();
        }
    }

    public class n1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u9.a f22999a;

        n1(u9.a aVar) {
            super("updateTitle", AddToEndSingleStrategy.class);
            this.f22999a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.yd(this.f22999a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        o() {
            super("revealPublicKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.k0();
        }
    }

    public class o0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SshKeyDBModel f23002a;

        o0(SshKeyDBModel sshKeyDBModel) {
            super("startExportToHost", OneExecutionStateStrategy.class);
            this.f23002a = sshKeyDBModel;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.n1(this.f23002a);
        }
    }

    public class o1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f23004a;

        o1(VaultKeyId vaultKeyId) {
            super("updateVaultSelectorAsLocked", AddToEndSingleStrategy.class);
            this.f23004a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.La(this.f23004a);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23007b;

        p(String str, String str2) {
            super("savePublicKeyAsFile", OneExecutionStateStrategy.class);
            this.f23006a = str;
            this.f23007b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Fb(this.f23006a, this.f23007b);
        }
    }

    public class p0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23009a;

        p0(boolean z10) {
            super("updateAddCertificateButtonVisibility", AddToEndSingleStrategy.class);
            this.f23009a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.v2(this.f23009a);
        }
    }

    public class p1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f23011a;

        p1(VaultKeyId vaultKeyId) {
            super("updateVaultSelectorValue", AddToEndSingleStrategy.class);
            this.f23011a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.q4(this.f23011a);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23013a;

        q(String str) {
            super("sendSharePublicKeyIntent", OneExecutionStateStrategy.class);
            this.f23013a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.N9(this.f23013a);
        }
    }

    public class q0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23015a;

        q0(boolean z10) {
            super("updateAddPrivateKeyButtonVisibility", AddToEndSingleStrategy.class);
            this.f23015a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.p3(this.f23015a);
        }
    }

    public class q1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<l2> f23018b;

        q1(boolean z10, List<l2> list) {
            super("updateVaultSelectorVisibility", AddToEndSingleStrategy.class);
            this.f23017a = z10;
            this.f23018b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.w3(this.f23017a, this.f23018b);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        r() {
            super("showCertificateImportBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.l2();
        }
    }

    public class r0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> f23021a;

        r0(List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> list) {
            super("updateAttachedToList", AddToEndSingleStrategy.class);
            this.f23021a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.k1(this.f23021a);
        }
    }

    public class r1 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23023a;

        r1(boolean z10) {
            super("updateVisibilityAttachedToPanel", AddToEndSingleStrategy.class);
            this.f23023a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.o1(this.f23023a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23025a;

        s(boolean z10) {
            super("showCertificatePopup", OneExecutionStateStrategy.class);
            this.f23025a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.ec(this.f23025a);
        }
    }

    public class s0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f23027a;

        s0(Long l10) {
            super("updateCertificateExpireDate", AddToEndSingleStrategy.class);
            this.f23027a = l10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.G1(this.f23027a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        t() {
            super("showDeleteAttachedConfirmation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.R1();
        }
    }

    public class t0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23030a;

        t0(boolean z10) {
            super("updateCertificateIcon", AddToEndSingleStrategy.class);
            this.f23030a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.M0(this.f23030a);
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        u() {
            super("showDeleteConfirmation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.H2();
        }
    }

    public class u0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23033a;

        u0(boolean z10) {
            super("updateCertificatePanelVisibility", AddToEndSingleStrategy.class);
            this.f23033a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.h1(this.f23033a);
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final VaultKeyId f23037c;

        v(boolean z10, String str, VaultKeyId vaultKeyId) {
            super("showExportPublicKeyBottomSheet", OneExecutionStateStrategy.class);
            this.f23035a = z10;
            this.f23036b = str;
            this.f23037c = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.W6(this.f23035a, this.f23036b, this.f23037c);
        }
    }

    public class v0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23039a;

        v0(String str) {
            super("updateCertificateText", AddToEndSingleStrategy.class);
            this.f23039a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.O1(this.f23039a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        w() {
            super("showFailedToGeneratePublicKeyFromUnknownKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.Be();
        }
    }

    public class w0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23042a;

        w0(boolean z10) {
            super("updateExpandedAttachedToPanel", AddToEndSingleStrategy.class);
            this.f23042a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.p1(this.f23042a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        x() {
            super("showFailedToSaveToFileToast", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.i9();
        }
    }

    public class x0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23045a;

        x0(boolean z10) {
            super("updateExportButtonVisibility", AddToEndSingleStrategy.class);
            this.f23045a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.P6(this.f23045a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        y() {
            super("showImportCertificateFromFile", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.F1();
        }
    }

    public class y0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23048a;

        y0(String str) {
            super("updateFingerprint", AddToEndSingleStrategy.class);
            this.f23048a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.C6(this.f23048a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {
        z() {
            super("showImportPrivateKeyFromFile", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.F8();
        }
    }

    public class z0 extends ViewCommand<com.server.auditor.ssh.client.contracts.sshkey.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23051a;

        z0(boolean z10) {
            super("updateHasPublicKey", AddToEndSingleStrategy.class);
            this.f23051a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.sshkey.d dVar) {
            dVar.jb(this.f23051a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void A8() {
        k0 k0Var = new k0();
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).A8();
        }
        this.viewCommands.afterApply(k0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void B(qq.b bVar) {
        m0 m0Var = new m0(bVar);
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).B(bVar);
        }
        this.viewCommands.afterApply(m0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Be() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Be();
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void C6(String str) {
        y0 y0Var = new y0(str);
        this.viewCommands.beforeApply(y0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).C6(str);
        }
        this.viewCommands.afterApply(y0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void E2(String str) {
        a1 a1Var = new a1(str);
        this.viewCommands.beforeApply(a1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).E2(str);
        }
        this.viewCommands.afterApply(a1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void E5(String str) {
        c1 c1Var = new c1(str);
        this.viewCommands.beforeApply(c1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).E5(str);
        }
        this.viewCommands.afterApply(c1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void E8() {
        f0 f0Var = new f0();
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).E8();
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void F1() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).F1();
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void F8() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).F8();
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Fb(String str, String str2) {
        p pVar = new p(str, str2);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Fb(str, str2);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Fe() {
        g0 g0Var = new g0();
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Fe();
        }
        this.viewCommands.afterApply(g0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void G1(Long l10) {
        s0 s0Var = new s0(l10);
        this.viewCommands.beforeApply(s0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).G1(l10);
        }
        this.viewCommands.afterApply(s0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void H2() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).H2();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void I() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).I();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void I3() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).I3();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void J4(boolean z10) {
        l1 l1Var = new l1(z10);
        this.viewCommands.beforeApply(l1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).J4(z10);
        }
        this.viewCommands.afterApply(l1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void J9() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).J9();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Kc() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Kc();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void La(VaultKeyId vaultKeyId) {
        o1 o1Var = new o1(vaultKeyId);
        this.viewCommands.beforeApply(o1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).La(vaultKeyId);
        }
        this.viewCommands.afterApply(o1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Lc(String str) {
        f1 f1Var = new f1(str);
        this.viewCommands.beforeApply(f1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Lc(str);
        }
        this.viewCommands.afterApply(f1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void M0(boolean z10) {
        t0 t0Var = new t0(z10);
        this.viewCommands.beforeApply(t0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).M0(z10);
        }
        this.viewCommands.afterApply(t0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void N5() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).N5();
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void N9(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).N9(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void O1(String str) {
        v0 v0Var = new v0(str);
        this.viewCommands.beforeApply(v0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).O1(str);
        }
        this.viewCommands.afterApply(v0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Od(u9.a aVar) {
        i1 i1Var = new i1(aVar);
        this.viewCommands.beforeApply(i1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Od(aVar);
        }
        this.viewCommands.afterApply(i1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void P4(boolean z10) {
        e1 e1Var = new e1(z10);
        this.viewCommands.beforeApply(e1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).P4(z10);
        }
        this.viewCommands.afterApply(e1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void P6(boolean z10) {
        x0 x0Var = new x0(z10);
        this.viewCommands.beforeApply(x0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).P6(z10);
        }
        this.viewCommands.afterApply(x0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Qd(String str, boolean z10) {
        j0 j0Var = new j0(str, z10);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Qd(str, z10);
        }
        this.viewCommands.afterApply(j0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void R0(String str) {
        b1 b1Var = new b1(str);
        this.viewCommands.beforeApply(b1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).R0(str);
        }
        this.viewCommands.afterApply(b1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void R1() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).R1();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Tb() {
        a0 a0Var = new a0();
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Tb();
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Td(long j10) {
        h hVar = new h(j10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Td(j10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void U1() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).U1();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void U3(String str) {
        d0 d0Var = new d0(str);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).U3(str);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void V7(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).V7(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void W6(boolean z10, String str, VaultKeyId vaultKeyId) {
        v vVar = new v(z10, str, vaultKeyId);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).W6(z10, str, vaultKeyId);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void X1() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).X1();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void Ze(boolean z10) {
        g1 g1Var = new g1(z10);
        this.viewCommands.beforeApply(g1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).Ze(z10);
        }
        this.viewCommands.afterApply(g1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void b4() {
        h0 h0Var = new h0();
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).b4();
        }
        this.viewCommands.afterApply(h0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void cc() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).cc();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void cf(boolean z10) {
        m1 m1Var = new m1(z10);
        this.viewCommands.beforeApply(m1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).cf(z10);
        }
        this.viewCommands.afterApply(m1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void ec(boolean z10) {
        s sVar = new s(z10);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).ec(z10);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void h1(boolean z10) {
        u0 u0Var = new u0(z10);
        this.viewCommands.beforeApply(u0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).h1(z10);
        }
        this.viewCommands.afterApply(u0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void h5(VaultKeyId vaultKeyId) {
        l0 l0Var = new l0(vaultKeyId);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).h5(vaultKeyId);
        }
        this.viewCommands.afterApply(l0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void i9() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).i9();
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void jb(boolean z10) {
        z0 z0Var = new z0(z10);
        this.viewCommands.beforeApply(z0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).jb(z10);
        }
        this.viewCommands.afterApply(z0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void k0() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).k0();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void k1(List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> list) {
        r0 r0Var = new r0(list);
        this.viewCommands.beforeApply(r0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).k1(list);
        }
        this.viewCommands.afterApply(r0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void k9(boolean z10) {
        j1 j1Var = new j1(z10);
        this.viewCommands.beforeApply(j1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).k9(z10);
        }
        this.viewCommands.afterApply(j1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void l2() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).l2();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void m1() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).m1();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void n1(SshKeyDBModel sshKeyDBModel) {
        o0 o0Var = new o0(sshKeyDBModel);
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).n1(sshKeyDBModel);
        }
        this.viewCommands.afterApply(o0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void o1(boolean z10) {
        r1 r1Var = new r1(z10);
        this.viewCommands.beforeApply(r1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).o1(z10);
        }
        this.viewCommands.afterApply(r1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void o9(String str) {
        h1 h1Var = new h1(str);
        this.viewCommands.beforeApply(h1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).o9(str);
        }
        this.viewCommands.afterApply(h1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void p1(boolean z10) {
        w0 w0Var = new w0(z10);
        this.viewCommands.beforeApply(w0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).p1(z10);
        }
        this.viewCommands.afterApply(w0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void p3(boolean z10) {
        q0 q0Var = new q0(z10);
        this.viewCommands.beforeApply(q0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).p3(z10);
        }
        this.viewCommands.afterApply(q0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void q4(VaultKeyId vaultKeyId) {
        p1 p1Var = new p1(vaultKeyId);
        this.viewCommands.beforeApply(p1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).q4(vaultKeyId);
        }
        this.viewCommands.afterApply(p1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void t2(boolean z10) {
        d1 d1Var = new d1(z10);
        this.viewCommands.beforeApply(d1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).t2(z10);
        }
        this.viewCommands.afterApply(d1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void u4(String str) {
        k1 k1Var = new k1(str);
        this.viewCommands.beforeApply(k1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).u4(str);
        }
        this.viewCommands.afterApply(k1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void ud() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).ud();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void v2(boolean z10) {
        p0 p0Var = new p0(z10);
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).v2(z10);
        }
        this.viewCommands.afterApply(p0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void v9() {
        n0 n0Var = new n0();
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).v9();
        }
        this.viewCommands.afterApply(n0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void w0(String str) {
        c0 c0Var = new c0(str);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).w0(str);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void w3(boolean z10, List<l2> list) {
        q1 q1Var = new q1(z10, list);
        this.viewCommands.beforeApply(q1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).w3(z10, list);
        }
        this.viewCommands.afterApply(q1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void xe(String str) {
        i0 i0Var = new i0(str);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).xe(str);
        }
        this.viewCommands.afterApply(i0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void y0() {
        C0355c c0355c = new C0355c();
        this.viewCommands.beforeApply(c0355c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).y0();
        }
        this.viewCommands.afterApply(c0355c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void y4() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).y4();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void yd(u9.a aVar) {
        n1 n1Var = new n1(aVar);
        this.viewCommands.beforeApply(n1Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).yd(aVar);
        }
        this.viewCommands.afterApply(n1Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void z3(boolean z10) {
        b0 b0Var = new b0(z10);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).z3(z10);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.sshkey.d
    public void zd(List<TypedEntityIdentifier> list, String str) {
        j jVar = new j(list, str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.sshkey.d) it.next()).zd(list, str);
        }
        this.viewCommands.afterApply(jVar);
    }
}

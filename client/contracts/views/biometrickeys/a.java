package com.server.auditor.ssh.client.contracts.views.biometrickeys;

import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> implements com.server.auditor.ssh.client.contracts.views.biometrickeys.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.biometrickeys.a$a, reason: collision with other inner class name */
    public class C0373a extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        C0373a() {
            super("concealCertificate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.y0();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23329a;

        a0(boolean z10) {
            super("updateCertificatePanelVisibility", AddToEndSingleStrategy.class);
            this.f23329a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.h1(this.f23329a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        b() {
            super("concealPublicKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.U1();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23332a;

        b0(String str) {
            super("updateCertificateText", AddToEndSingleStrategy.class);
            this.f23332a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.O1(this.f23332a);
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        c() {
            super("exitCanceled", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.Tc();
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23335a;

        c0(boolean z10) {
            super("updateDisclaimerVisibility", AddToEndSingleStrategy.class);
            this.f23335a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.kc(this.f23335a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f23337a;

        d(long j10) {
            super("exitScreen", OneExecutionStateStrategy.class);
            this.f23337a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.S8(this.f23337a);
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23339a;

        d0(boolean z10) {
            super("updateExpandedAttachedToPanel", AddToEndSingleStrategy.class);
            this.f23339a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.p1(this.f23339a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23343c;

        e(String str, String str2, String str3) {
            super("initViews", AddToEndSingleStrategy.class);
            this.f23341a = str;
            this.f23342b = str2;
            this.f23343c = str3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.Z5(this.f23341a, this.f23342b, this.f23343c);
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23345a;

        e0(boolean z10) {
            super("updateLoadingDialogVisibility", AddToEndSingleStrategy.class);
            this.f23345a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.t2(this.f23345a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23348b;

        f(String str, String str2) {
            super("navigateToExportAsFile", OneExecutionStateStrategy.class);
            this.f23347a = str;
            this.f23348b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.mb(this.f23347a, this.f23348b);
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23350a;

        f0(boolean z10) {
            super("updateVaultSelectorAsLocked", AddToEndSingleStrategy.class);
            this.f23350a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.Ua(this.f23350a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23353b;

        g(String str, String str2) {
            super("navigateToExportViaEmail", OneExecutionStateStrategy.class);
            this.f23352a = str;
            this.f23353b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.md(this.f23352a, this.f23353b);
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23355a;

        g0(boolean z10) {
            super("updateVisibilityAttachedToPanel", AddToEndSingleStrategy.class);
            this.f23355a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.o1(this.f23355a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        h() {
            super("revealCertificate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.X1();
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        i() {
            super("revealPublicKey", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.k0();
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        j() {
            super("showCertificateImportBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.l2();
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        k() {
            super("showCertificatePopup", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.Pe();
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        l() {
            super("showDeleteAttachedConfirmation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.R1();
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        m() {
            super("showDeleteConfirmation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.H2();
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        n() {
            super("showErrorAlreadyHasAlias", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.I7();
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        o() {
            super("showErrorEmptyAlias", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.F4();
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        p() {
            super("showImportCertificateFromFile", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.F1();
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23366a;

        q(String str) {
            super("showPasteCertificateScreen", OneExecutionStateStrategy.class);
            this.f23366a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.w0(this.f23366a);
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        r() {
            super("showPublicKeyOptionsPopup", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.nb();
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final VaultKeyId f23371c;

        s(boolean z10, String str, VaultKeyId vaultKeyId) {
            super("showSharePublicKeyBottomSheet", OneExecutionStateStrategy.class);
            this.f23369a = z10;
            this.f23370b = str;
            this.f23371c = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.se(this.f23369a, this.f23370b, this.f23371c);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        t() {
            super("showSshKeyHostSelector", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.Qe();
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {
        u() {
            super("showToolbarMorePopup", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.ac();
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SshKeyDBModel f23375a;

        v(SshKeyDBModel sshKeyDBModel) {
            super("startExportToHost", OneExecutionStateStrategy.class);
            this.f23375a = sshKeyDBModel;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.n1(this.f23375a);
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23377a;

        w(boolean z10) {
            super("updateAddCertificateButtonVisibility", AddToEndSingleStrategy.class);
            this.f23377a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.v2(this.f23377a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> f23379a;

        x(List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> list) {
            super("updateAttachedToList", AddToEndSingleStrategy.class);
            this.f23379a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.k1(this.f23379a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f23381a;

        y(Long l10) {
            super("updateCertificateExpireDate", AddToEndSingleStrategy.class);
            this.f23381a = l10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.G1(this.f23381a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.views.biometrickeys.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23383a;

        z(boolean z10) {
            super("updateCertificateIcon", AddToEndSingleStrategy.class);
            this.f23383a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.views.biometrickeys.b bVar) {
            bVar.M0(this.f23383a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void F1() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).F1();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void F4() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).F4();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void G1(Long l10) {
        y yVar = new y(l10);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).G1(l10);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void H2() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).H2();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void I7() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).I7();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void M0(boolean z10) {
        z zVar = new z(z10);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).M0(z10);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void O1(String str) {
        b0 b0Var = new b0(str);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).O1(str);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void Pe() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).Pe();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void Qe() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).Qe();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void R1() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).R1();
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void S8(long j10) {
        d dVar = new d(j10);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).S8(j10);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void Tc() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).Tc();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void U1() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).U1();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void Ua(boolean z10) {
        f0 f0Var = new f0(z10);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).Ua(z10);
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void X1() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).X1();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void Z5(String str, String str2, String str3) {
        e eVar = new e(str, str2, str3);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).Z5(str, str2, str3);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void ac() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).ac();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void h1(boolean z10) {
        a0 a0Var = new a0(z10);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).h1(z10);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void k0() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).k0();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void k1(List<? extends com.server.auditor.ssh.client.fragments.hostngroups.d> list) {
        x xVar = new x(list);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).k1(list);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void kc(boolean z10) {
        c0 c0Var = new c0(z10);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).kc(z10);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void l2() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).l2();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void mb(String str, String str2) {
        f fVar = new f(str, str2);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).mb(str, str2);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void md(String str, String str2) {
        g gVar = new g(str, str2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).md(str, str2);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void n1(SshKeyDBModel sshKeyDBModel) {
        v vVar = new v(sshKeyDBModel);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).n1(sshKeyDBModel);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void nb() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).nb();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void o1(boolean z10) {
        g0 g0Var = new g0(z10);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).o1(z10);
        }
        this.viewCommands.afterApply(g0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void p1(boolean z10) {
        d0 d0Var = new d0(z10);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).p1(z10);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void se(boolean z10, String str, VaultKeyId vaultKeyId) {
        s sVar = new s(z10, str, vaultKeyId);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).se(z10, str, vaultKeyId);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void t2(boolean z10) {
        e0 e0Var = new e0(z10);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).t2(z10);
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void v2(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).v2(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void w0(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).w0(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.biometrickeys.b
    public void y0() {
        C0373a c0373a = new C0373a();
        this.viewCommands.beforeApply(c0373a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.views.biometrickeys.b) it.next()).y0();
        }
        this.viewCommands.afterApply(c0373a);
    }
}

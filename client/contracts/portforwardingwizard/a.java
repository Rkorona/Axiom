package com.server.auditor.ssh.client.contracts.portforwardingwizard;

import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import tl.l2;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> implements com.server.auditor.ssh.client.contracts.portforwardingwizard.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.portforwardingwizard.a$a, reason: collision with other inner class name */
    public class C0350a extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        C0350a() {
            super("clearIntermediateHostField", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Za();
        }
    }

    public class a0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22722a;

        a0(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateDestinationPortInputFieldError", OneExecutionStateStrategy.class);
            this.f22722a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.c6(this.f22722a);
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        b() {
            super("closeCredentialsModeBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.pe();
        }
    }

    public class b0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22725a;

        b0(boolean z10) {
            super("updateIntermediateHostHintVisibility", AddToEndSingleStrategy.class);
            this.f22725a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.c3(this.f22725a);
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        c() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.f();
        }
    }

    public class c0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22728a;

        c0(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateIntermediateHostInputFieldError", OneExecutionStateStrategy.class);
            this.f22728a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.l7(this.f22728a);
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        d() {
            super("closeVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.I();
        }
    }

    public class d0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22731a;

        d0(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateLabelInputFieldError", OneExecutionStateStrategy.class);
            this.f22731a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.P2(this.f22731a);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        e() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.a();
        }
    }

    public class e0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22734a;

        e0(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updatePortInputFieldError", OneExecutionStateStrategy.class);
            this.f22734a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.b7(this.f22734a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22736a;

        f(boolean z10) {
            super("lockFieldsForTeamMember", OneExecutionStateStrategy.class);
            this.f22736a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.e6(this.f22736a);
        }
    }

    public class f0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22738a;

        f0(boolean z10) {
            super("updateSaveButtonState", AddToEndSingleStrategy.class);
            this.f22738a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.X(this.f22738a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConflictsArgData[] f22742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SourceEntitiesArgData[] f22743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f22744e;

        g(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
            super("navigateToOrdinaryConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f22740a = vaultKeyId;
            this.f22741b = str;
            this.f22742c = conflictsArgDataArr;
            this.f22743d = sourceEntitiesArgDataArr;
            this.f22744e = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Z1(this.f22740a, this.f22741b, this.f22742c, this.f22743d, this.f22744e);
        }
    }

    public class g0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22746a;

        g0(boolean z10) {
            super("updateTabsVisibility", AddToEndSingleStrategy.class);
            this.f22746a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.y5(this.f22746a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConflictsArgData[] f22750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SourceEntitiesArgData[] f22751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f22752e;

        h(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
            super("navigateToPortForwardingConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f22748a = vaultKeyId;
            this.f22749b = str;
            this.f22750c = conflictsArgDataArr;
            this.f22751d = sourceEntitiesArgDataArr;
            this.f22752e = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.v1(this.f22748a, this.f22749b, this.f22750c, this.f22751d, this.f22752e);
        }
    }

    public class h0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22754a;

        h0(VaultKeyId vaultKeyId) {
            super("updateVaultSelectorName", AddToEndSingleStrategy.class);
            this.f22754a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.p0(this.f22754a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RuleDBModel f22756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22757b;

        i(RuleDBModel ruleDBModel, String str) {
            super("navigateToSetupTeamVaultFlow", OneExecutionStateStrategy.class);
            this.f22756a = ruleDBModel;
            this.f22757b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.ua(this.f22756a, this.f22757b);
        }
    }

    public class i0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VaultKeyId f22760b;

        i0(boolean z10, VaultKeyId vaultKeyId) {
            super("updateVaultSelectorValue", OneExecutionStateStrategy.class);
            this.f22759a = z10;
            this.f22760b = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Vc(this.f22759a, this.f22760b);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22762a;

        j(String str) {
            super("setBindAddressValue", OneExecutionStateStrategy.class);
            this.f22762a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.V4(this.f22762a);
        }
    }

    public class j0 extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<l2> f22764a;

        j0(List<l2> list) {
            super("updateVaultSelectorVaults", OneExecutionStateStrategy.class);
            this.f22764a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.w2(this.f22764a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22766a;

        k(String str) {
            super("setDestinationAddress", OneExecutionStateStrategy.class);
            this.f22766a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.m5(this.f22766a);
        }
    }

    public class l extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22768a;

        l(String str) {
            super("setDestinationPortValue", OneExecutionStateStrategy.class);
            this.f22768a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.o8(this.f22768a);
        }
    }

    public class m extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22770a;

        m(String str) {
            super("setIntermediateHostData", OneExecutionStateStrategy.class);
            this.f22770a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.a5(this.f22770a);
        }
    }

    public class n extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22772a;

        n(String str) {
            super("setLocalPortValue", OneExecutionStateStrategy.class);
            this.f22772a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Rb(this.f22772a);
        }
    }

    public class o extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22774a;

        o(String str) {
            super("setRuleLabel", OneExecutionStateStrategy.class);
            this.f22774a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Pd(this.f22774a);
        }
    }

    public class p extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.a f22776a;

        p(qq.a aVar) {
            super("showCredentialModeDialog", OneExecutionStateStrategy.class);
            this.f22776a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Je(this.f22776a);
        }
    }

    public class q extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        q() {
            super("showDynamicTypeUI", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.Le();
        }
    }

    public class r extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PortForwardingWizardData f22779a;

        r(PortForwardingWizardData portForwardingWizardData) {
            super("showHostSelector", OneExecutionStateStrategy.class);
            this.f22779a = portForwardingWizardData;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.w1(this.f22779a);
        }
    }

    public class s extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22781a;

        s(VaultKeyId vaultKeyId) {
            super("showInfoAboutSuccessMoving", OneExecutionStateStrategy.class);
            this.f22781a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.V9(this.f22781a);
        }
    }

    public class t extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        t() {
            super("showLocalTypeUI", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.J5();
        }
    }

    public class u extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        u() {
            super("showMultiKeyPromotion", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.p9();
        }
    }

    public class v extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {
        v() {
            super("showRemoteTypeUI", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.t9();
        }
    }

    public class w extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.b f22786a;

        w(qq.b bVar) {
            super("showVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
            this.f22786a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.B(this.f22786a);
        }
    }

    public class x extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22788a;

        x(int i10) {
            super("slideToPage", OneExecutionStateStrategy.class);
            this.f22788a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.je(this.f22788a);
        }
    }

    public class y extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22790a;

        y(boolean z10) {
            super("updateDescriptionVisibility", AddToEndSingleStrategy.class);
            this.f22790a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.O(this.f22790a);
        }
    }

    public class z extends ViewCommand<com.server.auditor.ssh.client.contracts.portforwardingwizard.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22792a;

        z(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateDestinationAddressInputFieldError", OneExecutionStateStrategy.class);
            this.f22792a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.portforwardingwizard.b bVar) {
            bVar.xd(this.f22792a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void B(qq.b bVar) {
        w wVar = new w(bVar);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).B(bVar);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void I() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).I();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void J5() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).J5();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Je(qq.a aVar) {
        p pVar = new p(aVar);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Je(aVar);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Le() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Le();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void O(boolean z10) {
        y yVar = new y(z10);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).O(z10);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void P2(com.server.auditor.ssh.client.help.a0 a0Var) {
        d0 d0Var = new d0(a0Var);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).P2(a0Var);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Pd(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Pd(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Rb(String str) {
        n nVar = new n(str);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Rb(str);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void V4(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).V4(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void V9(VaultKeyId vaultKeyId) {
        s sVar = new s(vaultKeyId);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).V9(vaultKeyId);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Vc(boolean z10, VaultKeyId vaultKeyId) {
        i0 i0Var = new i0(z10, vaultKeyId);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Vc(z10, vaultKeyId);
        }
        this.viewCommands.afterApply(i0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void X(boolean z10) {
        f0 f0Var = new f0(z10);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).X(z10);
        }
        this.viewCommands.afterApply(f0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Z1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
        VaultKeyId vaultKeyId2 = vaultKeyId;
        String str3 = str;
        ConflictsArgData[] conflictsArgDataArr2 = conflictsArgDataArr;
        SourceEntitiesArgData[] sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr;
        String str4 = str2;
        g gVar = new g(vaultKeyId2, str3, conflictsArgDataArr2, sourceEntitiesArgDataArr2, str4);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            String str5 = str4;
            SourceEntitiesArgData[] sourceEntitiesArgDataArr3 = sourceEntitiesArgDataArr2;
            ConflictsArgData[] conflictsArgDataArr3 = conflictsArgDataArr2;
            String str6 = str3;
            VaultKeyId vaultKeyId3 = vaultKeyId2;
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Z1(vaultKeyId3, str6, conflictsArgDataArr3, sourceEntitiesArgDataArr3, str5);
            vaultKeyId2 = vaultKeyId3;
            str3 = str6;
            conflictsArgDataArr2 = conflictsArgDataArr3;
            sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr3;
            str4 = str5;
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void Za() {
        C0350a c0350a = new C0350a();
        this.viewCommands.beforeApply(c0350a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).Za();
        }
        this.viewCommands.afterApply(c0350a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void a() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).a();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void a5(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).a5(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void b7(com.server.auditor.ssh.client.help.a0 a0Var) {
        e0 e0Var = new e0(a0Var);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).b7(a0Var);
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void c3(boolean z10) {
        b0 b0Var = new b0(z10);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).c3(z10);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void c6(com.server.auditor.ssh.client.help.a0 a0Var) {
        a0 a0Var2 = new a0(a0Var);
        this.viewCommands.beforeApply(a0Var2);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).c6(a0Var);
        }
        this.viewCommands.afterApply(a0Var2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void e6(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).e6(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void f() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).f();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void je(int i10) {
        x xVar = new x(i10);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).je(i10);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void l7(com.server.auditor.ssh.client.help.a0 a0Var) {
        c0 c0Var = new c0(a0Var);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).l7(a0Var);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void m5(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).m5(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void o8(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).o8(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void p0(VaultKeyId vaultKeyId) {
        h0 h0Var = new h0(vaultKeyId);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).p0(vaultKeyId);
        }
        this.viewCommands.afterApply(h0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void p9() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).p9();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void pe() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).pe();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void t9() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).t9();
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void ua(RuleDBModel ruleDBModel, String str) {
        i iVar = new i(ruleDBModel, str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).ua(ruleDBModel, str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void v1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
        VaultKeyId vaultKeyId2 = vaultKeyId;
        String str3 = str;
        ConflictsArgData[] conflictsArgDataArr2 = conflictsArgDataArr;
        SourceEntitiesArgData[] sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr;
        String str4 = str2;
        h hVar = new h(vaultKeyId2, str3, conflictsArgDataArr2, sourceEntitiesArgDataArr2, str4);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            String str5 = str4;
            SourceEntitiesArgData[] sourceEntitiesArgDataArr3 = sourceEntitiesArgDataArr2;
            ConflictsArgData[] conflictsArgDataArr3 = conflictsArgDataArr2;
            String str6 = str3;
            VaultKeyId vaultKeyId3 = vaultKeyId2;
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).v1(vaultKeyId3, str6, conflictsArgDataArr3, sourceEntitiesArgDataArr3, str5);
            vaultKeyId2 = vaultKeyId3;
            str3 = str6;
            conflictsArgDataArr2 = conflictsArgDataArr3;
            sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr3;
            str4 = str5;
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void w1(PortForwardingWizardData portForwardingWizardData) {
        r rVar = new r(portForwardingWizardData);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).w1(portForwardingWizardData);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void w2(List<l2> list) {
        j0 j0Var = new j0(list);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).w2(list);
        }
        this.viewCommands.afterApply(j0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void xd(com.server.auditor.ssh.client.help.a0 a0Var) {
        z zVar = new z(a0Var);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).xd(a0Var);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.b
    public void y5(boolean z10) {
        g0 g0Var = new g0(z10);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.portforwardingwizard.b) it.next()).y5(z10);
        }
        this.viewCommands.afterApply(g0Var);
    }
}

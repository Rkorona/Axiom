package com.server.auditor.ssh.client.contracts.portforwardingwizard;

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
public class u extends MvpViewState<v> implements v {

    public class a extends ViewCommand<v> {
        a() {
            super("closeVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.I();
        }
    }

    public class b extends ViewCommand<v> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.a();
        }
    }

    public class c extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<TypedEntityIdentifier> f22855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22856b;

        c(List<TypedEntityIdentifier> list, String str) {
            super("navigateToTeamVaultPromotionScreen", OneExecutionStateStrategy.class);
            this.f22855a = list;
            this.f22856b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.R6(this.f22855a, this.f22856b);
        }
    }

    public class d extends ViewCommand<v> {
        d() {
            super("showDynamicTypeDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.Pc();
        }
    }

    public class e extends ViewCommand<v> {
        e() {
            super("showLocalTypeDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.L9();
        }
    }

    public class f extends ViewCommand<v> {
        f() {
            super("showRemoteTypeDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.g7();
        }
    }

    public class g extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.b f22861a;

        g(qq.b bVar) {
            super("showVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
            this.f22861a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.B(this.f22861a);
        }
    }

    public class h extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22863a;

        h(int i10) {
            super("skipWizard", OneExecutionStateStrategy.class);
            this.f22863a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.A4(this.f22863a);
        }
    }

    public class i extends ViewCommand<v> {
        i() {
            super("startDynamicRuleCreation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.G6();
        }
    }

    public class j extends ViewCommand<v> {
        j() {
            super("startLocalRuleCreation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.He();
        }
    }

    public class k extends ViewCommand<v> {
        k() {
            super("startRemoteRuleCreation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.D8();
        }
    }

    public class l extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22868a;

        l(VaultKeyId vaultKeyId) {
            super("updateVaultSelectorName", OneExecutionStateStrategy.class);
            this.f22868a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.p0(this.f22868a);
        }
    }

    public class m extends ViewCommand<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<l2> f22870a;

        m(List<l2> list) {
            super("updateVaultSelectorVaults", OneExecutionStateStrategy.class);
            this.f22870a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(v vVar) {
            vVar.w2(this.f22870a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void A4(int i10) {
        h hVar = new h(i10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).A4(i10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void B(qq.b bVar) {
        g gVar = new g(bVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).B(bVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void D8() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).D8();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void G6() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).G6();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void He() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).He();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void I() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).I();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void L9() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).L9();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void Pc() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).Pc();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void R6(List<TypedEntityIdentifier> list, String str) {
        c cVar = new c(list, str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).R6(list, str);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void g7() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).g7();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void p0(VaultKeyId vaultKeyId) {
        l lVar = new l(vaultKeyId);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).p0(vaultKeyId);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.portforwardingwizard.v
    public void w2(List<l2> list) {
        m mVar = new m(list);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((v) it.next()).w2(list);
        }
        this.viewCommands.afterApply(mVar);
    }
}
